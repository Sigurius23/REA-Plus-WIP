package androidx.compose.material;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.nestedscroll.AbstractC1129a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2478a3;
import b30.C2567l4;
import bc3.InterfaceC2994c0;
import bf0.C3196h;
import c11.C3840g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cd1.C4439c;
import com.squareup.wire.AbstractC5583n;
import dw1.C12413a;
import ej1.C13242h;
import fq2.C14686c;
import hg3.AbstractC17269i;
import j93.AbstractC21478l0;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11352g;
import p077d0.C11347e2;
import p077d0.InterfaceC11419z;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15081m5;
import p163g1.AbstractC15129r3;
import p163g1.C14947a0;
import p163g1.C15015g2;
import p163g1.C15068l2;
import p163g1.C15071l5;
import p163g1.C15169v3;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p180h0.EnumC16377d2;
import p208i2.InterfaceC17869a1;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22989q;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p492t2.InterfaceC33313a;
import p512u2.AbstractC34452c0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p702ch0.C4614e;
import p702ch0.C4660x0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: androidx.compose.material.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1118c {

    /* JADX INFO: renamed from: a */
    public static final float f4722a = 56;

    /* JADX INFO: renamed from: b */
    public static final float f4723b = 125;

    /* JADX INFO: renamed from: c */
    public static final float f4724c = 640;

    /* JADX WARN: Code duplicated, block: B:101:0x012f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x015b  */
    /* JADX WARN: Code duplicated, block: B:117:0x015d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0161  */
    /* JADX WARN: Code duplicated, block: B:122:0x0166  */
    /* JADX WARN: Code duplicated, block: B:123:0x0175  */
    /* JADX WARN: Code duplicated, block: B:126:0x017a  */
    /* JADX WARN: Code duplicated, block: B:127:0x017f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0185  */
    /* JADX WARN: Code duplicated, block: B:131:0x018e  */
    /* JADX WARN: Code duplicated, block: B:135:0x019f  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:147:0x021f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0225  */
    /* JADX WARN: Code duplicated, block: B:151:0x0232  */
    /* JADX WARN: Code duplicated, block: B:153:0x0240  */
    /* JADX WARN: Code duplicated, block: B:156:0x0260 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x0262  */
    /* JADX WARN: Code duplicated, block: B:160:0x027a  */
    /* JADX WARN: Code duplicated, block: B:161:0x027d  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:166:0x02b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:169:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:175:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:178:0x0308  */
    /* JADX WARN: Code duplicated, block: B:180:0x031d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x031f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0332  */
    /* JADX WARN: Code duplicated, block: B:185:0x037e  */
    /* JADX WARN: Code duplicated, block: B:188:0x038f  */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    /* JADX INFO: renamed from: a */
    public static final void m3458a(final C37816b c37816b, Modifier modifier, final C15199y3 c15199y3, boolean z4, InterfaceC17869a1 interfaceC17869a1, float f13, final long j7, long j13, final long j14, final C37816b c37816b2, Composer composer, final int i13, final int i14) {
        int i15;
        int i16;
        boolean z13;
        int i17;
        InterfaceC17869a1 interfaceC17869a2;
        int i18;
        int i19;
        int i24;
        boolean z14;
        final Modifier modifier2;
        final float f14;
        final long j15;
        final boolean z15;
        final InterfaceC17869a1 interfaceC17869a3;
        C28677v1 c28677v1M87180u;
        int i25;
        Modifier modifierM51775c;
        Modifier modifier3;
        InterfaceC17869a1 interfaceC17869a4;
        float f15;
        long jM43101b;
        InterfaceC17869a1 interfaceC17869a5;
        float f16;
        boolean z16;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC2994c0 interfaceC2994c0;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        boolean zM87157i;
        Object objM87133R2;
        C14947a0 c14947a0;
        Object value;
        EnumC15209z3 enumC15209z3;
        boolean z17;
        Modifier modifierM3495a;
        boolean z18;
        boolean zM87157i2;
        Object objM87133R3;
        boolean zM87153g;
        Object objM87133R4;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-336264970);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c37816b) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i35 = i14 & 2;
        if (i35 == 0) {
            if ((i13 & 48) == 0) {
                i15 |= c28655q.m87153g(modifier) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(c15199y3)) {
                    i34 = 256;
                } else {
                    i34 = 128;
                }
                i15 |= i34;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if ((i14 & 16) == 0) {
                        interfaceC17869a2 = interfaceC17869a1;
                        if (c28655q.m87153g(interfaceC17869a2)) {
                            i29 = DfuBaseService.ERROR_CONNECTION_MASK;
                        }
                        i15 |= i29;
                    } else {
                        interfaceC17869a2 = interfaceC17869a1;
                    }
                    i29 = DfuBaseService.ERROR_REMOTE_MASK;
                    i15 |= i29;
                } else {
                    interfaceC17869a2 = interfaceC17869a1;
                }
                if ((196608 & i13) != 0) {
                    i15 |= ((i14 & 32) == 0 || !c28655q.m87147d(f13)) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87151f(j7)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i15 |= i28;
                }
                if ((i13 & 12582912) == 0) {
                    if ((i14 & 128) == 0) {
                        i18 = i35;
                        int i36 = c28655q.m87151f(j13) ? 8388608 : 4194304;
                        i15 |= i36;
                    } else {
                        i18 = i35;
                    }
                    i15 |= i36;
                } else {
                    i18 = i35;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87151f(j14)) {
                        i27 = 67108864;
                    } else {
                        i27 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i27;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87157i(c37816b2)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i15 |= i26;
                }
                i19 = i15;
                i24 = i18;
                if ((i15 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i19 & 1, z14)) {
                    c28655q.m87140Z();
                    i25 = i13 & 1;
                    modifierM51775c = C2314t.f9131w;
                    if (i25 != 0 || c28655q.m87118C()) {
                        if (i24 != 0) {
                            modifier3 = modifierM51775c;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 16) != 0) {
                            interfaceC17869a4 = ((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a)).f56429c;
                            i19 &= -57345;
                        } else {
                            interfaceC17869a4 = interfaceC17869a2;
                        }
                        if ((i14 & 32) != 0) {
                            f15 = AbstractC15129r3.f56692a;
                            i19 &= -458753;
                        } else {
                            f15 = f13;
                        }
                        if ((i14 & 128) != 0) {
                            jM43101b = AbstractC14981d1.m43101b(j7, c28655q);
                            i19 &= -29360129;
                        } else {
                            jM43101b = j13;
                        }
                        interfaceC17869a5 = interfaceC17869a4;
                        f16 = f15;
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 16) != 0) {
                            i19 &= -57345;
                        }
                        if ((i14 & 32) != 0) {
                            i19 &= -458753;
                        }
                        if ((i14 & 128) != 0) {
                            i19 &= -29360129;
                        }
                        modifier3 = modifier;
                        f16 = f13;
                        jM43101b = j13;
                        interfaceC17869a5 = interfaceC17869a2;
                    }
                    int i37 = i19;
                    z16 = z13;
                    c28655q.m87175r();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
                    C2307m c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    InterfaceC17869a1 interfaceC17869a6 = interfaceC17869a5;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    Modifier modifier4 = modifier3;
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
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifierM51775c);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    c37816b2.invoke(c28655q, Integer.valueOf((i37 >> 27) & 14));
                    zM87157i = c28655q.m87157i(c15199y3) | c28655q.m87157i(interfaceC2994c0);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new C3196h(c15199y3, interfaceC2994c0, 8);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    c14947a0 = c15199y3.f57060b;
                    value = c14947a0.f55771h.getValue();
                    enumC15209z3 = EnumC15209z3.f57106w;
                    if (value != enumC15209z3) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    m3459b(j14, interfaceC4339a, z17, c28655q, (i37 >> 24) & 14);
                    c28655q.m87173q(true);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3425v(C1100b.f4583a.mo3400a(modifierM51775c, C2299e.f9115x), 0.0f, f4724c, 1));
                    if (z16) {
                        c28655q.m87150e0(351375666);
                        zM87153g = c28655q.m87153g(c14947a0);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g || objM87133R4 == c28676v0) {
                            objM87133R4 = new C15169v3(c14947a0);
                            c28655q.m87172p0(objM87133R4);
                        }
                        modifierM3495a = AbstractC1129a.m3495a(modifierM51775c, (InterfaceC33313a) objM87133R4, null);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1258275768);
                        c28655q.m87173q(false);
                        modifierM3495a = modifierM51775c;
                    }
                    Modifier modifierMo3471e = modifierM3409f.mo3471e(modifierM3495a).mo3471e(new DraggableAnchorsElement(c14947a0, new C13242h(c15199y3, 16)));
                    C14947a0 c14947a1 = c15199y3.f57060b;
                    if (z16 || c14947a1.f55770g.getValue() == enumC15209z3) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    Modifier modifierM16786l = AbstractC5583n.m16786l(modifierMo3471e, c14947a1, enumC16377d2, z18, false, 56);
                    if (z16) {
                        c28655q.m87150e0(352377090);
                        zM87157i2 = c28655q.m87157i(c15199y3) | c28655q.m87157i(interfaceC2994c0);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C4439c(c15199y3, interfaceC2994c0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R3);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1258354200);
                        c28655q.m87173q(false);
                    }
                    int i38 = i37 >> 12;
                    float f17 = f16;
                    long j16 = jM43101b;
                    interfaceC17869a3 = interfaceC17869a6;
                    AbstractC17269i.m48898k(modifierM16786l.mo3471e(modifierM51775c), interfaceC17869a3, j7, j16, null, f17, AbstractC37817c.m121344e(-1557535116, c28655q, new C2567l4(c37816b, 11)), c28655q, ((i37 >> 9) & 112) | 1572864 | (i38 & 896) | (i38 & 7168) | (i37 & 458752), 16);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    modifier2 = modifier4;
                    j15 = j16;
                    f14 = f17;
                    z15 = z16;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    f14 = f13;
                    j15 = j13;
                    z15 = z13;
                    interfaceC17869a3 = interfaceC17869a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.s3
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                            AbstractC1118c.m3458a(c37816b, modifier2, c15199y3, z15, interfaceC17869a3, f14, j7, j15, j14, c37816b2, (Composer) obj, iM87244L, i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= 3072;
            z13 = z4;
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) == 0) {
                    interfaceC17869a2 = interfaceC17869a1;
                    if (c28655q.m87153g(interfaceC17869a2)) {
                        i29 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i15 |= i29;
                } else {
                    interfaceC17869a2 = interfaceC17869a1;
                }
                i29 = DfuBaseService.ERROR_REMOTE_MASK;
                i15 |= i29;
            } else {
                interfaceC17869a2 = interfaceC17869a1;
            }
            if ((196608 & i13) != 0) {
                i15 |= ((i14 & 32) == 0 || !c28655q.m87147d(f13)) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87151f(j7)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i15 |= i28;
            }
            if ((i13 & 12582912) == 0) {
                if ((i14 & 128) == 0) {
                    i18 = i35;
                    if (c28655q.m87151f(j13)) {
                    }
                    i15 |= i36;
                } else {
                    i18 = i35;
                }
                i15 |= i36;
            } else {
                i18 = i35;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87151f(j14)) {
                    i27 = 67108864;
                } else {
                    i27 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i27;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87157i(c37816b2)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i15 |= i26;
            }
            i19 = i15;
            i24 = i18;
            if ((i15 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i19 & 1, z14)) {
                c28655q.m87140Z();
                i25 = i13 & 1;
                modifierM51775c = C2314t.f9131w;
                if (i25 != 0) {
                    if (i24 != 0) {
                        modifier3 = modifierM51775c;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 16) != 0) {
                        interfaceC17869a4 = ((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a)).f56429c;
                        i19 &= -57345;
                    } else {
                        interfaceC17869a4 = interfaceC17869a2;
                    }
                    if ((i14 & 32) != 0) {
                        f15 = AbstractC15129r3.f56692a;
                        i19 &= -458753;
                    } else {
                        f15 = f13;
                    }
                    if ((i14 & 128) != 0) {
                        jM43101b = AbstractC14981d1.m43101b(j7, c28655q);
                        i19 &= -29360129;
                    } else {
                        jM43101b = j13;
                    }
                    interfaceC17869a5 = interfaceC17869a4;
                    f16 = f15;
                } else {
                    if (i24 != 0) {
                        modifier3 = modifierM51775c;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 16) != 0) {
                        interfaceC17869a4 = ((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a)).f56429c;
                        i19 &= -57345;
                    } else {
                        interfaceC17869a4 = interfaceC17869a2;
                    }
                    if ((i14 & 32) != 0) {
                        f15 = AbstractC15129r3.f56692a;
                        i19 &= -458753;
                    } else {
                        f15 = f13;
                    }
                    if ((i14 & 128) != 0) {
                        jM43101b = AbstractC14981d1.m43101b(j7, c28655q);
                        i19 &= -29360129;
                    } else {
                        jM43101b = j13;
                    }
                    interfaceC17869a5 = interfaceC17869a4;
                    f16 = f15;
                }
                int i39 = i19;
                z16 = z13;
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                EnumC16377d2 enumC16377d3 = EnumC16377d2.f62971w;
                C2307m c2307m2 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
                InterfaceC17869a1 interfaceC17869a7 = interfaceC17869a5;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                Modifier modifier5 = modifier3;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d3);
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
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, modifierM51775c);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                c37816b2.invoke(c28655q, Integer.valueOf((i39 >> 27) & 14));
                zM87157i = c28655q.m87157i(c15199y3) | c28655q.m87157i(interfaceC2994c0);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C3196h(c15199y3, interfaceC2994c0, 8);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3196h(c15199y3, interfaceC2994c0, 8);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                c14947a0 = c15199y3.f57060b;
                value = c14947a0.f55771h.getValue();
                enumC15209z3 = EnumC15209z3.f57106w;
                if (value != enumC15209z3) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                m3459b(j14, interfaceC4339a2, z17, c28655q, (i39 >> 24) & 14);
                c28655q.m87173q(true);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3425v(C1100b.f4583a.mo3400a(modifierM51775c, C2299e.f9115x), 0.0f, f4724c, 1));
                if (z16) {
                    c28655q.m87150e0(351375666);
                    zM87153g = c28655q.m87153g(c14947a0);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new C15169v3(c14947a0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C15169v3(c14947a0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    modifierM3495a = AbstractC1129a.m3495a(modifierM51775c, (InterfaceC33313a) objM87133R4, null);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1258275768);
                    c28655q.m87173q(false);
                    modifierM3495a = modifierM51775c;
                }
                Modifier modifierMo3471e2 = modifierM3409f2.mo3471e(modifierM3495a).mo3471e(new DraggableAnchorsElement(c14947a0, new C13242h(c15199y3, 16)));
                C14947a0 c14947a2 = c15199y3.f57060b;
                if (z16) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                Modifier modifierM16786l2 = AbstractC5583n.m16786l(modifierMo3471e2, c14947a2, enumC16377d3, z18, false, 56);
                if (z16) {
                    c28655q.m87150e0(352377090);
                    zM87157i2 = c28655q.m87157i(c15199y3) | c28655q.m87157i(interfaceC2994c0);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R3 = new C4439c(c15199y3, interfaceC2994c0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C4439c(c15199y3, interfaceC2994c0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R3);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1258354200);
                    c28655q.m87173q(false);
                }
                int i310 = i39 >> 12;
                float f18 = f16;
                long j17 = jM43101b;
                interfaceC17869a3 = interfaceC17869a7;
                AbstractC17269i.m48898k(modifierM16786l2.mo3471e(modifierM51775c), interfaceC17869a3, j7, j17, null, f18, AbstractC37817c.m121344e(-1557535116, c28655q, new C2567l4(c37816b, 11)), c28655q, ((i39 >> 9) & 112) | 1572864 | (i310 & 896) | (i310 & 7168) | (i39 & 458752), 16);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier2 = modifier5;
                j15 = j17;
                f14 = f18;
                z15 = z16;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                f14 = f13;
                j15 = j13;
                z15 = z13;
                interfaceC17869a3 = interfaceC17869a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.s3
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                        AbstractC1118c.m3458a(c37816b, modifier2, c15199y3, z15, interfaceC17869a3, f14, j7, j15, j14, c37816b2, (Composer) obj, iM87244L, i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= 48;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(c15199y3)) {
                i34 = 256;
            } else {
                i34 = 128;
            }
            i15 |= i34;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) == 0) {
                    interfaceC17869a2 = interfaceC17869a1;
                    if (c28655q.m87153g(interfaceC17869a2)) {
                        i29 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i15 |= i29;
                } else {
                    interfaceC17869a2 = interfaceC17869a1;
                }
                i29 = DfuBaseService.ERROR_REMOTE_MASK;
                i15 |= i29;
            } else {
                interfaceC17869a2 = interfaceC17869a1;
            }
            if ((196608 & i13) != 0) {
                i15 |= ((i14 & 32) == 0 || !c28655q.m87147d(f13)) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87151f(j7)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i15 |= i28;
            }
            if ((i13 & 12582912) == 0) {
                if ((i14 & 128) == 0) {
                    i18 = i35;
                    if (c28655q.m87151f(j13)) {
                    }
                    i15 |= i36;
                } else {
                    i18 = i35;
                }
                i15 |= i36;
            } else {
                i18 = i35;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87151f(j14)) {
                    i27 = 67108864;
                } else {
                    i27 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i27;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87157i(c37816b2)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i15 |= i26;
            }
            i19 = i15;
            i24 = i18;
            if ((i15 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i19 & 1, z14)) {
                c28655q.m87140Z();
                i25 = i13 & 1;
                modifierM51775c = C2314t.f9131w;
                if (i25 != 0) {
                    if (i24 != 0) {
                        modifier3 = modifierM51775c;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 16) != 0) {
                        interfaceC17869a4 = ((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a)).f56429c;
                        i19 &= -57345;
                    } else {
                        interfaceC17869a4 = interfaceC17869a2;
                    }
                    if ((i14 & 32) != 0) {
                        f15 = AbstractC15129r3.f56692a;
                        i19 &= -458753;
                    } else {
                        f15 = f13;
                    }
                    if ((i14 & 128) != 0) {
                        jM43101b = AbstractC14981d1.m43101b(j7, c28655q);
                        i19 &= -29360129;
                    } else {
                        jM43101b = j13;
                    }
                    interfaceC17869a5 = interfaceC17869a4;
                    f16 = f15;
                } else {
                    if (i24 != 0) {
                        modifier3 = modifierM51775c;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 16) != 0) {
                        interfaceC17869a4 = ((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a)).f56429c;
                        i19 &= -57345;
                    } else {
                        interfaceC17869a4 = interfaceC17869a2;
                    }
                    if ((i14 & 32) != 0) {
                        f15 = AbstractC15129r3.f56692a;
                        i19 &= -458753;
                    } else {
                        f15 = f13;
                    }
                    if ((i14 & 128) != 0) {
                        jM43101b = AbstractC14981d1.m43101b(j7, c28655q);
                        i19 &= -29360129;
                    } else {
                        jM43101b = j13;
                    }
                    interfaceC17869a5 = interfaceC17869a4;
                    f16 = f15;
                }
                int i311 = i19;
                z16 = z13;
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                EnumC16377d2 enumC16377d4 = EnumC16377d2.f62971w;
                C2307m c2307m3 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m3, false);
                InterfaceC17869a1 interfaceC17869a8 = interfaceC17869a5;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                Modifier modifier6 = modifier3;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d5);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, modifierM51775c);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                c37816b2.invoke(c28655q, Integer.valueOf((i311 >> 27) & 14));
                zM87157i = c28655q.m87157i(c15199y3) | c28655q.m87157i(interfaceC2994c0);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C3196h(c15199y3, interfaceC2994c0, 8);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3196h(c15199y3, interfaceC2994c0, 8);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                c14947a0 = c15199y3.f57060b;
                value = c14947a0.f55771h.getValue();
                enumC15209z3 = EnumC15209z3.f57106w;
                if (value != enumC15209z3) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                m3459b(j14, interfaceC4339a3, z17, c28655q, (i311 >> 24) & 14);
                c28655q.m87173q(true);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3425v(C1100b.f4583a.mo3400a(modifierM51775c, C2299e.f9115x), 0.0f, f4724c, 1));
                if (z16) {
                    c28655q.m87150e0(351375666);
                    zM87153g = c28655q.m87153g(c14947a0);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new C15169v3(c14947a0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C15169v3(c14947a0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    modifierM3495a = AbstractC1129a.m3495a(modifierM51775c, (InterfaceC33313a) objM87133R4, null);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1258275768);
                    c28655q.m87173q(false);
                    modifierM3495a = modifierM51775c;
                }
                Modifier modifierMo3471e3 = modifierM3409f3.mo3471e(modifierM3495a).mo3471e(new DraggableAnchorsElement(c14947a0, new C13242h(c15199y3, 16)));
                C14947a0 c14947a3 = c15199y3.f57060b;
                if (z16) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                Modifier modifierM16786l3 = AbstractC5583n.m16786l(modifierMo3471e3, c14947a3, enumC16377d4, z18, false, 56);
                if (z16) {
                    c28655q.m87150e0(352377090);
                    zM87157i2 = c28655q.m87157i(c15199y3) | c28655q.m87157i(interfaceC2994c0);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R3 = new C4439c(c15199y3, interfaceC2994c0);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C4439c(c15199y3, interfaceC2994c0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R3);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1258354200);
                    c28655q.m87173q(false);
                }
                int i312 = i311 >> 12;
                float f19 = f16;
                long j18 = jM43101b;
                interfaceC17869a3 = interfaceC17869a8;
                AbstractC17269i.m48898k(modifierM16786l3.mo3471e(modifierM51775c), interfaceC17869a3, j7, j18, null, f19, AbstractC37817c.m121344e(-1557535116, c28655q, new C2567l4(c37816b, 11)), c28655q, ((i311 >> 9) & 112) | 1572864 | (i312 & 896) | (i312 & 7168) | (i311 & 458752), 16);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier2 = modifier6;
                j15 = j18;
                f14 = f19;
                z15 = z16;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                f14 = f13;
                j15 = j13;
                z15 = z13;
                interfaceC17869a3 = interfaceC17869a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.s3
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                        AbstractC1118c.m3458a(c37816b, modifier2, c15199y3, z15, interfaceC17869a3, f14, j7, j15, j14, c37816b2, (Composer) obj, iM87244L, i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= 3072;
        z13 = z4;
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) == 0) {
                interfaceC17869a2 = interfaceC17869a1;
                if (c28655q.m87153g(interfaceC17869a2)) {
                    i29 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i15 |= i29;
            } else {
                interfaceC17869a2 = interfaceC17869a1;
            }
            i29 = DfuBaseService.ERROR_REMOTE_MASK;
            i15 |= i29;
        } else {
            interfaceC17869a2 = interfaceC17869a1;
        }
        if ((196608 & i13) != 0) {
            i15 |= ((i14 & 32) == 0 || !c28655q.m87147d(f13)) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
        }
        if ((i13 & 1572864) == 0) {
            if (c28655q.m87151f(j7)) {
                i28 = 1048576;
            } else {
                i28 = 524288;
            }
            i15 |= i28;
        }
        if ((i13 & 12582912) == 0) {
            if ((i14 & 128) == 0) {
                i18 = i35;
                if (c28655q.m87151f(j13)) {
                }
                i15 |= i36;
            } else {
                i18 = i35;
            }
            i15 |= i36;
        } else {
            i18 = i35;
        }
        if ((i13 & 100663296) == 0) {
            if (c28655q.m87151f(j14)) {
                i27 = 67108864;
            } else {
                i27 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 |= i27;
        }
        if ((i13 & 805306368) == 0) {
            if (c28655q.m87157i(c37816b2)) {
                i26 = 536870912;
            } else {
                i26 = 268435456;
            }
            i15 |= i26;
        }
        i19 = i15;
        i24 = i18;
        if ((i15 & 306783379) != 306783378) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i19 & 1, z14)) {
            c28655q.m87140Z();
            i25 = i13 & 1;
            modifierM51775c = C2314t.f9131w;
            if (i25 != 0) {
                if (i24 != 0) {
                    modifier3 = modifierM51775c;
                } else {
                    modifier3 = modifier;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if ((i14 & 16) != 0) {
                    interfaceC17869a4 = ((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a)).f56429c;
                    i19 &= -57345;
                } else {
                    interfaceC17869a4 = interfaceC17869a2;
                }
                if ((i14 & 32) != 0) {
                    f15 = AbstractC15129r3.f56692a;
                    i19 &= -458753;
                } else {
                    f15 = f13;
                }
                if ((i14 & 128) != 0) {
                    jM43101b = AbstractC14981d1.m43101b(j7, c28655q);
                    i19 &= -29360129;
                } else {
                    jM43101b = j13;
                }
                interfaceC17869a5 = interfaceC17869a4;
                f16 = f15;
            } else {
                if (i24 != 0) {
                    modifier3 = modifierM51775c;
                } else {
                    modifier3 = modifier;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if ((i14 & 16) != 0) {
                    interfaceC17869a4 = ((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a)).f56429c;
                    i19 &= -57345;
                } else {
                    interfaceC17869a4 = interfaceC17869a2;
                }
                if ((i14 & 32) != 0) {
                    f15 = AbstractC15129r3.f56692a;
                    i19 &= -458753;
                } else {
                    f15 = f13;
                }
                if ((i14 & 128) != 0) {
                    jM43101b = AbstractC14981d1.m43101b(j7, c28655q);
                    i19 &= -29360129;
                } else {
                    jM43101b = j13;
                }
                interfaceC17869a5 = interfaceC17869a4;
                f16 = f15;
            }
            int i313 = i19;
            z16 = z13;
            c28655q.m87175r();
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            EnumC16377d2 enumC16377d5 = EnumC16377d2.f62971w;
            C2307m c2307m4 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m4, false);
            InterfaceC17869a1 interfaceC17869a9 = interfaceC17869a5;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifier3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            Modifier modifier7 = modifier3;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d7);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, modifierM51775c);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m4, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
            c37816b2.invoke(c28655q, Integer.valueOf((i313 >> 27) & 14));
            zM87157i = c28655q.m87157i(c15199y3) | c28655q.m87157i(interfaceC2994c0);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new C3196h(c15199y3, interfaceC2994c0, 8);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C3196h(c15199y3, interfaceC2994c0, 8);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            c14947a0 = c15199y3.f57060b;
            value = c14947a0.f55771h.getValue();
            enumC15209z3 = EnumC15209z3.f57106w;
            if (value != enumC15209z3) {
                z17 = true;
            } else {
                z17 = false;
            }
            m3459b(j14, interfaceC4339a4, z17, c28655q, (i313 >> 24) & 14);
            c28655q.m87173q(true);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3425v(C1100b.f4583a.mo3400a(modifierM51775c, C2299e.f9115x), 0.0f, f4724c, 1));
            if (z16) {
                c28655q.m87150e0(351375666);
                zM87153g = c28655q.m87153g(c14947a0);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R4 = new C15169v3(c14947a0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C15169v3(c14947a0);
                    c28655q.m87172p0(objM87133R4);
                }
                modifierM3495a = AbstractC1129a.m3495a(modifierM51775c, (InterfaceC33313a) objM87133R4, null);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1258275768);
                c28655q.m87173q(false);
                modifierM3495a = modifierM51775c;
            }
            Modifier modifierMo3471e4 = modifierM3409f4.mo3471e(modifierM3495a).mo3471e(new DraggableAnchorsElement(c14947a0, new C13242h(c15199y3, 16)));
            C14947a0 c14947a4 = c15199y3.f57060b;
            if (z16) {
                z18 = false;
            } else {
                z18 = false;
            }
            Modifier modifierM16786l4 = AbstractC5583n.m16786l(modifierMo3471e4, c14947a4, enumC16377d5, z18, false, 56);
            if (z16) {
                c28655q.m87150e0(352377090);
                zM87157i2 = c28655q.m87157i(c15199y3) | c28655q.m87157i(interfaceC2994c0);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R3 = new C4439c(c15199y3, interfaceC2994c0);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C4439c(c15199y3, interfaceC2994c0);
                    c28655q.m87172p0(objM87133R3);
                }
                modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R3);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1258354200);
                c28655q.m87173q(false);
            }
            int i314 = i313 >> 12;
            float f110 = f16;
            long j19 = jM43101b;
            interfaceC17869a3 = interfaceC17869a9;
            AbstractC17269i.m48898k(modifierM16786l4.mo3471e(modifierM51775c), interfaceC17869a3, j7, j19, null, f110, AbstractC37817c.m121344e(-1557535116, c28655q, new C2567l4(c37816b, 11)), c28655q, ((i313 >> 9) & 112) | 1572864 | (i314 & 896) | (i314 & 7168) | (i313 & 458752), 16);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier2 = modifier7;
            j15 = j19;
            f14 = f110;
            z15 = z16;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            f14 = f13;
            j15 = j13;
            z15 = z13;
            interfaceC17869a3 = interfaceC17869a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.s3
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                    AbstractC1118c.m3458a(c37816b, modifier2, c15199y3, z15, interfaceC17869a3, f14, j7, j15, j14, c37816b2, (Composer) obj, iM87244L, i14);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX INFO: renamed from: b */
    public static final void m3459b(long j7, InterfaceC4339a interfaceC4339a, boolean z4, Composer composer, int i13) {
        int i14;
        ?? r14;
        Modifier modifierM51775c;
        ?? r10 = (C28655q) composer;
        r10.m87154g0(-526532668);
        if ((i13 & 6) == 0) {
            i14 = (r10.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= r10.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= r10.m87155h(z4) ? 256 : 128;
        }
        if (!r10.m87135U(i14 & 1, (i14 & 147) != 146)) {
            r10.m87138X();
        } else if (j7 != 16) {
            r10.m87150e0(-714009568);
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(z4 ? 1.0f : 0.0f, new C11347e2(0, (InterfaceC11419z) null, 7), null, null, r10, 48, 28);
            String strM101177H = AbstractC32417h.m101177H(r10, 2);
            C2314t c2314t = C2314t.f9131w;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                r10.m87150e0(-713791669);
                int i15 = i14 & 112;
                boolean z13 = i15 == 32;
                Object objM87133R = r10.m87133R();
                Object obj = objM87133R;
                if (z13 || objM87133R == c28676v0) {
                    C15068l2 c15068l2 = new C15068l2(interfaceC4339a, 1);
                    r10.m87172p0(c15068l2);
                    obj = c15068l2;
                }
                Modifier modifierM108903b = AbstractC34452c0.m108903b(c2314t, interfaceC4339a, (PointerInputEventHandler) obj);
                boolean zM87153g = (i15 == 32) | r10.m87153g(strM101177H);
                Object objM87133R2 = r10.m87133R();
                Object obj2 = objM87133R2;
                if (zM87153g || objM87133R2 == c28676v0) {
                    C15015g2 c15015g2 = new C15015g2(1, strM101177H, interfaceC4339a);
                    r10.m87172p0(c15015g2);
                    obj2 = c15015g2;
                }
                modifierM51775c = AbstractC18032n.m51775c(modifierM108903b, true, (Function1) obj2);
                r14 = 0;
                r10.m87173q(false);
            } else {
                r14 = 0;
                r10.m87150e0(-713427946);
                r10.m87173q(false);
                modifierM51775c = c2314t;
            }
            Modifier modifierMo3471e = AbstractC1102d.m3407d(1.0f, c2314t).mo3471e(modifierM51775c);
            int i16 = (r10.m87153g(interfaceC28670t2M30588b) ? 1 : 0) | ((i14 & 14) == 4 ? 1 : r14);
            Object objM87133R3 = r10.m87133R();
            Object obj3 = objM87133R3;
            if (i16 != 0 || objM87133R3 == c28676v0) {
                C3840g c3840g = new C3840g(j7, interfaceC28670t2M30588b, 2);
                r10.m87172p0(c3840g);
                obj3 = c3840g;
            }
            AbstractC21478l0.m60421a(modifierMo3471e, (Function1) obj3, r10, r14);
            r10.m87173q(r14);
        } else {
            r10.m87150e0(-713242690);
            r10.m87173q(false);
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2478a3(j7, interfaceC4339a, z4, i13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C15199y3 m3460c(EnumC15209z3 enumC15209z3, C11347e2 c11347e2, Function1 function1, boolean z4, Composer composer, int i13, int i14) {
        if ((i14 & 2) != 0) {
            c11347e2 = AbstractC15129r3.f56693b;
        }
        C11347e2 c11347e3 = c11347e2;
        int i15 = i14 & 4;
        C28676v0 c28676v0 = C28635l.f115821a;
        if (i15 != 0) {
            C28655q c28655q = (C28655q) composer;
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C14686c(24);
                c28655q.m87172p0(objM87133R);
            }
            function1 = (Function1) objM87133R;
        }
        Function1 function2 = function1;
        boolean z13 = (i14 & 8) != 0 ? false : z4;
        C28655q c28655q2 = (C28655q) composer;
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
        c28655q2.m87144b0(-1222943993, enumC15209z3);
        Object[] objArr = {enumC15209z3, c11347e3, Boolean.valueOf(z13), function2, interfaceC39171c};
        C28539n0 c28539n0 = new C28539n0(10, new C12413a(22), new C4614e(interfaceC39171c, function2, c11347e3, z13));
        boolean z14 = true;
        boolean zM87153g = ((((i13 & 14) ^ 6) > 4 && c28655q2.m87149e(enumC15209z3.ordinal())) || (i13 & 6) == 4) | c28655q2.m87153g(interfaceC39171c) | ((((i13 & 896) ^ 384) > 256 && c28655q2.m87153g(function2)) || (i13 & 384) == 256) | c28655q2.m87157i(c11347e3);
        if ((((i13 & 7168) ^ 3072) <= 2048 || !c28655q2.m87155h(z13)) && (i13 & 3072) != 2048) {
            z14 = false;
        }
        boolean z15 = zM87153g | z14;
        Object objM87133R2 = c28655q2.m87133R();
        if (z15 || objM87133R2 == c28676v0) {
            C4660x0 c4660x0 = new C4660x0(enumC15209z3, interfaceC39171c, function2, c11347e3, z13);
            c28655q2.m87172p0(c4660x0);
            objM87133R2 = c4660x0;
        }
        C15199y3 c15199y3 = (C15199y3) AbstractC39038k.m124458d(objArr, c28539n0, (InterfaceC4339a) objM87133R2, c28655q2, 0);
        c28655q2.m87173q(false);
        return c15199y3;
    }
}
