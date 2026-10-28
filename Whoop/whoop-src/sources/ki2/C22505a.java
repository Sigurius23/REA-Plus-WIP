package ki2;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.strava.domain.models.ActivitiesItemResponse;
import com.whoop.strava.domain.models.SelectableActivityResponse;
import com.whoop.strava.domain.models.ShareableGraphicResponse;
import d13.AbstractC11478a;
import gi2.AbstractC15898d;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ji2.C21722a;
import ji2.C21723b;
import ji2.C21724c;
import ji2.C21725d;
import ji2.C21726e;
import ji2.C21727f;
import ji2.C21728g;
import ji2.C21729h;
import ji2.C21733l;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import y71.C39274g;

/* JADX INFO: renamed from: ki2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lki2/a;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lgi2/d;", "domainResult", "Lji2/l;", "a", "(Lgi2/d;)Lji2/l;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22505a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C22505a(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v36, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public final C21733l m65008a(AbstractC15898d domainResult) {
        ?? arrayList;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult.equals(AbstractC15898d.h.f60090a) || domainResult.equals(AbstractC15898d.d.f60086a)) {
            return new C21733l(true, false, null, null, null, null, null, 126, null);
        }
        if (domainResult instanceof AbstractC15898d.c) {
            return new C21733l(false, true, null, null, null, null, null, 125, null);
        }
        if (!(domainResult instanceof AbstractC15898d.g)) {
            if (domainResult instanceof AbstractC15898d.a) {
                return new C21733l(false, false, null, null, null, null, new C21729h(AbstractC8693b.m21278l(((AbstractC15898d.a) domainResult).getDefaultResponse().getSuccessMessageDisplay())), 63, null);
            }
            if (domainResult instanceof AbstractC15898d.f) {
                AbstractC15898d.f fVar = (AbstractC15898d.f) domainResult;
                return new C21733l(false, false, null, null, new C21726e(fVar.getSelectedActivitiesData().getTitleDisplay(), fVar.getSelectedActivitiesData().getSearchQuery(), fVar.getSelectedActivitiesData().getDisplayKeyboard(), fVar.getSelectedActivitiesData().getSearchPlaceHolder(), fVar.getSelectedActivitiesData().getDescription(), fVar.getSelectedActivitiesData().getAllTextDisplay(), fVar.getSelectedActivitiesData().getAllActivities(), fVar.getSelectedActivitiesData().getPopularTitle(), fVar.getSelectedActivitiesData().getOtherTitle(), fVar.getSelectedActivitiesData().m49069c(), fVar.getSelectedActivitiesData().getSaveSelectionDisplay(), fVar.getSelectedActivitiesData().getTemplateName(), fVar.getSelectedActivitiesData().getAutomaticallyImportEnabled()), null, null, 111, null);
            }
            if (domainResult instanceof AbstractC15898d.b) {
                AbstractC15898d.b bVar = (AbstractC15898d.b) domainResult;
                return new C21733l(false, false, null, null, null, new C21723b(bVar.getDisconnectConfirmationData().getTitle(), bVar.getDisconnectConfirmationData().getDescription(), bVar.getDisconnectConfirmationData().getPrimaryButtonText(), bVar.getDisconnectConfirmationData().getSecondaryButtonText()), null, 95, null);
            }
            if (!(domainResult instanceof AbstractC15898d.e) && !(domainResult instanceof AbstractC15898d.j) && !(domainResult instanceof AbstractC15898d.i)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("Invalid DomainResult: " + domainResult);
        }
        AbstractC15898d.g gVar = (AbstractC15898d.g) domainResult;
        C39274g c39274g = null;
        if (AbstractC22676k.m65745e(gVar.getSettingsResponse().getState(), "unconnected")) {
            AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(gVar.getSettingsResponse().getBackgroundImageUrl());
            String iconUrl = gVar.getSettingsResponse().getIconUrl();
            TextResource textResourceM21278l = AbstractC8693b.m21278l(gVar.getSettingsResponse().getTitleDisplay());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getDescriptionDisplay());
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getButtonDisplay());
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getLearnMoreDisplay());
            String learnMoreUrl = gVar.getSettingsResponse().getLearnMoreUrl();
            AbstractC22676k.m65747g(learnMoreUrl);
            String learnMoreIcon = gVar.getSettingsResponse().getLearnMoreIcon();
            AbstractC22676k.m65747g(learnMoreIcon);
            C39274g c39274g2 = new C39274g(EnumC16313m0.valueOf(learnMoreIcon).toWhoopIcon(), null, 2, null);
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getPrivacyPolicyDisplay());
            String privacyPolicyUrl = gVar.getSettingsResponse().getPrivacyPolicyUrl();
            AbstractC22676k.m65747g(privacyPolicyUrl);
            String webAuthorizationUrl = gVar.getSettingsResponse().getWebAuthorizationUrl();
            AbstractC22676k.m65747g(webAuthorizationUrl);
            String appAuthorizationUrl = gVar.getSettingsResponse().getAppAuthorizationUrl();
            AbstractC22676k.m65747g(appAuthorizationUrl);
            return new C21733l(false, false, new C21728g(abstractC22403oM64503l, iconUrl, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, learnMoreUrl, c39274g2, textResourceM21278l5, privacyPolicyUrl, webAuthorizationUrl, appAuthorizationUrl), null, null, null, null, 123, null);
        }
        AbstractC22403o abstractC22403oM64503l2 = AbstractC22404p.m64503l(gVar.getSettingsResponse().getBackgroundImageUrl());
        String iconUrl2 = gVar.getSettingsResponse().getIconUrl();
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getTitleDisplay());
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getDescriptionDisplay());
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getButtonDisplay());
        String statusIcon = gVar.getSettingsResponse().getStatusIcon();
        AbstractC22676k.m65747g(statusIcon);
        C39274g c39274g3 = new C39274g(EnumC16313m0.valueOf(statusIcon).toWhoopIcon(), null, 2, null);
        TextResource textResourceM21278l9 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getStatusDisplay());
        TextResource textResourceM21278l10 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getAutomaticPostDisplay());
        Boolean automaticallyPostEnabled = gVar.getSettingsResponse().getAutomaticallyPostEnabled();
        AbstractC22676k.m65747g(automaticallyPostEnabled);
        boolean zBooleanValue = automaticallyPostEnabled.booleanValue();
        ActivitiesItemResponse selectedActivitiesItem = gVar.getSettingsResponse().getSelectedActivitiesItem();
        TextResource textResourceM21278l11 = AbstractC8693b.m21278l(selectedActivitiesItem != null ? selectedActivitiesItem.getMenuItemTitle() : null);
        ActivitiesItemResponse selectedActivitiesItem2 = gVar.getSettingsResponse().getSelectedActivitiesItem();
        TextResource textResourceM21278l12 = AbstractC8693b.m21278l(selectedActivitiesItem2 != null ? selectedActivitiesItem2.getMenuItemSubtitle() : null);
        ActivitiesItemResponse selectedActivitiesItem3 = gVar.getSettingsResponse().getSelectedActivitiesItem();
        C39274g c39274g4 = (selectedActivitiesItem3 != null ? selectedActivitiesItem3.getLeftIcon() : null) != null ? new C39274g(EnumC16313m0.valueOf(gVar.getSettingsResponse().getSelectedActivitiesItem().getLeftIcon()).toWhoopIcon(), null, 2, null) : null;
        ActivitiesItemResponse selectedActivitiesItem4 = gVar.getSettingsResponse().getSelectedActivitiesItem();
        if ((selectedActivitiesItem4 != null ? selectedActivitiesItem4.getRightIcon() : null) != null) {
            c39274g = new C39274g(EnumC16313m0.valueOf(gVar.getSettingsResponse().getSelectedActivitiesItem().getRightIcon()).toWhoopIcon(), null, 2, null);
        }
        C21722a c21722a = new C21722a(textResourceM21278l11, textResourceM21278l12, c39274g4, c39274g);
        TextResource textResourceM21278l13 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getAutomaticallyPostDescriptionDisplay());
        List<ShareableGraphicResponse> shareableGraphics = gVar.getSettingsResponse().getShareableGraphics();
        ?? arrayList2 = C25271y.f99162w;
        if (shareableGraphics != null) {
            List<ShareableGraphicResponse> list = shareableGraphics;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                ShareableGraphicResponse shareableGraphicResponse = (ShareableGraphicResponse) it.next();
                arrayList.add(new C21725d(shareableGraphicResponse.getTemplateName(), shareableGraphicResponse.getTemplateUrl(), shareableGraphicResponse.getSelected()));
            }
        } else {
            arrayList = arrayList2;
        }
        TextResource textResourceM21278l14 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getShareableGraphicDescriptionDisplay());
        TextResource textResourceM21278l15 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getDisconnectBubbleTitleDisplay());
        TextResource textResourceM21278l16 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getDisconnectBubbleDescriptionDisplay());
        TextResource textResourceM21278l17 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getDisconnectBubbleConfirmButtonDisplay());
        TextResource textResourceM21278l18 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getDisconnectBubbleCancelButtonDisplay());
        List<SelectableActivityResponse> selectableActivitiesList = gVar.getSettingsResponse().getSelectableActivitiesList();
        if (selectableActivitiesList != null) {
            List<SelectableActivityResponse> list2 = selectableActivitiesList;
            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (Iterator it3 = list2.iterator(); it3.hasNext(); it3 = it3) {
                SelectableActivityResponse selectableActivityResponse = (SelectableActivityResponse) it3.next();
                arrayList2.add(new C21724c(selectableActivityResponse.getActivityNameDisplay(), AbstractC11478a.m30853e(Locale.ROOT, selectableActivityResponse.getActivityNameDisplay(), "toUpperCase(...)"), selectableActivityResponse.getActivityNameInternal(), AbstractC22404p.m64503l(selectableActivityResponse.getActivityIconUrl()), selectableActivityResponse.getSelected(), selectableActivityResponse.getPopular()));
                textResourceM21278l14 = textResourceM21278l14;
            }
        }
        TextResource textResource = textResourceM21278l14;
        ?? r24 = arrayList2;
        TextResource textResourceM21278l19 = AbstractC8693b.m21278l(gVar.getSettingsResponse().getAutomaticallyImportDisplay());
        Boolean automaticallyImportEnabled = gVar.getSettingsResponse().getAutomaticallyImportEnabled();
        return new C21733l(false, false, null, new C21727f(abstractC22403oM64503l2, iconUrl2, textResourceM21278l6, textResourceM21278l7, textResourceM21278l8, c39274g3, textResourceM21278l9, textResourceM21278l10, zBooleanValue, c21722a, textResourceM21278l13, arrayList, textResource, textResourceM21278l15, textResourceM21278l16, textResourceM21278l17, textResourceM21278l18, r24, textResourceM21278l19, automaticallyImportEnabled != null ? automaticallyImportEnabled.booleanValue() : false, AbstractC8693b.m21278l(gVar.getSettingsResponse().getAutomaticallyImportDescriptionDisplay()), this.featureFlagChecker.isFeatureEnabled("strava-mobile-import-settings-update")), null, null, null, 119, null);
    }
}
