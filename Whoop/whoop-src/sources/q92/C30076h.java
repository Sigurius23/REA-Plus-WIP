package q92;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import c92.C4329a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;
import u92.C34660d;

/* JADX INFO: renamed from: q92.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u001c2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ?\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001c\u0010\u0017J\r\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001f\u0010\u0017J\r\u0010 \u001a\u00020\u000e¢\u0006\u0004\b \u0010\u0017J\r\u0010!\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#¨\u0006$"}, m65681d2 = {"Lq92/h;", "", "Lu92/d;", "sharedPrefs", "Lc92/a;", "bluetoothHelper", "<init>", "(Lu92/d;Lc92/a;)V", "Landroid/bluetooth/BluetoothDevice;", "a", "()Landroid/bluetooth/BluetoothDevice;", "device", "Lst0/v;", "strapGeneration", "", "advertisingName", "strapSerialNumber", "maximVersion", "nordicVersion", "Ll83/a0;", "i", "(Landroid/bluetooth/BluetoothDevice;Lst0/v;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "f", "()Ljava/lang/String;", "g", "name", "j", "(Ljava/lang/String;)V", "c", "b", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "e", "Lu92/d;", "Lc92/a;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30076h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34660d sharedPrefs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C4329a bluetoothHelper;

    public C30076h(C34660d sharedPrefs, C4329a bluetoothHelper) {
        AbstractC22676k.m65750j(sharedPrefs, "sharedPrefs");
        AbstractC22676k.m65750j(bluetoothHelper, "bluetoothHelper");
        this.sharedPrefs = sharedPrefs;
        this.bluetoothHelper = bluetoothHelper;
    }

    /* JADX INFO: renamed from: a */
    public final BluetoothDevice m92195a() {
        BluetoothDevice remoteDevice;
        BluetoothAdapter bluetoothAdapter;
        synchronized (this) {
            remoteDevice = null;
            String strM109534k = this.sharedPrefs.m109534k("stored_device_address", null);
            if (strM109534k != null && (bluetoothAdapter = this.bluetoothHelper.getBluetoothAdapter()) != null) {
                remoteDevice = bluetoothAdapter.getRemoteDevice(strM109534k);
            }
        }
        return remoteDevice;
    }

    /* JADX INFO: renamed from: b */
    public final void m92196b() {
        synchronized (this) {
            this.sharedPrefs.m109525a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m92197c() {
        String strM109534k;
        synchronized (this) {
            strM109534k = this.sharedPrefs.m109534k("last_known_whoop_device_advertising_name", null);
        }
        return strM109534k;
    }

    /* JADX INFO: renamed from: d */
    public final String m92198d() {
        String strM109534k;
        synchronized (this) {
            strM109534k = this.sharedPrefs.m109534k("last_maxim_version", null);
            if (strM109534k == null) {
                strM109534k = "";
            }
        }
        return strM109534k;
    }

    /* JADX INFO: renamed from: e */
    public final String m92199e() {
        String strM109534k;
        synchronized (this) {
            strM109534k = this.sharedPrefs.m109534k("last_nordic_version", null);
            if (strM109534k == null) {
                strM109534k = "";
            }
        }
        return strM109534k;
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: f */
    public final String m92200f() {
        String strM109534k;
        synchronized (this) {
            C34660d c34660d = this.sharedPrefs;
            EnumC32978v.Companion companion = EnumC32978v.INSTANCE;
            EnumC32978v enumC32978v = EnumC32978v.GEN_4;
            strM109534k = c34660d.m109534k("last_known_whoop_device_generation", companion.m104089b(enumC32978v));
            if (strM109534k == null) {
                strM109534k = companion.m104089b(enumC32978v);
            }
        }
        return strM109534k;
    }

    /* JADX INFO: renamed from: g */
    public final String m92201g() {
        String strM109534k;
        synchronized (this) {
            strM109534k = this.sharedPrefs.m109534k("last_known_whoop_device_generation", null);
        }
        return strM109534k;
    }

    /* JADX INFO: renamed from: h */
    public final String m92202h() {
        String strM109534k;
        synchronized (this) {
            strM109534k = this.sharedPrefs.m109534k("last_whoop_serial_number", null);
        }
        return strM109534k;
    }

    /* JADX INFO: renamed from: i */
    public final void m92203i(BluetoothDevice device, EnumC32978v strapGeneration, String advertisingName, String strapSerialNumber, String maximVersion, String nordicVersion) {
        AbstractC22676k.m65750j(device, "device");
        AbstractC22676k.m65750j(strapGeneration, "strapGeneration");
        AbstractC22676k.m65750j(strapSerialNumber, "strapSerialNumber");
        AbstractC22676k.m65750j(maximVersion, "maximVersion");
        AbstractC22676k.m65750j(nordicVersion, "nordicVersion");
        synchronized (this) {
            try {
                this.sharedPrefs.m109543v("stored_device_name", device.getName());
                this.sharedPrefs.m109543v("stored_device_address", device.getAddress());
                this.sharedPrefs.m109543v("last_known_whoop_device_generation", EnumC32978v.INSTANCE.m104089b(strapGeneration));
                C34660d c34660d = this.sharedPrefs;
                if (advertisingName == null) {
                    advertisingName = device.getName();
                }
                c34660d.m109543v("last_known_whoop_device_advertising_name", advertisingName);
                this.sharedPrefs.m109543v("last_whoop_serial_number", strapSerialNumber);
                this.sharedPrefs.m109543v("last_maxim_version", maximVersion);
                this.sharedPrefs.m109543v("last_nordic_version", nordicVersion);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m92204j(String name) {
        AbstractC22676k.m65750j(name, "name");
        synchronized (this) {
            this.sharedPrefs.m109543v("last_known_whoop_device_advertising_name", name);
        }
    }
}
