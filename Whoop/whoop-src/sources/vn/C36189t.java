package vn;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import in.InterfaceC18714b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: vn.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C36189t implements InterfaceC18714b {
    public static final Parcelable.Creator<C36189t> CREATOR = new C36187r(0);

    /* JADX INFO: renamed from: w */
    public final String f154918w;

    /* JADX INFO: renamed from: x */
    public final String f154919x;

    /* JADX INFO: renamed from: y */
    public final List f154920y;

    public C36189t(String str, String str2, List list) {
        this.f154918w = str;
        this.f154919x = str2;
        this.f154920y = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C36189t.class == obj.getClass()) {
            C36189t c36189t = (C36189t) obj;
            if (TextUtils.equals(this.f154918w, c36189t.f154918w) && TextUtils.equals(this.f154919x, c36189t.f154919x) && this.f154920y.equals(c36189t.f154920y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f154918w;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f154919x;
        return this.f154920y.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String string;
        String str = this.f154918w;
        if (str != null) {
            int iM91832b = AbstractC30007c.m91832b(5, str);
            String str2 = this.f154919x;
            StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(iM91832b, str2));
            sb4.append(" [");
            sb4.append(str);
            sb4.append(", ");
            sb4.append(str2);
            sb4.append("]");
            string = sb4.toString();
        } else {
            string = "";
        }
        String strValueOf = String.valueOf(string);
        return strValueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(strValueOf) : new String("HlsTrackMetadataEntry");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f154918w);
        parcel.writeString(this.f154919x);
        List list = this.f154920y;
        int size = list.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeParcelable((Parcelable) list.get(i14), 0);
        }
    }

    public C36189t(Parcel parcel) {
        this.f154918w = parcel.readString();
        this.f154919x = parcel.readString();
        int i13 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add((C36188s) parcel.readParcelable(C36188s.class.getClassLoader()));
        }
        this.f154920y = Collections.unmodifiableList(arrayList);
    }
}
