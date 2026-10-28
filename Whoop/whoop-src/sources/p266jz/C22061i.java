package p266jz;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38842g8;

/* JADX INFO: renamed from: jz.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C22061i extends AbstractC22063k {
    public static final Parcelable.Creator<C22061i> CREATOR = new C22060h(0);

    /* JADX INFO: renamed from: w */
    public final FinancialConnectionsSession f85573w;

    /* JADX INFO: renamed from: x */
    public final C38842g8 f85574x;

    public C22061i(FinancialConnectionsSession financialConnectionsSession, C38842g8 token) {
        AbstractC22676k.m65750j(financialConnectionsSession, "financialConnectionsSession");
        AbstractC22676k.m65750j(token, "token");
        this.f85573w = financialConnectionsSession;
        this.f85574x = token;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22061i)) {
            return false;
        }
        C22061i c22061i = (C22061i) obj;
        return AbstractC22676k.m65745e(this.f85573w, c22061i.f85573w) && AbstractC22676k.m65745e(this.f85574x, c22061i.f85574x);
    }

    public final int hashCode() {
        return this.f85574x.hashCode() + (this.f85573w.hashCode() * 31);
    }

    public final String toString() {
        return "Completed(financialConnectionsSession=" + this.f85573w + ", token=" + this.f85574x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f85573w.writeToParcel(dest, i13);
        dest.writeParcelable(this.f85574x, i13);
    }
}
