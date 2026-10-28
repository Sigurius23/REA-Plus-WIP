package a50;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import d13.AbstractC11478a;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a50.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C0385a {

    /* JADX INFO: renamed from: a */
    public final BluetoothDevice f1331a;

    /* JADX INFO: renamed from: b */
    public final String f1332b;

    /* JADX INFO: renamed from: c */
    public final Integer f1333c;

    public C0385a(BluetoothDevice bluetoothDevice) {
        String name = bluetoothDevice.getName();
        name = name == null ? "Bluetooth" : name;
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        Integer numValueOf = bluetoothClass != null ? Integer.valueOf(bluetoothClass.getDeviceClass()) : null;
        this.f1331a = bluetoothDevice;
        this.f1332b = name;
        this.f1333c = numValueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0385a)) {
            return false;
        }
        C0385a c0385a = (C0385a) obj;
        return AbstractC22676k.m65745e(this.f1331a, c0385a.f1331a) && AbstractC22676k.m65745e(this.f1332b, c0385a.f1332b) && AbstractC22676k.m65745e(this.f1333c, c0385a.f1333c);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f1331a.hashCode() * 31, 31, this.f1332b);
        Integer num = this.f1333c;
        return iM30450d + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BluetoothDeviceWrapperImpl(device=");
        sb4.append(this.f1331a);
        sb4.append(", name=");
        sb4.append(this.f1332b);
        sb4.append(", deviceClass=");
        return AbstractC11478a.m30859k(sb4, this.f1333c, ")");
    }
}
