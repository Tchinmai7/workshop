package preethi.xyz.workshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
TextView textView;
    ImageView imageView;
    FloatingActionButton fab;
    int ch=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView=(TextView)findViewById(R.id.textView);
        imageView=(ImageView)findViewById(R.id.imageView);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Clieck", "reg");
                Snackbar.make(view, "Do you want to register?", Snackbar.LENGTH_LONG)
                        .setAction("Yes", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent=new Intent(MainActivity.this,Register.class);
                                intent.putExtra("eventid",ch);
                                startActivity(intent);
                            }
                        }).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_python) {
            ch=1;
            imageView.setBackgroundDrawable(getResources().getDrawable(R.drawable.python));
            textView.setText("Date & Time :\n" +
                    "6th March 2015, 9.30 am-5.30 pm (8 hours)\n" +
                    "Modules:\n" +
                    "1)Python Interpreter\n" +
                    "2)Executable Python Script\n" +
                    "3)Python Syntax\n" +
                    "4)Conditional Statements\n" +
                    "5)Data Structures\n" +
                    "6)String Formatting\n" +
                    "7)Lamda Forms\n" +
                    "8)Standard Libraries\n" +
                    "9)Exception Handling\n" +
                    "10)Database Connectivity\n" +
                    "11)Iterators\n" +
                    "Conducted by :\n" +
                    "AIESEC,IIT Delhi\n" +
                    "Certification:\n" +
                    "A participation certificates will be given to all the participants from AIESEC IIT Delhi,TechBharat consulting and MIT-Anna university.\n" +
                    "Benefits:\n" +
                    "1.Free tool kit will be given to all the participants.\n" +
                    "2.Winners of the workshop will get the chance to appear in final round at IIT Delhi.\n" +
                    "3.Chance to participate in national level quiz in IIT Delhi.\n" +
                    "4.Free python training to the winners.\n" +
                    "5.Special discount to college students to join summer training in python.\n" +
                    "\n" +
                    "Fee: Rs.800/- *limited seats only ...Hurry up soon....\n" +
                    "*including food and refreshments.\n" +
                    "\n" +
                    "Payment can be made through cash/Demand Draft\n" +
                    "Contact info:\n" +
                    "Raghuram -8608415916\n" +
                    "Vikash kumaran-9600647057");
        } else if (id == R.id.nav_android) {
            ch=2;
            imageView.setBackgroundDrawable(getResources().getDrawable(R.drawable.android));
            textView.setText("Date & Time :\n" +
                    "7th March 2015, 9.30 am-5.30 pm (8 hours)\n" +
                    "Modules:\n" +
                    "To be Updated soon....\n" +
                    "Conducted by :\n" +
                    "Google Developer Groups\n" +
                    "\n" +
                    "Certification:\n" +
                    "A participation certificates will be given to all the participants from Google Developers Groups and MIT-Anna university.\n" +
                    "Fee: Rs.700/- *limited seats only ...Hurry up soon....\n" +
                    "*including food and refreshments.\n" +
                    "\n" +
                    "Payment can be made through cash/Demand Draft\n" +
                    "Contact info:\n" +
                    "Raghuram -8608415916\n" +
                    "Vikash kumaran-9600647057\n");

        } else if (id == R.id.nav_animation) {
            ch=3;
            imageView.setBackgroundDrawable(getResources().getDrawable(R.drawable.anim));
            textView.setText("Date & Time :\n" +
                    "1st March 2015, 9.30 am-5.30 pm (8 hours)\n" +
                    "Modules:\n" +
                    "1) Modelling\n" +
                    "2) Lighting\t\n" +
                    "3) Animation\n" +
                    "4) Rendering\n" +
                    "5) Texturing\n" +
                    "6) Rigging\n" +
                    "7) Dynamics\n" +
                    "Conducted by :\n" +
                    "AIESEC,IIT Delhi\n" +
                    "Certification:\n" +
                    "A participation certificates will be given to all the participants from AIESEC IIT Delhi,TechBharat consulting and MIT-Anna university.\n" +
                    "Benefits:\n" +
                    "1.Free tool kit will be given to all the participants.\n" +
                    "2.Winners of the workshop will get the chance to appear in final round at IIT Delhi.\n" +
                    "3.Chance to participate in national level quiz in IIT Delhi.\n" +
                    "4.Free animation training to the winners.\n" +
                    "5.Special discount to college students to join summer training in animation.\n" +
                    "\n" +
                    "Fee: Rs.1000/- *limited seats only ...Hurry up soon....\n" +
                    "*including food and refreshments.\n" +
                    "\n" +
                    "Payment can be made through cash/Demand Draft\n" +
                    "Contact info:\n" +
                    "Raghuram -8608415916\n" +
                    "Vikash kumaran-9600647057\n");

        } else if (id == R.id.nav_hack) {
            imageView.setBackgroundDrawable(getResources().getDrawable(R.drawable.hack));
            ch=4;
            textView.setText("Date & Time :\n" +
                    "27th and 28th Feb 2015, 9.30 am-5.30 pm(16 hours)\n" +
                    "Modules:\n" +
                    "1)Introduction to Ethical Hacking\n" +
                    "2)Google dorking\n" +
                    "3)Information Gathering\n" +
                    "4)Spooling series\n" +
                    "5)Network Hacking\n" +
                    "6)Website Hacking and security\n" +
                    "7)Viruses worms and Trojans\n" +
                    "8)Wireless Hacking\n" +
                    "9)System Hacking\n" +
                    "10)Application Hacking\n" +
                    "11)Metasploit\n" +
                    "12)Social Engineering\n" +
                    "\n" +
                    "Conducted by :\n" +
                    "AIESEC,IIT Delhi\n" +
                    "Certification:\n" +
                    "A participation certificates will be given to all the participants from AIESEC IIT Delhi,TechBharat consulting and MIT-Anna university.\n" +
                    "Benefits:\n" +
                    "1.Free tool kit will be given to all the participants.\n" +
                    "2.Winners of the workshop will get the chance to appear in final round at IIT Delhi.\n" +
                    "3.Chance to participate in national level quiz in IIT Delhi.\n" +
                    "4.Free Ethical hacking training to the winners.\n" +
                    "5.Special discount to college students to join summer training in Ethical hacking.\n" +
                    "\n" +
                    "Fee: Rs.1200/- *limited seats only ...Hurry up soon....\n" +
                    "*including food and refreshments.\n" +
                    "\n" +
                    "Payment can be made through cash/Demand Draft\n" +
                    "Contact info:\n" +
                    "Raghuram -8608415916\n" +
                    "Vikash kumaran-9600647057");

        }else if (id == R.id.nav_game) {
            ch=5;
            imageView.setBackgroundDrawable(getResources().getDrawable(R.drawable.game1));
            textView.setText("Game Developement");

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
