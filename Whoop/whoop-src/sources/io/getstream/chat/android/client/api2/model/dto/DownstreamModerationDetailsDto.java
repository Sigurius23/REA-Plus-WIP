package io.getstream.chat.android.client.api2.model.dto;

import io.getstream.chat.android.core.internal.StreamHandsOff;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@StreamHandsOff(reason = "Field names can't be changed because [CustomObjectDtoAdapter] class uses reflections to add/remove content of [extraData] map")
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;", "", "original_text", "", "action", "error_msg", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getOriginal_text", "()Ljava/lang/String;", "getAction", "getError_msg", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamModerationDetailsDto {
    private final String action;
    private final String error_msg;
    private final Map<String, Object> extraData;
    private final String original_text;

    public DownstreamModerationDetailsDto(String str, String str2, String str3, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(extraData, "extraData");
        this.original_text = str;
        this.action = str2;
        this.error_msg = str3;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownstreamModerationDetailsDto copy$default(DownstreamModerationDetailsDto downstreamModerationDetailsDto, String str, String str2, String str3, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = downstreamModerationDetailsDto.original_text;
        }
        if ((i13 & 2) != 0) {
            str2 = downstreamModerationDetailsDto.action;
        }
        if ((i13 & 4) != 0) {
            str3 = downstreamModerationDetailsDto.error_msg;
        }
        if ((i13 & 8) != 0) {
            map = downstreamModerationDetailsDto.extraData;
        }
        return downstreamModerationDetailsDto.copy(str, str2, str3, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOriginal_text() {
        return this.original_text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getError_msg() {
        return this.error_msg;
    }

    public final Map<String, Object> component4() {
        return this.extraData;
    }

    public final DownstreamModerationDetailsDto copy(String original_text, String action, String error_msg, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(extraData, "extraData");
        return new DownstreamModerationDetailsDto(original_text, action, error_msg, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamModerationDetailsDto)) {
            return false;
        }
        DownstreamModerationDetailsDto downstreamModerationDetailsDto = (DownstreamModerationDetailsDto) other;
        return AbstractC22676k.m65745e(this.original_text, downstreamModerationDetailsDto.original_text) && AbstractC22676k.m65745e(this.action, downstreamModerationDetailsDto.action) && AbstractC22676k.m65745e(this.error_msg, downstreamModerationDetailsDto.error_msg) && AbstractC22676k.m65745e(this.extraData, downstreamModerationDetailsDto.extraData);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getError_msg() {
        return this.error_msg;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getOriginal_text() {
        return this.original_text;
    }

    public int hashCode() {
        String str = this.original_text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.error_msg;
        return this.extraData.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.original_text;
        String str2 = this.action;
        return AbstractC30007c.m91842l(AbstractC11895b.m32001t("DownstreamModerationDetailsDto(original_text=", str, ", action=", str2, ", error_msg="), this.error_msg, ", extraData=", this.extraData, ")");
    }

    public /* synthetic */ DownstreamModerationDetailsDto(String str, String str2, String str3, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, map);
    }
}
