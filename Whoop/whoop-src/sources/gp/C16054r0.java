package gp;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import gq.C16072a;
import gq.C16073b;
import gq.C16074c;
import gq.C16075d;
import gq.C16076e;
import gq.C16077f;
import gq.C16078g;
import gq.C16079h;
import h20.C16661g3;
import h20.C16767y1;
import h30.C16801f;
import h30.C16802g;
import h30.C16803h;
import h30.C16805j;
import i10.C17852b;
import i10.C17854d;
import i10.C17855e;
import i10.C17856f;
import java.util.ArrayList;
import p236j.C21062a;
import p236j.C21073l;
import p256jn.C21796a;
import p262jv.C21966c;
import p266jz.C22054b;
import p266jz.C22055c;
import p266jz.C22056d;
import p266jz.C22057e;
import p266jz.C22058f;
import p266jz.C22059g;
import p266jz.EnumC22053a;
import p557vo.AbstractC36220b;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35459c0;
import y00.C38977v3;
import y00.EnumC38922p2;
import y00.InterfaceC38866j2;

/* JADX INFO: renamed from: gp.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16054r0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60724a;

    public /* synthetic */ C16054r0(int i13) {
        this.f60724a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z4;
        switch (this.f60724a) {
            case 0:
                int iM115294F = AbstractC36220b.m115294F(parcel);
                String strM115303h = null;
                while (parcel.dataPosition() < iM115294F) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 2) {
                        AbstractC36220b.m115293E(parcel, i13);
                    } else {
                        strM115303h = AbstractC36220b.m115303h(parcel, i13);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F);
                return new C16047o(strM115303h);
            case 1:
                int iM115294F2 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayListM115307l = arrayList;
                ArrayList arrayListM115307l2 = arrayList2;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                int iM115317y = 0;
                boolean zM115312t = false;
                String strM115303h2 = null;
                String strM115303h3 = null;
                String strM115303h4 = null;
                String strM115303h5 = null;
                String strM115303h6 = null;
                String strM115303h7 = null;
                String strM115303h8 = null;
                String strM115303h9 = null;
                C16077f c16077f = null;
                String strM115303h10 = null;
                String strM115303h11 = null;
                while (parcel.dataPosition() < iM115294F2) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            strM115303h2 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case 3:
                            strM115303h3 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case 4:
                            strM115303h4 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case 5:
                            strM115303h5 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case 6:
                            strM115303h6 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case 7:
                            strM115303h7 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case '\b':
                            strM115303h8 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case '\t':
                            strM115303h9 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case '\n':
                            iM115317y = AbstractC36220b.m115317y(parcel, i14);
                            break;
                        case 11:
                            arrayListM115307l = AbstractC36220b.m115307l(parcel, i14, C16079h.CREATOR);
                            break;
                        case '\f':
                            c16077f = (C16077f) AbstractC36220b.m115302g(parcel, i14, C16077f.CREATOR);
                            break;
                        case '\r':
                            arrayListM115307l2 = AbstractC36220b.m115307l(parcel, i14, LatLng.CREATOR);
                            break;
                        case 14:
                            strM115303h10 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case 15:
                            strM115303h11 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case 16:
                            arrayList3 = AbstractC36220b.m115307l(parcel, i14, C16073b.CREATOR);
                            break;
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            zM115312t = AbstractC36220b.m115312t(parcel, i14);
                            break;
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            arrayList4 = AbstractC36220b.m115307l(parcel, i14, C16078g.CREATOR);
                            break;
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            arrayList5 = AbstractC36220b.m115307l(parcel, i14, C16076e.CREATOR);
                            break;
                        case 20:
                            arrayList6 = AbstractC36220b.m115307l(parcel, i14, C16078g.CREATOR);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i14);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F2);
                return new CommonWalletObject(strM115303h2, strM115303h3, strM115303h4, strM115303h5, strM115303h6, strM115303h7, strM115303h8, strM115303h9, iM115317y, arrayListM115307l, c16077f, arrayListM115307l2, strM115303h10, strM115303h11, arrayList3, zM115312t, arrayList4, arrayList5, arrayList6);
            case 2:
                int iM115294F3 = AbstractC36220b.m115294F(parcel);
                String strM115303h12 = null;
                String strM115303h13 = null;
                while (parcel.dataPosition() < iM115294F3) {
                    int i15 = parcel.readInt();
                    char c3 = (char) i15;
                    if (c3 == 2) {
                        strM115303h12 = AbstractC36220b.m115303h(parcel, i15);
                    } else if (c3 != 3) {
                        AbstractC36220b.m115293E(parcel, i15);
                    } else {
                        strM115303h13 = AbstractC36220b.m115303h(parcel, i15);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F3);
                C16072a c16072a = new C16072a();
                c16072a.f60789w = strM115303h12;
                c16072a.f60790x = strM115303h13;
                return c16072a;
            case 3:
                int iM115294F4 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayList7 = new ArrayList();
                String strM115303h14 = null;
                String strM115303h15 = null;
                while (parcel.dataPosition() < iM115294F4) {
                    int i16 = parcel.readInt();
                    char c7 = (char) i16;
                    if (c7 == 2) {
                        strM115303h14 = AbstractC36220b.m115303h(parcel, i16);
                    } else if (c7 == 3) {
                        strM115303h15 = AbstractC36220b.m115303h(parcel, i16);
                    } else if (c7 != 4) {
                        AbstractC36220b.m115293E(parcel, i16);
                    } else {
                        arrayList7 = AbstractC36220b.m115307l(parcel, i16, C16072a.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F4);
                return new C16073b(arrayList7, strM115303h14, strM115303h15);
            case 4:
                int iM115294F5 = AbstractC36220b.m115294F(parcel);
                int iM115317y2 = -1;
                long jM115289A = 0;
                String strM115303h16 = null;
                int iM115317y3 = 0;
                double d3 = 0.0d;
                String strM115303h17 = null;
                while (parcel.dataPosition() < iM115294F5) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            iM115317y3 = AbstractC36220b.m115317y(parcel, i17);
                            break;
                        case 3:
                            strM115303h16 = AbstractC36220b.m115303h(parcel, i17);
                            break;
                        case 4:
                            AbstractC36220b.m115295G(parcel, i17, 8);
                            d3 = parcel.readDouble();
                            break;
                        case 5:
                            strM115303h17 = AbstractC36220b.m115303h(parcel, i17);
                            break;
                        case 6:
                            jM115289A = AbstractC36220b.m115289A(parcel, i17);
                            break;
                        case 7:
                            iM115317y2 = AbstractC36220b.m115317y(parcel, i17);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i17);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F5);
                C16075d c16075d = new C16075d();
                c16075d.f60799w = iM115317y3;
                c16075d.f60800x = strM115303h16;
                c16075d.f60801y = d3;
                c16075d.f60802z = strM115303h17;
                c16075d.f60797E = jM115289A;
                c16075d.f60798F = iM115317y2;
                return c16075d;
            case 5:
                int iM115294F6 = AbstractC36220b.m115294F(parcel);
                String strM115303h18 = null;
                C16075d c16075d2 = null;
                C16077f c16077f2 = null;
                while (parcel.dataPosition() < iM115294F6) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 2) {
                        strM115303h18 = AbstractC36220b.m115303h(parcel, i18);
                    } else if (c14 == 3) {
                        c16075d2 = (C16075d) AbstractC36220b.m115302g(parcel, i18, C16075d.CREATOR);
                    } else if (c14 != 5) {
                        AbstractC36220b.m115293E(parcel, i18);
                    } else {
                        c16077f2 = (C16077f) AbstractC36220b.m115302g(parcel, i18, C16077f.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F6);
                C16074c c16074c = new C16074c();
                c16074c.f60794w = strM115303h18;
                c16074c.f60795x = c16075d2;
                c16074c.f60796y = c16077f2;
                return c16074c;
            case 6:
                int iM115294F7 = AbstractC36220b.m115294F(parcel);
                String strM115303h19 = null;
                String strM115303h20 = null;
                while (parcel.dataPosition() < iM115294F7) {
                    int i19 = parcel.readInt();
                    char c15 = (char) i19;
                    if (c15 == 2) {
                        strM115303h19 = AbstractC36220b.m115303h(parcel, i19);
                    } else if (c15 != 3) {
                        AbstractC36220b.m115293E(parcel, i19);
                    } else {
                        strM115303h20 = AbstractC36220b.m115303h(parcel, i19);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F7);
                C16076e c16076e = new C16076e();
                c16076e.f60803w = strM115303h19;
                c16076e.f60804x = strM115303h20;
                return c16076e;
            case 7:
                int iM115294F8 = AbstractC36220b.m115294F(parcel);
                long jM115289A2 = 0;
                long jM115289A3 = 0;
                while (parcel.dataPosition() < iM115294F8) {
                    int i24 = parcel.readInt();
                    char c16 = (char) i24;
                    if (c16 == 2) {
                        jM115289A2 = AbstractC36220b.m115289A(parcel, i24);
                    } else if (c16 != 3) {
                        AbstractC36220b.m115293E(parcel, i24);
                    } else {
                        jM115289A3 = AbstractC36220b.m115289A(parcel, i24);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F8);
                C16077f c16077f3 = new C16077f();
                c16077f3.f60805w = jM115289A2;
                c16077f3.f60806x = jM115289A3;
                return c16077f3;
            case 8:
                int iM115294F9 = AbstractC36220b.m115294F(parcel);
                String strM115303h21 = null;
                String strM115303h22 = null;
                while (parcel.dataPosition() < iM115294F9) {
                    int i25 = parcel.readInt();
                    char c17 = (char) i25;
                    if (c17 == 2) {
                        strM115303h21 = AbstractC36220b.m115303h(parcel, i25);
                    } else if (c17 != 3) {
                        AbstractC36220b.m115293E(parcel, i25);
                    } else {
                        strM115303h22 = AbstractC36220b.m115303h(parcel, i25);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F9);
                C16078g c16078g = new C16078g();
                c16078g.f60807w = strM115303h21;
                c16078g.f60808x = strM115303h22;
                return c16078g;
            case 9:
                int iM115294F10 = AbstractC36220b.m115294F(parcel);
                String strM115303h23 = null;
                String strM115303h24 = null;
                C16077f c16077f4 = null;
                C16078g c16078g2 = null;
                C16078g c16078g3 = null;
                while (parcel.dataPosition() < iM115294F10) {
                    int i26 = parcel.readInt();
                    char c18 = (char) i26;
                    if (c18 == 2) {
                        strM115303h23 = AbstractC36220b.m115303h(parcel, i26);
                    } else if (c18 == 3) {
                        strM115303h24 = AbstractC36220b.m115303h(parcel, i26);
                    } else if (c18 == 4) {
                        c16077f4 = (C16077f) AbstractC36220b.m115302g(parcel, i26, C16077f.CREATOR);
                    } else if (c18 == 5) {
                        c16078g2 = (C16078g) AbstractC36220b.m115302g(parcel, i26, C16078g.CREATOR);
                    } else if (c18 != 6) {
                        AbstractC36220b.m115293E(parcel, i26);
                    } else {
                        c16078g3 = (C16078g) AbstractC36220b.m115302g(parcel, i26, C16078g.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F10);
                C16079h c16079h = new C16079h();
                c16079h.f60810w = strM115303h23;
                c16079h.f60811x = strM115303h24;
                c16079h.f60812y = c16077f4;
                c16079h.f60813z = c16078g2;
                c16079h.f60809E = c16078g3;
                return c16079h;
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C16801f.f64564w;
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C16802g.f64565w;
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16803h((Throwable) parcel.readSerializable());
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C16805j((C35459c0) parcel.readParcelable(C16805j.class.getClassLoader()), (C16661g3) parcel.readParcelable(C16805j.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                int iM115294F11 = AbstractC36220b.m115294F(parcel);
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
                String strM115303h35 = null;
                String strM115303h36 = null;
                String strM115303h37 = null;
                boolean zM115312t2 = false;
                String strM115303h38 = null;
                while (parcel.dataPosition() < iM115294F11) {
                    int i27 = parcel.readInt();
                    boolean z13 = zM115312t2;
                    switch ((char) i27) {
                        case 2:
                            strM115303h25 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case 3:
                            strM115303h38 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case 4:
                            strM115303h26 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case 5:
                            strM115303h27 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case 6:
                            strM115303h28 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case 7:
                            strM115303h29 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case '\b':
                            strM115303h30 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case '\t':
                            strM115303h31 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case '\n':
                            strM115303h32 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case 11:
                            strM115303h33 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case '\f':
                            strM115303h34 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case '\r':
                            strM115303h35 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case 14:
                            zM115312t2 = AbstractC36220b.m115312t(parcel, i27);
                            continue;
                        case 15:
                            strM115303h37 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        case 16:
                            strM115303h36 = AbstractC36220b.m115303h(parcel, i27);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i27);
                            break;
                    }
                    zM115312t2 = z13;
                }
                boolean z14 = zM115312t2;
                AbstractC36220b.m115308m(parcel, iM115294F11);
                UserAddress userAddress = new UserAddress();
                userAddress.f20566w = strM115303h25;
                userAddress.f20567x = strM115303h38;
                userAddress.f20568y = strM115303h26;
                userAddress.f20569z = strM115303h27;
                userAddress.f20555E = strM115303h28;
                userAddress.f20556F = strM115303h29;
                userAddress.f20557G = strM115303h30;
                userAddress.f20558H = strM115303h31;
                userAddress.f20559I = strM115303h32;
                userAddress.f20560J = strM115303h33;
                userAddress.f20561K = strM115303h34;
                userAddress.f20562L = strM115303h35;
                userAddress.f20563M = z14;
                userAddress.f20564N = strM115303h37;
                userAddress.f20565O = strM115303h36;
                return userAddress;
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17852b(C16767y1.CREATOR.createFromParcel(parcel), (C38977v3) parcel.readParcelable(C17852b.class.getClassLoader()));
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C17854d.f69476w;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C17855e.f69477w;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C17856f((Throwable) parcel.readSerializable());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C21062a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 20:
                AbstractC22676k.m65750j(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                AbstractC22676k.m65747g(parcelable);
                return new C21073l((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 21:
                String string = parcel.readString();
                string.getClass();
                return new C21796a(parcel.readInt(), string);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                boolean z15 = false;
                if (parcel.readInt() != 0) {
                    z15 = true;
                    z4 = true;
                } else {
                    z4 = true;
                }
                int i28 = parcel.readInt();
                boolean z16 = z4;
                int i29 = parcel.readInt();
                float f13 = parcel.readFloat();
                float f14 = parcel.readFloat();
                float f15 = parcel.readFloat();
                boolean z17 = z16;
                float f16 = parcel.readFloat();
                if (parcel.readInt() == 0) {
                    z17 = false;
                }
                return new C21966c(z15, i28, i29, f13, f14, f15, f16, z17);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return EnumC22053a.valueOf(parcel.readString());
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22054b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22055c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C22054b.CREATOR.createFromParcel(parcel));
            case 26:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22057e(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : EnumC38922p2.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : EnumC22053a.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? C22055c.CREATOR.createFromParcel(parcel) : null, C22056d.CREATOR.createFromParcel(parcel), (InterfaceC38866j2) parcel.readParcelable(C22057e.class.getClassLoader()));
            case 27:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22056d(parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22058f(parcel.readString(), parcel.readString(), parcel.readString());
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C22059g.f85571w;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f60724a) {
            case 0:
                return new C16047o[i13];
            case 1:
                return new CommonWalletObject[i13];
            case 2:
                return new C16072a[i13];
            case 3:
                return new C16073b[i13];
            case 4:
                return new C16075d[i13];
            case 5:
                return new C16074c[i13];
            case 6:
                return new C16076e[i13];
            case 7:
                return new C16077f[i13];
            case 8:
                return new C16078g[i13];
            case 9:
                return new C16079h[i13];
            case 10:
                return new C16801f[i13];
            case 11:
                return new C16802g[i13];
            case 12:
                return new C16803h[i13];
            case 13:
                return new C16805j[i13];
            case 14:
                return new UserAddress[i13];
            case 15:
                return new C17852b[i13];
            case 16:
                return new C17854d[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C17855e[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C17856f[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C21062a[i13];
            case 20:
                return new C21073l[i13];
            case 21:
                return new C21796a[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C21966c[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new EnumC22053a[i13];
            case 24:
                return new C22054b[i13];
            case 25:
                return new C22055c[i13];
            case 26:
                return new C22057e[i13];
            case 27:
                return new C22056d[i13];
            case 28:
                return new C22058f[i13];
            default:
                return new C22059g[i13];
        }
    }
}
