package p402po;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pn.C29367a;

/* JADX INFO: renamed from: po.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C29384a extends AbstractC36219a {
    public static final Parcelable.Creator<C29384a> CREATOR = new C29367a(8);

    /* JADX INFO: renamed from: E */
    public final String f119198E;

    /* JADX INFO: renamed from: F */
    public final ArrayList f119199F;

    /* JADX INFO: renamed from: G */
    public final boolean f119200G;

    /* JADX INFO: renamed from: w */
    public final boolean f119201w;

    /* JADX INFO: renamed from: x */
    public final String f119202x;

    /* JADX INFO: renamed from: y */
    public final String f119203y;

    /* JADX INFO: renamed from: z */
    public final boolean f119204z;

    public C29384a(boolean z4, String str, String str2, boolean z13, String str3, ArrayList arrayList, boolean z14) {
        boolean z15 = true;
        if (z13 && z14) {
            z15 = false;
        }
        AbstractC35135w.m111090b(z15, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
        this.f119201w = z4;
        if (z4) {
            AbstractC35135w.m111095g(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f119202x = str;
        this.f119203y = str2;
        this.f119204z = z13;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f119199F = arrayList2;
        this.f119198E = str3;
        this.f119200G = z14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29384a)) {
            return false;
        }
        C29384a c29384a = (C29384a) obj;
        return this.f119201w == c29384a.f119201w && AbstractC35135w.m111097i(this.f119202x, c29384a.f119202x) && AbstractC35135w.m111097i(this.f119203y, c29384a.f119203y) && this.f119204z == c29384a.f119204z && AbstractC35135w.m111097i(this.f119198E, c29384a.f119198E) && AbstractC35135w.m111097i(this.f119199F, c29384a.f119199F) && this.f119200G == c29384a.f119200G;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f119201w), this.f119202x, this.f119203y, Boolean.valueOf(this.f119204z), this.f119198E, this.f119199F, Boolean.valueOf(this.f119200G)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f119201w ? 1 : 0);
        AbstractC36221c.m115332m(parcel, 2, this.f119202x);
        AbstractC36221c.m115332m(parcel, 3, this.f119203y);
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(this.f119204z ? 1 : 0);
        AbstractC36221c.m115332m(parcel, 5, this.f119198E);
        AbstractC36221c.m115334o(parcel, 6, this.f119199F);
        AbstractC36221c.m115337r(parcel, 7, 4);
        parcel.writeInt(this.f119200G ? 1 : 0);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
