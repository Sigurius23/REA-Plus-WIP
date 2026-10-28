package w61;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15676d;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p739ui0.C35015q;
import qz0.AbstractC30795n;
import t80.C33592b;
import v61.C35736a;
import w01.C36680e;
import x81.C38072d;
import y61.C39260a;

/* JADX INFO: renamed from: w61.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Ly61/a;", "group", "Lkotlin/Function1;", "Lv61/a;", "Ll83/a0;", "onCtaClicked", "d", "(Ly61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36863c {
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x0141  */
    /* JADX WARN: Code duplicated, block: B:50:0x014c  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m118231d(C39260a group, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87157i;
        Object objM87133R;
        Function1 function5;
        Object objM87133R2;
        AbstractC22676k.m65750j(group, "group");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1536483554);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87157i(group) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C36680e(18);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (group.getTopText() == null) {
                    c28655q2.m87150e0(1915245129);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                    function5 = function4;
                } else {
                    c28655q2.m87150e0(1915245130);
                    Modifier modifierM44101d = AbstractC15676d.m44101d(C2314t.f9131w, AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{"GraphOverlayLabel", group.getCta()}), "_", null, null, null, 62));
                    zM87157i = c28655q2.m87157i(group) | ((i15 & 112) == 32);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C35015q(group, function4, 23);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function5 = function4;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(group.getTopText().getLabel(), c28655q2, 0), AbstractC1092a.m3362g(modifierM44101d, false, null, null, (InterfaceC4339a) objM87133R, 15), group.getTopText().getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 1, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN6(), null, c28655q2, 0, 3120, 185848);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                function3 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33592b(group, i13, function3, i14, 24);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C36680e(18);
                    c28655q2.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            if (group.getTopText() == null) {
                c28655q2.m87150e0(1915245129);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                function5 = function4;
            } else {
                c28655q2.m87150e0(1915245130);
                Modifier modifierM44101d2 = AbstractC15676d.m44101d(C2314t.f9131w, AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{"GraphOverlayLabel", group.getCta()}), "_", null, null, null, 62));
                zM87157i = c28655q2.m87157i(group) | ((i15 & 112) == 32);
                objM87133R = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R = new C35015q(group, function4, 23);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C35015q(group, function4, 23);
                    c28655q2.m87172p0(objM87133R);
                }
                function5 = function4;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(group.getTopText().getLabel(), c28655q2, 0), AbstractC1092a.m3362g(modifierM44101d2, false, null, null, (InterfaceC4339a) objM87133R, 15), group.getTopText().getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 1, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN6(), null, c28655q2, 0, 3120, 185848);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            function3 = function5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(group, i13, function3, i14, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m118232e(C35736a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m118233f(C39260a c39260a, Function1 function1) {
        String cta = c39260a.getCta();
        if (cta != null) {
            function1.invoke(new C35736a(cta, c39260a.getActivityId(), c39260a.m125042g()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m118234g(C39260a c39260a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m118231d(c39260a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
