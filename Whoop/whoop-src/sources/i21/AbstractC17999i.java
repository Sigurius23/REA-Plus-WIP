package i21;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import hb1.C17089l;
import hc3.AbstractC17176i;
import hu1.C17650g;
import hy0.C17794v;
import java.util.UUID;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y11.AbstractC39061n;
import y11.C39065r;

/* JADX INFO: renamed from: i21.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Li21/j;", "impactCardState", "Lkotlin/Function1;", "Li21/a;", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Li21/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "countText", "Li2/x;", "countColor", "", "icon", "g", "(Lcom/whoop/design/util/TextResource;JILandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17999i {
    /* JADX INFO: renamed from: g */
    public static final void m51630g(TextResource textResource, long j7, final int i13, Composer composer, final int i14, final int i15) {
        TextResource textResourceM21267a;
        int i16;
        long white50;
        final long j13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1831564506);
        if ((i14 & 6) == 0) {
            if ((i15 & 1) == 0) {
                textResourceM21267a = textResource;
                int i17 = c28655q.m87153g(textResourceM21267a) ? 4 : 2;
                i16 = i17 | i14;
            } else {
                textResourceM21267a = textResource;
            }
            i16 = i17 | i14;
        } else {
            textResourceM21267a = textResource;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            if ((i15 & 2) == 0) {
                white50 = j7;
                int i18 = c28655q.m87151f(white50) ? 32 : 16;
                i16 |= i18;
            } else {
                white50 = j7;
            }
            i16 |= i18;
        } else {
            white50 = j7;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 147) != 146)) {
            c28655q.m87140Z();
            if ((i14 & 1) == 0 || c28655q.m87118C()) {
                if ((i15 & 1) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i16 &= -15;
                }
                if ((i15 & 2) != 0) {
                    white50 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    i16 &= -113;
                }
            } else {
                c28655q.m87138X();
                if ((i15 & 1) != 0) {
                    i16 &= -15;
                }
                if ((i15 & 2) != 0) {
                    i16 &= -113;
                }
            }
            long j14 = white50;
            c28655q.m87175r();
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 4;
            int i19 = i16;
            float f14 = 1;
            float f15 = f14 * f13;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC15751g.m44455h(AbstractC1102d.m3419p(f13 * f13, c2314t), f14, j14, AbstractC33253j.m105489e(f15)), C17919x.f69636m, AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
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
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i19 >> 3) & 112) | 6), "", AbstractC1102d.m3419p(2 * f13, c2314t), j14, c28655q, ((i19 << 6) & 7168) | 432, 0);
            AbstractC17176i.m48516r(c28655q, true, c2314t, f15, c28655q);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a, c28655q, i19 & 14), null, j14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN9(), null, c28655q, (i19 << 3) & 896, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            j13 = j14;
        } else {
            c28655q.m87138X();
            j13 = white50;
        }
        final TextResource textResource2 = textResourceM21267a;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: i21.h
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC17999i.m51631h(textResource2, j13, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m51631h(TextResource textResource, long j7, int i13, int i14, int i15, Composer composer, int i16) {
        m51630g(textResource, j7, i13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:103:0x022d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0231  */
    /* JADX WARN: Code duplicated, block: B:109:0x0252  */
    /* JADX WARN: Code duplicated, block: B:113:0x026d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0276  */
    /* JADX WARN: Code duplicated, block: B:118:0x0281  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00df  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:72:0x0106  */
    /* JADX WARN: Code duplicated, block: B:74:0x0134  */
    /* JADX WARN: Code duplicated, block: B:75:0x0136  */
    /* JADX WARN: Code duplicated, block: B:84:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0157  */
    /* JADX WARN: Code duplicated, block: B:90:0x0170  */
    /* JADX WARN: Code duplicated, block: B:92:0x0175  */
    /* JADX WARN: Code duplicated, block: B:93:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:97:0x01de  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f6  */
    /* JADX INFO: renamed from: i */
    public static final void m51632i(Modifier modifier, final C18000j impactCardState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        final Function1 function4;
        InterfaceC18002l impactCardType;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(impactCardState, "impactCardState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1430099158);
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
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(impactCardState) : c28655q.m87157i(impactCardState) ? 32 : 16;
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
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C17650g(16);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                impactCardType = impactCardState.getImpactCardType();
                if (impactCardType instanceof InterfaceC18002l.a) {
                    c28655q.m87150e0(1991800904);
                    TextResource title = impactCardState.getTitle();
                    long jMo134584toComposableColorWaAFU9c = impactCardState.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    C39065r horizontalImpactBarViewState = impactCardState.getHorizontalImpactBarViewState();
                    InterfaceC18002l.a aVar = (InterfaceC18002l.a) impactCardState.getImpactCardType();
                    if ((i15 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q.m87157i(impactCardState))) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objM87133R3 = c28655q.m87133R();
                    if (z18 || objM87133R3 == c28676v0) {
                        final int i18 = 0;
                        objM87133R3 = new Function1() { // from class: i21.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i18) {
                                    case 0:
                                        return AbstractC17999i.m51634k(function4, impactCardState, (UUID) obj);
                                    default:
                                        return AbstractC17999i.m51635l(function4, impactCardState, (UUID) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    Modifier modifier5 = modifier2;
                    AbstractC17993c.m51603g(modifier5, title, jMo134584toComposableColorWaAFU9c, horizontalImpactBarViewState, aVar, (Function1) objM87133R3, c28655q, i15 & 14, 0);
                    c28655q.m87173q(false);
                    modifier2 = modifier5;
                } else {
                    modifier4 = modifier2;
                    if (impactCardType instanceof InterfaceC18002l.d) {
                        c28655q.m87150e0(1992558668);
                        Modifier modifierMo3471e = AbstractC1099a.m3394p(((float) 1.5d) * 8, c2314t).mo3471e(modifier4);
                        TextResource title2 = impactCardState.getTitle();
                        long jMo134584toComposableColorWaAFU9c2 = impactCardState.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        C39065r horizontalImpactBarViewState2 = impactCardState.getHorizontalImpactBarViewState();
                        InterfaceC18002l.d dVar = (InterfaceC18002l.d) impactCardState.getImpactCardType();
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q.m87157i(impactCardState))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (z15 || objM87133R2 == c28676v0) {
                            final int i19 = 1;
                            objM87133R2 = new Function1() { // from class: i21.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i19) {
                                        case 0:
                                            return AbstractC17999i.m51634k(function4, impactCardState, (UUID) obj);
                                        default:
                                            return AbstractC17999i.m51635l(function4, impactCardState, (UUID) obj);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifier2 = modifier4;
                        AbstractC18004n.m51674j(modifierMo3471e, title2, jMo134584toComposableColorWaAFU9c2, horizontalImpactBarViewState2, dVar, (Function1) objM87133R2, c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        modifier2 = modifier4;
                        if (impactCardType instanceof InterfaceC18002l.e) {
                            c28655q.m87150e0(1993329266);
                            AbstractC18005o.m51687e(AbstractC1099a.m3394p(((float) 1.5d) * 8, c2314t).mo3471e(modifier2), impactCardState.getTitle(), impactCardState.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0), impactCardState.getHorizontalImpactBarViewState(), (InterfaceC18002l.e) impactCardState.getImpactCardType(), null, c28655q, 0, 32);
                            c28655q.m87173q(false);
                        } else if (impactCardType instanceof InterfaceC18002l.c) {
                            c28655q.m87150e0(1993815377);
                            Modifier modifierMo3471e2 = AbstractC1099a.m3394p(((float) 1.5d) * 8, c2314t).mo3471e(modifier2);
                            TextResource title3 = impactCardState.getTitle();
                            long jMo134584toComposableColorWaAFU9c3 = impactCardState.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                            C39065r horizontalImpactBarViewState3 = impactCardState.getHorizontalImpactBarViewState();
                            InterfaceC18002l.c cVar = (InterfaceC18002l.c) impactCardState.getImpactCardType();
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C17089l(28);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC17995e.m51616e(modifierMo3471e2, title3, jMo134584toComposableColorWaAFU9c3, horizontalImpactBarViewState3, cVar, (InterfaceC4339a) objM87133R, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (impactCardType instanceof InterfaceC18002l.b) {
                                throw AbstractC11895b.m32003v(64251390, c28655q, false);
                            }
                            c28655q.m87150e0(1994300155);
                            Modifier modifierMo3471e3 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier2);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                            AbstractC39061n.m124553f(null, impactCardState.getHorizontalImpactBarViewState(), c28655q, 0, 1);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                    }
                }
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 4, modifier3, (Object) impactCardState, function3);
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
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C17650g(16);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            impactCardType = impactCardState.getImpactCardType();
            if (impactCardType instanceof InterfaceC18002l.a) {
                c28655q.m87150e0(1991800904);
                TextResource title4 = impactCardState.getTitle();
                long jMo134584toComposableColorWaAFU9c4 = impactCardState.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                C39065r horizontalImpactBarViewState4 = impactCardState.getHorizontalImpactBarViewState();
                InterfaceC18002l.a aVar2 = (InterfaceC18002l.a) impactCardState.getImpactCardType();
                if ((i15 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i15 & 112) != 32) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                z18 = z16 | z17;
                objM87133R3 = c28655q.m87133R();
                if (z18) {
                    final int i110 = 0;
                    objM87133R3 = new Function1() { // from class: i21.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i110) {
                                case 0:
                                    return AbstractC17999i.m51634k(function4, impactCardState, (UUID) obj);
                                default:
                                    return AbstractC17999i.m51635l(function4, impactCardState, (UUID) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    final int i111 = 0;
                    objM87133R3 = new Function1() { // from class: i21.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i111) {
                                case 0:
                                    return AbstractC17999i.m51634k(function4, impactCardState, (UUID) obj);
                                default:
                                    return AbstractC17999i.m51635l(function4, impactCardState, (UUID) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifier6 = modifier2;
                AbstractC17993c.m51603g(modifier6, title4, jMo134584toComposableColorWaAFU9c4, horizontalImpactBarViewState4, aVar2, (Function1) objM87133R3, c28655q, i15 & 14, 0);
                c28655q.m87173q(false);
                modifier2 = modifier6;
            } else {
                modifier4 = modifier2;
                if (impactCardType instanceof InterfaceC18002l.d) {
                    c28655q.m87150e0(1992558668);
                    Modifier modifierMo3471e4 = AbstractC1099a.m3394p(((float) 1.5d) * 8, c2314t).mo3471e(modifier4);
                    TextResource title5 = impactCardState.getTitle();
                    long jMo134584toComposableColorWaAFU9c5 = impactCardState.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    C39065r horizontalImpactBarViewState5 = impactCardState.getHorizontalImpactBarViewState();
                    InterfaceC18002l.d dVar2 = (InterfaceC18002l.d) impactCardState.getImpactCardType();
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 112) != 32) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    z15 = z13 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        final int i112 = 1;
                        objM87133R2 = new Function1() { // from class: i21.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i112) {
                                    case 0:
                                        return AbstractC17999i.m51634k(function4, impactCardState, (UUID) obj);
                                    default:
                                        return AbstractC17999i.m51635l(function4, impactCardState, (UUID) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i113 = 1;
                        objM87133R2 = new Function1() { // from class: i21.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i113) {
                                    case 0:
                                        return AbstractC17999i.m51634k(function4, impactCardState, (UUID) obj);
                                    default:
                                        return AbstractC17999i.m51635l(function4, impactCardState, (UUID) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifier2 = modifier4;
                    AbstractC18004n.m51674j(modifierMo3471e4, title5, jMo134584toComposableColorWaAFU9c5, horizontalImpactBarViewState5, dVar2, (Function1) objM87133R2, c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    modifier2 = modifier4;
                    if (impactCardType instanceof InterfaceC18002l.e) {
                        c28655q.m87150e0(1993329266);
                        AbstractC18005o.m51687e(AbstractC1099a.m3394p(((float) 1.5d) * 8, c2314t).mo3471e(modifier2), impactCardState.getTitle(), impactCardState.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0), impactCardState.getHorizontalImpactBarViewState(), (InterfaceC18002l.e) impactCardState.getImpactCardType(), null, c28655q, 0, 32);
                        c28655q.m87173q(false);
                    } else if (impactCardType instanceof InterfaceC18002l.c) {
                        c28655q.m87150e0(1993815377);
                        Modifier modifierMo3471e5 = AbstractC1099a.m3394p(((float) 1.5d) * 8, c2314t).mo3471e(modifier2);
                        TextResource title6 = impactCardState.getTitle();
                        long jMo134584toComposableColorWaAFU9c6 = impactCardState.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        C39065r horizontalImpactBarViewState6 = impactCardState.getHorizontalImpactBarViewState();
                        InterfaceC18002l.c cVar2 = (InterfaceC18002l.c) impactCardState.getImpactCardType();
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C17089l(28);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC17995e.m51616e(modifierMo3471e5, title6, jMo134584toComposableColorWaAFU9c6, horizontalImpactBarViewState6, cVar2, (InterfaceC4339a) objM87133R, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (impactCardType instanceof InterfaceC18002l.b) {
                            throw AbstractC11895b.m32003v(64251390, c28655q, false);
                        }
                        c28655q.m87150e0(1994300155);
                        Modifier modifierMo3471e6 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier2);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e6);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                        AbstractC39061n.m124553f(null, impactCardState.getHorizontalImpactBarViewState(), c28655q, 0, 1);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                }
            }
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 4, modifier3, (Object) impactCardState, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m51633j(C17991a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m51634k(Function1 function1, C18000j c18000j, UUID it) {
        AbstractC22676k.m65750j(it, "it");
        C18011u c18011uM51652i = ((InterfaceC18002l.a) c18000j.getImpactCardType()).getTagInfo();
        function1.invoke(new C17991a((c18011uM51652i != null ? c18011uM51652i.getTagType() : null) == EnumC18012v.NEW, ((InterfaceC18002l.a) c18000j.getImpactCardType()).getImpactId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m51635l(Function1 function1, C18000j c18000j, UUID it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new C17991a(false, ((InterfaceC18002l.d) c18000j.getImpactCardType()).getImpactId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m51636m() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m51637n(Modifier modifier, C18000j c18000j, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m51632i(modifier, c18000j, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
