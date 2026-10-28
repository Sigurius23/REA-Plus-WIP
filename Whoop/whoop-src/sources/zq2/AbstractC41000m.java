package zq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import er2.AbstractC13583e;
import er2.EnumC13585g;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import zq0.C40955a;

/* JADX INFO: renamed from: zq2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Ll0/y;", "Lkd1/o;", "avatar", "Ler2/g;", "chatType", "Lzq2/a;", "userSelectedAnswer", "Ll83/a0;", "b", "(Ll0/y;Lkd1/o;Ler2/g;Lzq2/a;Landroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41000m {
    /* JADX INFO: renamed from: b */
    public static final void m133207b(InterfaceC23013y interfaceC23013y, AbstractC22403o abstractC22403o, EnumC13585g chatType, C40988a c40988a, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        TextResource textResourceM21267a;
        boolean z4;
        long brandBlack;
        C2306l c2306l = C2299e.f9108K;
        AbstractC22676k.m65750j(interfaceC23013y, "<this>");
        AbstractC22676k.m65750j(chatType, "chatType");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1758406561);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(interfaceC23013y) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(abstractC22403o) : c28655q2.m87157i(abstractC22403o) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87149e(chatType.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q2.m87153g(c40988a) : c28655q2.m87157i(c40988a) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            boolean z13 = abstractC22403o != null;
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM66778b = ((C23016z) interfaceC23013y).m66778b(AbstractC1099a.m3397s(AbstractC13583e.m38343m(c2314t, chatType, true), f14, (z13 ? 1 : (float) 1.25d) * f13, z13 ? 1 * f13 : f14, (z13 ? 1 : (float) 1.25d) * f13), C2299e.f9112O);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66778b);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            Modifier modifierMo3471e = z13 ? AbstractC1102d.m3425v(c2314t, 0.0f, ((float) 58.5d) * 4, 1).mo3471e(new VerticalAlignElement(c2306l)) : new VerticalAlignElement(c2306l);
            if (c40988a == null || (textResourceM21267a = c40988a.getAnswer()) == null) {
                textResourceM21267a = AbstractC8693b.m21267a();
            }
            String strM21274h = AbstractC8693b.m21274h(textResourceM21267a, c28655q2, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a t14 = c38072d.m121952e(c28655q2, i15).getT3();
            if (chatType == EnumC13585g.STRAIN) {
                brandBlack = AbstractC25012a.m73366B(c28655q2, -883692467, c38072d, c28655q2, i15);
                z4 = false;
            } else {
                z4 = false;
                c28655q2.m87150e0(-883691379);
                brandBlack = c38072d.m121949b(c28655q2, i15).getBrandBlack();
            }
            c28655q2.m87173q(z4);
            boolean z14 = true;
            AbstractC30795n.m94707h(strM21274h, modifierMo3471e, brandBlack, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q2, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q2;
            if (!z13 || abstractC22403o == null) {
                c28655q.m87150e0(-1624213633);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(-1624538761);
                z14 = true;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | ((i14 >> 3) & 14), 3), null, AbstractC37056f.m118994r(AbstractC1102d.m3419p(6 * 4, AbstractC1099a.m3398t(c2314t, ((float) 1.5d) * f13, 0.0f, 0.0f, 0.0f, 14)).mo3471e(new VerticalAlignElement(C2299e.f9109L)), AbstractC33253j.f138651a), null, null, 0.0f, null, c28655q, 48, 120);
                c28655q = c28655q;
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(z14);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40955a(interfaceC23013y, abstractC22403o, chatType, c40988a, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m133208c(InterfaceC23013y interfaceC23013y, AbstractC22403o abstractC22403o, EnumC13585g enumC13585g, C40988a c40988a, int i13, Composer composer, int i14) {
        m133207b(interfaceC23013y, abstractC22403o, enumC13585g, c40988a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
