package p096dq;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1456e2;
import androidx.health.platform.client.proto.C1466g2;
import androidx.health.platform.client.proto.C1476i2;
import androidx.health.platform.client.proto.C1486k2;
import androidx.health.platform.client.proto.C1496m2;
import androidx.health.platform.client.proto.C1506o2;
import androidx.health.platform.client.proto.C1533u;
import androidx.health.platform.client.proto.InterfaceC1544w0;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import e10.C12546g0;
import e10.C12553k;
import e10.C12558m0;
import e10.C12572t0;
import e10.C12574u0;
import e10.InterfaceC12555l;
import gq.C16073b;
import gq.C16074c;
import gq.C16076e;
import gq.C16077f;
import gq.C16078g;
import gq.C16079h;
import java.util.ArrayList;
import n10.EnumC26121c0;
import p031b9.AbstractC2875y;
import p084d8.C11764a;
import p102dy.C12435d;
import p102dy.C12436e;
import p102dy.C12438g;
import p111e8.C12808a;
import p111e8.C12809b;
import p111e8.C12810c;
import p111e8.C12811d;
import p111e8.C12812e;
import p111e8.C12813f;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36220b;
import p575w7.AbstractC36868a;
import p575w7.C36869b;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35459c0;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38797c3;
import y00.C38809d5;
import y00.C38915o4;

