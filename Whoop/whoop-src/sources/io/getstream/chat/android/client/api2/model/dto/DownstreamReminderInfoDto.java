package io.getstream.chat.android.client.api2.model.dto;

import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;", "", "remind_at", "Ljava/util/Date;", "created_at", "updated_at", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getRemind_at", "()Ljava/util/Date;", "getCreated_at", "getUpdated_at", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamReminderInfoDto {
    private final Date created_at;
    private final Date remind_at;
    private final Date updated_at;

    public DownstreamReminderInfoDto(Date date, Date created_at, Date updated_at) {
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        this.remind_at = date;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public static /* synthetic */ DownstreamReminderInfoDto copy$default(DownstreamReminderInfoDto downstreamReminderInfoDto, Date date, Date date2, Date date3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            date = downstreamReminderInfoDto.remind_at;
        }
        if ((i13 & 2) != 0) {
            date2 = downstreamReminderInfoDto.created_at;
        }
        if ((i13 & 4) != 0) {
            date3 = downstreamReminderInfoDto.updated_at;
        }
        return downstreamReminderInfoDto.copy(date, date2, date3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getRemind_at() {
        return this.remind_at;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final DownstreamReminderInfoDto copy(Date remind_at, Date created_at, Date updated_at) {
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        return new DownstreamReminderInfoDto(remind_at, created_at, updated_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamReminderInfoDto)) {
            return false;
        }
        DownstreamReminderInfoDto downstreamReminderInfoDto = (DownstreamReminderInfoDto) other;
        return AbstractC22676k.m65745e(this.remind_at, downstreamReminderInfoDto.remind_at) && AbstractC22676k.m65745e(this.created_at, downstreamReminderInfoDto.created_at) && AbstractC22676k.m65745e(this.updated_at, downstreamReminderInfoDto.updated_at);
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final Date getRemind_at() {
        return this.remind_at;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public int hashCode() {
        Date date = this.remind_at;
        return this.updated_at.hashCode() + AbstractC38963t7.m124373c(this.created_at, (date == null ? 0 : date.hashCode()) * 31, 31);
    }

    public String toString() {
        Date date = this.remind_at;
        Date date2 = this.created_at;
        Date date3 = this.updated_at;
        StringBuilder sb4 = new StringBuilder("DownstreamReminderInfoDto(remind_at=");
        sb4.append(date);
        sb4.append(", created_at=");
        sb4.append(date2);
        sb4.append(", updated_at=");
        return AbstractC13673n.m38564k(sb4, date3, ")");
    }
}
