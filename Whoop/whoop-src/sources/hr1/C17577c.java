package hr1;

import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.integrations.domain.models.IntegrationsLearnMoreButtonModel;
import com.whoop.integrations.domain.models.p061v2.IntegrationsConnectionSectionRowModel;
import com.whoop.integrations.domain.models.p061v2.IntegrationsDetailsV2ComponentsModel;
import cr1.InterfaceC11082b;
import gr1.C16094a;
import gr1.C16096c;
import gr1.C16098e;
import gr1.C16110q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import zq1.AbstractC40987b;

/* JADX INFO: renamed from: hr1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lhr1/c;", "", "<init>", "()V", "Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;", "model", "Lgr1/a;", "b", "(Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;)Lgr1/a;", "Lgr1/e;", "c", "(Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;)Lgr1/e;", "Lcr1/b$d;", "domainResult", "Lgr1/q;", "a", "(Lcr1/b$d;)Lgr1/q;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17577c {
    /* JADX INFO: renamed from: b */
    private final C16094a m50048b(IntegrationsConnectionSectionRowModel model) {
        String id4 = model.getId();
        boolean zIsWhoopBuilt = model.isWhoopBuilt();
        String integrationId3P = model.getIntegrationId3P();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getSectionTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getCtaTitle());
        boolean connected = model.getConnected();
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getConnectedStatusDisplay());
        String ctaConnectionUrl = model.getCtaConnectionUrl();
        String ctaDeepLinkUrl = model.getCtaDeepLinkUrl();
        InfoCalloutTileModel infoCallout = model.getInfoCallout();
        return new C16094a(id4, zIsWhoopBuilt, integrationId3P, textResourceM21278l, textResourceM21278l2, connected, textResourceM21278l3, ctaConnectionUrl, ctaDeepLinkUrl, infoCallout != null ? AbstractC17575a.m50034f().m60544l(infoCallout) : null, AbstractC8693b.m21279m(model.getBottomDescriptionText()), model.getShowConnectedStatusIcon(), model.getCanShowDisconnectModal(), model.getCtaButtonStyle(), m50049c(model));
    }

    /* JADX INFO: renamed from: c */
    private final C16098e m50049c(IntegrationsConnectionSectionRowModel model) {
        TextResource textResourceM21279m = AbstractC8693b.m21279m(model.getDisconnectPopupTitle());
        if (textResourceM21279m == null) {
            textResourceM21279m = AbstractC8693b.m21277k(AbstractC40987b.f176897e);
        }
        TextResource textResourceM21279m2 = AbstractC8693b.m21279m(model.getDisconnectPopupDescription());
        if (textResourceM21279m2 == null) {
            textResourceM21279m2 = AbstractC8693b.m21277k(AbstractC40987b.f176896d);
        }
        TextResource textResourceM21279m3 = AbstractC8693b.m21279m(model.getDisconnectPopupPrimaryButtonTitle());
        if (textResourceM21279m3 == null) {
            textResourceM21279m3 = AbstractC8693b.m21277k(AbstractC40987b.f176895c);
        }
        TextResource textResourceM21279m4 = AbstractC8693b.m21279m(model.getDisconnectPopupSecondaryButtonTitle());
        if (textResourceM21279m4 == null) {
            textResourceM21279m4 = AbstractC8693b.m21277k(AbstractC40987b.f176894b);
        }
        return new C16098e(textResourceM21279m, textResourceM21279m2, textResourceM21279m3, textResourceM21279m4);
    }

    /* JADX INFO: renamed from: a */
    public final C16110q m50050a(InterfaceC11082b.d domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        IntegrationsDetailsV2ComponentsModel data = domainResult.getData();
        String id4 = data.getId();
        String reportingKey = data.getReportingKey();
        AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(data.getBackgroundImageUrl());
        AbstractC22403o abstractC22403oM64503l2 = AbstractC22404p.m64503l(data.getIconUrl());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(data.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(data.getDescription());
        String providerId = data.getProviderId();
        MarkdownTextModel descriptionFootnote = data.getDescriptionFootnote();
        InterfaceC25312u interfaceC25312uM60544l = descriptionFootnote != null ? AbstractC17575a.m50034f().m60544l(descriptionFootnote) : null;
        IntegrationsLearnMoreButtonModel learnMoreButton = data.getLearnMoreButton();
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(learnMoreButton != null ? learnMoreButton.getText() : null);
        IntegrationsLearnMoreButtonModel learnMoreButton2 = data.getLearnMoreButton();
        String url = learnMoreButton2 != null ? learnMoreButton2.getUrl() : null;
        List<IntegrationsConnectionSectionRowModel> connectionSections = data.getConnectionSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(connectionSections, 10));
        Iterator<T> it = connectionSections.iterator();
        while (it.hasNext()) {
            arrayList.add(m50048b((IntegrationsConnectionSectionRowModel) it.next()));
        }
        return new C16110q(null, false, null, null, null, new C16096c(id4, reportingKey, abstractC22403oM64503l, abstractC22403oM64503l2, textResourceM21278l, textResourceM21278l2, providerId, interfaceC25312uM60544l, textResourceM21278l3, url, arrayList), null, false, 223, null);
    }
}
