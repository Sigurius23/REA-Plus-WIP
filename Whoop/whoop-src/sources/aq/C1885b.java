package aq;

import a10.C0113a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC4982m;
import com.google.android.gms.common.api.Status;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: aq.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C1885b extends AbstractC36219a implements InterfaceC4982m {
    public static final Parcelable.Creator<C1885b> CREATOR = new C0113a(27);

    /* JADX INFO: renamed from: w */
    public final int f7430w;

    /* JADX INFO: renamed from: x */
    public final int f7431x;

    /* JADX INFO: renamed from: y */
    public final Intent f7432y;

    public C1885b(int i13, int i14, Intent intent) {
        this.f7430w = i13;
        this.f7431x = i14;
        this.f7432y = intent;
    }

    @Override // com.google.android.gms.common.api.InterfaceC4982m
    /* JADX INFO: renamed from: c */
    public final Status mo5671c() {
        return this.f7431x == 0 ? Status.f20488E : Status.f20492I;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f7430w);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f7431x);
        AbstractC36221c.m115331l(parcel, 3, this.f7432y, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
