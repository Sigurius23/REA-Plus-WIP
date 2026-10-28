package io.getstream.android.video.generated.models;

import java.util.List;
import m83.C25271y;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressVideoEncodingOptionsRequest;", "", "layers", "", "Lio/getstream/android/video/generated/models/IngressVideoLayerRequest;", "source", "Lio/getstream/android/video/generated/models/IngressSourceRequest;", "(Ljava/util/List;Lio/getstream/android/video/generated/models/IngressSourceRequest;)V", "getLayers", "()Ljava/util/List;", "getSource", "()Lio/getstream/android/video/generated/models/IngressSourceRequest;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class IngressVideoEncodingOptionsRequest {
    private final List<IngressVideoLayerRequest> layers;
    private final IngressSourceRequest source;

    public IngressVideoEncodingOptionsRequest(@InterfaceC30731q(name = "layers") List<IngressVideoLayerRequest> layers, @InterfaceC30731q(name = "source") IngressSourceRequest source) {
        AbstractC22676k.m65750j(layers, "layers");
        AbstractC22676k.m65750j(source, "source");
        this.layers = layers;
        this.source = source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IngressVideoEncodingOptionsRequest copy$default(IngressVideoEncodingOptionsRequest ingressVideoEncodingOptionsRequest, List list, IngressSourceRequest ingressSourceRequest, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = ingressVideoEncodingOptionsRequest.layers;
        }
        if ((i13 & 2) != 0) {
            ingressSourceRequest = ingressVideoEncodingOptionsRequest.source;
        }
        return ingressVideoEncodingOptionsRequest.copy(list, ingressSourceRequest);
    }

    public final List<IngressVideoLayerRequest> component1() {
        return this.layers;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IngressSourceRequest getSource() {
        return this.source;
    }

    public final IngressVideoEncodingOptionsRequest copy(@InterfaceC30731q(name = "layers") List<IngressVideoLayerRequest> layers, @InterfaceC30731q(name = "source") IngressSourceRequest source) {
        AbstractC22676k.m65750j(layers, "layers");
        AbstractC22676k.m65750j(source, "source");
        return new IngressVideoEncodingOptionsRequest(layers, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IngressVideoEncodingOptionsRequest)) {
            return false;
        }
        IngressVideoEncodingOptionsRequest ingressVideoEncodingOptionsRequest = (IngressVideoEncodingOptionsRequest) other;
        return AbstractC22676k.m65745e(this.layers, ingressVideoEncodingOptionsRequest.layers) && AbstractC22676k.m65745e(this.source, ingressVideoEncodingOptionsRequest.source);
    }

    public final List<IngressVideoLayerRequest> getLayers() {
        return this.layers;
    }

    public final IngressSourceRequest getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.source.hashCode() + (this.layers.hashCode() * 31);
    }

    public String toString() {
        return "IngressVideoEncodingOptionsRequest(layers=" + this.layers + ", source=" + this.source + ")";
    }

    public /* synthetic */ IngressVideoEncodingOptionsRequest(List list, IngressSourceRequest ingressSourceRequest, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, ingressSourceRequest);
    }
}
