package guide.slidingmenu;

import java.io.File;

import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import edu.ucuccs.ucufreshmenguide.R;

public class HandBookFragment extends Fragment {
	
	public HandBookFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_handbook, container, false);
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
 
        File fileBrochure = new File("/sdcard/abc1.pdf");
        
        /** PDF reader code */
        File file = new File("/sdcard/abc1.pdf");        

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.fromFile(file),"application/pdf");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try 
        {
            getActivity().getApplicationContext().startActivity(intent);
        } 
        catch (ActivityNotFoundException e) 
        {
             Toast.makeText(getActivity().getApplicationContext(), "NO Pdf Viewer/File Not Found", Toast.LENGTH_LONG).show();
        }
   return rootView;
    }
}
