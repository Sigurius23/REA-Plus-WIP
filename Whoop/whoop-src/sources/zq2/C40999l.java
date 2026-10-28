package zq2;

import androidx.compose.runtime.Composer;
import kr2.AbstractC22813b;
import l83.C23454a0;
import oq2.InterfaceC28125c;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import rq2.C31755w;
import wo1.C37450h;

/* JADX INFO: renamed from: zq2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lzq2/l;", "Loq2/c;", "Lzq2/f;", "<init>", "()V", "state", "", "isCurrentStep", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40999l implements InterfaceC28125c<C40993f> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m133202f(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m133203g(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m133204h(C40999l c40999l, C40993f c40993f, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        c40999l.mo5916a(c40993f, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // oq2.InterfaceC28125c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo5916a(C40993f state, boolean z4, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        boolean z13;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1197354819);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean zM66098y = AbstractC22813b.m66098y(c28655q, 0);
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM66098y) {
                c28655q.m87150e0(-693888355);
                z13 = (i14 & 896) == 256;
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C37450h(onViewEvent, 26);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC40998k.m133180j(state, z4, (Function1) objM87133R, c28655q, i14 & 126);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-693747553);
                z13 = (i14 & 896) == 256;
                Object objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C37450h(onViewEvent, 27);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC40996i.m133145k(state, z4, (Function1) objM87133R2, c28655q, i14 & 126);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31755w(i13, 14, this, state, onViewEvent, z4);
        }
    }
}
