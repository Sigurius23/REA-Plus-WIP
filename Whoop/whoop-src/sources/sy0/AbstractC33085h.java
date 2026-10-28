package sy0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.selection.AbstractC1112d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2656x4;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15680h;
import ge3.AbstractC15751g;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p095dp.AbstractC12240d;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15210z4;
import p163g1.C15127r1;
import p163g1.InterfaceC14948a1;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.C18027i;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22989q;
import p292l1.C23171s2;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32416g;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: sy0.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001as\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0017²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "checked", "Lkotlin/Function1;", "Ll83/a0;", "onCheckedChange", "enabled", "Lj0/i;", "interactionSource", "Lg1/a1;", "colors", "Ly71/g;", "icon", "Ly3/f;", "checkboxSize", "checkmarkSize", "c", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ZLj0/i;Lg1/a1;Ly71/g;FFLandroidx/compose/runtime/Composer;II)V", "Li2/x;", "checkColor", "boxColor", "borderColor", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33085h {
    /* JADX WARN: Code duplicated, block: B:108:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x014f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0151  */
    /* JADX WARN: Code duplicated, block: B:112:0x0155  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x015a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0160  */
    /* JADX WARN: Code duplicated, block: B:119:0x0169  */
    /* JADX WARN: Code duplicated, block: B:122:0x016f  */
    /* JADX WARN: Code duplicated, block: B:123:0x019f  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01be  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:136:0x0231  */
    /* JADX WARN: Code duplicated, block: B:138:0x0241  */
    /* JADX WARN: Code duplicated, block: B:139:0x0243  */
    /* JADX WARN: Code duplicated, block: B:142:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x024c  */
    /* JADX WARN: Code duplicated, block: B:147:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:151:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x02db  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:157:0x0329  */
    /* JADX WARN: Code duplicated, block: B:160:0x034d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0362  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    /* JADX INFO: renamed from: c */
    public static final void m104813c(Modifier modifier, boolean z4, Function1 function1, boolean z13, InterfaceC21083i interfaceC21083i, InterfaceC14948a1 interfaceC14948a1, C39274g c39274g, float f13, float f14, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        int i16;
        InterfaceC21083i interfaceC21083i2;
        int i17;
        InterfaceC14948a1 interfaceC14948a2;
        C39274g c39274g2;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z15;
        Modifier modifier2;
        float f15;
        C28655q c28655q;
        C39274g c39274g3;
        InterfaceC21083i interfaceC21083i3;
        InterfaceC14948a1 interfaceC14948a3;
        float f16;
        boolean z16;
        C28677v1 c28677v1M87180u;
        int i28;
        C2314t c2314t;
        C28676v0 c28676v0;
        Modifier modifier3;
        boolean z17;
        InterfaceC21083i interfaceC21083i4;
        C28655q c28655q2;
        InterfaceC14948a1 interfaceC14948a1M34081r;
        int i29;
        float f17;
        Modifier modifier4;
        boolean z18;
        float f18;
        float f19;
        Object objM87133R;
        InterfaceC28670t2 interfaceC28670t2M43182c;
        boolean z19;
        InterfaceC21083i interfaceC21083i5;
        C2314t c2314t2;
        boolean z24;
        boolean z25;
        Object objM87133R2;
        boolean z26;
        Modifier modifierMo3471e;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q3;
        boolean z27;
        int i34;
        int i35;
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(650551568);
        int i36 = i14 & 1;
        if (i36 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q4.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q4.m87157i(function1) ? 256 : 128;
        }
        int i37 = i14 & 8;
        if (i37 == 0) {
            if ((i13 & 3072) == 0) {
                z14 = z13;
                i15 |= c28655q4.m87155h(z14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC21083i2 = interfaceC21083i;
                    if (c28655q4.m87153g(interfaceC21083i2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((196608 & i13) == 0) {
                    if ((i14 & 32) == 0) {
                        interfaceC14948a2 = interfaceC14948a1;
                        if (c28655q4.m87153g(interfaceC14948a2)) {
                            i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        }
                        i15 |= i35;
                    } else {
                        interfaceC14948a2 = interfaceC14948a1;
                    }
                    i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    i15 |= i35;
                } else {
                    interfaceC14948a2 = interfaceC14948a1;
                }
                if ((i13 & 1572864) == 0) {
                    c39274g2 = c39274g;
                    if ((i14 & 64) == 0 || !c28655q4.m87153g(c39274g2)) {
                        i34 = 524288;
                    } else {
                        i34 = 1048576;
                    }
                    i15 |= i34;
                } else {
                    c39274g2 = c39274g;
                }
                i18 = i14 & 128;
                if (i18 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q4.m87147d(f13)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 256;
                if (i24 != 0) {
                    i15 |= 100663296;
                    i25 = i24;
                } else {
                    i25 = i24;
                    if ((i13 & 100663296) == 0) {
                        if (c28655q4.m87147d(f14)) {
                            i26 = 67108864;
                        } else {
                            i26 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i26;
                    }
                }
                i27 = i15;
                if ((i15 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q4.m87135U(i27 & 1, z15)) {
                    c28655q4.m87140Z();
                    i28 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0 || c28655q4.m87118C()) {
                        if (i36 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i37 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i16 != 0) {
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC11266d.m30453g(c28655q4);
                            }
                            interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                        } else {
                            interfaceC21083i4 = interfaceC21083i2;
                        }
                        if ((i14 & 32) != 0) {
                            C38072d c38072d = C38072d.f163053a;
                            interfaceC14948a1M34081r = AbstractC12240d.m34081r(c38072d.m121949b(c28655q4, 6).getRecovery(), c38072d.m121949b(c28655q4, 6).getBrandWhite(), c38072d.m121949b(c28655q4, 6).getBrandBlack(), 0L, c28655q4, 0, 24);
                            c28655q2 = c28655q4;
                            i27 &= -458753;
                        } else {
                            c28655q2 = c28655q4;
                            interfaceC14948a1M34081r = interfaceC14948a2;
                        }
                        if ((i14 & 64) != 0) {
                            c39274g2 = new C39274g(AbstractC2875y.m8290c(C38072d.f163053a), null, 2, null);
                            i27 &= -3670017;
                        }
                        if (i18 != 0) {
                            i29 = 4;
                            f17 = 7 * 4;
                        } else {
                            i29 = 4;
                            f17 = f13;
                        }
                        if (i25 != 0) {
                            float f24 = i29;
                            float f25 = f24 * f24;
                            boolean z28 = z17;
                            modifier4 = modifier3;
                            z18 = z28;
                            f18 = f25;
                            interfaceC21083i2 = interfaceC21083i4;
                            f19 = f17;
                        } else {
                            boolean z29 = z17;
                            modifier4 = modifier3;
                            z18 = z29;
                            f18 = f14;
                            f19 = f17;
                            interfaceC21083i2 = interfaceC21083i4;
                        }
                    } else {
                        c28655q4.m87138X();
                        if ((i14 & 32) != 0) {
                            i27 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            i27 &= -3670017;
                        }
                        modifier4 = modifier;
                        f19 = f13;
                        z18 = z14;
                        c28655q2 = c28655q4;
                        interfaceC14948a1M34081r = interfaceC14948a2;
                        f18 = f14;
                    }
                    c28655q2.m87175r();
                    C15127r1 c15127r1 = (C15127r1) interfaceC14948a1M34081r;
                    interfaceC28670t2M43182c = c15127r1.m43182c(AbstractC32416g.m101153j(z4), c28655q2);
                    InterfaceC28670t2 interfaceC28670t2M43181b = c15127r1.m43181b(z18, AbstractC32416g.m101153j(z4), c28655q2);
                    InterfaceC28670t2 interfaceC28670t2M43180a = c15127r1.m43180a(z18, AbstractC32416g.m101153j(z4), c28655q2);
                    z19 = z18;
                    c28655q2.m87150e0(-1885139322);
                    if (function1 != null) {
                        InterfaceC21083i interfaceC21083i6 = interfaceC21083i2;
                        c2314t2 = c2314t;
                        z24 = z4;
                        interfaceC21083i5 = interfaceC21083i6;
                        modifierMo3471e = modifier4.mo3471e(AbstractC1112d.m3447a(c2314t, z4, interfaceC21083i6, AbstractC15210z4.m43228a(0L, 4, false, 24), z19, new C18027i(1), function1));
                        z26 = false;
                    } else {
                        interfaceC21083i5 = interfaceC21083i2;
                        c2314t2 = c2314t;
                        z24 = z4;
                        if ((i27 & 112) == 32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z25 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C2656x4(z24, 9);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        z26 = false;
                        modifierMo3471e = modifier4.mo3471e(AbstractC18032n.m51775c(c2314t2, false, (Function1) objM87133R2));
                    }
                    c28655q2.m87173q(z26);
                    Modifier modifierM3419p = AbstractC1102d.m3419p(f19, modifierMo3471e);
                    float f26 = 2;
                    float f27 = 4 * f26;
                    Modifier modifierM44455h = AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(modifierM3419p, AbstractC33253j.m105489e(f27)), z19), m104815e(interfaceC28670t2M43181b), AbstractC17918w0.f69621a), f26, m104816f(interfaceC28670t2M43180a), AbstractC33253j.m105489e(f27));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM44455h);
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
                    if (z24) {
                        c28655q2.m87150e0(-282458818);
                        C28655q c28655q5 = c28655q2;
                        z14 = z19;
                        c28655q3 = c28655q5;
                        z27 = true;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c39274g2.getIcon(), c28655q2, 6), AbstractC8693b.m21274h(c39274g2.getContentDescription(), c28655q2, 0), AbstractC1102d.m3419p(f18, AbstractC15680h.m44112a(c2314t2, z19)), m104814d(interfaceC28670t2M43182c), c28655q3, 0, 0);
                        c28655q3.m87173q(false);
                    } else {
                        c28655q3 = c28655q2;
                        z27 = true;
                        z14 = z19;
                        c28655q3.m87150e0(-282137844);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z27);
                    c39274g3 = c39274g2;
                    c28655q = c28655q3;
                    f15 = f19;
                    f16 = f18;
                    interfaceC14948a3 = c15127r1;
                    modifier2 = modifier4;
                    interfaceC21083i3 = interfaceC21083i5;
                } else {
                    c28655q4.m87138X();
                    modifier2 = modifier;
                    f15 = f13;
                    c28655q = c28655q4;
                    c39274g3 = c39274g2;
                    interfaceC21083i3 = interfaceC21083i2;
                    interfaceC14948a3 = interfaceC14948a2;
                    f16 = f14;
                }
                z16 = z14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23171s2(modifier2, z4, function1, z16, interfaceC21083i3, interfaceC14948a3, c39274g3, f15, f16, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC21083i2 = interfaceC21083i;
            if ((196608 & i13) == 0) {
                if ((i14 & 32) == 0) {
                    interfaceC14948a2 = interfaceC14948a1;
                    if (c28655q4.m87153g(interfaceC14948a2)) {
                        i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i15 |= i35;
                } else {
                    interfaceC14948a2 = interfaceC14948a1;
                }
                i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                i15 |= i35;
            } else {
                interfaceC14948a2 = interfaceC14948a1;
            }
            if ((i13 & 1572864) == 0) {
                c39274g2 = c39274g;
                if ((i14 & 64) == 0) {
                    i34 = 524288;
                } else {
                    i34 = 524288;
                }
                i15 |= i34;
            } else {
                c39274g2 = c39274g;
            }
            i18 = i14 & 128;
            if (i18 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q4.m87147d(f13)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i15 |= i19;
            }
            i24 = i14 & 256;
            if (i24 != 0) {
                i15 |= 100663296;
                i25 = i24;
            } else {
                i25 = i24;
                if ((i13 & 100663296) == 0) {
                    if (c28655q4.m87147d(f14)) {
                        i26 = 67108864;
                    } else {
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i26;
                }
            }
            i27 = i15;
            if ((i15 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q4.m87135U(i27 & 1, z15)) {
                c28655q4.m87140Z();
                i28 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    if (i36 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i37 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q4);
                        }
                        interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                    } else {
                        interfaceC21083i4 = interfaceC21083i2;
                    }
                    if ((i14 & 32) != 0) {
                        C38072d c38072d2 = C38072d.f163053a;
                        interfaceC14948a1M34081r = AbstractC12240d.m34081r(c38072d2.m121949b(c28655q4, 6).getRecovery(), c38072d2.m121949b(c28655q4, 6).getBrandWhite(), c38072d2.m121949b(c28655q4, 6).getBrandBlack(), 0L, c28655q4, 0, 24);
                        c28655q2 = c28655q4;
                        i27 &= -458753;
                    } else {
                        c28655q2 = c28655q4;
                        interfaceC14948a1M34081r = interfaceC14948a2;
                    }
                    if ((i14 & 64) != 0) {
                        c39274g2 = new C39274g(AbstractC2875y.m8290c(C38072d.f163053a), null, 2, null);
                        i27 &= -3670017;
                    }
                    if (i18 != 0) {
                        i29 = 4;
                        f17 = 7 * 4;
                    } else {
                        i29 = 4;
                        f17 = f13;
                    }
                    if (i25 != 0) {
                        float f28 = i29;
                        float f29 = f28 * f28;
                        boolean z210 = z17;
                        modifier4 = modifier3;
                        z18 = z210;
                        f18 = f29;
                        interfaceC21083i2 = interfaceC21083i4;
                        f19 = f17;
                    } else {
                        boolean z211 = z17;
                        modifier4 = modifier3;
                        z18 = z211;
                        f18 = f14;
                        f19 = f17;
                        interfaceC21083i2 = interfaceC21083i4;
                    }
                } else {
                    if (i36 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i37 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q4);
                        }
                        interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                    } else {
                        interfaceC21083i4 = interfaceC21083i2;
                    }
                    if ((i14 & 32) != 0) {
                        C38072d c38072d3 = C38072d.f163053a;
                        interfaceC14948a1M34081r = AbstractC12240d.m34081r(c38072d3.m121949b(c28655q4, 6).getRecovery(), c38072d3.m121949b(c28655q4, 6).getBrandWhite(), c38072d3.m121949b(c28655q4, 6).getBrandBlack(), 0L, c28655q4, 0, 24);
                        c28655q2 = c28655q4;
                        i27 &= -458753;
                    } else {
                        c28655q2 = c28655q4;
                        interfaceC14948a1M34081r = interfaceC14948a2;
                    }
                    if ((i14 & 64) != 0) {
                        c39274g2 = new C39274g(AbstractC2875y.m8290c(C38072d.f163053a), null, 2, null);
                        i27 &= -3670017;
                    }
                    if (i18 != 0) {
                        i29 = 4;
                        f17 = 7 * 4;
                    } else {
                        i29 = 4;
                        f17 = f13;
                    }
                    if (i25 != 0) {
                        float f210 = i29;
                        float f211 = f210 * f210;
                        boolean z212 = z17;
                        modifier4 = modifier3;
                        z18 = z212;
                        f18 = f211;
                        interfaceC21083i2 = interfaceC21083i4;
                        f19 = f17;
                    } else {
                        boolean z213 = z17;
                        modifier4 = modifier3;
                        z18 = z213;
                        f18 = f14;
                        f19 = f17;
                        interfaceC21083i2 = interfaceC21083i4;
                    }
                }
                c28655q2.m87175r();
                C15127r1 c15127r2 = (C15127r1) interfaceC14948a1M34081r;
                interfaceC28670t2M43182c = c15127r2.m43182c(AbstractC32416g.m101153j(z4), c28655q2);
                InterfaceC28670t2 interfaceC28670t2M43181b2 = c15127r2.m43181b(z18, AbstractC32416g.m101153j(z4), c28655q2);
                InterfaceC28670t2 interfaceC28670t2M43180a2 = c15127r2.m43180a(z18, AbstractC32416g.m101153j(z4), c28655q2);
                z19 = z18;
                c28655q2.m87150e0(-1885139322);
                if (function1 != null) {
                    InterfaceC21083i interfaceC21083i7 = interfaceC21083i2;
                    c2314t2 = c2314t;
                    z24 = z4;
                    interfaceC21083i5 = interfaceC21083i7;
                    modifierMo3471e = modifier4.mo3471e(AbstractC1112d.m3447a(c2314t, z4, interfaceC21083i7, AbstractC15210z4.m43228a(0L, 4, false, 24), z19, new C18027i(1), function1));
                    z26 = false;
                } else {
                    interfaceC21083i5 = interfaceC21083i2;
                    c2314t2 = c2314t;
                    z24 = z4;
                    if ((i27 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z25) {
                        objM87133R2 = new C2656x4(z24, 9);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C2656x4(z24, 9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    z26 = false;
                    modifierMo3471e = modifier4.mo3471e(AbstractC18032n.m51775c(c2314t2, false, (Function1) objM87133R2));
                }
                c28655q2.m87173q(z26);
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(f19, modifierMo3471e);
                float f212 = 2;
                float f213 = 4 * f212;
                Modifier modifierM44455h2 = AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(modifierM3419p2, AbstractC33253j.m105489e(f213)), z19), m104815e(interfaceC28670t2M43181b2), AbstractC17918w0.f69621a), f212, m104816f(interfaceC28670t2M43180a2), AbstractC33253j.m105489e(f213));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM44455h2);
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
                if (z24) {
                    c28655q2.m87150e0(-282458818);
                    C28655q c28655q6 = c28655q2;
                    z14 = z19;
                    c28655q3 = c28655q6;
                    z27 = true;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c39274g2.getIcon(), c28655q2, 6), AbstractC8693b.m21274h(c39274g2.getContentDescription(), c28655q2, 0), AbstractC1102d.m3419p(f18, AbstractC15680h.m44112a(c2314t2, z19)), m104814d(interfaceC28670t2M43182c), c28655q3, 0, 0);
                    c28655q3.m87173q(false);
                } else {
                    c28655q3 = c28655q2;
                    z27 = true;
                    z14 = z19;
                    c28655q3.m87150e0(-282137844);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z27);
                c39274g3 = c39274g2;
                c28655q = c28655q3;
                f15 = f19;
                f16 = f18;
                interfaceC14948a3 = c15127r2;
                modifier2 = modifier4;
                interfaceC21083i3 = interfaceC21083i5;
            } else {
                c28655q4.m87138X();
                modifier2 = modifier;
                f15 = f13;
                c28655q = c28655q4;
                c39274g3 = c39274g2;
                interfaceC21083i3 = interfaceC21083i2;
                interfaceC14948a3 = interfaceC14948a2;
                f16 = f14;
            }
            z16 = z14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23171s2(modifier2, z4, function1, z16, interfaceC21083i3, interfaceC14948a3, c39274g3, f15, f16, i13, i14);
            }
        }
        i15 |= 3072;
        z14 = z13;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC21083i2 = interfaceC21083i;
                if (c28655q4.m87153g(interfaceC21083i2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((196608 & i13) == 0) {
                if ((i14 & 32) == 0) {
                    interfaceC14948a2 = interfaceC14948a1;
                    if (c28655q4.m87153g(interfaceC14948a2)) {
                        i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i15 |= i35;
                } else {
                    interfaceC14948a2 = interfaceC14948a1;
                }
                i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                i15 |= i35;
            } else {
                interfaceC14948a2 = interfaceC14948a1;
            }
            if ((i13 & 1572864) == 0) {
                c39274g2 = c39274g;
                if ((i14 & 64) == 0) {
                    i34 = 524288;
                } else {
                    i34 = 524288;
                }
                i15 |= i34;
            } else {
                c39274g2 = c39274g;
            }
            i18 = i14 & 128;
            if (i18 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q4.m87147d(f13)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i15 |= i19;
            }
            i24 = i14 & 256;
            if (i24 != 0) {
                i15 |= 100663296;
                i25 = i24;
            } else {
                i25 = i24;
                if ((i13 & 100663296) == 0) {
                    if (c28655q4.m87147d(f14)) {
                        i26 = 67108864;
                    } else {
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i26;
                }
            }
            i27 = i15;
            if ((i15 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q4.m87135U(i27 & 1, z15)) {
                c28655q4.m87140Z();
                i28 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    if (i36 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i37 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q4);
                        }
                        interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                    } else {
                        interfaceC21083i4 = interfaceC21083i2;
                    }
                    if ((i14 & 32) != 0) {
                        C38072d c38072d4 = C38072d.f163053a;
                        interfaceC14948a1M34081r = AbstractC12240d.m34081r(c38072d4.m121949b(c28655q4, 6).getRecovery(), c38072d4.m121949b(c28655q4, 6).getBrandWhite(), c38072d4.m121949b(c28655q4, 6).getBrandBlack(), 0L, c28655q4, 0, 24);
                        c28655q2 = c28655q4;
                        i27 &= -458753;
                    } else {
                        c28655q2 = c28655q4;
                        interfaceC14948a1M34081r = interfaceC14948a2;
                    }
                    if ((i14 & 64) != 0) {
                        c39274g2 = new C39274g(AbstractC2875y.m8290c(C38072d.f163053a), null, 2, null);
                        i27 &= -3670017;
                    }
                    if (i18 != 0) {
                        i29 = 4;
                        f17 = 7 * 4;
                    } else {
                        i29 = 4;
                        f17 = f13;
                    }
                    if (i25 != 0) {
                        float f214 = i29;
                        float f215 = f214 * f214;
                        boolean z214 = z17;
                        modifier4 = modifier3;
                        z18 = z214;
                        f18 = f215;
                        interfaceC21083i2 = interfaceC21083i4;
                        f19 = f17;
                    } else {
                        boolean z215 = z17;
                        modifier4 = modifier3;
                        z18 = z215;
                        f18 = f14;
                        f19 = f17;
                        interfaceC21083i2 = interfaceC21083i4;
                    }
                } else {
                    if (i36 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i37 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q4);
                        }
                        interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                    } else {
                        interfaceC21083i4 = interfaceC21083i2;
                    }
                    if ((i14 & 32) != 0) {
                        C38072d c38072d5 = C38072d.f163053a;
                        interfaceC14948a1M34081r = AbstractC12240d.m34081r(c38072d5.m121949b(c28655q4, 6).getRecovery(), c38072d5.m121949b(c28655q4, 6).getBrandWhite(), c38072d5.m121949b(c28655q4, 6).getBrandBlack(), 0L, c28655q4, 0, 24);
                        c28655q2 = c28655q4;
                        i27 &= -458753;
                    } else {
                        c28655q2 = c28655q4;
                        interfaceC14948a1M34081r = interfaceC14948a2;
                    }
                    if ((i14 & 64) != 0) {
                        c39274g2 = new C39274g(AbstractC2875y.m8290c(C38072d.f163053a), null, 2, null);
                        i27 &= -3670017;
                    }
                    if (i18 != 0) {
                        i29 = 4;
                        f17 = 7 * 4;
                    } else {
                        i29 = 4;
                        f17 = f13;
                    }
                    if (i25 != 0) {
                        float f216 = i29;
                        float f217 = f216 * f216;
                        boolean z216 = z17;
                        modifier4 = modifier3;
                        z18 = z216;
                        f18 = f217;
                        interfaceC21083i2 = interfaceC21083i4;
                        f19 = f17;
                    } else {
                        boolean z217 = z17;
                        modifier4 = modifier3;
                        z18 = z217;
                        f18 = f14;
                        f19 = f17;
                        interfaceC21083i2 = interfaceC21083i4;
                    }
                }
                c28655q2.m87175r();
                C15127r1 c15127r3 = (C15127r1) interfaceC14948a1M34081r;
                interfaceC28670t2M43182c = c15127r3.m43182c(AbstractC32416g.m101153j(z4), c28655q2);
                InterfaceC28670t2 interfaceC28670t2M43181b3 = c15127r3.m43181b(z18, AbstractC32416g.m101153j(z4), c28655q2);
                InterfaceC28670t2 interfaceC28670t2M43180a3 = c15127r3.m43180a(z18, AbstractC32416g.m101153j(z4), c28655q2);
                z19 = z18;
                c28655q2.m87150e0(-1885139322);
                if (function1 != null) {
                    InterfaceC21083i interfaceC21083i8 = interfaceC21083i2;
                    c2314t2 = c2314t;
                    z24 = z4;
                    interfaceC21083i5 = interfaceC21083i8;
                    modifierMo3471e = modifier4.mo3471e(AbstractC1112d.m3447a(c2314t, z4, interfaceC21083i8, AbstractC15210z4.m43228a(0L, 4, false, 24), z19, new C18027i(1), function1));
                    z26 = false;
                } else {
                    interfaceC21083i5 = interfaceC21083i2;
                    c2314t2 = c2314t;
                    z24 = z4;
                    if ((i27 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z25) {
                        objM87133R2 = new C2656x4(z24, 9);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C2656x4(z24, 9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    z26 = false;
                    modifierMo3471e = modifier4.mo3471e(AbstractC18032n.m51775c(c2314t2, false, (Function1) objM87133R2));
                }
                c28655q2.m87173q(z26);
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(f19, modifierMo3471e);
                float f218 = 2;
                float f219 = 4 * f218;
                Modifier modifierM44455h3 = AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(modifierM3419p3, AbstractC33253j.m105489e(f219)), z19), m104815e(interfaceC28670t2M43181b3), AbstractC17918w0.f69621a), f218, m104816f(interfaceC28670t2M43180a3), AbstractC33253j.m105489e(f219));
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM44455h3);
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
                if (z24) {
                    c28655q2.m87150e0(-282458818);
                    C28655q c28655q7 = c28655q2;
                    z14 = z19;
                    c28655q3 = c28655q7;
                    z27 = true;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c39274g2.getIcon(), c28655q2, 6), AbstractC8693b.m21274h(c39274g2.getContentDescription(), c28655q2, 0), AbstractC1102d.m3419p(f18, AbstractC15680h.m44112a(c2314t2, z19)), m104814d(interfaceC28670t2M43182c), c28655q3, 0, 0);
                    c28655q3.m87173q(false);
                } else {
                    c28655q3 = c28655q2;
                    z27 = true;
                    z14 = z19;
                    c28655q3.m87150e0(-282137844);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z27);
                c39274g3 = c39274g2;
                c28655q = c28655q3;
                f15 = f19;
                f16 = f18;
                interfaceC14948a3 = c15127r3;
                modifier2 = modifier4;
                interfaceC21083i3 = interfaceC21083i5;
            } else {
                c28655q4.m87138X();
                modifier2 = modifier;
                f15 = f13;
                c28655q = c28655q4;
                c39274g3 = c39274g2;
                interfaceC21083i3 = interfaceC21083i2;
                interfaceC14948a3 = interfaceC14948a2;
                f16 = f14;
            }
            z16 = z14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23171s2(modifier2, z4, function1, z16, interfaceC21083i3, interfaceC14948a3, c39274g3, f15, f16, i13, i14);
            }
        }
        i15 |= 24576;
        interfaceC21083i2 = interfaceC21083i;
        if ((196608 & i13) == 0) {
            if ((i14 & 32) == 0) {
                interfaceC14948a2 = interfaceC14948a1;
                if (c28655q4.m87153g(interfaceC14948a2)) {
                    i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i15 |= i35;
            } else {
                interfaceC14948a2 = interfaceC14948a1;
            }
            i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i15 |= i35;
        } else {
            interfaceC14948a2 = interfaceC14948a1;
        }
        if ((i13 & 1572864) == 0) {
            c39274g2 = c39274g;
            if ((i14 & 64) == 0) {
                i34 = 524288;
            } else {
                i34 = 524288;
            }
            i15 |= i34;
        } else {
            c39274g2 = c39274g;
        }
        i18 = i14 & 128;
        if (i18 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c28655q4.m87147d(f13)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i15 |= i19;
        }
        i24 = i14 & 256;
        if (i24 != 0) {
            i15 |= 100663296;
            i25 = i24;
        } else {
            i25 = i24;
            if ((i13 & 100663296) == 0) {
                if (c28655q4.m87147d(f14)) {
                    i26 = 67108864;
                } else {
                    i26 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i26;
            }
        }
        i27 = i15;
        if ((i15 & 38347923) != 38347922) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q4.m87135U(i27 & 1, z15)) {
            c28655q4.m87140Z();
            i28 = i13 & 1;
            c2314t = C2314t.f9131w;
            c28676v0 = C28635l.f115821a;
            if (i28 != 0) {
                if (i36 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i37 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i16 != 0) {
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q4);
                    }
                    interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                } else {
                    interfaceC21083i4 = interfaceC21083i2;
                }
                if ((i14 & 32) != 0) {
                    C38072d c38072d6 = C38072d.f163053a;
                    interfaceC14948a1M34081r = AbstractC12240d.m34081r(c38072d6.m121949b(c28655q4, 6).getRecovery(), c38072d6.m121949b(c28655q4, 6).getBrandWhite(), c38072d6.m121949b(c28655q4, 6).getBrandBlack(), 0L, c28655q4, 0, 24);
                    c28655q2 = c28655q4;
                    i27 &= -458753;
                } else {
                    c28655q2 = c28655q4;
                    interfaceC14948a1M34081r = interfaceC14948a2;
                }
                if ((i14 & 64) != 0) {
                    c39274g2 = new C39274g(AbstractC2875y.m8290c(C38072d.f163053a), null, 2, null);
                    i27 &= -3670017;
                }
                if (i18 != 0) {
                    i29 = 4;
                    f17 = 7 * 4;
                } else {
                    i29 = 4;
                    f17 = f13;
                }
                if (i25 != 0) {
                    float f2110 = i29;
                    float f2111 = f2110 * f2110;
                    boolean z218 = z17;
                    modifier4 = modifier3;
                    z18 = z218;
                    f18 = f2111;
                    interfaceC21083i2 = interfaceC21083i4;
                    f19 = f17;
                } else {
                    boolean z219 = z17;
                    modifier4 = modifier3;
                    z18 = z219;
                    f18 = f14;
                    f19 = f17;
                    interfaceC21083i2 = interfaceC21083i4;
                }
            } else {
                if (i36 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i37 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i16 != 0) {
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q4);
                    }
                    interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                } else {
                    interfaceC21083i4 = interfaceC21083i2;
                }
                if ((i14 & 32) != 0) {
                    C38072d c38072d7 = C38072d.f163053a;
                    interfaceC14948a1M34081r = AbstractC12240d.m34081r(c38072d7.m121949b(c28655q4, 6).getRecovery(), c38072d7.m121949b(c28655q4, 6).getBrandWhite(), c38072d7.m121949b(c28655q4, 6).getBrandBlack(), 0L, c28655q4, 0, 24);
                    c28655q2 = c28655q4;
                    i27 &= -458753;
                } else {
                    c28655q2 = c28655q4;
                    interfaceC14948a1M34081r = interfaceC14948a2;
                }
                if ((i14 & 64) != 0) {
                    c39274g2 = new C39274g(AbstractC2875y.m8290c(C38072d.f163053a), null, 2, null);
                    i27 &= -3670017;
                }
                if (i18 != 0) {
                    i29 = 4;
                    f17 = 7 * 4;
                } else {
                    i29 = 4;
                    f17 = f13;
                }
                if (i25 != 0) {
                    float f2112 = i29;
                    float f2113 = f2112 * f2112;
                    boolean z2110 = z17;
                    modifier4 = modifier3;
                    z18 = z2110;
                    f18 = f2113;
                    interfaceC21083i2 = interfaceC21083i4;
                    f19 = f17;
                } else {
                    boolean z2111 = z17;
                    modifier4 = modifier3;
                    z18 = z2111;
                    f18 = f14;
                    f19 = f17;
                    interfaceC21083i2 = interfaceC21083i4;
                }
            }
            c28655q2.m87175r();
            C15127r1 c15127r4 = (C15127r1) interfaceC14948a1M34081r;
            interfaceC28670t2M43182c = c15127r4.m43182c(AbstractC32416g.m101153j(z4), c28655q2);
            InterfaceC28670t2 interfaceC28670t2M43181b4 = c15127r4.m43181b(z18, AbstractC32416g.m101153j(z4), c28655q2);
            InterfaceC28670t2 interfaceC28670t2M43180a4 = c15127r4.m43180a(z18, AbstractC32416g.m101153j(z4), c28655q2);
            z19 = z18;
            c28655q2.m87150e0(-1885139322);
            if (function1 != null) {
                InterfaceC21083i interfaceC21083i9 = interfaceC21083i2;
                c2314t2 = c2314t;
                z24 = z4;
                interfaceC21083i5 = interfaceC21083i9;
                modifierMo3471e = modifier4.mo3471e(AbstractC1112d.m3447a(c2314t, z4, interfaceC21083i9, AbstractC15210z4.m43228a(0L, 4, false, 24), z19, new C18027i(1), function1));
                z26 = false;
            } else {
                interfaceC21083i5 = interfaceC21083i2;
                c2314t2 = c2314t;
                z24 = z4;
                if ((i27 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z25) {
                    objM87133R2 = new C2656x4(z24, 9);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C2656x4(z24, 9);
                    c28655q2.m87172p0(objM87133R2);
                }
                z26 = false;
                modifierMo3471e = modifier4.mo3471e(AbstractC18032n.m51775c(c2314t2, false, (Function1) objM87133R2));
            }
            c28655q2.m87173q(z26);
            Modifier modifierM3419p4 = AbstractC1102d.m3419p(f19, modifierMo3471e);
            float f2114 = 2;
            float f2115 = 4 * f2114;
            Modifier modifierM44455h4 = AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(modifierM3419p4, AbstractC33253j.m105489e(f2115)), z19), m104815e(interfaceC28670t2M43181b4), AbstractC17918w0.f69621a), f2114, m104816f(interfaceC28670t2M43180a4), AbstractC33253j.m105489e(f2115));
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM44455h4);
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
            if (z24) {
                c28655q2.m87150e0(-282458818);
                C28655q c28655q8 = c28655q2;
                z14 = z19;
                c28655q3 = c28655q8;
                z27 = true;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c39274g2.getIcon(), c28655q2, 6), AbstractC8693b.m21274h(c39274g2.getContentDescription(), c28655q2, 0), AbstractC1102d.m3419p(f18, AbstractC15680h.m44112a(c2314t2, z19)), m104814d(interfaceC28670t2M43182c), c28655q3, 0, 0);
                c28655q3.m87173q(false);
            } else {
                c28655q3 = c28655q2;
                z27 = true;
                z14 = z19;
                c28655q3.m87150e0(-282137844);
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(z27);
            c39274g3 = c39274g2;
            c28655q = c28655q3;
            f15 = f19;
            f16 = f18;
            interfaceC14948a3 = c15127r4;
            modifier2 = modifier4;
            interfaceC21083i3 = interfaceC21083i5;
        } else {
            c28655q4.m87138X();
            modifier2 = modifier;
            f15 = f13;
            c28655q = c28655q4;
            c39274g3 = c39274g2;
            interfaceC21083i3 = interfaceC21083i2;
            interfaceC14948a3 = interfaceC14948a2;
            f16 = f14;
        }
        z16 = z14;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23171s2(modifier2, z4, function1, z16, interfaceC21083i3, interfaceC14948a3, c39274g3, f15, f16, i13, i14);
        }
    }

    /* JADX INFO: renamed from: d */
    private static final long m104814d(InterfaceC28670t2 interfaceC28670t2) {
        return ((C17919x) interfaceC28670t2.getValue()).f69639a;
    }

    /* JADX INFO: renamed from: e */
    private static final long m104815e(InterfaceC28670t2 interfaceC28670t2) {
        return ((C17919x) interfaceC28670t2.getValue()).f69639a;
    }

    /* JADX INFO: renamed from: f */
    private static final long m104816f(InterfaceC28670t2 interfaceC28670t2) {
        return ((C17919x) interfaceC28670t2.getValue()).f69639a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m104817g(boolean z4, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51814m(semantics, AbstractC32416g.m101153j(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m104818h(Modifier modifier, boolean z4, Function1 function1, boolean z13, InterfaceC21083i interfaceC21083i, InterfaceC14948a1 interfaceC14948a1, C39274g c39274g, float f13, float f14, int i13, int i14, Composer composer, int i15) {
        m104813c(modifier, z4, function1, z13, interfaceC21083i, interfaceC14948a1, c39274g, f13, f14, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
