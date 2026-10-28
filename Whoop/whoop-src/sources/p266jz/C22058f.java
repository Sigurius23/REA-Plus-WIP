package p266jz;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jz.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C22058f implements Parcelable {
    public static final Parcelable.Creator<C22058f> CREATOR = new C16054r0(28);

    /* JADX INFO: renamed from: w */
    public final String f85568w;

    /* JADX INFO: renamed from: x */
    public final String f85569x;

    /* JADX INFO: renamed from: y */
    public final String f85570y;

    public C22058f(String financialConnectionsSessionClientSecret, String publishableKey, String str) {
        AbstractC22676k.m65750j(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        this.f85568w = financialConnectionsSessionClientSecret;
        this.f85569x = publishableKey;
        this.f85570y = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22058f)) {
            return false;
        }
        C22058f c22058f = (C22058f) obj;
        return AbstractC22676k.m65745e(this.f85568w, c22058f.f85568w) && AbstractC22676k.m65745e(this.f85569x, c22058f.f85569x) && AbstractC22676k.m65745e(this.f85570y, c22058f.f85570y);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f85568w.hashCode() * 31, 31, this.f85569x);
        String str = this.f85570y;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f85570y, ")", AbstractC11895b.m32001t("FinancialConnectionsSheetConfiguration(financialConnectionsSessionClientSecret=", this.f85568w, ", publishableKey=", this.f85569x, ", stripeAccountId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f85568w);
        dest.writeString(this.f85569x);
        dest.writeString(this.f85570y);
    }
}
