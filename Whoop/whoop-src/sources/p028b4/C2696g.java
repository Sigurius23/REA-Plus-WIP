package p028b4;

import android.graphics.Canvas;
import androidx.compose.p018ui.node.Owner;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import com.amplitude.quickjs.wrapper.QuickJSContext;
import com.amplitude.quickjs.wrapper.QuickJSObject;
import e10.C12554k0;
import gb.C15650k;
import gb.C15656q;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p005a3.C0230n0;
import p005a3.EnumC0236o2;
import p005a3.InterfaceC0240p2;
import p025b1.C2214e;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3736e1;
import p040c0.C3733d1;
import p040c0.C3739f1;
import p040c0.C3757l1;
import p040c0.EnumC3771q0;
import p106e2.C12591f;
import p106e2.ViewOnDragListenerC12586a;
import p108e4.AbstractC12667a;
import p114eb.C12982q;
import p161g.C14923z;
import p164g2.C15240l;
import p164g2.C15252x;
import p179h.C16347e;
import p208i2.AbstractC17876d;
import p208i2.C17881e1;
import p208i2.InterfaceC17915v;
import p270k2.InterfaceC22131e;
import p328mj.C25595b;
import p390p1.InterfaceC28593a1;
import p409q0.C29674b;
import p668z1.C39967p;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: b4.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C2696g extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10603w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f10604x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f10605y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f10606z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2696g(AbstractC2701l abstractC2701l, C0230n0 c0230n0, AbstractC2701l abstractC2701l2) {
        super(1);
        this.f10603w = 0;
        this.f10604x = abstractC2701l;
        this.f10606z = c0230n0;
        this.f10605y = abstractC2701l2;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        switch (this.f10603w) {
            case 0:
                AbstractC2701l abstractC2701l = (AbstractC2701l) this.f10604x;
                C0230n0 c0230n0 = (C0230n0) this.f10606z;
                AbstractC2701l abstractC2701l2 = (AbstractC2701l) this.f10605y;
                InterfaceC17915v interfaceC17915vM716w = ((InterfaceC22131e) obj).mo744t0().m716w();
                if (abstractC2701l.getView().getVisibility() != 8) {
                    abstractC2701l.f10640a0 = true;
                    Owner owner = c0230n0.f765M;
                    AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                    if (androidComposeView != null) {
                        Canvas canvasM51433a = AbstractC17876d.m51433a(interfaceC17915vM716w);
                        androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                        abstractC2701l2.draw(canvasM51433a);
                    }
                    abstractC2701l.f10640a0 = false;
                }
                return C23454a0.f92919a;
            case 1:
                AbstractC3730c1 abstractC3730c1 = (AbstractC3730c1) this.f10605y;
                AbstractC3736e1 abstractC3736e1 = (AbstractC3736e1) this.f10606z;
                int iOrdinal = ((EnumC3771q0) obj).ordinal();
                C17881e1 c17881e1 = null;
                if (iOrdinal == 0) {
                    C3757l1 c3757l1 = ((C3733d1) abstractC3730c1).f15271b.f15433d;
                    if (c3757l1 != null) {
                        c17881e1 = new C17881e1(c3757l1.f15354b);
                    } else {
                        C3757l1 c3757l2 = ((C3739f1) abstractC3736e1).f15302c.f15433d;
                        if (c3757l2 != null) {
                            c17881e1 = new C17881e1(c3757l2.f15354b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    c17881e1 = (C17881e1) this.f10604x;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C3757l1 c3757l3 = ((C3739f1) abstractC3736e1).f15302c.f15433d;
                    if (c3757l3 != null) {
                        c17881e1 = new C17881e1(c3757l3.f15354b);
                    } else {
                        C3757l1 c3757l4 = ((C3733d1) abstractC3730c1).f15271b.f15433d;
                        if (c3757l4 != null) {
                            c17881e1 = new C17881e1(c3757l4.f15354b);
                        }
                    }
                }
                return new C17881e1(c17881e1 != null ? c17881e1.f69568a : C17881e1.f69566b);
            case 2:
                InterfaceC0240p2 interfaceC0240p2 = (InterfaceC0240p2) obj;
                C12591f c12591f = (C12591f) interfaceC0240p2;
                if (!((ViewOnDragListenerC12586a) AbstractC0201g.m517q((C12591f) this.f10605y).getDragAndDropManager()).f42966b.contains(c12591f) || !AbstractC12667a.m35462n(c12591f, AbstractC20301a.m56305D((C12554k0) this.f10606z))) {
                    return EnumC0236o2.f807w;
                }
                ((C22669g0) this.f10604x).f89336w = interfaceC0240p2;
                return EnumC0236o2.f809y;
            case 3:
                C15252x c15252x = (C15252x) obj;
                if (AbstractC22676k.m65745e(c15252x, (C15252x) this.f10604x)) {
                    zBooleanValue = false;
                } else {
                    if (AbstractC22676k.m65745e(c15252x, ((C15240l) this.f10605y).f57241c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((AbstractC22680m) this.f10606z).invoke(c15252x)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 4:
                C39967p c39967p = (C39967p) this.f10604x;
                C12982q c12982q = (C12982q) this.f10605y;
                c39967p.add(c12982q);
                return new C15650k((C15656q) this.f10606z, c12982q, c39967p);
            case 5:
                C14923z c14923z = (C14923z) this.f10604x;
                InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) this.f10605y;
                C16347e c16347e = (C16347e) this.f10606z;
                c14923z.m43015a(interfaceC1585g0, c16347e);
                return new C2214e(c16347e, 5);
            case 6:
                QuickJSContext jsContext = (QuickJSContext) obj;
                AbstractC22676k.m65750j(jsContext, "jsContext");
                Object objEvaluate = jsContext.evaluate("globalThis.nudgeActions.determineAction(" + ((String) this.f10604x) + ", " + ((String) this.f10605y) + ", " + ((String) this.f10606z) + ')');
                QuickJSObject quickJSObject = objEvaluate instanceof QuickJSObject ? (QuickJSObject) objEvaluate : null;
                String strStringify = quickJSObject != null ? quickJSObject.stringify() : null;
                if (quickJSObject != null) {
                    quickJSObject.release();
                }
                return strStringify;
            default:
                AbstractC3006f0.m8732z((InterfaceC2994c0) this.f10604x, null, null, new C25595b((C29674b) this.f10605y, ((Number) obj).intValue(), (InterfaceC28593a1) this.f10606z, null, 0), 3);
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2696g(C15252x c15252x, C15240l c15240l, Function1 function1) {
        super(1);
        this.f10603w = 3;
        this.f10604x = c15252x;
        this.f10605y = c15240l;
        this.f10606z = (AbstractC22680m) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2696g(Object obj, Object obj2, Object obj3, int i13) {
        super(1);
        this.f10603w = i13;
        this.f10604x = obj;
        this.f10605y = obj2;
        this.f10606z = obj3;
    }
}
