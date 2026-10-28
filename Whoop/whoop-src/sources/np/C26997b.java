package np;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC4982m;
import com.google.android.gms.common.api.Status;
import mn.C25704b;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: np.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C26997b extends AbstractC36219a implements InterfaceC4982m {
    public static final Parcelable.Creator<C26997b> CREATOR = new C25704b(16);

    /* JADX INFO: renamed from: w */
    public final Status f107678w;

    public C26997b(Status status) {
        this.f107678w = status;
    }

    @Override // com.google.android.gms.common.api.InterfaceC4982m
    /* JADX INFO: renamed from: c */
    public final Status mo5671c() {
        return this.f107678w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 1, this.f107678w, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
