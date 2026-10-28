package fs2;

import android.content.Context;
import live.hms.video.sdk.HMSActionResultListener;
import live.hms.video.sdk.HMSPreviewListener;
import live.hms.video.sdk.HMSSDK;
import live.hms.video.sdk.models.HMSConfig;
import live.hms.video.signal.init.HMSTokenListener;
import live.hms.video.signal.init.TokenRequest;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fs2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Lfs2/c;", "", "Llive/hms/video/signal/init/TokenRequest;", "request", "Llive/hms/video/signal/init/HMSTokenListener;", "listener", "Ll83/a0;", "c", "(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/HMSTokenListener;)V", "Llive/hms/video/sdk/models/HMSConfig;", "config", "Llive/hms/video/sdk/HMSPreviewListener;", "b", "(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;)V", "Llive/hms/video/sdk/HMSActionResultListener;", "a", "(Llive/hms/video/sdk/HMSActionResultListener;)V", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14750c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f54595a;

    /* JADX INFO: renamed from: fs2.c$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lfs2/c$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lfs2/c;", "a", "(Landroid/content/Context;)Lfs2/c;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f54595a = new Companion();

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC14750c m42288a(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return new C14755h(new HMSSDK.Builder(context).build());
        }
    }

    /* JADX INFO: renamed from: a */
    void mo42285a(HMSActionResultListener listener);

    /* JADX INFO: renamed from: b */
    void mo42286b(HMSConfig config, HMSPreviewListener listener);

    /* JADX INFO: renamed from: c */
    void mo42287c(TokenRequest request, HMSTokenListener listener);
}
