package com.whoop.service.network;

import java.util.List;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/ConfigurationApi;", "", "", "Lcom/whoop/service/network/WhoopConfiguration;", "getConfigurations", "(Lq83/d;)Ljava/lang/Object;", "getConfigurationsUnauthed", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ConfigurationApi {
    @InterfaceC37275f("configuration/v1/services/mobile/name/Android/properties")
    Object getConfigurations(InterfaceC30057d<? super List<WhoopConfiguration>> interfaceC30057d);

    @InterfaceC37275f("configuration/v1/services/mobile/name/Android/properties/unauth")
    Object getConfigurationsUnauthed(InterfaceC30057d<? super List<WhoopConfiguration>> interfaceC30057d);
}
