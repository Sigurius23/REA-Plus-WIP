package gf2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import qe2.AbstractC30312e;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.f */
/* JADX INFO: loaded from: classes10.dex */
public final class C15797f implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f59561a;

    /* JADX INFO: renamed from: b */
    public final View f59562b;

    /* JADX INFO: renamed from: c */
    public final TextView f59563c;

    /* JADX INFO: renamed from: d */
    public final TextView f59564d;

    /* JADX INFO: renamed from: e */
    public final Guideline f59565e;

    /* JADX INFO: renamed from: f */
    public final Guideline f59566f;

    /* JADX INFO: renamed from: g */
    public final Guideline f59567g;

    /* JADX INFO: renamed from: h */
    public final View f59568h;

    /* JADX INFO: renamed from: i */
    public final TextView f59569i;

    /* JADX INFO: renamed from: j */
    public final ImageView f59570j;

    /* JADX INFO: renamed from: k */
    public final TextView f59571k;

    /* JADX INFO: renamed from: l */
    public final View f59572l;

    /* JADX INFO: renamed from: m */
    public final TextView f59573m;

    /* JADX INFO: renamed from: n */
    public final ImageView f59574n;

    /* JADX INFO: renamed from: o */
    public final TextView f59575o;

    private C15797f(ConstraintLayout constraintLayout, View view, TextView textView, TextView textView2, Guideline guideline, Guideline guideline2, Guideline guideline3, View view2, TextView textView3, ImageView imageView, TextView textView4, View view3, TextView textView5, ImageView imageView2, TextView textView6) {
        this.f59561a = constraintLayout;
        this.f59562b = view;
        this.f59563c = textView;
        this.f59564d = textView2;
        this.f59565e = guideline;
        this.f59566f = guideline2;
        this.f59567g = guideline3;
        this.f59568h = view2;
        this.f59569i = textView3;
        this.f59570j = imageView;
        this.f59571k = textView4;
        this.f59572l = view3;
        this.f59573m = textView5;
        this.f59574n = imageView2;
        this.f59575o = textView6;
    }

    /* JADX INFO: renamed from: a */
    public static C15797f m44566a(View view) {
        View viewM108203J;
        View viewM108203J2;
        int i13 = AbstractC30312e.f124083J;
        View viewM108203J3 = AbstractC34235f.m108203J(view, i13);
        if (viewM108203J3 != null) {
            i13 = AbstractC30312e.f124086K;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = AbstractC30312e.f124089L;
                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView2 != null) {
                    i13 = AbstractC30312e.f124107R;
                    Guideline guideline = (Guideline) AbstractC34235f.m108203J(view, i13);
                    if (guideline != null) {
                        i13 = AbstractC30312e.f124113T;
                        Guideline guideline2 = (Guideline) AbstractC34235f.m108203J(view, i13);
                        if (guideline2 != null) {
                            i13 = AbstractC30312e.f124119V;
                            Guideline guideline3 = (Guideline) AbstractC34235f.m108203J(view, i13);
                            if (guideline3 != null && (viewM108203J = AbstractC34235f.m108203J(view, (i13 = AbstractC30312e.f124135a0))) != null) {
                                i13 = AbstractC30312e.f124139b0;
                                TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                                if (textView3 != null) {
                                    i13 = AbstractC30312e.f124142c0;
                                    ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
                                    if (imageView != null) {
                                        i13 = AbstractC30312e.f124145d0;
                                        TextView textView4 = (TextView) AbstractC34235f.m108203J(view, i13);
                                        if (textView4 != null && (viewM108203J2 = AbstractC34235f.m108203J(view, (i13 = AbstractC30312e.f124155g1))) != null) {
                                            i13 = AbstractC30312e.f124161i1;
                                            TextView textView5 = (TextView) AbstractC34235f.m108203J(view, i13);
                                            if (textView5 != null) {
                                                i13 = AbstractC30312e.f124164j1;
                                                ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                                                if (imageView2 != null) {
                                                    i13 = AbstractC30312e.f124176n1;
                                                    TextView textView6 = (TextView) AbstractC34235f.m108203J(view, i13);
                                                    if (textView6 != null) {
                                                        return new C15797f((ConstraintLayout) view, viewM108203J3, textView, textView2, guideline, guideline2, guideline3, viewM108203J, textView3, imageView, textView4, viewM108203J2, textView5, imageView2, textView6);
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
    public static C15797f m44567c(LayoutInflater layoutInflater) {
        return m44568d(layoutInflater, null, false);
    }

    /* JADX INFO: renamed from: d */
    public static C15797f m44568d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC30313f.f124217e, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m44566a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f59561a;
    }
}
