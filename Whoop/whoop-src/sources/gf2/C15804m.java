package gf2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import qe2.AbstractC30312e;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.m */
/* JADX INFO: loaded from: classes10.dex */
public final class C15804m implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f59642a;

    /* JADX INFO: renamed from: b */
    public final ImageView f59643b;

    /* JADX INFO: renamed from: c */
    public final ImageView f59644c;

    /* JADX INFO: renamed from: d */
    public final TextView f59645d;

    /* JADX INFO: renamed from: e */
    public final FragmentContainerView f59646e;

    private C15804m(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, FragmentContainerView fragmentContainerView) {
        this.f59642a = constraintLayout;
        this.f59643b = imageView;
        this.f59644c = imageView2;
        this.f59645d = textView;
        this.f59646e = fragmentContainerView;
    }

    /* JADX INFO: renamed from: a */
    public static C15804m m44590a(View view) {
        int i13 = AbstractC30312e.f124177o;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = AbstractC30312e.f124125X;
            ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView2 != null) {
                i13 = AbstractC30312e.f124133Z1;
                TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView != null) {
                    i13 = AbstractC30312e.f124137a2;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC34235f.m108203J(view, i13);
                    if (fragmentContainerView != null) {
                        return new C15804m((ConstraintLayout) view, imageView, imageView2, textView, fragmentContainerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C15804m m44591c(LayoutInflater layoutInflater) {
        return m44592d(layoutInflater, null, false);
    }

    /* JADX INFO: renamed from: d */
    public static C15804m m44592d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC30313f.f124224l, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m44590a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f59642a;
    }
}
