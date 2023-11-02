package jp.suntech.s22019.myanimal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class TopFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        ImageView commonImageView = view.findViewById(R.id.commonImageView);

        // 画像の設定
        commonImageView.setImageResource(R.drawable.animal);

        return view;
    }
}