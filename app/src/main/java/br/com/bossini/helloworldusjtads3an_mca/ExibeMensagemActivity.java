package br.com.bossini.helloworldusjtads3an_mca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExibeMensagemActivity extends AppCompatActivity {

    private TextView mensagemTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //aqui eu inflo a view
        setContentView(R.layout.activity_exibe_mensagem);

        //somente depois eu faço a busca
        mensagemTextView = findViewById(R.id.mensagemTextView);

        Intent origemIntent = getIntent();
        String msg = origemIntent.getStringExtra("mensagem");

        mensagemTextView.setText(msg);
    }
}
