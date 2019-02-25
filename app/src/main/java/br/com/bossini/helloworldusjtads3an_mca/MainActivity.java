package br.com.bossini.helloworldusjtads3an_mca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mensagemEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //inflando a view
        setContentView(R.layout.activity_main);

        mensagemEditText =
                findViewById(R.id.mensagemEditText);
    }

    public void enviarMensagem (View view){
        /*Toast.makeText(this, "Funcionou!!",
                        Toast.LENGTH_SHORT).show();*/
        Intent i =
                new Intent (this, ExibeMensagemActivity.class);
        String msg =
                mensagemEditText.
                        getEditableText().
                        toString();
        i.putExtra("mensagem", msg);
        startActivity(i);
    }
}
