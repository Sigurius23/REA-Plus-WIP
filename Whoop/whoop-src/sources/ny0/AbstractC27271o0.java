package ny0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import d41.C11677c;
import hg3.AbstractC17269i;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p132f0.C13825t;
import p163g1.AbstractC15166v0;
import p163g1.InterfaceC15156u0;
import p208i2.C17919x;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: ny0.o0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0083\u0001\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lcom/whoop/design/util/TextResource;", "buttonText", "Lb91/a;", "buttonTextStyle", "Lg1/u0;", "buttonColors", "Lf0/t;", "border", "", "endIcon", "endIconModifier", "fillMaxWidth", "Ll0/k1;", "paddingValues", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "b", "(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27271o0 {
    /* JADX WARN: Code duplicated, block: B:101:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x0135  */
    /* JADX WARN: Code duplicated, block: B:108:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x0146  */
    /* JADX WARN: Code duplicated, block: B:113:0x014d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0159  */
    /* JADX WARN: Code duplicated, block: B:120:0x0161  */
    /* JADX WARN: Code duplicated, block: B:123:0x016a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0177  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:147:0x01be  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:151:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:154:0x0201  */
    /* JADX WARN: Code duplicated, block: B:155:0x021b  */
    /* JADX WARN: Code duplicated, block: B:157:0x021f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0221  */
    /* JADX WARN: Code duplicated, block: B:160:0x0225  */
    /* JADX WARN: Code duplicated, block: B:162:0x0228  */
    /* JADX WARN: Code duplicated, block: B:163:0x022a  */
    /* JADX WARN: Code duplicated, block: B:165:0x022e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0248  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:172:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    /* JADX INFO: renamed from: b */
    public static final void m82253b(Modifier modifier, boolean z4, TextResource buttonText, C2886a c2886a, InterfaceC15156u0 interfaceC15156u0, C13825t c13825t, Integer num, Modifier modifier2, boolean z13, InterfaceC22973k1 interfaceC22973k1, InterfaceC4339a onClick, Composer composer, int i13, int i14, int i15) {
        Modifier modifier3;
        int i16;
        boolean z14;
        InterfaceC15156u0 interfaceC15156u1;
        C13825t c13825t2;
        int i17;
        Integer num2;
        int i18;
        int i19;
        Modifier modifier4;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        boolean z15;
        C28655q c28655q;
        C2886a c2886a2;
        C13825t c13825t3;
        boolean z16;
        InterfaceC22973k1 interfaceC22973k2;
        Modifier modifier5;
        boolean z17;
        InterfaceC15156u0 interfaceC15156u2;
        Modifier modifier6;
        Integer num3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean z18;
        C2886a h7;
        InterfaceC15156u0 interfaceC15156u0M43196a;
        C13825t c13825tM48880a;
        Integer num4;
        boolean z19;
        InterfaceC22973k1 c22976l1;
        Modifier modifier7;
        C2886a c2886a3;
        int i36;
        int i37;
        int i38;
        int i39;
        boolean zM87157i;
        int i44;
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1210424403);
        int i45 = i15 & 1;
        if (i45 != 0) {
            i16 = i13 | 6;
            modifier3 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier3 = modifier;
            i16 = (c28655q2.m87153g(modifier3) ? 4 : 2) | i13;
        } else {
            modifier3 = modifier;
            i16 = i13;
        }
        int i46 = i15 & 2;
        if (i46 == 0) {
            if ((i13 & 48) == 0) {
                z14 = z4;
                i16 |= c28655q2.m87155h(z14) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q2.m87153g(buttonText)) {
                    i44 = 256;
                } else {
                    i44 = 128;
                }
                i16 |= i44;
            }
            if ((i13 & 3072) == 0) {
                if ((i15 & 8) != 0) {
                    i39 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                } else {
                    if ((i13 & 4096) == 0) {
                        zM87157i = c28655q2.m87153g(c2886a);
                    } else {
                        zM87157i = c28655q2.m87157i(c2886a);
                    }
                    if (zM87157i) {
                        i39 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i39 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                }
                i16 |= i39;
            }
            if ((i13 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    interfaceC15156u1 = interfaceC15156u0;
                    if (c28655q2.m87153g(interfaceC15156u1)) {
                        i38 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i16 |= i38;
                } else {
                    interfaceC15156u1 = interfaceC15156u0;
                }
                i38 = DfuBaseService.ERROR_REMOTE_MASK;
                i16 |= i38;
            } else {
                interfaceC15156u1 = interfaceC15156u0;
            }
            if ((196608 & i13) == 0) {
                if ((i15 & 32) == 0) {
                    c13825t2 = c13825t;
                    if (c28655q2.m87153g(c13825t2)) {
                        i37 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i16 |= i37;
                } else {
                    c13825t2 = c13825t;
                }
                i37 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                i16 |= i37;
            } else {
                c13825t2 = c13825t;
            }
            i17 = i15 & 64;
            if (i17 != 0) {
                if ((1572864 & i13) == 0) {
                    num2 = num;
                    if (c28655q2.m87153g(num2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 128;
                if (i19 != 0) {
                    i16 |= 12582912;
                    modifier4 = modifier2;
                } else {
                    modifier4 = modifier2;
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87153g(modifier4)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i16 |= i24;
                    }
                }
                i25 = i15 & 256;
                if (i25 != 0) {
                    i16 |= 100663296;
                    i26 = i25;
                } else {
                    i26 = i25;
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87155h(z13)) {
                            i27 = 67108864;
                        } else {
                            i27 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i27;
                    }
                }
                i28 = i15 & 512;
                if (i28 != 0) {
                    i16 |= 805306368;
                    i29 = i28;
                } else {
                    i29 = i28;
                    if ((i13 & 805306368) == 0) {
                        if (c28655q2.m87153g(interfaceC22973k1)) {
                            i34 = 536870912;
                        } else {
                            i34 = 268435456;
                        }
                        i16 |= i34;
                    }
                }
                if ((i14 & 6) == 0) {
                    if (c28655q2.m87157i(onClick)) {
                        i36 = 4;
                    } else {
                        i36 = 2;
                    }
                    i35 = i14 | i36;
                } else {
                    i35 = i14;
                }
                if ((i16 & 306783379) == 306783378 || (i35 & 3) != 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q2.m87135U(i16 & 1, z15)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                        c2314t = C2314t.f9131w;
                        if (i45 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i46 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if ((i15 & 8) != 0) {
                            h7 = C38072d.f163053a.m121952e(c28655q2, 6).getH4();
                            i16 &= -7169;
                        } else {
                            h7 = c2886a;
                        }
                        if ((i15 & 16) != 0) {
                            C22976l1 c22976l2 = AbstractC15166v0.f56891a;
                            long j7 = C17919x.f69636m;
                            C38072d c38072d = C38072d.f163053a;
                            interfaceC15156u0M43196a = AbstractC15166v0.m43196a(j7, c38072d.m121949b(c28655q2, 6).getBrandWhite(), c38072d.m121949b(c28655q2, 6).getWhite10(), c38072d.m121949b(c28655q2, 6).getWhite20(), c28655q2, 6, 0);
                            c28655q = c28655q2;
                            i16 &= -57345;
                        } else {
                            c28655q = c28655q2;
                            interfaceC15156u0M43196a = interfaceC15156u1;
                        }
                        if ((i15 & 32) != 0) {
                            c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                            i16 &= -458753;
                        } else {
                            c13825tM48880a = c13825t;
                        }
                        if (i17 != 0) {
                            num4 = null;
                        } else {
                            num4 = num;
                        }
                        if (i19 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i26 != 0) {
                            z19 = true;
                        } else {
                            z19 = z13;
                        }
                        if (i29 != 0) {
                            float f13 = 8;
                            float f14 = 1 * f13;
                            float f15 = 2 * f13;
                            c22976l1 = new C22976l1(f14, f15, f14, f15);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        modifier7 = modifier3;
                        c2886a3 = h7;
                    } else {
                        c28655q2.m87138X();
                        if ((i15 & 8) != 0) {
                            i16 &= -7169;
                        }
                        if ((i15 & 16) != 0) {
                            i16 &= -57345;
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                        }
                        z19 = z13;
                        c28655q = c28655q2;
                        modifier7 = modifier3;
                        i16 = i16;
                        z18 = z14;
                        interfaceC15156u0M43196a = interfaceC15156u1;
                        c13825tM48880a = c13825t2;
                        num4 = num2;
                        c2886a3 = c2886a;
                        c22976l1 = interfaceC22973k1;
                    }
                    c28655q.m87175r();
                    AbstractC27292z.m82338e(modifier7, z18, z19, null, null, null, num4, modifier4, buttonText, interfaceC15156u0M43196a, null, c13825tM48880a, c2886a3, 0.0f, c22976l1, onClick, c28655q, (i16 & 14) | 3072 | (i16 & 112) | ((i16 >> 18) & 896) | (3670016 & i16) | (29360128 & i16) | (234881024 & (i16 << 18)) | ((i16 << 15) & 1879048192), ((i16 >> 15) & 57344) | ((i16 >> 12) & 112) | ((i16 >> 3) & 896) | (458752 & (i35 << 15)), 9264);
                    modifier6 = modifier4;
                    interfaceC15156u2 = interfaceC15156u0M43196a;
                    c2886a2 = c2886a3;
                    interfaceC22973k2 = c22976l1;
                    z16 = z19;
                    num3 = num4;
                    c13825t3 = c13825tM48880a;
                    z17 = z18;
                    modifier5 = modifier7;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c2886a2 = c2886a;
                    c13825t3 = c13825t;
                    z16 = z13;
                    interfaceC22973k2 = interfaceC22973k1;
                    modifier5 = modifier3;
                    z17 = z14;
                    interfaceC15156u2 = interfaceC15156u1;
                    modifier6 = modifier4;
                    num3 = num;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11677c(modifier5, z17, buttonText, c2886a2, interfaceC15156u2, c13825t3, num3, modifier6, z16, interfaceC22973k2, onClick, i13, i14, i15);
                }
            }
            i16 |= 1572864;
            num2 = num;
            i19 = i15 & 128;
            if (i19 != 0) {
                i16 |= 12582912;
                modifier4 = modifier2;
            } else {
                modifier4 = modifier2;
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87153g(modifier4)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 256;
            if (i25 != 0) {
                i16 |= 100663296;
                i26 = i25;
            } else {
                i26 = i25;
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87155h(z13)) {
                        i27 = 67108864;
                    } else {
                        i27 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i27;
                }
            }
            i28 = i15 & 512;
            if (i28 != 0) {
                i16 |= 805306368;
                i29 = i28;
            } else {
                i29 = i28;
                if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87153g(interfaceC22973k1)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i16 |= i34;
                }
            }
            if ((i14 & 6) == 0) {
                if (c28655q2.m87157i(onClick)) {
                    i36 = 4;
                } else {
                    i36 = 2;
                }
                i35 = i14 | i36;
            } else {
                i35 = i14;
            }
            if ((i16 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z15)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    c2314t = C2314t.f9131w;
                    if (i45 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i46 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if ((i15 & 8) != 0) {
                        h7 = C38072d.f163053a.m121952e(c28655q2, 6).getH4();
                        i16 &= -7169;
                    } else {
                        h7 = c2886a;
                    }
                    if ((i15 & 16) != 0) {
                        C22976l1 c22976l3 = AbstractC15166v0.f56891a;
                        long j13 = C17919x.f69636m;
                        C38072d c38072d2 = C38072d.f163053a;
                        interfaceC15156u0M43196a = AbstractC15166v0.m43196a(j13, c38072d2.m121949b(c28655q2, 6).getBrandWhite(), c38072d2.m121949b(c28655q2, 6).getWhite10(), c38072d2.m121949b(c28655q2, 6).getWhite20(), c28655q2, 6, 0);
                        c28655q = c28655q2;
                        i16 &= -57345;
                    } else {
                        c28655q = c28655q2;
                        interfaceC15156u0M43196a = interfaceC15156u1;
                    }
                    if ((i15 & 32) != 0) {
                        c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                        i16 &= -458753;
                    } else {
                        c13825tM48880a = c13825t;
                    }
                    if (i17 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i19 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i26 != 0) {
                        z19 = true;
                    } else {
                        z19 = z13;
                    }
                    if (i29 != 0) {
                        float f16 = 8;
                        float f17 = 1 * f16;
                        float f18 = 2 * f16;
                        c22976l1 = new C22976l1(f17, f18, f17, f18);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    modifier7 = modifier3;
                    c2886a3 = h7;
                } else {
                    c2314t = C2314t.f9131w;
                    if (i45 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i46 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if ((i15 & 8) != 0) {
                        h7 = C38072d.f163053a.m121952e(c28655q2, 6).getH4();
                        i16 &= -7169;
                    } else {
                        h7 = c2886a;
                    }
                    if ((i15 & 16) != 0) {
                        C22976l1 c22976l4 = AbstractC15166v0.f56891a;
                        long j14 = C17919x.f69636m;
                        C38072d c38072d3 = C38072d.f163053a;
                        interfaceC15156u0M43196a = AbstractC15166v0.m43196a(j14, c38072d3.m121949b(c28655q2, 6).getBrandWhite(), c38072d3.m121949b(c28655q2, 6).getWhite10(), c38072d3.m121949b(c28655q2, 6).getWhite20(), c28655q2, 6, 0);
                        c28655q = c28655q2;
                        i16 &= -57345;
                    } else {
                        c28655q = c28655q2;
                        interfaceC15156u0M43196a = interfaceC15156u1;
                    }
                    if ((i15 & 32) != 0) {
                        c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                        i16 &= -458753;
                    } else {
                        c13825tM48880a = c13825t;
                    }
                    if (i17 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i19 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i26 != 0) {
                        z19 = true;
                    } else {
                        z19 = z13;
                    }
                    if (i29 != 0) {
                        float f19 = 8;
                        float f110 = 1 * f19;
                        float f111 = 2 * f19;
                        c22976l1 = new C22976l1(f110, f111, f110, f111);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    modifier7 = modifier3;
                    c2886a3 = h7;
                }
                c28655q.m87175r();
                AbstractC27292z.m82338e(modifier7, z18, z19, null, null, null, num4, modifier4, buttonText, interfaceC15156u0M43196a, null, c13825tM48880a, c2886a3, 0.0f, c22976l1, onClick, c28655q, (i16 & 14) | 3072 | (i16 & 112) | ((i16 >> 18) & 896) | (3670016 & i16) | (29360128 & i16) | (234881024 & (i16 << 18)) | ((i16 << 15) & 1879048192), ((i16 >> 15) & 57344) | ((i16 >> 12) & 112) | ((i16 >> 3) & 896) | (458752 & (i35 << 15)), 9264);
                modifier6 = modifier4;
                interfaceC15156u2 = interfaceC15156u0M43196a;
                c2886a2 = c2886a3;
                interfaceC22973k2 = c22976l1;
                z16 = z19;
                num3 = num4;
                c13825t3 = c13825tM48880a;
                z17 = z18;
                modifier5 = modifier7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c2886a2 = c2886a;
                c13825t3 = c13825t;
                z16 = z13;
                interfaceC22973k2 = interfaceC22973k1;
                modifier5 = modifier3;
                z17 = z14;
                interfaceC15156u2 = interfaceC15156u1;
                modifier6 = modifier4;
                num3 = num;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11677c(modifier5, z17, buttonText, c2886a2, interfaceC15156u2, c13825t3, num3, modifier6, z16, interfaceC22973k2, onClick, i13, i14, i15);
            }
        }
        i16 |= 48;
        z14 = z4;
        if ((i13 & 384) == 0) {
            if (c28655q2.m87153g(buttonText)) {
                i44 = 256;
            } else {
                i44 = 128;
            }
            i16 |= i44;
        }
        if ((i13 & 3072) == 0) {
            if ((i15 & 8) != 0) {
                i39 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else {
                if ((i13 & 4096) == 0) {
                    zM87157i = c28655q2.m87153g(c2886a);
                } else {
                    zM87157i = c28655q2.m87157i(c2886a);
                }
                if (zM87157i) {
                    i39 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i39 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
            }
            i16 |= i39;
        }
        if ((i13 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                interfaceC15156u1 = interfaceC15156u0;
                if (c28655q2.m87153g(interfaceC15156u1)) {
                    i38 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i16 |= i38;
            } else {
                interfaceC15156u1 = interfaceC15156u0;
            }
            i38 = DfuBaseService.ERROR_REMOTE_MASK;
            i16 |= i38;
        } else {
            interfaceC15156u1 = interfaceC15156u0;
        }
        if ((196608 & i13) == 0) {
            if ((i15 & 32) == 0) {
                c13825t2 = c13825t;
                if (c28655q2.m87153g(c13825t2)) {
                    i37 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i16 |= i37;
            } else {
                c13825t2 = c13825t;
            }
            i37 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i16 |= i37;
        } else {
            c13825t2 = c13825t;
        }
        i17 = i15 & 64;
        if (i17 != 0) {
            if ((1572864 & i13) == 0) {
                num2 = num;
                if (c28655q2.m87153g(num2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
            i19 = i15 & 128;
            if (i19 != 0) {
                i16 |= 12582912;
                modifier4 = modifier2;
            } else {
                modifier4 = modifier2;
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87153g(modifier4)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 256;
            if (i25 != 0) {
                i16 |= 100663296;
                i26 = i25;
            } else {
                i26 = i25;
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87155h(z13)) {
                        i27 = 67108864;
                    } else {
                        i27 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i27;
                }
            }
            i28 = i15 & 512;
            if (i28 != 0) {
                i16 |= 805306368;
                i29 = i28;
            } else {
                i29 = i28;
                if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87153g(interfaceC22973k1)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i16 |= i34;
                }
            }
            if ((i14 & 6) == 0) {
                if (c28655q2.m87157i(onClick)) {
                    i36 = 4;
                } else {
                    i36 = 2;
                }
                i35 = i14 | i36;
            } else {
                i35 = i14;
            }
            if ((i16 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z15)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    c2314t = C2314t.f9131w;
                    if (i45 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i46 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if ((i15 & 8) != 0) {
                        h7 = C38072d.f163053a.m121952e(c28655q2, 6).getH4();
                        i16 &= -7169;
                    } else {
                        h7 = c2886a;
                    }
                    if ((i15 & 16) != 0) {
                        C22976l1 c22976l5 = AbstractC15166v0.f56891a;
                        long j15 = C17919x.f69636m;
                        C38072d c38072d4 = C38072d.f163053a;
                        interfaceC15156u0M43196a = AbstractC15166v0.m43196a(j15, c38072d4.m121949b(c28655q2, 6).getBrandWhite(), c38072d4.m121949b(c28655q2, 6).getWhite10(), c38072d4.m121949b(c28655q2, 6).getWhite20(), c28655q2, 6, 0);
                        c28655q = c28655q2;
                        i16 &= -57345;
                    } else {
                        c28655q = c28655q2;
                        interfaceC15156u0M43196a = interfaceC15156u1;
                    }
                    if ((i15 & 32) != 0) {
                        c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                        i16 &= -458753;
                    } else {
                        c13825tM48880a = c13825t;
                    }
                    if (i17 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i19 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i26 != 0) {
                        z19 = true;
                    } else {
                        z19 = z13;
                    }
                    if (i29 != 0) {
                        float f112 = 8;
                        float f113 = 1 * f112;
                        float f114 = 2 * f112;
                        c22976l1 = new C22976l1(f113, f114, f113, f114);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    modifier7 = modifier3;
                    c2886a3 = h7;
                } else {
                    c2314t = C2314t.f9131w;
                    if (i45 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i46 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if ((i15 & 8) != 0) {
                        h7 = C38072d.f163053a.m121952e(c28655q2, 6).getH4();
                        i16 &= -7169;
                    } else {
                        h7 = c2886a;
                    }
                    if ((i15 & 16) != 0) {
                        C22976l1 c22976l6 = AbstractC15166v0.f56891a;
                        long j16 = C17919x.f69636m;
                        C38072d c38072d5 = C38072d.f163053a;
                        interfaceC15156u0M43196a = AbstractC15166v0.m43196a(j16, c38072d5.m121949b(c28655q2, 6).getBrandWhite(), c38072d5.m121949b(c28655q2, 6).getWhite10(), c38072d5.m121949b(c28655q2, 6).getWhite20(), c28655q2, 6, 0);
                        c28655q = c28655q2;
                        i16 &= -57345;
                    } else {
                        c28655q = c28655q2;
                        interfaceC15156u0M43196a = interfaceC15156u1;
                    }
                    if ((i15 & 32) != 0) {
                        c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                        i16 &= -458753;
                    } else {
                        c13825tM48880a = c13825t;
                    }
                    if (i17 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i19 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i26 != 0) {
                        z19 = true;
                    } else {
                        z19 = z13;
                    }
                    if (i29 != 0) {
                        float f115 = 8;
                        float f116 = 1 * f115;
                        float f117 = 2 * f115;
                        c22976l1 = new C22976l1(f116, f117, f116, f117);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    modifier7 = modifier3;
                    c2886a3 = h7;
                }
                c28655q.m87175r();
                AbstractC27292z.m82338e(modifier7, z18, z19, null, null, null, num4, modifier4, buttonText, interfaceC15156u0M43196a, null, c13825tM48880a, c2886a3, 0.0f, c22976l1, onClick, c28655q, (i16 & 14) | 3072 | (i16 & 112) | ((i16 >> 18) & 896) | (3670016 & i16) | (29360128 & i16) | (234881024 & (i16 << 18)) | ((i16 << 15) & 1879048192), ((i16 >> 15) & 57344) | ((i16 >> 12) & 112) | ((i16 >> 3) & 896) | (458752 & (i35 << 15)), 9264);
                modifier6 = modifier4;
                interfaceC15156u2 = interfaceC15156u0M43196a;
                c2886a2 = c2886a3;
                interfaceC22973k2 = c22976l1;
                z16 = z19;
                num3 = num4;
                c13825t3 = c13825tM48880a;
                z17 = z18;
                modifier5 = modifier7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c2886a2 = c2886a;
                c13825t3 = c13825t;
                z16 = z13;
                interfaceC22973k2 = interfaceC22973k1;
                modifier5 = modifier3;
                z17 = z14;
                interfaceC15156u2 = interfaceC15156u1;
                modifier6 = modifier4;
                num3 = num;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11677c(modifier5, z17, buttonText, c2886a2, interfaceC15156u2, c13825t3, num3, modifier6, z16, interfaceC22973k2, onClick, i13, i14, i15);
            }
        }
        i16 |= 1572864;
        num2 = num;
        i19 = i15 & 128;
        if (i19 != 0) {
            i16 |= 12582912;
            modifier4 = modifier2;
        } else {
            modifier4 = modifier2;
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87153g(modifier4)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i16 |= i24;
            }
        }
        i25 = i15 & 256;
        if (i25 != 0) {
            i16 |= 100663296;
            i26 = i25;
        } else {
            i26 = i25;
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87155h(z13)) {
                    i27 = 67108864;
                } else {
                    i27 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i27;
            }
        }
        i28 = i15 & 512;
        if (i28 != 0) {
            i16 |= 805306368;
            i29 = i28;
        } else {
            i29 = i28;
            if ((i13 & 805306368) == 0) {
                if (c28655q2.m87153g(interfaceC22973k1)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i16 |= i34;
            }
        }
        if ((i14 & 6) == 0) {
            if (c28655q2.m87157i(onClick)) {
                i36 = 4;
            } else {
                i36 = 2;
            }
            i35 = i14 | i36;
        } else {
            i35 = i14;
        }
        if ((i16 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (c28655q2.m87135U(i16 & 1, z15)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                c2314t = C2314t.f9131w;
                if (i45 != 0) {
                    modifier3 = c2314t;
                }
                if (i46 != 0) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
                if ((i15 & 8) != 0) {
                    h7 = C38072d.f163053a.m121952e(c28655q2, 6).getH4();
                    i16 &= -7169;
                } else {
                    h7 = c2886a;
                }
                if ((i15 & 16) != 0) {
                    C22976l1 c22976l7 = AbstractC15166v0.f56891a;
                    long j17 = C17919x.f69636m;
                    C38072d c38072d6 = C38072d.f163053a;
                    interfaceC15156u0M43196a = AbstractC15166v0.m43196a(j17, c38072d6.m121949b(c28655q2, 6).getBrandWhite(), c38072d6.m121949b(c28655q2, 6).getWhite10(), c38072d6.m121949b(c28655q2, 6).getWhite20(), c28655q2, 6, 0);
                    c28655q = c28655q2;
                    i16 &= -57345;
                } else {
                    c28655q = c28655q2;
                    interfaceC15156u0M43196a = interfaceC15156u1;
                }
                if ((i15 & 32) != 0) {
                    c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                    i16 &= -458753;
                } else {
                    c13825tM48880a = c13825t;
                }
                if (i17 != 0) {
                    num4 = null;
                } else {
                    num4 = num;
                }
                if (i19 != 0) {
                    modifier4 = c2314t;
                }
                if (i26 != 0) {
                    z19 = true;
                } else {
                    z19 = z13;
                }
                if (i29 != 0) {
                    float f118 = 8;
                    float f119 = 1 * f118;
                    float f1110 = 2 * f118;
                    c22976l1 = new C22976l1(f119, f1110, f119, f1110);
                } else {
                    c22976l1 = interfaceC22973k1;
                }
                modifier7 = modifier3;
                c2886a3 = h7;
            } else {
                c2314t = C2314t.f9131w;
                if (i45 != 0) {
                    modifier3 = c2314t;
                }
                if (i46 != 0) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
                if ((i15 & 8) != 0) {
                    h7 = C38072d.f163053a.m121952e(c28655q2, 6).getH4();
                    i16 &= -7169;
                } else {
                    h7 = c2886a;
                }
                if ((i15 & 16) != 0) {
                    C22976l1 c22976l8 = AbstractC15166v0.f56891a;
                    long j18 = C17919x.f69636m;
                    C38072d c38072d7 = C38072d.f163053a;
                    interfaceC15156u0M43196a = AbstractC15166v0.m43196a(j18, c38072d7.m121949b(c28655q2, 6).getBrandWhite(), c38072d7.m121949b(c28655q2, 6).getWhite10(), c38072d7.m121949b(c28655q2, 6).getWhite20(), c28655q2, 6, 0);
                    c28655q = c28655q2;
                    i16 &= -57345;
                } else {
                    c28655q = c28655q2;
                    interfaceC15156u0M43196a = interfaceC15156u1;
                }
                if ((i15 & 32) != 0) {
                    c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                    i16 &= -458753;
                } else {
                    c13825tM48880a = c13825t;
                }
                if (i17 != 0) {
                    num4 = null;
                } else {
                    num4 = num;
                }
                if (i19 != 0) {
                    modifier4 = c2314t;
                }
                if (i26 != 0) {
                    z19 = true;
                } else {
                    z19 = z13;
                }
                if (i29 != 0) {
                    float f1111 = 8;
                    float f1112 = 1 * f1111;
                    float f1113 = 2 * f1111;
                    c22976l1 = new C22976l1(f1112, f1113, f1112, f1113);
                } else {
                    c22976l1 = interfaceC22973k1;
                }
                modifier7 = modifier3;
                c2886a3 = h7;
            }
            c28655q.m87175r();
            AbstractC27292z.m82338e(modifier7, z18, z19, null, null, null, num4, modifier4, buttonText, interfaceC15156u0M43196a, null, c13825tM48880a, c2886a3, 0.0f, c22976l1, onClick, c28655q, (i16 & 14) | 3072 | (i16 & 112) | ((i16 >> 18) & 896) | (3670016 & i16) | (29360128 & i16) | (234881024 & (i16 << 18)) | ((i16 << 15) & 1879048192), ((i16 >> 15) & 57344) | ((i16 >> 12) & 112) | ((i16 >> 3) & 896) | (458752 & (i35 << 15)), 9264);
            modifier6 = modifier4;
            interfaceC15156u2 = interfaceC15156u0M43196a;
            c2886a2 = c2886a3;
            interfaceC22973k2 = c22976l1;
            z16 = z19;
            num3 = num4;
            c13825t3 = c13825tM48880a;
            z17 = z18;
            modifier5 = modifier7;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            c2886a2 = c2886a;
            c13825t3 = c13825t;
            z16 = z13;
            interfaceC22973k2 = interfaceC22973k1;
            modifier5 = modifier3;
            z17 = z14;
            interfaceC15156u2 = interfaceC15156u1;
            modifier6 = modifier4;
            num3 = num;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11677c(modifier5, z17, buttonText, c2886a2, interfaceC15156u2, c13825t3, num3, modifier6, z16, interfaceC22973k2, onClick, i13, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m82254c(Modifier modifier, boolean z4, TextResource textResource, C2886a c2886a, InterfaceC15156u0 interfaceC15156u0, C13825t c13825t, Integer num, Modifier modifier2, boolean z13, InterfaceC22973k1 interfaceC22973k1, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15, Composer composer, int i16) {
        m82253b(modifier, z4, textResource, c2886a, interfaceC15156u0, c13825t, num, modifier2, z13, interfaceC22973k1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }
}
