package h01;

import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.service.network.model.UserSessionDto;
import d11.AbstractC11471f;
import d11.InterfaceC11466a;
import f61.C14143e;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p077d0.AbstractC11352g;
import p077d0.C11377m0;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p294l3.C23277r0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h01.z */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a²\u0006\u000e\u0010\u0012\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lh01/a0;", "viewState", "", "isExpandedView", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Lh01/a0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "a", "Ljava/util/List;", "getVowStates", "()Ljava/util/List;", "vowStates", "hasOverflow", "isExpanded", "Ly3/f;", "maxHeight", "", "titleMaxLines", "bodyMaxLinesWhenExpanded", "bodyMaxLines", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16559z {

    /* JADX INFO: renamed from: a */
    private static final List<C16534a0> f63738a;

    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Optimal Health");
        String str = "2";
        String str2 = "VOW_SECONDARY";
        String str3 = null;
        boolean z4 = false;
        InterfaceC22973k1 interfaceC22973k1 = null;
        EnumC16533a enumC16533a = null;
        f63738a = AbstractC37056f.m118959K(new C16534a0(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, AbstractC8693b.m21278l("Take advantage of your green Recovery by meeting your Strain target of 15.5. Your body is signaling it can take on significant exertion today."), "VOW_PRIMARY", null, false, null, null, textResourceM21278l, false, null, null, 1912, null), new C16534a0(str, AbstractC8693b.m21278l("Take advantage of your green Recovery by meeting your Strain target of 15.5. Your body is signaling it can take on significant exertion today."), str2, str3, z4, interfaceC22973k1, enumC16533a, AbstractC8693b.m21278l("Optimal Health"), false, EnumC16313m0.CARET_FORWARD, null, 1400, null));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:76:0x0104  */
    /* JADX WARN: Code duplicated, block: B:79:0x0111  */
    /* JADX WARN: Code duplicated, block: B:82:0x0126  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0149  */
    /* JADX WARN: Code duplicated, block: B:89:0x014e  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m46867i(Modifier modifier, C16534a0 viewState, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        int i16;
        Function1 function2;
        int i17;
        int i18;
        boolean z14;
        C28655q c28655q;
        Modifier modifier3;
        boolean z15;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        boolean z16;
        C28676v0 c28676v0;
        Function1 function4;
        C13825t c13825tM30800y;
        Object objM87133R;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c2;
        int iM46870l;
        InterfaceC11466a borderInformation;
        Object objM87133R6;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1277371454);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(viewState) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i18 & 1, z14)) {
                    if (i19 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i24 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C16554u(1);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function4 = (Function1) objM87133R6;
                    } else {
                        function4 = function2;
                    }
                    c13825tM30800y = null;
                    if (viewState.getShowBorder()) {
                        c28655q2.m87150e0(-762482718);
                        borderInformation = viewState.getStyle().getBorderInformation();
                        if (borderInformation == null) {
                            c28655q2.m87150e0(-762482719);
                        } else {
                            c28655q2.m87150e0(806687776);
                            c13825tM30800y = AbstractC11471f.m30800y(borderInformation, (float) 1.5d, c28655q2, 48);
                        }
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-762447813);
                    }
                    c28655q2.m87173q(false);
                    C13825t c13825t = c13825tM30800y;
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(z16, c28655q2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87264r(new C16542i(2, interfaceC28601c1));
                        c28655q2.m87172p0(objM87133R3);
                    }
                    InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87264r(new C16542i(3, interfaceC28601c1));
                        c28655q2.m87172p0(objM87133R4);
                    }
                    InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC11895b.m32005x(100, c28655q2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
                    if (m46880v(interfaceC28601c1)) {
                        iM46870l = m46870l(interfaceC28601c2);
                    } else {
                        iM46870l = 5;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30589c = AbstractC11352g.m30589c(iM46870l, c28655q2);
                    String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, 0);
                    float f13 = 4;
                    Function1 function5 = function4;
                    c28655q = c28655q2;
                    Modifier modifier5 = modifier4;
                    AbstractC31926e.m99375j(modifier5, null, C38072d.f163053a.m121949b(c28655q2, 6).getTransparent(), AbstractC33253j.m105489e(3 * f13), c13825t, null, f13 * 1, AbstractC37817c.m121344e(-1232215214, c28655q2, new C16545l(viewState, interfaceC28670t2, function5, strM21274h, interfaceC28670t3, interfaceC28601c3, interfaceC28670t2M30589c, interfaceC28601c2, interfaceC28601c1)), c28655q, (i18 & 14) | 14155776, 34);
                    function3 = function5;
                    modifier3 = modifier5;
                    z15 = z16;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14143e(i13, i14, 3, modifier3, viewState, function3, z15);
                }
            }
            i15 |= 3072;
            function2 = function1;
            i18 = i15;
            if ((i18 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z14)) {
                if (i19 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C16554u(1);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function4 = (Function1) objM87133R6;
                } else {
                    function4 = function2;
                }
                c13825tM30800y = null;
                if (viewState.getShowBorder()) {
                    c28655q2.m87150e0(-762482718);
                    borderInformation = viewState.getStyle().getBorderInformation();
                    if (borderInformation == null) {
                        c28655q2.m87150e0(-762482719);
                    } else {
                        c28655q2.m87150e0(806687776);
                        c13825tM30800y = AbstractC11471f.m30800y(borderInformation, (float) 1.5d, c28655q2, 48);
                    }
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-762447813);
                }
                c28655q2.m87173q(false);
                C13825t c13825t2 = c13825tM30800y;
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z16, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87264r(new C16542i(2, interfaceC28601c1));
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC28670t2 interfaceC28670t4 = (InterfaceC28670t2) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87264r(new C16542i(3, interfaceC28601c1));
                    c28655q2.m87172p0(objM87133R4);
                }
                InterfaceC28670t2 interfaceC28670t5 = (InterfaceC28670t2) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC11895b.m32005x(100, c28655q2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
                if (m46880v(interfaceC28601c1)) {
                    iM46870l = m46870l(interfaceC28601c2);
                } else {
                    iM46870l = 5;
                }
                InterfaceC28670t2 interfaceC28670t2M30589c2 = AbstractC11352g.m30589c(iM46870l, c28655q2);
                String strM21274h2 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, 0);
                float f14 = 4;
                Function1 function6 = function4;
                c28655q = c28655q2;
                Modifier modifier6 = modifier4;
                AbstractC31926e.m99375j(modifier6, null, C38072d.f163053a.m121949b(c28655q2, 6).getTransparent(), AbstractC33253j.m105489e(3 * f14), c13825t2, null, f14 * 1, AbstractC37817c.m121344e(-1232215214, c28655q2, new C16545l(viewState, interfaceC28670t4, function6, strM21274h2, interfaceC28670t5, interfaceC28601c4, interfaceC28670t2M30589c2, interfaceC28601c2, interfaceC28601c1)), c28655q, (i18 & 14) | 14155776, 34);
                function3 = function6;
                modifier3 = modifier6;
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14143e(i13, i14, 3, modifier3, viewState, function3, z15);
            }
        }
        i15 |= 384;
        z13 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z14)) {
                if (i19 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C16554u(1);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function4 = (Function1) objM87133R6;
                } else {
                    function4 = function2;
                }
                c13825tM30800y = null;
                if (viewState.getShowBorder()) {
                    c28655q2.m87150e0(-762482718);
                    borderInformation = viewState.getStyle().getBorderInformation();
                    if (borderInformation == null) {
                        c28655q2.m87150e0(-762482719);
                    } else {
                        c28655q2.m87150e0(806687776);
                        c13825tM30800y = AbstractC11471f.m30800y(borderInformation, (float) 1.5d, c28655q2, 48);
                    }
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-762447813);
                }
                c28655q2.m87173q(false);
                C13825t c13825t3 = c13825tM30800y;
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z16, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87264r(new C16542i(2, interfaceC28601c1));
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC28670t2 interfaceC28670t6 = (InterfaceC28670t2) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87264r(new C16542i(3, interfaceC28601c1));
                    c28655q2.m87172p0(objM87133R4);
                }
                InterfaceC28670t2 interfaceC28670t7 = (InterfaceC28670t2) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC11895b.m32005x(100, c28655q2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
                if (m46880v(interfaceC28601c1)) {
                    iM46870l = m46870l(interfaceC28601c2);
                } else {
                    iM46870l = 5;
                }
                InterfaceC28670t2 interfaceC28670t2M30589c3 = AbstractC11352g.m30589c(iM46870l, c28655q2);
                String strM21274h3 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, 0);
                float f15 = 4;
                Function1 function7 = function4;
                c28655q = c28655q2;
                Modifier modifier7 = modifier4;
                AbstractC31926e.m99375j(modifier7, null, C38072d.f163053a.m121949b(c28655q2, 6).getTransparent(), AbstractC33253j.m105489e(3 * f15), c13825t3, null, f15 * 1, AbstractC37817c.m121344e(-1232215214, c28655q2, new C16545l(viewState, interfaceC28670t6, function7, strM21274h3, interfaceC28670t7, interfaceC28601c5, interfaceC28670t2M30589c3, interfaceC28601c2, interfaceC28601c1)), c28655q, (i18 & 14) | 14155776, 34);
                function3 = function7;
                modifier3 = modifier7;
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14143e(i13, i14, 3, modifier3, viewState, function3, z15);
            }
        }
        i15 |= 3072;
        function2 = function1;
        i18 = i15;
        if ((i18 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i18 & 1, z14)) {
            if (i19 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i24 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C16554u(1);
                    c28655q2.m87172p0(objM87133R6);
                }
                function4 = (Function1) objM87133R6;
            } else {
                function4 = function2;
            }
            c13825tM30800y = null;
            if (viewState.getShowBorder()) {
                c28655q2.m87150e0(-762482718);
                borderInformation = viewState.getStyle().getBorderInformation();
                if (borderInformation == null) {
                    c28655q2.m87150e0(-762482719);
                } else {
                    c28655q2.m87150e0(806687776);
                    c13825tM30800y = AbstractC11471f.m30800y(borderInformation, (float) 1.5d, c28655q2, 48);
                }
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-762447813);
            }
            c28655q2.m87173q(false);
            C13825t c13825t4 = c13825tM30800y;
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95647w(z16, c28655q2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87264r(new C16542i(2, interfaceC28601c1));
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC28670t2 interfaceC28670t8 = (InterfaceC28670t2) objM87133R3;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87264r(new C16542i(3, interfaceC28601c1));
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC28670t2 interfaceC28670t9 = (InterfaceC28670t2) objM87133R4;
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC11895b.m32005x(100, c28655q2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
            if (m46880v(interfaceC28601c1)) {
                iM46870l = m46870l(interfaceC28601c2);
            } else {
                iM46870l = 5;
            }
            InterfaceC28670t2 interfaceC28670t2M30589c4 = AbstractC11352g.m30589c(iM46870l, c28655q2);
            String strM21274h4 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, 0);
            float f16 = 4;
            Function1 function8 = function4;
            c28655q = c28655q2;
            Modifier modifier8 = modifier4;
            AbstractC31926e.m99375j(modifier8, null, C38072d.f163053a.m121949b(c28655q2, 6).getTransparent(), AbstractC33253j.m105489e(3 * f16), c13825t4, null, f16 * 1, AbstractC37817c.m121344e(-1232215214, c28655q2, new C16545l(viewState, interfaceC28670t8, function8, strM21274h4, interfaceC28670t9, interfaceC28601c6, interfaceC28670t2M30589c4, interfaceC28601c2, interfaceC28601c1)), c28655q, (i18 & 14) | 14155776, 34);
            function3 = function8;
            modifier3 = modifier8;
            z15 = z16;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14143e(i13, i14, 3, modifier3, viewState, function3, z15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m46868j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final int m46869k(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }

    /* JADX INFO: renamed from: l */
    private static final int m46870l(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: m */
    private static final void m46871m(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: n */
    private static final int m46872n(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m46873o(C16534a0 c16534a0, InterfaceC28670t2 interfaceC28670t2, Function1 function1, String str, InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t4, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, Composer composer, int i13) {
        int i14;
        int i15;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 4;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3412i(AbstractC1091c.m3355a(c16534a0.getStyle().getStyleModifier(), null, 3), 30 * f13, m46883y(interfaceC28670t2)));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3393o = AbstractC1099a.m3393o(c16534a0.getPadding(), AbstractC1102d.m3409f(1.0f, c2314t));
            C2307m c2307m = C2299e.f9117z;
            C1100b c1100b = C1100b.f4583a;
            Modifier modifierMo3400a = c1100b.mo3400a(modifierM3393o, c2307m);
            float f14 = 8;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(1 * f14);
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3400a);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * f14), C2299e.f9110M, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 54);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            AbstractC22403o abstractC22403oM46716g = c16534a0.getTitleIconUrl();
            if (abstractC22403oM46716g == null) {
                c28655q.m87150e0(236156806);
                c28655q.m87173q(false);
                i14 = 6;
            } else {
                c28655q.m87150e0(236156807);
                float f15 = 2 * f13;
                i14 = 6;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM46716g, null, null, c28655q, 0, 3), null, AbstractC1102d.m3419p(f15, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
                c28655q = c28655q;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f15, c2314t));
                c28655q.m87173q(false);
            }
            C38072d c38072d = C38072d.f163053a;
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i14).getB1();
            int iM46869k = m46869k(interfaceC28670t3);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C16546m(2, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(str, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM46869k, 0, (Function1) objM87133R, c2886aM8420a, null, c28655q2, 0, 196656, 153594);
            C28655q c28655q3 = c28655q2;
            EnumC16313m0 enumC16313m0M46710a = c16534a0.getEndIcon();
            if (enumC16313m0M46710a == null) {
                c28655q3.m87150e0(237090278);
                i15 = 0;
                c28655q3.m87173q(false);
            } else {
                AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q3, 237090279, enumC16313m0M46710a, c28655q3, i14), null, AbstractC1102d.m3419p(f13 * f13, c2314t), c38072d.m121949b(c28655q3, i14).getWhite70(), c28655q3, 432, 0);
                c28655q3 = c28655q3;
                i15 = 0;
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(true);
            String strM21274h = AbstractC8693b.m21274h(c16534a0.getSubtitle(), c28655q3, i15);
            long jM125385c1 = c38072d.m121949b(c28655q3, i14).getWhite70();
            C2886a c2886aM8420a2 = c38072d.m121952e(c28655q3, i14).getB1();
            int iM46872n = m46872n(interfaceC28670t4);
            Object objM87133R2 = c28655q3.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C16547n(1, interfaceC28601c1, interfaceC28601c2);
                c28655q3.m87172p0(objM87133R2);
            }
            C28655q c28655q4 = c28655q3;
            AbstractC30795n.m94707h(strM21274h, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM46872n, 0, (Function1) objM87133R2, c2886aM8420a2, null, c28655q4, 0, 196656, 153594);
            c28655q4.m87173q(true);
            c28655q4.m87173q(true);
            if ((m46878t(interfaceC28601c1) || m46880v(interfaceC28601c3)) && c16534a0.getIsCardExpandable()) {
                c28655q4.m87150e0(2102227669);
                boolean zM46880v = m46880v(interfaceC28601c3);
                boolean zM87153g = c28655q4.m87153g(function1) | c28655q4.m87153g(c16534a0) | c28655q4.m87153g(str);
                Object objM87133R3 = c28655q4.m87133R();
                if (zM87153g || objM87133R3 == c28676v0) {
                    objM87133R3 = new C11377m0(function1, c16534a0, str, interfaceC28601c3, 2);
                    c28655q4.m87172p0(objM87133R3);
                }
                AbstractC16557x.m46850e(c1100b, null, zM46880v, false, (InterfaceC4339a) objM87133R3, c28655q4, 6, 5);
                c28655q4.m87173q(false);
            } else {
                c28655q4.m87150e0(2102647626);
                c28655q4.m87173q(false);
            }
            c28655q4.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m46874p(InterfaceC28601c1 interfaceC28601c1, C23277r0 result) {
        AbstractC22676k.m65750j(result, "result");
        m46879u(interfaceC28601c1, result.m67336e());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m46875q(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C23277r0 result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.m67336e()) {
            m46879u(interfaceC28601c1, true);
        } else {
            m46871m(interfaceC28601c2, result.f92228b.f92263f);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m46876r(Function1 function1, C16534a0 c16534a0, String str, InterfaceC28601c1 interfaceC28601c1) {
        m46881w(interfaceC28601c1, !m46880v(interfaceC28601c1));
        String appNotificationType = c16534a0.getAppNotificationType();
        if (appNotificationType == null) {
            appNotificationType = "";
        }
        function1.invoke(new C16551r(appNotificationType, str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m46877s(Modifier modifier, C16534a0 c16534a0, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m46867i(modifier, c16534a0, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final boolean m46878t(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    private static final void m46879u(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: v */
    private static final boolean m46880v(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: w */
    private static final void m46881w(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C39174f m46882x(InterfaceC28601c1 interfaceC28601c1) {
        return new C39174f(m46880v(interfaceC28601c1) ? Float.NaN : C16536c.f63627a.m46720b());
    }

    /* JADX INFO: renamed from: y */
    private static final float m46883y(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final int m46884z(InterfaceC28601c1 interfaceC28601c1) {
        return m46880v(interfaceC28601c1) ? Integer.MAX_VALUE : 2;
    }
}
