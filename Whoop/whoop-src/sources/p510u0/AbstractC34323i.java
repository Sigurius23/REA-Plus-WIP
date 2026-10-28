package p510u0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b90.C2883e;
import c93.InterfaceC4339a;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.AbstractC17911t;
import p208i2.C17875c1;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p412q3.C29871f0;
import p412q3.C29878l;
import p412q3.C29891y;
import p412q3.InterfaceC29873g0;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import s51.C32209f;
import sg2.C32469t;
import t71.C33572i;
import vf3.AbstractC35952b;

/* JADX INFO: renamed from: u0.i */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34323i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f144126a = 0;

    static {
        float f13 = 40;
        AbstractC35952b.m114193a(f13, f13);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0132  */
    /* JADX WARN: Code duplicated, block: B:103:0x0136  */
    /* JADX WARN: Code duplicated, block: B:105:0x0140  */
    /* JADX WARN: Code duplicated, block: B:106:0x0143  */
    /* JADX WARN: Code duplicated, block: B:108:0x0148  */
    /* JADX WARN: Code duplicated, block: B:111:0x0157  */
    /* JADX WARN: Code duplicated, block: B:112:0x015a  */
    /* JADX WARN: Code duplicated, block: B:114:0x015e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0166  */
    /* JADX WARN: Code duplicated, block: B:117:0x0169  */
    /* JADX WARN: Code duplicated, block: B:120:0x0170  */
    /* JADX WARN: Code duplicated, block: B:123:0x0179  */
    /* JADX WARN: Code duplicated, block: B:124:0x0180  */
    /* JADX WARN: Code duplicated, block: B:126:0x0186  */
    /* JADX WARN: Code duplicated, block: B:128:0x018e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0193  */
    /* JADX WARN: Code duplicated, block: B:133:0x019d  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:155:0x020c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x020e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0212  */
    /* JADX WARN: Code duplicated, block: B:161:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x021a  */
    /* JADX WARN: Code duplicated, block: B:163:0x021d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0223  */
    /* JADX WARN: Code duplicated, block: B:167:0x0228  */
    /* JADX WARN: Code duplicated, block: B:168:0x022b  */
    /* JADX WARN: Code duplicated, block: B:170:0x022f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0234  */
    /* JADX WARN: Code duplicated, block: B:175:0x023d  */
    /* JADX WARN: Code duplicated, block: B:178:0x024b  */
    /* JADX WARN: Code duplicated, block: B:179:0x024d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0251  */
    /* JADX WARN: Code duplicated, block: B:182:0x025d  */
    /* JADX WARN: Code duplicated, block: B:186:0x027b  */
    /* JADX WARN: Code duplicated, block: B:187:0x028c  */
    /* JADX WARN: Code duplicated, block: B:191:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:194:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:195:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:199:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:202:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:203:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:206:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:210:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:211:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:215:0x0307  */
    /* JADX WARN: Code duplicated, block: B:217:0x035a  */
    /* JADX WARN: Code duplicated, block: B:220:0x0372  */
    /* JADX WARN: Code duplicated, block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x010b  */
    /* JADX WARN: Code duplicated, block: B:91:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:94:0x011c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0121  */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    /* JADX INFO: renamed from: a */
    public static final void m108619a(String str, Function1 function1, Modifier modifier, boolean z4, boolean z13, C23285v0 c23285v0, C34351r0 c34351r0, C34348q0 c34348q0, boolean z14, int i13, int i14, InterfaceC29873g0 interfaceC29873g0, Function1 function2, InterfaceC21083i interfaceC21083i, AbstractC17911t abstractC17911t, C37816b c37816b, Composer composer, int i15, int i16, int i17) {
        int i18;
        boolean z15;
        int i19;
        int i24;
        int i25;
        boolean z16;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        boolean z17;
        C28655q c28655q;
        int i54;
        Function1 function3;
        InterfaceC21083i interfaceC21083i2;
        AbstractC17911t abstractC17911t2;
        int i55;
        boolean z18;
        boolean z19;
        InterfaceC29873g0 interfaceC29873g1;
        C28677v1 c28677v1M87180u;
        int i56;
        C28676v0 c28676v0;
        int i57;
        int i58;
        int i59;
        InterfaceC29873g0 interfaceC29873g2;
        Object objM87133R;
        InterfaceC21083i interfaceC21083i3;
        AbstractC17911t c17875c1;
        int i64;
        int i65;
        boolean z24;
        boolean z25;
        InterfaceC29873g0 interfaceC29873g3;
        int i66;
        Object objM87133R2;
        long j7;
        InterfaceC28601c1 interfaceC28601c1;
        int i67;
        C29891y c29891yM91510a;
        boolean zM87153g;
        Object objM87133R3;
        boolean z26;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c2;
        int i68;
        int i69;
        boolean z27;
        boolean z28;
        Object objM87133R5;
        int i74;
        int i75;
        int i76;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(2026950908);
        if ((i15 & 6) == 0) {
            i18 = (c28655q2.m87153g(str) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= c28655q2.m87153g(modifier) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i77 = i17 & 16;
        int i78 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i77 == 0) {
            if ((i15 & 24576) == 0) {
                z15 = z13;
                i18 |= c28655q2.m87155h(z15) ? 16384 : 8192;
            }
            i19 = i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            if (i19 == 0) {
                if (c28655q2.m87153g(c23285v0)) {
                    i76 = 131072;
                } else {
                    i76 = 65536;
                }
                i18 |= i76;
            }
            if ((i15 & 1572864) == 0) {
                if (c28655q2.m87153g(c34351r0)) {
                    i75 = 1048576;
                } else {
                    i75 = 524288;
                }
                i18 |= i75;
            }
            if ((i15 & 12582912) == 0) {
                if (c28655q2.m87153g(c34348q0)) {
                    i74 = 8388608;
                } else {
                    i74 = 4194304;
                }
                i18 |= i74;
            }
            i25 = i17 & 256;
            if (i25 != 0) {
                i18 |= 100663296;
                z16 = z14;
            } else {
                z16 = z14;
                if ((i15 & 100663296) == 0) {
                    if (c28655q2.m87155h(z16)) {
                        i26 = 67108864;
                    } else {
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i18 |= i26;
                }
            }
            if ((i15 & 805306368) == 0) {
                if ((i17 & 512) == 0) {
                    i27 = i13;
                    int i79 = c28655q2.m87149e(i27) ? 536870912 : 268435456;
                    i18 |= i79;
                } else {
                    i27 = i13;
                }
                i18 |= i79;
            } else {
                i27 = i13;
            }
            i28 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i28 != 0) {
                i29 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (c28655q2.m87149e(i14)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i29 = i16 | i34;
            } else {
                i29 = i16;
            }
            i35 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i35 != 0) {
                i29 |= 48;
            } else if ((i16 & 48) != 0) {
                if (c28655q2.m87153g(interfaceC29873g0)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i29 |= i36;
            }
            i37 = i29;
            i38 = i18;
            i39 = i37 | 384;
            i44 = i17 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i44 != 0) {
                i45 = i37 | 3456;
            } else {
                if ((i16 & 3072) != 0) {
                    if (c28655q2.m87153g(interfaceC21083i)) {
                        i46 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i46 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i39 |= i46;
                }
                i45 = i39;
            }
            i47 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i47 != 0) {
                i49 = i45 | 24576;
            } else {
                i48 = i45;
                if ((i16 & 24576) == 0) {
                    if (c28655q2.m87153g(abstractC17911t)) {
                        i78 = 16384;
                    }
                    i49 = i48 | i78;
                } else {
                    i49 = i48;
                }
            }
            if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(c37816b)) {
                    i24 = 131072;
                }
                i49 |= i24;
            }
            if ((i38 & 306783379) == 306783378 || (i49 & 74899) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q2.m87135U(i38 & 1, z17)) {
                c28655q2.m87140Z();
                i56 = i15 & 1;
                c28676v0 = C28635l.f115821a;
                if (i56 != 0 || c28655q2.m87118C()) {
                    if (i77 != 0) {
                        z15 = false;
                    }
                    if (i25 != 0) {
                        z16 = false;
                    }
                    if ((i17 & 512) != 0) {
                        if (z16) {
                            i57 = 1;
                        } else {
                            i57 = Integer.MAX_VALUE;
                        }
                        i58 = i38 & (-1879048193);
                    } else {
                        i57 = i27;
                        i58 = i38;
                    }
                    if (i28 != 0) {
                        i59 = 1;
                    } else {
                        i59 = i14;
                    }
                    if (i35 != 0) {
                        interfaceC29873g2 = C29871f0.f122092w;
                    } else {
                        interfaceC29873g2 = interfaceC29873g0;
                    }
                    int i83 = i57;
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C33572i(28);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Function1 function4 = (Function1) objM87133R;
                    if (i44 != 0) {
                        interfaceC21083i3 = null;
                    } else {
                        interfaceC21083i3 = interfaceC21083i;
                    }
                    if (i47 != 0) {
                        c17875c1 = new C17875c1(C17919x.f69625b);
                    } else {
                        c17875c1 = abstractC17911t;
                    }
                    int i84 = i59;
                    abstractC17911t2 = c17875c1;
                    i64 = i84;
                    i65 = i58;
                    z24 = z15;
                    function3 = function4;
                    interfaceC21083i2 = interfaceC21083i3;
                    z25 = z16;
                    interfaceC29873g3 = interfaceC29873g2;
                    i66 = i83;
                } else {
                    c28655q2.m87138X();
                    if ((i17 & 512) != 0) {
                        function3 = function2;
                        interfaceC21083i2 = interfaceC21083i;
                        abstractC17911t2 = abstractC17911t;
                        i66 = i27;
                        z24 = z15;
                        z25 = z16;
                        interfaceC29873g3 = interfaceC29873g0;
                        i65 = i38 & (-1879048193);
                        i64 = i14;
                    } else {
                        i64 = i14;
                        function3 = function2;
                        interfaceC21083i2 = interfaceC21083i;
                        abstractC17911t2 = abstractC17911t;
                        i66 = i27;
                        z24 = z15;
                        z25 = z16;
                        interfaceC29873g3 = interfaceC29873g0;
                        i65 = i38;
                    }
                }
                c28655q2.m87175r();
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    j7 = 0;
                    objM87133R2 = AbstractC28683x.m87272z(new C29891y(6, str, 0L));
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    j7 = 0;
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                i67 = i66;
                c29891yM91510a = C29891y.m91510a((C29891y) interfaceC28601c1.getValue(), str, j7, 6);
                zM87153g = c28655q2.m87153g(c29891yM91510a);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g || objM87133R3 == c28676v0) {
                    objM87133R3 = new C32209f(20, c29891yM91510a, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87257k((InterfaceC4339a) objM87133R3, c28655q2);
                if ((i65 & 14) == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objM87133R4 = c28655q2.m87133R();
                if (z26 || objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(str);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                C29878l c29878lM108655a = c34351r0.m108655a(z25);
                boolean z29 = !z25;
                if (z25) {
                    i68 = 1;
                } else {
                    i68 = i64;
                }
                int i85 = i49;
                if (z25) {
                    i69 = 1;
                } else {
                    i69 = i67;
                }
                boolean zM87153g2 = c28655q2.m87153g(interfaceC28601c2);
                if ((i65 & 112) == 32) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = zM87153g2 | z27;
                objM87133R5 = c28655q2.m87133R();
                if (z28 || objM87133R5 == c28676v0) {
                    objM87133R5 = new C2883e(4, function1, interfaceC28601c1, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R5);
                }
                int i86 = i85 << 9;
                interfaceC29873g1 = interfaceC29873g3;
                c28655q = c28655q2;
                AbstractC34339n0.m108626d(c29891yM91510a, (Function1) objM87133R5, modifier, c23285v0, interfaceC29873g1, function3, interfaceC21083i2, abstractC17911t2, z29, i69, i68, c29878lM108655a, c34348q0, z4, z24, c37816b, c28655q, (i65 & 896) | ((i65 >> 6) & 7168) | (i86 & 57344) | (i86 & 458752) | (i86 & 3670016) | (i86 & 29360128), ((i65 >> 15) & 896) | (i65 & 7168) | (i65 & 57344) | (i85 & 458752));
                i55 = i67;
                z19 = z25;
                i54 = i64;
                z18 = z24;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                i54 = i14;
                function3 = function2;
                interfaceC21083i2 = interfaceC21083i;
                abstractC17911t2 = abstractC17911t;
                i55 = i27;
                z18 = z15;
                z19 = z16;
                interfaceC29873g1 = interfaceC29873g0;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C34320h(str, function1, modifier, z4, z18, c23285v0, c34351r0, c34348q0, z19, i55, i54, interfaceC29873g1, function3, interfaceC21083i2, abstractC17911t2, c37816b, i15, i16, i17, 1);
            }
        }
        i18 |= 24576;
        z15 = z13;
        i19 = i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i19 == 0) {
            if (c28655q2.m87153g(c23285v0)) {
                i76 = 131072;
            } else {
                i76 = 65536;
            }
            i18 |= i76;
        }
        if ((i15 & 1572864) == 0) {
            if (c28655q2.m87153g(c34351r0)) {
                i75 = 1048576;
            } else {
                i75 = 524288;
            }
            i18 |= i75;
        }
        if ((i15 & 12582912) == 0) {
            if (c28655q2.m87153g(c34348q0)) {
                i74 = 8388608;
            } else {
                i74 = 4194304;
            }
            i18 |= i74;
        }
        i25 = i17 & 256;
        if (i25 != 0) {
            i18 |= 100663296;
            z16 = z14;
        } else {
            z16 = z14;
            if ((i15 & 100663296) == 0) {
                if (c28655q2.m87155h(z16)) {
                    i26 = 67108864;
                } else {
                    i26 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i18 |= i26;
            }
        }
        if ((i15 & 805306368) == 0) {
            if ((i17 & 512) == 0) {
                i27 = i13;
                if (c28655q2.m87149e(i27)) {
                }
                i18 |= i79;
            } else {
                i27 = i13;
            }
            i18 |= i79;
        } else {
            i27 = i13;
        }
        i28 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i28 != 0) {
            i29 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            if (c28655q2.m87149e(i14)) {
                i34 = 4;
            } else {
                i34 = 2;
            }
            i29 = i16 | i34;
        } else {
            i29 = i16;
        }
        i35 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i35 != 0) {
            i29 |= 48;
        } else if ((i16 & 48) != 0) {
            if (c28655q2.m87153g(interfaceC29873g0)) {
                i36 = 32;
            } else {
                i36 = 16;
            }
            i29 |= i36;
        }
        i37 = i29;
        i38 = i18;
        i39 = i37 | 384;
        i44 = i17 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i44 != 0) {
            i45 = i37 | 3456;
        } else {
            if ((i16 & 3072) != 0) {
                if (c28655q2.m87153g(interfaceC21083i)) {
                    i46 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i46 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i39 |= i46;
            }
            i45 = i39;
        }
        i47 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i47 != 0) {
            i49 = i45 | 24576;
        } else {
            i48 = i45;
            if ((i16 & 24576) == 0) {
                if (c28655q2.m87153g(abstractC17911t)) {
                    i78 = 16384;
                }
                i49 = i48 | i78;
            } else {
                i49 = i48;
            }
        }
        if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87157i(c37816b)) {
                i24 = 131072;
            }
            i49 |= i24;
        }
        if ((i38 & 306783379) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (c28655q2.m87135U(i38 & 1, z17)) {
            c28655q2.m87140Z();
            i56 = i15 & 1;
            c28676v0 = C28635l.f115821a;
            if (i56 != 0) {
                if (i77 != 0) {
                    z15 = false;
                }
                if (i25 != 0) {
                    z16 = false;
                }
                if ((i17 & 512) != 0) {
                    if (z16) {
                        i57 = 1;
                    } else {
                        i57 = Integer.MAX_VALUE;
                    }
                    i58 = i38 & (-1879048193);
                } else {
                    i57 = i27;
                    i58 = i38;
                }
                if (i28 != 0) {
                    i59 = 1;
                } else {
                    i59 = i14;
                }
                if (i35 != 0) {
                    interfaceC29873g2 = C29871f0.f122092w;
                } else {
                    interfaceC29873g2 = interfaceC29873g0;
                }
                int i87 = i57;
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C33572i(28);
                    c28655q2.m87172p0(objM87133R);
                }
                Function1 function5 = (Function1) objM87133R;
                if (i44 != 0) {
                    interfaceC21083i3 = null;
                } else {
                    interfaceC21083i3 = interfaceC21083i;
                }
                if (i47 != 0) {
                    c17875c1 = new C17875c1(C17919x.f69625b);
                } else {
                    c17875c1 = abstractC17911t;
                }
                int i88 = i59;
                abstractC17911t2 = c17875c1;
                i64 = i88;
                i65 = i58;
                z24 = z15;
                function3 = function5;
                interfaceC21083i2 = interfaceC21083i3;
                z25 = z16;
                interfaceC29873g3 = interfaceC29873g2;
                i66 = i87;
            } else {
                if (i77 != 0) {
                    z15 = false;
                }
                if (i25 != 0) {
                    z16 = false;
                }
                if ((i17 & 512) != 0) {
                    if (z16) {
                        i57 = 1;
                    } else {
                        i57 = Integer.MAX_VALUE;
                    }
                    i58 = i38 & (-1879048193);
                } else {
                    i57 = i27;
                    i58 = i38;
                }
                if (i28 != 0) {
                    i59 = 1;
                } else {
                    i59 = i14;
                }
                if (i35 != 0) {
                    interfaceC29873g2 = C29871f0.f122092w;
                } else {
                    interfaceC29873g2 = interfaceC29873g0;
                }
                int i89 = i57;
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C33572i(28);
                    c28655q2.m87172p0(objM87133R);
                }
                Function1 function6 = (Function1) objM87133R;
                if (i44 != 0) {
                    interfaceC21083i3 = null;
                } else {
                    interfaceC21083i3 = interfaceC21083i;
                }
                if (i47 != 0) {
                    c17875c1 = new C17875c1(C17919x.f69625b);
                } else {
                    c17875c1 = abstractC17911t;
                }
                int i810 = i59;
                abstractC17911t2 = c17875c1;
                i64 = i810;
                i65 = i58;
                z24 = z15;
                function3 = function6;
                interfaceC21083i2 = interfaceC21083i3;
                z25 = z16;
                interfaceC29873g3 = interfaceC29873g2;
                i66 = i89;
            }
            c28655q2.m87175r();
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                j7 = 0;
                objM87133R2 = AbstractC28683x.m87272z(new C29891y(6, str, 0L));
                c28655q2.m87172p0(objM87133R2);
            } else {
                j7 = 0;
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            i67 = i66;
            c29891yM91510a = C29891y.m91510a((C29891y) interfaceC28601c1.getValue(), str, j7, 6);
            zM87153g = c28655q2.m87153g(c29891yM91510a);
            objM87133R3 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R3 = new C32209f(20, c29891yM91510a, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C32209f(20, c29891yM91510a, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87257k((InterfaceC4339a) objM87133R3, c28655q2);
            if ((i65 & 14) == 4) {
                z26 = true;
            } else {
                z26 = false;
            }
            objM87133R4 = c28655q2.m87133R();
            if (z26) {
                objM87133R4 = AbstractC28683x.m87272z(str);
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = AbstractC28683x.m87272z(str);
                c28655q2.m87172p0(objM87133R4);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
            C29878l c29878lM108655a2 = c34351r0.m108655a(z25);
            boolean z210 = !z25;
            if (z25) {
                i68 = 1;
            } else {
                i68 = i64;
            }
            int i811 = i49;
            if (z25) {
                i69 = 1;
            } else {
                i69 = i67;
            }
            boolean zM87153g3 = c28655q2.m87153g(interfaceC28601c2);
            if ((i65 & 112) == 32) {
                z27 = true;
            } else {
                z27 = false;
            }
            z28 = zM87153g3 | z27;
            objM87133R5 = c28655q2.m87133R();
            if (z28) {
                objM87133R5 = new C2883e(4, function1, interfaceC28601c1, interfaceC28601c2);
                c28655q2.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C2883e(4, function1, interfaceC28601c1, interfaceC28601c2);
                c28655q2.m87172p0(objM87133R5);
            }
            int i812 = i811 << 9;
            interfaceC29873g1 = interfaceC29873g3;
            c28655q = c28655q2;
            AbstractC34339n0.m108626d(c29891yM91510a, (Function1) objM87133R5, modifier, c23285v0, interfaceC29873g1, function3, interfaceC21083i2, abstractC17911t2, z210, i69, i68, c29878lM108655a2, c34348q0, z4, z24, c37816b, c28655q, (i65 & 896) | ((i65 >> 6) & 7168) | (i812 & 57344) | (i812 & 458752) | (i812 & 3670016) | (i812 & 29360128), ((i65 >> 15) & 896) | (i65 & 7168) | (i65 & 57344) | (i811 & 458752));
            i55 = i67;
            z19 = z25;
            i54 = i64;
            z18 = z24;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            i54 = i14;
            function3 = function2;
            interfaceC21083i2 = interfaceC21083i;
            abstractC17911t2 = abstractC17911t;
            i55 = i27;
            z18 = z15;
            z19 = z16;
            interfaceC29873g1 = interfaceC29873g0;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34320h(str, function1, modifier, z4, z18, c23285v0, c34351r0, c34348q0, z19, i55, i54, interfaceC29873g1, function3, interfaceC21083i2, abstractC17911t2, c37816b, i15, i16, i17, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:103:0x0138  */
    /* JADX WARN: Code duplicated, block: B:105:0x0142  */
    /* JADX WARN: Code duplicated, block: B:106:0x0145  */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0159  */
    /* JADX WARN: Code duplicated, block: B:112:0x0160  */
    /* JADX WARN: Code duplicated, block: B:114:0x0164  */
    /* JADX WARN: Code duplicated, block: B:117:0x016d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0172  */
    /* JADX WARN: Code duplicated, block: B:122:0x017a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0182  */
    /* JADX WARN: Code duplicated, block: B:126:0x0187  */
    /* JADX WARN: Code duplicated, block: B:129:0x0190  */
    /* JADX WARN: Code duplicated, block: B:130:0x0195  */
    /* JADX WARN: Code duplicated, block: B:132:0x019b  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:154:0x0208 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x020a  */
    /* JADX WARN: Code duplicated, block: B:157:0x020e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0215 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x0217  */
    /* JADX WARN: Code duplicated, block: B:162:0x021a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0220  */
    /* JADX WARN: Code duplicated, block: B:166:0x0225  */
    /* JADX WARN: Code duplicated, block: B:167:0x0228  */
    /* JADX WARN: Code duplicated, block: B:169:0x022c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0231  */
    /* JADX WARN: Code duplicated, block: B:174:0x023a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0248  */
    /* JADX WARN: Code duplicated, block: B:178:0x024a  */
    /* JADX WARN: Code duplicated, block: B:180:0x024e  */
    /* JADX WARN: Code duplicated, block: B:182:0x025b  */
    /* JADX WARN: Code duplicated, block: B:185:0x0271  */
    /* JADX WARN: Code duplicated, block: B:186:0x0274  */
    /* JADX WARN: Code duplicated, block: B:189:0x0279  */
    /* JADX WARN: Code duplicated, block: B:190:0x027c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0283  */
    /* JADX WARN: Code duplicated, block: B:194:0x0286  */
    /* JADX WARN: Code duplicated, block: B:197:0x0290  */
    /* JADX WARN: Code duplicated, block: B:201:0x029c  */
    /* JADX WARN: Code duplicated, block: B:203:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:206:0x0313  */
    /* JADX WARN: Code duplicated, block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:89:0x010d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x011e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:99:0x012d  */
    /* JADX INFO: renamed from: b */
    public static final void m108620b(C29891y c29891y, Function1 function1, Modifier modifier, boolean z4, boolean z13, C23285v0 c23285v0, C34351r0 c34351r0, C34348q0 c34348q0, boolean z14, int i13, int i14, InterfaceC29873g0 interfaceC29873g0, Function1 function2, InterfaceC21083i interfaceC21083i, C17875c1 c17875c1, Function3 function3, Composer composer, int i15, int i16, int i17) {
        int i18;
        boolean z15;
        int i19;
        int i24;
        int i25;
        C34348q0 c34348q1;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        boolean z16;
        int i47;
        InterfaceC29873g0 interfaceC29873g1;
        InterfaceC21083i interfaceC21083i2;
        boolean z17;
        C34348q0 c34348q2;
        C28655q c28655q;
        Function1 function4;
        Function3 function5;
        C28677v1 c28677v1M87180u;
        int i48;
        C28676v0 c28676v0;
        int i49;
        int i54;
        int i55;
        InterfaceC29873g0 interfaceC29873g2;
        int i56;
        Object objM87133R;
        InterfaceC21083i interfaceC21083i3;
        Function3 function6;
        Function1 function7;
        InterfaceC29873g0 interfaceC29873g3;
        int i57;
        int i58;
        boolean z18;
        boolean z19;
        Object objM87133R2;
        int i59;
        int i64;
        int i65;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-971111025);
        if ((i15 & 6) == 0) {
            i18 = (c28655q2.m87153g(c29891y) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= c28655q2.m87153g(modifier) ? 256 : 128;
        }
        int i66 = i15 & 3072;
        int i67 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i66 == 0) {
            i18 |= c28655q2.m87155h(z4) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i68 = i17 & 16;
        int i69 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i68 == 0) {
            if ((i15 & 24576) == 0) {
                z15 = z13;
                i18 |= c28655q2.m87155h(z15) ? 16384 : 8192;
            }
            i19 = i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            if (i19 == 0) {
                if (c28655q2.m87153g(c23285v0)) {
                    i65 = 131072;
                } else {
                    i65 = 65536;
                }
                i18 |= i65;
            }
            if ((i15 & 1572864) == 0) {
                if (c28655q2.m87153g(c34351r0)) {
                    i64 = 1048576;
                } else {
                    i64 = 524288;
                }
                i18 |= i64;
            }
            i25 = i17 & 128;
            if (i25 != 0) {
                i18 |= 12582912;
                c34348q1 = c34348q0;
            } else {
                c34348q1 = c34348q0;
                if ((i15 & 12582912) == 0) {
                    if (c28655q2.m87153g(c34348q1)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i18 |= i26;
                }
            }
            if ((i15 & 100663296) == 0) {
                if (c28655q2.m87155h(z14)) {
                    i59 = 67108864;
                } else {
                    i59 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i18 |= i59;
            }
            if ((i15 & 805306368) == 0) {
                if ((i17 & 512) == 0) {
                    i27 = i13;
                    int i74 = c28655q2.m87149e(i27) ? 536870912 : 268435456;
                    i18 |= i74;
                } else {
                    i27 = i13;
                }
                i18 |= i74;
            } else {
                i27 = i13;
            }
            i28 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i28 != 0) {
                i29 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (c28655q2.m87149e(i14)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i29 = i16 | i34;
            } else {
                i29 = i16;
            }
            i35 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i35 != 0) {
                i29 |= 48;
            } else if ((i16 & 48) != 0) {
                if (c28655q2.m87153g(interfaceC29873g0)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i29 |= i36;
            }
            i37 = i29;
            i38 = i18;
            i39 = i37 | 384;
            i44 = i17 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i44 != 0) {
                i45 = i37 | 3456;
            } else if ((i16 & 3072) == 0) {
                if (!c28655q2.m87153g(interfaceC21083i)) {
                    i67 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i45 = i39 | i67;
            } else {
                i45 = i39;
            }
            if ((i16 & 24576) != 0) {
                if (c28655q2.m87153g(c17875c1)) {
                    i69 = 16384;
                }
                i45 |= i69;
            }
            i46 = i17 & 32768;
            if (i46 != 0) {
                i45 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(function3)) {
                    i24 = 131072;
                }
                i45 |= i24;
            }
            if ((i38 & 306783379) == 306783378 || (i45 & 74899) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q2.m87135U(i38 & 1, z16)) {
                c28655q2.m87140Z();
                i48 = i15 & 1;
                c28676v0 = C28635l.f115821a;
                if (i48 != 0 || c28655q2.m87118C()) {
                    if (i68 != 0) {
                        z15 = false;
                    }
                    if (i25 != 0) {
                        c34348q1 = C34348q0.f144287g;
                    }
                    if ((i17 & 512) != 0) {
                        if (z14) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i54 = i38 & (-1879048193);
                    } else {
                        i49 = i27;
                        i54 = i38;
                    }
                    if (i28 != 0) {
                        i55 = 1;
                    } else {
                        i55 = i14;
                    }
                    if (i35 != 0) {
                        interfaceC29873g2 = C29871f0.f122092w;
                    } else {
                        interfaceC29873g2 = interfaceC29873g0;
                    }
                    i56 = i49;
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C33572i(28);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Function1 function8 = (Function1) objM87133R;
                    if (i44 != 0) {
                        interfaceC21083i3 = null;
                    } else {
                        interfaceC21083i3 = interfaceC21083i;
                    }
                    if (i46 != 0) {
                        function6 = AbstractC34353s.f144304a;
                    } else {
                        function6 = function3;
                    }
                    function7 = function8;
                    interfaceC29873g3 = interfaceC29873g2;
                } else {
                    c28655q2.m87138X();
                    if ((i17 & 512) != 0) {
                        i55 = i14;
                        interfaceC29873g3 = interfaceC29873g0;
                        function7 = function2;
                        function6 = function3;
                        i56 = i27;
                        c34348q1 = c34348q1;
                        i54 = i38 & (-1879048193);
                        interfaceC21083i3 = interfaceC21083i;
                    } else {
                        i55 = i14;
                        interfaceC29873g3 = interfaceC29873g0;
                        function7 = function2;
                        interfaceC21083i3 = interfaceC21083i;
                        function6 = function3;
                        i56 = i27;
                        c34348q1 = c34348q1;
                        i54 = i38;
                    }
                }
                c28655q2.m87175r();
                C29878l c29878lM108655a = c34351r0.m108655a(z14);
                Function1 function9 = function7;
                InterfaceC21083i interfaceC21083i4 = interfaceC21083i3;
                boolean z24 = !z14;
                if (z14) {
                    i57 = 1;
                } else {
                    i57 = i55;
                }
                boolean z25 = z15;
                if (z14) {
                    i58 = 1;
                } else {
                    i58 = i56;
                }
                if ((i54 & 14) == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | ((i54 & 112) == 32);
                objM87133R2 = c28655q2.m87133R();
                if (z19 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C32469t(18, c29891y, function1);
                    c28655q2.m87172p0(objM87133R2);
                }
                int i75 = i45 << 9;
                AbstractC34339n0.m108626d(c29891y, (Function1) objM87133R2, modifier, c23285v0, interfaceC29873g3, function9, interfaceC21083i4, c17875c1, z24, i58, i57, c29878lM108655a, c34348q1, z4, z25, function6, c28655q2, (i54 & 910) | ((i54 >> 6) & 7168) | (i75 & 57344) | (i75 & 458752) | (i75 & 3670016) | (i75 & 29360128), (i54 & 7168) | ((i54 >> 15) & 896) | (i54 & 57344) | (i45 & 458752));
                function4 = function9;
                c34348q2 = c34348q1;
                z17 = z25;
                c28655q = c28655q2;
                i27 = i56;
                i47 = i55;
                interfaceC29873g1 = interfaceC29873g3;
                interfaceC21083i2 = interfaceC21083i4;
                function5 = function6;
            } else {
                c28655q2.m87138X();
                i47 = i14;
                interfaceC29873g1 = interfaceC29873g0;
                interfaceC21083i2 = interfaceC21083i;
                z17 = z15;
                c34348q2 = c34348q1;
                c28655q = c28655q2;
                function4 = function2;
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C34320h(c29891y, function1, modifier, z4, z17, c23285v0, c34351r0, c34348q2, z14, i27, i47, interfaceC29873g1, function4, interfaceC21083i2, c17875c1, function5, i15, i16, i17, 0);
            }
        }
        i18 |= 24576;
        z15 = z13;
        i19 = i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i19 == 0) {
            if (c28655q2.m87153g(c23285v0)) {
                i65 = 131072;
            } else {
                i65 = 65536;
            }
            i18 |= i65;
        }
        if ((i15 & 1572864) == 0) {
            if (c28655q2.m87153g(c34351r0)) {
                i64 = 1048576;
            } else {
                i64 = 524288;
            }
            i18 |= i64;
        }
        i25 = i17 & 128;
        if (i25 != 0) {
            i18 |= 12582912;
            c34348q1 = c34348q0;
        } else {
            c34348q1 = c34348q0;
            if ((i15 & 12582912) == 0) {
                if (c28655q2.m87153g(c34348q1)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i18 |= i26;
            }
        }
        if ((i15 & 100663296) == 0) {
            if (c28655q2.m87155h(z14)) {
                i59 = 67108864;
            } else {
                i59 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i18 |= i59;
        }
        if ((i15 & 805306368) == 0) {
            if ((i17 & 512) == 0) {
                i27 = i13;
                if (c28655q2.m87149e(i27)) {
                }
                i18 |= i74;
            } else {
                i27 = i13;
            }
            i18 |= i74;
        } else {
            i27 = i13;
        }
        i28 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i28 != 0) {
            i29 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            if (c28655q2.m87149e(i14)) {
                i34 = 4;
            } else {
                i34 = 2;
            }
            i29 = i16 | i34;
        } else {
            i29 = i16;
        }
        i35 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i35 != 0) {
            i29 |= 48;
        } else if ((i16 & 48) != 0) {
            if (c28655q2.m87153g(interfaceC29873g0)) {
                i36 = 32;
            } else {
                i36 = 16;
            }
            i29 |= i36;
        }
        i37 = i29;
        i38 = i18;
        i39 = i37 | 384;
        i44 = i17 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i44 != 0) {
            i45 = i37 | 3456;
        } else if ((i16 & 3072) == 0) {
            if (!c28655q2.m87153g(interfaceC21083i)) {
                i67 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i45 = i39 | i67;
        } else {
            i45 = i39;
        }
        if ((i16 & 24576) != 0) {
            if (c28655q2.m87153g(c17875c1)) {
                i69 = 16384;
            }
            i45 |= i69;
        }
        i46 = i17 & 32768;
        if (i46 != 0) {
            i45 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87157i(function3)) {
                i24 = 131072;
            }
            i45 |= i24;
        }
        if ((i38 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c28655q2.m87135U(i38 & 1, z16)) {
            c28655q2.m87140Z();
            i48 = i15 & 1;
            c28676v0 = C28635l.f115821a;
            if (i48 != 0) {
                if (i68 != 0) {
                    z15 = false;
                }
                if (i25 != 0) {
                    c34348q1 = C34348q0.f144287g;
                }
                if ((i17 & 512) != 0) {
                    if (z14) {
                        i49 = 1;
                    } else {
                        i49 = Integer.MAX_VALUE;
                    }
                    i54 = i38 & (-1879048193);
                } else {
                    i49 = i27;
                    i54 = i38;
                }
                if (i28 != 0) {
                    i55 = 1;
                } else {
                    i55 = i14;
                }
                if (i35 != 0) {
                    interfaceC29873g2 = C29871f0.f122092w;
                } else {
                    interfaceC29873g2 = interfaceC29873g0;
                }
                i56 = i49;
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C33572i(28);
                    c28655q2.m87172p0(objM87133R);
                }
                Function1 function10 = (Function1) objM87133R;
                if (i44 != 0) {
                    interfaceC21083i3 = null;
                } else {
                    interfaceC21083i3 = interfaceC21083i;
                }
                if (i46 != 0) {
                    function6 = AbstractC34353s.f144304a;
                } else {
                    function6 = function3;
                }
                function7 = function10;
                interfaceC29873g3 = interfaceC29873g2;
            } else {
                if (i68 != 0) {
                    z15 = false;
                }
                if (i25 != 0) {
                    c34348q1 = C34348q0.f144287g;
                }
                if ((i17 & 512) != 0) {
                    if (z14) {
                        i49 = 1;
                    } else {
                        i49 = Integer.MAX_VALUE;
                    }
                    i54 = i38 & (-1879048193);
                } else {
                    i49 = i27;
                    i54 = i38;
                }
                if (i28 != 0) {
                    i55 = 1;
                } else {
                    i55 = i14;
                }
                if (i35 != 0) {
                    interfaceC29873g2 = C29871f0.f122092w;
                } else {
                    interfaceC29873g2 = interfaceC29873g0;
                }
                i56 = i49;
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C33572i(28);
                    c28655q2.m87172p0(objM87133R);
                }
                Function1 function11 = (Function1) objM87133R;
                if (i44 != 0) {
                    interfaceC21083i3 = null;
                } else {
                    interfaceC21083i3 = interfaceC21083i;
                }
                if (i46 != 0) {
                    function6 = AbstractC34353s.f144304a;
                } else {
                    function6 = function3;
                }
                function7 = function11;
                interfaceC29873g3 = interfaceC29873g2;
            }
            c28655q2.m87175r();
            C29878l c29878lM108655a2 = c34351r0.m108655a(z14);
            Function1 function12 = function7;
            InterfaceC21083i interfaceC21083i5 = interfaceC21083i3;
            boolean z26 = !z14;
            if (z14) {
                i57 = 1;
            } else {
                i57 = i55;
            }
            boolean z27 = z15;
            if (z14) {
                i58 = 1;
            } else {
                i58 = i56;
            }
            if ((i54 & 14) == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z18 | ((i54 & 112) == 32);
            objM87133R2 = c28655q2.m87133R();
            if (z19) {
                objM87133R2 = new C32469t(18, c29891y, function1);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C32469t(18, c29891y, function1);
                c28655q2.m87172p0(objM87133R2);
            }
            int i76 = i45 << 9;
            AbstractC34339n0.m108626d(c29891y, (Function1) objM87133R2, modifier, c23285v0, interfaceC29873g3, function12, interfaceC21083i5, c17875c1, z26, i58, i57, c29878lM108655a2, c34348q1, z4, z27, function6, c28655q2, (i54 & 910) | ((i54 >> 6) & 7168) | (i76 & 57344) | (i76 & 458752) | (i76 & 3670016) | (i76 & 29360128), (i54 & 7168) | ((i54 >> 15) & 896) | (i54 & 57344) | (i45 & 458752));
            function4 = function12;
            c34348q2 = c34348q1;
            z17 = z27;
            c28655q = c28655q2;
            i27 = i56;
            i47 = i55;
            interfaceC29873g1 = interfaceC29873g3;
            interfaceC21083i2 = interfaceC21083i5;
            function5 = function6;
        } else {
            c28655q2.m87138X();
            i47 = i14;
            interfaceC29873g1 = interfaceC29873g0;
            interfaceC21083i2 = interfaceC21083i;
            z17 = z15;
            c34348q2 = c34348q1;
            c28655q = c28655q2;
            function4 = function2;
            function5 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34320h(c29891y, function1, modifier, z4, z17, c23285v0, c34351r0, c34348q2, z14, i27, i47, interfaceC29873g1, function4, interfaceC21083i2, c17875c1, function5, i15, i16, i17, 0);
        }
    }
}
