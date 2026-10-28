package live.hms.video.sdk;

import java.io.Closeable;
import live.hms.video.database.entity.AnalyticsPeer;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRoom;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\tJ\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!\"\u0004\b$\u0010\t¨\u0006%"}, m65681d2 = {"Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;", "Ljava/io/Closeable;", "<init>", "()V", "Ll83/a0;", "close", "", "template", "updateTemplateId", "(Ljava/lang/String;)V", "", "time", "joined", "(J)V", "leave", "token", "updateWithToken", "Llive/hms/video/sdk/models/HMSRoom;", "hmsRoom", "updateWithRoom", "(Llive/hms/video/sdk/models/HMSRoom;)V", "Llive/hms/video/sdk/models/HMSPeer;", "hmsPeer", "updateWithPeer", "(Llive/hms/video/sdk/models/HMSPeer;)V", "Llive/hms/video/database/entity/AnalyticsPeer;", "value", "analyticsPeer", "Llive/hms/video/database/entity/AnalyticsPeer;", "getAnalyticsPeer", "()Llive/hms/video/database/entity/AnalyticsPeer;", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "websocketUrl", "getWebsocketUrl", "setWebsocketUrl", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OfflineAnalyticsPeerInfo implements Closeable {
    private AnalyticsPeer analyticsPeer = new AnalyticsPeer(null, null, null, null, null, null, null, null, null, null, 1023, null);
    private String token;
    private String websocketUrl;

    public static /* synthetic */ void joined$default(OfflineAnalyticsPeerInfo offlineAnalyticsPeerInfo, long j7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = System.currentTimeMillis();
        }
        offlineAnalyticsPeerInfo.joined(j7);
    }

    public static /* synthetic */ void leave$default(OfflineAnalyticsPeerInfo offlineAnalyticsPeerInfo, long j7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = System.currentTimeMillis();
        }
        offlineAnalyticsPeerInfo.leave(j7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.websocketUrl = null;
        this.token = null;
    }

    public final AnalyticsPeer getAnalyticsPeer() {
        return this.analyticsPeer;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getWebsocketUrl() {
        return this.websocketUrl;
    }

    public final void joined(long time) {
        this.analyticsPeer.setLeftAt(null);
        this.analyticsPeer.setJoinedAt(Long.valueOf(time));
    }

    public final void leave(long time) {
        this.analyticsPeer.setLeftAt(Long.valueOf(time));
    }

    public final void setWebsocketUrl(String str) {
        this.websocketUrl = str;
    }

    public final void updateTemplateId(String template) {
        AbstractC22676k.m65750j(template, "template");
        this.analyticsPeer.setTemplateId(template);
    }

    public final void updateWithPeer(HMSPeer hmsPeer) {
        if (hmsPeer != null) {
            AnalyticsPeer analyticsPeer = this.analyticsPeer;
            analyticsPeer.setPeerId(hmsPeer.getPeerID());
            analyticsPeer.setRole(hmsPeer.getHmsRole().getName());
            analyticsPeer.setUserData(hmsPeer.getMetadata());
            analyticsPeer.setUserName(hmsPeer.getName());
        }
    }

    public final void updateWithRoom(HMSRoom hmsRoom) {
        if (hmsRoom != null) {
            AnalyticsPeer analyticsPeer = this.analyticsPeer;
            analyticsPeer.setSessionId(hmsRoom.getSessionId());
            analyticsPeer.setSessionStartedAt(hmsRoom.getStartedAt());
            analyticsPeer.setRoomName(hmsRoom.getName());
        }
    }

    public final void updateWithToken(String token) {
        if (token != null) {
            this.token = token;
        }
    }
}
