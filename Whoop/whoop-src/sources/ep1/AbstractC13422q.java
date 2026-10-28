package ep1;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b01.C2192m;
import b91.C2886a;
import bf0.C3195g;
import bp1.AbstractC3535b;
import bs1.C3590i;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cp1.AbstractC11022i;
import cp1.C11026m;
import cp1.C11027n;
import cp1.C11028o;
import d42.C11689e;
import d42.C11693i;
import d42.C11699o;
import e11.C12582b;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import l83.C23471q;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p705ea2.C12906g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;
import xn1.AbstractC38480c;
import xn1.AbstractC38481d;

/* JADX INFO: renamed from: ep1.q */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aW\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aW\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\u000e\u0010\u0013\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcp1/n;", "viewState", "Lkotlin/Function1;", "Lcp1/i;", "Ll83/a0;", "onViewEvent", "Lbp1/b;", "onNavigationEvent", "", "initialShowWelcomeScreen", "isInitialScreen", "D", "(Lcp1/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;II)V", "Lcp1/o;", "Lkotlin/Function0;", "showDueDateScreen", "M", "(Lcp1/o;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "Lcp1/m;", "showWelcomeScreen", "t", "(Lcp1/m;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "selectedDateText", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13422q {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m38013A(InterfaceC28601c1 interfaceC28601c1, InterfaceC22997s1 Button, Composer composer, int i13) {
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String strM38053v = m38053v(interfaceC28601c1);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM38053v, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getN8(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m38014B(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(new AbstractC11022i.h(m38053v(interfaceC28601c1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m38015C(C11026m c11026m, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m38051t(c11026m, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012e  */
    /* JADX WARN: Code duplicated, block: B:104:0x013e  */
    /* JADX WARN: Code duplicated, block: B:106:0x016c  */
    /* JADX WARN: Code duplicated, block: B:108:0x017f  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01af  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0111  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x011b  */
    /* JADX INFO: renamed from: D */
    public static final void m38016D(C11027n viewState, Function1 function1, Function1 function2, boolean z4, boolean z13, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        int i18;
        boolean z14;
        int i19;
        int i24;
        int i25;
        boolean z15;
        boolean z16;
        Function1 function5;
        Function1 function6;
        boolean z17;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        int i26;
        Function1 function7;
        boolean z18;
        boolean z19;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        int i27;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objM87133R2;
        Function1 function8;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(547404463);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        z14 = z4;
                        if (c28655q.m87155h(z14)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            if (c28655q.m87155h(z13)) {
                                i25 = 16384;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        if ((i15 & 9363) != 9362) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z15)) {
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R6 = c28655q.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = new C13406a(12);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                function7 = (Function1) objM87133R6;
                                i26 = i18;
                            } else {
                                i26 = i18;
                                function7 = function3;
                            }
                            if (i16 != 0) {
                                objM87133R5 = c28655q.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = new C13406a(16);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                function4 = (Function1) objM87133R5;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            } else {
                                z18 = z14;
                            }
                            if (i24 != 0) {
                                z19 = false;
                            } else {
                                z19 = z13;
                            }
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            i27 = 57344 & i15;
                            if (i27 == 16384) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            if ((i15 & 896) == 256) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            boolean z28 = z24 | z25;
                            if ((i15 & 112) == 32) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            z27 = z28 | z26;
                            objM87133R2 = c28655q.m87133R();
                            if (z27 || objM87133R2 == c28676v0) {
                                objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                            if (m38019G(interfaceC28601c1)) {
                                c28655q.m87150e0(-263734046);
                                C11028o c11028oM29655b = viewState.getWelcomeScreenState();
                                objM87133R4 = c28655q.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C2192m(27, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                int i29 = i15 << 3;
                                Function1 function9 = function4;
                                m38025M(c11028oM29655b, (InterfaceC4339a) objM87133R4, function7, function9, z19, c28655q, (i29 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i29 & 896) | i27, 0);
                                function8 = function9;
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                function8 = function4;
                                c28655q.m87150e0(-263428789);
                                C11026m c11026mM29654a = viewState.getDueDateState();
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C2192m(28, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                m38051t(c11026mM29654a, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                                c28655q.m87173q(false);
                            }
                            z17 = z18;
                            function5 = function7;
                            function6 = function8;
                            z16 = z19;
                        } else {
                            c28655q.m87138X();
                            z16 = z13;
                            function5 = function3;
                            function6 = function4;
                            z17 = z14;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
                        }
                    }
                    i15 |= 24576;
                    if ((i15 & 9363) != 9362) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z15)) {
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C13406a(12);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function7 = (Function1) objM87133R6;
                            i26 = i18;
                        } else {
                            i26 = i18;
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C13406a(16);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function4 = (Function1) objM87133R5;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if (i24 != 0) {
                            z19 = false;
                        } else {
                            z19 = z13;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        i27 = 57344 & i15;
                        if (i27 == 16384) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z29 = z24 | z25;
                        if ((i15 & 112) == 32) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z29 | z26;
                        objM87133R2 = c28655q.m87133R();
                        if (z27) {
                            objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                        if (m38019G(interfaceC28601c1)) {
                            c28655q.m87150e0(-263734046);
                            C11028o c11028oM29655b2 = viewState.getWelcomeScreenState();
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C2192m(27, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R4);
                            }
                            int i210 = i15 << 3;
                            Function1 function10 = function4;
                            m38025M(c11028oM29655b2, (InterfaceC4339a) objM87133R4, function7, function10, z19, c28655q, (i210 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i210 & 896) | i27, 0);
                            function8 = function10;
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function8 = function4;
                            c28655q.m87150e0(-263428789);
                            C11026m c11026mM29654a2 = viewState.getDueDateState();
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C2192m(28, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m38051t(c11026mM29654a2, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                            c28655q.m87173q(false);
                        }
                        z17 = z18;
                        function5 = function7;
                        function6 = function8;
                        z16 = z19;
                    } else {
                        c28655q.m87138X();
                        z16 = z13;
                        function5 = function3;
                        function6 = function4;
                        z17 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
                    }
                }
                i15 |= 3072;
                z14 = z4;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87155h(z13)) {
                            i25 = 16384;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z15)) {
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C13406a(12);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function7 = (Function1) objM87133R6;
                            i26 = i18;
                        } else {
                            i26 = i18;
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C13406a(16);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function4 = (Function1) objM87133R5;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if (i24 != 0) {
                            z19 = false;
                        } else {
                            z19 = z13;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        i27 = 57344 & i15;
                        if (i27 == 16384) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z210 = z24 | z25;
                        if ((i15 & 112) == 32) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z210 | z26;
                        objM87133R2 = c28655q.m87133R();
                        if (z27) {
                            objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                        if (m38019G(interfaceC28601c1)) {
                            c28655q.m87150e0(-263734046);
                            C11028o c11028oM29655b3 = viewState.getWelcomeScreenState();
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C2192m(27, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R4);
                            }
                            int i211 = i15 << 3;
                            Function1 function11 = function4;
                            m38025M(c11028oM29655b3, (InterfaceC4339a) objM87133R4, function7, function11, z19, c28655q, (i211 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i211 & 896) | i27, 0);
                            function8 = function11;
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function8 = function4;
                            c28655q.m87150e0(-263428789);
                            C11026m c11026mM29654a3 = viewState.getDueDateState();
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C2192m(28, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m38051t(c11026mM29654a3, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                            c28655q.m87173q(false);
                        }
                        z17 = z18;
                        function5 = function7;
                        function6 = function8;
                        z16 = z19;
                    } else {
                        c28655q.m87138X();
                        z16 = z13;
                        function5 = function3;
                        function6 = function4;
                        z17 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
                    }
                }
                i15 |= 24576;
                if ((i15 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C13406a(12);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                        i26 = i18;
                    } else {
                        i26 = i18;
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13406a(16);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z13;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    i27 = 57344 & i15;
                    if (i27 == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z211 = z24 | z25;
                    if ((i15 & 112) == 32) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z211 | z26;
                    objM87133R2 = c28655q.m87133R();
                    if (z27) {
                        objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                    if (m38019G(interfaceC28601c1)) {
                        c28655q.m87150e0(-263734046);
                        C11028o c11028oM29655b4 = viewState.getWelcomeScreenState();
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C2192m(27, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i212 = i15 << 3;
                        Function1 function12 = function4;
                        m38025M(c11028oM29655b4, (InterfaceC4339a) objM87133R4, function7, function12, z19, c28655q, (i212 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i212 & 896) | i27, 0);
                        function8 = function12;
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function8 = function4;
                        c28655q.m87150e0(-263428789);
                        C11026m c11026mM29654a4 = viewState.getDueDateState();
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C2192m(28, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m38051t(c11026mM29654a4, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                        c28655q.m87173q(false);
                    }
                    z17 = z18;
                    function5 = function7;
                    function6 = function8;
                    z16 = z19;
                } else {
                    c28655q.m87138X();
                    z16 = z13;
                    function5 = function3;
                    function6 = function4;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
                }
            }
            i15 |= 384;
            function4 = function2;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z14 = z4;
                    if (c28655q.m87155h(z14)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87155h(z13)) {
                            i25 = 16384;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z15)) {
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C13406a(12);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function7 = (Function1) objM87133R6;
                            i26 = i18;
                        } else {
                            i26 = i18;
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C13406a(16);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function4 = (Function1) objM87133R5;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if (i24 != 0) {
                            z19 = false;
                        } else {
                            z19 = z13;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        i27 = 57344 & i15;
                        if (i27 == 16384) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z212 = z24 | z25;
                        if ((i15 & 112) == 32) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z212 | z26;
                        objM87133R2 = c28655q.m87133R();
                        if (z27) {
                            objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                        if (m38019G(interfaceC28601c1)) {
                            c28655q.m87150e0(-263734046);
                            C11028o c11028oM29655b5 = viewState.getWelcomeScreenState();
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C2192m(27, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R4);
                            }
                            int i213 = i15 << 3;
                            Function1 function13 = function4;
                            m38025M(c11028oM29655b5, (InterfaceC4339a) objM87133R4, function7, function13, z19, c28655q, (i213 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i213 & 896) | i27, 0);
                            function8 = function13;
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function8 = function4;
                            c28655q.m87150e0(-263428789);
                            C11026m c11026mM29654a5 = viewState.getDueDateState();
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C2192m(28, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m38051t(c11026mM29654a5, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                            c28655q.m87173q(false);
                        }
                        z17 = z18;
                        function5 = function7;
                        function6 = function8;
                        z16 = z19;
                    } else {
                        c28655q.m87138X();
                        z16 = z13;
                        function5 = function3;
                        function6 = function4;
                        z17 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
                    }
                }
                i15 |= 24576;
                if ((i15 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C13406a(12);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                        i26 = i18;
                    } else {
                        i26 = i18;
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13406a(16);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z13;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    i27 = 57344 & i15;
                    if (i27 == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z213 = z24 | z25;
                    if ((i15 & 112) == 32) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z213 | z26;
                    objM87133R2 = c28655q.m87133R();
                    if (z27) {
                        objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                    if (m38019G(interfaceC28601c1)) {
                        c28655q.m87150e0(-263734046);
                        C11028o c11028oM29655b6 = viewState.getWelcomeScreenState();
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C2192m(27, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i214 = i15 << 3;
                        Function1 function14 = function4;
                        m38025M(c11028oM29655b6, (InterfaceC4339a) objM87133R4, function7, function14, z19, c28655q, (i214 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i214 & 896) | i27, 0);
                        function8 = function14;
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function8 = function4;
                        c28655q.m87150e0(-263428789);
                        C11026m c11026mM29654a6 = viewState.getDueDateState();
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C2192m(28, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m38051t(c11026mM29654a6, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                        c28655q.m87173q(false);
                    }
                    z17 = z18;
                    function5 = function7;
                    function6 = function8;
                    z16 = z19;
                } else {
                    c28655q.m87138X();
                    z16 = z13;
                    function5 = function3;
                    function6 = function4;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
                }
            }
            i15 |= 3072;
            z14 = z4;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i25 = 16384;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C13406a(12);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                        i26 = i18;
                    } else {
                        i26 = i18;
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13406a(16);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z13;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    i27 = 57344 & i15;
                    if (i27 == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z214 = z24 | z25;
                    if ((i15 & 112) == 32) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z214 | z26;
                    objM87133R2 = c28655q.m87133R();
                    if (z27) {
                        objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                    if (m38019G(interfaceC28601c1)) {
                        c28655q.m87150e0(-263734046);
                        C11028o c11028oM29655b7 = viewState.getWelcomeScreenState();
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C2192m(27, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i215 = i15 << 3;
                        Function1 function15 = function4;
                        m38025M(c11028oM29655b7, (InterfaceC4339a) objM87133R4, function7, function15, z19, c28655q, (i215 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i215 & 896) | i27, 0);
                        function8 = function15;
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function8 = function4;
                        c28655q.m87150e0(-263428789);
                        C11026m c11026mM29654a7 = viewState.getDueDateState();
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C2192m(28, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m38051t(c11026mM29654a7, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                        c28655q.m87173q(false);
                    }
                    z17 = z18;
                    function5 = function7;
                    function6 = function8;
                    z16 = z19;
                } else {
                    c28655q.m87138X();
                    z16 = z13;
                    function5 = function3;
                    function6 = function4;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
                }
            }
            i15 |= 24576;
            if ((i15 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C13406a(12);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                    i26 = i18;
                } else {
                    i26 = i18;
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13406a(16);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                }
                if (i26 != 0) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
                if (i24 != 0) {
                    z19 = false;
                } else {
                    z19 = z13;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                i27 = 57344 & i15;
                if (i27 == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if ((i15 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z215 = z24 | z25;
                if ((i15 & 112) == 32) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z215 | z26;
                objM87133R2 = c28655q.m87133R();
                if (z27) {
                    objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                if (m38019G(interfaceC28601c1)) {
                    c28655q.m87150e0(-263734046);
                    C11028o c11028oM29655b8 = viewState.getWelcomeScreenState();
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C2192m(27, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i216 = i15 << 3;
                    Function1 function16 = function4;
                    m38025M(c11028oM29655b8, (InterfaceC4339a) objM87133R4, function7, function16, z19, c28655q, (i216 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i216 & 896) | i27, 0);
                    function8 = function16;
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function8 = function4;
                    c28655q.m87150e0(-263428789);
                    C11026m c11026mM29654a8 = viewState.getDueDateState();
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C2192m(28, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m38051t(c11026mM29654a8, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                    c28655q.m87173q(false);
                }
                z17 = z18;
                function5 = function7;
                function6 = function8;
                z16 = z19;
            } else {
                c28655q.m87138X();
                z16 = z13;
                function5 = function3;
                function6 = function4;
                z17 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z14 = z4;
                    if (c28655q.m87155h(z14)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87155h(z13)) {
                            i25 = 16384;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z15)) {
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C13406a(12);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function7 = (Function1) objM87133R6;
                            i26 = i18;
                        } else {
                            i26 = i18;
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C13406a(16);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function4 = (Function1) objM87133R5;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        } else {
                            z18 = z14;
                        }
                        if (i24 != 0) {
                            z19 = false;
                        } else {
                            z19 = z13;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        i27 = 57344 & i15;
                        if (i27 == 16384) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z216 = z24 | z25;
                        if ((i15 & 112) == 32) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z216 | z26;
                        objM87133R2 = c28655q.m87133R();
                        if (z27) {
                            objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                        if (m38019G(interfaceC28601c1)) {
                            c28655q.m87150e0(-263734046);
                            C11028o c11028oM29655b9 = viewState.getWelcomeScreenState();
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C2192m(27, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R4);
                            }
                            int i217 = i15 << 3;
                            Function1 function17 = function4;
                            m38025M(c11028oM29655b9, (InterfaceC4339a) objM87133R4, function7, function17, z19, c28655q, (i217 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i217 & 896) | i27, 0);
                            function8 = function17;
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function8 = function4;
                            c28655q.m87150e0(-263428789);
                            C11026m c11026mM29654a9 = viewState.getDueDateState();
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C2192m(28, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m38051t(c11026mM29654a9, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                            c28655q.m87173q(false);
                        }
                        z17 = z18;
                        function5 = function7;
                        function6 = function8;
                        z16 = z19;
                    } else {
                        c28655q.m87138X();
                        z16 = z13;
                        function5 = function3;
                        function6 = function4;
                        z17 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
                    }
                }
                i15 |= 24576;
                if ((i15 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C13406a(12);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                        i26 = i18;
                    } else {
                        i26 = i18;
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13406a(16);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z13;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    i27 = 57344 & i15;
                    if (i27 == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z217 = z24 | z25;
                    if ((i15 & 112) == 32) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z217 | z26;
                    objM87133R2 = c28655q.m87133R();
                    if (z27) {
                        objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                    if (m38019G(interfaceC28601c1)) {
                        c28655q.m87150e0(-263734046);
                        C11028o c11028oM29655b10 = viewState.getWelcomeScreenState();
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C2192m(27, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i218 = i15 << 3;
                        Function1 function18 = function4;
                        m38025M(c11028oM29655b10, (InterfaceC4339a) objM87133R4, function7, function18, z19, c28655q, (i218 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i218 & 896) | i27, 0);
                        function8 = function18;
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function8 = function4;
                        c28655q.m87150e0(-263428789);
                        C11026m c11026mM29654a10 = viewState.getDueDateState();
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C2192m(28, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m38051t(c11026mM29654a10, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                        c28655q.m87173q(false);
                    }
                    z17 = z18;
                    function5 = function7;
                    function6 = function8;
                    z16 = z19;
                } else {
                    c28655q.m87138X();
                    z16 = z13;
                    function5 = function3;
                    function6 = function4;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
                }
            }
            i15 |= 3072;
            z14 = z4;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i25 = 16384;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C13406a(12);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                        i26 = i18;
                    } else {
                        i26 = i18;
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13406a(16);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z13;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    i27 = 57344 & i15;
                    if (i27 == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z218 = z24 | z25;
                    if ((i15 & 112) == 32) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z218 | z26;
                    objM87133R2 = c28655q.m87133R();
                    if (z27) {
                        objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                    if (m38019G(interfaceC28601c1)) {
                        c28655q.m87150e0(-263734046);
                        C11028o c11028oM29655b11 = viewState.getWelcomeScreenState();
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C2192m(27, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i219 = i15 << 3;
                        Function1 function19 = function4;
                        m38025M(c11028oM29655b11, (InterfaceC4339a) objM87133R4, function7, function19, z19, c28655q, (i219 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i219 & 896) | i27, 0);
                        function8 = function19;
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function8 = function4;
                        c28655q.m87150e0(-263428789);
                        C11026m c11026mM29654a11 = viewState.getDueDateState();
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C2192m(28, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m38051t(c11026mM29654a11, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                        c28655q.m87173q(false);
                    }
                    z17 = z18;
                    function5 = function7;
                    function6 = function8;
                    z16 = z19;
                } else {
                    c28655q.m87138X();
                    z16 = z13;
                    function5 = function3;
                    function6 = function4;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
                }
            }
            i15 |= 24576;
            if ((i15 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C13406a(12);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                    i26 = i18;
                } else {
                    i26 = i18;
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13406a(16);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                }
                if (i26 != 0) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
                if (i24 != 0) {
                    z19 = false;
                } else {
                    z19 = z13;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                i27 = 57344 & i15;
                if (i27 == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if ((i15 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z219 = z24 | z25;
                if ((i15 & 112) == 32) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z219 | z26;
                objM87133R2 = c28655q.m87133R();
                if (z27) {
                    objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                if (m38019G(interfaceC28601c1)) {
                    c28655q.m87150e0(-263734046);
                    C11028o c11028oM29655b12 = viewState.getWelcomeScreenState();
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C2192m(27, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i2110 = i15 << 3;
                    Function1 function110 = function4;
                    m38025M(c11028oM29655b12, (InterfaceC4339a) objM87133R4, function7, function110, z19, c28655q, (i2110 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i2110 & 896) | i27, 0);
                    function8 = function110;
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function8 = function4;
                    c28655q.m87150e0(-263428789);
                    C11026m c11026mM29654a12 = viewState.getDueDateState();
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C2192m(28, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m38051t(c11026mM29654a12, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                    c28655q.m87173q(false);
                }
                z17 = z18;
                function5 = function7;
                function6 = function8;
                z16 = z19;
            } else {
                c28655q.m87138X();
                z16 = z13;
                function5 = function3;
                function6 = function4;
                z17 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
            }
        }
        i15 |= 384;
        function4 = function2;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                z14 = z4;
                if (c28655q.m87155h(z14)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i25 = 16384;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C13406a(12);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                        i26 = i18;
                    } else {
                        i26 = i18;
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13406a(16);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z13;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    i27 = 57344 & i15;
                    if (i27 == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z2110 = z24 | z25;
                    if ((i15 & 112) == 32) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z2110 | z26;
                    objM87133R2 = c28655q.m87133R();
                    if (z27) {
                        objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                    if (m38019G(interfaceC28601c1)) {
                        c28655q.m87150e0(-263734046);
                        C11028o c11028oM29655b13 = viewState.getWelcomeScreenState();
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C2192m(27, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i2111 = i15 << 3;
                        Function1 function111 = function4;
                        m38025M(c11028oM29655b13, (InterfaceC4339a) objM87133R4, function7, function111, z19, c28655q, (i2111 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i2111 & 896) | i27, 0);
                        function8 = function111;
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function8 = function4;
                        c28655q.m87150e0(-263428789);
                        C11026m c11026mM29654a13 = viewState.getDueDateState();
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C2192m(28, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m38051t(c11026mM29654a13, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                        c28655q.m87173q(false);
                    }
                    z17 = z18;
                    function5 = function7;
                    function6 = function8;
                    z16 = z19;
                } else {
                    c28655q.m87138X();
                    z16 = z13;
                    function5 = function3;
                    function6 = function4;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
                }
            }
            i15 |= 24576;
            if ((i15 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C13406a(12);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                    i26 = i18;
                } else {
                    i26 = i18;
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13406a(16);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                }
                if (i26 != 0) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
                if (i24 != 0) {
                    z19 = false;
                } else {
                    z19 = z13;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                i27 = 57344 & i15;
                if (i27 == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if ((i15 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z2111 = z24 | z25;
                if ((i15 & 112) == 32) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z2111 | z26;
                objM87133R2 = c28655q.m87133R();
                if (z27) {
                    objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                if (m38019G(interfaceC28601c1)) {
                    c28655q.m87150e0(-263734046);
                    C11028o c11028oM29655b14 = viewState.getWelcomeScreenState();
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C2192m(27, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i2112 = i15 << 3;
                    Function1 function112 = function4;
                    m38025M(c11028oM29655b14, (InterfaceC4339a) objM87133R4, function7, function112, z19, c28655q, (i2112 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i2112 & 896) | i27, 0);
                    function8 = function112;
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function8 = function4;
                    c28655q.m87150e0(-263428789);
                    C11026m c11026mM29654a14 = viewState.getDueDateState();
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C2192m(28, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m38051t(c11026mM29654a14, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                    c28655q.m87173q(false);
                }
                z17 = z18;
                function5 = function7;
                function6 = function8;
                z16 = z19;
            } else {
                c28655q.m87138X();
                z16 = z13;
                function5 = function3;
                function6 = function4;
                z17 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
            }
        }
        i15 |= 3072;
        z14 = z4;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q.m87155h(z13)) {
                    i25 = 16384;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i15 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C13406a(12);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                    i26 = i18;
                } else {
                    i26 = i18;
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13406a(16);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                }
                if (i26 != 0) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
                if (i24 != 0) {
                    z19 = false;
                } else {
                    z19 = z13;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95647w(z18, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                i27 = 57344 & i15;
                if (i27 == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if ((i15 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z2112 = z24 | z25;
                if ((i15 & 112) == 32) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z2112 | z26;
                objM87133R2 = c28655q.m87133R();
                if (z27) {
                    objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
                if (m38019G(interfaceC28601c1)) {
                    c28655q.m87150e0(-263734046);
                    C11028o c11028oM29655b15 = viewState.getWelcomeScreenState();
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C2192m(27, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i2113 = i15 << 3;
                    Function1 function113 = function4;
                    m38025M(c11028oM29655b15, (InterfaceC4339a) objM87133R4, function7, function113, z19, c28655q, (i2113 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i2113 & 896) | i27, 0);
                    function8 = function113;
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function8 = function4;
                    c28655q.m87150e0(-263428789);
                    C11026m c11026mM29654a15 = viewState.getDueDateState();
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C2192m(28, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m38051t(c11026mM29654a15, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                    c28655q.m87173q(false);
                }
                z17 = z18;
                function5 = function7;
                function6 = function8;
                z16 = z19;
            } else {
                c28655q.m87138X();
                z16 = z13;
                function5 = function3;
                function6 = function4;
                z17 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
            }
        }
        i15 |= 24576;
        if ((i15 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i15 & 1, z15)) {
            c28676v0 = C28635l.f115821a;
            if (i28 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C13406a(12);
                    c28655q.m87172p0(objM87133R6);
                }
                function7 = (Function1) objM87133R6;
                i26 = i18;
            } else {
                i26 = i18;
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C13406a(16);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            }
            if (i26 != 0) {
                z18 = true;
            } else {
                z18 = z14;
            }
            if (i24 != 0) {
                z19 = false;
            } else {
                z19 = z13;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95647w(z18, c28655q);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            i27 = 57344 & i15;
            if (i27 == 16384) {
                z24 = true;
            } else {
                z24 = false;
            }
            if ((i15 & 896) == 256) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z2113 = z24 | z25;
            if ((i15 & 112) == 32) {
                z26 = true;
            } else {
                z26 = false;
            }
            z27 = z2113 | z26;
            objM87133R2 = c28655q.m87133R();
            if (z27) {
                objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C13420o(z19, function4, function7, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
            if (m38019G(interfaceC28601c1)) {
                c28655q.m87150e0(-263734046);
                C11028o c11028oM29655b16 = viewState.getWelcomeScreenState();
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C2192m(27, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R4);
                }
                int i2114 = i15 << 3;
                Function1 function114 = function4;
                m38025M(c11028oM29655b16, (InterfaceC4339a) objM87133R4, function7, function114, z19, c28655q, (i2114 & 7168) | TextResource.$stable | AbstractC22403o.f87638a | 48 | (i2114 & 896) | i27, 0);
                function8 = function114;
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                function8 = function4;
                c28655q.m87150e0(-263428789);
                C11026m c11026mM29654a16 = viewState.getDueDateState();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C2192m(28, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                m38051t(c11026mM29654a16, (InterfaceC4339a) objM87133R3, function7, c28655q, TextResource.$stable | 48 | ((i15 << 3) & 896), 0);
                c28655q.m87173q(false);
            }
            z17 = z18;
            function5 = function7;
            function6 = function8;
            z16 = z19;
        } else {
            c28655q.m87138X();
            z16 = z13;
            function5 = function3;
            function6 = function4;
            z17 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13421p(viewState, function5, function6, z17, z16, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m38017E(AbstractC11022i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m38018F(AbstractC3535b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final boolean m38019G(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: H */
    private static final void m38020H(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m38021I(boolean z4, Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1) {
        if (!m38019G(interfaceC28601c1)) {
            m38020H(interfaceC28601c1, true);
        } else if (z4) {
            function1.invoke(AbstractC3535b.a.f14171a);
        } else {
            function2.invoke(new AbstractC11022i.c(null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m38022J(InterfaceC28601c1 interfaceC28601c1) {
        m38020H(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m38023K(InterfaceC28601c1 interfaceC28601c1) {
        m38020H(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m38024L(C11027n c11027n, Function1 function1, Function1 function2, boolean z4, boolean z13, int i13, int i14, Composer composer, int i15) {
        m38016D(c11027n, function1, function2, z4, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x026b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0276  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:108:0x02db  */
    /* JADX WARN: Code duplicated, block: B:111:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:116:0x039e  */
    /* JADX WARN: Code duplicated, block: B:117:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:120:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:124:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:126:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:129:0x03df  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00de  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x0111  */
    /* JADX WARN: Code duplicated, block: B:70:0x0141  */
    /* JADX WARN: Code duplicated, block: B:73:0x0157  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x0203  */
    /* JADX WARN: Code duplicated, block: B:87:0x0249  */
    /* JADX WARN: Code duplicated, block: B:88:0x024b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0252  */
    /* JADX WARN: Code duplicated, block: B:92:0x0254  */
    /* JADX WARN: Code duplicated, block: B:95:0x025c  */
    /* JADX WARN: Code duplicated, block: B:96:0x025e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0266  */
    /* JADX INFO: renamed from: M */
    public static final void m38025M(C11028o viewState, InterfaceC4339a interfaceC4339a, Function1 onViewEvent, Function1 function1, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z13;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        Function1 function4;
        C28676v0 c28676v1;
        C0209i c0209i4;
        C2314t c2314t2;
        C0209i c0209i5;
        float f13;
        int iHashCode2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R;
        C28676v0 c28676v2;
        Function1 function5;
        C28655q c28655q;
        int i16;
        int iHashCode3;
        boolean z18;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        int i17;
        InterfaceC4339a showDueDateScreen = interfaceC4339a;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(showDueDateScreen, "showDueDateScreen");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1956716023);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(showDueDateScreen) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87155h(z4)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13406a(13);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function2 = (Function1) objM87133R5;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, c2314t));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66722k);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N);
                if (viewState.getBackgroundImageUrl() != null) {
                    c28655q2.m87150e0(1021575246);
                    Function1 function6 = function2;
                    c0209i4 = c0209i2;
                    c2314t2 = c2314t;
                    AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(viewState.getBackgroundImageUrl(), null, null, c28655q2, AbstractC22403o.f87638a, 3);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t2);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C13406a(14);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3407d, (Function1) objM87133R3);
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C13406a(15);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c0209i5 = c0209i;
                    function4 = function6;
                    f13 = 1.0f;
                    c28676v1 = c28676v0;
                    AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1099a.m3398t(AbstractC1125a.m3480c(modifierM3486a, (Function1) objM87133R4), 0.0f, 0.0f, 0.0f, 14 * 8, 7), null, C39102j.f168199a, 0.0f, null, c28655q2, 24624, 104);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else {
                    function4 = function2;
                    c28676v1 = c28676v0;
                    c0209i4 = c0209i2;
                    c2314t2 = c2314t;
                    c0209i5 = c0209i;
                    f13 = 1.0f;
                    c28655q2.m87150e0(1022376069);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(f13, c2314t2));
                C22961h c22961h = AbstractC22977m.f90656g;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q2, 6);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM66724m);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a);
                C0209i c0209i7 = c0209i4;
                AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N2);
                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                C38072d c38072d = C38072d.f163053a;
                AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21267a, null, AbstractC13673n.m38561h(c38072d), AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                Modifier modifierM66724m2 = AbstractC22953f.m66724m(c2314t2);
                if ((57344 & i15) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z19 = z14 | z15;
                if ((i15 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z19 | z16;
                objM87133R = c28655q2.m87133R();
                if (z17) {
                    c28676v2 = c28676v1;
                } else {
                    c28676v2 = c28676v1;
                    if (objM87133R == c28676v2) {
                        function5 = function4;
                    }
                    c28655q = c28655q2;
                    Function1 function7 = function5;
                    C28676v0 c28676v3 = c28676v2;
                    i16 = i15;
                    AbstractC6719b.m20143d(modifierM66724m2, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
                    float f14 = 4;
                    float f15 = 8;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(f14 * f15, c2314t2);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
                    TextResource textResourceM29659d = viewState.getTitle();
                    int i19 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(textResourceM29659d, c28655q, i19);
                    int i24 = C38072d.f163054b;
                    long jM125430y = c38072d.m121949b(c28655q, i24).getBrandWhite();
                    C2886a c2886aM8417O = c38072d.m121952e(c28655q, i24).getT2();
                    int i25 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 0, i25, 196602);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f15, c2314t2));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i19), null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB1(), null, c28655q, 0, i25, 196602);
                    AbstractC18489d0.m53380u(11, f14, c2314t2, c28655q);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                    EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                    String strM21274h2 = AbstractC8693b.m21274h(viewState.getButton(), c28655q, i19);
                    long jM125377a = c38072d.m121949b(c28655q, i24).getAccentAction();
                    if ((i16 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (!z18 || objM87133R2 == c28676v3) {
                        showDueDateScreen = interfaceC4339a;
                        objM87133R2 = new C11699o(showDueDateScreen, 17);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        showDueDateScreen = interfaceC4339a;
                    }
                    AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h2, false, jM125377a, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 104);
                    c28655q2 = c28655q;
                    AbstractC25012a.m73392y(c28655q2, true, true, true);
                    function3 = function7;
                }
                function5 = function4;
                objM87133R = new C13419n(z4, function5, onViewEvent, 0);
                c28655q2.m87172p0(objM87133R);
                c28655q = c28655q2;
                Function1 function8 = function5;
                C28676v0 c28676v4 = c28676v2;
                i16 = i15;
                AbstractC6719b.m20143d(modifierM66724m2, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
                float f16 = 4;
                float f17 = 8;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(f16 * f17, c2314t2);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
                TextResource textResourceM29659d2 = viewState.getTitle();
                int i110 = TextResource.$stable;
                String strM21274h3 = AbstractC8693b.m21274h(textResourceM29659d2, c28655q, i110);
                int i26 = C38072d.f163054b;
                long jM125430y2 = c38072d.m121949b(c28655q, i26).getBrandWhite();
                C2886a c2886aM8417O2 = c38072d.m121952e(c28655q, i26).getT2();
                int i27 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h3, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O2, null, c28655q, 0, i27, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f17, c2314t2));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i110), null, c38072d.m121949b(c28655q, i26).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i26).getB1(), null, c28655q, 0, i27, 196602);
                AbstractC18489d0.m53380u(11, f16, c2314t2, c28655q);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                String strM21274h4 = AbstractC8693b.m21274h(viewState.getButton(), c28655q, i110);
                long jM125377a2 = c38072d.m121949b(c28655q, i26).getAccentAction();
                if ((i16 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z18) {
                    showDueDateScreen = interfaceC4339a;
                    objM87133R2 = new C11699o(showDueDateScreen, 17);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    showDueDateScreen = interfaceC4339a;
                    objM87133R2 = new C11699o(showDueDateScreen, 17);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27282u.m82292h(modifierM3409f2, enumC27284v2, strM21274h4, false, jM125377a2, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 104);
                c28655q2 = c28655q;
                AbstractC25012a.m73392y(c28655q2, true, true, true);
                function3 = function8;
            } else {
                c28655q2.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g((Object) viewState, (Object) showDueDateScreen, (Object) onViewEvent, (Object) function3, z4, i13, i14, 7);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i13 & 24576) == 0) {
            if (c28655q2.m87155h(z4)) {
                i17 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i17;
        }
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C13406a(13);
                    c28655q2.m87172p0(objM87133R5);
                }
                function2 = (Function1) objM87133R5;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
            c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N5);
            if (viewState.getBackgroundImageUrl() != null) {
                c28655q2.m87150e0(1021575246);
                Function1 function9 = function2;
                c0209i4 = c0209i2;
                c2314t2 = c2314t;
                AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(viewState.getBackgroundImageUrl(), null, null, c28655q2, AbstractC22403o.f87638a, 3);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t2);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C13406a(14);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierM3486a2 = AbstractC1127a.m3486a(modifierM3407d2, (Function1) objM87133R3);
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C13406a(15);
                    c28655q2.m87172p0(objM87133R4);
                }
                c0209i5 = c0209i;
                function4 = function9;
                f13 = 1.0f;
                c28676v1 = c28676v0;
                AbstractC29125c.m88522c(abstractC26165aM64500i2, null, AbstractC1099a.m3398t(AbstractC1125a.m3480c(modifierM3486a2, (Function1) objM87133R4), 0.0f, 0.0f, 0.0f, 14 * 8, 7), null, C39102j.f168199a, 0.0f, null, c28655q2, 24624, 104);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                function4 = function2;
                c28676v1 = c28676v0;
                c0209i4 = c0209i2;
                c2314t2 = c2314t;
                c0209i5 = c0209i;
                f13 = 1.0f;
                c28655q2.m87150e0(1022376069);
                c28655q2.m87173q(false);
            }
            Modifier modifierM66724m3 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(f13, c2314t2));
            C22961h c22961h2 = AbstractC22977m.f90656g;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22961h2, c2305k2, c28655q2, 6);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM66724m3);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a4);
            C0209i c0209i9 = c0209i4;
            AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N6);
            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM21267a2, null, AbstractC13673n.m38561h(c38072d2), AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            Modifier modifierM66724m4 = AbstractC22953f.m66724m(c2314t2);
            if ((57344 & i15) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i15 & 7168) == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z110 = z14 | z15;
            if ((i15 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z110 | z16;
            objM87133R = c28655q2.m87133R();
            if (z17) {
                c28676v2 = c28676v1;
                if (objM87133R == c28676v2) {
                    function5 = function4;
                }
                c28655q = c28655q2;
                Function1 function10 = function5;
                C28676v0 c28676v5 = c28676v2;
                i16 = i15;
                AbstractC6719b.m20143d(modifierM66724m4, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
                float f18 = 4;
                float f19 = 8;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f18 * f19, c2314t2);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m7);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N7);
                TextResource textResourceM29659d3 = viewState.getTitle();
                int i111 = TextResource.$stable;
                String strM21274h5 = AbstractC8693b.m21274h(textResourceM29659d3, c28655q, i111);
                int i28 = C38072d.f163054b;
                long jM125430y3 = c38072d2.m121949b(c28655q, i28).getBrandWhite();
                C2886a c2886aM8417O3 = c38072d2.m121952e(c28655q, i28).getT2();
                int i29 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h5, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O3, null, c28655q, 0, i29, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f19, c2314t2));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i111), null, c38072d2.m121949b(c28655q, i28).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i28).getB1(), null, c28655q, 0, i29, 196602);
                AbstractC18489d0.m53380u(11, f18, c2314t2, c28655q);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                EnumC27284v enumC27284v3 = EnumC27284v.TextLarge;
                String strM21274h6 = AbstractC8693b.m21274h(viewState.getButton(), c28655q, i111);
                long jM125377a3 = c38072d2.m121949b(c28655q, i28).getAccentAction();
                if ((i16 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z18) {
                    showDueDateScreen = interfaceC4339a;
                    objM87133R2 = new C11699o(showDueDateScreen, 17);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    showDueDateScreen = interfaceC4339a;
                    objM87133R2 = new C11699o(showDueDateScreen, 17);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27282u.m82292h(modifierM3409f3, enumC27284v3, strM21274h6, false, jM125377a3, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 104);
                c28655q2 = c28655q;
                AbstractC25012a.m73392y(c28655q2, true, true, true);
                function3 = function10;
            } else {
                c28676v2 = c28676v1;
            }
            function5 = function4;
            objM87133R = new C13419n(z4, function5, onViewEvent, 0);
            c28655q2.m87172p0(objM87133R);
            c28655q = c28655q2;
            Function1 function11 = function5;
            C28676v0 c28676v6 = c28676v2;
            i16 = i15;
            AbstractC6719b.m20143d(modifierM66724m4, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
            float f110 = 4;
            float f111 = 8;
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(f110 * f111, c2314t2);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N8);
            TextResource textResourceM29659d4 = viewState.getTitle();
            int i112 = TextResource.$stable;
            String strM21274h7 = AbstractC8693b.m21274h(textResourceM29659d4, c28655q, i112);
            int i210 = C38072d.f163054b;
            long jM125430y4 = c38072d2.m121949b(c28655q, i210).getBrandWhite();
            C2886a c2886aM8417O4 = c38072d2.m121952e(c28655q, i210).getT2();
            int i211 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h7, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O4, null, c28655q, 0, i211, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f111, c2314t2));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i112), null, c38072d2.m121949b(c28655q, i210).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i210).getB1(), null, c28655q, 0, i211, 196602);
            AbstractC18489d0.m53380u(11, f110, c2314t2, c28655q);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
            EnumC27284v enumC27284v4 = EnumC27284v.TextLarge;
            String strM21274h8 = AbstractC8693b.m21274h(viewState.getButton(), c28655q, i112);
            long jM125377a4 = c38072d2.m121949b(c28655q, i210).getAccentAction();
            if ((i16 & 112) == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z18) {
                showDueDateScreen = interfaceC4339a;
                objM87133R2 = new C11699o(showDueDateScreen, 17);
                c28655q.m87172p0(objM87133R2);
            } else {
                showDueDateScreen = interfaceC4339a;
                objM87133R2 = new C11699o(showDueDateScreen, 17);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27282u.m82292h(modifierM3409f4, enumC27284v4, strM21274h8, false, jM125377a4, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 104);
            c28655q2 = c28655q;
            AbstractC25012a.m73392y(c28655q2, true, true, true);
            function3 = function11;
        } else {
            c28655q2.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g((Object) viewState, (Object) showDueDateScreen, (Object) onViewEvent, (Object) function3, z4, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m38026N(AbstractC3535b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m38027O(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51555f(1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m38028P(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69625b)), new C23465k(Float.valueOf(0.8f), new C17919x(C17919x.f69636m))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m38029Q(boolean z4, Function1 function1, Function1 function2) {
        if (z4) {
            function1.invoke(AbstractC3535b.a.f14171a);
        } else {
            function2.invoke(new AbstractC11022i.c(null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m38030R(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m38031S(C11028o c11028o, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, boolean z4, int i13, int i14, Composer composer, int i15) {
        m38025M(c11028o, interfaceC4339a, function1, function2, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x047e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0483  */
    /* JADX WARN: Code duplicated, block: B:107:0x0485  */
    /* JADX WARN: Code duplicated, block: B:111:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:112:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:115:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:117:0x050d  */
    /* JADX WARN: Code duplicated, block: B:122:0x053c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0543  */
    /* JADX WARN: Code duplicated, block: B:129:0x054b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0574  */
    /* JADX WARN: Code duplicated, block: B:134:0x057f  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x0149  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:59:0x016e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x020c  */
    /* JADX WARN: Code duplicated, block: B:72:0x020e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0219  */
    /* JADX WARN: Code duplicated, block: B:79:0x0287  */
    /* JADX WARN: Code duplicated, block: B:80:0x028b  */
    /* JADX WARN: Code duplicated, block: B:87:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:90:0x03be  */
    /* JADX WARN: Code duplicated, block: B:92:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:97:0x03e2  */
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: t */
    public static final void m38051t(C11026m viewState, InterfaceC4339a showWelcomeScreen, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Function1 function3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Object obj;
        Function1 function4;
        SimpleDateFormat simpleDateFormat;
        Calendar calendar;
        Object objM87133R;
        Object obj2;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87157i;
        Object obj3;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        int iHashCode2;
        boolean z13;
        int i17;
        Object obj4;
        int i18;
        Function1 function5;
        int iHashCode3;
        int iHashCode4;
        C0209i c0209i2;
        C0209i c0209i3;
        boolean zM87157i2;
        Object objM87133R2;
        Object obj5;
        int i19;
        Object obj6;
        int iHashCode5;
        boolean z14;
        Function1 function6;
        Object obj7;
        Object objM87133R3;
        Object obj8;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(showWelcomeScreen, "showWelcomeScreen");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1926945920);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(showWelcomeScreen) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            i16 = 1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == obj) {
                        obj8 = objM87133R3;
                        Object c13406a = new C13406a(17);
                        c28655q2.m87172p0(c13406a);
                        obj8 = c13406a;
                    }
                    obj8 = objM87133R3;
                    function4 = (Function1) obj8;
                } else {
                    function4 = function2;
                }
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                calendar = Calendar.getInstance();
                objM87133R = c28655q2.m87133R();
                obj2 = objM87133R;
                if (objM87133R == obj) {
                    Object objM87272z = AbstractC28683x.m87272z(viewState.getMaxDate());
                    c28655q2.m87172p0(objM87272z);
                    obj2 = objM87272z;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj2;
                C23471q c23471qM29649b = viewState.getCalendarDialogStartDate();
                int iIntValue = ((Number) c23471qM29649b.f92947w).intValue();
                int iIntValue2 = ((Number) c23471qM29649b.f92948x).intValue();
                int iIntValue3 = ((Number) c23471qM29649b.f92949y).intValue();
                Context context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                int i25 = AbstractC38481d.f164879d;
                zM87157i = c28655q2.m87157i(calendar) | c28655q2.m87157i(simpleDateFormat);
                Object objM87133R4 = c28655q2.m87133R();
                obj3 = objM87133R4;
                if (zM87157i || objM87133R4 == obj) {
                    Object c11689e = new C11689e(calendar, simpleDateFormat, interfaceC28601c1, i16);
                    c28655q2.m87172p0(c11689e);
                    obj3 = c11689e;
                }
                DatePickerDialog datePickerDialog = new DatePickerDialog(context, i25, (DatePickerDialog.OnDateSetListener) obj3, iIntValue, iIntValue2, iIntValue3);
                DatePicker datePicker = datePickerDialog.getDatePicker();
                datePicker.setMinDate(simpleDateFormat.parse(viewState.getMinDate()).getTime());
                datePicker.setMaxDate(simpleDateFormat.parse(viewState.getMaxDate()).getTime());
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC15673b0.m44010T(AbstractC1102d.m3407d(1.0f, c2314t)));
                C2307m c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66722k);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i4 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC39127r0M66763d);
                C0209i c0209i5 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C2307m c2307m2 = C2299e.f9115x;
                C1100b c1100b = C1100b.f4583a;
                Modifier modifierMo3400a = c1100b.mo3400a(modifierM3409f, c2307m2);
                C22957g c22957g = AbstractC22977m.f90653d;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 6);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo3400a);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N2);
                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                C38072d c38072d = C38072d.f163053a;
                AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21267a, null, AbstractC13673n.m38561h(c38072d), AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                Modifier modifierM66724m = AbstractC22953f.m66724m(c2314t);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Object objM87133R5 = c28655q2.m87133R();
                i17 = 18;
                obj4 = objM87133R5;
                if (z13 || objM87133R5 == obj) {
                    Object c11699o = new C11699o(showWelcomeScreen, i17);
                    c28655q2.m87172p0(c11699o);
                    obj4 = c11699o;
                }
                i18 = i15;
                function5 = function4;
                AbstractC6719b.m20143d(modifierM66724m, aVar, null, (InterfaceC4339a) obj4, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 52);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                float f13 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 2.5d) * f13, modifierM3409f2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q2, 6);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N3);
                TextResource textResourceM29653f = viewState.getTitle();
                int i26 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM29653f, c28655q2, i26);
                int i27 = C38072d.f163054b;
                C2886a c2886aM8417O = c38072d.m121952e(c28655q2, i27).getT2();
                long jM125430y = c38072d.m121949b(c28655q2, i27).getBrandWhite();
                int i28 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q2, 0, i28, 196602);
                float f14 = 1 * f13;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f14, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q2, i26), null, c38072d.m121949b(c28655q2, i27).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i27).getB1(), null, c28655q2, 0, i28, 196602);
                AbstractC18489d0.m53380u(f13, f13, c2314t, c28655q2);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m4);
                if (c28655q2.f115903S && AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                    c0209i2 = c0209i;
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N4);
                c0209i3 = c0209i2;
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC38480c.f164856c), null, c38072d.m121949b(c28655q2, i27).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i27).getH4(), null, c28655q2, 0, i28, 196602);
                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q2, i27).getWhite10(), 0L, 0L, 0L, c28655q2, 0, 14);
                float f15 = 4;
                Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(((float) 0.5d) * f15));
                float f16 = ((float) 3.5d) * f13;
                C22976l1 c22976l2 = new C22976l1(f16, f14, f16, f14);
                zM87157i2 = c28655q2.m87157i(datePickerDialog);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i2) {
                    obj5 = obj;
                } else {
                    obj5 = obj;
                    if (objM87133R2 == obj5) {
                        i19 = 1;
                        obj6 = objM87133R2;
                    }
                    Object obj9 = obj5;
                    boolean z15 = i19;
                    AbstractC12350b.m34578a((InterfaceC4339a) obj6, modifierM118994r, false, null, null, null, c15077m1M43196a, c22976l2, AbstractC37817c.m121344e(-1742295738, c28655q2, new C12906g(3, interfaceC28601c1)), c28655q2, 905994240, 108);
                    c28655q2.m87173q(z15);
                    c28655q2.m87173q(z15);
                    c28655q2.m87173q(z15);
                    Modifier modifierMo3400a2 = c1100b.mo3400a(AbstractC1099a.m3394p(f15 * f13, c2314t), C2299e.f9105H);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode5 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierMo3400a2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N5);
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                    EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                    String strM21274h2 = AbstractC8693b.m21274h(viewState.getButton(), c28655q2, i26);
                    long jM125399i0 = c38072d.m121949b(c28655q2, i27).getSleepLightSleep();
                    z14 = (i18 & 896) == 256 ? z15 ? 1 : 0 : false;
                    Object objM87133R6 = c28655q2.m87133R();
                    if (!z14 || objM87133R6 == obj9) {
                        function6 = function5;
                        Object c3590i = new C3590i(function6, interfaceC28601c1, 12);
                        c28655q2.m87172p0(c3590i);
                        obj7 = c3590i;
                    } else {
                        function6 = function5;
                        obj7 = objM87133R6;
                    }
                    AbstractC27282u.m82292h(modifierM3409f4, enumC27284v, strM21274h2, false, jM125399i0, null, false, (InterfaceC4339a) obj7, c28655q2, 54, 104);
                    C28655q c28655q3 = c28655q2;
                    c28655q3.m87173q(z15);
                    c28655q3.m87173q(z15);
                    function3 = function6;
                    c28655q = c28655q3;
                }
                i19 = 1;
                Object c11693i = new C11693i(datePickerDialog, i19);
                c28655q2.m87172p0(c11693i);
                obj6 = c11693i;
                Object obj10 = obj5;
                boolean z16 = i19;
                AbstractC12350b.m34578a((InterfaceC4339a) obj6, modifierM118994r, false, null, null, null, c15077m1M43196a, c22976l2, AbstractC37817c.m121344e(-1742295738, c28655q2, new C12906g(3, interfaceC28601c1)), c28655q2, 905994240, 108);
                c28655q2.m87173q(z16);
                c28655q2.m87173q(z16);
                c28655q2.m87173q(z16);
                Modifier modifierMo3400a3 = c1100b.mo3400a(AbstractC1099a.m3394p(f15 * f13, c2314t), C2299e.f9105H);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode5 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierMo3400a3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m6);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N6);
                Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                String strM21274h3 = AbstractC8693b.m21274h(viewState.getButton(), c28655q2, i26);
                long jM125399i1 = c38072d.m121949b(c28655q2, i27).getSleepLightSleep();
                if ((i18 & 896) == 256) {
                }
                Object objM87133R7 = c28655q2.m87133R();
                if (z14) {
                    function6 = function5;
                    Object c3590i2 = new C3590i(function6, interfaceC28601c1, 12);
                    c28655q2.m87172p0(c3590i2);
                    obj7 = c3590i2;
                } else {
                    function6 = function5;
                    Object c3590i3 = new C3590i(function6, interfaceC28601c1, 12);
                    c28655q2.m87172p0(c3590i3);
                    obj7 = c3590i3;
                }
                AbstractC27282u.m82292h(modifierM3409f5, enumC27284v2, strM21274h3, false, jM125399i1, null, false, (InterfaceC4339a) obj7, c28655q2, 54, 104);
                C28655q c28655q4 = c28655q2;
                c28655q4.m87173q(z16);
                c28655q4.m87173q(z16);
                function3 = function6;
                c28655q = c28655q4;
            } else {
                C28655q c28655q5 = c28655q2;
                c28655q5.m87138X();
                function3 = function2;
                c28655q = c28655q5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 17, (Object) viewState, (Object) showWelcomeScreen, (InterfaceC23459e) function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = 1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            obj = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == obj) {
                    obj8 = objM87133R3;
                    Object c13406a2 = new C13406a(17);
                    c28655q2.m87172p0(c13406a2);
                    obj8 = c13406a2;
                }
                obj8 = objM87133R3;
                function4 = (Function1) obj8;
            } else {
                function4 = function2;
            }
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            calendar = Calendar.getInstance();
            objM87133R = c28655q2.m87133R();
            obj2 = objM87133R;
            if (objM87133R == obj) {
                Object objM87272z2 = AbstractC28683x.m87272z(viewState.getMaxDate());
                c28655q2.m87172p0(objM87272z2);
                obj2 = objM87272z2;
            }
            interfaceC28601c1 = (InterfaceC28601c1) obj2;
            C23471q c23471qM29649b2 = viewState.getCalendarDialogStartDate();
            int iIntValue4 = ((Number) c23471qM29649b2.f92947w).intValue();
            int iIntValue5 = ((Number) c23471qM29649b2.f92948x).intValue();
            int iIntValue6 = ((Number) c23471qM29649b2.f92949y).intValue();
            Context context2 = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            int i29 = AbstractC38481d.f164879d;
            zM87157i = c28655q2.m87157i(calendar) | c28655q2.m87157i(simpleDateFormat);
            Object objM87133R8 = c28655q2.m87133R();
            obj3 = objM87133R8;
            if (zM87157i) {
                Object c11689e2 = new C11689e(calendar, simpleDateFormat, interfaceC28601c1, i16);
                c28655q2.m87172p0(c11689e2);
                obj3 = c11689e2;
            } else {
                Object c11689e3 = new C11689e(calendar, simpleDateFormat, interfaceC28601c1, i16);
                c28655q2.m87172p0(c11689e3);
                obj3 = c11689e3;
            }
            DatePickerDialog datePickerDialog2 = new DatePickerDialog(context2, i29, (DatePickerDialog.OnDateSetListener) obj3, iIntValue4, iIntValue5, iIntValue6);
            DatePicker datePicker2 = datePickerDialog2.getDatePicker();
            datePicker2.setMinDate(simpleDateFormat.parse(viewState.getMinDate()).getTime());
            datePicker2.setMaxDate(simpleDateFormat.parse(viewState.getMaxDate()).getTime());
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC15673b0.m44010T(AbstractC1102d.m3407d(1.0f, c2314t2)));
            C2307m c2307m3 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m3, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i7 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC39127r0M66763d4);
            C0209i c0209i8 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N7);
            Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C2307m c2307m4 = C2299e.f9115x;
            C1100b c1100b2 = C1100b.f4583a;
            Modifier modifierMo3400a4 = c1100b2.mo3400a(modifierM3409f6, c2307m4);
            C22957g c22957g2 = AbstractC22977m.f90653d;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 6);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierMo3400a4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m8);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N8);
            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM21267a2, null, AbstractC13673n.m38561h(c38072d2), AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            Modifier modifierM66724m2 = AbstractC22953f.m66724m(c2314t2);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            Object objM87133R9 = c28655q2.m87133R();
            i17 = 18;
            obj4 = objM87133R9;
            if (z13) {
                Object c11699o2 = new C11699o(showWelcomeScreen, i17);
                c28655q2.m87172p0(c11699o2);
                obj4 = c11699o2;
            } else {
                Object c11699o3 = new C11699o(showWelcomeScreen, i17);
                c28655q2.m87172p0(c11699o3);
                obj4 = c11699o3;
            }
            i18 = i15;
            function5 = function4;
            AbstractC6719b.m20143d(modifierM66724m2, aVar2, null, (InterfaceC4339a) obj4, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 52);
            Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t2);
            float f17 = 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 2.5d) * f17, modifierM3409f7);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k2, c28655q2, 6);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3394p2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m9);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N9);
            TextResource textResourceM29653f2 = viewState.getTitle();
            int i210 = TextResource.$stable;
            String strM21274h4 = AbstractC8693b.m21274h(textResourceM29653f2, c28655q2, i210);
            int i211 = C38072d.f163054b;
            C2886a c2886aM8417O2 = c38072d2.m121952e(c28655q2, i211).getT2();
            long jM125430y2 = c38072d2.m121949b(c28655q2, i211).getBrandWhite();
            int i212 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h4, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O2, null, c28655q2, 0, i212, 196602);
            float f18 = 1 * f17;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f18, c2314t2));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q2, i210), null, c38072d2.m121949b(c28655q2, i211).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i211).getB1(), null, c28655q2, 0, i212, 196602);
            AbstractC18489d0.m53380u(f17, f17, c2314t2, c28655q2);
            Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3409f8);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m10);
            if (c28655q2.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N10);
            c0209i3 = c0209i2;
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC38480c.f164856c), null, c38072d2.m121949b(c28655q2, i211).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i211).getH4(), null, c28655q2, 0, i212, 196602);
            C22976l1 c22976l3 = AbstractC15166v0.f56891a;
            C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q2, i211).getWhite10(), 0L, 0L, 0L, c28655q2, 0, 14);
            float f19 = 4;
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(c2314t2, AbstractC33253j.m105489e(((float) 0.5d) * f19));
            float f110 = ((float) 3.5d) * f17;
            C22976l1 c22976l4 = new C22976l1(f110, f18, f110, f18);
            zM87157i2 = c28655q2.m87157i(datePickerDialog2);
            objM87133R2 = c28655q2.m87133R();
            if (zM87157i2) {
                obj5 = obj;
                if (objM87133R2 == obj5) {
                    i19 = 1;
                    obj6 = objM87133R2;
                }
                Object obj11 = obj5;
                boolean z17 = i19;
                AbstractC12350b.m34578a((InterfaceC4339a) obj6, modifierM118994r2, false, null, null, null, c15077m1M43196a2, c22976l4, AbstractC37817c.m121344e(-1742295738, c28655q2, new C12906g(3, interfaceC28601c1)), c28655q2, 905994240, 108);
                c28655q2.m87173q(z17);
                c28655q2.m87173q(z17);
                c28655q2.m87173q(z17);
                Modifier modifierMo3400a5 = c1100b2.mo3400a(AbstractC1099a.m3394p(f19 * f17, c2314t2), C2299e.f9105H);
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode5 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierMo3400a5);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m11);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N11);
                Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t2);
                EnumC27284v enumC27284v3 = EnumC27284v.TextLarge;
                String strM21274h5 = AbstractC8693b.m21274h(viewState.getButton(), c28655q2, i210);
                long jM125399i2 = c38072d2.m121949b(c28655q2, i211).getSleepLightSleep();
                if ((i18 & 896) == 256) {
                }
                Object objM87133R10 = c28655q2.m87133R();
                if (z14) {
                    function6 = function5;
                    Object c3590i4 = new C3590i(function6, interfaceC28601c1, 12);
                    c28655q2.m87172p0(c3590i4);
                    obj7 = c3590i4;
                } else {
                    function6 = function5;
                    Object c3590i5 = new C3590i(function6, interfaceC28601c1, 12);
                    c28655q2.m87172p0(c3590i5);
                    obj7 = c3590i5;
                }
                AbstractC27282u.m82292h(modifierM3409f9, enumC27284v3, strM21274h5, false, jM125399i2, null, false, (InterfaceC4339a) obj7, c28655q2, 54, 104);
                C28655q c28655q6 = c28655q2;
                c28655q6.m87173q(z17);
                c28655q6.m87173q(z17);
                function3 = function6;
                c28655q = c28655q6;
            } else {
                obj5 = obj;
            }
            i19 = 1;
            Object c11693i2 = new C11693i(datePickerDialog2, i19);
            c28655q2.m87172p0(c11693i2);
            obj6 = c11693i2;
            Object obj12 = obj5;
            boolean z18 = i19;
            AbstractC12350b.m34578a((InterfaceC4339a) obj6, modifierM118994r2, false, null, null, null, c15077m1M43196a2, c22976l4, AbstractC37817c.m121344e(-1742295738, c28655q2, new C12906g(3, interfaceC28601c1)), c28655q2, 905994240, 108);
            c28655q2.m87173q(z18);
            c28655q2.m87173q(z18);
            c28655q2.m87173q(z18);
            Modifier modifierMo3400a6 = c1100b2.mo3400a(AbstractC1099a.m3394p(f19 * f17, c2314t2), C2299e.f9105H);
            InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m3, false);
            iHashCode5 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierMo3400a6);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC39127r0M66763d6);
            AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m12);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N12);
            Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t2);
            EnumC27284v enumC27284v4 = EnumC27284v.TextLarge;
            String strM21274h6 = AbstractC8693b.m21274h(viewState.getButton(), c28655q2, i210);
            long jM125399i3 = c38072d2.m121949b(c28655q2, i211).getSleepLightSleep();
            if ((i18 & 896) == 256) {
            }
            Object objM87133R11 = c28655q2.m87133R();
            if (z14) {
                function6 = function5;
                Object c3590i6 = new C3590i(function6, interfaceC28601c1, 12);
                c28655q2.m87172p0(c3590i6);
                obj7 = c3590i6;
            } else {
                function6 = function5;
                Object c3590i7 = new C3590i(function6, interfaceC28601c1, 12);
                c28655q2.m87172p0(c3590i7);
                obj7 = c3590i7;
            }
            AbstractC27282u.m82292h(modifierM3409f10, enumC27284v4, strM21274h6, false, jM125399i3, null, false, (InterfaceC4339a) obj7, c28655q2, 54, 104);
            C28655q c28655q7 = c28655q2;
            c28655q7.m87173q(z18);
            c28655q7.m87173q(z18);
            function3 = function6;
            c28655q = c28655q7;
        } else {
            C28655q c28655q8 = c28655q2;
            c28655q8.m87138X();
            function3 = function2;
            c28655q = c28655q8;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 17, (Object) viewState, (Object) showWelcomeScreen, (InterfaceC23459e) function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m38052u(AbstractC11022i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final String m38053v(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: w */
    private static final void m38054w(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m38055x(Calendar calendar, SimpleDateFormat simpleDateFormat, InterfaceC28601c1 interfaceC28601c1, DatePicker datePicker, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(datePicker, "<unused var>");
        calendar.set(i13, i14, i15);
        String str = simpleDateFormat.format(calendar.getTime());
        AbstractC22676k.m65747g(str);
        m38054w(interfaceC28601c1, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m38056y(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m38057z(DatePickerDialog datePickerDialog) {
        datePickerDialog.show();
        return C23454a0.f92919a;
    }
}
