package sz;

import android.os.Parcel;
import android.os.Parcelable;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38901n;
import y00.C38915o4;

/* JADX INFO: renamed from: sz.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C33133h implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f138198a;

    public /* synthetic */ C33133h(int i13) {
        this.f138198a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        switch (this.f138198a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C33137j(parcel.readInt() != 0, EnumC33135i.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                EnumC33131g enumC33131gValueOf = EnumC33131g.valueOf(parcel.readString());
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z16 = false;
                if (parcel.readInt() != 0) {
                    z16 = true;
                }
                C33137j c33137jCreateFromParcel = C33137j.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z4 = true;
                    z13 = true;
                } else {
                    z4 = true;
                    z13 = z16;
                }
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                return new C33139k(enumC33131gValueOf, string, string2, z16, c33137jCreateFromParcel, z13, z4, parcel.createStringArrayList());
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C33141l.f138219w;
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C33143m.f138229w;
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C33145n((Throwable) parcel.readSerializable());
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C33156u(parcel.readString(), C33139k.CREATOR.createFromParcel(parcel), parcel.readString());
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C33157v(parcel.readString(), C33139k.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C33122b0(parcel.readInt() != 0, EnumC33120a0.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                EnumC33131g enumC33131gValueOf2 = EnumC33131g.valueOf(parcel.readString());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z17 = false;
                if (parcel.readInt() != 0) {
                    z17 = true;
                }
                C33122b0 c33122b0CreateFromParcel = C33122b0.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z14 = true;
                    z15 = true;
                } else {
                    z14 = true;
                    z15 = z17;
                }
                if (parcel.readInt() == 0) {
                    z14 = false;
                }
                return new C33124c0(enumC33131gValueOf2, string3, string4, z17, c33122b0CreateFromParcel, z15, z14, parcel.createStringArrayList());
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C33126d0.f138188w;
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C33128e0(C38915o4.CREATOR.createFromParcel(parcel));
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C33130f0(parcel.readInt(), (Throwable) parcel.readSerializable());
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C33142l0(C33124c0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), (InterfaceC35320a) parcel.readParcelable(C33142l0.class.getClassLoader()), (InterfaceC35322b) parcel.readParcelable(C33142l0.class.getClassLoader()), parcel.readInt() == 0 ? null : C38901n.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f138198a) {
            case 0:
                return new C33137j[i13];
            case 1:
                return new C33139k[i13];
            case 2:
                return new C33141l[i13];
            case 3:
                return new C33143m[i13];
            case 4:
                return new C33145n[i13];
            case 5:
                return new C33156u[i13];
            case 6:
                return new C33157v[i13];
            case 7:
                return new C33122b0[i13];
            case 8:
                return new C33124c0[i13];
            case 9:
                return new C33126d0[i13];
            case 10:
                return new C33128e0[i13];
            case 11:
                return new C33130f0[i13];
            default:
                return new C33142l0[i13];
        }
    }
}
