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

/* JADX INFO: renamed from: gf2.r */
/* JADX INFO: loaded from: classes10.dex */
public final class C15809r implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f59667a;

    /* JADX INFO: renamed from: b */
    public final TextView f59668b;

    /* JADX INFO: renamed from: c */
    public final ImageView f59669c;

    /* JADX INFO: renamed from: d */
    public final Guideline f59670d;

    /* JADX INFO: renamed from: e */
    public final Guideline f59671e;

    /* JADX INFO: renamed from: f */
    public final Guideline f59672f;

    /* JADX INFO: renamed from: g */
    public final TextView f59673g;

    /* JADX INFO: renamed from: h */
    public final ImageView f59674h;

    /* JADX INFO: renamed from: i */
    public final TextView f59675i;

    /* JADX INFO: renamed from: j */
    public final TextView f59676j;

    /* JADX INFO: renamed from: k */
    public final TextView f59677k;

    private C15809r(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, Guideline guideline, Guideline guideline2, Guideline guideline3, TextView textView2, ImageView imageView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f59667a = constraintLayout;
        this.f59668b = textView;
        this.f59669c = imageView;
        this.f59670d = guideline;
        this.f59671e = guideline2;
        this.f59672f = guideline3;
        this.f59673g = textView2;
        this.f59674h = imageView2;
        this.f59675i = textView3;
        this.f59676j = textView4;
        this.f59677k = textView5;
    }

    /* JADX INFO: renamed from: a */
    public static C15809r m44607a(View view) {
        int i13 = AbstractC30312e.f124180p;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = AbstractC30312e.f124201w;
            ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView != null) {
                i13 = AbstractC30312e.f124092M;
                Guideline guideline = (Guideline) AbstractC34235f.m108203J(view, i13);
                if (guideline != null) {
                    i13 = AbstractC30312e.f124098O;
                    Guideline guideline2 = (Guideline) AbstractC34235f.m108203J(view, i13);
                    if (guideline2 != null) {
                        i13 = AbstractC30312e.f124101P;
                        Guideline guideline3 = (Guideline) AbstractC34235f.m108203J(view, i13);
                        if (guideline3 != null) {
                            i13 = AbstractC30312e.f124181p0;
                            TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                            if (textView2 != null) {
                                i13 = AbstractC30312e.f124193t0;
                                ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                                if (imageView2 != null) {
                                    i13 = AbstractC30312e.f124196u0;
                                    TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                                    if (textView3 != null) {
                                        i13 = AbstractC30312e.f124199v0;
                                        TextView textView4 = (TextView) AbstractC34235f.m108203J(view, i13);
                                        if (textView4 != null) {
                                            i13 = AbstractC30312e.f124202w0;
                                            TextView textView5 = (TextView) AbstractC34235f.m108203J(view, i13);
                                            if (textView5 != null) {
                                                return new C15809r((ConstraintLayout) view, textView, imageView, guideline, guideline2, guideline3, textView2, imageView2, textView3, textView4, textView5);
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
    public static C15809r m44608c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC30313f.f124229q, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m44607a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f59667a;
    }
}
