package game.jogodosmagos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import game.jogodosmagos.game.Tabuleiro;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Spinner elementosA = (Spinner) findViewById(R.id.elementos_a);
        Spinner elementosB = (Spinner) findViewById(R.id.elementos_b);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.elementos_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        elementosA.setAdapter(adapter);
        elementosB.setAdapter(adapter);

        Tabuleiro tabuleiro = new Tabuleiro();
        String[][] tabMatrix = tabuleiro.iniciarJogo();
    }
}
