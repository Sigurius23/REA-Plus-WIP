package a01;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b61.AbstractC2756k;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8692a;
import com.whoop.navigation.C9598e;
import gb1.AbstractC15676d;
import gz0.EnumC16313m0;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import j71.C21395c;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C28503p;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import te0.AbstractC33745d;
import v21.AbstractC35584b;
import v21.C35585c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: a01.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aI\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "La01/h;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "g", "(Landroidx/compose/ui/Modifier;La01/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "sanitizedTitle", "Ll0/k1;", "contentPadding", "m", "(Landroidx/compose/ui/Modifier;La01/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ll0/k1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0087g {
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00df  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x011a  */
    /* JADX WARN: Code duplicated, block: B:75:0x012a  */
    /* JADX WARN: Code duplicated, block: B:76:0x016c  */
    /* JADX WARN: Code duplicated, block: B:78:0x018b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0196  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m220g(Modifier modifier, final C0088h viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        final Function1 function4;
        String strM21265c;
        Modifier modifierM44101d;
        boolean zM87157i;
        Object objM87133R;
        boolean zM87157i2;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1385958171);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C28503p(1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                strM21265c = AbstractC8692a.m21265c(viewState.getTitle());
                if (strM21265c == null) {
                    strM21265c = "";
                }
                modifierM44101d = AbstractC15676d.m44101d(modifier4, "BiomarkerCard_".concat(strM21265c));
                if (viewState.getInteraction() != null) {
                    c28655q.m87150e0(465952523);
                    zM87157i2 = c28655q.m87157i(viewState) | ((i15 & 896) == 256);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R2 == c28676v0) {
                        final int i18 = 0;
                        objM87133R2 = new InterfaceC4339a() { // from class: a01.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        return AbstractC0087g.m222i(function4, viewState);
                                    default:
                                        return AbstractC0087g.m223j(function4, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM44101d = AbstractC1092a.m3362g(modifierM44101d, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    c28655q.m87173q(false);
                } else if (viewState.getDestination() != null) {
                    c28655q.m87150e0(465955883);
                    zM87157i = c28655q.m87157i(viewState) | ((i15 & 896) == 256);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        final int i19 = 1;
                        objM87133R = new InterfaceC4339a() { // from class: a01.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        return AbstractC0087g.m222i(function4, viewState);
                                    default:
                                        return AbstractC0087g.m223j(function4, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    modifierM44101d = AbstractC1092a.m3362g(modifierM44101d, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(465957929);
                    c28655q.m87173q(false);
                }
                if (viewState.getUseTileBackground()) {
                    c28655q.m87150e0(1559866205);
                    AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, modifierM44101d), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(1371150214, c28655q, new C0084d(viewState, strM21265c, function4, 0)), c28655q, 12582912, 114);
                    c28655q.m87173q(false);
                    function3 = function4;
                } else {
                    c28655q.m87150e0(1560318681);
                    function3 = function4;
                    m226m(modifierM44101d, viewState, strM21265c, function3, null, c28655q, (i15 & 112) | ((i15 << 3) & 7168), 16);
                    c28655q.m87173q(false);
                }
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0085e(modifier3, viewState, function3, i13, i14, 0);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C28503p(1);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            strM21265c = AbstractC8692a.m21265c(viewState.getTitle());
            if (strM21265c == null) {
                strM21265c = "";
            }
            modifierM44101d = AbstractC15676d.m44101d(modifier4, "BiomarkerCard_".concat(strM21265c));
            if (viewState.getInteraction() != null) {
                c28655q.m87150e0(465952523);
                zM87157i2 = c28655q.m87157i(viewState) | ((i15 & 896) == 256);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i2) {
                    final int i110 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: a01.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i110) {
                                case 0:
                                    return AbstractC0087g.m222i(function4, viewState);
                                default:
                                    return AbstractC0087g.m223j(function4, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    final int i111 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: a01.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i111) {
                                case 0:
                                    return AbstractC0087g.m222i(function4, viewState);
                                default:
                                    return AbstractC0087g.m223j(function4, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                modifierM44101d = AbstractC1092a.m3362g(modifierM44101d, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                c28655q.m87173q(false);
            } else if (viewState.getDestination() != null) {
                c28655q.m87150e0(465955883);
                zM87157i = c28655q.m87157i(viewState) | ((i15 & 896) == 256);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    final int i112 = 1;
                    objM87133R = new InterfaceC4339a() { // from class: a01.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i112) {
                                case 0:
                                    return AbstractC0087g.m222i(function4, viewState);
                                default:
                                    return AbstractC0087g.m223j(function4, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    final int i113 = 1;
                    objM87133R = new InterfaceC4339a() { // from class: a01.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i113) {
                                case 0:
                                    return AbstractC0087g.m222i(function4, viewState);
                                default:
                                    return AbstractC0087g.m223j(function4, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                modifierM44101d = AbstractC1092a.m3362g(modifierM44101d, false, null, null, (InterfaceC4339a) objM87133R, 15);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(465957929);
                c28655q.m87173q(false);
            }
            if (viewState.getUseTileBackground()) {
                c28655q.m87150e0(1559866205);
                AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, modifierM44101d), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(1371150214, c28655q, new C0084d(viewState, strM21265c, function4, 0)), c28655q, 12582912, 114);
                c28655q.m87173q(false);
                function3 = function4;
            } else {
                c28655q.m87150e0(1560318681);
                function3 = function4;
                m226m(modifierM44101d, viewState, strM21265c, function3, null, c28655q, (i15 & 112) | ((i15 << 3) & 7168), 16);
                c28655q.m87173q(false);
            }
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(modifier3, viewState, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m221h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m222i(Function1 function1, C0088h c0088h) {
        function1.invoke(c0088h.getInteraction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m223j(Function1 function1, C0088h c0088h) {
        function1.invoke(c0088h.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m224k(C0088h c0088h, String str, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = ((float) 1.5d) * 8;
            m226m(null, c0088h, str, function1, new C22976l1(f13, f13, f13, f13), c28655q, 24576, 1);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m225l(Modifier modifier, C0088h c0088h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m220g(modifier, c0088h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:105:0x0253  */
    /* JADX WARN: Code duplicated, block: B:107:0x025e  */
    /* JADX WARN: Code duplicated, block: B:110:0x02af  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:121:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:122:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:125:0x0307  */
    /* JADX WARN: Code duplicated, block: B:127:0x0315  */
    /* JADX WARN: Code duplicated, block: B:130:0x0359  */
    /* JADX WARN: Code duplicated, block: B:131:0x035d  */
    /* JADX WARN: Code duplicated, block: B:134:0x036a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0378  */
    /* JADX WARN: Code duplicated, block: B:139:0x041d  */
    /* JADX WARN: Code duplicated, block: B:140:0x042a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0495  */
    /* JADX WARN: Code duplicated, block: B:144:0x049f  */
    /* JADX WARN: Code duplicated, block: B:147:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:148:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:151:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:152:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:155:0x054b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0566  */
    /* JADX WARN: Code duplicated, block: B:159:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:160:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:162:0x0603  */
    /* JADX WARN: Code duplicated, block: B:163:0x0607  */
    /* JADX WARN: Code duplicated, block: B:166:0x0614  */
    /* JADX WARN: Code duplicated, block: B:168:0x0622  */
    /* JADX WARN: Code duplicated, block: B:171:0x062e  */
    /* JADX WARN: Code duplicated, block: B:172:0x063b  */
    /* JADX WARN: Code duplicated, block: B:175:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:178:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x0122  */
    /* JADX WARN: Code duplicated, block: B:82:0x0126  */
    /* JADX WARN: Code duplicated, block: B:85:0x0139  */
    /* JADX WARN: Code duplicated, block: B:88:0x014a  */
    /* JADX WARN: Code duplicated, block: B:92:0x017c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0182  */
    /* JADX WARN: Code duplicated, block: B:96:0x0191  */
    /* JADX WARN: Code duplicated, block: B:98:0x019f  */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x042a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:148:0x04c0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:152:0x04f0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:156:0x0566, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:160:0x05bf, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m */
    private static final void m226m(Modifier modifier, C0088h c0088h, String str, Function1 function1, InterfaceC22973k1 interfaceC22973k1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C0088h c0088h2;
        String str2;
        InterfaceC22973k1 interfaceC22973k2;
        boolean z4;
        Modifier modifier3;
        String str3;
        InterfaceC22973k1 interfaceC22973k3;
        C28677v1 c28677v1M87180u;
        int i16;
        C2314t c2314t;
        String strM21265c;
        String str4;
        Modifier modifier4;
        int i17;
        InterfaceC22973k1 c22976l1;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        Modifier modifier5;
        C0209i c0209i4;
        C22949e c22949e;
        int iHashCode2;
        C0213j c0213j2;
        C38072d c38072d;
        C2314t c2314t2;
        String str5;
        EnumC16313m0 enumC16313m0M233g;
        C2306l c2306l;
        int iHashCode3;
        int iHashCode4;
        float f13;
        float f14;
        float f15;
        int iHashCode5;
        float f16;
        C0213j c0213j3;
        C28655q c28655q;
        String strM240n;
        boolean z13;
        C17731c2 c17731c2M239m;
        C0094n c0094nM236j;
        C21395c c21395cM232f;
        C35585c c35585cM235i;
        boolean z14;
        C38072d c38072d2;
        int i18;
        C28655q c28655q2;
        C0081a c0081aM231e;
        int iHashCode6;
        EnumC16313m0 icon;
        int i19;
        C28655q c28655q3;
        boolean z15;
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-38707624);
        int i24 = i14 & 1;
        if (i24 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q4.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            c0088h2 = c0088h;
            i15 |= c28655q4.m87157i(c0088h2) ? 32 : 16;
        } else {
            c0088h2 = c0088h;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                str2 = str;
                int i25 = c28655q4.m87153g(str2) ? 256 : 128;
                i15 |= i25;
            } else {
                str2 = str;
            }
            i15 |= i25;
        } else {
            str2 = str;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q4.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i26 = i14 & 16;
        if (i26 == 0) {
            if ((i13 & 24576) == 0) {
                interfaceC22973k2 = interfaceC22973k1;
                i15 |= c28655q4.m87153g(interfaceC22973k2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z4)) {
                c28655q4.m87140Z();
                i16 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i16 != 0 || c28655q4.m87118C()) {
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 4) != 0) {
                        strM21265c = AbstractC8692a.m21265c(c0088h2.getTitle());
                        if (strM21265c == null) {
                            strM21265c = "";
                        }
                        i15 &= -897;
                    } else {
                        strM21265c = str2;
                    }
                    if (i26 != 0) {
                        float f17 = 0;
                        Modifier modifier6 = modifier2;
                        str4 = strM21265c;
                        modifier4 = modifier6;
                        i17 = i15;
                        c22976l1 = new C22976l1(f17, f17, f17, f17);
                    } else {
                        Modifier modifier7 = modifier2;
                        str4 = strM21265c;
                        modifier4 = modifier7;
                        i17 = i15;
                    }
                    c28655q4.m87175r();
                    Modifier modifierM3393o = AbstractC1099a.m3393o(c22976l1, AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3));
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3393o);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        modifier5 = modifier4;
                    } else {
                        modifier5 = modifier4;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        c22949e = AbstractC22977m.f90650a;
                        InterfaceC22973k1 interfaceC22973k4 = c22976l1;
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q4, 0);
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c0213j2 = c0213j;
                            c28655q4.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m2);
                        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
                        String strM238l = c0088h.getTitle();
                        c38072d = C38072d.f163053a;
                        long brandWhite = c38072d.m121949b(c28655q4, 6).getBrandWhite();
                        C2886a b6 = c38072d.m121952e(c28655q4, 6).getB1();
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        c2314t2 = c2314t;
                        str5 = str4;
                        AbstractC30795n.m94707h(strM238l, AbstractC15676d.m44101d(AbstractC11895b.m31988g(modifierM3409f2, true, 1.0f), "BiomarkerCard_Title_" + str4), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q4, 0, 0, 196600);
                        enumC16313m0M233g = c0088h.getIcon();
                        if (enumC16313m0M233g == null) {
                            c28655q4.m87150e0(1074325066);
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(1074325067);
                            float f18 = 4;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M233g.toWhoopIcon(), c28655q4, 6), null, AbstractC1102d.m3419p(f18 * f18, c2314t2), c38072d.m121949b(c28655q4, 6).getBrandWhite(), c28655q4, 432, 0);
                            c28655q4.m87173q(false);
                        }
                        c28655q4.m87173q(true);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                        c2306l = C2299e.f9108K;
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
                        iHashCode3 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3409f3);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j2);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m3);
                        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N3);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
                        iHashCode4 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, c2314t2);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j2);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N4);
                        f13 = 1;
                        f14 = 8;
                        f15 = f13 * f14;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3428y(c2314t2, null, false, 3), 0.0f, f15, 0.0f, 0.0f, 13);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, C2299e.f9109L, c28655q4, 48);
                        iHashCode5 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j2);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m5);
                        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode5))) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N5);
                        f16 = ((float) 0.5d) * f14;
                        c0213j3 = c0213j2;
                        AbstractC30795n.m94707h(c0088h.getValue(), AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f16, 0.0f, 11), "BiomarkerCard_Value_" + str5), c38072d.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getN5(), null, c28655q4, 0, 0, 196600);
                        c28655q = c28655q4;
                        strM240n = c0088h.getUnit();
                        if (strM240n == null) {
                            c28655q.m87150e0(-1888826267);
                            z13 = false;
                            c28655q.m87173q(false);
                        } else {
                            long jM73370c = AbstractC25012a.m73370c(c28655q, -1888826266, c38072d, c28655q, 6);
                            C2886a b8 = c38072d.m121952e(c28655q, 6).getB1();
                            Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f13, 7), "BiomarkerCard_Unit_" + str5);
                            c2314t2 = c2314t2;
                            AbstractC30795n.m94707h(strM240n, modifierM44101d, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b8, null, c28655q, 0, 0, 196600);
                            c28655q = c28655q;
                            z13 = false;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c17731c2M239m = c0088h.getTrend();
                        if (c17731c2M239m == null) {
                            c28655q.m87150e0(-1863631681);
                            c28655q.m87173q(z13);
                        } else {
                            AbstractC33745d.m106667z(c28655q, -1863631680, c2314t2, f16, c28655q);
                            AbstractC17808z1.m51175c(c17731c2M239m, c28655q, C9598e.f28134d);
                            c28655q.m87173q(z13);
                        }
                        c28655q.m87173q(true);
                        c0094nM236j = c0088h.getRangeMeter();
                        if (c0094nM236j == null) {
                            c28655q.m87150e0(-641832376);
                            c28655q.m87173q(z13);
                        } else {
                            c28655q.m87150e0(-641832375);
                            AbstractC0092l.m247e(c0094nM236j, AbstractC15676d.m44101d(c2314t2, "BiomarkerCard_RangeMeter_" + str5), c28655q, z13 ? 1 : 0, z13 ? 1 : 0);
                            c28655q.m87173q(z13);
                        }
                        c21395cM232f = c0088h.getGraph();
                        if (c21395cM232f == null) {
                            c28655q.m87150e0(-641590080);
                            c28655q.m87173q(z13);
                        } else {
                            c28655q.m87150e0(-641590079);
                            float f19 = 4;
                            C28655q c28655q5 = c28655q;
                            AbstractC2756k.m7799p(AbstractC15676d.m44101d(AbstractC1099a.m3396r(AbstractC1102d.m3411h(13 * f19, AbstractC1102d.m3424u(22 * f19, c2314t2)), ((float) 1.5d) * f14, 0.0f, 2), "BiomarkerCard_Graph_" + str5), c21395cM232f, null, null, false, null, function1, c28655q5, (i17 << 9) & 3670016, 60);
                            c28655q = c28655q5;
                            z13 = false;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c35585cM235i = c0088h.getMiniCallout();
                        if (c35585cM235i == null) {
                            c28655q.m87150e0(1558751209);
                            c28655q.m87173q(z13);
                            c38072d2 = c38072d;
                            z14 = z13;
                            c28655q2 = c28655q;
                            i18 = 2;
                        } else {
                            c28655q.m87150e0(1558751210);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * f14, c2314t2));
                            z14 = z13;
                            c38072d2 = c38072d;
                            i18 = 2;
                            c28655q2 = c28655q;
                            AbstractC35584b.m112780g(AbstractC15676d.m44101d(c2314t2, "BiomarkerCard_MiniCallout_" + str5), c35585cM235i, function1, c28655q2, (i17 >> 3) & 896, 0);
                            c28655q2.m87173q(z14);
                        }
                        c0081aM231e = c0088h.getDisclaimer();
                        if (c0081aM231e == null) {
                            c28655q2.m87150e0(1559131579);
                            c28655q2.m87173q(z14);
                            c28655q4 = c28655q2;
                            z15 = true;
                        } else {
                            c28655q2.m87150e0(1559131580);
                            Modifier modifierM44101d2 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, i18 * f14, 0.0f, 0.0f, 13), "BiomarkerCard_Disclaimer_" + r0);
                            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, 48);
                            iHashCode6 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM44101d2);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j3);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a4);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m6);
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode6))) {
                                AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N6);
                            icon = c0081aM231e.getIcon();
                            if (icon == null) {
                                c28655q2.m87150e0(-1622175878);
                                c28655q2.m87173q(z14);
                                c28655q3 = c28655q2;
                                i19 = 6;
                            } else {
                                c28655q2.m87150e0(-1622175877);
                                i19 = 6;
                                c28655q3 = c28655q2;
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(3 * 4, AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f15, 0.0f, 11)), c38072d2.m121949b(c28655q2, 6).getBrandWhite(), c28655q3, 432, 0);
                                c28655q3.m87173q(z14);
                            }
                            C28655q c28655q6 = c28655q3;
                            AbstractC30795n.m94707h(c0088h.getDisclaimer().getText(), null, c38072d2.m121949b(c28655q3, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i19).getB4(), null, c28655q6, 0, 0, 196602);
                            c28655q4 = c28655q6;
                            z15 = true;
                            c28655q4.m87173q(true);
                            c28655q4.m87173q(z14);
                        }
                        c28655q4.m87173q(z15);
                        modifier3 = modifier5;
                        interfaceC22973k3 = interfaceC22973k4;
                        str3 = str5;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                    c22949e = AbstractC22977m.f90650a;
                    InterfaceC22973k1 interfaceC22973k5 = c22976l1;
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q4, 0);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM3409f4);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c0213j2 = c0213j;
                        c28655q4.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m7);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N7);
                    String strM238l2 = c0088h.getTitle();
                    c38072d = C38072d.f163053a;
                    long brandWhite2 = c38072d.m121949b(c28655q4, 6).getBrandWhite();
                    C2886a b14 = c38072d.m121952e(c28655q4, 6).getB1();
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    c2314t2 = c2314t;
                    str5 = str4;
                    AbstractC30795n.m94707h(strM238l2, AbstractC15676d.m44101d(AbstractC11895b.m31988g(modifierM3409f5, true, 1.0f), "BiomarkerCard_Title_" + str4), brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b14, null, c28655q4, 0, 0, 196600);
                    enumC16313m0M233g = c0088h.getIcon();
                    if (enumC16313m0M233g == null) {
                        c28655q4.m87150e0(1074325066);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(1074325067);
                        float f110 = 4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M233g.toWhoopIcon(), c28655q4, 6), null, AbstractC1102d.m3419p(f110 * f110, c2314t2), c38072d.m121949b(c28655q4, 6).getBrandWhite(), c28655q4, 432, 0);
                        c28655q4.m87173q(false);
                    }
                    c28655q4.m87173q(true);
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    c2306l = C2299e.f9108K;
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q4.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q4, modifierM3409f6);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j2);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m8);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N8);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
                    iHashCode4 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q4.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q4, c2314t2);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j2);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m9);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N9);
                    f13 = 1;
                    f14 = 8;
                    f15 = f13 * f14;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3428y(c2314t2, null, false, 3), 0.0f, f15, 0.0f, 0.0f, 13);
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22949e, C2299e.f9109L, c28655q4, 48);
                    iHashCode5 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q4.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q4, modifierM3398t2);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j2);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m10);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N10);
                    f16 = ((float) 0.5d) * f14;
                    c0213j3 = c0213j2;
                    AbstractC30795n.m94707h(c0088h.getValue(), AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f16, 0.0f, 11), "BiomarkerCard_Value_" + str5), c38072d.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getN5(), null, c28655q4, 0, 0, 196600);
                    c28655q = c28655q4;
                    strM240n = c0088h.getUnit();
                    if (strM240n == null) {
                        c28655q.m87150e0(-1888826267);
                        z13 = false;
                        c28655q.m87173q(false);
                    } else {
                        long jM73370c2 = AbstractC25012a.m73370c(c28655q, -1888826266, c38072d, c28655q, 6);
                        C2886a b15 = c38072d.m121952e(c28655q, 6).getB1();
                        Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f13, 7), "BiomarkerCard_Unit_" + str5);
                        c2314t2 = c2314t2;
                        AbstractC30795n.m94707h(strM240n, modifierM44101d3, jM73370c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b15, null, c28655q, 0, 0, 196600);
                        c28655q = c28655q;
                        z13 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c17731c2M239m = c0088h.getTrend();
                    if (c17731c2M239m == null) {
                        c28655q.m87150e0(-1863631681);
                        c28655q.m87173q(z13);
                    } else {
                        AbstractC33745d.m106667z(c28655q, -1863631680, c2314t2, f16, c28655q);
                        AbstractC17808z1.m51175c(c17731c2M239m, c28655q, C9598e.f28134d);
                        c28655q.m87173q(z13);
                    }
                    c28655q.m87173q(true);
                    c0094nM236j = c0088h.getRangeMeter();
                    if (c0094nM236j == null) {
                        c28655q.m87150e0(-641832376);
                        c28655q.m87173q(z13);
                    } else {
                        c28655q.m87150e0(-641832375);
                        AbstractC0092l.m247e(c0094nM236j, AbstractC15676d.m44101d(c2314t2, "BiomarkerCard_RangeMeter_" + str5), c28655q, z13 ? 1 : 0, z13 ? 1 : 0);
                        c28655q.m87173q(z13);
                    }
                    c21395cM232f = c0088h.getGraph();
                    if (c21395cM232f == null) {
                        c28655q.m87150e0(-641590080);
                        c28655q.m87173q(z13);
                    } else {
                        c28655q.m87150e0(-641590079);
                        float f111 = 4;
                        C28655q c28655q7 = c28655q;
                        AbstractC2756k.m7799p(AbstractC15676d.m44101d(AbstractC1099a.m3396r(AbstractC1102d.m3411h(13 * f111, AbstractC1102d.m3424u(22 * f111, c2314t2)), ((float) 1.5d) * f14, 0.0f, 2), "BiomarkerCard_Graph_" + str5), c21395cM232f, null, null, false, null, function1, c28655q7, (i17 << 9) & 3670016, 60);
                        c28655q = c28655q7;
                        z13 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c35585cM235i = c0088h.getMiniCallout();
                    if (c35585cM235i == null) {
                        c28655q.m87150e0(1558751209);
                        c28655q.m87173q(z13);
                        c38072d2 = c38072d;
                        z14 = z13;
                        c28655q2 = c28655q;
                        i18 = 2;
                    } else {
                        c28655q.m87150e0(1558751210);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * f14, c2314t2));
                        z14 = z13;
                        c38072d2 = c38072d;
                        i18 = 2;
                        c28655q2 = c28655q;
                        AbstractC35584b.m112780g(AbstractC15676d.m44101d(c2314t2, "BiomarkerCard_MiniCallout_" + str5), c35585cM235i, function1, c28655q2, (i17 >> 3) & 896, 0);
                        c28655q2.m87173q(z14);
                    }
                    c0081aM231e = c0088h.getDisclaimer();
                    if (c0081aM231e == null) {
                        c28655q2.m87150e0(1559131579);
                        c28655q2.m87173q(z14);
                        c28655q4 = c28655q2;
                        z15 = true;
                    } else {
                        c28655q2.m87150e0(1559131580);
                        Modifier modifierM44101d4 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, i18 * f14, 0.0f, 0.0f, 13), "BiomarkerCard_Disclaimer_" + r0);
                        C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, 48);
                        iHashCode6 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM44101d4);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j3);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a8);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11);
                        icon = c0081aM231e.getIcon();
                        if (icon == null) {
                            c28655q2.m87150e0(-1622175878);
                            c28655q2.m87173q(z14);
                            c28655q3 = c28655q2;
                            i19 = 6;
                        } else {
                            c28655q2.m87150e0(-1622175877);
                            i19 = 6;
                            c28655q3 = c28655q2;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(3 * 4, AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f15, 0.0f, 11)), c38072d2.m121949b(c28655q2, 6).getBrandWhite(), c28655q3, 432, 0);
                            c28655q3.m87173q(z14);
                        }
                        C28655q c28655q8 = c28655q3;
                        AbstractC30795n.m94707h(c0088h.getDisclaimer().getText(), null, c38072d2.m121949b(c28655q3, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i19).getB4(), null, c28655q8, 0, 0, 196602);
                        c28655q4 = c28655q8;
                        z15 = true;
                        c28655q4.m87173q(true);
                        c28655q4.m87173q(z14);
                    }
                    c28655q4.m87173q(z15);
                    modifier3 = modifier5;
                    interfaceC22973k3 = interfaceC22973k5;
                    str3 = str5;
                } else {
                    c28655q4.m87138X();
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                    modifier4 = modifier2;
                    i17 = i15;
                    str4 = str2;
                }
                c22976l1 = interfaceC22973k2;
                c28655q4.m87175r();
                Modifier modifierM3393o2 = AbstractC1099a.m3393o(c22976l1, AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3));
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q4.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q4, modifierM3393o2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a4);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m12);
                c0209i3 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    modifier5 = modifier4;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N12);
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                    c22949e = AbstractC22977m.f90650a;
                    InterfaceC22973k1 interfaceC22973k6 = c22976l1;
                    C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q4, 0);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q4.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q4, modifierM3409f7);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c0213j2 = c0213j;
                        c28655q4.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a9);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m13);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N13);
                    String strM238l3 = c0088h.getTitle();
                    c38072d = C38072d.f163053a;
                    long brandWhite3 = c38072d.m121949b(c28655q4, 6).getBrandWhite();
                    C2886a b16 = c38072d.m121952e(c28655q4, 6).getB1();
                    Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    c2314t2 = c2314t;
                    str5 = str4;
                    AbstractC30795n.m94707h(strM238l3, AbstractC15676d.m44101d(AbstractC11895b.m31988g(modifierM3409f8, true, 1.0f), "BiomarkerCard_Title_" + str4), brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b16, null, c28655q4, 0, 0, 196600);
                    enumC16313m0M233g = c0088h.getIcon();
                    if (enumC16313m0M233g == null) {
                        c28655q4.m87150e0(1074325066);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(1074325067);
                        float f112 = 4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M233g.toWhoopIcon(), c28655q4, 6), null, AbstractC1102d.m3419p(f112 * f112, c2314t2), c38072d.m121949b(c28655q4, 6).getBrandWhite(), c28655q4, 432, 0);
                        c28655q4.m87173q(false);
                    }
                    c28655q4.m87173q(true);
                    Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    c2306l = C2299e.f9108K;
                    C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q4.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q4, modifierM3409f9);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j2);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a10);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m14);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N14);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q4, 0);
                    iHashCode4 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q4.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q4, c2314t2);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j2);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m15);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N15);
                    f13 = 1;
                    f14 = 8;
                    f15 = f13 * f14;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3428y(c2314t2, null, false, 3), 0.0f, f15, 0.0f, 0.0f, 13);
                    C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(c22949e, C2299e.f9109L, c28655q4, 48);
                    iHashCode5 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q4.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q4, modifierM3398t3);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j2);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a11);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m16);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N16);
                    f16 = ((float) 0.5d) * f14;
                    c0213j3 = c0213j2;
                    AbstractC30795n.m94707h(c0088h.getValue(), AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f16, 0.0f, 11), "BiomarkerCard_Value_" + str5), c38072d.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getN5(), null, c28655q4, 0, 0, 196600);
                    c28655q = c28655q4;
                    strM240n = c0088h.getUnit();
                    if (strM240n == null) {
                        c28655q.m87150e0(-1888826267);
                        z13 = false;
                        c28655q.m87173q(false);
                    } else {
                        long jM73370c3 = AbstractC25012a.m73370c(c28655q, -1888826266, c38072d, c28655q, 6);
                        C2886a b17 = c38072d.m121952e(c28655q, 6).getB1();
                        Modifier modifierM44101d5 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f13, 7), "BiomarkerCard_Unit_" + str5);
                        c2314t2 = c2314t2;
                        AbstractC30795n.m94707h(strM240n, modifierM44101d5, jM73370c3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b17, null, c28655q, 0, 0, 196600);
                        c28655q = c28655q;
                        z13 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c17731c2M239m = c0088h.getTrend();
                    if (c17731c2M239m == null) {
                        c28655q.m87150e0(-1863631681);
                        c28655q.m87173q(z13);
                    } else {
                        AbstractC33745d.m106667z(c28655q, -1863631680, c2314t2, f16, c28655q);
                        AbstractC17808z1.m51175c(c17731c2M239m, c28655q, C9598e.f28134d);
                        c28655q.m87173q(z13);
                    }
                    c28655q.m87173q(true);
                    c0094nM236j = c0088h.getRangeMeter();
                    if (c0094nM236j == null) {
                        c28655q.m87150e0(-641832376);
                        c28655q.m87173q(z13);
                    } else {
                        c28655q.m87150e0(-641832375);
                        AbstractC0092l.m247e(c0094nM236j, AbstractC15676d.m44101d(c2314t2, "BiomarkerCard_RangeMeter_" + str5), c28655q, z13 ? 1 : 0, z13 ? 1 : 0);
                        c28655q.m87173q(z13);
                    }
                    c21395cM232f = c0088h.getGraph();
                    if (c21395cM232f == null) {
                        c28655q.m87150e0(-641590080);
                        c28655q.m87173q(z13);
                    } else {
                        c28655q.m87150e0(-641590079);
                        float f113 = 4;
                        C28655q c28655q9 = c28655q;
                        AbstractC2756k.m7799p(AbstractC15676d.m44101d(AbstractC1099a.m3396r(AbstractC1102d.m3411h(13 * f113, AbstractC1102d.m3424u(22 * f113, c2314t2)), ((float) 1.5d) * f14, 0.0f, 2), "BiomarkerCard_Graph_" + str5), c21395cM232f, null, null, false, null, function1, c28655q9, (i17 << 9) & 3670016, 60);
                        c28655q = c28655q9;
                        z13 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c35585cM235i = c0088h.getMiniCallout();
                    if (c35585cM235i == null) {
                        c28655q.m87150e0(1558751209);
                        c28655q.m87173q(z13);
                        c38072d2 = c38072d;
                        z14 = z13;
                        c28655q2 = c28655q;
                        i18 = 2;
                    } else {
                        c28655q.m87150e0(1558751210);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * f14, c2314t2));
                        z14 = z13;
                        c38072d2 = c38072d;
                        i18 = 2;
                        c28655q2 = c28655q;
                        AbstractC35584b.m112780g(AbstractC15676d.m44101d(c2314t2, "BiomarkerCard_MiniCallout_" + str5), c35585cM235i, function1, c28655q2, (i17 >> 3) & 896, 0);
                        c28655q2.m87173q(z14);
                    }
                    c0081aM231e = c0088h.getDisclaimer();
                    if (c0081aM231e == null) {
                        c28655q2.m87150e0(1559131579);
                        c28655q2.m87173q(z14);
                        c28655q4 = c28655q2;
                        z15 = true;
                    } else {
                        c28655q2.m87150e0(1559131580);
                        Modifier modifierM44101d6 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, i18 * f14, 0.0f, 0.0f, 13), "BiomarkerCard_Disclaimer_" + r0);
                        C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, 48);
                        iHashCode6 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM44101d6);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j3);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a12);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m17);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N17);
                        icon = c0081aM231e.getIcon();
                        if (icon == null) {
                            c28655q2.m87150e0(-1622175878);
                            c28655q2.m87173q(z14);
                            c28655q3 = c28655q2;
                            i19 = 6;
                        } else {
                            c28655q2.m87150e0(-1622175877);
                            i19 = 6;
                            c28655q3 = c28655q2;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(3 * 4, AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f15, 0.0f, 11)), c38072d2.m121949b(c28655q2, 6).getBrandWhite(), c28655q3, 432, 0);
                            c28655q3.m87173q(z14);
                        }
                        C28655q c28655q10 = c28655q3;
                        AbstractC30795n.m94707h(c0088h.getDisclaimer().getText(), null, c38072d2.m121949b(c28655q3, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i19).getB4(), null, c28655q10, 0, 0, 196602);
                        c28655q4 = c28655q10;
                        z15 = true;
                        c28655q4.m87173q(true);
                        c28655q4.m87173q(z14);
                    }
                    c28655q4.m87173q(z15);
                    modifier3 = modifier5;
                    interfaceC22973k3 = interfaceC22973k6;
                    str3 = str5;
                } else {
                    modifier5 = modifier4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N12);
                Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t);
                c22949e = AbstractC22977m.f90650a;
                InterfaceC22973k1 interfaceC22973k7 = c22976l1;
                C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q4, 0);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q4.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q4, modifierM3409f10);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c0213j2 = c0213j;
                    c28655q4.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a13);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m18);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N18);
                String strM238l4 = c0088h.getTitle();
                c38072d = C38072d.f163053a;
                long brandWhite4 = c38072d.m121949b(c28655q4, 6).getBrandWhite();
                C2886a b18 = c38072d.m121952e(c28655q4, 6).getB1();
                Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                c2314t2 = c2314t;
                str5 = str4;
                AbstractC30795n.m94707h(strM238l4, AbstractC15676d.m44101d(AbstractC11895b.m31988g(modifierM3409f11, true, 1.0f), "BiomarkerCard_Title_" + str4), brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b18, null, c28655q4, 0, 0, 196600);
                enumC16313m0M233g = c0088h.getIcon();
                if (enumC16313m0M233g == null) {
                    c28655q4.m87150e0(1074325066);
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(1074325067);
                    float f114 = 4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M233g.toWhoopIcon(), c28655q4, 6), null, AbstractC1102d.m3419p(f114 * f114, c2314t2), c38072d.m121949b(c28655q4, 6).getBrandWhite(), c28655q4, 432, 0);
                    c28655q4.m87173q(false);
                }
                c28655q4.m87173q(true);
                Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t2);
                c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q4.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q4, modifierM3409f12);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a14);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m19);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N19);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q4, 0);
                iHashCode4 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q4.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q4, c2314t2);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m110);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N110);
                f13 = 1;
                f14 = 8;
                f15 = f13 * f14;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3428y(c2314t2, null, false, 3), 0.0f, f15, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(c22949e, C2299e.f9109L, c28655q4, 48);
                iHashCode5 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q4.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q4, modifierM3398t4);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a15);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m111);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N111);
                f16 = ((float) 0.5d) * f14;
                c0213j3 = c0213j2;
                AbstractC30795n.m94707h(c0088h.getValue(), AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f16, 0.0f, 11), "BiomarkerCard_Value_" + str5), c38072d.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getN5(), null, c28655q4, 0, 0, 196600);
                c28655q = c28655q4;
                strM240n = c0088h.getUnit();
                if (strM240n == null) {
                    c28655q.m87150e0(-1888826267);
                    z13 = false;
                    c28655q.m87173q(false);
                } else {
                    long jM73370c4 = AbstractC25012a.m73370c(c28655q, -1888826266, c38072d, c28655q, 6);
                    C2886a b19 = c38072d.m121952e(c28655q, 6).getB1();
                    Modifier modifierM44101d7 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f13, 7), "BiomarkerCard_Unit_" + str5);
                    c2314t2 = c2314t2;
                    AbstractC30795n.m94707h(strM240n, modifierM44101d7, jM73370c4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b19, null, c28655q, 0, 0, 196600);
                    c28655q = c28655q;
                    z13 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c17731c2M239m = c0088h.getTrend();
                if (c17731c2M239m == null) {
                    c28655q.m87150e0(-1863631681);
                    c28655q.m87173q(z13);
                } else {
                    AbstractC33745d.m106667z(c28655q, -1863631680, c2314t2, f16, c28655q);
                    AbstractC17808z1.m51175c(c17731c2M239m, c28655q, C9598e.f28134d);
                    c28655q.m87173q(z13);
                }
                c28655q.m87173q(true);
                c0094nM236j = c0088h.getRangeMeter();
                if (c0094nM236j == null) {
                    c28655q.m87150e0(-641832376);
                    c28655q.m87173q(z13);
                } else {
                    c28655q.m87150e0(-641832375);
                    AbstractC0092l.m247e(c0094nM236j, AbstractC15676d.m44101d(c2314t2, "BiomarkerCard_RangeMeter_" + str5), c28655q, z13 ? 1 : 0, z13 ? 1 : 0);
                    c28655q.m87173q(z13);
                }
                c21395cM232f = c0088h.getGraph();
                if (c21395cM232f == null) {
                    c28655q.m87150e0(-641590080);
                    c28655q.m87173q(z13);
                } else {
                    c28655q.m87150e0(-641590079);
                    float f115 = 4;
                    C28655q c28655q11 = c28655q;
                    AbstractC2756k.m7799p(AbstractC15676d.m44101d(AbstractC1099a.m3396r(AbstractC1102d.m3411h(13 * f115, AbstractC1102d.m3424u(22 * f115, c2314t2)), ((float) 1.5d) * f14, 0.0f, 2), "BiomarkerCard_Graph_" + str5), c21395cM232f, null, null, false, null, function1, c28655q11, (i17 << 9) & 3670016, 60);
                    c28655q = c28655q11;
                    z13 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c35585cM235i = c0088h.getMiniCallout();
                if (c35585cM235i == null) {
                    c28655q.m87150e0(1558751209);
                    c28655q.m87173q(z13);
                    c38072d2 = c38072d;
                    z14 = z13;
                    c28655q2 = c28655q;
                    i18 = 2;
                } else {
                    c28655q.m87150e0(1558751210);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * f14, c2314t2));
                    z14 = z13;
                    c38072d2 = c38072d;
                    i18 = 2;
                    c28655q2 = c28655q;
                    AbstractC35584b.m112780g(AbstractC15676d.m44101d(c2314t2, "BiomarkerCard_MiniCallout_" + str5), c35585cM235i, function1, c28655q2, (i17 >> 3) & 896, 0);
                    c28655q2.m87173q(z14);
                }
                c0081aM231e = c0088h.getDisclaimer();
                if (c0081aM231e == null) {
                    c28655q2.m87150e0(1559131579);
                    c28655q2.m87173q(z14);
                    c28655q4 = c28655q2;
                    z15 = true;
                } else {
                    c28655q2.m87150e0(1559131580);
                    Modifier modifierM44101d8 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, i18 * f14, 0.0f, 0.0f, 13), "BiomarkerCard_Disclaimer_" + r0);
                    C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, 48);
                    iHashCode6 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierM44101d8);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j3);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a16);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m112);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N112);
                    icon = c0081aM231e.getIcon();
                    if (icon == null) {
                        c28655q2.m87150e0(-1622175878);
                        c28655q2.m87173q(z14);
                        c28655q3 = c28655q2;
                        i19 = 6;
                    } else {
                        c28655q2.m87150e0(-1622175877);
                        i19 = 6;
                        c28655q3 = c28655q2;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(3 * 4, AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f15, 0.0f, 11)), c38072d2.m121949b(c28655q2, 6).getBrandWhite(), c28655q3, 432, 0);
                        c28655q3.m87173q(z14);
                    }
                    C28655q c28655q12 = c28655q3;
                    AbstractC30795n.m94707h(c0088h.getDisclaimer().getText(), null, c38072d2.m121949b(c28655q3, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i19).getB4(), null, c28655q12, 0, 0, 196602);
                    c28655q4 = c28655q12;
                    z15 = true;
                    c28655q4.m87173q(true);
                    c28655q4.m87173q(z14);
                }
                c28655q4.m87173q(z15);
                modifier3 = modifier5;
                interfaceC22973k3 = interfaceC22973k7;
                str3 = str5;
            } else {
                c28655q4.m87138X();
                modifier3 = modifier2;
                str3 = str2;
                interfaceC22973k3 = interfaceC22973k2;
            }
            c28677v1M87180u = c28655q4.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(modifier3, c0088h, str3, function1, interfaceC22973k3, i13, i14, 0);
            }
        }
        i15 |= 24576;
        interfaceC22973k2 = interfaceC22973k1;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z4)) {
            c28655q4.m87140Z();
            i16 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    strM21265c = AbstractC8692a.m21265c(c0088h2.getTitle());
                    if (strM21265c == null) {
                        strM21265c = "";
                    }
                    i15 &= -897;
                } else {
                    strM21265c = str2;
                }
                if (i26 != 0) {
                    float f116 = 0;
                    Modifier modifier8 = modifier2;
                    str4 = strM21265c;
                    modifier4 = modifier8;
                    i17 = i15;
                    c22976l1 = new C22976l1(f116, f116, f116, f116);
                } else {
                    Modifier modifier9 = modifier2;
                    str4 = strM21265c;
                    modifier4 = modifier9;
                    i17 = i15;
                    c22976l1 = interfaceC22973k2;
                }
            } else {
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    strM21265c = AbstractC8692a.m21265c(c0088h2.getTitle());
                    if (strM21265c == null) {
                        strM21265c = "";
                    }
                    i15 &= -897;
                } else {
                    strM21265c = str2;
                }
                if (i26 != 0) {
                    float f117 = 0;
                    Modifier modifier10 = modifier2;
                    str4 = strM21265c;
                    modifier4 = modifier10;
                    i17 = i15;
                    c22976l1 = new C22976l1(f117, f117, f117, f117);
                } else {
                    Modifier modifier11 = modifier2;
                    str4 = strM21265c;
                    modifier4 = modifier11;
                    i17 = i15;
                    c22976l1 = interfaceC22973k2;
                }
            }
            c28655q4.m87175r();
            Modifier modifierM3393o3 = AbstractC1099a.m3393o(c22976l1, AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3));
            C22957g c22957g3 = AbstractC22977m.f90652c;
            C2305k c2305k3 = C2299e.f9110M;
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q4, 0);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q4.m87165m();
            Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q4, modifierM3393o3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a7);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m113);
            c0209i3 = C0217k.f732j;
            if (c28655q4.f115903S) {
                modifier5 = modifier4;
                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N113);
                Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t);
                c22949e = AbstractC22977m.f90650a;
                InterfaceC22973k1 interfaceC22973k8 = c22976l1;
                C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q4, 0);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q4.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f13);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c0213j2 = c0213j;
                    c28655q4.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a17);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m114);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N114);
                String strM238l5 = c0088h.getTitle();
                c38072d = C38072d.f163053a;
                long brandWhite5 = c38072d.m121949b(c28655q4, 6).getBrandWhite();
                C2886a b110 = c38072d.m121952e(c28655q4, 6).getB1();
                Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                c2314t2 = c2314t;
                str5 = str4;
                AbstractC30795n.m94707h(strM238l5, AbstractC15676d.m44101d(AbstractC11895b.m31988g(modifierM3409f14, true, 1.0f), "BiomarkerCard_Title_" + str4), brandWhite5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b110, null, c28655q4, 0, 0, 196600);
                enumC16313m0M233g = c0088h.getIcon();
                if (enumC16313m0M233g == null) {
                    c28655q4.m87150e0(1074325066);
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(1074325067);
                    float f118 = 4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M233g.toWhoopIcon(), c28655q4, 6), null, AbstractC1102d.m3419p(f118 * f118, c2314t2), c38072d.m121949b(c28655q4, 6).getBrandWhite(), c28655q4, 432, 0);
                    c28655q4.m87173q(false);
                }
                c28655q4.m87173q(true);
                Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, c2314t2);
                c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q4.m87165m();
                Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q4, modifierM3409f15);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a18);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m115);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N115);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q4, 0);
                iHashCode4 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q4.m87165m();
                Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q4, c2314t2);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m116);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N116);
                f13 = 1;
                f14 = 8;
                f15 = f13 * f14;
                Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3428y(c2314t2, null, false, 3), 0.0f, f15, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a19 = AbstractC22988p1.m66759a(c22949e, C2299e.f9109L, c28655q4, 48);
                iHashCode5 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q4.m87165m();
                Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q4, modifierM3398t5);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a19);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m117);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N117);
                f16 = ((float) 0.5d) * f14;
                c0213j3 = c0213j2;
                AbstractC30795n.m94707h(c0088h.getValue(), AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f16, 0.0f, 11), "BiomarkerCard_Value_" + str5), c38072d.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getN5(), null, c28655q4, 0, 0, 196600);
                c28655q = c28655q4;
                strM240n = c0088h.getUnit();
                if (strM240n == null) {
                    c28655q.m87150e0(-1888826267);
                    z13 = false;
                    c28655q.m87173q(false);
                } else {
                    long jM73370c5 = AbstractC25012a.m73370c(c28655q, -1888826266, c38072d, c28655q, 6);
                    C2886a b111 = c38072d.m121952e(c28655q, 6).getB1();
                    Modifier modifierM44101d9 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f13, 7), "BiomarkerCard_Unit_" + str5);
                    c2314t2 = c2314t2;
                    AbstractC30795n.m94707h(strM240n, modifierM44101d9, jM73370c5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b111, null, c28655q, 0, 0, 196600);
                    c28655q = c28655q;
                    z13 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c17731c2M239m = c0088h.getTrend();
                if (c17731c2M239m == null) {
                    c28655q.m87150e0(-1863631681);
                    c28655q.m87173q(z13);
                } else {
                    AbstractC33745d.m106667z(c28655q, -1863631680, c2314t2, f16, c28655q);
                    AbstractC17808z1.m51175c(c17731c2M239m, c28655q, C9598e.f28134d);
                    c28655q.m87173q(z13);
                }
                c28655q.m87173q(true);
                c0094nM236j = c0088h.getRangeMeter();
                if (c0094nM236j == null) {
                    c28655q.m87150e0(-641832376);
                    c28655q.m87173q(z13);
                } else {
                    c28655q.m87150e0(-641832375);
                    AbstractC0092l.m247e(c0094nM236j, AbstractC15676d.m44101d(c2314t2, "BiomarkerCard_RangeMeter_" + str5), c28655q, z13 ? 1 : 0, z13 ? 1 : 0);
                    c28655q.m87173q(z13);
                }
                c21395cM232f = c0088h.getGraph();
                if (c21395cM232f == null) {
                    c28655q.m87150e0(-641590080);
                    c28655q.m87173q(z13);
                } else {
                    c28655q.m87150e0(-641590079);
                    float f119 = 4;
                    C28655q c28655q13 = c28655q;
                    AbstractC2756k.m7799p(AbstractC15676d.m44101d(AbstractC1099a.m3396r(AbstractC1102d.m3411h(13 * f119, AbstractC1102d.m3424u(22 * f119, c2314t2)), ((float) 1.5d) * f14, 0.0f, 2), "BiomarkerCard_Graph_" + str5), c21395cM232f, null, null, false, null, function1, c28655q13, (i17 << 9) & 3670016, 60);
                    c28655q = c28655q13;
                    z13 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c35585cM235i = c0088h.getMiniCallout();
                if (c35585cM235i == null) {
                    c28655q.m87150e0(1558751209);
                    c28655q.m87173q(z13);
                    c38072d2 = c38072d;
                    z14 = z13;
                    c28655q2 = c28655q;
                    i18 = 2;
                } else {
                    c28655q.m87150e0(1558751210);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * f14, c2314t2));
                    z14 = z13;
                    c38072d2 = c38072d;
                    i18 = 2;
                    c28655q2 = c28655q;
                    AbstractC35584b.m112780g(AbstractC15676d.m44101d(c2314t2, "BiomarkerCard_MiniCallout_" + str5), c35585cM235i, function1, c28655q2, (i17 >> 3) & 896, 0);
                    c28655q2.m87173q(z14);
                }
                c0081aM231e = c0088h.getDisclaimer();
                if (c0081aM231e == null) {
                    c28655q2.m87150e0(1559131579);
                    c28655q2.m87173q(z14);
                    c28655q4 = c28655q2;
                    z15 = true;
                } else {
                    c28655q2.m87150e0(1559131580);
                    Modifier modifierM44101d10 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, i18 * f14, 0.0f, 0.0f, 13), "BiomarkerCard_Disclaimer_" + r0);
                    C22994r1 c22994r1M66759a110 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, 48);
                    iHashCode6 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q2.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q2, modifierM44101d10);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j3);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a110);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m118);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N118);
                    icon = c0081aM231e.getIcon();
                    if (icon == null) {
                        c28655q2.m87150e0(-1622175878);
                        c28655q2.m87173q(z14);
                        c28655q3 = c28655q2;
                        i19 = 6;
                    } else {
                        c28655q2.m87150e0(-1622175877);
                        i19 = 6;
                        c28655q3 = c28655q2;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(3 * 4, AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f15, 0.0f, 11)), c38072d2.m121949b(c28655q2, 6).getBrandWhite(), c28655q3, 432, 0);
                        c28655q3.m87173q(z14);
                    }
                    C28655q c28655q14 = c28655q3;
                    AbstractC30795n.m94707h(c0088h.getDisclaimer().getText(), null, c38072d2.m121949b(c28655q3, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i19).getB4(), null, c28655q14, 0, 0, 196602);
                    c28655q4 = c28655q14;
                    z15 = true;
                    c28655q4.m87173q(true);
                    c28655q4.m87173q(z14);
                }
                c28655q4.m87173q(z15);
                modifier3 = modifier5;
                interfaceC22973k3 = interfaceC22973k8;
                str3 = str5;
            } else {
                modifier5 = modifier4;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N113);
            Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, c2314t);
            c22949e = AbstractC22977m.f90650a;
            InterfaceC22973k1 interfaceC22973k9 = c22976l1;
            C22994r1 c22994r1M66759a111 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q4, 0);
            iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q4.m87165m();
            Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f16);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c0213j2 = c0213j;
                c28655q4.m87163l(c0213j2);
            } else {
                c0213j2 = c0213j;
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a111);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m119);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N119);
            String strM238l6 = c0088h.getTitle();
            c38072d = C38072d.f163053a;
            long brandWhite6 = c38072d.m121949b(c28655q4, 6).getBrandWhite();
            C2886a b112 = c38072d.m121952e(c28655q4, 6).getB1();
            Modifier modifierM3409f17 = AbstractC1102d.m3409f(1.0f, c2314t);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            c2314t2 = c2314t;
            str5 = str4;
            AbstractC30795n.m94707h(strM238l6, AbstractC15676d.m44101d(AbstractC11895b.m31988g(modifierM3409f17, true, 1.0f), "BiomarkerCard_Title_" + str4), brandWhite6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b112, null, c28655q4, 0, 0, 196600);
            enumC16313m0M233g = c0088h.getIcon();
            if (enumC16313m0M233g == null) {
                c28655q4.m87150e0(1074325066);
                c28655q4.m87173q(false);
            } else {
                c28655q4.m87150e0(1074325067);
                float f1110 = 4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M233g.toWhoopIcon(), c28655q4, 6), null, AbstractC1102d.m3419p(f1110 * f1110, c2314t2), c38072d.m121949b(c28655q4, 6).getBrandWhite(), c28655q4, 432, 0);
                c28655q4.m87173q(false);
            }
            c28655q4.m87173q(true);
            Modifier modifierM3409f18 = AbstractC1102d.m3409f(1.0f, c2314t2);
            c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a112 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
            iHashCode3 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q4.m87165m();
            Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q4, modifierM3409f18);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j2);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a112);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1110);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1110);
            C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q4, 0);
            iHashCode4 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q4.m87165m();
            Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q4, c2314t2);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j2);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a9);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1111);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1111);
            f13 = 1;
            f14 = 8;
            f15 = f13 * f14;
            Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1102d.m3428y(c2314t2, null, false, 3), 0.0f, f15, 0.0f, 0.0f, 13);
            C22994r1 c22994r1M66759a113 = AbstractC22988p1.m66759a(c22949e, C2299e.f9109L, c28655q4, 48);
            iHashCode5 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q4.m87165m();
            Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q4, modifierM3398t6);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j2);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a113);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1112);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1112);
            f16 = ((float) 0.5d) * f14;
            c0213j3 = c0213j2;
            AbstractC30795n.m94707h(c0088h.getValue(), AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f16, 0.0f, 11), "BiomarkerCard_Value_" + str5), c38072d.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getN5(), null, c28655q4, 0, 0, 196600);
            c28655q = c28655q4;
            strM240n = c0088h.getUnit();
            if (strM240n == null) {
                c28655q.m87150e0(-1888826267);
                z13 = false;
                c28655q.m87173q(false);
            } else {
                long jM73370c6 = AbstractC25012a.m73370c(c28655q, -1888826266, c38072d, c28655q, 6);
                C2886a b113 = c38072d.m121952e(c28655q, 6).getB1();
                Modifier modifierM44101d11 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f13, 7), "BiomarkerCard_Unit_" + str5);
                c2314t2 = c2314t2;
                AbstractC30795n.m94707h(strM240n, modifierM44101d11, jM73370c6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b113, null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                z13 = false;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c17731c2M239m = c0088h.getTrend();
            if (c17731c2M239m == null) {
                c28655q.m87150e0(-1863631681);
                c28655q.m87173q(z13);
            } else {
                AbstractC33745d.m106667z(c28655q, -1863631680, c2314t2, f16, c28655q);
                AbstractC17808z1.m51175c(c17731c2M239m, c28655q, C9598e.f28134d);
                c28655q.m87173q(z13);
            }
            c28655q.m87173q(true);
            c0094nM236j = c0088h.getRangeMeter();
            if (c0094nM236j == null) {
                c28655q.m87150e0(-641832376);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(-641832375);
                AbstractC0092l.m247e(c0094nM236j, AbstractC15676d.m44101d(c2314t2, "BiomarkerCard_RangeMeter_" + str5), c28655q, z13 ? 1 : 0, z13 ? 1 : 0);
                c28655q.m87173q(z13);
            }
            c21395cM232f = c0088h.getGraph();
            if (c21395cM232f == null) {
                c28655q.m87150e0(-641590080);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(-641590079);
                float f1111 = 4;
                C28655q c28655q15 = c28655q;
                AbstractC2756k.m7799p(AbstractC15676d.m44101d(AbstractC1099a.m3396r(AbstractC1102d.m3411h(13 * f1111, AbstractC1102d.m3424u(22 * f1111, c2314t2)), ((float) 1.5d) * f14, 0.0f, 2), "BiomarkerCard_Graph_" + str5), c21395cM232f, null, null, false, null, function1, c28655q15, (i17 << 9) & 3670016, 60);
                c28655q = c28655q15;
                z13 = false;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c35585cM235i = c0088h.getMiniCallout();
            if (c35585cM235i == null) {
                c28655q.m87150e0(1558751209);
                c28655q.m87173q(z13);
                c38072d2 = c38072d;
                z14 = z13;
                c28655q2 = c28655q;
                i18 = 2;
            } else {
                c28655q.m87150e0(1558751210);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * f14, c2314t2));
                z14 = z13;
                c38072d2 = c38072d;
                i18 = 2;
                c28655q2 = c28655q;
                AbstractC35584b.m112780g(AbstractC15676d.m44101d(c2314t2, "BiomarkerCard_MiniCallout_" + str5), c35585cM235i, function1, c28655q2, (i17 >> 3) & 896, 0);
                c28655q2.m87173q(z14);
            }
            c0081aM231e = c0088h.getDisclaimer();
            if (c0081aM231e == null) {
                c28655q2.m87150e0(1559131579);
                c28655q2.m87173q(z14);
                c28655q4 = c28655q2;
                z15 = true;
            } else {
                c28655q2.m87150e0(1559131580);
                Modifier modifierM44101d12 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, i18 * f14, 0.0f, 0.0f, 13), "BiomarkerCard_Disclaimer_" + r0);
                C22994r1 c22994r1M66759a114 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, 48);
                iHashCode6 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q2.m87165m();
                Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q2, modifierM44101d12);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j3);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a114);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1113);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1113);
                icon = c0081aM231e.getIcon();
                if (icon == null) {
                    c28655q2.m87150e0(-1622175878);
                    c28655q2.m87173q(z14);
                    c28655q3 = c28655q2;
                    i19 = 6;
                } else {
                    c28655q2.m87150e0(-1622175877);
                    i19 = 6;
                    c28655q3 = c28655q2;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(3 * 4, AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f15, 0.0f, 11)), c38072d2.m121949b(c28655q2, 6).getBrandWhite(), c28655q3, 432, 0);
                    c28655q3.m87173q(z14);
                }
                C28655q c28655q16 = c28655q3;
                AbstractC30795n.m94707h(c0088h.getDisclaimer().getText(), null, c38072d2.m121949b(c28655q3, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i19).getB4(), null, c28655q16, 0, 0, 196602);
                c28655q4 = c28655q16;
                z15 = true;
                c28655q4.m87173q(true);
                c28655q4.m87173q(z14);
            }
            c28655q4.m87173q(z15);
            modifier3 = modifier5;
            interfaceC22973k3 = interfaceC22973k9;
            str3 = str5;
        } else {
            c28655q4.m87138X();
            modifier3 = modifier2;
            str3 = str2;
            interfaceC22973k3 = interfaceC22973k2;
        }
        c28677v1M87180u = c28655q4.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f(modifier3, c0088h, str3, function1, interfaceC22973k3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m227n(Modifier modifier, C0088h c0088h, String str, Function1 function1, InterfaceC22973k1 interfaceC22973k1, int i13, int i14, Composer composer, int i15) {
        m226m(modifier, c0088h, str, function1, interfaceC22973k1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
