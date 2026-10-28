package re1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c51.C4233j;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.educationModels.StickyButton;
import gb1.AbstractC15673b0;
import l83.C23454a0;
import l83.C23465k;
import ne1.AbstractC26598a;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23001u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.C30599e;
import qn0.C30509d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: re1.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Ll0/u;", "Ly3/f;", "stickyButtonShadowHeight", "Lcom/whoop/educationModels/StickyButton;", "stickyButton", "Lkotlin/Function1;", "Lne1/a;", "Ll83/a0;", "onNavigationEvent", "d", "(Ll0/u;FLcom/whoop/educationModels/StickyButton;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "shadowHeight", "e", "(Ll0/u;FLandroidx/compose/runtime/Composer;I)V", "", "Li2/t;", "i", "(Ljava/lang/String;)Li2/t;", "education_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31326m {
    /* JADX INFO: renamed from: d */
    public static final void m96412d(InterfaceC23001u StickyButton, float f13, StickyButton stickyButton, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(StickyButton, "$this$StickyButton");
        AbstractC22676k.m65750j(stickyButton, "stickyButton");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-935595394);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(StickyButton) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q2.m87153g(stickyButton) : c28655q2.m87157i(stickyButton) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2307m c2307m = C2299e.f9105H;
            Modifier modifierMo3400a = StickyButton.mo3400a(modifierM3409f, c2307m);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3400a);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            m96413e(C1100b.f4583a, f13, c28655q2, (i14 & 112) | 6);
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 2.5d) * 8, c2314t);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(stickyButton.getTitle());
            AbstractC17911t abstractC17911tM96417i = m96417i(stickyButton.getStyle());
            boolean z4 = ((i14 & 896) == 256 || ((i14 & 512) != 0 && c28655q2.m87157i(stickyButton))) | ((i14 & 7168) == 2048);
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C30599e(15, onNavigationEvent, stickyButton);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC27292z.m82343j(modifierM3394p, false, false, null, null, null, textResourceM21278l, null, abstractC17911tM96417i, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q2, (TextResource.$stable << 18) | 6, 0, 7870);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4233j(StickyButton, f13, stickyButton, onNavigationEvent, i13, 2);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final void m96413e(InterfaceC23001u interfaceC23001u, float f13, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1245642290);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC22989q.m66760a(interfaceC23001u.mo3400a(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(f13, AbstractC1092a.m3357b(C2314t.f9131w, C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, AbstractC17918w0.m51515c(1185562)))), new C23465k(Float.valueOf(0.3f), new C17919x(AbstractC17918w0.m51517e(4279244056L))), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51517e(4279244056L)))}, 0.0f, 0.0f, 14), null, 0.0f, 6))), C2299e.f9105H), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30509d(interfaceC23001u, f13, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m96414f(InterfaceC23001u interfaceC23001u, float f13, int i13, Composer composer, int i14) {
        m96413e(interfaceC23001u, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m96415g(Function1 function1, StickyButton stickyButton) {
        function1.invoke(new AbstractC26598a.d(stickyButton.getDestination(), "sticky"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m96416h(InterfaceC23001u interfaceC23001u, float f13, StickyButton stickyButton, Function1 function1, int i13, Composer composer, int i14) {
        m96412d(interfaceC23001u, f13, stickyButton, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC17911t m96417i(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        if (str.equals("PROMO_LINEAR")) {
            return AbstractC15673b0.m43989I0();
        }
        return null;
    }
}
