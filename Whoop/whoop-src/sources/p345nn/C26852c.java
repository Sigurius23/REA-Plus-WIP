package p345nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import mn.C25704b;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: nn.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C26852c extends AbstractC26858i {
    public static final Parcelable.Creator<C26852c> CREATOR = new C25704b(7);

    /* JADX INFO: renamed from: E */
    public final long f107157E;

    /* JADX INFO: renamed from: F */
    public final long f107158F;

    /* JADX INFO: renamed from: G */
    public final AbstractC26858i[] f107159G;

    /* JADX INFO: renamed from: x */
    public final String f107160x;

    /* JADX INFO: renamed from: y */
    public final int f107161y;

    /* JADX INFO: renamed from: z */
    public final int f107162z;

    public C26852c(String str, int i13, int i14, long j7, long j13, AbstractC26858i[] abstractC26858iArr) {
        super("CHAP");
        this.f107160x = str;
        this.f107161y = i13;
        this.f107162z = i14;
        this.f107157E = j7;
        this.f107158F = j13;
        this.f107159G = abstractC26858iArr;
    }

    @Override // p345nn.AbstractC26858i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C26852c.class == obj.getClass()) {
            C26852c c26852c = (C26852c) obj;
            if (this.f107161y == c26852c.f107161y && this.f107162z == c26852c.f107162z && this.f107157E == c26852c.f107157E && this.f107158F == c26852c.f107158F && AbstractC24567y.m71670a(this.f107160x, c26852c.f107160x) && Arrays.equals(this.f107159G, c26852c.f107159G)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = (((((((527 + this.f107161y) * 31) + this.f107162z) * 31) + ((int) this.f107157E)) * 31) + ((int) this.f107158F)) * 31;
        String str = this.f107160x;
        return i13 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f107160x);
        parcel.writeInt(this.f107161y);
        parcel.writeInt(this.f107162z);
        parcel.writeLong(this.f107157E);
        parcel.writeLong(this.f107158F);
        AbstractC26858i[] abstractC26858iArr = this.f107159G;
        parcel.writeInt(abstractC26858iArr.length);
        for (AbstractC26858i abstractC26858i : abstractC26858iArr) {
            parcel.writeParcelable(abstractC26858i, 0);
        }
    }

    public C26852c(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        this.f107160x = string;
        this.f107161y = parcel.readInt();
        this.f107162z = parcel.readInt();
        this.f107157E = parcel.readLong();
        this.f107158F = parcel.readLong();
        int i14 = parcel.readInt();
        this.f107159G = new AbstractC26858i[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            this.f107159G[i15] = (AbstractC26858i) parcel.readParcelable(AbstractC26858i.class.getClassLoader());
        }
    }
}
