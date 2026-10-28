package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import l83.C23465k;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y00.h5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38849h5 extends AbstractC38869j5 {
    public static final Parcelable.Creator<C38849h5> CREATOR = new C38858i4(21);

    /* JADX INFO: renamed from: x */
    public final Boolean f167226x;

    public C38849h5(Boolean bool) {
        super(EnumC38828f4.f167093L);
        this.f167226x = bool;
    }

    @Override // y00.AbstractC38869j5
    /* JADX INFO: renamed from: b */
    public final List mo124343b() {
        Boolean bool = this.f167226x;
        return AbstractC37056f.m118958J(new C23465k("set_as_default_payment_method", bool != null ? bool.toString() : null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38849h5) && AbstractC22676k.m65745e(this.f167226x, ((C38849h5) obj).f167226x);
    }

    public final int hashCode() {
        Boolean bool = this.f167226x;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return AbstractC33745d.m106651j("SepaDebit(setAsDefault=", this.f167226x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Boolean bool = this.f167226x;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
    }
}
