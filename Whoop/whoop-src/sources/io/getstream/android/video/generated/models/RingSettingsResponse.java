package io.getstream.android.video.generated.models;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RingSettingsResponse;", "", "autoCancelTimeoutMs", "", "incomingCallTimeoutMs", "missedCallTimeoutMs", "(III)V", "getAutoCancelTimeoutMs", "()I", "getIncomingCallTimeoutMs", "getMissedCallTimeoutMs", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class RingSettingsResponse {
    private final int autoCancelTimeoutMs;
    private final int incomingCallTimeoutMs;
    private final int missedCallTimeoutMs;

    public RingSettingsResponse(@InterfaceC30731q(name = "auto_cancel_timeout_ms") int i13, @InterfaceC30731q(name = "incoming_call_timeout_ms") int i14, @InterfaceC30731q(name = "missed_call_timeout_ms") int i15) {
        this.autoCancelTimeoutMs = i13;
        this.incomingCallTimeoutMs = i14;
        this.missedCallTimeoutMs = i15;
    }

    public static /* synthetic */ RingSettingsResponse copy$default(RingSettingsResponse ringSettingsResponse, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i13 = ringSettingsResponse.autoCancelTimeoutMs;
        }
        if ((i16 & 2) != 0) {
            i14 = ringSettingsResponse.incomingCallTimeoutMs;
        }
        if ((i16 & 4) != 0) {
            i15 = ringSettingsResponse.missedCallTimeoutMs;
        }
        return ringSettingsResponse.copy(i13, i14, i15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAutoCancelTimeoutMs() {
        return this.autoCancelTimeoutMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIncomingCallTimeoutMs() {
        return this.incomingCallTimeoutMs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMissedCallTimeoutMs() {
        return this.missedCallTimeoutMs;
    }

    public final RingSettingsResponse copy(@InterfaceC30731q(name = "auto_cancel_timeout_ms") int autoCancelTimeoutMs, @InterfaceC30731q(name = "incoming_call_timeout_ms") int incomingCallTimeoutMs, @InterfaceC30731q(name = "missed_call_timeout_ms") int missedCallTimeoutMs) {
        return new RingSettingsResponse(autoCancelTimeoutMs, incomingCallTimeoutMs, missedCallTimeoutMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RingSettingsResponse)) {
            return false;
        }
        RingSettingsResponse ringSettingsResponse = (RingSettingsResponse) other;
        return this.autoCancelTimeoutMs == ringSettingsResponse.autoCancelTimeoutMs && this.incomingCallTimeoutMs == ringSettingsResponse.incomingCallTimeoutMs && this.missedCallTimeoutMs == ringSettingsResponse.missedCallTimeoutMs;
    }

    public final int getAutoCancelTimeoutMs() {
        return this.autoCancelTimeoutMs;
    }

    public final int getIncomingCallTimeoutMs() {
        return this.incomingCallTimeoutMs;
    }

    public final int getMissedCallTimeoutMs() {
        return this.missedCallTimeoutMs;
    }

    public int hashCode() {
        return Integer.hashCode(this.missedCallTimeoutMs) + AbstractC11266d.m30448b(this.incomingCallTimeoutMs, Integer.hashCode(this.autoCancelTimeoutMs) * 31, 31);
    }

    public String toString() {
        int i13 = this.autoCancelTimeoutMs;
        int i14 = this.incomingCallTimeoutMs;
        return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(i13, i14, "RingSettingsResponse(autoCancelTimeoutMs=", ", incomingCallTimeoutMs=", ", missedCallTimeoutMs="), this.missedCallTimeoutMs, ")");
    }
}
