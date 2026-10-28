package n20;

import a30.C0273a;
import a30.C0290f1;
import android.os.Parcel;
import android.os.Parcelable;
import h20.C16761x1;
import ih0.AbstractC18489d0;
import mn.C25704b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import v00.C35459c0;

/* JADX INFO: renamed from: n20.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C26173h implements Parcelable {
    public static final Parcelable.Creator<C26173h> CREATOR = new C25704b(4);

    /* JADX INFO: renamed from: w */
    public final C0290f1 f103767w;

    /* JADX INFO: renamed from: x */
    public final C16761x1 f103768x;

    /* JADX INFO: renamed from: y */
    public final boolean f103769y;

    public C26173h(C0290f1 paymentSheetState, C16761x1 config, boolean z4) {
        AbstractC22676k.m65750j(paymentSheetState, "paymentSheetState");
        AbstractC22676k.m65750j(config, "config");
        this.f103767w = paymentSheetState;
        this.f103768x = config;
        this.f103769y = z4;
    }

    /* JADX INFO: renamed from: b */
    public static C26173h m77716b(C26173h c26173h, C0290f1 paymentSheetState, int i13) {
        if ((i13 & 1) != 0) {
            paymentSheetState = c26173h.f103767w;
        }
        C16761x1 config = c26173h.f103768x;
        boolean z4 = (i13 & 4) != 0 ? c26173h.f103769y : true;
        c26173h.getClass();
        AbstractC22676k.m65750j(paymentSheetState, "paymentSheetState");
        AbstractC22676k.m65750j(config, "config");
        return new C26173h(paymentSheetState, config, z4);
    }

    /* JADX INFO: renamed from: f */
    public static C26173h m77717f(C26173h c26173h, C0273a c0273a, C35459c0 metadata, int i13) {
        C0290f1 c0290f1 = c26173h.f103767w;
        AbstractC29840y abstractC29840y = c0290f1.f1022y;
        if ((i13 & 2) != 0) {
            c0273a = c0290f1.f1021x;
        }
        if ((i13 & 4) != 0) {
            metadata = c0290f1.f1019E;
        }
        AbstractC22676k.m65750j(metadata, "metadata");
        return m77716b(c26173h, C0290f1.m821b(c0290f1, c0273a, abstractC29840y, metadata, 9), 6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26173h)) {
            return false;
        }
        C26173h c26173h = (C26173h) obj;
        return AbstractC22676k.m65745e(this.f103767w, c26173h.f103767w) && AbstractC22676k.m65745e(this.f103768x, c26173h.f103768x) && this.f103769y == c26173h.f103769y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103769y) + ((this.f103768x.hashCode() + (this.f103767w.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("State(paymentSheetState=");
        sb4.append(this.f103767w);
        sb4.append(", config=");
        sb4.append(this.f103768x);
        sb4.append(", declinedLink2FA=");
        return AbstractC18489d0.m53372m(sb4, this.f103769y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f103767w, i13);
        this.f103768x.writeToParcel(dest, i13);
        dest.writeInt(this.f103769y ? 1 : 0);
    }
}
