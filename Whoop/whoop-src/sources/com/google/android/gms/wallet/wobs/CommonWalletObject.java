package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import gp.C16054r0;
import gq.C16077f;
import java.util.ArrayList;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: loaded from: classes6.dex */
@KeepName
public class CommonWalletObject extends AbstractC36219a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new C16054r0(1);

    /* JADX INFO: renamed from: E */
    public final String f20659E;

    /* JADX INFO: renamed from: F */
    public final String f20660F;

    /* JADX INFO: renamed from: G */
    public final String f20661G;

    /* JADX INFO: renamed from: H */
    public final String f20662H;

    /* JADX INFO: renamed from: I */
    public final int f20663I;

    /* JADX INFO: renamed from: J */
    public final ArrayList f20664J;

    /* JADX INFO: renamed from: K */
    public final C16077f f20665K;

    /* JADX INFO: renamed from: L */
    public final ArrayList f20666L;

    /* JADX INFO: renamed from: M */
    public final String f20667M;

    /* JADX INFO: renamed from: N */
    public final String f20668N;

    /* JADX INFO: renamed from: O */
    public final ArrayList f20669O;

    /* JADX INFO: renamed from: P */
    public final boolean f20670P;

    /* JADX INFO: renamed from: Q */
    public final ArrayList f20671Q;

    /* JADX INFO: renamed from: R */
    public final ArrayList f20672R;

    /* JADX INFO: renamed from: S */
    public final ArrayList f20673S;

    /* JADX INFO: renamed from: w */
    public String f20674w;

    /* JADX INFO: renamed from: x */
    public final String f20675x;

    /* JADX INFO: renamed from: y */
    public final String f20676y;

    /* JADX INFO: renamed from: z */
    public final String f20677z;

    public CommonWalletObject() {
        this.f20664J = new ArrayList();
        this.f20666L = new ArrayList();
        this.f20669O = new ArrayList();
        this.f20671Q = new ArrayList();
        this.f20672R = new ArrayList();
        this.f20673S = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f20674w);
        AbstractC36221c.m115332m(parcel, 3, this.f20675x);
        AbstractC36221c.m115332m(parcel, 4, this.f20676y);
        AbstractC36221c.m115332m(parcel, 5, this.f20677z);
        AbstractC36221c.m115332m(parcel, 6, this.f20659E);
        AbstractC36221c.m115332m(parcel, 7, this.f20660F);
        AbstractC36221c.m115332m(parcel, 8, this.f20661G);
        AbstractC36221c.m115332m(parcel, 9, this.f20662H);
        AbstractC36221c.m115337r(parcel, 10, 4);
        parcel.writeInt(this.f20663I);
        AbstractC36221c.m115336q(parcel, 11, this.f20664J);
        AbstractC36221c.m115331l(parcel, 12, this.f20665K, i13);
        AbstractC36221c.m115336q(parcel, 13, this.f20666L);
        AbstractC36221c.m115332m(parcel, 14, this.f20667M);
        AbstractC36221c.m115332m(parcel, 15, this.f20668N);
        AbstractC36221c.m115336q(parcel, 16, this.f20669O);
        AbstractC36221c.m115337r(parcel, 17, 4);
        parcel.writeInt(this.f20670P ? 1 : 0);
        AbstractC36221c.m115336q(parcel, 18, this.f20671Q);
        AbstractC36221c.m115336q(parcel, 19, this.f20672R);
        AbstractC36221c.m115336q(parcel, 20, this.f20673S);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i13, ArrayList arrayList, C16077f c16077f, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z4, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f20674w = str;
        this.f20675x = str2;
        this.f20676y = str3;
        this.f20677z = str4;
        this.f20659E = str5;
        this.f20660F = str6;
        this.f20661G = str7;
        this.f20662H = str8;
        this.f20663I = i13;
        this.f20664J = arrayList;
        this.f20665K = c16077f;
        this.f20666L = arrayList2;
        this.f20667M = str9;
        this.f20668N = str10;
        this.f20669O = arrayList3;
        this.f20670P = z4;
        this.f20671Q = arrayList4;
        this.f20672R = arrayList5;
        this.f20673S = arrayList6;
    }
}
