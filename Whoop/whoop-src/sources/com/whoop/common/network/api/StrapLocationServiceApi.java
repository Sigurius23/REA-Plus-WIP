package com.whoop.common.network.api;

import com.whoop.common.network.model.GarmentItemDto;
import java.util.List;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/common/network/api/StrapLocationServiceApi;", "", "", "Lcom/whoop/common/network/model/GarmentItemDto;", "getGarmentsList", "(Lq83/d;)Ljava/lang/Object;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface StrapLocationServiceApi {
    @InterfaceC37275f("strap-location-service/v1/garment")
    Object getGarmentsList(InterfaceC30057d<? super List<GarmentItemDto>> interfaceC30057d);
}
