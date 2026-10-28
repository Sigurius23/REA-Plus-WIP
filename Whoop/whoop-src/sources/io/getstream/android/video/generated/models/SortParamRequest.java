package io.getstream.android.video.generated.models;

import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SortParamRequest;", "", "direction", "", "field", "", "type", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getDirection", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getField", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/android/video/generated/models/SortParamRequest;", "equals", "", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SortParamRequest {
    private final Integer direction;
    private final String field;
    private final String type;

    public SortParamRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SortParamRequest copy$default(SortParamRequest sortParamRequest, Integer num, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = sortParamRequest.direction;
        }
        if ((i13 & 2) != 0) {
            str = sortParamRequest.field;
        }
        if ((i13 & 4) != 0) {
            str2 = sortParamRequest.type;
        }
        return sortParamRequest.copy(num, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getDirection() {
        return this.direction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getField() {
        return this.field;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final SortParamRequest copy(@InterfaceC30731q(name = "direction") Integer direction, @InterfaceC30731q(name = "field") String field, @InterfaceC30731q(name = "type") String type) {
        return new SortParamRequest(direction, field, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SortParamRequest)) {
            return false;
        }
        SortParamRequest sortParamRequest = (SortParamRequest) other;
        return AbstractC22676k.m65745e(this.direction, sortParamRequest.direction) && AbstractC22676k.m65745e(this.field, sortParamRequest.field) && AbstractC22676k.m65745e(this.type, sortParamRequest.type);
    }

    public final Integer getDirection() {
        return this.direction;
    }

    public final String getField() {
        return this.field;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.direction;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.field;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.type, ")", AbstractC31061c.m95643s("SortParamRequest(direction=", ", field=", this.direction, this.field, ", type="));
    }

    public SortParamRequest(@InterfaceC30731q(name = "direction") Integer num, @InterfaceC30731q(name = "field") String str, @InterfaceC30731q(name = "type") String str2) {
        this.direction = num;
        this.field = str;
        this.type = str2;
    }

    public /* synthetic */ SortParamRequest(Integer num, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2);
    }
}
