package p591wp;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import p072cp.BinderC10935b;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import v00.C35467g0;

/* JADX INFO: renamed from: wp.i */
/* JADX INFO: loaded from: classes6.dex */
public class C37488i extends AbstractC36219a {
    public static final Parcelable.Creator<C37488i> CREATOR = new C35467g0(23);

    /* JADX INFO: renamed from: E */
    public float f160332E;

    /* JADX INFO: renamed from: F */
    public float f160333F;

    /* JADX INFO: renamed from: G */
    public boolean f160334G;

    /* JADX INFO: renamed from: H */
    public boolean f160335H;

    /* JADX INFO: renamed from: I */
    public boolean f160336I;

    /* JADX INFO: renamed from: J */
    public float f160337J;

    /* JADX INFO: renamed from: K */
    public float f160338K;

    /* JADX INFO: renamed from: L */
    public float f160339L;

    /* JADX INFO: renamed from: M */
    public float f160340M;

    /* JADX INFO: renamed from: N */
    public float f160341N;

    /* JADX INFO: renamed from: O */
    public int f160342O;

    /* JADX INFO: renamed from: P */
    public View f160343P;

    /* JADX INFO: renamed from: Q */
    public int f160344Q;

    /* JADX INFO: renamed from: R */
    public String f160345R;

    /* JADX INFO: renamed from: S */
    public float f160346S;

    /* JADX INFO: renamed from: w */
    public LatLng f160347w;

    /* JADX INFO: renamed from: x */
    public String f160348x;

    /* JADX INFO: renamed from: y */
    public String f160349y;

    /* JADX INFO: renamed from: z */
    public C37481b f160350z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 2, this.f160347w, i13);
        AbstractC36221c.m115332m(parcel, 3, this.f160348x);
        AbstractC36221c.m115332m(parcel, 4, this.f160349y);
        C37481b c37481b = this.f160350z;
        AbstractC36221c.m115327h(parcel, 5, c37481b == null ? null : c37481b.f160319a.asBinder());
        float f13 = this.f160332E;
        AbstractC36221c.m115337r(parcel, 6, 4);
        parcel.writeFloat(f13);
        float f14 = this.f160333F;
        AbstractC36221c.m115337r(parcel, 7, 4);
        parcel.writeFloat(f14);
        boolean z4 = this.f160334G;
        AbstractC36221c.m115337r(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z13 = this.f160335H;
        AbstractC36221c.m115337r(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.f160336I;
        AbstractC36221c.m115337r(parcel, 10, 4);
        parcel.writeInt(z14 ? 1 : 0);
        float f15 = this.f160337J;
        AbstractC36221c.m115337r(parcel, 11, 4);
        parcel.writeFloat(f15);
        float f16 = this.f160338K;
        AbstractC36221c.m115337r(parcel, 12, 4);
        parcel.writeFloat(f16);
        float f17 = this.f160339L;
        AbstractC36221c.m115337r(parcel, 13, 4);
        parcel.writeFloat(f17);
        float f18 = this.f160340M;
        AbstractC36221c.m115337r(parcel, 14, 4);
        parcel.writeFloat(f18);
        float f19 = this.f160341N;
        AbstractC36221c.m115337r(parcel, 15, 4);
        parcel.writeFloat(f19);
        int i14 = this.f160342O;
        AbstractC36221c.m115337r(parcel, 17, 4);
        parcel.writeInt(i14);
        AbstractC36221c.m115327h(parcel, 18, new BinderC10935b(this.f160343P));
        int i15 = this.f160344Q;
        AbstractC36221c.m115337r(parcel, 19, 4);
        parcel.writeInt(i15);
        AbstractC36221c.m115332m(parcel, 20, this.f160345R);
        float f24 = this.f160346S;
        AbstractC36221c.m115337r(parcel, 21, 4);
        parcel.writeFloat(f24);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
