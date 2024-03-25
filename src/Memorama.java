import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;

public class Memorama extends JFrame implements ActionListener {

    private JButton[] buttons;
    private ImageIcon[] cardImages;
    private ImageIcon[] backImages;
    private JButton reiniciartButton;
    private int[] flippedCards;
    private int flipCount;
    private int nummovimiento;
    private int numreinicios;
    private JLabel movimientosLabel;
    private JLabel reiniciosLabel;

    public Memorama() {
        setTitle("Memorama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel(new GridLayout(2, 4, 10, 10));
        getContentPane().add(panel, BorderLayout.CENTER);

        buttons = new JButton[8];
        cardImages = new ImageIcon[]{
            new ImageIcon(getClass().getResource("bob.png")),
            new ImageIcon(getClass().getResource("estrella.png")),
            new ImageIcon(getClass().getResource("gary2.png")),
            new ImageIcon(getClass().getResource("pirata.png")),
            new ImageIcon(getClass().getResource("estrella.png")),
            new ImageIcon(getClass().getResource("gary2.png")),
            new ImageIcon(getClass().getResource("pirata.png")),
            new ImageIcon(getClass().getResource("bob.png")),
        };

        backImages = new ImageIcon[]{
            new ImageIcon(getClass().getResource("back.png")),
            new ImageIcon(getClass().getResource("back.png")),
            new ImageIcon(getClass().getResource("back.png")),
            new ImageIcon(getClass().getResource("back.png")),
            new ImageIcon(getClass().getResource("back.png")),
            new ImageIcon(getClass().getResource("back.png")),
            new ImageIcon(getClass().getResource("back.png")),
            new ImageIcon(getClass().getResource("back.png"))
        };

        flippedCards = new int[2];
        flipCount = 0;
        nummovimiento = 0;
        numreinicios = 0;

        
        shuffleCardImages();

        for (int i = 0; i < 8; i++) {
            buttons[i] = new JButton(backImages[i]); 
            buttons[i].addActionListener(this);
            buttons[i].setBorderPainted(false);
            buttons[i].setPreferredSize(new Dimension(150, 150));
            buttons[i].setOpaque(true);
            buttons[i].setContentAreaFilled(false);
            panel.add(buttons[i]);
        }

        reiniciartButton = new JButton("Reiniciar");
        reiniciartButton.addActionListener(this);
        getContentPane().add(reiniciartButton, BorderLayout.SOUTH);
        
        movimientosLabel = new JLabel("Moves: 0");
        reiniciosLabel = new JLabel("Restarts: 0");
        getContentPane().add(movimientosLabel, BorderLayout.NORTH);
        getContentPane().add(reiniciosLabel, BorderLayout.WEST);

        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == reiniciartButton) {
            resetGame();
            numreinicios++;
        } else {
            JButton button = (JButton) e.getSource();
            int index = getButtonIndex(button);
            if (index != -1 && flipCount < 2 && !isCardFlipped(index)) {
                flipCard(index);
                flippedCards[flipCount++] = index;
                if (flipCount == 2) {
                    checkMatch();
                    nummovimiento++;
                }
            }
        }
    }

    private void resetGame() {
        // Restaura el estado inicial de los botones y las cartas
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setIcon(backImages[i]);
            buttons[i].setEnabled(true);
            buttons[i].setVisible(true);
        }
        Arrays.fill(flippedCards, -1);
        flipCount = 0;
        nummovimiento = 0;
        numreinicios++;
        // Actualizar los contadores en las etiquetas
        movimientosLabel.setText("movimientos: " + nummovimiento);
        reiniciosLabel.setText("reinicios: " + numreinicios);

        // Mezcla nuevamente las imágenes de las cartas
        shuffleCardImages();
    }

    private int getButtonIndex(JButton button) {
        for (int i = 0; i < buttons.length; i++) {
            if (button == buttons[i]) {
                return i;
            }
        }
        return -1;
    }
    
    public int getMovinum() {
        return nummovimiento;
    }
    
    public int getReinicionum() {
        return numreinicios;
    }

    private boolean isCardFlipped(int index) {
        for (int i = 0; i < flippedCards.length; i++) {
            if (flippedCards[i] == index) {
                return true;
            }
        }
        return false;
    }

    private void flipCard(int index) {
        // Muestra la imagen correspondiente a la carta
        buttons[index].setIcon(cardImages[index]);
        buttons[index].setEnabled(false);
        nummovimiento++; // Incrementar el contador de movimientos
        // Actualizar el contador de movimientos en la etiqueta
        movimientosLabel.setText("movimiento: " + nummovimiento);
    }

    private void checkMatch() {
        if (flipCount != 2) {
            return;
        }

        int index1 = flippedCards[0];
        int index2 = flippedCards[1];

        if (index1 < 0 || index1 >= buttons.length || index2 < 0 || index2 >= buttons.length) {
            return;
        }

        if (cardImages[index1].getImage() == cardImages[index2].getImage()) {
            buttons[index1].setVisible(false);
            buttons[index2].setVisible(false);
        } else {
            // Voltea las cartas nuevamente después de un breve retraso
            Timer timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttons[index1].setIcon(backImages[index1]);
                    buttons[index2].setIcon(backImages[index2]);
                    buttons[index1].setEnabled(true);
                    buttons[index2].setEnabled(true);
                }
            });
            timer.setRepeats(false);
            timer.start();
        }

        for (JButton button : buttons) {
            button.setEnabled(true);
        }

        Arrays.fill(flippedCards, -1);
        flipCount = 0;
    }

    private void shuffleCardImages() {
        Collections.shuffle(Arrays.asList(cardImages));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Memorama());
    }
}
