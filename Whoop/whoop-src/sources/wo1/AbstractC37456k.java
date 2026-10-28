package wo1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm2.C3467p0;
import c93.InterfaceC4339a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CyclePatternType;
import com.whoop.navigation.models.GenericInteraction;
import e93.AbstractC12889b;
import f11.AbstractC14004d;
import f11.C14005e;
import f11.C14007g;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27246d;
import ny0.C27256h;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p579wc.C37082e1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import ro1.AbstractC31635g;
import so1.C32808d;
import so1.C32810e;
import um0.C35076b;
import w71.C36891k;
import wb3.AbstractC37056f;
import wd3.C37168b;
import x81.C38072d;
import xn1.AbstractC38480c;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: wo1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lso1/e;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onNavigationEvent", "Lyn1/a;", "onAnalyticEvent", "Lso1/d;", "onButtonClick", "j", "(Lso1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "x", "(Lso1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Ly3/f;", "componentWidthDp", "componentHeightDp", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37456k {

    /* JADX INFO: renamed from: wo1.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f160282a;

        static {
            int[] iArr = new int[CyclePatternType.values().length];
            try {
                iArr[CyclePatternType.YOUR_CYCLES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CyclePatternType.SYMPTOMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f160282a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x0154  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x0103  */
    /* JADX WARN: Code duplicated, block: B:89:0x0118  */
    /* JADX WARN: Code duplicated, block: B:92:0x013f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0141  */
    /* JADX WARN: Code duplicated, block: B:96:0x0147  */
    /* JADX WARN: Code duplicated, block: B:97:0x0149  */
    /* JADX INFO: renamed from: j */
    public static final void m119973j(C32810e viewState, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        Function1 function4;
        int i16;
        Function1 function5;
        int i17;
        Function1 function6;
        boolean z4;
        C28655q c28655q;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        int i18;
        C28676v0 c28676v0;
        Function1 function10;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R6;
        int i19;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(451263297);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                function4 = function1;
                i15 |= c28655q2.m87157i(function4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function5 = function2;
                    if (c28655q2.m87157i(function5)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i13 & 3072) == 0) {
                    if ((i14 & 8) == 0) {
                        function6 = function3;
                        if (c28655q2.m87157i(function6)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i15 |= i19;
                    } else {
                        function6 = function3;
                    }
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    i15 |= i19;
                } else {
                    function6 = function3;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28655q2.m87140Z();
                    i18 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0 || c28655q2.m87118C()) {
                        if (i24 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C37168b(20);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function10 = (Function1) objM87133R3;
                        } else {
                            function10 = function4;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C37168b(21);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        }
                        if ((i14 & 8) != 0) {
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((i15 & 112) == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z13 | z14;
                            objM87133R = c28655q2.m87133R();
                            if (z15 || objM87133R == c28676v0) {
                                objM87133R = new C2777c(function5, 19, function10);
                                c28655q2.m87172p0(objM87133R);
                            }
                            i15 &= -7169;
                            function6 = (Function1) objM87133R;
                        }
                    } else {
                        c28655q2.m87138X();
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                        }
                        function10 = function4;
                    }
                    c28655q2.m87175r();
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(new C39174f(0));
                        c28655q2.m87172p0(objM87133R4);
                    }
                    InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(new C39174f(0));
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
                    InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                    boolean zM87157i = c28655q2.m87157i(viewState);
                    if ((i15 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z19 = z16 | zM87157i;
                    if ((i15 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z19 | z17;
                    objM87133R6 = c28655q2.m87133R();
                    if (z18 || objM87133R6 == c28676v0) {
                        objM87133R6 = new C37454j(viewState, function10, function5, 0);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    float f13 = 4;
                    Function1 function11 = function5;
                    Function1 function12 = function6;
                    c28655q = c28655q2;
                    AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R6, 15), AbstractC33253j.m105489e(3 * f13), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), null, 0 * f13, AbstractC37817c.m121344e(-1908708226, c28655q2, new C3467p0(viewState, interfaceC39171c, function10, function11, interfaceC28601c1, interfaceC28601c2, function12)), c28655q, 1769472, 24);
                    function7 = function10;
                    function8 = function11;
                    function9 = function12;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36891k((Object) viewState, function7, function8, function9, i13, i14, 1);
                }
            }
            i15 |= 384;
            function5 = function2;
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    function6 = function3;
                    if (c28655q2.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i19;
                } else {
                    function6 = function3;
                }
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i19;
            } else {
                function6 = function3;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if (i24 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C37168b(20);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function10 = (Function1) objM87133R3;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C37168b(21);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    }
                    if ((i14 & 8) != 0) {
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        objM87133R = c28655q2.m87133R();
                        if (z15) {
                            objM87133R = new C2777c(function5, 19, function10);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2777c(function5, 19, function10);
                            c28655q2.m87172p0(objM87133R);
                        }
                        i15 &= -7169;
                        function6 = (Function1) objM87133R;
                    }
                } else {
                    if (i24 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C37168b(20);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function10 = (Function1) objM87133R3;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C37168b(21);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    }
                    if ((i14 & 8) != 0) {
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        objM87133R = c28655q2.m87133R();
                        if (z15) {
                            objM87133R = new C2777c(function5, 19, function10);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2777c(function5, 19, function10);
                            c28655q2.m87172p0(objM87133R);
                        }
                        i15 &= -7169;
                        function6 = (Function1) objM87133R;
                    }
                }
                c28655q2.m87175r();
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(new C39174f(0));
                    c28655q2.m87172p0(objM87133R4);
                }
                InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(new C39174f(0));
                    c28655q2.m87172p0(objM87133R5);
                }
                InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                boolean zM87157i2 = c28655q2.m87157i(viewState);
                if ((i15 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z110 = z16 | zM87157i2;
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z110 | z17;
                objM87133R6 = c28655q2.m87133R();
                if (z18) {
                    objM87133R6 = new C37454j(viewState, function10, function5, 0);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C37454j(viewState, function10, function5, 0);
                    c28655q2.m87172p0(objM87133R6);
                }
                float f14 = 4;
                Function1 function13 = function5;
                Function1 function14 = function6;
                c28655q = c28655q2;
                AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R6, 15), AbstractC33253j.m105489e(3 * f14), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), null, 0 * f14, AbstractC37817c.m121344e(-1908708226, c28655q2, new C3467p0(viewState, interfaceC39171c2, function10, function13, interfaceC28601c3, interfaceC28601c4, function14)), c28655q, 1769472, 24);
                function7 = function10;
                function8 = function13;
                function9 = function14;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k((Object) viewState, function7, function8, function9, i13, i14, 1);
            }
        }
        i15 |= 48;
        function4 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function5 = function2;
                if (c28655q2.m87157i(function5)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    function6 = function3;
                    if (c28655q2.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i19;
                } else {
                    function6 = function3;
                }
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i19;
            } else {
                function6 = function3;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if (i24 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C37168b(20);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function10 = (Function1) objM87133R3;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C37168b(21);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    }
                    if ((i14 & 8) != 0) {
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        objM87133R = c28655q2.m87133R();
                        if (z15) {
                            objM87133R = new C2777c(function5, 19, function10);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2777c(function5, 19, function10);
                            c28655q2.m87172p0(objM87133R);
                        }
                        i15 &= -7169;
                        function6 = (Function1) objM87133R;
                    }
                } else {
                    if (i24 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C37168b(20);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function10 = (Function1) objM87133R3;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C37168b(21);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    }
                    if ((i14 & 8) != 0) {
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        objM87133R = c28655q2.m87133R();
                        if (z15) {
                            objM87133R = new C2777c(function5, 19, function10);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2777c(function5, 19, function10);
                            c28655q2.m87172p0(objM87133R);
                        }
                        i15 &= -7169;
                        function6 = (Function1) objM87133R;
                    }
                }
                c28655q2.m87175r();
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(new C39174f(0));
                    c28655q2.m87172p0(objM87133R4);
                }
                InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(new C39174f(0));
                    c28655q2.m87172p0(objM87133R5);
                }
                InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R5;
                InterfaceC39171c interfaceC39171c3 = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                boolean zM87157i3 = c28655q2.m87157i(viewState);
                if ((i15 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z111 = z16 | zM87157i3;
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z111 | z17;
                objM87133R6 = c28655q2.m87133R();
                if (z18) {
                    objM87133R6 = new C37454j(viewState, function10, function5, 0);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C37454j(viewState, function10, function5, 0);
                    c28655q2.m87172p0(objM87133R6);
                }
                float f15 = 4;
                Function1 function15 = function5;
                Function1 function16 = function6;
                c28655q = c28655q2;
                AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3409f3, false, null, null, (InterfaceC4339a) objM87133R6, 15), AbstractC33253j.m105489e(3 * f15), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), null, 0 * f15, AbstractC37817c.m121344e(-1908708226, c28655q2, new C3467p0(viewState, interfaceC39171c3, function10, function15, interfaceC28601c5, interfaceC28601c6, function16)), c28655q, 1769472, 24);
                function7 = function10;
                function8 = function15;
                function9 = function16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k((Object) viewState, function7, function8, function9, i13, i14, 1);
            }
        }
        i15 |= 384;
        function5 = function2;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                function6 = function3;
                if (c28655q2.m87157i(function6)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i19;
            } else {
                function6 = function3;
            }
            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i19;
        } else {
            function6 = function3;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28655q2.m87140Z();
            i18 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                if (i24 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C37168b(20);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function10 = (Function1) objM87133R3;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C37168b(21);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function5 = (Function1) objM87133R2;
                }
                if ((i14 & 8) != 0) {
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    objM87133R = c28655q2.m87133R();
                    if (z15) {
                        objM87133R = new C2777c(function5, 19, function10);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2777c(function5, 19, function10);
                        c28655q2.m87172p0(objM87133R);
                    }
                    i15 &= -7169;
                    function6 = (Function1) objM87133R;
                }
            } else {
                if (i24 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C37168b(20);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function10 = (Function1) objM87133R3;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C37168b(21);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function5 = (Function1) objM87133R2;
                }
                if ((i14 & 8) != 0) {
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    objM87133R = c28655q2.m87133R();
                    if (z15) {
                        objM87133R = new C2777c(function5, 19, function10);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2777c(function5, 19, function10);
                        c28655q2.m87172p0(objM87133R);
                    }
                    i15 &= -7169;
                    function6 = (Function1) objM87133R;
                }
            }
            c28655q2.m87175r();
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(new C39174f(0));
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R4;
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(new C39174f(0));
                c28655q2.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R5;
            InterfaceC39171c interfaceC39171c4 = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            boolean zM87157i4 = c28655q2.m87157i(viewState);
            if ((i15 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z112 = z16 | zM87157i4;
            if ((i15 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z112 | z17;
            objM87133R6 = c28655q2.m87133R();
            if (z18) {
                objM87133R6 = new C37454j(viewState, function10, function5, 0);
                c28655q2.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C37454j(viewState, function10, function5, 0);
                c28655q2.m87172p0(objM87133R6);
            }
            float f16 = 4;
            Function1 function17 = function5;
            Function1 function18 = function6;
            c28655q = c28655q2;
            AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3409f4, false, null, null, (InterfaceC4339a) objM87133R6, 15), AbstractC33253j.m105489e(3 * f16), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), null, 0 * f16, AbstractC37817c.m121344e(-1908708226, c28655q2, new C3467p0(viewState, interfaceC39171c4, function10, function17, interfaceC28601c7, interfaceC28601c8, function18)), c28655q, 1769472, 24);
            function7 = function10;
            function8 = function17;
            function9 = function18;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function7 = function4;
            function8 = function5;
            function9 = function6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k((Object) viewState, function7, function8, function9, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m119974k(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m119975l(AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:113:0x0481  */
    /* JADX WARN: Code duplicated, block: B:120:0x049f  */
    /* JADX WARN: Code duplicated, block: B:122:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:124:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:125:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:129:0x054a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x0195  */
    /* JADX WARN: Code duplicated, block: B:43:0x01f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0229  */
    /* JADX WARN: Code duplicated, block: B:50:0x0235  */
    /* JADX WARN: Code duplicated, block: B:51:0x0242  */
    /* JADX WARN: Code duplicated, block: B:53:0x0267  */
    /* JADX WARN: Code duplicated, block: B:58:0x0286  */
    /* JADX WARN: Code duplicated, block: B:61:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:74:0x034a  */
    /* JADX WARN: Code duplicated, block: B:75:0x034e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0369  */
    /* JADX WARN: Code duplicated, block: B:84:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:85:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:90:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:94:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0406  */
    /* JADX WARN: Code duplicated, block: B:98:0x0416  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x0195, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x03fd, please report this as an issue */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m119976m(C32810e c32810e, InterfaceC39171c interfaceC39171c, Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function3, Composer composer, int i13) {
        C22957g c22957g;
        C0209i c0209i;
        int iHashCode;
        C38072d c38072d;
        int i14;
        C22957g c22957g2;
        C28655q c28655q;
        CyclePatternType cyclePatternTypeM102953j;
        CyclePatternType cyclePatternType;
        boolean zM87157i;
        Object objM87133R;
        boolean zM87153g;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c3;
        C2307m c2307m;
        int iHashCode2;
        Integer numM102952i;
        int iHashCode3;
        int i15;
        int i16;
        float f13;
        int iHashCode4;
        int i17;
        boolean z4;
        int i18;
        List<C14007g> listM39883i;
        boolean z13;
        C32808d c32808dM102946b;
        float f14;
        boolean zM87153g2;
        Object objM87133R3;
        boolean z14;
        C28655q c28655q2 = (C28655q) composer;
        if (c28655q2.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f15 = 2;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f15, AbstractC1102d.m3409f(1.0f, c2314t));
            C22957g c22957g3 = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g3, c2305k, c28655q2, 0);
            int iHashCode5 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q2.f115903S) {
                c22957g = c22957g3;
            } else {
                c22957g = c22957g3;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N2);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                String upperCase = AbstractC8693b.m21274h(c32810e.getTitleDisplay(), c28655q2, TextResource.$stable).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                c38072d = C38072d.f163053a;
                i14 = C38072d.f163054b;
                c22957g2 = c22957g;
                AbstractC30795n.m94707h(upperCase, layoutWeightElement, c38072d.m121949b(c28655q2, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i14).getSh4(), null, c28655q2, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q2;
                cyclePatternTypeM102953j = c32810e.getType();
                cyclePatternType = CyclePatternType.YOUR_CYCLES;
                C28676v0 c28676v0 = C28635l.f115821a;
                if (cyclePatternTypeM102953j != cyclePatternType || (c32810e.getType() == CyclePatternType.SYMPTOMS && c32810e.getEmptyState() == null)) {
                    c28655q.m87150e0(-1641557994);
                    C27270o c27270o = new C27270o(AbstractC27274q.c.f109140f, AbstractC11895b.m31981D(c38072d), null, null, null, false, false, false, 0.5f, false, 764, null);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164871r);
                    Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, c32810e.getType().name() + "_CyclePatternInfoButtonTag");
                    zM87157i = c28655q.m87157i(c32810e) | c28655q.m87153g(function1) | c28655q.m87153g(function2);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C37454j(c32810e, function1, function2, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27242b1.m82092d(c27270o, strM92103Y, null, modifierM3599a, (InterfaceC4339a) objM87133R, c28655q, C27270o.f109105k, 4);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1640750754);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (c32810e.m102947c().isEmpty()) {
                    c28655q.m87150e0(1420811002);
                    if (c32810e.getEmptyState() == null) {
                        c28655q.m87150e0(1420811001);
                        c28655q.m87173q(false);
                        z14 = false;
                    } else {
                        c28655q.m87150e0(1420811002);
                        float f16 = 4;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16 * f16, c2314t));
                        AbstractC25303l.m74291r(c32810e.getEmptyState(), null, null, null, c28655q, 0, 14);
                        z14 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z14);
                    z4 = z14;
                } else {
                    c28655q.m87150e0(1421095861);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    zM87153g = c28655q.m87153g(interfaceC39171c);
                    objM87133R2 = c28655q.m87133R();
                    if (!zM87153g || objM87133R2 == c28676v0) {
                        interfaceC28601c3 = interfaceC28601c2;
                        objM87133R2 = new C37082e1(interfaceC39171c, interfaceC28601c1, interfaceC28601c3, 2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        interfaceC28601c3 = interfaceC28601c2;
                    }
                    Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3409f2, (Function1) objM87133R2);
                    c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3500d);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N3);
                    numM102952i = c32810e.getTodayIndex();
                    if (numM102952i == null) {
                        c28655q.m87150e0(-1189930949);
                        c28655q.m87173q(false);
                        i16 = 0;
                        i15 = 1;
                    } else {
                        c28655q.m87150e0(-1189930948);
                        int iIntValue = numM102952i.intValue();
                        int size = ((C14005e) AbstractC25265s.m74096F0(c32810e.m102947c())).m39885k().size();
                        float f17 = (float) 2.5d;
                        float fM119982s = (iIntValue * (((m119982s(interfaceC28601c1) - (size * f17)) / (size - 1)) + f17)) + ((float) 1.5d);
                        float f18 = 14 * 4;
                        Modifier modifierM3391m = AbstractC1099a.m3391m(c2314t, fM119982s, f18);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3391m);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N4);
                        float fM119984u = m119984u(interfaceC28601c3) - f18;
                        i15 = 1;
                        Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3411h(fM119984u, AbstractC1102d.m3424u(1, c2314t)), c38072d.m121949b(c28655q, i14).getWhite30(), AbstractC17918w0.f69621a);
                        i16 = 0;
                        AbstractC22989q.m66760a(modifierM3358c, c28655q, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    f13 = 4;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, f15 * f13, i15);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q, i16);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N5);
                    c28655q.m87150e0(-613082442);
                    i17 = 0;
                    for (Object obj : c32810e.m102947c()) {
                        i18 = i17 + 1;
                        if (i17 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C14005e c14005e = (C14005e) obj;
                        C14005e c14005e2 = (C14005e) AbstractC25265s.m74102I0(i17 - 1, c32810e.m102947c());
                        listM39883i = c14005e2 != null ? c14005e2.m39883i() : null;
                        if ((listM39883i != null || listM39883i.isEmpty()) && i17 != 0) {
                            AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, -1768222311, f13, f13, c2314t));
                            z13 = false;
                            c28655q.m87173q(false);
                        } else {
                            z13 = false;
                            c28655q.m87150e0(-1768120445);
                            c28655q.m87173q(false);
                        }
                        AbstractC14004d.m39859h(c14005e, z13, c28655q, C14005e.f49972m, 2);
                        if (c32810e.getShowDividers() || c32810e.m102947c().size() - 1 <= i17) {
                            c28655q.m87150e0(-1767818877);
                            c28655q.m87173q(false);
                        } else {
                            AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, -1767965910, f13, f13, c2314t));
                            C28655q c28655q3 = c28655q;
                            AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q3, 0, 255);
                            c28655q = c28655q3;
                            c28655q.m87173q(false);
                        }
                        f13 = f13;
                        i17 = i18;
                    }
                    z4 = false;
                    AbstractC2875y.m8286B(c28655q, false, true, true, false);
                }
                c32808dM102946b = c32810e.getButton();
                if (c32808dM102946b == null) {
                    c28655q.m87150e0(1423642479);
                    c28655q.m87173q(z4);
                } else {
                    c28655q.m87150e0(1423642480);
                    float f19 = 4;
                    f14 = f19 * f19;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
                    if (c32810e.getEmptyState() == null) {
                        c28655q.m87150e0(338940882);
                        C28655q c28655q4 = c28655q;
                        AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q4, 0, 255);
                        c28655q = c28655q4;
                        AbstractC25012a.m73389v(c2314t, f14, c28655q, false);
                    } else {
                        c28655q.m87150e0(339053319);
                        c28655q.m87173q(false);
                    }
                    C27246d c27246d = new C27246d();
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C27256h c27256h = new C27256h(c32808dM102946b.getButtonTitle(), c32808dM102946b.getButtonIcon(), null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33546236, null);
                    zM87153g2 = c28655q.m87153g(function3) | c28655q.m87157i(c32808dM102946b);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C35076b(25, function3, c32808dM102946b);
                        c28655q.m87172p0(objM87133R3);
                    }
                    c27246d.Compose(modifierM3409f3, c27256h, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
            }
            AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i4);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3409f4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N6);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            String upperCase2 = AbstractC8693b.m21274h(c32810e.getTitleDisplay(), c28655q2, TextResource.$stable).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            c38072d = C38072d.f163053a;
            i14 = C38072d.f163054b;
            c22957g2 = c22957g;
            AbstractC30795n.m94707h(upperCase2, layoutWeightElement2, c38072d.m121949b(c28655q2, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i14).getSh4(), null, c28655q2, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q2;
            cyclePatternTypeM102953j = c32810e.getType();
            cyclePatternType = CyclePatternType.YOUR_CYCLES;
            C28676v0 c28676v1 = C28635l.f115821a;
            if (cyclePatternTypeM102953j != cyclePatternType) {
                c28655q.m87150e0(-1641557994);
                C27270o c27270o2 = new C27270o(AbstractC27274q.c.f109140f, AbstractC11895b.m31981D(c38072d), null, null, null, false, false, false, 0.5f, false, 764, null);
                String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164871r);
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, c32810e.getType().name() + "_CyclePatternInfoButtonTag");
                zM87157i = c28655q.m87157i(c32810e) | c28655q.m87153g(function1) | c28655q.m87153g(function2);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C37454j(c32810e, function1, function2, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C37454j(c32810e, function1, function2, 1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27242b1.m82092d(c27270o2, strM92103Y2, null, modifierM3599a2, (InterfaceC4339a) objM87133R, c28655q, C27270o.f109105k, 4);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1641557994);
                C27270o c27270o3 = new C27270o(AbstractC27274q.c.f109140f, AbstractC11895b.m31981D(c38072d), null, null, null, false, false, false, 0.5f, false, 764, null);
                String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164871r);
                Modifier modifierM3599a3 = AbstractC1136a.m3599a(c2314t, c32810e.getType().name() + "_CyclePatternInfoButtonTag");
                zM87157i = c28655q.m87157i(c32810e) | c28655q.m87153g(function1) | c28655q.m87153g(function2);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C37454j(c32810e, function1, function2, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C37454j(c32810e, function1, function2, 1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27242b1.m82092d(c27270o3, strM92103Y3, null, modifierM3599a3, (InterfaceC4339a) objM87133R, c28655q, C27270o.f109105k, 4);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (c32810e.m102947c().isEmpty()) {
                c28655q.m87150e0(1420811002);
                if (c32810e.getEmptyState() == null) {
                    c28655q.m87150e0(1420811001);
                    c28655q.m87173q(false);
                    z14 = false;
                } else {
                    c28655q.m87150e0(1420811002);
                    float f110 = 4;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f110 * f110, c2314t));
                    AbstractC25303l.m74291r(c32810e.getEmptyState(), null, null, null, c28655q, 0, 14);
                    z14 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
                z4 = z14;
            } else {
                c28655q.m87150e0(1421095861);
                Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                zM87153g = c28655q.m87153g(interfaceC39171c);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    interfaceC28601c3 = interfaceC28601c2;
                    objM87133R2 = new C37082e1(interfaceC39171c, interfaceC28601c1, interfaceC28601c3, 2);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    interfaceC28601c3 = interfaceC28601c2;
                    objM87133R2 = new C37082e1(interfaceC39171c, interfaceC28601c1, interfaceC28601c3, 2);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3500d2 = AbstractC1131a.m3500d(modifierM3409f5, (Function1) objM87133R2);
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3500d2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m7);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N7);
                numM102952i = c32810e.getTodayIndex();
                if (numM102952i == null) {
                    c28655q.m87150e0(-1189930949);
                    c28655q.m87173q(false);
                    i16 = 0;
                    i15 = 1;
                } else {
                    c28655q.m87150e0(-1189930948);
                    int iIntValue2 = numM102952i.intValue();
                    int size2 = ((C14005e) AbstractC25265s.m74096F0(c32810e.m102947c())).m39885k().size();
                    float f111 = (float) 2.5d;
                    float fM119982s2 = (iIntValue2 * (((m119982s(interfaceC28601c1) - (size2 * f111)) / (size2 - 1)) + f111)) + ((float) 1.5d);
                    float f112 = 14 * 4;
                    Modifier modifierM3391m2 = AbstractC1099a.m3391m(c2314t, fM119982s2, f112);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3391m2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N8);
                    float fM119984u2 = m119984u(interfaceC28601c3) - f112;
                    i15 = 1;
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1102d.m3411h(fM119984u2, AbstractC1102d.m3424u(1, c2314t)), c38072d.m121949b(c28655q, i14).getWhite30(), AbstractC17918w0.f69621a);
                    i16 = 0;
                    AbstractC22989q.m66760a(modifierM3358c2, c28655q, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                f13 = 4;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 0.0f, f15 * f13, i15);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q, i16);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N9);
                c28655q.m87150e0(-613082442);
                i17 = 0;
                while (r1.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C14005e c14005e3 = (C14005e) obj;
                    C14005e c14005e4 = (C14005e) AbstractC25265s.m74102I0(i17 - 1, c32810e.m102947c());
                    listM39883i = c14005e4 != null ? c14005e4.m39883i() : null;
                    if (listM39883i != null) {
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, -1768222311, f13, f13, c2314t));
                        z13 = false;
                        c28655q.m87173q(false);
                    } else {
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, -1768222311, f13, f13, c2314t));
                        z13 = false;
                        c28655q.m87173q(false);
                    }
                    AbstractC14004d.m39859h(c14005e3, z13, c28655q, C14005e.f49972m, 2);
                    if (c32810e.getShowDividers()) {
                        c28655q.m87150e0(-1767818877);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1767818877);
                        c28655q.m87173q(false);
                    }
                    f13 = f13;
                    i17 = i18;
                }
                z4 = false;
                AbstractC2875y.m8286B(c28655q, false, true, true, false);
            }
            c32808dM102946b = c32810e.getButton();
            if (c32808dM102946b == null) {
                c28655q.m87150e0(1423642479);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(1423642480);
                float f113 = 4;
                f14 = f113 * f113;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
                if (c32810e.getEmptyState() == null) {
                    c28655q.m87150e0(338940882);
                    C28655q c28655q5 = c28655q;
                    AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q5, 0, 255);
                    c28655q = c28655q5;
                    AbstractC25012a.m73389v(c2314t, f14, c28655q, false);
                } else {
                    c28655q.m87150e0(339053319);
                    c28655q.m87173q(false);
                }
                C27246d c27246d2 = new C27246d();
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                C27256h c27256h2 = new C27256h(c32808dM102946b.getButtonTitle(), c32808dM102946b.getButtonIcon(), null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33546236, null);
                zM87153g2 = c28655q.m87153g(function3) | c28655q.m87157i(c32808dM102946b);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R3 = new C35076b(25, function3, c32808dM102946b);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C35076b(25, function3, c32808dM102946b);
                    c28655q.m87172p0(objM87133R3);
                }
                c27246d2.Compose(modifierM3409f6, c27256h2, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q2.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m119977n(C32810e c32810e, Function1 function1, Function1 function2) {
        m119987x(c32810e, function1, function2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m119978o(InterfaceC39171c interfaceC39171c, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC39147y layoutCoordinates) {
        AbstractC22676k.m65750j(layoutCoordinates, "layoutCoordinates");
        m119983t(interfaceC28601c1, interfaceC39171c.mo733e0((int) (layoutCoordinates.mo3541n() >> 32)));
        m119985v(interfaceC28601c2, interfaceC39171c.mo733e0((int) (layoutCoordinates.mo3541n() & 4294967295L)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m119979p(Function1 function1, C32808d c32808d, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c32808d);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m119980q(C32810e c32810e, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m119973j(c32810e, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m119981r(Function1 function1, Function1 function2, C32808d button) {
        AbstractC22676k.m65750j(button, "button");
        AnalyticEventModel analyticEventModelM102938a = button.getAnalyticEvent();
        function1.invoke(analyticEventModelM102938a != null ? new AbstractC39672a.a(analyticEventModelM102938a) : AbstractC39672a.g.f170745a);
        function2.invoke(new AbstractC31635g.e(button.getButtonDestination()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final float m119982s(InterfaceC28601c1 interfaceC28601c1) {
        return ((C39174f) interfaceC28601c1.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: t */
    private static final void m119983t(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(new C39174f(f13));
    }

    /* JADX INFO: renamed from: u */
    private static final float m119984u(InterfaceC28601c1 interfaceC28601c1) {
        return ((C39174f) interfaceC28601c1.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: v */
    private static final void m119985v(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(new C39174f(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m119986w(C32810e c32810e, Function1 function1, Function1 function2) {
        m119987x(c32810e, function1, function2);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    private static final void m119987x(C32810e c32810e, Function1 function1, Function1 function2) {
        GenericInteraction genericInteractionM102949f = c32810e.getGenericInteraction();
        if (genericInteractionM102949f != null) {
            AnalyticEventModel analyticEventModelM102945a = c32810e.getAnalyticEvent();
            if (analyticEventModelM102945a != null) {
                function2.invoke(new AbstractC39672a.a(analyticEventModelM102945a));
            }
            function1.invoke(genericInteractionM102949f);
            return;
        }
        int i13 = a.f160282a[c32810e.getType().ordinal()];
        if (i13 == 1) {
            function2.invoke(AbstractC39672a.y.f170773a);
            function1.invoke(AbstractC31635g.d.f130701a);
            return;
        }
        int i14 = 2;
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (c32810e.getEmptyState() == null) {
            function2.invoke(AbstractC39672a.e0.f170742a);
            function1.invoke(new AbstractC31635g.f("your_symptoms", null, i14, 0 == true ? 1 : 0));
        }
    }
}
