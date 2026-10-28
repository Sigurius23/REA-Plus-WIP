package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import l83.C23465k;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y00.q5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38934q5 extends AbstractC38970u5 {
    public static final Parcelable.Creator<C38934q5> CREATOR = new C38858i4(29);

    /* JADX INFO: renamed from: x */
    public final EnumC38910o f167603x;

    public C38934q5(EnumC38910o enumC38910o) {
        super(EnumC38828f4.f167119l0);
        this.f167603x = enumC38910o;
    }

    @Override // y00.AbstractC38970u5
    /* JADX INFO: renamed from: b */
    public final List mo124356b() {
        EnumC38910o enumC38910o = this.f167603x;
        return AbstractC37056f.m118958J(new C23465k("setup_future_usage", enumC38910o != null ? enumC38910o.f167492w : null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38934q5) && this.f167603x == ((C38934q5) obj).f167603x;
    }

    public final int hashCode() {
        EnumC38910o enumC38910o = this.f167603x;
        if (enumC38910o == null) {
            return 0;
        }
        return enumC38910o.hashCode();
    }

    public final String toString() {
        return "USBankAccount(setupFutureUsage=" + this.f167603x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        EnumC38910o enumC38910o = this.f167603x;
        if (enumC38910o == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38910o.name());
        }
    }
}
