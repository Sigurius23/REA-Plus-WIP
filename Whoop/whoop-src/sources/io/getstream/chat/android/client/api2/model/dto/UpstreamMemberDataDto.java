package io.getstream.chat.android.client.api2.model.dto;

import io.getstream.chat.android.core.internal.StreamHandsOff;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@StreamHandsOff(reason = "Field names can't be changed because [CustomObjectDtoAdapter] class uses reflections to add/remove content of [extraData] map")
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDataDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "user_id", "", "extraData", "", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getUser_id", "()Ljava/lang/String;", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpstreamMemberDataDto implements ExtraDataDto {
    private final Map<String, Object> extraData;
    private final String user_id;

    public UpstreamMemberDataDto(String user_id, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.user_id = user_id;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpstreamMemberDataDto copy$default(UpstreamMemberDataDto upstreamMemberDataDto, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = upstreamMemberDataDto.user_id;
        }
        if ((i13 & 2) != 0) {
            map = upstreamMemberDataDto.extraData;
        }
        return upstreamMemberDataDto.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    public final Map<String, Object> component2() {
        return this.extraData;
    }

    public final UpstreamMemberDataDto copy(String user_id, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new UpstreamMemberDataDto(user_id, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpstreamMemberDataDto)) {
            return false;
        }
        UpstreamMemberDataDto upstreamMemberDataDto = (UpstreamMemberDataDto) other;
        return AbstractC22676k.m65745e(this.user_id, upstreamMemberDataDto.user_id) && AbstractC22676k.m65745e(this.extraData, upstreamMemberDataDto.extraData);
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        return this.extraData.hashCode() + (this.user_id.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114680h("UpstreamMemberDataDto(user_id=", this.user_id, ", extraData=", ")", this.extraData);
    }
}
