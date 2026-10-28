package live.hms.video.utils;

import android.os.Looper;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003¨\u0006\t"}, m65681d2 = {"Llive/hms/video/utils/ThreadUtils;", "", "<init>", "()V", "", "getThreadInfo", "()Ljava/lang/String;", "Ll83/a0;", "checkIsOnMainThread", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ThreadUtils {
    public static final ThreadUtils INSTANCE = new ThreadUtils();

    private ThreadUtils() {
    }

    public static final String getThreadInfo() {
        Thread threadCurrentThread = Thread.currentThread();
        return "@[name=" + threadCurrentThread.getName() + ", id=" + threadCurrentThread.getId() + ']';
    }

    public final void checkIsOnMainThread() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }
}
