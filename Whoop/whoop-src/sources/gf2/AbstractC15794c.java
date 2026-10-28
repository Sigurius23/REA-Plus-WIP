package gf2;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.coaching.sleepcoach.harvard.view.OptimalSleepView;
import com.whoop.coaching.sleepcoach.harvard.view.TonightSleepBar;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.c */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC15794c extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final Guideline f59539a;

    /* JADX INFO: renamed from: b */
    public final Guideline f59540b;

    /* JADX INFO: renamed from: c */
    public final C15808q f59541c;

    /* JADX INFO: renamed from: d */
    public final OptimalSleepView f59542d;

    /* JADX INFO: renamed from: e */
    public final ConstraintLayout f59543e;

    /* JADX INFO: renamed from: f */
    public final TextView f59544f;

    /* JADX INFO: renamed from: g */
    public final TextView f59545g;

    /* JADX INFO: renamed from: h */
    public final TonightSleepBar f59546h;

    /* JADX INFO: renamed from: i */
    public final View f59547i;

    /* JADX INFO: renamed from: j */
    public final TextView f59548j;

    /* JADX INFO: renamed from: k */
    public final TextView f59549k;

    public AbstractC15794c(Object obj, View view, int i13, Guideline guideline, Guideline guideline2, C15808q c15808q, OptimalSleepView optimalSleepView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TonightSleepBar tonightSleepBar, View view2, TextView textView3, TextView textView4) {
        super(view, i13, obj);
        this.f59539a = guideline;
        this.f59540b = guideline2;
        this.f59541c = c15808q;
        this.f59542d = optimalSleepView;
        this.f59543e = constraintLayout;
        this.f59544f = textView;
        this.f59545g = textView2;
        this.f59546h = tonightSleepBar;
        this.f59547i = view2;
        this.f59548j = textView3;
        this.f59549k = textView4;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC15794c m44561c(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m44562d(layoutInflater, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC15794c m44562d(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC15794c) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC30313f.f124215c, null, false, obj);
    }
}
