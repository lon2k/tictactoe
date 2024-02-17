package com.example.projet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;

public class HelloController {
    private char nowSym = 'x';
    private int counter = 0;
    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button b7;

    @FXML
    private Button b8;

    @FXML
    private Button b9;
    private char gameField[][] = new char[3][3];
    private boolean isWin = false;
    @FXML
    private Button restartButton;
    @FXML
    private Label winLabel;
    @FXML
    void btnClick(ActionEvent event) {

        Button btn = (Button)event.getSource();
        if (isWin==true || btn.getText() != "") return;
        btn.setText(String.valueOf(nowSym));
        btn.setTextFill(nowSym=='x' ? Paint.valueOf("#8741fa") :  Paint.valueOf("#bd0b14"));
        int rowIndex = GridPane.getRowIndex(btn) == null ? 0: GridPane.getRowIndex(btn);
        int coloumIndex = GridPane.getColumnIndex(btn)== null ? 0: GridPane.getColumnIndex(btn);
        gameField[rowIndex][coloumIndex] = nowSym;

        if(gameField[0][0]==gameField[0][1] && gameField[0][0]==gameField[0][2] && (gameField[0][0] =='x' || gameField[0][0] =='o' )){
            winLabel.setText("Winner: " + nowSym);
            isWin=true;
        }
        if(gameField[0][0]==gameField[1][0] && gameField[0][0]==gameField[2][0] && (gameField[0][0] =='x' || gameField[0][0] =='o' )){
            winLabel.setText("Winner: " + nowSym);
            isWin=true;
        }
        if(gameField[1][0]==gameField[1][1] && gameField[1][0]==gameField[1][2] && (gameField[1][0] =='x' || gameField[1][0] =='o' )){
            winLabel.setText("Winner: " + nowSym);
            isWin=true;
        }
        if(gameField[0][1]==gameField[1][1] && gameField[0][1]==gameField[2][1] && (gameField[0][1] =='x' || gameField[0][1] =='o' )){
            winLabel.setText("Winner: " + nowSym);
            isWin=true;
        }
        if(gameField[2][0]==gameField[2][1] && gameField[2][0]==gameField[2][2] && (gameField[2][0] =='x' || gameField[2][0] =='o' )){
            winLabel.setText("Winner: " + nowSym);
            isWin=true;
        }
        if(gameField[0][2]==gameField[1][2] && gameField[0][2]==gameField[2][2] && (gameField[0][2] =='x' || gameField[0][2] =='o' )){
            winLabel.setText("Winner: " + nowSym);
            isWin=true;
        }
        if(gameField[0][2]==gameField[1][1] && gameField[0][2]==gameField[2][0] && (gameField[0][2] =='x' || gameField[0][2] =='o' )){
            winLabel.setText("Winner: " + nowSym);
            isWin=true;
        }
        if(gameField[0][0]==gameField[1][1] && gameField[0][0]==gameField[2][2] && (gameField[0][0] =='x' || gameField[0][0] =='o' )){
            winLabel.setText("Winner: " + nowSym);
            isWin=true;
        }
        counter++;
        nowSym = nowSym == 'x' ? 'o' : 'x';
        if (counter==9)
        {
            winLabel.setText("Draw");
            isWin=true;
            return;
        }
    }
    @FXML
    void restartBtn(ActionEvent event) {
        if(isWin){
            counter=0;
            gameField = new char[3][3];
            isWin=false;
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            winLabel.setText("");
            nowSym='x';
        }
    }
}
