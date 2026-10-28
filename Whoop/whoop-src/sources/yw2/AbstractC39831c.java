package yw2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: yw2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0082\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"", "value", "", "b", "(Ljava/lang/String;)Z", "newName", "d", "(Ljava/lang/String;Ljava/lang/String;)Z", "Landroid/bluetooth/BluetoothDevice;", "c", "(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39831c {
    /* JADX INFO: renamed from: b */
    private static final boolean m127791b(String str) {
        return AbstractC39421y.m125930O(str, "BT device", false);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: c */
    public static final String m127792c(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "<this>");
        String name = bluetoothDevice.getName();
        return name == null ? AbstractC11266d.m30461o("BT device ", bluetoothDevice.getAddress()) : name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final boolean m127793d(String str, String str2) {
        return (AbstractC22676k.m65745e(str, str2) || !m127791b(str) || m127791b(str2)) ? false : true;
    }
}
