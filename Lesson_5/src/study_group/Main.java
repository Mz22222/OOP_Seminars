package study_group;

import study_group.model.service.Service;
import study_group.view.ConsoleUI;
import study_group.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
    }
}
