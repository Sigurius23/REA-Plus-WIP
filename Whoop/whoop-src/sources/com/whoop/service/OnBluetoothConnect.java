package com.whoop.service;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c92.C4335g;
import ge3.AbstractC15751g;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import x82.C38076c;

/* JADX INFO: loaded from: classes10.dex */
public class OnBluetoothConnect extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private final InterfaceC34116n f29449a = InterfaceC34116n.m107846d("BluetoothReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String name;
        String address;
        String str;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice != null) {
            name = bluetoothDevice.getName();
            address = bluetoothDevice.getAddress();
        } else {
            name = "null";
            address = "null";
        }
        C4335g c4335g = (C4335g) AbstractC15751g.m44472y(C4335g.class, null, null);
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(intent.getAction())) {
            InterfaceC34116n interfaceC34116n = this.f29449a;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Bluetooth ACL device connected: ", name, "(", address, ") PowerSaver=");
            sbM32001t.append(((C38076c) AbstractC15751g.m44472y(C38076c.class, null, null)).m121982b());
            interfaceC34116n.mo85216g(sbM32001t.toString(), new AbstractC30556a.a[0]);
            c4335g.m13714c0(bluetoothDevice);
            return;
        }
        if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
            c4335g.m13715d0(bluetoothDevice);
            return;
        }
        if ("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", -1);
            if (intExtra == 0) {
                str = "disconnected";
            } else if (intExtra == 1) {
                c4335g.m13715d0(bluetoothDevice);
                str = "connecting";
            } else if (intExtra != 2) {
                str = intExtra != 3 ? "unknown" : "disconnecting";
            } else {
                c4335g.m13714c0(bluetoothDevice);
                str = "connected";
            }
            this.f29449a.mo85216g(AbstractC25012a.m73376i(address, ").", AbstractC11895b.m32001t("Bluetooth Connection Change - State: ", str, " for device: ", name, " (")), new AbstractC30556a.a[0]);
        }
    }
}
