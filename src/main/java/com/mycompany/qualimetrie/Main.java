package com.mycompany.qualimetrie;

import com.mycompany.qualimetrie.CalculatriceTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CalculatriceTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println("Test erreur "+failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("Tous les tests ont réussi !");
        }
    }
}
