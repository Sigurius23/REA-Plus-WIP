package io.getstream.chat.android.client.api2.model.dto;

import com.whoop.service.network.model.UserState;
import hc3.AbstractC17176i;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jy\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001b¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamFlagDto;", "", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "target_user", "target_message_id", "", "created_at", "created_by_automod", "", "approved_at", "Ljava/util/Date;", "updated_at", "reviewed_at", "reviewed_by", "rejected_at", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getTarget_user", "getTarget_message_id", "()Ljava/lang/String;", "getCreated_at", "getCreated_by_automod", "()Z", "getApproved_at", "()Ljava/util/Date;", "getUpdated_at", "getReviewed_at", "getReviewed_by", "getRejected_at", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamFlagDto {
    private final Date approved_at;
    private final String created_at;
    private final boolean created_by_automod;
    private final Date rejected_at;
    private final Date reviewed_at;
    private final Date reviewed_by;
    private final String target_message_id;
    private final DownstreamUserDto target_user;
    private final Date updated_at;
    private final DownstreamUserDto user;

    public DownstreamFlagDto(DownstreamUserDto user, DownstreamUserDto downstreamUserDto, String str, String created_at, boolean z4, Date date, Date updated_at, Date date2, Date date3, Date date4) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        this.user = user;
        this.target_user = downstreamUserDto;
        this.target_message_id = str;
        this.created_at = created_at;
        this.created_by_automod = z4;
        this.approved_at = date;
        this.updated_at = updated_at;
        this.reviewed_at = date2;
        this.reviewed_by = date3;
        this.rejected_at = date4;
    }

    public static /* synthetic */ DownstreamFlagDto copy$default(DownstreamFlagDto downstreamFlagDto, DownstreamUserDto downstreamUserDto, DownstreamUserDto downstreamUserDto2, String str, String str2, boolean z4, Date date, Date date2, Date date3, Date date4, Date date5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            downstreamUserDto = downstreamFlagDto.user;
        }
        if ((i13 & 2) != 0) {
            downstreamUserDto2 = downstreamFlagDto.target_user;
        }
        if ((i13 & 4) != 0) {
            str = downstreamFlagDto.target_message_id;
        }
        if ((i13 & 8) != 0) {
            str2 = downstreamFlagDto.created_at;
        }
        if ((i13 & 16) != 0) {
            z4 = downstreamFlagDto.created_by_automod;
        }
        if ((i13 & 32) != 0) {
            date = downstreamFlagDto.approved_at;
        }
        if ((i13 & 64) != 0) {
            date2 = downstreamFlagDto.updated_at;
        }
        if ((i13 & 128) != 0) {
            date3 = downstreamFlagDto.reviewed_at;
        }
        if ((i13 & 256) != 0) {
            date4 = downstreamFlagDto.reviewed_by;
        }
        if ((i13 & 512) != 0) {
            date5 = downstreamFlagDto.rejected_at;
        }
        Date date6 = date4;
        Date date7 = date5;
        Date date8 = date2;
        Date date9 = date3;
        boolean z13 = z4;
        Date date10 = date;
        return downstreamFlagDto.copy(downstreamUserDto, downstreamUserDto2, str, str2, z13, date10, date8, date9, date6, date7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getRejected_at() {
        return this.rejected_at;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DownstreamUserDto getTarget_user() {
        return this.target_user;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTarget_message_id() {
        return this.target_message_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCreated_by_automod() {
        return this.created_by_automod;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getApproved_at() {
        return this.approved_at;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getReviewed_at() {
        return this.reviewed_at;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getReviewed_by() {
        return this.reviewed_by;
    }

    public final DownstreamFlagDto copy(DownstreamUserDto user, DownstreamUserDto target_user, String target_message_id, String created_at, boolean created_by_automod, Date approved_at, Date updated_at, Date reviewed_at, Date reviewed_by, Date rejected_at) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        return new DownstreamFlagDto(user, target_user, target_message_id, created_at, created_by_automod, approved_at, updated_at, reviewed_at, reviewed_by, rejected_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamFlagDto)) {
            return false;
        }
        DownstreamFlagDto downstreamFlagDto = (DownstreamFlagDto) other;
        return AbstractC22676k.m65745e(this.user, downstreamFlagDto.user) && AbstractC22676k.m65745e(this.target_user, downstreamFlagDto.target_user) && AbstractC22676k.m65745e(this.target_message_id, downstreamFlagDto.target_message_id) && AbstractC22676k.m65745e(this.created_at, downstreamFlagDto.created_at) && this.created_by_automod == downstreamFlagDto.created_by_automod && AbstractC22676k.m65745e(this.approved_at, downstreamFlagDto.approved_at) && AbstractC22676k.m65745e(this.updated_at, downstreamFlagDto.updated_at) && AbstractC22676k.m65745e(this.reviewed_at, downstreamFlagDto.reviewed_at) && AbstractC22676k.m65745e(this.reviewed_by, downstreamFlagDto.reviewed_by) && AbstractC22676k.m65745e(this.rejected_at, downstreamFlagDto.rejected_at);
    }

    public final Date getApproved_at() {
        return this.approved_at;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final boolean getCreated_by_automod() {
        return this.created_by_automod;
    }

    public final Date getRejected_at() {
        return this.rejected_at;
    }

    public final Date getReviewed_at() {
        return this.reviewed_at;
    }

    public final Date getReviewed_by() {
        return this.reviewed_by;
    }

    public final String getTarget_message_id() {
        return this.target_message_id;
    }

    public final DownstreamUserDto getTarget_user() {
        return this.target_user;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.user.hashCode() * 31;
        DownstreamUserDto downstreamUserDto = this.target_user;
        int iHashCode2 = (iHashCode + (downstreamUserDto == null ? 0 : downstreamUserDto.hashCode())) * 31;
        String str = this.target_message_id;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.created_at), 31, this.created_by_automod);
        Date date = this.approved_at;
        int iM124373c = AbstractC38963t7.m124373c(this.updated_at, (iM8289b + (date == null ? 0 : date.hashCode())) * 31, 31);
        Date date2 = this.reviewed_at;
        int iHashCode3 = (iM124373c + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.reviewed_by;
        int iHashCode4 = (iHashCode3 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.rejected_at;
        return iHashCode4 + (date4 != null ? date4.hashCode() : 0);
    }

    public String toString() {
        DownstreamUserDto downstreamUserDto = this.user;
        DownstreamUserDto downstreamUserDto2 = this.target_user;
        String str = this.target_message_id;
        String str2 = this.created_at;
        boolean z4 = this.created_by_automod;
        Date date = this.approved_at;
        Date date2 = this.updated_at;
        Date date3 = this.reviewed_at;
        Date date4 = this.reviewed_by;
        Date date5 = this.rejected_at;
        StringBuilder sb4 = new StringBuilder("DownstreamFlagDto(user=");
        sb4.append(downstreamUserDto);
        sb4.append(", target_user=");
        sb4.append(downstreamUserDto2);
        sb4.append(", target_message_id=");
        AbstractC11266d.m30444B(sb4, str, ", created_at=", str2, ", created_by_automod=");
        sb4.append(z4);
        sb4.append(", approved_at=");
        sb4.append(date);
        sb4.append(", updated_at=");
        AbstractC17176i.m48512n(sb4, date2, ", reviewed_at=", date3, ", reviewed_by=");
        sb4.append(date4);
        sb4.append(", rejected_at=");
        sb4.append(date5);
        sb4.append(")");
        return sb4.toString();
    }
}
