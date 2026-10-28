package h20;

import a30.C0290f1;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import i20.C17928b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import nh3.AbstractC26725a;
import p599wz.C37708d;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import te0.AbstractC33745d;
import y00.EnumC38853i;

/* JADX INFO: renamed from: h20.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C16699n implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64224a;

    public /* synthetic */ C16699n(int i13) {
        this.f64224a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z4;
        switch (this.f64224a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C16705o.f64232w;
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C16711p.f64242w;
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16717q(parcel.readString());
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                C0290f1 c0290f1CreateFromParcel = C0290f1.CREATOR.createFromParcel(parcel);
                C16761x1 c16761x1CreateFromParcel = C16761x1.CREATOR.createFromParcel(parcel);
                C37708d c37708dCreateFromParcel = C37708d.CREATOR.createFromParcel(parcel);
                int iM106646e = 0;
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                int i13 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i13);
                while (iM106646e != i13) {
                    iM106646e = AbstractC33745d.m106646e(parcel, linkedHashSet, iM106646e, 1);
                }
                return new C16652f0(c0290f1CreateFromParcel, c16761x1CreateFromParcel, c37708dCreateFromParcel, z13, z14, linkedHashSet, parcel.readString());
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                Throwable th3 = (Throwable) parcel.readSerializable();
                AbstractC29840y abstractC29840y = (AbstractC29840y) parcel.readParcelable(C16688l0.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i14 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i14);
                    for (int i15 = 0; i15 != i14; i15++) {
                        arrayList3.add(parcel.readParcelable(C16688l0.class.getClassLoader()));
                    }
                    arrayList = arrayList3;
                }
                return new C16688l0(th3, abstractC29840y, arrayList, C37708d.CREATOR.createFromParcel(parcel));
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                AbstractC29840y abstractC29840y2 = (AbstractC29840y) parcel.readParcelable(C16694m0.class.getClassLoader());
                C37708d c37708dCreateFromParcel2 = C37708d.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i16 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i16);
                    for (int i17 = 0; i17 != i16; i17++) {
                        arrayList4.add(parcel.readParcelable(C16694m0.class.getClassLoader()));
                    }
                    arrayList2 = arrayList4;
                }
                return new C16694m0(abstractC29840y2, c37708dCreateFromParcel2, arrayList2);
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16760x0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                Parcelable.Creator<C16749v1> creator = C16749v1.CREATOR;
                C16749v1 c16749v1CreateFromParcel = creator.createFromParcel(parcel);
                C16749v1 c16749v1CreateFromParcel2 = creator.createFromParcel(parcel);
                C16637c3 c16637c3CreateFromParcel = C16637c3.CREATOR.createFromParcel(parcel);
                C16691l3 c16691l3CreateFromParcel = C16691l3.CREATOR.createFromParcel(parcel);
                C16768y2 c16768y2CreateFromParcel = C16768y2.CREATOR.createFromParcel(parcel);
                C16659g1 c16659g1CreateFromParcel = C16659g1.CREATOR.createFromParcel(parcel);
                Parcelable.Creator<C16678j2> creator2 = C16678j2.CREATOR;
                return new C16665h1(c16749v1CreateFromParcel, c16749v1CreateFromParcel2, c16637c3CreateFromParcel, c16691l3CreateFromParcel, c16768y2CreateFromParcel, c16659g1CreateFromParcel, creator2.createFromParcel(parcel), C16667h3.CREATOR.createFromParcel(parcel), creator2.createFromParcel(parcel), EnumC16672i2.valueOf(parcel.readString()), parcel.readFloat());
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16659g1((AbstractC16653f1) parcel.readParcelable(C16659g1.class.getClassLoader()), parcel.readInt() == 0 ? null : C16678j2.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C16685k3.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? C16685k3.CREATOR.createFromParcel(parcel) : null);
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16766y0(parcel.readInt(), parcel.readInt());
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                float f13 = parcel.readFloat();
                float f14 = parcel.readFloat();
                float f15 = parcel.readFloat();
                boolean z15 = false;
                if (parcel.readInt() != 0) {
                    z15 = true;
                }
                boolean z16 = parcel.readInt() != 0;
                float f16 = parcel.readFloat();
                float f17 = parcel.readFloat();
                float f18 = parcel.readFloat();
                Parcelable.Creator<C16766y0> creator3 = C16766y0.CREATOR;
                return new C16772z0(f13, f14, f15, z15, z16, f16, f17, f18, creator3.createFromParcel(parcel), creator3.createFromParcel(parcel));
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16623a1(parcel.readInt(), parcel.readInt());
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                float f19 = parcel.readFloat();
                float f24 = parcel.readFloat();
                float f25 = parcel.readFloat();
                boolean z17 = false;
                if (parcel.readInt() != 0) {
                    z17 = true;
                    z4 = true;
                } else {
                    z4 = true;
                }
                float f26 = parcel.readFloat();
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                float f27 = parcel.readFloat();
                Parcelable.Creator<C16623a1> creator4 = C16623a1.CREATOR;
                return new C16629b1(f19, f24, f25, z17, f26, z4, f27, creator4.createFromParcel(parcel), creator4.createFromParcel(parcel), parcel.readInt());
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16635c1(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                float f28 = parcel.readFloat();
                float f29 = parcel.readFloat();
                float f34 = parcel.readFloat();
                boolean z18 = false;
                if (parcel.readInt() != 0) {
                    z18 = true;
                }
                boolean z19 = parcel.readInt() != 0;
                float f35 = parcel.readFloat();
                float f36 = parcel.readFloat();
                Parcelable.Creator<C16635c1> creator5 = C16635c1.CREATOR;
                return new C16641d1(f28, f29, f34, z18, z19, f35, f36, creator5.createFromParcel(parcel), creator5.createFromParcel(parcel));
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16647e1(parcel.readFloat(), parcel.readFloat());
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16671i1(parcel.readInt() == 0 ? null : C16760x0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                EnumC16683k1 enumC16683k1ValueOf = EnumC16683k1.valueOf(parcel.readString());
                EnumC16683k1 enumC16683k1ValueOf2 = EnumC16683k1.valueOf(parcel.readString());
                EnumC16683k1 enumC16683k1ValueOf3 = EnumC16683k1.valueOf(parcel.readString());
                EnumC16677j1 enumC16677j1ValueOf = EnumC16677j1.valueOf(parcel.readString());
                int iM106646e2 = 0;
                boolean z24 = parcel.readInt() != 0;
                int i18 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i18);
                while (iM106646e2 != i18) {
                    iM106646e2 = AbstractC33745d.m106646e(parcel, linkedHashSet2, iM106646e2, 1);
                }
                return new C16689l1(enumC16683k1ValueOf, enumC16683k1ValueOf2, enumC16683k1ValueOf3, enumC16677j1ValueOf, z24, linkedHashSet2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16707o1(EnumC16701n1.valueOf(parcel.readString()));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C16713p1.f64245w;
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i19 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i19);
                int iM79498b = 0;
                while (iM79498b != i19) {
                    iM79498b = AbstractC26725a.m79498b(EnumC16725r1.CREATOR, parcel, arrayList5, iM79498b, 1);
                }
                return new C16719q1(arrayList5);
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                return EnumC16725r1.valueOf(parcel.readString());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i24 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i24);
                int iM79498b2 = 0;
                while (iM79498b2 != i24) {
                    iM79498b2 = AbstractC26725a.m79498b(EnumC16725r1.CREATOR, parcel, arrayList6, iM79498b2, 1);
                }
                return new C16731s1(arrayList6);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return EnumC16743u1.valueOf(parcel.readString());
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16749v1(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                C16636c2 c16636c2CreateFromParcel = parcel.readInt() == 0 ? null : C16636c2.CREATOR.createFromParcel(parcel);
                C16666h2 c16666h2CreateFromParcel = parcel.readInt() == 0 ? null : C16666h2.CREATOR.createFromParcel(parcel);
                C16671i1 c16671i1CreateFromParcel = parcel.readInt() == 0 ? null : C16671i1.CREATOR.createFromParcel(parcel);
                C17928b c17928b = (C17928b) parcel.readParcelable(C16761x1.class.getClassLoader());
                boolean z25 = false;
                boolean z26 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z25 = true;
                }
                C16665h1 c16665h1CreateFromParcel = C16665h1.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                C16689l1 c16689l1CreateFromParcel = C16689l1.CREATOR.createFromParcel(parcel);
                int i25 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i25);
                for (int i26 = 0; i26 != i25; i26++) {
                    arrayList7.add(EnumC38853i.valueOf(parcel.readString()));
                }
                boolean z27 = parcel.readInt() != 0;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                EnumC16762x2 enumC16762x2ValueOf = EnumC16762x2.valueOf(parcel.readString());
                AbstractC16737t1 abstractC16737t1 = (AbstractC16737t1) parcel.readParcelable(C16761x1.class.getClassLoader());
                int i27 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i27);
                int iM79498b3 = 0;
                while (iM79498b3 != i27) {
                    iM79498b3 = AbstractC26725a.m79498b(EnumC16743u1.CREATOR, parcel, arrayList8, iM79498b3, 1);
                    i27 = i27;
                    string = string;
                }
                String str = string;
                int i28 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i28);
                int iM79498b4 = 0;
                while (true) {
                    ArrayList arrayList10 = arrayList8;
                    if (iM79498b4 == i28) {
                        C16756w2 c16756w2CreateFromParcel = C16756w2.CREATOR.createFromParcel(parcel);
                        C16721q3 c16721q3CreateFromParcel = C16721q3.CREATOR.createFromParcel(parcel);
                        C16661g3 c16661g3CreateFromParcel = parcel.readInt() == 0 ? null : C16661g3.CREATOR.createFromParcel(parcel);
                        String string3 = parcel.readString();
                        int i29 = parcel.readInt();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(i29);
                        int i34 = 0;
                        while (i34 != i29) {
                            linkedHashMap.put(parcel.readParcelable(C16761x1.class.getClassLoader()), EnumC16673i3.valueOf(parcel.readString()));
                            i34++;
                            i29 = i29;
                        }
                        return new C16761x1(str, c16636c2CreateFromParcel, c16666h2CreateFromParcel, c16671i1CreateFromParcel, c17928b, z26, z25, c16665h1CreateFromParcel, string2, c16689l1CreateFromParcel, arrayList7, z27, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, enumC16762x2ValueOf, abstractC16737t1, arrayList10, arrayList9, c16756w2CreateFromParcel, c16721q3CreateFromParcel, c16661g3CreateFromParcel, string3, linkedHashMap, parcel.readInt() != 0, parcel.readString());
                    }
                    iM79498b4 = AbstractC26725a.m79498b(C16767y1.CREATOR, parcel, arrayList9, iM79498b4, 1);
                    arrayList8 = arrayList10;
                    i28 = i28;
                }
                break;
            case 26:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16767y1(parcel.readString(), (InterfaceC41211c) parcel.readParcelable(C16767y1.class.getClassLoader()), parcel.readInt() != 0);
            case 27:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16773z1(parcel.readString());
            case 28:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16624a2(parcel.readString());
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16636c2(parcel.readString(), parcel.readString(), (InterfaceC16630b2) parcel.readParcelable(C16636c2.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f64224a) {
            case 0:
                return new C16705o[i13];
            case 1:
                return new C16711p[i13];
            case 2:
                return new C16717q[i13];
            case 3:
                return new C16652f0[i13];
            case 4:
                return new C16688l0[i13];
            case 5:
                return new C16694m0[i13];
            case 6:
                return new C16760x0[i13];
            case 7:
                return new C16665h1[i13];
            case 8:
                return new C16659g1[i13];
            case 9:
                return new C16766y0[i13];
            case 10:
                return new C16772z0[i13];
            case 11:
                return new C16623a1[i13];
            case 12:
                return new C16629b1[i13];
            case 13:
                return new C16635c1[i13];
            case 14:
                return new C16641d1[i13];
            case 15:
                return new C16647e1[i13];
            case 16:
                return new C16671i1[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C16689l1[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C16707o1[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C16713p1[i13];
            case 20:
                return new C16719q1[i13];
            case 21:
                return new EnumC16725r1[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C16731s1[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new EnumC16743u1[i13];
            case 24:
                return new C16749v1[i13];
            case 25:
                return new C16761x1[i13];
            case 26:
                return new C16767y1[i13];
            case 27:
                return new C16773z1[i13];
            case 28:
                return new C16624a2[i13];
            default:
                return new C16636c2[i13];
        }
    }
}
