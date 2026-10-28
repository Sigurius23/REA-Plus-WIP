package io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal;

import c13.AbstractC3855a;
import hc3.AbstractC17176i;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0081\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012HÆ\u0003J\t\u0010:\u001a\u00020\u0014HÆ\u0003J¡\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u0010<\u001a\u00020\u000e2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0007HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010-¨\u0006@"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;", "", "messageId", "", "userId", "type", "score", "", "createdAt", "Ljava/util/Date;", "createdLocallyAt", "updatedAt", "deletedAt", "enforceUnique", "", "skipPush", "emojiCode", "extraData", "", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;)V", "getMessageId", "()Ljava/lang/String;", "getUserId", "getType", "getScore", "()I", "getCreatedAt", "()Ljava/util/Date;", "getCreatedLocallyAt", "getUpdatedAt", "getDeletedAt", "getEnforceUnique", "()Z", "getSkipPush", "getEmojiCode", "getExtraData", "()Ljava/util/Map;", "getSyncStatus", "()Lio/getstream/chat/android/models/SyncStatus;", "id", "getId", "setId", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ReactionEntity {
    private final Date createdAt;
    private final Date createdLocallyAt;
    private final Date deletedAt;
    private final String emojiCode;
    private final boolean enforceUnique;
    private final Map<String, Object> extraData;
    private int id;
    private final String messageId;
    private final int score;
    private final boolean skipPush;
    private final SyncStatus syncStatus;
    private final String type;
    private final Date updatedAt;
    private final String userId;

    public ReactionEntity(String messageId, String userId, String type, int i13, Date date, Date date2, Date date3, Date date4, boolean z4, boolean z13, String str, Map<String, ? extends Object> extraData, SyncStatus syncStatus) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        this.messageId = messageId;
        this.userId = userId;
        this.type = type;
        this.score = i13;
        this.createdAt = date;
        this.createdLocallyAt = date2;
        this.updatedAt = date3;
        this.deletedAt = date4;
        this.enforceUnique = z4;
        this.skipPush = z13;
        this.emojiCode = str;
        this.extraData = extraData;
        this.syncStatus = syncStatus;
        this.id = type.hashCode() + userId.hashCode() + messageId.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReactionEntity copy$default(ReactionEntity reactionEntity, String str, String str2, String str3, int i13, Date date, Date date2, Date date3, Date date4, boolean z4, boolean z13, String str4, Map map, SyncStatus syncStatus, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = reactionEntity.messageId;
        }
        return reactionEntity.copy(str, (i14 & 2) != 0 ? reactionEntity.userId : str2, (i14 & 4) != 0 ? reactionEntity.type : str3, (i14 & 8) != 0 ? reactionEntity.score : i13, (i14 & 16) != 0 ? reactionEntity.createdAt : date, (i14 & 32) != 0 ? reactionEntity.createdLocallyAt : date2, (i14 & 64) != 0 ? reactionEntity.updatedAt : date3, (i14 & 128) != 0 ? reactionEntity.deletedAt : date4, (i14 & 256) != 0 ? reactionEntity.enforceUnique : z4, (i14 & 512) != 0 ? reactionEntity.skipPush : z13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? reactionEntity.emojiCode : str4, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? reactionEntity.extraData : map, (i14 & 4096) != 0 ? reactionEntity.syncStatus : syncStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getSkipPush() {
        return this.skipPush;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getEmojiCode() {
        return this.emojiCode;
    }

    public final Map<String, Object> component12() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getCreatedLocallyAt() {
        return this.createdLocallyAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getEnforceUnique() {
        return this.enforceUnique;
    }

    public final ReactionEntity copy(String messageId, String userId, String type, int score, Date createdAt, Date createdLocallyAt, Date updatedAt, Date deletedAt, boolean enforceUnique, boolean skipPush, String emojiCode, Map<String, ? extends Object> extraData, SyncStatus syncStatus) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        return new ReactionEntity(messageId, userId, type, score, createdAt, createdLocallyAt, updatedAt, deletedAt, enforceUnique, skipPush, emojiCode, extraData, syncStatus);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactionEntity)) {
            return false;
        }
        ReactionEntity reactionEntity = (ReactionEntity) other;
        return AbstractC22676k.m65745e(this.messageId, reactionEntity.messageId) && AbstractC22676k.m65745e(this.userId, reactionEntity.userId) && AbstractC22676k.m65745e(this.type, reactionEntity.type) && this.score == reactionEntity.score && AbstractC22676k.m65745e(this.createdAt, reactionEntity.createdAt) && AbstractC22676k.m65745e(this.createdLocallyAt, reactionEntity.createdLocallyAt) && AbstractC22676k.m65745e(this.updatedAt, reactionEntity.updatedAt) && AbstractC22676k.m65745e(this.deletedAt, reactionEntity.deletedAt) && this.enforceUnique == reactionEntity.enforceUnique && this.skipPush == reactionEntity.skipPush && AbstractC22676k.m65745e(this.emojiCode, reactionEntity.emojiCode) && AbstractC22676k.m65745e(this.extraData, reactionEntity.extraData) && this.syncStatus == reactionEntity.syncStatus;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getCreatedLocallyAt() {
        return this.createdLocallyAt;
    }

    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final String getEmojiCode() {
        return this.emojiCode;
    }

    public final boolean getEnforceUnique() {
        return this.enforceUnique;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final int getId() {
        return this.id;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final int getScore() {
        return this.score;
    }

    public final boolean getSkipPush() {
        return this.skipPush;
    }

    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public final String getType() {
        return this.type;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.score, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.messageId.hashCode() * 31, 31, this.userId), 31, this.type), 31);
        Date date = this.createdAt;
        int iHashCode = (iM30448b + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.createdLocallyAt;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.deletedAt;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode3 + (date4 == null ? 0 : date4.hashCode())) * 31, 31, this.enforceUnique), 31, this.skipPush);
        String str = this.emojiCode;
        return this.syncStatus.hashCode() + AbstractC3855a.m11821e(this.extraData, (iM8289b + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final void setId(int i13) {
        this.id = i13;
    }

    public final String toString() {
        String str = this.messageId;
        String str2 = this.userId;
        String str3 = this.type;
        int i13 = this.score;
        Date date = this.createdAt;
        Date date2 = this.createdLocallyAt;
        Date date3 = this.updatedAt;
        Date date4 = this.deletedAt;
        boolean z4 = this.enforceUnique;
        boolean z13 = this.skipPush;
        String str4 = this.emojiCode;
        Map<String, Object> map = this.extraData;
        SyncStatus syncStatus = this.syncStatus;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ReactionEntity(messageId=", str, ", userId=", str2, ", type=");
        AbstractC11266d.m30470x(i13, str3, ", score=", ", createdAt=", sbM32001t);
        AbstractC17176i.m48512n(sbM32001t, date, ", createdLocallyAt=", date2, ", updatedAt=");
        AbstractC17176i.m48512n(sbM32001t, date3, ", deletedAt=", date4, ", enforceUnique=");
        AbstractC38963t7.m124392v(sbM32001t, z4, ", skipPush=", z13, ", emojiCode=");
        AbstractC36095b.m114695w(sbM32001t, str4, ", extraData=", map, ", syncStatus=");
        sbM32001t.append(syncStatus);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ ReactionEntity(String str, String str2, String str3, int i13, Date date, Date date2, Date date3, Date date4, boolean z4, boolean z13, String str4, Map map, SyncStatus syncStatus, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i14 & 8) != 0 ? 1 : i13, (i14 & 16) != 0 ? null : date, (i14 & 32) != 0 ? null : date2, (i14 & 64) != 0 ? null : date3, (i14 & 128) != 0 ? null : date4, (i14 & 256) != 0 ? false : z4, (i14 & 512) != 0 ? false : z13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str4, map, syncStatus);
    }
}
