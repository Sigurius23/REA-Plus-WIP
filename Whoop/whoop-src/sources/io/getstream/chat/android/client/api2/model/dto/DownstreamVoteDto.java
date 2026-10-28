package io.getstream.chat.android.client.api2.model.dto;

import com.whoop.service.network.model.UserState;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30737t;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jp\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\f\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "", "id", "", "poll_id", "option_id", "created_at", "Ljava/util/Date;", "updated_at", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "user_id", "is_answer", "", "answer_text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPoll_id", "getOption_id", "getCreated_at", "()Ljava/util/Date;", "getUpdated_at", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getUser_id", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAnswer_text", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamVoteDto {
    private final String answer_text;
    private final Date created_at;
    private final String id;
    private final Boolean is_answer;
    private final String option_id;
    private final String poll_id;
    private final Date updated_at;
    private final DownstreamUserDto user;
    private final String user_id;

    public DownstreamVoteDto(String id4, String poll_id, String option_id, Date created_at, Date updated_at, DownstreamUserDto downstreamUserDto, String str, Boolean bool, String str2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(poll_id, "poll_id");
        AbstractC22676k.m65750j(option_id, "option_id");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        this.id = id4;
        this.poll_id = poll_id;
        this.option_id = option_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.user = downstreamUserDto;
        this.user_id = str;
        this.is_answer = bool;
        this.answer_text = str2;
    }

    public static /* synthetic */ DownstreamVoteDto copy$default(DownstreamVoteDto downstreamVoteDto, String str, String str2, String str3, Date date, Date date2, DownstreamUserDto downstreamUserDto, String str4, Boolean bool, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = downstreamVoteDto.id;
        }
        if ((i13 & 2) != 0) {
            str2 = downstreamVoteDto.poll_id;
        }
        if ((i13 & 4) != 0) {
            str3 = downstreamVoteDto.option_id;
        }
        if ((i13 & 8) != 0) {
            date = downstreamVoteDto.created_at;
        }
        if ((i13 & 16) != 0) {
            date2 = downstreamVoteDto.updated_at;
        }
        if ((i13 & 32) != 0) {
            downstreamUserDto = downstreamVoteDto.user;
        }
        if ((i13 & 64) != 0) {
            str4 = downstreamVoteDto.user_id;
        }
        if ((i13 & 128) != 0) {
            bool = downstreamVoteDto.is_answer;
        }
        if ((i13 & 256) != 0) {
            str5 = downstreamVoteDto.answer_text;
        }
        Boolean bool2 = bool;
        String str6 = str5;
        DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
        String str7 = str4;
        Date date3 = date2;
        String str8 = str3;
        return downstreamVoteDto.copy(str, str2, str8, date, date3, downstreamUserDto2, str7, bool2, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPoll_id() {
        return this.poll_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOption_id() {
        return this.option_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIs_answer() {
        return this.is_answer;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAnswer_text() {
        return this.answer_text;
    }

    public final DownstreamVoteDto copy(String id4, String poll_id, String option_id, Date created_at, Date updated_at, DownstreamUserDto user, String user_id, Boolean is_answer, String answer_text) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(poll_id, "poll_id");
        AbstractC22676k.m65750j(option_id, "option_id");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        return new DownstreamVoteDto(id4, poll_id, option_id, created_at, updated_at, user, user_id, is_answer, answer_text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamVoteDto)) {
            return false;
        }
        DownstreamVoteDto downstreamVoteDto = (DownstreamVoteDto) other;
        return AbstractC22676k.m65745e(this.id, downstreamVoteDto.id) && AbstractC22676k.m65745e(this.poll_id, downstreamVoteDto.poll_id) && AbstractC22676k.m65745e(this.option_id, downstreamVoteDto.option_id) && AbstractC22676k.m65745e(this.created_at, downstreamVoteDto.created_at) && AbstractC22676k.m65745e(this.updated_at, downstreamVoteDto.updated_at) && AbstractC22676k.m65745e(this.user, downstreamVoteDto.user) && AbstractC22676k.m65745e(this.user_id, downstreamVoteDto.user_id) && AbstractC22676k.m65745e(this.is_answer, downstreamVoteDto.is_answer) && AbstractC22676k.m65745e(this.answer_text, downstreamVoteDto.answer_text);
    }

    public final String getAnswer_text() {
        return this.answer_text;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOption_id() {
        return this.option_id;
    }

    public final String getPoll_id() {
        return this.poll_id;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.updated_at, AbstractC38963t7.m124373c(this.created_at, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.poll_id), 31, this.option_id), 31), 31);
        DownstreamUserDto downstreamUserDto = this.user;
        int iHashCode = (iM124373c + (downstreamUserDto == null ? 0 : downstreamUserDto.hashCode())) * 31;
        String str = this.user_id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.is_answer;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.answer_text;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Boolean is_answer() {
        return this.is_answer;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.poll_id;
        String str3 = this.option_id;
        Date date = this.created_at;
        Date date2 = this.updated_at;
        DownstreamUserDto downstreamUserDto = this.user;
        String str4 = this.user_id;
        Boolean bool = this.is_answer;
        String str5 = this.answer_text;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DownstreamVoteDto(id=", str, ", poll_id=", str2, ", option_id=");
        AbstractC13673n.m38579z(sbM32001t, str3, ", created_at=", date, ", updated_at=");
        sbM32001t.append(date2);
        sbM32001t.append(", user=");
        sbM32001t.append(downstreamUserDto);
        sbM32001t.append(", user_id=");
        AbstractC36095b.m114692t(bool, str4, ", is_answer=", ", answer_text=", sbM32001t);
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }
}
