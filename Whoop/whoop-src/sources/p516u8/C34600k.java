package p516u8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import p000.AbstractC11266d;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: u8.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C34600k implements Parcelable {
    public static final Parcelable.Creator<C34600k> CREATOR = new C34598j(1);

    /* JADX INFO: renamed from: E */
    public final byte[] f145679E;

    /* JADX INFO: renamed from: w */
    public int f145680w;

    /* JADX INFO: renamed from: x */
    public final UUID f145681x;

    /* JADX INFO: renamed from: y */
    public final String f145682y;

    /* JADX INFO: renamed from: z */
    public final String f145683z;

    public C34600k(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f145681x = uuid;
        this.f145682y = str;
        str2.getClass();
        this.f145683z = AbstractC34587d0.m109382o(str2);
        this.f145679E = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34600k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C34600k c34600k = (C34600k) obj;
        return Objects.equals(this.f145682y, c34600k.f145682y) && Objects.equals(this.f145683z, c34600k.f145683z) && Objects.equals(this.f145681x, c34600k.f145681x) && Arrays.equals(this.f145679E, c34600k.f145679E);
    }

    public final int hashCode() {
        if (this.f145680w == 0) {
            int iHashCode = this.f145681x.hashCode() * 31;
            String str = this.f145682y;
            this.f145680w = Arrays.hashCode(this.f145679E) + AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f145683z);
        }
        return this.f145680w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        UUID uuid = this.f145681x;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f145682y);
        parcel.writeString(this.f145683z);
        parcel.writeByteArray(this.f145679E);
    }

    public C34600k(Parcel parcel) {
        this.f145681x = new UUID(parcel.readLong(), parcel.readLong());
        this.f145682y = parcel.readString();
        String string = parcel.readString();
        int i13 = AbstractC38065t.f163031a;
        this.f145683z = string;
        this.f145679E = parcel.createByteArray();
    }
}
