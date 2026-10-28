package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Parcelable;
import rd3.AbstractC31252a;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.v */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C26920v implements InterfaceC26885b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte[] f107430b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Parcelable f107431c;

    public /* synthetic */ C26920v(Parcelable parcelable, byte[] bArr, int i13) {
        this.f107429a = i13;
        this.f107431c = parcelable;
        this.f107430b = bArr;
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26885b0
    /* JADX INFO: renamed from: b */
    public final String mo80233b() {
        int i13 = this.f107429a;
        byte[] bArr = this.f107430b;
        Parcelable parcelable = this.f107431c;
        switch (i13) {
            case 0:
                int i14 = BleManagerHandler$4.f107299b;
                return "Read Response received from descr. " + ((BluetoothGattDescriptor) parcelable).getUuid() + ", value: " + AbstractC31252a.m96274a(bArr);
            default:
                int i15 = BleManagerHandler$4.f107299b;
                return "Read Response received from " + ((BluetoothGattCharacteristic) parcelable).getUuid() + ", value: " + AbstractC31252a.m96274a(bArr);
        }
    }
}
