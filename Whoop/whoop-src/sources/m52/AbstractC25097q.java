package m52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.realtime.presentation.views.RealTimeCell;
import com.whoop.realtime.presentation.views.StrainCoachStrainGraph;
import k52.AbstractC22209e;

/* JADX INFO: renamed from: m52.q */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC25097q extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final TextView f98353a;

    /* JADX INFO: renamed from: b */
    public final Guideline f98354b;

    /* JADX INFO: renamed from: c */
    public final Guideline f98355c;

    /* JADX INFO: renamed from: d */
    public final Guideline f98356d;

    /* JADX INFO: renamed from: e */
    public final Guideline f98357e;

    /* JADX INFO: renamed from: f */
    public final TextView f98358f;

    /* JADX INFO: renamed from: g */
    public final TextView f98359g;

    /* JADX INFO: renamed from: h */
    public final FrameLayout f98360h;

    /* JADX INFO: renamed from: i */
    public final ConstraintLayout f98361i;

    /* JADX INFO: renamed from: j */
    public final RealTimeCell f98362j;

    /* JADX INFO: renamed from: k */
    public final RealTimeCell f98363k;

    /* JADX INFO: renamed from: l */
    public final RealTimeCell f98364l;

    /* JADX INFO: renamed from: m */
    public final TextView f98365m;

    /* JADX INFO: renamed from: n */
    public final LinearLayout f98366n;

    /* JADX INFO: renamed from: o */
    public final StrainCoachStrainGraph f98367o;

    /* JADX INFO: renamed from: p */
    public final TextView f98368p;

    public AbstractC25097q(Object obj, View view, int i13, TextView textView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, TextView textView2, TextView textView3, FrameLayout frameLayout, ConstraintLayout constraintLayout, RealTimeCell realTimeCell, RealTimeCell realTimeCell2, RealTimeCell realTimeCell3, TextView textView4, LinearLayout linearLayout, StrainCoachStrainGraph strainCoachStrainGraph, TextView textView5) {
        super(view, i13, obj);
        this.f98353a = textView;
        this.f98354b = guideline;
        this.f98355c = guideline2;
        this.f98356d = guideline3;
        this.f98357e = guideline4;
        this.f98358f = textView2;
        this.f98359g = textView3;
        this.f98360h = frameLayout;
        this.f98361i = constraintLayout;
        this.f98362j = realTimeCell;
        this.f98363k = realTimeCell2;
        this.f98364l = realTimeCell3;
        this.f98365m = textView4;
        this.f98366n = linearLayout;
        this.f98367o = strainCoachStrainGraph;
        this.f98368p = textView5;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC25097q m73590c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m73591d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC25097q m73591d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC25097q) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC22209e.f86399k, viewGroup, z4, obj);
    }
}
