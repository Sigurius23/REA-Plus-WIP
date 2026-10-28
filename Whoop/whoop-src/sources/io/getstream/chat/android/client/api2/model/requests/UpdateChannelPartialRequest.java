package io.getstream.chat.android.client.api2.model.requests;

import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/UpdateChannelPartialRequest;", "", "set", "", "", "unset", "", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "getSet", "()Ljava/util/Map;", "getUnset", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpdateChannelPartialRequest {
    private final Map<String, Object> set;
    private final List<String> unset;

    public UpdateChannelPartialRequest(Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        this.set = set;
        this.unset = unset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateChannelPartialRequest copy$default(UpdateChannelPartialRequest updateChannelPartialRequest, Map map, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = updateChannelPartialRequest.set;
        }
        if ((i13 & 2) != 0) {
            list = updateChannelPartialRequest.unset;
        }
        return updateChannelPartialRequest.copy(map, list);
    }

    public final Map<String, Object> component1() {
        return this.set;
    }

    public final List<String> component2() {
        return this.unset;
    }

    public final UpdateChannelPartialRequest copy(Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return new UpdateChannelPartialRequest(set, unset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateChannelPartialRequest)) {
            return false;
        }
        UpdateChannelPartialRequest updateChannelPartialRequest = (UpdateChannelPartialRequest) other;
        return AbstractC22676k.m65745e(this.set, updateChannelPartialRequest.set) && AbstractC22676k.m65745e(this.unset, updateChannelPartialRequest.unset);
    }

    public final Map<String, Object> getSet() {
        return this.set;
    }

    public final List<String> getUnset() {
        return this.unset;
    }

    public int hashCode() {
        return this.unset.hashCode() + (this.set.hashCode() * 31);
    }

    public String toString() {
        return "UpdateChannelPartialRequest(set=" + this.set + ", unset=" + this.unset + ")";
    }
}
