package p126eq;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1511p2;
import androidx.health.platform.client.proto.C1516q2;
import androidx.health.platform.client.proto.C1526s2;
import androidx.health.platform.client.proto.C1531t2;
import androidx.health.platform.client.proto.C1533u;
import androidx.health.platform.client.proto.InterfaceC1544w0;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;
import com.mapbox.maps.ImageHolder;
import g10.C15216b;
import g20.C15255a;
import g20.C15256b;
import g20.C15257c;
import g20.C15261g;
import g20.C15262h;
import g20.C15263i;
import g20.C15264j;
import g20.C15265k;
import g20.C15273s;
import g20.C15274t;
import g20.C15275u;
import gp.C16030f0;
import gp.C16032g0;
import gp.C16034h0;
import gp.C16036i0;
import gp.C16038j0;
import gp.C16049p;
import gp.C16056s0;
import gp.EnumC16021b;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import mp.C25801t0;
import p031b9.AbstractC2875y;
import p084d8.C11764a;
import p127ev.C13662c;
import p127ev.C13663d;
import p131f.BinderC13765c;
import p131f.C13763a;
import p131f.C13766d;
import p131f.InterfaceC13764b;
import p140f8.C14238a;
import p140f8.C14239b;
import p140f8.C14240c;
import p140f8.C14241d;
import p159fy.C14858c;
import p159fy.C14859d;
import p557vo.AbstractC36220b;
import p575w7.AbstractC36868a;
import p575w7.C36869b;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;
import y00.AbstractC38970u5;
import y00.C38797c3;
import y00.C38809d5;
import y00.InterfaceC38802c8;
import y00.InterfaceC38946s;

