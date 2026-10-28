package pn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: pn.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C29372f extends AbstractC29369c {
    public static final Parcelable.Creator<C29372f> CREATOR = new C29367a(1);

    /* JADX INFO: renamed from: E */
    public final boolean f119130E;

    /* JADX INFO: renamed from: F */
    public final long f119131F;

    /* JADX INFO: renamed from: G */
    public final long f119132G;

    /* JADX INFO: renamed from: H */
    public final List f119133H;

    /* JADX INFO: renamed from: I */
    public final boolean f119134I;

    /* JADX INFO: renamed from: J */
    public final long f119135J;

    /* JADX INFO: renamed from: K */
    public final int f119136K;

    /* JADX INFO: renamed from: L */
    public final int f119137L;

    /* JADX INFO: renamed from: M */
    public final int f119138M;

    /* JADX INFO: renamed from: w */
    public final long f119139w;

    /* JADX INFO: renamed from: x */
    public final boolean f119140x;

    /* JADX INFO: renamed from: y */
    public final boolean f119141y;

    /* JADX INFO: renamed from: z */
    public final boolean f119142z;

    public C29372f(long j7, boolean z4, boolean z13, boolean z14, boolean z15, long j13, long j14, List list, boolean z16, long j15, int i13, int i14, int i15) {
        this.f119139w = j7;
        this.f119140x = z4;
        this.f119141y = z13;
        this.f119142z = z14;
        this.f119130E = z15;
        this.f119131F = j13;
        this.f119132G = j14;
        this.f119133H = Collections.unmodifiableList(list);
        this.f119134I = z16;
        this.f119135J = j15;
        this.f119136K = i13;
        this.f119137L = i14;
        this.f119138M = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeLong(this.f119139w);
        parcel.writeByte(this.f119140x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f119141y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f119142z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f119130E ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f119131F);
        parcel.writeLong(this.f119132G);
        List list = this.f119133H;
        int size = list.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            C29371e c29371e = (C29371e) list.get(i14);
            parcel.writeInt(c29371e.f119127a);
            parcel.writeLong(c29371e.f119128b);
            parcel.writeLong(c29371e.f119129c);
        }
        parcel.writeByte(this.f119134I ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f119135J);
        parcel.writeInt(this.f119136K);
        parcel.writeInt(this.f119137L);
        parcel.writeInt(this.f119138M);
    }

    public C29372f(Parcel parcel) {
        this.f119139w = parcel.readLong();
        this.f119140x = parcel.readByte() == 1;
        this.f119141y = parcel.readByte() == 1;
        this.f119142z = parcel.readByte() == 1;
        this.f119130E = parcel.readByte() == 1;
        this.f119131F = parcel.readLong();
        this.f119132G = parcel.readLong();
        int i13 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add(new C29371e(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f119133H = Collections.unmodifiableList(arrayList);
        this.f119134I = parcel.readByte() == 1;
        this.f119135J = parcel.readLong();
        this.f119136K = parcel.readInt();
        this.f119137L = parcel.readInt();
        this.f119138M = parcel.readInt();
    }
}
