package com.company;

import com.company.controller.Controller;
import com.company.model.Model;
import com.company.view.View;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Model model = new Model(0);
                View view = new View("-");
                Controller controller = new Controller(model,view);
                controller.control();
            }
        });
    }
}
