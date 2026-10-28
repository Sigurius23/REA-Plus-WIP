package p144fc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1312k0;
import ih0.AbstractC18489d0;
import p544v5.AbstractC35701b;

/* JADX INFO: renamed from: fc.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C14354j extends AbstractC35701b {
    public static final Parcelable.Creator<C14354j> CREATOR = new C1312k0(3);

    /* JADX INFO: renamed from: E */
    public final ClassLoader f52411E;

    /* JADX INFO: renamed from: y */
    public int f52412y;

    /* JADX INFO: renamed from: z */
    public Parcelable f52413z;

    public C14354j(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? C14354j.class.getClassLoader() : classLoader;
        this.f52412y = parcel.readInt();
        this.f52413z = parcel.readParcelable(classLoader);
        this.f52411E = classLoader;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("FragmentPager.SavedState{");
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append(" position=");
        return AbstractC18489d0.m53371l(sb4, this.f52412y, "}");
    }

    @Override // p544v5.AbstractC35701b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeInt(this.f52412y);
        parcel.writeParcelable(this.f52413z, i13);
    }
}
