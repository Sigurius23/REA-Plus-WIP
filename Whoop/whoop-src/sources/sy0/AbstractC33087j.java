package sy0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27276r;
import p026b2.C2314t;
import p095dp.AbstractC12240d;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: sy0.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0083\u0001\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aG\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00042\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "text", "Lsy0/k;", "whoopCheckboxType", "", "initialToggle", "isEnabled", "", "spacerSize", "Li2/x;", "traditionalCheckboxTextColor", "Landroidx/compose/ui/Modifier;", "traditionalCheckboxModifier", "Ll0/k1;", "traditionalCheckboxPaddingValues", "localMinimumInteractiveComponentEnforcement", "toggledColor", "Lkotlin/Function1;", "Ll83/a0;", "onToggle", "f", "(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "enabled", "checkedColor", "modifier", "d", "(ZLkotlin/jvm/functions/Function1;ZJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33087j {
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m104822d(boolean z4, Function1 function1, boolean z13, long j7, Modifier modifier, Composer composer, int i13, int i14) {
        boolean z14;
        int i15;
        Function1 function2;
        boolean z15;
        Modifier modifier2;
        boolean z16;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(376570912);
        if ((i13 & 6) == 0) {
            z14 = z4;
            i15 = (c28655q2.m87155h(z14) ? 4 : 2) | i13;
        } else {
            z14 = z4;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            function2 = function1;
            i15 |= c28655q2.m87157i(function2) ? 32 : 16;
        } else {
            function2 = function1;
        }
        if ((i13 & 384) == 0) {
            z15 = z13;
            i15 |= c28655q2.m87155h(z15) ? 256 : 128;
        } else {
            z15 = z13;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87151f(j7) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i14 & 16;
        if (i16 == 0) {
            if ((i13 & 24576) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z16)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                C38072d c38072d = C38072d.f163053a;
                long brandBlack = c38072d.m121949b(c28655q2, 6).getBrandBlack();
                float f13 = 4;
                int i17 = ((i15 >> 12) & 14) | 113246208;
                int i18 = i15 << 3;
                AbstractC33085h.m104813c(modifier3, z14, function2, z15, null, AbstractC12240d.m34081r(j7, c38072d.m121949b(c28655q2, 6).getWhite30(), brandBlack, 0L, c28655q2, (i15 >> 9) & 14, 24), null, 6 * f13, f13 * f13, c28655q2, i17 | (i18 & 112) | (i18 & 896) | (i18 & 7168), 80);
                c28655q = c28655q2;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27276r(z4, function1, z13, j7, modifier3, i13, i14);
            }
        }
        i15 |= 24576;
        modifier2 = modifier;
        if ((i15 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z16)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            C38072d c38072d2 = C38072d.f163053a;
            long brandBlack2 = c38072d2.m121949b(c28655q2, 6).getBrandBlack();
            float f14 = 4;
            int i19 = ((i15 >> 12) & 14) | 113246208;
            int i110 = i15 << 3;
            AbstractC33085h.m104813c(modifier3, z14, function2, z15, null, AbstractC12240d.m34081r(j7, c38072d2.m121949b(c28655q2, 6).getWhite30(), brandBlack2, 0L, c28655q2, (i15 >> 9) & 14, 24), null, 6 * f14, f14 * f14, c28655q2, i19 | (i110 & 112) | (i110 & 896) | (i110 & 7168), 80);
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27276r(z4, function1, z13, j7, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m104823e(boolean z4, Function1 function1, boolean z13, long j7, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m104822d(z4, function1, z13, j7, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13231. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: f */
    public static final void m104824f(com.whoop.design.util.TextResource r31, sy0.AbstractC33088k r32, boolean r33, boolean r34, int r35, long r36, androidx.compose.p018ui.Modifier r38, p291l0.InterfaceC22973k1 r39, boolean r40, long r41, p715kotlin.jvm.functions.Function1 r43, androidx.compose.runtime.Composer r44, int r45, int r46, int r47) {
        /*
            Method dump skipped, instruction units count: 1323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sy0.AbstractC33087j.m104824f(com.whoop.design.util.TextResource, sy0.k, boolean, boolean, int, long, androidx.compose.ui.Modifier, l0.k1, boolean, long, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m104825g(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m104826h(TextResource textResource, AbstractC33088k abstractC33088k, boolean z4, boolean z13, int i13, long j7, Modifier modifier, InterfaceC22973k1 interfaceC22973k1, boolean z14, long j13, Function1 function1, int i14, int i15, int i16, Composer composer, int i17) {
        m104824f(textResource, abstractC33088k, z4, z13, i13, j7, modifier, interfaceC22973k1, z14, j13, function1, composer, AbstractC28683x.m87244L(i14 | 1), AbstractC28683x.m87244L(i15), i16);
        return C23454a0.f92919a;
    }
}
