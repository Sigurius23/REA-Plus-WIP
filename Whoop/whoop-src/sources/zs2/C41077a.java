package zs2;

import androidx.core.app.NotificationCompat;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.weeklyplan.customizeplan.domain.api.ActivityTarget;
import com.whoop.weeklyplan.customizeplan.domain.api.BottomButton;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.TipContent;
import com.whoop.weeklyplan.customizeplan.domain.api.ToggleContent;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import km0.C22580d;
import km0.C22581e;
import km0.C22583g;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import ot2.AbstractC28335d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p730qt2.C30596c0;
import p745y81.InterfaceC39332e;
import sw0.C33050g;
import sw0.C33052i;
import sw0.C33053j;
import tw0.C34215a;
import ws2.C37615g;
import x81.C38072d;
import ys2.AbstractC39758e;
import ys2.C39754a;
import ys2.C39755b;
import ys2.C39759f;
import zm1.C40893d;

/* JADX INFO: renamed from: zs2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lzs2/a;", "", "Ltw0/a;", "bottomSheetReducer", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Ltw0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Ljava/util/UUID;", "planId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "model", "Lsw0/g;", "bottomSheet", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "", "showLoading", "Lys2/e;", "b", "(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lsw0/g;Lws2/g;Z)Lys2/e;", "a", "Ltw0/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ljb1/a;", "c", "Ljb1/a;", "getReducer", "()Ljb1/a;", "reducer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41077a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34215a bottomSheetReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21535a reducer;

    public C41077a(C34215a bottomSheetReducer, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(bottomSheetReducer, "bottomSheetReducer");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.bottomSheetReducer = bottomSheetReducer;
        this.featureFlagChecker = featureFlagChecker;
        this.reducer = AbstractC21537c.m60554d(new C40893d(11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m133379c(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC39758e m133380b(UUID planId, WeeklyPlanCustomizationScreenModel model, C33050g bottomSheet, C37615g progress, boolean showLoading) {
        ArrayList arrayListM74129g1;
        List<GoalSettingsTileModel> topInitialToggles;
        int whoopIcon;
        ActivityTarget activityTarget;
        BottomButton bottomButton;
        C9598e action;
        BottomButton bottomButton2;
        String icon;
        EnumC16313m0 enumC16313m0;
        BottomButton bottomButton3;
        List<GoalSettingsTileModel> initialToggles;
        AbstractC22676k.m65750j(planId, "planId");
        AbstractC22676k.m65750j(model, "model");
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        AbstractC22676k.m65750j(progress, "progress");
        List<C33052i> listM108145b = this.bottomSheetReducer.m108145b(bottomSheet);
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled("healthspan-coaching-bottom-sheet-swipe");
        C25271y c25271y = C25271y.f99162w;
        List<List<C33052i>> listM108146c = zIsFeatureEnabled ? this.bottomSheetReducer.m108146c(bottomSheet) : c25271y;
        ToggleContent toggles = model.getToggles();
        if (toggles != null) {
            List<GoalSettingsTileModel> initialToggles2 = toggles.getInitialToggles();
            List<GoalSettingsTileModel> topInitialToggles2 = toggles.getTopInitialToggles();
            arrayListM74129g1 = AbstractC25265s.m74129g1(initialToggles2, topInitialToggles2 != null ? topInitialToggles2 : c25271y);
        } else {
            arrayListM74129g1 = null;
        }
        String string = planId.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        List<List<C33052i>> list = listM108146c;
        TargetGoalType targetGoalType = TargetGoalType.ACTIVITIES;
        List<GoalSettingsTileModel> list2 = c25271y;
        C39759f c39759f = new C39759f(AbstractC8693b.m21278l(model.getNavigationTitleDisplay()), AbstractC8693b.m21278l(model.getNavigationSubtitleDisplay()), AbstractC8693b.m21278l(model.getTitle()), AbstractC8693b.m21278l(model.getDescription()));
        ToggleContent toggles2 = model.getToggles();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(toggles2 != null ? toggles2.getTopHeadingDisplay() : null);
        C21535a c21535a = this.reducer;
        ToggleContent toggles3 = model.getToggles();
        if (toggles3 == null || (topInitialToggles = toggles3.getTopInitialToggles()) == null) {
            topInitialToggles = list2;
        }
        List<InterfaceC25312u> listM60540g = c21535a.m60540g(topInitialToggles);
        ToggleContent toggles4 = model.getToggles();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(toggles4 != null ? toggles4.getHeadingDisplay() : null);
        C21535a c21535a2 = this.reducer;
        ToggleContent toggles5 = model.getToggles();
        List<InterfaceC25312u> listM60540g2 = c21535a2.m60540g((toggles5 == null || (initialToggles = toggles5.getInitialToggles()) == null) ? list2 : initialToggles);
        ToggleContent toggles6 = model.getToggles();
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l((toggles6 == null || (bottomButton3 = toggles6.getBottomButton()) == null) ? null : bottomButton3.getTitleDisplay());
        ToggleContent toggles7 = model.getToggles();
        if (toggles7 == null || (bottomButton2 = toggles7.getBottomButton()) == null || (icon = bottomButton2.getIcon()) == null) {
            whoopIcon = EnumC16313m0.SETTINGS.toWhoopIcon();
        } else {
            EnumC16313m0 enumC16313m1 = EnumC16313m0.SETTINGS;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                int i14 = i13;
                if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                    break;
                }
                i13 = i14 + 1;
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            whoopIcon = enumC16313m1.toWhoopIcon();
        }
        int i15 = whoopIcon;
        ToggleContent toggles8 = model.getToggles();
        C39754a c39754a = new C39754a(textResourceM21278l3, (toggles8 == null || (bottomButton = toggles8.getBottomButton()) == null || (action = bottomButton.getAction()) == null) ? new C9598e(null, null, null, 7, null) : action, false, i15, 4, null);
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(model.getContinueButtonDisplay());
        String skipButtonDisplay = model.getSkipButtonDisplay();
        ArrayList arrayList = arrayListM74129g1;
        C39755b c39755b = new C39755b(textResourceM21278l4, true, skipButtonDisplay != null ? AbstractC8693b.m21278l(skipButtonDisplay) : null, showLoading);
        if (arrayList != null) {
            ArrayList<GoalSettingsTileModel> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((GoalSettingsTileModel) obj).getSelectedValue() != null) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            for (GoalSettingsTileModel goalSettingsTileModel : arrayList2) {
                if (goalSettingsTileModel == null) {
                    goalSettingsTileModel = null;
                }
                if (goalSettingsTileModel != null) {
                    String id4 = goalSettingsTileModel.getId();
                    Integer selectedValue = goalSettingsTileModel.getSelectedValue();
                    activityTarget = new ActivityTarget(id4, selectedValue != null ? selectedValue.intValue() : 0);
                } else {
                    activityTarget = new ActivityTarget("", 0);
                }
                arrayList3.add(activityTarget);
            }
            list2 = arrayList3;
        }
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(bottomSheet.getTitle());
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(bottomSheet.getSearchQuery());
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(bottomSheet.getSearchTitle());
        List<String> listM104629d = bottomSheet.m104629d();
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(listM104629d, 10));
        Iterator<T> it = listM104629d.iterator();
        while (it.hasNext()) {
            arrayList4.add(AbstractC8693b.m21278l((String) it.next()));
        }
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(bottomSheet.getCurrentCategory());
        InterfaceC39332e interfaceC39332eM85888a = AbstractC28335d.m85888a(model);
        List<C33052i> list3 = listM108145b;
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            C33052i c33052i = (C33052i) it3.next();
            TextResource title = c33052i.getTitle();
            List<C33053j> listM104651f = c33052i.m104651f();
            Iterator it4 = it3;
            ArrayList arrayList6 = arrayList4;
            ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(listM104651f, 10));
            Iterator it5 = listM104651f.iterator();
            while (it5.hasNext()) {
                C33053j c33053j = (C33053j) it5.next();
                String id5 = c33053j.getId();
                TextResource textResourceM21278l9 = AbstractC8693b.m21278l(c33053j.m104665r());
                boolean isSelected = c33053j.getIsSelected();
                AbstractC22403o.c cVar = new AbstractC22403o.c(c33053j.getIconUrl(), 0, 0, 0, 14, null);
                TextResource textResourceM21278l10 = AbstractC8693b.m21278l(c33053j.getSubtitle());
                Iterator it6 = it5;
                List<String> listM104656i = c33053j.m104656i();
                TargetGoalType targetGoalType2 = targetGoalType;
                ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(listM104656i, 10));
                Iterator<T> it7 = listM104656i.iterator();
                while (it7.hasNext()) {
                    arrayList8.add(AbstractC8693b.m21278l((String) it7.next()));
                }
                arrayList7.add(new C22580d(id5, textResourceM21278l9, isSelected, cVar, textResourceM21278l10, arrayList8, AbstractC8693b.m21278l(c33053j.getAvoidanceText()), false, null, null, 896, null));
                it5 = it6;
                targetGoalType = targetGoalType2;
            }
            arrayList5.add(new C22583g(title, arrayList7, null, 4, null));
            it3 = it4;
            arrayList4 = arrayList6;
        }
        ArrayList arrayList9 = arrayList4;
        TargetGoalType targetGoalType3 = targetGoalType;
        List<List<C33052i>> list4 = list;
        ArrayList arrayList10 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
        Iterator it8 = list4.iterator();
        while (it8.hasNext()) {
            List list5 = (List) it8.next();
            ArrayList arrayList11 = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
            Iterator it9 = list5.iterator();
            while (it9.hasNext()) {
                C33052i c33052i2 = (C33052i) it9.next();
                TextResource title2 = c33052i2.getTitle();
                List<C33053j> listM104651f2 = c33052i2.m104651f();
                Iterator it10 = it8;
                ArrayList arrayList12 = new ArrayList(AbstractC25267u.m74163i0(listM104651f2, 10));
                Iterator it11 = listM104651f2.iterator();
                while (it11.hasNext()) {
                    C33053j c33053j2 = (C33053j) it11.next();
                    String id6 = c33053j2.getId();
                    TextResource textResourceM21278l11 = AbstractC8693b.m21278l(c33053j2.m104665r());
                    boolean isSelected2 = c33053j2.getIsSelected();
                    AbstractC22403o.c cVar2 = new AbstractC22403o.c(c33053j2.getIconUrl(), 0, 0, 0, 14, null);
                    TextResource textResourceM21278l12 = AbstractC8693b.m21278l(c33053j2.getSubtitle());
                    Iterator it12 = it11;
                    List<String> listM104656i2 = c33053j2.m104656i();
                    ArrayList arrayList13 = arrayList5;
                    Iterator it13 = it9;
                    ArrayList arrayList14 = new ArrayList(AbstractC25267u.m74163i0(listM104656i2, 10));
                    Iterator<T> it14 = listM104656i2.iterator();
                    while (it14.hasNext()) {
                        arrayList14.add(AbstractC8693b.m21278l((String) it14.next()));
                    }
                    arrayList12.add(new C22580d(id6, textResourceM21278l11, isSelected2, cVar2, textResourceM21278l12, arrayList14, AbstractC8693b.m21278l(c33053j2.getAvoidanceText()), false, null, null, 896, null));
                    it11 = it12;
                    it9 = it13;
                    arrayList5 = arrayList13;
                }
                arrayList11.add(new C22583g(title2, arrayList12, null, 4, null));
                it8 = it10;
            }
            arrayList10.add(arrayList11);
        }
        C22581e c22581e = new C22581e(textResourceM21278l5, textResourceM21278l6, textResourceM21278l7, arrayList9, textResourceM21278l8, arrayList5, arrayList10, AbstractC8693b.m21278l(bottomSheet.getButtonTitle()), interfaceC39332eM85888a, null, null, null, null, 7680, null);
        TipContent tipContent = model.getTipContent();
        return new AbstractC39758e.i(string, targetGoalType3, c39759f, listM60540g, textResourceM21278l, textResourceM21278l2, listM60540g2, c39754a, c39755b, list2, c22581e, progress, tipContent != null ? new C30596c0(AbstractC8693b.m21278l(tipContent.getTitle()), Integer.valueOf(C38072d.f163053a.m121951d().getVarious().getAdvice()), AbstractC8693b.m21278l(tipContent.getTipsMarkdown())) : null);
    }
}
