import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class message extends Application {
    private TextField mTextReciever;
    private Button mButtonContact;
    private Button mButtonAttach, mButtonSend;
    private TextArea mTextMsg;
    private Label mLabelTextLength;
    private final int MAX_LENGTH = 160;

    public void start(Stage stage) {
        mTextReciever = new TextField();
        mTextReciever.setPromptText("Reciever");
        mButtonContact = new Button("Contact");

        mTextMsg = new TextArea();
        mTextMsg.setPromptText("Message");
        mTextMsg.setPrefWidth(180);
        mTextMsg.setPrefHeight(150);
        mTextMsg.setOnKeyReleased(e -> mTextMsg_onKeyReleased());

        mLabelTextLength = new Label("0/" + MAX_LENGTH);
        mButtonAttach = new Button(" Attach  ");
        mButtonSend = new Button("   Send   ");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(10);

        gridPane.add(mTextReciever, 0, 0);
        gridPane.add(mButtonContact, 1, 0);
        gridPane.add(mTextMsg, 0, 1, 1, 3);
        gridPane.add(mLabelTextLength, 1, 1);
        gridPane.add(mButtonAttach, 1, 2);
        gridPane.add(mButtonSend, 1, 3);
    }
}