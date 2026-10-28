package hr1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.integrations.domain.models.IntegrationsDetailsComponentsModel;
import com.whoop.integrations.domain.models.IntegrationsLearnMoreButtonModel;
import com.whoop.integrations.domain.models.IntegrationsPrivacyControlModel;
import com.whoop.integrations.domain.models.IntegrationsPrivacyControlsModel;
import cr1.InterfaceC11082b;
import gr1.C16095b;
import gr1.C16110q;
import gr1.C16111r;
import gr1.C16112s;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: hr1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lhr1/b;", "", "<init>", "()V", "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;", "model", "Lgr1/s;", "c", "(Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;)Lgr1/s;", "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;", "Lgr1/r;", "b", "(Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;)Lgr1/r;", "Lcr1/b$b;", "domainResult", "Lgr1/q;", "a", "(Lcr1/b$b;)Lgr1/q;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17576b {
    /* JADX INFO: renamed from: b */
    private final C16111r m50045b(IntegrationsPrivacyControlModel model) {
        return new C16111r(model.getType(), AbstractC8693b.m21278l(model.getTitle()), model.isEnabled());
    }

    /* JADX INFO: renamed from: c */
    private final C16112s m50046c(IntegrationsPrivacyControlsModel model) {
        IntegrationsPrivacyControlModel automaticImportControl = model.getAutomaticImportControl();
        C16111r c16111rM50045b = automaticImportControl != null ? m50045b(automaticImportControl) : null;
        IntegrationsPrivacyControlModel automaticExportControl = model.getAutomaticExportControl();
        return new C16112s(c16111rM50045b, automaticExportControl != null ? m50045b(automaticExportControl) : null);
    }

    /* JADX INFO: renamed from: a */
    public final C16110q m50047a(InterfaceC11082b.b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        IntegrationsDetailsComponentsModel data = domainResult.getData();
        String id4 = data.getId();
        String reportingKey = data.getReportingKey();
        AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(data.getBackgroundImageUrl());
        AbstractC22403o abstractC22403oM64503l2 = AbstractC22404p.m64503l(data.getIconUrl());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(data.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(data.getDescription());
        IntegrationsLearnMoreButtonModel learnMoreButton = data.getLearnMoreButton();
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(learnMoreButton != null ? learnMoreButton.getText() : null);
        IntegrationsLearnMoreButtonModel learnMoreButton2 = data.getLearnMoreButton();
        String url = learnMoreButton2 != null ? learnMoreButton2.getUrl() : null;
        boolean connected = data.getConnected();
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(data.getConnectedStatus());
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(data.getButtonText());
        String connectionUrl = data.getConnectionUrl();
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(data.getDisconnectPopupTitle());
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(data.getDisconnectPopupDescription());
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(data.getDisconnectPopupPrimaryButton());
        TextResource textResourceM21278l9 = AbstractC8693b.m21278l(data.getDisconnectPopupSecondaryButton());
        Boolean shouldPerformFullOauth = data.getShouldPerformFullOauth();
        boolean zBooleanValue = shouldPerformFullOauth != null ? shouldPerformFullOauth.booleanValue() : false;
        String providerId = data.getProviderId();
        CtaTileModel upsellCtaTile = data.getUpsellCtaTile();
        InterfaceC25312u interfaceC25312uM60544l = upsellCtaTile != null ? AbstractC17575a.m50034f().m60544l(upsellCtaTile) : null;
        DesignSystemModel overridePrimaryButton = data.getOverridePrimaryButton();
        InterfaceC25312u interfaceC25312u = interfaceC25312uM60544l;
        InterfaceC25312u interfaceC25312uM60544l2 = overridePrimaryButton != null ? AbstractC17575a.m50034f().m60544l(overridePrimaryButton) : null;
        List<DesignSystemModel> designItems = data.getDesignItems();
        InterfaceC25312u interfaceC25312u2 = interfaceC25312uM60544l2;
        List<InterfaceC25312u> listM60545m = designItems != null ? AbstractC17575a.m50034f().m60545m(designItems) : null;
        DesignSystemModel footerDisclaimer = data.getFooterDisclaimer();
        List<InterfaceC25312u> list = listM60545m;
        InterfaceC25312u interfaceC25312uM60544l3 = footerDisclaimer != null ? AbstractC17575a.m50034f().m60544l(footerDisclaimer) : null;
        String lastUpdated = data.getLastUpdated();
        TextResource textResourceM21278l10 = lastUpdated != null ? AbstractC8693b.m21278l(lastUpdated) : null;
        MarkdownTextModel descriptionFootnote = data.getDescriptionFootnote();
        InterfaceC25312u interfaceC25312u3 = interfaceC25312uM60544l3;
        InterfaceC25312u interfaceC25312uM60544l4 = descriptionFootnote != null ? AbstractC17575a.m50034f().m60544l(descriptionFootnote) : null;
        IntegrationsPrivacyControlsModel privacyControls = data.getPrivacyControls();
        return new C16110q(null, false, null, null, new C16095b(id4, reportingKey, abstractC22403oM64503l, abstractC22403oM64503l2, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, url, connected, textResourceM21278l4, textResourceM21278l5, connectionUrl, textResourceM21278l6, textResourceM21278l7, textResourceM21278l8, textResourceM21278l9, zBooleanValue, providerId, interfaceC25312u, interfaceC25312u2, list, interfaceC25312u3, textResourceM21278l10, interfaceC25312uM60544l4, privacyControls != null ? m50046c(privacyControls) : null), null, null, false, 239, null);
    }
}
