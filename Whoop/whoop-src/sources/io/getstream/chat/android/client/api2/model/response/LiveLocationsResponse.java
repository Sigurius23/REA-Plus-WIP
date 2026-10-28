package io.getstream.chat.android.client.api2.model.response;

import io.getstream.chat.android.client.api2.model.dto.DownstreamLocationDto;
import java.util.List;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/LiveLocationsResponse;", "", "active_live_locations", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;", "<init>", "(Ljava/util/List;)V", "getActive_live_locations", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LiveLocationsResponse {
    private final List<DownstreamLocationDto> active_live_locations;

    public LiveLocationsResponse(List<DownstreamLocationDto> active_live_locations) {
        AbstractC22676k.m65750j(active_live_locations, "active_live_locations");
        this.active_live_locations = active_live_locations;
    }

    public final List<DownstreamLocationDto> getActive_live_locations() {
        return this.active_live_locations;
    }
}
