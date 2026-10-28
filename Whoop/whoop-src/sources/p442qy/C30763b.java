package p442qy;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qy.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C30763b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126690a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        switch (this.f126690a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C30764c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i13 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new C30767f(string, string2, string3, string4, string5, string6, string7, linkedHashMap);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f126690a) {
            case 0:
                return new C30764c[i13];
            default:
                return new C30767f[i13];
        }
    }
}
