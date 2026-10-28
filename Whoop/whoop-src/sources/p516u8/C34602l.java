package p516u8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: u8.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C34602l implements Comparator, Parcelable {
    public static final Parcelable.Creator<C34602l> CREATOR = new C34598j(0);

    /* JADX INFO: renamed from: w */
    public final C34600k[] f145687w;

    /* JADX INFO: renamed from: x */
    public int f145688x;

    /* JADX INFO: renamed from: y */
    public final String f145689y;

    /* JADX INFO: renamed from: z */
    public final int f145690z;

    public C34602l(String str, ArrayList arrayList) {
        this(str, false, (C34600k[]) arrayList.toArray(new C34600k[0]));
    }

    /* JADX INFO: renamed from: b */
    public final C34602l m109391b(String str) {
        return Objects.equals(this.f145689y, str) ? this : new C34602l(str, false, this.f145687w);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C34600k c34600k = (C34600k) obj;
        C34600k c34600k2 = (C34600k) obj2;
        UUID uuid = AbstractC34590f.f145651a;
        if (uuid.equals(c34600k.f145681x)) {
            return uuid.equals(c34600k2.f145681x) ? 0 : 1;
        }
        return c34600k.f145681x.compareTo(c34600k2.f145681x);
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
        if (obj != null && C34602l.class == obj.getClass()) {
            C34602l c34602l = (C34602l) obj;
            if (Objects.equals(this.f145689y, c34602l.f145689y) && Arrays.equals(this.f145687w, c34602l.f145687w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f145688x == 0) {
            String str = this.f145689y;
            this.f145688x = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f145687w);
        }
        return this.f145688x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f145689y);
        parcel.writeTypedArray(this.f145687w, 0);
    }

    public C34602l(String str, boolean z4, C34600k... c34600kArr) {
        this.f145689y = str;
        c34600kArr = z4 ? (C34600k[]) c34600kArr.clone() : c34600kArr;
        this.f145687w = c34600kArr;
        this.f145690z = c34600kArr.length;
        Arrays.sort(c34600kArr, this);
    }

    public C34602l(Parcel parcel) {
        this.f145689y = parcel.readString();
        C34600k[] c34600kArr = (C34600k[]) parcel.createTypedArray(C34600k.CREATOR);
        int i13 = AbstractC38065t.f163031a;
        this.f145687w = c34600kArr;
        this.f145690z = c34600kArr.length;
    }
}
