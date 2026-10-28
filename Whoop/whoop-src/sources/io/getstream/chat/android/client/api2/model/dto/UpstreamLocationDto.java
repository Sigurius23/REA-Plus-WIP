package io.getstream.chat.android.client.api2.model.dto;

import hc3.AbstractC17176i;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;", "", "latitude", "", "longitude", "created_by_device_id", "", "end_at", "Ljava/util/Date;", "<init>", "(DDLjava/lang/String;Ljava/util/Date;)V", "getLatitude", "()D", "getLongitude", "getCreated_by_device_id", "()Ljava/lang/String;", "getEnd_at", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpstreamLocationDto {
    private final String created_by_device_id;
    private final Date end_at;
    private final double latitude;
    private final double longitude;

    public UpstreamLocationDto(double d3, double d14, String created_by_device_id, Date date) {
        AbstractC22676k.m65750j(created_by_device_id, "created_by_device_id");
        this.latitude = d3;
        this.longitude = d14;
        this.created_by_device_id = created_by_device_id;
        this.end_at = date;
    }

    public static /* synthetic */ UpstreamLocationDto copy$default(UpstreamLocationDto upstreamLocationDto, double d3, double d14, String str, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = upstreamLocationDto.latitude;
        }
        double d15 = d3;
        if ((i13 & 2) != 0) {
            d14 = upstreamLocationDto.longitude;
        }
        double d16 = d14;
        if ((i13 & 4) != 0) {
            str = upstreamLocationDto.created_by_device_id;
        }
        String str2 = str;
        if ((i13 & 8) != 0) {
            date = upstreamLocationDto.end_at;
        }
        return upstreamLocationDto.copy(d15, d16, str2, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCreated_by_device_id() {
        return this.created_by_device_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getEnd_at() {
        return this.end_at;
    }

    public final UpstreamLocationDto copy(double latitude, double longitude, String created_by_device_id, Date end_at) {
        AbstractC22676k.m65750j(created_by_device_id, "created_by_device_id");
        return new UpstreamLocationDto(latitude, longitude, created_by_device_id, end_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpstreamLocationDto)) {
            return false;
        }
        UpstreamLocationDto upstreamLocationDto = (UpstreamLocationDto) other;
        return Double.compare(this.latitude, upstreamLocationDto.latitude) == 0 && Double.compare(this.longitude, upstreamLocationDto.longitude) == 0 && AbstractC22676k.m65745e(this.created_by_device_id, upstreamLocationDto.created_by_device_id) && AbstractC22676k.m65745e(this.end_at, upstreamLocationDto.end_at);
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

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC17176i.m48499a(Double.hashCode(this.latitude) * 31, 31, this.longitude), 31, this.created_by_device_id);
        Date date = this.end_at;
        return iM30450d + (date == null ? 0 : date.hashCode());
    }

    public String toString() {
        double d3 = this.latitude;
        double d14 = this.longitude;
        String str = this.created_by_device_id;
        Date date = this.end_at;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("UpstreamLocationDto(latitude=", d3, ", longitude=");
        sbM8306s.append(d14);
        sbM8306s.append(", created_by_device_id=");
        sbM8306s.append(str);
        sbM8306s.append(", end_at=");
        sbM8306s.append(date);
        sbM8306s.append(")");
        return sbM8306s.toString();
    }
}
