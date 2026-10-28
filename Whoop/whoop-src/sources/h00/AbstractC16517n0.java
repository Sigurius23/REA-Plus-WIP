package h00;

import a31.C0341c;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2533h2;
import b30.C2541i2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import f01.C13849c0;
import f01.C13857f;
import g00.AbstractC14936g;
import g00.C14931b;
import g00.C14934e;
import go1.C16016a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15047j1;
import p163g1.AbstractC15067l1;
import p163g1.C14970c1;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p479s4.AbstractC32128i;
import p512u2.C34450b0;
import p530up.AbstractC35148d;
import p571w3.C36775k;
import p599wz.C37724i0;
import p599wz.C37727j0;
import p599wz.C37730k0;
import p599wz.C37733l0;
import p599wz.C37736m0;
import p599wz.InterfaceC37739n0;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p696zy.C41210b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import u30.C34496a;
import wb3.AbstractC37056f;
import y00.C38840g6;
import y00.C38887l3;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: h00.n0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC16517n0 {

    /* JADX INFO: renamed from: a */
    public static final float f63506a = 13;

    /* JADX INFO: renamed from: b */
    public static final float f63507b = 16;

    /* JADX INFO: renamed from: a */
    public static final void m46672a(EnumC16519o0 enumC16519o0, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1035960763);
        int i14 = (c28655q.m87153g(enumC16519o0) ? 32 : 16) | i13 | (c28655q.m87155h(z4) ? 256 : 128) | (c28655q.m87157i(interfaceC4339a) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if ((i14 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else if (enumC16519o0 == EnumC16519o0.Disabled && z4) {
            Modifier modifierMo3401b = C1100b.f4583a.mo3401b(C2314t.f9131w);
            c28655q.m87150e0(-1879991325);
            boolean z13 = (i14 & 7168) == 2048;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C2533h2(interfaceC4339a, null, 1);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC22989q.m66760a(modifierMo3401b.mo3471e(new SuspendPointerInputElement(C23454a0.f92919a, null, null, new C34450b0((InterfaceC4351m) objM87133R), 6)), c28655q, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0341c(enumC16519o0, z4, interfaceC4339a, i13, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x0104  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:80:0x012e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0166  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m46673b(Modifier modifier, String label, EnumC16519o0 enumC16519o0, InterfaceC4339a onButtonClick, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        InterfaceC4339a interfaceC4339a3;
        float f13;
        InterfaceC4339a interfaceC4339a4;
        boolean z14;
        long j7;
        Object objM87133R;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(onButtonClick, "onButtonClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1883003516);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(label) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(enumC16519o0) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onButtonClick) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i18 = i14 & 16;
        if (i18 == 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                if (((i15 | 14155776) & 4793491) == 4793490 || !c28655q.m87121F()) {
                    if (i18 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        c28655q.m87150e0(-2079242947);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C16497d0(1);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    C28596b0 c28596b0 = AbstractC15047j1.f56336a;
                    if (enumC16519o0 == EnumC16519o0.Disabled) {
                        c28655q.m87150e0(-2079235933);
                        j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        c28655q.m87173q(false);
                        f13 = 0.38f;
                    } else {
                        c28655q.m87150e0(-2079235073);
                        long j13 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        float f14 = (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j13)) >= 0.5d : ((double) AbstractC17918w0.m51536x(j13)) <= 0.5d) ? 0.87f : 1.0f;
                        c28655q.m87173q(false);
                        f13 = f14;
                    }
                    boolean z15 = z13;
                    AbstractC28683x.m87247a(c28596b0.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(256130492, c28655q, new C16515m0(modifier, onButtonClick, enumC16519o0, z15, interfaceC4339a3, label)), c28655q, 56);
                    interfaceC4339a4 = interfaceC4339a3;
                    z14 = z15;
                } else {
                    c28655q.m87138X();
                    z14 = z13;
                    interfaceC4339a4 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(modifier, label, enumC16519o0, onButtonClick, z14, interfaceC4339a4, i13, i14, 7);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a2 = interfaceC4339a;
            if (((i15 | 14155776) & 4793491) == 4793490) {
                if (i18 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    c28655q.m87150e0(-2079242947);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C16497d0(1);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                C28596b0 c28596b1 = AbstractC15047j1.f56336a;
                if (enumC16519o0 == EnumC16519o0.Disabled) {
                    c28655q.m87150e0(-2079235933);
                    j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j7);
                    } else {
                        AbstractC17918w0.m51536x(j7);
                    }
                    c28655q.m87173q(false);
                    f13 = 0.38f;
                } else {
                    c28655q.m87150e0(-2079235073);
                    long j14 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    }
                    c28655q.m87173q(false);
                    f13 = f14;
                }
                boolean z16 = z13;
                AbstractC28683x.m87247a(c28596b1.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(256130492, c28655q, new C16515m0(modifier, onButtonClick, enumC16519o0, z16, interfaceC4339a3, label)), c28655q, 56);
                interfaceC4339a4 = interfaceC4339a3;
                z14 = z16;
            } else {
                if (i18 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    c28655q.m87150e0(-2079242947);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C16497d0(1);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                C28596b0 c28596b2 = AbstractC15047j1.f56336a;
                if (enumC16519o0 == EnumC16519o0.Disabled) {
                    c28655q.m87150e0(-2079235933);
                    j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j7);
                    } else {
                        AbstractC17918w0.m51536x(j7);
                    }
                    c28655q.m87173q(false);
                    f13 = 0.38f;
                } else {
                    c28655q.m87150e0(-2079235073);
                    long j15 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    }
                    c28655q.m87173q(false);
                    f13 = f14;
                }
                boolean z17 = z13;
                AbstractC28683x.m87247a(c28596b2.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(256130492, c28655q, new C16515m0(modifier, onButtonClick, enumC16519o0, z17, interfaceC4339a3, label)), c28655q, 56);
                interfaceC4339a4 = interfaceC4339a3;
                z14 = z17;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(modifier, label, enumC16519o0, onButtonClick, z14, interfaceC4339a4, i13, i14, 7);
            }
        }
        i15 |= 24576;
        z13 = z4;
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            if (((i15 | 14155776) & 4793491) == 4793490) {
                if (i18 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    c28655q.m87150e0(-2079242947);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C16497d0(1);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                C28596b0 c28596b3 = AbstractC15047j1.f56336a;
                if (enumC16519o0 == EnumC16519o0.Disabled) {
                    c28655q.m87150e0(-2079235933);
                    j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j7);
                    } else {
                        AbstractC17918w0.m51536x(j7);
                    }
                    c28655q.m87173q(false);
                    f13 = 0.38f;
                } else {
                    c28655q.m87150e0(-2079235073);
                    long j16 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    }
                    c28655q.m87173q(false);
                    f13 = f14;
                }
                boolean z18 = z13;
                AbstractC28683x.m87247a(c28596b3.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(256130492, c28655q, new C16515m0(modifier, onButtonClick, enumC16519o0, z18, interfaceC4339a3, label)), c28655q, 56);
                interfaceC4339a4 = interfaceC4339a3;
                z14 = z18;
            } else {
                if (i18 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    c28655q.m87150e0(-2079242947);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C16497d0(1);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                C28596b0 c28596b4 = AbstractC15047j1.f56336a;
                if (enumC16519o0 == EnumC16519o0.Disabled) {
                    c28655q.m87150e0(-2079235933);
                    j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j7);
                    } else {
                        AbstractC17918w0.m51536x(j7);
                    }
                    c28655q.m87173q(false);
                    f13 = 0.38f;
                } else {
                    c28655q.m87150e0(-2079235073);
                    long j17 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    }
                    c28655q.m87173q(false);
                    f13 = f14;
                }
                boolean z19 = z13;
                AbstractC28683x.m87247a(c28596b4.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(256130492, c28655q, new C16515m0(modifier, onButtonClick, enumC16519o0, z19, interfaceC4339a3, label)), c28655q, 56);
                interfaceC4339a4 = interfaceC4339a3;
                z14 = z19;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(modifier, label, enumC16519o0, onButtonClick, z14, interfaceC4339a4, i13, i14, 7);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a2 = interfaceC4339a;
        if (((i15 | 14155776) & 4793491) == 4793490) {
            if (i18 != 0) {
                z13 = false;
            }
            if (i16 != 0) {
                c28655q.m87150e0(-2079242947);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C16497d0(1);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                c28655q.m87173q(false);
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            C28596b0 c28596b5 = AbstractC15047j1.f56336a;
            if (enumC16519o0 == EnumC16519o0.Disabled) {
                c28655q.m87150e0(-2079235933);
                j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    AbstractC17918w0.m51536x(j7);
                } else {
                    AbstractC17918w0.m51536x(j7);
                }
                c28655q.m87173q(false);
                f13 = 0.38f;
            } else {
                c28655q.m87150e0(-2079235073);
                long j18 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                }
                c28655q.m87173q(false);
                f13 = f14;
            }
            boolean z110 = z13;
            AbstractC28683x.m87247a(c28596b5.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(256130492, c28655q, new C16515m0(modifier, onButtonClick, enumC16519o0, z110, interfaceC4339a3, label)), c28655q, 56);
            interfaceC4339a4 = interfaceC4339a3;
            z14 = z110;
        } else {
            if (i18 != 0) {
                z13 = false;
            }
            if (i16 != 0) {
                c28655q.m87150e0(-2079242947);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C16497d0(1);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                c28655q.m87173q(false);
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            C28596b0 c28596b6 = AbstractC15047j1.f56336a;
            if (enumC16519o0 == EnumC16519o0.Disabled) {
                c28655q.m87150e0(-2079235933);
                j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    AbstractC17918w0.m51536x(j7);
                } else {
                    AbstractC17918w0.m51536x(j7);
                }
                c28655q.m87173q(false);
                f13 = 0.38f;
            } else {
                c28655q.m87150e0(-2079235073);
                long j19 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                }
                c28655q.m87173q(false);
                f13 = f14;
            }
            boolean z111 = z13;
            AbstractC28683x.m87247a(c28596b6.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(256130492, c28655q, new C16515m0(modifier, onButtonClick, enumC16519o0, z111, interfaceC4339a3, label)), c28655q, 56);
            interfaceC4339a4 = interfaceC4339a3;
            z14 = z111;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(modifier, label, enumC16519o0, onButtonClick, z14, interfaceC4339a4, i13, i14, 7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m46674c(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2111548925);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(null) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Modifier modifierM3411h = AbstractC1102d.m3411h(f63507b, AbstractC1102d.m3424u(f63506a, C2314t.f9131w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-279004737);
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 15);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m46675d(EnumC16519o0 enumC16519o0, String str, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(627596096);
        int i14 = i13 | (c28655q.m87153g(enumC16519o0) ? 4 : 2) | (c28655q.m87153g(str) ? 32 : 16) | (c28655q.m87153g(null) ? 256 : 128) | (c28655q.m87153g(null) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if ((i14 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            int iOrdinal = enumC16519o0.ordinal();
            C2314t c2314t = C2314t.f9131w;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (iOrdinal == 2) {
                c28655q.m87150e0(-1151521553);
                Modifier modifierM3419p = AbstractC1102d.m3419p(20, c2314t);
                c28655q.m87150e0(-452784906);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C16016a(29);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3419p, false, (Function1) objM87133R);
                c28655q.m87150e0(-443512897);
                C28674u2 c28674u2 = AbstractC14936g.f55706c;
                C14931b c14931b = (C14931b) c28655q.m87161k(c28674u2);
                c28655q.m87173q(false);
                long jM51541c = C17919x.m51541c(0.1f, c14931b.f55666e);
                c28655q.m87150e0(-443512897);
                C14931b c14931b2 = (C14931b) c28655q.m87161k(c28674u2);
                c28655q.m87173q(false);
                AbstractC35148d.m111175f(4, 3072, 0, c14931b2.f55681t, jM51541c, c28655q, modifierM51775c);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (iOrdinal != 3) {
                c28655q.m87150e0(-452764570);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                m46674c(c28655q, (i14 >> 6) & 14);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                c28655q.m87150e0(-443512897);
                C14931b c14931b3 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                c28655q.m87173q(false);
                long jM51541c2 = C17919x.m51541c(((Number) c28655q.m87161k(AbstractC15047j1.f56336a)).floatValue(), c14931b3.f55681t);
                C36775k c36775k = new C36775k(3);
                c28655q.m87150e0(-1418551394);
                C14934e c14934e = (C14934e) c28655q.m87161k(AbstractC14936g.f55705b);
                c28655q.m87173q(false);
                AbstractC15011f9.m43114b(str, layoutWeightElement, jM51541c2, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c14934e.f55696c, c28655q, (i14 >> 3) & 14, 0, 65016);
                c28655q = c28655q;
                m46674c(c28655q, (i14 >> 9) & 14);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-452776187);
                AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(R.drawable.stripe_link_complete, c28655q, 0);
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(24, c2314t);
                c28655q.m87150e0(-452769738);
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C16513l0(0);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierM3419p2, false, (Function1) objM87133R2);
                c28655q.m87150e0(-443512897);
                C14931b c14931b4 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                c28655q.m87173q(false);
                AbstractC15005f3.m43107a(abstractC26165aM88500I, null, modifierM51775c2, c14931b4.f55681t, c28655q, 48, 0);
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13857f(enumC16519o0, str, i13, 23);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C41210b m46676e(InterfaceC38802c8 stripeIntent, InterfaceC37739n0 linkLaunchMode) {
        AbstractC22676k.m65750j(stripeIntent, "stripeIntent");
        AbstractC22676k.m65750j(linkLaunchMode, "linkLaunchMode");
        if (!(linkLaunchMode instanceof C37733l0) && !(linkLaunchMode instanceof C37730k0)) {
            if ((linkLaunchMode instanceof C37736m0) || (linkLaunchMode instanceof C37724i0) || (linkLaunchMode instanceof C37727j0)) {
                return AbstractC32128i.m100054h(R.string.stripe_continue_button_label);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(stripeIntent instanceof C38887l3)) {
            if (stripeIntent instanceof C38840g6) {
                return AbstractC32128i.m100054h(R.string.stripe_continue_button_label);
            }
            throw new NoWhenBranchMatchedException();
        }
        C38887l3 c38887l3 = (C38887l3) stripeIntent;
        Long l7 = c38887l3.f167393y;
        if (l7 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long jLongValue = l7.longValue();
        String str = c38887l3.f167376K;
        if (str != null) {
            return new C34496a(jLongValue, str).m109035b();
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
