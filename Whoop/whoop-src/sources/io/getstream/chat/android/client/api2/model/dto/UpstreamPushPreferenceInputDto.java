package io.getstream.chat.android.client.api2.model.dto;

import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamPushPreferenceInputDto;", "", "channel_cid", "", "chat_level", "disabled_until", "Ljava/util/Date;", "remove_disable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;)V", "getChannel_cid", "()Ljava/lang/String;", "getChat_level", "getDisabled_until", "()Ljava/util/Date;", "getRemove_disable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamPushPreferenceInputDto;", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpstreamPushPreferenceInputDto {
    private final String channel_cid;
    private final String chat_level;
    private final Date disabled_until;
    private final Boolean remove_disable;

    public UpstreamPushPreferenceInputDto(String str, String str2, Date date, Boolean bool) {
        this.channel_cid = str;
        this.chat_level = str2;
        this.disabled_until = date;
        this.remove_disable = bool;
    }

    public static /* synthetic */ UpstreamPushPreferenceInputDto copy$default(UpstreamPushPreferenceInputDto upstreamPushPreferenceInputDto, String str, String str2, Date date, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = upstreamPushPreferenceInputDto.channel_cid;
        }
        if ((i13 & 2) != 0) {
            str2 = upstreamPushPreferenceInputDto.chat_level;
        }
        if ((i13 & 4) != 0) {
            date = upstreamPushPreferenceInputDto.disabled_until;
        }
        if ((i13 & 8) != 0) {
            bool = upstreamPushPreferenceInputDto.remove_disable;
        }
        return upstreamPushPreferenceInputDto.copy(str, str2, date, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel_cid() {
        return this.channel_cid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChat_level() {
        return this.chat_level;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getDisabled_until() {
        return this.disabled_until;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getRemove_disable() {
        return this.remove_disable;
    }

    public final UpstreamPushPreferenceInputDto copy(String channel_cid, String chat_level, Date disabled_until, Boolean remove_disable) {
        return new UpstreamPushPreferenceInputDto(channel_cid, chat_level, disabled_until, remove_disable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpstreamPushPreferenceInputDto)) {
            return false;
        }
        UpstreamPushPreferenceInputDto upstreamPushPreferenceInputDto = (UpstreamPushPreferenceInputDto) other;
        return AbstractC22676k.m65745e(this.channel_cid, upstreamPushPreferenceInputDto.channel_cid) && AbstractC22676k.m65745e(this.chat_level, upstreamPushPreferenceInputDto.chat_level) && AbstractC22676k.m65745e(this.disabled_until, upstreamPushPreferenceInputDto.disabled_until) && AbstractC22676k.m65745e(this.remove_disable, upstreamPushPreferenceInputDto.remove_disable);
    }

    public final String getChannel_cid() {
        return this.channel_cid;
    }

    public final String getChat_level() {
        return this.chat_level;
    }

    public final Date getDisabled_until() {
        return this.disabled_until;
    }

    public final Boolean getRemove_disable() {
        return this.remove_disable;
    }

    public int hashCode() {
        String str = this.channel_cid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.chat_level;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.disabled_until;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Boolean bool = this.remove_disable;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.channel_cid;
        String str2 = this.chat_level;
        Date date = this.disabled_until;
        Boolean bool = this.remove_disable;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UpstreamPushPreferenceInputDto(channel_cid=", str, ", chat_level=", str2, ", disabled_until=");
        sbM32001t.append(date);
        sbM32001t.append(", remove_disable=");
        sbM32001t.append(bool);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
