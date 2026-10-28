package hy0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import gb1.AbstractC15680h;
import i93.C18279e;
import i93.InterfaceC18280f;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15019g6;
import p163g1.C15177w1;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p636y3.EnumC39181m;
import p702ch0.C4620g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;
import x81.C38070b;
import x81.C38072d;

/* JADX INFO: renamed from: hy0.k2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ak\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "", "value", "Li93/f;", "valueRange", "", "steps", "Lkotlin/Function0;", "Ll83/a0;", "onValueChangeFinished", "Lkotlin/Function1;", "onValueChange", "d", "(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17763k2 {
    /* JADX WARN: Code duplicated, block: B:102:0x0150  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x0143  */
    /* JADX INFO: renamed from: d */
    public static final void m50956d(Modifier modifier, boolean z4, final float f13, InterfaceC18280f interfaceC18280f, int i13, InterfaceC4339a interfaceC4339a, final Function1 onValueChange, Composer composer, final int i14, final int i15) {
        final Modifier modifier2;
        int i16;
        boolean z13;
        InterfaceC18280f c18279e;
        int i17;
        int i18;
        int i19;
        int i24;
        InterfaceC4339a interfaceC4339a2;
        int i25;
        boolean z14;
        final boolean z15;
        final InterfaceC18280f interfaceC18280f2;
        final int i26;
        final InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        boolean z16;
        InterfaceC18280f interfaceC18280f3;
        int i27;
        InterfaceC4339a interfaceC4339a4;
        int i28;
        int i29;
        int i34;
        AbstractC22676k.m65750j(onValueChange, "onValueChange");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-755710486);
        int i35 = i15 & 1;
        if (i35 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        int i36 = i15 & 2;
        if (i36 == 0) {
            if ((i14 & 48) == 0) {
                z13 = z4;
                i16 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            if ((i14 & 384) != 0) {
                if (c28655q.m87147d(f13)) {
                    i34 = 256;
                } else {
                    i34 = 128;
                }
                i16 |= i34;
            }
            if ((i14 & 3072) == 0) {
                if ((i15 & 8) == 0) {
                    c18279e = interfaceC18280f;
                    if (c28655q.m87153g(c18279e)) {
                        i29 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i16 |= i29;
                } else {
                    c18279e = interfaceC18280f;
                }
                i29 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i16 |= i29;
            } else {
                c18279e = interfaceC18280f;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    i18 = i13;
                    if (c28655q.m87149e(i18)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i19;
                }
                i24 = i15 & 32;
                if (i24 != 0) {
                    if ((196608 & i14) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i16 |= i25;
                    }
                    if ((1572864 & i14) == 0) {
                        if (c28655q.m87157i(onValueChange)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i16 |= i28;
                    }
                    if ((599187 & i16) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z14)) {
                        c28655q.m87140Z();
                        if ((i14 & 1) != 0 || c28655q.m87118C()) {
                            if (i35 != 0) {
                                modifier3 = C2314t.f9131w;
                            } else {
                                modifier3 = modifier2;
                            }
                            z16 = i36 == 0 ? z13 : true;
                            if ((i15 & 8) != 0) {
                                c18279e = new C18279e(0.0f, 1.0f);
                            }
                            if (i17 != 0) {
                                i18 = 0;
                            }
                            if (i24 != 0) {
                                interfaceC4339a4 = null;
                                interfaceC18280f3 = c18279e;
                                i27 = i18;
                                z15 = z16;
                                modifier2 = modifier3;
                            } else {
                                modifier2 = modifier3;
                                interfaceC18280f3 = c18279e;
                                i27 = i18;
                                interfaceC4339a4 = interfaceC4339a2;
                                z15 = z16;
                            }
                        } else {
                            c28655q.m87138X();
                            z15 = z13;
                            interfaceC18280f3 = c18279e;
                            i27 = i18;
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        c28655q.m87175r();
                        AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1916568918, c28655q, new C4620g(modifier2, z15, f13, onValueChange, interfaceC18280f3, i27, interfaceC4339a4)), c28655q, 56);
                        interfaceC18280f2 = interfaceC18280f3;
                        i26 = i27;
                        interfaceC4339a3 = interfaceC4339a4;
                    } else {
                        c28655q.m87138X();
                        z15 = z13;
                        interfaceC18280f2 = c18279e;
                        i26 = i18;
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.j2
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC17763k2.m50959g(modifier2, z15, f13, interfaceC18280f2, i26, interfaceC4339a3, onValueChange, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a2 = interfaceC4339a;
                if ((1572864 & i14) == 0) {
                    if (c28655q.m87157i(onValueChange)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i16 |= i28;
                }
                if ((599187 & i16) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i14 & 1) != 0) {
                        if (i35 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & 8) != 0) {
                            c18279e = new C18279e(0.0f, 1.0f);
                        }
                        if (i17 != 0) {
                            i18 = 0;
                        }
                        if (i24 != 0) {
                            interfaceC4339a4 = null;
                            interfaceC18280f3 = c18279e;
                            i27 = i18;
                            z15 = z16;
                            modifier2 = modifier3;
                        } else {
                            modifier2 = modifier3;
                            interfaceC18280f3 = c18279e;
                            i27 = i18;
                            interfaceC4339a4 = interfaceC4339a2;
                            z15 = z16;
                        }
                    } else {
                        if (i35 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & 8) != 0) {
                            c18279e = new C18279e(0.0f, 1.0f);
                        }
                        if (i17 != 0) {
                            i18 = 0;
                        }
                        if (i24 != 0) {
                            interfaceC4339a4 = null;
                            interfaceC18280f3 = c18279e;
                            i27 = i18;
                            z15 = z16;
                            modifier2 = modifier3;
                        } else {
                            modifier2 = modifier3;
                            interfaceC18280f3 = c18279e;
                            i27 = i18;
                            interfaceC4339a4 = interfaceC4339a2;
                            z15 = z16;
                        }
                    }
                    c28655q.m87175r();
                    AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1916568918, c28655q, new C4620g(modifier2, z15, f13, onValueChange, interfaceC18280f3, i27, interfaceC4339a4)), c28655q, 56);
                    interfaceC18280f2 = interfaceC18280f3;
                    i26 = i27;
                    interfaceC4339a3 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                    interfaceC18280f2 = c18279e;
                    i26 = i18;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.j2
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC17763k2.m50959g(modifier2, z15, f13, interfaceC18280f2, i26, interfaceC4339a3, onValueChange, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            i18 = i13;
            i24 = i15 & 32;
            if (i24 != 0) {
                if ((196608 & i14) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i25;
                }
                if ((1572864 & i14) == 0) {
                    if (c28655q.m87157i(onValueChange)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i16 |= i28;
                }
                if ((599187 & i16) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i14 & 1) != 0) {
                        if (i35 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & 8) != 0) {
                            c18279e = new C18279e(0.0f, 1.0f);
                        }
                        if (i17 != 0) {
                            i18 = 0;
                        }
                        if (i24 != 0) {
                            interfaceC4339a4 = null;
                            interfaceC18280f3 = c18279e;
                            i27 = i18;
                            z15 = z16;
                            modifier2 = modifier3;
                        } else {
                            modifier2 = modifier3;
                            interfaceC18280f3 = c18279e;
                            i27 = i18;
                            interfaceC4339a4 = interfaceC4339a2;
                            z15 = z16;
                        }
                    } else {
                        if (i35 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & 8) != 0) {
                            c18279e = new C18279e(0.0f, 1.0f);
                        }
                        if (i17 != 0) {
                            i18 = 0;
                        }
                        if (i24 != 0) {
                            interfaceC4339a4 = null;
                            interfaceC18280f3 = c18279e;
                            i27 = i18;
                            z15 = z16;
                            modifier2 = modifier3;
                        } else {
                            modifier2 = modifier3;
                            interfaceC18280f3 = c18279e;
                            i27 = i18;
                            interfaceC4339a4 = interfaceC4339a2;
                            z15 = z16;
                        }
                    }
                    c28655q.m87175r();
                    AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1916568918, c28655q, new C4620g(modifier2, z15, f13, onValueChange, interfaceC18280f3, i27, interfaceC4339a4)), c28655q, 56);
                    interfaceC18280f2 = interfaceC18280f3;
                    i26 = i27;
                    interfaceC4339a3 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                    interfaceC18280f2 = c18279e;
                    i26 = i18;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.j2
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC17763k2.m50959g(modifier2, z15, f13, interfaceC18280f2, i26, interfaceC4339a3, onValueChange, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a2 = interfaceC4339a;
            if ((1572864 & i14) == 0) {
                if (c28655q.m87157i(onValueChange)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i16 |= i28;
            }
            if ((599187 & i16) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i35 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i15 & 8) != 0) {
                        c18279e = new C18279e(0.0f, 1.0f);
                    }
                    if (i17 != 0) {
                        i18 = 0;
                    }
                    if (i24 != 0) {
                        interfaceC4339a4 = null;
                        interfaceC18280f3 = c18279e;
                        i27 = i18;
                        z15 = z16;
                        modifier2 = modifier3;
                    } else {
                        modifier2 = modifier3;
                        interfaceC18280f3 = c18279e;
                        i27 = i18;
                        interfaceC4339a4 = interfaceC4339a2;
                        z15 = z16;
                    }
                } else {
                    if (i35 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i15 & 8) != 0) {
                        c18279e = new C18279e(0.0f, 1.0f);
                    }
                    if (i17 != 0) {
                        i18 = 0;
                    }
                    if (i24 != 0) {
                        interfaceC4339a4 = null;
                        interfaceC18280f3 = c18279e;
                        i27 = i18;
                        z15 = z16;
                        modifier2 = modifier3;
                    } else {
                        modifier2 = modifier3;
                        interfaceC18280f3 = c18279e;
                        i27 = i18;
                        interfaceC4339a4 = interfaceC4339a2;
                        z15 = z16;
                    }
                }
                c28655q.m87175r();
                AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1916568918, c28655q, new C4620g(modifier2, z15, f13, onValueChange, interfaceC18280f3, i27, interfaceC4339a4)), c28655q, 56);
                interfaceC18280f2 = interfaceC18280f3;
                i26 = i27;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                z15 = z13;
                interfaceC18280f2 = c18279e;
                i26 = i18;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.j2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC17763k2.m50959g(modifier2, z15, f13, interfaceC18280f2, i26, interfaceC4339a3, onValueChange, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 48;
        z13 = z4;
        if ((i14 & 384) != 0) {
            if (c28655q.m87147d(f13)) {
                i34 = 256;
            } else {
                i34 = 128;
            }
            i16 |= i34;
        }
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                c18279e = interfaceC18280f;
                if (c28655q.m87153g(c18279e)) {
                    i29 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i16 |= i29;
            } else {
                c18279e = interfaceC18280f;
            }
            i29 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i16 |= i29;
        } else {
            c18279e = interfaceC18280f;
        }
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                i18 = i13;
                if (c28655q.m87149e(i18)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i19;
            }
            i24 = i15 & 32;
            if (i24 != 0) {
                if ((196608 & i14) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i25;
                }
                if ((1572864 & i14) == 0) {
                    if (c28655q.m87157i(onValueChange)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i16 |= i28;
                }
                if ((599187 & i16) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i14 & 1) != 0) {
                        if (i35 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & 8) != 0) {
                            c18279e = new C18279e(0.0f, 1.0f);
                        }
                        if (i17 != 0) {
                            i18 = 0;
                        }
                        if (i24 != 0) {
                            interfaceC4339a4 = null;
                            interfaceC18280f3 = c18279e;
                            i27 = i18;
                            z15 = z16;
                            modifier2 = modifier3;
                        } else {
                            modifier2 = modifier3;
                            interfaceC18280f3 = c18279e;
                            i27 = i18;
                            interfaceC4339a4 = interfaceC4339a2;
                            z15 = z16;
                        }
                    } else {
                        if (i35 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & 8) != 0) {
                            c18279e = new C18279e(0.0f, 1.0f);
                        }
                        if (i17 != 0) {
                            i18 = 0;
                        }
                        if (i24 != 0) {
                            interfaceC4339a4 = null;
                            interfaceC18280f3 = c18279e;
                            i27 = i18;
                            z15 = z16;
                            modifier2 = modifier3;
                        } else {
                            modifier2 = modifier3;
                            interfaceC18280f3 = c18279e;
                            i27 = i18;
                            interfaceC4339a4 = interfaceC4339a2;
                            z15 = z16;
                        }
                    }
                    c28655q.m87175r();
                    AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1916568918, c28655q, new C4620g(modifier2, z15, f13, onValueChange, interfaceC18280f3, i27, interfaceC4339a4)), c28655q, 56);
                    interfaceC18280f2 = interfaceC18280f3;
                    i26 = i27;
                    interfaceC4339a3 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                    interfaceC18280f2 = c18279e;
                    i26 = i18;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.j2
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC17763k2.m50959g(modifier2, z15, f13, interfaceC18280f2, i26, interfaceC4339a3, onValueChange, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a2 = interfaceC4339a;
            if ((1572864 & i14) == 0) {
                if (c28655q.m87157i(onValueChange)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i16 |= i28;
            }
            if ((599187 & i16) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i35 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i15 & 8) != 0) {
                        c18279e = new C18279e(0.0f, 1.0f);
                    }
                    if (i17 != 0) {
                        i18 = 0;
                    }
                    if (i24 != 0) {
                        interfaceC4339a4 = null;
                        interfaceC18280f3 = c18279e;
                        i27 = i18;
                        z15 = z16;
                        modifier2 = modifier3;
                    } else {
                        modifier2 = modifier3;
                        interfaceC18280f3 = c18279e;
                        i27 = i18;
                        interfaceC4339a4 = interfaceC4339a2;
                        z15 = z16;
                    }
                } else {
                    if (i35 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i15 & 8) != 0) {
                        c18279e = new C18279e(0.0f, 1.0f);
                    }
                    if (i17 != 0) {
                        i18 = 0;
                    }
                    if (i24 != 0) {
                        interfaceC4339a4 = null;
                        interfaceC18280f3 = c18279e;
                        i27 = i18;
                        z15 = z16;
                        modifier2 = modifier3;
                    } else {
                        modifier2 = modifier3;
                        interfaceC18280f3 = c18279e;
                        i27 = i18;
                        interfaceC4339a4 = interfaceC4339a2;
                        z15 = z16;
                    }
                }
                c28655q.m87175r();
                AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1916568918, c28655q, new C4620g(modifier2, z15, f13, onValueChange, interfaceC18280f3, i27, interfaceC4339a4)), c28655q, 56);
                interfaceC18280f2 = interfaceC18280f3;
                i26 = i27;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                z15 = z13;
                interfaceC18280f2 = c18279e;
                i26 = i18;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.j2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC17763k2.m50959g(modifier2, z15, f13, interfaceC18280f2, i26, interfaceC4339a3, onValueChange, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        i18 = i13;
        i24 = i15 & 32;
        if (i24 != 0) {
            if ((196608 & i14) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i25;
            }
            if ((1572864 & i14) == 0) {
                if (c28655q.m87157i(onValueChange)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i16 |= i28;
            }
            if ((599187 & i16) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i35 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i15 & 8) != 0) {
                        c18279e = new C18279e(0.0f, 1.0f);
                    }
                    if (i17 != 0) {
                        i18 = 0;
                    }
                    if (i24 != 0) {
                        interfaceC4339a4 = null;
                        interfaceC18280f3 = c18279e;
                        i27 = i18;
                        z15 = z16;
                        modifier2 = modifier3;
                    } else {
                        modifier2 = modifier3;
                        interfaceC18280f3 = c18279e;
                        i27 = i18;
                        interfaceC4339a4 = interfaceC4339a2;
                        z15 = z16;
                    }
                } else {
                    if (i35 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i15 & 8) != 0) {
                        c18279e = new C18279e(0.0f, 1.0f);
                    }
                    if (i17 != 0) {
                        i18 = 0;
                    }
                    if (i24 != 0) {
                        interfaceC4339a4 = null;
                        interfaceC18280f3 = c18279e;
                        i27 = i18;
                        z15 = z16;
                        modifier2 = modifier3;
                    } else {
                        modifier2 = modifier3;
                        interfaceC18280f3 = c18279e;
                        i27 = i18;
                        interfaceC4339a4 = interfaceC4339a2;
                        z15 = z16;
                    }
                }
                c28655q.m87175r();
                AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1916568918, c28655q, new C4620g(modifier2, z15, f13, onValueChange, interfaceC18280f3, i27, interfaceC4339a4)), c28655q, 56);
                interfaceC18280f2 = interfaceC18280f3;
                i26 = i27;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                z15 = z13;
                interfaceC18280f2 = c18279e;
                i26 = i18;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.j2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC17763k2.m50959g(modifier2, z15, f13, interfaceC18280f2, i26, interfaceC4339a3, onValueChange, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a2 = interfaceC4339a;
        if ((1572864 & i14) == 0) {
            if (c28655q.m87157i(onValueChange)) {
                i28 = 1048576;
            } else {
                i28 = 524288;
            }
            i16 |= i28;
        }
        if ((599187 & i16) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            c28655q.m87140Z();
            if ((i14 & 1) != 0) {
                if (i35 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i36 == 0) {
                }
                if ((i15 & 8) != 0) {
                    c18279e = new C18279e(0.0f, 1.0f);
                }
                if (i17 != 0) {
                    i18 = 0;
                }
                if (i24 != 0) {
                    interfaceC4339a4 = null;
                    interfaceC18280f3 = c18279e;
                    i27 = i18;
                    z15 = z16;
                    modifier2 = modifier3;
                } else {
                    modifier2 = modifier3;
                    interfaceC18280f3 = c18279e;
                    i27 = i18;
                    interfaceC4339a4 = interfaceC4339a2;
                    z15 = z16;
                }
            } else {
                if (i35 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i36 == 0) {
                }
                if ((i15 & 8) != 0) {
                    c18279e = new C18279e(0.0f, 1.0f);
                }
                if (i17 != 0) {
                    i18 = 0;
                }
                if (i24 != 0) {
                    interfaceC4339a4 = null;
                    interfaceC18280f3 = c18279e;
                    i27 = i18;
                    z15 = z16;
                    modifier2 = modifier3;
                } else {
                    modifier2 = modifier3;
                    interfaceC18280f3 = c18279e;
                    i27 = i18;
                    interfaceC4339a4 = interfaceC4339a2;
                    z15 = z16;
                }
            }
            c28655q.m87175r();
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1916568918, c28655q, new C4620g(modifier2, z15, f13, onValueChange, interfaceC18280f3, i27, interfaceC4339a4)), c28655q, 56);
            interfaceC18280f2 = interfaceC18280f3;
            i26 = i27;
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            z15 = z13;
            interfaceC18280f2 = c18279e;
            i26 = i18;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.j2
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC17763k2.m50959g(modifier2, z15, f13, interfaceC18280f2, i26, interfaceC4339a3, onValueChange, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m50957e(Modifier modifier, boolean z4, float f13, Function1 function1, InterfaceC18280f interfaceC18280f, int i13, InterfaceC4339a interfaceC4339a, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC15680h.m44112a(modifier, z4), "whoop slider");
            C38072d c38072d = C38072d.f163053a;
            long jM125430y = c38072d.m121949b(c28655q, 6).getBrandWhite();
            C38070b c38070b = C38070b.f163049a;
            long jM125315a = c38070b.m121943a(c28655q, 6).getAccent();
            long jM125374Y0 = c38072d.m121949b(c28655q, 6).getWhite30();
            long jM125430y2 = c38072d.m121949b(c28655q, 6).getBrandWhite();
            long jM125315a2 = c38070b.m121943a(c28655q, 6).getAccent();
            long jM125374Y1 = c38072d.m121949b(c28655q, 6).getWhite30();
            long j7 = C17919x.f69636m;
            C15177w1 c15177w1M101110v = AbstractC32411b.m101110v(jM125430y, jM125430y2, jM125315a, jM125374Y0, jM125315a2, jM125374Y1, j7, j7, j7, j7, c28655q, 920125440, 0);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C17789t0(function1, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15019g6.m43120b(f13, (Function1) objM87133R, modifierM3599a, z4, interfaceC18280f, i13, interfaceC4339a, c15177w1M101110v, c28655q, 0, 128);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m50958f(Function1 function1, float f13) {
        function1.invoke(Float.valueOf(f13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m50959g(Modifier modifier, boolean z4, float f13, InterfaceC18280f interfaceC18280f, int i13, InterfaceC4339a interfaceC4339a, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m50956d(modifier, z4, f13, interfaceC18280f, i13, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
