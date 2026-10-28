package gf2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.p069ui.DotProgressIndicator;
import com.whoop.p069ui.views.ColoredImageView;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.u */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC15812u extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final View f59693a;

    /* JADX INFO: renamed from: b */
    public final ImageView f59694b;

    /* JADX INFO: renamed from: c */
    public final DotProgressIndicator f59695c;

    /* JADX INFO: renamed from: d */
    public final FrameLayout f59696d;

    /* JADX INFO: renamed from: e */
    public final ColoredImageView f59697e;

    /* JADX INFO: renamed from: f */
    public final TextView f59698f;

    /* JADX INFO: renamed from: g */
    public final TextView f59699g;

    /* JADX INFO: renamed from: h */
    public final ConstraintLayout f59700h;

    /* JADX INFO: renamed from: i */
    public final TextView f59701i;

    public AbstractC15812u(Object obj, View view, int i13, View view2, ImageView imageView, DotProgressIndicator dotProgressIndicator, FrameLayout frameLayout, ColoredImageView coloredImageView, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3) {
        super(view, i13, obj);
        this.f59693a = view2;
        this.f59694b = imageView;
        this.f59695c = dotProgressIndicator;
        this.f59696d = frameLayout;
        this.f59697e = coloredImageView;
        this.f59698f = textView;
        this.f59699g = textView2;
        this.f59700h = constraintLayout;
        this.f59701i = textView3;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC15812u m44617c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m44618d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC15812u m44618d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC15812u) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC30313f.f124231s, viewGroup, z4, obj);
    }
}
