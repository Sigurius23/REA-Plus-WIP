package io.getstream.android.video.generated.models;

import p031b9.AbstractC2875y;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SessionSettingsResponse;", "", "inactivityTimeoutSeconds", "", "(I)V", "getInactivityTimeoutSeconds", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SessionSettingsResponse {
    private final int inactivityTimeoutSeconds;

    public SessionSettingsResponse(@InterfaceC30731q(name = "inactivity_timeout_seconds") int i13) {
        this.inactivityTimeoutSeconds = i13;
    }

    public static /* synthetic */ SessionSettingsResponse copy$default(SessionSettingsResponse sessionSettingsResponse, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = sessionSettingsResponse.inactivityTimeoutSeconds;
        }
        return sessionSettingsResponse.copy(i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getInactivityTimeoutSeconds() {
        return this.inactivityTimeoutSeconds;
    }

    public final SessionSettingsResponse copy(@InterfaceC30731q(name = "inactivity_timeout_seconds") int inactivityTimeoutSeconds) {
        return new SessionSettingsResponse(inactivityTimeoutSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SessionSettingsResponse) && this.inactivityTimeoutSeconds == ((SessionSettingsResponse) other).inactivityTimeoutSeconds;
    }

    public final int getInactivityTimeoutSeconds() {
        return this.inactivityTimeoutSeconds;
    }

    public int hashCode() {
        return Integer.hashCode(this.inactivityTimeoutSeconds);
    }

    public String toString() {
        return AbstractC2875y.m8296i(this.inactivityTimeoutSeconds, "SessionSettingsResponse(inactivityTimeoutSeconds=", ")");
    }
}
