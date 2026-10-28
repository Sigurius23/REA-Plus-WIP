package p503tp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.InterfaceC4982m;
import com.google.android.gms.common.api.Status;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: tp.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C34041l extends AbstractC36219a implements InterfaceC4982m {

    @RecentlyNonNull
    public static final Parcelable.Creator<C34041l> CREATOR = new C34025a0(5);

    /* JADX INFO: renamed from: w */
    public final Status f142708w;

    /* JADX INFO: renamed from: x */
    public final C34042m f142709x;

    public C34041l(Status status, C34042m c34042m) {
        this.f142708w = status;
        this.f142709x = c34042m;
    }

    @Override // com.google.android.gms.common.api.InterfaceC4982m
    /* JADX INFO: renamed from: c */
    public final Status mo5671c() {
        return this.f142708w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 1, this.f142708w, i13);
        AbstractC36221c.m115331l(parcel, 2, this.f142709x, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
