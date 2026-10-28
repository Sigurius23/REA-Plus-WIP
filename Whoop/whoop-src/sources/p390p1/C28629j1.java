package p390p1;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: p1.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C28629j1 implements Parcelable.ClassLoaderCreator {
    /* JADX INFO: renamed from: a */
    public static C28633k1 m87080a(Parcel parcel, ClassLoader classLoader) {
        C28676v0 c28676v0;
        if (classLoader == null) {
            classLoader = C28629j1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i13 = parcel.readInt();
        if (i13 == 0) {
            c28676v0 = C28676v0.f115976y;
        } else if (i13 == 1) {
            c28676v0 = C28676v0.f115974F;
        } else {
            if (i13 != 2) {
                throw new IllegalStateException(AbstractC2875y.m8296i(i13, "Unsupported MutableState policy ", " was restored"));
            }
            c28676v0 = C28676v0.f115977z;
        }
        return new C28633k1(value, c28676v0);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m87080a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new C28633k1[i13];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m87080a(parcel, null);
    }
}
