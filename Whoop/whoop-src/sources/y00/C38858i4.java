package y00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y00.i4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38858i4 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167278a;

    public /* synthetic */ C38858i4(int i13) {
        this.f167278a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashSet linkedHashSet;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        switch (this.f167278a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return EnumC38868j4.valueOf(parcel.readString());
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38878k4(parcel.readString(), parcel.createStringArrayList());
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38897m4(parcel.readString());
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                String bsbNumber = parcel.readString();
                String accountNumber = parcel.readString();
                AbstractC22676k.m65750j(bsbNumber, "bsbNumber");
                AbstractC22676k.m65750j(accountNumber, "accountNumber");
                C38924p4 c38924p4 = new C38924p4();
                c38924p4.f167551w = bsbNumber;
                c38924p4.f167552x = accountNumber;
                return c38924p4;
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38933q4(parcel.readString(), parcel.readString());
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i13 = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i13);
                    int iM106646e = 0;
                    while (iM106646e != i13) {
                        iM106646e = AbstractC33745d.m106646e(parcel, linkedHashSet2, iM106646e, 1);
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new C38951s4(string, numValueOf, numValueOf2, string2, string3, linkedHashSet, parcel.readInt() != 0 ? C38942r4.CREATOR.createFromParcel(parcel) : null);
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38942r4(parcel.readString());
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return new C38960t4();
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string4 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                C38951s4 c38951s4CreateFromParcel = parcel.readInt() == 0 ? null : C38951s4.CREATOR.createFromParcel(parcel);
                C38978v4 c38978v4CreateFromParcel = parcel.readInt() == 0 ? null : C38978v4.CREATOR.createFromParcel(parcel);
                C38969u4 c38969u4CreateFromParcel = parcel.readInt() == 0 ? null : C38969u4.CREATOR.createFromParcel(parcel);
                C39005y4 c39005y4CreateFromParcel = parcel.readInt() == 0 ? null : C39005y4.CREATOR.createFromParcel(parcel);
                C38924p4 c38924p4CreateFromParcel = parcel.readInt() == 0 ? null : C38924p4.CREATOR.createFromParcel(parcel);
                C38933q4 c38933q4CreateFromParcel = parcel.readInt() == 0 ? null : C38933q4.CREATOR.createFromParcel(parcel);
                C38799c5 c38799c5CreateFromParcel = parcel.readInt() == 0 ? null : C38799c5.CREATOR.createFromParcel(parcel);
                C38996x4 c38996x4CreateFromParcel = parcel.readInt() == 0 ? null : C38996x4.CREATOR.createFromParcel(parcel);
                C38789b5 c38789b5CreateFromParcel = parcel.readInt() == 0 ? null : C38789b5.CREATOR.createFromParcel(parcel);
                C38987w4 c38987w4CreateFromParcel = parcel.readInt() == 0 ? null : C38987w4.CREATOR.createFromParcel(parcel);
                C38960t4 c38960t4CreateFromParcel = parcel.readInt() == 0 ? null : C38960t4.CREATOR.createFromParcel(parcel);
                C38779a5 c38779a5CreateFromParcel = parcel.readInt() == 0 ? null : C38779a5.CREATOR.createFromParcel(parcel);
                C39014z4 c39014z4CreateFromParcel = parcel.readInt() == 0 ? null : C39014z4.CREATOR.createFromParcel(parcel);
                C38977v3 c38977v3CreateFromParcel = parcel.readInt() == 0 ? null : C38977v3.CREATOR.createFromParcel(parcel);
                EnumC38941r3 enumC38941r3CreateFromParcel = parcel.readInt() == 0 ? null : EnumC38941r3.CREATOR.createFromParcel(parcel);
                C38780a6 c38780a6CreateFromParcel = parcel.readInt() == 0 ? null : C38780a6.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i14 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i14);
                    int i15 = 0;
                    while (i15 != i14) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                        i15++;
                        i14 = i14;
                    }
                }
                int i16 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i16);
                LinkedHashMap linkedHashMap4 = linkedHashMap;
                int iM106646e2 = 0;
                while (iM106646e2 != i16) {
                    iM106646e2 = AbstractC33745d.m106646e(parcel, linkedHashSet3, iM106646e2, 1);
                    i16 = i16;
                }
                C38901n c38901nCreateFromParcel = parcel.readInt() == 0 ? null : C38901n.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap2 = null;
                } else {
                    int i17 = parcel.readInt();
                    linkedHashMap2 = new LinkedHashMap(i17);
                    int i18 = 0;
                    while (i18 != i17) {
                        linkedHashMap2.put(parcel.readString(), parcel.readValue(C38809d5.class.getClassLoader()));
                        i18++;
                        i17 = i17;
                    }
                }
                return new C38809d5(string4, z4, c38951s4CreateFromParcel, c38978v4CreateFromParcel, c38969u4CreateFromParcel, c39005y4CreateFromParcel, c38924p4CreateFromParcel, c38933q4CreateFromParcel, c38799c5CreateFromParcel, c38996x4CreateFromParcel, c38789b5CreateFromParcel, c38987w4CreateFromParcel, c38960t4CreateFromParcel, c38779a5CreateFromParcel, c39014z4CreateFromParcel, c38977v3CreateFromParcel, enumC38941r3CreateFromParcel, c38780a6CreateFromParcel, linkedHashMap4, linkedHashSet3, c38901nCreateFromParcel, linkedHashMap2);
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string5 = parcel.readString();
                C38969u4 c38969u4 = new C38969u4();
                c38969u4.f167741w = string5;
                return c38969u4;
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string6 = parcel.readString();
                C38978v4 c38978v4 = new C38978v4();
                c38978v4.f167777w = string6;
                return c38978v4;
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap3 = null;
                } else {
                    int i19 = parcel.readInt();
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(i19);
                    for (int i24 = 0; i24 != i19; i24++) {
                        linkedHashMap5.put(parcel.readString(), parcel.readValue(C38987w4.class.getClassLoader()));
                    }
                    linkedHashMap3 = linkedHashMap5;
                }
                return new C38987w4(string7, string8, linkedHashMap3);
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                String bank = parcel.readString();
                AbstractC22676k.m65750j(bank, "bank");
                C38996x4 c38996x4 = new C38996x4();
                c38996x4.f167845w = bank;
                return c38996x4;
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string9 = parcel.readString();
                C39005y4 c39005y4 = new C39005y4();
                c39005y4.f167888w = string9;
                return c39005y4;
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                String externalSourceId = parcel.readString();
                AbstractC22676k.m65750j(externalSourceId, "externalSourceId");
                C39014z4 c39014z4 = new C39014z4();
                c39014z4.f167922w = externalSourceId;
                return c39014z4;
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return new C38779a5();
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38789b5(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EnumC38868j4.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EnumC38848h4.CREATOR.createFromParcel(parcel) : null);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38799c5(parcel.readString());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38819e5(parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38829f5(parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString());
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38839g5(parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38849h5(parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38859i5(parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38879k5(parcel.readString(), parcel.readInt() == 0 ? null : EnumC38910o.valueOf(parcel.readString()));
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38889l5(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EnumC38910o.valueOf(parcel.readString()), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38898m5(parcel.readString(), parcel.readInt() == 0 ? null : EnumC38910o.valueOf(parcel.readString()));
            case 26:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38907n5(parcel.readInt() == 0 ? null : EnumC38910o.valueOf(parcel.readString()));
            case 27:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38916o5(parcel.readInt() == 0 ? null : EnumC38910o.valueOf(parcel.readString()));
            case 28:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38925p5(EnumC38828f4.CREATOR.createFromParcel(parcel), EnumC38910o.valueOf(parcel.readString()));
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38934q5(parcel.readInt() == 0 ? null : EnumC38910o.valueOf(parcel.readString()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f167278a) {
            case 0:
                return new EnumC38868j4[i13];
            case 1:
                return new C38878k4[i13];
            case 2:
                return new C38897m4[i13];
            case 3:
                return new C38924p4[i13];
            case 4:
                return new C38933q4[i13];
            case 5:
                return new C38951s4[i13];
            case 6:
                return new C38942r4[i13];
            case 7:
                return new C38960t4[i13];
            case 8:
                return new C38809d5[i13];
            case 9:
                return new C38969u4[i13];
            case 10:
                return new C38978v4[i13];
            case 11:
                return new C38987w4[i13];
            case 12:
                return new C38996x4[i13];
            case 13:
                return new C39005y4[i13];
            case 14:
                return new C39014z4[i13];
            case 15:
                return new C38779a5[i13];
            case 16:
                return new C38789b5[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C38799c5[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C38819e5[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C38829f5[i13];
            case 20:
                return new C38839g5[i13];
            case 21:
                return new C38849h5[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C38859i5[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C38879k5[i13];
            case 24:
                return new C38889l5[i13];
            case 25:
                return new C38898m5[i13];
            case 26:
                return new C38907n5[i13];
            case 27:
                return new C38916o5[i13];
            case 28:
                return new C38925p5[i13];
            default:
                return new C38934q5[i13];
        }
    }
}
