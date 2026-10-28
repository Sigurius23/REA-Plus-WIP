package tt0;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tt0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Landroid/bluetooth/BluetoothDevice;", "", "a", "(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;", "connectivity-core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34156a {
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public static final String m107933a(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "<this>");
        try {
            String name = bluetoothDevice.getName();
            AbstractC22676k.m65747g(name);
            return name;
        } catch (Exception unused) {
            return "unknown";
        }
    }
}
