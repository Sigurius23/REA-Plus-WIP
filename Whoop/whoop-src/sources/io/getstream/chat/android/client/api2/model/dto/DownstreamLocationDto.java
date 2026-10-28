package io.getstream.chat.android.client.api2.model.dto;

import hc3.AbstractC17176i;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;", "", "channel_cid", "", "message_id", "user_id", "latitude", "", "longitude", "created_by_device_id", "end_at", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/util/Date;)V", "getChannel_cid", "()Ljava/lang/String;", "getMessage_id", "getUser_id", "getLatitude", "()D", "getLongitude", "getCreated_by_device_id", "getEnd_at", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamLocationDto {
    private final String channel_cid;
    private final String created_by_device_id;
    private final Date end_at;
    private final double latitude;
    private final double longitude;
    private final String message_id;
    private final String user_id;

    public DownstreamLocationDto(String channel_cid, String message_id, String user_id, double d3, double d14, String created_by_device_id, Date date) {
        AbstractC22676k.m65750j(channel_cid, "channel_cid");
        AbstractC22676k.m65750j(message_id, "message_id");
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(created_by_device_id, "created_by_device_id");
        this.channel_cid = channel_cid;
        this.message_id = message_id;
        this.user_id = user_id;
        this.latitude = d3;
        this.longitude = d14;
        this.created_by_device_id = created_by_device_id;
        this.end_at = date;
    }

    public static /* synthetic */ DownstreamLocationDto copy$default(DownstreamLocationDto downstreamLocationDto, String str, String str2, String str3, double d3, double d14, String str4, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = downstreamLocationDto.channel_cid;
        }
        if ((i13 & 2) != 0) {
            str2 = downstreamLocationDto.message_id;
        }
        if ((i13 & 4) != 0) {
            str3 = downstreamLocationDto.user_id;
        }
        if ((i13 & 8) != 0) {
            d3 = downstreamLocationDto.latitude;
        }
        if ((i13 & 16) != 0) {
            d14 = downstreamLocationDto.longitude;
        }
        if ((i13 & 32) != 0) {
            str4 = downstreamLocationDto.created_by_device_id;
        }
        if ((i13 & 64) != 0) {
            date = downstreamLocationDto.end_at;
        }
        double d15 = d14;
        double d16 = d3;
        String str5 = str3;
        return downstreamLocationDto.copy(str, str2, str5, d16, d15, str4, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel_cid() {
        return this.channel_cid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCreated_by_device_id() {
        return this.created_by_device_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getEnd_at() {
        return this.end_at;
    }

    public final DownstreamLocationDto copy(String channel_cid, String message_id, String user_id, double latitude, double longitude, String created_by_device_id, Date end_at) {
        AbstractC22676k.m65750j(channel_cid, "channel_cid");
        AbstractC22676k.m65750j(message_id, "message_id");
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(created_by_device_id, "created_by_device_id");
        return new DownstreamLocationDto(channel_cid, message_id, user_id, latitude, longitude, created_by_device_id, end_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamLocationDto)) {
            return false;
        }
        DownstreamLocationDto downstreamLocationDto = (DownstreamLocationDto) other;
        return AbstractC22676k.m65745e(this.channel_cid, downstreamLocationDto.channel_cid) && AbstractC22676k.m65745e(this.message_id, downstreamLocationDto.message_id) && AbstractC22676k.m65745e(this.user_id, downstreamLocationDto.user_id) && Double.compare(this.latitude, downstreamLocationDto.latitude) == 0 && Double.compare(this.longitude, downstreamLocationDto.longitude) == 0 && AbstractC22676k.m65745e(this.created_by_device_id, downstreamLocationDto.created_by_device_id) && AbstractC22676k.m65745e(this.end_at, downstreamLocationDto.end_at);
    }

    public final String getChannel_cid() {
        return this.channel_cid;
    }

    public final String getCreated_by_device_id() {
        return this.created_by_device_id;
    }

    public final Date getEnd_at() {
        return this.end_at;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.channel_cid.hashCode() * 31, 31, this.message_id), 31, this.user_id), 31, this.latitude), 31, this.longitude), 31, this.created_by_device_id);
        Date date = this.end_at;
        return iM30450d + (date == null ? 0 : date.hashCode());
    }

    public String toString() {
        String str = this.channel_cid;
        String str2 = this.message_id;
        String str3 = this.user_id;
        double d3 = this.latitude;
        double d14 = this.longitude;
        String str4 = this.created_by_device_id;
        Date date = this.end_at;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DownstreamLocationDto(channel_cid=", str, ", message_id=", str2, ", user_id=");
        sbM32001t.append(str3);
        sbM32001t.append(", latitude=");
        sbM32001t.append(d3);
        AbstractC31061c.m95622B(sbM32001t, ", longitude=", d14, ", created_by_device_id=");
        sbM32001t.append(str4);
        sbM32001t.append(", end_at=");
        sbM32001t.append(date);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
