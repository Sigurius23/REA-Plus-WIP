package p730qt2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bm0.C3412o;
import c41.C4014e1;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p026b2.C2314t;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: qt2.p */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"", "Ly81/f;", "barStyles", "Ll83/a0;", "c", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30610p {
    /* JADX INFO: renamed from: c */
    public static final void m93941c(List<? extends EnumC39333f> barStyles, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(barStyles, "barStyles");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1848786653);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(barStyles) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87150e0(-1432484997);
            List<? extends EnumC39333f> list = barStyles;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C17919x(((EnumC39333f) it.next()).mo134584toComposableColorWaAFU9c(c28655q, 0)));
            }
            c28655q.m87173q(false);
            Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3424u(62, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, 4, 7)), null, 3);
            boolean zM87157i = c28655q.m87157i(arrayList);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C4014e1(arrayList, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3427x, (Function1) objM87133R, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(barStyles, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m93942d(List list, InterfaceC22131e interfaceC22131e) {
        InterfaceC22131e Canvas = interfaceC22131e;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float fMo743q0 = Canvas.mo743q0(5 * 4);
        float fMo743q1 = Canvas.mo743q0((float) 4.2d);
        float fMo743q2 = Canvas.mo743q0(2);
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            long j7 = ((C17919x) obj).f69639a;
            float fMo743q3 = Canvas.mo743q0(((float) 0.14d) * 8);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMo743q3)) & 4294967295L) | (Float.floatToRawIntBits(fMo743q3) << 32);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q1)) & 4294967295L);
            float f13 = i13;
            Canvas = interfaceC22131e;
            InterfaceC22131e.m63374D(Canvas, j7, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits((f13 * fMo743q2) + (f13 * fMo743q0)) << 32), jFloatToRawIntBits2, jFloatToRawIntBits, null, 0.0f, 240);
            i13 = i14;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m93943e(List list, int i13, Composer composer, int i14) {
        m93941c(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
