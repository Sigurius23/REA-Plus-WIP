package io.getstream.chat.android.client.api2.model.dto;

import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "", "chat_level", "", "disabled_until", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/util/Date;)V", "getChat_level", "()Ljava/lang/String;", "getDisabled_until", "()Ljava/util/Date;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamPushPreferenceDto {
    private final String chat_level;
    private final Date disabled_until;

    public DownstreamPushPreferenceDto(String str, Date date) {
        this.chat_level = str;
        this.disabled_until = date;
    }

    public static /* synthetic */ DownstreamPushPreferenceDto copy$default(DownstreamPushPreferenceDto downstreamPushPreferenceDto, String str, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = downstreamPushPreferenceDto.chat_level;
        }
        if ((i13 & 2) != 0) {
            date = downstreamPushPreferenceDto.disabled_until;
        }
        return downstreamPushPreferenceDto.copy(str, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChat_level() {
        return this.chat_level;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getDisabled_until() {
        return this.disabled_until;
    }

    public final DownstreamPushPreferenceDto copy(String chat_level, Date disabled_until) {
        return new DownstreamPushPreferenceDto(chat_level, disabled_until);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamPushPreferenceDto)) {
            return false;
        }
        DownstreamPushPreferenceDto downstreamPushPreferenceDto = (DownstreamPushPreferenceDto) other;
        return AbstractC22676k.m65745e(this.chat_level, downstreamPushPreferenceDto.chat_level) && AbstractC22676k.m65745e(this.disabled_until, downstreamPushPreferenceDto.disabled_until);
    }

    public final String getChat_level() {
        return this.chat_level;
    }

    public final Date getDisabled_until() {
        return this.disabled_until;
    }

    public int hashCode() {
        String str = this.chat_level;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.disabled_until;
        return iHashCode + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        return "DownstreamPushPreferenceDto(chat_level=" + this.chat_level + ", disabled_until=" + this.disabled_until + ")";
    }
}
