package by1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.runtime.Composer;
import aq1.C1909c;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15011f9;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.C22976l1;
import p291l0.InterfaceC22997s1;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import vx1.AbstractC36558a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xx1.InterfaceC38692b;

/* JADX INFO: renamed from: by1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "footerText", "policyCtaText", "", "policyCtaUrl", "Lkotlin/Function1;", "Lxx1/b;", "Ll83/a0;", "onNavigationEvent", "Lvx1/a;", "onAnalyticsEvent", "d", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3697d {
    /* JADX INFO: renamed from: d */
    public static final void m11503d(TextResource footerText, TextResource policyCtaText, String policyCtaUrl, Function1 onNavigationEvent, Function1 onAnalyticsEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(policyCtaText, "policyCtaText");
        AbstractC22676k.m65750j(policyCtaUrl, "policyCtaUrl");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-675344400);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(footerText) : c28655q2.m87157i(footerText) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(policyCtaText) : c28655q2.m87157i(policyCtaText) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(policyCtaUrl) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(onAnalyticsEvent) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            String strM21274h = AbstractC8693b.m21274h(footerText, c28655q2, TextResource.$stable | (i14 & 14));
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB2(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
            C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
            boolean z4 = ((57344 & i14) == 16384) | ((i14 & 7168) == 2048) | ((i14 & 896) == 256);
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C3695b(onAnalyticsEvent, onNavigationEvent, policyCtaUrl, 0);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC12350b.m34583d((InterfaceC4339a) objM87133R, null, false, null, null, null, c22976l1M3379a, AbstractC37817c.m121344e(-1534072787, c28655q2, new C3696c(policyCtaText, 0)), c28655q2, 905969664, 254);
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c(footerText, policyCtaText, policyCtaUrl, onNavigationEvent, onAnalyticsEvent, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m11504e(Function1 function1, Function1 function2, String str) {
        function1.invoke(AbstractC36558a.b.f156537a);
        function2.invoke(new InterfaceC38692b.b(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m11505f(TextResource textResource, InterfaceC22997s1 TextButton, Composer composer, int i13) {
        AbstractC22676k.m65750j(TextButton, "$this$TextButton");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC15011f9.m43114b(AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67363a(C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getBtS().getStyle(), C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4278227943L)), new C17919x(AbstractC17918w0.m51517e(4283210713L)), new C17919x(AbstractC17918w0.m51517e(4284923135L))), 0L, 0L, 14), 0L, null, null, 0L, 33554430), c28655q, 0, 0, 65534);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m11506g(TextResource textResource, TextResource textResource2, String str, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m11503d(textResource, textResource2, str, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
