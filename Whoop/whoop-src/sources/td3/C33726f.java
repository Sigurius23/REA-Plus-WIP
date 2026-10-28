package td3;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import android.os.ParcelUuid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p009a8.C0534d;

/* JADX INFO: renamed from: td3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C33726f extends AbstractC33722b {

    /* JADX INFO: renamed from: b */
    public final C0534d f141056b = new C0534d(1);

    /* JADX INFO: renamed from: c */
    public final HashMap f141057c = new HashMap();

    @Override // td3.AbstractC33722b
    /* JADX INFO: renamed from: c */
    public final void mo106608c(List list, C33734n c33734n, AbstractC33729i abstractC33729i, Handler handler) {
        boolean z4;
        C33724d c33724d;
        ArrayList arrayList;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        BluetoothLeScanner bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
        if (bluetoothLeScanner == null) {
            throw new IllegalStateException("BT le scanner not available");
        }
        boolean zIsOffloadedScanBatchingSupported = defaultAdapter.isOffloadedScanBatchingSupported();
        boolean zIsOffloadedFilteringSupported = defaultAdapter.isOffloadedFilteringSupported();
        synchronized (this.f141056b) {
            Iterator it = this.f141056b.f1848a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                }
                AbstractC33729i abstractC33729i2 = ((AbstractC33721a) it.next()).f141045h;
                if (abstractC33729i2 != abstractC33729i && (!(abstractC33729i2 instanceof C33735o) || ((AbstractC33729i) ((C33735o) abstractC33729i2).f141115a.get()) != abstractC33729i)) {
                }
                z4 = true;
                break;
            }
            if (z4) {
                throw new IllegalArgumentException("scanner already started with given callback");
            }
            c33724d = new C33724d(zIsOffloadedScanBatchingSupported, zIsOffloadedFilteringSupported, list, c33734n, new C33735o(abstractC33729i), handler);
            this.f141056b.f1848a.add(c33724d);
        }
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (defaultAdapter.isOffloadedScanBatchingSupported() && c33734n.f141105I) {
            builder.setReportDelay(c33734n.f141101E);
        }
        if (c33734n.f141106J) {
            builder.setCallbackType(c33734n.f141114z).setMatchMode(c33734n.f141102F).setNumOfMatches(c33734n.f141103G);
        }
        builder.setScanMode(c33734n.f141113y).setLegacy(c33734n.f141109M).setPhy(c33734n.f141110N);
        ScanSettings scanSettingsBuild = builder.build();
        if (!list.isEmpty() && zIsOffloadedFilteringSupported && c33734n.f141104H) {
            arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C33731k c33731k = (C33731k) it3.next();
                ScanFilter.Builder builder2 = new ScanFilter.Builder();
                builder2.setServiceUuid(c33731k.f141082y, c33731k.f141083z).setManufacturerData(c33731k.f141077H, c33731k.f141078I, c33731k.f141079J);
                String str = c33731k.f141081x;
                if (str != null) {
                    builder2.setDeviceAddress(str);
                }
                String str2 = c33731k.f141080w;
                if (str2 != null) {
                    builder2.setDeviceName(str2);
                }
                ParcelUuid parcelUuid = c33731k.f141074E;
                if (parcelUuid != null) {
                    builder2.setServiceData(parcelUuid, c33731k.f141075F, c33731k.f141076G);
                }
                arrayList.add(builder2.build());
            }
        } else {
            arrayList = null;
        }
        bluetoothLeScanner.startScan(arrayList, scanSettingsBuild, c33724d.f141054n);
    }

    /* JADX INFO: renamed from: e */
    public final C33733m m106610e(ScanResult scanResult) {
        return new C33733m(scanResult.getDevice(), (((scanResult.getDataStatus() << 5) | (scanResult.isLegacy() ? 16 : 0)) | (scanResult.isConnectable() ? 1 : 0)) == true ? 1 : 0, scanResult.getPrimaryPhy(), scanResult.getSecondaryPhy(), scanResult.getAdvertisingSid(), scanResult.getTxPower(), scanResult.getRssi(), scanResult.getPeriodicAdvertisingInterval(), C33732l.m106616a(scanResult.getScanRecord() != null ? scanResult.getScanRecord().getBytes() : null), scanResult.getTimestampNanos());
    }

    /* JADX INFO: renamed from: f */
    public final C33725e m106611f(PendingIntent pendingIntent) {
        synchronized (this.f141057c) {
            try {
                if (!this.f141057c.containsKey(pendingIntent)) {
                    return null;
                }
                C33725e c33725e = (C33725e) this.f141057c.get(pendingIntent);
                if (c33725e != null) {
                    return c33725e;
                }
                throw new IllegalStateException("Scanning has been stopped");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
