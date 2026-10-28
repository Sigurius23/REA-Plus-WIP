package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;", "", "type", "", "count", "", "sumScore", "firstReactionAt", "Ljava/util/Date;", "lastReactionAt", "<init>", "(Ljava/lang/String;IILjava/util/Date;Ljava/util/Date;)V", "getType", "()Ljava/lang/String;", "getCount", "()I", "getSumScore", "getFirstReactionAt", "()Ljava/util/Date;", "getLastReactionAt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ReactionGroupEntity {
    private final int count;
    private final Date firstReactionAt;
    private final Date lastReactionAt;
    private final int sumScore;
    private final String type;

    public ReactionGroupEntity(String type, int i13, int i14, Date firstReactionAt, Date lastReactionAt) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(firstReactionAt, "firstReactionAt");
        AbstractC22676k.m65750j(lastReactionAt, "lastReactionAt");
        this.type = type;
        this.count = i13;
        this.sumScore = i14;
        this.firstReactionAt = firstReactionAt;
        this.lastReactionAt = lastReactionAt;
    }

    public static /* synthetic */ ReactionGroupEntity copy$default(ReactionGroupEntity reactionGroupEntity, String str, int i13, int i14, Date date, Date date2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = reactionGroupEntity.type;
        }
        if ((i15 & 2) != 0) {
            i13 = reactionGroupEntity.count;
        }
        if ((i15 & 4) != 0) {
            i14 = reactionGroupEntity.sumScore;
        }
        if ((i15 & 8) != 0) {
            date = reactionGroupEntity.firstReactionAt;
        }
        if ((i15 & 16) != 0) {
            date2 = reactionGroupEntity.lastReactionAt;
        }
        Date date3 = date2;
        int i16 = i14;
        return reactionGroupEntity.copy(str, i13, i16, date, date3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSumScore() {
        return this.sumScore;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getFirstReactionAt() {
        return this.firstReactionAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getLastReactionAt() {
        return this.lastReactionAt;
    }

    public final ReactionGroupEntity copy(String type, int count, int sumScore, Date firstReactionAt, Date lastReactionAt) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(firstReactionAt, "firstReactionAt");
        AbstractC22676k.m65750j(lastReactionAt, "lastReactionAt");
        return new ReactionGroupEntity(type, count, sumScore, firstReactionAt, lastReactionAt);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactionGroupEntity)) {
            return false;
        }
        ReactionGroupEntity reactionGroupEntity = (ReactionGroupEntity) other;
        return AbstractC22676k.m65745e(this.type, reactionGroupEntity.type) && this.count == reactionGroupEntity.count && this.sumScore == reactionGroupEntity.sumScore && AbstractC22676k.m65745e(this.firstReactionAt, reactionGroupEntity.firstReactionAt) && AbstractC22676k.m65745e(this.lastReactionAt, reactionGroupEntity.lastReactionAt);
    }

    public final int getCount() {
        return this.count;
    }

    public final Date getFirstReactionAt() {
        return this.firstReactionAt;
    }

    public final Date getLastReactionAt() {
        return this.lastReactionAt;
    }

    public final int getSumScore() {
        return this.sumScore;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.lastReactionAt.hashCode() + AbstractC38963t7.m124373c(this.firstReactionAt, AbstractC11266d.m30448b(this.sumScore, AbstractC11266d.m30448b(this.count, this.type.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String str = this.type;
        int i13 = this.count;
        int i14 = this.sumScore;
        Date date = this.firstReactionAt;
        Date date2 = this.lastReactionAt;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "ReactionGroupEntity(type=", str, ", count=", ", sumScore=");
        sbM30467u.append(i14);
        sbM30467u.append(", firstReactionAt=");
        sbM30467u.append(date);
        sbM30467u.append(", lastReactionAt=");
        return AbstractC13673n.m38564k(sbM30467u, date2, ")");
    }
}
