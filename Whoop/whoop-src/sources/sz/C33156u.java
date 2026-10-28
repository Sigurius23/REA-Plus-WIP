package sz;

import android.os.Parcel;
import android.os.Parcelable;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sz.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C33156u extends AbstractC33155t {
    public static final Parcelable.Creator<C33156u> CREATOR = new C33133h(5);

    /* JADX INFO: renamed from: w */
    public final String f138260w;

    /* JADX INFO: renamed from: x */
    public final C33139k f138261x;

    /* JADX INFO: renamed from: y */
    public final String f138262y;

    public C33156u(String clientSecret, C33139k config, String str) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(config, "config");
        this.f138260w = clientSecret;
        this.f138261x = config;
        this.f138262y = str;
    }

    @Override // sz.AbstractC33155t
    /* JADX INFO: renamed from: b */
    public final C33139k mo105019b() {
        return this.f138261x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33156u)) {
            return false;
        }
        C33156u c33156u = (C33156u) obj;
        return AbstractC22676k.m65745e(this.f138260w, c33156u.f138260w) && AbstractC22676k.m65745e(this.f138261x, c33156u.f138261x) && AbstractC22676k.m65745e(this.f138262y, c33156u.f138262y);
    }

    public final int hashCode() {
        int iHashCode = (this.f138261x.hashCode() + (this.f138260w.hashCode() * 31)) * 31;
        String str = this.f138262y;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PaymentIntentArgs(clientSecret=");
        sb4.append(this.f138260w);
        sb4.append(", config=");
        sb4.append(this.f138261x);
        sb4.append(", label=");
        return AbstractC25012a.m73376i(this.f138262y, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f138260w);
        this.f138261x.writeToParcel(dest, i13);
        dest.writeString(this.f138262y);
    }
}
