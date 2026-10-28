package io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003JG\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;", "", "userId", "", "activeChannelIds", "", "lastSyncedAt", "Ljava/util/Date;", "rawLastSyncedAt", "markedAllReadAt", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getActiveChannelIds", "()Ljava/util/List;", "setActiveChannelIds", "(Ljava/util/List;)V", "getLastSyncedAt", "()Ljava/util/Date;", "setLastSyncedAt", "(Ljava/util/Date;)V", "getRawLastSyncedAt", "setRawLastSyncedAt", "getMarkedAllReadAt", "setMarkedAllReadAt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SyncStateEntity {
    private List<String> activeChannelIds;
    private Date lastSyncedAt;
    private Date markedAllReadAt;
    private String rawLastSyncedAt;
    private String userId;

    public SyncStateEntity(String userId, List<String> activeChannelIds, Date date, String str, Date date2) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(activeChannelIds, "activeChannelIds");
        this.userId = userId;
        this.activeChannelIds = activeChannelIds;
        this.lastSyncedAt = date;
        this.rawLastSyncedAt = str;
        this.markedAllReadAt = date2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncStateEntity copy$default(SyncStateEntity syncStateEntity, String str, List list, Date date, String str2, Date date2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = syncStateEntity.userId;
        }
        if ((i13 & 2) != 0) {
            list = syncStateEntity.activeChannelIds;
        }
        if ((i13 & 4) != 0) {
            date = syncStateEntity.lastSyncedAt;
        }
        if ((i13 & 8) != 0) {
            str2 = syncStateEntity.rawLastSyncedAt;
        }
        if ((i13 & 16) != 0) {
            date2 = syncStateEntity.markedAllReadAt;
        }
        Date date3 = date2;
        Date date4 = date;
        return syncStateEntity.copy(str, list, date4, str2, date3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final List<String> component2() {
        return this.activeChannelIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getLastSyncedAt() {
        return this.lastSyncedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRawLastSyncedAt() {
        return this.rawLastSyncedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getMarkedAllReadAt() {
        return this.markedAllReadAt;
    }

    public final SyncStateEntity copy(String userId, List<String> activeChannelIds, Date lastSyncedAt, String rawLastSyncedAt, Date markedAllReadAt) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(activeChannelIds, "activeChannelIds");
        return new SyncStateEntity(userId, activeChannelIds, lastSyncedAt, rawLastSyncedAt, markedAllReadAt);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncStateEntity)) {
            return false;
        }
        SyncStateEntity syncStateEntity = (SyncStateEntity) other;
        return AbstractC22676k.m65745e(this.userId, syncStateEntity.userId) && AbstractC22676k.m65745e(this.activeChannelIds, syncStateEntity.activeChannelIds) && AbstractC22676k.m65745e(this.lastSyncedAt, syncStateEntity.lastSyncedAt) && AbstractC22676k.m65745e(this.rawLastSyncedAt, syncStateEntity.rawLastSyncedAt) && AbstractC22676k.m65745e(this.markedAllReadAt, syncStateEntity.markedAllReadAt);
    }

    public final List<String> getActiveChannelIds() {
        return this.activeChannelIds;
    }

    public final Date getLastSyncedAt() {
        return this.lastSyncedAt;
    }

    public final Date getMarkedAllReadAt() {
        return this.markedAllReadAt;
    }

    public final String getRawLastSyncedAt() {
        return this.rawLastSyncedAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.userId.hashCode() * 31, 31, this.activeChannelIds);
        Date date = this.lastSyncedAt;
        int iHashCode = (iM31983b + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.rawLastSyncedAt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Date date2 = this.markedAllReadAt;
        return iHashCode2 + (date2 != null ? date2.hashCode() : 0);
    }

    public final void setActiveChannelIds(List<String> list) {
        AbstractC22676k.m65750j(list, "<set-?>");
        this.activeChannelIds = list;
    }

    public final void setLastSyncedAt(Date date) {
        this.lastSyncedAt = date;
    }

    public final void setMarkedAllReadAt(Date date) {
        this.markedAllReadAt = date;
    }

    public final void setRawLastSyncedAt(String str) {
        this.rawLastSyncedAt = str;
    }

    public final void setUserId(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.userId = str;
    }

    public final String toString() {
        String str = this.userId;
        List<String> list = this.activeChannelIds;
        Date date = this.lastSyncedAt;
        String str2 = this.rawLastSyncedAt;
        Date date2 = this.markedAllReadAt;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("SyncStateEntity(userId=", str, ", activeChannelIds=", ", lastSyncedAt=", list);
        sbM94766o.append(date);
        sbM94766o.append(", rawLastSyncedAt=");
        sbM94766o.append(str2);
        sbM94766o.append(", markedAllReadAt=");
        return AbstractC13673n.m38564k(sbM94766o, date2, ")");
    }

    public /* synthetic */ SyncStateEntity(String str, List list, Date date, String str2, Date date2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? new ArrayList() : list, (i13 & 4) != 0 ? null : date, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : date2);
    }
}
