import javax.swing.*;

class GUIButton
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("Marvellous PPA");

        fobj.setSize(400,300);

        JButton bobj = new JButton("OKAY");

        fobj.add(bobj);

        fobj.setVisible(true);

        fobj.setLayout(null);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
