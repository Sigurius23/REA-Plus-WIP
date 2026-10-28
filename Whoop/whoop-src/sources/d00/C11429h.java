package d00;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.ConsentUi;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d00.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C11429h implements InterfaceC11432k {
    public static final Parcelable.Creator<C11429h> CREATOR = new C11428g();

    /* JADX INFO: renamed from: w */
    public final ConsentUi.ConsentPane f36648w;

    public C11429h(ConsentUi.ConsentPane consentPane) {
        AbstractC22676k.m65750j(consentPane, "consentPane");
        this.f36648w = consentPane;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11429h) && AbstractC22676k.m65745e(this.f36648w, ((C11429h) obj).f36648w);
    }

    public final int hashCode() {
        return this.f36648w.hashCode();
    }

    public final String toString() {
        return "FullScreen(consentPane=" + this.f36648w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f36648w, i13);
    }
}
