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
    }
}