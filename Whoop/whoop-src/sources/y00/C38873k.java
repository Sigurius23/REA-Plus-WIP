package y00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.model.ConsentUi;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionRefresh;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.DisplayablePaymentDetails;
import com.stripe.android.model.LinkAuthIntent;
import com.stripe.android.model.StripeIntent$Usage;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import nh3.AbstractC26725a;
import p695zx.C41179a;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y00.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C38873k implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167320a;

    public /* synthetic */ C38873k(int i13) {
        this.f167320a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z4;
        boolean z13;
        LinkedHashMap linkedHashMap;
        switch (this.f167320a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                C41179a c41179a = (C41179a) parcel.readParcelable(C38883l.class.getClassLoader());
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                int iM79498b = 0;
                while (iM79498b != i13) {
                    iM79498b = AbstractC26725a.m79498b(C38783b.CREATOR, parcel, arrayList, iM79498b, 1);
                }
                return new C38883l(c41179a, arrayList);
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                EnumC38853i enumC38853iValueOf = EnumC38853i.valueOf(parcel.readString());
                int i14 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i14);
                int iM106646e = 0;
                while (iM106646e != i14) {
                    iM106646e = AbstractC33745d.m106646e(parcel, linkedHashSet, iM106646e, 1);
                }
                String string = parcel.readString();
                int i15 = parcel.readInt();
                int i16 = parcel.readInt();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                C38793c c38793cCreateFromParcel = parcel.readInt() == 0 ? null : C38793c.CREATOR.createFromParcel(parcel);
                LinkedHashMap linkedHashMap2 = null;
                String string4 = parcel.readString();
                C38787b3 c38787b3CreateFromParcel = parcel.readInt() == 0 ? null : C38787b3.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int i17 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(i17);
                    for (int i18 = 0; i18 != i17; i18++) {
                        linkedHashMap3.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap2 = linkedHashMap3;
                }
                return new C38892m(enumC38853iValueOf, linkedHashSet, string, i15, i16, string2, string3, c38793cCreateFromParcel, string4, c38787b3CreateFromParcel, linkedHashMap2);
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38901n(parcel.readString(), parcel.readInt() == 0 ? null : EnumC38896m3.valueOf(parcel.readString()), parcel.readInt() != 0 ? EnumC38979v5.valueOf(parcel.readString()) : null, parcel.readString());
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                C38809d5 c38809d5CreateFromParcel = parcel.readInt() == 0 ? null : C38809d5.CREATOR.createFromParcel(parcel);
                String string5 = parcel.readString();
                C38998x6 c38998x6CreateFromParcel = parcel.readInt() == 0 ? null : C38998x6.CREATOR.createFromParcel(parcel);
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean z14 = false;
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                AbstractC38970u5 abstractC38970u5 = (AbstractC38970u5) parcel.readParcelable(C38928q.class.getClassLoader());
                String string9 = parcel.readString();
                C38994x2 c38994x2CreateFromParcel = parcel.readInt() == 0 ? null : C38994x2.CREATOR.createFromParcel(parcel);
                EnumC38910o enumC38910oValueOf = parcel.readInt() == 0 ? null : EnumC38910o.valueOf(parcel.readString());
                return new C38928q(c38809d5CreateFromParcel, string5, c38998x6CreateFromParcel, string6, string7, string8, boolValueOf, z14, abstractC38970u5, string9, c38994x2CreateFromParcel, enumC38910oValueOf, parcel.readInt() == 0 ? null : C38919p.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : C38780a6.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C38901n.CREATOR.createFromParcel(parcel), parcel.readString());
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38919p(C38793c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                C38809d5 c38809d5CreateFromParcel2 = parcel.readInt() == 0 ? null : C38809d5.CREATOR.createFromParcel(parcel);
                String string12 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z13 = false;
                    z4 = true;
                } else {
                    z4 = false;
                    z13 = false;
                }
                return new C38937r(string10, string11, c38809d5CreateFromParcel2, string12, z4, parcel.readString(), parcel.readInt() == 0 ? null : C38994x2.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() == 0 ? z13 : true), parcel.readString(), (AbstractC38970u5) parcel.readParcelable(C38937r.class.getClassLoader()), parcel.readInt() == 0 ? null : C38780a6.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? C38901n.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38964u(parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : C38955t.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : EnumC38910o.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? C38860i6.CREATOR.createFromParcel(parcel) : null);
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38955t(parcel.readInt() == 0 ? null : EnumC38941r3.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C38977v3.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? C39013z3.CREATOR.createFromParcel(parcel) : null, parcel.readString(), EnumC38828f4.CREATOR.createFromParcel(parcel), parcel.readString());
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38973v(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EnumC38910o.valueOf(parcel.readString()), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38982w(parcel.readString(), parcel.readInt() == 0 ? null : C38809d5.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : EnumC38910o.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : C38919p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C38994x2.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : C38973v.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? C38901n.CREATOR.createFromParcel(parcel) : null);
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38991x(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C39000y.CREATOR.createFromParcel(parcel), parcel.readString());
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C39000y(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (CountryCode) parcel.readParcelable(C39000y.class.getClassLoader()));
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38774a0(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : C39000y.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt(), EnumC38853i.valueOf(parcel.readString()), parcel.createStringArrayList(), EnumC38974v0.valueOf(parcel.readString()), EnumC39009z.valueOf(parcel.readString()));
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i19 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i19);
                for (int i24 = 0; i24 != i19; i24++) {
                    arrayList2.add(parcel.readParcelable(C38804d0.class.getClassLoader()));
                }
                return new C38804d0(arrayList2);
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38784b0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C39000y.CREATOR.createFromParcel(parcel), parcel.readString());
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string13 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i25 = parcel.readInt();
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(i25);
                    for (int i26 = 0; i26 != i25; i26++) {
                        linkedHashMap4.put(parcel.readString(), parcel.readValue(C38814e0.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap4;
                }
                String string14 = parcel.readString();
                int i27 = parcel.readInt();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(i27);
                for (int i28 = 0; i28 != i27; i28++) {
                    linkedHashMap5.put(parcel.readString(), parcel.readValue(C38814e0.class.getClassLoader()));
                }
                return new C38814e0(string13, linkedHashMap, string14, linkedHashMap5);
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i29 = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(i29);
                for (int i34 = 0; i34 != i29; i34++) {
                    linkedHashMap6.put(parcel.readString(), parcel.readValue(C38824f0.class.getClassLoader()));
                }
                return new C38824f0(linkedHashMap6, parcel.readString());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38844h0(C38915o4.CREATOR.createFromParcel(parcel));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string15 = parcel.readString();
                LinkedHashMap linkedHashMap7 = null;
                Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                if (parcel.readInt() != 0) {
                    int i35 = parcel.readInt();
                    LinkedHashMap linkedHashMap8 = new LinkedHashMap(i35);
                    for (int i36 = 0; i36 != i35; i36++) {
                        linkedHashMap8.put(parcel.readString(), parcel.readValue(C38854i0.class.getClassLoader()));
                    }
                    linkedHashMap7 = linkedHashMap8;
                }
                int i37 = parcel.readInt();
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(i37);
                for (int i38 = 0; i38 != i37; i38++) {
                    linkedHashMap9.put(parcel.readString(), parcel.readString());
                }
                return new C38854i0(string15, boolValueOf2, linkedHashMap7, linkedHashMap9);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new ConsumerSessionLookup(parcel.readInt() != 0, parcel.readInt() == 0 ? null : ConsumerSession.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DisplayablePaymentDetails.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ConsentUi.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new ConsumerSessionRefresh(ConsumerSession.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LinkAuthIntent.CREATOR.createFromParcel(parcel));
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new ConsumerSessionSignup(ConsumerSession.CREATOR.createFromParcel(parcel), parcel.readString());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38864j0(parcel.readString(), parcel.readInt() != 0, C39000y.CREATOR.createFromParcel(parcel), parcel.readString());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i39 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i39);
                int iM79498b2 = 0;
                while (iM79498b2 != i39) {
                    iM79498b2 = AbstractC26725a.m79498b(C38864j0.CREATOR, parcel, arrayList3, iM79498b2, 1);
                }
                return new C38874k0(arrayList3);
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                C38860i6 c38860i6CreateFromParcel = parcel.readInt() == 0 ? null : C38860i6.CREATOR.createFromParcel(parcel);
                int i44 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i44);
                boolean z15 = false;
                for (int i45 = 0; i45 != i44; i45++) {
                    arrayList4.add(parcel.readParcelable(C38929q0.class.getClassLoader()));
                }
                if (parcel.readInt() != 0) {
                    z15 = true;
                }
                return new C38929q0(string16, string17, c38860i6CreateFromParcel, arrayList4, z15, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38938r0((C38813e) parcel.readParcelable(C38938r0.class.getClassLoader()));
            case 26:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38947s0((C38843h) parcel.readParcelable(C38947s0.class.getClassLoader()));
            case 27:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38965u0(C38899m6.CREATOR.createFromParcel(parcel));
            case 28:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38775a1((InterfaceC39010z0) parcel.readParcelable(C38775a1.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C38983w0(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent$Usage.valueOf(parcel.readString()), EnumC38817e3.valueOf(parcel.readString()), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f167320a) {
            case 0:
                return new C38883l[i13];
            case 1:
                return new C38892m[i13];
            case 2:
                return new C38901n[i13];
            case 3:
                return new C38928q[i13];
            case 4:
                return new C38919p[i13];
            case 5:
                return new C38937r[i13];
            case 6:
                return new C38964u[i13];
            case 7:
                return new C38955t[i13];
            case 8:
                return new C38973v[i13];
            case 9:
                return new C38982w[i13];
            case 10:
                return new C38991x[i13];
            case 11:
                return new C39000y[i13];
            case 12:
                return new C38774a0[i13];
            case 13:
                return new C38804d0[i13];
            case 14:
                return new C38784b0[i13];
            case 15:
                return new C38814e0[i13];
            case 16:
                return new C38824f0[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C38844h0[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C38854i0[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new ConsumerSessionLookup[i13];
            case 20:
                return new ConsumerSessionRefresh[i13];
            case 21:
                return new ConsumerSessionSignup[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C38864j0[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C38874k0[i13];
            case 24:
                return new C38929q0[i13];
            case 25:
                return new C38938r0[i13];
            case 26:
                return new C38947s0[i13];
            case 27:
                return new C38965u0[i13];
            case 28:
                return new C38775a1[i13];
            default:
                return new C38983w0[i13];
        }
    }
}
