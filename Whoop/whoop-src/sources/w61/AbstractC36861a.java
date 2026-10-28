package w61;

import a11.C0132j;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import e61.C12764g;
import i91.AbstractC18249c;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p91.AbstractC29011e;
import p91.C29007a;
import wb3.AbstractC37056f;
import y61.C39261b;

/* JADX INFO: renamed from: w61.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Ly61/b;", "barState", "", "description", "Ll83/a0;", "c", "(Ly61/b;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36861a {

    /* JADX INFO: renamed from: w61.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ long f157659w;

        public a(long j7) {
            this.f157659w = j7;
        }

        /* JADX INFO: renamed from: a */
        public final long m118220a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return this.f157659w;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118220a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m118217c(C39261b barState, String description, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(barState, "barState");
        AbstractC22676k.m65750j(description, "description");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(877132277);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(barState) : c28655q.m87157i(barState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(description) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            long jMo134584toComposableColorWaAFU9c = barState.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            float xPercent = barState.getXPercent();
            float widthPercent = barState.getWidthPercent();
            C29007a c29007a = new C29007a(barState.getXPercent() + 0.5f, 0.0f, false, false, 14, null);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM88144e = AbstractC29011e.m88144e(c2314t, xPercent, 0.0f, widthPercent, 1.0f, c29007a);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C12764g(description, 22);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM88144e, true, (Function1) objM87133R);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9104G, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM51775c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC36864d.m118237c(barState, c28655q, i14 & 14);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(2, AbstractC29011e.m88149j(c2314t, barState.getXPercent(), -1.0f, new C29007a(0.0f, 0.0f, false, false, 15, null))));
            boolean zM87151f = c28655q.m87151f(jMo134584toComposableColorWaAFU9c);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87151f || objM87133R2 == c28676v0) {
                objM87133R2 = new a(jMo134584toComposableColorWaAFU9c);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22989q.m66760a(AbstractC18249c.m52565c(modifierM3409f, AbstractC18249c.m52574l((Function1) objM87133R2)), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0132j(barState, description, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m118218d(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m118219e(C39261b c39261b, String str, int i13, Composer composer, int i14) {
        m118217c(c39261b, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
