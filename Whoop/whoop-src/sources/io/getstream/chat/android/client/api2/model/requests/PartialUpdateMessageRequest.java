package io.getstream.chat.android.client.api2.model.requests;

import ih0.AbstractC18489d0;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateMessageRequest;", "", "set", "", "", "unset", "", "skip_enrich_url", "", "<init>", "(Ljava/util/Map;Ljava/util/List;Z)V", "getSet", "()Ljava/util/Map;", "getUnset", "()Ljava/util/List;", "getSkip_enrich_url", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PartialUpdateMessageRequest {
    private final Map<String, Object> set;
    private final boolean skip_enrich_url;
    private final List<String> unset;

    public PartialUpdateMessageRequest(Map<String, ? extends Object> set, List<String> unset, boolean z4) {
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        this.set = set;
        this.unset = unset;
        this.skip_enrich_url = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PartialUpdateMessageRequest copy$default(PartialUpdateMessageRequest partialUpdateMessageRequest, Map map, List list, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = partialUpdateMessageRequest.set;
        }
        if ((i13 & 2) != 0) {
            list = partialUpdateMessageRequest.unset;
        }
        if ((i13 & 4) != 0) {
            z4 = partialUpdateMessageRequest.skip_enrich_url;
        }
        return partialUpdateMessageRequest.copy(map, list, z4);
    }

    public final Map<String, Object> component1() {
        return this.set;
    }

    public final List<String> component2() {
        return this.unset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSkip_enrich_url() {
        return this.skip_enrich_url;
    }

    public final PartialUpdateMessageRequest copy(Map<String, ? extends Object> set, List<String> unset, boolean skip_enrich_url) {
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return new PartialUpdateMessageRequest(set, unset, skip_enrich_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartialUpdateMessageRequest)) {
            return false;
        }
        PartialUpdateMessageRequest partialUpdateMessageRequest = (PartialUpdateMessageRequest) other;
        return AbstractC22676k.m65745e(this.set, partialUpdateMessageRequest.set) && AbstractC22676k.m65745e(this.unset, partialUpdateMessageRequest.unset) && this.skip_enrich_url == partialUpdateMessageRequest.skip_enrich_url;
    }

    public final Map<String, Object> getSet() {
        return this.set;
    }

    public final boolean getSkip_enrich_url() {
        return this.skip_enrich_url;
    }

    public final List<String> getUnset() {
        return this.unset;
    }

    public int hashCode() {
        return Boolean.hashCode(this.skip_enrich_url) + AbstractC11895b.m31983b(this.set.hashCode() * 31, 31, this.unset);
    }

    public String toString() {
        Map<String, Object> map = this.set;
        List<String> list = this.unset;
        boolean z4 = this.skip_enrich_url;
        StringBuilder sb4 = new StringBuilder("PartialUpdateMessageRequest(set=");
        sb4.append(map);
        sb4.append(", unset=");
        sb4.append(list);
        sb4.append(", skip_enrich_url=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ PartialUpdateMessageRequest(Map map, List list, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, list, (i13 & 4) != 0 ? false : z4);
    }
}
