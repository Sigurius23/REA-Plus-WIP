package p503tp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: tp.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C34039j extends AbstractC36219a {

    @RecentlyNonNull
    public static final Parcelable.Creator<C34039j> CREATOR = new C34025a0(4);

    /* JADX INFO: renamed from: w */
    public final List f142703w;

    /* JADX INFO: renamed from: x */
    public final boolean f142704x;

    /* JADX INFO: renamed from: y */
    public final boolean f142705y;

    /* JADX INFO: renamed from: z */
    public final C34029c0 f142706z;

    public C34039j(ArrayList arrayList, boolean z4, boolean z13, C34029c0 c34029c0) {
        this.f142703w = arrayList;
        this.f142704x = z4;
        this.f142705y = z13;
        this.f142706z = c34029c0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115336q(parcel, 1, Collections.unmodifiableList(this.f142703w));
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f142704x ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(this.f142705y ? 1 : 0);
        AbstractC36221c.m115331l(parcel, 5, this.f142706z, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
