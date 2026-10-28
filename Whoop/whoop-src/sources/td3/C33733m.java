package td3;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p088dc.AbstractC11895b;
import p474s.AbstractC32004s;
import p486sp.C32854e;

/* JADX INFO: renamed from: td3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C33733m implements Parcelable {
    public static final Parcelable.Creator<C33733m> CREATOR = new C32854e(9);

    /* JADX INFO: renamed from: E */
    public final int f141091E;

    /* JADX INFO: renamed from: F */
    public final int f141092F;

    /* JADX INFO: renamed from: G */
    public final int f141093G;

    /* JADX INFO: renamed from: H */
    public final int f141094H;

    /* JADX INFO: renamed from: I */
    public final int f141095I;

    /* JADX INFO: renamed from: J */
    public final int f141096J;

    /* JADX INFO: renamed from: w */
    public final BluetoothDevice f141097w;

    /* JADX INFO: renamed from: x */
    public final C33732l f141098x;

    /* JADX INFO: renamed from: y */
    public final int f141099y;

    /* JADX INFO: renamed from: z */
    public final long f141100z;

    public C33733m(BluetoothDevice bluetoothDevice, int i13, int i14, int i15, int i16, int i17, int i18, int i19, C33732l c33732l, long j7) {
        this.f141097w = bluetoothDevice;
        this.f141091E = i13;
        this.f141092F = i14;
        this.f141093G = i15;
        this.f141094H = i16;
        this.f141095I = i17;
        this.f141099y = i18;
        this.f141096J = i19;
        this.f141098x = c33732l;
        this.f141100z = j7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C33733m.class == obj.getClass()) {
            C33733m c33733m = (C33733m) obj;
            if (AbstractC32004s.m99541j(this.f141097w, c33733m.f141097w) && this.f141099y == c33733m.f141099y && AbstractC32004s.m99541j(this.f141098x, c33733m.f141098x) && this.f141100z == c33733m.f141100z && this.f141091E == c33733m.f141091E && this.f141092F == c33733m.f141092F && this.f141093G == c33733m.f141093G && this.f141094H == c33733m.f141094H && this.f141095I == c33733m.f141095I && this.f141096J == c33733m.f141096J) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f141097w, Integer.valueOf(this.f141099y), this.f141098x, Long.valueOf(this.f141100z), Integer.valueOf(this.f141091E), Integer.valueOf(this.f141092F), Integer.valueOf(this.f141093G), Integer.valueOf(this.f141094H), Integer.valueOf(this.f141095I), Integer.valueOf(this.f141096J)});
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ScanResult{device=");
        sb4.append(this.f141097w);
        sb4.append(", scanRecord=");
        C33732l c33732l = this.f141098x;
        sb4.append(c33732l == null ? "null" : c33732l.toString());
        sb4.append(", rssi=");
        sb4.append(this.f141099y);
        sb4.append(", timestampNanos=");
        sb4.append(this.f141100z);
        sb4.append(", eventType=");
        sb4.append(this.f141091E);
        sb4.append(", primaryPhy=");
        sb4.append(this.f141092F);
        sb4.append(", secondaryPhy=");
        sb4.append(this.f141093G);
        sb4.append(", advertisingSid=");
        sb4.append(this.f141094H);
        sb4.append(", txPower=");
        sb4.append(this.f141095I);
        sb4.append(", periodicAdvertisingInterval=");
        return AbstractC11895b.m31999r(sb4, this.f141096J, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        this.f141097w.writeToParcel(parcel, i13);
        C33732l c33732l = this.f141098x;
        if (c33732l != null) {
            parcel.writeInt(1);
            parcel.writeByteArray(c33732l.f141090g);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f141099y);
        parcel.writeLong(this.f141100z);
        parcel.writeInt(this.f141091E);
        parcel.writeInt(this.f141092F);
        parcel.writeInt(this.f141093G);
        parcel.writeInt(this.f141094H);
        parcel.writeInt(this.f141095I);
        parcel.writeInt(this.f141096J);
    }

    public C33733m(Parcel parcel) {
        this.f141097w = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 1) {
            this.f141098x = C33732l.m106616a(parcel.createByteArray());
        }
        this.f141099y = parcel.readInt();
        this.f141100z = parcel.readLong();
        this.f141091E = parcel.readInt();
        this.f141092F = parcel.readInt();
        this.f141093G = parcel.readInt();
        this.f141094H = parcel.readInt();
        this.f141095I = parcel.readInt();
        this.f141096J = parcel.readInt();
    }
}
