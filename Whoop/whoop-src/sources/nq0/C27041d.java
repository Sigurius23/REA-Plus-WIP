package nq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1717o2;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p180h0.C16416l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: nq0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lnq0/d;", "Landroidx/recyclerview/widget/o2;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "b", "(Lc93/a;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "a", "Landroidx/constraintlayout/widget/ConstraintLayout;", "parentLayout", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27041d extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ConstraintLayout parentLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27041d(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(AbstractC38501b0.f165537q, parent, false));
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC22676k.m65750j(parent, "parent");
        View viewFindViewById = this.itemView.findViewById(AbstractC38499a0.f165104K0);
        AbstractC22676k.m65749i(viewFindViewById, "findViewById(...)");
        this.parentLayout = (ConstraintLayout) viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m81157c(InterfaceC4339a interfaceC4339a, View it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final void m81158b(InterfaceC4339a onClick) {
        AbstractC22676k.m65750j(onClick, "onClick");
        AbstractC1953c.m5963a(this.parentLayout, new C16416l0(onClick, 19));
    }
}
