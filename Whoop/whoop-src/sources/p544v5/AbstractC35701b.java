package p544v5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1312k0;

/* JADX INFO: renamed from: v5.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35701b implements Parcelable {

    /* JADX INFO: renamed from: w */
    private final Parcelable f151900w;

    /* JADX INFO: renamed from: x */
    public static final AbstractC35701b f151899x = new C35700a();
    public static final Parcelable.Creator<AbstractC35701b> CREATOR = new C1312k0(11);

    public AbstractC35701b() {
        this.f151900w = null;
    }

    /* JADX INFO: renamed from: b */
    public final Parcelable m113141b() {
        return this.f151900w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeParcelable(this.f151900w, i13);
    }

    public AbstractC35701b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f151900w = parcelable == f151899x ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC35701b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f151900w = parcelable == null ? f151899x : parcelable;
    }
}
