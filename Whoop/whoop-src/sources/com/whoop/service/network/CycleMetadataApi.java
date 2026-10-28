package com.whoop.service.network;

import com.mapbox.common.HttpHeaders;
import com.whoop.data.remote.domain.dto.CycleMetadataResponseDto;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/CycleMetadataApi;", "", "", HttpHeaders.DATE, "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;", "getCycleMetadata", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface CycleMetadataApi {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m24487a(CycleMetadataApi cycleMetadataApi, String str, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCycleMetadata");
        }
        if ((i13 & 1) != 0) {
            str = null;
        }
        return cycleMetadataApi.getCycleMetadata(str, interfaceC30057d);
    }

    @InterfaceC37275f("core-details-bff/v1/start-activity/strain")
    Object getCycleMetadata(@InterfaceC37289t(HttpHeaders.DATE) String str, InterfaceC30057d<? super CycleMetadataResponseDto> interfaceC30057d);
}
