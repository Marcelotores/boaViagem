package dephi.com.br.boaviagem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class BoaViagemActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        this.usuario = (EditText) findViewById(R.id.usuario);
        this.senha = (EditText) findViewById(R.id.senha);
    }

    public void entrarOnClick() {
        String usuario = this.usuario.getText().toString();
        String senha = this.senha.getText().toString();

        if("usuario".equals(usuario) && "senha".equals(senha)) {
            Intent intent = new Intent(this, DashboardActivity.class);
            startActivity(intent);
        } else {
            String mensagemErro = getString(R.string.erro_autenticao);
            Toast toast = Toast.makeText(this, mensagemErro, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
