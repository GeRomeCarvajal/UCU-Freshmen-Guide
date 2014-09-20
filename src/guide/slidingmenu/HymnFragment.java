package guide.slidingmenu;

import android.app.Fragment;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;
import edu.ucuccs.ucufreshmenguide.R;

public class HymnFragment extends Fragment {
	VideoView vid;
	
	
	public HymnFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		
        View rootView = inflater.inflate(R.layout.fragment_hymn, container, false);
        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		getActivity().getActionBar().hide();
		
        vid = (VideoView) rootView.findViewById(R.id.videoView1);
        vid.setVideoPath("android.resource://" + getActivity().getPackageName() + "/" + R.raw.hymn);
        
        MediaController mControl = new MediaController(getActivity());
        vid.setMediaController(mControl);
        vid.start();

        return rootView;
        
       
    }
}
