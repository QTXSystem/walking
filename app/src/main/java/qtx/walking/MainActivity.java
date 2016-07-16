package qtx.walking;

import android.content.Intent;
import android.graphics.Rect;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(new BallBounce(this));
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //set up full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        RelativeLayout rl = (RelativeLayout)findViewById(R.id.walkingLayout);
        rl.setBackgroundResource(R.drawable.robot);
        //setHasOptionsMenu(true);

    }

    public void getTwentyFiveStep(View view) {
        Intent intent = new Intent(this, TwentyFiveStepsActivity.class);
          startActivity(intent);

    }

    public void getSixMinutes(View view) {
        Intent intent = new Intent(this, SixMinutesActivity.class);
        startActivity(intent);

    }

    public void getUpAndGo(View view) {
        Intent intent = new Intent(this, UpAndGoActivity.class);
        startActivity(intent);

    }
}



