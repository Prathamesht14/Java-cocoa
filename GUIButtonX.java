import javax.swing.*;

class GUIButtonX
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("Marvellous PPA");
        JButton bobj = new JButton("OKAY");

        bobj.setBounds(100,100,150,50);
        fobj.add(bobj);

        fobj.setSize(400,300);

        fobj.setVisible(true);

        fobj.setLayout(null);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
