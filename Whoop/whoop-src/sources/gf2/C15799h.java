package gf2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import qe2.AbstractC30312e;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.h */
/* JADX INFO: loaded from: classes10.dex */
public final class C15799h implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f59582a;

    /* JADX INFO: renamed from: b */
    public final TextView f59583b;

    /* JADX INFO: renamed from: c */
    public final TextView f59584c;

    /* JADX INFO: renamed from: d */
    public final View f59585d;

    /* JADX INFO: renamed from: e */
    public final SwitchCompat f59586e;

    /* JADX INFO: renamed from: f */
    public final TextView f59587f;

    /* JADX INFO: renamed from: g */
    public final TextView f59588g;

    /* JADX INFO: renamed from: h */
    public final TextView f59589h;

    /* JADX INFO: renamed from: i */
    public final ComposeView f59590i;

    /* JADX INFO: renamed from: j */
    public final ImageView f59591j;

    /* JADX INFO: renamed from: k */
    public final TextView f59592k;

    /* JADX INFO: renamed from: l */
    public final TextView f59593l;

    /* JADX INFO: renamed from: m */
    public final View f59594m;

    /* JADX INFO: renamed from: n */
    public final TextView f59595n;

    private C15799h(ConstraintLayout constraintLayout, TextView textView, TextView textView2, View view, SwitchCompat switchCompat, TextView textView3, TextView textView4, TextView textView5, ComposeView composeView, ImageView imageView, TextView textView6, TextView textView7, View view2, TextView textView8) {
        this.f59582a = constraintLayout;
        this.f59583b = textView;
        this.f59584c = textView2;
        this.f59585d = view;
        this.f59586e = switchCompat;
        this.f59587f = textView3;
        this.f59588g = textView4;
        this.f59589h = textView5;
        this.f59590i = composeView;
        this.f59591j = imageView;
        this.f59592k = textView6;
        this.f59593l = textView7;
        this.f59594m = view2;
        this.f59595n = textView8;
    }

    /* JADX INFO: renamed from: a */
    public static C15799h m44573a(View view) {
        View viewM108203J;
        View viewM108203J2;
        int i13 = AbstractC30312e.f124134a;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = AbstractC30312e.f124156h;
            TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView2 != null && (viewM108203J = AbstractC34235f.m108203J(view, (i13 = AbstractC30312e.f124159i))) != null) {
                i13 = AbstractC30312e.f124162j;
                SwitchCompat switchCompat = (SwitchCompat) AbstractC34235f.m108203J(view, i13);
                if (switchCompat != null) {
                    i13 = AbstractC30312e.f124165k;
                    TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                    if (textView3 != null) {
                        i13 = AbstractC30312e.f124166k0;
                        TextView textView4 = (TextView) AbstractC34235f.m108203J(view, i13);
                        if (textView4 != null) {
                            i13 = AbstractC30312e.f124140b1;
                            TextView textView5 = (TextView) AbstractC34235f.m108203J(view, i13);
                            if (textView5 != null) {
                                i13 = AbstractC30312e.f124143c1;
                                ComposeView composeView = (ComposeView) AbstractC34235f.m108203J(view, i13);
                                if (composeView != null) {
                                    i13 = AbstractC30312e.f124191s1;
                                    ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
                                    if (imageView != null) {
                                        i13 = AbstractC30312e.f124109R1;
                                        TextView textView6 = (TextView) AbstractC34235f.m108203J(view, i13);
                                        if (textView6 != null) {
                                            i13 = AbstractC30312e.f124118U1;
                                            TextView textView7 = (TextView) AbstractC34235f.m108203J(view, i13);
                                            if (textView7 != null && (viewM108203J2 = AbstractC34235f.m108203J(view, (i13 = AbstractC30312e.f124121V1))) != null) {
                                                i13 = AbstractC30312e.f124127X1;
                                                TextView textView8 = (TextView) AbstractC34235f.m108203J(view, i13);
                                                if (textView8 != null) {
                                                    return new C15799h((ConstraintLayout) view, textView, textView2, viewM108203J, switchCompat, textView3, textView4, textView5, composeView, imageView, textView6, textView7, viewM108203J2, textView8);
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
    public static C15799h m44574c(LayoutInflater layoutInflater) {
        return m44575d(layoutInflater, null, false);
    }

    /* JADX INFO: renamed from: d */
    public static C15799h m44575d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC30313f.f124219g, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m44573a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f59582a;
    }
}
