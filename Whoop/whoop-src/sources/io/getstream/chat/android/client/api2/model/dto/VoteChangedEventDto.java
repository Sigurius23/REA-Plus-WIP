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
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/VoteChangedEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "cid", "message_id", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "poll", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "poll_vote", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;)V", "getType", "()Ljava/lang/String;", "getCid", "getMessage_id", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getPoll", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "getPoll_vote", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class VoteChangedEventDto extends ChatEventDto {
    private final String cid;
    private final ExactDate created_at;
    private final String message_id;
    private final DownstreamPollDto poll;
    private final DownstreamVoteDto poll_vote;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoteChangedEventDto(String type, String cid, String str, ExactDate created_at, DownstreamPollDto poll, DownstreamVoteDto poll_vote) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(poll_vote, "poll_vote");
        this.type = type;
        this.cid = cid;
        this.message_id = str;
        this.created_at = created_at;
        this.poll = poll;
        this.poll_vote = poll_vote;
    }

    public static /* synthetic */ VoteChangedEventDto copy$default(VoteChangedEventDto voteChangedEventDto, String str, String str2, String str3, ExactDate exactDate, DownstreamPollDto downstreamPollDto, DownstreamVoteDto downstreamVoteDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = voteChangedEventDto.type;
        }
        if ((i13 & 2) != 0) {
            str2 = voteChangedEventDto.cid;
        }
        if ((i13 & 4) != 0) {
            str3 = voteChangedEventDto.message_id;
        }
        if ((i13 & 8) != 0) {
            exactDate = voteChangedEventDto.created_at;
        }
        if ((i13 & 16) != 0) {
            downstreamPollDto = voteChangedEventDto.poll;
        }
        if ((i13 & 32) != 0) {
            downstreamVoteDto = voteChangedEventDto.poll_vote;
        }
        DownstreamPollDto downstreamPollDto2 = downstreamPollDto;
        DownstreamVoteDto downstreamVoteDto2 = downstreamVoteDto;
        return voteChangedEventDto.copy(str, str2, str3, exactDate, downstreamPollDto2, downstreamVoteDto2);
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

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DownstreamVoteDto getPoll_vote() {
        return this.poll_vote;
    }

    public final VoteChangedEventDto copy(String type, String cid, String message_id, ExactDate created_at, DownstreamPollDto poll, DownstreamVoteDto poll_vote) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(poll_vote, "poll_vote");
        return new VoteChangedEventDto(type, cid, message_id, created_at, poll, poll_vote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoteChangedEventDto)) {
            return false;
        }
        VoteChangedEventDto voteChangedEventDto = (VoteChangedEventDto) other;
        return AbstractC22676k.m65745e(this.type, voteChangedEventDto.type) && AbstractC22676k.m65745e(this.cid, voteChangedEventDto.cid) && AbstractC22676k.m65745e(this.message_id, voteChangedEventDto.message_id) && AbstractC22676k.m65745e(this.created_at, voteChangedEventDto.created_at) && AbstractC22676k.m65745e(this.poll, voteChangedEventDto.poll) && AbstractC22676k.m65745e(this.poll_vote, voteChangedEventDto.poll_vote);
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

    public final DownstreamVoteDto getPoll_vote() {
        return this.poll_vote;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.cid);
        String str = this.message_id;
        return this.poll_vote.hashCode() + ((this.poll.hashCode() + AbstractC3855a.m11820d(this.created_at, (iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.cid;
        String str3 = this.message_id;
        ExactDate exactDate = this.created_at;
        DownstreamPollDto downstreamPollDto = this.poll;
        DownstreamVoteDto downstreamVoteDto = this.poll_vote;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("VoteChangedEventDto(type=", str, ", cid=", str2, ", message_id=");
        sbM32001t.append(str3);
        sbM32001t.append(", created_at=");
        sbM32001t.append(exactDate);
        sbM32001t.append(", poll=");
        sbM32001t.append(downstreamPollDto);
        sbM32001t.append(", poll_vote=");
        sbM32001t.append(downstreamVoteDto);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