/* JADX INFO: renamed from: dq.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C12280x implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41125a;

    public /* synthetic */ C12280x(int i13) {
        this.f41125a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f41125a) {
            case 0:
                int iM115294F = AbstractC36220b.m115294F(parcel);
                String strM115303h = null;
                int iM115317y = 0;
                String strM115303h2 = null;
                while (parcel.dataPosition() < iM115294F) {
                    int i13 = parcel.readInt();
                    char c3 = (char) i13;
                    if (c3 == 1) {
                        iM115317y = AbstractC36220b.m115317y(parcel, i13);
                    } else if (c3 == 2) {
                        strM115303h = AbstractC36220b.m115303h(parcel, i13);
                    } else if (c3 != 3) {
                        AbstractC36220b.m115293E(parcel, i13);
                    } else {
                        strM115303h2 = AbstractC36220b.m115303h(parcel, i13);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F);
                C12275s c12275s = new C12275s();
                c12275s.f41102w = iM115317y;
                c12275s.f41103x = strM115303h;
                c12275s.f41104y = strM115303h2;
                return c12275s;
            case 1:
                int iM115294F2 = AbstractC36220b.m115294F(parcel);
                String strM115303h3 = null;
                Bundle bundleM115298c = null;
                while (parcel.dataPosition() < iM115294F2) {
                    int i14 = parcel.readInt();
                    char c7 = (char) i14;
                    if (c7 == 2) {
                        strM115303h3 = AbstractC36220b.m115303h(parcel, i14);
                    } else if (c7 != 3) {
                        AbstractC36220b.m115293E(parcel, i14);
                    } else {
                        bundleM115298c = AbstractC36220b.m115298c(parcel, i14);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F2);
                C12282z c12282z = new C12282z();
                c12282z.f41127w = strM115303h3;
                c12282z.f41128x = bundleM115298c;
                return c12282z;
            case 2:
                int iM115294F3 = AbstractC36220b.m115294F(parcel);
                String strM115303h4 = null;
                String strM115303h5 = null;
                String strM115303h6 = null;
                String strM115303h7 = null;
                String strM115303h8 = null;
                String strM115303h9 = null;
                String strM115303h10 = null;
                String strM115303h11 = null;
                String strM115303h12 = null;
                boolean zM115312t = false;
                String strM115303h13 = null;
                while (parcel.dataPosition() < iM115294F3) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            strM115303h4 = AbstractC36220b.m115303h(parcel, i15);
                            break;
                        case 3:
                            strM115303h13 = AbstractC36220b.m115303h(parcel, i15);
                            break;
                        case 4:
                            strM115303h5 = AbstractC36220b.m115303h(parcel, i15);
                            break;
                        case 5:
                            strM115303h6 = AbstractC36220b.m115303h(parcel, i15);
                            break;
                        case 6:
                            strM115303h7 = AbstractC36220b.m115303h(parcel, i15);
                            break;
                        case 7:
                            strM115303h8 = AbstractC36220b.m115303h(parcel, i15);
                            break;
                        case '\b':
                            strM115303h9 = AbstractC36220b.m115303h(parcel, i15);
                            break;
                        case '\t':
                            strM115303h10 = AbstractC36220b.m115303h(parcel, i15);
                            break;
                        case '\n':
                            strM115303h11 = AbstractC36220b.m115303h(parcel, i15);
                            break;
                        case 11:
                            zM115312t = AbstractC36220b.m115312t(parcel, i15);
                            break;
                        case '\f':
                            strM115303h12 = AbstractC36220b.m115303h(parcel, i15);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i15);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F3);
                C12278v c12278v = new C12278v();
                c12278v.f41117w = strM115303h4;
                c12278v.f41118x = strM115303h13;
                c12278v.f41119y = strM115303h5;
                c12278v.f41120z = strM115303h6;
                c12278v.f41110E = strM115303h7;
                c12278v.f41111F = strM115303h8;
                c12278v.f41112G = strM115303h9;
                c12278v.f41113H = strM115303h10;
                c12278v.f41114I = strM115303h11;
                c12278v.f41115J = zM115312t;
                c12278v.f41116K = strM115303h12;
                return c12278v;
            case 3:
                int iM115294F4 = AbstractC36220b.m115294F(parcel);
                String strM115303h14 = null;
                String strM115303h15 = null;
                UserAddress userAddress = null;
                int iM115317y2 = 0;
                String strM115303h16 = null;
                while (parcel.dataPosition() < iM115294F4) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 1) {
                        strM115303h14 = AbstractC36220b.m115303h(parcel, i16);
                    } else if (c14 == 2) {
                        strM115303h16 = AbstractC36220b.m115303h(parcel, i16);
                    } else if (c14 == 3) {
                        strM115303h15 = AbstractC36220b.m115303h(parcel, i16);
                    } else if (c14 == 4) {
                        iM115317y2 = AbstractC36220b.m115317y(parcel, i16);
                    } else if (c14 != 5) {
                        AbstractC36220b.m115293E(parcel, i16);
                    } else {
                        userAddress = (UserAddress) AbstractC36220b.m115302g(parcel, i16, UserAddress.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F4);
                C12258b c12258b = new C12258b();
                c12258b.f41028w = strM115303h14;
                c12258b.f41029x = strM115303h16;
                c12258b.f41030y = strM115303h15;
                c12258b.f41031z = iM115317y2;
                c12258b.f41027E = userAddress;
                return c12258b;
            case 4:
                int iM115294F5 = AbstractC36220b.m115294F(parcel);
                boolean zM115312t2 = false;
                boolean zM115312t3 = true;
                ArrayList arrayListM115301f = null;
                int iM115317y3 = 0;
                while (parcel.dataPosition() < iM115294F5) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 1) {
                        arrayListM115301f = AbstractC36220b.m115301f(parcel, i17);
                    } else if (c15 == 2) {
                        zM115312t3 = AbstractC36220b.m115312t(parcel, i17);
                    } else if (c15 == 3) {
                        zM115312t2 = AbstractC36220b.m115312t(parcel, i17);
                    } else if (c15 != 4) {
                        AbstractC36220b.m115293E(parcel, i17);
                    } else {
                        iM115317y3 = AbstractC36220b.m115317y(parcel, i17);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F5);
                C12259c c12259c = new C12259c();
                c12259c.f41032w = arrayListM115301f;
                c12259c.f41033x = zM115312t3;
                c12259c.f41034y = zM115312t2;
                c12259c.f41035z = iM115317y3;
                return c12259c;
            case 5:
                int iM115294F6 = AbstractC36220b.m115294F(parcel);
                int iM115317y4 = 0;
                int iM115317y5 = 0;
                while (parcel.dataPosition() < iM115294F6) {
                    int i18 = parcel.readInt();
                    char c16 = (char) i18;
                    if (c16 == 1) {
                        iM115317y4 = AbstractC36220b.m115317y(parcel, i18);
                    } else if (c16 != 2) {
                        AbstractC36220b.m115293E(parcel, i18);
                    } else {
                        iM115317y5 = AbstractC36220b.m115317y(parcel, i18);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F6);
                C12260d c12260d = new C12260d();
                c12260d.f41036w = iM115317y4;
                c12260d.f41037x = iM115317y5;
                return c12260d;
            case 6:
                int iM115294F7 = AbstractC36220b.m115294F(parcel);
                String strM115303h17 = null;
                String strM115303h18 = null;
                C12279w c12279w = null;
                String strM115303h19 = null;
                C12278v c12278v2 = null;
                C12278v c12278v3 = null;
                String[] strArrM115304i = null;
                UserAddress userAddress2 = null;
                UserAddress userAddress3 = null;
                C12261e[] c12261eArr = null;
                C12270n c12270n = null;
                while (parcel.dataPosition() < iM115294F7) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            strM115303h17 = AbstractC36220b.m115303h(parcel, i19);
                            break;
                        case 3:
                            strM115303h18 = AbstractC36220b.m115303h(parcel, i19);
                            break;
                        case 4:
                            c12279w = (C12279w) AbstractC36220b.m115302g(parcel, i19, C12279w.CREATOR);
                            break;
                        case 5:
                            strM115303h19 = AbstractC36220b.m115303h(parcel, i19);
                            break;
                        case 6:
                            c12278v2 = (C12278v) AbstractC36220b.m115302g(parcel, i19, C12278v.CREATOR);
                            break;
                        case 7:
                            c12278v3 = (C12278v) AbstractC36220b.m115302g(parcel, i19, C12278v.CREATOR);
                            break;
                        case '\b':
                            strArrM115304i = AbstractC36220b.m115304i(parcel, i19);
                            break;
                        case '\t':
                            userAddress2 = (UserAddress) AbstractC36220b.m115302g(parcel, i19, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress3 = (UserAddress) AbstractC36220b.m115302g(parcel, i19, UserAddress.CREATOR);
                            break;
                        case 11:
                            c12261eArr = (C12261e[]) AbstractC36220b.m115306k(parcel, i19, C12261e.CREATOR);
                            break;
                        case '\f':
                            c12270n = (C12270n) AbstractC36220b.m115302g(parcel, i19, C12270n.CREATOR);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i19);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F7);
                FullWallet fullWallet = new FullWallet();
                fullWallet.f20635w = strM115303h17;
                fullWallet.f20636x = strM115303h18;
                fullWallet.f20637y = c12279w;
                fullWallet.f20638z = strM115303h19;
                fullWallet.f20628E = c12278v2;
                fullWallet.f20629F = c12278v3;
                fullWallet.f20630G = strArrM115304i;
                fullWallet.f20631H = userAddress2;
                fullWallet.f20632I = userAddress3;
                fullWallet.f20633J = c12261eArr;
                fullWallet.f20634K = c12270n;
                return fullWallet;
            case 7:
                int iM115294F8 = AbstractC36220b.m115294F(parcel);
                int iM115317y6 = 0;
                String strM115303h20 = null;
                String strM115303h21 = null;
                while (parcel.dataPosition() < iM115294F8) {
                    int i24 = parcel.readInt();
                    char c17 = (char) i24;
                    if (c17 == 2) {
                        strM115303h20 = AbstractC36220b.m115303h(parcel, i24);
                    } else if (c17 == 3) {
                        strM115303h21 = AbstractC36220b.m115303h(parcel, i24);
                    } else if (c17 != 4) {
                        AbstractC36220b.m115293E(parcel, i24);
                    } else {
                        iM115317y6 = AbstractC36220b.m115317y(parcel, i24);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F8);
                C12261e c12261e = new C12261e();
                c12261e.f41038w = strM115303h20;
                c12261e.f41039x = strM115303h21;
                c12261e.f41040y = iM115317y6;
                return c12261e;
            case 8:
                int iM115294F9 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayListM115301f2 = null;
                String strM115303h22 = null;
                ArrayList arrayListM115301f3 = null;
                String strM115303h23 = null;
                boolean zM115312t4 = false;
                String strM115303h24 = null;
                while (parcel.dataPosition() < iM115294F9) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 2:
                            arrayListM115301f2 = AbstractC36220b.m115301f(parcel, i25);
                            break;
                        case 3:
                        default:
                            AbstractC36220b.m115293E(parcel, i25);
                            break;
                        case 4:
                            strM115303h24 = AbstractC36220b.m115303h(parcel, i25);
                            break;
                        case 5:
                            strM115303h22 = AbstractC36220b.m115303h(parcel, i25);
                            break;
                        case 6:
                            arrayListM115301f3 = AbstractC36220b.m115301f(parcel, i25);
                            break;
                        case 7:
                            zM115312t4 = AbstractC36220b.m115312t(parcel, i25);
                            break;
                        case '\b':
                            strM115303h23 = AbstractC36220b.m115303h(parcel, i25);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F9);
                C12262f c12262f = new C12262f();
                c12262f.f41043w = arrayListM115301f2;
                c12262f.f41044x = strM115303h24;
                c12262f.f41045y = strM115303h22;
                c12262f.f41046z = arrayListM115301f3;
                c12262f.f41041E = zM115312t4;
                c12262f.f41042F = strM115303h23;
                return c12262f;
            case 9:
                int iM115294F10 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayListM115307l = arrayList;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                String strM115303h25 = null;
                String strM115303h26 = null;
                String strM115303h27 = null;
                String strM115303h28 = null;
                String strM115303h29 = null;
                String strM115303h30 = null;
                String strM115303h31 = null;
                String strM115303h32 = null;
                String strM115303h33 = null;
                String strM115303h34 = null;
                C16077f c16077f = null;
                String strM115303h35 = null;
                String strM115303h36 = null;
                C16074c c16074c = null;
                int iM115317y7 = 0;
                boolean zM115312t5 = false;
                while (parcel.dataPosition() < iM115294F10) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 2:
                            strM115303h25 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case 3:
                            strM115303h26 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case 4:
                            strM115303h27 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case 5:
                            strM115303h28 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case 6:
                            strM115303h29 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case 7:
                            strM115303h30 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case '\b':
                            strM115303h31 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case '\t':
                            strM115303h32 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case '\n':
                            strM115303h33 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case 11:
                            strM115303h34 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case '\f':
                            iM115317y7 = AbstractC36220b.m115317y(parcel, i26);
                            break;
                        case '\r':
                            arrayListM115307l = AbstractC36220b.m115307l(parcel, i26, C16079h.CREATOR);
                            break;
                        case 14:
                            c16077f = (C16077f) AbstractC36220b.m115302g(parcel, i26, C16077f.CREATOR);
                            break;
                        case 15:
                            arrayList2 = AbstractC36220b.m115307l(parcel, i26, LatLng.CREATOR);
                            break;
                        case 16:
                            strM115303h35 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            strM115303h36 = AbstractC36220b.m115303h(parcel, i26);
                            break;
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            arrayList3 = AbstractC36220b.m115307l(parcel, i26, C16073b.CREATOR);
                            break;
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            zM115312t5 = AbstractC36220b.m115312t(parcel, i26);
                            break;
                        case 20:
                            arrayList4 = AbstractC36220b.m115307l(parcel, i26, C16078g.CREATOR);
                            break;
                        case 21:
                            arrayList5 = AbstractC36220b.m115307l(parcel, i26, C16076e.CREATOR);
                            break;
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            arrayList6 = AbstractC36220b.m115307l(parcel, i26, C16078g.CREATOR);
                            break;
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            c16074c = (C16074c) AbstractC36220b.m115302g(parcel, i26, C16074c.CREATOR);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i26);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F10);
                return new C12263g(strM115303h25, strM115303h26, strM115303h27, strM115303h28, strM115303h29, strM115303h30, strM115303h31, strM115303h32, strM115303h33, strM115303h34, iM115317y7, arrayListM115307l, c16077f, arrayList2, strM115303h35, strM115303h36, arrayList3, zM115312t5, arrayList4, arrayList5, arrayList6, c16074c);
            case 10:
                int iM115294F11 = AbstractC36220b.m115294F(parcel);
                String strM115303h37 = null;
                String strM115303h38 = null;
                String[] strArrM115304i2 = null;
                String strM115303h39 = null;
                C12278v c12278v4 = null;
                C12278v c12278v5 = null;
                C12263g[] c12263gArr = null;
                C12264h[] c12264hArr = null;
                UserAddress userAddress4 = null;
                UserAddress userAddress5 = null;
                C12261e[] c12261eArr2 = null;
                while (parcel.dataPosition() < iM115294F11) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 2:
                            strM115303h37 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case 3:
                            strM115303h38 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case 4:
                            strArrM115304i2 = AbstractC36220b.m115304i(parcel, i27);
                            break;
                        case 5:
                            strM115303h39 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case 6:
                            c12278v4 = (C12278v) AbstractC36220b.m115302g(parcel, i27, C12278v.CREATOR);
                            break;
                        case 7:
                            c12278v5 = (C12278v) AbstractC36220b.m115302g(parcel, i27, C12278v.CREATOR);
                            break;
                        case '\b':
                            c12263gArr = (C12263g[]) AbstractC36220b.m115306k(parcel, i27, C12263g.CREATOR);
                            break;
                        case '\t':
                            c12264hArr = (C12264h[]) AbstractC36220b.m115306k(parcel, i27, C12264h.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) AbstractC36220b.m115302g(parcel, i27, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress5 = (UserAddress) AbstractC36220b.m115302g(parcel, i27, UserAddress.CREATOR);
                            break;
                        case '\f':
                            c12261eArr2 = (C12261e[]) AbstractC36220b.m115306k(parcel, i27, C12261e.CREATOR);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i27);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F11);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.f20646w = strM115303h37;
                maskedWallet.f20647x = strM115303h38;
                maskedWallet.f20648y = strArrM115304i2;
                maskedWallet.f20649z = strM115303h39;
                maskedWallet.f20639E = c12278v4;
                maskedWallet.f20640F = c12278v5;
                maskedWallet.f20641G = c12263gArr;
                maskedWallet.f20642H = c12264hArr;
                maskedWallet.f20643I = userAddress4;
                maskedWallet.f20644J = userAddress5;
                maskedWallet.f20645K = c12261eArr2;
                return maskedWallet;
            case 11:
                int iM115294F12 = AbstractC36220b.m115294F(parcel);
                String strM115303h40 = null;
                CommonWalletObject commonWalletObject = null;
                int iM115317y8 = 0;
                String strM115303h41 = null;
                while (parcel.dataPosition() < iM115294F12) {
                    int i28 = parcel.readInt();
                    char c18 = (char) i28;
                    if (c18 == 1) {
                        iM115317y8 = AbstractC36220b.m115317y(parcel, i28);
                    } else if (c18 == 2) {
                        strM115303h40 = AbstractC36220b.m115303h(parcel, i28);
                    } else if (c18 == 3) {
                        strM115303h41 = AbstractC36220b.m115303h(parcel, i28);
                    } else if (c18 != 4) {
                        AbstractC36220b.m115293E(parcel, i28);
                    } else {
                        commonWalletObject = (CommonWalletObject) AbstractC36220b.m115302g(parcel, i28, CommonWalletObject.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F12);
                return new C12264h(iM115317y8, strM115303h40, strM115303h41, commonWalletObject);
            case 12:
                int iM115294F13 = AbstractC36220b.m115294F(parcel);
                String strM115303h42 = null;
                C12260d c12260d2 = null;
                while (parcel.dataPosition() < iM115294F13) {
                    int i29 = parcel.readInt();
                    char c19 = (char) i29;
                    if (c19 == 1) {
                        strM115303h42 = AbstractC36220b.m115303h(parcel, i29);
                    } else if (c19 != 2) {
                        AbstractC36220b.m115293E(parcel, i29);
                    } else {
                        c12260d2 = (C12260d) AbstractC36220b.m115302g(parcel, i29, C12260d.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F13);
                C12267k c12267k = new C12267k();
                c12267k.f41074w = strM115303h42;
                c12267k.f41075x = c12260d2;
                return c12267k;
            case 13:
                int iM115294F14 = AbstractC36220b.m115294F(parcel);
                int iM115317y9 = 0;
                while (parcel.dataPosition() < iM115294F14) {
                    int i34 = parcel.readInt();
                    if (((char) i34) != 1) {
                        AbstractC36220b.m115293E(parcel, i34);
                    } else {
                        iM115317y9 = AbstractC36220b.m115317y(parcel, i34);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F14);
                C12265i c12265i = new C12265i();
                c12265i.f41072w = iM115317y9;
                return c12265i;
            case 14:
                int iM115294F15 = AbstractC36220b.m115294F(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iM115294F15) {
                    int i35 = parcel.readInt();
                    if (((char) i35) != 1) {
                        AbstractC36220b.m115293E(parcel, i35);
                    } else {
                        pendingIntent = (PendingIntent) AbstractC36220b.m115302g(parcel, i35, PendingIntent.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F15);
                C12266j c12266j = new C12266j();
                c12266j.f41073w = pendingIntent;
                return c12266j;
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C12435d((Throwable) parcel.readSerializable());
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C12436e(parcel.readString());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C12438g(C38797c3.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C12553k((InterfaceC12555l) parcel.readParcelable(C12553k.class.getClassLoader()), (C35459c0) parcel.readParcelable(C12553k.class.getClassLoader()));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C12546g0((InterfaceC12555l) parcel.readParcelable(C12546g0.class.getClassLoader()), C12553k.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EnumC26121c0.valueOf(parcel.readString()));
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C12558m0(parcel.readString(), (InterfaceC12555l) parcel.readParcelable(C12558m0.class.getClassLoader()), parcel.readInt() != 0);
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                C38809d5 c38809d5 = (C38809d5) parcel.readParcelable(C12572t0.class.getClassLoader());
                AbstractC38970u5 abstractC38970u5 = (AbstractC38970u5) parcel.readParcelable(C12572t0.class.getClassLoader());
                AbstractC38869j5 abstractC38869j5 = (AbstractC38869j5) parcel.readParcelable(C12572t0.class.getClassLoader());
                boolean z4 = false;
                boolean z13 = true;
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() == 0) {
                    z13 = z4;
                }
                return new C12572t0(c38809d5, abstractC38970u5, abstractC38869j5, z4, z13, parcel.readInt() != 0);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C12574u0((C38915o4) parcel.readParcelable(C12574u0.class.getClassLoader()), (AbstractC38970u5) parcel.readParcelable(C12574u0.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "source");
                int i36 = parcel.readInt();
                if (i36 != 0) {
                    int i37 = 1;
                    if (i36 == 1) {
                        return (AbstractC36868a) C36869b.f157707a.m118255a(parcel, new C11764a(i37, 1));
                    }
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i36, "Unknown storage: "));
                }
                byte[] bArrCreateByteArray = parcel.createByteArray();
                if (bArrCreateByteArray == null) {
                    return null;
                }
                C1456e2 c1456e2M4599u = C1456e2.m4599u(bArrCreateByteArray);
                InterfaceC1544w0 interfaceC1544w0M4601s = c1456e2M4599u.m4601s();
                AbstractC22676k.m65749i(interfaceC1544w0M4601s, "proto.uidsList");
                InterfaceC1544w0 interfaceC1544w0M4600r = c1456e2M4599u.m4600r();
                AbstractC22676k.m65749i(interfaceC1544w0M4600r, "proto.clientIdsList");
                return new C12808a(interfaceC1544w0M4601s, interfaceC1544w0M4600r);
            case 24:
                AbstractC22676k.m65750j(parcel, "source");
                int i38 = parcel.readInt();
                if (i38 != 0) {
                    int i39 = 1;
                    if (i38 == 1) {
                        return (AbstractC36868a) C36869b.f157707a.m118255a(parcel, new C11764a(i39, 2));
                    }
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i38, "Unknown storage: "));
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                if (bArrCreateByteArray2 == null) {
                    return null;
                }
                return new C12809b(C1466g2.m4629r(bArrCreateByteArray2));
            case 25:
                AbstractC22676k.m65750j(parcel, "source");
                int i44 = parcel.readInt();
                if (i44 != 0) {
                    int i45 = 1;
                    if (i44 == 1) {
                        return (AbstractC36868a) C36869b.f157707a.m118255a(parcel, new C11764a(i45, 3));
                    }
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i44, "Unknown storage: "));
                }
                byte[] bArrCreateByteArray3 = parcel.createByteArray();
                if (bArrCreateByteArray3 == null) {
                    return null;
                }
                return new C12810c(C1476i2.m4638s(bArrCreateByteArray3));
            case 26:
                AbstractC22676k.m65750j(parcel, "source");
                int i46 = parcel.readInt();
                if (i46 != 0) {
                    int i47 = 1;
                    if (i46 == 1) {
                        return (AbstractC36868a) C36869b.f157707a.m118255a(parcel, new C11764a(i47, 4));
                    }
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i46, "Unknown storage: "));
                }
                byte[] bArrCreateByteArray4 = parcel.createByteArray();
                if (bArrCreateByteArray4 == null) {
                    return null;
                }
                return new C12811d(C1486k2.m4685v(bArrCreateByteArray4));
            case 27:
                AbstractC22676k.m65750j(parcel, "source");
                int i48 = parcel.readInt();
                if (i48 != 0) {
                    int i49 = 1;
                    if (i48 == 1) {
                        return (AbstractC36868a) C36869b.f157707a.m118255a(parcel, new C11764a(i49, 5));
                    }
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i48, "Unknown storage: "));
                }
                byte[] bArrCreateByteArray5 = parcel.createByteArray();
                if (bArrCreateByteArray5 == null) {
                    return null;
                }
                C1496m2 c1496m2M4702y = C1496m2.m4702y(bArrCreateByteArray5);
                String callingPackage = c1496m2M4702y.m4703t();
                AbstractC22676k.m65749i(callingPackage, "callingPackage");
                return new C12812e(callingPackage, c1496m2M4702y.m4706w(), c1496m2M4702y.m4705v(), c1496m2M4702y.m4704u());
            case 28:
                AbstractC22676k.m65750j(parcel, "source");
                int i54 = parcel.readInt();
                if (i54 != 0) {
                    int i55 = 1;
                    if (i54 == 1) {
                        return (AbstractC36868a) C36869b.f157707a.m118255a(parcel, new C11764a(i55, 6));
                    }
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i54, "Unknown storage: "));
                }
                byte[] bArrCreateByteArray6 = parcel.createByteArray();
                if (bArrCreateByteArray6 == null) {
                    return null;
                }
                InterfaceC1544w0 interfaceC1544w0M4788q = C1506o2.m4787s(bArrCreateByteArray6).m4788q();
                AbstractC22676k.m65749i(interfaceC1544w0M4788q, "proto.dataPointList");
                return new C12813f(interfaceC1544w0M4788q);
            default:
                int iM115294F16 = AbstractC36220b.m115294F(parcel);
                String strM115303h43 = null;
                int iM115317y10 = 0;
                int iM115317y11 = 0;
                int iM115317y12 = 0;
                while (parcel.dataPosition() < iM115294F16) {
                    int i56 = parcel.readInt();
                    char c24 = (char) i56;
                    if (c24 == 1) {
                        iM115317y10 = AbstractC36220b.m115317y(parcel, i56);
                    } else if (c24 == 2) {
                        iM115317y11 = AbstractC36220b.m115317y(parcel, i56);
                    } else if (c24 == 3) {
                        iM115317y12 = AbstractC36220b.m115317y(parcel, i56);
                    } else if (c24 != 4) {
                        AbstractC36220b.m115293E(parcel, i56);
                    } else {
                        strM115303h43 = AbstractC36220b.m115303h(parcel, i56);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F16);
                ButtonOptions buttonOptions = new ButtonOptions();
                buttonOptions.f20650w = iM115317y10;
                buttonOptions.f20651x = iM115317y11;
                buttonOptions.f20652y = iM115317y12;
                AbstractC35135w.m111094f(strM115303h43);
                buttonOptions.f20653z = strM115303h43;
                return buttonOptions;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f41125a) {
            case 0:
                return new C12275s[i13];
            case 1:
                return new C12282z[i13];
            case 2:
                return new C12278v[i13];
            case 3:
                return new C12258b[i13];
            case 4:
                return new C12259c[i13];
            case 5:
                return new C12260d[i13];
            case 6:
                return new FullWallet[i13];
            case 7:
                return new C12261e[i13];
            case 8:
                return new C12262f[i13];
            case 9:
                return new C12263g[i13];
            case 10:
                return new MaskedWallet[i13];
            case 11:
                return new C12264h[i13];
            case 12:
                return new C12267k[i13];
            case 13:
                return new C12265i[i13];
            case 14:
                return new C12266j[i13];
            case 15:
                return new C12435d[i13];
            case 16:
                return new C12436e[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C12438g[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C12553k[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C12546g0[i13];
            case 20:
                return new C12558m0[i13];
            case 21:
                return new C12572t0[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C12574u0[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C12808a[i13];
            case 24:
                return new C12809b[i13];
            case 25:
                return new C12810c[i13];
            case 26:
                return new C12811d[i13];
            case 27:
                return new C12812e[i13];
            case 28:
                return new C12813f[i13];
            default:
                return new ButtonOptions[i13];
        }
    }
}
