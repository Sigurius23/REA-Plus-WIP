package yc1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whoop.design.atomic.organism.toolbar.DesignToolbarView;
import com.whoop.design.showcase.shared.view.DesignShowcaseView;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import xc1.AbstractC38188b;
import xc1.AbstractC38189c;

/* JADX INFO: renamed from: yc1.a */
/* JADX INFO: loaded from: classes8.dex */
public final class C39431a implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f169663a;

    /* JADX INFO: renamed from: b */
    public final DesignShowcaseView f169664b;

    /* JADX INFO: renamed from: c */
    public final DesignToolbarView f169665c;

    private C39431a(ConstraintLayout constraintLayout, DesignShowcaseView designShowcaseView, DesignToolbarView designToolbarView) {
        this.f169663a = constraintLayout;
        this.f169664b = designShowcaseView;
        this.f169665c = designToolbarView;
    }

    /* JADX INFO: renamed from: a */
    public static C39431a m125942a(View view) {
        int i13 = AbstractC38188b.f163511f;
        DesignShowcaseView designShowcaseView = (DesignShowcaseView) AbstractC34235f.m108203J(view, i13);
        if (designShowcaseView != null) {
            i13 = AbstractC38188b.f163513h;
            DesignToolbarView designToolbarView = (DesignToolbarView) AbstractC34235f.m108203J(view, i13);
            if (designToolbarView != null) {
                return new C39431a((ConstraintLayout) view, designShowcaseView, designToolbarView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C39431a m125943c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC38189c.f163515a, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m125942a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f169663a;
    }
}
