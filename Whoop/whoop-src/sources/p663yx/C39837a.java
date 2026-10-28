package p663yx;

import android.os.Parcel;
import android.os.Parcelable;
import m30.C24991g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yx.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C39837a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z4;
        boolean z13;
        AbstractC22676k.m65750j(parcel, "parcel");
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        int i13 = parcel.readInt();
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        String string3 = parcel.readString();
        if (string3 == null) {
            string3 = "";
        }
        String string4 = parcel.readString();
        boolean z14 = parcel.readByte() != 0;
        C24991g c24991g = (C24991g) parcel.readParcelable(C24991g.class.getClassLoader());
        boolean z15 = true;
        String string5 = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = false;
            z13 = true;
        } else {
            z4 = false;
            z13 = false;
        }
        if (parcel.readByte() == 0) {
            z15 = z4;
        }
        Object value = parcel.readValue(Integer.TYPE.getClassLoader());
        Integer num = value instanceof Integer ? (Integer) value : null;
        String string6 = parcel.readString();
        return new C39838b(string, i13, string2, string3, string4, z14, c24991g, string5, z13, z15, num, string6 != null ? string6 : "", parcel.readByte() != 0, parcel.readString(), parcel.readByte() != 0 ? z15 : false);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new C39838b[i13];
    }
}
