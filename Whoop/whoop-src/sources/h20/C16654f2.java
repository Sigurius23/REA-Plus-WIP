package h20;

import a30.AbstractC0326t0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import nh3.AbstractC26725a;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: h20.f2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16654f2 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64034a;

    public /* synthetic */ C16654f2(int i13) {
        this.f64034a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f64034a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16666h2(EnumC16660g2.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), EnumC16648e2.valueOf(parcel.readString()), parcel.createStringArrayList());
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16678j2(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16744u2((AbstractC16726r2) parcel.readParcelable(C16744u2.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (InterfaceC16702n2) parcel.readParcelable(C16744u2.class.getClassLoader()));
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C16690l2.f64193w;
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16696m2(parcel.readInt() == 0 ? null : C16732s2.CREATOR.createFromParcel(parcel));
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16714p2(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : EnumC16738t2.valueOf(parcel.readString()), EnumC16684k2.valueOf(parcel.readString()), parcel.readInt() != 0 ? C16708o2.CREATOR.createFromParcel(parcel) : null);
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    linkedHashMap.put(parcel.readParcelable(C16708o2.class.getClassLoader()), EnumC16738t2.valueOf(parcel.readString()));
                }
                return new C16708o2(linkedHashMap);
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16720q2(parcel.readString(), EnumC16738t2.valueOf(parcel.readString()));
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16732s2(parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                EnumC16750v2 enumC16750v2ValueOf = EnumC16750v2.valueOf(parcel.readString());
                int iM106646e = 0;
                boolean z4 = true;
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0 ? z4 : false;
                int i15 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i15);
                while (iM106646e != i15) {
                    iM106646e = AbstractC33745d.m106646e(parcel, linkedHashSet, iM106646e, z4);
                }
                return new C16756w2(enumC16750v2ValueOf, z4, z13, z14, linkedHashSet);
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                Parcelable.Creator<C16774z2> creator = C16774z2.CREATOR;
                return new C16768y2(creator.createFromParcel(parcel), creator.createFromParcel(parcel), C16625a3.CREATOR.createFromParcel(parcel), C16631b3.CREATOR.createFromParcel(parcel));
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16774z2(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16625a3(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16631b3(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16637c3(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                int iM79498b = 0;
                boolean z15 = true;
                if (parcel.readInt() == 0) {
                    z15 = false;
                }
                boolean z16 = parcel.readInt() != 0;
                boolean z17 = parcel.readInt() != 0 ? z15 : false;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i16 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i16);
                int iM79498b2 = 0;
                while (iM79498b2 != i16) {
                    iM79498b2 = AbstractC26725a.m79498b(C16649e3.CREATOR, parcel, arrayList, iM79498b2, z15);
                }
                int i17 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i17);
                while (iM79498b != i17) {
                    iM79498b = AbstractC26725a.m79498b(C16655f3.CREATOR, parcel, arrayList2, iM79498b, z15);
                }
                return new C16661g3(string, z15, z16, z17, arrayListCreateStringArrayList, arrayList, arrayList2);
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16649e3(parcel.readString(), parcel.readInt());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16655f3(parcel.readString(), parcel.readInt(), parcel.readString(), (InterfaceC16643d3) parcel.readParcelable(C16655f3.class.getClassLoader()));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16667h3(parcel.readFloat());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16691l3(parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), C16679j3.CREATOR.createFromParcel(parcel));
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16679j3(parcel.readInt() == 0 ? null : C16685k3.CREATOR.createFromParcel(parcel));
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16685k3(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16721q3(parcel.readInt() != 0, C16703n3.CREATOR.createFromParcel(parcel), C16707o1.CREATOR.createFromParcel(parcel));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i18 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i18);
                for (int i19 = 0; i19 != i18; i19++) {
                    linkedHashMap2.put(EnumC16709o3.valueOf(parcel.readString()), EnumC16697m3.valueOf(parcel.readString()));
                }
                int i24 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i24);
                for (int i25 = 0; i25 != i24; i25++) {
                    linkedHashMap3.put(EnumC16709o3.valueOf(parcel.readString()), EnumC16715p3.valueOf(parcel.readString()));
                }
                return new C16703n3(linkedHashMap2, linkedHashMap3);
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16757w3((AbstractC0326t0) parcel.readParcelable(C16757w3.class.getClassLoader()), (C16761x1) parcel.readParcelable(C16757w3.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16763x3((AbstractC16632b4) parcel.readParcelable(C16763x3.class.getClassLoader()));
            case 26:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16769y3(parcel.readInt() != 0);
            case 27:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16775z3(parcel.readInt() != 0);
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16626a4((Throwable) parcel.readSerializable());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f64034a) {
            case 0:
                return new C16666h2[i13];
            case 1:
                return new C16678j2[i13];
            case 2:
                return new C16744u2[i13];
            case 3:
                return new C16690l2[i13];
            case 4:
                return new C16696m2[i13];
            case 5:
                return new C16714p2[i13];
            case 6:
                return new C16708o2[i13];
            case 7:
                return new C16720q2[i13];
            case 8:
                return new C16732s2[i13];
            case 9:
                return new C16756w2[i13];
            case 10:
                return new C16768y2[i13];
            case 11:
                return new C16774z2[i13];
            case 12:
                return new C16625a3[i13];
            case 13:
                return new C16631b3[i13];
            case 14:
                return new C16637c3[i13];
            case 15:
                return new C16661g3[i13];
            case 16:
                return new C16649e3[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C16655f3[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C16667h3[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C16691l3[i13];
            case 20:
                return new C16679j3[i13];
            case 21:
                return new C16685k3[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C16721q3[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C16703n3[i13];
            case 24:
                return new C16757w3[i13];
            case 25:
                return new C16763x3[i13];
            case 26:
                return new C16769y3[i13];
            case 27:
                return new C16775z3[i13];
            default:
                return new C16626a4[i13];
        }
    }
}
