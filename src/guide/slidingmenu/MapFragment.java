
package guide.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;

import edu.ucuccs.ucufreshmenguide.R;

public class MapFragment extends Fragment {
	GoogleMap map;
	private static View view;
	 
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {


		view = inflater.inflate(R.layout.fragment_map, container,
				false);
		map = ((MapFragment) getFragmentManager()
				.findFragmentById(R.id.map)).getMap();

		
      //  View rootView = inflater.inflate(R.layout.fragment_map, container, false);
      //  getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
        
    // map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();


        
        return view;
        
       
    }
	
	
	
}

