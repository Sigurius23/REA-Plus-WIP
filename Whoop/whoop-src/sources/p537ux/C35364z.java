package p537ux;

import android.os.Parcel;
import android.os.Parcelable;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38887l3;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: ux.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C35364z extends AbstractC35345m0 {
    public static final Parcelable.Creator<C35364z> CREATOR = new C35332g(8);

    /* JADX INFO: renamed from: x */
    public final C38887l3 f150635x;

    /* JADX INFO: renamed from: y */
    public final int f150636y;

    /* JADX INFO: renamed from: z */
    public final String f150637z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35364z(C38887l3 intent, int i13, String str) {
        super(i13);
        AbstractC22676k.m65750j(intent, "intent");
        this.f150635x = intent;
        this.f150636y = i13;
        this.f150637z = str;
    }

    @Override // p537ux.AbstractC35345m0
    /* JADX INFO: renamed from: b */
    public final String mo112189b() {
        return this.f150637z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35364z)) {
            return false;
        }
        C35364z c35364z = (C35364z) obj;
        return AbstractC22676k.m65745e(this.f150635x, c35364z.f150635x) && this.f150636y == c35364z.f150636y && AbstractC22676k.m65745e(this.f150637z, c35364z.f150637z);
    }

    @Override // p537ux.AbstractC35345m0
    /* JADX INFO: renamed from: f */
    public final InterfaceC38802c8 mo112190f() {
        return this.f150635x;
    }

    public final int hashCode() {
        int iHashCode = ((this.f150635x.hashCode() * 31) + this.f150636y) * 31;
        String str = this.f150637z;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PaymentIntentResult(intent=");
        sb4.append(this.f150635x);
        sb4.append(", outcomeFromFlow=");
        sb4.append(this.f150636y);
        sb4.append(", failureMessage=");
        return AbstractC25012a.m73376i(this.f150637z, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f150635x.writeToParcel(dest, i13);
        dest.writeInt(this.f150636y);
        dest.writeString(this.f150637z);
    }
}
