package td3;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.os.Handler;
import android.os.Looper;
import io.getstream.chat.android.client.ChatClient;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: td3.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC33722b {

    /* JADX INFO: renamed from: a */
    public static C33726f f141051a;

    /* JADX INFO: renamed from: a */
    public static synchronized AbstractC33722b m106606a() {
        C33726f c33726f = f141051a;
        if (c33726f != null) {
            return c33726f;
        }
        C33726f c33726f2 = new C33726f();
        f141051a = c33726f2;
        return c33726f2;
    }

    /* JADX INFO: renamed from: b */
    public final void m106607b(ArrayList arrayList, C33734n c33734n, AbstractC33729i abstractC33729i) {
        mo106608c(arrayList, c33734n != null ? c33734n : new C33734n(0, 1, 0L, 1, 3, true, 255, true, true, true, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, 500L, 4500L), abstractC33729i, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo106608c(List list, C33734n c33734n, AbstractC33729i abstractC33729i, Handler handler);

    /* JADX INFO: renamed from: d */
    public final void m106609d(AbstractC33729i abstractC33729i) {
        C33724d c33724d;
        BluetoothLeScanner bluetoothLeScanner;
        if (abstractC33729i == null) {
            throw new IllegalArgumentException("callback is null");
        }
        C33726f c33726f = (C33726f) this;
        synchronized (c33726f.f141056b) {
            c33724d = (C33724d) c33726f.f141056b.m1302a(abstractC33729i);
        }
        if (c33724d == null) {
            return;
        }
        c33724d.f141042e = true;
        c33724d.f141046i.removeCallbacksAndMessages(null);
        synchronized (c33724d.f141038a) {
            c33724d.f141049l.clear();
            c33724d.f141048k.clear();
            c33724d.f141047j.clear();
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || (bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner()) == null) {
            return;
        }
        bluetoothLeScanner.stopScan(c33724d.f141054n);
    }
}