/* JADX INFO: renamed from: eq.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C13433b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47102a;

    public /* synthetic */ C13433b(int i13) {
        this.f47102a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i13;
        int i14;
        InterfaceC13764b interfaceC13764b;
        int i15 = this.f47102a;
        C36869b c36869b = C36869b.f157707a;
        int iM115317y = 0;
        int iM115317y2 = 0;
        boolean zM115312t = false;
        boolean zM115312t2 = false;
        boolean zM115312t3 = false;
        String strM115303h = null;
        boolean z4 = true;
        switch (i15) {
            case 0:
                boolean zM115312t4 = false;
                String strM115303h2 = null;
                int iM115294F = AbstractC36220b.m115294F(parcel);
                String strM115303h3 = null;
                String strM115303h4 = null;
                String strM115303h5 = null;
                String strM115303h6 = null;
                String strM115303h7 = null;
                String strM115303h8 = null;
                while (parcel.dataPosition() < iM115294F) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strM115303h5 = AbstractC36220b.m115303h(parcel, i16);
                            break;
                        case 2:
                            iM115317y = AbstractC36220b.m115317y(parcel, i16);
                            break;
                        case 3:
                            zM115312t4 = AbstractC36220b.m115312t(parcel, i16);
                            break;
                        case 4:
                            strM115303h2 = AbstractC36220b.m115303h(parcel, i16);
                            break;
                        case 5:
                            strM115303h3 = AbstractC36220b.m115303h(parcel, i16);
                            break;
                        case 6:
                            strM115303h4 = AbstractC36220b.m115303h(parcel, i16);
                            break;
                        case 7:
                            strM115303h6 = AbstractC36220b.m115303h(parcel, i16);
                            break;
                        case '\b':
                            strM115303h7 = AbstractC36220b.m115303h(parcel, i16);
                            break;
                        case '\t':
                            strM115303h8 = AbstractC36220b.m115303h(parcel, i16);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i16);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F);
                C13432a c13432a = new C13432a();
                c13432a.f47098w = strM115303h5;
                c13432a.f47099x = iM115317y;
                c13432a.f47100y = zM115312t4;
                c13432a.f47101z = strM115303h2;
                c13432a.f47093E = strM115303h3;
                c13432a.f47094F = strM115303h4;
                c13432a.f47095G = strM115303h6;
                c13432a.f47096H = strM115303h7;
                c13432a.f47097I = strM115303h8;
                return c13432a;
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C13662c(parcel.readInt() == 0 ? null : ImageHolder.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ImageHolder.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ImageHolder.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readFloat());
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                int i17 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList.add(Float.valueOf(parcel.readFloat()));
                }
                float f13 = parcel.readFloat();
                int i19 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i19);
                for (int i24 = 0; i24 != i19; i24++) {
                    arrayList2.add(Float.valueOf(parcel.readFloat()));
                }
                String string2 = parcel.readString();
                int i25 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i25);
                for (int i26 = 0; i26 != i25; i26++) {
                    arrayList3.add(Float.valueOf(parcel.readFloat()));
                }
                int i27 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i27);
                for (int i28 = 0; i28 != i27; i28++) {
                    arrayList4.add(Float.valueOf(parcel.readFloat()));
                }
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                String string3 = parcel.readString();
                if (string3 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string3.equals("MAP")) {
                    i13 = 1;
                } else {
                    if (!string3.equals("VIEWPORT")) {
                        throw new IllegalArgumentException("No enum constant com.mapbox.maps.plugin.ModelScaleMode.".concat(string3));
                    }
                    i13 = 2;
                }
                float f14 = parcel.readFloat();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i29 = parcel.readInt();
                String string7 = parcel.readString();
                float f15 = parcel.readFloat();
                String string8 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                String string9 = parcel.readString();
                if (string9 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string9.equals("SEA")) {
                    i14 = 1;
                } else {
                    if (!string9.equals("GROUND")) {
                        throw new IllegalArgumentException("No enum constant com.mapbox.maps.plugin.ModelElevationReference.".concat(string9));
                    }
                    i14 = 2;
                }
                return new C13663d(string, arrayList, f13, arrayList2, string2, arrayList3, arrayList4, z13, z14, i13, f14, string4, string5, string6, i29, string7, f15, string8, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, i14, parcel.readString(), parcel.readString());
            case 3:
                C13766d c13766d = new C13766d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i34 = BinderC13765c.f49115g;
                if (strongBinder == null) {
                    interfaceC13764b = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC13764b.f49114e);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC13764b)) {
                        C13763a c13763a = new C13763a();
                        c13763a.f49113f = strongBinder;
                        interfaceC13764b = c13763a;
                    } else {
                        interfaceC13764b = (InterfaceC13764b) iInterfaceQueryLocalInterface;
                    }
                }
                c13766d.f49117w = interfaceC13764b;
                return c13766d;
            case 4:
                AbstractC22676k.m65750j(parcel, "source");
                int i35 = parcel.readInt();
                if (i35 != 0) {
                    if (i35 == 1) {
                        return (AbstractC36868a) c36869b.m118255a(parcel, new C11764a(z4 ? 1 : 0, 7));
                    }
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i35, "Unknown storage: "));
                }
                byte[] bArrCreateByteArray = parcel.createByteArray();
                if (bArrCreateByteArray == null) {
                    return null;
                }
                return new C14238a(C1511p2.m4796t(bArrCreateByteArray));
            case 5:
                AbstractC22676k.m65750j(parcel, "source");
                int i36 = parcel.readInt();
                if (i36 != 0) {
                    if (i36 == 1) {
                        return (AbstractC36868a) c36869b.m118255a(parcel, new C11764a(z4 ? 1 : 0, 8));
                    }
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i36, "Unknown storage: "));
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                if (bArrCreateByteArray2 == null) {
                    return null;
                }
                return new C14239b(C1516q2.m4802q(bArrCreateByteArray2));
            case 6:
                AbstractC22676k.m65750j(parcel, "source");
                int i37 = parcel.readInt();
                if (i37 != 0) {
                    if (i37 == 1) {
                        return (AbstractC36868a) c36869b.m118255a(parcel, new C11764a(z4 ? 1 : 0, 9));
                    }
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i37, "Unknown storage: "));
                }
                byte[] bArrCreateByteArray3 = parcel.createByteArray();
                if (bArrCreateByteArray3 == null) {
                    return null;
                }
                InterfaceC1544w0 interfaceC1544w0M4819q = C1526s2.m4818s(bArrCreateByteArray3).m4819q();
                AbstractC22676k.m65749i(interfaceC1544w0M4819q, "proto.dataPointUidList");
                return new C14240c(interfaceC1544w0M4819q);
            case 7:
                AbstractC22676k.m65750j(parcel, "source");
                int i38 = parcel.readInt();
                if (i38 != 0) {
                    if (i38 == 1) {
                        return (AbstractC36868a) c36869b.m118255a(parcel, new C11764a(z4 ? 1 : 0, 10));
                    }
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i38, "Unknown storage: "));
                }
                byte[] bArrCreateByteArray4 = parcel.createByteArray();
                if (bArrCreateByteArray4 == null) {
                    return null;
                }
                return new C14241d(C1531t2.m4820q(bArrCreateByteArray4));
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C14858c(C38797c3.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList());
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C14859d.f55485w;
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C15216b((C38809d5) parcel.readParcelable(C15216b.class.getClassLoader()), (AbstractC38970u5) parcel.readParcelable(C15216b.class.getClassLoader()));
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C15255a.f57286w;
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C15256b((InterfaceC38802c8) parcel.readParcelable(C15256b.class.getClassLoader()));
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C15257c((Throwable) parcel.readSerializable());
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string10 = parcel.readString();
                boolean z15 = parcel.readInt() != 0;
                int i39 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i39);
                int iM106646e = 0;
                while (iM106646e != i39) {
                    iM106646e = AbstractC33745d.m106646e(parcel, linkedHashSet, iM106646e, 1);
                }
                return new C15261g(string10, z15, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                boolean z16 = parcel.readInt() != 0;
                int i44 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i44);
                int iM106646e2 = 0;
                while (iM106646e2 != i44) {
                    iM106646e2 = AbstractC33745d.m106646e(parcel, linkedHashSet2, iM106646e2, 1);
                }
                return new C15262h(string11, string12, z16, linkedHashSet2, parcel.readInt() != 0, (InterfaceC38946s) parcel.readParcelable(C15262h.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                boolean z17 = parcel.readInt() != 0;
                int i45 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i45);
                int iM106646e3 = 0;
                while (iM106646e3 != i45) {
                    iM106646e3 = AbstractC33745d.m106646e(parcel, linkedHashSet3, iM106646e3, 1);
                }
                return new C15263i(string13, string14, z17, linkedHashSet3, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                boolean z18 = parcel.readInt() != 0;
                int i46 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i46);
                int iM106646e4 = 0;
                while (iM106646e4 != i46) {
                    iM106646e4 = AbstractC33745d.m106646e(parcel, linkedHashSet4, iM106646e4, 1);
                }
                return new C15264j(string15, string16, z18, linkedHashSet4, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                boolean z19 = parcel.readInt() != 0;
                int i47 = parcel.readInt();
                LinkedHashSet linkedHashSet5 = new LinkedHashSet(i47);
                int iM106646e5 = 0;
                while (iM106646e5 != i47) {
                    iM106646e5 = AbstractC33745d.m106646e(parcel, linkedHashSet5, iM106646e5, 1);
                }
                return new C15265k(string17, string18, z19, linkedHashSet5, parcel.readInt() != 0, (InterfaceC38802c8) parcel.readParcelable(C15265k.class.getClassLoader()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C15273s.f57359w;
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C15274t.f57360w;
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C15275u((Throwable) parcel.readSerializable());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                try {
                    return EnumC16021b.m45339b(parcel.readString());
                } catch (Attachment$UnsupportedAttachmentException e5) {
                    throw new RuntimeException(e5);
                }
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iM115294F2 = AbstractC36220b.m115294F(parcel);
                while (parcel.dataPosition() < iM115294F2) {
                    int i48 = parcel.readInt();
                    if (((char) i48) != 1) {
                        AbstractC36220b.m115293E(parcel, i48);
                    } else {
                        zM115312t3 = AbstractC36220b.m115312t(parcel, i48);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F2);
                return new C16056s0(zM115312t3);
            case 24:
                int iM115294F3 = AbstractC36220b.m115294F(parcel);
                long jM115289A = 0;
                while (parcel.dataPosition() < iM115294F3) {
                    int i49 = parcel.readInt();
                    if (((char) i49) != 1) {
                        AbstractC36220b.m115293E(parcel, i49);
                    } else {
                        jM115289A = AbstractC36220b.m115289A(parcel, i49);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F3);
                return new C16030f0(jM115289A);
            case 25:
                int iM115294F4 = AbstractC36220b.m115294F(parcel);
                while (parcel.dataPosition() < iM115294F4) {
                    int i54 = parcel.readInt();
                    if (((char) i54) != 1) {
                        AbstractC36220b.m115293E(parcel, i54);
                    } else {
                        zM115312t2 = AbstractC36220b.m115312t(parcel, i54);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F4);
                return new C16032g0(zM115312t2);
            case 26:
                int iM115294F5 = AbstractC36220b.m115294F(parcel);
                while (parcel.dataPosition() < iM115294F5) {
                    int i55 = parcel.readInt();
                    if (((char) i55) != 1) {
                        AbstractC36220b.m115293E(parcel, i55);
                    } else {
                        zM115312t = AbstractC36220b.m115312t(parcel, i55);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F5);
                return new C16049p(zM115312t);
            case 27:
                int iM115294F6 = AbstractC36220b.m115294F(parcel);
                while (parcel.dataPosition() < iM115294F6) {
                    int i56 = parcel.readInt();
                    if (((char) i56) != 1) {
                        AbstractC36220b.m115293E(parcel, i56);
                    } else {
                        strM115303h = AbstractC36220b.m115303h(parcel, i56);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F6);
                return new C16034h0(strM115303h);
            case 28:
                int iM115294F7 = AbstractC36220b.m115294F(parcel);
                byte[] bArrM115299d = null;
                byte[] bArrM115299d2 = null;
                byte[] bArrM115299d3 = null;
                while (parcel.dataPosition() < iM115294F7) {
                    int i57 = parcel.readInt();
                    char c3 = (char) i57;
                    if (c3 == 1) {
                        bArrM115299d = AbstractC36220b.m115299d(parcel, i57);
                    } else if (c3 == 2) {
                        bArrM115299d2 = AbstractC36220b.m115299d(parcel, i57);
                    } else if (c3 == 3) {
                        bArrM115299d3 = AbstractC36220b.m115299d(parcel, i57);
                    } else if (c3 != 4) {
                        AbstractC36220b.m115293E(parcel, i57);
                    } else {
                        iM115317y2 = AbstractC36220b.m115317y(parcel, i57);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F7);
                return new C16036i0(bArrM115299d == null ? null : C25801t0.m76048l(bArrM115299d.length, bArrM115299d), bArrM115299d2 == null ? null : C25801t0.m76048l(bArrM115299d2.length, bArrM115299d2), bArrM115299d3 != null ? C25801t0.m76048l(bArrM115299d3.length, bArrM115299d3) : null, iM115317y2);
            default:
                int iM115294F8 = AbstractC36220b.m115294F(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (true) {
                        if (parcel.dataPosition() >= iM115294F8) {
                            AbstractC36220b.m115308m(parcel, iM115294F8);
                            return new C16038j0(bArr);
                        }
                        int i58 = parcel.readInt();
                        if (((char) i58) != 1) {
                            AbstractC36220b.m115293E(parcel, i58);
                        } else {
                            int iM115290B = AbstractC36220b.m115290B(parcel, i58);
                            int iDataPosition = parcel.dataPosition();
                            if (iM115290B == 0) {
                            }
                            int i59 = parcel.readInt();
                            byte[][] bArr2 = new byte[i59][];
                            for (int i64 = 0; i64 < i59; i64++) {
                                bArr2[i64] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition + iM115290B);
                            bArr = bArr2;
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f47102a) {
            case 0:
                return new C13432a[i13];
            case 1:
                return new C13662c[i13];
            case 2:
                return new C13663d[i13];
            case 3:
                return new C13766d[i13];
            case 4:
                return new C14238a[i13];
            case 5:
                return new C14239b[i13];
            case 6:
                return new C14240c[i13];
            case 7:
                return new C14241d[i13];
            case 8:
                return new C14858c[i13];
            case 9:
                return new C14859d[i13];
            case 10:
                return new C15216b[i13];
            case 11:
                return new C15255a[i13];
            case 12:
                return new C15256b[i13];
            case 13:
                return new C15257c[i13];
            case 14:
                return new C15261g[i13];
            case 15:
                return new C15262h[i13];
            case 16:
                return new C15263i[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C15264j[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C15265k[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C15273s[i13];
            case 20:
                return new C15274t[i13];
            case 21:
                return new C15275u[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new EnumC16021b[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C16056s0[i13];
            case 24:
                return new C16030f0[i13];
            case 25:
                return new C16032g0[i13];
            case 26:
                return new C16049p[i13];
            case 27:
                return new C16034h0[i13];
            case 28:
                return new C16036i0[i13];
            default:
                return new C16038j0[i13];
        }
    }
}
