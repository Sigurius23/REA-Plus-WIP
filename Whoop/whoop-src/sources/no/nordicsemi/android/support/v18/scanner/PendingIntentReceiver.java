package no.nordicsemi.android.support.v18.scanner;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.ParcelUuid;
import io.getstream.chat.android.client.ChatClient;
import java.util.ArrayList;
import java.util.Iterator;
import live.hms.video.utils.HMSConstantsKt;
import p031b9.AbstractC2875y;
import td3.AbstractC33722b;
import td3.C33725e;
import td3.C33726f;
import td3.C33728h;
import td3.C33730j;
import td3.C33731k;
import td3.C33733m;
import td3.C33734n;

/* JADX INFO: loaded from: classes3.dex */
public class PendingIntentReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PendingIntent pendingIntent;
        long j7;
        long j13;
        C33725e c33725eM106611f;
        long j14;
        long j15;
        if (context == null || intent == null || (pendingIntent = (PendingIntent) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_PENDING_INTENT")) == null) {
            return;
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("no.nordicsemi.android.support.v18.EXTRA_FILTERS");
        ScanSettings scanSettings = (ScanSettings) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_SETTINGS");
        if (parcelableArrayListExtra == null || scanSettings == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_BATCHING", true);
        boolean booleanExtra2 = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_FILTERING", true);
        boolean booleanExtra3 = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_CALLBACK_TYPES", true);
        long longExtra = intent.getLongExtra("no.nordicsemi.android.support.v18.EXTRA_MATCH_LOST_TIMEOUT", ChatClient.RESOLVE_DEPENDENCY_TIMEOUT);
        long longExtra2 = intent.getLongExtra("no.nordicsemi.android.support.v18.EXTRA_MATCH_LOST_INTERVAL", ChatClient.RESOLVE_DEPENDENCY_TIMEOUT);
        int intExtra = intent.getIntExtra("no.nordicsemi.android.support.v18.EXTRA_MATCH_MODE", 1);
        int intExtra2 = intent.getIntExtra("no.nordicsemi.android.support.v18.EXTRA_NUM_OF_MATCHES", 3);
        AbstractC33722b abstractC33722bM106606a = AbstractC33722b.m106606a();
        C33726f c33726f = (C33726f) abstractC33722bM106606a;
        ArrayList arrayList = new ArrayList();
        for (Iterator it = parcelableArrayListExtra.iterator(); it.hasNext(); it = it) {
            ScanFilter scanFilter = (ScanFilter) it.next();
            C33730j c33730j = new C33730j();
            String deviceAddress = scanFilter.getDeviceAddress();
            if (deviceAddress != null && !BluetoothAdapter.checkBluetoothAddress(deviceAddress)) {
                throw new IllegalArgumentException("invalid device address ".concat(deviceAddress));
            }
            c33730j.f141065b = deviceAddress;
            c33730j.f141064a = scanFilter.getDeviceName();
            ParcelUuid serviceUuid = scanFilter.getServiceUuid();
            ParcelUuid serviceUuidMask = scanFilter.getServiceUuidMask();
            if (serviceUuidMask != null && serviceUuid == null) {
                throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
            }
            c33730j.f141066c = serviceUuid;
            c33730j.f141067d = serviceUuidMask;
            c33730j.m106613a(scanFilter.getManufacturerId(), scanFilter.getManufacturerData(), scanFilter.getManufacturerDataMask());
            if (scanFilter.getServiceDataUuid() != null) {
                c33730j.m106614b(scanFilter.getServiceDataUuid(), scanFilter.getServiceData(), scanFilter.getServiceDataMask());
            }
            arrayList.add(new C33731k(c33730j.f141064a, c33730j.f141065b, c33730j.f141066c, c33730j.f141067d, c33730j.f141068e, c33730j.f141069f, c33730j.f141070g, c33730j.f141071h, c33730j.f141072i, c33730j.f141073j));
        }
        boolean legacy = scanSettings.getLegacy();
        int phy = scanSettings.getPhy();
        int callbackType = scanSettings.getCallbackType();
        if (callbackType != 1 && callbackType != 2 && callbackType != 4 && callbackType != 6) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(callbackType, "invalid callback type - "));
        }
        int scanMode = scanSettings.getScanMode();
        if (scanMode < -1 || scanMode > 2) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(scanMode, "invalid scan mode "));
        }
        long reportDelayMillis = scanSettings.getReportDelayMillis();
        if (reportDelayMillis < 0) {
            throw new IllegalArgumentException("reportDelay must be > 0");
        }
        if (longExtra <= 0 || longExtra2 <= 0) {
            throw new IllegalArgumentException("maxDeviceAgeMillis and taskIntervalMillis must be > 0");
        }
        if (intExtra < 1 || intExtra > 2) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(intExtra, "invalid matchMode "));
        }
        if (intExtra2 < 1 || intExtra2 > 3) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(intExtra2, "invalid numOfMatches "));
        }
        if (0 == 0 && 0 == 0) {
            if (scanMode == 1) {
                j14 = 2000;
                j15 = HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS;
            } else if (scanMode != 2) {
                j14 = 500;
                j15 = 4500;
            } else {
                j14 = 0;
                j15 = 0;
            }
            j13 = j15;
            j7 = j14;
        } else {
            j7 = 0;
            j13 = 0;
        }
        C33734n c33734n = new C33734n(scanMode, callbackType, reportDelayMillis, intExtra, intExtra2, legacy, phy, booleanExtra2, booleanExtra, booleanExtra3, longExtra, longExtra2, j7, j13);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        boolean zIsOffloadedScanBatchingSupported = defaultAdapter.isOffloadedScanBatchingSupported();
        boolean zIsOffloadedFilteringSupported = defaultAdapter.isOffloadedFilteringSupported();
        synchronized (abstractC33722bM106606a) {
            try {
                try {
                    c33725eM106611f = c33726f.m106611f(pendingIntent);
                    if (c33725eM106611f == null) {
                        c33725eM106611f = new C33725e(zIsOffloadedScanBatchingSupported, zIsOffloadedFilteringSupported, arrayList, c33734n, new C33728h(pendingIntent, c33734n));
                        c33734n = c33734n;
                        synchronized (c33726f.f141057c) {
                            c33726f.f141057c.put(pendingIntent, c33725eM106611f);
                        }
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        c33725eM106611f.f141055n.f141060b = context;
        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT");
        if (parcelableArrayListExtra2 != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = parcelableArrayListExtra2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(c33726f.m106610e((ScanResult) it3.next()));
            }
            if (c33734n.f141101E > 0) {
                c33725eM106611f.m106604b(arrayList2);
            } else if (!arrayList2.isEmpty()) {
                c33725eM106611f.m106603a(intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", 1), (C33733m) arrayList2.get(0));
            }
        } else {
            int intExtra3 = intent.getIntExtra("android.bluetooth.le.extra.ERROR_CODE", 0);
            if (intExtra3 != 0) {
                c33725eM106611f.f141045h.mo18124b(intExtra3);
            }
        }
        c33725eM106611f.f141055n.f141060b = null;
    }
}
