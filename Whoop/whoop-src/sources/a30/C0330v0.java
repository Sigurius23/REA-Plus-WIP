package a30;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import my.C26027a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import v00.C35459c0;

/* JADX INFO: renamed from: a30.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0330v0 implements Parcelable {
    public static final Parcelable.Creator<C0330v0> CREATOR = new C0113a(18);

    /* JADX INFO: renamed from: E */
    public final C35459c0 f1156E;

    /* JADX INFO: renamed from: w */
    public final C26027a f1157w;

    /* JADX INFO: renamed from: x */
    public final C0273a f1158x;

    /* JADX INFO: renamed from: y */
    public final AbstractC29840y f1159y;

    /* JADX INFO: renamed from: z */
    public final AbstractC0287e1 f1160z;

    public C0330v0(C26027a config, C0273a c0273a, AbstractC29840y abstractC29840y, AbstractC0287e1 abstractC0287e1, C35459c0 paymentMethodMetadata) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        this.f1157w = config;
        this.f1158x = c0273a;
        this.f1159y = abstractC29840y;
        this.f1160z = abstractC0287e1;
        this.f1156E = paymentMethodMetadata;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0330v0)) {
            return false;
        }
        C0330v0 c0330v0 = (C0330v0) obj;
        return AbstractC22676k.m65745e(this.f1157w, c0330v0.f1157w) && AbstractC22676k.m65745e(this.f1158x, c0330v0.f1158x) && AbstractC22676k.m65745e(this.f1159y, c0330v0.f1159y) && AbstractC22676k.m65745e(this.f1160z, c0330v0.f1160z) && AbstractC22676k.m65745e(this.f1156E, c0330v0.f1156E);
    }

    public final int hashCode() {
        int iHashCode = this.f1157w.hashCode() * 31;
        C0273a c0273a = this.f1158x;
        int iHashCode2 = (iHashCode + (c0273a == null ? 0 : c0273a.hashCode())) * 31;
        AbstractC29840y abstractC29840y = this.f1159y;
        int iHashCode3 = (iHashCode2 + (abstractC29840y == null ? 0 : abstractC29840y.hashCode())) * 31;
        AbstractC0287e1 abstractC0287e1 = this.f1160z;
        return this.f1156E.hashCode() + ((iHashCode3 + (abstractC0287e1 != null ? abstractC0287e1.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "State(config=" + this.f1157w + ", customer=" + this.f1158x + ", paymentSelection=" + this.f1159y + ", validationError=" + this.f1160z + ", paymentMethodMetadata=" + this.f1156E + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f1157w, i13);
        dest.writeParcelable(this.f1158x, i13);
        dest.writeParcelable(this.f1159y, i13);
        dest.writeSerializable(this.f1160z);
        this.f1156E.writeToParcel(dest, i13);
    }
}
