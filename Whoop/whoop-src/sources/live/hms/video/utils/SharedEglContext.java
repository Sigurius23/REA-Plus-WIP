package live.hms.video.utils;

import hms.webrtc.EglBase;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u001b\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\t0\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Llive/hms/video/utils/SharedEglContext;", "", "<init>", "()V", "base", "Lhms/webrtc/EglBase;", "kotlin.jvm.PlatformType", "Lhms/webrtc/EglBase;", "context", "Lhms/webrtc/EglBase$Context;", "getContext", "()Lhms/webrtc/EglBase$Context;", "Lhms/webrtc/EglBase$Context;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SharedEglContext {
    public static final SharedEglContext INSTANCE = new SharedEglContext();
    private static final EglBase base;
    private static final EglBase.Context context;

    static {
        EglBase eglBaseCreate = EglBase.create();
        base = eglBaseCreate;
        context = eglBaseCreate.getEglBaseContext();
    }

    private SharedEglContext() {
    }

    public final EglBase.Context getContext() {
        return context;
    }
}
