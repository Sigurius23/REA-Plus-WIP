package t20;

import android.os.Parcel;
import android.os.Parcelable;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38915o4;

/* JADX INFO: renamed from: t20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C33320a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f138994a;

    public /* synthetic */ C33320a(int i13) {
        this.f138994a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z4;
        switch (this.f138994a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                boolean z13 = false;
                if (parcel.readInt() != 0) {
                    z13 = true;
                    z4 = true;
                } else {
                    z4 = true;
                }
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                return new C33326g(z13, string, z4, parcel.readInt() == 0 ? null : C33321b.CREATOR.createFromParcel(parcel), (InterfaceC41211c) parcel.readParcelable(C33326g.class.getClassLoader()));
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                InterfaceC33325f interfaceC33325f = (InterfaceC33325f) parcel.readParcelable(C33321b.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                InterfaceC41211c interfaceC41211c = (InterfaceC41211c) parcel.readParcelable(C33321b.class.getClassLoader());
                boolean z14 = false;
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                return new C33321b(interfaceC33325f, string2, string3, string4, string5, interfaceC41211c, z14, parcel.readInt() != 0);
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C33323d((C38915o4) parcel.readParcelable(C33323d.class.getClassLoader()));
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C33324e(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f138994a) {
            case 0:
                return new C33326g[i13];
            case 1:
                return new C33321b[i13];
            case 2:
                return new C33323d[i13];
            default:
                return new C33324e[i13];
        }
    }
}
