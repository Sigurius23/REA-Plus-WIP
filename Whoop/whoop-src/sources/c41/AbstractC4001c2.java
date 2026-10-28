package c41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aw0.C2108h;
import b30.C2549j2;
import bf0.C3189a;
import c31.C3929m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p698au1.C2061f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.c2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ac\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a9\u0010\u0015\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"", "dataAvailable", "", "icon", "Lcom/whoop/design/util/TextResource;", "metricText", "rangeText", "Lc41/f2;", "type", "Li2/x;", "backgroundColor", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "k", "(ZILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/f2;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "g", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "i", "(Lc41/f2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IZLandroidx/compose/runtime/Composer;I)V", "Ll83/k;", "p", "(Lc41/f2;Landroidx/compose/runtime/Composer;I)Ll83/k;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4001c2 {

    /* JADX INFO: renamed from: c41.c2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16275a;

        static {
            int[] iArr = new int[EnumC4022f2.values().length];
            try {
                iArr[EnumC4022f2.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4022f2.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4022f2.ALERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4022f2.NO_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16275a = iArr;
        }
    }

    /* JADX INFO: renamed from: g */
    private static final void m12133g(Modifier modifier, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-603569349);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 4;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f13), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f13, C2314t.f9131w);
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getDiagnosticData(), c28655q, 6), null, modifierM3419p, c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62226D0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2061f(modifier, i13, 2, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m12134h(Modifier modifier, int i13, Composer composer, int i14) {
        m12133g(modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m12135i(EnumC4022f2 enumC4022f2, TextResource textResource, TextResource textResource2, int i13, boolean z4, Composer composer, int i14) {
        int i15;
        C2314t c2314t;
        int i16;
        int i17 = i13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1185557506);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(enumC4022f2.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87153g(textResource) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(textResource2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87149e(i17) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            C23465k c23465kM12142p = m12142p(enumC4022f2, c28655q, i15 & 14);
            long j7 = ((C17919x) c23465kM12142p.f92937w).f69639a;
            long j13 = ((C17919x) c23465kM12142p.f92938x).f69639a;
            float f13 = 4;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f13), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            int i18 = i15;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3399u = AbstractC1099a.m3399u(c2314t2, EnumC22935a1.f90538x);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3399u);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, (i18 >> 3) & 14);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, modifierM3409f, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH6(), null, c28655q, 48, 0, 196088);
            c28655q = c28655q;
            if (textResource2 == null) {
                c28655q.m87150e0(-289003506);
                c28655q.m87173q(false);
                c2314t = c2314t2;
                i16 = 6;
            } else {
                c28655q.m87150e0(-289003505);
                c2314t = c2314t2;
                i16 = 6;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, (i18 >> 6) & 14), AbstractC1102d.m3409f(1.0f, c2314t2), j7, 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH6(), null, c28655q, 48, 0, 196088);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (z4) {
                c28655q.m87150e0(2037284234);
                C2314t c2314t3 = c2314t;
                Modifier modifierM95629e = AbstractC31061c.m95629e(AbstractC1102d.m3419p(i16 * f13, c2314t3), (float) 0.5d, f13, j13);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM95629e);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                i17 = i13;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i17, c28655q, i16 | ((i18 >> 6) & 112)), null, AbstractC1102d.m3419p(((float) 2.5d) * f13, c2314t3), j7, c28655q, 432, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                i17 = i13;
                c28655q.m87150e0(2037770500);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(enumC4022f2, textResource, textResource2, i17, z4, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m12136j(EnumC4022f2 enumC4022f2, TextResource textResource, TextResource textResource2, int i13, boolean z4, int i14, Composer composer, int i15) {
        m12135i(enumC4022f2, textResource, textResource2, i13, z4, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0112  */
    /* JADX WARN: Code duplicated, block: B:103:0x0116  */
    /* JADX WARN: Code duplicated, block: B:106:0x011d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0126  */
    /* JADX WARN: Code duplicated, block: B:110:0x012a  */
    /* JADX WARN: Code duplicated, block: B:111:0x012d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0133  */
    /* JADX WARN: Code duplicated, block: B:115:0x0142  */
    /* JADX WARN: Code duplicated, block: B:117:0x0145  */
    /* JADX WARN: Code duplicated, block: B:119:0x014d  */
    /* JADX WARN: Code duplicated, block: B:123:0x019f  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:83:0x00de  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x010f A[DONT_INVERT] */
    /* JADX INFO: renamed from: k */
    public static final void m12137k(boolean z4, int i13, TextResource textResource, TextResource textResource2, EnumC4022f2 enumC4022f2, long j7, Function1 function1, Composer composer, final int i14, final int i15) {
        boolean z13;
        int i16;
        int i17;
        TextResource textResourceM21267a;
        int i18;
        TextResource textResource3;
        int i19;
        int i24;
        int iOrdinal;
        int i25;
        long j13;
        int i26;
        Function1 function2;
        int i27;
        boolean z14;
        C28655q c28655q;
        final boolean z15;
        final int i28;
        final TextResource textResource4;
        final TextResource textResource5;
        final long j14;
        final Function1 function3;
        final EnumC4022f2 enumC4022f3;
        C28677v1 c28677v1M87180u;
        boolean z16;
        EnumC4022f2 enumC4022f4;
        long jM125370W0;
        long j15;
        Object objM87133R;
        int i29;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1282692960);
        int i34 = i15 & 1;
        if (i34 != 0) {
            i16 = i14 | 6;
            z13 = z4;
        } else if ((i14 & 6) == 0) {
            z13 = z4;
            i16 = (c28655q2.m87155h(z13) ? 4 : 2) | i14;
        } else {
            z13 = z4;
            i16 = i14;
        }
        int i35 = i15 & 2;
        if (i35 == 0) {
            if ((i14 & 48) == 0) {
                i17 = i13;
                i16 |= c28655q2.m87149e(i17) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if ((i15 & 4) == 0) {
                    textResourceM21267a = textResource;
                    int i36 = c28655q2.m87153g(textResourceM21267a) ? 256 : 128;
                    i16 |= i36;
                } else {
                    textResourceM21267a = textResource;
                }
                i16 |= i36;
            } else {
                textResourceM21267a = textResource;
            }
            i18 = i15 & 8;
            if (i18 != 0) {
                if ((i14 & 3072) == 0) {
                    textResource3 = textResource2;
                    if (c28655q2.m87153g(textResource3)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i16 |= i19;
                }
                i24 = i15 & 16;
                if (i24 != 0) {
                    i16 |= 24576;
                } else if ((i14 & 24576) == 0) {
                    if (enumC4022f2 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC4022f2.ordinal();
                    }
                    if (c28655q2.m87149e(iOrdinal)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i25;
                }
                if ((196608 & i14) == 0) {
                    if ((i15 & 32) == 0) {
                        j13 = j7;
                        if (c28655q2.m87151f(j13)) {
                            i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        }
                        i16 |= i29;
                    } else {
                        j13 = j7;
                    }
                    i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    i16 |= i29;
                } else {
                    j13 = j7;
                }
                i26 = i15 & 64;
                if (i26 != 0) {
                    if ((1572864 & i14) == 0) {
                        function2 = function1;
                        if (c28655q2.m87157i(function2)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i16 |= i27;
                    }
                    if ((599187 & i16) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i16 & 1, z14)) {
                        c28655q2.m87140Z();
                        if ((i14 & 1) != 0 || c28655q2.m87118C()) {
                            z16 = i34 == 0 ? z13 : true;
                            if (i35 != 0) {
                                i17 = Integer.MIN_VALUE;
                            }
                            if ((i15 & 4) != 0) {
                                i16 &= -897;
                                textResourceM21267a = AbstractC8693b.m21267a();
                            }
                            if (i18 != 0) {
                                textResource3 = null;
                            }
                            if (i24 != 0) {
                                enumC4022f4 = EnumC4022f2.POSITIVE;
                            } else {
                                enumC4022f4 = enumC4022f2;
                            }
                            if ((i15 & 32) != 0) {
                                jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                                i16 &= -458753;
                            } else {
                                jM125370W0 = j13;
                            }
                            if (i26 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == C28635l.f115821a) {
                                    objM87133R = new C3929m(12);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                function2 = (Function1) objM87133R;
                            }
                            j15 = jM125370W0;
                        } else {
                            c28655q2.m87138X();
                            if ((i15 & 4) != 0) {
                                i16 &= -897;
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                            }
                            enumC4022f4 = enumC4022f2;
                            z16 = z13;
                            j15 = j13;
                        }
                        c28655q2.m87175r();
                        Function1 function4 = function2;
                        boolean z17 = z16;
                        c28655q = c28655q2;
                        AbstractC31926e.m99375j(null, null, j15, null, null, null, 0.0f, AbstractC37817c.m121344e(-2087492144, c28655q2, new C2549j2(function4, enumC4022f4, textResourceM21267a, textResource3, i17, z17)), c28655q, ((i16 >> 9) & 896) | 12582912, 123);
                        int i37 = i17;
                        enumC4022f3 = enumC4022f4;
                        z15 = z17;
                        i28 = i37;
                        TextResource textResource6 = textResource3;
                        function3 = function4;
                        textResource5 = textResource6;
                        textResource4 = textResourceM21267a;
                        j14 = j15;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z15 = z13;
                        i28 = i17;
                        textResource4 = textResourceM21267a;
                        textResource5 = textResource3;
                        j14 = j13;
                        function3 = function2;
                        enumC4022f3 = enumC4022f2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.b2
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC4001c2.m12141o(z15, i28, textResource4, textResource5, enumC4022f3, j14, function3, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 1572864;
                function2 = function1;
                if ((599187 & i16) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i16 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i14 & 1) != 0) {
                        if (i34 == 0) {
                        }
                        if (i35 != 0) {
                            i17 = Integer.MIN_VALUE;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        if (i18 != 0) {
                            textResource3 = null;
                        }
                        if (i24 != 0) {
                            enumC4022f4 = EnumC4022f2.POSITIVE;
                        } else {
                            enumC4022f4 = enumC4022f2;
                        }
                        if ((i15 & 32) != 0) {
                            jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                            i16 &= -458753;
                        } else {
                            jM125370W0 = j13;
                        }
                        if (i26 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C3929m(12);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function2 = (Function1) objM87133R;
                        }
                        j15 = jM125370W0;
                    } else {
                        if (i34 == 0) {
                        }
                        if (i35 != 0) {
                            i17 = Integer.MIN_VALUE;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        if (i18 != 0) {
                            textResource3 = null;
                        }
                        if (i24 != 0) {
                            enumC4022f4 = EnumC4022f2.POSITIVE;
                        } else {
                            enumC4022f4 = enumC4022f2;
                        }
                        if ((i15 & 32) != 0) {
                            jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                            i16 &= -458753;
                        } else {
                            jM125370W0 = j13;
                        }
                        if (i26 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C3929m(12);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function2 = (Function1) objM87133R;
                        }
                        j15 = jM125370W0;
                    }
                    c28655q2.m87175r();
                    Function1 function5 = function2;
                    boolean z18 = z16;
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(null, null, j15, null, null, null, 0.0f, AbstractC37817c.m121344e(-2087492144, c28655q2, new C2549j2(function5, enumC4022f4, textResourceM21267a, textResource3, i17, z18)), c28655q, ((i16 >> 9) & 896) | 12582912, 123);
                    int i38 = i17;
                    enumC4022f3 = enumC4022f4;
                    z15 = z18;
                    i28 = i38;
                    TextResource textResource7 = textResource3;
                    function3 = function5;
                    textResource5 = textResource7;
                    textResource4 = textResourceM21267a;
                    j14 = j15;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z15 = z13;
                    i28 = i17;
                    textResource4 = textResourceM21267a;
                    textResource5 = textResource3;
                    j14 = j13;
                    function3 = function2;
                    enumC4022f3 = enumC4022f2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.b2
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4001c2.m12141o(z15, i28, textResource4, textResource5, enumC4022f3, j14, function3, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 3072;
            textResource3 = textResource2;
            i24 = i15 & 16;
            if (i24 != 0) {
                i16 |= 24576;
            } else if ((i14 & 24576) == 0) {
                if (enumC4022f2 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC4022f2.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i25;
            }
            if ((196608 & i14) == 0) {
                if ((i15 & 32) == 0) {
                    j13 = j7;
                    if (c28655q2.m87151f(j13)) {
                        i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i16 |= i29;
                } else {
                    j13 = j7;
                }
                i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                i16 |= i29;
            } else {
                j13 = j7;
            }
            i26 = i15 & 64;
            if (i26 != 0) {
                if ((1572864 & i14) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i16 |= i27;
                }
                if ((599187 & i16) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i16 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i14 & 1) != 0) {
                        if (i34 == 0) {
                        }
                        if (i35 != 0) {
                            i17 = Integer.MIN_VALUE;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        if (i18 != 0) {
                            textResource3 = null;
                        }
                        if (i24 != 0) {
                            enumC4022f4 = EnumC4022f2.POSITIVE;
                        } else {
                            enumC4022f4 = enumC4022f2;
                        }
                        if ((i15 & 32) != 0) {
                            jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                            i16 &= -458753;
                        } else {
                            jM125370W0 = j13;
                        }
                        if (i26 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C3929m(12);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function2 = (Function1) objM87133R;
                        }
                        j15 = jM125370W0;
                    } else {
                        if (i34 == 0) {
                        }
                        if (i35 != 0) {
                            i17 = Integer.MIN_VALUE;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        if (i18 != 0) {
                            textResource3 = null;
                        }
                        if (i24 != 0) {
                            enumC4022f4 = EnumC4022f2.POSITIVE;
                        } else {
                            enumC4022f4 = enumC4022f2;
                        }
                        if ((i15 & 32) != 0) {
                            jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                            i16 &= -458753;
                        } else {
                            jM125370W0 = j13;
                        }
                        if (i26 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C3929m(12);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function2 = (Function1) objM87133R;
                        }
                        j15 = jM125370W0;
                    }
                    c28655q2.m87175r();
                    Function1 function6 = function2;
                    boolean z19 = z16;
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(null, null, j15, null, null, null, 0.0f, AbstractC37817c.m121344e(-2087492144, c28655q2, new C2549j2(function6, enumC4022f4, textResourceM21267a, textResource3, i17, z19)), c28655q, ((i16 >> 9) & 896) | 12582912, 123);
                    int i39 = i17;
                    enumC4022f3 = enumC4022f4;
                    z15 = z19;
                    i28 = i39;
                    TextResource textResource8 = textResource3;
                    function3 = function6;
                    textResource5 = textResource8;
                    textResource4 = textResourceM21267a;
                    j14 = j15;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z15 = z13;
                    i28 = i17;
                    textResource4 = textResourceM21267a;
                    textResource5 = textResource3;
                    j14 = j13;
                    function3 = function2;
                    enumC4022f3 = enumC4022f2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.b2
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4001c2.m12141o(z15, i28, textResource4, textResource5, enumC4022f3, j14, function3, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 1572864;
            function2 = function1;
            if ((599187 & i16) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z14)) {
                c28655q2.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i34 == 0) {
                    }
                    if (i35 != 0) {
                        i17 = Integer.MIN_VALUE;
                    }
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i18 != 0) {
                        textResource3 = null;
                    }
                    if (i24 != 0) {
                        enumC4022f4 = EnumC4022f2.POSITIVE;
                    } else {
                        enumC4022f4 = enumC4022f2;
                    }
                    if ((i15 & 32) != 0) {
                        jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i16 &= -458753;
                    } else {
                        jM125370W0 = j13;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C3929m(12);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                    }
                    j15 = jM125370W0;
                } else {
                    if (i34 == 0) {
                    }
                    if (i35 != 0) {
                        i17 = Integer.MIN_VALUE;
                    }
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i18 != 0) {
                        textResource3 = null;
                    }
                    if (i24 != 0) {
                        enumC4022f4 = EnumC4022f2.POSITIVE;
                    } else {
                        enumC4022f4 = enumC4022f2;
                    }
                    if ((i15 & 32) != 0) {
                        jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i16 &= -458753;
                    } else {
                        jM125370W0 = j13;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C3929m(12);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                    }
                    j15 = jM125370W0;
                }
                c28655q2.m87175r();
                Function1 function7 = function2;
                boolean z110 = z16;
                c28655q = c28655q2;
                AbstractC31926e.m99375j(null, null, j15, null, null, null, 0.0f, AbstractC37817c.m121344e(-2087492144, c28655q2, new C2549j2(function7, enumC4022f4, textResourceM21267a, textResource3, i17, z110)), c28655q, ((i16 >> 9) & 896) | 12582912, 123);
                int i310 = i17;
                enumC4022f3 = enumC4022f4;
                z15 = z110;
                i28 = i310;
                TextResource textResource9 = textResource3;
                function3 = function7;
                textResource5 = textResource9;
                textResource4 = textResourceM21267a;
                j14 = j15;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z15 = z13;
                i28 = i17;
                textResource4 = textResourceM21267a;
                textResource5 = textResource3;
                j14 = j13;
                function3 = function2;
                enumC4022f3 = enumC4022f2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.b2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4001c2.m12141o(z15, i28, textResource4, textResource5, enumC4022f3, j14, function3, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 48;
        i17 = i13;
        if ((i14 & 384) == 0) {
            if ((i15 & 4) == 0) {
                textResourceM21267a = textResource;
                if (c28655q2.m87153g(textResourceM21267a)) {
                }
                i16 |= i36;
            } else {
                textResourceM21267a = textResource;
            }
            i16 |= i36;
        } else {
            textResourceM21267a = textResource;
        }
        i18 = i15 & 8;
        if (i18 != 0) {
            if ((i14 & 3072) == 0) {
                textResource3 = textResource2;
                if (c28655q2.m87153g(textResource3)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i19;
            }
            i24 = i15 & 16;
            if (i24 != 0) {
                i16 |= 24576;
            } else if ((i14 & 24576) == 0) {
                if (enumC4022f2 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC4022f2.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i25;
            }
            if ((196608 & i14) == 0) {
                if ((i15 & 32) == 0) {
                    j13 = j7;
                    if (c28655q2.m87151f(j13)) {
                        i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i16 |= i29;
                } else {
                    j13 = j7;
                }
                i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                i16 |= i29;
            } else {
                j13 = j7;
            }
            i26 = i15 & 64;
            if (i26 != 0) {
                if ((1572864 & i14) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i16 |= i27;
                }
                if ((599187 & i16) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i16 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i14 & 1) != 0) {
                        if (i34 == 0) {
                        }
                        if (i35 != 0) {
                            i17 = Integer.MIN_VALUE;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        if (i18 != 0) {
                            textResource3 = null;
                        }
                        if (i24 != 0) {
                            enumC4022f4 = EnumC4022f2.POSITIVE;
                        } else {
                            enumC4022f4 = enumC4022f2;
                        }
                        if ((i15 & 32) != 0) {
                            jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                            i16 &= -458753;
                        } else {
                            jM125370W0 = j13;
                        }
                        if (i26 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C3929m(12);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function2 = (Function1) objM87133R;
                        }
                        j15 = jM125370W0;
                    } else {
                        if (i34 == 0) {
                        }
                        if (i35 != 0) {
                            i17 = Integer.MIN_VALUE;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        if (i18 != 0) {
                            textResource3 = null;
                        }
                        if (i24 != 0) {
                            enumC4022f4 = EnumC4022f2.POSITIVE;
                        } else {
                            enumC4022f4 = enumC4022f2;
                        }
                        if ((i15 & 32) != 0) {
                            jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                            i16 &= -458753;
                        } else {
                            jM125370W0 = j13;
                        }
                        if (i26 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C3929m(12);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function2 = (Function1) objM87133R;
                        }
                        j15 = jM125370W0;
                    }
                    c28655q2.m87175r();
                    Function1 function8 = function2;
                    boolean z111 = z16;
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(null, null, j15, null, null, null, 0.0f, AbstractC37817c.m121344e(-2087492144, c28655q2, new C2549j2(function8, enumC4022f4, textResourceM21267a, textResource3, i17, z111)), c28655q, ((i16 >> 9) & 896) | 12582912, 123);
                    int i311 = i17;
                    enumC4022f3 = enumC4022f4;
                    z15 = z111;
                    i28 = i311;
                    TextResource textResource10 = textResource3;
                    function3 = function8;
                    textResource5 = textResource10;
                    textResource4 = textResourceM21267a;
                    j14 = j15;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z15 = z13;
                    i28 = i17;
                    textResource4 = textResourceM21267a;
                    textResource5 = textResource3;
                    j14 = j13;
                    function3 = function2;
                    enumC4022f3 = enumC4022f2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.b2
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4001c2.m12141o(z15, i28, textResource4, textResource5, enumC4022f3, j14, function3, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 1572864;
            function2 = function1;
            if ((599187 & i16) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z14)) {
                c28655q2.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i34 == 0) {
                    }
                    if (i35 != 0) {
                        i17 = Integer.MIN_VALUE;
                    }
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i18 != 0) {
                        textResource3 = null;
                    }
                    if (i24 != 0) {
                        enumC4022f4 = EnumC4022f2.POSITIVE;
                    } else {
                        enumC4022f4 = enumC4022f2;
                    }
                    if ((i15 & 32) != 0) {
                        jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i16 &= -458753;
                    } else {
                        jM125370W0 = j13;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C3929m(12);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                    }
                    j15 = jM125370W0;
                } else {
                    if (i34 == 0) {
                    }
                    if (i35 != 0) {
                        i17 = Integer.MIN_VALUE;
                    }
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i18 != 0) {
                        textResource3 = null;
                    }
                    if (i24 != 0) {
                        enumC4022f4 = EnumC4022f2.POSITIVE;
                    } else {
                        enumC4022f4 = enumC4022f2;
                    }
                    if ((i15 & 32) != 0) {
                        jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i16 &= -458753;
                    } else {
                        jM125370W0 = j13;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C3929m(12);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                    }
                    j15 = jM125370W0;
                }
                c28655q2.m87175r();
                Function1 function9 = function2;
                boolean z112 = z16;
                c28655q = c28655q2;
                AbstractC31926e.m99375j(null, null, j15, null, null, null, 0.0f, AbstractC37817c.m121344e(-2087492144, c28655q2, new C2549j2(function9, enumC4022f4, textResourceM21267a, textResource3, i17, z112)), c28655q, ((i16 >> 9) & 896) | 12582912, 123);
                int i312 = i17;
                enumC4022f3 = enumC4022f4;
                z15 = z112;
                i28 = i312;
                TextResource textResource11 = textResource3;
                function3 = function9;
                textResource5 = textResource11;
                textResource4 = textResourceM21267a;
                j14 = j15;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z15 = z13;
                i28 = i17;
                textResource4 = textResourceM21267a;
                textResource5 = textResource3;
                j14 = j13;
                function3 = function2;
                enumC4022f3 = enumC4022f2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.b2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4001c2.m12141o(z15, i28, textResource4, textResource5, enumC4022f3, j14, function3, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 3072;
        textResource3 = textResource2;
        i24 = i15 & 16;
        if (i24 != 0) {
            i16 |= 24576;
        } else if ((i14 & 24576) == 0) {
            if (enumC4022f2 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC4022f2.ordinal();
            }
            if (c28655q2.m87149e(iOrdinal)) {
                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i25 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 |= i25;
        }
        if ((196608 & i14) == 0) {
            if ((i15 & 32) == 0) {
                j13 = j7;
                if (c28655q2.m87151f(j13)) {
                    i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i16 |= i29;
            } else {
                j13 = j7;
            }
            i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i16 |= i29;
        } else {
            j13 = j7;
        }
        i26 = i15 & 64;
        if (i26 != 0) {
            if ((1572864 & i14) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i16 |= i27;
            }
            if ((599187 & i16) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z14)) {
                c28655q2.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i34 == 0) {
                    }
                    if (i35 != 0) {
                        i17 = Integer.MIN_VALUE;
                    }
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i18 != 0) {
                        textResource3 = null;
                    }
                    if (i24 != 0) {
                        enumC4022f4 = EnumC4022f2.POSITIVE;
                    } else {
                        enumC4022f4 = enumC4022f2;
                    }
                    if ((i15 & 32) != 0) {
                        jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i16 &= -458753;
                    } else {
                        jM125370W0 = j13;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C3929m(12);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                    }
                    j15 = jM125370W0;
                } else {
                    if (i34 == 0) {
                    }
                    if (i35 != 0) {
                        i17 = Integer.MIN_VALUE;
                    }
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i18 != 0) {
                        textResource3 = null;
                    }
                    if (i24 != 0) {
                        enumC4022f4 = EnumC4022f2.POSITIVE;
                    } else {
                        enumC4022f4 = enumC4022f2;
                    }
                    if ((i15 & 32) != 0) {
                        jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i16 &= -458753;
                    } else {
                        jM125370W0 = j13;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C3929m(12);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                    }
                    j15 = jM125370W0;
                }
                c28655q2.m87175r();
                Function1 function10 = function2;
                boolean z113 = z16;
                c28655q = c28655q2;
                AbstractC31926e.m99375j(null, null, j15, null, null, null, 0.0f, AbstractC37817c.m121344e(-2087492144, c28655q2, new C2549j2(function10, enumC4022f4, textResourceM21267a, textResource3, i17, z113)), c28655q, ((i16 >> 9) & 896) | 12582912, 123);
                int i313 = i17;
                enumC4022f3 = enumC4022f4;
                z15 = z113;
                i28 = i313;
                TextResource textResource12 = textResource3;
                function3 = function10;
                textResource5 = textResource12;
                textResource4 = textResourceM21267a;
                j14 = j15;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z15 = z13;
                i28 = i17;
                textResource4 = textResourceM21267a;
                textResource5 = textResource3;
                j14 = j13;
                function3 = function2;
                enumC4022f3 = enumC4022f2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.b2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4001c2.m12141o(z15, i28, textResource4, textResource5, enumC4022f3, j14, function3, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 1572864;
        function2 = function1;
        if ((599187 & i16) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z14)) {
            c28655q2.m87140Z();
            if ((i14 & 1) != 0) {
                if (i34 == 0) {
                }
                if (i35 != 0) {
                    i17 = Integer.MIN_VALUE;
                }
                if ((i15 & 4) != 0) {
                    i16 &= -897;
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if (i18 != 0) {
                    textResource3 = null;
                }
                if (i24 != 0) {
                    enumC4022f4 = EnumC4022f2.POSITIVE;
                } else {
                    enumC4022f4 = enumC4022f2;
                }
                if ((i15 & 32) != 0) {
                    jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                    i16 &= -458753;
                } else {
                    jM125370W0 = j13;
                }
                if (i26 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C3929m(12);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                }
                j15 = jM125370W0;
            } else {
                if (i34 == 0) {
                }
                if (i35 != 0) {
                    i17 = Integer.MIN_VALUE;
                }
                if ((i15 & 4) != 0) {
                    i16 &= -897;
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if (i18 != 0) {
                    textResource3 = null;
                }
                if (i24 != 0) {
                    enumC4022f4 = EnumC4022f2.POSITIVE;
                } else {
                    enumC4022f4 = enumC4022f2;
                }
                if ((i15 & 32) != 0) {
                    jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                    i16 &= -458753;
                } else {
                    jM125370W0 = j13;
                }
                if (i26 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C3929m(12);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                }
                j15 = jM125370W0;
            }
            c28655q2.m87175r();
            Function1 function11 = function2;
            boolean z114 = z16;
            c28655q = c28655q2;
            AbstractC31926e.m99375j(null, null, j15, null, null, null, 0.0f, AbstractC37817c.m121344e(-2087492144, c28655q2, new C2549j2(function11, enumC4022f4, textResourceM21267a, textResource3, i17, z114)), c28655q, ((i16 >> 9) & 896) | 12582912, 123);
            int i314 = i17;
            enumC4022f3 = enumC4022f4;
            z15 = z114;
            i28 = i314;
            TextResource textResource13 = textResource3;
            function3 = function11;
            textResource5 = textResource13;
            textResource4 = textResourceM21267a;
            j14 = j15;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z15 = z13;
            i28 = i17;
            textResource4 = textResourceM21267a;
            textResource5 = textResource3;
            j14 = j13;
            function3 = function2;
            enumC4022f3 = enumC4022f2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.b2
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC4001c2.m12141o(z15, i28, textResource4, textResource5, enumC4022f3, j14, function3, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m12138l(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m12139m(Function1 function1, EnumC4022f2 enumC4022f2, TextResource textResource, TextResource textResource2, int i13, boolean z4, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C3189a(function1, 11);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3394p(2 * 8, AbstractC1092a.m3362g(C2314t.f9131w, true, null, null, (InterfaceC4339a) objM87133R, 14)));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m12133g(new LayoutWeightElement(1.0f, true), c28655q, 0);
            m12135i(enumC4022f2, textResource, textResource2, i13, z4, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m12140n(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m12141o(boolean z4, int i13, TextResource textResource, TextResource textResource2, EnumC4022f2 enumC4022f2, long j7, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m12137k(z4, i13, textResource, textResource2, enumC4022f2, j7, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final C23465k m12142p(EnumC4022f2 enumC4022f2, Composer composer, int i13) {
        int i14 = a.f16275a[enumC4022f2.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(469742270);
            C38072d c38072d = C38072d.f163053a;
            C23465k c23465k = new C23465k(new C17919x(c38072d.m121949b(c28655q, 6).getAccentPositiveTrend()), new C17919x(c38072d.m121949b(c28655q, 6).getAccentPositiveTrend15()));
            c28655q.m87173q(false);
            return c23465k;
        }
        if (i14 == 2) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(469745950);
            C38072d c38072d2 = C38072d.f163053a;
            C23465k c23465k2 = new C23465k(new C17919x(c38072d2.m121949b(c28655q2, 6).getAccentNegativeTrend()), new C17919x(c38072d2.m121949b(c28655q2, 6).getAccentNegativeTrend15()));
            c28655q2.m87173q(false);
            return c23465k2;
        }
        if (i14 == 3) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(469749523);
            C38072d c38072d3 = C38072d.f163053a;
            C23465k c23465k3 = new C23465k(new C17919x(c38072d3.m121949b(c28655q3, 6).getAccentAlert()), new C17919x(c38072d3.m121949b(c28655q3, 6).getAccentAlertTrend15()));
            c28655q3.m87173q(false);
            return c23465k3;
        }
        if (i14 != 4) {
            throw AbstractC11895b.m32003v(469741102, (C28655q) composer, false);
        }
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87150e0(469752818);
        C38072d c38072d4 = C38072d.f163053a;
        C23465k c23465k4 = new C23465k(new C17919x(c38072d4.m121949b(c28655q4, 6).getBrandWhite()), new C17919x(c38072d4.m121949b(c28655q4, 6).getAccentAlertTrend15()));
        c28655q4.m87173q(false);
        return c23465k4;
    }
}
