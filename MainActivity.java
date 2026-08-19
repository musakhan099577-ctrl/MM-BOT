package com.mmbot.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends Activity {
 public void onCreate(Bundle b){
  super.onCreate(b);
  TextView t=new TextView(this);
  t.setText("MM BOT\nAnalysis + Demo Trading\n\nBUY/SELL signals are analysis only.");
  t.setTextSize(22);
  setContentView(t);
 }
}
