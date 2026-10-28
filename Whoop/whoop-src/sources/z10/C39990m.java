package z10;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z10.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C39990m implements InterfaceC36562b {
    public static final Parcelable.Creator<C39990m> CREATOR = new C39988k(1);

    /* JADX INFO: renamed from: w */
    public final FinancialConnectionsSession f172563w;

    public C39990m(FinancialConnectionsSession financialConnectionsSession) {
        AbstractC22676k.m65750j(financialConnectionsSession, "financialConnectionsSession");
        this.f172563w = financialConnectionsSession;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39990m) && AbstractC22676k.m65745e(this.f172563w, ((C39990m) obj).f172563w);
    }

    public final int hashCode() {
        return this.f172563w.hashCode();
    }

    public final String toString() {
        return "USBankAccountData(financialConnectionsSession=" + this.f172563w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f172563w, i13);
    }
}
