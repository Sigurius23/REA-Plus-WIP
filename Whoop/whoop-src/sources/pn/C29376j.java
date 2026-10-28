package pn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: pn.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C29376j extends AbstractC29369c {
    public static final Parcelable.Creator<C29376j> CREATOR = new C29367a(3);

    /* JADX INFO: renamed from: w */
    public final List f119156w;

    public C29376j(Parcel parcel) {
        int i13 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add(new C29375i(parcel));
        }
        this.f119156w = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        List list = this.f119156w;
        int size = list.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            C29375i c29375i = (C29375i) list.get(i14);
            parcel.writeLong(c29375i.f119145a);
            parcel.writeByte(c29375i.f119146b ? (byte) 1 : (byte) 0);
            parcel.writeByte(c29375i.f119147c ? (byte) 1 : (byte) 0);
            parcel.writeByte(c29375i.f119148d ? (byte) 1 : (byte) 0);
            List list2 = c29375i.f119150f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i15 = 0; i15 < size2; i15++) {
                C29374h c29374h = (C29374h) list2.get(i15);
                parcel.writeInt(c29374h.f119143a);
                parcel.writeLong(c29374h.f119144b);
            }
            parcel.writeLong(c29375i.f119149e);
            parcel.writeByte(c29375i.f119151g ? (byte) 1 : (byte) 0);
            parcel.writeLong(c29375i.f119152h);
            parcel.writeInt(c29375i.f119153i);
            parcel.writeInt(c29375i.f119154j);
            parcel.writeInt(c29375i.f119155k);
        }
    }

    public C29376j(ArrayList arrayList) {
        this.f119156w = Collections.unmodifiableList(arrayList);
    }
}
