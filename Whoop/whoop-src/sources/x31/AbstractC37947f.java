package x31;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1707m0;
import b91.C2886a;
import b91.EnumC2888c;
import be1.C3172f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9772c;
import dn0.C12212l;
import java.util.List;
import kotlin.C2000e1;
import kw1.C22850a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11407v;
import p163g1.AbstractC14977c8;
import p163g1.AbstractC15173v7;
import p163g1.C15183w7;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p21.C28749b;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23013y;
import p294l3.C23277r0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p599wz.C37722h1;
import p602x1.AbstractC37817c;
import p636y3.C39174f;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import wm1.C37383e;
import wq1.C37508b;
import x30.C37900j1;
import x81.C38072d;

/* JADX INFO: renamed from: x31.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aY\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001as\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u000b2\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u000bH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u001c\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010!\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"¨\u0006'²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\u000e\u0010$\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010%\u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\f\u0010&\u001a\u00020\u001f8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "selectedIndex", "", "Lcom/whoop/design/util/TextResource;", "tabs", "Landroidx/compose/ui/Modifier;", "modifier", "Lx31/c;", "centerConfig", "Lb91/c;", "titleTypography", "Lkotlin/Function1;", "Ll83/a0;", "onTabSelected", "r", "(ILjava/util/List;Landroidx/compose/ui/Modifier;Lx31/c;Lb91/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lb91/a;", "titleTextStyle", "Lkotlin/Function2;", "onTabWidthChanged", "Ll3/r0;", "onTextLayout", "C", "(ILjava/util/List;Lb91/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lg1/w7;", "tabPositions", "", "tabLabelWidths", "p", "(Ljava/util/List;[IILandroidx/compose/runtime/Composer;I)V", "currentTabPosition", "Ly3/f;", "indicatorWidth", "J", "(Landroidx/compose/ui/Modifier;Lg1/w7;F)Landroidx/compose/ui/Modifier;", "", "tabGroupCentered", "currentTabWidth", "indicatorOffset", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37947f {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m121494A(EnumC37944c enumC37944c, InterfaceC28601c1 interfaceC28601c1, C23277r0 textLayoutResult) {
        AbstractC22676k.m65750j(textLayoutResult, "textLayoutResult");
        if (textLayoutResult.f92228b.f92263f > 1 && m121529w(interfaceC28601c1) && enumC37944c == EnumC37944c.DYNAMIC) {
            m121530x(interfaceC28601c1, false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m121495B(int i13, InterfaceC28601c1 interfaceC28601c1, List tabPositions, Composer composer, int i14) {
        AbstractC22676k.m65750j(tabPositions, "tabPositions");
        m121522p(tabPositions, m121525s(interfaceC28601c1), i13, composer, i14 & 14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0176  */
    /* JADX WARN: Code duplicated, block: B:103:0x0182  */
    /* JADX WARN: Code duplicated, block: B:106:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121  */
    /* JADX WARN: Code duplicated, block: B:91:0x0124  */
    /* JADX WARN: Code duplicated, block: B:94:0x0131 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x0133  */
    /* JADX INFO: renamed from: C */
    private static final void m121496C(int i13, List<? extends TextResource> list, C2886a c2886a, Function1 function1, InterfaceC4351m interfaceC4351m, Function1 function2, Composer composer, int i14, int i15) {
        final InterfaceC4351m interfaceC4351m2;
        int i16;
        Function1 function3;
        int i17;
        int i18;
        boolean z4;
        boolean z13;
        C28655q c28655q;
        Function1 function4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        final Function1 function5;
        final int i19;
        int i24;
        boolean z14;
        final long jM125385c1;
        boolean z15;
        boolean zM87149e;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        final C2886a c2886a2 = c2886a;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1797428656);
        int i25 = (i14 & 6) == 0 ? (c28655q2.m87149e(i13) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i25 |= c28655q2.m87157i(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i25 |= (i14 & 512) == 0 ? c28655q2.m87153g(c2886a2) : c28655q2.m87157i(c2886a2) ? 256 : 128;
        }
        int i26 = i14 & 3072;
        int i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i26 == 0) {
            i25 |= c28655q2.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i28 = i15 & 16;
        if (i28 == 0) {
            if ((i14 & 24576) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                i25 |= c28655q2.m87157i(interfaceC4351m2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i15 & 32;
            if (i16 != 0) {
                if ((196608 & i14) == 0) {
                    function3 = function2;
                    if (c28655q2.m87157i(function3)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i25 |= i17;
                }
                i18 = i25;
                z4 = false;
                if ((74899 & i18) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q2.m87135U(i18 & 1, z13)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C37942a(2);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4351m2 = (InterfaceC4351m) objM87133R3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C37722h1(23);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    } else {
                        function5 = function3;
                    }
                    i19 = 0;
                    for (Object obj : list) {
                        i24 = i19 + 1;
                        if (i19 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        final TextResource textResource = (TextResource) obj;
                        if (i13 == i19) {
                            z14 = true;
                        } else {
                            z14 = z4;
                        }
                        if (z14) {
                            c28655q2.m87150e0(1372379094);
                            jM125385c1 = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, z4);
                        } else {
                            c28655q2.m87150e0(1372380179);
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                            c28655q2.m87173q(z4);
                        }
                        if ((i18 & 7168) == i27) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM87149e = z15 | c28655q2.m87149e(i19);
                        objM87133R = c28655q2.m87133R();
                        if (zM87149e || objM87133R == c28676v0) {
                            objM87133R = new C12212l(function1, i19, 5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        C28655q c28655q3 = c28655q2;
                        AbstractC15173v7.m43207a(z14, (InterfaceC4339a) objM87133R, null, false, 0L, 0L, AbstractC37817c.m121344e(297229311, c28655q2, new Function3() { // from class: x31.e
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int iIntValue = ((Integer) obj4).intValue();
                                return AbstractC37947f.m121500G(textResource, interfaceC4351m2, i19, jM125385c1, function5, c2886a2, (InterfaceC23013y) obj2, (Composer) obj3, iIntValue);
                            }
                        }), c28655q3, 12582912);
                        c2886a2 = c2886a;
                        i18 = i18;
                        i27 = 2048;
                        z4 = false;
                        c28655q2 = c28655q3;
                        i19 = i24;
                        c28676v0 = c28676v0;
                    }
                    c28655q = c28655q2;
                    function4 = function5;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function4 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2000e1(i13, list, c2886a, function1, interfaceC4351m2, function4, i14, i15);
                }
            }
            i25 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function3 = function2;
            i18 = i25;
            z4 = false;
            if ((74899 & i18) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C37942a(2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4351m2 = (InterfaceC4351m) objM87133R3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C37722h1(23);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function5 = (Function1) objM87133R2;
                } else {
                    function5 = function3;
                }
                i19 = 0;
                while (r24.hasNext()) {
                    i24 = i19 + 1;
                    if (i19 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    final TextResource textResource2 = (TextResource) obj;
                    if (i13 == i19) {
                        z14 = true;
                    } else {
                        z14 = z4;
                    }
                    if (z14) {
                        c28655q2.m87150e0(1372379094);
                        jM125385c1 = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, z4);
                    } else {
                        c28655q2.m87150e0(1372380179);
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                        c28655q2.m87173q(z4);
                    }
                    if ((i18 & 7168) == i27) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87149e = z15 | c28655q2.m87149e(i19);
                    objM87133R = c28655q2.m87133R();
                    if (zM87149e) {
                        objM87133R = new C12212l(function1, i19, 5);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12212l(function1, i19, 5);
                        c28655q2.m87172p0(objM87133R);
                    }
                    C28655q c28655q4 = c28655q2;
                    AbstractC15173v7.m43207a(z14, (InterfaceC4339a) objM87133R, null, false, 0L, 0L, AbstractC37817c.m121344e(297229311, c28655q2, new Function3() { // from class: x31.e
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC37947f.m121500G(textResource2, interfaceC4351m2, i19, jM125385c1, function5, c2886a2, (InterfaceC23013y) obj2, (Composer) obj3, iIntValue);
                        }
                    }), c28655q4, 12582912);
                    c2886a2 = c2886a;
                    i18 = i18;
                    i27 = 2048;
                    z4 = false;
                    c28655q2 = c28655q4;
                    i19 = i24;
                    c28676v0 = c28676v0;
                }
                c28655q = c28655q2;
                function4 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function4 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2000e1(i13, list, c2886a, function1, interfaceC4351m2, function4, i14, i15);
            }
        }
        i25 |= 24576;
        interfaceC4351m2 = interfaceC4351m;
        i16 = i15 & 32;
        if (i16 != 0) {
            if ((196608 & i14) == 0) {
                function3 = function2;
                if (c28655q2.m87157i(function3)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i25 |= i17;
            }
            i18 = i25;
            z4 = false;
            if ((74899 & i18) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C37942a(2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4351m2 = (InterfaceC4351m) objM87133R3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C37722h1(23);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function5 = (Function1) objM87133R2;
                } else {
                    function5 = function3;
                }
                i19 = 0;
                while (r24.hasNext()) {
                    i24 = i19 + 1;
                    if (i19 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    final TextResource textResource3 = (TextResource) obj;
                    if (i13 == i19) {
                        z14 = true;
                    } else {
                        z14 = z4;
                    }
                    if (z14) {
                        c28655q2.m87150e0(1372379094);
                        jM125385c1 = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, z4);
                    } else {
                        c28655q2.m87150e0(1372380179);
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                        c28655q2.m87173q(z4);
                    }
                    if ((i18 & 7168) == i27) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87149e = z15 | c28655q2.m87149e(i19);
                    objM87133R = c28655q2.m87133R();
                    if (zM87149e) {
                        objM87133R = new C12212l(function1, i19, 5);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12212l(function1, i19, 5);
                        c28655q2.m87172p0(objM87133R);
                    }
                    C28655q c28655q5 = c28655q2;
                    AbstractC15173v7.m43207a(z14, (InterfaceC4339a) objM87133R, null, false, 0L, 0L, AbstractC37817c.m121344e(297229311, c28655q2, new Function3() { // from class: x31.e
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC37947f.m121500G(textResource3, interfaceC4351m2, i19, jM125385c1, function5, c2886a2, (InterfaceC23013y) obj2, (Composer) obj3, iIntValue);
                        }
                    }), c28655q5, 12582912);
                    c2886a2 = c2886a;
                    i18 = i18;
                    i27 = 2048;
                    z4 = false;
                    c28655q2 = c28655q5;
                    i19 = i24;
                    c28676v0 = c28676v0;
                }
                c28655q = c28655q2;
                function4 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function4 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2000e1(i13, list, c2886a, function1, interfaceC4351m2, function4, i14, i15);
            }
        }
        i25 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function3 = function2;
        i18 = i25;
        z4 = false;
        if ((74899 & i18) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i18 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i28 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C37942a(2);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC4351m2 = (InterfaceC4351m) objM87133R3;
            }
            if (i16 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C37722h1(23);
                    c28655q2.m87172p0(objM87133R2);
                }
                function5 = (Function1) objM87133R2;
            } else {
                function5 = function3;
            }
            i19 = 0;
            while (r24.hasNext()) {
                i24 = i19 + 1;
                if (i19 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                final TextResource textResource4 = (TextResource) obj;
                if (i13 == i19) {
                    z14 = true;
                } else {
                    z14 = z4;
                }
                if (z14) {
                    c28655q2.m87150e0(1372379094);
                    jM125385c1 = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, z4);
                } else {
                    c28655q2.m87150e0(1372380179);
                    jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                    c28655q2.m87173q(z4);
                }
                if ((i18 & 7168) == i27) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87149e = z15 | c28655q2.m87149e(i19);
                objM87133R = c28655q2.m87133R();
                if (zM87149e) {
                    objM87133R = new C12212l(function1, i19, 5);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C12212l(function1, i19, 5);
                    c28655q2.m87172p0(objM87133R);
                }
                C28655q c28655q6 = c28655q2;
                AbstractC15173v7.m43207a(z14, (InterfaceC4339a) objM87133R, null, false, 0L, 0L, AbstractC37817c.m121344e(297229311, c28655q2, new Function3() { // from class: x31.e
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC37947f.m121500G(textResource4, interfaceC4351m2, i19, jM125385c1, function5, c2886a2, (InterfaceC23013y) obj2, (Composer) obj3, iIntValue);
                    }
                }), c28655q6, 12582912);
                c2886a2 = c2886a;
                i18 = i18;
                i27 = 2048;
                z4 = false;
                c28655q2 = c28655q6;
                i19 = i24;
                c28676v0 = c28676v0;
            }
            c28655q = c28655q2;
            function4 = function5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function4 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2000e1(i13, list, c2886a, function1, interfaceC4351m2, function4, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m121497D(int i13, int i14) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m121498E(C23277r0 it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m121499F(Function1 function1, int i13) {
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m121500G(TextResource textResource, InterfaceC4351m interfaceC4351m, int i13, long j7, Function1 function1, C2886a c2886a, InterfaceC23013y Tab, Composer composer, int i14) {
        AbstractC22676k.m65750j(Tab, "$this$Tab");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 17) != 16)) {
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, 0);
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(C2314t.f9131w, ((float) 1.75d) * f13, 0.0f, 2), 0.0f, ((float) 1.5d) * f13, 0.0f, 1 * f13, 5);
            boolean zM87153g = c28655q.m87153g(interfaceC4351m) | c28655q.m87149e(i13);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C22850a(interfaceC4351m, i13, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC30795n.m94707h(strM21274h, AbstractC1132b.m3502b(modifierM3398t, (Function1) objM87133R), j7, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, function1, c2886a, null, c28655q, 0, 0, 163320);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m121501H(InterfaceC4351m interfaceC4351m, int i13, C39180l c39180l) {
        interfaceC4351m.invoke(Integer.valueOf(i13), Integer.valueOf((int) (c39180l.f168422a >> 32)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m121502I(int i13, List list, C2886a c2886a, Function1 function1, InterfaceC4351m interfaceC4351m, Function1 function2, int i14, int i15, Composer composer, int i16) {
        m121496C(i13, list, c2886a, function1, interfaceC4351m, function2, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final Modifier m121503J(Modifier modifier, C15183w7 c15183w7, float f13) {
        return AbstractC37056f.m118997u(modifier, new C28749b(c15183w7, f13, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final Modifier m121504K(C15183w7 c15183w7, float f13, Modifier composed, Composer composer, int i13) {
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(727497004);
        float f14 = (c15183w7.f56984b - f13) / 2;
        C11407v c11407v = AbstractC11333b0.f36310a;
        Modifier modifierM3424u = AbstractC1102d.m3424u(m121505L(AbstractC11352g.m30587a(f13, AbstractC11348f.m30574v(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 0, c11407v, 2), null, c28655q, 0, 12)), AbstractC1099a.m3392n(AbstractC1102d.m3428y(AbstractC1102d.m3409f(1.0f, composed), C2299e.f9104G, false, 2), m121506M(AbstractC11352g.m30587a(c15183w7.f56983a + f14, AbstractC11348f.m30574v(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 0, c11407v, 2), null, c28655q, 0, 12)), 0.0f, 2));
        c28655q.m87173q(false);
        return modifierM3424u;
    }

    /* JADX INFO: renamed from: L */
    private static final float m121505L(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: M */
    private static final float m121506M(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: p */
    private static final void m121522p(List<C15183w7> list, int[] iArr, int i13, Composer composer, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(218550495);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87157i(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87157i(iArr) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            c28655q.m87138X();
        } else if (i13 < 0 || i13 >= iArr.length || i13 < 0 || i13 >= list.size()) {
            c28655q.m87150e0(-331989309);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-332426564);
            AbstractC22989q.m66760a(AbstractC1099a.m3398t(AbstractC1092a.m3358c(AbstractC1102d.m3411h(2, AbstractC1102d.m3409f(1.0f, AbstractC37056f.m118994r(m121503J(C2314t.f9131w, list.get(i13), ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo733e0(iArr[i13])), AbstractC33253j.m105489e(1)))), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), AbstractC17918w0.f69621a), 0.0f, 0.0f, 0.0f, ((float) 1.5d) * 8, 7), c28655q, 0);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(list, i13, iArr, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m121523q(List list, int[] iArr, int i13, int i14, Composer composer, int i15) {
        m121522p(list, iArr, i13, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013e  */
    /* JADX WARN: Code duplicated, block: B:103:0x014b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0195  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0109  */
    /* JADX WARN: Code duplicated, block: B:89:0x0111  */
    /* JADX WARN: Code duplicated, block: B:91:0x0127  */
    /* JADX INFO: renamed from: r */
    public static final void m121524r(final int i13, List<? extends TextResource> tabs, Modifier modifier, EnumC37944c enumC37944c, EnumC2888c enumC2888c, Function1 onTabSelected, Composer composer, int i14, int i15) {
        int i16;
        Modifier modifier2;
        int i17;
        int iOrdinal;
        int i18;
        int i19;
        int i24;
        int i25;
        boolean z4;
        boolean z13;
        EnumC37944c enumC37944c2;
        Modifier modifier3;
        EnumC2888c enumC2888c2;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        EnumC37944c enumC37944c3;
        EnumC2888c enumC2888c3;
        boolean zM87153g;
        Object objM87133R;
        C28676v0 c28676v0;
        final InterfaceC28601c1 interfaceC28601c1;
        boolean zM87153g2;
        Object objM87133R2;
        InterfaceC4351m interfaceC4351m;
        C2886a c2886aM8402a;
        C2886a c2886a;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        Modifier modifier5;
        int i26;
        AbstractC22676k.m65750j(tabs, "tabs");
        AbstractC22676k.m65750j(onTabSelected, "onTabSelected");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1020497132);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87157i(tabs) ? 32 : 16;
        }
        int i27 = i15 & 4;
        if (i27 == 0) {
            if ((i14 & 384) == 0) {
                modifier2 = modifier;
                i16 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                i16 |= 3072;
            } else if ((i14 & 3072) == 0) {
                if (enumC37944c == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC37944c.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i18;
            }
            i19 = i15 & 16;
            if (i19 != 0) {
                i16 |= 24576;
            } else if ((i14 & 24576) == 0) {
                if (c28655q.m87149e(enumC2888c != null ? enumC2888c.ordinal() : -1)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i24;
            }
            if ((196608 & i14) == 0) {
                if (c28655q.m87157i(onTabSelected)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i26;
            }
            i25 = i16;
            z4 = true;
            if ((74899 & i25) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i25 & 1, z13)) {
                if (i27 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i17 != 0) {
                    enumC37944c3 = EnumC37944c.NEVER;
                } else {
                    enumC37944c3 = enumC37944c;
                }
                if (i19 != 0) {
                    enumC2888c3 = null;
                } else {
                    enumC2888c3 = enumC2888c;
                }
                zM87153g = c28655q.m87153g(tabs);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(new int[tabs.size()]);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zM87153g2 = c28655q.m87153g(interfaceC28601c1);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C9772c(6, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4351m = (InterfaceC4351m) objM87133R2;
                c2886aM8402a = enumC2888c3 != null ? EnumC2888c.INSTANCE.m8402a(enumC2888c3) : null;
                if (c2886aM8402a == null) {
                    c28655q.m87150e0(-1445180458);
                    c2886aM8402a = C38072d.f163053a.m121952e(c28655q, 6).getH5();
                } else {
                    c28655q.m87150e0(-1445183713);
                }
                c28655q.m87173q(false);
                c2886a = c2886aM8402a;
                if (enumC37944c3 != EnumC37944c.ALWAYS && enumC37944c3 != EnumC37944c.DYNAMIC) {
                    z4 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC31061c.m95647w(z4, c28655q);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                if (m121529w(interfaceC28601c2)) {
                    c28655q.m87150e0(-1850655814);
                    long j7 = C17919x.f69636m;
                    final int i28 = 0;
                    Modifier modifier6 = modifier4;
                    AbstractC14977c8.m43099b(i13, modifier6, j7, j7, AbstractC37817c.m121344e(1957375297, c28655q, new Function3() { // from class: x31.d
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i29 = i28;
                            List list = (List) obj;
                            Composer composer2 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i29) {
                                case 0:
                                    return AbstractC37947f.m121531y(i13, interfaceC28601c1, list, composer2, iIntValue);
                                default:
                                    return AbstractC37947f.m121495B(i13, interfaceC28601c1, list, composer2, iIntValue);
                            }
                        }
                    }), C37943b.f162428a.m121492c(), AbstractC37817c.m121344e(-1230554303, c28655q, new C3172f(i13, tabs, c2886a, onTabSelected, interfaceC4351m, enumC37944c3, interfaceC28601c2)), c28655q, (i25 & 14) | 1797504 | ((i25 >> 3) & 112));
                    c28655q.m87173q(false);
                    modifier5 = modifier6;
                } else {
                    c28655q.m87150e0(-1849739268);
                    long j13 = C17919x.f69636m;
                    final int i29 = 1;
                    modifier5 = modifier4;
                    AbstractC14977c8.m43098a(i13, modifier5, j13, j13, 0, AbstractC37817c.m121344e(292640528, c28655q, new Function3() { // from class: x31.d
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i210 = i29;
                            List list = (List) obj;
                            Composer composer2 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i210) {
                                case 0:
                                    return AbstractC37947f.m121531y(i13, interfaceC28601c1, list, composer2, iIntValue);
                                default:
                                    return AbstractC37947f.m121495B(i13, interfaceC28601c1, list, composer2, iIntValue);
                            }
                        }
                    }), C37943b.f162428a.m121493d(), AbstractC37817c.m121344e(1434412304, c28655q, new C37383e(i13, tabs, c2886a, onTabSelected, interfaceC4351m)), c28655q, 14380416 | (i25 & 14) | ((i25 >> 3) & 112));
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                modifier3 = modifier5;
                enumC2888c2 = enumC2888c3;
                enumC37944c2 = enumC37944c3;
            } else {
                c28655q.m87138X();
                enumC37944c2 = enumC37944c;
                modifier3 = modifier2;
                enumC2888c2 = enumC2888c;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2000e1(i13, tabs, modifier3, enumC37944c2, enumC2888c2, onTabSelected, i14, i15);
            }
        }
        i16 |= 384;
        modifier2 = modifier;
        i17 = i15 & 8;
        if (i17 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            if (enumC37944c == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC37944c.ordinal();
            }
            if (c28655q.m87149e(iOrdinal)) {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 |= i18;
        }
        i19 = i15 & 16;
        if (i19 != 0) {
            i16 |= 24576;
        } else if ((i14 & 24576) == 0) {
            if (c28655q.m87149e(enumC2888c != null ? enumC2888c.ordinal() : -1)) {
                i24 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 |= i24;
        }
        if ((196608 & i14) == 0) {
            if (c28655q.m87157i(onTabSelected)) {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i26;
        }
        i25 = i16;
        z4 = true;
        if ((74899 & i25) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i25 & 1, z13)) {
            if (i27 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i17 != 0) {
                enumC37944c3 = EnumC37944c.NEVER;
            } else {
                enumC37944c3 = enumC37944c;
            }
            if (i19 != 0) {
                enumC2888c3 = null;
            } else {
                enumC2888c3 = enumC2888c;
            }
            zM87153g = c28655q.m87153g(tabs);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (zM87153g) {
                objM87133R = AbstractC28683x.m87272z(new int[tabs.size()]);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC28683x.m87272z(new int[tabs.size()]);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            zM87153g2 = c28655q.m87153g(interfaceC28601c1);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R2 = new C9772c(6, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C9772c(6, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC4351m = (InterfaceC4351m) objM87133R2;
            if (enumC2888c3 != null) {
            }
            if (c2886aM8402a == null) {
                c28655q.m87150e0(-1445180458);
                c2886aM8402a = C38072d.f163053a.m121952e(c28655q, 6).getH5();
            } else {
                c28655q.m87150e0(-1445183713);
            }
            c28655q.m87173q(false);
            c2886a = c2886aM8402a;
            if (enumC37944c3 != EnumC37944c.ALWAYS) {
                z4 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC31061c.m95647w(z4, c28655q);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            if (m121529w(interfaceC28601c2)) {
                c28655q.m87150e0(-1850655814);
                long j14 = C17919x.f69636m;
                final int i210 = 0;
                Modifier modifier7 = modifier4;
                AbstractC14977c8.m43099b(i13, modifier7, j14, j14, AbstractC37817c.m121344e(1957375297, c28655q, new Function3() { // from class: x31.d
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i211 = i210;
                        List list = (List) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i211) {
                            case 0:
                                return AbstractC37947f.m121531y(i13, interfaceC28601c1, list, composer2, iIntValue);
                            default:
                                return AbstractC37947f.m121495B(i13, interfaceC28601c1, list, composer2, iIntValue);
                        }
                    }
                }), C37943b.f162428a.m121492c(), AbstractC37817c.m121344e(-1230554303, c28655q, new C3172f(i13, tabs, c2886a, onTabSelected, interfaceC4351m, enumC37944c3, interfaceC28601c2)), c28655q, (i25 & 14) | 1797504 | ((i25 >> 3) & 112));
                c28655q.m87173q(false);
                modifier5 = modifier7;
            } else {
                c28655q.m87150e0(-1849739268);
                long j15 = C17919x.f69636m;
                final int i211 = 1;
                modifier5 = modifier4;
                AbstractC14977c8.m43098a(i13, modifier5, j15, j15, 0, AbstractC37817c.m121344e(292640528, c28655q, new Function3() { // from class: x31.d
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i212 = i211;
                        List list = (List) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i212) {
                            case 0:
                                return AbstractC37947f.m121531y(i13, interfaceC28601c1, list, composer2, iIntValue);
                            default:
                                return AbstractC37947f.m121495B(i13, interfaceC28601c1, list, composer2, iIntValue);
                        }
                    }
                }), C37943b.f162428a.m121493d(), AbstractC37817c.m121344e(1434412304, c28655q, new C37383e(i13, tabs, c2886a, onTabSelected, interfaceC4351m)), c28655q, 14380416 | (i25 & 14) | ((i25 >> 3) & 112));
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            modifier3 = modifier5;
            enumC2888c2 = enumC2888c3;
            enumC37944c2 = enumC37944c3;
        } else {
            c28655q.m87138X();
            enumC37944c2 = enumC37944c;
            modifier3 = modifier2;
            enumC2888c2 = enumC2888c;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2000e1(i13, tabs, modifier3, enumC37944c2, enumC2888c2, onTabSelected, i14, i15);
        }
    }

    /* JADX INFO: renamed from: s */
    private static final int[] m121525s(InterfaceC28601c1 interfaceC28601c1) {
        return (int[]) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m121526t(int i13, List list, C2886a c2886a, Function1 function1, InterfaceC4351m interfaceC4351m, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            m121496C(i13, list, c2886a, function1, interfaceC4351m, null, c28655q, 0, 32);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m121527u(int i13, List list, Modifier modifier, EnumC37944c enumC37944c, EnumC2888c enumC2888c, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m121524r(i13, list, modifier, enumC37944c, enumC2888c, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m121528v(InterfaceC28601c1 interfaceC28601c1, int i13, int i14) {
        m121525s(interfaceC28601c1)[i13] = i14;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final boolean m121529w(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: x */
    private static final void m121530x(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m121531y(int i13, InterfaceC28601c1 interfaceC28601c1, List tabPositions, Composer composer, int i14) {
        AbstractC22676k.m65750j(tabPositions, "tabPositions");
        m121522p(tabPositions, m121525s(interfaceC28601c1), i13, composer, i14 & 14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m121532z(int i13, List list, C2886a c2886a, Function1 function1, InterfaceC4351m interfaceC4351m, EnumC37944c enumC37944c, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            boolean zM87149e = c28655q.m87149e(enumC37944c.ordinal());
            Object objM87133R = c28655q.m87133R();
            if (zM87149e || objM87133R == C28635l.f115821a) {
                objM87133R = new C37900j1(2, enumC37944c, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            m121496C(i13, list, c2886a, function1, interfaceC4351m, (Function1) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
