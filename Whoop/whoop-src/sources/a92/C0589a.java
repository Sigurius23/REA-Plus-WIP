package a92;

import a82.C0570a;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import c92.C4329a;
import e50.C12723b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import lh3.C24082e;
import qm2.C30502s;
import qr2.AbstractC30556a;
import tr2.C34117o;
import tr2.InterfaceC34116n;
import xg3.C38280g;

/* JADX INFO: renamed from: a92.a */
/* JADX INFO: loaded from: classes4.dex */
public class C0589a {

    /* JADX INFO: renamed from: b */
    private final C4329a f2087b;

    /* JADX INFO: renamed from: e */
    private final InterfaceC34116n f2090e;

    /* JADX INFO: renamed from: g */
    private BluetoothLeScanner f2092g;

    /* JADX INFO: renamed from: h */
    private final C0570a f2093h;

    /* JADX INFO: renamed from: a */
    private final Object f2086a = new Object();

    /* JADX INFO: renamed from: d */
    private final C24082e f2089d = C24082e.m71000Y();

    /* JADX INFO: renamed from: f */
    final Set<c> f2091f = new HashSet();

    /* JADX INFO: renamed from: i */
    final ScanCallback f2094i = new a();

    /* JADX INFO: renamed from: c */
    private final Set<b> f2088c = new HashSet();

    /* JADX INFO: renamed from: a92.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    public class a extends ScanCallback {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        private boolean m1534a(ScanResult scanResult) {
            if (scanResult.getScanRecord() != null) {
                return C0589a.this.f2093h.m1478e(scanResult);
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        private void m1535b(ScanResult scanResult) {
            BluetoothDevice device = scanResult.getDevice();
            if (device == null) {
                C12723b.m35566a().m35569d().mo85222m("Scanned something with no device?", new AbstractC30556a.a[0]);
            } else if (m1534a(scanResult)) {
                C0589a.this.f2091f.add(new c(scanResult));
                C0589a.this.f2089d.onNext(new C30502s(device.getName(), device.getAddress(), scanResult.getRssi(), device));
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> list) {
            Iterator<ScanResult> it = list.iterator();
            while (it.hasNext()) {
                m1535b(it.next());
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i13, ScanResult scanResult) {
            m1535b(scanResult);
        }
    }

    /* JADX INFO: renamed from: a92.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    public class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public void m1536a() {
            C0589a.this.m1531j(this);
        }
    }

    /* JADX INFO: renamed from: a92.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    public static class c {

        /* JADX INFO: renamed from: a */
        final ScanResult f2097a;

        public c(ScanResult scanResult) {
            this.f2097a = scanResult;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass().equals(obj.getClass())) {
                return this.f2097a.getDevice().getAddress().equals(((c) obj).f2097a.getDevice().getAddress());
            }
            return false;
        }

        public int hashCode() {
            return this.f2097a.getDevice().getAddress().hashCode();
        }
    }

    public C0589a(C4329a c4329a, InterfaceC34116n interfaceC34116n, C0570a c0570a) {
        this.f2093h = c0570a;
        this.f2087b = c4329a;
        this.f2090e = new C34117o(interfaceC34116n, "ScanController");
        if (c4329a.getIsBluetoothSupported()) {
            this.f2092g = c4329a.getBluetoothAdapter().getBluetoothLeScanner();
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: d */
    private void m1527d() {
        if (this.f2087b.getIsBluetoothSupported()) {
            int state = this.f2087b.getBluetoothAdapter().getState();
            if (state == 12) {
                m1529f().startScan(this.f2093h.m1475a(), this.f2093h.getLowLatencyScanSettings(), this.f2094i);
                return;
            }
            this.f2090e.mo85222m("Invalid state. Attempted to start LE scan but adapter state was " + this.f2087b.m13650c(state), new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m1528e() {
        if (this.f2087b.getIsBluetoothSupported()) {
            int state = this.f2087b.getBluetoothAdapter().getState();
            if (state == 12) {
                m1529f().stopScan(this.f2094i);
                return;
            }
            this.f2090e.mo85222m("Invalid state. Attempted to stop LE scan but adapter state was " + this.f2087b.m13650c(state), new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: f */
    private BluetoothLeScanner m1529f() {
        if (!this.f2087b.getIsBluetoothSupported()) {
            return null;
        }
        if (this.f2092g == null) {
            BluetoothLeScanner bluetoothLeScanner = this.f2087b.getBluetoothAdapter().getBluetoothLeScanner();
            StringBuilder sb4 = new StringBuilder("Illegal bluetooth state to retrieve scanner: ");
            C4329a c4329a = this.f2087b;
            sb4.append(c4329a.m13650c(c4329a.getBluetoothAdapter().getState()));
            Objects.requireNonNull(bluetoothLeScanner, sb4.toString());
            this.f2092g = bluetoothLeScanner;
        }
        return this.f2092g;
    }

    /* JADX INFO: renamed from: g */
    private void m1530g() {
        if (this.f2087b.getIsBluetoothSupported() && this.f2087b.getBluetoothAdapter().getBondedDevices().isEmpty()) {
            this.f2090e.mo85216g("Bonded device : none found", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m1531j(b bVar) {
        synchronized (this.f2086a) {
            try {
                this.f2090e.mo85216g("Bluetooth scan found devices", new AbstractC30556a.a[0]);
                for (c cVar : this.f2091f) {
                    String name = cVar.f2097a.getDevice().getName();
                    if (name != null && !name.isEmpty()) {
                        this.f2090e.mo85216g("name=" + name + ", ID=" + cVar.f2097a.getDevice().getAddress(), new AbstractC30556a.a[0]);
                    }
                }
                this.f2090e.mo85228t("Stopping an individual scan", new AbstractC30556a.a[0]);
                this.f2088c.remove(bVar);
                if (this.f2088c.isEmpty()) {
                    this.f2090e.mo85228t("Stopping scan", new AbstractC30556a.a[0]);
                    if (this.f2087b.m13653f()) {
                        m1528e();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public C38280g<C30502s> m1532h() {
        return this.f2089d;
    }

    /* JADX INFO: renamed from: i */
    public b m1533i() {
        synchronized (this.f2086a) {
            try {
                m1530g();
                if (!this.f2087b.m13653f()) {
                    return null;
                }
                b bVar = new b();
                if (this.f2088c.isEmpty()) {
                    this.f2090e.mo85228t("Starting scan", new AbstractC30556a.a[0]);
                    m1527d();
                }
                this.f2088c.add(bVar);
                return bVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
