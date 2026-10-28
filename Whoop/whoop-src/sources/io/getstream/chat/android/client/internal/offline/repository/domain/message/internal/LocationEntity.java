package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import hc3.AbstractC17176i;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;", "", "cid", "", "messageId", "userId", "endAt", "Ljava/util/Date;", "latitude", "", "longitude", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;DDLjava/lang/String;)V", "getCid", "()Ljava/lang/String;", "getMessageId", "getUserId", "getEndAt", "()Ljava/util/Date;", "getLatitude", "()D", "getLongitude", "getDeviceId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class LocationEntity {
    private final String cid;
    private final String deviceId;
    private final Date endAt;
    private final double latitude;
    private final double longitude;
    private final String messageId;
    private final String userId;

    public LocationEntity() {
        this(null, null, null, null, 0.0d, 0.0d, null, 127, null);
    }

    public static /* synthetic */ LocationEntity copy$default(LocationEntity locationEntity, String str, String str2, String str3, Date date, double d3, double d14, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = locationEntity.cid;
        }
        if ((i13 & 2) != 0) {
            str2 = locationEntity.messageId;
        }
        if ((i13 & 4) != 0) {
            str3 = locationEntity.userId;
        }
        if ((i13 & 8) != 0) {
            date = locationEntity.endAt;
        }
        if ((i13 & 16) != 0) {
            d3 = locationEntity.latitude;
        }
        if ((i13 & 32) != 0) {
            d14 = locationEntity.longitude;
        }
        if ((i13 & 64) != 0) {
            str4 = locationEntity.deviceId;
        }
        String str5 = str4;
        double d15 = d14;
        double d16 = d3;
        return locationEntity.copy(str, str2, str3, date, d16, d15, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getEndAt() {
        return this.endAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final LocationEntity copy(String cid, String messageId, String userId, Date endAt, double latitude, double longitude, String deviceId) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(deviceId, "deviceId");
        return new LocationEntity(cid, messageId, userId, endAt, latitude, longitude, deviceId);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationEntity)) {
            return false;
        }
        LocationEntity locationEntity = (LocationEntity) other;
        return AbstractC22676k.m65745e(this.cid, locationEntity.cid) && AbstractC22676k.m65745e(this.messageId, locationEntity.messageId) && AbstractC22676k.m65745e(this.userId, locationEntity.userId) && AbstractC22676k.m65745e(this.endAt, locationEntity.endAt) && Double.compare(this.latitude, locationEntity.latitude) == 0 && Double.compare(this.longitude, locationEntity.longitude) == 0 && AbstractC22676k.m65745e(this.deviceId, locationEntity.deviceId);
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final Date getEndAt() {
        return this.endAt;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.cid.hashCode() * 31, 31, this.messageId), 31, this.userId);
        Date date = this.endAt;
        return this.deviceId.hashCode() + AbstractC17176i.m48499a(AbstractC17176i.m48499a((iM30450d + (date == null ? 0 : date.hashCode())) * 31, 31, this.latitude), 31, this.longitude);
    }

    public final String toString() {
        String str = this.cid;
        String str2 = this.messageId;
        String str3 = this.userId;
        Date date = this.endAt;
        double d3 = this.latitude;
        double d14 = this.longitude;
        String str4 = this.deviceId;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LocationEntity(cid=", str, ", messageId=", str2, ", userId=");
        AbstractC13673n.m38579z(sbM32001t, str3, ", endAt=", date, ", latitude=");
        sbM32001t.append(d3);
        AbstractC31061c.m95622B(sbM32001t, ", longitude=", d14, ", deviceId=");
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public LocationEntity(String cid, String messageId, String userId, Date date, double d3, double d14, String deviceId) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(deviceId, "deviceId");
        this.cid = cid;
        this.messageId = messageId;
        this.userId = userId;
        this.endAt = date;
        this.latitude = d3;
        this.longitude = d14;
        this.deviceId = deviceId;
    }

    public /* synthetic */ LocationEntity(String str, String str2, String str3, Date date, double d3, double d14, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : date, (i13 & 16) != 0 ? 0.0d : d3, (i13 & 32) != 0 ? 0.0d : d14, (i13 & 64) != 0 ? "" : str4);
    }
}
