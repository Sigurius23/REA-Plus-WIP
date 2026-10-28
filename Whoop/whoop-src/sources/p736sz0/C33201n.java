package p736sz0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import s51.C32209f;
import su1.C33018d;

/* JADX INFO: renamed from: sz0.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lsz0/n;", "Lm91/f;", "Lsz0/q;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lsz0/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33201n implements InterfaceC25297f<C33210q> {

    /* JADX INFO: renamed from: a */
    public static final int f138420a = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m105256d(Function1 function1, C33210q c33210q) {
        function1.invoke(c33210q.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m105257e(C33201n c33201n, Modifier modifier, C33210q c33210q, Function1 function1, int i13, Composer composer, int i14) {
        c33201n.Compose(modifier, c33210q, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C33210q itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1540206449);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            EnumC33179f1 statAlignment = itemState.getStatAlignment();
            TextResource stat = itemState.getStat();
            Integer statIcon = itemState.getStatIcon();
            TextResource statSuffix = itemState.getStatSuffix();
            EnumC33185h1 statSuffixType = itemState.getStatSuffixType();
            C33182g1 statTrend = itemState.getStatTrend();
            TextResource statTitle = itemState.getStatTitle();
            boolean isPressed = itemState.getIsPressed();
            long jMo134584toComposableColorWaAFU9c = itemState.getStatValueTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
            long jMo134584toComposableColorWaAFU9c2 = itemState.getStatTitleTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
            boolean z4 = false;
            boolean forcesStatAndSuffixLeftToRight = itemState.getForcesStatAndSuffixLeftToRight();
            if ((i14 & 896) == 256) {
                z4 = true;
            }
            boolean zM87157i = z4 | c28655q2.m87157i(itemState);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C32209f(onViewEvent, itemState, 12);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC33207p.m105301e(modifier, statAlignment, stat, statIcon, statSuffix, statSuffixType, statTrend, statTitle, isPressed, jMo134584toComposableColorWaAFU9c, jMo134584toComposableColorWaAFU9c2, null, null, null, forcesStatAndSuffixLeftToRight, (InterfaceC4339a) objM87133R, c28655q, i14 & 14, 0, 14336);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33018d(i13, 6, this, modifier, itemState, onViewEvent);
        }
    }
}
