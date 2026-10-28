package tp1;

import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: tp1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b8\u0010;R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b@\u0010?R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\b<\u0010?R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b2\u0010A\u001a\u0004\bB\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bC\u0010A\u001a\u0004\bD\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bC\u0010GR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bD\u0010H\u001a\u0004\bE\u0010IR\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\bJ\u0010-R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bJ\u00109\u001a\u0004\b*\u0010;R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b6\u0010K\u001a\u0004\b.\u0010LR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b,\u0010M\u001a\u0004\b0\u0010NR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b/\u0010O\u001a\u0004\b4\u0010P¨\u0006Q"}, m65681d2 = {"Ltp1/j;", "", "", "isHormonalInsightsOn", "isShowCycleOverlayOn", "Lcom/whoop/design/util/TextResource;", "navigationBarTitle", "", "Lm91/u;", "tiles", "Ltp1/c;", "hormonalInsightsModeBottomSheet", "hormonalInsightsContraceptionBottomSheet", "Ltp1/d;", "hormonalInsightsDisablingConfirmDialog", "hormonalInsightsModeConfirmDialog", "hormonalInsightsContraceptionConfirmDialog", "", "selectedMode", "selectedContraceptionType", "Ltp1/a;", "pregnancyDueDateDrawer", "Ltp1/q;", "previousPregnancies", "showUpsell", "disableFertilityInsightsSurveyDrawer", "Lcom/whoop/navigation/e;", "enableFertilityInsightsDestination", "Lcom/whoop/design/models/modal/AnyModal;", "enablePregnancyInsightsConfirmation", "Ltp1/f;", "goalsDrawer", "<init>", "(ZZLcom/whoop/design/util/TextResource;Ljava/util/List;Ltp1/c;Ltp1/c;Ltp1/d;Ltp1/d;Ltp1/d;Ljava/lang/String;Ljava/lang/String;Ltp1/a;Ltp1/q;ZLtp1/c;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Ltp1/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "q", "()Z", "b", "r", "c", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "d", "Ljava/util/List;", "p", "()Ljava/util/List;", "e", "Ltp1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ltp1/c;", "f", "g", "Ltp1/d;", "()Ltp1/d;", "i", "Ljava/lang/String;", "n", "k", "m", "l", "Ltp1/a;", "()Ltp1/a;", "Ltp1/q;", "()Ltp1/q;", "o", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lcom/whoop/design/models/modal/AnyModal;", "()Lcom/whoop/design/models/modal/AnyModal;", "Ltp1/f;", "()Ltp1/f;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34070j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isHormonalInsightsOn;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isShowCycleOverlayOn;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource navigationBarTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> tiles;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C34063c hormonalInsightsModeBottomSheet;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C34063c hormonalInsightsContraceptionBottomSheet;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C34064d hormonalInsightsDisablingConfirmDialog;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C34064d hormonalInsightsModeConfirmDialog;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C34064d hormonalInsightsContraceptionConfirmDialog;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String selectedMode;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String selectedContraceptionType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C34061a pregnancyDueDateDrawer;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C34077q previousPregnancies;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean showUpsell;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C34063c disableFertilityInsightsSurveyDrawer;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C9598e enableFertilityInsightsDestination;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final AnyModal enablePregnancyInsightsConfirmation;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C34066f goalsDrawer;

    /* JADX WARN: Multi-variable type inference failed */
    public C34070j(boolean z4, boolean z13, TextResource navigationBarTitle, List<? extends InterfaceC25312u> tiles, C34063c hormonalInsightsModeBottomSheet, C34063c c34063c, C34064d c34064d, C34064d c34064d2, C34064d c34064d3, String str, String str2, C34061a c34061a, C34077q c34077q, boolean z14, C34063c c34063c2, C9598e c9598e, AnyModal anyModal, C34066f c34066f) {
        AbstractC22676k.m65750j(navigationBarTitle, "navigationBarTitle");
        AbstractC22676k.m65750j(tiles, "tiles");
        AbstractC22676k.m65750j(hormonalInsightsModeBottomSheet, "hormonalInsightsModeBottomSheet");
        this.isHormonalInsightsOn = z4;
        this.isShowCycleOverlayOn = z13;
        this.navigationBarTitle = navigationBarTitle;
        this.tiles = tiles;
        this.hormonalInsightsModeBottomSheet = hormonalInsightsModeBottomSheet;
        this.hormonalInsightsContraceptionBottomSheet = c34063c;
        this.hormonalInsightsDisablingConfirmDialog = c34064d;
        this.hormonalInsightsModeConfirmDialog = c34064d2;
        this.hormonalInsightsContraceptionConfirmDialog = c34064d3;
        this.selectedMode = str;
        this.selectedContraceptionType = str2;
        this.pregnancyDueDateDrawer = c34061a;
        this.previousPregnancies = c34077q;
        this.showUpsell = z14;
        this.disableFertilityInsightsSurveyDrawer = c34063c2;
        this.enableFertilityInsightsDestination = c9598e;
        this.enablePregnancyInsightsConfirmation = anyModal;
        this.goalsDrawer = c34066f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C34063c getDisableFertilityInsightsSurveyDrawer() {
        return this.disableFertilityInsightsSurveyDrawer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getEnableFertilityInsightsDestination() {
        return this.enableFertilityInsightsDestination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AnyModal getEnablePregnancyInsightsConfirmation() {
        return this.enablePregnancyInsightsConfirmation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C34066f getGoalsDrawer() {
        return this.goalsDrawer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C34063c getHormonalInsightsContraceptionBottomSheet() {
        return this.hormonalInsightsContraceptionBottomSheet;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34070j)) {
            return false;
        }
        C34070j c34070j = (C34070j) other;
        return this.isHormonalInsightsOn == c34070j.isHormonalInsightsOn && this.isShowCycleOverlayOn == c34070j.isShowCycleOverlayOn && AbstractC22676k.m65745e(this.navigationBarTitle, c34070j.navigationBarTitle) && AbstractC22676k.m65745e(this.tiles, c34070j.tiles) && AbstractC22676k.m65745e(this.hormonalInsightsModeBottomSheet, c34070j.hormonalInsightsModeBottomSheet) && AbstractC22676k.m65745e(this.hormonalInsightsContraceptionBottomSheet, c34070j.hormonalInsightsContraceptionBottomSheet) && AbstractC22676k.m65745e(this.hormonalInsightsDisablingConfirmDialog, c34070j.hormonalInsightsDisablingConfirmDialog) && AbstractC22676k.m65745e(this.hormonalInsightsModeConfirmDialog, c34070j.hormonalInsightsModeConfirmDialog) && AbstractC22676k.m65745e(this.hormonalInsightsContraceptionConfirmDialog, c34070j.hormonalInsightsContraceptionConfirmDialog) && AbstractC22676k.m65745e(this.selectedMode, c34070j.selectedMode) && AbstractC22676k.m65745e(this.selectedContraceptionType, c34070j.selectedContraceptionType) && AbstractC22676k.m65745e(this.pregnancyDueDateDrawer, c34070j.pregnancyDueDateDrawer) && AbstractC22676k.m65745e(this.previousPregnancies, c34070j.previousPregnancies) && this.showUpsell == c34070j.showUpsell && AbstractC22676k.m65745e(this.disableFertilityInsightsSurveyDrawer, c34070j.disableFertilityInsightsSurveyDrawer) && AbstractC22676k.m65745e(this.enableFertilityInsightsDestination, c34070j.enableFertilityInsightsDestination) && AbstractC22676k.m65745e(this.enablePregnancyInsightsConfirmation, c34070j.enablePregnancyInsightsConfirmation) && AbstractC22676k.m65745e(this.goalsDrawer, c34070j.goalsDrawer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C34064d getHormonalInsightsContraceptionConfirmDialog() {
        return this.hormonalInsightsContraceptionConfirmDialog;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C34064d getHormonalInsightsDisablingConfirmDialog() {
        return this.hormonalInsightsDisablingConfirmDialog;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C34063c getHormonalInsightsModeBottomSheet() {
        return this.hormonalInsightsModeBottomSheet;
    }

    public int hashCode() {
        int iHashCode = (this.hormonalInsightsModeBottomSheet.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC2875y.m8289b(Boolean.hashCode(this.isHormonalInsightsOn) * 31, 31, this.isShowCycleOverlayOn), this.navigationBarTitle, 31), 31, this.tiles)) * 31;
        C34063c c34063c = this.hormonalInsightsContraceptionBottomSheet;
        int iHashCode2 = (iHashCode + (c34063c == null ? 0 : c34063c.hashCode())) * 31;
        C34064d c34064d = this.hormonalInsightsDisablingConfirmDialog;
        int iHashCode3 = (iHashCode2 + (c34064d == null ? 0 : c34064d.hashCode())) * 31;
        C34064d c34064d2 = this.hormonalInsightsModeConfirmDialog;
        int iHashCode4 = (iHashCode3 + (c34064d2 == null ? 0 : c34064d2.hashCode())) * 31;
        C34064d c34064d3 = this.hormonalInsightsContraceptionConfirmDialog;
        int iHashCode5 = (iHashCode4 + (c34064d3 == null ? 0 : c34064d3.hashCode())) * 31;
        String str = this.selectedMode;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedContraceptionType;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C34061a c34061a = this.pregnancyDueDateDrawer;
        int iHashCode8 = (iHashCode7 + (c34061a == null ? 0 : c34061a.hashCode())) * 31;
        C34077q c34077q = this.previousPregnancies;
        int iM8289b = AbstractC2875y.m8289b((iHashCode8 + (c34077q == null ? 0 : c34077q.hashCode())) * 31, 31, this.showUpsell);
        C34063c c34063c2 = this.disableFertilityInsightsSurveyDrawer;
        int iHashCode9 = (iM8289b + (c34063c2 == null ? 0 : c34063c2.hashCode())) * 31;
        C9598e c9598e = this.enableFertilityInsightsDestination;
        int iHashCode10 = (iHashCode9 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        AnyModal anyModal = this.enablePregnancyInsightsConfirmation;
        int iHashCode11 = (iHashCode10 + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        C34066f c34066f = this.goalsDrawer;
        return iHashCode11 + (c34066f != null ? c34066f.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C34064d getHormonalInsightsModeConfirmDialog() {
        return this.hormonalInsightsModeConfirmDialog;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getNavigationBarTitle() {
        return this.navigationBarTitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C34061a getPregnancyDueDateDrawer() {
        return this.pregnancyDueDateDrawer;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C34077q getPreviousPregnancies() {
        return this.previousPregnancies;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSelectedContraceptionType() {
        return this.selectedContraceptionType;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getSelectedMode() {
        return this.selectedMode;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getShowUpsell() {
        return this.showUpsell;
    }

    /* JADX INFO: renamed from: p */
    public final List<InterfaceC25312u> m107703p() {
        return this.tiles;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsHormonalInsightsOn() {
        return this.isHormonalInsightsOn;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsShowCycleOverlayOn() {
        return this.isShowCycleOverlayOn;
    }

    public String toString() {
        boolean z4 = this.isHormonalInsightsOn;
        boolean z13 = this.isShowCycleOverlayOn;
        TextResource textResource = this.navigationBarTitle;
        List<InterfaceC25312u> list = this.tiles;
        C34063c c34063c = this.hormonalInsightsModeBottomSheet;
        C34063c c34063c2 = this.hormonalInsightsContraceptionBottomSheet;
        C34064d c34064d = this.hormonalInsightsDisablingConfirmDialog;
        C34064d c34064d2 = this.hormonalInsightsModeConfirmDialog;
        C34064d c34064d3 = this.hormonalInsightsContraceptionConfirmDialog;
        String str = this.selectedMode;
        String str2 = this.selectedContraceptionType;
        C34061a c34061a = this.pregnancyDueDateDrawer;
        C34077q c34077q = this.previousPregnancies;
        boolean z14 = this.showUpsell;
        C34063c c34063c3 = this.disableFertilityInsightsSurveyDrawer;
        C9598e c9598e = this.enableFertilityInsightsDestination;
        AnyModal anyModal = this.enablePregnancyInsightsConfirmation;
        C34066f c34066f = this.goalsDrawer;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("HormonalInsightsSettingsState(isHormonalInsightsOn=", ", isShowCycleOverlayOn=", ", navigationBarTitle=", z4, z13);
        AbstractC21702c.m61143n(textResource, ", tiles=", ", hormonalInsightsModeBottomSheet=", sbM32002u, list);
        sbM32002u.append(c34063c);
        sbM32002u.append(", hormonalInsightsContraceptionBottomSheet=");
        sbM32002u.append(c34063c2);
        sbM32002u.append(", hormonalInsightsDisablingConfirmDialog=");
        sbM32002u.append(c34064d);
        sbM32002u.append(", hormonalInsightsModeConfirmDialog=");
        sbM32002u.append(c34064d2);
        sbM32002u.append(", hormonalInsightsContraceptionConfirmDialog=");
        sbM32002u.append(c34064d3);
        sbM32002u.append(", selectedMode=");
        sbM32002u.append(str);
        sbM32002u.append(", selectedContraceptionType=");
        sbM32002u.append(str2);
        sbM32002u.append(", pregnancyDueDateDrawer=");
        sbM32002u.append(c34061a);
        sbM32002u.append(", previousPregnancies=");
        sbM32002u.append(c34077q);
        sbM32002u.append(", showUpsell=");
        sbM32002u.append(z14);
        sbM32002u.append(", disableFertilityInsightsSurveyDrawer=");
        sbM32002u.append(c34063c3);
        sbM32002u.append(", enableFertilityInsightsDestination=");
        sbM32002u.append(c9598e);
        sbM32002u.append(", enablePregnancyInsightsConfirmation=");
        sbM32002u.append(anyModal);
        sbM32002u.append(", goalsDrawer=");
        sbM32002u.append(c34066f);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }
}
