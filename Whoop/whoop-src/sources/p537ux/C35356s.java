package p537ux;

import android.os.Parcel;
import android.os.Parcelable;
import m30.C24992h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ux.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C35356s implements Parcelable {
    public static final Parcelable.Creator<C35356s> CREATOR = new C35332g(6);

    /* JADX INFO: renamed from: w */
    public final C24992h f150611w;

    public C35356s(C24992h uiCustomization) {
        AbstractC22676k.m65750j(uiCustomization, "uiCustomization");
        this.f150611w = uiCustomization;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35356s) && AbstractC22676k.m65745e(this.f150611w, ((C35356s) obj).f150611w);
    }

    public final int hashCode() {
        return this.f150611w.hashCode();
    }

    public final String toString() {
        return "Stripe3ds2UiCustomization(uiCustomization=" + this.f150611w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f150611w, i13);
    }
}
