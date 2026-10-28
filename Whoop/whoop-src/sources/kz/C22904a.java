package kz;

import android.os.Parcel;
import android.os.Parcelable;
import p266jz.C22057e;
import p266jz.C22058f;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kz.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C22904a extends AbstractC22907d {
    public static final Parcelable.Creator<C22904a> CREATOR = new C22060h(7);

    /* JADX INFO: renamed from: w */
    public final C22058f f90450w;

    /* JADX INFO: renamed from: x */
    public final C22057e f90451x;

    public C22904a(C22058f configuration, C22057e c22057e) {
        AbstractC22676k.m65750j(configuration, "configuration");
        this.f90450w = configuration;
        this.f90451x = c22057e;
    }

    @Override // kz.AbstractC22907d
    /* JADX INFO: renamed from: b */
    public final C22058f mo66638b() {
        return this.f90450w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22904a)) {
            return false;
        }
        C22904a c22904a = (C22904a) obj;
        return AbstractC22676k.m65745e(this.f90450w, c22904a.f90450w) && AbstractC22676k.m65745e(this.f90451x, c22904a.f90451x);
    }

    @Override // kz.AbstractC22907d
    /* JADX INFO: renamed from: f */
    public final C22057e mo66639f() {
        return this.f90451x;
    }

    public final int hashCode() {
        int iHashCode = this.f90450w.hashCode() * 31;
        C22057e c22057e = this.f90451x;
        return iHashCode + (c22057e == null ? 0 : c22057e.hashCode());
    }

    public final String toString() {
        return "ForData(configuration=" + this.f90450w + ", elementsSessionContext=" + this.f90451x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f90450w.writeToParcel(dest, i13);
        C22057e c22057e = this.f90451x;
        if (c22057e == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c22057e.writeToParcel(dest, i13);
        }
    }
}
