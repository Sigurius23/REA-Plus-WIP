package io.getstream.chat.android.client.api2.model.dto;

import com.whoop.service.network.model.UserState;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;", "", "user_id", "", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "last_thread_message_at", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Date;)V", "getUser_id", "()Ljava/lang/String;", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getLast_thread_message_at", "()Ljava/util/Date;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamThreadParticipantDto {
    private final Date last_thread_message_at;
    private final DownstreamUserDto user;
    private final String user_id;

    public DownstreamThreadParticipantDto(String user_id, DownstreamUserDto downstreamUserDto, Date date) {
        AbstractC22676k.m65750j(user_id, "user_id");
        this.user_id = user_id;
        this.user = downstreamUserDto;
        this.last_thread_message_at = date;
    }

    public static /* synthetic */ DownstreamThreadParticipantDto copy$default(DownstreamThreadParticipantDto downstreamThreadParticipantDto, String str, DownstreamUserDto downstreamUserDto, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = downstreamThreadParticipantDto.user_id;
        }
        if ((i13 & 2) != 0) {
            downstreamUserDto = downstreamThreadParticipantDto.user;
        }
        if ((i13 & 4) != 0) {
            date = downstreamThreadParticipantDto.last_thread_message_at;
        }
        return downstreamThreadParticipantDto.copy(str, downstreamUserDto, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getLast_thread_message_at() {
        return this.last_thread_message_at;
    }

    public final DownstreamThreadParticipantDto copy(String user_id, DownstreamUserDto user, Date last_thread_message_at) {
        AbstractC22676k.m65750j(user_id, "user_id");
        return new DownstreamThreadParticipantDto(user_id, user, last_thread_message_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamThreadParticipantDto)) {
            return false;
        }
        DownstreamThreadParticipantDto downstreamThreadParticipantDto = (DownstreamThreadParticipantDto) other;
        return AbstractC22676k.m65745e(this.user_id, downstreamThreadParticipantDto.user_id) && AbstractC22676k.m65745e(this.user, downstreamThreadParticipantDto.user) && AbstractC22676k.m65745e(this.last_thread_message_at, downstreamThreadParticipantDto.last_thread_message_at);
    }

    public final Date getLast_thread_message_at() {
        return this.last_thread_message_at;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        int iHashCode = this.user_id.hashCode() * 31;
        DownstreamUserDto downstreamUserDto = this.user;
        int iHashCode2 = (iHashCode + (downstreamUserDto == null ? 0 : downstreamUserDto.hashCode())) * 31;
        Date date = this.last_thread_message_at;
        return iHashCode2 + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        String str = this.user_id;
        DownstreamUserDto downstreamUserDto = this.user;
        Date date = this.last_thread_message_at;
        StringBuilder sb4 = new StringBuilder("DownstreamThreadParticipantDto(user_id=");
        sb4.append(str);
        sb4.append(", user=");
        sb4.append(downstreamUserDto);
        sb4.append(", last_thread_message_at=");
        return AbstractC13673n.m38564k(sb4, date, ")");
    }
}
