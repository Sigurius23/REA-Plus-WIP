package io.getstream.chat.android.client.api2.model.dto;

import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "", "message", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;", "channel_cid", "", "quoted_message", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "parent_id", "parent_message", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;)V", "getMessage", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;", "getChannel_cid", "()Ljava/lang/String;", "getQuoted_message", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getParent_id", "getParent_message", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamDraftDto {
    private final String channel_cid;
    private final DownstreamDraftMessageDto message;
    private final String parent_id;
    private final DownstreamMessageDto parent_message;
    private final DownstreamMessageDto quoted_message;

    public DownstreamDraftDto(DownstreamDraftMessageDto message, String channel_cid, DownstreamMessageDto downstreamMessageDto, String str, DownstreamMessageDto downstreamMessageDto2) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(channel_cid, "channel_cid");
        this.message = message;
        this.channel_cid = channel_cid;
        this.quoted_message = downstreamMessageDto;
        this.parent_id = str;
        this.parent_message = downstreamMessageDto2;
    }

    public static /* synthetic */ DownstreamDraftDto copy$default(DownstreamDraftDto downstreamDraftDto, DownstreamDraftMessageDto downstreamDraftMessageDto, String str, DownstreamMessageDto downstreamMessageDto, String str2, DownstreamMessageDto downstreamMessageDto2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            downstreamDraftMessageDto = downstreamDraftDto.message;
        }
        if ((i13 & 2) != 0) {
            str = downstreamDraftDto.channel_cid;
        }
        if ((i13 & 4) != 0) {
            downstreamMessageDto = downstreamDraftDto.quoted_message;
        }
        if ((i13 & 8) != 0) {
            str2 = downstreamDraftDto.parent_id;
        }
        if ((i13 & 16) != 0) {
            downstreamMessageDto2 = downstreamDraftDto.parent_message;
        }
        DownstreamMessageDto downstreamMessageDto3 = downstreamMessageDto2;
        DownstreamMessageDto downstreamMessageDto4 = downstreamMessageDto;
        return downstreamDraftDto.copy(downstreamDraftMessageDto, str, downstreamMessageDto4, str2, downstreamMessageDto3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DownstreamDraftMessageDto getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannel_cid() {
        return this.channel_cid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DownstreamMessageDto getQuoted_message() {
        return this.quoted_message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getParent_id() {
        return this.parent_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DownstreamMessageDto getParent_message() {
        return this.parent_message;
    }

    public final DownstreamDraftDto copy(DownstreamDraftMessageDto message, String channel_cid, DownstreamMessageDto quoted_message, String parent_id, DownstreamMessageDto parent_message) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(channel_cid, "channel_cid");
        return new DownstreamDraftDto(message, channel_cid, quoted_message, parent_id, parent_message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamDraftDto)) {
            return false;
        }
        DownstreamDraftDto downstreamDraftDto = (DownstreamDraftDto) other;
        return AbstractC22676k.m65745e(this.message, downstreamDraftDto.message) && AbstractC22676k.m65745e(this.channel_cid, downstreamDraftDto.channel_cid) && AbstractC22676k.m65745e(this.quoted_message, downstreamDraftDto.quoted_message) && AbstractC22676k.m65745e(this.parent_id, downstreamDraftDto.parent_id) && AbstractC22676k.m65745e(this.parent_message, downstreamDraftDto.parent_message);
    }

    public final String getChannel_cid() {
        return this.channel_cid;
    }

    public final DownstreamDraftMessageDto getMessage() {
        return this.message;
    }

    public final String getParent_id() {
        return this.parent_id;
    }

    public final DownstreamMessageDto getParent_message() {
        return this.parent_message;
    }

    public final DownstreamMessageDto getQuoted_message() {
        return this.quoted_message;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.message.hashCode() * 31, 31, this.channel_cid);
        DownstreamMessageDto downstreamMessageDto = this.quoted_message;
        int iHashCode = (iM30450d + (downstreamMessageDto == null ? 0 : downstreamMessageDto.hashCode())) * 31;
        String str = this.parent_id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DownstreamMessageDto downstreamMessageDto2 = this.parent_message;
        return iHashCode2 + (downstreamMessageDto2 != null ? downstreamMessageDto2.hashCode() : 0);
    }

    public String toString() {
        return "DownstreamDraftDto(message=" + this.message + ", channel_cid=" + this.channel_cid + ", quoted_message=" + this.quoted_message + ", parent_id=" + this.parent_id + ", parent_message=" + this.parent_message + ")";
    }

    public /* synthetic */ DownstreamDraftDto(DownstreamDraftMessageDto downstreamDraftMessageDto, String str, DownstreamMessageDto downstreamMessageDto, String str2, DownstreamMessageDto downstreamMessageDto2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(downstreamDraftMessageDto, str, (i13 & 4) != 0 ? null : downstreamMessageDto, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : downstreamMessageDto2);
    }
}
