package com.whoop.design.atomic.organism.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import d91.AbstractC11817e;
import k71.C22252i;
import l83.C23454a0;
import nx1.C27219a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/design/atomic/organism/toolbar/DesignToolbarView;", "Ld91/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "m", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/atomic/organism/toolbar/d;", "state", "setToolbarType", "(Lcom/whoop/design/atomic/organism/toolbar/d;)V", "Lkotlin/Function0;", "onClick", "setOnLeftButtonClick", "(Lc93/a;)V", "setOnRightButtonClick", "K", "Lc93/a;", "onLeftButtonClick", "L", "onRightButtonClick", "Lp1/c1;", "M", "Lp1/c1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DesignToolbarView extends AbstractC11817e {

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private InterfaceC4339a onLeftButtonClick;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private InterfaceC4339a onRightButtonClick;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private InterfaceC28601c1 state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DesignToolbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m20129r(DesignToolbarView designToolbarView, int i13, Composer composer, int i14) {
        designToolbarView.mo20132m(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m20130s() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m20131t() {
        return C23454a0.f92919a;
    }

    @Override // d91.AbstractC11817e
    /* JADX INFO: renamed from: m */
    public void mo20132m(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1766520241);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC6719b.m20143d(null, (AbstractC6721d) this.state.getValue(), null, this.onLeftButtonClick, this.onRightButtonClick, null, c28655q, 0, 37);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(this, i13, 29);
        }
    }

    public final void setOnLeftButtonClick(InterfaceC4339a onClick) {
        AbstractC22676k.m65750j(onClick, "onClick");
        this.onLeftButtonClick = onClick;
    }

    public final void setOnRightButtonClick(InterfaceC4339a onClick) {
        AbstractC22676k.m65750j(onClick, "onClick");
        this.onRightButtonClick = onClick;
    }

    public final void setToolbarType(AbstractC6721d state) {
        AbstractC22676k.m65750j(state, "state");
        this.state.setValue(state);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DesignToolbarView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.onLeftButtonClick = new C27219a(13);
        this.onRightButtonClick = new C27219a(14);
        this.state = AbstractC28683x.m87272z(new AbstractC6721d.a(null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 32767, null));
    }

    public /* synthetic */ DesignToolbarView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
