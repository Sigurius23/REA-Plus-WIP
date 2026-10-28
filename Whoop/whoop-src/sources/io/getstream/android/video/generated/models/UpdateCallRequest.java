package io.getstream.android.video.generated.models;

import java.util.Map;
import jg3.C21682i;
import m83.C25272z;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0003\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0018\b\u0003\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010¨\u0006\""}, m65681d2 = {"Lio/getstream/android/video/generated/models/UpdateCallRequest;", "", "Ljg3/i;", "startsAt", "", "", "custom", "Lio/getstream/android/video/generated/models/CallSettingsRequest;", "settingsOverride", "<init>", "(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;)V", "component1", "()Ljg3/i;", "component2", "()Ljava/util/Map;", "component3", "()Lio/getstream/android/video/generated/models/CallSettingsRequest;", "copy", "(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;)Lio/getstream/android/video/generated/models/UpdateCallRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljg3/i;", "getStartsAt", "Ljava/util/Map;", "getCustom", "Lio/getstream/android/video/generated/models/CallSettingsRequest;", "getSettingsOverride", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class UpdateCallRequest {
    private final Map<String, Object> custom;
    private final CallSettingsRequest settingsOverride;
    private final C21682i startsAt;

    public UpdateCallRequest() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateCallRequest copy$default(UpdateCallRequest updateCallRequest, C21682i c21682i, Map map, CallSettingsRequest callSettingsRequest, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c21682i = updateCallRequest.startsAt;
        }
        if ((i13 & 2) != 0) {
            map = updateCallRequest.custom;
        }
        if ((i13 & 4) != 0) {
            callSettingsRequest = updateCallRequest.settingsOverride;
        }
        return updateCallRequest.copy(c21682i, map, callSettingsRequest);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C21682i getStartsAt() {
        return this.startsAt;
    }

    public final Map<String, Object> component2() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CallSettingsRequest getSettingsOverride() {
        return this.settingsOverride;
    }

    public final UpdateCallRequest copy(@InterfaceC30731q(name = "starts_at") C21682i startsAt, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = "settings_override") CallSettingsRequest settingsOverride) {
        return new UpdateCallRequest(startsAt, custom, settingsOverride);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateCallRequest)) {
            return false;
        }
        UpdateCallRequest updateCallRequest = (UpdateCallRequest) other;
        return AbstractC22676k.m65745e(this.startsAt, updateCallRequest.startsAt) && AbstractC22676k.m65745e(this.custom, updateCallRequest.custom) && AbstractC22676k.m65745e(this.settingsOverride, updateCallRequest.settingsOverride);
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final CallSettingsRequest getSettingsOverride() {
        return this.settingsOverride;
    }

    public final C21682i getStartsAt() {
        return this.startsAt;
    }

    public int hashCode() {
        C21682i c21682i = this.startsAt;
        int iHashCode = (c21682i == null ? 0 : c21682i.hashCode()) * 31;
        Map<String, Object> map = this.custom;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        CallSettingsRequest callSettingsRequest = this.settingsOverride;
        return iHashCode2 + (callSettingsRequest != null ? callSettingsRequest.hashCode() : 0);
    }

    public String toString() {
        return "UpdateCallRequest(startsAt=" + this.startsAt + ", custom=" + this.custom + ", settingsOverride=" + this.settingsOverride + ")";
    }

    public UpdateCallRequest(@InterfaceC30731q(name = "starts_at") C21682i c21682i, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> map, @InterfaceC30731q(name = "settings_override") CallSettingsRequest callSettingsRequest) {
        this.startsAt = c21682i;
        this.custom = map;
        this.settingsOverride = callSettingsRequest;
    }

    public /* synthetic */ UpdateCallRequest(C21682i c21682i, Map map, CallSettingsRequest callSettingsRequest, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c21682i, (i13 & 2) != 0 ? C25272z.f99163w : map, (i13 & 4) != 0 ? null : callSettingsRequest);
    }
}
