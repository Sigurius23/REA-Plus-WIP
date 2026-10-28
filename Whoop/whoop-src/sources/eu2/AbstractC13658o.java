package eu2;

import a01.C0086f;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import d21.C11506d;
import java.util.List;
import kotlin.C2026r;
import kotlin.C2030t;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import o11.AbstractC27407m;
import o11.AbstractC27413s;
import p000.C22931l;
import p026b2.C2314t;
import p040c0.AbstractC3730c1;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p711j31.AbstractC21270a;
import p711j31.C21280k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25291c;
import p720m91.AbstractC25303l;
import p720m91.C25287a;
import r41.C30917a;
import r41.C30918b;
import r41.C30920d;
import r41.C30921e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: eu2.o */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Leu2/p;", "workoutGroup", "Lj31/k;", "reorderableListState", "", "itemIndex", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Leu2/p;Lj31/k;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13658o {
    /* JADX INFO: renamed from: f */
    public static final void m38516f(Modifier modifier, C13659p workoutGroup, C21280k c21280k, Integer num, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Integer num2;
        Modifier modifier3;
        C21280k c21280k2;
        AbstractC22676k.m65750j(workoutGroup, "workoutGroup");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1877433676);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(workoutGroup) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(c21280k) : c28655q.m87157i(c21280k) ? 256 : 128;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i18 = i15;
        boolean z4 = false;
        if (c28655q.m87135U(i18 & 1, (i18 & 8339) != 8338)) {
            Modifier modifierM59681a = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? modifierM59681a : modifier2;
            C21280k c21280k3 = i17 != 0 ? null : c21280k;
            Integer num3 = (i14 & 8) != 0 ? null : num;
            List listM74242b = AbstractC25291c.m74242b(workoutGroup.m38524c(), c28655q, 0);
            if (c21280k3 != null && workoutGroup.getCanBeReordered()) {
                modifierM59681a = AbstractC21270a.m59681a(modifierM59681a, c21280k3);
            }
            boolean isSuperset = workoutGroup.getIsSuperset();
            if (c21280k3 != null && workoutGroup.getCanBeReordered()) {
                z4 = true;
            }
            AbstractC27413s.m82778e(modifier4, isSuperset, z4, modifierM59681a, AbstractC37817c.m121344e(-1428719394, c28655q, new C2026r((Object) listM74242b, onViewEvent, (Object) workoutGroup, (Object) modifierM59681a, 8)), c28655q, (i18 & 14) | 24576, 0);
            modifier3 = modifier4;
            c21280k2 = c21280k3;
            num2 = num3;
        } else {
            c28655q.m87138X();
            num2 = num;
            modifier3 = modifier2;
            c21280k2 = c21280k;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f(modifier3, workoutGroup, c21280k2, num2, onViewEvent, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m38517g(List list, Function1 function1, C13659p c13659p, Modifier modifier, InterfaceC23013y interfaceC23013y, Composer composer, int i13) {
        InterfaceC23013y WorkoutGroupWrapper = interfaceC23013y;
        AbstractC22676k.m65750j(WorkoutGroupWrapper, "$this$WorkoutGroupWrapper");
        int i14 = (i13 & 6) == 0 ? i13 | (((C28655q) composer).m87153g(WorkoutGroupWrapper) ? 4 : 2) : i13;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C25287a c25287a = (C25287a) obj;
                AbstractC1090b.m3349d(WorkoutGroupWrapper, c25287a.getTransitionState(), null, AbstractC3730c1.f15251a, null, null, AbstractC37817c.m121344e(-417261794, c28655q, new C2030t(c25287a, function1, i15, c13659p, modifier)), c28655q, (i14 & 14) | 1572864, 26);
                WorkoutGroupWrapper = interfaceC23013y;
                i15 = i16;
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m38518h(C25287a c25287a, Function1 function1, int i13, C13659p c13659p, Modifier modifier, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i14) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC27407m.b bVar = (AbstractC27407m.b) c25287a.m74235d();
        C22931l c22931l = new C22931l(20, c13659p, modifier);
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87149e(i13);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C11506d(function1, i13, 2);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC25303l.m74291r(bVar, null, c22931l, (Function1) objM87133R, c28655q, AbstractC27407m.b.f110261y, 2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Modifier m38519i(C13659p c13659p, Modifier modifier, AbstractC27407m.b it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1608737233);
        boolean isSuperset = c13659p.getIsSuperset();
        Modifier modifierMo3471e = C2314t.f9131w;
        if (isSuperset) {
            modifierMo3471e = AbstractC1099a.m3398t(modifierMo3471e, 0.0f, ((float) 1.5d) * 8, 0.0f, 0.0f, 13);
        }
        if (!c13659p.getIsSuperset()) {
            modifierMo3471e = modifierMo3471e.mo3471e(modifier);
        }
        c28655q.m87173q(false);
        return modifierMo3471e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m38520j(Function1 function1, int i13, Object viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if (viewEvent instanceof C30918b) {
            C30918b c30918b = (C30918b) viewEvent;
            function1.invoke(new C13655l(c30918b.getNewRepsText(), i13, c30918b.getSetIndex()));
        } else if (viewEvent instanceof C30920d) {
            C30920d c30920d = (C30920d) viewEvent;
            function1.invoke(new C13656m(c30920d.getNewTimeText(), i13, c30920d.getSetIndex()));
        } else if (viewEvent instanceof C30921e) {
            C30921e c30921e = (C30921e) viewEvent;
            function1.invoke(new C13657n(c30921e.getNewWeightText(), i13, c30921e.getSetIndex()));
        } else if (viewEvent instanceof C30917a) {
            function1.invoke(new C13654k(i13, ((C30917a) viewEvent).getCurrentSetIndex()));
        } else {
            function1.invoke(viewEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m38521k(Modifier modifier, C13659p c13659p, C21280k c21280k, Integer num, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m38516f(modifier, c13659p, c21280k, num, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
