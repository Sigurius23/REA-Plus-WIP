package androidx.compose.material3;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.selection.AbstractC1112d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2637v;
import d30.C11545k0;
import ge3.AbstractC15751g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.C11354g1;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22989q;
import p292l1.AbstractC23124k3;
import p292l1.AbstractC23130l3;
import p292l1.AbstractC23138n;
import p292l1.AbstractC23160q3;
import p292l1.AbstractC23194w1;
import p292l1.C23083d4;
import p292l1.C23132m;
import p354o1.AbstractC27386y;
import p354o1.EnumC27375n;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39111m;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: androidx.compose.material3.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1123d {

    /* JADX INFO: renamed from: a */
    public static final float f4755a;

    /* JADX INFO: renamed from: b */
    public static final float f4756b;

    /* JADX INFO: renamed from: c */
    public static final float f4757c;

    /* JADX INFO: renamed from: d */
    public static final float f4758d;

    /* JADX INFO: renamed from: e */
    public static final float f4759e;

    /* JADX INFO: renamed from: f */
    public static final C11354g1 f4760f;

    static {
        float f13 = AbstractC27386y.f110083p;
        f4755a = f13;
        f4756b = AbstractC27386y.f110093z;
        f4757c = AbstractC27386y.f110090w;
        float f14 = AbstractC27386y.f110087t;
        f4758d = f14;
        f4759e = (f14 - f13) / 2;
        f4760f = new C11354g1(0);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x0146  */
    /* JADX WARN: Code duplicated, block: B:49:0x014c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0161  */
    /* JADX WARN: Code duplicated, block: B:56:0x016c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0183  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m3465a(boolean z4, Function1 function1, Modifier modifier, boolean z13, C23083d4 c23083d4, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C23083d4 c23083d5;
        int i16;
        int i17;
        boolean z14;
        C28655q c28655q;
        Modifier modifier3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        int i18;
        Modifier modifierM3447a;
        C23083d4 c23083d6;
        int i19;
        Modifier modifier4;
        boolean z16;
        C23132m c23132m;
        C23083d4 c23083d7;
        long j7;
        Object objM87133R;
        InterfaceC21083i interfaceC21083i;
        boolean z17;
        InterfaceC21083i interfaceC21083i2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-263339167);
        int i24 = i13 | (c28655q2.m87155h(z4) ? 4 : 2) | (c28655q2.m87157i(function1) ? 32 : 16);
        int i25 = i14 & 4;
        if (i25 != 0) {
            i15 = i24 | 384;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i15 = i24 | (c28655q2.m87153g(modifier2) ? 256 : 128);
        }
        int i26 = i15 | 27648;
        if ((i14 & 32) == 0) {
            c23083d5 = c23083d4;
            if (c28655q2.m87153g(c23083d5)) {
                i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            }
            i17 = i26 | i16 | 1572864;
            if ((599187 & i17) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i17 & 1, z14)) {
                c28655q2.m87140Z();
                i18 = i13 & 1;
                modifierM3447a = C2314t.f9131w;
                if (i18 != 0 || c28655q2.m87118C()) {
                    if (i25 != 0) {
                        modifier2 = modifierM3447a;
                    }
                    if ((i14 & 32) != 0) {
                        c23132m = (C23132m) c28655q2.m87161k(AbstractC23138n.f91494a);
                        c23083d7 = c23132m.f91440b0;
                        j7 = c23132m.f91456p;
                        if (c23083d7 == null) {
                            long jM67117c = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110082o);
                            long jM67117c2 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110085r);
                            long j13 = C17919x.f69636m;
                            long jM67117c3 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110084q);
                            long jM67117c4 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110092y);
                            long jM67117c5 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110067B);
                            long jM67117c6 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110091x);
                            long jM67117c7 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110066A);
                            long jM51528p = AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110069b, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110068a)), j7);
                            long jM67117c8 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110072e);
                            float f13 = AbstractC27386y.f110073f;
                            c23083d6 = new C23083d4(jM67117c, jM67117c2, j13, jM67117c3, jM67117c4, jM67117c5, jM67117c6, jM67117c7, jM51528p, AbstractC17918w0.m51528p(C17919x.m51541c(f13, jM67117c8), j7), j13, AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110071d, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110070c)), j7), AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110075h, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110074g)), j7), AbstractC17918w0.m51528p(C17919x.m51541c(f13, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110078k)), j7), AbstractC17918w0.m51528p(C17919x.m51541c(f13, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110079l)), j7), AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110077j, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110076i)), j7));
                            c23132m.f91440b0 = c23083d6;
                        } else {
                            c23083d6 = c23083d7;
                        }
                        i17 &= -458753;
                    } else {
                        c23083d6 = c23083d5;
                    }
                    i19 = i17;
                    modifier4 = modifier2;
                    z16 = true;
                } else {
                    c28655q2.m87138X();
                    if ((i14 & 32) != 0) {
                        i17 &= -458753;
                    }
                    i19 = i17;
                    modifier4 = modifier2;
                    c23083d6 = c23083d5;
                    z16 = z13;
                }
                c28655q2.m87175r();
                c28655q2.m87150e0(1768604058);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                interfaceC21083i = (InterfaceC21083i) objM87133R;
                c28655q2.m87173q(false);
                if (function1 != null) {
                    C39111m c39111m = AbstractC23194w1.f91761a;
                    modifierM3447a = AbstractC1112d.m3447a(MinimumInteractiveModifier.f4745w, z4, interfaceC21083i, null, z16, new C18027i(2), function1);
                    boolean z18 = z16;
                    interfaceC21083i2 = interfaceC21083i;
                    z17 = z18;
                } else {
                    z17 = z16;
                    interfaceC21083i2 = interfaceC21083i;
                }
                c28655q = c28655q2;
                C23083d4 c23083d8 = c23083d6;
                m3466b(AbstractC1102d.m3416m(AbstractC1102d.m3428y(modifier4.mo3471e(modifierM3447a), C2299e.f9102E, false, 2), f4757c, f4758d), z4, z17, c23083d8, interfaceC21083i2, AbstractC23160q3.m67130b(AbstractC27386y.f110080m, c28655q2), c28655q, ((i19 << 3) & 112) | 384 | ((i19 >> 6) & 7168) | 24576);
                z15 = z17;
                c23083d5 = c23083d8;
                modifier3 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11545k0(z4, function1, modifier3, z15, c23083d5, i13, i14);
            }
        }
        c23083d5 = c23083d4;
        i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        i17 = i26 | i16 | 1572864;
        if ((599187 & i17) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i17 & 1, z14)) {
            c28655q2.m87140Z();
            i18 = i13 & 1;
            modifierM3447a = C2314t.f9131w;
            if (i18 != 0) {
                if (i25 != 0) {
                    modifier2 = modifierM3447a;
                }
                if ((i14 & 32) != 0) {
                    c23132m = (C23132m) c28655q2.m87161k(AbstractC23138n.f91494a);
                    c23083d7 = c23132m.f91440b0;
                    j7 = c23132m.f91456p;
                    if (c23083d7 == null) {
                        long jM67117c9 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110082o);
                        long jM67117c10 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110085r);
                        long j14 = C17919x.f69636m;
                        long jM67117c11 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110084q);
                        long jM67117c12 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110092y);
                        long jM67117c13 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110067B);
                        long jM67117c14 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110091x);
                        long jM67117c15 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110066A);
                        long jM51528p2 = AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110069b, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110068a)), j7);
                        long jM67117c16 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110072e);
                        float f14 = AbstractC27386y.f110073f;
                        c23083d6 = new C23083d4(jM67117c9, jM67117c10, j14, jM67117c11, jM67117c12, jM67117c13, jM67117c14, jM67117c15, jM51528p2, AbstractC17918w0.m51528p(C17919x.m51541c(f14, jM67117c16), j7), j14, AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110071d, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110070c)), j7), AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110075h, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110074g)), j7), AbstractC17918w0.m51528p(C17919x.m51541c(f14, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110078k)), j7), AbstractC17918w0.m51528p(C17919x.m51541c(f14, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110079l)), j7), AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110077j, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110076i)), j7));
                        c23132m.f91440b0 = c23083d6;
                    } else {
                        c23083d6 = c23083d7;
                    }
                    i17 &= -458753;
                } else {
                    c23083d6 = c23083d5;
                }
                i19 = i17;
                modifier4 = modifier2;
                z16 = true;
            } else {
                if (i25 != 0) {
                    modifier2 = modifierM3447a;
                }
                if ((i14 & 32) != 0) {
                    c23132m = (C23132m) c28655q2.m87161k(AbstractC23138n.f91494a);
                    c23083d7 = c23132m.f91440b0;
                    j7 = c23132m.f91456p;
                    if (c23083d7 == null) {
                        long jM67117c17 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110082o);
                        long jM67117c18 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110085r);
                        long j15 = C17919x.f69636m;
                        long jM67117c19 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110084q);
                        long jM67117c110 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110092y);
                        long jM67117c111 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110067B);
                        long jM67117c112 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110091x);
                        long jM67117c113 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110066A);
                        long jM51528p3 = AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110069b, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110068a)), j7);
                        long jM67117c114 = AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110072e);
                        float f15 = AbstractC27386y.f110073f;
                        c23083d6 = new C23083d4(jM67117c17, jM67117c18, j15, jM67117c19, jM67117c110, jM67117c111, jM67117c112, jM67117c113, jM51528p3, AbstractC17918w0.m51528p(C17919x.m51541c(f15, jM67117c114), j7), j15, AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110071d, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110070c)), j7), AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110075h, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110074g)), j7), AbstractC17918w0.m51528p(C17919x.m51541c(f15, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110078k)), j7), AbstractC17918w0.m51528p(C17919x.m51541c(f15, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110079l)), j7), AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110077j, AbstractC23138n.m67117c(c23132m, AbstractC27386y.f110076i)), j7));
                        c23132m.f91440b0 = c23083d6;
                    } else {
                        c23083d6 = c23083d7;
                    }
                    i17 &= -458753;
                } else {
                    c23083d6 = c23083d5;
                }
                i19 = i17;
                modifier4 = modifier2;
                z16 = true;
            }
            c28655q2.m87175r();
            c28655q2.m87150e0(1768604058);
            objM87133R = c28655q2.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            interfaceC21083i = (InterfaceC21083i) objM87133R;
            c28655q2.m87173q(false);
            if (function1 != null) {
                C39111m c39111m2 = AbstractC23194w1.f91761a;
                modifierM3447a = AbstractC1112d.m3447a(MinimumInteractiveModifier.f4745w, z4, interfaceC21083i, null, z16, new C18027i(2), function1);
                boolean z19 = z16;
                interfaceC21083i2 = interfaceC21083i;
                z17 = z19;
            } else {
                z17 = z16;
                interfaceC21083i2 = interfaceC21083i;
            }
            c28655q = c28655q2;
            C23083d4 c23083d9 = c23083d6;
            m3466b(AbstractC1102d.m3416m(AbstractC1102d.m3428y(modifier4.mo3471e(modifierM3447a), C2299e.f9102E, false, 2), f4757c, f4758d), z4, z17, c23083d9, interfaceC21083i2, AbstractC23160q3.m67130b(AbstractC27386y.f110080m, c28655q2), c28655q, ((i19 << 3) & 112) | 384 | ((i19 >> 6) & 7168) | 24576);
            z15 = z17;
            c23083d5 = c23083d9;
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11545k0(z4, function1, modifier3, z15, c23083d5, i13, i14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3466b(Modifier modifier, boolean z4, boolean z13, C23083d4 c23083d4, InterfaceC21083i interfaceC21083i, InterfaceC17869a1 interfaceC17869a1, Composer composer, int i13) {
        int i14;
        long j7;
        long j13;
        long j14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-670917213);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(c23083d4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(null) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87153g(interfaceC21083i) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87153g(interfaceC17869a1) ? 1048576 : 524288;
        }
        if (c28655q.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            if (z13) {
                j7 = z4 ? c23083d4.f91083b : c23083d4.f91087f;
            } else {
                j7 = z4 ? c23083d4.f91091j : c23083d4.f91095n;
            }
            if (z13) {
                j13 = z4 ? c23083d4.f91082a : c23083d4.f91086e;
            } else {
                j13 = z4 ? c23083d4.f91090i : c23083d4.f91094m;
            }
            InterfaceC17869a1 interfaceC17869a1M67130b = AbstractC23160q3.m67130b(AbstractC27386y.f110089v, c28655q);
            float f13 = AbstractC27386y.f110088u;
            if (z13) {
                j14 = z4 ? c23083d4.f91084c : c23083d4.f91088g;
            } else {
                j14 = z4 ? c23083d4.f91092k : c23083d4.f91096o;
            }
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC15751g.m44455h(modifier, f13, j14, interfaceC17869a1M67130b), j7, interfaceC17869a1M67130b);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1095d.m3369a(C1100b.f4583a.mo3400a(C2314t.f9131w, C2299e.f9117z).mo3471e(new ThumbElement(interfaceC21083i, z4, AbstractC23124k3.m67109m(EnumC27375n.f109949x, c28655q))), interfaceC21083i, AbstractC23130l3.m67110a(AbstractC27386y.f110086s / 2, 4, false)), j13, interfaceC17869a1);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(1236071411);
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2637v(modifier, z4, z13, c23083d4, interfaceC21083i, interfaceC17869a1, i13);
        }
    }
}
