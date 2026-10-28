package gf2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import qe2.AbstractC30312e;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.n */
/* JADX INFO: loaded from: classes10.dex */
public final class C15805n implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f59647a;

    /* JADX INFO: renamed from: b */
    public final ViewPager2 f59648b;

    private C15805n(ConstraintLayout constraintLayout, ViewPager2 viewPager2) {
        this.f59647a = constraintLayout;
        this.f59648b = viewPager2;
    }

    /* JADX INFO: renamed from: a */
    public static C15805n m44594a(View view) {
        int i13 = AbstractC30312e.f124146d1;
        ViewPager2 viewPager2 = (ViewPager2) AbstractC34235f.m108203J(view, i13);
        if (viewPager2 != null) {
            return new C15805n((ConstraintLayout) view, viewPager2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C15805n m44595c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC30313f.f124225m, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m44594a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f59647a;
    }
}
