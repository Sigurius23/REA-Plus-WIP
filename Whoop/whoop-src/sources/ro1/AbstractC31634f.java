package ro1;

import am2.C1019g0;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bm0.C3403f;
import bm2.C3446h1;
import c93.InterfaceC4339a;
import com.mapbox.common.HttpHeaders;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p040c0.InterfaceC3764o;
import p114eb.AbstractC12958g1;
import p114eb.C12953f;
import p114eb.C12974m;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p602x1.C37816b;
import p710im1.C18707y0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ri2.C31469a;
import so1.AbstractC32803a0;
import so1.AbstractC32807c0;
import so1.C32805b0;
import vo1.AbstractC36243r;
import vo1.AbstractC36245t;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yn1.AbstractC39672a;
import yn1.C39673b;

/* JADX INFO: renamed from: ro1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ai\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lso1/b0;", "viewModel", "Lro1/i;", "navigationRouter", "Lyn1/b;", "analyticsHelper", "Leb/u0;", "navController", "Lso1/c0;", "viewState", "", HttpHeaders.DATE, "preSelectedLogValue", "analyticsSource", "Lkotlin/Function0;", "Ll83/a0;", "onPreSelectedLogValueConsumed", "l", "(Lso1/b0;Lro1/i;Lyn1/b;Leb/u0;Lso1/c0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31634f {
    /* JADX WARN: Code duplicated, block: B:100:0x013e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0141  */
    /* JADX WARN: Code duplicated, block: B:104:0x014b  */
    /* JADX WARN: Code duplicated, block: B:105:0x014e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0159  */
    /* JADX WARN: Code duplicated, block: B:109:0x015c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0167  */
    /* JADX WARN: Code duplicated, block: B:113:0x016a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0184  */
    /* JADX WARN: Code duplicated, block: B:122:0x0197  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x0102  */
    /* JADX WARN: Code duplicated, block: B:84:0x010c  */
    /* JADX WARN: Code duplicated, block: B:86:0x010f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0111  */
    /* JADX WARN: Code duplicated, block: B:89:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x011a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0120  */
    /* JADX WARN: Code duplicated, block: B:95:0x0126  */
    /* JADX WARN: Code duplicated, block: B:97:0x0133  */
    /* JADX INFO: renamed from: l */
    public static final void m97749l(C32805b0 viewModel, C31637i navigationRouter, C39673b analyticsHelper, C12991u0 navController, AbstractC32807c0 viewState, String str, String str2, String str3, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        String str4;
        String str5;
        int i16;
        String str6;
        int i17;
        int i18;
        int i19;
        int i24;
        boolean z4;
        C28655q c28655q;
        String str7;
        String str8;
        InterfaceC4339a interfaceC4339a2;
        C28677v1 c28677v1M87180u;
        String str9;
        int i25;
        String str10;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a3;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean zM87157i;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(navigationRouter, "navigationRouter");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(793958703);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(navigationRouter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(analyticsHelper) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(navController) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87153g(viewState) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            str4 = str;
            i15 |= c28655q2.m87153g(str4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            str4 = str;
        }
        int i26 = i14 & 64;
        if (i26 == 0) {
            if ((1572864 & i13) == 0) {
                str5 = str2;
                i15 |= c28655q2.m87153g(str5) ? 1048576 : 524288;
            }
            i16 = i14 & 128;
            if (i16 != 0) {
                i15 |= 12582912;
                str6 = str3;
            } else {
                str6 = str3;
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87153g(str6)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i15 |= i17;
                }
            }
            i18 = i14 & 256;
            if (i18 != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i19 = 67108864;
                } else {
                    i19 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i19;
            }
            i24 = i15;
            if ((i24 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z4)) {
                if (i26 != 0) {
                    str9 = null;
                } else {
                    str9 = str5;
                }
                if (i16 != 0) {
                    str10 = null;
                    i25 = i18;
                } else {
                    i25 = i18;
                    str10 = str6;
                }
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C31469a(7);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if ((i24 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i24 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z17 = z13 | z14;
                if ((i24 & 3670016) == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z18 = z17 | z15;
                if ((i24 & 29360128) == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i = z18 | z16 | c28655q2.m87157i(viewModel) | c28655q2.m87157i(navigationRouter) | c28655q2.m87157i(analyticsHelper) | ((i24 & 234881024) == 67108864);
                objM87133R = c28655q2.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    C1019g0 c1019g0 = new C1019g0(viewState, str4, str9, str10, viewModel, navigationRouter, analyticsHelper, interfaceC4339a3, 3);
                    c28655q2.m87172p0(c1019g0);
                    objM87133R = c1019g0;
                }
                c28655q = c28655q2;
                AbstractC17269i.m48886d(navController, "OVERVIEW", null, null, null, null, null, null, null, (Function1) objM87133R, c28655q, (i24 >> 9) & 14, 1020);
                str8 = str9;
                str7 = str10;
                interfaceC4339a2 = interfaceC4339a3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str7 = str6;
                str8 = str5;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3446h1(viewModel, navigationRouter, analyticsHelper, navController, viewState, str, str8, str7, interfaceC4339a2, i13, i14, 6);
            }
        }
        i15 |= 1572864;
        str5 = str2;
        i16 = i14 & 128;
        if (i16 != 0) {
            i15 |= 12582912;
            str6 = str3;
        } else {
            str6 = str3;
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87153g(str6)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i15 |= i17;
            }
        }
        i18 = i14 & 256;
        if (i18 != 0) {
            i15 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (c28655q2.m87157i(interfaceC4339a)) {
                i19 = 67108864;
            } else {
                i19 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 |= i19;
        }
        i24 = i15;
        if ((i24 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i24 & 1, z4)) {
            if (i26 != 0) {
                str9 = null;
            } else {
                str9 = str5;
            }
            if (i16 != 0) {
                str10 = null;
                i25 = i18;
            } else {
                i25 = i18;
                str10 = str6;
            }
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C31469a(7);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            if ((i24 & 57344) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i24 & 458752) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z19 = z13 | z14;
            if ((i24 & 3670016) == 1048576) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z110 = z19 | z15;
            if ((i24 & 29360128) == 8388608) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87157i = z110 | z16 | c28655q2.m87157i(viewModel) | c28655q2.m87157i(navigationRouter) | c28655q2.m87157i(analyticsHelper) | ((i24 & 234881024) == 67108864);
            objM87133R = c28655q2.m87133R();
            if (zM87157i) {
                C1019g0 c1019g1 = new C1019g0(viewState, str4, str9, str10, viewModel, navigationRouter, analyticsHelper, interfaceC4339a3, 3);
                c28655q2.m87172p0(c1019g1);
                objM87133R = c1019g1;
            } else {
                C1019g0 c1019g2 = new C1019g0(viewState, str4, str9, str10, viewModel, navigationRouter, analyticsHelper, interfaceC4339a3, 3);
                c28655q2.m87172p0(c1019g2);
                objM87133R = c1019g2;
            }
            c28655q = c28655q2;
            AbstractC17269i.m48886d(navController, "OVERVIEW", null, null, null, null, null, null, null, (Function1) objM87133R, c28655q, (i24 >> 9) & 14, 1020);
            str8 = str9;
            str7 = str10;
            interfaceC4339a2 = interfaceC4339a3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            str7 = str6;
            str8 = str5;
            interfaceC4339a2 = interfaceC4339a;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3446h1(viewModel, navigationRouter, analyticsHelper, navController, viewState, str, str8, str7, interfaceC4339a2, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m97750m() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m97751n(AbstractC32807c0 abstractC32807c0, String str, String str2, String str3, C32805b0 c32805b0, C31637i c31637i, C39673b c39673b, InterfaceC4339a interfaceC4339a, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36290t(NavHost, "OVERVIEW", null, null, null, null, null, new C37816b(new C18707y0(abstractC32807c0, str, str2, str3, c32805b0, c31637i, c39673b, interfaceC4339a), true, 40128364), 254);
        C12974m c12974m = new C12974m();
        m97756s(c12974m);
        AbstractC12889b.m36290t(NavHost, "SYMPTOMS?analyticsSource={analyticsSource}", AbstractC37056f.m118958J(new C12953f("analyticsSource", c12974m.f44811a.m36452a())), null, null, null, null, new C37816b(new C3403f(abstractC32807c0, c32805b0, c31637i, c39673b, 7), true, -596406827), 252);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m97752o(AbstractC32807c0 abstractC32807c0, String str, String str2, String str3, C32805b0 c32805b0, C31637i c31637i, C39673b c39673b, InterfaceC4339a interfaceC4339a, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c32805b0);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C31632d(c32805b0, 0);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function1 = (Function1) objM87133R;
        boolean zM87157i2 = c28655q.m87157i(c31637i);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C31633e(c31637i, 0);
            c28655q.m87172p0(objM87133R2);
        }
        Function1 function2 = (Function1) objM87133R2;
        boolean zM87157i3 = c28655q.m87157i(c39673b);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C31631c(c39673b, 1);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC36243r.m115522c0(abstractC32807c0, str, str2, str3, function1, function2, (Function1) objM87133R3, interfaceC4339a, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m97753p(C32805b0 c32805b0, AbstractC32803a0 it) {
        AbstractC22676k.m65750j(it, "it");
        c32805b0.m102909p(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m97754q(C31637i c31637i, Object it) {
        AbstractC22676k.m65750j(it, "it");
        c31637i.m97771a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m97755r(C39673b c39673b, AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        c39673b.m126872M(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final C23454a0 m97756s(C12974m navArgument) {
        AbstractC22676k.m65750j(navArgument, "$this$navArgument");
        navArgument.m36462b(AbstractC12958g1.f44770o);
        navArgument.m36461a("");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m97757t(AbstractC32807c0 abstractC32807c0, C32805b0 c32805b0, C31637i c31637i, C39673b c39673b, InterfaceC3764o composable, C12982q backStackEntry, Composer composer, int i13) {
        String string;
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
        Bundle bundleM36479a = backStackEntry.m36479a();
        String str = (bundleM36479a == null || (string = bundleM36479a.getString("analyticsSource")) == null || AbstractC39414r.m125890i0(string)) ? null : string;
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c32805b0);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C31632d(c32805b0, 1);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function1 = (Function1) objM87133R;
        boolean zM87157i2 = c28655q.m87157i(c31637i);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C31633e(c31637i, 1);
            c28655q.m87172p0(objM87133R2);
        }
        Function1 function2 = (Function1) objM87133R2;
        boolean zM87157i3 = c28655q.m87157i(c39673b);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C31631c(c39673b, 0);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC36245t.m115585m(abstractC32807c0, str, function1, function2, (Function1) objM87133R3, null, c28655q, 0, 32);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m97758u(C32805b0 c32805b0, AbstractC32803a0 it) {
        AbstractC22676k.m65750j(it, "it");
        c32805b0.m102909p(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m97759v(C31637i c31637i, AbstractC31635g it) {
        AbstractC22676k.m65750j(it, "it");
        c31637i.m97771a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m97760w(C39673b c39673b, AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        c39673b.m126872M(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m97761x(C32805b0 c32805b0, C31637i c31637i, C39673b c39673b, C12991u0 c12991u0, AbstractC32807c0 abstractC32807c0, String str, String str2, String str3, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m97749l(c32805b0, c31637i, c39673b, c12991u0, abstractC32807c0, str, str2, str3, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
