package p714k80;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import j02.C21174w;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p132f0.C13825t;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p163g1.InterfaceC15156u0;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.InterfaceC22997s1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: k80.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"", "enabled", "Lcom/whoop/design/util/TextResource;", "buttonText", "Lg1/u0;", "buttonColors", "Li2/a1;", "shape", "Lf0/t;", "border", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "d", "(ZLcom/whoop/design/util/TextResource;Lg1/u0;Li2/a1;Lf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22280i {
    /* JADX WARN: Code duplicated, block: B:101:0x014d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0157  */
    /* JADX WARN: Code duplicated, block: B:104:0x015b  */
    /* JADX WARN: Code duplicated, block: B:105:0x015d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0161  */
    /* JADX WARN: Code duplicated, block: B:109:0x0169  */
    /* JADX WARN: Code duplicated, block: B:111:0x017b  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:117:0x01db  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0100  */
    /* JADX WARN: Code duplicated, block: B:97:0x010a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0147  */
    /* JADX INFO: renamed from: d */
    public static final void m64006d(boolean z4, TextResource textResource, InterfaceC15156u0 interfaceC15156u0, InterfaceC17869a1 interfaceC17869a1, C13825t c13825t, InterfaceC4339a interfaceC4339a, Composer composer, final int i13, final int i14) {
        boolean z13;
        int i15;
        InterfaceC15156u0 interfaceC15156u0M43196a;
        InterfaceC17869a1 interfaceC17869a2;
        C13825t c13825t2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        int i18;
        boolean z14;
        C28655q c28655q;
        final InterfaceC17869a1 interfaceC17869a3;
        final InterfaceC4339a interfaceC4339a3;
        final boolean z15;
        final InterfaceC15156u0 interfaceC15156u1;
        final C13825t c13825t3;
        final TextResource textResource2;
        C28677v1 c28677v1M87180u;
        C28655q c28655q2;
        InterfaceC17869a1 interfaceC17869a1M105489e;
        C13825t c13825t4;
        InterfaceC17869a1 interfaceC17869a4;
        C13825t c13825t5;
        final boolean z16;
        final InterfaceC15156u0 interfaceC15156u2;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R;
        int i19;
        int i24;
        final TextResource textResourceM21267a = textResource;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1147299273);
        int i25 = i14 & 1;
        if (i25 != 0) {
            i15 = i13 | 6;
            z13 = z4;
        } else if ((i13 & 6) == 0) {
            z13 = z4;
            i15 = (c28655q3.m87155h(z13) ? 4 : 2) | i13;
        } else {
            z13 = z4;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) != 0) {
                i24 = 16;
            } else {
                if ((i13 & 64) == 0 ? c28655q3.m87153g(textResourceM21267a) : c28655q3.m87157i(textResourceM21267a)) {
                    i24 = 32;
                } else {
                    i24 = 16;
                }
            }
            i15 |= i24;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                interfaceC15156u0M43196a = interfaceC15156u0;
                int i26 = c28655q3.m87153g(interfaceC15156u0M43196a) ? 256 : 128;
                i15 |= i26;
            } else {
                interfaceC15156u0M43196a = interfaceC15156u0;
            }
            i15 |= i26;
        } else {
            interfaceC15156u0M43196a = interfaceC15156u0;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                interfaceC17869a2 = interfaceC17869a1;
                if (c28655q3.m87153g(interfaceC17869a2)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i19;
            } else {
                interfaceC17869a2 = interfaceC17869a1;
            }
            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i19;
        } else {
            interfaceC17869a2 = interfaceC17869a1;
        }
        int i27 = i14 & 16;
        if (i27 == 0) {
            if ((i13 & 24576) == 0) {
                c13825t2 = c13825t;
                i15 |= c28655q3.m87153g(c13825t2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q3.m87157i(interfaceC4339a2)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                i18 = 0;
                if ((74899 & i15) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q3.m87135U(i15 & 1, z14)) {
                    c28655q3.m87140Z();
                    if ((i13 & 1) != 0 || c28655q3.m87118C()) {
                        if (i25 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 2) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i15 &= -113;
                        }
                        if ((i14 & 4) != 0) {
                            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                            C38072d c38072d = C38072d.f163053a;
                            int i28 = C38072d.f163054b;
                            c28655q2 = c28655q3;
                            i15 &= -897;
                            interfaceC15156u0M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q3, i28).getBrandWhite(), c38072d.m121949b(c28655q3, i28).getBrandBlack(), c38072d.m121949b(c28655q3, i28).getWhite10(), c38072d.m121949b(c28655q3, i28).getWhite20(), c28655q3, 0, 0);
                        } else {
                            c28655q2 = c28655q3;
                        }
                        if ((i14 & 8) != 0) {
                            float f13 = 4;
                            interfaceC17869a1M105489e = AbstractC33253j.m105489e(f13 * f13);
                            i15 &= -7169;
                        } else {
                            interfaceC17869a1M105489e = interfaceC17869a1;
                        }
                        if (i27 != 0) {
                            c13825t4 = null;
                        } else {
                            c13825t4 = c13825t;
                        }
                        if (i16 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C21174w(9);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC17869a4 = interfaceC17869a1M105489e;
                            c13825t5 = c13825t4;
                            interfaceC15156u2 = interfaceC15156u0M43196a;
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                            z16 = z13;
                        } else {
                            interfaceC17869a4 = interfaceC17869a1M105489e;
                            c13825t5 = c13825t4;
                            z16 = z13;
                            interfaceC15156u2 = interfaceC15156u0M43196a;
                            interfaceC4339a4 = interfaceC4339a;
                        }
                    } else {
                        c28655q3.m87138X();
                        if ((i14 & 2) != 0) {
                            i15 &= -113;
                        }
                        if ((i14 & 4) != 0) {
                            i15 &= -897;
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                        }
                        interfaceC17869a4 = interfaceC17869a2;
                        c13825t5 = c13825t2;
                        i18 = 0;
                        c28655q2 = c28655q3;
                        z16 = z13;
                        interfaceC15156u2 = interfaceC15156u0M43196a;
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    c28655q2.m87175r();
                    float f14 = i18;
                    float f15 = 2 * 8;
                    int i29 = i15 << 6;
                    c28655q = c28655q2;
                    AbstractC12350b.m34578a(interfaceC4339a4, null, z16, null, interfaceC17869a4, c13825t5, interfaceC15156u2, new C22976l1(f14, f15, f14, f15), AbstractC37817c.m121344e(-1361971783, c28655q2, new Function3() { // from class: k80.g
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC22280i.m64008f(textResourceM21267a, interfaceC15156u2, z16, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q, ((i15 >> 15) & 14) | 905994240 | (i29 & 896) | (458752 & i29) | (i29 & 3670016) | (29360128 & (i15 << 15)), 10);
                    interfaceC4339a3 = interfaceC4339a4;
                    z15 = z16;
                    interfaceC17869a3 = interfaceC17869a4;
                    c13825t3 = c13825t5;
                    interfaceC15156u1 = interfaceC15156u2;
                } else {
                    c28655q = c28655q3;
                    c28655q.m87138X();
                    interfaceC17869a3 = interfaceC17869a1;
                    interfaceC4339a3 = interfaceC4339a;
                    z15 = z13;
                    interfaceC15156u1 = interfaceC15156u0M43196a;
                    c13825t3 = c13825t;
                }
                textResource2 = textResourceM21267a;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k80.h
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC22280i.m64009g(z15, textResource2, interfaceC15156u1, interfaceC17869a3, c13825t3, interfaceC4339a3, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a2 = interfaceC4339a;
            i18 = 0;
            if ((74899 & i15) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z14)) {
                c28655q3.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i25 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        C22976l1 c22976l2 = AbstractC15166v0.f56891a;
                        C38072d c38072d2 = C38072d.f163053a;
                        int i210 = C38072d.f163054b;
                        c28655q2 = c28655q3;
                        i15 &= -897;
                        interfaceC15156u0M43196a = AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q3, i210).getBrandWhite(), c38072d2.m121949b(c28655q3, i210).getBrandBlack(), c38072d2.m121949b(c28655q3, i210).getWhite10(), c38072d2.m121949b(c28655q3, i210).getWhite20(), c28655q3, 0, 0);
                    } else {
                        c28655q2 = c28655q3;
                    }
                    if ((i14 & 8) != 0) {
                        float f16 = 4;
                        interfaceC17869a1M105489e = AbstractC33253j.m105489e(f16 * f16);
                        i15 &= -7169;
                    } else {
                        interfaceC17869a1M105489e = interfaceC17869a1;
                    }
                    if (i27 != 0) {
                        c13825t4 = null;
                    } else {
                        c13825t4 = c13825t;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C21174w(9);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC17869a4 = interfaceC17869a1M105489e;
                        c13825t5 = c13825t4;
                        interfaceC15156u2 = interfaceC15156u0M43196a;
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                        z16 = z13;
                    } else {
                        interfaceC17869a4 = interfaceC17869a1M105489e;
                        c13825t5 = c13825t4;
                        z16 = z13;
                        interfaceC15156u2 = interfaceC15156u0M43196a;
                        interfaceC4339a4 = interfaceC4339a;
                    }
                } else {
                    if (i25 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        C22976l1 c22976l3 = AbstractC15166v0.f56891a;
                        C38072d c38072d3 = C38072d.f163053a;
                        int i211 = C38072d.f163054b;
                        c28655q2 = c28655q3;
                        i15 &= -897;
                        interfaceC15156u0M43196a = AbstractC15166v0.m43196a(c38072d3.m121949b(c28655q3, i211).getBrandWhite(), c38072d3.m121949b(c28655q3, i211).getBrandBlack(), c38072d3.m121949b(c28655q3, i211).getWhite10(), c38072d3.m121949b(c28655q3, i211).getWhite20(), c28655q3, 0, 0);
                    } else {
                        c28655q2 = c28655q3;
                    }
                    if ((i14 & 8) != 0) {
                        float f17 = 4;
                        interfaceC17869a1M105489e = AbstractC33253j.m105489e(f17 * f17);
                        i15 &= -7169;
                    } else {
                        interfaceC17869a1M105489e = interfaceC17869a1;
                    }
                    if (i27 != 0) {
                        c13825t4 = null;
                    } else {
                        c13825t4 = c13825t;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C21174w(9);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC17869a4 = interfaceC17869a1M105489e;
                        c13825t5 = c13825t4;
                        interfaceC15156u2 = interfaceC15156u0M43196a;
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                        z16 = z13;
                    } else {
                        interfaceC17869a4 = interfaceC17869a1M105489e;
                        c13825t5 = c13825t4;
                        z16 = z13;
                        interfaceC15156u2 = interfaceC15156u0M43196a;
                        interfaceC4339a4 = interfaceC4339a;
                    }
                }
                c28655q2.m87175r();
                float f18 = i18;
                float f19 = 2 * 8;
                int i212 = i15 << 6;
                c28655q = c28655q2;
                AbstractC12350b.m34578a(interfaceC4339a4, null, z16, null, interfaceC17869a4, c13825t5, interfaceC15156u2, new C22976l1(f18, f19, f18, f19), AbstractC37817c.m121344e(-1361971783, c28655q2, new Function3() { // from class: k80.g
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC22280i.m64008f(textResourceM21267a, interfaceC15156u2, z16, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, ((i15 >> 15) & 14) | 905994240 | (i212 & 896) | (458752 & i212) | (i212 & 3670016) | (29360128 & (i15 << 15)), 10);
                interfaceC4339a3 = interfaceC4339a4;
                z15 = z16;
                interfaceC17869a3 = interfaceC17869a4;
                c13825t3 = c13825t5;
                interfaceC15156u1 = interfaceC15156u2;
            } else {
                c28655q = c28655q3;
                c28655q.m87138X();
                interfaceC17869a3 = interfaceC17869a1;
                interfaceC4339a3 = interfaceC4339a;
                z15 = z13;
                interfaceC15156u1 = interfaceC15156u0M43196a;
                c13825t3 = c13825t;
            }
            textResource2 = textResourceM21267a;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k80.h
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC22280i.m64009g(z15, textResource2, interfaceC15156u1, interfaceC17869a3, c13825t3, interfaceC4339a3, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 24576;
        c13825t2 = c13825t;
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q3.m87157i(interfaceC4339a2)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            i18 = 0;
            if ((74899 & i15) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z14)) {
                c28655q3.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i25 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        C22976l1 c22976l4 = AbstractC15166v0.f56891a;
                        C38072d c38072d4 = C38072d.f163053a;
                        int i213 = C38072d.f163054b;
                        c28655q2 = c28655q3;
                        i15 &= -897;
                        interfaceC15156u0M43196a = AbstractC15166v0.m43196a(c38072d4.m121949b(c28655q3, i213).getBrandWhite(), c38072d4.m121949b(c28655q3, i213).getBrandBlack(), c38072d4.m121949b(c28655q3, i213).getWhite10(), c38072d4.m121949b(c28655q3, i213).getWhite20(), c28655q3, 0, 0);
                    } else {
                        c28655q2 = c28655q3;
                    }
                    if ((i14 & 8) != 0) {
                        float f110 = 4;
                        interfaceC17869a1M105489e = AbstractC33253j.m105489e(f110 * f110);
                        i15 &= -7169;
                    } else {
                        interfaceC17869a1M105489e = interfaceC17869a1;
                    }
                    if (i27 != 0) {
                        c13825t4 = null;
                    } else {
                        c13825t4 = c13825t;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C21174w(9);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC17869a4 = interfaceC17869a1M105489e;
                        c13825t5 = c13825t4;
                        interfaceC15156u2 = interfaceC15156u0M43196a;
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                        z16 = z13;
                    } else {
                        interfaceC17869a4 = interfaceC17869a1M105489e;
                        c13825t5 = c13825t4;
                        z16 = z13;
                        interfaceC15156u2 = interfaceC15156u0M43196a;
                        interfaceC4339a4 = interfaceC4339a;
                    }
                } else {
                    if (i25 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        C22976l1 c22976l5 = AbstractC15166v0.f56891a;
                        C38072d c38072d5 = C38072d.f163053a;
                        int i214 = C38072d.f163054b;
                        c28655q2 = c28655q3;
                        i15 &= -897;
                        interfaceC15156u0M43196a = AbstractC15166v0.m43196a(c38072d5.m121949b(c28655q3, i214).getBrandWhite(), c38072d5.m121949b(c28655q3, i214).getBrandBlack(), c38072d5.m121949b(c28655q3, i214).getWhite10(), c38072d5.m121949b(c28655q3, i214).getWhite20(), c28655q3, 0, 0);
                    } else {
                        c28655q2 = c28655q3;
                    }
                    if ((i14 & 8) != 0) {
                        float f111 = 4;
                        interfaceC17869a1M105489e = AbstractC33253j.m105489e(f111 * f111);
                        i15 &= -7169;
                    } else {
                        interfaceC17869a1M105489e = interfaceC17869a1;
                    }
                    if (i27 != 0) {
                        c13825t4 = null;
                    } else {
                        c13825t4 = c13825t;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C21174w(9);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC17869a4 = interfaceC17869a1M105489e;
                        c13825t5 = c13825t4;
                        interfaceC15156u2 = interfaceC15156u0M43196a;
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                        z16 = z13;
                    } else {
                        interfaceC17869a4 = interfaceC17869a1M105489e;
                        c13825t5 = c13825t4;
                        z16 = z13;
                        interfaceC15156u2 = interfaceC15156u0M43196a;
                        interfaceC4339a4 = interfaceC4339a;
                    }
                }
                c28655q2.m87175r();
                float f112 = i18;
                float f113 = 2 * 8;
                int i215 = i15 << 6;
                c28655q = c28655q2;
                AbstractC12350b.m34578a(interfaceC4339a4, null, z16, null, interfaceC17869a4, c13825t5, interfaceC15156u2, new C22976l1(f112, f113, f112, f113), AbstractC37817c.m121344e(-1361971783, c28655q2, new Function3() { // from class: k80.g
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC22280i.m64008f(textResourceM21267a, interfaceC15156u2, z16, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, ((i15 >> 15) & 14) | 905994240 | (i215 & 896) | (458752 & i215) | (i215 & 3670016) | (29360128 & (i15 << 15)), 10);
                interfaceC4339a3 = interfaceC4339a4;
                z15 = z16;
                interfaceC17869a3 = interfaceC17869a4;
                c13825t3 = c13825t5;
                interfaceC15156u1 = interfaceC15156u2;
            } else {
                c28655q = c28655q3;
                c28655q.m87138X();
                interfaceC17869a3 = interfaceC17869a1;
                interfaceC4339a3 = interfaceC4339a;
                z15 = z13;
                interfaceC15156u1 = interfaceC15156u0M43196a;
                c13825t3 = c13825t;
            }
            textResource2 = textResourceM21267a;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k80.h
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC22280i.m64009g(z15, textResource2, interfaceC15156u1, interfaceC17869a3, c13825t3, interfaceC4339a3, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a2 = interfaceC4339a;
        i18 = 0;
        if ((74899 & i15) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z14)) {
            c28655q3.m87140Z();
            if ((i13 & 1) != 0) {
                if (i25 != 0) {
                    z13 = true;
                }
                if ((i14 & 2) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    C22976l1 c22976l6 = AbstractC15166v0.f56891a;
                    C38072d c38072d6 = C38072d.f163053a;
                    int i216 = C38072d.f163054b;
                    c28655q2 = c28655q3;
                    i15 &= -897;
                    interfaceC15156u0M43196a = AbstractC15166v0.m43196a(c38072d6.m121949b(c28655q3, i216).getBrandWhite(), c38072d6.m121949b(c28655q3, i216).getBrandBlack(), c38072d6.m121949b(c28655q3, i216).getWhite10(), c38072d6.m121949b(c28655q3, i216).getWhite20(), c28655q3, 0, 0);
                } else {
                    c28655q2 = c28655q3;
                }
                if ((i14 & 8) != 0) {
                    float f114 = 4;
                    interfaceC17869a1M105489e = AbstractC33253j.m105489e(f114 * f114);
                    i15 &= -7169;
                } else {
                    interfaceC17869a1M105489e = interfaceC17869a1;
                }
                if (i27 != 0) {
                    c13825t4 = null;
                } else {
                    c13825t4 = c13825t;
                }
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C21174w(9);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC17869a4 = interfaceC17869a1M105489e;
                    c13825t5 = c13825t4;
                    interfaceC15156u2 = interfaceC15156u0M43196a;
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    z16 = z13;
                } else {
                    interfaceC17869a4 = interfaceC17869a1M105489e;
                    c13825t5 = c13825t4;
                    z16 = z13;
                    interfaceC15156u2 = interfaceC15156u0M43196a;
                    interfaceC4339a4 = interfaceC4339a;
                }
            } else {
                if (i25 != 0) {
                    z13 = true;
                }
                if ((i14 & 2) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    C22976l1 c22976l7 = AbstractC15166v0.f56891a;
                    C38072d c38072d7 = C38072d.f163053a;
                    int i217 = C38072d.f163054b;
                    c28655q2 = c28655q3;
                    i15 &= -897;
                    interfaceC15156u0M43196a = AbstractC15166v0.m43196a(c38072d7.m121949b(c28655q3, i217).getBrandWhite(), c38072d7.m121949b(c28655q3, i217).getBrandBlack(), c38072d7.m121949b(c28655q3, i217).getWhite10(), c38072d7.m121949b(c28655q3, i217).getWhite20(), c28655q3, 0, 0);
                } else {
                    c28655q2 = c28655q3;
                }
                if ((i14 & 8) != 0) {
                    float f115 = 4;
                    interfaceC17869a1M105489e = AbstractC33253j.m105489e(f115 * f115);
                    i15 &= -7169;
                } else {
                    interfaceC17869a1M105489e = interfaceC17869a1;
                }
                if (i27 != 0) {
                    c13825t4 = null;
                } else {
                    c13825t4 = c13825t;
                }
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C21174w(9);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC17869a4 = interfaceC17869a1M105489e;
                    c13825t5 = c13825t4;
                    interfaceC15156u2 = interfaceC15156u0M43196a;
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    z16 = z13;
                } else {
                    interfaceC17869a4 = interfaceC17869a1M105489e;
                    c13825t5 = c13825t4;
                    z16 = z13;
                    interfaceC15156u2 = interfaceC15156u0M43196a;
                    interfaceC4339a4 = interfaceC4339a;
                }
            }
            c28655q2.m87175r();
            float f116 = i18;
            float f117 = 2 * 8;
            int i218 = i15 << 6;
            c28655q = c28655q2;
            AbstractC12350b.m34578a(interfaceC4339a4, null, z16, null, interfaceC17869a4, c13825t5, interfaceC15156u2, new C22976l1(f116, f117, f116, f117), AbstractC37817c.m121344e(-1361971783, c28655q2, new Function3() { // from class: k80.g
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC22280i.m64008f(textResourceM21267a, interfaceC15156u2, z16, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, ((i15 >> 15) & 14) | 905994240 | (i218 & 896) | (458752 & i218) | (i218 & 3670016) | (29360128 & (i15 << 15)), 10);
            interfaceC4339a3 = interfaceC4339a4;
            z15 = z16;
            interfaceC17869a3 = interfaceC17869a4;
            c13825t3 = c13825t5;
            interfaceC15156u1 = interfaceC15156u2;
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
            interfaceC17869a3 = interfaceC17869a1;
            interfaceC4339a3 = interfaceC4339a;
            z15 = z13;
            interfaceC15156u1 = interfaceC15156u0M43196a;
            c13825t3 = c13825t;
        }
        textResource2 = textResourceM21267a;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k80.h
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC22280i.m64009g(z15, textResource2, interfaceC15156u1, interfaceC17869a3, c13825t3, interfaceC4339a3, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m64007e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m64008f(TextResource textResource, InterfaceC15156u0 interfaceC15156u0, boolean z4, InterfaceC22997s1 Button, Composer composer, int i13) {
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
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
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable), null, ((C17919x) ((C15077m1) interfaceC15156u0).m43155a(z4, c28655q).getValue()).f69639a, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196090);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m64009g(boolean z4, TextResource textResource, InterfaceC15156u0 interfaceC15156u0, InterfaceC17869a1 interfaceC17869a1, C13825t c13825t, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m64006d(z4, textResource, interfaceC15156u0, interfaceC17869a1, c13825t, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
