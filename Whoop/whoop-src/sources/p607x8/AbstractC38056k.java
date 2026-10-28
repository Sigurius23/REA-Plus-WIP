package p607x8;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: x8.k */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC38056k {
    /* JADX INFO: renamed from: a */
    public static void m121837a(Context context, C38058m c38058m) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            C38055j c38055j = new C38055j(c38058m);
            telephonyManager.registerTelephonyCallback((Executor) c38058m.f163011c, c38055j);
            telephonyManager.unregisterTelephonyCallback(c38055j);
        } catch (RuntimeException unused) {
            c38058m.m121840c(5);
        }
    }
}
