package d00;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.ConsentUi;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d00.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C11431j implements InterfaceC11432k {
    public static final Parcelable.Creator<C11431j> CREATOR = new C11430i();

    /* JADX INFO: renamed from: w */
    public final ConsentUi.ConsentSection f36649w;

    public C11431j(ConsentUi.ConsentSection consentSection) {
        AbstractC22676k.m65750j(consentSection, "consentSection");
        this.f36649w = consentSection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11431j) && AbstractC22676k.m65745e(this.f36649w, ((C11431j) obj).f36649w);
    }

    public final int hashCode() {
        return this.f36649w.hashCode();
    }

    public final String toString() {
        return "Inline(consentSection=" + this.f36649w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f36649w, i13);
    }
}
