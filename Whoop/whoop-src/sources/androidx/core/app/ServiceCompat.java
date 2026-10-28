package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes5.dex */
public final class ServiceCompat {
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_Q = 255;
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U = 1073745919;
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    public static class Api24Impl {
        private Api24Impl() {
        }

        public static void stopForeground(Service service, int i13) {
            service.stopForeground(i13);
        }
    }

    public static class Api29Impl {
        private Api29Impl() {
        }

        public static void startForeground(Service service, int i13, Notification notification, int i14) {
            if (i14 == 0 || i14 == -1) {
                service.startForeground(i13, notification, i14);
            } else {
                service.startForeground(i13, notification, i14 & ServiceCompat.FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_Q);
            }
        }
    }

    public static class Api34Impl {
        private Api34Impl() {
        }

        public static void startForeground(Service service, int i13, Notification notification, int i14) {
            if (i14 == 0 || i14 == -1) {
                service.startForeground(i13, notification, i14);
            } else {
                service.startForeground(i13, notification, i14 & ServiceCompat.FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
    }

    public static void startForeground(Service service, int i13, Notification notification, int i14) {
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 34) {
            Api34Impl.startForeground(service, i13, notification, i14);
        } else if (i15 >= 29) {
            Api29Impl.startForeground(service, i13, notification, i14);
        } else {
            service.startForeground(i13, notification);
        }
    }

    public static void stopForeground(Service service, int i13) {
        Api24Impl.stopForeground(service, i13);
    }
}
