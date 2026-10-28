package yf1;

import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import vv2.C36538d;
import wf1.C37245c;

/* JADX INFO: renamed from: yf1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lwf1/c;", "viewState", "Lkotlin/Function1;", "Lwf1/a;", "Ll83/a0;", "onEvent", "c", "(Lwf1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feedback-survey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39517f {
    /* JADX INFO: renamed from: c */
    public static final void m126193c(C37245c viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-999565632);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            viewState.getPopUpDialog();
            AbstractC29125c.m88520b(Boolean.FALSE, null, null, "", AbstractC37817c.m121344e(-1857808479, c28655q, new C36538d(11, viewState, onEvent)), c28655q, 27648, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(viewState, onEvent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m126194d(C37245c.b bVar, C37245c c37245c, Function1 function1, boolean z4, Composer composer, int i13) {
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87155h(z4) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            c28655q.m87150e0(-1022970495);
            c28655q.m87173q(false);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m126195e(C37245c c37245c, Function1 function1, int i13, Composer composer, int i14) {
        m126193c(c37245c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
