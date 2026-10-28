package td3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import no.nordicsemi.android.support.v18.scanner.ScannerService;

/* JADX INFO: renamed from: td3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C33728h extends AbstractC33729i {

    /* JADX INFO: renamed from: a */
    public final PendingIntent f141059a;

    /* JADX INFO: renamed from: b */
    public Context f141060b;

    /* JADX INFO: renamed from: c */
    public final ScannerService f141061c;

    /* JADX INFO: renamed from: d */
    public long f141062d;

    /* JADX INFO: renamed from: e */
    public final long f141063e;

    public C33728h(PendingIntent pendingIntent, C33734n c33734n) {
        this.f141059a = pendingIntent;
        this.f141063e = c33734n.f141101E;
    }

    @Override // td3.AbstractC33729i
    /* JADX INFO: renamed from: a */
    public final void mo18123a(List list) {
        Context context = this.f141060b;
        if (context == null) {
            context = this.f141061c;
        }
        if (context == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f141062d > (jElapsedRealtime - this.f141063e) + 5) {
            return;
        }
        this.f141062d = jElapsedRealtime;
        try {
            Intent intent = new Intent();
            intent.putExtra("android.bluetooth.le.extra.CALLBACK_TYPE", 1);
            intent.putParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT", new ArrayList<>(list));
            intent.setExtrasClassLoader(C33733m.class.getClassLoader());
            this.f141059a.send(context, 0, intent);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    @Override // td3.AbstractC33729i
    /* JADX INFO: renamed from: b */
    public final void mo18124b(int i13) {
        Context context = this.f141060b;
        if (context == null) {
            context = this.f141061c;
        }
        if (context == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.putExtra("android.bluetooth.le.extra.ERROR_CODE", i13);
            this.f141059a.send(context, 0, intent);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    @Override // td3.AbstractC33729i
    /* JADX INFO: renamed from: c */
    public final void mo18125c(int i13, C33733m c33733m) {
        Context context = this.f141060b;
        if (context == null) {
            context = this.f141061c;
        }
        if (context == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.putExtra("android.bluetooth.le.extra.CALLBACK_TYPE", i13);
            intent.putParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT", new ArrayList<>(Collections.singletonList(c33733m)));
            this.f141059a.send(context, 0, intent);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    public C33728h(PendingIntent pendingIntent, C33734n c33734n, ScannerService scannerService) {
        this.f141059a = pendingIntent;
        this.f141063e = c33734n.f141101E;
        this.f141061c = scannerService;
    }
}
