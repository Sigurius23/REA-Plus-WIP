package ej1;

import a80.C0546j;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import c41.C4071m2;
import c41.C4092p2;
import c51.C4231h;
import c51.C4242s;
import c93.InterfaceC4339a;
import cj1.AbstractC4754j;
import cj1.C4757m;
import com.whoop.health.domain.models.HealthspanHeroMetricStyle;
import com.whoop.navigation.C9598e;
import d30.C11546l;
import e11.C12582b;
import gb1.AbstractC15673b0;
import hy0.C17749h0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23459e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p181h2.C16617b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.C22128b;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import r21.C30885c;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ej1.v */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcj1/m;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lcj1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/health/domain/models/HealthspanHeroMetricStyle;", "style", "Li2/t;", "p", "(Lcom/whoop/health/domain/models/HealthspanHeroMetricStyle;)Li2/t;", "q", "health_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13259v {

    /* JADX INFO: renamed from: ej1.v$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45916a;

        static {
            int[] iArr = new int[HealthspanHeroMetricStyle.values().length];
            try {
                iArr[HealthspanHeroMetricStyle.LOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HealthspanHeroMetricStyle.UNLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45916a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:107:0x021f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0231  */
    /* JADX WARN: Code duplicated, block: B:112:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x024c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0264  */
    /* JADX WARN: Code duplicated, block: B:118:0x0276  */
    /* JADX WARN: Code duplicated, block: B:121:0x0280  */
    /* JADX WARN: Code duplicated, block: B:124:0x020d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:64:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:68:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0113  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Code duplicated, block: B:73:0x016f  */
    /* JADX WARN: Code duplicated, block: B:76:0x017c  */
    /* JADX WARN: Code duplicated, block: B:78:0x018a  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01af  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:87:0x01be  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ef  */
    /* JADX INFO: renamed from: h */
    public static final void m37290h(Modifier modifier, C4757m itemState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier3;
        int i16;
        boolean z13;
        boolean z14;
        Object objM87133R;
        AbstractC17911t abstractC17911t;
        int iHashCode2;
        int i17;
        AbstractC17911t abstractC17911t2;
        Object objM87133R2;
        boolean zM87153g;
        Object objM87133R3;
        int i18;
        InterfaceC25312u interfaceC25312u;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(453559403);
        int i19 = i14 & 1;
        if (i19 != 0) {
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
            i15 |= c28655q.m87157i(itemState) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
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
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13251n(4);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                AbstractC17911t abstractC17911tM37298p = m37298p(itemState.getHeroMetricStyle());
                AbstractC17911t abstractC17911tM37299q = m37299q(itemState.getHeroMetricStyle());
                if (itemState.getHasAmoebaItem()) {
                    f13 = 0;
                } else {
                    f13 = 2 * 8;
                }
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier3 = modifier2;
                } else {
                    modifier3 = modifier2;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    boolean zM87157i = c28655q.m87157i(itemState);
                    i16 = i15 & 896;
                    if (i16 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i | z13;
                    objM87133R = c28655q.m87133R();
                    if (z14 || objM87133R == c28676v0) {
                        objM87133R = new C11546l(16, itemState, function4);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC17911t = abstractC17911tM37299q;
                    float f14 = 2 * 8;
                    Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1092a.m3357b(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), abstractC17911tM37298p, AbstractC33253j.m105489e(4 * 3), 0.0f, 4), f14, f13, f14, f14);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    c28655q.m87150e0(-1170428615);
                    i17 = 0;
                    for (Object obj : itemState.m14995g()) {
                        i18 = i17 + 1;
                        if (i17 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        interfaceC25312u = (InterfaceC25312u) obj;
                        if (i17 == AbstractC37056f.m118951C(itemState.m14995g())) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        C13258u c13258u = new C13258u(0, interfaceC25312u);
                        boolean zM87157i2 = c28655q.m87157i(interfaceC25312u);
                        if (i16 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = zM87157i2 | z16;
                        objM87133R4 = c28655q.m87133R();
                        if (z17 || objM87133R4 == c28676v0) {
                            objM87133R4 = new C0546j(interfaceC25312u, function4, 4);
                            c28655q.m87172p0(objM87133R4);
                        }
                        Function1 function5 = function4;
                        AbstractC17911t abstractC17911t3 = abstractC17911t;
                        AbstractC25303l.m74291r(interfaceC25312u, null, c13258u, (Function1) objM87133R4, c28655q, 0, 2);
                        if (!z15 || (interfaceC25312u instanceof C4242s)) {
                            c28655q.m87150e0(-416502771);
                            c28655q.m87173q(false);
                        } else {
                            AbstractC33745d.m106667z(c28655q, -416586378, c2314t, f14, c28655q);
                            c28655q.m87173q(false);
                        }
                        function4 = function5;
                        i17 = i18;
                        abstractC17911t = abstractC17911t3;
                    }
                    abstractC17911t2 = abstractC17911t;
                    Function1 function6 = function4;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    if (abstractC17911t2 != null) {
                        c28655q.m87150e0(-1425367909);
                        Modifier modifierMo3401b = C1100b.f4583a.mo3401b(c2314t);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13251n(5);
                            c28655q.m87172p0(objM87133R2);
                        }
                        Modifier modifierM3486a = AbstractC1127a.m3486a(modifierMo3401b, (Function1) objM87133R2);
                        zM87153g = c28655q.m87153g(abstractC17911t2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g || objM87133R3 == c28676v0) {
                            objM87133R3 = new C4231h(abstractC17911t2, 3);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC22989q.m66760a(AbstractC1125a.m3480c(modifierM3486a, (Function1) objM87133R3), c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1424178191);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function6;
                    modifier2 = modifier3;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                boolean zM87157i3 = c28655q.m87157i(itemState);
                i16 = i15 & 896;
                if (i16 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i3 | z13;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C11546l(16, itemState, function4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11546l(16, itemState, function4);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC17911t = abstractC17911tM37299q;
                float f15 = 2 * 8;
                Modifier modifierM3397s2 = AbstractC1099a.m3397s(AbstractC1092a.m3357b(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), abstractC17911tM37298p, AbstractC33253j.m105489e(4 * 3), 0.0f, 4), f15, f13, f15, f15);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3397s2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                c28655q.m87150e0(-1170428615);
                i17 = 0;
                while (r1.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    interfaceC25312u = (InterfaceC25312u) obj;
                    if (i17 == AbstractC37056f.m118951C(itemState.m14995g())) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    C13258u c13258u2 = new C13258u(0, interfaceC25312u);
                    boolean zM87157i4 = c28655q.m87157i(interfaceC25312u);
                    if (i16 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i4 | z16;
                    objM87133R4 = c28655q.m87133R();
                    if (z17) {
                        objM87133R4 = new C0546j(interfaceC25312u, function4, 4);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C0546j(interfaceC25312u, function4, 4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    Function1 function7 = function4;
                    AbstractC17911t abstractC17911t4 = abstractC17911t;
                    AbstractC25303l.m74291r(interfaceC25312u, null, c13258u2, (Function1) objM87133R4, c28655q, 0, 2);
                    if (z15) {
                        c28655q.m87150e0(-416502771);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-416502771);
                        c28655q.m87173q(false);
                    }
                    function4 = function7;
                    i17 = i18;
                    abstractC17911t = abstractC17911t4;
                }
                abstractC17911t2 = abstractC17911t;
                Function1 function8 = function4;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                if (abstractC17911t2 != null) {
                    c28655q.m87150e0(-1425367909);
                    Modifier modifierMo3401b2 = C1100b.f4583a.mo3401b(c2314t);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13251n(5);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3486a2 = AbstractC1127a.m3486a(modifierMo3401b2, (Function1) objM87133R2);
                    zM87153g = c28655q.m87153g(abstractC17911t2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C4231h(abstractC17911t2, 3);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C4231h(abstractC17911t2, 3);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC22989q.m66760a(AbstractC1125a.m3480c(modifierM3486a2, (Function1) objM87133R3), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1424178191);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function8;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 8, (Object) modifier2, (Object) itemState, (InterfaceC23459e) function3);
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
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C13251n(4);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            AbstractC17911t abstractC17911tM37298p2 = m37298p(itemState.getHeroMetricStyle());
            AbstractC17911t abstractC17911tM37299q2 = m37299q(itemState.getHeroMetricStyle());
            if (itemState.getHasAmoebaItem()) {
                f13 = 0;
            } else {
                f13 = 2 * 8;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                modifier3 = modifier2;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                boolean zM87157i5 = c28655q.m87157i(itemState);
                i16 = i15 & 896;
                if (i16 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i5 | z13;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C11546l(16, itemState, function4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11546l(16, itemState, function4);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC17911t = abstractC17911tM37299q2;
                float f16 = 2 * 8;
                Modifier modifierM3397s3 = AbstractC1099a.m3397s(AbstractC1092a.m3357b(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), abstractC17911tM37298p2, AbstractC33253j.m105489e(4 * 3), 0.0f, 4), f16, f13, f16, f16);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3397s3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                c28655q.m87150e0(-1170428615);
                i17 = 0;
                while (r1.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    interfaceC25312u = (InterfaceC25312u) obj;
                    if (i17 == AbstractC37056f.m118951C(itemState.m14995g())) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    C13258u c13258u3 = new C13258u(0, interfaceC25312u);
                    boolean zM87157i6 = c28655q.m87157i(interfaceC25312u);
                    if (i16 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i6 | z16;
                    objM87133R4 = c28655q.m87133R();
                    if (z17) {
                        objM87133R4 = new C0546j(interfaceC25312u, function4, 4);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C0546j(interfaceC25312u, function4, 4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    Function1 function9 = function4;
                    AbstractC17911t abstractC17911t5 = abstractC17911t;
                    AbstractC25303l.m74291r(interfaceC25312u, null, c13258u3, (Function1) objM87133R4, c28655q, 0, 2);
                    if (z15) {
                        c28655q.m87150e0(-416502771);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-416502771);
                        c28655q.m87173q(false);
                    }
                    function4 = function9;
                    i17 = i18;
                    abstractC17911t = abstractC17911t5;
                }
                abstractC17911t2 = abstractC17911t;
                Function1 function10 = function4;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                if (abstractC17911t2 != null) {
                    c28655q.m87150e0(-1425367909);
                    Modifier modifierMo3401b3 = C1100b.f4583a.mo3401b(c2314t);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13251n(5);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3486a3 = AbstractC1127a.m3486a(modifierMo3401b3, (Function1) objM87133R2);
                    zM87153g = c28655q.m87153g(abstractC17911t2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C4231h(abstractC17911t2, 3);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C4231h(abstractC17911t2, 3);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC22989q.m66760a(AbstractC1125a.m3480c(modifierM3486a3, (Function1) objM87133R3), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1424178191);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function10;
                modifier2 = modifier3;
            } else {
                modifier3 = modifier2;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            boolean zM87157i7 = c28655q.m87157i(itemState);
            i16 = i15 & 896;
            if (i16 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i7 | z13;
            objM87133R = c28655q.m87133R();
            if (z14) {
                objM87133R = new C11546l(16, itemState, function4);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C11546l(16, itemState, function4);
                c28655q.m87172p0(objM87133R);
            }
            abstractC17911t = abstractC17911tM37299q2;
            float f17 = 2 * 8;
            Modifier modifierM3397s4 = AbstractC1099a.m3397s(AbstractC1092a.m3357b(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), abstractC17911tM37298p2, AbstractC33253j.m105489e(4 * 3), 0.0f, 4), f17, f13, f17, f17);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3397s4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            c28655q.m87150e0(-1170428615);
            i17 = 0;
            while (r1.hasNext()) {
                i18 = i17 + 1;
                if (i17 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                interfaceC25312u = (InterfaceC25312u) obj;
                if (i17 == AbstractC37056f.m118951C(itemState.m14995g())) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                C13258u c13258u4 = new C13258u(0, interfaceC25312u);
                boolean zM87157i8 = c28655q.m87157i(interfaceC25312u);
                if (i16 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i8 | z16;
                objM87133R4 = c28655q.m87133R();
                if (z17) {
                    objM87133R4 = new C0546j(interfaceC25312u, function4, 4);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C0546j(interfaceC25312u, function4, 4);
                    c28655q.m87172p0(objM87133R4);
                }
                Function1 function11 = function4;
                AbstractC17911t abstractC17911t6 = abstractC17911t;
                AbstractC25303l.m74291r(interfaceC25312u, null, c13258u4, (Function1) objM87133R4, c28655q, 0, 2);
                if (z15) {
                    c28655q.m87150e0(-416502771);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-416502771);
                    c28655q.m87173q(false);
                }
                function4 = function11;
                i17 = i18;
                abstractC17911t = abstractC17911t6;
            }
            abstractC17911t2 = abstractC17911t;
            Function1 function12 = function4;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            if (abstractC17911t2 != null) {
                c28655q.m87150e0(-1425367909);
                Modifier modifierMo3401b4 = C1100b.f4583a.mo3401b(c2314t);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C13251n(5);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3486a4 = AbstractC1127a.m3486a(modifierMo3401b4, (Function1) objM87133R2);
                zM87153g = c28655q.m87153g(abstractC17911t2);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C4231h(abstractC17911t2, 3);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C4231h(abstractC17911t2, 3);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC22989q.m66760a(AbstractC1125a.m3480c(modifierM3486a4, (Function1) objM87133R3), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1424178191);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function3 = function12;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 8, (Object) modifier2, (Object) itemState, (InterfaceC23459e) function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m37291i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m37292j(C4757m c4757m, Function1 function1) {
        C9598e c9598eM14992c = c4757m.getDestination();
        if (c9598eM14992c != null) {
            function1.invoke(c9598eM14992c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Modifier m37293k(InterfaceC25312u interfaceC25312u, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-585686875);
        boolean z4 = interfaceC25312u instanceof C17749h0;
        Modifier modifierM3411h = C2314t.f9131w;
        if (z4) {
            modifierM3411h = AbstractC1102d.m3411h(200, modifierM3411h);
        }
        c28655q.m87173q(false);
        return modifierM3411h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m37294l(InterfaceC25312u interfaceC25312u, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if ((interfaceC25312u instanceof C30885c) || ((interfaceC25312u instanceof C4092p2) && (event instanceof C4071m2) && AbstractC22676k.m65745e(((C4092p2) interfaceC25312u).getComponentDismissalId(), "CALIBRATING_INFO_CALLOUT"))) {
            function1.invoke(AbstractC4754j.a.f19571a);
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m37295m(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51555f(1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m37296n(AbstractC17911t abstractC17911t, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        float f13 = 3;
        float fMo743q0 = c0238p0.mo743q0(4 * f13);
        InterfaceC22131e.m63376J0(drawWithContent, abstractC17911t, 0L, 0L, (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L), 0.0f, new C22135i(c0238p0.mo743q0(f13), 0.0f, 0, 0, null, 30), 214);
        C17909s c17909s = AbstractC17911t.f69612b;
        C23465k c23465k = new C23465k(Float.valueOf(0.7f), new C17919x(C17919x.f69636m));
        Float fValueOf = Float.valueOf(0.8f);
        long j7 = C17919x.f69625b;
        C23465k[] c23465kArr = {c23465k, new C23465k(fValueOf, new C17919x(j7)), new C23465k(Float.valueOf(1.0f), new C17919x(j7))};
        C22128b c22128b = c0238p0.f815w;
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51487e(c17909s, c23465kArr, C16617b.m47185a(Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)) / 2.0f, 0.0f, 0L, 2), C16617b.m47185a(c0238p0.mo743q0(25) + (Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)) / 2.0f), 0.0f, 9187343241974906880L, 2), 8), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m37297o(Modifier modifier, C4757m c4757m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m37290h(modifier, c4757m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final AbstractC17911t m37298p(HealthspanHeroMetricStyle healthspanHeroMetricStyle) {
        int i13 = a.f45916a[healthspanHeroMetricStyle.ordinal()];
        if (i13 == 1) {
            return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.0f, AbstractC17918w0.m51517e(4294942342L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4289799935L)))), 0.0f, 0.0f, 14);
        }
        if (i13 == 2) {
            return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.0f, AbstractC17918w0.m51517e(4294967295L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4294967295L)))), 0.0f, 0.0f, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: q */
    private static final AbstractC17911t m37299q(HealthspanHeroMetricStyle healthspanHeroMetricStyle) {
        int i13 = a.f45916a[healthspanHeroMetricStyle.ordinal()];
        if (i13 == 1) {
            return AbstractC15673b0.m43983F0();
        }
        if (i13 == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
