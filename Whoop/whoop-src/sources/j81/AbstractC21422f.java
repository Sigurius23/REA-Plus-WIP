package j81;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b91.AbstractC2890e;
import c13.AbstractC3855a;
import c41.AbstractC4021f1;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dp0.C12253i;
import fy1.C14873i;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import gy0.AbstractC16277f;
import hy0.C17737e0;
import hy0.C17794v;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import iz0.C21045d;
import j11.C21214q;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.C25235a0;
import n83.C26460c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23164r1;
import p294l3.C23267m0;
import p294l3.C23285v0;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39183o;
import p636y3.InterfaceC39171c;
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: j81.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lj81/i;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "m", "(Landroidx/compose/ui/Modifier;Lj81/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "testTag", "Lcom/whoop/design/util/TextResource;", "scoreDisplayTitle", "Ly81/f;", "textColor", "", "titleIcon", "i", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/f;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V", "scoreDisplay", "scoreDisplaySuffix", "k", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Landroidx/compose/runtime/Composer;II)V", "s", "(Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21422f {

    /* JADX INFO: renamed from: j81.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m60277a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-627647893);
            float f13 = 2 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C21424h c21424h = C21424h.f82205a;
            AbstractC21422f.m60269m(null, c21424h.m60284d(), null, c28655q, 0, 5);
            AbstractC21422f.m60269m(null, c21424h.m60285e(), null, c28655q, 0, 5);
            AbstractC21422f.m60269m(null, c21424h.m60281a(), null, c28655q, 0, 5);
            AbstractC21422f.m60269m(null, c21424h.m60282b(), null, c28655q, 0, 5);
            AbstractC21422f.m60269m(null, c21424h.m60283c(), null, c28655q, 0, 5);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m60277a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0115  */
    /* JADX WARN: Code duplicated, block: B:80:0x0126  */
    /* JADX WARN: Code duplicated, block: B:82:0x015f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0163  */
    /* JADX WARN: Code duplicated, block: B:88:0x017e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0224  */
    /* JADX WARN: Code duplicated, block: B:94:0x022f  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    private static final void m60265i(Modifier modifier, String str, TextResource textResource, EnumC39333f enumC39333f, Integer num, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Integer num2;
        int i16;
        boolean z4;
        Modifier modifier3;
        Integer num3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        String strConcat;
        Integer num4;
        long jMo134584toComposableColorWaAFU9c;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        int iHashCode2;
        boolean z13;
        String str2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1810235022);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(textResource) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87149e(enumC39333f.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i18 = i14 & 16;
        if (i18 == 0) {
            if ((i13 & 24576) == 0) {
                num2 = num;
                i15 |= c28655q.m87153g(num2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i15;
            if ((i16 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                strConcat = null;
                if (i18 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                jMo134584toComposableColorWaAFU9c = enumC39333f.mo134584toComposableColorWaAFU9c(c28655q, (i16 >> 9) & 14);
                if (str != null) {
                    if (str.length() > 0) {
                        str2 = str;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        strConcat = str2.concat("_Label");
                    }
                }
                Modifier modifierM44101d = AbstractC15676d.m44101d(modifier2, strConcat);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44101d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                if (num4 == null) {
                    c28655q.m87150e0(-1368491583);
                    c28655q.m87173q(false);
                    z13 = true;
                } else {
                    c28655q.m87150e0(-1368491582);
                    int iIntValue = num4.intValue();
                    float f13 = 4;
                    Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3419p(f13 * f13, c2314t), jMo134584toComposableColorWaAFU9c, AbstractC33253j.f138651a);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    z13 = true;
                    AbstractC23164r1.m67132a(AbstractC29125c.m88500I(iIntValue, c28655q, 0), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62249J), AbstractC1102d.m3419p(2 * f13, c2314t), EnumC39333f.BRAND_BLACK.mo134584toComposableColorWaAFU9c(c28655q, 6), c28655q, 384);
                    c28655q.m87173q(true);
                    AbstractC18489d0.m53381v((float) 0.5d, 8, c2314t, c28655q, false);
                }
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, (i16 >> 6) & 14);
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h, null, jMo134584toComposableColorWaAFU9c, AbstractC31061c.m95626b(C39183o.m124805c(c38072d.m121952e(c28655q, 6).getH4().getStyle().f92255a.f92192b), 4294967296L, (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)), null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 2, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 3120, 185842);
                c28655q = c28655q;
                c28655q.m87173q(z13);
                num3 = num4;
                modifier3 = modifier2;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                num3 = num2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(modifier3, str, textResource, enumC39333f, num3, i13, i14);
            }
        }
        i15 |= 24576;
        num2 = num;
        i16 = i15;
        if ((i16 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            strConcat = null;
            if (i18 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            jMo134584toComposableColorWaAFU9c = enumC39333f.mo134584toComposableColorWaAFU9c(c28655q, (i16 >> 9) & 14);
            if (str != null) {
                if (str.length() > 0) {
                    str2 = str;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    strConcat = str2.concat("_Label");
                }
            }
            Modifier modifierM44101d2 = AbstractC15676d.m44101d(modifier2, strConcat);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM44101d2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            if (num4 == null) {
                c28655q.m87150e0(-1368491583);
                c28655q.m87173q(false);
                z13 = true;
            } else {
                c28655q.m87150e0(-1368491582);
                int iIntValue2 = num4.intValue();
                float f14 = 4;
                Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1102d.m3419p(f14 * f14, c2314t), jMo134584toComposableColorWaAFU9c, AbstractC33253j.f138651a);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                z13 = true;
                AbstractC23164r1.m67132a(AbstractC29125c.m88500I(iIntValue2, c28655q, 0), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62249J), AbstractC1102d.m3419p(2 * f14, c2314t), EnumC39333f.BRAND_BLACK.mo134584toComposableColorWaAFU9c(c28655q, 6), c28655q, 384);
                c28655q.m87173q(true);
                AbstractC18489d0.m53381v((float) 0.5d, 8, c2314t, c28655q, false);
            }
            String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q, (i16 >> 6) & 14);
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h2, null, jMo134584toComposableColorWaAFU9c, AbstractC31061c.m95626b(C39183o.m124805c(c38072d2.m121952e(c28655q, 6).getH4().getStyle().f92255a.f92192b), 4294967296L, (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)), null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 2, 0, null, c38072d2.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 3120, 185842);
            c28655q = c28655q;
            c28655q.m87173q(z13);
            num3 = num4;
            modifier3 = modifier2;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            num3 = num2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(modifier3, str, textResource, enumC39333f, num3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m60266j(Modifier modifier, String str, TextResource textResource, EnumC39333f enumC39333f, Integer num, int i13, int i14, Composer composer, int i15) {
        m60265i(modifier, str, textResource, enumC39333f, num, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m60267k(Modifier modifier, String str, TextResource textResource, TextResource textResource2, EnumC39333f enumC39333f, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1933362328);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(textResource) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(textResource2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87149e(enumC39333f.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, (i15 >> 6) & 14);
            String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q2, (i15 >> 9) & 14);
            C38072d c38072d = C38072d.f163053a;
            C23285v0 style = c38072d.m121952e(c28655q2, 6).getN55().getStyle();
            long jM113246h = AbstractC35745c.m113246h(69);
            float fontScale = interfaceC39171c.getFontScale();
            AbstractC35745c.m113242a(jM113246h);
            int i17 = (i15 >> 12) & 14;
            C23267m0 c23267m0M8451f = AbstractC2890e.m8451f(C23285v0.m67364b(style, 0L, AbstractC35745c.m113248j(C39183o.m124805c(jM113246h) / fontScale, jM113246h & 1095216660480L), null, null, 0L, 0, 0L, null, null, 16777213), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, i17), c28655q2, 0);
            C23285v0 style2 = c38072d.m121952e(c28655q2, 6).getN55().getStyle();
            long jM113246h2 = AbstractC35745c.m113246h(43);
            float fontScale2 = interfaceC39171c.getFontScale();
            AbstractC35745c.m113242a(jM113246h2);
            C23267m0 c23267m0M8451f2 = AbstractC2890e.m8451f(C23285v0.m67364b(style2, 0L, AbstractC35745c.m113248j(C39183o.m124805c(jM113246h2) / fontScale2, jM113246h2 & 1095216660480L), null, null, 0L, 0, 0L, null, null, 16777213), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, i17), c28655q2, 0);
            C26460c c26460cM119000x = AbstractC37056f.m119000x();
            c26460cM119000x.add(new C23465k(strM21274h, c23267m0M8451f));
            if (strM21274h2.length() > 0) {
                c26460cM119000x.add(new C23465k(strM21274h2, c23267m0M8451f2));
            }
            C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
            String strConcat = null;
            if (str != null) {
                String str2 = str.length() > 0 ? str : null;
                if (str2 != null) {
                    strConcat = str2.concat("_Value");
                }
            }
            c28655q = c28655q2;
            AbstractC30795n.m94704e(c26460cM118988k, AbstractC15676d.m44101d(modifier3, strConcat), 0L, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 261628);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(modifier3, str, textResource, textResource2, enumC39333f, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m60268l(Modifier modifier, String str, TextResource textResource, TextResource textResource2, EnumC39333f enumC39333f, int i13, int i14, Composer composer, int i15) {
        m60267k(modifier, str, textResource, textResource2, enumC39333f, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m60269m(Modifier modifier, C21425i state, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1880890578);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C21045d(21);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            boolean z4 = state.getDestination() != null;
            boolean zM87157i = c28655q.m87157i(state) | ((i15 & 896) == 256);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C19223a(27, state, function1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC21418b.m60229c(AbstractC15676d.m44099b(modifier, z4, (Function1) objM87133R2), state.m60303k(), AbstractC37817c.m121344e(2088194205, c28655q, new C17098f(state, 19)), c28655q, 384, 0);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 28, modifier2, (Object) state, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m60270n(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Modifier m60271o(C21425i c21425i, Function1 function1, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1772c1.m5391i(applyIf, false, null, new C21214q(c21425i, function1, 3), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m60272p(C21425i c21425i, Function1 function1) {
        if (c21425i.getDestination() != null) {
            function1.invoke(c21425i.getDestination());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m60273q(C21425i c21425i, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC29125c.m88524d(AbstractC34132o.m107874S(C38072d.f163053a.m121951d().getLogo().getWhoopText(), c28655q, 6), null, AbstractC1102d.m3421r(c2314t, 87, 14), null, c28655q, 221616, 72);
            m60267k(c2314t, c21425i.getTestTag(), c21425i.getScoreDisplay(), c21425i.getScoreDisplaySuffix(), c21425i.getScoreDisplayColor(), c28655q, 6, 0);
            String strM60302j = c21425i.getTestTag();
            TextResource textResourceM60299g = c21425i.getScoreDisplayTitle();
            EnumC39333f enumC39333fM60300h = c21425i.getScoreDisplayTitleColor();
            if (enumC39333fM60300h == null) {
                enumC39333fM60300h = c21425i.getScoreDisplayColor();
            }
            m60265i(c2314t, strM60302j, textResourceM60299g, enumC39333fM60300h, c21425i.getScoreDisplayTitleIcon(), c28655q, 6, 0);
            List<EnumC39333f> listM60294a = c21425i.m60294a();
            if (listM60294a == null) {
                c28655q.m87150e0(1394067933);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1394067934);
                float f13 = 1 * 8;
                AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(f13, c2314t));
                AbstractC4021f1.m12239p(listM60294a, 0.0f, c28655q, 0, 2);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f13, c2314t));
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m60274r(Modifier modifier, C21425i c21425i, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m60269m(modifier, c21425i, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m60275s(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(98286363);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17737e0(i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m60276t(int i13, Composer composer, int i14) {
        m60275s(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
