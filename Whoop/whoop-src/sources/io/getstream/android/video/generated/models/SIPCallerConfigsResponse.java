package io.getstream.android.video.generated.models;

import java.util.Map;
import m83.C25272z;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003J+\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SIPCallerConfigsResponse;", "", "id", "", "customData", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getCustomData", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SIPCallerConfigsResponse {
    private final Map<String, Object> customData;
    private final String id;

    public SIPCallerConfigsResponse(@InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "custom_data") Map<String, ? extends Object> customData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(customData, "customData");
        this.id = id4;
        this.customData = customData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SIPCallerConfigsResponse copy$default(SIPCallerConfigsResponse sIPCallerConfigsResponse, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sIPCallerConfigsResponse.id;
        }
        if ((i13 & 2) != 0) {
            map = sIPCallerConfigsResponse.customData;
        }
        return sIPCallerConfigsResponse.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<String, Object> component2() {
        return this.customData;
    }

    public final SIPCallerConfigsResponse copy(@InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "custom_data") Map<String, ? extends Object> customData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(customData, "customData");
        return new SIPCallerConfigsResponse(id4, customData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SIPCallerConfigsResponse)) {
            return false;
        }
        SIPCallerConfigsResponse sIPCallerConfigsResponse = (SIPCallerConfigsResponse) other;
        return AbstractC22676k.m65745e(this.id, sIPCallerConfigsResponse.id) && AbstractC22676k.m65745e(this.customData, sIPCallerConfigsResponse.customData);
    }

    public final Map<String, Object> getCustomData() {
        return this.customData;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.customData.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114680h("SIPCallerConfigsResponse(id=", this.id, ", customData=", ")", this.customData);
    }

    public /* synthetic */ SIPCallerConfigsResponse(String str, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25272z.f99163w : map);
    }
}
