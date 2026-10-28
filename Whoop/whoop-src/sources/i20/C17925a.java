package i20;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16665h1;
import h20.C16671i1;
import h20.C16760x0;
import java.util.LinkedHashSet;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: i20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C17925a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69672a;

    public /* synthetic */ C17925a(int i13) {
        this.f69672a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f69672a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                Boolean boolValueOf = null;
                C16760x0 c16760x0CreateFromParcel = parcel.readInt() == 0 ? null : C16760x0.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new C17928b(string, c16760x0CreateFromParcel, string2, boolValueOf);
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17946h(parcel.readString(), parcel.readInt() == 0 ? null : C17975s.CREATOR.createFromParcel(parcel));
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17949i((AbstractC17981v) parcel.readParcelable(C17949i.class.getClassLoader()));
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17955k(parcel.readInt() == 0 ? null : C16760x0.CREATOR.createFromParcel(parcel));
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17958l(parcel.readInt() == 0 ? null : C16760x0.CREATOR.createFromParcel(parcel));
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17973r(EnumC17971q.CREATOR.createFromParcel(parcel), parcel.readString());
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return EnumC17971q.valueOf(parcel.readString());
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                C16665h1 c16665h1CreateFromParcel = C16665h1.CREATOR.createFromParcel(parcel);
                C17928b c17928bCreateFromParcel = parcel.readInt() == 0 ? null : C17928b.CREATOR.createFromParcel(parcel);
                int i13 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i13);
                int iM106646e = 0;
                int iM106646e2 = 0;
                while (iM106646e2 != i13) {
                    iM106646e2 = AbstractC33745d.m106646e(parcel, linkedHashSet, iM106646e2, 1);
                }
                String string3 = parcel.readString();
                C17973r c17973rCreateFromParcel = parcel.readInt() == 0 ? null : C17973r.CREATOR.createFromParcel(parcel);
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i14 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i14);
                while (iM106646e != i14) {
                    iM106646e = AbstractC33745d.m106646e(parcel, linkedHashSet2, iM106646e, 1);
                }
                return new C17975s(c16665h1CreateFromParcel, c17928bCreateFromParcel, linkedHashSet, string3, c17973rCreateFromParcel, string4, string5, linkedHashSet2, parcel.readInt() != 0 ? C16671i1.CREATOR.createFromParcel(parcel) : null);
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17977t(parcel.readInt() != 0);
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17979u(C17928b.CREATOR.createFromParcel(parcel));
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C17989z.f69832w;
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17926a0(C16665h1.CREATOR.createFromParcel(parcel));
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17932c0(parcel.readString(), parcel.readString(), parcel.readString(), (InterfaceC17929b0) parcel.readParcelable(C17932c0.class.getClassLoader()));
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17935d0(parcel.readString(), parcel.readInt() == 0 ? null : C16760x0.CREATOR.createFromParcel(parcel));
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17938e0(parcel.readString(), parcel.readInt() == 0 ? null : C16760x0.CREATOR.createFromParcel(parcel));
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17944g0(parcel.readInt() == 0 ? null : C16760x0.CREATOR.createFromParcel(parcel));
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17947h0(parcel.readInt() == 0 ? null : C16760x0.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f69672a) {
            case 0:
                return new C17928b[i13];
            case 1:
                return new C17946h[i13];
            case 2:
                return new C17949i[i13];
            case 3:
                return new C17955k[i13];
            case 4:
                return new C17958l[i13];
            case 5:
                return new C17973r[i13];
            case 6:
                return new EnumC17971q[i13];
            case 7:
                return new C17975s[i13];
            case 8:
                return new C17977t[i13];
            case 9:
                return new C17979u[i13];
            case 10:
                return new C17989z[i13];
            case 11:
                return new C17926a0[i13];
            case 12:
                return new C17932c0[i13];
            case 13:
                return new C17935d0[i13];
            case 14:
                return new C17938e0[i13];
            case 15:
                return new C17944g0[i13];
            default:
                return new C17947h0[i13];
        }
    }
}
