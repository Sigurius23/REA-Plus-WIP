package pn;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: pn.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C29375i {

    /* JADX INFO: renamed from: a */
    public final long f119145a;

    /* JADX INFO: renamed from: b */
    public final boolean f119146b;

    /* JADX INFO: renamed from: c */
    public final boolean f119147c;

    /* JADX INFO: renamed from: d */
    public final boolean f119148d;

    /* JADX INFO: renamed from: e */
    public final long f119149e;

    /* JADX INFO: renamed from: f */
    public final List f119150f;

    /* JADX INFO: renamed from: g */
    public final boolean f119151g;

    /* JADX INFO: renamed from: h */
    public final long f119152h;

    /* JADX INFO: renamed from: i */
    public final int f119153i;

    /* JADX INFO: renamed from: j */
    public final int f119154j;

    /* JADX INFO: renamed from: k */
    public final int f119155k;

    public C29375i(long j7, boolean z4, boolean z13, boolean z14, ArrayList arrayList, long j13, boolean z15, long j14, int i13, int i14, int i15) {
        this.f119145a = j7;
        this.f119146b = z4;
        this.f119147c = z13;
        this.f119148d = z14;
        this.f119150f = Collections.unmodifiableList(arrayList);
        this.f119149e = j13;
        this.f119151g = z15;
        this.f119152h = j14;
        this.f119153i = i13;
        this.f119154j = i14;
        this.f119155k = i15;
    }

    public C29375i(Parcel parcel) {
        this.f119145a = parcel.readLong();
        this.f119146b = parcel.readByte() == 1;
        this.f119147c = parcel.readByte() == 1;
        this.f119148d = parcel.readByte() == 1;
        int i13 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add(new C29374h(parcel.readInt(), parcel.readLong()));
        }
        this.f119150f = Collections.unmodifiableList(arrayList);
        this.f119149e = parcel.readLong();
        this.f119151g = parcel.readByte() == 1;
        this.f119152h = parcel.readLong();
        this.f119153i = parcel.readInt();
        this.f119154j = parcel.readInt();
        this.f119155k = parcel.readInt();
    }
}
