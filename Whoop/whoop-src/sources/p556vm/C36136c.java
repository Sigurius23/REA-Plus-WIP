package p556vm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import p309lo.AbstractC24567y;
import p465rm.AbstractC31532g;
import v00.C35467g0;

/* JADX INFO: renamed from: vm.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C36136c implements Comparator, Parcelable {
    public static final Parcelable.Creator<C36136c> CREATOR = new C35467g0(4);

    /* JADX INFO: renamed from: w */
    public final C36135b[] f154639w;

    /* JADX INFO: renamed from: x */
    public int f154640x;

    /* JADX INFO: renamed from: y */
    public final String f154641y;

    public C36136c(String str, boolean z4, C36135b... c36135bArr) {
        this.f154641y = str;
        c36135bArr = z4 ? (C36135b[]) c36135bArr.clone() : c36135bArr;
        this.f154639w = c36135bArr;
        int length = c36135bArr.length;
        Arrays.sort(c36135bArr, this);
    }

    /* JADX INFO: renamed from: b */
    public final C36136c m114963b(String str) {
        return AbstractC24567y.m71670a(this.f154641y, str) ? this : new C36136c(str, false, this.f154639w);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C36135b c36135b = (C36135b) obj;
        C36135b c36135b2 = (C36135b) obj2;
        UUID uuid = AbstractC31532g.f130146a;
        if (uuid.equals(c36135b.f154636x)) {
            return uuid.equals(c36135b2.f154636x) ? 0 : 1;
        }
        return c36135b.f154636x.compareTo(c36135b2.f154636x);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C36136c.class == obj.getClass()) {
            C36136c c36136c = (C36136c) obj;
            if (AbstractC24567y.m71670a(this.f154641y, c36136c.f154641y) && Arrays.equals(this.f154639w, c36136c.f154639w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f154640x == 0) {
            String str = this.f154641y;
            this.f154640x = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f154639w);
        }
        return this.f154640x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f154641y);
        parcel.writeTypedArray(this.f154639w, 0);
    }

    public C36136c(Parcel parcel) {
        this.f154641y = parcel.readString();
        C36135b[] c36135bArr = (C36135b[]) parcel.createTypedArray(C36135b.CREATOR);
        int i13 = AbstractC24567y.f95875a;
        this.f154639w = c36135bArr;
        int length = c36135bArr.length;
    }
}
