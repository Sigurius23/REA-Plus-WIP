package v00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p537ux.C35332g;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: v00.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C35484p implements Parcelable {
    public static final Parcelable.Creator<C35484p> CREATOR = new C35332g(17);

    /* JADX INFO: renamed from: E */
    public final C35482o f151058E;

    /* JADX INFO: renamed from: w */
    public final String f151059w;

    /* JADX INFO: renamed from: x */
    public final String f151060x;

    /* JADX INFO: renamed from: y */
    public final String f151061y;

    /* JADX INFO: renamed from: z */
    public final boolean f151062z;

    public C35484p(String id4, String ephemeralKeySecret, String str, boolean z4, C35482o permissions) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(ephemeralKeySecret, "ephemeralKeySecret");
        AbstractC22676k.m65750j(permissions, "permissions");
        this.f151059w = id4;
        this.f151060x = ephemeralKeySecret;
        this.f151061y = str;
        this.f151062z = z4;
        this.f151058E = permissions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35484p)) {
            return false;
        }
        C35484p c35484p = (C35484p) obj;
        return AbstractC22676k.m65745e(this.f151059w, c35484p.f151059w) && AbstractC22676k.m65745e(this.f151060x, c35484p.f151060x) && AbstractC22676k.m65745e(this.f151061y, c35484p.f151061y) && this.f151062z == c35484p.f151062z && AbstractC22676k.m65745e(this.f151058E, c35484p.f151058E);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f151059w.hashCode() * 31, 31, this.f151060x);
        String str = this.f151061y;
        return this.f151058E.hashCode() + AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f151062z);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CustomerMetadata(id=", this.f151059w, ", ephemeralKeySecret=", this.f151060x, ", customerSessionClientSecret=");
        AbstractC38963t7.m124390t(sbM32001t, this.f151061y, ", isPaymentMethodSetAsDefaultEnabled=", this.f151062z, ", permissions=");
        sbM32001t.append(this.f151058E);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f151059w);
        dest.writeString(this.f151060x);
        dest.writeString(this.f151061y);
        dest.writeInt(this.f151062z ? 1 : 0);
        this.f151058E.writeToParcel(dest, i13);
    }
}
