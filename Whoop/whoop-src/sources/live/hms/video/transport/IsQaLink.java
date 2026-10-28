package live.hms.video.transport;

import live.hms.video.sdk.models.HMSConfig;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m65681d2 = {"Llive/hms/video/transport/IsQaLink;", "", "<init>", "()V", "Llive/hms/video/sdk/models/HMSConfig;", "hmsConfig", "Ll83/a0;", "updateIsQaLink", "(Llive/hms/video/sdk/models/HMSConfig;)V", "", "value", "isQa", "Z", "()Z", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class IsQaLink {
    private boolean isQa;

    /* JADX INFO: renamed from: isQa, reason: from getter */
    public final boolean getIsQa() {
        return this.isQa;
    }

    public final void updateIsQaLink(HMSConfig hmsConfig) {
        AbstractC22676k.m65750j(hmsConfig, "hmsConfig");
        this.isQa = AbstractC39414r.m125876U(hmsConfig.getInitEndpoint(), "qa-init.100ms.live", false);
    }
}
