package live.hms.video.diagnostics.models;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\fH\u0016R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\f@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/diagnostics/models/SignallingReport;", "", "<init>", "()V", "value", "", "isConnected", "()Z", "setConnected$lib_release", "(Z)V", "isInitConnected", "setInitConnected$lib_release", "", "websocketUrl", "getWebsocketUrl", "()Ljava/lang/String;", "setWebsocketUrl$lib_release", "(Ljava/lang/String;)V", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SignallingReport {
    private boolean isConnected;
    private boolean isInitConnected;
    private String websocketUrl;

    public final String getWebsocketUrl() {
        return this.websocketUrl;
    }

    /* JADX INFO: renamed from: isConnected, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: isInitConnected, reason: from getter */
    public final boolean getIsInitConnected() {
        return this.isInitConnected;
    }

    public final void setConnected$lib_release(boolean z4) {
        this.isConnected = z4;
    }

    public final void setInitConnected$lib_release(boolean z4) {
        this.isInitConnected = z4;
    }

    public final void setWebsocketUrl$lib_release(String str) {
        this.websocketUrl = str;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("SignallingReport(isConnected=");
        sb4.append(this.isConnected);
        sb4.append(", isInitConnected=");
        sb4.append(this.isInitConnected);
        sb4.append(", websocketUrl=");
        return AbstractC25012a.m73377j(sb4, this.websocketUrl, ')');
    }
}
