package pn;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import com.mapbox.maps.ScreenCoordinate;
import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.CashBalance;
import com.stripe.android.financialconnections.model.CreditBalance;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.ManualEntry;
import com.stripe.android.financialconnections.model.ManualEntryMode;
import gp.C16051q;
import h20.C16661g3;
import j00.AbstractC21106i0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import nh3.AbstractC26725a;
import p402po.C29384a;
import p402po.C29385b;
import p402po.C29386c;
import p402po.C29387d;
import p402po.C29388e;
import p402po.C29389f;
import p402po.C29390g;
import p402po.C29391h;
import p402po.C29392i;
import p402po.C29393j;
import p402po.C29394k;
import p406pv.C29573b;
import p557vo.AbstractC36220b;
import p599wz.AbstractC37760u0;
import p599wz.EnumC37721h0;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q10.C29790a;
import q20.C29810c;
import q20.C29818g;
import q20.C29822i;
import q20.C29824j;
import q20.C29828m;
import q20.C29829n;
import q20.C29830o;
import q20.EnumC29820h;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38809d5;
import y00.C38864j0;
import y00.C38977v3;
import y00.EnumC38853i;

/* JADX INFO: renamed from: pn.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C29367a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f119120a;

    public /* synthetic */ C29367a(int i13) {
        this.f119120a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        char c3;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        float f13;
        boolean z16;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        switch (this.f119120a) {
            case 0:
                return new C29368b(parcel);
            case 1:
                return new C29372f(parcel);
            case 2:
                return new C29373g();
            case 3:
                return new C29376j(parcel);
            case 4:
                return new C29377k(parcel.readLong(), parcel.readLong());
            case 5:
                int iM115294F = AbstractC36220b.m115294F(parcel);
                boolean zM115312t = false;
                int iM115317y = 0;
                boolean zM115312t2 = false;
                C29387d c29387d = null;
                C29384a c29384a = null;
                String strM115303h = null;
                C29386c c29386c = null;
                C29385b c29385b = null;
                while (parcel.dataPosition() < iM115294F) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            c29387d = (C29387d) AbstractC36220b.m115302g(parcel, i13, C29387d.CREATOR);
                            break;
                        case 2:
                            c29384a = (C29384a) AbstractC36220b.m115302g(parcel, i13, C29384a.CREATOR);
                            break;
                        case 3:
                            strM115303h = AbstractC36220b.m115303h(parcel, i13);
                            break;
                        case 4:
                            zM115312t = AbstractC36220b.m115312t(parcel, i13);
                            break;
                        case 5:
                            iM115317y = AbstractC36220b.m115317y(parcel, i13);
                            break;
                        case 6:
                            c29386c = (C29386c) AbstractC36220b.m115302g(parcel, i13, C29386c.CREATOR);
                            break;
                        case 7:
                            c29385b = (C29385b) AbstractC36220b.m115302g(parcel, i13, C29385b.CREATOR);
                            break;
                        case '\b':
                            zM115312t2 = AbstractC36220b.m115312t(parcel, i13);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i13);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F);
                return new C29388e(c29387d, c29384a, strM115303h, zM115312t, iM115317y, c29386c, c29385b, zM115312t2);
            case 6:
                int iM115294F2 = AbstractC36220b.m115294F(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iM115294F2) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        AbstractC36220b.m115293E(parcel, i14);
                    } else {
                        pendingIntent = (PendingIntent) AbstractC36220b.m115302g(parcel, i14, PendingIntent.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F2);
                return new C29389f(pendingIntent);
            case 7:
                int iM115294F3 = AbstractC36220b.m115294F(parcel);
                boolean zM115312t3 = false;
                int iM115317y2 = 0;
                String strM115303h2 = null;
                String strM115303h3 = null;
                String strM115303h4 = null;
                String strM115303h5 = null;
                while (parcel.dataPosition() < iM115294F3) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            strM115303h2 = AbstractC36220b.m115303h(parcel, i15);
                            break;
                        case 2:
                            strM115303h3 = AbstractC36220b.m115303h(parcel, i15);
                            break;
                        case 3:
                            strM115303h4 = AbstractC36220b.m115303h(parcel, i15);
                            break;
                        case 4:
                            strM115303h5 = AbstractC36220b.m115303h(parcel, i15);
                            break;
                        case 5:
                            zM115312t3 = AbstractC36220b.m115312t(parcel, i15);
                            break;
                        case 6:
                            iM115317y2 = AbstractC36220b.m115317y(parcel, i15);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i15);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F3);
                return new C29390g(strM115303h2, strM115303h3, strM115303h4, strM115303h5, zM115312t3, iM115317y2);
            case 8:
                int iM115294F4 = AbstractC36220b.m115294F(parcel);
                boolean zM115312t4 = false;
                boolean zM115312t5 = false;
                boolean zM115312t6 = false;
                String strM115303h6 = null;
                String strM115303h7 = null;
                String strM115303h8 = null;
                ArrayList arrayListM115305j = null;
                while (parcel.dataPosition() < iM115294F4) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            zM115312t4 = AbstractC36220b.m115312t(parcel, i16);
                            break;
                        case 2:
                            strM115303h6 = AbstractC36220b.m115303h(parcel, i16);
                            break;
                        case 3:
                            strM115303h7 = AbstractC36220b.m115303h(parcel, i16);
                            break;
                        case 4:
                            zM115312t5 = AbstractC36220b.m115312t(parcel, i16);
                            break;
                        case 5:
                            strM115303h8 = AbstractC36220b.m115303h(parcel, i16);
                            break;
                        case 6:
                            arrayListM115305j = AbstractC36220b.m115305j(parcel, i16);
                            break;
                        case 7:
                            zM115312t6 = AbstractC36220b.m115312t(parcel, i16);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i16);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F4);
                return new C29384a(zM115312t4, strM115303h6, strM115303h7, zM115312t5, strM115303h8, arrayListM115305j, zM115312t6);
            case 9:
                int iM115294F5 = AbstractC36220b.m115294F(parcel);
                String strM115303h9 = null;
                boolean zM115312t7 = false;
                while (parcel.dataPosition() < iM115294F5) {
                    int i17 = parcel.readInt();
                    char c7 = (char) i17;
                    if (c7 == 1) {
                        zM115312t7 = AbstractC36220b.m115312t(parcel, i17);
                    } else if (c7 != 2) {
                        AbstractC36220b.m115293E(parcel, i17);
                    } else {
                        strM115303h9 = AbstractC36220b.m115303h(parcel, i17);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F5);
                return new C29385b(zM115312t7, strM115303h9);
            case 10:
                int iM115294F6 = AbstractC36220b.m115294F(parcel);
                byte[] bArrM115299d = null;
                boolean zM115312t8 = false;
                String strM115303h10 = null;
                while (parcel.dataPosition() < iM115294F6) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 1) {
                        zM115312t8 = AbstractC36220b.m115312t(parcel, i18);
                    } else if (c14 == 2) {
                        bArrM115299d = AbstractC36220b.m115299d(parcel, i18);
                    } else if (c14 != 3) {
                        AbstractC36220b.m115293E(parcel, i18);
                    } else {
                        strM115303h10 = AbstractC36220b.m115303h(parcel, i18);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F6);
                return new C29386c(zM115312t8, bArrM115299d, strM115303h10);
            case 11:
                int iM115294F7 = AbstractC36220b.m115294F(parcel);
                boolean zM115312t9 = false;
                while (parcel.dataPosition() < iM115294F7) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        AbstractC36220b.m115293E(parcel, i19);
                    } else {
                        zM115312t9 = AbstractC36220b.m115312t(parcel, i19);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F7);
                return new C29387d(zM115312t9);
            case 12:
                int iM115294F8 = AbstractC36220b.m115294F(parcel);
                int iM115317y3 = 0;
                C29394k c29394k = null;
                String strM115303h11 = null;
                while (parcel.dataPosition() < iM115294F8) {
                    int i24 = parcel.readInt();
                    char c15 = (char) i24;
                    if (c15 == 1) {
                        c29394k = (C29394k) AbstractC36220b.m115302g(parcel, i24, C29394k.CREATOR);
                    } else if (c15 == 2) {
                        strM115303h11 = AbstractC36220b.m115303h(parcel, i24);
                    } else if (c15 != 3) {
                        AbstractC36220b.m115293E(parcel, i24);
                    } else {
                        iM115317y3 = AbstractC36220b.m115317y(parcel, i24);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F8);
                return new C29391h(c29394k, strM115303h11, iM115317y3);
            case 13:
                int iM115294F9 = AbstractC36220b.m115294F(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iM115294F9) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        AbstractC36220b.m115293E(parcel, i25);
                    } else {
                        pendingIntent2 = (PendingIntent) AbstractC36220b.m115302g(parcel, i25, PendingIntent.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F9);
                return new C29392i(pendingIntent2);
            case 14:
                int iM115294F10 = AbstractC36220b.m115294F(parcel);
                String strM115303h12 = null;
                String strM115303h13 = null;
                String strM115303h14 = null;
                String strM115303h15 = null;
                Uri uri = null;
                String strM115303h16 = null;
                String strM115303h17 = null;
                String strM115303h18 = null;
                C16051q c16051q = null;
                while (parcel.dataPosition() < iM115294F10) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            strM115303h12 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case 2:
                            strM115303h13 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case 3:
                            strM115303h14 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case 4:
                            strM115303h15 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case 5:
                            uri = (Uri) AbstractC36220b.m115302g(parcel, i26, Uri.CREATOR);
                            break;
                        case 6:
                            strM115303h16 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case 7:
                            strM115303h17 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case '\b':
                            strM115303h18 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case '\t':
                            c16051q = (C16051q) AbstractC36220b.m115302g(parcel, i26, C16051q.CREATOR);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i26);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F10);
                return new C29393j(strM115303h12, strM115303h13, strM115303h14, strM115303h15, uri, strM115303h16, strM115303h17, strM115303h18, c16051q);
            case 15:
                int iM115294F11 = AbstractC36220b.m115294F(parcel);
                String strM115303h19 = null;
                String strM115303h20 = null;
                while (parcel.dataPosition() < iM115294F11) {
                    int i27 = parcel.readInt();
                    char c16 = (char) i27;
                    if (c16 == 1) {
                        strM115303h19 = AbstractC36220b.m115303h(parcel, i27);
                    } else if (c16 != 2) {
                        AbstractC36220b.m115293E(parcel, i27);
                    } else {
                        strM115303h20 = AbstractC36220b.m115303h(parcel, i27);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F11);
                return new C29394k(strM115303h19, strM115303h20);
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                boolean z17 = false;
                boolean z18 = true;
                if (parcel.readInt() != 0) {
                    z17 = true;
                }
                if (parcel.readInt() == 0) {
                    z18 = z17;
                }
                if (parcel.readInt() == 0) {
                    z18 = z17;
                }
                if (parcel.readInt() == 0) {
                    z18 = z17;
                }
                if (parcel.readInt() == 0) {
                    z18 = z17;
                }
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("HORIZONTAL")) {
                    c3 = 1;
                } else if (string.equals("VERTICAL")) {
                    c3 = 2;
                } else {
                    if (!string.equals("HORIZONTAL_AND_VERTICAL")) {
                        throw new IllegalArgumentException("No enum constant com.mapbox.maps.plugin.ScrollMode.".concat(string));
                    }
                    c3 = 3;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                    z13 = true;
                } else {
                    z4 = z18;
                    z13 = z17;
                }
                if (parcel.readInt() == 0) {
                    z4 = z17;
                }
                if (parcel.readInt() == 0) {
                    z4 = z17;
                }
                ScreenCoordinate screenCoordinate = (ScreenCoordinate) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    z14 = z4;
                    z15 = z14;
                } else {
                    z14 = z4;
                    z15 = z17;
                }
                if (parcel.readInt() == 0) {
                    z14 = z17;
                }
                if (parcel.readInt() == 0) {
                    z14 = z17;
                }
                if (parcel.readInt() == 0) {
                    z14 = z17;
                }
                if (parcel.readInt() == 0) {
                    z14 = z17;
                }
                float f14 = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z16 = z14;
                    f13 = f14;
                } else {
                    f13 = f14;
                    z16 = false;
                }
                return new C29573b(z17, z18, z18, z18, z18, c3, z13, z4, z4, screenCoordinate, z15, z14, z14, z14, z14, f13, z16);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new BankAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i28 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(i28);
                    for (int i29 = 0; i29 != i28; i29++) {
                        linkedHashMap3.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                    }
                    linkedHashMap = linkedHashMap3;
                }
                return new CashBalance(linkedHashMap);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    linkedHashMap2 = null;
                } else {
                    int i34 = parcel.readInt();
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(i34);
                    for (int i35 = 0; i35 != i34; i35++) {
                        linkedHashMap4.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                    }
                    linkedHashMap2 = linkedHashMap4;
                }
                return new CreditBalance(linkedHashMap2);
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i36 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i36);
                int iM79498b = 0;
                while (iM79498b != i36) {
                    iM79498b = AbstractC26725a.m79498b(FinancialConnectionsAccount.CREATOR, parcel, arrayList, iM79498b, 1);
                }
                return new FinancialConnectionsAccountList(arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new ManualEntry(ManualEntryMode.valueOf(parcel.readString()));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29790a(C16661g3.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29810c(parcel.readString(), parcel.readString());
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29818g(parcel.readString(), (C38977v3) parcel.readParcelable(C29818g.class.getClassLoader()), (InterfaceC41211c) parcel.readParcelable(C29818g.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29822i(parcel.readString(), (C38977v3) parcel.readParcelable(C29822i.class.getClassLoader()), (InterfaceC41211c) parcel.readParcelable(C29822i.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString());
            case 26:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C29824j.f121906x;
            case 27:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29828m(EnumC37721h0.valueOf(parcel.readString()), (AbstractC37760u0) parcel.readParcelable(C29828m.class.getClassLoader()), (C38864j0) parcel.readParcelable(C29828m.class.getClassLoader()));
            case 28:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29829n((C38809d5) parcel.readParcelable(C29829n.class.getClassLoader()), EnumC38853i.valueOf(parcel.readString()), EnumC29820h.valueOf(parcel.readString()), (AbstractC38970u5) parcel.readParcelable(C29829n.class.getClassLoader()), (AbstractC38869j5) parcel.readParcelable(C29829n.class.getClassLoader()), (AbstractC21106i0) parcel.readParcelable(C29829n.class.getClassLoader()));
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29830o((InterfaceC41211c) parcel.readParcelable(C29830o.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), (C38809d5) parcel.readParcelable(C29830o.class.getClassLoader()), EnumC29820h.valueOf(parcel.readString()), (AbstractC38970u5) parcel.readParcelable(C29830o.class.getClassLoader()), (AbstractC38869j5) parcel.readParcelable(C29830o.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f119120a) {
            case 0:
                return new C29368b[i13];
            case 1:
                return new C29372f[i13];
            case 2:
                return new C29373g[i13];
            case 3:
                return new C29376j[i13];
            case 4:
                return new C29377k[i13];
            case 5:
                return new C29388e[i13];
            case 6:
                return new C29389f[i13];
            case 7:
                return new C29390g[i13];
            case 8:
                return new C29384a[i13];
            case 9:
                return new C29385b[i13];
            case 10:
                return new C29386c[i13];
            case 11:
                return new C29387d[i13];
            case 12:
                return new C29391h[i13];
            case 13:
                return new C29392i[i13];
            case 14:
                return new C29393j[i13];
            case 15:
                return new C29394k[i13];
            case 16:
                return new C29573b[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new BankAccount[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new CashBalance[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new CreditBalance[i13];
            case 20:
                return new FinancialConnectionsAccountList[i13];
            case 21:
                return new ManualEntry[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C29790a[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C29810c[i13];
            case 24:
                return new C29818g[i13];
            case 25:
                return new C29822i[i13];
            case 26:
                return new C29824j[i13];
            case 27:
                return new C29828m[i13];
            case 28:
                return new C29829n[i13];
            default:
                return new C29830o[i13];
        }
    }
}
