package hh0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import g90.C15595a;
import kd1.C22409u;
import l83.C23454a0;
import nf3.C26669a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import pf3.C29155a;
import xf3.C38266c;

/* JADX INFO: renamed from: hh0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lhh0/b;", "Lm91/f;", "Lhh0/a;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "b", "(Landroidx/compose/ui/Modifier;Lhh0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17282b implements InterfaceC25297f<C17281a> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m48929c(C17282b c17282b, Modifier modifier, C17281a c17281a, Function1 function1, int i13, Composer composer, int i14) {
        c17282b.Compose(modifier, c17281a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C17281a itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1544252347);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(itemState) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87152f0(-909571169);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            c28655q.m87152f0(-3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(false);
            AbstractC17286f.m48942i(itemState, modifier, (C22409u) objM87133R, c28655q, (C22409u.f87656e << 6) | ((i14 << 3) & 112) | ((i14 >> 3) & 14), 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15595a(this, modifier, itemState, onViewEvent, i13, 24);
        }
    }
}
