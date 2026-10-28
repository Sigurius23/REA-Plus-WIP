package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import p096dq.C12261e;
import p096dq.C12263g;
import p096dq.C12264h;
import p096dq.C12278v;
import p096dq.C12280x;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: loaded from: classes6.dex */
public final class MaskedWallet extends AbstractC36219a implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new C12280x(10);

    /* JADX INFO: renamed from: E */
    public C12278v f20639E;

    /* JADX INFO: renamed from: F */
    public C12278v f20640F;

    /* JADX INFO: renamed from: G */
    public C12263g[] f20641G;

    /* JADX INFO: renamed from: H */
    public C12264h[] f20642H;

    /* JADX INFO: renamed from: I */
    public UserAddress f20643I;

    /* JADX INFO: renamed from: J */
    public UserAddress f20644J;

    /* JADX INFO: renamed from: K */
    public C12261e[] f20645K;

    /* JADX INFO: renamed from: w */
    public String f20646w;

    /* JADX INFO: renamed from: x */
    public String f20647x;

    /* JADX INFO: renamed from: y */
    public String[] f20648y;

    /* JADX INFO: renamed from: z */
    public String f20649z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f20646w);
        AbstractC36221c.m115332m(parcel, 3, this.f20647x);
        AbstractC36221c.m115333n(parcel, 4, this.f20648y);
        AbstractC36221c.m115332m(parcel, 5, this.f20649z);
        AbstractC36221c.m115331l(parcel, 6, this.f20639E, i13);
        AbstractC36221c.m115331l(parcel, 7, this.f20640F, i13);
        AbstractC36221c.m115335p(parcel, 8, this.f20641G, i13);
        AbstractC36221c.m115335p(parcel, 9, this.f20642H, i13);
        AbstractC36221c.m115331l(parcel, 10, this.f20643I, i13);
        AbstractC36221c.m115331l(parcel, 11, this.f20644J, i13);
        AbstractC36221c.m115335p(parcel, 12, this.f20645K, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
