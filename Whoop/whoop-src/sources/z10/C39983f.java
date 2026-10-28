package z10;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38821e7;

/* JADX INFO: renamed from: z10.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C39983f implements Parcelable {
    public static final Parcelable.Creator<C39983f> CREATOR = new C38821e7(25);

    /* JADX INFO: renamed from: w */
    public final AbstractC39995r f172550w;

    public C39983f(AbstractC39995r collectBankAccountResult) {
        AbstractC22676k.m65750j(collectBankAccountResult, "collectBankAccountResult");
        this.f172550w = collectBankAccountResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39983f) && AbstractC22676k.m65745e(this.f172550w, ((C39983f) obj).f172550w);
    }

    public final int hashCode() {
        return this.f172550w.hashCode();
    }

    public final String toString() {
        return "Result(collectBankAccountResult=" + this.f172550w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f172550w, i13);
    }
}
