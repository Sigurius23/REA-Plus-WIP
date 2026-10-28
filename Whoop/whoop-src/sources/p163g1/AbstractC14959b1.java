package p163g1;

import al.AbstractC0954a;
import am2.C1008b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.selection.AbstractC1112d;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import ar2.C1930a;
import b30.C2549j2;
import bv2.C3675b;
import c93.InterfaceC4339a;
import ep1.C13421p;
import j93.AbstractC21478l0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11343d2;
import p077d0.AbstractC11348f;
import p077d0.C11351f2;
import p077d0.C11354g1;
import p077d0.C11409v1;
import p077d0.C11421z1;
import p077d0.InterfaceC11337c0;
import p077d0.InterfaceC11403t1;
import p209i3.C18027i;
import p271k3.EnumC22167a;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28670t2;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import se.AbstractC32416g;

/* JADX INFO: renamed from: g1.b1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14959b1 {

    /* JADX INFO: renamed from: b */
    public static final float f55819b;

    /* JADX INFO: renamed from: d */
    public static final float f55821d;

    /* JADX INFO: renamed from: e */
    public static final float f55822e;

    /* JADX INFO: renamed from: a */
    public static final float f55818a = 24;

    /* JADX INFO: renamed from: c */
    public static final float f55820c = 20;

    static {
        float f13 = 2;
        f55819b = f13;
        f55821d = f13;
        f55822e = f13;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100  */
    /* JADX WARN: Code duplicated, block: B:86:0x010b  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m43082a(boolean z4, Function1 function1, Modifier modifier, boolean z13, InterfaceC14948a1 interfaceC14948a1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z14;
        int i17;
        int i18;
        boolean z15;
        Modifier modifier3;
        boolean z16;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        boolean z17;
        Modifier modifier5;
        InterfaceC4339a interfaceC4339a;
        boolean z18;
        boolean z19;
        Object objM87133R;
        int i19;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2118660998);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z14 = z13;
                    if (c28655q.m87155h(z14)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i15 | 24576;
                if ((196608 & i13) == 0) {
                    if (c28655q.m87153g(interfaceC14948a1)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i18 |= i19;
                }
                if ((74899 & i18) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i18 & 1, z15)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0 || c28655q.m87118C()) {
                        if (i24 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        z17 = z14;
                        modifier5 = modifier4;
                    } else {
                        c28655q.m87138X();
                        z17 = z14;
                        modifier5 = modifier2;
                    }
                    c28655q.m87175r();
                    EnumC22167a enumC22167aM101153j = AbstractC32416g.m101153j(z4);
                    if (function1 != null) {
                        c28655q.m87150e0(1809984331);
                        if ((i18 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | ((i18 & 14) == 4);
                        objM87133R = c28655q.m87133R();
                        if (z19 || objM87133R == C28635l.f115821a) {
                            objM87133R = new C3675b(function1, z4, 2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a = (InterfaceC4339a) objM87133R;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1810049027);
                        c28655q.m87173q(false);
                        interfaceC4339a = null;
                    }
                    m43084c(enumC22167aM101153j, interfaceC4339a, modifier5, z17, interfaceC14948a1, c28655q, i18 & 524160);
                    modifier3 = modifier5;
                    z16 = z17;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z16 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(z4, function1, modifier3, z16, interfaceC14948a1, i13, i14, 2);
                }
            }
            i15 |= 3072;
            z14 = z13;
            i18 = i15 | 24576;
            if ((196608 & i13) == 0) {
                if (c28655q.m87153g(interfaceC14948a1)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i18 |= i19;
            }
            if ((74899 & i18) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i18 & 1, z15)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    z17 = z14;
                    modifier5 = modifier4;
                } else {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    z17 = z14;
                    modifier5 = modifier4;
                }
                c28655q.m87175r();
                EnumC22167a enumC22167aM101153j2 = AbstractC32416g.m101153j(z4);
                if (function1 != null) {
                    c28655q.m87150e0(1809984331);
                    if ((i18 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | ((i18 & 14) == 4);
                    objM87133R = c28655q.m87133R();
                    if (z19) {
                        objM87133R = new C3675b(function1, z4, 2);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3675b(function1, z4, 2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a = (InterfaceC4339a) objM87133R;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1810049027);
                    c28655q.m87173q(false);
                    interfaceC4339a = null;
                }
                m43084c(enumC22167aM101153j2, interfaceC4339a, modifier5, z17, interfaceC14948a1, c28655q, i18 & 524160);
                modifier3 = modifier5;
                z16 = z17;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z16 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(z4, function1, modifier3, z16, interfaceC14948a1, i13, i14, 2);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z14 = z13;
                if (c28655q.m87155h(z14)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i15 | 24576;
            if ((196608 & i13) == 0) {
                if (c28655q.m87153g(interfaceC14948a1)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i18 |= i19;
            }
            if ((74899 & i18) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i18 & 1, z15)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    z17 = z14;
                    modifier5 = modifier4;
                } else {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    z17 = z14;
                    modifier5 = modifier4;
                }
                c28655q.m87175r();
                EnumC22167a enumC22167aM101153j3 = AbstractC32416g.m101153j(z4);
                if (function1 != null) {
                    c28655q.m87150e0(1809984331);
                    if ((i18 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | ((i18 & 14) == 4);
                    objM87133R = c28655q.m87133R();
                    if (z19) {
                        objM87133R = new C3675b(function1, z4, 2);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3675b(function1, z4, 2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a = (InterfaceC4339a) objM87133R;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1810049027);
                    c28655q.m87173q(false);
                    interfaceC4339a = null;
                }
                m43084c(enumC22167aM101153j3, interfaceC4339a, modifier5, z17, interfaceC14948a1, c28655q, i18 & 524160);
                modifier3 = modifier5;
                z16 = z17;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z16 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(z4, function1, modifier3, z16, interfaceC14948a1, i13, i14, 2);
            }
        }
        i15 |= 3072;
        z14 = z13;
        i18 = i15 | 24576;
        if ((196608 & i13) == 0) {
            if (c28655q.m87153g(interfaceC14948a1)) {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i18 |= i19;
        }
        if ((74899 & i18) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i18 & 1, z15)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                z17 = z14;
                modifier5 = modifier4;
            } else {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                z17 = z14;
                modifier5 = modifier4;
            }
            c28655q.m87175r();
            EnumC22167a enumC22167aM101153j4 = AbstractC32416g.m101153j(z4);
            if (function1 != null) {
                c28655q.m87150e0(1809984331);
                if ((i18 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | ((i18 & 14) == 4);
                objM87133R = c28655q.m87133R();
                if (z19) {
                    objM87133R = new C3675b(function1, z4, 2);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3675b(function1, z4, 2);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a = (InterfaceC4339a) objM87133R;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1810049027);
                c28655q.m87173q(false);
                interfaceC4339a = null;
            }
            m43084c(enumC22167aM101153j4, interfaceC4339a, modifier5, z17, interfaceC14948a1, c28655q, i18 & 524160);
            modifier3 = modifier5;
            z16 = z17;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z16 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13421p(z4, function1, modifier3, z16, interfaceC14948a1, i13, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0153  */
    /* JADX WARN: Code duplicated, block: B:83:0x016c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0172  */
    /* JADX WARN: Code duplicated, block: B:87:0x0178  */
    /* JADX WARN: Code duplicated, block: B:88:0x0180  */
    /* JADX WARN: Code duplicated, block: B:91:0x019a  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e2  */
    /* JADX INFO: renamed from: b */
    public static final void m43083b(boolean z4, EnumC22167a enumC22167a, Modifier modifier, InterfaceC14948a1 interfaceC14948a1, Composer composer, int i13) {
        int i14;
        float f13;
        float f14;
        float f15;
        InterfaceC11337c0 interfaceC11337c0M30573u;
        float f16;
        C11409v1 c11409v1M30542d;
        int iOrdinal;
        float f17;
        int iOrdinal2;
        InterfaceC11403t1 interfaceC11403t1M30664f;
        InterfaceC11337c0 interfaceC11337c0M30574v;
        C11409v1 c11409v1M30542d2;
        Object objM87133R;
        C28676v0 c28676v0;
        C15206z0 c15206z0;
        InterfaceC28670t2 interfaceC28670t2M43182c;
        InterfaceC28670t2 interfaceC28670t2M43181b;
        InterfaceC28670t2 interfaceC28670t2M43180a;
        boolean zM87153g;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2118895727);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC22167a.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(interfaceC14948a1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C11421z1 c11421z1M30544f = AbstractC11343d2.m30544f(enumC22167a, null, c28655q, (i14 >> 3) & 14, 2);
            C28633k1 c28633k1 = c11421z1M30544f.f36633d;
            AbstractC0954a abstractC0954a = c11421z1M30544f.f36630a;
            C11351f2 c11351f2 = AbstractC11348f.f36367i;
            EnumC22167a enumC22167a2 = (EnumC22167a) abstractC0954a.mo2428y0();
            c28655q.m87150e0(-1798345588);
            int iOrdinal3 = enumC22167a2.ordinal();
            float f18 = 1.0f;
            if (iOrdinal3 == 0) {
                f13 = 1.0f;
            } else if (iOrdinal3 != 1) {
                if (iOrdinal3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            c28655q.m87173q(false);
            Float fValueOf = Float.valueOf(f13);
            EnumC22167a enumC22167a3 = (EnumC22167a) c28633k1.getValue();
            c28655q.m87150e0(-1798345588);
            int iOrdinal4 = enumC22167a3.ordinal();
            if (iOrdinal4 == 0) {
                f14 = 1.0f;
            } else if (iOrdinal4 != 1) {
                if (iOrdinal4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            c28655q.m87173q(false);
            Float fValueOf2 = Float.valueOf(f14);
            InterfaceC11403t1 interfaceC11403t1M30664f2 = c11421z1M30544f.m30664f();
            c28655q.m87150e0(-1707702900);
            Object objMo11596c = interfaceC11403t1M30664f2.mo11596c();
            EnumC22167a enumC22167a4 = EnumC22167a.f85978x;
            if (objMo11596c == enumC22167a4) {
                interfaceC11337c0M30573u = AbstractC11348f.m30574v(100, 0, null, 6);
            } else {
                if (interfaceC11403t1M30664f2.mo11595b() == enumC22167a4) {
                    interfaceC11337c0M30573u = new C11354g1(100);
                } else {
                    f15 = 0.0f;
                    interfaceC11337c0M30573u = AbstractC11348f.m30573u(0.0f, 0.0f, 7, null);
                }
                c28655q.m87173q(false);
                f16 = f15;
                c11409v1M30542d = AbstractC11343d2.m30542d(c11421z1M30544f, fValueOf, fValueOf2, interfaceC11337c0M30573u, c11351f2, c28655q, 0);
                EnumC22167a enumC22167a5 = (EnumC22167a) abstractC0954a.mo2428y0();
                c28655q.m87150e0(-2098942571);
                iOrdinal = enumC22167a5.ordinal();
                if (iOrdinal != 0 || iOrdinal == 1) {
                    f17 = f16;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f17 = 1.0f;
                }
                c28655q.m87173q(false);
                Float fValueOf3 = Float.valueOf(f17);
                EnumC22167a enumC22167a6 = (EnumC22167a) c28633k1.getValue();
                c28655q.m87150e0(-2098942571);
                iOrdinal2 = enumC22167a6.ordinal();
                if (iOrdinal2 != 0 || iOrdinal2 == 1) {
                    f18 = f16;
                } else if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c28655q.m87173q(false);
                Float fValueOf4 = Float.valueOf(f18);
                interfaceC11403t1M30664f = c11421z1M30544f.m30664f();
                c28655q.m87150e0(1075283605);
                if (interfaceC11403t1M30664f.mo11596c() == enumC22167a4) {
                    interfaceC11337c0M30574v = AbstractC11348f.m30572t();
                } else if (interfaceC11403t1M30664f.mo11595b() == enumC22167a4) {
                    interfaceC11337c0M30574v = new C11354g1(100);
                } else {
                    interfaceC11337c0M30574v = AbstractC11348f.m30574v(100, 0, null, 6);
                }
                InterfaceC11337c0 interfaceC11337c0 = interfaceC11337c0M30574v;
                c28655q.m87173q(false);
                c11409v1M30542d2 = AbstractC11343d2.m30542d(c11421z1M30544f, fValueOf3, fValueOf4, interfaceC11337c0, c11351f2, c28655q, 0);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C15206z0();
                    c28655q.m87172p0(objM87133R);
                }
                c15206z0 = (C15206z0) objM87133R;
                C15127r1 c15127r1 = (C15127r1) interfaceC14948a1;
                interfaceC28670t2M43182c = c15127r1.m43182c(enumC22167a, c28655q);
                interfaceC28670t2M43181b = c15127r1.m43181b(z4, enumC22167a, c28655q);
                interfaceC28670t2M43180a = c15127r1.m43180a(z4, enumC22167a, c28655q);
                Modifier modifierM3415l = AbstractC1102d.m3415l(f55820c, AbstractC1102d.m3428y(modifier, C2299e.f9102E, false, 2));
                zM87153g = c28655q.m87153g(interfaceC28670t2M43181b) | c28655q.m87153g(interfaceC28670t2M43180a) | c28655q.m87153g(interfaceC28670t2M43182c) | c28655q.m87153g(c11409v1M30542d) | c28655q.m87153g(c11409v1M30542d2);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C1008b(c15206z0, interfaceC28670t2M43181b, interfaceC28670t2M43180a, interfaceC28670t2M43182c, c11409v1M30542d, c11409v1M30542d2, 7);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC21478l0.m60421a(modifierM3415l, (Function1) objM87133R2, c28655q, 0);
            }
            f15 = 0.0f;
            c28655q.m87173q(false);
            f16 = f15;
            c11409v1M30542d = AbstractC11343d2.m30542d(c11421z1M30544f, fValueOf, fValueOf2, interfaceC11337c0M30573u, c11351f2, c28655q, 0);
            EnumC22167a enumC22167a7 = (EnumC22167a) abstractC0954a.mo2428y0();
            c28655q.m87150e0(-2098942571);
            iOrdinal = enumC22167a7.ordinal();
            if (iOrdinal != 0) {
                f17 = f16;
            } else {
                f17 = f16;
            }
            c28655q.m87173q(false);
            Float fValueOf5 = Float.valueOf(f17);
            EnumC22167a enumC22167a8 = (EnumC22167a) c28633k1.getValue();
            c28655q.m87150e0(-2098942571);
            iOrdinal2 = enumC22167a8.ordinal();
            if (iOrdinal2 != 0) {
                f18 = f16;
            } else {
                f18 = f16;
            }
            c28655q.m87173q(false);
            Float fValueOf6 = Float.valueOf(f18);
            interfaceC11403t1M30664f = c11421z1M30544f.m30664f();
            c28655q.m87150e0(1075283605);
            if (interfaceC11403t1M30664f.mo11596c() == enumC22167a4) {
                interfaceC11337c0M30574v = AbstractC11348f.m30572t();
            } else if (interfaceC11403t1M30664f.mo11595b() == enumC22167a4) {
                interfaceC11337c0M30574v = new C11354g1(100);
            } else {
                interfaceC11337c0M30574v = AbstractC11348f.m30574v(100, 0, null, 6);
            }
            InterfaceC11337c0 interfaceC11337c1 = interfaceC11337c0M30574v;
            c28655q.m87173q(false);
            c11409v1M30542d2 = AbstractC11343d2.m30542d(c11421z1M30544f, fValueOf5, fValueOf6, interfaceC11337c1, c11351f2, c28655q, 0);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C15206z0();
                c28655q.m87172p0(objM87133R);
            }
            c15206z0 = (C15206z0) objM87133R;
            C15127r1 c15127r2 = (C15127r1) interfaceC14948a1;
            interfaceC28670t2M43182c = c15127r2.m43182c(enumC22167a, c28655q);
            interfaceC28670t2M43181b = c15127r2.m43181b(z4, enumC22167a, c28655q);
            interfaceC28670t2M43180a = c15127r2.m43180a(z4, enumC22167a, c28655q);
            Modifier modifierM3415l2 = AbstractC1102d.m3415l(f55820c, AbstractC1102d.m3428y(modifier, C2299e.f9102E, false, 2));
            zM87153g = c28655q.m87153g(interfaceC28670t2M43181b) | c28655q.m87153g(interfaceC28670t2M43180a) | c28655q.m87153g(interfaceC28670t2M43182c) | c28655q.m87153g(c11409v1M30542d) | c28655q.m87153g(c11409v1M30542d2);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R2 = new C1008b(c15206z0, interfaceC28670t2M43181b, interfaceC28670t2M43180a, interfaceC28670t2M43182c, c11409v1M30542d, c11409v1M30542d2, 7);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C1008b(c15206z0, interfaceC28670t2M43181b, interfaceC28670t2M43180a, interfaceC28670t2M43182c, c11409v1M30542d, c11409v1M30542d2, 7);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC21478l0.m60421a(modifierM3415l2, (Function1) objM87133R2, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(z4, enumC22167a, modifier, interfaceC14948a1, i13, 8);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m43084c(EnumC22167a enumC22167a, InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z4, InterfaceC14948a1 interfaceC14948a1, Composer composer, int i13) {
        int i14;
        InterfaceC14948a1 interfaceC14948a2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2031255194);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(enumC22167a.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(null) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            interfaceC14948a2 = interfaceC14948a1;
            i14 |= c28655q.m87153g(interfaceC14948a2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            interfaceC14948a2 = interfaceC14948a1;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
            }
            c28655q.m87175r();
            Modifier modifier2 = C2314t.f9131w;
            Modifier modifierM3449c = interfaceC4339a != null ? AbstractC1112d.m3449c(enumC22167a, AbstractC15210z4.m43228a(0L, 4, false, f55818a), z4, new C18027i(1), interfaceC4339a) : modifier2;
            if (interfaceC4339a != null) {
                C28674u2 c28674u2 = AbstractC15027h3.f56241a;
                modifier2 = MinimumInteractiveModifier.f4718w;
            }
            m43083b(z4, enumC22167a, AbstractC1099a.m3394p(f55819b, modifier.mo3471e(modifier2).mo3471e(modifierM3449c)), interfaceC14948a2, c28655q, ((i14 >> 9) & 14) | ((i14 << 3) & 112) | ((i14 >> 6) & 7168));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(enumC22167a, interfaceC4339a, modifier, z4, interfaceC14948a1, i13, 4);
        }
    }
}
