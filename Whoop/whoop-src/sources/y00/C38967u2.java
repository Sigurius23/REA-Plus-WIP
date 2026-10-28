package y00;

import a10.AbstractC0122j;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import com.stripe.android.model.StripeIntent$Status;
import com.stripe.android.model.StripeIntent$Usage;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y00.u2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38967u2 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167739a;

    public /* synthetic */ C38967u2(int i13) {
        this.f167739a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Long lValueOf;
        EnumC38807d3 enumC38807d3;
        switch (this.f167739a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38976v2(parcel.readString(), EnumC38828f4.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38994x2((C38985w2) parcel.readParcelable(C38994x2.class.getClassLoader()));
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38985w2(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39012z2(parcel.readInt() != 0);
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38777a3(C39012z2.CREATOR.createFromParcel(parcel));
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38787b3(parcel.readString());
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38797c3(parcel.readString(), parcel.readString());
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    lValueOf = null;
                    enumC38807d3 = null;
                } else {
                    lValueOf = Long.valueOf(parcel.readLong());
                    enumC38807d3 = null;
                }
                long j7 = parcel.readLong();
                EnumC38807d3 enumC38807d3ValueOf = parcel.readInt() == 0 ? enumC38807d3 : EnumC38807d3.valueOf(parcel.readString());
                EnumC38817e3 enumC38817e3ValueOf = EnumC38817e3.valueOf(parcel.readString());
                Object obj = enumC38807d3;
                EnumC38807d3 enumC38807d4 = enumC38807d3ValueOf;
                String string2 = parcel.readString();
                EnumC38837g3 enumC38837g3ValueOf = EnumC38837g3.valueOf(parcel.readString());
                String string3 = parcel.readString();
                long j13 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                C38915o4 c38915o4 = (C38915o4) (parcel.readInt() == 0 ? obj : C38915o4.CREATOR.createFromParcel(parcel));
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                StripeIntent$Status stripeIntent$StatusValueOf = parcel.readInt() == 0 ? r16 : StripeIntent$Status.valueOf(parcel.readString());
                StripeIntent$Usage stripeIntent$UsageValueOf = parcel.readInt() == 0 ? r16 : StripeIntent$Usage.valueOf(parcel.readString());
                C38857i3 c38857i3 = (C38857i3) (parcel.readInt() == 0 ? r16 : C38857i3.CREATOR.createFromParcel(parcel));
                C38867j3 c38867j3 = (C38867j3) (parcel.readInt() == 0 ? r16 : C38867j3.CREATOR.createFromParcel(parcel));
                StripeIntent$Usage stripeIntent$Usage = stripeIntent$UsageValueOf;
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
                AbstractC38792b8 abstractC38792b8 = (AbstractC38792b8) parcel.readParcelable(C38887l3.class.getClassLoader());
                boolean z13 = true;
                String string8 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z13 = false;
                }
                new C38887l3(string, arrayListCreateStringArrayList, lValueOf, j7, enumC38807d4, enumC38817e3ValueOf, string2, enumC38837g3ValueOf, string3, j13, string4, string5, z4, c38915o4, string6, string7, stripeIntent$StatusValueOf, stripeIntent$Usage, c38857i3, c38867j3, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, abstractC38792b8, string8, z13);
                return r0;
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38857i3(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C38915o4.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EnumC38847h3.valueOf(parcel.readString()) : null);
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38867j3(C38793c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C38905n3.f167476w;
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38914o3(parcel.readLong());
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C38923p3.f167550w;
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                return EnumC38941r3.valueOf(parcel.readString());
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38950s3(parcel.readString(), parcel.readString(), parcel.readString());
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38959t3(parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38977v3(parcel.readInt() == 0 ? null : C38793c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38986w3(parcel.readString(), parcel.readString(), parcel.readString());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                EnumC38853i enumC38853iValueOf = EnumC38853i.valueOf(parcel.readString());
                C38986w3 c38986w3CreateFromParcel = parcel.readInt() == 0 ? null : C38986w3.CREATOR.createFromParcel(parcel);
                String string9 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string10 = parcel.readString();
                Integer num = numValueOf;
                Integer num2 = numValueOf2;
                String string11 = parcel.readString();
                C38995x3 c38995x3CreateFromParcel = null;
                String string12 = parcel.readString();
                C39004y3 c39004y3CreateFromParcel = parcel.readInt() == 0 ? null : C39004y3.CREATOR.createFromParcel(parcel);
                AbstractC0122j abstractC0122j = (AbstractC0122j) parcel.readParcelable(C39013z3.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    c38995x3CreateFromParcel = C38995x3.CREATOR.createFromParcel(parcel);
                }
                return new C39013z3(enumC38853iValueOf, c38986w3CreateFromParcel, string9, num, num2, string10, string11, string12, c39004y3CreateFromParcel, abstractC0122j, c38995x3CreateFromParcel, parcel.readString());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i13 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i13);
                int iM106646e = 0;
                while (iM106646e != i13) {
                    iM106646e = AbstractC33745d.m106646e(parcel, linkedHashSet, iM106646e, 1);
                }
                return new C38995x3(parcel.readInt() != 0, parcel.readString(), linkedHashSet);
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39004y3(parcel.readInt() != 0);
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38778a4(parcel.readInt() != 0);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38915o4(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : EnumC38828f4.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C38977v3.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : C39013z3.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C38778a4.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C38788b4.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C38798c4.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C38818e4.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C38950s3.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C38959t3.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C38897m4.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C38808d4.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C38888l4.CREATOR.createFromParcel(parcel), (InterfaceC38949s2) parcel.readParcelable(C38915o4.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : EnumC38941r3.CREATOR.createFromParcel(parcel));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38788b4(parcel.readString(), parcel.readString());
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38798c4(parcel.readString(), parcel.readString());
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38808d4(parcel.readString());
            case 26:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38818e4(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 27:
                AbstractC22676k.m65750j(parcel, "parcel");
                return EnumC38828f4.valueOf(parcel.readString());
            case 28:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38888l4(EnumC38848h4.CREATOR.createFromParcel(parcel), EnumC38868j4.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C38878k4.CREATOR.createFromParcel(parcel), parcel.readString());
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return EnumC38848h4.valueOf(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f167739a) {
            case 0:
                return new C38976v2[i13];
            case 1:
                return new C38994x2[i13];
            case 2:
                return new C38985w2[i13];
            case 3:
                return new C39012z2[i13];
            case 4:
                return new C38777a3[i13];
            case 5:
                return new C38787b3[i13];
            case 6:
                return new C38797c3[i13];
            case 7:
                return new C38887l3[i13];
            case 8:
                return new C38857i3[i13];
            case 9:
                return new C38867j3[i13];
            case 10:
                return new C38905n3[i13];
            case 11:
                return new C38914o3[i13];
            case 12:
                return new C38923p3[i13];
            case 13:
                return new EnumC38941r3[i13];
            case 14:
                return new C38950s3[i13];
            case 15:
                return new C38959t3[i13];
            case 16:
                return new C38977v3[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C38986w3[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C39013z3[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C38995x3[i13];
            case 20:
                return new C39004y3[i13];
            case 21:
                return new C38778a4[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C38915o4[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C38788b4[i13];
            case 24:
                return new C38798c4[i13];
            case 25:
                return new C38808d4[i13];
            case 26:
                return new C38818e4[i13];
            case 27:
                return new EnumC38828f4[i13];
            case 28:
                return new C38888l4[i13];
            default:
                return new EnumC38848h4[i13];
        }
    }
}
