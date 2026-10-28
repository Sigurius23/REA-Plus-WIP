package p537ux;

import a30.InterfaceC0310m0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import com.stripe.android.core.exception.StripeException;
import f20.EnumC14023b;
import h20.C16665h1;
import h20.C16671i1;
import h20.C16689l1;
import h20.C16744u2;
import h20.C16756w2;
import h20.EnumC16673i3;
import i20.C17928b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m30.C24992h;
import my.EnumC26028b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29810c;
import v00.AbstractC35455a0;
import v00.C35459c0;
import v00.C35463e0;
import v00.C35465f0;
import v00.C35472j;
import v00.C35474k;
import v00.C35476l;
import v00.C35480n;
import v00.C35482o;
import v00.C35484p;
import v00.C35486q;
import v00.C35488r;
import v00.C35490s;
import v00.C35493u;
import v00.C35494v;
import v00.C35495w;
import v00.C35496x;
import v00.C35498z;
import v00.EnumC35491s0;
import v00.EnumC35492t;
import v00.InterfaceC35471i0;
import w30.InterfaceC36786c;
import y00.C38797c3;
import y00.C38840g6;
import y00.C38887l3;
import y00.C38901n;
import y00.C38939r1;
import y00.EnumC38922p2;
import y00.EnumC38941r3;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: ux.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C35332g implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150534a;

    public /* synthetic */ C35332g(int i13) {
        this.f150534a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Long lValueOf;
        EnumC35346n enumC35346nValueOf;
        switch (this.f150534a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C35334h.f150537w;
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35338j(parcel.readInt() != 0, EnumC35336i.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35340k(parcel.readString(), C35344m.CREATOR.createFromParcel(parcel));
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35344m(EnumC35342l.valueOf(parcel.readString()));
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                EnumC35348o enumC35348oValueOf = EnumC35348o.valueOf(parcel.readString());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    lValueOf = null;
                    enumC35346nValueOf = null;
                } else {
                    lValueOf = Long.valueOf(parcel.readLong());
                    enumC35346nValueOf = null;
                }
                String string4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    enumC35346nValueOf = EnumC35346n.valueOf(parcel.readString());
                }
                return new C35350p(string, enumC35348oValueOf, string2, string3, lValueOf, string4, enumC35346nValueOf);
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35354r(parcel.readInt(), C35356s.CREATOR.createFromParcel(parcel));
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35356s((C24992h) parcel.readParcelable(C35356s.class.getClassLoader()));
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35363y(parcel.readString(), parcel.readString());
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35364z(C38887l3.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                Serializable serializable = parcel.readSerializable();
                AbstractC22676k.m65748h(serializable, "null cannot be cast to non-null type com.stripe.android.core.exception.StripeException");
                return new C35321a0((StripeException) serializable, parcel.readInt());
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35323b0(C38887l3.CREATOR.createFromParcel(parcel), parcel.readString());
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35325c0(parcel.readString(), C38840g6.CREATOR.createFromParcel(parcel));
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35335h0(C38840g6.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(C35480n.class.getClassLoader()));
                }
                return new C35480n(linkedHashMap);
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readParcelable(C35472j.class.getClassLoader()));
                }
                return new C35472j(linkedHashMap2);
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35474k(parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35476l(parcel.readString());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35484p(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, C35482o.CREATOR.createFromParcel(parcel));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35482o(EnumC26028b.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35486q(parcel.readString(), parcel.readString(), parcel.readString(), (InterfaceC41211c) parcel.readParcelable(C35486q.class.getClassLoader()), parcel.readInt() != 0);
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35488r(parcel.readString());
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C35490s.f151071w;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35493u(EnumC35492t.valueOf(parcel.readString()));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35494v(C16744u2.CREATOR.createFromParcel(parcel));
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35495w(C16744u2.CREATOR.createFromParcel(parcel));
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35496x(C16744u2.CREATOR.createFromParcel(parcel));
            case 26:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35498z(parcel.readString());
            case 27:
                AbstractC22676k.m65750j(parcel, "parcel");
                InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) parcel.readParcelable(C35459c0.class.getClassLoader());
                C16689l1 c16689l1CreateFromParcel = C16689l1.CREATOR.createFromParcel(parcel);
                boolean z4 = true;
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0 ? z4 : false;
                int i17 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList.add(EnumC35491s0.valueOf(parcel.readString()));
                }
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                InterfaceC36786c interfaceC36786c = (InterfaceC36786c) parcel.readParcelable(C35459c0.class.getClassLoader());
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                C16671i1 c16671i1CreateFromParcel = parcel.readInt() == 0 ? null : C16671i1.CREATOR.createFromParcel(parcel);
                C17928b c17928b = (C17928b) parcel.readParcelable(C35459c0.class.getClassLoader());
                int i19 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i19);
                for (int i24 = 0; i24 != i19; i24++) {
                    arrayList2.add(parcel.readParcelable(C35459c0.class.getClassLoader()));
                }
                int i25 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i25);
                for (int i26 = 0; i26 != i25; i26++) {
                    arrayList3.add(parcel.readParcelable(C35459c0.class.getClassLoader()));
                }
                int i27 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i27);
                int i28 = 0;
                while (i28 != i27) {
                    arrayList4.add(parcel.readParcelable(C35459c0.class.getClassLoader()));
                    i28++;
                    i27 = i27;
                }
                C35484p c35484p = (C35484p) parcel.readParcelable(C35459c0.class.getClassLoader());
                boolean z15 = parcel.readInt() != 0;
                C16756w2 c16756w2CreateFromParcel = C16756w2.CREATOR.createFromParcel(parcel);
                InterfaceC35471i0 interfaceC35471i0 = (InterfaceC35471i0) parcel.readParcelable(C35459c0.class.getClassLoader());
                EnumC38922p2 enumC38922p2ValueOf = parcel.readInt() == 0 ? null : EnumC38922p2.valueOf(parcel.readString());
                InterfaceC0310m0 interfaceC0310m0 = (InterfaceC0310m0) parcel.readParcelable(C35459c0.class.getClassLoader());
                C29810c c29810c = (C29810c) parcel.readParcelable(C35459c0.class.getClassLoader());
                EnumC14023b enumC14023bValueOf = parcel.readInt() != 0 ? EnumC14023b.valueOf(parcel.readString()) : null;
                InterfaceC35320a interfaceC35320a = (InterfaceC35320a) parcel.readParcelable(C35459c0.class.getClassLoader());
                InterfaceC35322b interfaceC35322b = (InterfaceC35322b) parcel.readParcelable(C35459c0.class.getClassLoader());
                int i29 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i29);
                int i34 = 0;
                while (i34 != i29) {
                    linkedHashMap3.put(parcel.readParcelable(C35459c0.class.getClassLoader()), EnumC16673i3.valueOf(parcel.readString()));
                    i34++;
                    i29 = i29;
                }
                return new C35459c0(interfaceC38802c8, c16689l1CreateFromParcel, z4, z13, z14, arrayList, arrayListCreateStringArrayList, interfaceC36786c, string5, string6, c16671i1CreateFromParcel, c17928b, arrayList2, arrayList3, arrayList4, c35484p, z15, c16756w2CreateFromParcel, interfaceC35471i0, enumC38922p2ValueOf, interfaceC0310m0, c29810c, enumC14023bValueOf, interfaceC35320a, interfaceC35322b, linkedHashMap3, parcel.readInt() != 0, (C38797c3) parcel.readParcelable(C35459c0.class.getClassLoader()), parcel.readInt() != 0, (C38901n) parcel.readParcelable(C35459c0.class.getClassLoader()), parcel.readInt() != 0, C16665h1.CREATOR.createFromParcel(parcel), parcel.readString(), (AbstractC35455a0) parcel.readParcelable(C35459c0.class.getClassLoader()), (C35480n) parcel.readParcelable(C35459c0.class.getClassLoader()), (C38939r1) parcel.readParcelable(C35459c0.class.getClassLoader()), parcel.readInt() != 0);
            case 28:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35463e0((EnumC38941r3) parcel.readParcelable(C35463e0.class.getClassLoader()));
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C35465f0.f151003w;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f150534a) {
            case 0:
                return new C35334h[i13];
            case 1:
                return new C35338j[i13];
            case 2:
                return new C35340k[i13];
            case 3:
                return new C35344m[i13];
            case 4:
                return new C35350p[i13];
            case 5:
                return new C35354r[i13];
            case 6:
                return new C35356s[i13];
            case 7:
                return new C35363y[i13];
            case 8:
                return new C35364z[i13];
            case 9:
                return new C35321a0[i13];
            case 10:
                return new C35323b0[i13];
            case 11:
                return new C35325c0[i13];
            case 12:
                return new C35335h0[i13];
            case 13:
                return new C35480n[i13];
            case 14:
                return new C35472j[i13];
            case 15:
                return new C35474k[i13];
            case 16:
                return new C35476l[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C35484p[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C35482o[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C35486q[i13];
            case 20:
                return new C35488r[i13];
            case 21:
                return new C35490s[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C35493u[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C35494v[i13];
            case 24:
                return new C35495w[i13];
            case 25:
                return new C35496x[i13];
            case 26:
                return new C35498z[i13];
            case 27:
                return new C35459c0[i13];
            case 28:
                return new C35463e0[i13];
            default:
                return new C35465f0[i13];
        }
    }
}
