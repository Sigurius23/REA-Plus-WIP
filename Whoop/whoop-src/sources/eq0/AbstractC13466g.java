package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.p069ui.WhoopEditText;
import com.whoop.p069ui.WhoopToolbar;
import com.whoop.p069ui.pills.StrokedPillButton;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.g */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13466g extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ImageView f47289a;

    /* JADX INFO: renamed from: b */
    public final TextView f47290b;

    /* JADX INFO: renamed from: c */
    public final TextView f47291c;

    /* JADX INFO: renamed from: d */
    public final Guideline f47292d;

    /* JADX INFO: renamed from: e */
    public final Guideline f47293e;

    /* JADX INFO: renamed from: f */
    public final Guideline f47294f;

    /* JADX INFO: renamed from: g */
    public final Guideline f47295g;

    /* JADX INFO: renamed from: h */
    public final TextView f47296h;

    /* JADX INFO: renamed from: i */
    public final TextView f47297i;

    /* JADX INFO: renamed from: j */
    public final StrokedPillButton f47298j;

    /* JADX INFO: renamed from: k */
    public final WhoopEditText f47299k;

    /* JADX INFO: renamed from: l */
    public final TextView f47300l;

    /* JADX INFO: renamed from: m */
    public final ImageView f47301m;

    /* JADX INFO: renamed from: n */
    public final ScrollView f47302n;

    /* JADX INFO: renamed from: o */
    public final StrokedPillButton f47303o;

    /* JADX INFO: renamed from: p */
    public final TextView f47304p;

    /* JADX INFO: renamed from: q */
    public final WhoopToolbar f47305q;

    public AbstractC13466g(Object obj, View view, int i13, ImageView imageView, TextView textView, TextView textView2, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, TextView textView3, TextView textView4, StrokedPillButton strokedPillButton, WhoopEditText whoopEditText, TextView textView5, ImageView imageView2, ScrollView scrollView, StrokedPillButton strokedPillButton2, TextView textView6, WhoopToolbar whoopToolbar) {
        super(view, i13, obj);
        this.f47289a = imageView;
        this.f47290b = textView;
        this.f47291c = textView2;
        this.f47292d = guideline;
        this.f47293e = guideline2;
        this.f47294f = guideline3;
        this.f47295g = guideline4;
        this.f47296h = textView3;
        this.f47297i = textView4;
        this.f47298j = strokedPillButton;
        this.f47299k = whoopEditText;
        this.f47300l = textView5;
        this.f47301m = imageView2;
        this.f47302n = scrollView;
        this.f47303o = strokedPillButton2;
        this.f47304p = textView6;
        this.f47305q = whoopToolbar;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13466g m38189c(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38190d(layoutInflater, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13466g m38190d(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC13466g) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165515f, null, false, obj);
    }
}
