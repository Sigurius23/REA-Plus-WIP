package xi0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.runtime.Composer;
import b01.C2190k;
import c51.C4224b;
import gb1.AbstractC15674c;
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
import p026b2.C2307m;
import p026b2.C2314t;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23001u;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.C39180l;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;
import wo1.C37450h;
import xa0.C38136a;

/* JADX INFO: renamed from: xi0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\u001aG\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0011\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0014\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, m65681d2 = {"Ll0/u;", "Lkd1/o;", "imageSource", "Ly3/f;", "maxHeight", "", "scrollOffset", "Lkotlin/Function1;", "", "Ll83/a0;", "onHeightChanged", "f", "(Ll0/u;Lkd1/o;Ly3/f;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "a", "F", "getBACKGROUND_IMAGE_FADE_HEIGHT", "()F", "BACKGROUND_IMAGE_FADE_HEIGHT", "b", "l", "HERO_IMAGE_MAX_HEIGHT", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38319a {

    /* JADX INFO: renamed from: a */
    private static final float f164206a = 150 * 4;

    /* JADX INFO: renamed from: b */
    private static final float f164207b = 560;

    /* JADX WARN: Code duplicated, block: B:100:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:112:0x0218  */
    /* JADX WARN: Code duplicated, block: B:115:0x0226  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x010e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0110  */
    /* JADX WARN: Code duplicated, block: B:81:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x0119  */
    /* JADX WARN: Code duplicated, block: B:85:0x014b  */
    /* JADX WARN: Code duplicated, block: B:86:0x014f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0162  */
    /* JADX WARN: Code duplicated, block: B:91:0x0170  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01be  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c7 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: f */
    public static final void m122792f(InterfaceC23001u TemplateBackgroundImage, AbstractC22403o imageSource, C39174f c39174f, float f13, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        C39174f c39174f2;
        int i16;
        int i17;
        int i18;
        Function1 function2;
        int i19;
        int i24;
        boolean z4;
        C28655q c28655q;
        float f14;
        Function1 function3;
        C39174f c39174f3;
        C28677v1 c28677v1M87180u;
        float f15;
        C28676v0 c28676v0;
        float f16;
        AbstractC26165a abstractC26165aM64500i;
        C2314t c2314t;
        float f17;
        Function1 function4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        Object objM87133R2;
        boolean z15;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R4;
        C2307m c2307m = C2299e.f9115x;
        AbstractC22676k.m65750j(TemplateBackgroundImage, "$this$TemplateBackgroundImage");
        AbstractC22676k.m65750j(imageSource, "imageSource");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(747158591);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(TemplateBackgroundImage) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(imageSource) : c28655q2.m87157i(imageSource) ? 32 : 16;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                c39174f2 = c39174f;
                i15 |= c28655q2.m87153g(c39174f2) ? 256 : 128;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q2.m87147d(f13)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        function2 = function1;
                        if (c28655q2.m87157i(function2)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    i24 = i15;
                    if ((i24 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i24 & 1, z4)) {
                        if (i25 != 0) {
                            c39174f2 = null;
                        } else {
                            c39174f2 = c39174f2;
                        }
                        if (i16 != 0) {
                            f15 = 0.0f;
                        } else {
                            f15 = f13;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C38136a(19);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            function2 = (Function1) objM87133R4;
                        }
                        f16 = f15;
                        abstractC26165aM64500i = AbstractC22404p.m64500i(imageSource, null, null, c28655q2, AbstractC22403o.f87638a | ((i24 >> 3) & 14), 3);
                        c2314t = C2314t.f9131w;
                        if (c39174f2 != null) {
                            float f18 = c39174f2.f168413w;
                            c28655q2.m87150e0(2081322157);
                            Modifier modifierM44081e = AbstractC15674c.m44081e(AbstractC1102d.m3413j(TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m), 0.0f, f18, 1), f18 * 0.5f);
                            if ((i24 & 7168) == 2048) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R3 = c28655q2.m87133R();
                            if (z15 || objM87133R3 == c28676v0) {
                                objM87133R3 = new C2190k(f16, 7);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM44081e, (Function1) objM87133R3);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3486a);
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
                            function4 = function2;
                            f17 = f16;
                            AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1102d.m3409f(1.0f, c2314t), C2299e.f9102E, C39102j.f168199a, 0.0f, null, c28655q2, 28080, 96);
                            c28655q = c28655q2;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            f17 = f16;
                            function4 = function2;
                            z13 = true;
                            c28655q2.m87150e0(2081917109);
                            Modifier modifierMo3400a = TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m);
                            if ((57344 & i24) == 16384) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R = c28655q2.m87133R();
                            if (z14 || objM87133R == c28676v0) {
                                objM87133R = new C37450h(function4, 14);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Modifier modifierM44081e2 = AbstractC15674c.m44081e(AbstractC1132b.m3502b(modifierMo3400a, (Function1) objM87133R), f164206a);
                            if ((i24 & 7168) != 2048) {
                                z13 = false;
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z13 || objM87133R2 == c28676v0) {
                                objM87133R2 = new C2190k(f17, 8);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1127a.m3486a(modifierM44081e2, (Function1) objM87133R2), null, C39102j.f168202d, 0.0f, null, c28655q2, 24624, 104);
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                        }
                        f14 = f17;
                        function3 = function4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        f14 = f13;
                        function3 = function2;
                    }
                    c39174f3 = c39174f2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C4224b(TemplateBackgroundImage, imageSource, c39174f3, f14, function3, i13, i14);
                    }
                }
                i15 |= 24576;
                function2 = function1;
                i24 = i15;
                if ((i24 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i24 & 1, z4)) {
                    if (i25 != 0) {
                        c39174f2 = null;
                    } else {
                        c39174f2 = c39174f2;
                    }
                    if (i16 != 0) {
                        f15 = 0.0f;
                    } else {
                        f15 = f13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C38136a(19);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function2 = (Function1) objM87133R4;
                    }
                    f16 = f15;
                    abstractC26165aM64500i = AbstractC22404p.m64500i(imageSource, null, null, c28655q2, AbstractC22403o.f87638a | ((i24 >> 3) & 14), 3);
                    c2314t = C2314t.f9131w;
                    if (c39174f2 != null) {
                        float f19 = c39174f2.f168413w;
                        c28655q2.m87150e0(2081322157);
                        Modifier modifierM44081e3 = AbstractC15674c.m44081e(AbstractC1102d.m3413j(TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m), 0.0f, f19, 1), f19 * 0.5f);
                        if ((i24 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R3 = c28655q2.m87133R();
                        if (z15) {
                            objM87133R3 = new C2190k(f16, 7);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C2190k(f16, 7);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        Modifier modifierM3486a2 = AbstractC1127a.m3486a(modifierM44081e3, (Function1) objM87133R3);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3486a2);
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
                        function4 = function2;
                        f17 = f16;
                        AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1102d.m3409f(1.0f, c2314t), C2299e.f9102E, C39102j.f168199a, 0.0f, null, c28655q2, 28080, 96);
                        c28655q = c28655q2;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        f17 = f16;
                        function4 = function2;
                        z13 = true;
                        c28655q2.m87150e0(2081917109);
                        Modifier modifierMo3400a2 = TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m);
                        if ((57344 & i24) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C37450h(function4, 14);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C37450h(function4, 14);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Modifier modifierM44081e4 = AbstractC15674c.m44081e(AbstractC1132b.m3502b(modifierMo3400a2, (Function1) objM87133R), f164206a);
                        if ((i24 & 7168) != 2048) {
                            z13 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z13) {
                            objM87133R2 = new C2190k(f17, 8);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C2190k(f17, 8);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1127a.m3486a(modifierM44081e4, (Function1) objM87133R2), null, C39102j.f168202d, 0.0f, null, c28655q2, 24624, 104);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    }
                    f14 = f17;
                    function3 = function4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    f14 = f13;
                    function3 = function2;
                }
                c39174f3 = c39174f2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4224b(TemplateBackgroundImage, imageSource, c39174f3, f14, function3, i13, i14);
                }
            }
            i15 |= 3072;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i15;
                if ((i24 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i24 & 1, z4)) {
                    if (i25 != 0) {
                        c39174f2 = null;
                    } else {
                        c39174f2 = c39174f2;
                    }
                    if (i16 != 0) {
                        f15 = 0.0f;
                    } else {
                        f15 = f13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C38136a(19);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function2 = (Function1) objM87133R4;
                    }
                    f16 = f15;
                    abstractC26165aM64500i = AbstractC22404p.m64500i(imageSource, null, null, c28655q2, AbstractC22403o.f87638a | ((i24 >> 3) & 14), 3);
                    c2314t = C2314t.f9131w;
                    if (c39174f2 != null) {
                        float f110 = c39174f2.f168413w;
                        c28655q2.m87150e0(2081322157);
                        Modifier modifierM44081e5 = AbstractC15674c.m44081e(AbstractC1102d.m3413j(TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m), 0.0f, f110, 1), f110 * 0.5f);
                        if ((i24 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R3 = c28655q2.m87133R();
                        if (z15) {
                            objM87133R3 = new C2190k(f16, 7);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C2190k(f16, 7);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        Modifier modifierM3486a3 = AbstractC1127a.m3486a(modifierM44081e5, (Function1) objM87133R3);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3486a3);
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
                        function4 = function2;
                        f17 = f16;
                        AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1102d.m3409f(1.0f, c2314t), C2299e.f9102E, C39102j.f168199a, 0.0f, null, c28655q2, 28080, 96);
                        c28655q = c28655q2;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        f17 = f16;
                        function4 = function2;
                        z13 = true;
                        c28655q2.m87150e0(2081917109);
                        Modifier modifierMo3400a3 = TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m);
                        if ((57344 & i24) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C37450h(function4, 14);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C37450h(function4, 14);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Modifier modifierM44081e6 = AbstractC15674c.m44081e(AbstractC1132b.m3502b(modifierMo3400a3, (Function1) objM87133R), f164206a);
                        if ((i24 & 7168) != 2048) {
                            z13 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z13) {
                            objM87133R2 = new C2190k(f17, 8);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C2190k(f17, 8);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1127a.m3486a(modifierM44081e6, (Function1) objM87133R2), null, C39102j.f168202d, 0.0f, null, c28655q2, 24624, 104);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    }
                    f14 = f17;
                    function3 = function4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    f14 = f13;
                    function3 = function2;
                }
                c39174f3 = c39174f2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4224b(TemplateBackgroundImage, imageSource, c39174f3, f14, function3, i13, i14);
                }
            }
            i15 |= 24576;
            function2 = function1;
            i24 = i15;
            if ((i24 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z4)) {
                if (i25 != 0) {
                    c39174f2 = null;
                } else {
                    c39174f2 = c39174f2;
                }
                if (i16 != 0) {
                    f15 = 0.0f;
                } else {
                    f15 = f13;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C38136a(19);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function2 = (Function1) objM87133R4;
                }
                f16 = f15;
                abstractC26165aM64500i = AbstractC22404p.m64500i(imageSource, null, null, c28655q2, AbstractC22403o.f87638a | ((i24 >> 3) & 14), 3);
                c2314t = C2314t.f9131w;
                if (c39174f2 != null) {
                    float f111 = c39174f2.f168413w;
                    c28655q2.m87150e0(2081322157);
                    Modifier modifierM44081e7 = AbstractC15674c.m44081e(AbstractC1102d.m3413j(TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m), 0.0f, f111, 1), f111 * 0.5f);
                    if ((i24 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z15) {
                        objM87133R3 = new C2190k(f16, 7);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C2190k(f16, 7);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3486a4 = AbstractC1127a.m3486a(modifierM44081e7, (Function1) objM87133R3);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3486a4);
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
                    function4 = function2;
                    f17 = f16;
                    AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1102d.m3409f(1.0f, c2314t), C2299e.f9102E, C39102j.f168199a, 0.0f, null, c28655q2, 28080, 96);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    f17 = f16;
                    function4 = function2;
                    z13 = true;
                    c28655q2.m87150e0(2081917109);
                    Modifier modifierMo3400a4 = TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m);
                    if ((57344 & i24) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C37450h(function4, 14);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C37450h(function4, 14);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Modifier modifierM44081e8 = AbstractC15674c.m44081e(AbstractC1132b.m3502b(modifierMo3400a4, (Function1) objM87133R), f164206a);
                    if ((i24 & 7168) != 2048) {
                        z13 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z13) {
                        objM87133R2 = new C2190k(f17, 8);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C2190k(f17, 8);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1127a.m3486a(modifierM44081e8, (Function1) objM87133R2), null, C39102j.f168202d, 0.0f, null, c28655q2, 24624, 104);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                f14 = f17;
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                f14 = f13;
                function3 = function2;
            }
            c39174f3 = c39174f2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4224b(TemplateBackgroundImage, imageSource, c39174f3, f14, function3, i13, i14);
            }
        }
        i15 |= 384;
        c39174f2 = c39174f;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87147d(f13)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i15;
                if ((i24 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i24 & 1, z4)) {
                    if (i25 != 0) {
                        c39174f2 = null;
                    } else {
                        c39174f2 = c39174f2;
                    }
                    if (i16 != 0) {
                        f15 = 0.0f;
                    } else {
                        f15 = f13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C38136a(19);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function2 = (Function1) objM87133R4;
                    }
                    f16 = f15;
                    abstractC26165aM64500i = AbstractC22404p.m64500i(imageSource, null, null, c28655q2, AbstractC22403o.f87638a | ((i24 >> 3) & 14), 3);
                    c2314t = C2314t.f9131w;
                    if (c39174f2 != null) {
                        float f112 = c39174f2.f168413w;
                        c28655q2.m87150e0(2081322157);
                        Modifier modifierM44081e9 = AbstractC15674c.m44081e(AbstractC1102d.m3413j(TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m), 0.0f, f112, 1), f112 * 0.5f);
                        if ((i24 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R3 = c28655q2.m87133R();
                        if (z15) {
                            objM87133R3 = new C2190k(f16, 7);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C2190k(f16, 7);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        Modifier modifierM3486a5 = AbstractC1127a.m3486a(modifierM44081e9, (Function1) objM87133R3);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3486a5);
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
                        function4 = function2;
                        f17 = f16;
                        AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1102d.m3409f(1.0f, c2314t), C2299e.f9102E, C39102j.f168199a, 0.0f, null, c28655q2, 28080, 96);
                        c28655q = c28655q2;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        f17 = f16;
                        function4 = function2;
                        z13 = true;
                        c28655q2.m87150e0(2081917109);
                        Modifier modifierMo3400a5 = TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m);
                        if ((57344 & i24) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C37450h(function4, 14);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C37450h(function4, 14);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Modifier modifierM44081e10 = AbstractC15674c.m44081e(AbstractC1132b.m3502b(modifierMo3400a5, (Function1) objM87133R), f164206a);
                        if ((i24 & 7168) != 2048) {
                            z13 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z13) {
                            objM87133R2 = new C2190k(f17, 8);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C2190k(f17, 8);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1127a.m3486a(modifierM44081e10, (Function1) objM87133R2), null, C39102j.f168202d, 0.0f, null, c28655q2, 24624, 104);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    }
                    f14 = f17;
                    function3 = function4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    f14 = f13;
                    function3 = function2;
                }
                c39174f3 = c39174f2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4224b(TemplateBackgroundImage, imageSource, c39174f3, f14, function3, i13, i14);
                }
            }
            i15 |= 24576;
            function2 = function1;
            i24 = i15;
            if ((i24 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z4)) {
                if (i25 != 0) {
                    c39174f2 = null;
                } else {
                    c39174f2 = c39174f2;
                }
                if (i16 != 0) {
                    f15 = 0.0f;
                } else {
                    f15 = f13;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C38136a(19);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function2 = (Function1) objM87133R4;
                }
                f16 = f15;
                abstractC26165aM64500i = AbstractC22404p.m64500i(imageSource, null, null, c28655q2, AbstractC22403o.f87638a | ((i24 >> 3) & 14), 3);
                c2314t = C2314t.f9131w;
                if (c39174f2 != null) {
                    float f113 = c39174f2.f168413w;
                    c28655q2.m87150e0(2081322157);
                    Modifier modifierM44081e11 = AbstractC15674c.m44081e(AbstractC1102d.m3413j(TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m), 0.0f, f113, 1), f113 * 0.5f);
                    if ((i24 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z15) {
                        objM87133R3 = new C2190k(f16, 7);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C2190k(f16, 7);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3486a6 = AbstractC1127a.m3486a(modifierM44081e11, (Function1) objM87133R3);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3486a6);
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
                    function4 = function2;
                    f17 = f16;
                    AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1102d.m3409f(1.0f, c2314t), C2299e.f9102E, C39102j.f168199a, 0.0f, null, c28655q2, 28080, 96);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    f17 = f16;
                    function4 = function2;
                    z13 = true;
                    c28655q2.m87150e0(2081917109);
                    Modifier modifierMo3400a6 = TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m);
                    if ((57344 & i24) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C37450h(function4, 14);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C37450h(function4, 14);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Modifier modifierM44081e12 = AbstractC15674c.m44081e(AbstractC1132b.m3502b(modifierMo3400a6, (Function1) objM87133R), f164206a);
                    if ((i24 & 7168) != 2048) {
                        z13 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z13) {
                        objM87133R2 = new C2190k(f17, 8);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C2190k(f17, 8);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1127a.m3486a(modifierM44081e12, (Function1) objM87133R2), null, C39102j.f168202d, 0.0f, null, c28655q2, 24624, 104);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                f14 = f17;
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                f14 = f13;
                function3 = function2;
            }
            c39174f3 = c39174f2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4224b(TemplateBackgroundImage, imageSource, c39174f3, f14, function3, i13, i14);
            }
        }
        i15 |= 3072;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i15;
            if ((i24 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z4)) {
                if (i25 != 0) {
                    c39174f2 = null;
                } else {
                    c39174f2 = c39174f2;
                }
                if (i16 != 0) {
                    f15 = 0.0f;
                } else {
                    f15 = f13;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C38136a(19);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function2 = (Function1) objM87133R4;
                }
                f16 = f15;
                abstractC26165aM64500i = AbstractC22404p.m64500i(imageSource, null, null, c28655q2, AbstractC22403o.f87638a | ((i24 >> 3) & 14), 3);
                c2314t = C2314t.f9131w;
                if (c39174f2 != null) {
                    float f114 = c39174f2.f168413w;
                    c28655q2.m87150e0(2081322157);
                    Modifier modifierM44081e13 = AbstractC15674c.m44081e(AbstractC1102d.m3413j(TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m), 0.0f, f114, 1), f114 * 0.5f);
                    if ((i24 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z15) {
                        objM87133R3 = new C2190k(f16, 7);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C2190k(f16, 7);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3486a7 = AbstractC1127a.m3486a(modifierM44081e13, (Function1) objM87133R3);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3486a7);
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
                    function4 = function2;
                    f17 = f16;
                    AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1102d.m3409f(1.0f, c2314t), C2299e.f9102E, C39102j.f168199a, 0.0f, null, c28655q2, 28080, 96);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    f17 = f16;
                    function4 = function2;
                    z13 = true;
                    c28655q2.m87150e0(2081917109);
                    Modifier modifierMo3400a7 = TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m);
                    if ((57344 & i24) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C37450h(function4, 14);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C37450h(function4, 14);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Modifier modifierM44081e14 = AbstractC15674c.m44081e(AbstractC1132b.m3502b(modifierMo3400a7, (Function1) objM87133R), f164206a);
                    if ((i24 & 7168) != 2048) {
                        z13 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z13) {
                        objM87133R2 = new C2190k(f17, 8);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C2190k(f17, 8);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1127a.m3486a(modifierM44081e14, (Function1) objM87133R2), null, C39102j.f168202d, 0.0f, null, c28655q2, 24624, 104);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                f14 = f17;
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                f14 = f13;
                function3 = function2;
            }
            c39174f3 = c39174f2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4224b(TemplateBackgroundImage, imageSource, c39174f3, f14, function3, i13, i14);
            }
        }
        i15 |= 24576;
        function2 = function1;
        i24 = i15;
        if ((i24 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i24 & 1, z4)) {
            if (i25 != 0) {
                c39174f2 = null;
            } else {
                c39174f2 = c39174f2;
            }
            if (i16 != 0) {
                f15 = 0.0f;
            } else {
                f15 = f13;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C38136a(19);
                    c28655q2.m87172p0(objM87133R4);
                }
                function2 = (Function1) objM87133R4;
            }
            f16 = f15;
            abstractC26165aM64500i = AbstractC22404p.m64500i(imageSource, null, null, c28655q2, AbstractC22403o.f87638a | ((i24 >> 3) & 14), 3);
            c2314t = C2314t.f9131w;
            if (c39174f2 != null) {
                float f115 = c39174f2.f168413w;
                c28655q2.m87150e0(2081322157);
                Modifier modifierM44081e15 = AbstractC15674c.m44081e(AbstractC1102d.m3413j(TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m), 0.0f, f115, 1), f115 * 0.5f);
                if ((i24 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z15) {
                    objM87133R3 = new C2190k(f16, 7);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C2190k(f16, 7);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierM3486a8 = AbstractC1127a.m3486a(modifierM44081e15, (Function1) objM87133R3);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3486a8);
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
                function4 = function2;
                f17 = f16;
                AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1102d.m3409f(1.0f, c2314t), C2299e.f9102E, C39102j.f168199a, 0.0f, null, c28655q2, 28080, 96);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                f17 = f16;
                function4 = function2;
                z13 = true;
                c28655q2.m87150e0(2081917109);
                Modifier modifierMo3400a8 = TemplateBackgroundImage.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m);
                if ((57344 & i24) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z14) {
                    objM87133R = new C37450h(function4, 14);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C37450h(function4, 14);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM44081e16 = AbstractC15674c.m44081e(AbstractC1132b.m3502b(modifierMo3400a8, (Function1) objM87133R), f164206a);
                if ((i24 & 7168) != 2048) {
                    z13 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z13) {
                    objM87133R2 = new C2190k(f17, 8);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C2190k(f17, 8);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1127a.m3486a(modifierM44081e16, (Function1) objM87133R2), null, C39102j.f168202d, 0.0f, null, c28655q2, 24624, 104);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            f14 = f17;
            function3 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            f14 = f13;
            function3 = function2;
        }
        c39174f3 = c39174f2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4224b(TemplateBackgroundImage, imageSource, c39174f3, f14, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m122793g(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m122794h(float f13, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51550E(-f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m122795i(Function1 function1, C39180l c39180l) {
        function1.invoke(Integer.valueOf((int) (c39180l.f168422a & 4294967295L)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m122796j(float f13, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51550E(-f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m122797k(InterfaceC23001u interfaceC23001u, AbstractC22403o abstractC22403o, C39174f c39174f, float f13, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m122792f(interfaceC23001u, abstractC22403o, c39174f, f13, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final float m122798l() {
        return f164207b;
    }
}
