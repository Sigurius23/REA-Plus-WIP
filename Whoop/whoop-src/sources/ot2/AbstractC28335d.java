package ot2;

import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.weeklyplan.customizeplan.domain.api.ToggleContent;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23726v1;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: ot2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "model", "Ly81/e;", "a", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ly81/e;", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28335d {

    /* JADX INFO: renamed from: ot2.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f114280w = new a();

        /* JADX INFO: renamed from: a */
        public final long m85889a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m85889a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC39332e m85888a(WeeklyPlanCustomizationScreenModel model) {
        InterfaceC39332e interfaceC39332eM69574a;
        AbstractC22676k.m65750j(model, "model");
        ToggleContent toggles = model.getToggles();
        List<GoalSettingsTileModel> topInitialToggles = toggles != null ? toggles.getTopInitialToggles() : null;
        List<GoalSettingsTileModel> list = C25271y.f99162w;
        if (topInitialToggles == null) {
            topInitialToggles = list;
        }
        List<GoalSettingsTileModel> list2 = topInitialToggles;
        ToggleContent toggles2 = model.getToggles();
        List<GoalSettingsTileModel> initialToggles = toggles2 != null ? toggles2.getInitialToggles() : null;
        if (initialToggles != null) {
            list = initialToggles;
        }
        GoalSettingsTileModel goalSettingsTileModel = (GoalSettingsTileModel) AbstractC25265s.m74100H0(AbstractC25265s.m74129g1(list2, list));
        return (goalSettingsTileModel == null || (interfaceC39332eM69574a = AbstractC23726v1.m69574a(goalSettingsTileModel.getStyle())) == null) ? p745y81.Function1.m125323a(a.f114280w) : interfaceC39332eM69574a;
    }
}
