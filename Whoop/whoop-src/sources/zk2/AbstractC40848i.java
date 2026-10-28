package zk2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import lz0.AbstractC24821f;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p208i2.C17875c1;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import qz0.AbstractC30795n;
import tk2.C33885c;
import tk2.C33896n;
import wb3.AbstractC37056f;
import x81.C38072d;
import zi1.C40670c0;

/* JADX INFO: renamed from: zk2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Ltk2/n;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "e", "(Ltk2/n;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ltk2/c;", "c", "(Ltk2/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40848i {
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x01be  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x0238  */
    /* JADX WARN: Code duplicated, block: B:60:0x0243  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m132380c(C33885c state, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        C33896n progressBar;
        boolean z13;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1984328829);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(state) : c28655q2.m87157i(state) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                C2305k c2305k = C2299e.f9111N;
                C22957g c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                Modifier modifierM3399u = AbstractC1099a.m3399u(c2314t, EnumC22935a1.f90538x);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3399u);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                TextResource currentValue = state.getCurrentValue();
                int i17 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(currentValue, c28655q2, i17);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                List listM118959K = AbstractC37056f.m118959K(new C23465k(strM21274h, AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i18).getN2().getStyle(), c38072d.m121949b(c28655q2, i18).getBrandWhite(), c28655q2, 0)), new C23465k(AbstractC8693b.m21274h(state.getTargetSuffix(), c28655q2, i17), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i18).getN7().getStyle(), c38072d.m121949b(c28655q2, i18).getWhite70(), c28655q2, 0)));
                C2886a n13 = c38072d.m121952e(c28655q2, i18).getN1();
                int i19 = C2886a.f11498d;
                Modifier modifier5 = modifier4;
                AbstractC30795n.m94704e(listM118959K, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, n13, c28655q2, 0, (i19 << 21) | 3072, 122878);
                progressBar = state.getProgressBar();
                if (progressBar == null) {
                    c28655q2.m87150e0(-2109893378);
                    c28655q2.m87173q(false);
                    z13 = true;
                } else {
                    c28655q2.m87150e0(-2109893377);
                    float f13 = ((float) 1.5d) * 8;
                    z13 = true;
                    m132382e(progressBar, AbstractC1099a.m3396r(c2314t, 0.0f, f13, 1), c28655q2, 48, 0);
                    AbstractC30007c.m91851u(c2314t, f13, c28655q2, false);
                }
                boolean z14 = z13;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getLabel(), c28655q2, i17), null, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getT4(), null, c28655q2, 0, i19 << 18, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(z14);
                c28655q.m87173q(z14);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40670c0(state, i13, modifier3, i14, 1);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            C2305k c2305k2 = C2299e.f9111N;
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            Modifier modifierM3399u2 = AbstractC1099a.m3399u(c2314t, EnumC22935a1.f90538x);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 48);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3399u2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            TextResource currentValue2 = state.getCurrentValue();
            int i110 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(currentValue2, c28655q2, i110);
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            List listM118959K2 = AbstractC37056f.m118959K(new C23465k(strM21274h2, AbstractC2890e.m8451f(c38072d2.m121952e(c28655q2, i111).getN2().getStyle(), c38072d2.m121949b(c28655q2, i111).getBrandWhite(), c28655q2, 0)), new C23465k(AbstractC8693b.m21274h(state.getTargetSuffix(), c28655q2, i110), AbstractC2890e.m8451f(c38072d2.m121952e(c28655q2, i111).getN7().getStyle(), c38072d2.m121949b(c28655q2, i111).getWhite70(), c28655q2, 0)));
            C2886a n14 = c38072d2.m121952e(c28655q2, i111).getN1();
            int i112 = C2886a.f11498d;
            Modifier modifier6 = modifier4;
            AbstractC30795n.m94704e(listM118959K2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, n14, c28655q2, 0, (i112 << 21) | 3072, 122878);
            progressBar = state.getProgressBar();
            if (progressBar == null) {
                c28655q2.m87150e0(-2109893378);
                c28655q2.m87173q(false);
                z13 = true;
            } else {
                c28655q2.m87150e0(-2109893377);
                float f14 = ((float) 1.5d) * 8;
                z13 = true;
                m132382e(progressBar, AbstractC1099a.m3396r(c2314t, 0.0f, f14, 1), c28655q2, 48, 0);
                AbstractC30007c.m91851u(c2314t, f14, c28655q2, false);
            }
            boolean z15 = z13;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getLabel(), c28655q2, i110), null, c38072d2.m121949b(c28655q2, i111).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i111).getT4(), null, c28655q2, 0, i112 << 18, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(z15);
            c28655q.m87173q(z15);
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40670c0(state, i13, modifier3, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m132381d(C33885c c33885c, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m132380c(c33885c, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m132382e(C33896n state, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1422818506);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier3 = modifier;
            AbstractC24821f.m72736b(modifier3, state.getCurrentProgress(), state.getTotalSteps(), new C17875c1(state.getFillColorKey().mo134584toComposableColorWaAFU9c(c28655q, 0)), C17919x.m51541c(state.getUnfilledAlpha(), state.getUnfilledColorKey().mo134584toComposableColorWaAFU9c(c28655q, 0)), state.getAddBorders(), state.getHeightDp() * 4, c28655q, (i15 >> 3) & 14, 0);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40670c0(state, i13, modifier2, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m132383f(C33896n c33896n, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m132382e(c33896n, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
