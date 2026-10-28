package y00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import com.stripe.android.model.Source$Status;
import com.stripe.android.model.Source$Usage;
import com.stripe.android.model.StripeIntent$Status;
import com.stripe.android.model.StripeIntent$Usage;
import java.util.ArrayList;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import m83.C25272z;
import nh3.AbstractC26725a;
import org.json.JSONObject;
import p474s.AbstractC32004s;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y00.r5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38943r5 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167638a;

    public /* synthetic */ C38943r5(int i13) {
        this.f167638a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap2;
        switch (this.f167638a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38952s5(parcel.readString(), parcel.readInt() == 0 ? null : EnumC38910o.valueOf(parcel.readString()));
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38961t5(parcel.readInt() == 0 ? null : EnumC38910o.valueOf(parcel.readString()));
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                C38988w5 c38988w5CreateFromParcel = parcel.readInt() == 0 ? null : C38988w5.CREATOR.createFromParcel(parcel);
                C38977v3 c38977v3CreateFromParcel = parcel.readInt() == 0 ? null : C38977v3.CREATOR.createFromParcel(parcel);
                int i13 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i13);
                int iM106646e = 0;
                while (iM106646e != i13) {
                    iM106646e = AbstractC33745d.m106646e(parcel, linkedHashSet, iM106646e, 1);
                }
                return new C38997x5(numValueOf, numValueOf2, c38988w5CreateFromParcel, c38977v3CreateFromParcel, linkedHashSet, parcel.readInt() != 0 ? EnumC38941r3.CREATOR.createFromParcel(parcel) : null);
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38988w5(parcel.readString());
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iM79498b = 0;
                while (iM79498b != i14) {
                    iM79498b = AbstractC26725a.m79498b(C38915o4.CREATOR, parcel, arrayList2, iM79498b, 1);
                }
                return new C39015z5(arrayList2);
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38780a6(parcel.readString(), parcel.readInt() == 0 ? null : C38803d.CREATOR.createFromParcel(parcel));
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38790b6(parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38840g6(parcel.readString(), parcel.readInt() == 0 ? null : EnumC38800c6.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : C38915o4.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : StripeIntent$Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent$Usage.valueOf(parcel.readString()), parcel.readInt() != 0 ? C38830f6.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), (AbstractC38792b8) parcel.readParcelable(C38840g6.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38830f6(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C38915o4.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EnumC38820e6.valueOf(parcel.readString()) : null);
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38850h6(parcel.readString(), parcel.readString());
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38860i6(parcel.readInt() == 0 ? null : C38793c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38870j6(parcel.readString(), parcel.readString(), parcel.readLong(), (Currency) parcel.readSerializable(), parcel.readString());
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String string2 = parcel.readString();
                Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String string3 = parcel.readString();
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                C38890l6 c38890l6CreateFromParcel = parcel.readInt() == 0 ? null : C38890l6.CREATOR.createFromParcel(parcel);
                Source$Status source$StatusValueOf = parcel.readInt() == 0 ? null : Source$Status.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i15 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(i15);
                    for (int i16 = 0; i16 != i15; i16++) {
                        linkedHashMap3.put(parcel.readString(), parcel.readValue(C38899m6.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap3;
                }
                return new C38899m6(string, lValueOf, string2, lValueOf2, string3, boolValueOf, c38890l6CreateFromParcel, source$StatusValueOf, linkedHashMap, (C39007y6) parcel.readParcelable(C38899m6.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Source$Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : C38935q6.CREATOR.createFromParcel(parcel), parcel.readString());
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38890l6(parcel.readInt() == 0 ? null : C38793c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? C38793c.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i17 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i17);
                int iM79498b2 = 0;
                while (iM79498b2 != i17) {
                    iM79498b2 = AbstractC26725a.m79498b(C38917o6.CREATOR, parcel, arrayList3, iM79498b2, 1);
                }
                return new C38935q6(numValueOf3, string4, string5, arrayList3, parcel.readInt() != 0 ? C38926p6.CREATOR.createFromParcel(parcel) : null);
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38917o6(EnumC38908n6.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38926p6(parcel.readInt() == 0 ? null : C38793c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i18 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i18);
                int iM79498b3 = 0;
                while (iM79498b3 != i18) {
                    iM79498b3 = AbstractC26725a.m79498b(C38953s6.CREATOR, parcel, arrayList4, iM79498b3, 1);
                }
                return new C38971u6(arrayList4, parcel.readInt() == 0 ? null : C38962t6.CREATOR.createFromParcel(parcel));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38953s6(parcel.readInt() == 0 ? null : EnumC38944r6.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38962t6(C38793c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string6 = parcel.readString();
                Map mapM99544m = AbstractC32004s.m99544m(string6 != null ? new JSONObject(string6) : null);
                if (mapM99544m == null) {
                    mapM99544m = C25272z.f99163w;
                }
                return new C38980v6(mapM99544m);
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string7 = parcel.readString();
                if (parcel.readParcelable(C38998x6.class.getClassLoader()) != null) {
                    throw new ClassCastException();
                }
                LinkedHashMap linkedHashMap4 = null;
                Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String string8 = parcel.readString();
                C38989w6 c38989w6CreateFromParcel = parcel.readInt() == 0 ? null : C38989w6.CREATOR.createFromParcel(parcel);
                Source$Usage source$UsageValueOf = parcel.readInt() == 0 ? null : Source$Usage.valueOf(parcel.readString());
                C38971u6 c38971u6CreateFromParcel = parcel.readInt() == 0 ? null : C38971u6.CREATOR.createFromParcel(parcel);
                String string9 = parcel.readString();
                int iM106646e2 = 0;
                if (parcel.readInt() != 0) {
                    int i19 = parcel.readInt();
                    linkedHashMap4 = new LinkedHashMap(i19);
                    for (int i24 = 0; i24 != i19; i24++) {
                        linkedHashMap4.put(parcel.readString(), parcel.readString());
                    }
                }
                C38980v6 c38980v6CreateFromParcel = C38980v6.CREATOR.createFromParcel(parcel);
                int i25 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i25);
                while (iM106646e2 != i25) {
                    iM106646e2 = AbstractC33745d.m106646e(parcel, linkedHashSet2, iM106646e2, 1);
                }
                return new C38998x6(string7, lValueOf3, string8, c38989w6CreateFromParcel, source$UsageValueOf, c38971u6CreateFromParcel, string9, linkedHashMap4, c38980v6CreateFromParcel, linkedHashSet2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                C38793c c38793cCreateFromParcel = parcel.readInt() == 0 ? null : C38793c.CREATOR.createFromParcel(parcel);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                C38989w6 c38989w6 = new C38989w6();
                c38989w6.f167827w = c38793cCreateFromParcel;
                c38989w6.f167828x = string10;
                c38989w6.f167829y = string11;
                c38989w6.f167830z = string12;
                return c38989w6;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39007y6(parcel.readString(), parcel.readString(), EnumC38853i.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : EnumC38863j.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? EnumC38852h8.valueOf(parcel.readString()) : null);
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39016z6(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                String string19 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i26 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(i26);
                    int iM79498b4 = 0;
                    while (iM79498b4 != i26) {
                        iM79498b4 = AbstractC26725a.m79498b(C38791b7.CREATOR, parcel, arrayList5, iM79498b4, 1);
                    }
                    arrayList = arrayList5;
                }
                return new C38781a7(string13, string14, string15, string16, string17, string18, string19, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 26:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38811d7(parcel.readString(), parcel.readInt() == 0 ? null : C38781a7.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? C38801c7.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
            case 27:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string20 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                String string21 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap2 = null;
                } else {
                    int i27 = parcel.readInt();
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(i27);
                    for (int i28 = 0; i28 != i27; i28++) {
                        linkedHashMap5.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap2 = linkedHashMap5;
                }
                return new C38791b7(string20, z4, string21, linkedHashMap2);
            case 28:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38801c7(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38841g7(parcel.readString(), parcel.readString(), parcel.readString(), C38831f7.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f167638a) {
            case 0:
                return new C38952s5[i13];
            case 1:
                return new C38961t5[i13];
            case 2:
                return new C38997x5[i13];
            case 3:
                return new C38988w5[i13];
            case 4:
                return new C39015z5[i13];
            case 5:
                return new C38780a6[i13];
            case 6:
                return new C38790b6[i13];
            case 7:
                return new C38840g6[i13];
            case 8:
                return new C38830f6[i13];
            case 9:
                return new C38850h6[i13];
            case 10:
                return new C38860i6[i13];
            case 11:
                return new C38870j6[i13];
            case 12:
                return new C38899m6[i13];
            case 13:
                return new C38890l6[i13];
            case 14:
                return new C38935q6[i13];
            case 15:
                return new C38917o6[i13];
            case 16:
                return new C38926p6[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C38971u6[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C38953s6[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C38962t6[i13];
            case 20:
                return new C38980v6[i13];
            case 21:
                return new C38998x6[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C38989w6[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C39007y6[i13];
            case 24:
                return new C39016z6[i13];
            case 25:
                return new C38781a7[i13];
            case 26:
                return new C38811d7[i13];
            case 27:
                return new C38791b7[i13];
            case 28:
                return new C38801c7[i13];
            default:
                return new C38841g7[i13];
        }
    }
}
