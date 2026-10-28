package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/android/video/generated/models/BackstageSettingsRequest;", "", "enabled", "", "joinAheadTimeSeconds", "", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getJoinAheadTimeSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/BackstageSettingsRequest;", "equals", "other", "hashCode", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class BackstageSettingsRequest {
    private final Boolean enabled;
    private final Integer joinAheadTimeSeconds;

    /* JADX WARN: Multi-variable type inference failed */
    public BackstageSettingsRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BackstageSettingsRequest copy$default(BackstageSettingsRequest backstageSettingsRequest, Boolean bool, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = backstageSettingsRequest.enabled;
        }
        if ((i13 & 2) != 0) {
            num = backstageSettingsRequest.joinAheadTimeSeconds;
        }
        return backstageSettingsRequest.copy(bool, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getJoinAheadTimeSeconds() {
        return this.joinAheadTimeSeconds;
    }

    public final BackstageSettingsRequest copy(@InterfaceC30731q(name = "enabled") Boolean enabled, @InterfaceC30731q(name = "join_ahead_time_seconds") Integer joinAheadTimeSeconds) {
        return new BackstageSettingsRequest(enabled, joinAheadTimeSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackstageSettingsRequest)) {
            return false;
        }
        BackstageSettingsRequest backstageSettingsRequest = (BackstageSettingsRequest) other;
        return AbstractC22676k.m65745e(this.enabled, backstageSettingsRequest.enabled) && AbstractC22676k.m65745e(this.joinAheadTimeSeconds, backstageSettingsRequest.joinAheadTimeSeconds);
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Integer getJoinAheadTimeSeconds() {
        return this.joinAheadTimeSeconds;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.joinAheadTimeSeconds;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "BackstageSettingsRequest(enabled=" + this.enabled + ", joinAheadTimeSeconds=" + this.joinAheadTimeSeconds + ")";
    }

    public BackstageSettingsRequest(@InterfaceC30731q(name = "enabled") Boolean bool, @InterfaceC30731q(name = "join_ahead_time_seconds") Integer num) {
        this.enabled = bool;
        this.joinAheadTimeSeconds = num;
    }

    public /* synthetic */ BackstageSettingsRequest(Boolean bool, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : num);
    }
}
