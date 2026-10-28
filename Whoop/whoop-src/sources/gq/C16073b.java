package gq;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import java.util.ArrayList;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gq.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C16073b extends AbstractC36219a {
    public static final Parcelable.Creator<C16073b> CREATOR = new C16054r0(3);

    /* JADX INFO: renamed from: w */
    public final String f60791w;

    /* JADX INFO: renamed from: x */
    public final String f60792x;

    /* JADX INFO: renamed from: y */
    public final ArrayList f60793y;

    public C16073b(ArrayList arrayList, String str, String str2) {
        this.f60791w = str;
        this.f60792x = str2;
        this.f60793y = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f60791w);
        AbstractC36221c.m115332m(parcel, 3, this.f60792x);
        AbstractC36221c.m115336q(parcel, 4, this.f60793y);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
