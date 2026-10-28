package k51;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2165f;
import c41.C4104r0;
import c41.C4118t0;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import jp1.C21862n;
import jp2.C21875f;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: k51.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "icon", "Lcom/whoop/design/util/TextResource;", "title", "body", "Lc41/t0;", "coachingCtaTileState", "Lkotlin/Function1;", "", "Ll83/a0;", "onCoachingCtaTileClicked", "d", "(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/t0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22203b {
    /* JADX WARN: Code duplicated, block: B:103:0x0201  */
    /* JADX WARN: Code duplicated, block: B:106:0x020e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0210  */
    /* JADX WARN: Code duplicated, block: B:110:0x028e  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:122:0x02db  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x011b  */
    /* JADX WARN: Code duplicated, block: B:79:0x011f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0132  */
    /* JADX WARN: Code duplicated, block: B:85:0x0143  */
    /* JADX WARN: Code duplicated, block: B:89:0x0183  */
    /* JADX WARN: Code duplicated, block: B:90:0x0187  */
    /* JADX WARN: Code duplicated, block: B:93:0x0194  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e0  */
    /* JADX INFO: renamed from: d */
    public static final void m63669d(Modifier modifier, Integer num, TextResource title, TextResource body, C4118t0 c4118t0, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C4118t0 c4118t1;
        int i16;
        int i17;
        int i18;
        boolean z4;
        Modifier modifier3;
        C4118t0 c4118t2;
        Function1 function2;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C4118t0 c4118t3;
        C28676v0 c28676v0;
        Function1 function3;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28676v0 c28676v1;
        int iHashCode2;
        float f14;
        int i19;
        int i24;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(49881875);
        int i25 = i14 & 1;
        if (i25 != 0) {
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
            i15 |= c28655q.m87153g(num) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(title) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(body) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i26 = i14 & 16;
        if (i26 == 0) {
            if ((i13 & 24576) == 0) {
                c4118t1 = c4118t0;
                i15 |= c28655q.m87157i(c4118t1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i18 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i26 != 0) {
                        c4118t3 = null;
                    } else {
                        c4118t3 = c4118t1;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C21875f(20);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    } else {
                        function3 = function1;
                    }
                    float f15 = 1;
                    f13 = 4;
                    Modifier modifierMo3471e = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15 * f13, 0.0f, 2).mo3471e(modifier2);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    Modifier modifier4 = modifier2;
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
                    if (c28655q.f115903S) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        float f16 = 8;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15 * f16, 7);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                        c28655q.m87158i0();
                        function2 = function3;
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
                        if (num != null) {
                            c28655q.m87150e0(269983983);
                            f14 = 1.0f;
                            i19 = 0;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num.intValue(), c28655q, (i18 & 112) | 6), null, AbstractC1102d.m3419p(6 * f13, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                            c28655q.m87173q(false);
                        } else {
                            f14 = 1.0f;
                            i19 = 0;
                            c28655q.m87150e0(270238121);
                            c28655q.m87173q(false);
                        }
                        String strM21274h = AbstractC8693b.m21274h(title, c28655q, (i18 >> 6) & 14);
                        if (f14 <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f14, true);
                        if (num == null) {
                            i24 = i19;
                        } else {
                            i24 = 1;
                        }
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(layoutWeightElement, i24 * f16, 0.0f, 0.0f, 0.0f, 14);
                        C38072d c38072d = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h, modifierM3398t2, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196600);
                        c28655q.m87173q(true);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(body, c28655q, (i18 >> 9) & 14), null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        if (c4118t3 != null) {
                            AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 1119229210, f13, f13, c2314t));
                            C4104r0 c4104r0 = new C4104r0();
                            if ((i18 & 458752) == 131072) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z13 || objM87133R == c28676v1) {
                                objM87133R = new C21862n(function2, 11);
                                c28655q.m87172p0(objM87133R);
                            }
                            c4104r0.Compose(c4118t3, (Function1) objM87133R, c28655q, (i18 >> 12) & 14);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1119424293);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c4118t2 = c4118t3;
                        modifier3 = modifier4;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                    float f17 = 8;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15 * f17, 7);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                    c28655q.m87158i0();
                    function2 = function3;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                    if (num != null) {
                        c28655q.m87150e0(269983983);
                        f14 = 1.0f;
                        i19 = 0;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num.intValue(), c28655q, (i18 & 112) | 6), null, AbstractC1102d.m3419p(6 * f13, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        c28655q.m87173q(false);
                    } else {
                        f14 = 1.0f;
                        i19 = 0;
                        c28655q.m87150e0(270238121);
                        c28655q.m87173q(false);
                    }
                    String strM21274h2 = AbstractC8693b.m21274h(title, c28655q, (i18 >> 6) & 14);
                    if (f14 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f14, true);
                    if (num == null) {
                        i24 = i19;
                    } else {
                        i24 = 1;
                    }
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(layoutWeightElement2, i24 * f17, 0.0f, 0.0f, 0.0f, 14);
                    C38072d c38072d2 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h2, modifierM3398t4, c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196600);
                    c28655q.m87173q(true);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(body, c28655q, (i18 >> 9) & 14), null, c38072d2.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    if (c4118t3 != null) {
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 1119229210, f13, f13, c2314t));
                        C4104r0 c4104r1 = new C4104r0();
                        if ((i18 & 458752) == 131072) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C21862n(function2, 11);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C21862n(function2, 11);
                            c28655q.m87172p0(objM87133R);
                        }
                        c4104r1.Compose(c4118t3, (Function1) objM87133R, c28655q, (i18 >> 12) & 14);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1119424293);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c4118t2 = c4118t3;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    c4118t2 = c4118t1;
                    function2 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(modifier3, (Object) num, (Object) title, (Object) body, (Object) c4118t2, function2, i13, i14, 16);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i18 = i15;
            if ((i18 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                if (i26 != 0) {
                    c4118t3 = null;
                } else {
                    c4118t3 = c4118t1;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C21875f(20);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function1;
                }
                float f18 = 1;
                f13 = 4;
                Modifier modifierMo3471e2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f18 * f13, 0.0f, 2).mo3471e(modifier2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                Modifier modifier5 = modifier2;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    c28676v1 = c28676v0;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                    float f19 = 8;
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f18 * f19, 7);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
                    c28655q.m87158i0();
                    function2 = function3;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                    if (num != null) {
                        c28655q.m87150e0(269983983);
                        f14 = 1.0f;
                        i19 = 0;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num.intValue(), c28655q, (i18 & 112) | 6), null, AbstractC1102d.m3419p(6 * f13, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        c28655q.m87173q(false);
                    } else {
                        f14 = 1.0f;
                        i19 = 0;
                        c28655q.m87150e0(270238121);
                        c28655q.m87173q(false);
                    }
                    String strM21274h3 = AbstractC8693b.m21274h(title, c28655q, (i18 >> 6) & 14);
                    if (f14 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f14, true);
                    if (num == null) {
                        i24 = i19;
                    } else {
                        i24 = 1;
                    }
                    Modifier modifierM3398t6 = AbstractC1099a.m3398t(layoutWeightElement3, i24 * f19, 0.0f, 0.0f, 0.0f, 14);
                    C38072d c38072d3 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h3, modifierM3398t6, c38072d3.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196600);
                    c28655q.m87173q(true);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(body, c28655q, (i18 >> 9) & 14), null, c38072d3.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    if (c4118t3 != null) {
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 1119229210, f13, f13, c2314t));
                        C4104r0 c4104r2 = new C4104r0();
                        if ((i18 & 458752) == 131072) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C21862n(function2, 11);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C21862n(function2, 11);
                            c28655q.m87172p0(objM87133R);
                        }
                        c4104r2.Compose(c4118t3, (Function1) objM87133R, c28655q, (i18 >> 12) & 14);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1119424293);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c4118t2 = c4118t3;
                    modifier3 = modifier5;
                } else {
                    c28676v1 = c28676v0;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                float f110 = 8;
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f18 * f110, 7);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3398t7);
                c28655q.m87158i0();
                function2 = function3;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                if (num != null) {
                    c28655q.m87150e0(269983983);
                    f14 = 1.0f;
                    i19 = 0;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num.intValue(), c28655q, (i18 & 112) | 6), null, AbstractC1102d.m3419p(6 * f13, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                } else {
                    f14 = 1.0f;
                    i19 = 0;
                    c28655q.m87150e0(270238121);
                    c28655q.m87173q(false);
                }
                String strM21274h4 = AbstractC8693b.m21274h(title, c28655q, (i18 >> 6) & 14);
                if (f14 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(f14, true);
                if (num == null) {
                    i24 = i19;
                } else {
                    i24 = 1;
                }
                Modifier modifierM3398t8 = AbstractC1099a.m3398t(layoutWeightElement4, i24 * f110, 0.0f, 0.0f, 0.0f, 14);
                C38072d c38072d4 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h4, modifierM3398t8, c38072d4.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196600);
                c28655q.m87173q(true);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(body, c28655q, (i18 >> 9) & 14), null, c38072d4.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                if (c4118t3 != null) {
                    AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 1119229210, f13, f13, c2314t));
                    C4104r0 c4104r3 = new C4104r0();
                    if ((i18 & 458752) == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C21862n(function2, 11);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C21862n(function2, 11);
                        c28655q.m87172p0(objM87133R);
                    }
                    c4104r3.Compose(c4118t3, (Function1) objM87133R, c28655q, (i18 >> 12) & 14);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1119424293);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c4118t2 = c4118t3;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                c4118t2 = c4118t1;
                function2 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(modifier3, (Object) num, (Object) title, (Object) body, (Object) c4118t2, function2, i13, i14, 16);
            }
        }
        i15 |= 24576;
        c4118t1 = c4118t0;
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(function1)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                if (i26 != 0) {
                    c4118t3 = null;
                } else {
                    c4118t3 = c4118t1;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C21875f(20);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function1;
                }
                float f111 = 1;
                f13 = 4;
                Modifier modifierMo3471e3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f111 * f13, 0.0f, 2).mo3471e(modifier2);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                Modifier modifier6 = modifier2;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a3);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    c28676v1 = c28676v0;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N7);
                    float f112 = 8;
                    Modifier modifierM3398t9 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f111 * f112, 7);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3398t9);
                    c28655q.m87158i0();
                    function2 = function3;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N8);
                    if (num != null) {
                        c28655q.m87150e0(269983983);
                        f14 = 1.0f;
                        i19 = 0;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num.intValue(), c28655q, (i18 & 112) | 6), null, AbstractC1102d.m3419p(6 * f13, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                        c28655q.m87173q(false);
                    } else {
                        f14 = 1.0f;
                        i19 = 0;
                        c28655q.m87150e0(270238121);
                        c28655q.m87173q(false);
                    }
                    String strM21274h5 = AbstractC8693b.m21274h(title, c28655q, (i18 >> 6) & 14);
                    if (f14 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(f14, true);
                    if (num == null) {
                        i24 = i19;
                    } else {
                        i24 = 1;
                    }
                    Modifier modifierM3398t10 = AbstractC1099a.m3398t(layoutWeightElement5, i24 * f112, 0.0f, 0.0f, 0.0f, 14);
                    C38072d c38072d5 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h5, modifierM3398t10, c38072d5.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196600);
                    c28655q.m87173q(true);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(body, c28655q, (i18 >> 9) & 14), null, c38072d5.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    if (c4118t3 != null) {
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 1119229210, f13, f13, c2314t));
                        C4104r0 c4104r4 = new C4104r0();
                        if ((i18 & 458752) == 131072) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C21862n(function2, 11);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C21862n(function2, 11);
                            c28655q.m87172p0(objM87133R);
                        }
                        c4104r4.Compose(c4118t3, (Function1) objM87133R, c28655q, (i18 >> 12) & 14);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1119424293);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c4118t2 = c4118t3;
                    modifier3 = modifier6;
                } else {
                    c28676v1 = c28676v0;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                float f113 = 8;
                Modifier modifierM3398t11 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f111 * f113, 7);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3398t11);
                c28655q.m87158i0();
                function2 = function3;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
                if (num != null) {
                    c28655q.m87150e0(269983983);
                    f14 = 1.0f;
                    i19 = 0;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num.intValue(), c28655q, (i18 & 112) | 6), null, AbstractC1102d.m3419p(6 * f13, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                } else {
                    f14 = 1.0f;
                    i19 = 0;
                    c28655q.m87150e0(270238121);
                    c28655q.m87173q(false);
                }
                String strM21274h6 = AbstractC8693b.m21274h(title, c28655q, (i18 >> 6) & 14);
                if (f14 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(f14, true);
                if (num == null) {
                    i24 = i19;
                } else {
                    i24 = 1;
                }
                Modifier modifierM3398t12 = AbstractC1099a.m3398t(layoutWeightElement6, i24 * f113, 0.0f, 0.0f, 0.0f, 14);
                C38072d c38072d6 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h6, modifierM3398t12, c38072d6.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196600);
                c28655q.m87173q(true);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(body, c28655q, (i18 >> 9) & 14), null, c38072d6.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                if (c4118t3 != null) {
                    AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 1119229210, f13, f13, c2314t));
                    C4104r0 c4104r5 = new C4104r0();
                    if ((i18 & 458752) == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C21862n(function2, 11);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C21862n(function2, 11);
                        c28655q.m87172p0(objM87133R);
                    }
                    c4104r5.Compose(c4118t3, (Function1) objM87133R, c28655q, (i18 >> 12) & 14);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1119424293);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c4118t2 = c4118t3;
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                c4118t2 = c4118t1;
                function2 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(modifier3, (Object) num, (Object) title, (Object) body, (Object) c4118t2, function2, i13, i14, 16);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i18 = i15;
        if ((i18 & 74899) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i18 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                modifier2 = c2314t;
            }
            if (i26 != 0) {
                c4118t3 = null;
            } else {
                c4118t3 = c4118t1;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21875f(20);
                    c28655q.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function1;
            }
            float f114 = 1;
            f13 = 4;
            Modifier modifierMo3471e4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f114 * f13, 0.0f, 2).mo3471e(modifier2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            Modifier modifier7 = modifier2;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i14 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a4);
            C0209i c0209i15 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                c28676v1 = c28676v0;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i16 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                float f115 = 8;
                Modifier modifierM3398t13 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f114 * f115, 7);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3398t13);
                c28655q.m87158i0();
                function2 = function3;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m11);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N11);
                if (num != null) {
                    c28655q.m87150e0(269983983);
                    f14 = 1.0f;
                    i19 = 0;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num.intValue(), c28655q, (i18 & 112) | 6), null, AbstractC1102d.m3419p(6 * f13, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                } else {
                    f14 = 1.0f;
                    i19 = 0;
                    c28655q.m87150e0(270238121);
                    c28655q.m87173q(false);
                }
                String strM21274h7 = AbstractC8693b.m21274h(title, c28655q, (i18 >> 6) & 14);
                if (f14 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(f14, true);
                if (num == null) {
                    i24 = i19;
                } else {
                    i24 = 1;
                }
                Modifier modifierM3398t14 = AbstractC1099a.m3398t(layoutWeightElement7, i24 * f115, 0.0f, 0.0f, 0.0f, 14);
                C38072d c38072d7 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h7, modifierM3398t14, c38072d7.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196600);
                c28655q.m87173q(true);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(body, c28655q, (i18 >> 9) & 14), null, c38072d7.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                if (c4118t3 != null) {
                    AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 1119229210, f13, f13, c2314t));
                    C4104r0 c4104r6 = new C4104r0();
                    if ((i18 & 458752) == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C21862n(function2, 11);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C21862n(function2, 11);
                        c28655q.m87172p0(objM87133R);
                    }
                    c4104r6.Compose(c4118t3, (Function1) objM87133R, c28655q, (i18 >> 12) & 14);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1119424293);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c4118t2 = c4118t3;
                modifier3 = modifier7;
            } else {
                c28676v1 = c28676v0;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i17 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N10);
            float f116 = 8;
            Modifier modifierM3398t15 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f114 * f116, 7);
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3398t15);
            c28655q.m87158i0();
            function2 = function3;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a8);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N12);
            if (num != null) {
                c28655q.m87150e0(269983983);
                f14 = 1.0f;
                i19 = 0;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num.intValue(), c28655q, (i18 & 112) | 6), null, AbstractC1102d.m3419p(6 * f13, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                c28655q.m87173q(false);
            } else {
                f14 = 1.0f;
                i19 = 0;
                c28655q.m87150e0(270238121);
                c28655q.m87173q(false);
            }
            String strM21274h8 = AbstractC8693b.m21274h(title, c28655q, (i18 >> 6) & 14);
            if (f14 <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(f14, true);
            if (num == null) {
                i24 = i19;
            } else {
                i24 = 1;
            }
            Modifier modifierM3398t16 = AbstractC1099a.m3398t(layoutWeightElement8, i24 * f116, 0.0f, 0.0f, 0.0f, 14);
            C38072d c38072d8 = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h8, modifierM3398t16, c38072d8.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196600);
            c28655q.m87173q(true);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(body, c28655q, (i18 >> 9) & 14), null, c38072d8.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            if (c4118t3 != null) {
                AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 1119229210, f13, f13, c2314t));
                C4104r0 c4104r7 = new C4104r0();
                if ((i18 & 458752) == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C21862n(function2, 11);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C21862n(function2, 11);
                    c28655q.m87172p0(objM87133R);
                }
                c4104r7.Compose(c4118t3, (Function1) objM87133R, c28655q, (i18 >> 12) & 14);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1119424293);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c4118t2 = c4118t3;
            modifier3 = modifier7;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            c4118t2 = c4118t1;
            function2 = function1;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(modifier3, (Object) num, (Object) title, (Object) body, (Object) c4118t2, function2, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m63670e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m63671f(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m63672g(Modifier modifier, Integer num, TextResource textResource, TextResource textResource2, C4118t0 c4118t0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m63669d(modifier, num, textResource, textResource2, c4118t0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
