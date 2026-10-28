package io.getstream.chat.android.models;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import hc3.AbstractC17176i;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import java.util.Date;
import java.util.Map;
import jh3.AbstractC21702c;
import m83.AbstractC25247g0;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001KB«\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u00102\u001a\u00020\u0004J\u0016\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u0001042\u0006\u00105\u001a\u00020\u0004H\u0016J\b\u00106\u001a\u000207H\u0007J\t\u00108\u001a\u00020\u0004HÆ\u0003J\t\u00109\u001a\u00020\u0004HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010<\u001a\u00020\u0004HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010A\u001a\u00020\u0011HÆ\u0003J\u0015\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\t\u0010C\u001a\u00020\u0016HÆ\u0003J\t\u0010D\u001a\u00020\u0016HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u00ad\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010G\u001a\u00020\u00162\b\u0010H\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010I\u001a\u00020\u0007HÖ\u0001J\t\u0010J\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0017\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0011\u00100\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b1\u0010\u001c¨\u0006L"}, m65681d2 = {"Lio/getstream/chat/android/models/Reaction;", "Lio/getstream/chat/android/models/CustomObject;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "messageId", "", "type", "score", "", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "userId", "createdAt", "Ljava/util/Date;", "createdLocallyAt", "updatedAt", "deletedAt", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "extraData", "", "", "enforceUnique", "", "skipPush", "emojiCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;Ljava/util/Map;ZZLjava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "getType", "getScore", "()I", "getUser", "()Lio/getstream/chat/android/models/User;", "getUserId", "getCreatedAt", "()Ljava/util/Date;", "getCreatedLocallyAt", "getUpdatedAt", "getDeletedAt", "getSyncStatus", "()Lio/getstream/chat/android/models/SyncStatus;", "getExtraData", "()Ljava/util/Map;", "getEnforceUnique", "()Z", "getSkipPush", "getEmojiCode", "id", "getId", "fetchUserId", "getComparableField", "", "fieldName", "newBuilder", "Lio/getstream/chat/android/models/Reaction$Builder;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "Builder", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Reaction implements CustomObject, ComparableFieldProvider {
    private final Date createdAt;
    private final Date createdLocallyAt;
    private final Date deletedAt;
    private final String emojiCode;
    private final boolean enforceUnique;
    private final Map<String, Object> extraData;
    private final String messageId;
    private final int score;
    private final boolean skipPush;
    private final SyncStatus syncStatus;
    private final String type;
    private final Date updatedAt;
    private final User user;
    private final String userId;

    public Reaction() {
        this(null, null, 0, null, null, null, null, null, null, null, null, false, false, null, 16383, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public final Map<String, Object> component11() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getEnforceUnique() {
        return this.enforceUnique;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getSkipPush() {
        return this.skipPush;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getEmojiCode() {
        return this.emojiCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getCreatedLocallyAt() {
        return this.createdLocallyAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final Reaction copy(String messageId, String type, int score, User user, String userId, Date createdAt, Date createdLocallyAt, Date updatedAt, Date deletedAt, SyncStatus syncStatus, Map<String, ? extends Object> extraData, boolean enforceUnique, boolean skipPush, String emojiCode) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new Reaction(messageId, type, score, user, userId, createdAt, createdLocallyAt, updatedAt, deletedAt, syncStatus, extraData, enforceUnique, skipPush, emojiCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Reaction)) {
            return false;
        }
        Reaction reaction = (Reaction) other;
        return AbstractC22676k.m65745e(this.messageId, reaction.messageId) && AbstractC22676k.m65745e(this.type, reaction.type) && this.score == reaction.score && AbstractC22676k.m65745e(this.user, reaction.user) && AbstractC22676k.m65745e(this.userId, reaction.userId) && AbstractC22676k.m65745e(this.createdAt, reaction.createdAt) && AbstractC22676k.m65745e(this.createdLocallyAt, reaction.createdLocallyAt) && AbstractC22676k.m65745e(this.updatedAt, reaction.updatedAt) && AbstractC22676k.m65745e(this.deletedAt, reaction.deletedAt) && this.syncStatus == reaction.syncStatus && AbstractC22676k.m65745e(this.extraData, reaction.extraData) && this.enforceUnique == reaction.enforceUnique && this.skipPush == reaction.skipPush && AbstractC22676k.m65745e(this.emojiCode, reaction.emojiCode);
    }

    public final String fetchUserId() {
        String id4;
        User user = this.user;
        return (user == null || (id4 = user.getId()) == null) ? this.userId : id4;
    }

    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    public Comparable<?> getComparableField(String fieldName) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        if (fieldName.equals("created_at") || fieldName.equals("createdAt")) {
            return this.createdAt;
        }
        Object obj = getExtraData().get(fieldName);
        if (obj instanceof Comparable) {
            return (Comparable) obj;
        }
        return null;
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

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t14) {
        return (T) super.getExtraValue(str, t14);
    }

    public final String getId() {
        return this.messageId + this.type + this.score + fetchUserId();
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

    public final User getUser() {
        return this.user;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.score, AbstractC11266d.m30450d(this.messageId.hashCode() * 31, 31, this.type), 31);
        User user = this.user;
        int iM30450d = AbstractC11266d.m30450d((iM30448b + (user == null ? 0 : user.hashCode())) * 31, 31, this.userId);
        Date date = this.createdAt;
        int iHashCode = (iM30450d + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.createdLocallyAt;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.deletedAt;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.extraData, (this.syncStatus.hashCode() + ((iHashCode3 + (date4 == null ? 0 : date4.hashCode())) * 31)) * 31, 31), 31, this.enforceUnique), 31, this.skipPush);
        String str = this.emojiCode;
        return iM8289b + (str != null ? str.hashCode() : 0);
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.messageId;
        String str2 = this.type;
        int i13 = this.score;
        User user = this.user;
        String str3 = this.userId;
        Date date = this.createdAt;
        Date date2 = this.createdLocallyAt;
        Date date3 = this.updatedAt;
        Date date4 = this.deletedAt;
        SyncStatus syncStatus = this.syncStatus;
        Map<String, Object> map = this.extraData;
        boolean z4 = this.enforceUnique;
        boolean z13 = this.skipPush;
        String str4 = this.emojiCode;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Reaction(messageId=", str, ", type=", str2, ", score=");
        sbM32001t.append(i13);
        sbM32001t.append(", user=");
        sbM32001t.append(user);
        sbM32001t.append(", userId=");
        AbstractC13673n.m38579z(sbM32001t, str3, ", createdAt=", date, ", createdLocallyAt=");
        AbstractC17176i.m48512n(sbM32001t, date2, ", updatedAt=", date3, ", deletedAt=");
        sbM32001t.append(date4);
        sbM32001t.append(", syncStatus=");
        sbM32001t.append(syncStatus);
        sbM32001t.append(", extraData=");
        sbM32001t.append(map);
        sbM32001t.append(", enforceUnique=");
        sbM32001t.append(z4);
        sbM32001t.append(", skipPush=");
        return AbstractC21702c.m61139j(sbM32001t, z13, ", emojiCode=", str4, ")");
    }

    public Reaction(String messageId, String type, int i13, User user, String userId, Date date, Date date2, Date date3, Date date4, SyncStatus syncStatus, Map<String, ? extends Object> extraData, boolean z4, boolean z13, String str) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.messageId = messageId;
        this.type = type;
        this.score = i13;
        this.user = user;
        this.userId = userId;
        this.createdAt = date;
        this.createdLocallyAt = date2;
        this.updatedAt = date3;
        this.deletedAt = date4;
        this.syncStatus = syncStatus;
        this.extraData = extraData;
        this.enforceUnique = z4;
        this.skipPush = z13;
        this.emojiCode = str;
    }

    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bJ\u0010\u0010 \u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010!\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010J\u0010\u0010#\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u001a\u0010%\u001a\u00020\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0017J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010'\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\bJ\u0006\u0010(\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/models/Reaction$Builder;", "", "<init>", "()V", "reaction", "Lio/getstream/chat/android/models/Reaction;", "(Lio/getstream/chat/android/models/Reaction;)V", "messageId", "", "type", "score", "", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "userId", "createdAt", "Ljava/util/Date;", "createdLocallyAt", "updatedAt", "deletedAt", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "extraData", "", "enforceUnique", "", "emojiCode", "withMessageId", "withType", "withScore", "withUser", "withUserId", "withCreatedAt", "withCreatedLocallyAt", "withUpdatedAt", "withDeletedAt", "withSyncStatus", "withExtraData", "withEnforceUnique", "withEmojiCode", "build", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private Date createdAt;
        private Date createdLocallyAt;
        private Date deletedAt;
        private String emojiCode;
        private boolean enforceUnique;
        private Map<String, ? extends Object> extraData;
        private String messageId;
        private int score;
        private SyncStatus syncStatus;
        private String type;
        private Date updatedAt;
        private User user;
        private String userId;

        public Builder() {
            this.messageId = "";
            this.type = "";
            this.userId = "";
            this.syncStatus = SyncStatus.COMPLETED;
            this.extraData = C25272z.f99163w;
        }

        public final Reaction build() {
            return new Reaction(this.messageId, this.type, this.score, this.user, this.userId, this.createdAt, this.createdLocallyAt, this.updatedAt, this.deletedAt, this.syncStatus, AbstractC25247g0.m74003l0(this.extraData), this.enforceUnique, false, this.emojiCode, 4096, null);
        }

        public final Builder messageId(String messageId) {
            AbstractC22676k.m65750j(messageId, "messageId");
            this.messageId = messageId;
            return this;
        }

        public final Builder withCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public final Builder withCreatedLocallyAt(Date createdLocallyAt) {
            this.createdLocallyAt = createdLocallyAt;
            return this;
        }

        public final Builder withDeletedAt(Date deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public final Builder withEmojiCode(String emojiCode) {
            this.emojiCode = emojiCode;
            return this;
        }

        public final Builder withEnforceUnique(boolean enforceUnique) {
            this.enforceUnique = enforceUnique;
            return this;
        }

        public final Builder withExtraData(Map<String, ? extends Object> extraData) {
            AbstractC22676k.m65750j(extraData, "extraData");
            this.extraData = extraData;
            return this;
        }

        public final Builder withMessageId(String messageId) {
            AbstractC22676k.m65750j(messageId, "messageId");
            this.messageId = messageId;
            return this;
        }

        public final Builder withScore(int score) {
            this.score = score;
            return this;
        }

        public final Builder withSyncStatus(SyncStatus syncStatus) {
            AbstractC22676k.m65750j(syncStatus, "syncStatus");
            this.syncStatus = syncStatus;
            return this;
        }

        public final Builder withType(String type) {
            AbstractC22676k.m65750j(type, "type");
            this.type = type;
            return this;
        }

        public final Builder withUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public final Builder withUser(User user) {
            this.user = user;
            return this;
        }

        public final Builder withUserId(String userId) {
            AbstractC22676k.m65750j(userId, "userId");
            this.userId = userId;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Reaction reaction) {
            this();
            AbstractC22676k.m65750j(reaction, "reaction");
            this.messageId = reaction.getMessageId();
            this.type = reaction.getType();
            this.score = reaction.getScore();
            this.user = reaction.getUser();
            this.userId = reaction.getUserId();
            this.createdAt = reaction.getCreatedAt();
            this.createdLocallyAt = reaction.getCreatedLocallyAt();
            this.updatedAt = reaction.getUpdatedAt();
            this.deletedAt = reaction.getDeletedAt();
            this.syncStatus = reaction.getSyncStatus();
            this.extraData = reaction.getExtraData();
            this.enforceUnique = reaction.getEnforceUnique();
            this.emojiCode = reaction.getEmojiCode();
        }
    }

    public /* synthetic */ Reaction(String str, String str2, int i13, User user, String str3, Date date, Date date2, Date date3, Date date4, SyncStatus syncStatus, Map map, boolean z4, boolean z13, String str4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? null : user, (i14 & 16) == 0 ? str3 : "", (i14 & 32) != 0 ? null : date, (i14 & 64) != 0 ? null : date2, (i14 & 128) != 0 ? null : date3, (i14 & 256) != 0 ? null : date4, (i14 & 512) != 0 ? SyncStatus.COMPLETED : syncStatus, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C25272z.f99163w : map, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z4, (i14 & 4096) == 0 ? z13 : false, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str4);
    }
}
