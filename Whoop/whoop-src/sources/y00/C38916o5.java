package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import l83.C23465k;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y00.o5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38916o5 extends AbstractC38970u5 {
    public static final Parcelable.Creator<C38916o5> CREATOR = new C38858i4(27);

    /* JADX INFO: renamed from: x */
    public final EnumC38910o f167531x;

    public C38916o5(EnumC38910o enumC38910o) {
        super(EnumC38828f4.f167093L);
        this.f167531x = enumC38910o;
    }

    @Override // y00.AbstractC38970u5
    /* JADX INFO: renamed from: b */
    public final List mo124356b() {
        EnumC38910o enumC38910o = this.f167531x;
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
        return (obj instanceof C38916o5) && this.f167531x == ((C38916o5) obj).f167531x;
    }

    public final int hashCode() {
        EnumC38910o enumC38910o = this.f167531x;
        if (enumC38910o == null) {
            return 0;
        }
        return enumC38910o.hashCode();
    }

    public final String toString() {
        return "SepaDebit(setupFutureUsage=" + this.f167531x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        EnumC38910o enumC38910o = this.f167531x;
        if (enumC38910o == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38910o.name());
        }
    }
}
