package br.com.como_voce_mora.ui.previoushouse;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import br.com.como_voce_mora.R;
import br.com.como_voce_mora.ui.BaseFragment;
import br.com.como_voce_mora.ui.aboutyou.AboutYouActivity;
import butterknife.OnClick;

public class PreviousHomeSplashFragment extends BaseFragment {


    public static PreviousHomeSplashFragment newInstance() {

        Bundle args = new Bundle();

        PreviousHomeSplashFragment fragment = new PreviousHomeSplashFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getResLayout() {
        return R.layout.fragment_splash_previous;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void init() {

    }

    @OnClick(R.id.bt_touch_next)
    public void onClickedBtNext() {
        ((AboutYouActivity) getActivity()).addFragment(PreviousHomeFragment.newInstance());
    }
}
