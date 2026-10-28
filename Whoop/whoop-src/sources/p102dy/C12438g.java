package p102dy;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import java.util.List;
import p000.AbstractC11266d;
import p096dq.C12280x;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38797c3;

/* JADX INFO: renamed from: dy.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C12438g implements Parcelable {
    public static final Parcelable.Creator<C12438g> CREATOR = new C12280x(17);

    /* JADX INFO: renamed from: w */
    public final C38797c3 f42370w;

    /* JADX INFO: renamed from: x */
    public final String f42371x;

    /* JADX INFO: renamed from: y */
    public final List f42372y;

    public C12438g(C38797c3 passiveCaptchaParams, String publishableKey, List productUsage) {
        AbstractC22676k.m65750j(passiveCaptchaParams, "passiveCaptchaParams");
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        this.f42370w = passiveCaptchaParams;
        this.f42371x = publishableKey;
        this.f42372y = productUsage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12438g)) {
            return false;
        }
        C12438g c12438g = (C12438g) obj;
        return AbstractC22676k.m65745e(this.f42370w, c12438g.f42370w) && AbstractC22676k.m65745e(this.f42371x, c12438g.f42371x) && AbstractC22676k.m65745e(this.f42372y, c12438g.f42372y);
    }

    public final int hashCode() {
        return this.f42372y.hashCode() + AbstractC11266d.m30450d(this.f42370w.hashCode() * 31, 31, this.f42371x);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PassiveChallengeArgs(passiveCaptchaParams=");
        sb4.append(this.f42370w);
        sb4.append(", publishableKey=");
        sb4.append(this.f42371x);
        sb4.append(", productUsage=");
        return AbstractC3855a.m11829m(sb4, this.f42372y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f42370w.writeToParcel(dest, i13);
        dest.writeString(this.f42371x);
        dest.writeStringList(this.f42372y);
    }
}
