package hr1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.integrations.domain.models.IntegrationsDisclaimerModel;
import cr1.InterfaceC11082b;
import gr1.C16097d;
import gr1.C16110q;
import java.util.List;
import jb1.C21535a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: hr1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\f"}, m65681d2 = {"Lhr1/d;", "", "<init>", "()V", "Lcr1/b$e;", "domainResult", "Lgr1/q;", "a", "(Lcr1/b$e;)Lgr1/q;", "Ljb1/a;", "Ljb1/a;", "reducer", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17578d {

    /* JADX INFO: renamed from: b */
    public static final int f68109b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer = AbstractC17575a.m50034f();

    /* JADX INFO: renamed from: a */
    public final C16110q m50051a(InterfaceC11082b.e domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        IntegrationsDisclaimerModel data = domainResult.getData();
        String integrationId = data.getIntegrationId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(data.getTitle());
        AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(data.getHeroImageUrl());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(data.getDescription());
        List<InterfaceC25312u> listM60545m = this.reducer.m60545m(data.getDesignItems());
        DesignSystemModel footerDisclaimer = data.getFooterDisclaimer();
        InterfaceC25312u interfaceC25312uM60544l = footerDisclaimer != null ? this.reducer.m60544l(footerDisclaimer) : null;
        String connectionUrlBase = data.getConnectionUrlBase();
        String connectionButtonText = data.getConnectionButtonText();
        DesignSystemModel secondaryButton = data.getSecondaryButton();
        return new C16110q(null, false, null, null, null, null, new C16097d(integrationId, textResourceM21278l, abstractC22403oM64503l, textResourceM21278l2, listM60545m, interfaceC25312uM60544l, connectionUrlBase, connectionButtonText, secondaryButton != null ? this.reducer.m60544l(secondaryButton) : null), false, 191, null);
    }
}
