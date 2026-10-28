package sz;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sz.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C33157v extends AbstractC33155t {
    public static final Parcelable.Creator<C33157v> CREATOR = new C33133h(6);

    /* JADX INFO: renamed from: E */
    public final String f138263E;

    /* JADX INFO: renamed from: w */
    public final String f138264w;

    /* JADX INFO: renamed from: x */
    public final C33139k f138265x;

    /* JADX INFO: renamed from: y */
    public final String f138266y;

    /* JADX INFO: renamed from: z */
    public final Long f138267z;

    public C33157v(String clientSecret, C33139k config, String currencyCode, Long l7, String str) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(currencyCode, "currencyCode");
        this.f138264w = clientSecret;
        this.f138265x = config;
        this.f138266y = currencyCode;
        this.f138267z = l7;
        this.f138263E = str;
    }

    @Override // sz.AbstractC33155t
    /* JADX INFO: renamed from: b */
    public final C33139k mo105019b() {
        return this.f138265x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33157v)) {
            return false;
        }
        C33157v c33157v = (C33157v) obj;
        return AbstractC22676k.m65745e(this.f138264w, c33157v.f138264w) && AbstractC22676k.m65745e(this.f138265x, c33157v.f138265x) && AbstractC22676k.m65745e(this.f138266y, c33157v.f138266y) && AbstractC22676k.m65745e(this.f138267z, c33157v.f138267z) && AbstractC22676k.m65745e(this.f138263E, c33157v.f138263E);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.f138265x.hashCode() + (this.f138264w.hashCode() * 31)) * 31, 31, this.f138266y);
        Long l7 = this.f138267z;
        int iHashCode = (iM30450d + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str = this.f138263E;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SetupIntentArgs(clientSecret=");
        sb4.append(this.f138264w);
        sb4.append(", config=");
        sb4.append(this.f138265x);
        sb4.append(", currencyCode=");
        sb4.append(this.f138266y);
        sb4.append(", amount=");
        sb4.append(this.f138267z);
        sb4.append(", label=");
        return AbstractC25012a.m73376i(this.f138263E, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f138264w);
        this.f138265x.writeToParcel(dest, i13);
        dest.writeString(this.f138266y);
        Long l7 = this.f138267z;
        if (l7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l7.longValue());
        }
        dest.writeString(this.f138263E);
    }
}
