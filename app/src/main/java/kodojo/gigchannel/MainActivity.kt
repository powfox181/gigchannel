package kodojo.gigchannel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isGone
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity()
{
   private val TAG : String = "==D [[ 	Main Activity	]] D==";
   
   
   override fun onCreate(savedInstanceState: Bundle?)
   {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.activity_main)
	  
	  val navcon : NavController = ((supportFragmentManager.findFragmentById(R.id.main_nav_host)) as NavHostFragment).navController;
	  val bottombar : BottomNavigationView = findViewById(R.id.main_bottom_nav_bar);
	  bottombar.setupWithNavController(navcon);
	  // #### ----- set visibility of navigation bar when ime is showed
	  window.decorView.setOnApplyWindowInsetsListener { view, windowInsets ->
		 val insetcompat : WindowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
		 bottombar.isGone = insetcompat.isVisible(WindowInsetsCompat.Type.ime());
		 view.onApplyWindowInsets(windowInsets);
	  }
   }
}