package v20;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16665h1;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v20.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C35566f implements Parcelable {
    public static final Parcelable.Creator<C35566f> CREATOR = new C35565e(0);

    /* JADX INFO: renamed from: E */
    public final C16665h1 f151296E;

    /* JADX INFO: renamed from: w */
    public final String f151297w;

    /* JADX INFO: renamed from: x */
    public final String f151298x;

    /* JADX INFO: renamed from: y */
    public final String f151299y;

    /* JADX INFO: renamed from: z */
    public final String f151300z;

    public C35566f(String email, String nameOnAccount, String sortCode, String accountNumber, C16665h1 appearance) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(nameOnAccount, "nameOnAccount");
        AbstractC22676k.m65750j(sortCode, "sortCode");
        AbstractC22676k.m65750j(accountNumber, "accountNumber");
        AbstractC22676k.m65750j(appearance, "appearance");
        this.f151297w = email;
        this.f151298x = nameOnAccount;
        this.f151299y = sortCode;
        this.f151300z = accountNumber;
        this.f151296E = appearance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35566f)) {
            return false;
        }
        C35566f c35566f = (C35566f) obj;
        return AbstractC22676k.m65745e(this.f151297w, c35566f.f151297w) && AbstractC22676k.m65745e(this.f151298x, c35566f.f151298x) && AbstractC22676k.m65745e(this.f151299y, c35566f.f151299y) && AbstractC22676k.m65745e(this.f151300z, c35566f.f151300z) && AbstractC22676k.m65745e(this.f151296E, c35566f.f151296E);
    }

    public final int hashCode() {
        return this.f151296E.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f151297w.hashCode() * 31, 31, this.f151298x), 31, this.f151299y), 31, this.f151300z);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Args(email=", this.f151297w, ", nameOnAccount=", this.f151298x, ", sortCode=");
        AbstractC11266d.m30444B(sbM32001t, this.f151299y, ", accountNumber=", this.f151300z, ", appearance=");
        sbM32001t.append(this.f151296E);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f151297w);
        dest.writeString(this.f151298x);
        dest.writeString(this.f151299y);
        dest.writeString(this.f151300z);
        this.f151296E.writeToParcel(dest, i13);
    }
}
