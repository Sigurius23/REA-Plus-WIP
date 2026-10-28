package p10;

import android.os.Parcel;
import android.os.Parcelable;
import e10.InterfaceC12555l;
import j00.AbstractC21106i0;
import mn.C25704b;
import p599wz.C37718g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38809d5;

/* JADX INFO: renamed from: p10.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C28699h implements InterfaceC12555l {
    public static final Parcelable.Creator<C28699h> CREATOR = new C25704b(29);

    /* JADX INFO: renamed from: E */
    public final C37718g0 f116087E;

    /* JADX INFO: renamed from: F */
    public final AbstractC21106i0 f116088F;

    /* JADX INFO: renamed from: w */
    public final C38809d5 f116089w;

    /* JADX INFO: renamed from: x */
    public final AbstractC38970u5 f116090x;

    /* JADX INFO: renamed from: y */
    public final AbstractC38869j5 f116091y;

    /* JADX INFO: renamed from: z */
    public final EnumC28698g f116092z;

    public C28699h(C38809d5 createParams, AbstractC38970u5 abstractC38970u5, AbstractC38869j5 abstractC38869j5, EnumC28698g saveOption, C37718g0 linkConfiguration, AbstractC21106i0 userInput) {
        AbstractC22676k.m65750j(createParams, "createParams");
        AbstractC22676k.m65750j(saveOption, "saveOption");
        AbstractC22676k.m65750j(linkConfiguration, "linkConfiguration");
        AbstractC22676k.m65750j(userInput, "userInput");
        this.f116089w = createParams;
        this.f116090x = abstractC38970u5;
        this.f116091y = abstractC38869j5;
        this.f116092z = saveOption;
        this.f116087E = linkConfiguration;
        this.f116088F = userInput;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28699h)) {
            return false;
        }
        C28699h c28699h = (C28699h) obj;
        return AbstractC22676k.m65745e(this.f116089w, c28699h.f116089w) && AbstractC22676k.m65745e(this.f116090x, c28699h.f116090x) && AbstractC22676k.m65745e(this.f116091y, c28699h.f116091y) && this.f116092z == c28699h.f116092z && AbstractC22676k.m65745e(this.f116087E, c28699h.f116087E) && AbstractC22676k.m65745e(this.f116088F, c28699h.f116088F);
    }

    public final int hashCode() {
        int iHashCode = this.f116089w.hashCode() * 31;
        AbstractC38970u5 abstractC38970u5 = this.f116090x;
        int iHashCode2 = (iHashCode + (abstractC38970u5 == null ? 0 : abstractC38970u5.hashCode())) * 31;
        AbstractC38869j5 abstractC38869j5 = this.f116091y;
        return this.f116088F.hashCode() + ((this.f116087E.hashCode() + ((this.f116092z.hashCode() + ((iHashCode2 + (abstractC38869j5 != null ? abstractC38869j5.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LinkInlineSignupConfirmationOption(createParams=" + this.f116089w + ", optionsParams=" + this.f116090x + ", extraParams=" + this.f116091y + ", saveOption=" + this.f116092z + ", linkConfiguration=" + this.f116087E + ", userInput=" + this.f116088F + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f116089w, i13);
        dest.writeParcelable(this.f116090x, i13);
        dest.writeParcelable(this.f116091y, i13);
        dest.writeString(this.f116092z.name());
        dest.writeParcelable(this.f116087E, i13);
        dest.writeParcelable(this.f116088F, i13);
    }
}
