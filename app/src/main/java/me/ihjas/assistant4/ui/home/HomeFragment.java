package me.ihjas.assistant4.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import me.ihjas.assistant4.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.BaselineLayout;
import me.ihjas.assistant4.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        RecyclerView recyclerViewHome = binding.recyclerViewHome;
        recyclerViewHome.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewHome.setAdapter(new TaskAdapter());
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public static class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {

        public static class ViewHolder extends RecyclerView.ViewHolder {
            public View view;
            public ViewHolder(View v) {
                super(v);
                view = v;
            }
        }

        @Override
        public TaskAdapter.ViewHolder onCreateViewHolder(ViewGroup arg0, int arg1) {
            return new ViewHolder(LayoutInflater.from(arg0.getContext()).inflate(R.layout.list_item_task,arg0,false));
        }

        @Override
        public void onBindViewHolder(TaskAdapter.ViewHolder arg0, int arg1) {
            
        }

        @Override
        public int getItemCount() {
            return 3;
        }
    }
}
