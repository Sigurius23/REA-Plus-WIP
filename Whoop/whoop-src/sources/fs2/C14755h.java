package fs2;

import live.hms.video.sdk.HMSActionResultListener;
import live.hms.video.sdk.HMSPreviewListener;
import live.hms.video.sdk.HMSSDK;
import live.hms.video.sdk.models.HMSConfig;
import live.hms.video.signal.init.HMSTokenListener;
import live.hms.video.signal.init.TokenRequest;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fs2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lfs2/h;", "Lfs2/c;", "Llive/hms/video/sdk/HMSSDK;", "sdk", "<init>", "(Llive/hms/video/sdk/HMSSDK;)V", "Llive/hms/video/signal/init/TokenRequest;", "request", "Llive/hms/video/signal/init/HMSTokenListener;", "listener", "Ll83/a0;", "c", "(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/HMSTokenListener;)V", "Llive/hms/video/sdk/models/HMSConfig;", "config", "Llive/hms/video/sdk/HMSPreviewListener;", "b", "(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;)V", "Llive/hms/video/sdk/HMSActionResultListener;", "a", "(Llive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/sdk/HMSSDK;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C14755h implements InterfaceC14750c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HMSSDK sdk;

    public C14755h(HMSSDK sdk) {
        AbstractC22676k.m65750j(sdk, "sdk");
        this.sdk = sdk;
    }

    @Override // fs2.InterfaceC14750c
    /* JADX INFO: renamed from: a */
    public void mo42285a(HMSActionResultListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.sdk.leave(listener);
    }

    @Override // fs2.InterfaceC14750c
    /* JADX INFO: renamed from: b */
    public void mo42286b(HMSConfig config, HMSPreviewListener listener) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(listener, "listener");
        this.sdk.preview(config, listener);
    }

    @Override // fs2.InterfaceC14750c
    /* JADX INFO: renamed from: c */
    public void mo42287c(TokenRequest request, HMSTokenListener listener) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(listener, "listener");
        this.sdk.getAuthTokenByRoomCode(request, null, listener);
    }
}
