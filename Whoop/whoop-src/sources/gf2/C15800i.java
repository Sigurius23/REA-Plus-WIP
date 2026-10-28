package gf2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whoop.p069ui.pills.StrokedPillButton;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import qe2.AbstractC30312e;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.i */
/* JADX INFO: loaded from: classes10.dex */
public final class C15800i implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final FrameLayout f59596a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f59597b;

    /* JADX INFO: renamed from: c */
    public final TextView f59598c;

    /* JADX INFO: renamed from: d */
    public final TextView f59599d;

    /* JADX INFO: renamed from: e */
    public final ImageView f59600e;

    /* JADX INFO: renamed from: f */
    public final TextView f59601f;

    /* JADX INFO: renamed from: g */
    public final TextView f59602g;

    /* JADX INFO: renamed from: h */
    public final TextView f59603h;

    /* JADX INFO: renamed from: i */
    public final ImageView f59604i;

    /* JADX INFO: renamed from: j */
    public final ConstraintLayout f59605j;

    /* JADX INFO: renamed from: k */
    public final ProgressBar f59606k;

    /* JADX INFO: renamed from: l */
    public final StrokedPillButton f59607l;

    /* JADX INFO: renamed from: m */
    public final TextView f59608m;

    /* JADX INFO: renamed from: n */
    public final ConstraintLayout f59609n;

    /* JADX INFO: renamed from: o */
    public final TextView f59610o;

    /* JADX INFO: renamed from: p */
    public final ImageView f59611p;

    /* JADX INFO: renamed from: q */
    public final ConstraintLayout f59612q;

    private C15800i(FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, TextView textView5, ImageView imageView2, ConstraintLayout constraintLayout, ProgressBar progressBar, StrokedPillButton strokedPillButton, TextView textView6, ConstraintLayout constraintLayout2, TextView textView7, ImageView imageView3, ConstraintLayout constraintLayout3) {
        this.f59596a = frameLayout;
        this.f59597b = frameLayout2;
        this.f59598c = textView;
        this.f59599d = textView2;
        this.f59600e = imageView;
        this.f59601f = textView3;
        this.f59602g = textView4;
        this.f59603h = textView5;
        this.f59604i = imageView2;
        this.f59605j = constraintLayout;
        this.f59606k = progressBar;
        this.f59607l = strokedPillButton;
        this.f59608m = textView6;
        this.f59609n = constraintLayout2;
        this.f59610o = textView7;
        this.f59611p = imageView3;
        this.f59612q = constraintLayout3;
    }

    /* JADX INFO: renamed from: a */
    public static C15800i m44577a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i13 = AbstractC30312e.f124138b;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = AbstractC30312e.f124141c;
            TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView2 != null) {
                i13 = AbstractC30312e.f124144d;
                ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
                if (imageView != null) {
                    i13 = AbstractC30312e.f124192t;
                    TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                    if (textView3 != null) {
                        i13 = AbstractC30312e.f124071F;
                        TextView textView4 = (TextView) AbstractC34235f.m108203J(view, i13);
                        if (textView4 != null) {
                            i13 = AbstractC30312e.f124074G;
                            TextView textView5 = (TextView) AbstractC34235f.m108203J(view, i13);
                            if (textView5 != null) {
                                i13 = AbstractC30312e.f124077H;
                                ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                                if (imageView2 != null) {
                                    i13 = AbstractC30312e.f124080I;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC34235f.m108203J(view, i13);
                                    if (constraintLayout != null) {
                                        i13 = AbstractC30312e.f124066D0;
                                        ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                                        if (progressBar != null) {
                                            i13 = AbstractC30312e.f124114T0;
                                            StrokedPillButton strokedPillButton = (StrokedPillButton) AbstractC34235f.m108203J(view, i13);
                                            if (strokedPillButton != null) {
                                                i13 = AbstractC30312e.f124126X0;
                                                TextView textView6 = (TextView) AbstractC34235f.m108203J(view, i13);
                                                if (textView6 != null) {
                                                    i13 = AbstractC30312e.f124132Z0;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) AbstractC34235f.m108203J(view, i13);
                                                    if (constraintLayout2 != null) {
                                                        i13 = AbstractC30312e.f124136a1;
                                                        TextView textView7 = (TextView) AbstractC34235f.m108203J(view, i13);
                                                        if (textView7 != null) {
                                                            i13 = AbstractC30312e.f124194t1;
                                                            ImageView imageView3 = (ImageView) AbstractC34235f.m108203J(view, i13);
                                                            if (imageView3 != null) {
                                                                i13 = AbstractC30312e.f124197u1;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) AbstractC34235f.m108203J(view, i13);
                                                                if (constraintLayout3 != null) {
                                                                    return new C15800i(frameLayout, frameLayout, textView, textView2, imageView, textView3, textView4, textView5, imageView2, constraintLayout, progressBar, strokedPillButton, textView6, constraintLayout2, textView7, imageView3, constraintLayout3);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C15800i m44578c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC30313f.f124220h, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m44577a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f59596a;
    }
}
