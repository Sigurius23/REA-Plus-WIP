package aq;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC4982m;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: aq.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C1888e extends AbstractC36219a implements InterfaceC4982m {
    public static final Parcelable.Creator<C1888e> CREATOR = new C0113a(28);

    /* JADX INFO: renamed from: w */
    public final List f7433w;

    /* JADX INFO: renamed from: x */
    public final String f7434x;

    public C1888e(String str, ArrayList arrayList) {
        this.f7433w = arrayList;
        this.f7434x = str;
    }

    @Override // com.google.android.gms.common.api.InterfaceC4982m
    /* JADX INFO: renamed from: c */
    public final Status mo5671c() {
        return this.f7434x != null ? Status.f20488E : Status.f20492I;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115334o(parcel, 1, this.f7433w);
        AbstractC36221c.m115332m(parcel, 2, this.f7434x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
