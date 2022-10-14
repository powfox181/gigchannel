package kodojo.gigchannel.frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kodojo.gigchannel.R

class PostFragment : Fragment()
{
   
   override fun onCreate(savedInstanceState: Bundle?)
   {
	  super.onCreate(savedInstanceState)
	  arguments?.let {
	  }
   }
   
   override fun onCreateView(
	  inflater: LayoutInflater, container: ViewGroup?,
	  savedInstanceState: Bundle?
   ): View?
   {
	  // Inflate the layout for this fragment
	  return inflater.inflate(R.layout.frag_post, container, false)
   }
   
   companion object
   {
	  @JvmStatic fun newInstance(param1: String, param2: String) =
		 PostFragment().apply {
			arguments = Bundle().apply {
			}
		 }
   }
}