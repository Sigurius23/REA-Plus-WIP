package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/android/video/generated/models/BackstageSettingsResponse;", "", "enabled", "", "joinAheadTimeSeconds", "", "(ZLjava/lang/Integer;)V", "getEnabled", "()Z", "getJoinAheadTimeSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ZLjava/lang/Integer;)Lio/getstream/android/video/generated/models/BackstageSettingsResponse;", "equals", "other", "hashCode", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class BackstageSettingsResponse {
    private final boolean enabled;
    private final Integer joinAheadTimeSeconds;

    public BackstageSettingsResponse(@InterfaceC30731q(name = "enabled") boolean z4, @InterfaceC30731q(name = "join_ahead_time_seconds") Integer num) {
        this.enabled = z4;
        this.joinAheadTimeSeconds = num;
    }

    public static /* synthetic */ BackstageSettingsResponse copy$default(BackstageSettingsResponse backstageSettingsResponse, boolean z4, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = backstageSettingsResponse.enabled;
        }
        if ((i13 & 2) != 0) {
            num = backstageSettingsResponse.joinAheadTimeSeconds;
        }
        return backstageSettingsResponse.copy(z4, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getJoinAheadTimeSeconds() {
        return this.joinAheadTimeSeconds;
    }

    public final BackstageSettingsResponse copy(@InterfaceC30731q(name = "enabled") boolean enabled, @InterfaceC30731q(name = "join_ahead_time_seconds") Integer joinAheadTimeSeconds) {
        return new BackstageSettingsResponse(enabled, joinAheadTimeSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackstageSettingsResponse)) {
            return false;
        }
        BackstageSettingsResponse backstageSettingsResponse = (BackstageSettingsResponse) other;
        return this.enabled == backstageSettingsResponse.enabled && AbstractC22676k.m65745e(this.joinAheadTimeSeconds, backstageSettingsResponse.joinAheadTimeSeconds);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Integer getJoinAheadTimeSeconds() {
        return this.joinAheadTimeSeconds;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        Integer num = this.joinAheadTimeSeconds;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "BackstageSettingsResponse(enabled=" + this.enabled + ", joinAheadTimeSeconds=" + this.joinAheadTimeSeconds + ")";
    }

    public /* synthetic */ BackstageSettingsResponse(boolean z4, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i13 & 2) != 0 ? null : num);
    }
}
