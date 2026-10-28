package live.hms.video.plugin.video;

import hms.webrtc.VideoFrame;
import l83.C23454a0;
import live.hms.video.sdk.HMSPluginResultListener;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/plugin/video/HMSVideoPlugin;", "", "", "getName", "()Ljava/lang/String;", "", "isSupported", "()Z", "Ll83/a0;", "init", "(Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/plugin/video/HMSVideoPluginType;", "getPluginType", "()Llive/hms/video/plugin/video/HMSVideoPluginType;", "Lhms/webrtc/VideoFrame;", "input", "Llive/hms/video/sdk/HMSPluginResultListener;", "outputListener", "skipProcessing", "processVideoFrame", "(Lhms/webrtc/VideoFrame;Llive/hms/video/sdk/HMSPluginResultListener;Ljava/lang/Boolean;)V", "stop", "()V", "key", "setKey", "(Ljava/lang/String;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface HMSVideoPlugin {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static void setKey(HMSVideoPlugin hMSVideoPlugin, String key) {
            AbstractC22676k.m65750j(key, "key");
        }
    }

    String getName();

    HMSVideoPluginType getPluginType();

    Object init(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    boolean isSupported();

    void processVideoFrame(VideoFrame input, HMSPluginResultListener outputListener, Boolean skipProcessing);

    void setKey(String key);

    void stop();
}
