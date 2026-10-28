package lf0;

import a01.EnumC0093m;
import a81.C0563n;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bb2.C2931g;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import hy0.AbstractC17755i2;
import java.util.Set;
import jp1.C21851c;
import kf0.C22437l;
import l01.C23045q;
import l72.C23399f;
import l83.C23454a0;
import lc0.C23825g;
import ld0.C23848g;
import ld0.C23850i;
import ld0.C23851j;
import ld0.C23852k;
import ld0.C23853l;
import ld0.EnumC23849h;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22969j0;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.InterfaceC22940b2;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23141n2;
import p292l1.C23196w3;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import sy0.AbstractC33087j;
import sy0.AbstractC33088k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lf0.b2 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001au\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lld0/g;", "viewState", "", "La01/m;", "selectedStatusFilters", "Lld0/h;", "selectedSortOption", "Ll1/w3;", "sheetState", "Lkotlin/Function0;", "Ll83/a0;", "onDismissRequest", "Lkotlin/Function1;", "onStatusFilterToggled", "onSortOptionSelected", "i", "(Lld0/g;Ljava/util/Set;Lld0/h;Ll1/w3;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23901b2 {
    /* JADX WARN: Code duplicated, block: B:101:0x011c  */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0131  */
    /* JADX WARN: Code duplicated, block: B:109:0x0140  */
    /* JADX WARN: Code duplicated, block: B:111:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x01af  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9 A[PHI: r0 r4 r6 r10 r12
      0x00f9: PHI (r0v29 int) = (r0v17 int), (r0v30 int) binds: [B:108:0x013e, B:88:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r4v13 ld0.h) = (r4v8 ld0.h), (r4v15 ld0.h) binds: [B:108:0x013e, B:88:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r6v18 l1.w3) = (r6v13 l1.w3), (r6v10 l1.w3) binds: [B:108:0x013e, B:88:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r10v8 c93.a) = (r10v4 c93.a), (r10v2 c93.a) binds: [B:108:0x013e, B:88:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r12v9 kotlin.jvm.functions.Function1) = (r12v4 kotlin.jvm.functions.Function1), (r12v3 kotlin.jvm.functions.Function1) binds: [B:108:0x013e, B:88:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x010a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0116  */
    /* JADX INFO: renamed from: i */
    public static final void m70250i(C23848g viewState, Set<? extends EnumC0093m> selectedStatusFilters, EnumC23849h enumC23849h, C23196w3 c23196w3, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        C23196w3 c23196w3M67125g;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        Function1 function3;
        int i17;
        int i18;
        Function1 function4;
        int i19;
        boolean z4;
        C28655q c28655q;
        EnumC23849h enumC23849h2;
        C23196w3 c23196w4;
        InterfaceC4339a interfaceC4339a3;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        EnumC23849h enumC23849h3;
        C28676v0 c28676v0;
        Object objM87133R;
        Function1 function7;
        C23196w3 c23196w5;
        InterfaceC4339a interfaceC4339a4;
        Function1 function8;
        Object objM87133R2;
        Object objM87133R3;
        int i24;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(selectedStatusFilters, "selectedStatusFilters");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(279298122);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(selectedStatusFilters) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87149e(enumC23849h == null ? -1 : enumC23849h.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c23196w3M67125g = c23196w3;
                if (c28655q2.m87153g(c23196w3M67125g)) {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i24;
            } else {
                c23196w3M67125g = c23196w3;
            }
            i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i24;
        } else {
            c23196w3M67125g = c23196w3;
        }
        int i26 = i14 & 16;
        if (i26 == 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    function3 = function1;
                    if (c28655q2.m87157i(function3)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 64;
                if (i18 != 0) {
                    if ((i13 & 1572864) == 0) {
                        function4 = function2;
                        if (c28655q2.m87157i(function4)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c28655q2.m87140Z();
                        if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                            if (i25 != 0) {
                                enumC23849h3 = EnumC23849h.STATUS;
                            } else {
                                enumC23849h3 = enumC23849h;
                            }
                            if ((i14 & 8) != 0) {
                                i15 &= -7169;
                                c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i26 != 0) {
                                objM87133R3 = c28655q2.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C23399f(20);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                            }
                            if (i16 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C23825g(15);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                function3 = (Function1) objM87133R2;
                            }
                            if (i18 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C23825g(16);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                function7 = (Function1) objM87133R;
                                c23196w5 = c23196w3M67125g;
                                interfaceC4339a4 = interfaceC4339a2;
                                function8 = function3;
                            }
                            int i27 = i15;
                            c28655q2.m87175r();
                            float f13 = 4;
                            float f14 = f13 * f13;
                            EnumC23849h enumC23849h4 = enumC23849h3;
                            c28655q = c28655q2;
                            AbstractC23141n2.m67119a(interfaceC4339a4, null, c23196w5, 0.0f, false, AbstractC33253j.m105491g(f14, f14, 0.0f, 0.0f, 12), C17919x.f69636m, 0L, 0.0f, EnumC39333f.BLACK_90.mo134584toComposableColorWaAFU9c(c28655q2, 6), null, new C22437l(28), null, AbstractC37817c.m121344e(-1147843412, c28655q2, new C0563n((Object) viewState, (Object) enumC23849h4, function7, (Object) selectedStatusFilters, (Object) function8, 9)), c28655q, ((i27 >> 12) & 14) | 1572864 | ((i27 >> 3) & 896), 3078, 4506);
                            function6 = function7;
                            function5 = function8;
                            interfaceC4339a3 = interfaceC4339a4;
                            c23196w4 = c23196w5;
                            enumC23849h2 = enumC23849h4;
                        } else {
                            c28655q2.m87138X();
                            if ((i14 & 8) != 0) {
                                i15 &= -7169;
                            }
                            enumC23849h3 = enumC23849h;
                        }
                        c23196w5 = c23196w3M67125g;
                        interfaceC4339a4 = interfaceC4339a2;
                        function8 = function3;
                        function7 = function4;
                        int i28 = i15;
                        c28655q2.m87175r();
                        float f15 = 4;
                        float f16 = f15 * f15;
                        EnumC23849h enumC23849h5 = enumC23849h3;
                        c28655q = c28655q2;
                        AbstractC23141n2.m67119a(interfaceC4339a4, null, c23196w5, 0.0f, false, AbstractC33253j.m105491g(f16, f16, 0.0f, 0.0f, 12), C17919x.f69636m, 0L, 0.0f, EnumC39333f.BLACK_90.mo134584toComposableColorWaAFU9c(c28655q2, 6), null, new C22437l(28), null, AbstractC37817c.m121344e(-1147843412, c28655q2, new C0563n((Object) viewState, (Object) enumC23849h5, function7, (Object) selectedStatusFilters, (Object) function8, 9)), c28655q, ((i28 >> 12) & 14) | 1572864 | ((i28 >> 3) & 896), 3078, 4506);
                        function6 = function7;
                        function5 = function8;
                        interfaceC4339a3 = interfaceC4339a4;
                        c23196w4 = c23196w5;
                        enumC23849h2 = enumC23849h5;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        enumC23849h2 = enumC23849h;
                        c23196w4 = c23196w3M67125g;
                        interfaceC4339a3 = interfaceC4339a2;
                        function5 = function3;
                        function6 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g(viewState, selectedStatusFilters, enumC23849h2, c23196w4, interfaceC4339a3, function5, function6, i13, i14);
                    }
                }
                i15 |= 1572864;
                function4 = function2;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i25 != 0) {
                            enumC23849h3 = EnumC23849h.STATUS;
                        } else {
                            enumC23849h3 = enumC23849h;
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                            c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C23399f(20);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C23825g(15);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C23825g(16);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function7 = (Function1) objM87133R;
                            c23196w5 = c23196w3M67125g;
                            interfaceC4339a4 = interfaceC4339a2;
                            function8 = function3;
                        } else {
                            c23196w5 = c23196w3M67125g;
                            interfaceC4339a4 = interfaceC4339a2;
                            function8 = function3;
                            function7 = function4;
                        }
                    } else {
                        if (i25 != 0) {
                            enumC23849h3 = EnumC23849h.STATUS;
                        } else {
                            enumC23849h3 = enumC23849h;
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                            c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C23399f(20);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C23825g(15);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C23825g(16);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function7 = (Function1) objM87133R;
                            c23196w5 = c23196w3M67125g;
                            interfaceC4339a4 = interfaceC4339a2;
                            function8 = function3;
                        } else {
                            c23196w5 = c23196w3M67125g;
                            interfaceC4339a4 = interfaceC4339a2;
                            function8 = function3;
                            function7 = function4;
                        }
                    }
                    int i29 = i15;
                    c28655q2.m87175r();
                    float f17 = 4;
                    float f18 = f17 * f17;
                    EnumC23849h enumC23849h6 = enumC23849h3;
                    c28655q = c28655q2;
                    AbstractC23141n2.m67119a(interfaceC4339a4, null, c23196w5, 0.0f, false, AbstractC33253j.m105491g(f18, f18, 0.0f, 0.0f, 12), C17919x.f69636m, 0L, 0.0f, EnumC39333f.BLACK_90.mo134584toComposableColorWaAFU9c(c28655q2, 6), null, new C22437l(28), null, AbstractC37817c.m121344e(-1147843412, c28655q2, new C0563n((Object) viewState, (Object) enumC23849h6, function7, (Object) selectedStatusFilters, (Object) function8, 9)), c28655q, ((i29 >> 12) & 14) | 1572864 | ((i29 >> 3) & 896), 3078, 4506);
                    function6 = function7;
                    function5 = function8;
                    interfaceC4339a3 = interfaceC4339a4;
                    c23196w4 = c23196w5;
                    enumC23849h2 = enumC23849h6;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    enumC23849h2 = enumC23849h;
                    c23196w4 = c23196w3M67125g;
                    interfaceC4339a3 = interfaceC4339a2;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(viewState, selectedStatusFilters, enumC23849h2, c23196w4, interfaceC4339a3, function5, function6, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function3 = function1;
            i18 = i14 & 64;
            if (i18 != 0) {
                if ((i13 & 1572864) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i25 != 0) {
                            enumC23849h3 = EnumC23849h.STATUS;
                        } else {
                            enumC23849h3 = enumC23849h;
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                            c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C23399f(20);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C23825g(15);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C23825g(16);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function7 = (Function1) objM87133R;
                            c23196w5 = c23196w3M67125g;
                            interfaceC4339a4 = interfaceC4339a2;
                            function8 = function3;
                        } else {
                            c23196w5 = c23196w3M67125g;
                            interfaceC4339a4 = interfaceC4339a2;
                            function8 = function3;
                            function7 = function4;
                        }
                    } else {
                        if (i25 != 0) {
                            enumC23849h3 = EnumC23849h.STATUS;
                        } else {
                            enumC23849h3 = enumC23849h;
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                            c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C23399f(20);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C23825g(15);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C23825g(16);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function7 = (Function1) objM87133R;
                            c23196w5 = c23196w3M67125g;
                            interfaceC4339a4 = interfaceC4339a2;
                            function8 = function3;
                        } else {
                            c23196w5 = c23196w3M67125g;
                            interfaceC4339a4 = interfaceC4339a2;
                            function8 = function3;
                            function7 = function4;
                        }
                    }
                    int i210 = i15;
                    c28655q2.m87175r();
                    float f19 = 4;
                    float f110 = f19 * f19;
                    EnumC23849h enumC23849h7 = enumC23849h3;
                    c28655q = c28655q2;
                    AbstractC23141n2.m67119a(interfaceC4339a4, null, c23196w5, 0.0f, false, AbstractC33253j.m105491g(f110, f110, 0.0f, 0.0f, 12), C17919x.f69636m, 0L, 0.0f, EnumC39333f.BLACK_90.mo134584toComposableColorWaAFU9c(c28655q2, 6), null, new C22437l(28), null, AbstractC37817c.m121344e(-1147843412, c28655q2, new C0563n((Object) viewState, (Object) enumC23849h7, function7, (Object) selectedStatusFilters, (Object) function8, 9)), c28655q, ((i210 >> 12) & 14) | 1572864 | ((i210 >> 3) & 896), 3078, 4506);
                    function6 = function7;
                    function5 = function8;
                    interfaceC4339a3 = interfaceC4339a4;
                    c23196w4 = c23196w5;
                    enumC23849h2 = enumC23849h7;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    enumC23849h2 = enumC23849h;
                    c23196w4 = c23196w3M67125g;
                    interfaceC4339a3 = interfaceC4339a2;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(viewState, selectedStatusFilters, enumC23849h2, c23196w4, interfaceC4339a3, function5, function6, i13, i14);
                }
            }
            i15 |= 1572864;
            function4 = function2;
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i25 != 0) {
                        enumC23849h3 = EnumC23849h.STATUS;
                    } else {
                        enumC23849h3 = enumC23849h;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C23399f(20);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C23825g(15);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C23825g(16);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                        c23196w5 = c23196w3M67125g;
                        interfaceC4339a4 = interfaceC4339a2;
                        function8 = function3;
                    } else {
                        c23196w5 = c23196w3M67125g;
                        interfaceC4339a4 = interfaceC4339a2;
                        function8 = function3;
                        function7 = function4;
                    }
                } else {
                    if (i25 != 0) {
                        enumC23849h3 = EnumC23849h.STATUS;
                    } else {
                        enumC23849h3 = enumC23849h;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C23399f(20);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C23825g(15);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C23825g(16);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                        c23196w5 = c23196w3M67125g;
                        interfaceC4339a4 = interfaceC4339a2;
                        function8 = function3;
                    } else {
                        c23196w5 = c23196w3M67125g;
                        interfaceC4339a4 = interfaceC4339a2;
                        function8 = function3;
                        function7 = function4;
                    }
                }
                int i211 = i15;
                c28655q2.m87175r();
                float f111 = 4;
                float f112 = f111 * f111;
                EnumC23849h enumC23849h8 = enumC23849h3;
                c28655q = c28655q2;
                AbstractC23141n2.m67119a(interfaceC4339a4, null, c23196w5, 0.0f, false, AbstractC33253j.m105491g(f112, f112, 0.0f, 0.0f, 12), C17919x.f69636m, 0L, 0.0f, EnumC39333f.BLACK_90.mo134584toComposableColorWaAFU9c(c28655q2, 6), null, new C22437l(28), null, AbstractC37817c.m121344e(-1147843412, c28655q2, new C0563n((Object) viewState, (Object) enumC23849h8, function7, (Object) selectedStatusFilters, (Object) function8, 9)), c28655q, ((i211 >> 12) & 14) | 1572864 | ((i211 >> 3) & 896), 3078, 4506);
                function6 = function7;
                function5 = function8;
                interfaceC4339a3 = interfaceC4339a4;
                c23196w4 = c23196w5;
                enumC23849h2 = enumC23849h8;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                enumC23849h2 = enumC23849h;
                c23196w4 = c23196w3M67125g;
                interfaceC4339a3 = interfaceC4339a2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(viewState, selectedStatusFilters, enumC23849h2, c23196w4, interfaceC4339a3, function5, function6, i13, i14);
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                function3 = function1;
                if (c28655q2.m87157i(function3)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                if ((i13 & 1572864) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i25 != 0) {
                            enumC23849h3 = EnumC23849h.STATUS;
                        } else {
                            enumC23849h3 = enumC23849h;
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                            c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C23399f(20);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C23825g(15);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C23825g(16);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function7 = (Function1) objM87133R;
                            c23196w5 = c23196w3M67125g;
                            interfaceC4339a4 = interfaceC4339a2;
                            function8 = function3;
                        } else {
                            c23196w5 = c23196w3M67125g;
                            interfaceC4339a4 = interfaceC4339a2;
                            function8 = function3;
                            function7 = function4;
                        }
                    } else {
                        if (i25 != 0) {
                            enumC23849h3 = EnumC23849h.STATUS;
                        } else {
                            enumC23849h3 = enumC23849h;
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                            c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C23399f(20);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C23825g(15);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C23825g(16);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function7 = (Function1) objM87133R;
                            c23196w5 = c23196w3M67125g;
                            interfaceC4339a4 = interfaceC4339a2;
                            function8 = function3;
                        } else {
                            c23196w5 = c23196w3M67125g;
                            interfaceC4339a4 = interfaceC4339a2;
                            function8 = function3;
                            function7 = function4;
                        }
                    }
                    int i212 = i15;
                    c28655q2.m87175r();
                    float f113 = 4;
                    float f114 = f113 * f113;
                    EnumC23849h enumC23849h9 = enumC23849h3;
                    c28655q = c28655q2;
                    AbstractC23141n2.m67119a(interfaceC4339a4, null, c23196w5, 0.0f, false, AbstractC33253j.m105491g(f114, f114, 0.0f, 0.0f, 12), C17919x.f69636m, 0L, 0.0f, EnumC39333f.BLACK_90.mo134584toComposableColorWaAFU9c(c28655q2, 6), null, new C22437l(28), null, AbstractC37817c.m121344e(-1147843412, c28655q2, new C0563n((Object) viewState, (Object) enumC23849h9, function7, (Object) selectedStatusFilters, (Object) function8, 9)), c28655q, ((i212 >> 12) & 14) | 1572864 | ((i212 >> 3) & 896), 3078, 4506);
                    function6 = function7;
                    function5 = function8;
                    interfaceC4339a3 = interfaceC4339a4;
                    c23196w4 = c23196w5;
                    enumC23849h2 = enumC23849h9;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    enumC23849h2 = enumC23849h;
                    c23196w4 = c23196w3M67125g;
                    interfaceC4339a3 = interfaceC4339a2;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(viewState, selectedStatusFilters, enumC23849h2, c23196w4, interfaceC4339a3, function5, function6, i13, i14);
                }
            }
            i15 |= 1572864;
            function4 = function2;
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i25 != 0) {
                        enumC23849h3 = EnumC23849h.STATUS;
                    } else {
                        enumC23849h3 = enumC23849h;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C23399f(20);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C23825g(15);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C23825g(16);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                        c23196w5 = c23196w3M67125g;
                        interfaceC4339a4 = interfaceC4339a2;
                        function8 = function3;
                    } else {
                        c23196w5 = c23196w3M67125g;
                        interfaceC4339a4 = interfaceC4339a2;
                        function8 = function3;
                        function7 = function4;
                    }
                } else {
                    if (i25 != 0) {
                        enumC23849h3 = EnumC23849h.STATUS;
                    } else {
                        enumC23849h3 = enumC23849h;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C23399f(20);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C23825g(15);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C23825g(16);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                        c23196w5 = c23196w3M67125g;
                        interfaceC4339a4 = interfaceC4339a2;
                        function8 = function3;
                    } else {
                        c23196w5 = c23196w3M67125g;
                        interfaceC4339a4 = interfaceC4339a2;
                        function8 = function3;
                        function7 = function4;
                    }
                }
                int i213 = i15;
                c28655q2.m87175r();
                float f115 = 4;
                float f116 = f115 * f115;
                EnumC23849h enumC23849h10 = enumC23849h3;
                c28655q = c28655q2;
                AbstractC23141n2.m67119a(interfaceC4339a4, null, c23196w5, 0.0f, false, AbstractC33253j.m105491g(f116, f116, 0.0f, 0.0f, 12), C17919x.f69636m, 0L, 0.0f, EnumC39333f.BLACK_90.mo134584toComposableColorWaAFU9c(c28655q2, 6), null, new C22437l(28), null, AbstractC37817c.m121344e(-1147843412, c28655q2, new C0563n((Object) viewState, (Object) enumC23849h10, function7, (Object) selectedStatusFilters, (Object) function8, 9)), c28655q, ((i213 >> 12) & 14) | 1572864 | ((i213 >> 3) & 896), 3078, 4506);
                function6 = function7;
                function5 = function8;
                interfaceC4339a3 = interfaceC4339a4;
                c23196w4 = c23196w5;
                enumC23849h2 = enumC23849h10;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                enumC23849h2 = enumC23849h;
                c23196w4 = c23196w3M67125g;
                interfaceC4339a3 = interfaceC4339a2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(viewState, selectedStatusFilters, enumC23849h2, c23196w4, interfaceC4339a3, function5, function6, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function3 = function1;
        i18 = i14 & 64;
        if (i18 != 0) {
            if ((i13 & 1572864) == 0) {
                function4 = function2;
                if (c28655q2.m87157i(function4)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i25 != 0) {
                        enumC23849h3 = EnumC23849h.STATUS;
                    } else {
                        enumC23849h3 = enumC23849h;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C23399f(20);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C23825g(15);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C23825g(16);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                        c23196w5 = c23196w3M67125g;
                        interfaceC4339a4 = interfaceC4339a2;
                        function8 = function3;
                    } else {
                        c23196w5 = c23196w3M67125g;
                        interfaceC4339a4 = interfaceC4339a2;
                        function8 = function3;
                        function7 = function4;
                    }
                } else {
                    if (i25 != 0) {
                        enumC23849h3 = EnumC23849h.STATUS;
                    } else {
                        enumC23849h3 = enumC23849h;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C23399f(20);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C23825g(15);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C23825g(16);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                        c23196w5 = c23196w3M67125g;
                        interfaceC4339a4 = interfaceC4339a2;
                        function8 = function3;
                    } else {
                        c23196w5 = c23196w3M67125g;
                        interfaceC4339a4 = interfaceC4339a2;
                        function8 = function3;
                        function7 = function4;
                    }
                }
                int i214 = i15;
                c28655q2.m87175r();
                float f117 = 4;
                float f118 = f117 * f117;
                EnumC23849h enumC23849h11 = enumC23849h3;
                c28655q = c28655q2;
                AbstractC23141n2.m67119a(interfaceC4339a4, null, c23196w5, 0.0f, false, AbstractC33253j.m105491g(f118, f118, 0.0f, 0.0f, 12), C17919x.f69636m, 0L, 0.0f, EnumC39333f.BLACK_90.mo134584toComposableColorWaAFU9c(c28655q2, 6), null, new C22437l(28), null, AbstractC37817c.m121344e(-1147843412, c28655q2, new C0563n((Object) viewState, (Object) enumC23849h11, function7, (Object) selectedStatusFilters, (Object) function8, 9)), c28655q, ((i214 >> 12) & 14) | 1572864 | ((i214 >> 3) & 896), 3078, 4506);
                function6 = function7;
                function5 = function8;
                interfaceC4339a3 = interfaceC4339a4;
                c23196w4 = c23196w5;
                enumC23849h2 = enumC23849h11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                enumC23849h2 = enumC23849h;
                c23196w4 = c23196w3M67125g;
                interfaceC4339a3 = interfaceC4339a2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(viewState, selectedStatusFilters, enumC23849h2, c23196w4, interfaceC4339a3, function5, function6, i13, i14);
            }
        }
        i15 |= 1572864;
        function4 = function2;
        if ((i15 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                if (i25 != 0) {
                    enumC23849h3 = EnumC23849h.STATUS;
                } else {
                    enumC23849h3 = enumC23849h;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C23399f(20);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23825g(15);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C23825g(16);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function7 = (Function1) objM87133R;
                    c23196w5 = c23196w3M67125g;
                    interfaceC4339a4 = interfaceC4339a2;
                    function8 = function3;
                } else {
                    c23196w5 = c23196w3M67125g;
                    interfaceC4339a4 = interfaceC4339a2;
                    function8 = function3;
                    function7 = function4;
                }
            } else {
                if (i25 != 0) {
                    enumC23849h3 = EnumC23849h.STATUS;
                } else {
                    enumC23849h3 = enumC23849h;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C23399f(20);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23825g(15);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C23825g(16);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function7 = (Function1) objM87133R;
                    c23196w5 = c23196w3M67125g;
                    interfaceC4339a4 = interfaceC4339a2;
                    function8 = function3;
                } else {
                    c23196w5 = c23196w3M67125g;
                    interfaceC4339a4 = interfaceC4339a2;
                    function8 = function3;
                    function7 = function4;
                }
            }
            int i215 = i15;
            c28655q2.m87175r();
            float f119 = 4;
            float f1110 = f119 * f119;
            EnumC23849h enumC23849h12 = enumC23849h3;
            c28655q = c28655q2;
            AbstractC23141n2.m67119a(interfaceC4339a4, null, c23196w5, 0.0f, false, AbstractC33253j.m105491g(f1110, f1110, 0.0f, 0.0f, 12), C17919x.f69636m, 0L, 0.0f, EnumC39333f.BLACK_90.mo134584toComposableColorWaAFU9c(c28655q2, 6), null, new C22437l(28), null, AbstractC37817c.m121344e(-1147843412, c28655q2, new C0563n((Object) viewState, (Object) enumC23849h12, function7, (Object) selectedStatusFilters, (Object) function8, 9)), c28655q, ((i215 >> 12) & 14) | 1572864 | ((i215 >> 3) & 896), 3078, 4506);
            function6 = function7;
            function5 = function8;
            interfaceC4339a3 = interfaceC4339a4;
            c23196w4 = c23196w5;
            enumC23849h2 = enumC23849h12;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            enumC23849h2 = enumC23849h;
            c23196w4 = c23196w3M67125g;
            interfaceC4339a3 = interfaceC4339a2;
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g(viewState, selectedStatusFilters, enumC23849h2, c23196w4, interfaceC4339a3, function5, function6, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m70251j() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m70252k(EnumC0093m it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m70253l(EnumC23849h it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC22940b2 m70254m(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(867533920);
        C22969j0 c22969j0 = new C22969j0(0);
        c28655q.m87173q(false);
        return c22969j0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m70255n(C23848g c23848g, EnumC23849h enumC23849h, Function1 function1, Set set, Function1 function2, InterfaceC23013y ModalBottomSheet, Composer composer, int i13) {
        C28676v0 c28676v0;
        C2314t c2314t;
        boolean z4;
        C15077m1 c15077m1M43196a;
        C28655q c28655q;
        boolean z13;
        int i14;
        long jM125385c1;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(ModalBottomSheet, "$this$ModalBottomSheet");
        C28655q c28655q2 = (C28655q) composer;
        if (c28655q2.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C2314t c2314t2 = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(f14, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t2))));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66722k);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            AbstractC29125c.m88524d(AbstractC34132o.m107874S(AbstractC16272a.f62068e, c28655q2, 6), null, AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f14, 7), null, c28655q2, 432, 120);
            String strM21275i = AbstractC8693b.m21275i(c23848g.getTitle(), c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21275i, null, c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getH4(), null, c28655q2, 0, C2886a.f11498d << 18, 196090);
            C28655q c28655q3 = c28655q2;
            C23851j c23851jM70075b = c23848g.getSortData();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (c23851jM70075b == null) {
                c28655q3.m87150e0(1148478288);
                c28655q3.m87173q(false);
                z4 = false;
                c28676v0 = c28676v1;
                c2314t = c2314t2;
            } else {
                c28655q3.m87150e0(1148478289);
                float f15 = 3;
                AbstractC11266d.m30469w(f15, 4, c2314t2, c28655q3);
                c28676v0 = c28676v1;
                c2314t = c2314t2;
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, f15 * f13, 1), null, null, new TextResource.C8691e(c23851jM70075b.getTitle()), null, 0L, 0L, null, c28655q3, (TextResource.C8691e.f25898b << 9) | 6, 246);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 1.5d, f13, c2305k, c28655q3, 6);
                int iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3409f);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3 = c28655q3;
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3 = c28655q3;
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
                c28655q3.m87150e0(1003429883);
                for (C23850i c23850i : c23851jM70075b.m70080a()) {
                    boolean z14 = c23850i.getType() == enumC23849h;
                    TextResource textResourceM21278l = AbstractC8693b.m21278l(c23850i.getTitle());
                    if (z14) {
                        c28655q3.m87150e0(709843117);
                        C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                        C38072d c38072d2 = C38072d.f163053a;
                        int i16 = C38072d.f163054b;
                        C28655q c28655q4 = c28655q3;
                        c15077m1M43196a = AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q3, i16).getBrandWhite(), c38072d2.m121949b(c28655q3, i16).getBrandBlack(), c38072d2.m121949b(c28655q3, i16).getBrandWhite(), c38072d2.m121949b(c28655q3, i16).getBrandBlack(), c28655q4, 0, 0);
                        c28655q = c28655q4;
                        c28655q.m87173q(false);
                    } else {
                        c28655q3.m87150e0(710310597);
                        C22976l1 c22976l2 = AbstractC15166v0.f56891a;
                        C38072d c38072d3 = C38072d.f163053a;
                        int i17 = C38072d.f163054b;
                        C28655q c28655q5 = c28655q3;
                        c15077m1M43196a = AbstractC15166v0.m43196a(c38072d3.m121949b(c28655q3, i17).getWhite10(), c38072d3.m121949b(c28655q3, i17).getBrandWhite(), 0L, 0L, c28655q5, 0, 12);
                        c28655q = c28655q5;
                        c28655q.m87173q(false);
                    }
                    C15077m1 c15077m1 = c15077m1M43196a;
                    boolean z15 = !z14;
                    boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(c23850i);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = new C23045q(function1, c23850i, 12);
                        c28655q.m87172p0(objM87133R);
                    }
                    C28655q c28655q6 = c28655q;
                    AbstractC27292z.m82343j(null, z15, false, null, null, null, textResourceM21278l, c15077m1, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q6, TextResource.$stable << 18, 0, 7997);
                    c28655q3 = c28655q6;
                }
                z4 = false;
                AbstractC25012a.m73392y(c28655q3, false, true, false);
            }
            C23853l c23853lM70076c = c23848g.getStatusFilters();
            if (c23853lM70076c == null) {
                c28655q3.m87150e0(1150359740);
                c28655q3.m87173q(z4);
                z13 = true;
            } else {
                c28655q3.m87150e0(1150359741);
                int i18 = 3;
                float f16 = 3;
                AbstractC11266d.m30469w(f16, 4, c2314t, c28655q3);
                C28655q c28655q7 = c28655q3;
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f16 * f13, 1), null, null, new TextResource.C8691e(c23853lM70076c.getTitle()), null, 0L, 0L, null, c28655q7, (TextResource.C8691e.f25898b << 9) | 6, 246);
                c28655q3 = c28655q7;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 0);
                int iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m3);
                C0209i c0209i5 = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N3);
                c28655q3.m87150e0(-192777810);
                for (C23852k c23852k : c23853lM70076c.m70084a()) {
                    boolean zContains = set.contains(c23852k.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String());
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c23852k.getTitle());
                    AbstractC33088k.g gVar = new AbstractC33088k.g(null, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
                    if (zContains) {
                        c28655q3.m87150e0(-47777412);
                        i14 = 0;
                        jM125385c1 = AbstractC31061c.m95624D(C38072d.f163053a, c28655q3, C38072d.f163054b, false);
                    } else {
                        i14 = 0;
                        c28655q3.m87150e0(-47680289);
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite70();
                        c28655q3.m87173q(false);
                    }
                    float f17 = i14;
                    C22976l1 c22976l3 = new C22976l1(f17, f17, f17, f17);
                    boolean zM87153g2 = c28655q3.m87153g(function2) | c28655q3.m87153g(c23852k);
                    Object objM87133R2 = c28655q3.m87133R();
                    if (zM87153g2 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C21851c(25, function2, c23852k);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    C28655q c28655q8 = c28655q3;
                    AbstractC33087j.m104824f(textResourceM21278l2, gVar, zContains, false, 0, jM125385c1, null, c22976l3, false, 0L, (Function1) objM87133R2, c28655q8, 12607488 | TextResource.$stable | (AbstractC33088k.g.f137992d << 3), 0, 840);
                    c28655q3 = c28655q8;
                }
                z13 = true;
                AbstractC25012a.m73392y(c28655q3, false, true, false);
            }
            c28655q3.m87173q(z13);
        } else {
            c28655q2.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m70256o(Function1 function1, C23850i c23850i) {
        function1.invoke(c23850i.getType());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m70257p(Function1 function1, C23852k c23852k, boolean z4) {
        function1.invoke(c23852k.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m70258q(C23848g c23848g, Set set, EnumC23849h enumC23849h, C23196w3 c23196w3, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m70250i(c23848g, set, enumC23849h, c23196w3, interfaceC4339a, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
