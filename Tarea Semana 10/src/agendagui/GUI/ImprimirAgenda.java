package agendagui.GUI;

import agendagui.Data.Agenda;
import agendagui.Data.ObjAgenda;
import agendagui.Data.ObjContacto;

import javax.swing.*;

public class ImprimirAgenda extends JFrame{
    private JTextArea impAgrenda;
    private JPanel panel2;

    public ImprimirAgenda(Agenda laAgenda) {
        setContentPane(this.panel2);

        for (ObjAgenda o : laAgenda.getListaObjetos())
            this.impAgrenda.append(o.toString() + "\n");

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }

}
