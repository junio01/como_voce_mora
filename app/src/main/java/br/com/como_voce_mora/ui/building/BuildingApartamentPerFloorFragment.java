package br.com.como_voce_mora.ui.building;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.como_voce_mora.R;
import br.com.como_voce_mora.custom.HowYouLiveProgressBar;
import br.com.como_voce_mora.custom.VolumeVertical;
import br.com.como_voce_mora.ui.BaseFragment;
import br.com.como_voce_mora.ui.aboutyou.AboutYouActivity;
import butterknife.BindView;
import butterknife.OnClick;

public class BuildingApartamentPerFloorFragment extends BaseFragment implements VolumeVertical.OnListener {
    @BindView(R.id.volume)
    VolumeVertical mVolume;
    @BindView(R.id.iv_school)
    ImageView mIvAge;
    @BindView(R.id.tv_school)
    TextView mTvSchool;

    @BindView(R.id.progress_bar)
    HowYouLiveProgressBar progressBar;

    private List<Integer> images;
    private List<String> texts;

    public static BuildingApartamentPerFloorFragment newInstance() {

        Bundle args = new Bundle();

        BuildingApartamentPerFloorFragment fragment = new BuildingApartamentPerFloorFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getResLayout() {
        return R.layout.fragment_apartament_floor_building;
    }

    @Override
    public void init() {
        progressBar.setProgress(HowYouLiveProgressBar.HowYouLive.BUILDING);
        images = new ArrayList<>();
        texts = new ArrayList<>();
        images.add(R.drawable.ic_apto_por_andar_1);
        texts.add("1 por andar");
        images.add(R.drawable.ic_apto_por_andar_2);
        texts.add("2 por andar");
        images.add(R.drawable.ic_apto_por_andar_3);
        texts.add("3 por andar");
        images.add(R.drawable.ic_apto_por_andar_4);
        texts.add("4 por andar");
        images.add(R.drawable.ic_apto_por_andar_5);
        texts.add("5 por andar");
        images.add(R.drawable.ic_apto_por_andar_6);
        texts.add("6 por andar");
        images.add(R.drawable.ic_apto_por_andar_7);
        texts.add("7 por andar");
        images.add(R.drawable.ic_apto_por_andar_8);
        texts.add("8 por andar");
        images.add(R.drawable.ic_apto_por_andar_9);
        texts.add("9 por andar");
        images.add(R.drawable.ic_apto_por_andar_10);
        texts.add("10 por andar");
        Collections.reverse(images);
        Collections.reverse(texts);
        mVolume.setListener(this);
        mVolume.setMax(images.size() - 1);
    }

    @Override
    public void positionVolume(int position) {
        mIvAge.setImageResource(images.get(position));
        mTvSchool.setText(texts.get(position));
    }

    @OnClick(R.id.bt_next)
    public void onBtNextClicked() {
        if (getActivity() != null) {
            ((AboutYouActivity) getActivity()).addFragment(BuildingAspectesFragment.newInstance());
        }
    }

    @OnClick(R.id.bt_back)
    public void onBtBackClicked() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }
}
