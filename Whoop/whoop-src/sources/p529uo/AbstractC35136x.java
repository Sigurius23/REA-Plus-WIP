package p529uo;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.internal.zzaf;

/* JADX INFO: renamed from: uo.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC35136x {

    /* JADX INFO: renamed from: a */
    public static final Uri f149085a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a */
    public static Intent m111098a(Context context, C35112e0 c35112e0) throws zzaf {
        Bundle bundleCall;
        String str = c35112e0.f148995a;
        Intent intent = null;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (c35112e0.f148997c) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f149085a);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                } catch (Throwable th3) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th3;
                }
            } catch (RemoteException e5) {
                e = e5;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            } catch (IllegalArgumentException e13) {
                e = e13;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
            if (bundleCall != null) {
                Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                if (intent2 != null) {
                    intent = intent2;
                } else {
                    PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                    if (pendingIntent != null) {
                        StringBuilder sb4 = new StringBuilder(str.length() + 72);
                        sb4.append("Dynamic lookup for intent failed for action ");
                        sb4.append(str);
                        sb4.append(" but has possible resolution");
                        Log.w("ServiceBindIntentUtils", sb4.toString());
                        throw new zzaf(new C4969a(25, pendingIntent));
                    }
                }
            }
            if (intent == null) {
                Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str));
            }
        }
        return intent == null ? new Intent(str).setPackage(c35112e0.f148996b) : intent;
    }
}
