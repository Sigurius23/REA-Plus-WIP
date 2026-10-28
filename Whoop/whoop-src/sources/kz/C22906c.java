package kz;

import android.os.Parcel;
import android.os.Parcelable;
import p266jz.C22057e;
import p266jz.C22058f;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kz.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C22906c extends AbstractC22907d {
    public static final Parcelable.Creator<C22906c> CREATOR = new C22060h(9);

    /* JADX INFO: renamed from: w */
    public final C22058f f90454w;

    /* JADX INFO: renamed from: x */
    public final C22057e f90455x;

    public C22906c(C22058f configuration, C22057e c22057e) {
        AbstractC22676k.m65750j(configuration, "configuration");
        this.f90454w = configuration;
        this.f90455x = c22057e;
    }

    @Override // kz.AbstractC22907d
    /* JADX INFO: renamed from: b */
    public final C22058f mo66638b() {
        return this.f90454w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22906c)) {
            return false;
        }
        C22906c c22906c = (C22906c) obj;
        return AbstractC22676k.m65745e(this.f90454w, c22906c.f90454w) && AbstractC22676k.m65745e(this.f90455x, c22906c.f90455x);
    }

    @Override // kz.AbstractC22907d
    /* JADX INFO: renamed from: f */
    public final C22057e mo66639f() {
        return this.f90455x;
    }

    public final int hashCode() {
        int iHashCode = this.f90454w.hashCode() * 31;
        C22057e c22057e = this.f90455x;
        return iHashCode + (c22057e == null ? 0 : c22057e.hashCode());
    }

    public final String toString() {
        return "ForToken(configuration=" + this.f90454w + ", elementsSessionContext=" + this.f90455x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f90454w.writeToParcel(dest, i13);
        C22057e c22057e = this.f90455x;
        if (c22057e == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c22057e.writeToParcel(dest, i13);
        }
    }
}
