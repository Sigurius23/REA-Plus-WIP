package io.getstream.chat.android.client.api2.model.requests;

import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JF\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/UpdateLiveLocationRequest;", "", "message_id", "", "latitude", "", "longitude", "created_by_device_id", "end_at", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/Date;)V", "getMessage_id", "()Ljava/lang/String;", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getCreated_by_device_id", "getEnd_at", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/requests/UpdateLiveLocationRequest;", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpdateLiveLocationRequest {
    private final String created_by_device_id;
    private final Date end_at;
    private final Double latitude;
    private final Double longitude;
    private final String message_id;

    public UpdateLiveLocationRequest(String message_id, Double d3, Double d14, String created_by_device_id, Date date) {
        AbstractC22676k.m65750j(message_id, "message_id");
        AbstractC22676k.m65750j(created_by_device_id, "created_by_device_id");
        this.message_id = message_id;
        this.latitude = d3;
        this.longitude = d14;
        this.created_by_device_id = created_by_device_id;
        this.end_at = date;
    }

    public static /* synthetic */ UpdateLiveLocationRequest copy$default(UpdateLiveLocationRequest updateLiveLocationRequest, String str, Double d3, Double d14, String str2, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = updateLiveLocationRequest.message_id;
        }
        if ((i13 & 2) != 0) {
            d3 = updateLiveLocationRequest.latitude;
        }
        if ((i13 & 4) != 0) {
            d14 = updateLiveLocationRequest.longitude;
        }
        if ((i13 & 8) != 0) {
            str2 = updateLiveLocationRequest.created_by_device_id;
        }
        if ((i13 & 16) != 0) {
            date = updateLiveLocationRequest.end_at;
        }
        Date date2 = date;
        Double d15 = d14;
        return updateLiveLocationRequest.copy(str, d3, d15, str2, date2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCreated_by_device_id() {
        return this.created_by_device_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getEnd_at() {
        return this.end_at;
    }

    public final UpdateLiveLocationRequest copy(String message_id, Double latitude, Double longitude, String created_by_device_id, Date end_at) {
        AbstractC22676k.m65750j(message_id, "message_id");
        AbstractC22676k.m65750j(created_by_device_id, "created_by_device_id");
        return new UpdateLiveLocationRequest(message_id, latitude, longitude, created_by_device_id, end_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateLiveLocationRequest)) {
            return false;
        }
        UpdateLiveLocationRequest updateLiveLocationRequest = (UpdateLiveLocationRequest) other;
        return AbstractC22676k.m65745e(this.message_id, updateLiveLocationRequest.message_id) && AbstractC22676k.m65745e(this.latitude, updateLiveLocationRequest.latitude) && AbstractC22676k.m65745e(this.longitude, updateLiveLocationRequest.longitude) && AbstractC22676k.m65745e(this.created_by_device_id, updateLiveLocationRequest.created_by_device_id) && AbstractC22676k.m65745e(this.end_at, updateLiveLocationRequest.end_at);
    }

    public final String getCreated_by_device_id() {
        return this.created_by_device_id;
    }

    public final Date getEnd_at() {
        return this.end_at;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public int hashCode() {
        int iHashCode = this.message_id.hashCode() * 31;
        Double d3 = this.latitude;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.longitude;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31, 31, this.created_by_device_id);
        Date date = this.end_at;
        return iM30450d + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        String str = this.message_id;
        Double d3 = this.latitude;
        Double d14 = this.longitude;
        String str2 = this.created_by_device_id;
        Date date = this.end_at;
        StringBuilder sb4 = new StringBuilder("UpdateLiveLocationRequest(message_id=");
        sb4.append(str);
        sb4.append(", latitude=");
        sb4.append(d3);
        sb4.append(", longitude=");
        sb4.append(d14);
        sb4.append(", created_by_device_id=");
        sb4.append(str2);
        sb4.append(", end_at=");
        return AbstractC13673n.m38564k(sb4, date, ")");
    }

    public /* synthetic */ UpdateLiveLocationRequest(String str, Double d3, Double d14, String str2, Date date, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : d3, (i13 & 4) != 0 ? null : d14, str2, (i13 & 16) != 0 ? null : date);
    }
}
