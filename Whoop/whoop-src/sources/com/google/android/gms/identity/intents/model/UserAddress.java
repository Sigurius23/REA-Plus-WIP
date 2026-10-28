package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import gp.C16054r0;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: loaded from: classes6.dex */
public final class UserAddress extends AbstractC36219a implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new C16054r0(14);

    /* JADX INFO: renamed from: E */
    public String f20555E;

    /* JADX INFO: renamed from: F */
    public String f20556F;

    /* JADX INFO: renamed from: G */
    public String f20557G;

    /* JADX INFO: renamed from: H */
    public String f20558H;

    /* JADX INFO: renamed from: I */
    public String f20559I;

    /* JADX INFO: renamed from: J */
    public String f20560J;

    /* JADX INFO: renamed from: K */
    public String f20561K;

    /* JADX INFO: renamed from: L */
    public String f20562L;

    /* JADX INFO: renamed from: M */
    public boolean f20563M;

    /* JADX INFO: renamed from: N */
    public String f20564N;

    /* JADX INFO: renamed from: O */
    public String f20565O;

    /* JADX INFO: renamed from: w */
    public String f20566w;

    /* JADX INFO: renamed from: x */
    public String f20567x;

    /* JADX INFO: renamed from: y */
    public String f20568y;

    /* JADX INFO: renamed from: z */
    public String f20569z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f20566w);
        AbstractC36221c.m115332m(parcel, 3, this.f20567x);
        AbstractC36221c.m115332m(parcel, 4, this.f20568y);
        AbstractC36221c.m115332m(parcel, 5, this.f20569z);
        AbstractC36221c.m115332m(parcel, 6, this.f20555E);
        AbstractC36221c.m115332m(parcel, 7, this.f20556F);
        AbstractC36221c.m115332m(parcel, 8, this.f20557G);
        AbstractC36221c.m115332m(parcel, 9, this.f20558H);
        AbstractC36221c.m115332m(parcel, 10, this.f20559I);
        AbstractC36221c.m115332m(parcel, 11, this.f20560J);
        AbstractC36221c.m115332m(parcel, 12, this.f20561K);
        AbstractC36221c.m115332m(parcel, 13, this.f20562L);
        boolean z4 = this.f20563M;
        AbstractC36221c.m115337r(parcel, 14, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC36221c.m115332m(parcel, 15, this.f20564N);
        AbstractC36221c.m115332m(parcel, 16, this.f20565O);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
