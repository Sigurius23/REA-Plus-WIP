package com.whoop.helpcenter.data.network;

import com.whoop.helpcenter.data.network.model.HelpCenterLandingBffDto;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/helpcenter/data/network/HelpCenterApi;", "", "Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;", "getLandingScreenData", "(Lq83/d;)Ljava/lang/Object;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface HelpCenterApi {
    @InterfaceC37275f("resource-center-bff/v1/overview")
    Object getLandingScreenData(InterfaceC30057d<? super HelpCenterLandingBffDto> interfaceC30057d);
}
