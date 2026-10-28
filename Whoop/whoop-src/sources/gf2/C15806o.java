package gf2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.whoop.p069ui.pills.StrokedPillButton;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import qe2.AbstractC30312e;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.o */
/* JADX INFO: loaded from: classes10.dex */
public final class C15806o implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final NestedScrollView f59649a;

    /* JADX INFO: renamed from: b */
    public final Guideline f59650b;

    /* JADX INFO: renamed from: c */
    public final Guideline f59651c;

    /* JADX INFO: renamed from: d */
    public final StrokedPillButton f59652d;

    /* JADX INFO: renamed from: e */
    public final AbstractC15810s f59653e;

    /* JADX INFO: renamed from: f */
    public final Guideline f59654f;

    private C15806o(NestedScrollView nestedScrollView, Guideline guideline, Guideline guideline2, StrokedPillButton strokedPillButton, AbstractC15810s abstractC15810s, Guideline guideline3) {
        this.f59649a = nestedScrollView;
        this.f59650b = guideline;
        this.f59651c = guideline2;
        this.f59652d = strokedPillButton;
        this.f59653e = abstractC15810s;
        this.f59654f = guideline3;
    }

    /* JADX INFO: renamed from: a */
    public static C15806o m44597a(View view) {
        View viewM108203J;
        int i13 = AbstractC30312e.f124189s;
        Guideline guideline = (Guideline) AbstractC34235f.m108203J(view, i13);
        if (guideline != null) {
            i13 = AbstractC30312e.f124068E;
            Guideline guideline2 = (Guideline) AbstractC34235f.m108203J(view, i13);
            if (guideline2 != null) {
                i13 = AbstractC30312e.f124120V0;
                StrokedPillButton strokedPillButton = (StrokedPillButton) AbstractC34235f.m108203J(view, i13);
                if (strokedPillButton != null && (viewM108203J = AbstractC34235f.m108203J(view, (i13 = AbstractC30312e.f124158h1))) != null) {
                    AbstractC15810s abstractC15810sM44610c = AbstractC15810s.m44610c(viewM108203J);
                    i13 = AbstractC30312e.f124188r1;
                    Guideline guideline3 = (Guideline) AbstractC34235f.m108203J(view, i13);
                    if (guideline3 != null) {
                        return new C15806o((NestedScrollView) view, guideline, guideline2, strokedPillButton, abstractC15810sM44610c, guideline3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C15806o m44598c(LayoutInflater layoutInflater) {
        return m44599d(layoutInflater, null, false);
    }

    /* JADX INFO: renamed from: d */
    public static C15806o m44599d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC30313f.f124226n, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m44597a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f59649a;
    }
}
