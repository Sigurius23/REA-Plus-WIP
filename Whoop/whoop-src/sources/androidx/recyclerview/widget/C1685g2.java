package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import p544v5.AbstractC35701b;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1685g2 extends AbstractC35701b {
    public static final Parcelable.Creator<C1685g2> CREATOR = new C1681f2();

    /* JADX INFO: renamed from: y */
    public Parcelable f6660y;

    public C1685g2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6660y = parcel.readParcelable(classLoader == null ? AbstractC1740u1.class.getClassLoader() : classLoader);
    }

    @Override // p544v5.AbstractC35701b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeParcelable(this.f6660y, 0);
    }
}
