package p716lb1;

import com.whoop.data.remote.domain.dto.CircularProgressStyle;
import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator;
import com.whoop.data.remote.domain.response.journal.CurrentProgressPercentage;
import com.whoop.data.remote.domain.response.journal.CurrentProgressSteps;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.BottomSheetInfoModel;
import com.whoop.design.models.items.CheckmarkStyle;
import com.whoop.design.models.items.GoalTileModel;
import com.whoop.design.models.items.GoalTrackerIndicatorModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import f41.C14063a;
import hy0.C17750h1;
import hy0.C17791u;
import hy0.EnumC17806z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import p01.C28582b;
import p01.EnumC28588h;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import w11.C36696c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lb1.x1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "goalTileMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23738x1 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94052a = Function1.m68251a(new C23714t1(1));

    /* JADX INFO: renamed from: lb1.x1$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f94053w = new a();

        /* JADX INFO: renamed from: a */
        public final long m69649a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69649a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.x1$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f94054w = new b();

        /* JADX INFO: renamed from: a */
        public final long m69650a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69650a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.x1$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94055w;

        public c(Function1 function1) {
            this.f94055w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94055w.invoke((GoalTileModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69646c() {
        return f94052a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69647d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(GoalTileModel.class), new c(new C23732w1(designModelMapper, 0)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C36696c m69648e(C23749z0 c23749z0, GoalTileModel model) {
        C14063a c14063a;
        C28582b c28582b;
        C28582b c28582b2;
        EnumC17806z enumC17806z;
        AbstractC22676k.m65750j(model, "model");
        boolean z4 = model.getCheckmarkStyle() == CheckmarkStyle.ENABLED;
        TextResource titleDisplay = model.getTitleDisplay();
        TextResource progressDisplay = model.getProgressDisplay();
        TextResource imageUrl = model.getImageUrl();
        AbstractC22403o.c cVar = imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null;
        List<GoalTrackerIndicatorModel> days = model.getDays();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(days, 10));
        int i13 = 0;
        for (Object obj : days) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            GoalTrackerIndicatorModel goalTrackerIndicatorModel = (GoalTrackerIndicatorModel) obj;
            String strValueOf = String.valueOf(i13);
            TextResource titleDisplay2 = goalTrackerIndicatorModel.getTitleDisplay();
            String strName = goalTrackerIndicatorModel.getStyle().name();
            EnumC17806z enumC17806z2 = EnumC17806z.NO_DATA;
            EnumC17806z[] enumC17806zArrValues = EnumC17806z.values();
            int length = enumC17806zArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    enumC17806z = null;
                    break;
                }
                enumC17806z = enumC17806zArrValues[i15];
                if (AbstractC22676k.m65745e(enumC17806z.name(), strName)) {
                    break;
                }
                i15++;
            }
            EnumC17806z enumC17806z3 = enumC17806z == null ? enumC17806z2 : enumC17806z;
            C9598e destination = goalTrackerIndicatorModel.getDestination();
            if (destination == null) {
                destination = new C9598e(null, null, null, 7, null);
            }
            arrayList.add(new C17791u(strValueOf, titleDisplay2, enumC17806z3, destination));
            i13 = i14;
        }
        int goalDays = model.getGoalDays();
        C9598e destination2 = model.getDestination();
        BottomSheetInfoModel bottomInfoSheet = model.getBottomInfoSheet();
        if (bottomInfoSheet != null) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(bottomInfoSheet.getBottomSheetTitle());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(bottomInfoSheet.getImpactTitle());
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(bottomInfoSheet.getDescription());
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(bottomInfoSheet.getMetricsTagTitle());
            List<String> metricTags = bottomInfoSheet.getMetricTags();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(metricTags, 10));
            Iterator<T> it = metricTags.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C17750h1(AbstractC8693b.m21278l((String) it.next()), null, p745y81.Function1.m125323a(a.f94053w), null, p745y81.Function1.m125323a(b.f94054w), null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194282, null));
            }
            c14063a = new C14063a(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, arrayList2);
        } else {
            c14063a = null;
        }
        CircularProgressIndicator circularProgressIndicator = model.getCircularProgressIndicator();
        if (circularProgressIndicator != null) {
            CurrentProgressSteps currentProgressSteps = circularProgressIndicator.getCurrentProgressSteps();
            if (currentProgressSteps != null) {
                c28582b2 = new C28582b(currentProgressSteps.getTotalSteps(), currentProgressSteps.getCurrentStep(), 0.0f, currentProgressSteps.getTextDisplay(), null, null, Boolean.valueOf(currentProgressSteps.getStyle() == CircularProgressStyle.WEEKLY_PLAN_COMPLETE), null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, EnumC28588h.STEPS, null, 786356, null);
            } else {
                CurrentProgressPercentage currentProgressPercentage = circularProgressIndicator.getCurrentProgressPercentage();
                c28582b2 = currentProgressPercentage != null ? new C28582b(0, 0, (float) currentProgressPercentage.getPercentage(), currentProgressPercentage.getTextDisplay(), null, null, Boolean.valueOf(currentProgressPercentage.getStyle() == CircularProgressStyle.WEEKLY_PLAN_COMPLETE), null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, EnumC28588h.PERCENTAGE, null, 786355, null) : null;
            }
            c28582b = c28582b2;
        } else {
            c28582b = null;
        }
        return new C36696c(z4, titleDisplay, progressDisplay, Integer.valueOf(goalDays), cVar, arrayList, destination2, c14063a, c28582b, model.getId());
    }
}
