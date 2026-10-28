package kotlin;

import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import f41.C14063a;
import km0.C22581e;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.AbstractC30593b;
import uw0.AbstractC35302l;
import v41.AbstractC35664f;
import ws2.AbstractC37617i;

/* JADX INFO: renamed from: at2.f1 */
/* JADX INFO: loaded from: classes11.dex */
@p715kotlin.Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lkm0/e;", "selectorBottomSheetState", "Lv41/f$a;", "bottomSheetGestures", "Lat2/a;", "bottomSheetType", "", "selectedIndex", "Lbc3/c0;", "coroutineScope", "Lkotlin/Function1;", "Lws2/i;", "Ll83/a0;", "onViewEvent", "g", "(Lkm0/e;Lv41/f$a;Lat2/a;ILbc3/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2003f1 {
    /* JADX WARN: Code duplicated, block: B:100:0x014d  */
    /* JADX WARN: Code duplicated, block: B:101:0x014f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0158  */
    /* JADX WARN: Code duplicated, block: B:108:0x0198  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:76:0x0103  */
    /* JADX WARN: Code duplicated, block: B:77:0x0105  */
    /* JADX WARN: Code duplicated, block: B:81:0x010e  */
    /* JADX WARN: Code duplicated, block: B:84:0x011c  */
    /* JADX WARN: Code duplicated, block: B:85:0x011e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0127  */
    /* JADX WARN: Code duplicated, block: B:92:0x0134  */
    /* JADX WARN: Code duplicated, block: B:93:0x0136  */
    /* JADX WARN: Code duplicated, block: B:97:0x013f  */
    /* JADX INFO: renamed from: g */
    public static final void m6158g(C22581e selectorBottomSheetState, AbstractC35664f.a bottomSheetGestures, AbstractC1986a bottomSheetType, int i13, InterfaceC2994c0 coroutineScope, Function1 function1, Composer composer, int i14, int i15) {
        int i16;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int i17;
        boolean z13;
        Object objM87133R;
        boolean z14;
        Object objM87133R2;
        boolean z15;
        Object objM87133R3;
        boolean z16;
        Object objM87133R4;
        Function1 function5;
        Object objM87133R5;
        AbstractC22676k.m65750j(selectorBottomSheetState, "selectorBottomSheetState");
        AbstractC22676k.m65750j(bottomSheetGestures, "bottomSheetGestures");
        AbstractC22676k.m65750j(bottomSheetType, "bottomSheetType");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1659381817);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? c28655q.m87153g(selectorBottomSheetState) : c28655q.m87157i(selectorBottomSheetState) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? c28655q.m87153g(bottomSheetGestures) : c28655q.m87157i(bottomSheetGestures) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(bottomSheetType) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i16 |= c28655q.m87157i(coroutineScope) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i18 = i15 & 32;
        if (i18 == 0) {
            if ((196608 & i14) == 0) {
                function2 = function1;
                i16 |= c28655q.m87157i(function2) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i16) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C1991b1(2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                if (bottomSheetType instanceof AbstractC1986a.a) {
                    c28655q.m87150e0(430241319);
                    AbstractC30593b.m93841e(((AbstractC1986a.a) bottomSheetType).getBehaviorBottomSheetState(), c28655q, C14063a.f50430f);
                    c28655q.m87173q(false);
                    function5 = function4;
                } else {
                    if (bottomSheetType instanceof AbstractC1986a.b) {
                        throw AbstractC11895b.m32003v(-1233048350, c28655q, false);
                    }
                    c28655q.m87150e0(430445919);
                    i17 = 458752 & i16;
                    if (i17 == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C2010j(function4, 14);
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function6 = (Function1) objM87133R;
                    if (i17 == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C2020o(function4, 1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    if (i17 == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C2010j(function4, 15);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function1 function7 = (Function1) objM87133R3;
                    if (i17 == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z16 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C2010j(function4, 16);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i19 = i16 >> 6;
                    function5 = function4;
                    AbstractC35302l.m112030o(selectorBottomSheetState, i13, coroutineScope, bottomSheetGestures, false, false, function6, interfaceC4339a, function7, (Function1) objM87133R4, null, c28655q, ((i16 << 6) & 7168) | C22581e.f88865n | (i16 & 14) | (i19 & 112) | (i19 & 896) | (AbstractC35664f.a.f151587c << 9), 0, 1072);
                    c28655q.m87173q(false);
                }
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2000e1(selectorBottomSheetState, bottomSheetGestures, bottomSheetType, i13, coroutineScope, function3, i14, i15, 0);
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function2 = function1;
        if ((74899 & i16) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C1991b1(2);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            if (bottomSheetType instanceof AbstractC1986a.a) {
                c28655q.m87150e0(430241319);
                AbstractC30593b.m93841e(((AbstractC1986a.a) bottomSheetType).getBehaviorBottomSheetState(), c28655q, C14063a.f50430f);
                c28655q.m87173q(false);
                function5 = function4;
            } else {
                if (bottomSheetType instanceof AbstractC1986a.b) {
                    throw AbstractC11895b.m32003v(-1233048350, c28655q, false);
                }
                c28655q.m87150e0(430445919);
                i17 = 458752 & i16;
                if (i17 == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C2010j(function4, 14);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2010j(function4, 14);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function8 = (Function1) objM87133R;
                if (i17 == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    objM87133R2 = new C2020o(function4, 1);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C2020o(function4, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                if (i17 == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    objM87133R3 = new C2010j(function4, 15);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C2010j(function4, 15);
                    c28655q.m87172p0(objM87133R3);
                }
                Function1 function9 = (Function1) objM87133R3;
                if (i17 == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z16) {
                    objM87133R4 = new C2010j(function4, 16);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2010j(function4, 16);
                    c28655q.m87172p0(objM87133R4);
                }
                int i110 = i16 >> 6;
                function5 = function4;
                AbstractC35302l.m112030o(selectorBottomSheetState, i13, coroutineScope, bottomSheetGestures, false, false, function8, interfaceC4339a2, function9, (Function1) objM87133R4, null, c28655q, ((i16 << 6) & 7168) | C22581e.f88865n | (i16 & 14) | (i110 & 112) | (i110 & 896) | (AbstractC35664f.a.f151587c << 9), 0, 1072);
                c28655q.m87173q(false);
            }
            function3 = function5;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2000e1(selectorBottomSheetState, bottomSheetGestures, bottomSheetType, i13, coroutineScope, function3, i14, i15, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m6159h(AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m6160i(Function1 function1, String id4) {
        AbstractC22676k.m65750j(id4, "id");
        function1.invoke(new AbstractC37617i.k(id4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m6161j(Function1 function1) {
        function1.invoke(AbstractC37617i.g.f160957a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m6162k(Function1 function1, int i13) {
        function1.invoke(new AbstractC37617i.b(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m6163l(Function1 function1, String query) {
        AbstractC22676k.m65750j(query, "query");
        function1.invoke(new AbstractC37617i.n(query));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m6164m(C22581e c22581e, AbstractC35664f.a aVar, AbstractC1986a abstractC1986a, int i13, InterfaceC2994c0 interfaceC2994c0, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m6158g(c22581e, aVar, abstractC1986a, i13, interfaceC2994c0, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
