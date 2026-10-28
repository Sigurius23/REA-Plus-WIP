package p597wx;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import b10.EnumC2228d;
import com.stripe.android.model.BankAccount$Status;
import com.stripe.android.model.BankAccount$Type;
import d00.C11433l;
import f20.EnumC14023b;
import h20.C16671i1;
import h20.C16689l1;
import i20.C17928b;
import java.util.LinkedHashMap;
import p208i2.AbstractC17918w0;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p599wz.AbstractC37748q0;
import p599wz.AbstractC37760u0;
import p599wz.C37700a0;
import p599wz.C37702b;
import p599wz.C37703b0;
import p599wz.C37708d;
import p599wz.C37709d0;
import p599wz.C37712e0;
import p599wz.C37715f0;
import p599wz.C37718g0;
import p599wz.C37719g1;
import p599wz.C37724i0;
import p599wz.C37727j0;
import p599wz.C37730k0;
import p599wz.C37733l0;
import p599wz.C37735m;
import p599wz.C37736m0;
import p599wz.C37738n;
import p599wz.C37741o;
import p599wz.C37742o0;
import p599wz.C37744p;
import p599wz.C37745p0;
import p599wz.C37754s0;
import p599wz.C37757t0;
import p599wz.EnumC37705c;
import p599wz.EnumC37706c0;
import p599wz.EnumC37721h0;
import p599wz.EnumC37732l;
import p599wz.EnumC37763v0;
import p599wz.InterfaceC37711e;
import p599wz.InterfaceC37739n0;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35459c0;
import v00.InterfaceC35471i0;
import y00.AbstractC38794c0;
import y00.C38783b;
import y00.C38784b0;
import y00.C38793c;
import y00.C38803d;
import y00.C38809d5;
import y00.C38813e;
import y00.C38823f;
import y00.C38843h;
import y00.C38864j0;
import y00.C38901n;
import y00.C38915o4;
import y00.EnumC38773a;
import y00.EnumC38852h8;
import y00.EnumC38853i;
import y00.EnumC38863j;
import y00.EnumC38922p2;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: wx.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C37677f implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f161429a;

    public /* synthetic */ C37677f(int i13) {
        this.f161429a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        switch (this.f161429a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37678g(parcel.readString(), parcel.createStringArrayList());
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C37702b.f161559w;
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37708d(parcel.readInt() == 0 ? null : C11433l.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EnumC37705c.valueOf(parcel.readString()) : null);
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37735m(EnumC37732l.valueOf(parcel.readString()), (InterfaceC37711e) parcel.readParcelable(C37735m.class.getClassLoader()));
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                InterfaceC37711e interfaceC37711e = (InterfaceC37711e) parcel.readParcelable(C37738n.class.getClassLoader());
                AbstractC37760u0 abstractC37760u0 = (AbstractC37760u0) parcel.readParcelable(C37738n.class.getClassLoader());
                C38864j0 c38864j0 = (C38864j0) parcel.readParcelable(C37738n.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new C37738n(interfaceC37711e, abstractC37760u0, c38864j0, boolValueOf);
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37741o((Throwable) parcel.readSerializable(), (InterfaceC37711e) parcel.readParcelable(C37741o.class.getClassLoader()));
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37744p((C38915o4) parcel.readParcelable(C37744p.class.getClassLoader()));
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37700a0(AbstractC17918w0.m51515c(parcel.readInt()), AbstractC17918w0.m51515c(parcel.readInt()), AbstractC17918w0.m51515c(parcel.readInt()));
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                Parcelable.Creator<C37700a0> creator = C37700a0.CREATOR;
                return new C37709d0(creator.createFromParcel(parcel), creator.createFromParcel(parcel), EnumC37706c0.CREATOR.createFromParcel(parcel), C37703b0.CREATOR.createFromParcel(parcel));
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37703b0(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                return EnumC37706c0.valueOf(parcel.readString());
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37712e0(parcel.readInt() != 0, parcel.createStringArrayList());
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) parcel.readParcelable(C37718g0.class.getClassLoader());
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                C37715f0 c37715f0CreateFromParcel = C37715f0.CREATOR.createFromParcel(parcel);
                C17928b c17928bCreateFromParcel = parcel.readInt() == 0 ? null : C17928b.CREATOR.createFromParcel(parcel);
                boolean z4 = false;
                int i13 = 0;
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                int i14 = parcel.readInt();
                boolean z13 = true;
                LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
                while (i13 != i14) {
                    linkedHashMap.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0 ? z13 : false));
                    i13++;
                    z13 = true;
                }
                return new C37718g0(interfaceC38802c8, string, string2, string3, string4, c37715f0CreateFromParcel, c17928bCreateFromParcel, z4, linkedHashMap, parcel.readInt() == 0 ? null : C37712e0.CREATOR.createFromParcel(parcel), (InterfaceC35320a) parcel.readParcelable(C37718g0.class.getClassLoader()), (InterfaceC35322b) parcel.readParcelable(C37718g0.class.getClassLoader()), parcel.readInt() == 0 ? null : EnumC14023b.valueOf(parcel.readString()), C16689l1.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C16671i1.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : EnumC38922p2.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : C37709d0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (InterfaceC35471i0) parcel.readParcelable(C37718g0.class.getClassLoader()), parcel.readInt() != 0, parcel.createStringArrayList(), (C38901n) parcel.readParcelable(C37718g0.class.getClassLoader()));
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37715f0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37724i0(parcel.readInt() != 0);
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37727j0(parcel.readString());
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37730k0((AbstractC37760u0) parcel.readParcelable(C37730k0.class.getClassLoader()));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C37733l0.f161684w;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37736m0((AbstractC38794c0) parcel.readParcelable(C37736m0.class.getClassLoader()), parcel.readInt() == 0 ? null : EnumC37763v0.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37742o0((AbstractC38794c0) parcel.readParcelable(C37742o0.class.getClassLoader()), (C38809d5) parcel.readParcelable(C37742o0.class.getClassLoader()), (C38809d5) parcel.readParcelable(C37742o0.class.getClassLoader()));
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37745p0((C38784b0) parcel.readParcelable(C37745p0.class.getClassLoader()), (C38809d5) parcel.readParcelable(C37745p0.class.getClassLoader()), (C38915o4) parcel.readParcelable(C37745p0.class.getClassLoader()));
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37754s0((AbstractC38794c0) parcel.readParcelable(C37754s0.class.getClassLoader()), parcel.readString(), parcel.readString());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37757t0((AbstractC37748q0) parcel.readParcelable(C37757t0.class.getClassLoader()), parcel.readString(), parcel.readString());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37719g1((C37718g0) parcel.readParcelable(C37719g1.class.getClassLoader()), (C35459c0) parcel.readParcelable(C37719g1.class.getClassLoader()), EnumC2228d.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), EnumC37721h0.valueOf(parcel.readString()), (C37708d) parcel.readParcelable(C37719g1.class.getClassLoader()), parcel.readString(), (InterfaceC37739n0) parcel.readParcelable(C37719g1.class.getClassLoader()));
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38783b(C38823f.CREATOR.createFromParcel(parcel), parcel.readInt(), EnumC38773a.valueOf(parcel.readString()), EnumC38863j.valueOf(parcel.readString()), parcel.readString());
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38793c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 26:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38803d(parcel.readString());
            case 27:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38813e(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BankAccount$Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? BankAccount$Status.valueOf(parcel.readString()) : null);
            case 28:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38823f(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38843h(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), EnumC38853i.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : EnumC38863j.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? EnumC38852h8.valueOf(parcel.readString()) : null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f161429a) {
            case 0:
                return new C37678g[i13];
            case 1:
                return new C37702b[i13];
            case 2:
                return new C37708d[i13];
            case 3:
                return new C37735m[i13];
            case 4:
                return new C37738n[i13];
            case 5:
                return new C37741o[i13];
            case 6:
                return new C37744p[i13];
            case 7:
                return new C37700a0[i13];
            case 8:
                return new C37709d0[i13];
            case 9:
                return new C37703b0[i13];
            case 10:
                return new EnumC37706c0[i13];
            case 11:
                return new C37712e0[i13];
            case 12:
                return new C37718g0[i13];
            case 13:
                return new C37715f0[i13];
            case 14:
                return new C37724i0[i13];
            case 15:
                return new C37727j0[i13];
            case 16:
                return new C37730k0[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C37733l0[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C37736m0[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C37742o0[i13];
            case 20:
                return new C37745p0[i13];
            case 21:
                return new C37754s0[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C37757t0[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C37719g1[i13];
            case 24:
                return new C38783b[i13];
            case 25:
                return new C38793c[i13];
            case 26:
                return new C38803d[i13];
            case 27:
                return new C38813e[i13];
            case 28:
                return new C38823f[i13];
            default:
                return new C38843h[i13];
        }
    }
}
