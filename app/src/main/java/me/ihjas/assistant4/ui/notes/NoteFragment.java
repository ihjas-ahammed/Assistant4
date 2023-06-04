package me.ihjas.assistant4.ui.notes;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import me.ihjas.assistant4.databinding.FragmentNotesBinding;

public class NoteFragment extends Fragment{
    
    FragmentNotesBinding binding;
    
    @Override
    public View onCreateView(LayoutInflater arg0, ViewGroup arg1, Bundle arg2) {
        binding = FragmentNotesBinding.inflate(arg0,arg1,false);
        View root = binding.getRoot();
        return root;
    }
        
}
