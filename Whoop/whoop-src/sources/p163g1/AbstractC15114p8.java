package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2663y4;
import c93.InterfaceC4351m;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p209i3.AbstractC18032n;
import p238j0.InterfaceC21083i;
import p291l0.InterfaceC22973k1;
import p294l3.C23254g;
import p294l3.C23285v0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p412q3.C29869e0;
import p412q3.InterfaceC29873g0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39072a0;
import p635y2.InterfaceC39124q0;
import se.AbstractC32417h;

/* JADX INFO: renamed from: g1.p8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15114p8 {

    /* JADX INFO: renamed from: a */
    public static final float f56624a = 16;

    /* JADX INFO: renamed from: b */
    public static final float f56625b = 12;

    /* JADX INFO: renamed from: a */
    public static final void m43174a(EnumC14967b9 enumC14967b9, String str, InterfaceC4351m interfaceC4351m, InterfaceC29873g0 interfaceC29873g0, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, InterfaceC4351m interfaceC4351m4, InterfaceC4351m interfaceC4351m5, boolean z4, boolean z13, boolean z14, InterfaceC21083i interfaceC21083i, InterfaceC22973k1 interfaceC22973k1, InterfaceC17869a1 interfaceC17869a1, InterfaceC14999e8 interfaceC14999e8, InterfaceC4351m interfaceC4351m6, Composer composer, int i13, int i14) {
        int i15;
        boolean z15;
        int i16;
        C28655q c28655q;
        EnumC15016g3 enumC15016g3;
        boolean z16;
        boolean z17;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(418608794);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87149e(enumC14967b9.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4351m) ? 256 : 128;
        }
        int i17 = i13 & 3072;
        int i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i17 == 0) {
            i15 |= c28655q2.m87153g(interfaceC29873g0) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        int i19 = i13 & 24576;
        int i24 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i19 == 0) {
            i15 |= c28655q2.m87157i(interfaceC4351m2) ? 16384 : 8192;
        }
        int i25 = i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i25 == 0) {
            i15 |= c28655q2.m87157i(interfaceC4351m3) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4351m4) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4351m5) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            z15 = z13;
            i15 |= c28655q2.m87155h(z15) ? 536870912 : 268435456;
        } else {
            z15 = z13;
        }
        if ((i14 & 6) == 0) {
            i16 = i14 | (c28655q2.m87155h(z14) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87153g(interfaceC21083i) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87153g(interfaceC22973k1) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q2.m87153g(interfaceC17869a1)) {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            }
            i16 |= i18;
        }
        if ((i14 & 24576) == 0) {
            if (c28655q2.m87153g(interfaceC14999e8)) {
                i24 = 16384;
            }
            i16 |= i24;
        }
        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87157i(interfaceC4351m6)) {
                i26 = 131072;
            }
            i16 |= i26;
        }
        if (c28655q2.m87135U(i15 & 1, ((i15 & 306783379) == 306783378 && (i16 & 74899) == 74898) ? false : true)) {
            boolean z18 = ((i15 & 112) == 32) | ((i15 & 7168) == 2048);
            Object objM87133R = c28655q2.m87133R();
            if (z18 || objM87133R == C28635l.f115821a) {
                objM87133R = interfaceC29873g0.mo43546a(new C23254g(str));
                c28655q2.m87172p0(objM87133R);
            }
            String str2 = ((C29869e0) objM87133R).f122088a.f92135x;
            if (((Boolean) AbstractC32417h.m101215x(interfaceC21083i, c28655q2, (i16 >> 3) & 14).getValue()).booleanValue()) {
                enumC15016g3 = EnumC15016g3.f56185w;
            } else {
                enumC15016g3 = str2.length() == 0 ? EnumC15016g3.f56186x : EnumC15016g3.f56187y;
            }
            C15032h8 c15032h8 = new C15032h8(interfaceC14999e8, z15, z14, interfaceC21083i, 1);
            C28674u2 c28674u2 = AbstractC15044i9.f56319b;
            C15033h9 c15033h9 = (C15033h9) c28655q2.m87161k(c28674u2);
            C23285v0 c23285v0 = c15033h9.f56280g;
            C23285v0 c23285v1 = c15033h9.f56285l;
            long jM67366c = c23285v0.m67366c();
            long j7 = C17919x.f69637n;
            boolean z19 = (C17919x.m51542d(jM67366c, j7) && !C17919x.m51542d(c23285v1.m67366c(), j7)) || (!C17919x.m51542d(c23285v0.m67366c(), j7) && C17919x.m51542d(c23285v1.m67366c(), j7));
            c28655q2.m87150e0(-1443811635);
            long jM67366c2 = ((C15033h9) c28655q2.m87161k(c28674u2)).f56285l.m67366c();
            if (z19) {
                c28655q2.m87150e0(-887928539);
                if (jM67366c2 == 16) {
                    jM67366c2 = ((C17919x) c15032h8.invoke(enumC15016g3, c28655q2, 0)).f69639a;
                }
                z16 = false;
                c28655q2.m87173q(false);
            } else {
                z16 = false;
                c28655q2.m87150e0(1218284988);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(z16);
            c28655q2.m87150e0(-1443804369);
            long jM67366c3 = ((C15033h9) c28655q2.m87161k(c28674u2)).f56280g.m67366c();
            if (z19) {
                c28655q2.m87150e0(-1026713946);
                if (jM67366c3 == 16) {
                    jM67366c3 = ((C17919x) c15032h8.invoke(enumC15016g3, c28655q2, 0)).f69639a;
                }
                z17 = false;
                c28655q2.m87173q(false);
            } else {
                z17 = false;
                c28655q2.m87150e0(798166043);
                c28655q2.m87173q(false);
            }
            long j13 = jM67366c3;
            c28655q2.m87173q(z17);
            c28655q = c28655q2;
            C14956a9.f55798a.m43081a(enumC15016g3, jM67366c2, j13, c15032h8, interfaceC4351m2 != null ? true : z17, AbstractC37817c.m121344e(33336375, c28655q, new C15094n8(interfaceC4351m2, interfaceC4351m3, str2, interfaceC14999e8, z13, z14, interfaceC21083i, interfaceC4351m4, interfaceC4351m5, interfaceC17869a1, enumC14967b9, interfaceC4351m, z4, interfaceC22973k1, z19, interfaceC4351m6)), c28655q, 1769472);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15010f8(enumC14967b9, str, interfaceC4351m, interfaceC29873g0, interfaceC4351m2, interfaceC4351m3, interfaceC4351m4, interfaceC4351m5, z4, z13, z14, interfaceC21083i, interfaceC22973k1, interfaceC17869a1, interfaceC14999e8, interfaceC4351m6, i13, i14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43175b(long j7, C23285v0 c23285v0, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2064632657);
        int i16 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 = i16 | 48;
        } else {
            i15 = i16 | (c28655q.m87153g(c23285v0) ? 32 : 16);
        }
        Float f13 = null;
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(null) ? 256 : 128;
        }
        int i18 = i15 | (c28655q.m87157i(interfaceC4351m) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if (c28655q.m87135U(i18 & 1, (i18 & 1171) != 1170)) {
            if (i17 != 0) {
                c23285v0 = null;
            }
            C37816b c37816bM121344e = AbstractC37817c.m121344e(-650790565, c28655q, new C15104o8(j7, f13, interfaceC4351m, 1));
            if (c23285v0 != null) {
                c28655q.m87150e0(-162878945);
                AbstractC15011f9.m43113a(c23285v0, c37816bM121344e, c28655q, ((i18 >> 3) & 14) | 48);
            } else {
                c28655q.m87150e0(-162877309);
                c37816bM121344e.invoke(c28655q, 6);
            }
            c28655q.m87173q(false);
        } else {
            c28655q.m87138X();
        }
        C23285v0 c23285v1 = c23285v0;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15054j8(j7, c23285v1, interfaceC4351m, i13, i14, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Modifier m43176c(Modifier modifier, boolean z4, String str) {
        return z4 ? AbstractC18032n.m51775c(modifier, false, new C2663y4(str, 23)) : modifier;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m43177d(InterfaceC39124q0 interfaceC39124q0) {
        Object objMo454p = interfaceC39124q0.mo454p();
        InterfaceC39072a0 interfaceC39072a0 = objMo454p instanceof InterfaceC39072a0 ? (InterfaceC39072a0) objMo454p : null;
        if (interfaceC39072a0 != null) {
            return interfaceC39072a0.mo35475T();
        }
        return null;
    }
}
