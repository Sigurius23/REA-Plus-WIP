package xi0;

import aj0.AbstractC0930a;
import androidx.compose.runtime.Composer;
import bj0.AbstractC3329b;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ti0.C33836a;
import ti0.C33839d;
import ti0.C33840e;
import ti0.C33841f;
import ti0.C33845j;
import ti0.InterfaceC33848m;
import v90.C35813e;
import yi0.AbstractC39566d;
import zi0.AbstractC40662a;

/* JADX INFO: renamed from: xi0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lti0/a;", "Lkotlin/Function1;", "Lri0/b;", "Ll83/a0;", "action", "b", "(Lti0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38320b {
    /* JADX INFO: renamed from: b */
    public static final void m122800b(C33836a c33836a, Function1 action, Composer composer, int i13) {
        int i14;
        Function1 function1;
        AbstractC22676k.m65750j(c33836a, "<this>");
        AbstractC22676k.m65750j(action, "action");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1688927054);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c33836a) : c28655q.m87157i(c33836a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(action) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC33848m contentState = c33836a.getContentState();
            if (contentState instanceof C33840e) {
                c28655q.m87150e0(438743698);
                function1 = action;
                AbstractC40662a.m131974r((C33840e) contentState, function1, null, c28655q, i14 & 112, 4);
                c28655q.m87173q(false);
            } else {
                function1 = action;
                if (contentState instanceof C33841f) {
                    c28655q.m87150e0(438746971);
                    AbstractC0930a.m2364b((C33841f) contentState, function1, c28655q, i14 & 112);
                    c28655q.m87173q(false);
                } else if (contentState instanceof C33845j) {
                    c28655q.m87150e0(438750520);
                    AbstractC3329b.m9630h((C33845j) contentState, function1, c28655q, i14 & 112);
                    c28655q.m87173q(false);
                } else {
                    if (!(contentState instanceof C33839d)) {
                        throw AbstractC11895b.m32003v(438742004, c28655q, false);
                    }
                    c28655q.m87150e0(438753778);
                    AbstractC39566d.m126351m((C33839d) contentState, function1, c28655q, i14 & 112);
                    c28655q.m87173q(false);
                }
            }
        } else {
            function1 = action;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(c33836a, function1, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m122801c(C33836a c33836a, Function1 function1, int i13, Composer composer, int i14) {
        m122800b(c33836a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
