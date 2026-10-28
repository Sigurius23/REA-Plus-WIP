package ii0;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.airbnb.lottie.LottieAnimationView;
import hi0.AbstractC17308f;

/* JADX INFO: renamed from: ii0.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18533a extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC18534a0 f72201a;

    /* JADX INFO: renamed from: b */
    public final ImageView f72202b;

    /* JADX INFO: renamed from: c */
    public final AbstractC18538c0 f72203c;

    /* JADX INFO: renamed from: d */
    public final AbstractC18542e0 f72204d;

    /* JADX INFO: renamed from: e */
    public final AbstractC18546g0 f72205e;

    /* JADX INFO: renamed from: f */
    public final View f72206f;

    /* JADX INFO: renamed from: g */
    public final Guideline f72207g;

    /* JADX INFO: renamed from: h */
    public final LottieAnimationView f72208h;

    public AbstractC18533a(Object obj, View view, int i13, AbstractC18534a0 abstractC18534a0, ImageView imageView, AbstractC18538c0 abstractC18538c0, AbstractC18542e0 abstractC18542e0, AbstractC18546g0 abstractC18546g0, View view2, Guideline guideline, LottieAnimationView lottieAnimationView) {
        super(view, i13, obj);
        this.f72201a = abstractC18534a0;
        this.f72202b = imageView;
        this.f72203c = abstractC18538c0;
        this.f72204d = abstractC18542e0;
        this.f72205e = abstractC18546g0;
        this.f72206f = view2;
        this.f72207g = guideline;
        this.f72208h = lottieAnimationView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18533a m53749c(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m53750d(layoutInflater, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC18533a m53750d(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC18533a) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC17308f.f66879a, null, false, obj);
    }
}
