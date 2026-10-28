package yc1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.design.atomic.organism.toolbar.DesignToolbarView;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import xc1.AbstractC38188b;
import xc1.AbstractC38189c;

/* JADX INFO: renamed from: yc1.b */
/* JADX INFO: loaded from: classes8.dex */
public final class C39432b implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f169666a;

    /* JADX INFO: renamed from: b */
    public final RecyclerView f169667b;

    /* JADX INFO: renamed from: c */
    public final DesignToolbarView f169668c;

    private C39432b(ConstraintLayout constraintLayout, RecyclerView recyclerView, DesignToolbarView designToolbarView) {
        this.f169666a = constraintLayout;
        this.f169667b = recyclerView;
        this.f169668c = designToolbarView;
    }

    /* JADX INFO: renamed from: a */
    public static C39432b m125945a(View view) {
        int i13 = AbstractC38188b.f163512g;
        RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
        if (recyclerView != null) {
            i13 = AbstractC38188b.f163513h;
            DesignToolbarView designToolbarView = (DesignToolbarView) AbstractC34235f.m108203J(view, i13);
            if (designToolbarView != null) {
                return new C39432b((ConstraintLayout) view, recyclerView, designToolbarView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C39432b m125946c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC38189c.f163516b, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m125945a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f169666a;
    }
}
