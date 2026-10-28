package p668z1;

import android.os.Parcel;
import android.os.Parcelable;
import p491t1.C33275f;
import p491t1.C33279j;
import x30.C37900j1;

/* JADX INFO: renamed from: z1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C39966o implements Parcelable.ClassLoaderCreator {
    /* JADX INFO: renamed from: a */
    public static C39967p m128185a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = C39966o.class.getClassLoader();
        }
        int i13 = parcel.readInt();
        C37900j1 c37900j1 = new C37900j1(17, parcel, classLoader);
        if (i13 == 0) {
            return new C39967p();
        }
        C33275f c33275fMo105554g = C33279j.f138746x.mo105554g();
        for (int i14 = 0; i14 < i13; i14++) {
            c33275fMo105554g.add(c37900j1.invoke(Integer.valueOf(i14)));
        }
        return new C39967p(c33275fMo105554g.m105581d());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m128185a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new C39967p[i13];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m128185a(parcel, null);
    }
}
