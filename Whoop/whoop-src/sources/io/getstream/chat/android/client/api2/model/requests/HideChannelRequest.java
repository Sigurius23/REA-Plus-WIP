package io.getstream.chat.android.client.api2.model.requests;

import c13.AbstractC3855a;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/HideChannelRequest;", "", "clear_history", "", "<init>", "(Z)V", "getClear_history", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class HideChannelRequest {
    private final boolean clear_history;

    public HideChannelRequest(boolean z4) {
        this.clear_history = z4;
    }

    public static /* synthetic */ HideChannelRequest copy$default(HideChannelRequest hideChannelRequest, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = hideChannelRequest.clear_history;
        }
        return hideChannelRequest.copy(z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getClear_history() {
        return this.clear_history;
    }

    public final HideChannelRequest copy(boolean clear_history) {
        return new HideChannelRequest(clear_history);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HideChannelRequest) && this.clear_history == ((HideChannelRequest) other).clear_history;
    }

    public final boolean getClear_history() {
        return this.clear_history;
    }

    public int hashCode() {
        return Boolean.hashCode(this.clear_history);
    }

    public String toString() {
        return AbstractC3855a.m11827k("HideChannelRequest(clear_history=", ")", this.clear_history);
    }
}
