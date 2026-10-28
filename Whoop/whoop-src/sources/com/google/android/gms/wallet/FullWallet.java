package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import p096dq.C12261e;
import p096dq.C12270n;
import p096dq.C12278v;
import p096dq.C12279w;
import p096dq.C12280x;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: loaded from: classes6.dex */
public final class FullWallet extends AbstractC36219a implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new C12280x(6);

    /* JADX INFO: renamed from: E */
    public C12278v f20628E;

    /* JADX INFO: renamed from: F */
    public C12278v f20629F;

    /* JADX INFO: renamed from: G */
    public String[] f20630G;

    /* JADX INFO: renamed from: H */
    public UserAddress f20631H;

    /* JADX INFO: renamed from: I */
    public UserAddress f20632I;

    /* JADX INFO: renamed from: J */
    public C12261e[] f20633J;

    /* JADX INFO: renamed from: K */
    public C12270n f20634K;

    /* JADX INFO: renamed from: w */
    public String f20635w;

    /* JADX INFO: renamed from: x */
    public String f20636x;

    /* JADX INFO: renamed from: y */
    public C12279w f20637y;

    /* JADX INFO: renamed from: z */
    public String f20638z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f20635w);
        AbstractC36221c.m115332m(parcel, 3, this.f20636x);
        AbstractC36221c.m115331l(parcel, 4, this.f20637y, i13);
        AbstractC36221c.m115332m(parcel, 5, this.f20638z);
        AbstractC36221c.m115331l(parcel, 6, this.f20628E, i13);
        AbstractC36221c.m115331l(parcel, 7, this.f20629F, i13);
        AbstractC36221c.m115333n(parcel, 8, this.f20630G);
        AbstractC36221c.m115331l(parcel, 9, this.f20631H, i13);
        AbstractC36221c.m115331l(parcel, 10, this.f20632I, i13);
        AbstractC36221c.m115335p(parcel, 11, this.f20633J, i13);
        AbstractC36221c.m115331l(parcel, 12, this.f20634K, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
