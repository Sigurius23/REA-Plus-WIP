package i21;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bu2.C3661v;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import g40.C15369i3;
import hb1.C17089l;
import hg3.AbstractC17269i;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y11.AbstractC39061n;
import y11.C39065r;

/* JADX INFO: renamed from: i21.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "title", "Li2/x;", "titleColor", "Ly11/r;", "horizontalImpactBarViewState", "Li21/l$c;", "impactCardType", "Lkotlin/Function0;", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$c;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17995e {
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x015b  */
    /* JADX WARN: Code duplicated, block: B:91:0x016a  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m51616e(Modifier modifier, TextResource textResource, long j7, C39065r horizontalImpactBarViewState, InterfaceC18002l.c impactCardType, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        TextResource textResource2;
        long jM125430y;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        TextResource textResource3;
        long j13;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        TextResource textResourceM21267a;
        Object objM87133R;
        AbstractC22676k.m65750j(horizontalImpactBarViewState, "horizontalImpactBarViewState");
        AbstractC22676k.m65750j(impactCardType, "impactCardType");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1459210015);
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
            if ((i14 & 2) == 0) {
                textResource2 = textResource;
                int i17 = c28655q2.m87153g(textResource2) ? 32 : 16;
                i15 |= i17;
            } else {
                textResource2 = textResource;
            }
            i15 |= i17;
        } else {
            textResource2 = textResource;
        }
        if ((i13 & 384) == 0) {
            jM125430y = j7;
            i15 |= ((i14 & 4) == 0 && c28655q2.m87151f(jM125430y)) ? 256 : 128;
        } else {
            jM125430y = j7;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(horizontalImpactBarViewState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87153g(impactCardType) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i18 = i14 & 32;
        if (i18 == 0) {
            if ((196608 & i13) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                    if (i16 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i14 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = textResource2;
                    }
                    if ((i14 & 4) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C17089l(27);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    }
                } else {
                    c28655q2.m87138X();
                    modifier4 = modifier2;
                    textResourceM21267a = textResource2;
                }
                long j14 = jM125430y;
                c28655q2.m87175r();
                C33252i c33252iM105489e = AbstractC33253j.m105489e(1 * 4);
                C38072d c38072d = C38072d.f163053a;
                TextResource textResource4 = textResourceM21267a;
                modifier3 = modifier4;
                InterfaceC4339a interfaceC4339a4 = interfaceC4339a2;
                c28655q = c28655q2;
                AbstractC12889b.m36263b(null, c33252iM105489e, c38072d.m121949b(c28655q2, 6).getTransparent(), AbstractC17269i.m48880a(2, c38072d.m121949b(c28655q2, 6).getWhite20()), 0, AbstractC37817c.m121344e(3747696, c28655q2, new C17994d(modifier3, interfaceC4339a4, textResource4, j14, impactCardType, horizontalImpactBarViewState, 0)), c28655q, 1769472, 9);
                interfaceC4339a3 = interfaceC4339a4;
                textResource3 = textResource4;
                j13 = j14;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                textResource3 = textResource2;
                j13 = jM125430y;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3661v(modifier3, textResource3, j13, horizontalImpactBarViewState, impactCardType, interfaceC4339a3, i13, i14, 2);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a2 = interfaceC4339a;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i14 & 2) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a = textResource2;
                }
                if ((i14 & 4) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C17089l(27);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                }
            } else {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i14 & 2) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a = textResource2;
                }
                if ((i14 & 4) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C17089l(27);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                }
            }
            long j15 = jM125430y;
            c28655q2.m87175r();
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(1 * 4);
            C38072d c38072d2 = C38072d.f163053a;
            TextResource textResource5 = textResourceM21267a;
            modifier3 = modifier4;
            InterfaceC4339a interfaceC4339a5 = interfaceC4339a2;
            c28655q = c28655q2;
            AbstractC12889b.m36263b(null, c33252iM105489e2, c38072d2.m121949b(c28655q2, 6).getTransparent(), AbstractC17269i.m48880a(2, c38072d2.m121949b(c28655q2, 6).getWhite20()), 0, AbstractC37817c.m121344e(3747696, c28655q2, new C17994d(modifier3, interfaceC4339a5, textResource5, j15, impactCardType, horizontalImpactBarViewState, 0)), c28655q, 1769472, 9);
            interfaceC4339a3 = interfaceC4339a5;
            textResource3 = textResource5;
            j13 = j15;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            textResource3 = textResource2;
            j13 = jM125430y;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3661v(modifier3, textResource3, j13, horizontalImpactBarViewState, impactCardType, interfaceC4339a3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m51617f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m51618g(Modifier modifier, InterfaceC4339a interfaceC4339a, TextResource textResource, long j7, InterfaceC18002l.c cVar, C39065r c39065r, Composer composer, int i13) {
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C15369i3(interfaceC4339a, 21);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            C22949e c22949e = AbstractC22977m.f90650a;
            C2306l c2306l = C2299e.f9107J;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            if (3.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(3.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 3.0f, true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, C2299e.f9112O, c28655q, 48);
            int iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j = c0213j2;
                c28655q.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
            C0213j c0213j3 = c0213j;
            AbstractC30795n.m94707h("--%", null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN9(), null, c28655q, 6, 0, 196602);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            float f13 = 1 * 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 0);
            int iHashCode6 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m6);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
                AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N6);
            C0209i c0209i6 = c0209i;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubTitle(), c28655q, 0), null, cVar.getSubTitleColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
            AbstractC25012a.m73389v(c2314t, f13, c28655q, true);
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 0);
            int iHashCode7 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m7);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode7))) {
                AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N7);
            AbstractC39061n.m124553f(null, c39065r, c28655q, 0, 1);
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m51619h(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m51620i(Modifier modifier, TextResource textResource, long j7, C39065r c39065r, InterfaceC18002l.c cVar, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m51616e(modifier, textResource, j7, c39065r, cVar, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
