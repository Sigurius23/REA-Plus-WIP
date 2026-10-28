package com.whoop.homecustomization.domain;

import com.whoop.homecustomization.domain.legacy.models.HomeCustomizationResponse;
import com.whoop.homecustomization.domain.models.CustomizeOverviewDomainBody;
import com.whoop.homecustomization.domain.models.CustomizeOverviewResponse;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\u0004J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0004\b\u0012\u0010\u0004¨\u0006\u0013À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/homecustomization/domain/HomeCustomizationApi;", "", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "getCustomizeOverview", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;", "saveDomainBody", "Lpg3/v0;", "Ll83/a0;", "updateCustomizeOverviewPrefs", "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;", "getHomeCustomizationLegacy", "", "", "keyStats", "saveKeyStats", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "setCustomizeOnboardingStateToFalse", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface HomeCustomizationApi {
    @InterfaceC37275f("home-service/v2/home/dashboard/customize")
    Object getCustomizeOverview(InterfaceC30057d<? super CustomizeOverviewResponse> interfaceC30057d);

    @InterfaceC37275f("home-service/v1/home/overview/customize/key_statistics")
    Object getHomeCustomizationLegacy(InterfaceC30057d<? super HomeCustomizationResponse> interfaceC30057d);

    @InterfaceC37285p("users-service/v1/users/preferences/key_statistics")
    Object saveKeyStats(@InterfaceC37270a List<String> list, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("users-service/v1/users/preferences/key_statistics")
    Object setCustomizeOnboardingStateToFalse(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("user-preferences-service/v1/home/dashboard/customize")
    Object updateCustomizeOverviewPrefs(@InterfaceC37270a CustomizeOverviewDomainBody customizeOverviewDomainBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
