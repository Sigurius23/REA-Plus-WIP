package p556vm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
import p000.AbstractC11266d;
import p309lo.AbstractC24567y;
import v00.C35467g0;

/* JADX INFO: renamed from: vm.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C36135b implements Parcelable {
    public static final Parcelable.Creator<C36135b> CREATOR = new C35467g0(5);

    /* JADX INFO: renamed from: E */
    public final byte[] f154634E;

    /* JADX INFO: renamed from: w */
    public int f154635w;

    /* JADX INFO: renamed from: x */
    public final UUID f154636x;

    /* JADX INFO: renamed from: y */
    public final String f154637y;

    /* JADX INFO: renamed from: z */
    public final String f154638z;

    public C36135b(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f154636x = uuid;
        this.f154637y = str;
        str2.getClass();
        this.f154638z = str2;
        this.f154634E = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C36135b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C36135b c36135b = (C36135b) obj;
        return AbstractC24567y.m71670a(this.f154637y, c36135b.f154637y) && AbstractC24567y.m71670a(this.f154638z, c36135b.f154638z) && AbstractC24567y.m71670a(this.f154636x, c36135b.f154636x) && Arrays.equals(this.f154634E, c36135b.f154634E);
    }

    public final int hashCode() {
        if (this.f154635w == 0) {
            int iHashCode = this.f154636x.hashCode() * 31;
            String str = this.f154637y;
            this.f154635w = Arrays.hashCode(this.f154634E) + AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f154638z);
        }
        return this.f154635w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        UUID uuid = this.f154636x;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f154637y);
        parcel.writeString(this.f154638z);
        parcel.writeByteArray(this.f154634E);
    }

    public C36135b(Parcel parcel) {
        this.f154636x = new UUID(parcel.readLong(), parcel.readLong());
        this.f154637y = parcel.readString();
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        this.f154638z = string;
        this.f154634E = parcel.createByteArray();
    }
}
