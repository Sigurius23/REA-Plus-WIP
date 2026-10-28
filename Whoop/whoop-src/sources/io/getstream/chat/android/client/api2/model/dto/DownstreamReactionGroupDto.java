package io.getstream.chat.android.client.api2.model.dto;

import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;", "", "count", "", "sum_scores", "first_reaction_at", "Ljava/util/Date;", "last_reaction_at", "<init>", "(IILjava/util/Date;Ljava/util/Date;)V", "getCount", "()I", "getSum_scores", "getFirst_reaction_at", "()Ljava/util/Date;", "getLast_reaction_at", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamReactionGroupDto {
    private final int count;
    private final Date first_reaction_at;
    private final Date last_reaction_at;
    private final int sum_scores;

    public DownstreamReactionGroupDto(int i13, int i14, Date first_reaction_at, Date last_reaction_at) {
        AbstractC22676k.m65750j(first_reaction_at, "first_reaction_at");
        AbstractC22676k.m65750j(last_reaction_at, "last_reaction_at");
        this.count = i13;
        this.sum_scores = i14;
        this.first_reaction_at = first_reaction_at;
        this.last_reaction_at = last_reaction_at;
    }

    public static /* synthetic */ DownstreamReactionGroupDto copy$default(DownstreamReactionGroupDto downstreamReactionGroupDto, int i13, int i14, Date date, Date date2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = downstreamReactionGroupDto.count;
        }
        if ((i15 & 2) != 0) {
            i14 = downstreamReactionGroupDto.sum_scores;
        }
        if ((i15 & 4) != 0) {
            date = downstreamReactionGroupDto.first_reaction_at;
        }
        if ((i15 & 8) != 0) {
            date2 = downstreamReactionGroupDto.last_reaction_at;
        }
        return downstreamReactionGroupDto.copy(i13, i14, date, date2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSum_scores() {
        return this.sum_scores;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getFirst_reaction_at() {
        return this.first_reaction_at;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getLast_reaction_at() {
        return this.last_reaction_at;
    }

    public final DownstreamReactionGroupDto copy(int count, int sum_scores, Date first_reaction_at, Date last_reaction_at) {
        AbstractC22676k.m65750j(first_reaction_at, "first_reaction_at");
        AbstractC22676k.m65750j(last_reaction_at, "last_reaction_at");
        return new DownstreamReactionGroupDto(count, sum_scores, first_reaction_at, last_reaction_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamReactionGroupDto)) {
            return false;
        }
        DownstreamReactionGroupDto downstreamReactionGroupDto = (DownstreamReactionGroupDto) other;
        return this.count == downstreamReactionGroupDto.count && this.sum_scores == downstreamReactionGroupDto.sum_scores && AbstractC22676k.m65745e(this.first_reaction_at, downstreamReactionGroupDto.first_reaction_at) && AbstractC22676k.m65745e(this.last_reaction_at, downstreamReactionGroupDto.last_reaction_at);
    }

    public final int getCount() {
        return this.count;
    }

    public final Date getFirst_reaction_at() {
        return this.first_reaction_at;
    }

    public final Date getLast_reaction_at() {
        return this.last_reaction_at;
    }

    public final int getSum_scores() {
        return this.sum_scores;
    }

    public int hashCode() {
        return this.last_reaction_at.hashCode() + AbstractC38963t7.m124373c(this.first_reaction_at, AbstractC11266d.m30448b(this.sum_scores, Integer.hashCode(this.count) * 31, 31), 31);
    }

    public String toString() {
        int i13 = this.count;
        int i14 = this.sum_scores;
        Date date = this.first_reaction_at;
        Date date2 = this.last_reaction_at;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "DownstreamReactionGroupDto(count=", ", sum_scores=", ", first_reaction_at=");
        sbM30465s.append(date);
        sbM30465s.append(", last_reaction_at=");
        sbM30465s.append(date2);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }
}
