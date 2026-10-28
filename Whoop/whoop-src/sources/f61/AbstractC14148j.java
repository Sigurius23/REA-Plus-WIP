package f61;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import d61.InterfaceC11732a;
import e61.AbstractC12765h;
import e61.AbstractC12766i;
import g61.C15529b;
import g61.EnumC15531d;
import j61.C21374h;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p133f1.C13921a0;
import p181h2.C16618c;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p699b70.C2775a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f61.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14148j {
    /* JADX INFO: renamed from: c */
    public static final void m40319c(Modifier modifier, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1844487952);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            C21374h c21374hM35763s = AbstractC12766i.m35763s("Graph plane offset axes", false, false, false, false, 28, null);
            C15529b startVerticalAxis = c21374hM35763s.getStartVerticalAxis();
            if (startVerticalAxis == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C15529b endVerticalAxis = c21374hM35763s.getEndVerticalAxis();
            if (endVerticalAxis == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(InterfaceC11732a.b.f37977a);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            EnumC15531d enumC15531d = EnumC15531d.TIME_MARKER;
            C21374h c21374hM59985a = c21374hM35763s.m59985a((8187 & 1) != 0 ? c21374hM35763s.startVerticalAxis : C15529b.m43718b(startVerticalAxis, 0.0f, null, 0.05f, enumC15531d, null, false, null, null, 243, null), (8187 & 2) != 0 ? c21374hM35763s.endVerticalAxis : C15529b.m43718b(endVerticalAxis, 0.0f, null, 0.05f, enumC15531d, null, false, null, null, 243, null), (8187 & 4) != 0 ? c21374hM35763s.bottomHorizontalAxis : null, (8187 & 8) != 0 ? c21374hM35763s.topHorizontalAxis : null, (8187 & 16) != 0 ? c21374hM35763s.insets : new C16618c(0.0f, 0.025f, 0.0f, 0.04f), (8187 & 32) != 0 ? c21374hM35763s.lines : null, (8187 & 64) != 0 ? c21374hM35763s.graphAnnotations : null, (8187 & 128) != 0 ? c21374hM35763s.accessibilityState : null, (8187 & 256) != 0 ? c21374hM35763s.scrubberEnabled : false, (8187 & 512) != 0 ? c21374hM35763s.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c21374hM35763s.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c21374hM35763s.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? c21374hM35763s.horizontalGridLinePadding : 0.0f);
            InterfaceC11732a interfaceC11732a = (InterfaceC11732a) interfaceC28601c1.getValue();
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C13921a0(1, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC12765h.m35733o(modifier3, c21374hM59985a, null, null, null, null, null, interfaceC11732a, (Function1) objM87133R2, null, null, null, null, c28655q, (i15 & 14) | 100663296, 0, 7804);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 9, modifier3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m40320d(InterfaceC28601c1 interfaceC28601c1, InterfaceC11732a it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC28601c1.setValue(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m40321e(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m40319c(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
