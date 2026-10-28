package android.support.v4.app;

import android.app.Notification;
import android.os.IInterface;

/* JADX INFO: renamed from: android.support.v4.app.c */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC1061c extends IInterface {

    /* JADX INFO: renamed from: a */
    public static final String f4137a = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    void cancel(String str, int i13, String str2);

    void cancelAll(String str);

    void notify(String str, int i13, String str2, Notification notification);
}
