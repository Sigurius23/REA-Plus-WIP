package q30;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.stripe.android.core.model.CountryCode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import nh3.AbstractC26725a;
import p00.C28580q;
import p431qn.C30505a;
import p466rn.C31607a;
import p474s.C31969j0;
import p486sp.C32851b;
import p486sp.C32852c;
import p557vo.AbstractC36220b;
import p599wz.C37718g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import r30.C30897b;
import r30.C30898c;
import r30.C30899d;
import r30.C30900e;
import r30.C30902g;
import r30.C30903h;
import r30.EnumC30896a;
import r30.EnumC30901f;
import r30.EnumC30905j;
import ro.C31616a;
import s00.AbstractC32044g;
import s00.C32040c;
import s00.C32041d;
import s00.C32042e;
import s00.C32043f;
import s40.C32141d;
import s40.C32152g1;
import s40.C32154h0;
import s40.C32159j;
import s40.C32161k;
import s40.C32183v;
import t30.C33517s;
import v00.C35459c0;
import y00.EnumC38853i;

/* JADX INFO: renamed from: q30.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29912j0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122200a;

    public /* synthetic */ C29912j0(int i13) {
        this.f122200a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        switch (this.f122200a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29914k0((AbstractC29894a0) parcel.readParcelable(C29914k0.class.getClassLoader()));
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29916l0(C33517s.CREATOR.createFromParcel(parcel));
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29920n0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29926q0(parcel.readString());
            case 4:
                return new C30505a(parcel);
            case 5:
                int iM115294F = AbstractC36220b.m115294F(parcel);
                String strM115303h = null;
                String strM115303h2 = null;
                String strM115303h3 = null;
                String strM115303h4 = null;
                Uri uri = null;
                String strM115303h5 = null;
                String strM115303h6 = null;
                ArrayList arrayListM115307l = null;
                String strM115303h7 = null;
                String strM115303h8 = null;
                long jM115289A = 0;
                while (parcel.dataPosition() < iM115294F) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            strM115303h = AbstractC36220b.m115303h(parcel, i13);
                            break;
                        case 3:
                            strM115303h2 = AbstractC36220b.m115303h(parcel, i13);
                            break;
                        case 4:
                            strM115303h3 = AbstractC36220b.m115303h(parcel, i13);
                            break;
                        case 5:
                            strM115303h4 = AbstractC36220b.m115303h(parcel, i13);
                            break;
                        case 6:
                            uri = (Uri) AbstractC36220b.m115302g(parcel, i13, Uri.CREATOR);
                            break;
                        case 7:
                            strM115303h5 = AbstractC36220b.m115303h(parcel, i13);
                            break;
                        case '\b':
                            jM115289A = AbstractC36220b.m115289A(parcel, i13);
                            break;
                        case '\t':
                            strM115303h6 = AbstractC36220b.m115303h(parcel, i13);
                            break;
                        case '\n':
                            arrayListM115307l = AbstractC36220b.m115307l(parcel, i13, Scope.CREATOR);
                            break;
                        case 11:
                            strM115303h7 = AbstractC36220b.m115303h(parcel, i13);
                            break;
                        case '\f':
                            strM115303h8 = AbstractC36220b.m115303h(parcel, i13);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i13);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F);
                return new GoogleSignInAccount(strM115303h, strM115303h2, strM115303h3, strM115303h4, uri, strM115303h5, jM115289A, strM115303h6, arrayListM115307l, strM115303h7, strM115303h8);
            case 6:
                int iM115294F2 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayListM115307l2 = null;
                ArrayList arrayListM115307l3 = null;
                Account account = null;
                String strM115303h9 = null;
                String strM115303h10 = null;
                String strM115303h11 = null;
                int iM115317y = 0;
                boolean zM115312t = false;
                boolean zM115312t2 = false;
                boolean zM115312t3 = false;
                while (parcel.dataPosition() < iM115294F2) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            iM115317y = AbstractC36220b.m115317y(parcel, i14);
                            break;
                        case 2:
                            arrayListM115307l3 = AbstractC36220b.m115307l(parcel, i14, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) AbstractC36220b.m115302g(parcel, i14, Account.CREATOR);
                            break;
                        case 4:
                            zM115312t = AbstractC36220b.m115312t(parcel, i14);
                            break;
                        case 5:
                            zM115312t2 = AbstractC36220b.m115312t(parcel, i14);
                            break;
                        case 6:
                            zM115312t3 = AbstractC36220b.m115312t(parcel, i14);
                            break;
                        case 7:
                            strM115303h9 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case '\b':
                            strM115303h10 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case '\t':
                            arrayListM115307l2 = AbstractC36220b.m115307l(parcel, i14, C31616a.CREATOR);
                            break;
                        case '\n':
                            strM115303h11 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i14);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F2);
                return new GoogleSignInOptions(iM115317y, arrayListM115307l3, account, zM115312t, zM115312t2, zM115312t3, strM115303h9, strM115303h10, GoogleSignInOptions.m15585f(arrayListM115307l2), strM115303h11);
            case 7:
                int iM115294F3 = AbstractC36220b.m115294F(parcel);
                String strM115303h12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strM115303h13 = "";
                while (parcel.dataPosition() < iM115294F3) {
                    int i15 = parcel.readInt();
                    char c3 = (char) i15;
                    if (c3 == 4) {
                        strM115303h12 = AbstractC36220b.m115303h(parcel, i15);
                    } else if (c3 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC36220b.m115302g(parcel, i15, GoogleSignInAccount.CREATOR);
                    } else if (c3 != '\b') {
                        AbstractC36220b.m115293E(parcel, i15);
                    } else {
                        strM115303h13 = AbstractC36220b.m115303h(parcel, i15);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F3);
                return new SignInAccount(strM115303h12, googleSignInAccount, strM115303h13);
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                C29926q0 c29926q0CreateFromParcel = C29926q0.CREATOR.createFromParcel(parcel);
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                EnumC30896a enumC30896aValueOf = parcel.readInt() == 0 ? null : EnumC30896a.valueOf(parcel.readString());
                String string6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i16 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i16);
                    int iM79498b = 0;
                    while (iM79498b != i16) {
                        iM79498b = AbstractC26725a.m79498b(C30903h.CREATOR, parcel, arrayList4, iM79498b, 1);
                    }
                    arrayList = arrayList4;
                }
                return new C30897b(string, string2, string3, c29926q0CreateFromParcel, string4, string5, enumC30896aValueOf, string6, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C30898c(parcel.readString(), parcel.readString());
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                EnumC30905j enumC30905jValueOf = parcel.readInt() == 0 ? null : EnumC30905j.valueOf(parcel.readString());
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                boolean z13 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i17 = parcel.readInt();
                    arrayList2 = new ArrayList(i17);
                    int iM79498b2 = 0;
                    while (iM79498b2 != i17) {
                        iM79498b2 = AbstractC26725a.m79498b(C30898c.CREATOR, parcel, arrayList2, iM79498b2, 1);
                        i17 = i17;
                    }
                }
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                C30899d c30899dCreateFromParcel = parcel.readInt() == 0 ? null : C30899d.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int i18 = parcel.readInt();
                    arrayList3 = new ArrayList(i18);
                    int iM79498b3 = 0;
                    while (iM79498b3 != i18) {
                        iM79498b3 = AbstractC26725a.m79498b(C30903h.CREATOR, parcel, arrayList3, iM79498b3, 1);
                        i18 = i18;
                        string7 = string7;
                    }
                }
                return new C30900e(string7, string8, string9, string10, enumC30905jValueOf, z4, string11, string12, string13, string14, z13, arrayList2, string15, string16, c30899dCreateFromParcel, arrayList3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C30899d.CREATOR.createFromParcel(parcel), parcel.readString(), C29926q0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C30899d(parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C30902g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EnumC30901f.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? C29926q0.CREATOR.createFromParcel(parcel) : null);
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                boolean z14 = parcel.readInt() != 0;
                int i19 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i19);
                for (int i24 = 0; i24 != i19; i24++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new C30903h(z14, string17, string18, linkedHashMap);
            case 14:
                return new C31607a(parcel);
            case 15:
                int iM115294F4 = AbstractC36220b.m115294F(parcel);
                Bundle bundleM115298c = null;
                int iM115317y2 = 0;
                int iM115317y3 = 0;
                while (parcel.dataPosition() < iM115294F4) {
                    int i25 = parcel.readInt();
                    char c7 = (char) i25;
                    if (c7 == 1) {
                        iM115317y2 = AbstractC36220b.m115317y(parcel, i25);
                    } else if (c7 == 2) {
                        iM115317y3 = AbstractC36220b.m115317y(parcel, i25);
                    } else if (c7 != 3) {
                        AbstractC36220b.m115293E(parcel, i25);
                    } else {
                        bundleM115298c = AbstractC36220b.m115298c(parcel, i25);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F4);
                return new C31616a(iM115317y2, iM115317y3, bundleM115298c);
            case 16:
                int iM115294F5 = AbstractC36220b.m115294F(parcel);
                String strM115303h14 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iM115294F5) {
                    int i26 = parcel.readInt();
                    char c14 = (char) i26;
                    if (c14 == 2) {
                        strM115303h14 = AbstractC36220b.m115303h(parcel, i26);
                    } else if (c14 != 5) {
                        AbstractC36220b.m115293E(parcel, i26);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) AbstractC36220b.m115302g(parcel, i26, GoogleSignInOptions.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F5);
                return new SignInConfiguration(strM115303h14, googleSignInOptions);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C31969j0 c31969j0 = new C31969j0(parcel);
                c31969j0.f132728w = parcel.readByte() != 0;
                return c31969j0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C32040c((AbstractC32044g) parcel.readParcelable(C32040c.class.getClassLoader()));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C32041d.f132915w;
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C32042e((C28580q) parcel.readParcelable(C32042e.class.getClassLoader()), (C37718g0) parcel.readParcelable(C32042e.class.getClassLoader()), (C35459c0) parcel.readParcelable(C32042e.class.getClassLoader()));
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C32043f.f132919w;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C32141d(parcel.readString(), parcel.readString());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C32159j(parcel.readParcelable(C32159j.class.getClassLoader()), C32161k.CREATOR.createFromParcel(parcel));
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                boolean z15 = parcel.readInt() != 0;
                boolean z16 = parcel.readInt() != 0;
                EnumC38853i enumC38853iValueOf = EnumC38853i.valueOf(parcel.readString());
                EnumC38853i enumC38853iValueOf2 = parcel.readInt() == 0 ? null : EnumC38853i.valueOf(parcel.readString());
                int i27 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i27);
                for (int i28 = 0; i28 != i27; i28++) {
                    arrayList5.add(EnumC38853i.valueOf(parcel.readString()));
                }
                int i29 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i29);
                for (int i34 = 0; i34 != i29; i34++) {
                    arrayList6.add(EnumC38853i.valueOf(parcel.readString()));
                }
                return new C32161k(z15, z16, enumC38853iValueOf, enumC38853iValueOf2, arrayList5, arrayList6, parcel.readInt() != 0, parcel.readInt() != 0);
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C32183v(parcel.readParcelable(C32183v.class.getClassLoader()), parcel.readInt() != 0);
            case 26:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C32154h0((CountryCode) parcel.readParcelable(C32154h0.class.getClassLoader()), parcel.readParcelable(C32154h0.class.getClassLoader()));
            case 27:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C32152g1(parcel.readParcelable(C32152g1.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            case 28:
                int iM115294F6 = AbstractC36220b.m115294F(parcel);
                byte[] bArrM115299d = null;
                while (parcel.dataPosition() < iM115294F6) {
                    int i35 = parcel.readInt();
                    if (((char) i35) != 2) {
                        AbstractC36220b.m115293E(parcel, i35);
                    } else {
                        bArrM115299d = AbstractC36220b.m115299d(parcel, i35);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F6);
                return new C32851b(bArrM115299d);
            default:
                int iM115294F7 = AbstractC36220b.m115294F(parcel);
                byte[] bArrM115299d2 = null;
                while (parcel.dataPosition() < iM115294F7) {
                    int i36 = parcel.readInt();
                    if (((char) i36) != 2) {
                        AbstractC36220b.m115293E(parcel, i36);
                    } else {
                        bArrM115299d2 = AbstractC36220b.m115299d(parcel, i36);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F7);
                return new C32852c(bArrM115299d2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f122200a) {
            case 0:
                return new C29914k0[i13];
            case 1:
                return new C29916l0[i13];
            case 2:
                return new C29920n0[i13];
            case 3:
                return new C29926q0[i13];
            case 4:
                return new C30505a[i13];
            case 5:
                return new GoogleSignInAccount[i13];
            case 6:
                return new GoogleSignInOptions[i13];
            case 7:
                return new SignInAccount[i13];
            case 8:
                return new C30897b[i13];
            case 9:
                return new C30898c[i13];
            case 10:
                return new C30900e[i13];
            case 11:
                return new C30899d[i13];
            case 12:
                return new C30902g[i13];
            case 13:
                return new C30903h[i13];
            case 14:
                return new C31607a[i13];
            case 15:
                return new C31616a[i13];
            case 16:
                return new SignInConfiguration[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C31969j0[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C32040c[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C32041d[i13];
            case 20:
                return new C32042e[i13];
            case 21:
                return new C32043f[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C32141d[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C32159j[i13];
            case 24:
                return new C32161k[i13];
            case 25:
                return new C32183v[i13];
            case 26:
                return new C32154h0[i13];
            case 27:
                return new C32152g1[i13];
            case 28:
                return new C32851b[i13];
            default:
                return new C32852c[i13];
        }
    }
}
