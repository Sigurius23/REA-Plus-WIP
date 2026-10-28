package p096dq;

import android.os.Parcel;
import android.os.Parcelable;
import gq.C16074c;
import gq.C16077f;
import java.util.ArrayList;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C12263g extends AbstractC36219a {
    public static final Parcelable.Creator<C12263g> CREATOR = new C12280x(9);

    /* JADX INFO: renamed from: E */
    public final String f41047E;

    /* JADX INFO: renamed from: F */
    public final String f41048F;

    /* JADX INFO: renamed from: G */
    public final String f41049G;

    /* JADX INFO: renamed from: H */
    public final String f41050H;

    /* JADX INFO: renamed from: I */
    public final String f41051I;

    /* JADX INFO: renamed from: J */
    public final String f41052J;

    /* JADX INFO: renamed from: K */
    public final int f41053K;

    /* JADX INFO: renamed from: L */
    public final ArrayList f41054L;

    /* JADX INFO: renamed from: M */
    public final C16077f f41055M;

    /* JADX INFO: renamed from: N */
    public final ArrayList f41056N;

    /* JADX INFO: renamed from: O */
    public final String f41057O;

    /* JADX INFO: renamed from: P */
    public final String f41058P;

    /* JADX INFO: renamed from: Q */
    public final ArrayList f41059Q;

    /* JADX INFO: renamed from: R */
    public final boolean f41060R;

    /* JADX INFO: renamed from: S */
    public final ArrayList f41061S;

    /* JADX INFO: renamed from: T */
    public final ArrayList f41062T;

    /* JADX INFO: renamed from: U */
    public final ArrayList f41063U;

    /* JADX INFO: renamed from: V */
    public final C16074c f41064V;

    /* JADX INFO: renamed from: w */
    public final String f41065w;

    /* JADX INFO: renamed from: x */
    public final String f41066x;

    /* JADX INFO: renamed from: y */
    public final String f41067y;

    /* JADX INFO: renamed from: z */
    public final String f41068z;

    public C12263g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i13, ArrayList arrayList, C16077f c16077f, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z4, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, C16074c c16074c) {
        this.f41065w = str;
        this.f41066x = str2;
        this.f41067y = str3;
        this.f41068z = str4;
        this.f41047E = str5;
        this.f41048F = str6;
        this.f41049G = str7;
        this.f41050H = str8;
        this.f41051I = str9;
        this.f41052J = str10;
        this.f41053K = i13;
        this.f41054L = arrayList;
        this.f41055M = c16077f;
        this.f41056N = arrayList2;
        this.f41057O = str11;
        this.f41058P = str12;
        this.f41059Q = arrayList3;
        this.f41060R = z4;
        this.f41061S = arrayList4;
        this.f41062T = arrayList5;
        this.f41063U = arrayList6;
        this.f41064V = c16074c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f41065w);
        AbstractC36221c.m115332m(parcel, 3, this.f41066x);
        AbstractC36221c.m115332m(parcel, 4, this.f41067y);
        AbstractC36221c.m115332m(parcel, 5, this.f41068z);
        AbstractC36221c.m115332m(parcel, 6, this.f41047E);
        AbstractC36221c.m115332m(parcel, 7, this.f41048F);
        AbstractC36221c.m115332m(parcel, 8, this.f41049G);
        AbstractC36221c.m115332m(parcel, 9, this.f41050H);
        AbstractC36221c.m115332m(parcel, 10, this.f41051I);
        AbstractC36221c.m115332m(parcel, 11, this.f41052J);
        AbstractC36221c.m115337r(parcel, 12, 4);
        parcel.writeInt(this.f41053K);
        AbstractC36221c.m115336q(parcel, 13, this.f41054L);
        AbstractC36221c.m115331l(parcel, 14, this.f41055M, i13);
        AbstractC36221c.m115336q(parcel, 15, this.f41056N);
        AbstractC36221c.m115332m(parcel, 16, this.f41057O);
        AbstractC36221c.m115332m(parcel, 17, this.f41058P);
        AbstractC36221c.m115336q(parcel, 18, this.f41059Q);
        AbstractC36221c.m115337r(parcel, 19, 4);
        parcel.writeInt(this.f41060R ? 1 : 0);
        AbstractC36221c.m115336q(parcel, 20, this.f41061S);
        AbstractC36221c.m115336q(parcel, 21, this.f41062T);
        AbstractC36221c.m115336q(parcel, 22, this.f41063U);
        AbstractC36221c.m115331l(parcel, 23, this.f41064V, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
