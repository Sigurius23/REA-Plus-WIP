package androidx.fragment.app;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kh.C22467a;
import nd3.C26591a;
import p114eb.C12984r;
import p426qi.C30381f;
import p529uo.C35110d0;
import p529uo.C35113f;
import p529uo.C35115g;
import p529uo.C35124l;
import p557vo.AbstractC36220b;
import p557vo.AbstractC36221c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1337q1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5777a;

    public /* synthetic */ C1337q1(int i13) {
        this.f5777a = i13;
    }

    /* JADX INFO: renamed from: a */
    public static void m4208a(C35115g c35115g, Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        int i14 = c35115g.f149023w;
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(i14);
        int i15 = c35115g.f149024x;
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(i15);
        int i16 = c35115g.f149025y;
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(i16);
        AbstractC36221c.m115332m(parcel, 4, c35115g.f149026z);
        AbstractC36221c.m115327h(parcel, 5, c35115g.f149013E);
        AbstractC36221c.m115335p(parcel, 6, c35115g.f149014F, i13);
        AbstractC36221c.m115324e(parcel, 7, c35115g.f149015G);
        AbstractC36221c.m115331l(parcel, 8, c35115g.f149016H, i13);
        AbstractC36221c.m115335p(parcel, 10, c35115g.f149017I, i13);
        AbstractC36221c.m115335p(parcel, 11, c35115g.f149018J, i13);
        boolean z4 = c35115g.f149019K;
        AbstractC36221c.m115337r(parcel, 12, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i17 = c35115g.f149020L;
        AbstractC36221c.m115337r(parcel, 13, 4);
        parcel.writeInt(i17);
        boolean z13 = c35115g.f149021M;
        AbstractC36221c.m115337r(parcel, 14, 4);
        parcel.writeInt(z13 ? 1 : 0);
        AbstractC36221c.m115332m(parcel, 15, c35115g.f149022N);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel inParcel) {
        switch (this.f5777a) {
            case 0:
                C1341r1 c1341r1 = new C1341r1();
                c1341r1.f5782E = null;
                c1341r1.f5783F = new ArrayList();
                c1341r1.f5784G = new ArrayList();
                c1341r1.f5786w = inParcel.createStringArrayList();
                c1341r1.f5787x = inParcel.createStringArrayList();
                c1341r1.f5788y = (C1275b[]) inParcel.createTypedArray(C1275b.CREATOR);
                c1341r1.f5789z = inParcel.readInt();
                c1341r1.f5782E = inParcel.readString();
                c1341r1.f5783F = inParcel.createStringArrayList();
                c1341r1.f5784G = inParcel.createTypedArrayList(C1279c.CREATOR);
                c1341r1.f5785H = inParcel.createTypedArrayList(C1305i1.CREATOR);
                return c1341r1;
            case 1:
                return new C1360x1(inParcel);
            case 2:
                int iM115294F = AbstractC36220b.m115294F(inParcel);
                String strM115303h = null;
                C4969a c4969a = null;
                int iM115317y = 0;
                PendingIntent pendingIntent = null;
                while (inParcel.dataPosition() < iM115294F) {
                    int i13 = inParcel.readInt();
                    char c3 = (char) i13;
                    if (c3 == 1) {
                        iM115317y = AbstractC36220b.m115317y(inParcel, i13);
                    } else if (c3 == 2) {
                        strM115303h = AbstractC36220b.m115303h(inParcel, i13);
                    } else if (c3 == 3) {
                        pendingIntent = (PendingIntent) AbstractC36220b.m115302g(inParcel, i13, PendingIntent.CREATOR);
                    } else if (c3 != 4) {
                        AbstractC36220b.m115293E(inParcel, i13);
                    } else {
                        c4969a = (C4969a) AbstractC36220b.m115302g(inParcel, i13, C4969a.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(inParcel, iM115294F);
                return new Status(iM115317y, strM115303h, pendingIntent, c4969a);
            case 3:
                int iM115294F2 = AbstractC36220b.m115294F(inParcel);
                PendingIntent pendingIntent2 = null;
                int iM115317y2 = 0;
                int iM115317y3 = 0;
                String strM115303h2 = null;
                while (inParcel.dataPosition() < iM115294F2) {
                    int i14 = inParcel.readInt();
                    char c7 = (char) i14;
                    if (c7 == 1) {
                        iM115317y2 = AbstractC36220b.m115317y(inParcel, i14);
                    } else if (c7 == 2) {
                        iM115317y3 = AbstractC36220b.m115317y(inParcel, i14);
                    } else if (c7 == 3) {
                        pendingIntent2 = (PendingIntent) AbstractC36220b.m115302g(inParcel, i14, PendingIntent.CREATOR);
                    } else if (c7 != 4) {
                        AbstractC36220b.m115293E(inParcel, i14);
                    } else {
                        strM115303h2 = AbstractC36220b.m115303h(inParcel, i14);
                    }
                }
                AbstractC36220b.m115308m(inParcel, iM115294F2);
                return new C4969a(iM115317y2, iM115317y3, pendingIntent2, strM115303h2);
            case 4:
                int iM115294F3 = AbstractC36220b.m115294F(inParcel);
                long jM115289A = -1;
                int iM115317y4 = 0;
                String strM115303h3 = null;
                while (inParcel.dataPosition() < iM115294F3) {
                    int i15 = inParcel.readInt();
                    char c14 = (char) i15;
                    if (c14 == 1) {
                        strM115303h3 = AbstractC36220b.m115303h(inParcel, i15);
                    } else if (c14 == 2) {
                        iM115317y4 = AbstractC36220b.m115317y(inParcel, i15);
                    } else if (c14 != 3) {
                        AbstractC36220b.m115293E(inParcel, i15);
                    } else {
                        jM115289A = AbstractC36220b.m115289A(inParcel, i15);
                    }
                }
                AbstractC36220b.m115308m(inParcel, iM115294F3);
                return new C4986c(strM115303h3, iM115317y4, jM115289A);
            case 5:
                AbstractC22676k.m65750j(inParcel, "inParcel");
                return new C12984r(inParcel);
            case 6:
                String string = inParcel.readString();
                AbstractC22676k.m65747g(string);
                int i16 = inParcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i16);
                for (int i17 = 0; i17 < i16; i17++) {
                    String string2 = inParcel.readString();
                    AbstractC22676k.m65747g(string2);
                    String string3 = inParcel.readString();
                    AbstractC22676k.m65747g(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new C22467a(string, linkedHashMap);
            case 7:
                C26591a c26591a = new C26591a();
                c26591a.f105756w = inParcel.createByteArray();
                return c26591a;
            case 8:
                C30381f c30381f = new C30381f(inParcel);
                c30381f.f124663w = inParcel.readString();
                c30381f.f124665y = inParcel.readFloat();
                c30381f.f124666z = inParcel.readInt() == 1;
                c30381f.f124660E = inParcel.readString();
                c30381f.f124661F = inParcel.readInt();
                c30381f.f124662G = inParcel.readInt();
                return c30381f;
            case 9:
                int iM115294F4 = AbstractC36220b.m115294F(inParcel);
                int iM115317y5 = 0;
                boolean zM115312t = false;
                boolean zM115312t2 = false;
                int iM115317y6 = 0;
                int iM115317y7 = 0;
                while (inParcel.dataPosition() < iM115294F4) {
                    int i18 = inParcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        iM115317y5 = AbstractC36220b.m115317y(inParcel, i18);
                    } else if (c15 == 2) {
                        zM115312t = AbstractC36220b.m115312t(inParcel, i18);
                    } else if (c15 == 3) {
                        zM115312t2 = AbstractC36220b.m115312t(inParcel, i18);
                    } else if (c15 == 4) {
                        iM115317y6 = AbstractC36220b.m115317y(inParcel, i18);
                    } else if (c15 != 5) {
                        AbstractC36220b.m115293E(inParcel, i18);
                    } else {
                        iM115317y7 = AbstractC36220b.m115317y(inParcel, i18);
                    }
                }
                AbstractC36220b.m115308m(inParcel, iM115294F4);
                return new C35124l(iM115317y5, zM115312t, zM115312t2, iM115317y6, iM115317y7);
            case 10:
                int iM115294F5 = AbstractC36220b.m115294F(inParcel);
                Bundle bundleM115298c = null;
                C35113f c35113f = null;
                int iM115317y8 = 0;
                C4986c[] c4986cArr = null;
                while (inParcel.dataPosition() < iM115294F5) {
                    int i19 = inParcel.readInt();
                    char c16 = (char) i19;
                    if (c16 == 1) {
                        bundleM115298c = AbstractC36220b.m115298c(inParcel, i19);
                    } else if (c16 == 2) {
                        c4986cArr = (C4986c[]) AbstractC36220b.m115306k(inParcel, i19, C4986c.CREATOR);
                    } else if (c16 == 3) {
                        iM115317y8 = AbstractC36220b.m115317y(inParcel, i19);
                    } else if (c16 != 4) {
                        AbstractC36220b.m115293E(inParcel, i19);
                    } else {
                        c35113f = (C35113f) AbstractC36220b.m115302g(inParcel, i19, C35113f.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(inParcel, iM115294F5);
                C35110d0 c35110d0 = new C35110d0();
                c35110d0.f148988w = bundleM115298c;
                c35110d0.f148989x = c4986cArr;
                c35110d0.f148990y = iM115317y8;
                c35110d0.f148991z = c35113f;
                return c35110d0;
            default:
                int iM115294F6 = AbstractC36220b.m115294F(inParcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = C35115g.f149011O;
                String strM115303h4 = null;
                IBinder iBinderM115316x = null;
                Account account = null;
                String strM115303h5 = null;
                int iM115317y9 = 0;
                int iM115317y10 = 0;
                int iM115317y11 = 0;
                boolean zM115312t3 = false;
                int iM115317y12 = 0;
                boolean zM115312t4 = false;
                C4986c[] c4986cArr2 = C35115g.f149012P;
                C4986c[] c4986cArr3 = c4986cArr2;
                while (inParcel.dataPosition() < iM115294F6) {
                    int i24 = inParcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            iM115317y9 = AbstractC36220b.m115317y(inParcel, i24);
                            break;
                        case 2:
                            iM115317y10 = AbstractC36220b.m115317y(inParcel, i24);
                            break;
                        case 3:
                            iM115317y11 = AbstractC36220b.m115317y(inParcel, i24);
                            break;
                        case 4:
                            strM115303h4 = AbstractC36220b.m115303h(inParcel, i24);
                            break;
                        case 5:
                            iBinderM115316x = AbstractC36220b.m115316x(inParcel, i24);
                            break;
                        case 6:
                            scopeArr = (Scope[]) AbstractC36220b.m115306k(inParcel, i24, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = AbstractC36220b.m115298c(inParcel, i24);
                            break;
                        case '\b':
                            account = (Account) AbstractC36220b.m115302g(inParcel, i24, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            AbstractC36220b.m115293E(inParcel, i24);
                            break;
                        case '\n':
                            c4986cArr2 = (C4986c[]) AbstractC36220b.m115306k(inParcel, i24, C4986c.CREATOR);
                            break;
                        case 11:
                            c4986cArr3 = (C4986c[]) AbstractC36220b.m115306k(inParcel, i24, C4986c.CREATOR);
                            break;
                        case '\f':
                            zM115312t3 = AbstractC36220b.m115312t(inParcel, i24);
                            break;
                        case '\r':
                            iM115317y12 = AbstractC36220b.m115317y(inParcel, i24);
                            break;
                        case 14:
                            zM115312t4 = AbstractC36220b.m115312t(inParcel, i24);
                            break;
                        case 15:
                            strM115303h5 = AbstractC36220b.m115303h(inParcel, i24);
                            break;
                    }
                }
                AbstractC36220b.m115308m(inParcel, iM115294F6);
                return new C35115g(iM115317y9, iM115317y10, iM115317y11, strM115303h4, iBinderM115316x, scopeArr, bundle, account, c4986cArr2, c4986cArr3, zM115312t3, iM115317y12, zM115312t4, strM115303h5);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f5777a) {
            case 0:
                return new C1341r1[i13];
            case 1:
                return new C1360x1[i13];
            case 2:
                return new Status[i13];
            case 3:
                return new C4969a[i13];
            case 4:
                return new C4986c[i13];
            case 5:
                return new C12984r[i13];
            case 6:
                return new C22467a[i13];
            case 7:
                return new C26591a[i13];
            case 8:
                return new C30381f[i13];
            case 9:
                return new C35124l[i13];
            case 10:
                return new C35110d0[i13];
            default:
                return new C35115g[i13];
        }
    }
}
