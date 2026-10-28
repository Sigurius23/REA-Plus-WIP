package td3;

import android.os.Parcel;
import android.os.Parcelable;
import p486sp.C32854e;

/* JADX INFO: renamed from: td3.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C33734n implements Parcelable {
    public static final Parcelable.Creator<C33734n> CREATOR = new C32854e(10);

    /* JADX INFO: renamed from: E */
    public final long f141101E;

    /* JADX INFO: renamed from: F */
    public final int f141102F;

    /* JADX INFO: renamed from: G */
    public final int f141103G;

    /* JADX INFO: renamed from: H */
    public final boolean f141104H;

    /* JADX INFO: renamed from: I */
    public final boolean f141105I;

    /* JADX INFO: renamed from: J */
    public boolean f141106J;

    /* JADX INFO: renamed from: K */
    public final long f141107K;

    /* JADX INFO: renamed from: L */
    public final long f141108L;

    /* JADX INFO: renamed from: M */
    public final boolean f141109M;

    /* JADX INFO: renamed from: N */
    public final int f141110N;

    /* JADX INFO: renamed from: w */
    public final long f141111w;

    /* JADX INFO: renamed from: x */
    public final long f141112x;

    /* JADX INFO: renamed from: y */
    public final int f141113y;

    /* JADX INFO: renamed from: z */
    public final int f141114z;

    public C33734n(int i13, int i14, long j7, int i15, int i16, boolean z4, int i17, boolean z13, boolean z14, boolean z15, long j13, long j14, long j15, long j16) {
        this.f141113y = i13;
        this.f141114z = i14;
        this.f141101E = j7;
        this.f141103G = i16;
        this.f141102F = i15;
        this.f141109M = z4;
        this.f141110N = i17;
        this.f141104H = z13;
        this.f141105I = z14;
        this.f141106J = z15;
        this.f141107K = j13 * 1000000;
        this.f141108L = j14;
        this.f141111w = j15;
        this.f141112x = j16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f141113y);
        parcel.writeInt(this.f141114z);
        parcel.writeLong(this.f141101E);
        parcel.writeInt(this.f141102F);
        parcel.writeInt(this.f141103G);
        parcel.writeInt(this.f141109M ? 1 : 0);
        parcel.writeInt(this.f141110N);
        parcel.writeInt(this.f141104H ? 1 : 0);
        parcel.writeInt(this.f141105I ? 1 : 0);
        parcel.writeLong(this.f141107K);
        parcel.writeLong(this.f141108L);
        parcel.writeLong(this.f141111w);
        parcel.writeLong(this.f141112x);
    }

    public C33734n(Parcel parcel) {
        this.f141113y = parcel.readInt();
        this.f141114z = parcel.readInt();
        this.f141101E = parcel.readLong();
        this.f141102F = parcel.readInt();
        this.f141103G = parcel.readInt();
        this.f141109M = parcel.readInt() != 0;
        this.f141110N = parcel.readInt();
        this.f141104H = parcel.readInt() == 1;
        this.f141105I = parcel.readInt() == 1;
        this.f141107K = parcel.readLong();
        this.f141108L = parcel.readLong();
        this.f141111w = parcel.readLong();
        this.f141112x = parcel.readLong();
    }
}
