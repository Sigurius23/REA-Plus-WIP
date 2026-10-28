package sw0;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.BottomSheetInfoModel;
import com.whoop.design.models.items.ConfirmationModalModel;
import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;
import com.whoop.design.models.items.DayOptions;
import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.design.models.items.GoalSettingsTileStyle;
import com.whoop.design.models.items.GroupedTogglesModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.TogglesModel;
import com.whoop.design.models.items.UnknownDesignModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pw0.AbstractC29584a;

/* JADX INFO: renamed from: sw0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a5\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "Lcom/whoop/design/models/DesignSystemModel;", "a", "(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;)Lcom/whoop/design/models/DesignSystemModel;", "f", "", "searchQuery", "", "isSelected", "", "idList", "Lsw0/g;", "b", "(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/lang/String;ZLjava/util/List;)Lsw0/g;", "d", "(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/lang/String;Ljava/util/List;)Lsw0/g;", "Lsw0/j;", "Lcom/whoop/design/models/items/GoalSettingsTileModel;", "e", "(Lsw0/j;)Lcom/whoop/design/models/items/GoalSettingsTileModel;", "custombottomsheet_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33051h {
    /* JADX INFO: renamed from: a */
    private static final DesignSystemModel m104640a(CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel) {
        DesignSystemModel customBehaviorsEmptyState = customizeBottomSheetSelectorModel.getCustomBehaviorsEmptyState();
        if (customBehaviorsEmptyState == null || (customBehaviorsEmptyState instanceof UnknownDesignModel)) {
            return null;
        }
        return customBehaviorsEmptyState;
    }

    /* JADX INFO: renamed from: b */
    public static final C33050g m104641b(CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel, String searchQuery, boolean z4, List<String> idList) {
        List list;
        AbstractC22676k.m65750j(customizeBottomSheetSelectorModel, "<this>");
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(idList, "idList");
        String title = customizeBottomSheetSelectorModel.getTitle();
        String searchTitle = customizeBottomSheetSelectorModel.getSearchTitle();
        List<String> categories = customizeBottomSheetSelectorModel.getCategories();
        String currentCategory = customizeBottomSheetSelectorModel.getCurrentCategory();
        List<GroupedTogglesModel> groupedTogglesModels = customizeBottomSheetSelectorModel.getGroupedTogglesModels();
        C25271y c25271y = C25271y.f99162w;
        if (groupedTogglesModels != null) {
            List<GroupedTogglesModel> list2 = groupedTogglesModels;
            int i13 = 10;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (GroupedTogglesModel groupedTogglesModel : list2) {
                TextResource textResourceM21278l = AbstractC8693b.m21278l(groupedTogglesModel.getTitle());
                int groupPriority = groupedTogglesModel.getGroupPriority();
                List<TogglesModel> toggles = groupedTogglesModel.getToggles();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(toggles, i13));
                for (TogglesModel togglesModel : toggles) {
                    String id4 = togglesModel.getId();
                    String title2 = togglesModel.getTitle();
                    boolean z13 = z4 || idList.contains(togglesModel.getId());
                    Integer selectedValue = togglesModel.getSelectedValue();
                    List<String> categories2 = togglesModel.getCategories();
                    String icon = togglesModel.getIcon();
                    String subtitle = togglesModel.getSubtitle();
                    String avoidTextDisplay = togglesModel.getAvoidTextDisplay();
                    ImpactModel trend = togglesModel.getTrend();
                    GoalSettingsTileStyle style = togglesModel.getStyle();
                    Boolean weeklyPlanGoal = togglesModel.getWeeklyPlanGoal();
                    boolean zBooleanValue = weeklyPlanGoal != null ? weeklyPlanGoal.booleanValue() : false;
                    DayOptions dayOptions = togglesModel.getDayOptions();
                    if (dayOptions == null) {
                        dayOptions = new DayOptions(c25271y, "");
                    }
                    DayOptions dayOptions2 = dayOptions;
                    Integer sortPriority = togglesModel.getSortPriority();
                    int iIntValue = sortPriority != null ? sortPriority.intValue() : 0;
                    BottomSheetInfoModel bottomSheetInfo = togglesModel.getBottomSheetInfo();
                    arrayList2.add(new C33053j(id4, title2, z13, iIntValue, selectedValue, categories2, icon, subtitle, avoidTextDisplay, trend, style, dayOptions2, bottomSheetInfo != null ? new C33044a(bottomSheetInfo.getBottomSheetTitle(), bottomSheetInfo.getImpactTitle(), bottomSheetInfo.getDescription(), bottomSheetInfo.getMetricsTagTitle(), bottomSheetInfo.getMetricTags()) : null, zBooleanValue, togglesModel.getTag(), AbstractC22676k.m65745e(togglesModel.getCustom(), Boolean.TRUE)));
                }
                arrayList.add(new C33052i(textResourceM21278l, groupPriority, arrayList2, null, 8, null));
                i13 = 10;
            }
            list = arrayList;
        } else {
            list = c25271y;
        }
        String buttonTitle = customizeBottomSheetSelectorModel.getButtonTitle();
        ConfirmationModalModel confirmationModal = customizeBottomSheetSelectorModel.getConfirmationModal();
        return new C33050g(title, searchQuery, searchTitle, categories, currentCategory, list, buttonTitle, null, null, confirmationModal != null ? new C33045b(confirmationModal.getTitle(), confirmationModal.getSubtitle(), confirmationModal.getPrimaryButtonText(), confirmationModal.getSecondaryButtonText()) : null, m104640a(customizeBottomSheetSelectorModel), m104645f(customizeBottomSheetSelectorModel), 384, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C33050g m104642c(CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel, String str, boolean z4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "";
        }
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        if ((i13 & 4) != 0) {
            list = C25271y.f99162w;
        }
        return m104641b(customizeBottomSheetSelectorModel, str, z4, list);
    }

    /* JADX INFO: renamed from: d */
    public static final C33050g m104643d(CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel, String searchQuery, List<String> idList) {
        AbstractC22676k.m65750j(customizeBottomSheetSelectorModel, "<this>");
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(idList, "idList");
        ArrayList arrayList = new ArrayList();
        ArrayList<TogglesModel> arrayList2 = new ArrayList();
        ArrayList<TogglesModel> arrayList3 = new ArrayList();
        List<TogglesModel> toggles = customizeBottomSheetSelectorModel.getToggles();
        if (toggles != null) {
            for (TogglesModel togglesModel : toggles) {
                if (idList.contains(togglesModel.getId()) || AbstractC22676k.m65745e(togglesModel.isToggled(), Boolean.TRUE)) {
                    arrayList2.add(togglesModel);
                } else {
                    arrayList3.add(togglesModel);
                }
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        C25271y c25271y = C25271y.f99162w;
        if (!zIsEmpty) {
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC29584a.f120741a, null, 2, null);
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            for (TogglesModel togglesModel2 : arrayList2) {
                String id4 = togglesModel2.getId();
                String title = togglesModel2.getTitle();
                Integer selectedValue = togglesModel2.getSelectedValue();
                List<String> categories = togglesModel2.getCategories();
                String icon = togglesModel2.getIcon();
                String subtitle = togglesModel2.getSubtitle();
                String avoidTextDisplay = togglesModel2.getAvoidTextDisplay();
                ImpactModel trend = togglesModel2.getTrend();
                GoalSettingsTileStyle style = togglesModel2.getStyle();
                DayOptions dayOptions = togglesModel2.getDayOptions();
                if (dayOptions == null) {
                    dayOptions = new DayOptions(c25271y, "");
                }
                DayOptions dayOptions2 = dayOptions;
                Integer sortPriority = togglesModel2.getSortPriority();
                int iIntValue = sortPriority != null ? sortPriority.intValue() : 0;
                BottomSheetInfoModel bottomSheetInfo = togglesModel2.getBottomSheetInfo();
                arrayList4.add(new C33053j(id4, title, true, iIntValue, selectedValue, categories, icon, subtitle, avoidTextDisplay, trend, style, dayOptions2, bottomSheetInfo != null ? new C33044a(bottomSheetInfo.getBottomSheetTitle(), bottomSheetInfo.getImpactTitle(), bottomSheetInfo.getDescription(), bottomSheetInfo.getMetricsTagTitle(), bottomSheetInfo.getMetricTags()) : null, false, togglesModel2.getTag(), AbstractC22676k.m65745e(togglesModel2.getCustom(), Boolean.TRUE), DfuBaseService.ERROR_REMOTE_MASK, null));
            }
            arrayList.add(new C33052i(c8688b, 0, arrayList4, null, 8, null));
        }
        TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC29584a.f120745e, null, 2, null);
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        for (TogglesModel togglesModel3 : arrayList3) {
            String id5 = togglesModel3.getId();
            String title2 = togglesModel3.getTitle();
            Integer selectedValue2 = togglesModel3.getSelectedValue();
            List<String> categories2 = togglesModel3.getCategories();
            String icon2 = togglesModel3.getIcon();
            String subtitle2 = togglesModel3.getSubtitle();
            String avoidTextDisplay2 = togglesModel3.getAvoidTextDisplay();
            ImpactModel trend2 = togglesModel3.getTrend();
            GoalSettingsTileStyle style2 = togglesModel3.getStyle();
            DayOptions dayOptions3 = togglesModel3.getDayOptions();
            if (dayOptions3 == null) {
                dayOptions3 = new DayOptions(c25271y, "");
            }
            DayOptions dayOptions4 = dayOptions3;
            Integer sortPriority2 = togglesModel3.getSortPriority();
            int iIntValue2 = sortPriority2 != null ? sortPriority2.intValue() : 0;
            BottomSheetInfoModel bottomSheetInfo2 = togglesModel3.getBottomSheetInfo();
            arrayList5.add(new C33053j(id5, title2, false, iIntValue2, selectedValue2, categories2, icon2, subtitle2, avoidTextDisplay2, trend2, style2, dayOptions4, bottomSheetInfo2 != null ? new C33044a(bottomSheetInfo2.getBottomSheetTitle(), bottomSheetInfo2.getImpactTitle(), bottomSheetInfo2.getDescription(), bottomSheetInfo2.getMetricsTagTitle(), bottomSheetInfo2.getMetricTags()) : null, false, togglesModel3.getTag(), AbstractC22676k.m65745e(togglesModel3.getCustom(), Boolean.TRUE), DfuBaseService.ERROR_REMOTE_MASK, null));
        }
        arrayList.add(new C33052i(c8688b2, 1, arrayList5, null, 8, null));
        return new C33050g(customizeBottomSheetSelectorModel.getTitle(), searchQuery, customizeBottomSheetSelectorModel.getSearchTitle(), customizeBottomSheetSelectorModel.getCategories(), customizeBottomSheetSelectorModel.getCurrentCategory(), arrayList, customizeBottomSheetSelectorModel.getButtonTitle(), null, null, null, m104640a(customizeBottomSheetSelectorModel), m104645f(customizeBottomSheetSelectorModel), 896, null);
    }

    /* JADX INFO: renamed from: e */
    public static final GoalSettingsTileModel m104644e(C33053j c33053j) {
        AbstractC22676k.m65750j(c33053j, "<this>");
        return new GoalSettingsTileModel(c33053j.m104665r(), c33053j.getSubtitle(), c33053j.getIconUrl(), c33053j.getTrend(), "", c33053j.getSelectedValue(), c33053j.getAvoidanceText(), Boolean.FALSE, c33053j.getId(), c33053j.getStyle(), c33053j.getDayOptions());
    }

    /* JADX INFO: renamed from: f */
    private static final DesignSystemModel m104645f(CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel) {
        DesignSystemModel customBehaviorsWidget = customizeBottomSheetSelectorModel.getCustomBehaviorsWidget();
        if (customBehaviorsWidget == null || (customBehaviorsWidget instanceof UnknownDesignModel)) {
            return null;
        }
        return customBehaviorsWidget;
    }
}
