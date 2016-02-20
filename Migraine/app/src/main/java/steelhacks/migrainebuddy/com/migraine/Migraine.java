package steelhacks.migrainebuddy.com.migraine;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Migraine extends AppCompatActivity {
int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_migraine);


        RelativeLayout touch = (RelativeLayout) findViewById(R.id.touch);
        final TextView quoteText = (TextView) findViewById(R.id.quote);
        final TextView personText = (TextView) findViewById(R.id.person);

        final ArrayList<MigraineQuestions> quoteList = new ArrayList<MigraineQuestions>();

        MigraineQuestions quote4 = new MigraineQuestions("You're more of a fun vampire. You don't suck blood, you just suck.", "Troy Barnes");
        quoteList.add(quote4);

        MigraineQuestions quote1 = new MigraineQuestions("Cool Beans", "Rod Kimble");
        quoteList.add(quote1);

        MigraineQuestions quote2 = new MigraineQuestions("How can mirrors be real if our eyes aren't real", "Jaden Smith");
        quoteList.add(quote2);

        MigraineQuestions quote3 = new MigraineQuestions("That's like me blaming owls for how bad I suck at analogies.", "Britta Perry");
        quoteList.add(quote3);

        MigraineQuestions quote5 = new MigraineQuestions("I was gonna be the first person in my family to graduate from community college. Everyone else graduated from normal college", "Troy Barnes");
        quoteList.add(quote5);

        //Add more quotes here


        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count < quoteList.size()) {

                    MigraineQuestions q = quoteList.get(count);

                    quoteText.setText(q.getQue());

                    personText.setText(q.getAns());

                    count = count + 1;


                } else{

                    count = 0;

                }




            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_migraine, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
