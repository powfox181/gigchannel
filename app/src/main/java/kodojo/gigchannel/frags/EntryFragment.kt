package kodojo.gigchannel.frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewStub
import kodojo.gigchannel.R


class EntryFragment : Fragment()
{
   private val TAG : String = "==D /// Entry Fragment \\\\ D==";
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
	  return inflater.inflate(R.layout.frag_entry, container, false)
   }
   
   override fun onViewCreated(v: View, savedInstanceState: Bundle?)
   {
	  super.onViewCreated(v, savedInstanceState);
	  val vstub : ViewStub = v.findViewById(R.id.frag_entry_vstub);
	  vstub.inflate();
	  
	  
   }
   
   companion object
   {
	  @JvmStatic fun newInstance(param1: String, param2: String) =
		 EntryFragment().apply {
			arguments = Bundle().apply {
			}
		 }
   }
}