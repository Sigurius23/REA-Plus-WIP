package io.getstream.android.video.generated.models;

import java.util.Map;
import m83.C25272z;
import nh3.AbstractC26725a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\b\u0003\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0017\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003HÆ\u0003J!\u0010\t\u001a\u00020\u00002\u0016\b\u0003\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SIPCallConfigsResponse;", "", "customData", "", "", "(Ljava/util/Map;)V", "getCustomData", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SIPCallConfigsResponse {
    private final Map<String, Object> customData;

    /* JADX WARN: Multi-variable type inference failed */
    public SIPCallConfigsResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SIPCallConfigsResponse copy$default(SIPCallConfigsResponse sIPCallConfigsResponse, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = sIPCallConfigsResponse.customData;
        }
        return sIPCallConfigsResponse.copy(map);
    }

    public final Map<String, Object> component1() {
        return this.customData;
    }

    public final SIPCallConfigsResponse copy(@InterfaceC30731q(name = "custom_data") Map<String, ? extends Object> customData) {
        AbstractC22676k.m65750j(customData, "customData");
        return new SIPCallConfigsResponse(customData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SIPCallConfigsResponse) && AbstractC22676k.m65745e(this.customData, ((SIPCallConfigsResponse) other).customData);
    }

    public final Map<String, Object> getCustomData() {
        return this.customData;
    }

    public int hashCode() {
        return this.customData.hashCode();
    }

    public String toString() {
        return AbstractC26725a.m79504h("SIPCallConfigsResponse(customData=", ")", this.customData);
    }

    public SIPCallConfigsResponse(@InterfaceC30731q(name = "custom_data") Map<String, ? extends Object> customData) {
        AbstractC22676k.m65750j(customData, "customData");
        this.customData = customData;
    }

    public /* synthetic */ SIPCallConfigsResponse(Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25272z.f99163w : map);
    }
}
