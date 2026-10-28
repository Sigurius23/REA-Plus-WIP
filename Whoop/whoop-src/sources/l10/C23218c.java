package l10;

import android.os.Parcel;
import android.os.Parcelable;
import e10.InterfaceC12555l;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l10.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C23218c implements InterfaceC12555l {
    public static final Parcelable.Creator<C23218c> CREATOR = new C22060h(18);

    /* JADX INFO: renamed from: w */
    public final C23217b f91933w;

    public C23218c(C23217b config) {
        AbstractC22676k.m65750j(config, "config");
        this.f91933w = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23218c) && AbstractC22676k.m65745e(this.f91933w, ((C23218c) obj).f91933w);
    }

    public final int hashCode() {
        return this.f91933w.hashCode();
    }

    public final String toString() {
        return "GooglePayConfirmationOption(config=" + this.f91933w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f91933w.writeToParcel(dest, i13);
    }
}
