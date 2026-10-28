package z51;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import wo1.C37450h;
import y71.C39277j;
import yo0.C39681c;

/* JADX INFO: renamed from: z51.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lz51/b;", "Lm91/f;", "Lz51/l;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lz51/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40091b implements InterfaceC25297f<C40101l> {

    /* JADX INFO: renamed from: a */
    public static final int f173011a = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m128524f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m128525g(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m128526h(C40091b c40091b, Modifier modifier, C40101l c40101l, Function1 function1, int i13, Composer composer, int i14) {
        c40091b.Compose(modifier, c40101l, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C40101l itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1313589400);
        if ((i13 & 48) == 0) {
            i14 = (c28655q2.m87157i(itemState) ? 32 : 16) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 145) != 144)) {
            boolean zM128624k = itemState.getShowOptimalStrain();
            boolean zM128625l = itemState.getShowStrainWeeklyPlanGoal();
            boolean zM128617c = itemState.getHasSleepPerformance();
            float fM128618e = itemState.getOptimalStrainPercent();
            C23465k c23465kM128619f = itemState.getOptimalStrainRange();
            float fM128620g = itemState.getRecoveryPercent();
            TextResource textResourceM128621h = itemState.getRecoveryPercentText();
            EnumC40100k enumC40100kM128622i = itemState.getRecoveryType();
            TextResource textResourceM128626m = itemState.getSleepPercentText();
            float fM128627n = itemState.getStrainScorePercent();
            boolean z4 = true;
            TextResource textResourceM128628o = itemState.getStrainScoreText();
            TextResource textResourceM128615a = itemState.getBonusTrendText();
            float fM128629p = itemState.getStrainWeeklyPlanGoalPercent();
            TextResource textResourceM128630q = itemState.getStrainWeeklyPlanGoalText();
            C40090a c40090aM128616b = itemState.getFirstCustomGaugeEntryViewState();
            C40090a c40090aM128623j = itemState.getSecondCustomGaugeEntryViewState();
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C39681c(19);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            if ((i14 & 896) != 256) {
                z4 = false;
            }
            Object objM87133R2 = c28655q2.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C37450h(onViewEvent, 22);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q = c28655q2;
            AbstractC40097h.m128556F(zM128624k, zM128625l, zM128617c, fM128618e, c23465kM128619f, fM128620g, textResourceM128621h, enumC40100kM128622i, textResourceM128626m, fM128627n, textResourceM128628o, fM128629p, textResourceM128630q, false, interfaceC4339a, (Function1) objM87133R2, textResourceM128615a, c40090aM128616b, c40090aM128623j, c28655q, 0, 24576, DfuBaseService.ERROR_REMOTE_MASK);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39277j(this, modifier, itemState, onViewEvent, i13, 10);
        }
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void Compose(C40101l c40101l, Function1 function1, Composer composer, int i13) {
        super.Compose(c40101l, function1, composer, i13);
    }
}
