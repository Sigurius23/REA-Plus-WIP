package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/PollClosedEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "cid", "message_id", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "poll", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;)V", "getType", "()Ljava/lang/String;", "getCid", "getMessage_id", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getPoll", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PollClosedEventDto extends ChatEventDto {
    private final String cid;
    private final ExactDate created_at;
    private final String message_id;
    private final DownstreamPollDto poll;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollClosedEventDto(String type, String cid, String str, ExactDate created_at, DownstreamPollDto poll) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(poll, "poll");
        this.type = type;
        this.cid = cid;
        this.message_id = str;
        this.created_at = created_at;
        this.poll = poll;
    }

    public static /* synthetic */ PollClosedEventDto copy$default(PollClosedEventDto pollClosedEventDto, String str, String str2, String str3, ExactDate exactDate, DownstreamPollDto downstreamPollDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pollClosedEventDto.type;
        }
        if ((i13 & 2) != 0) {
            str2 = pollClosedEventDto.cid;
        }
        if ((i13 & 4) != 0) {
            str3 = pollClosedEventDto.message_id;
        }
        if ((i13 & 8) != 0) {
            exactDate = pollClosedEventDto.created_at;
        }
        if ((i13 & 16) != 0) {
            downstreamPollDto = pollClosedEventDto.poll;
        }
        DownstreamPollDto downstreamPollDto2 = downstreamPollDto;
        String str4 = str3;
        return pollClosedEventDto.copy(str, str2, str4, exactDate, downstreamPollDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DownstreamPollDto getPoll() {
        return this.poll;
    }

    public final PollClosedEventDto copy(String type, String cid, String message_id, ExactDate created_at, DownstreamPollDto poll) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(poll, "poll");
        return new PollClosedEventDto(type, cid, message_id, created_at, poll);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollClosedEventDto)) {
            return false;
        }
        PollClosedEventDto pollClosedEventDto = (PollClosedEventDto) other;
        return AbstractC22676k.m65745e(this.type, pollClosedEventDto.type) && AbstractC22676k.m65745e(this.cid, pollClosedEventDto.cid) && AbstractC22676k.m65745e(this.message_id, pollClosedEventDto.message_id) && AbstractC22676k.m65745e(this.created_at, pollClosedEventDto.created_at) && AbstractC22676k.m65745e(this.poll, pollClosedEventDto.poll);
    }

    public final String getCid() {
        return this.cid;
    }

    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final DownstreamPollDto getPoll() {
        return this.poll;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.cid);
        String str = this.message_id;
        return this.poll.hashCode() + AbstractC3855a.m11820d(this.created_at, (iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.cid;
        String str3 = this.message_id;
        ExactDate exactDate = this.created_at;
        DownstreamPollDto downstreamPollDto = this.poll;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PollClosedEventDto(type=", str, ", cid=", str2, ", message_id=");
        sbM32001t.append(str3);
        sbM32001t.append(", created_at=");
        sbM32001t.append(exactDate);
        sbM32001t.append(", poll=");
        sbM32001t.append(downstreamPollDto);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
