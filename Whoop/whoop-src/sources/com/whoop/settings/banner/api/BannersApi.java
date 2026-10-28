package com.whoop.settings.banner.api;

import com.whoop.settings.banner.models.SettingsBannerDtoV2;
import com.whoop.settings.banner.models.SettingsBannerDtoV3;
import java.util.List;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/settings/banner/api/BannersApi;", "", "", "Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;", "fetchBanners", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/settings/banner/models/SettingsBannerDtoV3;", "fetchBannersV3", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface BannersApi {
    @InterfaceC37275f("/membership-service/v1/in-app-banners/banners")
    Object fetchBanners(InterfaceC30057d<? super List<SettingsBannerDtoV2>> interfaceC30057d);

    @InterfaceC37275f("/membership-service/v2/in-app-banners")
    Object fetchBannersV3(InterfaceC30057d<? super SettingsBannerDtoV3> interfaceC30057d);
}
