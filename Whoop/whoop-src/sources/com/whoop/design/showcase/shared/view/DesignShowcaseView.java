package com.whoop.design.showcase.shared.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import d71.C11757c;
import d91.AbstractC11817e;
import hb1.C17085h;
import hd1.AbstractC17198b;
import id1.C18414e;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;", "Ld91/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "m", "(Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "", "K", "Lkotlin/jvm/functions/Function1;", "getOnViewEvent", "()Lkotlin/jvm/functions/Function1;", "setOnViewEvent", "(Lkotlin/jvm/functions/Function1;)V", "onViewEvent", "Lid1/e;", "<set-?>", "L", "Lp1/c1;", "getViewState", "()Lid1/e;", "setViewState", "(Lid1/e;)V", "viewState", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DesignShowcaseView extends AbstractC11817e {

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private Function1 onViewEvent;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC28601c1 viewState;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DesignShowcaseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m21258r(DesignShowcaseView designShowcaseView, Object it) {
        AbstractC22676k.m65750j(it, "it");
        designShowcaseView.onViewEvent.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m21259s(DesignShowcaseView designShowcaseView, int i13, Composer composer, int i14) {
        designShowcaseView.mo20132m(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m21260t(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    public final Function1 getOnViewEvent() {
        return this.onViewEvent;
    }

    public final C18414e getViewState() {
        return (C18414e) this.viewState.getValue();
    }

    @Override // d91.AbstractC11817e
    /* JADX INFO: renamed from: m */
    public void mo20132m(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-410903502);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C18414e viewState = getViewState();
            boolean zM87157i = c28655q.m87157i(this);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C17095c(this, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17198b.m48557e(viewState, (Function1) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(this, i13, 17);
        }
    }

    public final void setOnViewEvent(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.onViewEvent = function1;
    }

    public final void setViewState(C18414e c18414e) {
        AbstractC22676k.m65750j(c18414e, "<set-?>");
        this.viewState.setValue(c18414e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DesignShowcaseView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.onViewEvent = new C17085h(7);
        this.viewState = AbstractC28683x.m87272z(new C18414e(null, null, null, 7, null));
    }

    public /* synthetic */ DesignShowcaseView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
