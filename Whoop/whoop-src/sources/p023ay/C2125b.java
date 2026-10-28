package p023ay;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.proto.C1533u;
import androidx.health.platform.client.proto.C1545w1;
import androidx.versionedparcelable.ParcelImpl;
import az.C2157a;
import c10.C3827j;
import c10.C3828k;
import c10.C3829l;
import c10.C3831n;
import c10.EnumC3832o;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.material.datepicker.C5008b;
import com.google.android.material.datepicker.C5010d;
import com.google.android.material.datepicker.C5023q;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.DisplayablePaymentDetails;
import cz.C11190b;
import cz.C11200g;
import cz.C11235x0;
import cz.C11237y0;
import cz.EnumC11202h;
import d00.C11433l;
import d00.C11434m;
import d00.InterfaceC11432k;
import d20.C11496l;
import d50.C11712f;
import h20.AbstractC16737t1;
import h20.C16636c2;
import h20.C16665h1;
import h20.C16666h2;
import h20.C16671i1;
import h20.C16689l1;
import h20.C16756w2;
import h20.C16767y1;
import h20.EnumC16673i3;
import h20.EnumC16743u1;
import i20.C17928b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p084d8.C11764a;
import p096dq.C12258b;
import p096dq.C12259c;
import p096dq.C12268l;
import p096dq.C12269m;
import p096dq.C12270n;
import p096dq.C12271o;
import p096dq.C12274r;
import p096dq.C12275s;
import p096dq.C12279w;
import p537ux.C35354r;
import p557vo.AbstractC36220b;
import p575w7.AbstractC36868a;
import p575w7.C36869b;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q30.C29926q0;
import te0.AbstractC33745d;
import y00.C38981v7;
import y00.EnumC38853i;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: ay.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2125b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8503a;

    public /* synthetic */ C2125b(int i13) {
        this.f8503a = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z4;
        boolean z13;
        boolean z14;
        switch (this.f8503a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C2127c(parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C2129d(parcel.readString());
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C2143q((Throwable) parcel.readSerializable());
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C2144r(parcel.readString());
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C2146t(parcel.readString(), parcel.createStringArrayList(), (InterfaceC38802c8) parcel.readParcelable(C2146t.class.getClassLoader()));
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C2157a(parcel.readString(), parcel.readString());
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C3827j.f15664w;
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C3828k.f15665w;
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C3829l(parcel.readString());
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                C16636c2 c16636c2CreateFromParcel = parcel.readInt() == 0 ? null : C16636c2.CREATOR.createFromParcel(parcel);
                C16666h2 c16666h2CreateFromParcel = parcel.readInt() == 0 ? null : C16666h2.CREATOR.createFromParcel(parcel);
                C16671i1 c16671i1CreateFromParcel = parcel.readInt() != 0 ? C16671i1.CREATOR.createFromParcel(parcel) : null;
                C17928b c17928b = (C17928b) parcel.readParcelable(C3831n.class.getClassLoader());
                boolean z15 = false;
                boolean z16 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z15 = true;
                }
                C16665h1 c16665h1CreateFromParcel = C16665h1.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                C16689l1 c16689l1CreateFromParcel = C16689l1.CREATOR.createFromParcel(parcel);
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(EnumC38853i.valueOf(parcel.readString()));
                }
                boolean z17 = parcel.readInt() != 0;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                AbstractC16737t1 abstractC16737t1 = (AbstractC16737t1) parcel.readParcelable(C3831n.class.getClassLoader());
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                int iM79498b = 0;
                while (iM79498b != i15) {
                    iM79498b = AbstractC26725a.m79498b(EnumC16743u1.CREATOR, parcel, arrayList2, iM79498b, 1);
                    i15 = i15;
                    c16666h2CreateFromParcel = c16666h2CreateFromParcel;
                }
                C16666h2 c16666h2 = c16666h2CreateFromParcel;
                int i16 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i16);
                int iM79498b2 = 0;
                while (iM79498b2 != i16) {
                    iM79498b2 = AbstractC26725a.m79498b(C16767y1.CREATOR, parcel, arrayList3, iM79498b2, 1);
                    i16 = i16;
                    arrayList2 = arrayList2;
                }
                ArrayList arrayList4 = arrayList2;
                boolean z18 = parcel.readInt() != 0;
                C16756w2 c16756w2CreateFromParcel = C16756w2.CREATOR.createFromParcel(parcel);
                EnumC3832o enumC3832oValueOf = EnumC3832o.valueOf(parcel.readString());
                int i17 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i17);
                int i18 = 0;
                while (i18 != i17) {
                    linkedHashMap.put(parcel.readParcelable(C3831n.class.getClassLoader()), EnumC16673i3.valueOf(parcel.readString()));
                    i18++;
                    i17 = i17;
                }
                return new C3831n(string, c16636c2CreateFromParcel, c16666h2, c16671i1CreateFromParcel, c17928b, z16, z15, c16665h1CreateFromParcel, string2, c16689l1CreateFromParcel, arrayList, z17, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, abstractC16737t1, arrayList4, arrayList3, z18, c16756w2CreateFromParcel, enumC3832oValueOf, linkedHashMap, parcel.readInt() != 0, parcel.readString());
            case 10:
                int iM115294F = AbstractC36220b.m115294F(parcel);
                String strM115303h = null;
                int iM115317y = 0;
                while (parcel.dataPosition() < iM115294F) {
                    int i19 = parcel.readInt();
                    char c3 = (char) i19;
                    if (c3 == 1) {
                        iM115317y = AbstractC36220b.m115317y(parcel, i19);
                    } else if (c3 != 2) {
                        AbstractC36220b.m115293E(parcel, i19);
                    } else {
                        strM115303h = AbstractC36220b.m115303h(parcel, i19);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F);
                return new Scope(iM115317y, strM115303h);
            case 11:
                return new C5008b((C5023q) parcel.readParcelable(C5023q.class.getClassLoader()), (C5023q) parcel.readParcelable(C5023q.class.getClassLoader()), (C5010d) parcel.readParcelable(C5010d.class.getClassLoader()), (C5023q) parcel.readParcelable(C5023q.class.getClassLoader()), parcel.readInt());
            case 12:
                return new C5010d(parcel.readLong());
            case 13:
                return C5023q.m15753b(parcel.readInt(), parcel.readInt());
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                C16665h1 c16665h1CreateFromParcel2 = C16665h1.CREATOR.createFromParcel(parcel);
                boolean z19 = false;
                if (parcel.readInt() != 0) {
                    z19 = true;
                    z4 = true;
                } else {
                    z4 = true;
                }
                String string3 = parcel.readString();
                C16671i1 c16671i1CreateFromParcel2 = C16671i1.CREATOR.createFromParcel(parcel);
                C16689l1 c16689l1CreateFromParcel2 = C16689l1.CREATOR.createFromParcel(parcel);
                boolean z24 = z4;
                String string4 = parcel.readString();
                int i24 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i24);
                for (?? r14 = z19; r14 != i24; r14++) {
                    arrayList5.add(EnumC38853i.valueOf(parcel.readString()));
                }
                if (parcel.readInt() != 0) {
                    z13 = z24;
                    z14 = z13;
                } else {
                    z13 = z19;
                    z14 = z24;
                }
                return new C11190b(c16665h1CreateFromParcel2, z19, string3, c16671i1CreateFromParcel2, c16689l1CreateFromParcel2, string4, arrayList5, z13, parcel.createStringArrayList(), (AbstractC16737t1) parcel.readParcelable(C11190b.class.getClassLoader()), parcel.readInt() != 0 ? z14 : false);
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C11200g(EnumC11202h.valueOf(parcel.readString()), C11190b.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C11235x0((AbstractC29840y) parcel.readParcelable(C11235x0.class.getClassLoader()));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C11237y0((Throwable) parcel.readSerializable());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C11433l((ConsumerSession) parcel.readParcelable(C11433l.class.getClassLoader()), parcel.readString(), (DisplayablePaymentDetails) parcel.readParcelable(C11433l.class.getClassLoader()), parcel.readInt() == 0 ? null : C11434m.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C11434m(parcel.readString(), (InterfaceC11432k) parcel.readParcelable(C11434m.class.getClassLoader()));
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                C29926q0 c29926q0 = (C29926q0) parcel.readParcelable(C11496l.class.getClassLoader());
                C35354r c35354rCreateFromParcel = C35354r.CREATOR.createFromParcel(parcel);
                InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) parcel.readParcelable(C11496l.class.getClassLoader());
                C38981v7 c38981v7CreateFromParcel = C38981v7.CREATOR.createFromParcel(parcel);
                C39857f c39857f = (C39857f) parcel.readParcelable(C11496l.class.getClassLoader());
                int iM106646e = 0;
                boolean z25 = parcel.readInt() != 0;
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string5 = parcel.readString();
                int i25 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i25);
                while (iM106646e != i25) {
                    iM106646e = AbstractC33745d.m106646e(parcel, linkedHashSet, iM106646e, 1);
                }
                return new C11496l(c29926q0, c35354rCreateFromParcel, interfaceC38802c8, c38981v7CreateFromParcel, c39857f, z25, numValueOf, string5, linkedHashSet);
            case 21:
                C11712f c11712f = new C11712f();
                c11712f.f37852w = parcel.readInt();
                c11712f.f37853x = parcel.readInt();
                c11712f.f37854y = parcel.readInt();
                return c11712f;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "source");
                int i26 = parcel.readInt();
                if (i26 != 0) {
                    int i27 = 1;
                    if (i26 == 1) {
                        return (AbstractC36868a) C36869b.f157707a.m118255a(parcel, new C11764a(i27, 0));
                    }
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i26, "Unknown storage: "));
                }
                byte[] bArrCreateByteArray = parcel.createByteArray();
                if (bArrCreateByteArray == null) {
                    return null;
                }
                return new Permission(C1545w1.m4926s(bArrCreateByteArray));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new ParcelImpl(parcel);
            case 24:
                int iM115294F2 = AbstractC36220b.m115294F(parcel);
                String strM115303h2 = null;
                C12258b c12258b = null;
                UserAddress userAddress = null;
                C12270n c12270n = null;
                String strM115303h3 = null;
                Bundle bundleM115298c = null;
                String strM115303h4 = null;
                Bundle bundleM115298c2 = null;
                while (parcel.dataPosition() < iM115294F2) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            strM115303h2 = AbstractC36220b.m115303h(parcel, i28);
                            break;
                        case 2:
                            c12258b = (C12258b) AbstractC36220b.m115302g(parcel, i28, C12258b.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) AbstractC36220b.m115302g(parcel, i28, UserAddress.CREATOR);
                            break;
                        case 4:
                            c12270n = (C12270n) AbstractC36220b.m115302g(parcel, i28, C12270n.CREATOR);
                            break;
                        case 5:
                            strM115303h3 = AbstractC36220b.m115303h(parcel, i28);
                            break;
                        case 6:
                            bundleM115298c = AbstractC36220b.m115298c(parcel, i28);
                            break;
                        case 7:
                            strM115303h4 = AbstractC36220b.m115303h(parcel, i28);
                            break;
                        case '\b':
                            bundleM115298c2 = AbstractC36220b.m115298c(parcel, i28);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i28);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F2);
                C12268l c12268l = new C12268l();
                c12268l.f41080w = strM115303h2;
                c12268l.f41081x = c12258b;
                c12268l.f41082y = userAddress;
                c12268l.f41083z = c12270n;
                c12268l.f41076E = strM115303h3;
                c12268l.f41077F = bundleM115298c;
                c12268l.f41078G = strM115303h4;
                c12268l.f41079H = bundleM115298c2;
                return c12268l;
            case 25:
                int iM115294F3 = AbstractC36220b.m115294F(parcel);
                C12259c c12259c = null;
                C12271o c12271o = null;
                C12275s c12275s = null;
                String strM115303h5 = null;
                byte[] bArrM115299d = null;
                Bundle bundleM115298c3 = null;
                boolean zM115312t = true;
                boolean zM115312t2 = false;
                boolean zM115312t3 = false;
                boolean zM115312t4 = false;
                C12274r c12274r = null;
                ArrayList arrayListM115301f = null;
                while (parcel.dataPosition() < iM115294F3) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            zM115312t2 = AbstractC36220b.m115312t(parcel, i29);
                            break;
                        case 2:
                            zM115312t3 = AbstractC36220b.m115312t(parcel, i29);
                            break;
                        case 3:
                            c12259c = (C12259c) AbstractC36220b.m115302g(parcel, i29, C12259c.CREATOR);
                            break;
                        case 4:
                            zM115312t4 = AbstractC36220b.m115312t(parcel, i29);
                            break;
                        case 5:
                            c12274r = (C12274r) AbstractC36220b.m115302g(parcel, i29, C12274r.CREATOR);
                            break;
                        case 6:
                            arrayListM115301f = AbstractC36220b.m115301f(parcel, i29);
                            break;
                        case 7:
                            c12271o = (C12271o) AbstractC36220b.m115302g(parcel, i29, C12271o.CREATOR);
                            break;
                        case '\b':
                            c12275s = (C12275s) AbstractC36220b.m115302g(parcel, i29, C12275s.CREATOR);
                            break;
                        case '\t':
                            zM115312t = AbstractC36220b.m115312t(parcel, i29);
                            break;
                        case '\n':
                            strM115303h5 = AbstractC36220b.m115303h(parcel, i29);
                            break;
                        case 11:
                            bundleM115298c3 = AbstractC36220b.m115298c(parcel, i29);
                            break;
                        case '\f':
                            bArrM115299d = AbstractC36220b.m115299d(parcel, i29);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i29);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F3);
                C12269m c12269m = new C12269m();
                c12269m.f41092w = zM115312t2;
                c12269m.f41093x = zM115312t3;
                c12269m.f41094y = c12259c;
                c12269m.f41095z = zM115312t4;
                c12269m.f41084E = c12274r;
                c12269m.f41085F = arrayListM115301f;
                c12269m.f41086G = c12271o;
                c12269m.f41087H = c12275s;
                c12269m.f41088I = zM115312t;
                c12269m.f41089J = strM115303h5;
                c12269m.f41090K = bArrM115299d;
                c12269m.f41091L = bundleM115298c3;
                return c12269m;
            case 26:
                int iM115294F4 = AbstractC36220b.m115294F(parcel);
                String strM115303h6 = null;
                int iM115317y2 = 0;
                while (parcel.dataPosition() < iM115294F4) {
                    int i34 = parcel.readInt();
                    char c7 = (char) i34;
                    if (c7 == 2) {
                        iM115317y2 = AbstractC36220b.m115317y(parcel, i34);
                    } else if (c7 != 3) {
                        AbstractC36220b.m115293E(parcel, i34);
                    } else {
                        strM115303h6 = AbstractC36220b.m115303h(parcel, i34);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F4);
                C12270n c12270n2 = new C12270n();
                c12270n2.f41096w = iM115317y2;
                c12270n2.f41097x = strM115303h6;
                return c12270n2;
            case 27:
                int iM115294F5 = AbstractC36220b.m115294F(parcel);
                Bundle bundleM115298c4 = null;
                int iM115317y3 = 0;
                while (parcel.dataPosition() < iM115294F5) {
                    int i35 = parcel.readInt();
                    char c14 = (char) i35;
                    if (c14 == 2) {
                        iM115317y3 = AbstractC36220b.m115317y(parcel, i35);
                    } else if (c14 != 3) {
                        AbstractC36220b.m115293E(parcel, i35);
                    } else {
                        bundleM115298c4 = AbstractC36220b.m115298c(parcel, i35);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F5);
                return new C12271o(iM115317y3, bundleM115298c4);
            case 28:
                int iM115294F6 = AbstractC36220b.m115294F(parcel);
                int iM115317y4 = 0;
                String strM115303h7 = null;
                String strM115303h8 = null;
                int iM115317y5 = 0;
                while (parcel.dataPosition() < iM115294F6) {
                    int i36 = parcel.readInt();
                    char c15 = (char) i36;
                    if (c15 == 2) {
                        strM115303h7 = AbstractC36220b.m115303h(parcel, i36);
                    } else if (c15 == 3) {
                        strM115303h8 = AbstractC36220b.m115303h(parcel, i36);
                    } else if (c15 == 4) {
                        iM115317y4 = AbstractC36220b.m115317y(parcel, i36);
                    } else if (c15 != 5) {
                        AbstractC36220b.m115293E(parcel, i36);
                    } else {
                        iM115317y5 = AbstractC36220b.m115317y(parcel, i36);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F6);
                return new C12279w(strM115303h7, strM115303h8, iM115317y4, iM115317y5);
            default:
                int iM115294F7 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayListM115305j = null;
                while (parcel.dataPosition() < iM115294F7) {
                    int i37 = parcel.readInt();
                    if (((char) i37) != 1) {
                        AbstractC36220b.m115293E(parcel, i37);
                    } else {
                        arrayListM115305j = AbstractC36220b.m115305j(parcel, i37);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F7);
                C12274r c12274r2 = new C12274r();
                c12274r2.f41101w = arrayListM115305j;
                return c12274r2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f8503a) {
            case 0:
                return new C2127c[i13];
            case 1:
                return new C2129d[i13];
            case 2:
                return new C2143q[i13];
            case 3:
                return new C2144r[i13];
            case 4:
                return new C2146t[i13];
            case 5:
                return new C2157a[i13];
            case 6:
                return new C3827j[i13];
            case 7:
                return new C3828k[i13];
            case 8:
                return new C3829l[i13];
            case 9:
                return new C3831n[i13];
            case 10:
                return new Scope[i13];
            case 11:
                return new C5008b[i13];
            case 12:
                return new C5010d[i13];
            case 13:
                return new C5023q[i13];
            case 14:
                return new C11190b[i13];
            case 15:
                return new C11200g[i13];
            case 16:
                return new C11235x0[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C11237y0[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C11433l[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C11434m[i13];
            case 20:
                return new C11496l[i13];
            case 21:
                return new C11712f[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new Permission[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new ParcelImpl[i13];
            case 24:
                return new C12268l[i13];
            case 25:
                return new C12269m[i13];
            case 26:
                return new C12270n[i13];
            case 27:
                return new C12271o[i13];
            case 28:
                return new C12279w[i13];
            default:
                return new C12274r[i13];
        }
    }
}
