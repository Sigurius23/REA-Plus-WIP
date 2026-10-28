package v00;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import h20.AbstractC16737t1;
import java.io.Serializable;
import java.util.ArrayList;
import p072cp.BinderC10935b;
import p072cp.InterfaceC10934a;
import p266jz.C22057e;
import p556vm.C36135b;
import p556vm.C36136c;
import p557vo.AbstractC36220b;
import p562vv.C36527b;
import p564vx.C36549a;
import p564vx.C36550b;
import p591wp.C37481b;
import p591wp.C37483d;
import p591wp.C37486g;
import p591wp.C37488i;
import p591wp.C37489j;
import p591wp.C37490k;
import p591wp.C37492m;
import p591wp.C37493n;
import p591wp.C37494o;
import p591wp.C37495p;
import p597wx.C37674c;
import p597wx.C37675d;
import p715kotlin.jvm.internal.AbstractC22676k;
import v10.C35526b;
import w10.C36689a;
import w10.C36690b;
import w10.C36691c;
import w30.C36784a;
import w30.C36785b;
import y00.C38899m6;
import y00.EnumC38853i;

/* JADX INFO: renamed from: v00.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35467g0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f151004a;

    public /* synthetic */ C35467g0(int i13) {
        this.f151004a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        View view;
        switch (this.f151004a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C35469h0.f151005w;
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35473j0((AbstractC16737t1) parcel.readParcelable(C35473j0.class.getClassLoader()));
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(parcel.readParcelable(C35475k0.class.getClassLoader()));
                }
                return new C35475k0(arrayList);
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                int i15 = parcel.readInt();
                Serializable serializable = parcel.readSerializable();
                return new C35526b(string, i15, serializable instanceof StripeException ? (StripeException) serializable : null, parcel.readInt() == 1, parcel.readString(), (C38899m6) parcel.readParcelable(C38899m6.class.getClassLoader()), parcel.readString());
            case 4:
                return new C36136c(parcel);
            case 5:
                return new C36135b(parcel);
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C36527b(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt() != 0);
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C36549a.f156471w;
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C36550b(parcel.readString());
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new Country(CountryCode.CREATOR.createFromParcel(parcel), parcel.readString());
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new CountryCode(parcel.readString());
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C36689a(parcel.readString(), (C22057e) parcel.readParcelable(C36689a.class.getClassLoader()));
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C36690b(parcel.readString(), parcel.readString());
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C36691c(parcel.readString(), parcel.readString(), (C22057e) parcel.readParcelable(C36691c.class.getClassLoader()));
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                int i16 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList2.add(EnumC38853i.valueOf(parcel.readString()));
                }
                return new C36784a(arrayList2);
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C36785b.f157369w;
            case 16:
                int iM115294F = AbstractC36220b.m115294F(parcel);
                float fM115314v = 0.0f;
                float fM115314v2 = 0.0f;
                LatLng latLng = null;
                float fM115314v3 = 0.0f;
                while (parcel.dataPosition() < iM115294F) {
                    int i18 = parcel.readInt();
                    char c3 = (char) i18;
                    if (c3 == 2) {
                        latLng = (LatLng) AbstractC36220b.m115302g(parcel, i18, LatLng.CREATOR);
                    } else if (c3 == 3) {
                        fM115314v = AbstractC36220b.m115314v(parcel, i18);
                    } else if (c3 == 4) {
                        fM115314v3 = AbstractC36220b.m115314v(parcel, i18);
                    } else if (c3 != 5) {
                        AbstractC36220b.m115293E(parcel, i18);
                    } else {
                        fM115314v2 = AbstractC36220b.m115314v(parcel, i18);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F);
                return new CameraPosition(latLng, fM115314v, fM115314v3, fM115314v2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iM115294F2 = AbstractC36220b.m115294F(parcel);
                C37493n c37493n = null;
                int iM115317y = 0;
                int iM115317y2 = 0;
                boolean zM115312t = false;
                float fM115314v4 = 0.0f;
                while (parcel.dataPosition() < iM115294F2) {
                    int i19 = parcel.readInt();
                    char c7 = (char) i19;
                    if (c7 == 2) {
                        fM115314v4 = AbstractC36220b.m115314v(parcel, i19);
                    } else if (c7 == 3) {
                        iM115317y = AbstractC36220b.m115317y(parcel, i19);
                    } else if (c7 == 4) {
                        iM115317y2 = AbstractC36220b.m115317y(parcel, i19);
                    } else if (c7 == 5) {
                        zM115312t = AbstractC36220b.m115312t(parcel, i19);
                    } else if (c7 != 6) {
                        AbstractC36220b.m115293E(parcel, i19);
                    } else {
                        c37493n = (C37493n) AbstractC36220b.m115302g(parcel, i19, C37493n.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F2);
                return new C37494o(fM115314v4, iM115317y, iM115317y2, zM115312t, c37493n);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                int iM115294F3 = AbstractC36220b.m115294F(parcel);
                double d3 = 0.0d;
                C37494o c37494o = null;
                while (parcel.dataPosition() < iM115294F3) {
                    int i24 = parcel.readInt();
                    char c14 = (char) i24;
                    if (c14 == 2) {
                        c37494o = (C37494o) AbstractC36220b.m115302g(parcel, i24, C37494o.CREATOR);
                    } else if (c14 != 3) {
                        AbstractC36220b.m115293E(parcel, i24);
                    } else {
                        AbstractC36220b.m115295G(parcel, i24, 8);
                        d3 = parcel.readDouble();
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F3);
                return new C37495p(c37494o, d3);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iM115294F4 = AbstractC36220b.m115294F(parcel);
                int iM115317y3 = 0;
                IBinder iBinderM115316x = null;
                Float fM115315w = null;
                while (parcel.dataPosition() < iM115294F4) {
                    int i25 = parcel.readInt();
                    char c15 = (char) i25;
                    if (c15 == 2) {
                        iM115317y3 = AbstractC36220b.m115317y(parcel, i25);
                    } else if (c15 == 3) {
                        iBinderM115316x = AbstractC36220b.m115316x(parcel, i25);
                    } else if (c15 != 4) {
                        AbstractC36220b.m115293E(parcel, i25);
                    } else {
                        fM115315w = AbstractC36220b.m115315w(parcel, i25);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F4);
                return new C37483d(iM115317y3, iBinderM115316x != null ? new C37481b(BinderC10935b.m28986X(iBinderM115316x)) : null, fM115315w);
            case 20:
                int iM115294F5 = AbstractC36220b.m115294F(parcel);
                LatLng latLng2 = null;
                LatLng latLng3 = null;
                while (parcel.dataPosition() < iM115294F5) {
                    int i26 = parcel.readInt();
                    char c16 = (char) i26;
                    if (c16 == 2) {
                        latLng2 = (LatLng) AbstractC36220b.m115302g(parcel, i26, LatLng.CREATOR);
                    } else if (c16 != 3) {
                        AbstractC36220b.m115293E(parcel, i26);
                    } else {
                        latLng3 = (LatLng) AbstractC36220b.m115302g(parcel, i26, LatLng.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F5);
                return new LatLngBounds(latLng2, latLng3);
            case 21:
                int iM115294F6 = AbstractC36220b.m115294F(parcel);
                double d14 = 0.0d;
                double d15 = 0.0d;
                while (parcel.dataPosition() < iM115294F6) {
                    int i27 = parcel.readInt();
                    char c17 = (char) i27;
                    if (c17 == 2) {
                        AbstractC36220b.m115295G(parcel, i27, 8);
                        d14 = parcel.readDouble();
                    } else if (c17 != 3) {
                        AbstractC36220b.m115293E(parcel, i27);
                    } else {
                        AbstractC36220b.m115295G(parcel, i27, 8);
                        d15 = parcel.readDouble();
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F6);
                return new LatLng(d14, d15);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iM115294F7 = AbstractC36220b.m115294F(parcel);
                String strM115303h = null;
                while (parcel.dataPosition() < iM115294F7) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 2) {
                        AbstractC36220b.m115293E(parcel, i28);
                    } else {
                        strM115303h = AbstractC36220b.m115303h(parcel, i28);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F7);
                return new C37486g(strM115303h);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iM115294F8 = AbstractC36220b.m115294F(parcel);
                boolean zM115312t2 = false;
                boolean zM115312t3 = false;
                boolean zM115312t4 = false;
                int iM115317y4 = 0;
                int iM115317y5 = 0;
                float fM115314v5 = 1.0f;
                float fM115314v6 = 0.5f;
                LatLng latLng4 = null;
                String strM115303h2 = null;
                String strM115303h3 = null;
                IBinder iBinderM115316x2 = null;
                float fM115314v7 = 0.0f;
                float fM115314v8 = 0.0f;
                IBinder iBinderM115316x3 = null;
                float fM115314v9 = 0.0f;
                float fM115314v10 = 0.0f;
                float fM115314v11 = 0.0f;
                String strM115303h4 = null;
                float fM115314v12 = 0.0f;
                while (parcel.dataPosition() < iM115294F8) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 2:
                            latLng4 = (LatLng) AbstractC36220b.m115302g(parcel, i29, LatLng.CREATOR);
                            break;
                        case 3:
                            strM115303h2 = AbstractC36220b.m115303h(parcel, i29);
                            break;
                        case 4:
                            strM115303h3 = AbstractC36220b.m115303h(parcel, i29);
                            break;
                        case 5:
                            iBinderM115316x2 = AbstractC36220b.m115316x(parcel, i29);
                            break;
                        case 6:
                            fM115314v7 = AbstractC36220b.m115314v(parcel, i29);
                            break;
                        case 7:
                            fM115314v8 = AbstractC36220b.m115314v(parcel, i29);
                            break;
                        case '\b':
                            zM115312t2 = AbstractC36220b.m115312t(parcel, i29);
                            break;
                        case '\t':
                            zM115312t3 = AbstractC36220b.m115312t(parcel, i29);
                            break;
                        case '\n':
                            zM115312t4 = AbstractC36220b.m115312t(parcel, i29);
                            break;
                        case 11:
                            fM115314v9 = AbstractC36220b.m115314v(parcel, i29);
                            break;
                        case '\f':
                            fM115314v6 = AbstractC36220b.m115314v(parcel, i29);
                            break;
                        case '\r':
                            fM115314v10 = AbstractC36220b.m115314v(parcel, i29);
                            break;
                        case 14:
                            fM115314v5 = AbstractC36220b.m115314v(parcel, i29);
                            break;
                        case 15:
                            fM115314v11 = AbstractC36220b.m115314v(parcel, i29);
                            break;
                        case 16:
                        default:
                            AbstractC36220b.m115293E(parcel, i29);
                            break;
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            iM115317y4 = AbstractC36220b.m115317y(parcel, i29);
                            break;
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            iBinderM115316x3 = AbstractC36220b.m115316x(parcel, i29);
                            break;
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            iM115317y5 = AbstractC36220b.m115317y(parcel, i29);
                            break;
                        case 20:
                            strM115303h4 = AbstractC36220b.m115303h(parcel, i29);
                            break;
                        case 21:
                            fM115314v12 = AbstractC36220b.m115314v(parcel, i29);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F8);
                C37488i c37488i = new C37488i();
                c37488i.f160332E = 0.5f;
                c37488i.f160333F = 1.0f;
                c37488i.f160335H = true;
                c37488i.f160336I = false;
                c37488i.f160337J = 0.0f;
                c37488i.f160338K = 0.5f;
                c37488i.f160339L = 0.0f;
                c37488i.f160340M = 1.0f;
                c37488i.f160342O = 0;
                c37488i.f160347w = latLng4;
                c37488i.f160348x = strM115303h2;
                c37488i.f160349y = strM115303h3;
                if (iBinderM115316x2 == null) {
                    view = null;
                    c37488i.f160350z = null;
                } else {
                    view = null;
                    c37488i.f160350z = new C37481b(BinderC10935b.m28986X(iBinderM115316x2));
                }
                c37488i.f160332E = fM115314v7;
                c37488i.f160333F = fM115314v8;
                c37488i.f160334G = zM115312t2;
                c37488i.f160335H = zM115312t3;
                c37488i.f160336I = zM115312t4;
                c37488i.f160337J = fM115314v9;
                c37488i.f160338K = fM115314v6;
                c37488i.f160339L = fM115314v10;
                c37488i.f160340M = fM115314v5;
                c37488i.f160341N = fM115314v11;
                c37488i.f160344Q = iM115317y5;
                c37488i.f160342O = iM115317y4;
                InterfaceC10934a interfaceC10934aM28986X = BinderC10935b.m28986X(iBinderM115316x3);
                c37488i.f160343P = interfaceC10934aM28986X == null ? view : (View) BinderC10935b.m28987c0(interfaceC10934aM28986X);
                c37488i.f160345R = strM115303h4;
                c37488i.f160346S = fM115314v12;
                return c37488i;
            case 24:
                int iM115294F9 = AbstractC36220b.m115294F(parcel);
                Float fM115315w2 = null;
                int iM115317y6 = 0;
                while (parcel.dataPosition() < iM115294F9) {
                    int i34 = parcel.readInt();
                    char c18 = (char) i34;
                    if (c18 == 2) {
                        iM115317y6 = AbstractC36220b.m115317y(parcel, i34);
                    } else if (c18 != 3) {
                        AbstractC36220b.m115293E(parcel, i34);
                    } else {
                        fM115315w2 = AbstractC36220b.m115315w(parcel, i34);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F9);
                return new C37489j(iM115317y6, fM115315w2);
            case 25:
                int iM115294F10 = AbstractC36220b.m115294F(parcel);
                LatLng latLng5 = null;
                String strM115303h5 = null;
                String strM115303h6 = null;
                while (parcel.dataPosition() < iM115294F10) {
                    int i35 = parcel.readInt();
                    char c19 = (char) i35;
                    if (c19 == 2) {
                        latLng5 = (LatLng) AbstractC36220b.m115302g(parcel, i35, LatLng.CREATOR);
                    } else if (c19 == 3) {
                        strM115303h5 = AbstractC36220b.m115303h(parcel, i35);
                    } else if (c19 != 4) {
                        AbstractC36220b.m115293E(parcel, i35);
                    } else {
                        strM115303h6 = AbstractC36220b.m115303h(parcel, i35);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F10);
                return new C37490k(latLng5, strM115303h5, strM115303h6);
            case 26:
                int iM115294F11 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayListM115307l = null;
                C37483d c37483d = null;
                C37483d c37483d2 = null;
                ArrayList arrayListM115307l2 = null;
                ArrayList arrayListM115307l3 = null;
                int iM115317y7 = 0;
                boolean zM115312t5 = false;
                boolean zM115312t6 = false;
                boolean zM115312t7 = false;
                int iM115317y8 = 0;
                float fM115314v13 = 0.0f;
                float fM115314v14 = 0.0f;
                while (parcel.dataPosition() < iM115294F11) {
                    int i36 = parcel.readInt();
                    switch ((char) i36) {
                        case 2:
                            arrayListM115307l = AbstractC36220b.m115307l(parcel, i36, LatLng.CREATOR);
                            break;
                        case 3:
                            fM115314v13 = AbstractC36220b.m115314v(parcel, i36);
                            break;
                        case 4:
                            iM115317y7 = AbstractC36220b.m115317y(parcel, i36);
                            break;
                        case 5:
                            fM115314v14 = AbstractC36220b.m115314v(parcel, i36);
                            break;
                        case 6:
                            zM115312t5 = AbstractC36220b.m115312t(parcel, i36);
                            break;
                        case 7:
                            zM115312t6 = AbstractC36220b.m115312t(parcel, i36);
                            break;
                        case '\b':
                            zM115312t7 = AbstractC36220b.m115312t(parcel, i36);
                            break;
                        case '\t':
                            c37483d = (C37483d) AbstractC36220b.m115302g(parcel, i36, C37483d.CREATOR);
                            break;
                        case '\n':
                            c37483d2 = (C37483d) AbstractC36220b.m115302g(parcel, i36, C37483d.CREATOR);
                            break;
                        case 11:
                            iM115317y8 = AbstractC36220b.m115317y(parcel, i36);
                            break;
                        case '\f':
                            arrayListM115307l2 = AbstractC36220b.m115307l(parcel, i36, C37489j.CREATOR);
                            break;
                        case '\r':
                            arrayListM115307l3 = AbstractC36220b.m115307l(parcel, i36, C37495p.CREATOR);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i36);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F11);
                return new C37492m(arrayListM115307l, fM115314v13, iM115317y7, fM115314v14, zM115312t5, zM115312t6, zM115312t7, c37483d, c37483d2, iM115317y8, arrayListM115307l2, arrayListM115307l3);
            case 27:
                int iM115294F12 = AbstractC36220b.m115294F(parcel);
                IBinder iBinderM115316x4 = null;
                while (parcel.dataPosition() < iM115294F12) {
                    int i37 = parcel.readInt();
                    if (((char) i37) != 2) {
                        AbstractC36220b.m115293E(parcel, i37);
                    } else {
                        iBinderM115316x4 = AbstractC36220b.m115316x(parcel, i37);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F12);
                return new C37493n(iBinderM115316x4);
            case 28:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37674c((Throwable) parcel.readSerializable());
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C37675d(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f151004a) {
            case 0:
                return new C35469h0[i13];
            case 1:
                return new C35473j0[i13];
            case 2:
                return new C35475k0[i13];
            case 3:
                return new C35526b[i13];
            case 4:
                return new C36136c[i13];
            case 5:
                return new C36135b[i13];
            case 6:
                return new C36527b[i13];
            case 7:
                return new C36549a[i13];
            case 8:
                return new C36550b[i13];
            case 9:
                return new Country[i13];
            case 10:
                return new CountryCode[i13];
            case 11:
                return new C36689a[i13];
            case 12:
                return new C36690b[i13];
            case 13:
                return new C36691c[i13];
            case 14:
                return new C36784a[i13];
            case 15:
                return new C36785b[i13];
            case 16:
                return new CameraPosition[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C37494o[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C37495p[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C37483d[i13];
            case 20:
                return new LatLngBounds[i13];
            case 21:
                return new LatLng[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C37486g[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C37488i[i13];
            case 24:
                return new C37489j[i13];
            case 25:
                return new C37490k[i13];
            case 26:
                return new C37492m[i13];
            case 27:
                return new C37493n[i13];
            case 28:
                return new C37674c[i13];
            default:
                return new C37675d[i13];
        }
    }
}
