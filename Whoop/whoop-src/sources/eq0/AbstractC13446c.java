package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.p069ui.WhoopEditText;
import com.whoop.p069ui.WhoopToolbar;
import com.whoop.p069ui.pills.StrokedPillButton;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.c */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13446c extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f47148a;

    /* JADX INFO: renamed from: b */
    public final ImageView f47149b;

    /* JADX INFO: renamed from: c */
    public final Guideline f47150c;

    /* JADX INFO: renamed from: d */
    public final Guideline f47151d;

    /* JADX INFO: renamed from: e */
    public final Guideline f47152e;

    /* JADX INFO: renamed from: f */
    public final TextView f47153f;

    /* JADX INFO: renamed from: g */
    public final WhoopEditText f47154g;

    /* JADX INFO: renamed from: h */
    public final C13464f2 f47155h;

    /* JADX INFO: renamed from: i */
    public final LinearLayout f47156i;

    /* JADX INFO: renamed from: j */
    public final TextView f47157j;

    /* JADX INFO: renamed from: k */
    public final StrokedPillButton f47158k;

    /* JADX INFO: renamed from: l */
    public final View f47159l;

    /* JADX INFO: renamed from: m */
    public final View f47160m;

    /* JADX INFO: renamed from: n */
    public final TextView f47161n;

    /* JADX INFO: renamed from: o */
    public final TextView f47162o;

    /* JADX INFO: renamed from: p */
    public final WhoopToolbar f47163p;

    /* JADX INFO: renamed from: q */
    public final WhoopToolbar f47164q;

    /* JADX INFO: renamed from: r */
    public final TextView f47165r;

    public AbstractC13446c(Object obj, View view, int i13, ConstraintLayout constraintLayout, ImageView imageView, Guideline guideline, Guideline guideline2, Guideline guideline3, TextView textView, WhoopEditText whoopEditText, C13464f2 c13464f2, LinearLayout linearLayout, TextView textView2, StrokedPillButton strokedPillButton, View view2, View view3, TextView textView3, TextView textView4, WhoopToolbar whoopToolbar, WhoopToolbar whoopToolbar2, TextView textView5) {
        super(view, i13, obj);
        this.f47148a = constraintLayout;
        this.f47149b = imageView;
        this.f47150c = guideline;
        this.f47151d = guideline2;
        this.f47152e = guideline3;
        this.f47153f = textView;
        this.f47154g = whoopEditText;
        this.f47155h = c13464f2;
        this.f47156i = linearLayout;
        this.f47157j = textView2;
        this.f47158k = strokedPillButton;
        this.f47159l = view2;
        this.f47160m = view3;
        this.f47161n = textView3;
        this.f47162o = textView4;
        this.f47163p = whoopToolbar;
        this.f47164q = whoopToolbar2;
        this.f47165r = textView5;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13446c m38175c(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38176d(layoutInflater, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13446c m38176d(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC13446c) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165507b, null, false, obj);
    }
}
