package a30;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import my.C26027a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import v00.C35459c0;

/* JADX INFO: renamed from: a30.f1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0290f1 implements Parcelable {
    public static final Parcelable.Creator<C0290f1> CREATOR = new C0113a(19);

    /* JADX INFO: renamed from: E */
    public final C35459c0 f1019E;

    /* JADX INFO: renamed from: w */
    public final C26027a f1020w;

    /* JADX INFO: renamed from: x */
    public final C0273a f1021x;

    /* JADX INFO: renamed from: y */
    public final AbstractC29840y f1022y;

    /* JADX INFO: renamed from: z */
    public final AbstractC0287e1 f1023z;

    public C0290f1(C26027a config, C0273a c0273a, AbstractC29840y abstractC29840y, AbstractC0287e1 abstractC0287e1, C35459c0 paymentMethodMetadata) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        this.f1020w = config;
        this.f1021x = c0273a;
        this.f1022y = abstractC29840y;
        this.f1023z = abstractC0287e1;
        this.f1019E = paymentMethodMetadata;
    }

    /* JADX INFO: renamed from: b */
    public static C0290f1 m821b(C0290f1 c0290f1, C0273a c0273a, AbstractC29840y abstractC29840y, C35459c0 c35459c0, int i13) {
        C26027a config = c0290f1.f1020w;
        if ((i13 & 2) != 0) {
            c0273a = c0290f1.f1021x;
        }
        C0273a c0273a2 = c0273a;
        AbstractC0287e1 abstractC0287e1 = c0290f1.f1023z;
        if ((i13 & 16) != 0) {
            c35459c0 = c0290f1.f1019E;
        }
        C35459c0 paymentMethodMetadata = c35459c0;
        c0290f1.getClass();
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        return new C0290f1(config, c0273a2, abstractC29840y, abstractC0287e1, paymentMethodMetadata);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0290f1)) {
            return false;
        }
        C0290f1 c0290f1 = (C0290f1) obj;
        return AbstractC22676k.m65745e(this.f1020w, c0290f1.f1020w) && AbstractC22676k.m65745e(this.f1021x, c0290f1.f1021x) && AbstractC22676k.m65745e(this.f1022y, c0290f1.f1022y) && AbstractC22676k.m65745e(this.f1023z, c0290f1.f1023z) && AbstractC22676k.m65745e(this.f1019E, c0290f1.f1019E);
    }

    public final int hashCode() {
        int iHashCode = this.f1020w.hashCode() * 31;
        C0273a c0273a = this.f1021x;
        int iHashCode2 = (iHashCode + (c0273a == null ? 0 : c0273a.hashCode())) * 31;
        AbstractC29840y abstractC29840y = this.f1022y;
        int iHashCode3 = (iHashCode2 + (abstractC29840y == null ? 0 : abstractC29840y.hashCode())) * 31;
        AbstractC0287e1 abstractC0287e1 = this.f1023z;
        return this.f1019E.hashCode() + ((iHashCode3 + (abstractC0287e1 != null ? abstractC0287e1.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Full(config=" + this.f1020w + ", customer=" + this.f1021x + ", paymentSelection=" + this.f1022y + ", validationError=" + this.f1023z + ", paymentMethodMetadata=" + this.f1019E + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f1020w, i13);
        dest.writeParcelable(this.f1021x, i13);
        dest.writeParcelable(this.f1022y, i13);
        dest.writeSerializable(this.f1023z);
        dest.writeParcelable(this.f1019E, i13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0290f1(C0330v0 state) {
        this(state.f1157w, state.f1158x, state.f1159y, state.f1160z, state.f1156E);
        AbstractC22676k.m65750j(state, "state");
    }
}
