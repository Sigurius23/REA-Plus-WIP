package nw0;

import android.content.res.Configuration;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bs1.C3590i;
import bw0.AbstractC3680c;
import c41.C4141w2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.core.details.network.model.sleep.SleepMetricTypeModel;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import cp0.C10967i1;
import dc0.C11901c;
import gz0.AbstractC16319p0;
import j81.C21421e;
import java.util.List;
import js2.C21927e;
import kd1.AbstractC22404p;
import kotlin.C2026r;
import kw0.AbstractC22848a;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import mf2.C25514e;
import mw0.AbstractC25979g;
import mw0.C25984l;
import n01.C26086c;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26949h;
import no0.C26960m0;
import no1.C26993g;
import org.joda.time.LocalDateTime;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15002f0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23013y;
import p319m4.AbstractC25012a;
import p329n0.C26057j;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p736sz0.C33210q;
import qz0.AbstractC30795n;
import s01.AbstractC32050f;
import s01.C32048d;
import v41.AbstractC35672j;
import vv0.AbstractC36529b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: nw0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a©\u0001\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aS\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a¥\u0001\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001aY\u0010%\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b%\u0010&¨\u0006'²\u0006\u000e\u0010\u001c\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "toolbarTitle", "toolbarTimeWindowText", "Lkotlin/Function1;", "Lkw0/a;", "Ll83/a0;", "onNavigationEvent", "Lmw0/g;", "onViewEvent", "", "icon", "", "isNap", "isNapToSleepAvailable", "sleepId", "", "sleepIdV2", "Ll83/k;", "Lorg/joda/time/LocalDateTime;", "editBounds", "Lbw0/c;", "onAnalyticsEvent", "O", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IZZILjava/lang/String;Ll83/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lmw0/l;", "statsSectionState", "x", "(Lmw0/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "dropDownExpanded", "setDropDownExpanded", "E", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;ILjava/lang/String;Ll83/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "metricsTitle", "metricsSubtitle", "", "Lc41/w2;", "metricsCarousel", "V", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "core-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27200g {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Modifier m81776A(Function1 function1, Function1 function2, String str, C33210q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1266003511);
        boolean zM87153g = ((((i13 & 14) ^ 6) > 4 && c28655q.m87157i(it)) || (i13 & 6) == 4) | c28655q.m87153g(function1) | c28655q.m87153g(function2) | c28655q.m87153g(str);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            C27198e c27198e = new C27198e(function1, (Object) it, function2, str, 0);
            c28655q.m87172p0(c27198e);
            objM87133R = c27198e;
        }
        Modifier modifierM3362g = AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15);
        c28655q.m87173q(false);
        return modifierM3362g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m81777B(Function1 function1, C33210q c33210q, Function1 function2, String str) {
        Object event = c33210q.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        AbstractC22676k.m65748h(event, "null cannot be cast to non-null type com.whoop.core.details.network.model.sleep.SleepMetricTypeModel");
        function1.invoke(new AbstractC25979g.h((SleepMetricTypeModel) event));
        function2.invoke(new AbstractC3680c.k(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m81778C(C32048d c32048d, String str, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        C9598e c9598eM99591c = c32048d.getDestination();
        function1.invoke(c9598eM99591c != null ? new AbstractC22848a.d(c9598eM99591c) : new AbstractC22848a.b(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m81779D(C25984l c25984l, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m81825x(c25984l, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x0190  */
    /* JADX WARN: Code duplicated, block: B:111:0x019d  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0100  */
    /* JADX WARN: Code duplicated, block: B:96:0x0106  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    /* JADX INFO: renamed from: E */
    private static final void m81780E(final boolean z4, final Function1 function1, final Function1 function2, final boolean z13, final boolean z14, final Function1 function3, final int i13, String str, C23465k c23465k, Function1 function4, Composer composer, final int i14, final int i15) {
        int i16;
        String str2;
        int i17;
        C23465k c23465k2;
        int i18;
        int i19;
        int i24;
        int i25;
        boolean z15;
        C28655q c28655q;
        final Function1 function5;
        final C23465k c23465k3;
        C28677v1 c28677v1M87180u;
        final String str3;
        final C23465k c23465k4;
        C28676v0 c28676v0;
        Function1 function6;
        boolean z16;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1772946506);
        if ((i14 & 6) == 0) {
            i16 = (c28655q2.m87155h(z4) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87157i(function2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q2.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i16 |= c28655q2.m87155h(z14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i16 |= c28655q2.m87157i(function3) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i26 = i15 & 128;
        if (i26 == 0) {
            if ((12582912 & i14) == 0) {
                str2 = str;
                i16 |= c28655q2.m87153g(str2) ? 8388608 : 4194304;
            }
            i17 = i15 & 256;
            if (i17 != 0) {
                if ((100663296 & i14) == 0) {
                    c23465k2 = c23465k;
                    if (c28655q2.m87157i(c23465k2)) {
                        i18 = 67108864;
                    } else {
                        i18 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 512;
                if (i19 != 0) {
                    i16 |= 805306368;
                } else if ((i14 & 805306368) == 0) {
                    if (c28655q2.m87157i(function4)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i16 |= i24;
                }
                i25 = i16;
                if ((i25 & 306259091) != 306259090) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q2.m87135U(i25 & 1, z15)) {
                    if (i26 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i17 != 0) {
                        c23465k4 = null;
                    } else {
                        c23465k4 = c23465k2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C26993g(14);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function6 = (Function1) objM87133R2;
                    } else {
                        function6 = function4;
                    }
                    z16 = (i25 & 112) == 32;
                    objM87133R = c28655q2.m87133R();
                    if (z16 || objM87133R == c28676v0) {
                        objM87133R = new C25514e(function1, 25);
                        c28655q2.m87172p0(objM87133R);
                    }
                    final Function1 function7 = function6;
                    c28655q = c28655q2;
                    AbstractC15002f0.m43105a(z4, (InterfaceC4339a) objM87133R, null, (((long) Float.floatToRawIntBits(((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp - (5 * 4))) << 32) | (((long) Float.floatToRawIntBits(0)) & 4294967295L), null, null, AbstractC37817c.m121344e(1383870583, c28655q2, new Function3() { // from class: nw0.c
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC27200g.m81783H(function7, function3, c23465k4, str3, z13, function1, function2, z14, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q, (i25 & 14) | 1572864, 52);
                    str2 = str3;
                    c23465k3 = c23465k4;
                    function5 = function7;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function5 = function4;
                    c23465k3 = c23465k2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final String str4 = str2;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: nw0.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC27200g.m81789N(z4, function1, function2, z13, z14, function3, i13, str4, c23465k3, function5, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            i16 |= 100663296;
            c23465k2 = c23465k;
            i19 = i15 & 512;
            if (i19 != 0) {
                i16 |= 805306368;
            } else if ((i14 & 805306368) == 0) {
                if (c28655q2.m87157i(function4)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i16 |= i24;
            }
            i25 = i16;
            if ((i25 & 306259091) != 306259090) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i25 & 1, z15)) {
                if (i26 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i17 != 0) {
                    c23465k4 = null;
                } else {
                    c23465k4 = c23465k2;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C26993g(14);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function6 = (Function1) objM87133R2;
                } else {
                    function6 = function4;
                }
                if ((i25 & 112) == 32) {
                }
                objM87133R = c28655q2.m87133R();
                if (z16) {
                    objM87133R = new C25514e(function1, 25);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C25514e(function1, 25);
                    c28655q2.m87172p0(objM87133R);
                }
                final Function1 function8 = function6;
                c28655q = c28655q2;
                AbstractC15002f0.m43105a(z4, (InterfaceC4339a) objM87133R, null, (((long) Float.floatToRawIntBits(((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp - (5 * 4))) << 32) | (((long) Float.floatToRawIntBits(0)) & 4294967295L), null, null, AbstractC37817c.m121344e(1383870583, c28655q2, new Function3() { // from class: nw0.c
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC27200g.m81783H(function8, function3, c23465k4, str3, z13, function1, function2, z14, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, (i25 & 14) | 1572864, 52);
                str2 = str3;
                c23465k3 = c23465k4;
                function5 = function8;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function5 = function4;
                c23465k3 = c23465k2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final String str5 = str2;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: nw0.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC27200g.m81789N(z4, function1, function2, z13, z14, function3, i13, str5, c23465k3, function5, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i16 |= 12582912;
        str2 = str;
        i17 = i15 & 256;
        if (i17 != 0) {
            if ((100663296 & i14) == 0) {
                c23465k2 = c23465k;
                if (c28655q2.m87157i(c23465k2)) {
                    i18 = 67108864;
                } else {
                    i18 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i18;
            }
            i19 = i15 & 512;
            if (i19 != 0) {
                i16 |= 805306368;
            } else if ((i14 & 805306368) == 0) {
                if (c28655q2.m87157i(function4)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i16 |= i24;
            }
            i25 = i16;
            if ((i25 & 306259091) != 306259090) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i25 & 1, z15)) {
                if (i26 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i17 != 0) {
                    c23465k4 = null;
                } else {
                    c23465k4 = c23465k2;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C26993g(14);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function6 = (Function1) objM87133R2;
                } else {
                    function6 = function4;
                }
                if ((i25 & 112) == 32) {
                }
                objM87133R = c28655q2.m87133R();
                if (z16) {
                    objM87133R = new C25514e(function1, 25);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C25514e(function1, 25);
                    c28655q2.m87172p0(objM87133R);
                }
                final Function1 function9 = function6;
                c28655q = c28655q2;
                AbstractC15002f0.m43105a(z4, (InterfaceC4339a) objM87133R, null, (((long) Float.floatToRawIntBits(((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp - (5 * 4))) << 32) | (((long) Float.floatToRawIntBits(0)) & 4294967295L), null, null, AbstractC37817c.m121344e(1383870583, c28655q2, new Function3() { // from class: nw0.c
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC27200g.m81783H(function9, function3, c23465k4, str3, z13, function1, function2, z14, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, (i25 & 14) | 1572864, 52);
                str2 = str3;
                c23465k3 = c23465k4;
                function5 = function9;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function5 = function4;
                c23465k3 = c23465k2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final String str6 = str2;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: nw0.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC27200g.m81789N(z4, function1, function2, z13, z14, function3, i13, str6, c23465k3, function5, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i16 |= 100663296;
        c23465k2 = c23465k;
        i19 = i15 & 512;
        if (i19 != 0) {
            i16 |= 805306368;
        } else if ((i14 & 805306368) == 0) {
            if (c28655q2.m87157i(function4)) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i16 |= i24;
        }
        i25 = i16;
        if ((i25 & 306259091) != 306259090) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q2.m87135U(i25 & 1, z15)) {
            if (i26 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (i17 != 0) {
                c23465k4 = null;
            } else {
                c23465k4 = c23465k2;
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C26993g(14);
                    c28655q2.m87172p0(objM87133R2);
                }
                function6 = (Function1) objM87133R2;
            } else {
                function6 = function4;
            }
            if ((i25 & 112) == 32) {
            }
            objM87133R = c28655q2.m87133R();
            if (z16) {
                objM87133R = new C25514e(function1, 25);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C25514e(function1, 25);
                c28655q2.m87172p0(objM87133R);
            }
            final Function1 function10 = function6;
            c28655q = c28655q2;
            AbstractC15002f0.m43105a(z4, (InterfaceC4339a) objM87133R, null, (((long) Float.floatToRawIntBits(((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp - (5 * 4))) << 32) | (((long) Float.floatToRawIntBits(0)) & 4294967295L), null, null, AbstractC37817c.m121344e(1383870583, c28655q2, new Function3() { // from class: nw0.c
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC27200g.m81783H(function10, function3, c23465k4, str3, z13, function1, function2, z14, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, (i25 & 14) | 1572864, 52);
            str2 = str3;
            c23465k3 = c23465k4;
            function5 = function10;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function5 = function4;
            c23465k3 = c23465k2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final String str7 = str2;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: nw0.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC27200g.m81789N(z4, function1, function2, z13, z14, function3, i13, str7, c23465k3, function5, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m81781F(AbstractC3680c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m81782G(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m81783H(Function1 function1, Function1 function2, C23465k c23465k, String str, boolean z4, Function1 function3, Function1 function4, boolean z13, InterfaceC23013y DropdownMenu, Composer composer, int i13) {
        AbstractC22676k.m65750j(DropdownMenu, "$this$DropdownMenu");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(function2) | c28655q.m87157i(c23465k) | c28655q.m87153g(str) | c28655q.m87155h(z4) | c28655q.m87153g(function3);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                C26086c c26086c = new C26086c(function1, function2, c23465k, str, z4, function3);
                c28655q.m87172p0(c26086c);
                objM87133R = c26086c;
            }
            AbstractC15002f0.m43106b((InterfaceC4339a) objM87133R, null, false, null, AbstractC37817c.m121344e(1239173146, c28655q, new C10967i1(z4, 2)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 30);
            boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87153g(function4) | c28655q.m87153g(function3);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C26057j(function1, function4, function3, 7);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC15002f0.m43106b((InterfaceC4339a) objM87133R2, null, false, null, AbstractC37817c.m121344e(-875202045, c28655q, new C10967i1(z4, 3)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 30);
            if (z13) {
                c28655q.m87150e0(-501344540);
                boolean zM87153g3 = c28655q.m87153g(function4) | c28655q.m87153g(function3);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g3 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C11901c(function4, 6, function3);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC15002f0.m43106b((InterfaceC4339a) objM87133R3, null, false, null, C27194a.f108859a.m81775b(), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 30);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-501030293);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m81784I(Function1 function1, Function1 function2, C23465k c23465k, String str, boolean z4, Function1 function3) {
        LocalDateTime localDateTimeMinusHours;
        LocalDateTime localDateTime;
        function1.invoke(AbstractC3680c.f.f15005a);
        if (c23465k == null || (localDateTimeMinusHours = (LocalDateTime) c23465k.f92937w) == null) {
            localDateTimeMinusHours = new LocalDateTime().minusHours(8);
        }
        AbstractC22676k.m65747g(localDateTimeMinusHours);
        if (c23465k == null || (localDateTime = (LocalDateTime) c23465k.f92938x) == null) {
            localDateTime = new LocalDateTime();
        }
        function2.invoke(new AbstractC22848a.c(localDateTimeMinusHours, localDateTime, str, z4));
        function3.invoke(Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m81785J(boolean z4, InterfaceC22997s1 DropdownMenuItem, Composer composer, int i13) {
        AbstractC22676k.m65750j(DropdownMenuItem, "$this$DropdownMenuItem");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(!z4 ? AbstractC36529b.f156354y : AbstractC36529b.f156320A, c28655q, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 262142);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m81786K(Function1 function1, Function1 function2, Function1 function3) {
        function1.invoke(AbstractC3680c.d.f15003a);
        function2.invoke(AbstractC25979g.b.f102598a);
        function3.invoke(Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m81787L(boolean z4, InterfaceC22997s1 DropdownMenuItem, Composer composer, int i13) {
        AbstractC22676k.m65750j(DropdownMenuItem, "$this$DropdownMenuItem");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(!z4 ? AbstractC36529b.f156349t : AbstractC36529b.f156353x, c28655q, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 262142);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m81788M(Function1 function1, Function1 function2) {
        function1.invoke(AbstractC25979g.g.f102608a);
        function2.invoke(Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m81789N(boolean z4, Function1 function1, Function1 function2, boolean z13, boolean z14, Function1 function3, int i13, String str, C23465k c23465k, Function1 function4, int i14, int i15, Composer composer, int i16) {
        m81780E(z4, function1, function2, z13, z14, function3, i13, str, c23465k, function4, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:105:0x013a  */
    /* JADX WARN: Code duplicated, block: B:107:0x013f  */
    /* JADX WARN: Code duplicated, block: B:110:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x015d  */
    /* JADX WARN: Code duplicated, block: B:119:0x016a  */
    /* JADX WARN: Code duplicated, block: B:130:0x018c  */
    /* JADX WARN: Code duplicated, block: B:132:0x018f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0191  */
    /* JADX WARN: Code duplicated, block: B:136:0x0197  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:158:0x020e  */
    /* JADX WARN: Code duplicated, block: B:160:0x021c  */
    /* JADX WARN: Code duplicated, block: B:163:0x023e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0246  */
    /* JADX WARN: Code duplicated, block: B:168:0x028f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0291  */
    /* JADX WARN: Code duplicated, block: B:172:0x0298  */
    /* JADX WARN: Code duplicated, block: B:173:0x029a  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:179:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:180:0x02af  */
    /* JADX WARN: Code duplicated, block: B:184:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:187:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:193:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:195:0x0354  */
    /* JADX WARN: Code duplicated, block: B:198:0x0367  */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x0104  */
    /* JADX WARN: Code duplicated, block: B:87:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX WARN: Code duplicated, block: B:98:0x0129  */
    /* JADX INFO: renamed from: O */
    public static final void m81790O(final TextResource toolbarTitle, TextResource textResource, final Function1 onNavigationEvent, final Function1 onViewEvent, int i13, boolean z4, boolean z13, final int i14, String str, C23465k c23465k, final Function1 onAnalyticsEvent, Composer composer, final int i15, final int i16, final int i17) {
        int i18;
        int iM73369b;
        boolean z14;
        int i19;
        String str2;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z15;
        C28655q c28655q;
        final TextResource textResource2;
        final boolean z16;
        final String str3;
        final int i28;
        final boolean z17;
        final C23465k c23465k2;
        C28677v1 c28677v1M87180u;
        TextResource textResource3;
        boolean z18;
        C23465k c23465k3;
        boolean z19;
        String str4;
        TextResource textResource4;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        TextResource textResourceM21278l;
        int i29;
        boolean z24;
        boolean z25;
        int i34;
        boolean z26;
        boolean z27;
        Object objM87133R2;
        C28676v0 c28676v1;
        Function1 function1;
        Function1 function2;
        C28655q c28655q2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        C28655q c28655q3;
        Object objM87133R4;
        int i35;
        int i36;
        int i37;
        int i38;
        AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-1835996061);
        if ((i15 & 6) == 0) {
            i18 = ((i15 & 8) == 0 ? c28655q4.m87153g(toolbarTitle) : c28655q4.m87157i(toolbarTitle) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        int i39 = i17 & 2;
        if (i39 != 0) {
            i18 |= 48;
        } else if ((i15 & 48) == 0) {
            i18 |= (i15 & 64) == 0 ? c28655q4.m87153g(textResource) : c28655q4.m87157i(textResource) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= c28655q4.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= c28655q4.m87157i(onViewEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            if ((i17 & 16) == 0) {
                iM73369b = i13;
                if (c28655q4.m87149e(iM73369b)) {
                    i38 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i18 |= i38;
            } else {
                iM73369b = i13;
            }
            i38 = DfuBaseService.ERROR_REMOTE_MASK;
            i18 |= i38;
        } else {
            iM73369b = i13;
        }
        int i44 = i17 & 32;
        if (i44 == 0) {
            if ((196608 & i15) == 0) {
                z14 = z4;
                i18 |= c28655q4.m87155h(z14) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((i15 & 1572864) != 0) {
                if ((i17 & 64) == 0 || !c28655q4.m87155h(z13)) {
                    i37 = 524288;
                } else {
                    i37 = 1048576;
                }
                i18 |= i37;
            }
            if ((i15 & 12582912) == 0) {
                if (c28655q4.m87149e(i14)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i18 |= i36;
            }
            i19 = i17 & 256;
            if (i19 != 0) {
                i18 |= 100663296;
                str2 = str;
            } else {
                str2 = str;
                if ((i15 & 100663296) == 0) {
                    if (c28655q4.m87153g(str2)) {
                        i24 = 67108864;
                    } else {
                        i24 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i18 |= i24;
                }
            }
            i25 = i17 & 512;
            if (i25 != 0) {
                if ((i15 & 805306368) == 0) {
                    if (c28655q4.m87157i(c23465k)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i18 |= i26;
                }
                if ((i16 & 6) == 0) {
                    if (c28655q4.m87157i(onAnalyticsEvent)) {
                        i35 = 4;
                    } else {
                        i35 = 2;
                    }
                    i27 = i16 | i35;
                } else {
                    i27 = i16;
                }
                if ((i18 & 306783379) == 306783378 || (i27 & 3) != 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q4.m87135U(i18 & 1, z15)) {
                    c28655q4.m87140Z();
                    if ((i15 & 1) != 0 || c28655q4.m87118C()) {
                        if (i39 != 0) {
                            textResource3 = null;
                        } else {
                            textResource3 = textResource;
                        }
                        if ((i17 & 16) != 0) {
                            iM73369b = AbstractC25012a.m73369b(C38072d.f163053a);
                            i18 &= -57345;
                        }
                        if (i44 != 0) {
                            z14 = false;
                        }
                        if ((i17 & 64) != 0) {
                            i18 = (-3670017) & i18;
                            z18 = z14;
                        } else {
                            z18 = z13;
                        }
                        if (i19 != 0) {
                            str2 = null;
                        }
                        if (i25 != 0) {
                            c23465k3 = null;
                        } else {
                            c23465k3 = c23465k;
                        }
                        z19 = z18;
                        str4 = str2;
                        textResource4 = textResource3;
                    } else {
                        c28655q4.m87138X();
                        if ((i17 & 16) != 0) {
                            i18 &= -57345;
                        }
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                        }
                        textResource4 = textResource;
                        z19 = z13;
                        c23465k3 = c23465k;
                        str4 = str2;
                    }
                    int i45 = iM73369b;
                    boolean z28 = z14;
                    c28655q4.m87175r();
                    objM87133R = c28655q4.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N);
                    int cross = AbstractC16319p0.m46430a().getAction().getCross();
                    int iM46497l = AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getDotMenu();
                    if (textResource4 == null) {
                        textResourceM21278l = AbstractC8693b.m21278l("");
                    } else {
                        textResourceM21278l = textResource4;
                    }
                    i29 = i18;
                    TextResource textResource5 = null;
                    z24 = false;
                    TextResource textResource6 = textResourceM21278l;
                    AbstractC6721d.c cVar = new AbstractC6721d.c(textResource5, toolbarTitle, textResource6, Integer.valueOf(cross), AbstractC8693b.m21273g(AbstractC36529b.f156347r, c28655q4, 0), Integer.valueOf(iM46497l), AbstractC8693b.m21273g(AbstractC36529b.f156329J, c28655q4, 0), AbstractC22404p.m64502k(i45), null, null, null, null, null, 7937, null);
                    if ((i29 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    i34 = i27 & 14;
                    if (i34 == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z25 | z26;
                    objM87133R2 = c28655q4.m87133R();
                    if (z27) {
                        c28676v1 = c28676v0;
                    } else {
                        if (objM87133R2 == c28676v1) {
                            c28676v1 = c28676v0;
                            function1 = onNavigationEvent;
                            function2 = onAnalyticsEvent;
                            c28655q2 = c28655q4;
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                        if (i34 == 4) {
                            z24 = true;
                        }
                        objM87133R3 = c28655q2.m87133R();
                        if (!z24 || objM87133R3 == c28676v1) {
                            interfaceC28601c2 = interfaceC28601c1;
                            objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            interfaceC28601c2 = interfaceC28601c1;
                        }
                        c28655q3 = c28655q2;
                        AbstractC6719b.m20143d(null, cVar, null, interfaceC4339a, (InterfaceC4339a) objM87133R3, null, c28655q3, AbstractC6721d.c.f25657p << 3, 37);
                        boolean zM81791P = m81791P(interfaceC28601c2);
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v1) {
                            objM87133R4 = new C21927e(22, interfaceC28601c2);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        Function1 function3 = (Function1) objM87133R4;
                        int i46 = i29 >> 3;
                        int i47 = i29 >> 6;
                        int i48 = (i46 & 896) | 48 | (i47 & 7168) | (i47 & 57344) | ((i29 << 9) & 458752) | (3670016 & i46) | (29360128 & i46);
                        Function1 function4 = function2;
                        boolean z29 = z19;
                        String str5 = str4;
                        C23465k c23465k4 = c23465k3;
                        m81780E(zM81791P, function3, onViewEvent, z28, z29, function1, i14, str5, c23465k4, function4, c28655q3, (i46 & 234881024) | i48 | ((i27 << 27) & 1879048192), 0);
                        c28655q = c28655q3;
                        c28655q.m87173q(true);
                        z17 = z28;
                        str3 = str5;
                        c23465k2 = c23465k4;
                        textResource2 = textResource4;
                        i28 = i45;
                        z16 = z29;
                    }
                    c28676v1 = c28676v0;
                    function1 = onNavigationEvent;
                    function2 = onAnalyticsEvent;
                    objM87133R2 = new C11901c(function1, 7, function2);
                    c28655q2 = c28655q4;
                    c28655q2.m87172p0(objM87133R2);
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    if (i34 == 4) {
                        z24 = true;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z24) {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q3 = c28655q2;
                    AbstractC6719b.m20143d(null, cVar, null, interfaceC4339a2, (InterfaceC4339a) objM87133R3, null, c28655q3, AbstractC6721d.c.f25657p << 3, 37);
                    boolean zM81791P2 = m81791P(interfaceC28601c2);
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v1) {
                        objM87133R4 = new C21927e(22, interfaceC28601c2);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    Function1 function5 = (Function1) objM87133R4;
                    int i49 = i29 >> 3;
                    int i410 = i29 >> 6;
                    int i411 = (i49 & 896) | 48 | (i410 & 7168) | (i410 & 57344) | ((i29 << 9) & 458752) | (3670016 & i49) | (29360128 & i49);
                    Function1 function6 = function2;
                    boolean z210 = z19;
                    String str6 = str4;
                    C23465k c23465k5 = c23465k3;
                    m81780E(zM81791P2, function5, onViewEvent, z28, z210, function1, i14, str6, c23465k5, function6, c28655q3, (i49 & 234881024) | i411 | ((i27 << 27) & 1879048192), 0);
                    c28655q = c28655q3;
                    c28655q.m87173q(true);
                    z17 = z28;
                    str3 = str6;
                    c23465k2 = c23465k5;
                    textResource2 = textResource4;
                    i28 = i45;
                    z16 = z210;
                } else {
                    c28655q = c28655q4;
                    c28655q.m87138X();
                    textResource2 = textResource;
                    z16 = z13;
                    str3 = str2;
                    i28 = iM73369b;
                    z17 = z14;
                    c23465k2 = c23465k;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: nw0.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC27200g.m81796U(toolbarTitle, textResource2, onNavigationEvent, onViewEvent, i28, z17, z16, i14, str3, c23465k2, onAnalyticsEvent, i15, i16, i17, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i18 |= 805306368;
            if ((i16 & 6) == 0) {
                if (c28655q4.m87157i(onAnalyticsEvent)) {
                    i35 = 4;
                } else {
                    i35 = 2;
                }
                i27 = i16 | i35;
            } else {
                i27 = i16;
            }
            if ((i18 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q4.m87135U(i18 & 1, z15)) {
                c28655q4.m87140Z();
                if ((i15 & 1) != 0) {
                    if (i39 != 0) {
                        textResource3 = null;
                    } else {
                        textResource3 = textResource;
                    }
                    if ((i17 & 16) != 0) {
                        iM73369b = AbstractC25012a.m73369b(C38072d.f163053a);
                        i18 &= -57345;
                    }
                    if (i44 != 0) {
                        z14 = false;
                    }
                    if ((i17 & 64) != 0) {
                        i18 = (-3670017) & i18;
                        z18 = z14;
                    } else {
                        z18 = z13;
                    }
                    if (i19 != 0) {
                        str2 = null;
                    }
                    if (i25 != 0) {
                        c23465k3 = null;
                    } else {
                        c23465k3 = c23465k;
                    }
                    z19 = z18;
                    str4 = str2;
                    textResource4 = textResource3;
                } else {
                    if (i39 != 0) {
                        textResource3 = null;
                    } else {
                        textResource3 = textResource;
                    }
                    if ((i17 & 16) != 0) {
                        iM73369b = AbstractC25012a.m73369b(C38072d.f163053a);
                        i18 &= -57345;
                    }
                    if (i44 != 0) {
                        z14 = false;
                    }
                    if ((i17 & 64) != 0) {
                        i18 = (-3670017) & i18;
                        z18 = z14;
                    } else {
                        z18 = z13;
                    }
                    if (i19 != 0) {
                        str2 = null;
                    }
                    if (i25 != 0) {
                        c23465k3 = null;
                    } else {
                        c23465k3 = c23465k;
                    }
                    z19 = z18;
                    str4 = str2;
                    textResource4 = textResource3;
                }
                int i412 = iM73369b;
                boolean z211 = z14;
                c28655q4.m87175r();
                objM87133R = c28655q4.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N2);
                int cross2 = AbstractC16319p0.m46430a().getAction().getCross();
                int iM46497l2 = AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getDotMenu();
                if (textResource4 == null) {
                    textResourceM21278l = AbstractC8693b.m21278l("");
                } else {
                    textResourceM21278l = textResource4;
                }
                i29 = i18;
                TextResource textResource7 = null;
                z24 = false;
                TextResource textResource8 = textResourceM21278l;
                AbstractC6721d.c cVar2 = new AbstractC6721d.c(textResource7, toolbarTitle, textResource8, Integer.valueOf(cross2), AbstractC8693b.m21273g(AbstractC36529b.f156347r, c28655q4, 0), Integer.valueOf(iM46497l2), AbstractC8693b.m21273g(AbstractC36529b.f156329J, c28655q4, 0), AbstractC22404p.m64502k(i412), null, null, null, null, null, 7937, null);
                if ((i29 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                i34 = i27 & 14;
                if (i34 == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z25 | z26;
                objM87133R2 = c28655q4.m87133R();
                if (z27) {
                    if (objM87133R2 == c28676v1) {
                        c28676v1 = c28676v0;
                        function1 = onNavigationEvent;
                        function2 = onAnalyticsEvent;
                        c28655q2 = c28655q4;
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    if (i34 == 4) {
                        z24 = true;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z24) {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q3 = c28655q2;
                    AbstractC6719b.m20143d(null, cVar2, null, interfaceC4339a3, (InterfaceC4339a) objM87133R3, null, c28655q3, AbstractC6721d.c.f25657p << 3, 37);
                    boolean zM81791P3 = m81791P(interfaceC28601c2);
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v1) {
                        objM87133R4 = new C21927e(22, interfaceC28601c2);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    Function1 function7 = (Function1) objM87133R4;
                    int i413 = i29 >> 3;
                    int i414 = i29 >> 6;
                    int i415 = (i413 & 896) | 48 | (i414 & 7168) | (i414 & 57344) | ((i29 << 9) & 458752) | (3670016 & i413) | (29360128 & i413);
                    Function1 function8 = function2;
                    boolean z212 = z19;
                    String str7 = str4;
                    C23465k c23465k6 = c23465k3;
                    m81780E(zM81791P3, function7, onViewEvent, z211, z212, function1, i14, str7, c23465k6, function8, c28655q3, (i413 & 234881024) | i415 | ((i27 << 27) & 1879048192), 0);
                    c28655q = c28655q3;
                    c28655q.m87173q(true);
                    z17 = z211;
                    str3 = str7;
                    c23465k2 = c23465k6;
                    textResource2 = textResource4;
                    i28 = i412;
                    z16 = z212;
                } else {
                    c28676v1 = c28676v0;
                }
                c28676v1 = c28676v0;
                function1 = onNavigationEvent;
                function2 = onAnalyticsEvent;
                objM87133R2 = new C11901c(function1, 7, function2);
                c28655q2 = c28655q4;
                c28655q2.m87172p0(objM87133R2);
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                if (i34 == 4) {
                    z24 = true;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z24) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q3 = c28655q2;
                AbstractC6719b.m20143d(null, cVar2, null, interfaceC4339a4, (InterfaceC4339a) objM87133R3, null, c28655q3, AbstractC6721d.c.f25657p << 3, 37);
                boolean zM81791P4 = m81791P(interfaceC28601c2);
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v1) {
                    objM87133R4 = new C21927e(22, interfaceC28601c2);
                    c28655q3.m87172p0(objM87133R4);
                }
                Function1 function9 = (Function1) objM87133R4;
                int i416 = i29 >> 3;
                int i417 = i29 >> 6;
                int i418 = (i416 & 896) | 48 | (i417 & 7168) | (i417 & 57344) | ((i29 << 9) & 458752) | (3670016 & i416) | (29360128 & i416);
                Function1 function10 = function2;
                boolean z213 = z19;
                String str8 = str4;
                C23465k c23465k7 = c23465k3;
                m81780E(zM81791P4, function9, onViewEvent, z211, z213, function1, i14, str8, c23465k7, function10, c28655q3, (i416 & 234881024) | i418 | ((i27 << 27) & 1879048192), 0);
                c28655q = c28655q3;
                c28655q.m87173q(true);
                z17 = z211;
                str3 = str8;
                c23465k2 = c23465k7;
                textResource2 = textResource4;
                i28 = i412;
                z16 = z213;
            } else {
                c28655q = c28655q4;
                c28655q.m87138X();
                textResource2 = textResource;
                z16 = z13;
                str3 = str2;
                i28 = iM73369b;
                z17 = z14;
                c23465k2 = c23465k;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: nw0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC27200g.m81796U(toolbarTitle, textResource2, onNavigationEvent, onViewEvent, i28, z17, z16, i14, str3, c23465k2, onAnalyticsEvent, i15, i16, i17, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z14 = z4;
        if ((i15 & 1572864) != 0) {
            if ((i17 & 64) == 0) {
                i37 = 524288;
            } else {
                i37 = 524288;
            }
            i18 |= i37;
        }
        if ((i15 & 12582912) == 0) {
            if (c28655q4.m87149e(i14)) {
                i36 = 8388608;
            } else {
                i36 = 4194304;
            }
            i18 |= i36;
        }
        i19 = i17 & 256;
        if (i19 != 0) {
            i18 |= 100663296;
            str2 = str;
        } else {
            str2 = str;
            if ((i15 & 100663296) == 0) {
                if (c28655q4.m87153g(str2)) {
                    i24 = 67108864;
                } else {
                    i24 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i18 |= i24;
            }
        }
        i25 = i17 & 512;
        if (i25 != 0) {
            if ((i15 & 805306368) == 0) {
                if (c28655q4.m87157i(c23465k)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i18 |= i26;
            }
            if ((i16 & 6) == 0) {
                if (c28655q4.m87157i(onAnalyticsEvent)) {
                    i35 = 4;
                } else {
                    i35 = 2;
                }
                i27 = i16 | i35;
            } else {
                i27 = i16;
            }
            if ((i18 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q4.m87135U(i18 & 1, z15)) {
                c28655q4.m87140Z();
                if ((i15 & 1) != 0) {
                    if (i39 != 0) {
                        textResource3 = null;
                    } else {
                        textResource3 = textResource;
                    }
                    if ((i17 & 16) != 0) {
                        iM73369b = AbstractC25012a.m73369b(C38072d.f163053a);
                        i18 &= -57345;
                    }
                    if (i44 != 0) {
                        z14 = false;
                    }
                    if ((i17 & 64) != 0) {
                        i18 = (-3670017) & i18;
                        z18 = z14;
                    } else {
                        z18 = z13;
                    }
                    if (i19 != 0) {
                        str2 = null;
                    }
                    if (i25 != 0) {
                        c23465k3 = null;
                    } else {
                        c23465k3 = c23465k;
                    }
                    z19 = z18;
                    str4 = str2;
                    textResource4 = textResource3;
                } else {
                    if (i39 != 0) {
                        textResource3 = null;
                    } else {
                        textResource3 = textResource;
                    }
                    if ((i17 & 16) != 0) {
                        iM73369b = AbstractC25012a.m73369b(C38072d.f163053a);
                        i18 &= -57345;
                    }
                    if (i44 != 0) {
                        z14 = false;
                    }
                    if ((i17 & 64) != 0) {
                        i18 = (-3670017) & i18;
                        z18 = z14;
                    } else {
                        z18 = z13;
                    }
                    if (i19 != 0) {
                        str2 = null;
                    }
                    if (i25 != 0) {
                        c23465k3 = null;
                    } else {
                        c23465k3 = c23465k;
                    }
                    z19 = z18;
                    str4 = str2;
                    textResource4 = textResource3;
                }
                int i419 = iM73369b;
                boolean z214 = z14;
                c28655q4.m87175r();
                objM87133R = c28655q4.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N3);
                int cross3 = AbstractC16319p0.m46430a().getAction().getCross();
                int iM46497l3 = AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getDotMenu();
                if (textResource4 == null) {
                    textResourceM21278l = AbstractC8693b.m21278l("");
                } else {
                    textResourceM21278l = textResource4;
                }
                i29 = i18;
                TextResource textResource9 = null;
                z24 = false;
                TextResource textResource10 = textResourceM21278l;
                AbstractC6721d.c cVar3 = new AbstractC6721d.c(textResource9, toolbarTitle, textResource10, Integer.valueOf(cross3), AbstractC8693b.m21273g(AbstractC36529b.f156347r, c28655q4, 0), Integer.valueOf(iM46497l3), AbstractC8693b.m21273g(AbstractC36529b.f156329J, c28655q4, 0), AbstractC22404p.m64502k(i419), null, null, null, null, null, 7937, null);
                if ((i29 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                i34 = i27 & 14;
                if (i34 == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z25 | z26;
                objM87133R2 = c28655q4.m87133R();
                if (z27) {
                    if (objM87133R2 == c28676v1) {
                        c28676v1 = c28676v0;
                        function1 = onNavigationEvent;
                        function2 = onAnalyticsEvent;
                        c28655q2 = c28655q4;
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    if (i34 == 4) {
                        z24 = true;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z24) {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q3 = c28655q2;
                    AbstractC6719b.m20143d(null, cVar3, null, interfaceC4339a5, (InterfaceC4339a) objM87133R3, null, c28655q3, AbstractC6721d.c.f25657p << 3, 37);
                    boolean zM81791P5 = m81791P(interfaceC28601c2);
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v1) {
                        objM87133R4 = new C21927e(22, interfaceC28601c2);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    Function1 function11 = (Function1) objM87133R4;
                    int i4110 = i29 >> 3;
                    int i4111 = i29 >> 6;
                    int i4112 = (i4110 & 896) | 48 | (i4111 & 7168) | (i4111 & 57344) | ((i29 << 9) & 458752) | (3670016 & i4110) | (29360128 & i4110);
                    Function1 function12 = function2;
                    boolean z215 = z19;
                    String str9 = str4;
                    C23465k c23465k8 = c23465k3;
                    m81780E(zM81791P5, function11, onViewEvent, z214, z215, function1, i14, str9, c23465k8, function12, c28655q3, (i4110 & 234881024) | i4112 | ((i27 << 27) & 1879048192), 0);
                    c28655q = c28655q3;
                    c28655q.m87173q(true);
                    z17 = z214;
                    str3 = str9;
                    c23465k2 = c23465k8;
                    textResource2 = textResource4;
                    i28 = i419;
                    z16 = z215;
                } else {
                    c28676v1 = c28676v0;
                }
                c28676v1 = c28676v0;
                function1 = onNavigationEvent;
                function2 = onAnalyticsEvent;
                objM87133R2 = new C11901c(function1, 7, function2);
                c28655q2 = c28655q4;
                c28655q2.m87172p0(objM87133R2);
                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                if (i34 == 4) {
                    z24 = true;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z24) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q3 = c28655q2;
                AbstractC6719b.m20143d(null, cVar3, null, interfaceC4339a6, (InterfaceC4339a) objM87133R3, null, c28655q3, AbstractC6721d.c.f25657p << 3, 37);
                boolean zM81791P6 = m81791P(interfaceC28601c2);
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v1) {
                    objM87133R4 = new C21927e(22, interfaceC28601c2);
                    c28655q3.m87172p0(objM87133R4);
                }
                Function1 function13 = (Function1) objM87133R4;
                int i4113 = i29 >> 3;
                int i4114 = i29 >> 6;
                int i4115 = (i4113 & 896) | 48 | (i4114 & 7168) | (i4114 & 57344) | ((i29 << 9) & 458752) | (3670016 & i4113) | (29360128 & i4113);
                Function1 function14 = function2;
                boolean z216 = z19;
                String str10 = str4;
                C23465k c23465k9 = c23465k3;
                m81780E(zM81791P6, function13, onViewEvent, z214, z216, function1, i14, str10, c23465k9, function14, c28655q3, (i4113 & 234881024) | i4115 | ((i27 << 27) & 1879048192), 0);
                c28655q = c28655q3;
                c28655q.m87173q(true);
                z17 = z214;
                str3 = str10;
                c23465k2 = c23465k9;
                textResource2 = textResource4;
                i28 = i419;
                z16 = z216;
            } else {
                c28655q = c28655q4;
                c28655q.m87138X();
                textResource2 = textResource;
                z16 = z13;
                str3 = str2;
                i28 = iM73369b;
                z17 = z14;
                c23465k2 = c23465k;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: nw0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC27200g.m81796U(toolbarTitle, textResource2, onNavigationEvent, onViewEvent, i28, z17, z16, i14, str3, c23465k2, onAnalyticsEvent, i15, i16, i17, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i18 |= 805306368;
        if ((i16 & 6) == 0) {
            if (c28655q4.m87157i(onAnalyticsEvent)) {
                i35 = 4;
            } else {
                i35 = 2;
            }
            i27 = i16 | i35;
        } else {
            i27 = i16;
        }
        if ((i18 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (c28655q4.m87135U(i18 & 1, z15)) {
            c28655q4.m87140Z();
            if ((i15 & 1) != 0) {
                if (i39 != 0) {
                    textResource3 = null;
                } else {
                    textResource3 = textResource;
                }
                if ((i17 & 16) != 0) {
                    iM73369b = AbstractC25012a.m73369b(C38072d.f163053a);
                    i18 &= -57345;
                }
                if (i44 != 0) {
                    z14 = false;
                }
                if ((i17 & 64) != 0) {
                    i18 = (-3670017) & i18;
                    z18 = z14;
                } else {
                    z18 = z13;
                }
                if (i19 != 0) {
                    str2 = null;
                }
                if (i25 != 0) {
                    c23465k3 = null;
                } else {
                    c23465k3 = c23465k;
                }
                z19 = z18;
                str4 = str2;
                textResource4 = textResource3;
            } else {
                if (i39 != 0) {
                    textResource3 = null;
                } else {
                    textResource3 = textResource;
                }
                if ((i17 & 16) != 0) {
                    iM73369b = AbstractC25012a.m73369b(C38072d.f163053a);
                    i18 &= -57345;
                }
                if (i44 != 0) {
                    z14 = false;
                }
                if ((i17 & 64) != 0) {
                    i18 = (-3670017) & i18;
                    z18 = z14;
                } else {
                    z18 = z13;
                }
                if (i19 != 0) {
                    str2 = null;
                }
                if (i25 != 0) {
                    c23465k3 = null;
                } else {
                    c23465k3 = c23465k;
                }
                z19 = z18;
                str4 = str2;
                textResource4 = textResource3;
            }
            int i4116 = iM73369b;
            boolean z217 = z14;
            c28655q4.m87175r();
            objM87133R = c28655q4.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N4);
            int cross4 = AbstractC16319p0.m46430a().getAction().getCross();
            int iM46497l4 = AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getDotMenu();
            if (textResource4 == null) {
                textResourceM21278l = AbstractC8693b.m21278l("");
            } else {
                textResourceM21278l = textResource4;
            }
            i29 = i18;
            TextResource textResource11 = null;
            z24 = false;
            TextResource textResource12 = textResourceM21278l;
            AbstractC6721d.c cVar4 = new AbstractC6721d.c(textResource11, toolbarTitle, textResource12, Integer.valueOf(cross4), AbstractC8693b.m21273g(AbstractC36529b.f156347r, c28655q4, 0), Integer.valueOf(iM46497l4), AbstractC8693b.m21273g(AbstractC36529b.f156329J, c28655q4, 0), AbstractC22404p.m64502k(i4116), null, null, null, null, null, 7937, null);
            if ((i29 & 896) == 256) {
                z25 = true;
            } else {
                z25 = false;
            }
            i34 = i27 & 14;
            if (i34 == 4) {
                z26 = true;
            } else {
                z26 = false;
            }
            z27 = z25 | z26;
            objM87133R2 = c28655q4.m87133R();
            if (z27) {
                if (objM87133R2 == c28676v1) {
                    c28676v1 = c28676v0;
                    function1 = onNavigationEvent;
                    function2 = onAnalyticsEvent;
                    c28655q2 = c28655q4;
                }
                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                if (i34 == 4) {
                    z24 = true;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z24) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q3 = c28655q2;
                AbstractC6719b.m20143d(null, cVar4, null, interfaceC4339a7, (InterfaceC4339a) objM87133R3, null, c28655q3, AbstractC6721d.c.f25657p << 3, 37);
                boolean zM81791P7 = m81791P(interfaceC28601c2);
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v1) {
                    objM87133R4 = new C21927e(22, interfaceC28601c2);
                    c28655q3.m87172p0(objM87133R4);
                }
                Function1 function15 = (Function1) objM87133R4;
                int i4117 = i29 >> 3;
                int i4118 = i29 >> 6;
                int i4119 = (i4117 & 896) | 48 | (i4118 & 7168) | (i4118 & 57344) | ((i29 << 9) & 458752) | (3670016 & i4117) | (29360128 & i4117);
                Function1 function16 = function2;
                boolean z218 = z19;
                String str11 = str4;
                C23465k c23465k10 = c23465k3;
                m81780E(zM81791P7, function15, onViewEvent, z217, z218, function1, i14, str11, c23465k10, function16, c28655q3, (i4117 & 234881024) | i4119 | ((i27 << 27) & 1879048192), 0);
                c28655q = c28655q3;
                c28655q.m87173q(true);
                z17 = z217;
                str3 = str11;
                c23465k2 = c23465k10;
                textResource2 = textResource4;
                i28 = i4116;
                z16 = z218;
            } else {
                c28676v1 = c28676v0;
            }
            c28676v1 = c28676v0;
            function1 = onNavigationEvent;
            function2 = onAnalyticsEvent;
            objM87133R2 = new C11901c(function1, 7, function2);
            c28655q2 = c28655q4;
            c28655q2.m87172p0(objM87133R2);
            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
            if (i34 == 4) {
                z24 = true;
            }
            objM87133R3 = c28655q2.m87133R();
            if (z24) {
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                c28655q2.m87172p0(objM87133R3);
            } else {
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R3 = new C3590i(function2, interfaceC28601c2, 26);
                c28655q2.m87172p0(objM87133R3);
            }
            c28655q3 = c28655q2;
            AbstractC6719b.m20143d(null, cVar4, null, interfaceC4339a8, (InterfaceC4339a) objM87133R3, null, c28655q3, AbstractC6721d.c.f25657p << 3, 37);
            boolean zM81791P8 = m81791P(interfaceC28601c2);
            objM87133R4 = c28655q3.m87133R();
            if (objM87133R4 == c28676v1) {
                objM87133R4 = new C21927e(22, interfaceC28601c2);
                c28655q3.m87172p0(objM87133R4);
            }
            Function1 function17 = (Function1) objM87133R4;
            int i41110 = i29 >> 3;
            int i41111 = i29 >> 6;
            int i41112 = (i41110 & 896) | 48 | (i41111 & 7168) | (i41111 & 57344) | ((i29 << 9) & 458752) | (3670016 & i41110) | (29360128 & i41110);
            Function1 function18 = function2;
            boolean z219 = z19;
            String str12 = str4;
            C23465k c23465k11 = c23465k3;
            m81780E(zM81791P8, function17, onViewEvent, z217, z219, function1, i14, str12, c23465k11, function18, c28655q3, (i41110 & 234881024) | i41112 | ((i27 << 27) & 1879048192), 0);
            c28655q = c28655q3;
            c28655q.m87173q(true);
            z17 = z217;
            str3 = str12;
            c23465k2 = c23465k11;
            textResource2 = textResource4;
            i28 = i4116;
            z16 = z219;
        } else {
            c28655q = c28655q4;
            c28655q.m87138X();
            textResource2 = textResource;
            z16 = z13;
            str3 = str2;
            i28 = iM73369b;
            z17 = z14;
            c23465k2 = c23465k;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: nw0.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC27200g.m81796U(toolbarTitle, textResource2, onNavigationEvent, onViewEvent, i28, z17, z16, i14, str3, c23465k2, onAnalyticsEvent, i15, i16, i17, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: renamed from: P */
    private static final boolean m81791P(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: Q */
    private static final void m81792Q(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m81793R(Function1 function1, Function1 function2) {
        function1.invoke(AbstractC22848a.a.f90080a);
        function2.invoke(AbstractC3680c.a.f15000a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m81794S(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        m81792Q(interfaceC28601c1, !m81791P(interfaceC28601c1));
        function1.invoke(AbstractC3680c.h.f15007a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m81795T(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m81792Q(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m81796U(TextResource textResource, TextResource textResource2, Function1 function1, Function1 function2, int i13, boolean z4, boolean z13, int i14, String str, C23465k c23465k, Function1 function3, int i15, int i16, int i17, Composer composer, int i18) {
        m81790O(textResource, textResource2, function1, function2, i13, z4, z13, i14, str, c23465k, function3, composer, AbstractC28683x.m87244L(i15 | 1), AbstractC28683x.m87244L(i16), i17);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:83:0x0120  */
    /* JADX WARN: Code duplicated, block: B:86:0x012b  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: V */
    public static final void m81797V(TextResource metricsTitle, TextResource metricsSubtitle, List<C4141w2> metricsCarousel, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        boolean z13;
        boolean z14;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(metricsTitle, "metricsTitle");
        AbstractC22676k.m65750j(metricsSubtitle, "metricsSubtitle");
        AbstractC22676k.m65750j(metricsCarousel, "metricsCarousel");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-96421550);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(metricsTitle) : c28655q.m87157i(metricsTitle) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(metricsSubtitle) : c28655q.m87157i(metricsSubtitle) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(metricsCarousel) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = 16384;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C26993g(13);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C26993g(15);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    }
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | ((i15 & 7168) == 2048);
                    objM87133R = c28655q.m87133R();
                    if (z14 || objM87133R == c28676v0) {
                        objM87133R = new C2777c(function4, 11, function7);
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function8 = (Function1) objM87133R;
                    int i19 = TextResource.$stable;
                    int i24 = i15 << 6;
                    AbstractC35672j.m112984d(null, null, metricsTitle, metricsSubtitle, metricsCarousel, function8, c28655q, (i19 << 9) | (i19 << 6) | (i24 & 896) | (i24 & 7168) | (i24 & 57344), 3);
                    function5 = function7;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                }
                function6 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e(metricsTitle, metricsSubtitle, metricsCarousel, function5, function6, i13, i14);
                }
            }
            i15 |= 24576;
            function4 = function2;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26993g(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C26993g(15);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                }
                if ((i15 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i15 & 7168) == 2048);
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C2777c(function4, 11, function7);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2777c(function4, 11, function7);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function9 = (Function1) objM87133R;
                int i110 = TextResource.$stable;
                int i25 = i15 << 6;
                AbstractC35672j.m112984d(null, null, metricsTitle, metricsSubtitle, metricsCarousel, function9, c28655q, (i110 << 9) | (i110 << 6) | (i25 & 896) | (i25 & 7168) | (i25 & 57344), 3);
                function5 = function7;
            } else {
                c28655q.m87138X();
                function5 = function3;
            }
            function6 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(metricsTitle, metricsSubtitle, metricsCarousel, function5, function6, i13, i14);
            }
        }
        i15 |= 3072;
        function3 = function1;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = 16384;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26993g(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C26993g(15);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                }
                if ((i15 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i15 & 7168) == 2048);
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C2777c(function4, 11, function7);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2777c(function4, 11, function7);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function10 = (Function1) objM87133R;
                int i111 = TextResource.$stable;
                int i26 = i15 << 6;
                AbstractC35672j.m112984d(null, null, metricsTitle, metricsSubtitle, metricsCarousel, function10, c28655q, (i111 << 9) | (i111 << 6) | (i26 & 896) | (i26 & 7168) | (i26 & 57344), 3);
                function5 = function7;
            } else {
                c28655q.m87138X();
                function5 = function3;
            }
            function6 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(metricsTitle, metricsSubtitle, metricsCarousel, function5, function6, i13, i14);
            }
        }
        i15 |= 24576;
        function4 = function2;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C26993g(13);
                    c28655q.m87172p0(objM87133R3);
                }
                function7 = (Function1) objM87133R3;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C26993g(15);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            }
            if ((i15 & 57344) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | ((i15 & 7168) == 2048);
            objM87133R = c28655q.m87133R();
            if (z14) {
                objM87133R = new C2777c(function4, 11, function7);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C2777c(function4, 11, function7);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function11 = (Function1) objM87133R;
            int i112 = TextResource.$stable;
            int i27 = i15 << 6;
            AbstractC35672j.m112984d(null, null, metricsTitle, metricsSubtitle, metricsCarousel, function11, c28655q, (i112 << 9) | (i112 << 6) | (i27 & 896) | (i27 & 7168) | (i27 & 57344), 3);
            function5 = function7;
        } else {
            c28655q.m87138X();
            function5 = function3;
        }
        function6 = function4;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(metricsTitle, metricsSubtitle, metricsCarousel, function5, function6, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m81798W(AbstractC3680c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m81799X(AbstractC25979g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m81800Y(Function1 function1, Function1 function2, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC25979g.f) {
            function1.invoke(it);
            function2.invoke(new AbstractC3680c.g(((AbstractC25979g.f) it).getSleepMetricTitleDisplay()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m81801Z(TextResource textResource, TextResource textResource2, List list, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m81797V(textResource, textResource2, list, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    public static final void m81825x(C25984l statsSectionState, Function1 onAnalyticsEvent, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        boolean z4;
        AbstractC22676k.m65750j(statsSectionState, "statsSectionState");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1798881260);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(statsSectionState) : c28655q.m87157i(statsSectionState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onAnalyticsEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 4;
            float f14 = 2 * f13;
            float f15 = f13 * f13;
            float f16 = 1 * f13;
            Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t, f16, f14, f16, f15);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
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
            if (statsSectionState.getMainStat() == null) {
                c28655q.m87150e0(-983976578);
                z4 = false;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-983976577);
                AbstractC25303l.m74291r(statsSectionState.getMainStat(), null, new C2026r(onViewEvent, statsSectionState, onAnalyticsEvent, AbstractC8693b.m21274h(statsSectionState.getMainStat().getStatTitle(), c28655q, TextResource.$stable)), null, c28655q, C33210q.f138488m, 10);
                z4 = false;
                c28655q.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(10 * f13, r17));
            C33210q c33210qM77083a = statsSectionState.getCenterStat();
            if (c33210qM77083a == null) {
                c28655q.m87150e0(-983034178);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(-983034177);
                AbstractC25303l.m74291r(c33210qM77083a, null, new C26949h(onViewEvent, onAnalyticsEvent, AbstractC8693b.m21274h(c33210qM77083a.getStatTitle(), c28655q, TextResource.$stable)), null, c28655q, C33210q.f138488m, 10);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            C32048d c32048dM77085c = statsSectionState.getWhoopCoachVowViewState();
            if (c32048dM77085c != null) {
                c28655q.m87150e0(-734774550);
                String strM21274h = AbstractC8693b.m21274h(c32048dM77085c.getVow(), c28655q, TextResource.$stable);
                Modifier modifierM3355a = AbstractC1091c.m3355a(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15, 7), null, 3);
                boolean zM87157i = ((i14 & 7168) == 2048) | c28655q.m87157i(c32048dM77085c) | c28655q.m87153g(strM21274h);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C27199f(c32048dM77085c, strM21274h, onNavigationEvent);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC32050f.m99607k(modifierM3355a, c32048dM77085c, (Function1) objM87133R, c28655q, C32048d.f132920h << 3, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-734219092);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26960m0(statsSectionState, onAnalyticsEvent, onViewEvent, onNavigationEvent, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Modifier m81826y(Function1 function1, C25984l c25984l, Function1 function2, String str, C33210q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1173732850);
        boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c25984l) | c28655q.m87153g(function2) | c28655q.m87153g(str);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            C27198e c27198e = new C27198e(function1, (Object) c25984l, function2, str, 1);
            c28655q.m87172p0(c27198e);
            objM87133R = c27198e;
        }
        Modifier modifierM3362g = AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15);
        c28655q.m87173q(false);
        return modifierM3362g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m81827z(Function1 function1, C25984l c25984l, Function1 function2, String str) {
        Object event = c25984l.getMainStat().getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        AbstractC22676k.m65748h(event, "null cannot be cast to non-null type com.whoop.core.details.network.model.sleep.SleepMetricTypeModel");
        function1.invoke(new AbstractC25979g.h((SleepMetricTypeModel) event));
        function2.invoke(new AbstractC3680c.k(str));
        return C23454a0.f92919a;
    }
}
