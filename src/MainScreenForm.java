import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jen on 10/18/2015.
 */
public class MainScreenForm {
    private JButton newTimerButton;
    private JButton newTaskButton;
    private JButton newAppointmentButton;
    private JPanel mainScreen;
    private JPanel timersColumn;
    private JPanel appointmentsColumn;
    private JPanel tasksSubColumn;
    private JPanel clockDateSubColumn;
    private JPanel timersTextPanel;
    private JPanel appointmentsTextPanel;
    private JPanel tasksTextPanel;
    private JLabel timerLabel;
    private JLabel tasksLabel;
    private JLabel appointmentsLabel;
    private JLabel clockLabel;
    private JLabel dateLabel;

    public MainScreenForm() {
        newTimerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                //do a thing to add a new timer
            }
        });
        newTaskButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                //do a thing to add a new task
            }
        });
        newAppointmentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                //do a thing to add a new event to Google Calendar
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainScreenForm");
        frame.setContentPane(new MainScreenForm().mainScreen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
