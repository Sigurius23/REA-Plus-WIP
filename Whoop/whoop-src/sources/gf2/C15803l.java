package gf2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentContainerView;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import qe2.AbstractC30312e;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.l */
/* JADX INFO: loaded from: classes10.dex */
public final class C15803l implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f59627a;

    /* JADX INFO: renamed from: b */
    public final FragmentContainerView f59628b;

    /* JADX INFO: renamed from: c */
    public final FragmentContainerView f59629c;

    /* JADX INFO: renamed from: d */
    public final Guideline f59630d;

    /* JADX INFO: renamed from: e */
    public final Guideline f59631e;

    /* JADX INFO: renamed from: f */
    public final TextView f59632f;

    /* JADX INFO: renamed from: g */
    public final TextView f59633g;

    /* JADX INFO: renamed from: h */
    public final ImageView f59634h;

    /* JADX INFO: renamed from: i */
    public final FrameLayout f59635i;

    /* JADX INFO: renamed from: j */
    public final ConstraintLayout f59636j;

    /* JADX INFO: renamed from: k */
    public final FragmentContainerView f59637k;

    /* JADX INFO: renamed from: l */
    public final FragmentContainerView f59638l;

    /* JADX INFO: renamed from: m */
    public final FragmentContainerView f59639m;

    /* JADX INFO: renamed from: n */
    public final FragmentContainerView f59640n;

    /* JADX INFO: renamed from: o */
    public final FragmentContainerView f59641o;

    private C15803l(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2, Guideline guideline, Guideline guideline2, TextView textView, TextView textView2, ImageView imageView, FrameLayout frameLayout, ConstraintLayout constraintLayout2, FragmentContainerView fragmentContainerView3, FragmentContainerView fragmentContainerView4, FragmentContainerView fragmentContainerView5, FragmentContainerView fragmentContainerView6, FragmentContainerView fragmentContainerView7) {
        this.f59627a = constraintLayout;
        this.f59628b = fragmentContainerView;
        this.f59629c = fragmentContainerView2;
        this.f59630d = guideline;
        this.f59631e = guideline2;
        this.f59632f = textView;
        this.f59633g = textView2;
        this.f59634h = imageView;
        this.f59635i = frameLayout;
        this.f59636j = constraintLayout2;
        this.f59637k = fragmentContainerView3;
        this.f59638l = fragmentContainerView4;
        this.f59639m = fragmentContainerView5;
        this.f59640n = fragmentContainerView6;
        this.f59641o = fragmentContainerView7;
    }

    /* JADX INFO: renamed from: a */
    public static C15803l m44586a(View view) {
        int i13 = AbstractC30312e.f124150f;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC34235f.m108203J(view, i13);
        if (fragmentContainerView != null) {
            i13 = AbstractC30312e.f124204x;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) AbstractC34235f.m108203J(view, i13);
            if (fragmentContainerView2 != null) {
                i13 = AbstractC30312e.f124104Q;
                Guideline guideline = (Guideline) AbstractC34235f.m108203J(view, i13);
                if (guideline != null) {
                    i13 = AbstractC30312e.f124110S;
                    Guideline guideline2 = (Guideline) AbstractC34235f.m108203J(view, i13);
                    if (guideline2 != null) {
                        i13 = AbstractC30312e.f124184q0;
                        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                        if (textView != null) {
                            i13 = AbstractC30312e.f124187r0;
                            TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                            if (textView2 != null) {
                                i13 = AbstractC30312e.f124190s0;
                                ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
                                if (imageView != null) {
                                    i13 = AbstractC30312e.f124211z0;
                                    FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                                    if (frameLayout != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i13 = AbstractC30312e.f124129Y0;
                                        FragmentContainerView fragmentContainerView3 = (FragmentContainerView) AbstractC34235f.m108203J(view, i13);
                                        if (fragmentContainerView3 != null) {
                                            i13 = AbstractC30312e.f124070E1;
                                            FragmentContainerView fragmentContainerView4 = (FragmentContainerView) AbstractC34235f.m108203J(view, i13);
                                            if (fragmentContainerView4 != null) {
                                                i13 = AbstractC30312e.f124073F1;
                                                FragmentContainerView fragmentContainerView5 = (FragmentContainerView) AbstractC34235f.m108203J(view, i13);
                                                if (fragmentContainerView5 != null) {
                                                    i13 = AbstractC30312e.f124103P1;
                                                    FragmentContainerView fragmentContainerView6 = (FragmentContainerView) AbstractC34235f.m108203J(view, i13);
                                                    if (fragmentContainerView6 != null) {
                                                        i13 = AbstractC30312e.f124130Y1;
                                                        FragmentContainerView fragmentContainerView7 = (FragmentContainerView) AbstractC34235f.m108203J(view, i13);
                                                        if (fragmentContainerView7 != null) {
                                                            return new C15803l(constraintLayout, fragmentContainerView, fragmentContainerView2, guideline, guideline2, textView, textView2, imageView, frameLayout, constraintLayout, fragmentContainerView3, fragmentContainerView4, fragmentContainerView5, fragmentContainerView6, fragmentContainerView7);
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
    public static C15803l m44587c(LayoutInflater layoutInflater) {
        return m44588d(layoutInflater, null, false);
    }

    /* JADX INFO: renamed from: d */
    public static C15803l m44588d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC30313f.f124223k, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m44586a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f59627a;
    }
}
