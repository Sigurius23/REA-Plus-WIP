package xs2;

import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.WeeklyPlanEditScreenModel;
import ge3.AbstractC15751g;
import j02.AbstractC21155m0;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25267u;
import o02.InterfaceC27353d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: xs2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lxs2/a;", "Lo02/d;", "<init>", "()V", "Lcom/whoop/navigation/NavigationScreenModel;", "navigationScreenModel", "Lj02/m0;", "c", "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;", "a", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38640a implements InterfaceC27353d {

    /* JADX INFO: renamed from: xs2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Lxs2/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "SLEEP_CONSISTENCY", "SLEEP_PERFORMANCE", "STEPS", "STRAIN", "STRENGTH_TRAINING_TIME", "ACTIVITIES", "BEHAVIORS", "UNKNOWN", "WEIGHT", "SLEEP_HOURS", "HR_ZONES_ONE_TO_THREE", "HR_ZONES_FOUR_TO_FIVE", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum a {
        SLEEP_CONSISTENCY,
        SLEEP_PERFORMANCE,
        STEPS,
        STRAIN,
        STRENGTH_TRAINING_TIME,
        ACTIVITIES,
        BEHAVIORS,
        UNKNOWN,
        WEIGHT,
        SLEEP_HOURS,
        HR_ZONES_ONE_TO_THREE,
        HR_ZONES_FOUR_TO_FIVE;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: b */
    public /* bridge */ InterfaceC27353d mo67682b(List<? extends InterfaceC27353d> list, Map<InterfaceC21461d, ? extends Function1> map) {
        return super.mo67682b(list, map);
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC21155m0 mo67681a(NavigationScreenModel navigationScreenModel) {
        List listM118959K;
        a aVar;
        AbstractC22676k.m65750j(navigationScreenModel, "navigationScreenModel");
        if (!(navigationScreenModel instanceof WeeklyPlanEditScreenModel)) {
            return AbstractC21155m0.j3.f80414b;
        }
        WeeklyPlanEditScreenModel weeklyPlanEditScreenModel = (WeeklyPlanEditScreenModel) navigationScreenModel;
        List<String> planEditScreens = weeklyPlanEditScreenModel.getPlanEditScreens();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(planEditScreens, 10));
        for (String str : planEditScreens) {
            a aVar2 = a.UNKNOWN;
            a[] aVarArrValues = a.values();
            int length = aVarArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    aVar = null;
                    break;
                }
                aVar = aVarArrValues[i13];
                if (AbstractC22676k.m65745e(aVar.name(), str)) {
                    break;
                }
                i13++;
            }
            if (aVar != null) {
                aVar2 = aVar;
            }
            arrayList.add(aVar2);
        }
        if (arrayList.contains(a.UNKNOWN) || arrayList.isEmpty()) {
            listM118959K = arrayList;
            listM118959K = AbstractC37056f.m118959K(a.STEPS, a.SLEEP_PERFORMANCE, a.STRAIN, a.ACTIVITIES, a.BEHAVIORS, a.WEIGHT, a.HR_ZONES_ONE_TO_THREE, a.HR_ZONES_FOUR_TO_FIVE, a.STRENGTH_TRAINING_TIME);
        }
        listM118959K = arrayList;
        List list = listM118959K;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a) it.next()).toString());
        }
        return new AbstractC21155m0.r5(arrayList2, weeklyPlanEditScreenModel.getAnalyticsSource());
    }
}
