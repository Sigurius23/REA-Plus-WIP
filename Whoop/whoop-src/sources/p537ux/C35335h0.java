package p537ux;

import android.os.Parcel;
import android.os.Parcelable;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38840g6;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: ux.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35335h0 extends AbstractC35345m0 {
    public static final Parcelable.Creator<C35335h0> CREATOR = new C35332g(12);

    /* JADX INFO: renamed from: x */
    public final C38840g6 f150538x;

    /* JADX INFO: renamed from: y */
    public final int f150539y;

    /* JADX INFO: renamed from: z */
    public final String f150540z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35335h0(C38840g6 intent, int i13, String str) {
        super(i13);
        AbstractC22676k.m65750j(intent, "intent");
        this.f150538x = intent;
        this.f150539y = i13;
        this.f150540z = str;
    }

    @Override // p537ux.AbstractC35345m0
    /* JADX INFO: renamed from: b */
    public final String mo112189b() {
        return this.f150540z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35335h0)) {
            return false;
        }
        C35335h0 c35335h0 = (C35335h0) obj;
        return AbstractC22676k.m65745e(this.f150538x, c35335h0.f150538x) && this.f150539y == c35335h0.f150539y && AbstractC22676k.m65745e(this.f150540z, c35335h0.f150540z);
    }

    @Override // p537ux.AbstractC35345m0
    /* JADX INFO: renamed from: f */
    public final InterfaceC38802c8 mo112190f() {
        return this.f150538x;
    }

    public final int hashCode() {
        int iHashCode = ((this.f150538x.hashCode() * 31) + this.f150539y) * 31;
        String str = this.f150540z;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SetupIntentResult(intent=");
        sb4.append(this.f150538x);
        sb4.append(", outcomeFromFlow=");
        sb4.append(this.f150539y);
        sb4.append(", failureMessage=");
        return AbstractC25012a.m73376i(this.f150540z, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f150538x.writeToParcel(dest, i13);
        dest.writeInt(this.f150539y);
        dest.writeString(this.f150540z);
    }
}
