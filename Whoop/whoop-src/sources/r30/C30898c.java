package r30;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;

/* JADX INFO: renamed from: r30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C30898c implements Parcelable {
    public static final Parcelable.Creator<C30898c> CREATOR = new C29912j0(9);

    /* JADX INFO: renamed from: w */
    public final String f127397w;

    /* JADX INFO: renamed from: x */
    public final String f127398x;

    public C30898c(String name, String text) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(text, "text");
        this.f127397w = name;
        this.f127398x = text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30898c)) {
            return false;
        }
        C30898c c30898c = (C30898c) obj;
        return AbstractC22676k.m65745e(this.f127397w, c30898c.f127397w) && AbstractC22676k.m65745e(this.f127398x, c30898c.f127398x);
    }

    public final int hashCode() {
        return this.f127398x.hashCode() + (this.f127397w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("ChallengeSelectOption(name=", this.f127397w, ", text=", this.f127398x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f127397w);
        dest.writeString(this.f127398x);
    }
}
