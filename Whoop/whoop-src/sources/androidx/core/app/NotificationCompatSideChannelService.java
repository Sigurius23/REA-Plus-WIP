package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.AbstractBinderC1060b;
import android.support.v4.app.InterfaceC1061c;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes5.dex */
public abstract class NotificationCompatSideChannelService extends Service {

    public class NotificationSideChannelStub extends AbstractBinderC1060b {
        public NotificationSideChannelStub() {
            attachInterface(this, InterfaceC1061c.f4137a);
        }

        @Override // android.support.v4.app.InterfaceC1061c
        public void cancel(String str, int i13, String str2) throws RemoteException {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.cancel(str, i13, str2);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.InterfaceC1061c
        public void cancelAll(String str) {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.cancelAll(str);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.InterfaceC1061c
        public void notify(String str, int i13, String str2, Notification notification) throws RemoteException {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.notify(str, i13, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public abstract void cancel(String str, int i13, String str2);

    public abstract void cancelAll(String str);

    public void checkPermission(int i13, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(i13)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException(AbstractC11266d.m30456j(i13, "NotificationSideChannelService: Uid ", " is not authorized for package ", str));
    }

    public abstract void notify(String str, int i13, String str2, Notification notification);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getAction().equals(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL);
        return null;
    }
}
