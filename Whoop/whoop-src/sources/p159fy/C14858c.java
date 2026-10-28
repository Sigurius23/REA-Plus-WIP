package p159fy;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import java.util.List;
import p000.AbstractC11266d;
import p126eq.C13433b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38797c3;

/* JADX INFO: renamed from: fy.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C14858c implements Parcelable {
    public static final Parcelable.Creator<C14858c> CREATOR = new C13433b(8);

    /* JADX INFO: renamed from: w */
    public final C38797c3 f55482w;

    /* JADX INFO: renamed from: x */
    public final String f55483x;

    /* JADX INFO: renamed from: y */
    public final List f55484y;

    public C14858c(C38797c3 passiveCaptchaParams, String publishableKey, List productUsage) {
        AbstractC22676k.m65750j(passiveCaptchaParams, "passiveCaptchaParams");
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        this.f55482w = passiveCaptchaParams;
        this.f55483x = publishableKey;
        this.f55484y = productUsage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14858c)) {
            return false;
        }
        C14858c c14858c = (C14858c) obj;
        return AbstractC22676k.m65745e(this.f55482w, c14858c.f55482w) && AbstractC22676k.m65745e(this.f55483x, c14858c.f55483x) && AbstractC22676k.m65745e(this.f55484y, c14858c.f55484y);
    }

    public final int hashCode() {
        return this.f55484y.hashCode() + AbstractC11266d.m30450d(this.f55482w.hashCode() * 31, 31, this.f55483x);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PassiveChallengeWarmerArgs(passiveCaptchaParams=");
        sb4.append(this.f55482w);
        sb4.append(", publishableKey=");
        sb4.append(this.f55483x);
        sb4.append(", productUsage=");
        return AbstractC3855a.m11829m(sb4, this.f55484y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f55482w.writeToParcel(dest, i13);
        dest.writeString(this.f55483x);
        dest.writeStringList(this.f55484y);
    }
}
