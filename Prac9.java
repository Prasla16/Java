import java.awt.*;
import java.awt.event.*;
public class InnerClassEventHandling extends Frame
{
    public InnerClassEventHandling()
    {
        Button btn=new Button("CLICK ME");
        btn.setBounds(100,100,80,30);
        add(btn);
        btn.addMouseListener(new MyMouseAdapter());
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    class MyMouseAdapter extends MouseAdapter
    {
        public void mouseClicked(MouseEvent e)
        {
            showMessageDialog("BUTTON CLICKED","YOU CLCIKED THE BUTTIN");
        }
    }
    private void showMessageDialog(String title,String message)
    {
        Dialog d=new Dialog(this,title,true);
        d.setLayout(new FlowLayout());
        Label lb=new Label(message); 
d.add(lb);
Button btnOK = new Button("OK");
btnOK.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        d.setVisible(false);
        d.dispose();
    }
});
d.add(btnOK);
d.setSize(200, 100);
d.setVisible(true);
}

public static void main(String[] args) {
    new InnerClassEventHandling();
}
}