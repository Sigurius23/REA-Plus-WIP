package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import l83.C23465k;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y00.i5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38859i5 extends AbstractC38869j5 {
    public static final Parcelable.Creator<C38859i5> CREATOR = new C38858i4(22);

    /* JADX INFO: renamed from: x */
    public final Boolean f167279x;

    public C38859i5(Boolean bool) {
        super(EnumC38828f4.f167119l0);
        this.f167279x = bool;
    }

    @Override // y00.AbstractC38869j5
    /* JADX INFO: renamed from: b */
    public final List mo124343b() {
        Boolean bool = this.f167279x;
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
        return (obj instanceof C38859i5) && AbstractC22676k.m65745e(this.f167279x, ((C38859i5) obj).f167279x);
    }

    public final int hashCode() {
        Boolean bool = this.f167279x;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return AbstractC33745d.m106651j("USBankAccount(setAsDefault=", this.f167279x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Boolean bool = this.f167279x;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
    }
}
