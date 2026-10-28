package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import rd3.AbstractC31252a;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C26904l extends BroadcastReceiver {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f107394c = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f107396b;

    public /* synthetic */ C26904l(Object obj, int i13) {
        this.f107395a = i13;
        this.f107396b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        BluetoothGatt bluetoothGatt;
        String strM8296i;
        int i13 = this.f107395a;
        Object obj = this.f107396b;
        int i14 = 3;
        switch (i13) {
            case 0:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
                int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
                AbstractC26887c0 abstractC26887c0 = (AbstractC26887c0) obj;
                if (abstractC26887c0.f107344y != null && bluetoothDevice != null && bluetoothDevice.getAddress().equals(abstractC26887c0.f107344y.getAddress())) {
                    abstractC26887c0.m80323U1(3, new C26917s(intExtra, 8));
                    int i15 = 4;
                    int i16 = 2;
                    switch (intExtra) {
                        case 10:
                            if (intExtra2 == 11) {
                                abstractC26887c0.m80341k2();
                                AbstractC26887c0.m80304u1(abstractC26887c0, new C26894g(bluetoothDevice, i14));
                                abstractC26887c0.m80323U1(5, new C26919u(8));
                                if (abstractC26887c0.f107336d0 != null && (abstractC26887c0.f107336d0.f107385d == 4 || abstractC26887c0.f107336d0.f107385d == 5 || abstractC26887c0.f107336d0.f107385d == 7 || abstractC26887c0.f107336d0.f107385d == 11 || abstractC26887c0.f107336d0.f107385d == 10 || abstractC26887c0.f107336d0.f107385d == 12)) {
                                    abstractC26887c0.f107336d0.mo80360e(bluetoothDevice, -4);
                                    abstractC26887c0.f107336d0 = null;
                                }
                                if (!abstractC26887c0.f107316J && !abstractC26887c0.f107318L) {
                                    BluetoothGatt bluetoothGatt2 = abstractC26887c0.f107345z;
                                    if (bluetoothGatt2 != null) {
                                        abstractC26887c0.f107318L = true;
                                        abstractC26887c0.m80323U1(2, new C26919u(6));
                                        abstractC26887c0.m80323U1(3, new C26919u(7));
                                        bluetoothGatt2.discoverServices();
                                    }
                                }
                            } else if (intExtra2 == 12) {
                                abstractC26887c0.f107324R = true;
                                if (abstractC26887c0.f107336d0 != null && abstractC26887c0.f107336d0.f107385d == 6) {
                                    abstractC26887c0.m80323U1(4, new C26919u(9));
                                    abstractC26887c0.f107336d0.mo80363h(bluetoothDevice);
                                    abstractC26887c0.f107336d0 = null;
                                }
                                if (!abstractC26887c0.m80321R1()) {
                                    abstractC26887c0.m80343v1();
                                }
                            }
                            break;
                        case 11:
                            abstractC26887c0.m80341k2();
                            AbstractC26887c0.m80304u1(abstractC26887c0, new C26894g(bluetoothDevice, i15));
                            break;
                        case 12:
                            abstractC26887c0.m80323U1(4, new C26919u(10));
                            abstractC26887c0.m80341k2();
                            AbstractC26887c0.m80304u1(abstractC26887c0, new C26894g(bluetoothDevice, i16));
                            if (abstractC26887c0.f107336d0 != null && (abstractC26887c0.f107336d0.f107385d == 4 || abstractC26887c0.f107336d0.f107385d == 5)) {
                                abstractC26887c0.f107336d0.mo80363h(bluetoothDevice);
                                abstractC26887c0.f107336d0 = null;
                                break;
                            } else if (!abstractC26887c0.f107316J && !abstractC26887c0.f107318L && (bluetoothGatt = abstractC26887c0.f107345z) != null) {
                                abstractC26887c0.f107318L = true;
                                abstractC26887c0.m80323U1(2, new C26919u(6));
                                abstractC26887c0.m80323U1(3, new C26919u(7));
                                bluetoothGatt.discoverServices();
                                break;
                            }
                            break;
                    }
                    abstractC26887c0.m80324V1(true);
                    break;
                }
                break;
            case 1:
                int intExtra3 = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
                int intExtra4 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 10);
                AbstractC26887c0 abstractC26887c1 = (AbstractC26887c0) obj;
                abstractC26887c1.m80323U1(3, new C26917s(this, intExtra3));
                if (intExtra3 == 10 || intExtra3 == 13) {
                    if (intExtra4 == 13 || intExtra4 == 10) {
                        abstractC26887c1.m80343v1();
                    } else {
                        abstractC26887c1.f107323Q = true;
                        abstractC26887c1.m80344w1(-100);
                        abstractC26887c1.f107322P = false;
                        BluetoothDevice bluetoothDevice2 = abstractC26887c1.f107344y;
                        if (bluetoothDevice2 != null) {
                            if (abstractC26887c1.f107336d0 != null && abstractC26887c1.f107336d0.f107385d != 3) {
                                abstractC26887c1.f107336d0.mo80360e(bluetoothDevice2, -100);
                                abstractC26887c1.f107336d0 = null;
                            }
                            if (abstractC26887c1.f107335c0 != null) {
                                abstractC26887c1.f107335c0.mo80360e(bluetoothDevice2, -100);
                                abstractC26887c1.f107335c0 = null;
                            }
                        }
                        abstractC26887c1.f107324R = true;
                        abstractC26887c1.f107323Q = false;
                        if (bluetoothDevice2 != null) {
                            abstractC26887c1.m80325W1(bluetoothDevice2, 1);
                        }
                        abstractC26887c1.f107321O = false;
                        abstractC26887c1.f107326T = 0;
                    }
                }
                break;
            default:
                BluetoothDevice bluetoothDevice3 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                AbstractC26886c abstractC26886c = (AbstractC26886c) obj;
                BluetoothDevice bluetoothDeviceM80347z1 = abstractC26886c.f107307b.m80347z1();
                if (bluetoothDeviceM80347z1 != null && bluetoothDevice3 != null && bluetoothDevice3.getAddress().equals(bluetoothDeviceM80347z1.getAddress())) {
                    int intExtra5 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", 0);
                    int intExtra6 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", -1);
                    StringBuilder sb4 = new StringBuilder("[Broadcast] Action received: android.bluetooth.device.action.PAIRING_REQUEST, pairing variant: ");
                    char[] cArr = AbstractC31252a.f128755a;
                    switch (intExtra5) {
                        case 0:
                            strM8296i = "PAIRING_VARIANT_PIN";
                            break;
                        case 1:
                            strM8296i = "PAIRING_VARIANT_PASSKEY";
                            break;
                        case 2:
                            strM8296i = "PAIRING_VARIANT_PASSKEY_CONFIRMATION";
                            break;
                        case 3:
                            strM8296i = "PAIRING_VARIANT_CONSENT";
                            break;
                        case 4:
                            strM8296i = "PAIRING_VARIANT_DISPLAY_PASSKEY";
                            break;
                        case 5:
                            strM8296i = "PAIRING_VARIANT_DISPLAY_PIN";
                            break;
                        case 6:
                            strM8296i = "PAIRING_VARIANT_OOB_CONSENT";
                            break;
                        default:
                            strM8296i = AbstractC2875y.m8296i(intExtra5, "UNKNOWN (", ")");
                            break;
                    }
                    AbstractC11266d.m30470x(intExtra5, strM8296i, " (", "); key: ", sb4);
                    sb4.append(intExtra6);
                    abstractC26886c.mo80247P(3, sb4.toString());
                    abstractC26886c.m80250S(bluetoothDevice3, intExtra5, intExtra6);
                    break;
                }
                break;
        }
    }
}
