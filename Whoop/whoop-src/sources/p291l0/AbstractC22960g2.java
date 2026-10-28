package p291l0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2165f;
import c93.InterfaceC4351m;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import kf0.C22437l;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p026b2.InterfaceC2301g;
import p043c4.C3955e;
import p163g1.C15076m0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.C39073a1;
import p635y2.InterfaceC39127r0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l0.g2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22960g2 {

    /* JADX INFO: renamed from: a */
    public static final C22437l f90607a = new C22437l(3);

    /* JADX INFO: renamed from: b */
    public static final int f90608b = 9;

    /* JADX INFO: renamed from: c */
    public static final int f90609c = 6;

    /* JADX INFO: renamed from: d */
    public static final int f90610d = 10;

    /* JADX INFO: renamed from: e */
    public static final int f90611e = 5;

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x011e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0132  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m66729a(Modifier modifier, InterfaceC22965i interfaceC22965i, InterfaceC22974l interfaceC22974l, InterfaceC2301g interfaceC2301g, int i13, int i14, final Function3 function3, Composer composer, final int i15, final int i16) {
        Modifier modifier2;
        int i17;
        InterfaceC22965i interfaceC22965i2;
        int i18;
        InterfaceC22974l interfaceC22974l2;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z4;
        C28655q c28655q;
        final InterfaceC2301g interfaceC2301g2;
        final int i29;
        final Modifier modifier3;
        final InterfaceC22965i interfaceC22965i3;
        final InterfaceC22974l interfaceC22974l3;
        final int i34;
        C28677v1 c28677v1M87180u;
        int i35;
        Modifier modifier4;
        InterfaceC22965i interfaceC22965i4;
        int i36;
        InterfaceC22974l interfaceC22974l4;
        InterfaceC2301g interfaceC2301g3;
        int i37;
        int i38;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1303174015);
        int i39 = i16 & 1;
        if (i39 != 0) {
            i17 = i15 | 6;
            modifier2 = modifier;
        } else if ((i15 & 6) == 0) {
            modifier2 = modifier;
            i17 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i15;
        } else {
            modifier2 = modifier;
            i17 = i15;
        }
        int i44 = i16 & 2;
        if (i44 == 0) {
            if ((i15 & 48) == 0) {
                interfaceC22965i2 = interfaceC22965i;
                i17 |= c28655q2.m87153g(interfaceC22965i2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & 384) == 0) {
                    interfaceC22974l2 = interfaceC22974l;
                    if (c28655q2.m87153g(interfaceC22974l2)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i24 = i16 & 8;
                if (i24 != 0) {
                    if ((i15 & 3072) == 0) {
                        if (c28655q2.m87153g(interfaceC2301g)) {
                            i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i17 |= i25;
                    }
                    i26 = i16 & 16;
                    if (i26 != 0) {
                        if ((i15 & 24576) == 0) {
                            if (c28655q2.m87149e(i13)) {
                                i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i27 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i17 |= i27;
                        }
                        i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        if ((i15 & 1572864) == 0) {
                            if (c28655q2.m87157i(function3)) {
                                i38 = 1048576;
                            } else {
                                i38 = 524288;
                            }
                            i28 |= i38;
                        }
                        if ((599187 & i28) != 599186) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i28 & 1, z4)) {
                            if (i39 != 0) {
                                modifier4 = C2314t.f9131w;
                                i35 = i24;
                            } else {
                                i35 = i24;
                                modifier4 = modifier2;
                            }
                            if (i44 != 0) {
                                interfaceC22965i4 = AbstractC22977m.f90650a;
                            } else {
                                interfaceC22965i4 = interfaceC22965i2;
                            }
                            if (i18 != 0) {
                                interfaceC22974l4 = AbstractC22977m.f90652c;
                                i36 = i26;
                            } else {
                                i36 = i26;
                                interfaceC22974l4 = interfaceC22974l2;
                            }
                            if (i35 != 0) {
                                interfaceC2301g3 = C2299e.f9107J;
                            } else {
                                interfaceC2301g3 = interfaceC2301g;
                            }
                            if (i36 != 0) {
                                i37 = Integer.MAX_VALUE;
                            } else {
                                i37 = i13;
                            }
                            c28655q = c28655q2;
                            m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                            i29 = Integer.MAX_VALUE;
                            modifier3 = modifier4;
                            interfaceC22965i3 = interfaceC22965i4;
                            interfaceC22974l3 = interfaceC22974l4;
                            interfaceC2301g2 = interfaceC2301g3;
                            i34 = i37;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            interfaceC2301g2 = interfaceC2301g;
                            i29 = i14;
                            modifier3 = modifier2;
                            interfaceC22965i3 = interfaceC22965i2;
                            interfaceC22974l3 = interfaceC22974l2;
                            i34 = i13;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                                    return C23454a0.f92919a;
                                }
                            };
                        }
                    }
                    i17 |= 24576;
                    i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    if ((i15 & 1572864) == 0) {
                        if (c28655q2.m87157i(function3)) {
                            i38 = 1048576;
                        } else {
                            i38 = 524288;
                        }
                        i28 |= i38;
                    }
                    if ((599187 & i28) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i28 & 1, z4)) {
                        if (i39 != 0) {
                            modifier4 = C2314t.f9131w;
                            i35 = i24;
                        } else {
                            i35 = i24;
                            modifier4 = modifier2;
                        }
                        if (i44 != 0) {
                            interfaceC22965i4 = AbstractC22977m.f90650a;
                        } else {
                            interfaceC22965i4 = interfaceC22965i2;
                        }
                        if (i18 != 0) {
                            interfaceC22974l4 = AbstractC22977m.f90652c;
                            i36 = i26;
                        } else {
                            i36 = i26;
                            interfaceC22974l4 = interfaceC22974l2;
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9107J;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if (i36 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i13;
                        }
                        c28655q = c28655q2;
                        m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                        i29 = Integer.MAX_VALUE;
                        modifier3 = modifier4;
                        interfaceC22965i3 = interfaceC22965i4;
                        interfaceC22974l3 = interfaceC22974l4;
                        interfaceC2301g2 = interfaceC2301g3;
                        i34 = i37;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        interfaceC2301g2 = interfaceC2301g;
                        i29 = i14;
                        modifier3 = modifier2;
                        interfaceC22965i3 = interfaceC22965i2;
                        interfaceC22974l3 = interfaceC22974l2;
                        i34 = i13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i17 |= 3072;
                i26 = i16 & 16;
                if (i26 != 0) {
                    if ((i15 & 24576) == 0) {
                        if (c28655q2.m87149e(i13)) {
                            i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i27 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i17 |= i27;
                    }
                    i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    if ((i15 & 1572864) == 0) {
                        if (c28655q2.m87157i(function3)) {
                            i38 = 1048576;
                        } else {
                            i38 = 524288;
                        }
                        i28 |= i38;
                    }
                    if ((599187 & i28) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i28 & 1, z4)) {
                        if (i39 != 0) {
                            modifier4 = C2314t.f9131w;
                            i35 = i24;
                        } else {
                            i35 = i24;
                            modifier4 = modifier2;
                        }
                        if (i44 != 0) {
                            interfaceC22965i4 = AbstractC22977m.f90650a;
                        } else {
                            interfaceC22965i4 = interfaceC22965i2;
                        }
                        if (i18 != 0) {
                            interfaceC22974l4 = AbstractC22977m.f90652c;
                            i36 = i26;
                        } else {
                            i36 = i26;
                            interfaceC22974l4 = interfaceC22974l2;
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9107J;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if (i36 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i13;
                        }
                        c28655q = c28655q2;
                        m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                        i29 = Integer.MAX_VALUE;
                        modifier3 = modifier4;
                        interfaceC22965i3 = interfaceC22965i4;
                        interfaceC22974l3 = interfaceC22974l4;
                        interfaceC2301g2 = interfaceC2301g3;
                        i34 = i37;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        interfaceC2301g2 = interfaceC2301g;
                        i29 = i14;
                        modifier3 = modifier2;
                        interfaceC22965i3 = interfaceC22965i2;
                        interfaceC22974l3 = interfaceC22974l2;
                        i34 = i13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i17 |= 24576;
                i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if ((i15 & 1572864) == 0) {
                    if (c28655q2.m87157i(function3)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i28 |= i38;
                }
                if ((599187 & i28) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i28 & 1, z4)) {
                    if (i39 != 0) {
                        modifier4 = C2314t.f9131w;
                        i35 = i24;
                    } else {
                        i35 = i24;
                        modifier4 = modifier2;
                    }
                    if (i44 != 0) {
                        interfaceC22965i4 = AbstractC22977m.f90650a;
                    } else {
                        interfaceC22965i4 = interfaceC22965i2;
                    }
                    if (i18 != 0) {
                        interfaceC22974l4 = AbstractC22977m.f90652c;
                        i36 = i26;
                    } else {
                        i36 = i26;
                        interfaceC22974l4 = interfaceC22974l2;
                    }
                    if (i35 != 0) {
                        interfaceC2301g3 = C2299e.f9107J;
                    } else {
                        interfaceC2301g3 = interfaceC2301g;
                    }
                    if (i36 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i13;
                    }
                    c28655q = c28655q2;
                    m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                    i29 = Integer.MAX_VALUE;
                    modifier3 = modifier4;
                    interfaceC22965i3 = interfaceC22965i4;
                    interfaceC22974l3 = interfaceC22974l4;
                    interfaceC2301g2 = interfaceC2301g3;
                    i34 = i37;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC2301g2 = interfaceC2301g;
                    i29 = i14;
                    modifier3 = modifier2;
                    interfaceC22965i3 = interfaceC22965i2;
                    interfaceC22974l3 = interfaceC22974l2;
                    i34 = i13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i17 |= 384;
            interfaceC22974l2 = interfaceC22974l;
            i24 = i16 & 8;
            if (i24 != 0) {
                if ((i15 & 3072) == 0) {
                    if (c28655q2.m87153g(interfaceC2301g)) {
                        i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i17 |= i25;
                }
                i26 = i16 & 16;
                if (i26 != 0) {
                    if ((i15 & 24576) == 0) {
                        if (c28655q2.m87149e(i13)) {
                            i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i27 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i17 |= i27;
                    }
                    i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    if ((i15 & 1572864) == 0) {
                        if (c28655q2.m87157i(function3)) {
                            i38 = 1048576;
                        } else {
                            i38 = 524288;
                        }
                        i28 |= i38;
                    }
                    if ((599187 & i28) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i28 & 1, z4)) {
                        if (i39 != 0) {
                            modifier4 = C2314t.f9131w;
                            i35 = i24;
                        } else {
                            i35 = i24;
                            modifier4 = modifier2;
                        }
                        if (i44 != 0) {
                            interfaceC22965i4 = AbstractC22977m.f90650a;
                        } else {
                            interfaceC22965i4 = interfaceC22965i2;
                        }
                        if (i18 != 0) {
                            interfaceC22974l4 = AbstractC22977m.f90652c;
                            i36 = i26;
                        } else {
                            i36 = i26;
                            interfaceC22974l4 = interfaceC22974l2;
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9107J;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if (i36 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i13;
                        }
                        c28655q = c28655q2;
                        m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                        i29 = Integer.MAX_VALUE;
                        modifier3 = modifier4;
                        interfaceC22965i3 = interfaceC22965i4;
                        interfaceC22974l3 = interfaceC22974l4;
                        interfaceC2301g2 = interfaceC2301g3;
                        i34 = i37;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        interfaceC2301g2 = interfaceC2301g;
                        i29 = i14;
                        modifier3 = modifier2;
                        interfaceC22965i3 = interfaceC22965i2;
                        interfaceC22974l3 = interfaceC22974l2;
                        i34 = i13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i17 |= 24576;
                i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if ((i15 & 1572864) == 0) {
                    if (c28655q2.m87157i(function3)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i28 |= i38;
                }
                if ((599187 & i28) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i28 & 1, z4)) {
                    if (i39 != 0) {
                        modifier4 = C2314t.f9131w;
                        i35 = i24;
                    } else {
                        i35 = i24;
                        modifier4 = modifier2;
                    }
                    if (i44 != 0) {
                        interfaceC22965i4 = AbstractC22977m.f90650a;
                    } else {
                        interfaceC22965i4 = interfaceC22965i2;
                    }
                    if (i18 != 0) {
                        interfaceC22974l4 = AbstractC22977m.f90652c;
                        i36 = i26;
                    } else {
                        i36 = i26;
                        interfaceC22974l4 = interfaceC22974l2;
                    }
                    if (i35 != 0) {
                        interfaceC2301g3 = C2299e.f9107J;
                    } else {
                        interfaceC2301g3 = interfaceC2301g;
                    }
                    if (i36 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i13;
                    }
                    c28655q = c28655q2;
                    m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                    i29 = Integer.MAX_VALUE;
                    modifier3 = modifier4;
                    interfaceC22965i3 = interfaceC22965i4;
                    interfaceC22974l3 = interfaceC22974l4;
                    interfaceC2301g2 = interfaceC2301g3;
                    i34 = i37;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC2301g2 = interfaceC2301g;
                    i29 = i14;
                    modifier3 = modifier2;
                    interfaceC22965i3 = interfaceC22965i2;
                    interfaceC22974l3 = interfaceC22974l2;
                    i34 = i13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i17 |= 3072;
            i26 = i16 & 16;
            if (i26 != 0) {
                if ((i15 & 24576) == 0) {
                    if (c28655q2.m87149e(i13)) {
                        i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i27 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i17 |= i27;
                }
                i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if ((i15 & 1572864) == 0) {
                    if (c28655q2.m87157i(function3)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i28 |= i38;
                }
                if ((599187 & i28) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i28 & 1, z4)) {
                    if (i39 != 0) {
                        modifier4 = C2314t.f9131w;
                        i35 = i24;
                    } else {
                        i35 = i24;
                        modifier4 = modifier2;
                    }
                    if (i44 != 0) {
                        interfaceC22965i4 = AbstractC22977m.f90650a;
                    } else {
                        interfaceC22965i4 = interfaceC22965i2;
                    }
                    if (i18 != 0) {
                        interfaceC22974l4 = AbstractC22977m.f90652c;
                        i36 = i26;
                    } else {
                        i36 = i26;
                        interfaceC22974l4 = interfaceC22974l2;
                    }
                    if (i35 != 0) {
                        interfaceC2301g3 = C2299e.f9107J;
                    } else {
                        interfaceC2301g3 = interfaceC2301g;
                    }
                    if (i36 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i13;
                    }
                    c28655q = c28655q2;
                    m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                    i29 = Integer.MAX_VALUE;
                    modifier3 = modifier4;
                    interfaceC22965i3 = interfaceC22965i4;
                    interfaceC22974l3 = interfaceC22974l4;
                    interfaceC2301g2 = interfaceC2301g3;
                    i34 = i37;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC2301g2 = interfaceC2301g;
                    i29 = i14;
                    modifier3 = modifier2;
                    interfaceC22965i3 = interfaceC22965i2;
                    interfaceC22974l3 = interfaceC22974l2;
                    i34 = i13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i17 |= 24576;
            i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((i15 & 1572864) == 0) {
                if (c28655q2.m87157i(function3)) {
                    i38 = 1048576;
                } else {
                    i38 = 524288;
                }
                i28 |= i38;
            }
            if ((599187 & i28) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i28 & 1, z4)) {
                if (i39 != 0) {
                    modifier4 = C2314t.f9131w;
                    i35 = i24;
                } else {
                    i35 = i24;
                    modifier4 = modifier2;
                }
                if (i44 != 0) {
                    interfaceC22965i4 = AbstractC22977m.f90650a;
                } else {
                    interfaceC22965i4 = interfaceC22965i2;
                }
                if (i18 != 0) {
                    interfaceC22974l4 = AbstractC22977m.f90652c;
                    i36 = i26;
                } else {
                    i36 = i26;
                    interfaceC22974l4 = interfaceC22974l2;
                }
                if (i35 != 0) {
                    interfaceC2301g3 = C2299e.f9107J;
                } else {
                    interfaceC2301g3 = interfaceC2301g;
                }
                if (i36 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i13;
                }
                c28655q = c28655q2;
                m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                i29 = Integer.MAX_VALUE;
                modifier3 = modifier4;
                interfaceC22965i3 = interfaceC22965i4;
                interfaceC22974l3 = interfaceC22974l4;
                interfaceC2301g2 = interfaceC2301g3;
                i34 = i37;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC2301g2 = interfaceC2301g;
                i29 = i14;
                modifier3 = modifier2;
                interfaceC22965i3 = interfaceC22965i2;
                interfaceC22974l3 = interfaceC22974l2;
                i34 = i13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i17 |= 48;
        interfaceC22965i2 = interfaceC22965i;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & 384) == 0) {
                interfaceC22974l2 = interfaceC22974l;
                if (c28655q2.m87153g(interfaceC22974l2)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i24 = i16 & 8;
            if (i24 != 0) {
                if ((i15 & 3072) == 0) {
                    if (c28655q2.m87153g(interfaceC2301g)) {
                        i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i17 |= i25;
                }
                i26 = i16 & 16;
                if (i26 != 0) {
                    if ((i15 & 24576) == 0) {
                        if (c28655q2.m87149e(i13)) {
                            i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i27 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i17 |= i27;
                    }
                    i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    if ((i15 & 1572864) == 0) {
                        if (c28655q2.m87157i(function3)) {
                            i38 = 1048576;
                        } else {
                            i38 = 524288;
                        }
                        i28 |= i38;
                    }
                    if ((599187 & i28) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i28 & 1, z4)) {
                        if (i39 != 0) {
                            modifier4 = C2314t.f9131w;
                            i35 = i24;
                        } else {
                            i35 = i24;
                            modifier4 = modifier2;
                        }
                        if (i44 != 0) {
                            interfaceC22965i4 = AbstractC22977m.f90650a;
                        } else {
                            interfaceC22965i4 = interfaceC22965i2;
                        }
                        if (i18 != 0) {
                            interfaceC22974l4 = AbstractC22977m.f90652c;
                            i36 = i26;
                        } else {
                            i36 = i26;
                            interfaceC22974l4 = interfaceC22974l2;
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9107J;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if (i36 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i13;
                        }
                        c28655q = c28655q2;
                        m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                        i29 = Integer.MAX_VALUE;
                        modifier3 = modifier4;
                        interfaceC22965i3 = interfaceC22965i4;
                        interfaceC22974l3 = interfaceC22974l4;
                        interfaceC2301g2 = interfaceC2301g3;
                        i34 = i37;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        interfaceC2301g2 = interfaceC2301g;
                        i29 = i14;
                        modifier3 = modifier2;
                        interfaceC22965i3 = interfaceC22965i2;
                        interfaceC22974l3 = interfaceC22974l2;
                        i34 = i13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i17 |= 24576;
                i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if ((i15 & 1572864) == 0) {
                    if (c28655q2.m87157i(function3)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i28 |= i38;
                }
                if ((599187 & i28) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i28 & 1, z4)) {
                    if (i39 != 0) {
                        modifier4 = C2314t.f9131w;
                        i35 = i24;
                    } else {
                        i35 = i24;
                        modifier4 = modifier2;
                    }
                    if (i44 != 0) {
                        interfaceC22965i4 = AbstractC22977m.f90650a;
                    } else {
                        interfaceC22965i4 = interfaceC22965i2;
                    }
                    if (i18 != 0) {
                        interfaceC22974l4 = AbstractC22977m.f90652c;
                        i36 = i26;
                    } else {
                        i36 = i26;
                        interfaceC22974l4 = interfaceC22974l2;
                    }
                    if (i35 != 0) {
                        interfaceC2301g3 = C2299e.f9107J;
                    } else {
                        interfaceC2301g3 = interfaceC2301g;
                    }
                    if (i36 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i13;
                    }
                    c28655q = c28655q2;
                    m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                    i29 = Integer.MAX_VALUE;
                    modifier3 = modifier4;
                    interfaceC22965i3 = interfaceC22965i4;
                    interfaceC22974l3 = interfaceC22974l4;
                    interfaceC2301g2 = interfaceC2301g3;
                    i34 = i37;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC2301g2 = interfaceC2301g;
                    i29 = i14;
                    modifier3 = modifier2;
                    interfaceC22965i3 = interfaceC22965i2;
                    interfaceC22974l3 = interfaceC22974l2;
                    i34 = i13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i17 |= 3072;
            i26 = i16 & 16;
            if (i26 != 0) {
                if ((i15 & 24576) == 0) {
                    if (c28655q2.m87149e(i13)) {
                        i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i27 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i17 |= i27;
                }
                i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if ((i15 & 1572864) == 0) {
                    if (c28655q2.m87157i(function3)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i28 |= i38;
                }
                if ((599187 & i28) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i28 & 1, z4)) {
                    if (i39 != 0) {
                        modifier4 = C2314t.f9131w;
                        i35 = i24;
                    } else {
                        i35 = i24;
                        modifier4 = modifier2;
                    }
                    if (i44 != 0) {
                        interfaceC22965i4 = AbstractC22977m.f90650a;
                    } else {
                        interfaceC22965i4 = interfaceC22965i2;
                    }
                    if (i18 != 0) {
                        interfaceC22974l4 = AbstractC22977m.f90652c;
                        i36 = i26;
                    } else {
                        i36 = i26;
                        interfaceC22974l4 = interfaceC22974l2;
                    }
                    if (i35 != 0) {
                        interfaceC2301g3 = C2299e.f9107J;
                    } else {
                        interfaceC2301g3 = interfaceC2301g;
                    }
                    if (i36 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i13;
                    }
                    c28655q = c28655q2;
                    m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                    i29 = Integer.MAX_VALUE;
                    modifier3 = modifier4;
                    interfaceC22965i3 = interfaceC22965i4;
                    interfaceC22974l3 = interfaceC22974l4;
                    interfaceC2301g2 = interfaceC2301g3;
                    i34 = i37;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC2301g2 = interfaceC2301g;
                    i29 = i14;
                    modifier3 = modifier2;
                    interfaceC22965i3 = interfaceC22965i2;
                    interfaceC22974l3 = interfaceC22974l2;
                    i34 = i13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i17 |= 24576;
            i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((i15 & 1572864) == 0) {
                if (c28655q2.m87157i(function3)) {
                    i38 = 1048576;
                } else {
                    i38 = 524288;
                }
                i28 |= i38;
            }
            if ((599187 & i28) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i28 & 1, z4)) {
                if (i39 != 0) {
                    modifier4 = C2314t.f9131w;
                    i35 = i24;
                } else {
                    i35 = i24;
                    modifier4 = modifier2;
                }
                if (i44 != 0) {
                    interfaceC22965i4 = AbstractC22977m.f90650a;
                } else {
                    interfaceC22965i4 = interfaceC22965i2;
                }
                if (i18 != 0) {
                    interfaceC22974l4 = AbstractC22977m.f90652c;
                    i36 = i26;
                } else {
                    i36 = i26;
                    interfaceC22974l4 = interfaceC22974l2;
                }
                if (i35 != 0) {
                    interfaceC2301g3 = C2299e.f9107J;
                } else {
                    interfaceC2301g3 = interfaceC2301g;
                }
                if (i36 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i13;
                }
                c28655q = c28655q2;
                m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                i29 = Integer.MAX_VALUE;
                modifier3 = modifier4;
                interfaceC22965i3 = interfaceC22965i4;
                interfaceC22974l3 = interfaceC22974l4;
                interfaceC2301g2 = interfaceC2301g3;
                i34 = i37;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC2301g2 = interfaceC2301g;
                i29 = i14;
                modifier3 = modifier2;
                interfaceC22965i3 = interfaceC22965i2;
                interfaceC22974l3 = interfaceC22974l2;
                i34 = i13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i17 |= 384;
        interfaceC22974l2 = interfaceC22974l;
        i24 = i16 & 8;
        if (i24 != 0) {
            if ((i15 & 3072) == 0) {
                if (c28655q2.m87153g(interfaceC2301g)) {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i17 |= i25;
            }
            i26 = i16 & 16;
            if (i26 != 0) {
                if ((i15 & 24576) == 0) {
                    if (c28655q2.m87149e(i13)) {
                        i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i27 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i17 |= i27;
                }
                i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if ((i15 & 1572864) == 0) {
                    if (c28655q2.m87157i(function3)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i28 |= i38;
                }
                if ((599187 & i28) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i28 & 1, z4)) {
                    if (i39 != 0) {
                        modifier4 = C2314t.f9131w;
                        i35 = i24;
                    } else {
                        i35 = i24;
                        modifier4 = modifier2;
                    }
                    if (i44 != 0) {
                        interfaceC22965i4 = AbstractC22977m.f90650a;
                    } else {
                        interfaceC22965i4 = interfaceC22965i2;
                    }
                    if (i18 != 0) {
                        interfaceC22974l4 = AbstractC22977m.f90652c;
                        i36 = i26;
                    } else {
                        i36 = i26;
                        interfaceC22974l4 = interfaceC22974l2;
                    }
                    if (i35 != 0) {
                        interfaceC2301g3 = C2299e.f9107J;
                    } else {
                        interfaceC2301g3 = interfaceC2301g;
                    }
                    if (i36 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i13;
                    }
                    c28655q = c28655q2;
                    m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                    i29 = Integer.MAX_VALUE;
                    modifier3 = modifier4;
                    interfaceC22965i3 = interfaceC22965i4;
                    interfaceC22974l3 = interfaceC22974l4;
                    interfaceC2301g2 = interfaceC2301g3;
                    i34 = i37;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC2301g2 = interfaceC2301g;
                    i29 = i14;
                    modifier3 = modifier2;
                    interfaceC22965i3 = interfaceC22965i2;
                    interfaceC22974l3 = interfaceC22974l2;
                    i34 = i13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i17 |= 24576;
            i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((i15 & 1572864) == 0) {
                if (c28655q2.m87157i(function3)) {
                    i38 = 1048576;
                } else {
                    i38 = 524288;
                }
                i28 |= i38;
            }
            if ((599187 & i28) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i28 & 1, z4)) {
                if (i39 != 0) {
                    modifier4 = C2314t.f9131w;
                    i35 = i24;
                } else {
                    i35 = i24;
                    modifier4 = modifier2;
                }
                if (i44 != 0) {
                    interfaceC22965i4 = AbstractC22977m.f90650a;
                } else {
                    interfaceC22965i4 = interfaceC22965i2;
                }
                if (i18 != 0) {
                    interfaceC22974l4 = AbstractC22977m.f90652c;
                    i36 = i26;
                } else {
                    i36 = i26;
                    interfaceC22974l4 = interfaceC22974l2;
                }
                if (i35 != 0) {
                    interfaceC2301g3 = C2299e.f9107J;
                } else {
                    interfaceC2301g3 = interfaceC2301g;
                }
                if (i36 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i13;
                }
                c28655q = c28655q2;
                m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                i29 = Integer.MAX_VALUE;
                modifier3 = modifier4;
                interfaceC22965i3 = interfaceC22965i4;
                interfaceC22974l3 = interfaceC22974l4;
                interfaceC2301g2 = interfaceC2301g3;
                i34 = i37;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC2301g2 = interfaceC2301g;
                i29 = i14;
                modifier3 = modifier2;
                interfaceC22965i3 = interfaceC22965i2;
                interfaceC22974l3 = interfaceC22974l2;
                i34 = i13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i17 |= 3072;
        i26 = i16 & 16;
        if (i26 != 0) {
            if ((i15 & 24576) == 0) {
                if (c28655q2.m87149e(i13)) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i17 |= i27;
            }
            i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((i15 & 1572864) == 0) {
                if (c28655q2.m87157i(function3)) {
                    i38 = 1048576;
                } else {
                    i38 = 524288;
                }
                i28 |= i38;
            }
            if ((599187 & i28) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i28 & 1, z4)) {
                if (i39 != 0) {
                    modifier4 = C2314t.f9131w;
                    i35 = i24;
                } else {
                    i35 = i24;
                    modifier4 = modifier2;
                }
                if (i44 != 0) {
                    interfaceC22965i4 = AbstractC22977m.f90650a;
                } else {
                    interfaceC22965i4 = interfaceC22965i2;
                }
                if (i18 != 0) {
                    interfaceC22974l4 = AbstractC22977m.f90652c;
                    i36 = i26;
                } else {
                    i36 = i26;
                    interfaceC22974l4 = interfaceC22974l2;
                }
                if (i35 != 0) {
                    interfaceC2301g3 = C2299e.f9107J;
                } else {
                    interfaceC2301g3 = interfaceC2301g;
                }
                if (i36 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i13;
                }
                c28655q = c28655q2;
                m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
                i29 = Integer.MAX_VALUE;
                modifier3 = modifier4;
                interfaceC22965i3 = interfaceC22965i4;
                interfaceC22974l3 = interfaceC22974l4;
                interfaceC2301g2 = interfaceC2301g3;
                i34 = i37;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC2301g2 = interfaceC2301g;
                i29 = i14;
                modifier3 = modifier2;
                interfaceC22965i3 = interfaceC22965i2;
                interfaceC22974l3 = interfaceC22974l2;
                i34 = i13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i17 |= 24576;
        i28 = i17 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if ((i15 & 1572864) == 0) {
            if (c28655q2.m87157i(function3)) {
                i38 = 1048576;
            } else {
                i38 = 524288;
            }
            i28 |= i38;
        }
        if ((599187 & i28) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i28 & 1, z4)) {
            if (i39 != 0) {
                modifier4 = C2314t.f9131w;
                i35 = i24;
            } else {
                i35 = i24;
                modifier4 = modifier2;
            }
            if (i44 != 0) {
                interfaceC22965i4 = AbstractC22977m.f90650a;
            } else {
                interfaceC22965i4 = interfaceC22965i2;
            }
            if (i18 != 0) {
                interfaceC22974l4 = AbstractC22977m.f90652c;
                i36 = i26;
            } else {
                i36 = i26;
                interfaceC22974l4 = interfaceC22974l2;
            }
            if (i35 != 0) {
                interfaceC2301g3 = C2299e.f9107J;
            } else {
                interfaceC2301g3 = interfaceC2301g;
            }
            if (i36 != 0) {
                i37 = Integer.MAX_VALUE;
            } else {
                i37 = i13;
            }
            c28655q = c28655q2;
            m66730b(modifier4, interfaceC22965i4, interfaceC22974l4, interfaceC2301g3, i37, C22993r0.f90715f, function3, c28655q, (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | ((i28 << 3) & 29360128));
            i29 = Integer.MAX_VALUE;
            modifier3 = modifier4;
            interfaceC22965i3 = interfaceC22965i4;
            interfaceC22974l3 = interfaceC22974l4;
            interfaceC2301g2 = interfaceC2301g3;
            i34 = i37;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC2301g2 = interfaceC2301g;
            i29 = i14;
            modifier3 = modifier2;
            interfaceC22965i3 = interfaceC22965i2;
            interfaceC22974l3 = interfaceC22974l2;
            i34 = i13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l0.m0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC22960g2.m66729a(modifier3, interfaceC22965i3, interfaceC22974l3, interfaceC2301g2, i34, i29, function3, (Composer) obj, AbstractC28683x.m87244L(i15 | 1), i16);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m66730b(Modifier modifier, InterfaceC22965i interfaceC22965i, InterfaceC22974l interfaceC22974l, InterfaceC2301g interfaceC2301g, int i13, C22993r0 c22993r0, Function3 function3, Composer composer, int i14) {
        int i15;
        C22993r0 c22993r1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1956591841);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87153g(interfaceC22965i) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(interfaceC22974l) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87153g(interfaceC2301g) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i15 |= c28655q.m87149e(Integer.MAX_VALUE) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i14) == 0) {
            c22993r1 = c22993r0;
            i15 |= c28655q.m87153g(c22993r1) ? 1048576 : 524288;
        } else {
            c22993r1 = c22993r0;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= c28655q.m87157i(function3) ? 8388608 : 4194304;
        }
        int i16 = i15;
        if (c28655q.m87135U(i16 & 1, (i16 & 4793491) != 4793490)) {
            int i17 = i16 & 3670016;
            boolean z4 = i17 == 1048576;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                c22993r1.getClass();
                EnumC22981n0 enumC22981n0 = EnumC22981n0.f90670w;
                objM87133R = new C22984o0();
                c28655q.m87172p0(objM87133R);
            }
            C22984o0 c22984o0 = (C22984o0) objM87133R;
            int i18 = i16 >> 3;
            boolean zM87153g = ((((57344 & i18) ^ 24576) > 16384 && c28655q.m87149e(Integer.MAX_VALUE)) || (i18 & 24576) == 16384) | ((((i18 & 14) ^ 6) > 4 && c28655q.m87153g(interfaceC22965i)) || (i18 & 6) == 4) | ((((i18 & 112) ^ 48) > 32 && c28655q.m87153g(interfaceC22974l)) || (i18 & 48) == 32) | ((((i18 & 896) ^ 384) > 256 && c28655q.m87153g(interfaceC2301g)) || (i18 & 384) == 256) | ((((i18 & 7168) ^ 3072) > 2048 && c28655q.m87149e(i13)) || (i18 & 3072) == 2048) | c28655q.m87153g(c22984o0);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                C22990q0 c22990q0 = new C22990q0(interfaceC22965i, interfaceC22974l, interfaceC22965i.mo66735a(), new C22946d0(interfaceC2301g), interfaceC22974l.mo66735a(), i13, c22984o0);
                c28655q.m87172p0(c22990q0);
                objM87133R2 = c22990q0;
            }
            C22990q0 c22990q1 = (C22990q0) objM87133R2;
            boolean z13 = (i17 == 1048576) | ((i16 & 29360128) == 8388608) | ((i16 & 458752) == 131072);
            Object objM87133R3 = c28655q.m87133R();
            Object obj = objM87133R3;
            if (z13 || objM87133R3 == c28676v0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C37816b(new C15076m0(5, function3), true, -1192950673));
                c22993r0.getClass();
                EnumC22981n0 enumC22981n1 = EnumC22981n0.f90670w;
                c28655q.m87172p0(arrayList);
                obj = arrayList;
            }
            C37816b c37816b = new C37816b(new C3955e((List) obj, 13), true, 1271844412);
            boolean zM87153g2 = c28655q.m87153g(c22990q1);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g2 || objM87133R4 == c28676v0) {
                objM87133R4 = new C39073a1(c22990q1);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R4;
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC18489d0.m53384y(0, c37816b, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(modifier, interfaceC22965i, interfaceC22974l, interfaceC2301g, i13, c22993r0, function3, i14);
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m66731c(long j7, EnumC22943c1 enumC22943c1) {
        EnumC22943c1 enumC22943c2 = EnumC22943c1.f90551w;
        return AbstractC39170b.m124769a(enumC22943c1 == enumC22943c2 ? C39169a.m124767k(j7) : C39169a.m124766j(j7), enumC22943c1 == enumC22943c2 ? C39169a.m124765i(j7) : C39169a.m124764h(j7), enumC22943c1 == enumC22943c2 ? C39169a.m124766j(j7) : C39169a.m124767k(j7), enumC22943c1 == enumC22943c2 ? C39169a.m124764h(j7) : C39169a.m124765i(j7));
    }

    /* JADX INFO: renamed from: d */
    public static long m66732d(int i13, long j7) {
        return AbstractC39170b.m124769a(0, C39169a.m124765i(j7), (i13 & 4) != 0 ? C39169a.m124766j(j7) : 0, C39169a.m124764h(j7));
    }

    /* JADX INFO: renamed from: e */
    public static final long m66733e(long j7) {
        EnumC22943c1 enumC22943c1 = EnumC22943c1.f90551w;
        return AbstractC39170b.m124769a(C39169a.m124767k(j7), C39169a.m124765i(j7), C39169a.m124766j(j7), C39169a.m124764h(j7));
    }

    /* JADX INFO: renamed from: f */
    public static final void m66734f(StringBuilder sb4, String str) {
        if (sb4.length() > 0) {
            sb4.append('+');
        }
        sb4.append(str);
    }
}
