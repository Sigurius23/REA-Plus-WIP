package live.hms.video.sdk.models.role;

import live.hms.video.sdk.models.TranscriptionsMode;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/sdk/models/role/HMSTranscriptionPermissions;", "", "<init>", "()V", "value", "Llive/hms/video/sdk/models/TranscriptionsMode;", "mode", "getMode", "()Llive/hms/video/sdk/models/TranscriptionsMode;", "setMode$lib_release", "(Llive/hms/video/sdk/models/TranscriptionsMode;)V", "", "admin", "getAdmin", "()Z", "setAdmin$lib_release", "(Z)V", "read", "getRead", "setRead$lib_release", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSTranscriptionPermissions {
    private boolean admin;
    private TranscriptionsMode mode;
    private boolean read;

    public final boolean getAdmin() {
        return this.admin;
    }

    public final TranscriptionsMode getMode() {
        return this.mode;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final void setAdmin$lib_release(boolean z4) {
        this.admin = z4;
    }

    public final void setMode$lib_release(TranscriptionsMode transcriptionsMode) {
        this.mode = transcriptionsMode;
    }

    public final void setRead$lib_release(boolean z4) {
        this.read = z4;
    }
}
