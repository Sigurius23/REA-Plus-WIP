package ii0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.airbnb.lottie.LottieAnimationView;
import com.whoop.p069ui.views.NewStrapSettingsBatteryIndicator;
import hi0.AbstractC17308f;

/* JADX INFO: renamed from: ii0.w */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18567w extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f72529a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f72530b;

    /* JADX INFO: renamed from: c */
    public final Group f72531c;

    /* JADX INFO: renamed from: d */
    public final Guideline f72532d;

    /* JADX INFO: renamed from: e */
    public final ConstraintLayout f72533e;

    /* JADX INFO: renamed from: f */
    public final ImageView f72534f;

    /* JADX INFO: renamed from: g */
    public final ConstraintLayout f72535g;

    /* JADX INFO: renamed from: h */
    public final TextView f72536h;

    /* JADX INFO: renamed from: i */
    public final LottieAnimationView f72537i;

    /* JADX INFO: renamed from: j */
    public final NewStrapSettingsBatteryIndicator f72538j;

    /* JADX INFO: renamed from: k */
    public final ImageView f72539k;

    /* JADX INFO: renamed from: l */
    public final ImageView f72540l;

    /* JADX INFO: renamed from: m */
    public final ImageView f72541m;

    /* JADX INFO: renamed from: n */
    public final TextView f72542n;

    /* JADX INFO: renamed from: o */
    public final SwitchCompat f72543o;

    /* JADX INFO: renamed from: p */
    public final TextView f72544p;

    /* JADX INFO: renamed from: q */
    public final TextView f72545q;

    /* JADX INFO: renamed from: r */
    public final TextView f72546r;

    public AbstractC18567w(Object obj, View view, int i13, ConstraintLayout constraintLayout, LinearLayout linearLayout, Group group, Guideline guideline, ConstraintLayout constraintLayout2, ImageView imageView, ConstraintLayout constraintLayout3, TextView textView, LottieAnimationView lottieAnimationView, NewStrapSettingsBatteryIndicator newStrapSettingsBatteryIndicator, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView2, SwitchCompat switchCompat, TextView textView3, TextView textView4, TextView textView5) {
        super(view, i13, obj);
        this.f72529a = constraintLayout;
        this.f72530b = linearLayout;
        this.f72531c = group;
        this.f72532d = guideline;
        this.f72533e = constraintLayout2;
        this.f72534f = imageView;
        this.f72535g = constraintLayout3;
        this.f72536h = textView;
        this.f72537i = lottieAnimationView;
        this.f72538j = newStrapSettingsBatteryIndicator;
        this.f72539k = imageView2;
        this.f72540l = imageView3;
        this.f72541m = imageView4;
        this.f72542n = textView2;
        this.f72543o = switchCompat;
        this.f72544p = textView3;
        this.f72545q = textView4;
        this.f72546r = textView5;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18567w m53780c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m53781d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC18567w m53781d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC18567w) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC17308f.f66891m, viewGroup, z4, obj);
    }
}
