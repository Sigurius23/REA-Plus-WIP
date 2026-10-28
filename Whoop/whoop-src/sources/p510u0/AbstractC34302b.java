package p510u0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import p026b2.C2299e;
import p026b2.C2314t;
import p133f1.AbstractC13994y0;
import p133f1.InterfaceC13957m;
import p163g1.C14950a3;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22953f;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p395p6.C28908p1;
import p602x1.AbstractC37817c;
import p698au1.C2061f;
import p715kotlin.jvm.functions.Function1;
import rq0.C31703x;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: u0.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34302b {

    /* JADX INFO: renamed from: a */
    public static final float f144050a;

    /* JADX INFO: renamed from: b */
    public static final float f144051b;

    static {
        float f13 = 25;
        f144050a = f13;
        f144051b = (f13 * 2.0f) / 2.4142137f;
    }

    /* JADX INFO: renamed from: a */
    public static final void m108610a(InterfaceC13957m interfaceC13957m, Modifier modifier, long j7, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1776202187);
        int i15 = (c28655q.m87153g(interfaceC13957m) ? 4 : 2) | i13 | (c28655q.m87153g(modifier) ? 32 : 16) | 128;
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                i14 = i15 & (-897);
                j7 = 9205357640488583168L;
            } else {
                c28655q.m87138X();
                i14 = i15 & (-897);
            }
            c28655q.m87175r();
            int i16 = i14 & 14;
            boolean z4 = i16 == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C31703x(interfaceC13957m, 22);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC13994y0.m39813b(interfaceC13957m, C2299e.f9115x, AbstractC37817c.m121344e(-1653527038, c28655q, new C14950a3(j7, AbstractC18032n.m51775c(modifier, false, (Function1) objM87133R), 1)), c28655q, i16 | 432);
        } else {
            c28655q.m87138X();
        }
        long j13 = j7;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28908p1(interfaceC13957m, modifier, j13, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m108611b(Modifier modifier, int i13, Composer composer, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(694251107);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            AbstractC22953f.m66715b(c28655q, AbstractC37056f.m118997u(AbstractC1102d.m3421r(modifier, f144051b, f144050a), C34299a.f144044x));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2061f(modifier, i13, i14);
        }
    }
}
