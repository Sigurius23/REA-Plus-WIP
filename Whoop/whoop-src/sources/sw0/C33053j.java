package sw0;

import com.whoop.design.models.items.DayOptions;
import com.whoop.design.models.items.GoalSettingsTileStyle;
import com.whoop.design.models.items.GoalSettingsTileTagModel;
import com.whoop.design.models.items.ImpactModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wr2.InterfaceC37576d;
import yb3.C39412p;

/* JADX INFO: renamed from: sw0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJÄ\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\b1\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\b=\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b:\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b;\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b)\u0010E\u001a\u0004\b>\u0010FR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b4\u0010G\u001a\u0004\b<\u0010HR\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\bI\u0010/R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bC\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\bM\u0010/R\u0014\u0010N\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010 ¨\u0006O"}, m65681d2 = {"Lsw0/j;", "Lwr2/d;", "", "id", "title", "", "isSelected", "", "sortPriority", "selectedValue", "", "categories", "iconUrl", "subtitle", "avoidanceText", "Lcom/whoop/design/models/items/ImpactModel;", "trend", "Lcom/whoop/design/models/items/GoalSettingsTileStyle;", "style", "Lcom/whoop/design/models/items/DayOptions;", "dayOptions", "Lsw0/a;", "bottomSheetInfo", "weeklyPlanGoal", "Lcom/whoop/design/models/items/GoalSettingsTileTagModel;", "tag", "isCustom", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Lsw0/a;ZLcom/whoop/design/models/items/GoalSettingsTileTagModel;Z)V", "d", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Lsw0/a;ZLcom/whoop/design/models/items/GoalSettingsTileTagModel;Z)Lsw0/j;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "l", "b", "r", "c", "Z", "v", "()Z", "I", "n", "e", "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", "f", "Ljava/util/List;", "i", "()Ljava/util/List;", "g", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "p", "j", "Lcom/whoop/design/models/items/ImpactModel;", "s", "()Lcom/whoop/design/models/items/ImpactModel;", "Lcom/whoop/design/models/items/GoalSettingsTileStyle;", "o", "()Lcom/whoop/design/models/items/GoalSettingsTileStyle;", "Lcom/whoop/design/models/items/DayOptions;", "()Lcom/whoop/design/models/items/DayOptions;", "Lsw0/a;", "()Lsw0/a;", "t", "Lcom/whoop/design/models/items/GoalSettingsTileTagModel;", "q", "()Lcom/whoop/design/models/items/GoalSettingsTileTagModel;", "u", "userFacingText", "custombottomsheet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33053j implements InterfaceC37576d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int sortPriority;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Integer selectedValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<String> categories;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String iconUrl;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String avoidanceText;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final ImpactModel trend;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final GoalSettingsTileStyle style;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final DayOptions dayOptions;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C33044a bottomSheetInfo;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean weeklyPlanGoal;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final GoalSettingsTileTagModel tag;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final boolean isCustom;

    public C33053j(String id4, String title, boolean z4, int i13, Integer num, List<String> categories, String str, String str2, String str3, ImpactModel impactModel, GoalSettingsTileStyle style, DayOptions dayOptions, C33044a c33044a, boolean z13, GoalSettingsTileTagModel goalSettingsTileTagModel, boolean z14) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(categories, "categories");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(dayOptions, "dayOptions");
        this.id = id4;
        this.title = title;
        this.isSelected = z4;
        this.sortPriority = i13;
        this.selectedValue = num;
        this.categories = categories;
        this.iconUrl = str;
        this.subtitle = str2;
        this.avoidanceText = str3;
        this.trend = impactModel;
        this.style = style;
        this.dayOptions = dayOptions;
        this.bottomSheetInfo = c33044a;
        this.weeklyPlanGoal = z13;
        this.tag = goalSettingsTileTagModel;
        this.isCustom = z14;
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: a */
    public /* bridge */ C39412p getSearchQueryDelimiter() {
        return super.getSearchQueryDelimiter();
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: b */
    public /* bridge */ List<String> mo30154b() {
        return super.mo30154b();
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: c */
    public /* bridge */ Iterable<String> mo30155c() {
        return super.mo30155c();
    }

    /* JADX INFO: renamed from: d */
    public final C33053j m104653d(String id4, String title, boolean isSelected, int sortPriority, Integer selectedValue, List<String> categories, String iconUrl, String subtitle, String avoidanceText, ImpactModel trend, GoalSettingsTileStyle style, DayOptions dayOptions, C33044a bottomSheetInfo, boolean weeklyPlanGoal, GoalSettingsTileTagModel tag, boolean isCustom) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(categories, "categories");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(dayOptions, "dayOptions");
        return new C33053j(id4, title, isSelected, sortPriority, selectedValue, categories, iconUrl, subtitle, avoidanceText, trend, style, dayOptions, bottomSheetInfo, weeklyPlanGoal, tag, isCustom);
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUserFacingText() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33053j)) {
            return false;
        }
        C33053j c33053j = (C33053j) other;
        return AbstractC22676k.m65745e(this.id, c33053j.id) && AbstractC22676k.m65745e(this.title, c33053j.title) && this.isSelected == c33053j.isSelected && this.sortPriority == c33053j.sortPriority && AbstractC22676k.m65745e(this.selectedValue, c33053j.selectedValue) && AbstractC22676k.m65745e(this.categories, c33053j.categories) && AbstractC22676k.m65745e(this.iconUrl, c33053j.iconUrl) && AbstractC22676k.m65745e(this.subtitle, c33053j.subtitle) && AbstractC22676k.m65745e(this.avoidanceText, c33053j.avoidanceText) && AbstractC22676k.m65745e(this.trend, c33053j.trend) && this.style == c33053j.style && AbstractC22676k.m65745e(this.dayOptions, c33053j.dayOptions) && AbstractC22676k.m65745e(this.bottomSheetInfo, c33053j.bottomSheetInfo) && this.weeklyPlanGoal == c33053j.weeklyPlanGoal && AbstractC22676k.m65745e(this.tag, c33053j.tag) && this.isCustom == c33053j.isCustom;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getAvoidanceText() {
        return this.avoidanceText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C33044a getBottomSheetInfo() {
        return this.bottomSheetInfo;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.sortPriority, AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title), 31, this.isSelected), 31);
        Integer num = this.selectedValue;
        int iM31983b = AbstractC11895b.m31983b((iM30448b + (num == null ? 0 : num.hashCode())) * 31, 31, this.categories);
        String str = this.iconUrl;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avoidanceText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImpactModel impactModel = this.trend;
        int iHashCode4 = (this.dayOptions.hashCode() + ((this.style.hashCode() + ((iHashCode3 + (impactModel == null ? 0 : impactModel.hashCode())) * 31)) * 31)) * 31;
        C33044a c33044a = this.bottomSheetInfo;
        int iM8289b = AbstractC2875y.m8289b((iHashCode4 + (c33044a == null ? 0 : c33044a.hashCode())) * 31, 31, this.weeklyPlanGoal);
        GoalSettingsTileTagModel goalSettingsTileTagModel = this.tag;
        return Boolean.hashCode(this.isCustom) + ((iM8289b + (goalSettingsTileTagModel != null ? goalSettingsTileTagModel.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final List<String> m104656i() {
        return this.categories;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final DayOptions getDayOptions() {
        return this.dayOptions;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getSelectedValue() {
        return this.selectedValue;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getSortPriority() {
        return this.sortPriority;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final GoalSettingsTileStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final GoalSettingsTileTagModel getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: r */
    public final String m104665r() {
        return this.title;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final ImpactModel getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getWeeklyPlanGoal() {
        return this.weeklyPlanGoal;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        boolean z4 = this.isSelected;
        int i13 = this.sortPriority;
        Integer num = this.selectedValue;
        List<String> list = this.categories;
        String str3 = this.iconUrl;
        String str4 = this.subtitle;
        String str5 = this.avoidanceText;
        ImpactModel impactModel = this.trend;
        GoalSettingsTileStyle goalSettingsTileStyle = this.style;
        DayOptions dayOptions = this.dayOptions;
        C33044a c33044a = this.bottomSheetInfo;
        boolean z13 = this.weeklyPlanGoal;
        GoalSettingsTileTagModel goalSettingsTileTagModel = this.tag;
        boolean z14 = this.isCustom;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TogglesDomainState(id=", str, ", title=", str2, ", isSelected=");
        AbstractC30802r.m94769r(i13, ", sortPriority=", ", selectedValue=", sbM32001t, z4);
        sbM32001t.append(num);
        sbM32001t.append(", categories=");
        sbM32001t.append(list);
        sbM32001t.append(", iconUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtitle=", str4, ", avoidanceText=");
        sbM32001t.append(str5);
        sbM32001t.append(", trend=");
        sbM32001t.append(impactModel);
        sbM32001t.append(", style=");
        sbM32001t.append(goalSettingsTileStyle);
        sbM32001t.append(", dayOptions=");
        sbM32001t.append(dayOptions);
        sbM32001t.append(", bottomSheetInfo=");
        sbM32001t.append(c33044a);
        sbM32001t.append(", weeklyPlanGoal=");
        sbM32001t.append(z13);
        sbM32001t.append(", tag=");
        sbM32001t.append(goalSettingsTileTagModel);
        sbM32001t.append(", isCustom=");
        sbM32001t.append(z14);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsCustom() {
        return this.isCustom;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public /* synthetic */ C33053j(String str, String str2, boolean z4, int i13, Integer num, List list, String str3, String str4, String str5, ImpactModel impactModel, GoalSettingsTileStyle goalSettingsTileStyle, DayOptions dayOptions, C33044a c33044a, boolean z13, GoalSettingsTileTagModel goalSettingsTileTagModel, boolean z14, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z4, i13, (i14 & 16) != 0 ? null : num, list, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? null : str4, (i14 & 256) != 0 ? null : str5, (i14 & 512) != 0 ? null : impactModel, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? GoalSettingsTileStyle.STRAIN_ACTIVITY : goalSettingsTileStyle, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? new DayOptions(C25271y.f99162w, "") : dayOptions, (i14 & 4096) != 0 ? null : c33044a, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z13, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : goalSettingsTileTagModel, (i14 & 32768) != 0 ? false : z14);
    }
}
