package y00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import com.stripe.android.model.DisplayablePaymentDetails;
import com.stripe.android.model.LinkAuthIntent;
import com.stripe.android.model.StripeIntent$Usage;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import nh3.AbstractC26725a;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y00.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38992x0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167839a;

    public /* synthetic */ C38992x0(int i13) {
        this.f167839a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC38941r3 enumC38941r3;
        boolean z4;
        switch (this.f167839a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39001y0(parcel.readString(), StripeIntent$Usage.valueOf(parcel.readString()));
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new DisplayablePaymentDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38785b1(parcel.readInt() != 0, parcel.createStringArrayList());
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                C38957t1 c38957t1CreateFromParcel = parcel.readInt() == 0 ? null : C38957t1.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                String string2 = parcel.readString();
                InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) parcel.readParcelable(C38966u1.class.getClassLoader());
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
                int i14 = 0;
                while (true) {
                    boolean z13 = true;
                    if (i14 == i13) {
                        C38939r1 c38939r1CreateFromParcel = parcel.readInt() == 0 ? null : C38939r1.CREATOR.createFromParcel(parcel);
                        C38921p1 c38921p1CreateFromParcel = parcel.readInt() == 0 ? null : C38921p1.CREATOR.createFromParcel(parcel);
                        String string3 = parcel.readString();
                        String string4 = parcel.readString();
                        C38785b1 c38785b1CreateFromParcel = parcel.readInt() == 0 ? null : C38785b1.CREATOR.createFromParcel(parcel);
                        boolean z14 = parcel.readInt() != 0;
                        Throwable th3 = (Throwable) parcel.readSerializable();
                        int i15 = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i15);
                        for (int i16 = 0; i16 != i15; i16++) {
                            arrayList.add(parcel.readParcelable(C38966u1.class.getClassLoader()));
                        }
                        return new C38966u1(c38957t1CreateFromParcel, string, string2, interfaceC38802c8, arrayListCreateStringArrayList, linkedHashMap, c38939r1CreateFromParcel, c38921p1CreateFromParcel, string3, string4, c38785b1CreateFromParcel, z14, th3, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : C38797c3.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
                    }
                    EnumC38948s1 enumC38948s1ValueOf = EnumC38948s1.valueOf(parcel.readString());
                    if (parcel.readInt() == 0) {
                        z13 = false;
                    }
                    linkedHashMap.put(enumC38948s1ValueOf, Boolean.valueOf(z13));
                    i14++;
                }
                break;
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38795c1(parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38805d1(parcel.readString(), parcel.readString());
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38903n1((InterfaceC38875k1) parcel.readParcelable(C38903n1.class.getClassLoader()), (InterfaceC38845h1) parcel.readParcelable(C38903n1.class.getClassLoader()));
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C38825f1.f167082w;
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38835g1(EnumC38885l1.valueOf(parcel.readString()), EnumC38894m1.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C38855i1.f167268w;
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                boolean z15 = false;
                if (parcel.readInt() != 0) {
                    z15 = true;
                }
                EnumC38885l1 enumC38885l1ValueOf = EnumC38885l1.valueOf(parcel.readString());
                EnumC38894m1 enumC38894m1ValueOf = EnumC38894m1.valueOf(parcel.readString());
                EnumC38941r3 enumC38941r3CreateFromParcel = parcel.readInt() == 0 ? null : EnumC38941r3.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z4 = true;
                    enumC38941r3 = enumC38941r3CreateFromParcel;
                } else {
                    enumC38941r3 = enumC38941r3CreateFromParcel;
                    z4 = false;
                }
                return new C38865j1(z15, enumC38885l1ValueOf, enumC38894m1ValueOf, enumC38941r3, z4);
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i17 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i17);
                int iM79498b = 0;
                while (iM79498b != i17) {
                    iM79498b = AbstractC26725a.m79498b(C38915o4.CREATOR, parcel, arrayList2, iM79498b, 1);
                }
                return new C38921p1(arrayList2, parcel.readString(), C38912o1.CREATOR.createFromParcel(parcel));
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38912o1(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), C38903n1.CREATOR.createFromParcel(parcel));
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string5 = parcel.readString();
                int i18 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i18);
                for (int i19 = 0; i19 != i18; i19++) {
                    linkedHashMap2.put(EnumC38930q1.valueOf(parcel.readString()), parcel.readString());
                }
                return new C38939r1(string5, linkedHashMap2);
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                boolean z16 = true;
                if (parcel.readInt() == 0) {
                    z16 = false;
                }
                EnumC38922p2 enumC38922p2ValueOf = parcel.readInt() == 0 ? null : EnumC38922p2.valueOf(parcel.readString());
                int i24 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i24);
                for (int i25 = 0; i25 != i24; i25++) {
                    linkedHashMap3.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                }
                return new C38957t1(arrayListCreateStringArrayList2, z16, enumC38922p2ValueOf, linkedHashMap3, parcel.readInt() != 0 ? z16 : false, (C38904n2) parcel.readParcelable(C38957t1.class.getClassLoader()), parcel.readInt() != 0 ? z16 : false, parcel.readInt() != 0 ? z16 : false, parcel.readInt() != 0 ? z16 : false, parcel.readInt() != 0 ? z16 : false, parcel.readInt() != 0 ? z16 : false, parcel.readInt() != 0 ? z16 : false, parcel.readInt() != 0 ? z16 : false, parcel.createStringArrayList());
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38984w1(parcel.readString(), C38775a1.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C39011z1.CREATOR.createFromParcel(parcel), C38993x1.CREATOR.createFromParcel(parcel), parcel.readString());
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i26 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i26);
                int iM106646e = 0;
                while (iM106646e != i26) {
                    iM106646e = AbstractC33745d.m106646e(parcel, linkedHashSet, iM106646e, 1);
                }
                return new C38993x1(linkedHashSet);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39002y1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), C38993x1.CREATOR.createFromParcel(parcel), parcel.readString());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39011z1(parcel.readString(), parcel.readString());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38776a2(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), C38993x1.CREATOR.createFromParcel(parcel), parcel.readString());
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38826f2(parcel.readString(), parcel.readString());
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38836g2(parcel.readString());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38846h2(parcel.readString());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38856i2(parcel.readString());
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38876k2(parcel.readString(), parcel.readString());
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new LinkAuthIntent(EnumC38886l2.valueOf(parcel.readString()));
            case 26:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38904n2(C38895m2.CREATOR.createFromParcel(parcel), parcel.readString());
            case 27:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38895m2(parcel.readString());
            case 28:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38931q2(parcel.readString(), parcel.readString());
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38940r2(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), EnumC38853i.valueOf(parcel.readString()), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f167839a) {
            case 0:
                return new C39001y0[i13];
            case 1:
                return new DisplayablePaymentDetails[i13];
            case 2:
                return new C38785b1[i13];
            case 3:
                return new C38966u1[i13];
            case 4:
                return new C38795c1[i13];
            case 5:
                return new C38805d1[i13];
            case 6:
                return new C38903n1[i13];
            case 7:
                return new C38825f1[i13];
            case 8:
                return new C38835g1[i13];
            case 9:
                return new C38855i1[i13];
            case 10:
                return new C38865j1[i13];
            case 11:
                return new C38921p1[i13];
            case 12:
                return new C38912o1[i13];
            case 13:
                return new C38939r1[i13];
            case 14:
                return new C38957t1[i13];
            case 15:
                return new C38984w1[i13];
            case 16:
                return new C38993x1[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C39002y1[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C39011z1[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C38776a2[i13];
            case 20:
                return new C38826f2[i13];
            case 21:
                return new C38836g2[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C38846h2[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C38856i2[i13];
            case 24:
                return new C38876k2[i13];
            case 25:
                return new LinkAuthIntent[i13];
            case 26:
                return new C38904n2[i13];
            case 27:
                return new C38895m2[i13];
            case 28:
                return new C38931q2[i13];
            default:
                return new C38940r2[i13];
        }
    }
}
