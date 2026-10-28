package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q30.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29920n0 implements Parcelable {
    public static final Parcelable.Creator<C29920n0> CREATOR = new C29912j0(2);

    /* JADX INFO: renamed from: E */
    public static final C29920n0 f122215E = new C29920n0("", "", "", null);

    /* JADX INFO: renamed from: w */
    public final String f122216w;

    /* JADX INFO: renamed from: x */
    public final String f122217x;

    /* JADX INFO: renamed from: y */
    public final String f122218y;

    /* JADX INFO: renamed from: z */
    public final String f122219z;

    public C29920n0(String clientSecret, String sourceId, String publishableKey, String str) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        this.f122216w = clientSecret;
        this.f122217x = sourceId;
        this.f122218y = publishableKey;
        this.f122219z = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29920n0)) {
            return false;
        }
        C29920n0 c29920n0 = (C29920n0) obj;
        return AbstractC22676k.m65745e(this.f122216w, c29920n0.f122216w) && AbstractC22676k.m65745e(this.f122217x, c29920n0.f122217x) && AbstractC22676k.m65745e(this.f122218y, c29920n0.f122218y) && AbstractC22676k.m65745e(this.f122219z, c29920n0.f122219z);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f122216w.hashCode() * 31, 31, this.f122217x), 31, this.f122218y);
        String str = this.f122219z;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("IntentData(clientSecret=", this.f122216w, ", sourceId=", this.f122217x, ", publishableKey="), this.f122218y, ", accountId=", this.f122219z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f122216w);
        dest.writeString(this.f122217x);
        dest.writeString(this.f122218y);
        dest.writeString(this.f122219z);
    }
}
