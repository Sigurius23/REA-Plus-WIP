package v00;

import android.os.Parcel;
import android.os.Parcelable;
import h20.AbstractC16737t1;
import h20.C16713p1;
import h20.C16719q1;
import h20.C16731s1;
import h20.EnumC16725r1;
import p499t9.C33623c0;
import p537ux.InterfaceC35320a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38915o4;
import y00.C39013z3;
import y00.EnumC38828f4;
import y00.EnumC38853i;

/* JADX INFO: renamed from: v00.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35473j0 implements InterfaceC35320a {
    public static final Parcelable.Creator<C35473j0> CREATOR = new C35467g0(1);

    /* JADX INFO: renamed from: w */
    public final AbstractC16737t1 f151014w;

    public C35473j0(AbstractC16737t1 cardBrandAcceptance) {
        AbstractC22676k.m65750j(cardBrandAcceptance, "cardBrandAcceptance");
        this.f151014w = cardBrandAcceptance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35473j0) && AbstractC22676k.m65745e(this.f151014w, ((C35473j0) obj).f151014w);
    }

    public final int hashCode() {
        return this.f151014w.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    @Override // p537ux.InterfaceC35320a
    /* JADX INFO: renamed from: l0 */
    public final boolean mo112178l0(C38915o4 c38915o4) {
        EnumC38853i enumC38853iM106236i;
        String str;
        C39013z3 c39013z3 = c38915o4.f167514H;
        if (c39013z3 != null && (str = c39013z3.f167917L) != null) {
            EnumC38853i.f167238M.getClass();
            enumC38853iM106236i = C33623c0.m106236i(str);
            if (enumC38853iM106236i == EnumC38853i.Unknown) {
                enumC38853iM106236i = null;
            }
            if (enumC38853iM106236i == null) {
                if (c39013z3 != null) {
                    enumC38853iM106236i = c39013z3.f167918w;
                } else {
                    enumC38853iM106236i = EnumC38853i.Unknown;
                }
            }
        } else if (c39013z3 != null) {
            enumC38853iM106236i = c39013z3.f167918w;
        } else {
            enumC38853iM106236i = EnumC38853i.Unknown;
        }
        return c38915o4.f167511E != EnumC38828f4.f167090I || mo112179o(enumC38853iM106236i);
    }

    @Override // p537ux.InterfaceC35320a
    /* JADX INFO: renamed from: o */
    public final boolean mo112179o(EnumC38853i cardBrand) {
        EnumC16725r1 enumC16725r1;
        AbstractC22676k.m65750j(cardBrand, "cardBrand");
        switch (cardBrand.ordinal()) {
            case 0:
                enumC16725r1 = EnumC16725r1.f64270w;
                break;
            case 1:
                enumC16725r1 = EnumC16725r1.f64271x;
                break;
            case 2:
                enumC16725r1 = EnumC16725r1.f64272y;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                enumC16725r1 = EnumC16725r1.f64273z;
                break;
            default:
                enumC16725r1 = null;
                break;
        }
        AbstractC16737t1 abstractC16737t1 = this.f151014w;
        if (abstractC16737t1 instanceof C16713p1) {
            return true;
        }
        if (abstractC16737t1 instanceof C16719q1) {
            return enumC16725r1 != null && ((C16719q1) abstractC16737t1).f64258w.contains(enumC16725r1);
        }
        if (abstractC16737t1 instanceof C16731s1) {
            return enumC16725r1 == null || !((C16731s1) abstractC16737t1).f64281w.contains(enumC16725r1);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        return "PaymentSheetCardBrandFilter(cardBrandAcceptance=" + this.f151014w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f151014w, i13);
    }
}
