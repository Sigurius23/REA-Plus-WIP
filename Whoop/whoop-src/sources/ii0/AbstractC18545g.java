package ii0;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.VideoView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentContainerView;
import com.airbnb.lottie.LottieAnimationView;
import hi0.AbstractC17308f;

/* JADX INFO: renamed from: ii0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18545g extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ComposeView f72272a;

    /* JADX INFO: renamed from: b */
    public final FragmentContainerView f72273b;

    /* JADX INFO: renamed from: c */
    public final ComposeView f72274c;

    /* JADX INFO: renamed from: d */
    public final VideoView f72275d;

    /* JADX INFO: renamed from: e */
    public final LottieAnimationView f72276e;

    public AbstractC18545g(Object obj, View view, int i13, ComposeView composeView, FragmentContainerView fragmentContainerView, ComposeView composeView2, VideoView videoView, LottieAnimationView lottieAnimationView) {
        super(view, i13, obj);
        this.f72272a = composeView;
        this.f72273b = fragmentContainerView;
        this.f72274c = composeView2;
        this.f72275d = videoView;
        this.f72276e = lottieAnimationView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18545g m53759c(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m53760d(layoutInflater, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC18545g m53760d(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC18545g) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC17308f.f66882d, null, false, obj);
    }
}
