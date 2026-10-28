package st1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import j93.AbstractC21478l0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17914u0;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: st1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ly3/f;", "gridSize", "", "strokeWidth", "Li2/x;", "lineColor", "gradientRadius", "gradientStartX", "gradientStartY", "Ll83/a0;", "c", "(FFJFFFLandroidx/compose/runtime/Composer;II)V", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32985f {
    /* JADX WARN: Code duplicated, block: B:101:0x0151  */
    /* JADX WARN: Code duplicated, block: B:102:0x0155  */
    /* JADX WARN: Code duplicated, block: B:105:0x0168  */
    /* JADX WARN: Code duplicated, block: B:107:0x0176  */
    /* JADX WARN: Code duplicated, block: B:110:0x0196  */
    /* JADX WARN: Code duplicated, block: B:111:0x0198  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:122:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:139:0x0203  */
    /* JADX WARN: Code duplicated, block: B:142:0x0212  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    /* JADX INFO: renamed from: c */
    public static final void m104131c(float f13, float f14, long j7, float f15, float f16, float f17, Composer composer, final int i13, final int i14) {
        float f18;
        int i15;
        float f19;
        long j13;
        int i16;
        float f24;
        int i17;
        int i18;
        float f25;
        int i19;
        int i24;
        float f26;
        int i25;
        boolean z4;
        final float f27;
        final float f28;
        final long j14;
        final float f29;
        final float f34;
        final float f35;
        C28677v1 c28677v1M87180u;
        long white20;
        float f36;
        final float f37;
        final float f38;
        final float f39;
        final float f43;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        final float fMo743q0;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean zM87147d;
        Object objM87133R;
        final long j15;
        int i26;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2057897283);
        int i27 = i14 & 1;
        if (i27 != 0) {
            i15 = i13 | 6;
            f18 = f13;
        } else if ((i13 & 6) == 0) {
            f18 = f13;
            i15 = (c28655q.m87147d(f18) ? 4 : 2) | i13;
        } else {
            f18 = f13;
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                f19 = f14;
                i15 |= c28655q.m87147d(f19) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                j13 = j7;
                if ((i14 & 4) == 0 || !c28655q.m87151f(j13)) {
                    i26 = 128;
                } else {
                    i26 = 256;
                }
                i15 |= i26;
            } else {
                j13 = j7;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    f24 = f15;
                    if (c28655q.m87147d(f24)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        f25 = f16;
                        if (c28655q.m87147d(f25)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 32;
                    if (i24 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        f26 = f17;
                    } else {
                        f26 = f17;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q.m87147d(f26)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i25;
                        }
                    }
                    if ((i15 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0 || c28655q.m87118C()) {
                            if (i27 != 0) {
                                f18 = 15;
                            }
                            if (i28 != 0) {
                                f19 = 1.0f;
                            }
                            if ((i14 & 4) != 0) {
                                white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                                i15 &= -897;
                            } else {
                                white20 = j13;
                            }
                            if (i16 != 0) {
                                f24 = 3.0f;
                            }
                            if (i18 != 0) {
                                f36 = 2.0f;
                            } else {
                                f36 = f25;
                            }
                            if (i24 != 0) {
                                f37 = f36;
                                f39 = 2.5f;
                                f38 = f19;
                            } else {
                                f37 = f36;
                                f38 = f19;
                            }
                            f43 = f24;
                            c28655q.m87175r();
                            C2314t c2314t = C2314t.f9131w;
                            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                            fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f18);
                            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                            if ((57344 & i15) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((458752 & i15) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z16 = z13 | z14;
                            if ((i15 & 7168) == 2048) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            zM87147d = z16 | z15 | c28655q.m87147d(fMo743q0) | ((((i15 & 896) ^ 384) <= 256 && c28655q.m87151f(white20)) || (i15 & 384) == 256) | ((i15 & 112) == 32);
                            objM87133R = c28655q.m87133R();
                            if (!zM87147d || objM87133R == C28635l.f115821a) {
                                j15 = white20;
                                objM87133R = new Function1() { // from class: st1.d
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            } else {
                                j15 = white20;
                            }
                            AbstractC21478l0.m60421a(modifierM3407d2, (Function1) objM87133R, c28655q, 6);
                            c28655q.m87173q(true);
                            f27 = f18;
                            f34 = f37;
                            f29 = f39;
                            f35 = f43;
                            j14 = j15;
                            f28 = f38;
                        } else {
                            c28655q.m87138X();
                            if ((i14 & 4) != 0) {
                                i15 &= -897;
                            }
                            f37 = f25;
                            f38 = f19;
                            white20 = j13;
                        }
                        f39 = f26;
                        f43 = f24;
                        c28655q.m87175r();
                        C2314t c2314t2 = C2314t.f9131w;
                        Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t2);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                        fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f18);
                        Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t2);
                        if ((57344 & i15) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((458752 & i15) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z17 = z13 | z14;
                        if ((i15 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM87147d = z17 | z15 | c28655q.m87147d(fMo743q0) | ((((i15 & 896) ^ 384) <= 256 && c28655q.m87151f(white20)) || (i15 & 384) == 256) | ((i15 & 112) == 32);
                        objM87133R = c28655q.m87133R();
                        if (zM87147d) {
                            j15 = white20;
                            objM87133R = new Function1() { // from class: st1.d
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        } else {
                            j15 = white20;
                            objM87133R = new Function1() { // from class: st1.d
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC21478l0.m60421a(modifierM3407d4, (Function1) objM87133R, c28655q, 6);
                        c28655q.m87173q(true);
                        f27 = f18;
                        f34 = f37;
                        f29 = f39;
                        f35 = f43;
                        j14 = j15;
                        f28 = f38;
                    } else {
                        c28655q.m87138X();
                        f27 = f18;
                        f28 = f19;
                        j14 = j13;
                        f29 = f26;
                        f34 = f25;
                        f35 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: st1.e
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC32985f.m104133e(f27, f28, j14, f35, f34, f29, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 24576;
                f25 = f16;
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    f26 = f17;
                } else {
                    f26 = f17;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87147d(f26)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i27 != 0) {
                            f18 = 15;
                        }
                        if (i28 != 0) {
                            f19 = 1.0f;
                        }
                        if ((i14 & 4) != 0) {
                            white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                            i15 &= -897;
                        } else {
                            white20 = j13;
                        }
                        if (i16 != 0) {
                            f24 = 3.0f;
                        }
                        if (i18 != 0) {
                            f36 = 2.0f;
                        } else {
                            f36 = f25;
                        }
                        if (i24 != 0) {
                            f37 = f36;
                            f39 = 2.5f;
                            f38 = f19;
                        } else {
                            f37 = f36;
                            f38 = f19;
                            f39 = f26;
                        }
                    } else {
                        if (i27 != 0) {
                            f18 = 15;
                        }
                        if (i28 != 0) {
                            f19 = 1.0f;
                        }
                        if ((i14 & 4) != 0) {
                            white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                            i15 &= -897;
                        } else {
                            white20 = j13;
                        }
                        if (i16 != 0) {
                            f24 = 3.0f;
                        }
                        if (i18 != 0) {
                            f36 = 2.0f;
                        } else {
                            f36 = f25;
                        }
                        if (i24 != 0) {
                            f37 = f36;
                            f39 = 2.5f;
                            f38 = f19;
                        } else {
                            f37 = f36;
                            f38 = f19;
                            f39 = f26;
                        }
                    }
                    f43 = f24;
                    c28655q.m87175r();
                    C2314t c2314t3 = C2314t.f9131w;
                    Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, c2314t3);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3407d5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f18);
                    Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, c2314t3);
                    if ((57344 & i15) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((458752 & i15) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z18 = z13 | z14;
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87147d = z18 | z15 | c28655q.m87147d(fMo743q0) | ((((i15 & 896) ^ 384) <= 256 && c28655q.m87151f(white20)) || (i15 & 384) == 256) | ((i15 & 112) == 32);
                    objM87133R = c28655q.m87133R();
                    if (zM87147d) {
                        j15 = white20;
                        objM87133R = new Function1() { // from class: st1.d
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        j15 = white20;
                        objM87133R = new Function1() { // from class: st1.d
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC21478l0.m60421a(modifierM3407d6, (Function1) objM87133R, c28655q, 6);
                    c28655q.m87173q(true);
                    f27 = f18;
                    f34 = f37;
                    f29 = f39;
                    f35 = f43;
                    j14 = j15;
                    f28 = f38;
                } else {
                    c28655q.m87138X();
                    f27 = f18;
                    f28 = f19;
                    j14 = j13;
                    f29 = f26;
                    f34 = f25;
                    f35 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: st1.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC32985f.m104133e(f27, f28, j14, f35, f34, f29, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 3072;
            f24 = f15;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    f25 = f16;
                    if (c28655q.m87147d(f25)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    f26 = f17;
                } else {
                    f26 = f17;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87147d(f26)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i27 != 0) {
                            f18 = 15;
                        }
                        if (i28 != 0) {
                            f19 = 1.0f;
                        }
                        if ((i14 & 4) != 0) {
                            white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                            i15 &= -897;
                        } else {
                            white20 = j13;
                        }
                        if (i16 != 0) {
                            f24 = 3.0f;
                        }
                        if (i18 != 0) {
                            f36 = 2.0f;
                        } else {
                            f36 = f25;
                        }
                        if (i24 != 0) {
                            f37 = f36;
                            f39 = 2.5f;
                            f38 = f19;
                        } else {
                            f37 = f36;
                            f38 = f19;
                            f39 = f26;
                        }
                    } else {
                        if (i27 != 0) {
                            f18 = 15;
                        }
                        if (i28 != 0) {
                            f19 = 1.0f;
                        }
                        if ((i14 & 4) != 0) {
                            white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                            i15 &= -897;
                        } else {
                            white20 = j13;
                        }
                        if (i16 != 0) {
                            f24 = 3.0f;
                        }
                        if (i18 != 0) {
                            f36 = 2.0f;
                        } else {
                            f36 = f25;
                        }
                        if (i24 != 0) {
                            f37 = f36;
                            f39 = 2.5f;
                            f38 = f19;
                        } else {
                            f37 = f36;
                            f38 = f19;
                            f39 = f26;
                        }
                    }
                    f43 = f24;
                    c28655q.m87175r();
                    C2314t c2314t4 = C2314t.f9131w;
                    Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, c2314t4);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f18);
                    Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, c2314t4);
                    if ((57344 & i15) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((458752 & i15) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z19 = z13 | z14;
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87147d = z19 | z15 | c28655q.m87147d(fMo743q0) | ((((i15 & 896) ^ 384) <= 256 && c28655q.m87151f(white20)) || (i15 & 384) == 256) | ((i15 & 112) == 32);
                    objM87133R = c28655q.m87133R();
                    if (zM87147d) {
                        j15 = white20;
                        objM87133R = new Function1() { // from class: st1.d
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        j15 = white20;
                        objM87133R = new Function1() { // from class: st1.d
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC21478l0.m60421a(modifierM3407d8, (Function1) objM87133R, c28655q, 6);
                    c28655q.m87173q(true);
                    f27 = f18;
                    f34 = f37;
                    f29 = f39;
                    f35 = f43;
                    j14 = j15;
                    f28 = f38;
                } else {
                    c28655q.m87138X();
                    f27 = f18;
                    f28 = f19;
                    j14 = j13;
                    f29 = f26;
                    f34 = f25;
                    f35 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: st1.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC32985f.m104133e(f27, f28, j14, f35, f34, f29, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 24576;
            f25 = f16;
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                f26 = f17;
            } else {
                f26 = f17;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87147d(f26)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
            }
            if ((i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i27 != 0) {
                        f18 = 15;
                    }
                    if (i28 != 0) {
                        f19 = 1.0f;
                    }
                    if ((i14 & 4) != 0) {
                        white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                        i15 &= -897;
                    } else {
                        white20 = j13;
                    }
                    if (i16 != 0) {
                        f24 = 3.0f;
                    }
                    if (i18 != 0) {
                        f36 = 2.0f;
                    } else {
                        f36 = f25;
                    }
                    if (i24 != 0) {
                        f37 = f36;
                        f39 = 2.5f;
                        f38 = f19;
                    } else {
                        f37 = f36;
                        f38 = f19;
                        f39 = f26;
                    }
                } else {
                    if (i27 != 0) {
                        f18 = 15;
                    }
                    if (i28 != 0) {
                        f19 = 1.0f;
                    }
                    if ((i14 & 4) != 0) {
                        white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                        i15 &= -897;
                    } else {
                        white20 = j13;
                    }
                    if (i16 != 0) {
                        f24 = 3.0f;
                    }
                    if (i18 != 0) {
                        f36 = 2.0f;
                    } else {
                        f36 = f25;
                    }
                    if (i24 != 0) {
                        f37 = f36;
                        f39 = 2.5f;
                        f38 = f19;
                    } else {
                        f37 = f36;
                        f38 = f19;
                        f39 = f26;
                    }
                }
                f43 = f24;
                c28655q.m87175r();
                C2314t c2314t5 = C2314t.f9131w;
                Modifier modifierM3407d9 = AbstractC1102d.m3407d(1.0f, c2314t5);
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d9);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f18);
                Modifier modifierM3407d10 = AbstractC1102d.m3407d(1.0f, c2314t5);
                if ((57344 & i15) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((458752 & i15) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z110 = z13 | z14;
                if ((i15 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87147d = z110 | z15 | c28655q.m87147d(fMo743q0) | ((((i15 & 896) ^ 384) <= 256 && c28655q.m87151f(white20)) || (i15 & 384) == 256) | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (zM87147d) {
                    j15 = white20;
                    objM87133R = new Function1() { // from class: st1.d
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    j15 = white20;
                    objM87133R = new Function1() { // from class: st1.d
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierM3407d10, (Function1) objM87133R, c28655q, 6);
                c28655q.m87173q(true);
                f27 = f18;
                f34 = f37;
                f29 = f39;
                f35 = f43;
                j14 = j15;
                f28 = f38;
            } else {
                c28655q.m87138X();
                f27 = f18;
                f28 = f19;
                j14 = j13;
                f29 = f26;
                f34 = f25;
                f35 = f24;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: st1.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC32985f.m104133e(f27, f28, j14, f35, f34, f29, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 48;
        f19 = f14;
        if ((i13 & 384) == 0) {
            j13 = j7;
            if ((i14 & 4) == 0) {
                i26 = 128;
            } else {
                i26 = 128;
            }
            i15 |= i26;
        } else {
            j13 = j7;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                f24 = f15;
                if (c28655q.m87147d(f24)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    f25 = f16;
                    if (c28655q.m87147d(f25)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    f26 = f17;
                } else {
                    f26 = f17;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87147d(f26)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i27 != 0) {
                            f18 = 15;
                        }
                        if (i28 != 0) {
                            f19 = 1.0f;
                        }
                        if ((i14 & 4) != 0) {
                            white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                            i15 &= -897;
                        } else {
                            white20 = j13;
                        }
                        if (i16 != 0) {
                            f24 = 3.0f;
                        }
                        if (i18 != 0) {
                            f36 = 2.0f;
                        } else {
                            f36 = f25;
                        }
                        if (i24 != 0) {
                            f37 = f36;
                            f39 = 2.5f;
                            f38 = f19;
                        } else {
                            f37 = f36;
                            f38 = f19;
                            f39 = f26;
                        }
                    } else {
                        if (i27 != 0) {
                            f18 = 15;
                        }
                        if (i28 != 0) {
                            f19 = 1.0f;
                        }
                        if ((i14 & 4) != 0) {
                            white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                            i15 &= -897;
                        } else {
                            white20 = j13;
                        }
                        if (i16 != 0) {
                            f24 = 3.0f;
                        }
                        if (i18 != 0) {
                            f36 = 2.0f;
                        } else {
                            f36 = f25;
                        }
                        if (i24 != 0) {
                            f37 = f36;
                            f39 = 2.5f;
                            f38 = f19;
                        } else {
                            f37 = f36;
                            f38 = f19;
                            f39 = f26;
                        }
                    }
                    f43 = f24;
                    c28655q.m87175r();
                    C2314t c2314t6 = C2314t.f9131w;
                    Modifier modifierM3407d11 = AbstractC1102d.m3407d(1.0f, c2314t6);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3407d11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f18);
                    Modifier modifierM3407d12 = AbstractC1102d.m3407d(1.0f, c2314t6);
                    if ((57344 & i15) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((458752 & i15) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z111 = z13 | z14;
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87147d = z111 | z15 | c28655q.m87147d(fMo743q0) | ((((i15 & 896) ^ 384) <= 256 && c28655q.m87151f(white20)) || (i15 & 384) == 256) | ((i15 & 112) == 32);
                    objM87133R = c28655q.m87133R();
                    if (zM87147d) {
                        j15 = white20;
                        objM87133R = new Function1() { // from class: st1.d
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        j15 = white20;
                        objM87133R = new Function1() { // from class: st1.d
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC21478l0.m60421a(modifierM3407d12, (Function1) objM87133R, c28655q, 6);
                    c28655q.m87173q(true);
                    f27 = f18;
                    f34 = f37;
                    f29 = f39;
                    f35 = f43;
                    j14 = j15;
                    f28 = f38;
                } else {
                    c28655q.m87138X();
                    f27 = f18;
                    f28 = f19;
                    j14 = j13;
                    f29 = f26;
                    f34 = f25;
                    f35 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: st1.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC32985f.m104133e(f27, f28, j14, f35, f34, f29, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 24576;
            f25 = f16;
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                f26 = f17;
            } else {
                f26 = f17;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87147d(f26)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
            }
            if ((i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i27 != 0) {
                        f18 = 15;
                    }
                    if (i28 != 0) {
                        f19 = 1.0f;
                    }
                    if ((i14 & 4) != 0) {
                        white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                        i15 &= -897;
                    } else {
                        white20 = j13;
                    }
                    if (i16 != 0) {
                        f24 = 3.0f;
                    }
                    if (i18 != 0) {
                        f36 = 2.0f;
                    } else {
                        f36 = f25;
                    }
                    if (i24 != 0) {
                        f37 = f36;
                        f39 = 2.5f;
                        f38 = f19;
                    } else {
                        f37 = f36;
                        f38 = f19;
                        f39 = f26;
                    }
                } else {
                    if (i27 != 0) {
                        f18 = 15;
                    }
                    if (i28 != 0) {
                        f19 = 1.0f;
                    }
                    if ((i14 & 4) != 0) {
                        white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                        i15 &= -897;
                    } else {
                        white20 = j13;
                    }
                    if (i16 != 0) {
                        f24 = 3.0f;
                    }
                    if (i18 != 0) {
                        f36 = 2.0f;
                    } else {
                        f36 = f25;
                    }
                    if (i24 != 0) {
                        f37 = f36;
                        f39 = 2.5f;
                        f38 = f19;
                    } else {
                        f37 = f36;
                        f38 = f19;
                        f39 = f26;
                    }
                }
                f43 = f24;
                c28655q.m87175r();
                C2314t c2314t7 = C2314t.f9131w;
                Modifier modifierM3407d13 = AbstractC1102d.m3407d(1.0f, c2314t7);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3407d13);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f18);
                Modifier modifierM3407d14 = AbstractC1102d.m3407d(1.0f, c2314t7);
                if ((57344 & i15) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((458752 & i15) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z112 = z13 | z14;
                if ((i15 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87147d = z112 | z15 | c28655q.m87147d(fMo743q0) | ((((i15 & 896) ^ 384) <= 256 && c28655q.m87151f(white20)) || (i15 & 384) == 256) | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (zM87147d) {
                    j15 = white20;
                    objM87133R = new Function1() { // from class: st1.d
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    j15 = white20;
                    objM87133R = new Function1() { // from class: st1.d
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierM3407d14, (Function1) objM87133R, c28655q, 6);
                c28655q.m87173q(true);
                f27 = f18;
                f34 = f37;
                f29 = f39;
                f35 = f43;
                j14 = j15;
                f28 = f38;
            } else {
                c28655q.m87138X();
                f27 = f18;
                f28 = f19;
                j14 = j13;
                f29 = f26;
                f34 = f25;
                f35 = f24;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: st1.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC32985f.m104133e(f27, f28, j14, f35, f34, f29, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 3072;
        f24 = f15;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                f25 = f16;
                if (c28655q.m87147d(f25)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                f26 = f17;
            } else {
                f26 = f17;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87147d(f26)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
            }
            if ((i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i27 != 0) {
                        f18 = 15;
                    }
                    if (i28 != 0) {
                        f19 = 1.0f;
                    }
                    if ((i14 & 4) != 0) {
                        white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                        i15 &= -897;
                    } else {
                        white20 = j13;
                    }
                    if (i16 != 0) {
                        f24 = 3.0f;
                    }
                    if (i18 != 0) {
                        f36 = 2.0f;
                    } else {
                        f36 = f25;
                    }
                    if (i24 != 0) {
                        f37 = f36;
                        f39 = 2.5f;
                        f38 = f19;
                    } else {
                        f37 = f36;
                        f38 = f19;
                        f39 = f26;
                    }
                } else {
                    if (i27 != 0) {
                        f18 = 15;
                    }
                    if (i28 != 0) {
                        f19 = 1.0f;
                    }
                    if ((i14 & 4) != 0) {
                        white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                        i15 &= -897;
                    } else {
                        white20 = j13;
                    }
                    if (i16 != 0) {
                        f24 = 3.0f;
                    }
                    if (i18 != 0) {
                        f36 = 2.0f;
                    } else {
                        f36 = f25;
                    }
                    if (i24 != 0) {
                        f37 = f36;
                        f39 = 2.5f;
                        f38 = f19;
                    } else {
                        f37 = f36;
                        f38 = f19;
                        f39 = f26;
                    }
                }
                f43 = f24;
                c28655q.m87175r();
                C2314t c2314t8 = C2314t.f9131w;
                Modifier modifierM3407d15 = AbstractC1102d.m3407d(1.0f, c2314t8);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3407d15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f18);
                Modifier modifierM3407d16 = AbstractC1102d.m3407d(1.0f, c2314t8);
                if ((57344 & i15) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((458752 & i15) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z113 = z13 | z14;
                if ((i15 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87147d = z113 | z15 | c28655q.m87147d(fMo743q0) | ((((i15 & 896) ^ 384) <= 256 && c28655q.m87151f(white20)) || (i15 & 384) == 256) | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (zM87147d) {
                    j15 = white20;
                    objM87133R = new Function1() { // from class: st1.d
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    j15 = white20;
                    objM87133R = new Function1() { // from class: st1.d
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierM3407d16, (Function1) objM87133R, c28655q, 6);
                c28655q.m87173q(true);
                f27 = f18;
                f34 = f37;
                f29 = f39;
                f35 = f43;
                j14 = j15;
                f28 = f38;
            } else {
                c28655q.m87138X();
                f27 = f18;
                f28 = f19;
                j14 = j13;
                f29 = f26;
                f34 = f25;
                f35 = f24;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: st1.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC32985f.m104133e(f27, f28, j14, f35, f34, f29, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 24576;
        f25 = f16;
        i24 = i14 & 32;
        if (i24 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            f26 = f17;
        } else {
            f26 = f17;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87147d(f26)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
        }
        if ((i15 & 74899) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i27 != 0) {
                    f18 = 15;
                }
                if (i28 != 0) {
                    f19 = 1.0f;
                }
                if ((i14 & 4) != 0) {
                    white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                    i15 &= -897;
                } else {
                    white20 = j13;
                }
                if (i16 != 0) {
                    f24 = 3.0f;
                }
                if (i18 != 0) {
                    f36 = 2.0f;
                } else {
                    f36 = f25;
                }
                if (i24 != 0) {
                    f37 = f36;
                    f39 = 2.5f;
                    f38 = f19;
                } else {
                    f37 = f36;
                    f38 = f19;
                    f39 = f26;
                }
            } else {
                if (i27 != 0) {
                    f18 = 15;
                }
                if (i28 != 0) {
                    f19 = 1.0f;
                }
                if ((i14 & 4) != 0) {
                    white20 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20();
                    i15 &= -897;
                } else {
                    white20 = j13;
                }
                if (i16 != 0) {
                    f24 = 3.0f;
                }
                if (i18 != 0) {
                    f36 = 2.0f;
                } else {
                    f36 = f25;
                }
                if (i24 != 0) {
                    f37 = f36;
                    f39 = 2.5f;
                    f38 = f19;
                } else {
                    f37 = f36;
                    f38 = f19;
                    f39 = f26;
                }
            }
            f43 = f24;
            c28655q.m87175r();
            C2314t c2314t9 = C2314t.f9131w;
            Modifier modifierM3407d17 = AbstractC1102d.m3407d(1.0f, c2314t9);
            InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3407d17);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d9);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
            fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f18);
            Modifier modifierM3407d18 = AbstractC1102d.m3407d(1.0f, c2314t9);
            if ((57344 & i15) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((458752 & i15) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z114 = z13 | z14;
            if ((i15 & 7168) == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87147d = z114 | z15 | c28655q.m87147d(fMo743q0) | ((((i15 & 896) ^ 384) <= 256 && c28655q.m87151f(white20)) || (i15 & 384) == 256) | ((i15 & 112) == 32);
            objM87133R = c28655q.m87133R();
            if (zM87147d) {
                j15 = white20;
                objM87133R = new Function1() { // from class: st1.d
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(objM87133R);
            } else {
                j15 = white20;
                objM87133R = new Function1() { // from class: st1.d
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC32985f.m104132d(f37, f39, f43, fMo743q0, j15, f38, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3407d18, (Function1) objM87133R, c28655q, 6);
            c28655q.m87173q(true);
            f27 = f18;
            f34 = f37;
            f29 = f39;
            f35 = f43;
            j14 = j15;
            f28 = f38;
        } else {
            c28655q.m87138X();
            f27 = f18;
            f28 = f19;
            j14 = j13;
            f29 = f26;
            f34 = f25;
            f35 = f24;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: st1.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC32985f.m104133e(f27, f28, j14, f35, f34, f29, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m104132d(float f13, float f14, float f15, float f16, long j7, float f17, InterfaceC22131e Canvas) {
        char c3;
        int i13;
        long j13;
        int i14;
        int i15;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        char c7 = ' ';
        long j14 = 4294967295L;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) / f13)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)) / f14)) & 4294967295L);
        float fSqrt = ((float) Math.sqrt((Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)) * Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L))) + (Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) * Float.intBitsToFloat((int) (Canvas.mo731d() >> 32))))) / f15;
        int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)) / f16);
        int iIntBitsToFloat2 = (int) (Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) / f16);
        if (iIntBitsToFloat >= 0) {
            int i16 = 0;
            while (true) {
                if (iIntBitsToFloat2 >= 0) {
                    int i17 = 0;
                    while (true) {
                        float f18 = i17 * f16;
                        float f19 = i16 * f16;
                        int i18 = i17 + 1;
                        c3 = c7;
                        C17914u0 c17914u0M51489g = C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(C17919x.f69636m)), jFloatToRawIntBits, fSqrt, 8);
                        j13 = j14;
                        int i19 = i17;
                        i13 = i16;
                        i14 = iIntBitsToFloat;
                        i15 = iIntBitsToFloat2;
                        Canvas.mo727R(c17914u0M51489g, (((long) Float.floatToRawIntBits(f19)) & j13) | (Float.floatToRawIntBits(f18) << c3), (((long) Float.floatToRawIntBits(i18 * f16)) << c3) | (((long) Float.floatToRawIntBits(f19)) & j13), f17, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? 1.0f : 0.0f);
                        Canvas.mo727R(c17914u0M51489g, (((long) Float.floatToRawIntBits(f18)) << c3) | (((long) Float.floatToRawIntBits(f19)) & j13), (Float.floatToRawIntBits(f18) << c3) | (((long) Float.floatToRawIntBits((i16 + 1) * f16)) & j13), f17, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? 1.0f : 0.0f);
                        if (i19 == i15) {
                            break;
                        }
                        i17 = i18;
                        iIntBitsToFloat = i14;
                        iIntBitsToFloat2 = i15;
                        i16 = i13;
                        c7 = c3;
                        j14 = j13;
                    }
                } else {
                    c3 = c7;
                    i13 = i16;
                    j13 = j14;
                    i14 = iIntBitsToFloat;
                    i15 = iIntBitsToFloat2;
                }
                if (i13 == i14) {
                    break;
                }
                i16 = i13 + 1;
                iIntBitsToFloat = i14;
                iIntBitsToFloat2 = i15;
                c7 = c3;
                j14 = j13;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m104133e(float f13, float f14, long j7, float f15, float f16, float f17, int i13, int i14, Composer composer, int i15) {
        m104131c(f13, f14, j7, f15, f16, f17, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
