package p432qo;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.AbstractC4977h;
import com.google.android.gms.common.api.C4976g;
import com.google.android.gms.common.api.InterfaceC4972c;
import com.google.android.gms.tasks.Task;
import e73.C12803b;
import p095dp.C12238b;
import p503tp.AbstractC34037h;
import p503tp.C34039j;
import q30.C29934u0;
import to.AbstractC33993q;

/* JADX INFO: renamed from: qo.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C30523a extends AbstractC4977h {

    /* JADX INFO: renamed from: a */
    public static int f125519a = 1;

    public C30523a(Activity activity) {
        super(activity, activity, AbstractC34037h.f142695a, InterfaceC4972c.f20498g, C4976g.f20501c);
    }

    /* JADX INFO: renamed from: c */
    public Task m93542c(C34039j c34039j) {
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.f43827e = new C29934u0(c34039j, 27);
        c12803bM107465a.f43826d = 2426;
        return doRead(c12803bM107465a.m35864g());
    }

    /* JADX INFO: renamed from: d */
    public synchronized int m93543d() {
        int i13;
        try {
            i13 = f125519a;
            if (i13 == 1) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, 12451000);
                if (iIsGooglePlayServicesAvailable == 0) {
                    i13 = 4;
                    f125519a = 4;
                } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, iIsGooglePlayServicesAvailable, null) != null || C12238b.m34028a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i13 = 2;
                    f125519a = 2;
                } else {
                    i13 = 3;
                    f125519a = 3;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return i13;
    }
}
