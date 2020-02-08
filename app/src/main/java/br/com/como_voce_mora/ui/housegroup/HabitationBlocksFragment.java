package br.com.como_voce_mora.ui.housegroup;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import br.com.como_voce_mora.R;
import br.com.como_voce_mora.ui.BaseFragment;
import br.com.como_voce_mora.ui.aboutyou.AboutYouActivity;
import br.com.como_voce_mora.custom.HowYouLiveProgressBar;
import br.com.como_voce_mora.custom.VolumeVertical;
import butterknife.BindView;
import butterknife.OnClick;

public class HabitationBlocksFragment extends BaseFragment implements VolumeVertical.OnListener {

    @BindView(R.id.volume)
    VolumeVertical mVolume;
    @BindView(R.id.progress_bar)
    HowYouLiveProgressBar mProgress;
    @BindView(R.id.iv_blocks)
    ImageView mIvBlocks;
    @BindView(R.id.tv_blocks)
    TextView mTvBlocks;

    private List<Integer> blocks = new ArrayList<>();
    private List<String> blocksText = new ArrayList<>();

    public static HabitationBlocksFragment newInstance() {
        return new HabitationBlocksFragment();
    }

    @Override
    public int getResLayout() {
        return R.layout.fragment_habitation_blocks;
    }

    @OnClick(R.id.bt_next)
    public void onBtNextClicked() {
        if (getActivity() != null)
            ((AboutYouActivity) getActivity()).addFragment(HabitationEquipamentsFragment.newInstance());
    }

    @OnClick(R.id.bt_back)
    public void onBtBackClicked() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mProgress.setProgress(HowYouLiveProgressBar.HowYouLive.GROUP);

        blocks.add(R.drawable.blocos_12);
        blocksText.add("12");
        blocks.add(R.drawable.blocos_11);
        blocksText.add("11");
        blocks.add(R.drawable.blocos_10);
        blocksText.add("10");
        blocks.add(R.drawable.blocos_9);
        blocksText.add("9");
        blocks.add(R.drawable.blocos_8);
        blocksText.add("8");
        blocks.add(R.drawable.blocos_7);
        blocksText.add("7");
        blocks.add(R.drawable.blocos_6);
        blocksText.add("6");
        blocks.add(R.drawable.blocos_5);
        blocksText.add("5");
        blocks.add(R.drawable.blocos_4);
        blocksText.add("4");
        blocks.add(R.drawable.blocos_3);
        blocksText.add("3");
        blocks.add(R.drawable.blocos_2);
        blocksText.add("2");
        blocks.add(R.drawable.blocos_1);
        blocksText.add("1");

        mVolume.setListener(this);
        mVolume.setMax(blocks.size() - 1);
    }

    @Override
    public void positionVolume(int position) {
        mIvBlocks.setImageResource(blocks.get(position));
        mTvBlocks.setText(blocksText.get(position));
    }
}
