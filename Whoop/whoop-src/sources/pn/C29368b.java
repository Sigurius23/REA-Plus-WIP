package pn;

import android.os.Parcel;
import android.os.Parcelable;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: pn.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C29368b extends AbstractC29369c {
    public static final Parcelable.Creator<C29368b> CREATOR = new C29367a(0);

    /* JADX INFO: renamed from: w */
    public final long f119121w;

    /* JADX INFO: renamed from: x */
    public final long f119122x;

    /* JADX INFO: renamed from: y */
    public final byte[] f119123y;

    public C29368b(long j7, byte[] bArr, long j13) {
        this.f119121w = j13;
        this.f119122x = j7;
        this.f119123y = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeLong(this.f119121w);
        parcel.writeLong(this.f119122x);
        parcel.writeByteArray(this.f119123y);
    }

    public C29368b(Parcel parcel) {
        this.f119121w = parcel.readLong();
        this.f119122x = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i13 = AbstractC24567y.f95875a;
        this.f119123y = bArrCreateByteArray;
    }
}
