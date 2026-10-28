package z51;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.AbstractC2890e;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import java.util.ArrayList;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import oy0.AbstractC28472a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import v41.C35692u;
import wb3.AbstractC37056f;
import wy0.AbstractC37692c;
import x81.AbstractC38073e;
import x81.C38072d;
import yk2.C39609i;
import yz1.C39913g;

/* JADX INFO: renamed from: z51.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aQ\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, m65681d2 = {"Lz51/s;", "type", "", "fillPercent", "Lcom/whoop/design/util/TextResource;", "score", "", "showOptimalStrain", "optimalStrainPercent", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "k", "(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "g", "(Lz51/s;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Li91/a;", "o", "(Lz51/s;Landroidx/compose/runtime/Composer;I)Li91/a;", "", "p", "(Lz51/s;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Ly3/f;", "a", "F", "PILLAR_GAUGE_RADIUS", "b", "PILLAR_GAUGE_STROKE", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40104o {

    /* JADX INFO: renamed from: a */
    private static final float f173121a = 148;

    /* JADX INFO: renamed from: b */
    private static final float f173122b = (float) 18.4d;

    /* JADX INFO: renamed from: z51.o$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f173123a;

        static {
            int[] iArr = new int[EnumC40108s.values().length];
            try {
                iArr[EnumC40108s.CALIBRATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC40108s.RECOVERY_LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC40108s.RECOVERY_MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC40108s.RECOVERY_HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC40108s.STRAIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f173123a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x022f  */
    /* JADX WARN: Code duplicated, block: B:67:0x023d  */
    /* JADX WARN: Code duplicated, block: B:68:0x023f  */
    /* JADX WARN: Code duplicated, block: B:75:0x024e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0269  */
    /* JADX WARN: Code duplicated, block: B:79:0x0279  */
    /* JADX WARN: Code duplicated, block: B:82:0x0283  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    private static final void m128642g(EnumC40108s enumC40108s, TextResource textResource, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function5;
        int iHashCode2;
        C38072d c38072d;
        int i16;
        ArrayList arrayListM118964P;
        Function1 function6;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1470804845);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87149e(enumC40108s.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(textResource) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C39913g(17);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90657h, C2299e.f9108K, c28655q, 54);
                function5 = function4;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                String strM128651p = m128651p(enumC40108s, c28655q, i15 & 14);
                c38072d = C38072d.f163053a;
                i16 = i15;
                AbstractC30795n.m94707h(strM128651p, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH3(), null, c28655q, 0, 0, 196090);
                c28655q.m87173q(true);
                arrayListM118964P = AbstractC37056f.m118964P(new C23465k(AbstractC8693b.m21274h(textResource, c28655q, (i16 >> 3) & 14), AbstractC2890e.m8451f(c38072d.m121952e(c28655q, 6).getN1().getStyle(), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 0)));
                if (enumC40108s != EnumC40108s.STRAIN) {
                    c28655q.m87150e0(-795422752);
                    arrayListM118964P.add(new C23465k("%", AbstractC2890e.m8451f(c38072d.m121952e(c28655q, 6).getN3().getStyle(), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 0)));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-795294939);
                    c28655q.m87173q(false);
                }
                AbstractC30795n.m94704e(arrayListM118964P, null, 0L, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 261630);
                c28655q = c28655q;
                if (((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.HIDE_SHARE)) {
                    function6 = function5;
                    c28655q.m87150e0(-794919963);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-795038166);
                    if ((i16 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (!z13 || objM87133R == c28676v0) {
                        function6 = function5;
                        objM87133R = new C39609i(function6, 15);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function6 = function5;
                    }
                    AbstractC28472a.m86382c(null, true, (InterfaceC4339a) objM87133R, c28655q, 48, 1);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function6;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40103n(enumC40108s, textResource, function3, i13, i14, 0);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C39913g(17);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90657h, C2299e.f9108K, c28655q, 54);
            function5 = function4;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            String strM128651p2 = m128651p(enumC40108s, c28655q, i15 & 14);
            c38072d = C38072d.f163053a;
            i16 = i15;
            AbstractC30795n.m94707h(strM128651p2, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH3(), null, c28655q, 0, 0, 196090);
            c28655q.m87173q(true);
            arrayListM118964P = AbstractC37056f.m118964P(new C23465k(AbstractC8693b.m21274h(textResource, c28655q, (i16 >> 3) & 14), AbstractC2890e.m8451f(c38072d.m121952e(c28655q, 6).getN1().getStyle(), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 0)));
            if (enumC40108s != EnumC40108s.STRAIN) {
                c28655q.m87150e0(-795422752);
                arrayListM118964P.add(new C23465k("%", AbstractC2890e.m8451f(c38072d.m121952e(c28655q, 6).getN3().getStyle(), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 0)));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-795294939);
                c28655q.m87173q(false);
            }
            AbstractC30795n.m94704e(arrayListM118964P, null, 0L, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 261630);
            c28655q = c28655q;
            if (((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.HIDE_SHARE)) {
                c28655q.m87150e0(-795038166);
                if ((i16 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    function6 = function5;
                    objM87133R = new C39609i(function6, 15);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C39609i(function6, 15);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28472a.m86382c(null, true, (InterfaceC4339a) objM87133R, c28655q, 48, 1);
                c28655q.m87173q(false);
            } else {
                function6 = function5;
                c28655q.m87150e0(-794919963);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40103n(enumC40108s, textResource, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m128643h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m128644i(Function1 function1) {
        function1.invoke(EnumC40105p.SHARE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m128645j(EnumC40108s enumC40108s, TextResource textResource, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m128642g(enumC40108s, textResource, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0223  */
    /* JADX WARN: Code duplicated, block: B:102:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x0285  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0126  */
    /* JADX WARN: Code duplicated, block: B:83:0x012a  */
    /* JADX WARN: Code duplicated, block: B:86:0x013d  */
    /* JADX WARN: Code duplicated, block: B:88:0x014b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0191  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:95:0x0217  */
    /* JADX WARN: Code duplicated, block: B:96:0x0219  */
    /* JADX WARN: Code duplicated, block: B:99:0x0221 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: k */
    public static final void m128646k(EnumC40108s type, float f13, TextResource score, boolean z4, float f14, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        float f15;
        boolean z13;
        int i16;
        float f16;
        int i17;
        int i18;
        Function1 function2;
        int i19;
        int i24;
        boolean z14;
        boolean z15;
        float f17;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        float f18;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f19;
        float f24;
        C38072d c38072d;
        boolean z16;
        C28655q c28655q;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(score, "score");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1436406649);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87149e(type.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            f15 = f13;
            i15 |= c28655q2.m87147d(f15) ? 32 : 16;
        } else {
            f15 = f13;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(score) ? 256 : 128;
        }
        int i25 = i14 & 8;
        if (i25 == 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    f16 = f14;
                    if (c28655q2.m87147d(f16)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        function2 = function1;
                        if (c28655q2.m87157i(function2)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    i24 = i15;
                    if ((i24 & 74899) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i24 & 1, z14)) {
                        if (i25 != 0) {
                            z13 = false;
                        }
                        if (i16 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f16;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C39913g(16);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function4 = (Function1) objM87133R3;
                        } else {
                            function4 = function2;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q2);
                        }
                        InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                        C2307m c2307m = C2299e.f9102E;
                        float f25 = 4;
                        C2314t c2314t = C2314t.f9131w;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f25 * f25, 0.0f, 0.0f, 13);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                        f19 = f173121a;
                        f24 = f173122b;
                        c38072d = C38072d.f163053a;
                        z16 = z13;
                        AbstractC37692c.m121117c(null, f19, 1.0f, AbstractC18249c.m52577o(c38072d.m121949b(c28655q2, 6).getWhite10()), f24, false, 0.0f, 0, null, c28655q2, 25008, 481);
                        c28655q = c28655q2;
                        if (z16) {
                            c28655q.m87150e0(14382698);
                            AbstractC37692c.m121117c(null, f19, f18, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, 6).getWhite20()), f24, true, 0.0f, 0, null, c28655q, ((i24 >> 6) & 896) | 221232, 449);
                            c28655q = c28655q;
                            z17 = false;
                            c28655q.m87173q(false);
                        } else {
                            z17 = false;
                            c28655q.m87150e0(14660737);
                            c28655q.m87173q(false);
                        }
                        int i26 = i24 & 14;
                        z18 = z17;
                        C28655q c28655q3 = c28655q;
                        AbstractC37692c.m121117c(null, f19, f15, m128650o(type, c28655q, i26), f24, false, 0.0f, 0, null, c28655q3, ((i24 << 3) & 896) | 24624, 481);
                        m128642g(type, score, function4, c28655q3, i26 | ((i24 >> 3) & 112) | ((i24 >> 9) & 896), 0);
                        c28655q2 = c28655q3;
                        Modifier modifierMo3400a = C1100b.f4583a.mo3400a(c2314t, C2299e.f9116y);
                        if ((i24 & 458752) == 131072) {
                            z19 = true;
                        } else {
                            z19 = z18;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z19 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C39609i(function4, 14);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getEducation(), c28655q2, 6), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62239G1), AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * f25, AbstractC1092a.m3360e(modifierMo3400a, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28)), "Help"), c38072d.m121949b(c28655q2, 6).getWhite70(), c28655q2, 0, 0);
                        c28655q2.m87173q(true);
                        z15 = z16;
                        function3 = function4;
                        f17 = f18;
                    } else {
                        c28655q2.m87138X();
                        z15 = z13;
                        f17 = f16;
                        function3 = function2;
                    }
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C35692u(type, f13, score, z15, f17, function3, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function2 = function1;
                i24 = i15;
                if ((i24 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i24 & 1, z14)) {
                    if (i25 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f16;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39913g(16);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                    C2307m c2307m2 = C2299e.f9102E;
                    float f26 = 4;
                    C2314t c2314t2 = C2314t.f9131w;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 0.0f, f26 * f26, 0.0f, 0.0f, 13);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                    f19 = f173121a;
                    f24 = f173122b;
                    c38072d = C38072d.f163053a;
                    z16 = z13;
                    AbstractC37692c.m121117c(null, f19, 1.0f, AbstractC18249c.m52577o(c38072d.m121949b(c28655q2, 6).getWhite10()), f24, false, 0.0f, 0, null, c28655q2, 25008, 481);
                    c28655q = c28655q2;
                    if (z16) {
                        c28655q.m87150e0(14382698);
                        AbstractC37692c.m121117c(null, f19, f18, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, 6).getWhite20()), f24, true, 0.0f, 0, null, c28655q, ((i24 >> 6) & 896) | 221232, 449);
                        c28655q = c28655q;
                        z17 = false;
                        c28655q.m87173q(false);
                    } else {
                        z17 = false;
                        c28655q.m87150e0(14660737);
                        c28655q.m87173q(false);
                    }
                    int i27 = i24 & 14;
                    z18 = z17;
                    C28655q c28655q4 = c28655q;
                    AbstractC37692c.m121117c(null, f19, f15, m128650o(type, c28655q, i27), f24, false, 0.0f, 0, null, c28655q4, ((i24 << 3) & 896) | 24624, 481);
                    m128642g(type, score, function4, c28655q4, i27 | ((i24 >> 3) & 112) | ((i24 >> 9) & 896), 0);
                    c28655q2 = c28655q4;
                    Modifier modifierMo3400a2 = C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y);
                    if ((i24 & 458752) == 131072) {
                        z19 = true;
                    } else {
                        z19 = z18;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z19) {
                        objM87133R2 = new C39609i(function4, 14);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C39609i(function4, 14);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getEducation(), c28655q2, 6), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62239G1), AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * f26, AbstractC1092a.m3360e(modifierMo3400a2, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R2, 28)), "Help"), c38072d.m121949b(c28655q2, 6).getWhite70(), c28655q2, 0, 0);
                    c28655q2.m87173q(true);
                    z15 = z16;
                    function3 = function4;
                    f17 = f18;
                } else {
                    c28655q2.m87138X();
                    z15 = z13;
                    f17 = f16;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35692u(type, f13, score, z15, f17, function3, i13, i14);
                }
            }
            i15 |= 24576;
            f16 = f14;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i15;
                if ((i24 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i24 & 1, z14)) {
                    if (i25 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f16;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39913g(16);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                    C2307m c2307m3 = C2299e.f9102E;
                    float f27 = 4;
                    C2314t c2314t3 = C2314t.f9131w;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t3, 0.0f, f27 * f27, 0.0f, 0.0f, 13);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m3, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3398t3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                    f19 = f173121a;
                    f24 = f173122b;
                    c38072d = C38072d.f163053a;
                    z16 = z13;
                    AbstractC37692c.m121117c(null, f19, 1.0f, AbstractC18249c.m52577o(c38072d.m121949b(c28655q2, 6).getWhite10()), f24, false, 0.0f, 0, null, c28655q2, 25008, 481);
                    c28655q = c28655q2;
                    if (z16) {
                        c28655q.m87150e0(14382698);
                        AbstractC37692c.m121117c(null, f19, f18, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, 6).getWhite20()), f24, true, 0.0f, 0, null, c28655q, ((i24 >> 6) & 896) | 221232, 449);
                        c28655q = c28655q;
                        z17 = false;
                        c28655q.m87173q(false);
                    } else {
                        z17 = false;
                        c28655q.m87150e0(14660737);
                        c28655q.m87173q(false);
                    }
                    int i28 = i24 & 14;
                    z18 = z17;
                    C28655q c28655q5 = c28655q;
                    AbstractC37692c.m121117c(null, f19, f15, m128650o(type, c28655q, i28), f24, false, 0.0f, 0, null, c28655q5, ((i24 << 3) & 896) | 24624, 481);
                    m128642g(type, score, function4, c28655q5, i28 | ((i24 >> 3) & 112) | ((i24 >> 9) & 896), 0);
                    c28655q2 = c28655q5;
                    Modifier modifierMo3400a3 = C1100b.f4583a.mo3400a(c2314t3, C2299e.f9116y);
                    if ((i24 & 458752) == 131072) {
                        z19 = true;
                    } else {
                        z19 = z18;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z19) {
                        objM87133R2 = new C39609i(function4, 14);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C39609i(function4, 14);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getEducation(), c28655q2, 6), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62239G1), AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * f27, AbstractC1092a.m3360e(modifierMo3400a3, interfaceC21083i3, null, false, null, (InterfaceC4339a) objM87133R2, 28)), "Help"), c38072d.m121949b(c28655q2, 6).getWhite70(), c28655q2, 0, 0);
                    c28655q2.m87173q(true);
                    z15 = z16;
                    function3 = function4;
                    f17 = f18;
                } else {
                    c28655q2.m87138X();
                    z15 = z13;
                    f17 = f16;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35692u(type, f13, score, z15, f17, function3, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function2 = function1;
            i24 = i15;
            if ((i24 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z14)) {
                if (i25 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f16;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39913g(16);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                C2307m c2307m4 = C2299e.f9102E;
                float f28 = 4;
                C2314t c2314t4 = C2314t.f9131w;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t4, 0.0f, f28 * f28, 0.0f, 0.0f, 13);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m4, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3398t4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                f19 = f173121a;
                f24 = f173122b;
                c38072d = C38072d.f163053a;
                z16 = z13;
                AbstractC37692c.m121117c(null, f19, 1.0f, AbstractC18249c.m52577o(c38072d.m121949b(c28655q2, 6).getWhite10()), f24, false, 0.0f, 0, null, c28655q2, 25008, 481);
                c28655q = c28655q2;
                if (z16) {
                    c28655q.m87150e0(14382698);
                    AbstractC37692c.m121117c(null, f19, f18, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, 6).getWhite20()), f24, true, 0.0f, 0, null, c28655q, ((i24 >> 6) & 896) | 221232, 449);
                    c28655q = c28655q;
                    z17 = false;
                    c28655q.m87173q(false);
                } else {
                    z17 = false;
                    c28655q.m87150e0(14660737);
                    c28655q.m87173q(false);
                }
                int i29 = i24 & 14;
                z18 = z17;
                C28655q c28655q6 = c28655q;
                AbstractC37692c.m121117c(null, f19, f15, m128650o(type, c28655q, i29), f24, false, 0.0f, 0, null, c28655q6, ((i24 << 3) & 896) | 24624, 481);
                m128642g(type, score, function4, c28655q6, i29 | ((i24 >> 3) & 112) | ((i24 >> 9) & 896), 0);
                c28655q2 = c28655q6;
                Modifier modifierMo3400a4 = C1100b.f4583a.mo3400a(c2314t4, C2299e.f9116y);
                if ((i24 & 458752) == 131072) {
                    z19 = true;
                } else {
                    z19 = z18;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z19) {
                    objM87133R2 = new C39609i(function4, 14);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C39609i(function4, 14);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getEducation(), c28655q2, 6), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62239G1), AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * f28, AbstractC1092a.m3360e(modifierMo3400a4, interfaceC21083i4, null, false, null, (InterfaceC4339a) objM87133R2, 28)), "Help"), c38072d.m121949b(c28655q2, 6).getWhite70(), c28655q2, 0, 0);
                c28655q2.m87173q(true);
                z15 = z16;
                function3 = function4;
                f17 = f18;
            } else {
                c28655q2.m87138X();
                z15 = z13;
                f17 = f16;
                function3 = function2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35692u(type, f13, score, z15, f17, function3, i13, i14);
            }
        }
        i15 |= 3072;
        z13 = z4;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                f16 = f14;
                if (c28655q2.m87147d(f16)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i15;
                if ((i24 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i24 & 1, z14)) {
                    if (i25 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f16;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39913g(16);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i5 = (InterfaceC21083i) objM87133R;
                    C2307m c2307m5 = C2299e.f9102E;
                    float f29 = 4;
                    C2314t c2314t5 = C2314t.f9131w;
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t5, 0.0f, f29 * f29, 0.0f, 0.0f, 13);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m5, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3398t5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                    f19 = f173121a;
                    f24 = f173122b;
                    c38072d = C38072d.f163053a;
                    z16 = z13;
                    AbstractC37692c.m121117c(null, f19, 1.0f, AbstractC18249c.m52577o(c38072d.m121949b(c28655q2, 6).getWhite10()), f24, false, 0.0f, 0, null, c28655q2, 25008, 481);
                    c28655q = c28655q2;
                    if (z16) {
                        c28655q.m87150e0(14382698);
                        AbstractC37692c.m121117c(null, f19, f18, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, 6).getWhite20()), f24, true, 0.0f, 0, null, c28655q, ((i24 >> 6) & 896) | 221232, 449);
                        c28655q = c28655q;
                        z17 = false;
                        c28655q.m87173q(false);
                    } else {
                        z17 = false;
                        c28655q.m87150e0(14660737);
                        c28655q.m87173q(false);
                    }
                    int i210 = i24 & 14;
                    z18 = z17;
                    C28655q c28655q7 = c28655q;
                    AbstractC37692c.m121117c(null, f19, f15, m128650o(type, c28655q, i210), f24, false, 0.0f, 0, null, c28655q7, ((i24 << 3) & 896) | 24624, 481);
                    m128642g(type, score, function4, c28655q7, i210 | ((i24 >> 3) & 112) | ((i24 >> 9) & 896), 0);
                    c28655q2 = c28655q7;
                    Modifier modifierMo3400a5 = C1100b.f4583a.mo3400a(c2314t5, C2299e.f9116y);
                    if ((i24 & 458752) == 131072) {
                        z19 = true;
                    } else {
                        z19 = z18;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z19) {
                        objM87133R2 = new C39609i(function4, 14);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C39609i(function4, 14);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getEducation(), c28655q2, 6), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62239G1), AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * f29, AbstractC1092a.m3360e(modifierMo3400a5, interfaceC21083i5, null, false, null, (InterfaceC4339a) objM87133R2, 28)), "Help"), c38072d.m121949b(c28655q2, 6).getWhite70(), c28655q2, 0, 0);
                    c28655q2.m87173q(true);
                    z15 = z16;
                    function3 = function4;
                    f17 = f18;
                } else {
                    c28655q2.m87138X();
                    z15 = z13;
                    f17 = f16;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35692u(type, f13, score, z15, f17, function3, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function2 = function1;
            i24 = i15;
            if ((i24 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z14)) {
                if (i25 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f16;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39913g(16);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i6 = (InterfaceC21083i) objM87133R;
                C2307m c2307m6 = C2299e.f9102E;
                float f210 = 4;
                C2314t c2314t6 = C2314t.f9131w;
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t6, 0.0f, f210 * f210, 0.0f, 0.0f, 13);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m6, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3398t6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                f19 = f173121a;
                f24 = f173122b;
                c38072d = C38072d.f163053a;
                z16 = z13;
                AbstractC37692c.m121117c(null, f19, 1.0f, AbstractC18249c.m52577o(c38072d.m121949b(c28655q2, 6).getWhite10()), f24, false, 0.0f, 0, null, c28655q2, 25008, 481);
                c28655q = c28655q2;
                if (z16) {
                    c28655q.m87150e0(14382698);
                    AbstractC37692c.m121117c(null, f19, f18, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, 6).getWhite20()), f24, true, 0.0f, 0, null, c28655q, ((i24 >> 6) & 896) | 221232, 449);
                    c28655q = c28655q;
                    z17 = false;
                    c28655q.m87173q(false);
                } else {
                    z17 = false;
                    c28655q.m87150e0(14660737);
                    c28655q.m87173q(false);
                }
                int i211 = i24 & 14;
                z18 = z17;
                C28655q c28655q8 = c28655q;
                AbstractC37692c.m121117c(null, f19, f15, m128650o(type, c28655q, i211), f24, false, 0.0f, 0, null, c28655q8, ((i24 << 3) & 896) | 24624, 481);
                m128642g(type, score, function4, c28655q8, i211 | ((i24 >> 3) & 112) | ((i24 >> 9) & 896), 0);
                c28655q2 = c28655q8;
                Modifier modifierMo3400a6 = C1100b.f4583a.mo3400a(c2314t6, C2299e.f9116y);
                if ((i24 & 458752) == 131072) {
                    z19 = true;
                } else {
                    z19 = z18;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z19) {
                    objM87133R2 = new C39609i(function4, 14);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C39609i(function4, 14);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getEducation(), c28655q2, 6), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62239G1), AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * f210, AbstractC1092a.m3360e(modifierMo3400a6, interfaceC21083i6, null, false, null, (InterfaceC4339a) objM87133R2, 28)), "Help"), c38072d.m121949b(c28655q2, 6).getWhite70(), c28655q2, 0, 0);
                c28655q2.m87173q(true);
                z15 = z16;
                function3 = function4;
                f17 = f18;
            } else {
                c28655q2.m87138X();
                z15 = z13;
                f17 = f16;
                function3 = function2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35692u(type, f13, score, z15, f17, function3, i13, i14);
            }
        }
        i15 |= 24576;
        f16 = f14;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            i24 = i15;
            if ((i24 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z14)) {
                if (i25 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f16;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39913g(16);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i7 = (InterfaceC21083i) objM87133R;
                C2307m c2307m7 = C2299e.f9102E;
                float f211 = 4;
                C2314t c2314t7 = C2314t.f9131w;
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t7, 0.0f, f211 * f211, 0.0f, 0.0f, 13);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m7, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3398t7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                f19 = f173121a;
                f24 = f173122b;
                c38072d = C38072d.f163053a;
                z16 = z13;
                AbstractC37692c.m121117c(null, f19, 1.0f, AbstractC18249c.m52577o(c38072d.m121949b(c28655q2, 6).getWhite10()), f24, false, 0.0f, 0, null, c28655q2, 25008, 481);
                c28655q = c28655q2;
                if (z16) {
                    c28655q.m87150e0(14382698);
                    AbstractC37692c.m121117c(null, f19, f18, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, 6).getWhite20()), f24, true, 0.0f, 0, null, c28655q, ((i24 >> 6) & 896) | 221232, 449);
                    c28655q = c28655q;
                    z17 = false;
                    c28655q.m87173q(false);
                } else {
                    z17 = false;
                    c28655q.m87150e0(14660737);
                    c28655q.m87173q(false);
                }
                int i212 = i24 & 14;
                z18 = z17;
                C28655q c28655q9 = c28655q;
                AbstractC37692c.m121117c(null, f19, f15, m128650o(type, c28655q, i212), f24, false, 0.0f, 0, null, c28655q9, ((i24 << 3) & 896) | 24624, 481);
                m128642g(type, score, function4, c28655q9, i212 | ((i24 >> 3) & 112) | ((i24 >> 9) & 896), 0);
                c28655q2 = c28655q9;
                Modifier modifierMo3400a7 = C1100b.f4583a.mo3400a(c2314t7, C2299e.f9116y);
                if ((i24 & 458752) == 131072) {
                    z19 = true;
                } else {
                    z19 = z18;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z19) {
                    objM87133R2 = new C39609i(function4, 14);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C39609i(function4, 14);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getEducation(), c28655q2, 6), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62239G1), AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * f211, AbstractC1092a.m3360e(modifierMo3400a7, interfaceC21083i7, null, false, null, (InterfaceC4339a) objM87133R2, 28)), "Help"), c38072d.m121949b(c28655q2, 6).getWhite70(), c28655q2, 0, 0);
                c28655q2.m87173q(true);
                z15 = z16;
                function3 = function4;
                f17 = f18;
            } else {
                c28655q2.m87138X();
                z15 = z13;
                f17 = f16;
                function3 = function2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35692u(type, f13, score, z15, f17, function3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function2 = function1;
        i24 = i15;
        if ((i24 & 74899) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i24 & 1, z14)) {
            if (i25 != 0) {
                z13 = false;
            }
            if (i16 != 0) {
                f18 = 0.0f;
            } else {
                f18 = f16;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C39913g(16);
                    c28655q2.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i8 = (InterfaceC21083i) objM87133R;
            C2307m c2307m8 = C2299e.f9102E;
            float f212 = 4;
            C2314t c2314t8 = C2314t.f9131w;
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t8, 0.0f, f212 * f212, 0.0f, 0.0f, 13);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m8, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3398t8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
            f19 = f173121a;
            f24 = f173122b;
            c38072d = C38072d.f163053a;
            z16 = z13;
            AbstractC37692c.m121117c(null, f19, 1.0f, AbstractC18249c.m52577o(c38072d.m121949b(c28655q2, 6).getWhite10()), f24, false, 0.0f, 0, null, c28655q2, 25008, 481);
            c28655q = c28655q2;
            if (z16) {
                c28655q.m87150e0(14382698);
                AbstractC37692c.m121117c(null, f19, f18, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, 6).getWhite20()), f24, true, 0.0f, 0, null, c28655q, ((i24 >> 6) & 896) | 221232, 449);
                c28655q = c28655q;
                z17 = false;
                c28655q.m87173q(false);
            } else {
                z17 = false;
                c28655q.m87150e0(14660737);
                c28655q.m87173q(false);
            }
            int i213 = i24 & 14;
            z18 = z17;
            C28655q c28655q10 = c28655q;
            AbstractC37692c.m121117c(null, f19, f15, m128650o(type, c28655q, i213), f24, false, 0.0f, 0, null, c28655q10, ((i24 << 3) & 896) | 24624, 481);
            m128642g(type, score, function4, c28655q10, i213 | ((i24 >> 3) & 112) | ((i24 >> 9) & 896), 0);
            c28655q2 = c28655q10;
            Modifier modifierMo3400a8 = C1100b.f4583a.mo3400a(c2314t8, C2299e.f9116y);
            if ((i24 & 458752) == 131072) {
                z19 = true;
            } else {
                z19 = z18;
            }
            objM87133R2 = c28655q2.m87133R();
            if (z19) {
                objM87133R2 = new C39609i(function4, 14);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C39609i(function4, 14);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getEducation(), c28655q2, 6), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62239G1), AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * f212, AbstractC1092a.m3360e(modifierMo3400a8, interfaceC21083i8, null, false, null, (InterfaceC4339a) objM87133R2, 28)), "Help"), c38072d.m121949b(c28655q2, 6).getWhite70(), c28655q2, 0, 0);
            c28655q2.m87173q(true);
            z15 = z16;
            function3 = function4;
            f17 = f18;
        } else {
            c28655q2.m87138X();
            z15 = z13;
            f17 = f16;
            function3 = function2;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35692u(type, f13, score, z15, f17, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m128647l(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m128648m(Function1 function1) {
        function1.invoke(EnumC40105p.HELP);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m128649n(EnumC40108s enumC40108s, float f13, TextResource textResource, boolean z4, float f14, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m128646k(enumC40108s, f13, textResource, z4, f14, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final AbstractC18247a m128650o(EnumC40108s enumC40108s, Composer composer, int i13) {
        int i14 = a.f173123a[enumC40108s.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(401447058);
            AbstractC18247a abstractC18247aM52577o = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite50());
            c28655q.m87173q(false);
            return abstractC18247aM52577o;
        }
        if (i14 == 2) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(401449598);
            AbstractC18247a abstractC18247aM52577o2 = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q2, 6).getRecoveryLowRecovery());
            c28655q2.m87173q(false);
            return abstractC18247aM52577o2;
        }
        if (i14 == 3) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(401452609);
            AbstractC18247a abstractC18247aM52577o3 = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q3, 6).getRecoveryMediumRecovery());
            c28655q3.m87173q(false);
            return abstractC18247aM52577o3;
        }
        if (i14 == 4) {
            C28655q c28655q4 = (C28655q) composer;
            c28655q4.m87150e0(401455647);
            AbstractC18247a abstractC18247aM52577o4 = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q4, 6).getRecoveryHighRecovery());
            c28655q4.m87173q(false);
            return abstractC18247aM52577o4;
        }
        if (i14 != 5) {
            throw AbstractC11895b.m32003v(401445987, (C28655q) composer, false);
        }
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87150e0(401458478);
        c28655q5.m87173q(false);
        return AbstractC18249c.m52570h(C17909s.m51492j(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(AbstractC17918w0.m51517e(4279446623L))), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51517e(4284931583L)))}));
    }

    /* JADX INFO: renamed from: p */
    private static final String m128651p(EnumC40108s enumC40108s, Composer composer, int i13) {
        if (a.f173123a[enumC40108s.ordinal()] == 5) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-816946856);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62231E1);
            c28655q.m87173q(false);
            return strM92103Y;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-816944806);
        String strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62223C1);
        c28655q2.m87173q(false);
        return strM92103Y2;
    }
}
