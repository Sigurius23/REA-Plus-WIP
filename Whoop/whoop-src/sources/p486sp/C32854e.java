package p486sp;

import a30.C0273a;
import android.accounts.Account;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.widget.RemoteViews;
import androidx.health.platform.client.exerciseroute.ExerciseRoute;
import androidx.health.platform.client.proto.C1479j0;
import androidx.health.platform.client.proto.C1518r;
import androidx.health.platform.client.proto.C1533u;
import c10.C3831n;
import c93.InterfaceC4339a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m30.C24992h;
import p031b9.AbstractC2875y;
import p084d8.C11764a;
import p127ev.AbstractC13664e;
import p127ev.EnumC13677r;
import p460rg.AbstractC31375j;
import p470rv.AbstractC31834n;
import p497t7.C33562c;
import p504tq.C34079a;
import p508ty.C34248b;
import p529uo.C35109d;
import p529uo.C35113f;
import p529uo.C35121j;
import p529uo.C35124l;
import p529uo.C35125m;
import p529uo.C35131s;
import p529uo.C35132t;
import p532ur.AbstractC35172a;
import p532ur.C35174c;
import p537ux.C35330f;
import p557vo.AbstractC36220b;
import p575w7.AbstractC36868a;
import p575w7.C36869b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q30.C29919n;
import q30.C29920n0;
import q30.C29928r0;
import r30.C30897b;
import r30.C30900e;
import t10.C33296p;
import t10.C33297q;
import t10.C33298r;
import t30.C33517s;
import td3.C33730j;
import td3.C33731k;
import td3.C33733m;
import td3.C33734n;
import te0.AbstractC33745d;
import tv.C34200c;
import u10.C34421i;
import u10.C34430r;
import u10.C34431s;
import u30.C34496a;
import u30.C34498c;
import u30.EnumC34497b;
import u40.C34530f;
import v00.C35459c0;

/* JADX INFO: renamed from: sp.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C32854e implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136883a;

    public /* synthetic */ C32854e(int i13) {
        this.f136883a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f136883a) {
            case 0:
                int iM115294F = AbstractC36220b.m115294F(parcel);
                byte[] bArrM115299d = null;
                while (parcel.dataPosition() < iM115294F) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        AbstractC36220b.m115293E(parcel, i13);
                    } else {
                        bArrM115299d = AbstractC36220b.m115299d(parcel, i13);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F);
                return new C32853d(bArrM115299d);
            case 1:
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
                return new C32855f(pendingIntent);
            case 2:
                int iM115294F3 = AbstractC36220b.m115294F(parcel);
                String[] strArrM115304i = null;
                int[] iArrM115300e = null;
                RemoteViews remoteViews = null;
                byte[] bArrM115299d2 = null;
                while (parcel.dataPosition() < iM115294F3) {
                    int i15 = parcel.readInt();
                    char c3 = (char) i15;
                    if (c3 == 1) {
                        strArrM115304i = AbstractC36220b.m115304i(parcel, i15);
                    } else if (c3 == 2) {
                        iArrM115300e = AbstractC36220b.m115300e(parcel, i15);
                    } else if (c3 == 3) {
                        remoteViews = (RemoteViews) AbstractC36220b.m115302g(parcel, i15, RemoteViews.CREATOR);
                    } else if (c3 != 4) {
                        AbstractC36220b.m115293E(parcel, i15);
                    } else {
                        bArrM115299d2 = AbstractC36220b.m115299d(parcel, i15);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F3);
                C32856g c32856g = new C32856g();
                c32856g.f136885w = strArrM115304i;
                c32856g.f136886x = iArrM115300e;
                c32856g.f136887y = remoteViews;
                c32856g.f136888z = bArrM115299d2;
                return c32856g;
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C33296p(parcel.readString(), (C35459c0) parcel.readParcelable(C33296p.class.getClassLoader()), parcel.readInt() != 0, (C3831n) parcel.readParcelable(C33296p.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (AbstractC29840y) parcel.readParcelable(C33296p.class.getClassLoader()));
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C33297q.f138864w;
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C33298r((AbstractC29840y) parcel.readParcelable(C33298r.class.getClassLoader()), parcel.readInt() != 0);
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C33517s(C30900e.CREATOR.createFromParcel(parcel), C30897b.CREATOR.createFromParcel(parcel), (C24992h) parcel.readParcelable(C33517s.class.getClassLoader()), C29919n.CREATOR.createFromParcel(parcel), (C29928r0) parcel.readSerializable(), parcel.readInt(), C29920n0.CREATOR.createFromParcel(parcel));
            case 7:
                AbstractC22676k.m65750j(parcel, "source");
                int i16 = parcel.readInt();
                if (i16 != 0) {
                    int i17 = 1;
                    if (i16 == 1) {
                        return (AbstractC36868a) C36869b.f157707a.m118255a(parcel, new C11764a(i17, 11));
                    }
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i16, "Unknown storage: "));
                }
                byte[] bArrCreateByteArray = parcel.createByteArray();
                if (bArrCreateByteArray == null) {
                    return null;
                }
                C1479j0 c1479j0M4646v = C1479j0.m4646v(bArrCreateByteArray);
                return AbstractC31834n.m98900i(c1479j0M4646v.m4647r(), c1479j0M4646v.m4649t() ? c1479j0M4646v.m4648s() : null);
            case 8:
                C33730j c33730j = new C33730j();
                if (parcel.readInt() == 1) {
                    c33730j.f141064a = parcel.readString();
                }
                if (parcel.readInt() == 1) {
                    String string = parcel.readString();
                    if (string != null && !BluetoothAdapter.checkBluetoothAddress(string)) {
                        throw new IllegalArgumentException("invalid device address ".concat(string));
                    }
                    c33730j.f141065b = string;
                }
                if (parcel.readInt() == 1) {
                    ParcelUuid parcelUuid = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                    c33730j.f141066c = parcelUuid;
                    c33730j.f141067d = null;
                    if (parcel.readInt() == 1) {
                        ParcelUuid parcelUuid2 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                        if (parcelUuid2 != null && parcelUuid == null) {
                            throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
                        }
                        c33730j.f141066c = parcelUuid;
                        c33730j.f141067d = parcelUuid2;
                    }
                }
                if (parcel.readInt() == 1) {
                    ParcelUuid parcelUuid3 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                    if (parcel.readInt() == 1) {
                        byte[] bArr = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr);
                        if (parcel.readInt() != 0) {
                            byte[] bArr2 = new byte[parcel.readInt()];
                            parcel.readByteArray(bArr2);
                            c33730j.m106614b(parcelUuid3, bArr, bArr2);
                        } else {
                            if (parcelUuid3 == null) {
                                throw new IllegalArgumentException("serviceDataUuid is null!");
                            }
                            c33730j.f141068e = parcelUuid3;
                            c33730j.f141069f = bArr;
                            c33730j.f141070g = null;
                        }
                    }
                }
                int i18 = parcel.readInt();
                if (parcel.readInt() == 1) {
                    byte[] bArr3 = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr3);
                    if (parcel.readInt() != 0) {
                        byte[] bArr4 = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr4);
                        c33730j.m106613a(i18, bArr3, bArr4);
                    } else {
                        if (i18 < 0) {
                            throw new IllegalArgumentException("invalid manufacture id");
                        }
                        c33730j.f141071h = i18;
                        c33730j.f141072i = bArr3;
                        c33730j.f141073j = null;
                    }
                }
                return new C33731k(c33730j.f141064a, c33730j.f141065b, c33730j.f141066c, c33730j.f141067d, c33730j.f141068e, c33730j.f141069f, c33730j.f141070g, c33730j.f141071h, c33730j.f141072i, c33730j.f141073j);
            case 9:
                return new C33733m(parcel);
            case 10:
                return new C33734n(parcel);
            case 11:
                C34079a c34079a = new C34079a(parcel);
                c34079a.f142916w = ((Integer) parcel.readValue(C34079a.class.getClassLoader())).intValue();
                return c34079a;
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                boolean z4 = false;
                boolean z13 = true;
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() == 0) {
                    z13 = z4;
                }
                int i19 = parcel.readInt();
                boolean z14 = true;
                float f13 = parcel.readFloat();
                if (parcel.readInt() == 0) {
                    z14 = z4;
                }
                int i24 = parcel.readInt();
                int i25 = parcel.readInt();
                String string2 = parcel.readString();
                boolean z15 = true;
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z15 = false;
                }
                return new C34200c(z4, z13, i19, f13, z14, i24, i25, string2, string3, z15, EnumC13677r.valueOf(parcel.readString()), parcel.readString(), (AbstractC13664e) parcel.readParcelable(C34200c.class.getClassLoader()));
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C34248b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C34421i((C35459c0) parcel.readParcelable(C34421i.class.getClassLoader()), (C0273a) parcel.readParcelable(C34421i.class.getClassLoader()), (AbstractC29840y) parcel.readParcelable(C34421i.class.getClassLoader()), parcel.readString());
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C34430r((C0273a) parcel.readParcelable(C34430r.class.getClassLoader()), (AbstractC29840y) parcel.readParcelable(C34430r.class.getClassLoader()), parcel.readInt() != 0);
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C34431s.f144674w;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C34496a(parcel.readLong(), parcel.readString());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                int iM106646e = 0;
                boolean z16 = parcel.readInt() != 0;
                boolean z17 = parcel.readInt() != 0;
                boolean z18 = parcel.readInt() != 0;
                EnumC34497b enumC34497bValueOf = EnumC34497b.valueOf(parcel.readString());
                int i26 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i26);
                while (iM106646e != i26) {
                    iM106646e = AbstractC33745d.m106646e(parcel, linkedHashSet, iM106646e, 1);
                }
                return new C34498c(z16, z17, z18, enumC34497bValueOf, linkedHashSet);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C34530f((InterfaceC4339a) parcel.readSerializable(), (Function1) parcel.readSerializable(), (Function1) parcel.readSerializable());
            case 20:
                AbstractC22676k.m65750j(parcel, "source");
                int i27 = parcel.readInt();
                if (i27 != 0) {
                    int i28 = 1;
                    if (i27 == 1) {
                        return (AbstractC36868a) C36869b.f157707a.m118255a(parcel, new C11764a(i28, 14));
                    }
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i27, "Unknown storage: "));
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                if (bArrCreateByteArray2 == null) {
                    return null;
                }
                return new ExerciseRoute(C1518r.m4811t(bArrCreateByteArray2));
            case 21:
                int iM115294F4 = AbstractC36220b.m115294F(parcel);
                String strM115303h = null;
                int iM115317y = 0;
                while (parcel.dataPosition() < iM115294F4) {
                    int i29 = parcel.readInt();
                    char c7 = (char) i29;
                    if (c7 == 1) {
                        iM115317y = AbstractC36220b.m115317y(parcel, i29);
                    } else if (c7 != 2) {
                        AbstractC36220b.m115293E(parcel, i29);
                    } else {
                        strM115303h = AbstractC36220b.m115303h(parcel, i29);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F4);
                return new C35109d(iM115317y, strM115303h);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iM115294F5 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayListM115307l = null;
                int iM115317y2 = 0;
                while (parcel.dataPosition() < iM115294F5) {
                    int i34 = parcel.readInt();
                    char c14 = (char) i34;
                    if (c14 == 1) {
                        iM115317y2 = AbstractC36220b.m115317y(parcel, i34);
                    } else if (c14 != 2) {
                        AbstractC36220b.m115293E(parcel, i34);
                    } else {
                        arrayListM115307l = AbstractC36220b.m115307l(parcel, i34, C35121j.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F5);
                return new C35125m(iM115317y2, arrayListM115307l);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iM115294F6 = AbstractC36220b.m115294F(parcel);
                int iM115317y3 = -1;
                int iM115317y4 = 0;
                int iM115317y5 = 0;
                int iM115317y6 = 0;
                int iM115317y7 = 0;
                String strM115303h2 = null;
                String strM115303h3 = null;
                long jM115289A = 0;
                long jM115289A2 = 0;
                while (parcel.dataPosition() < iM115294F6) {
                    int i35 = parcel.readInt();
                    switch ((char) i35) {
                        case 1:
                            iM115317y4 = AbstractC36220b.m115317y(parcel, i35);
                            break;
                        case 2:
                            iM115317y5 = AbstractC36220b.m115317y(parcel, i35);
                            break;
                        case 3:
                            iM115317y6 = AbstractC36220b.m115317y(parcel, i35);
                            break;
                        case 4:
                            jM115289A = AbstractC36220b.m115289A(parcel, i35);
                            break;
                        case 5:
                            jM115289A2 = AbstractC36220b.m115289A(parcel, i35);
                            break;
                        case 6:
                            strM115303h2 = AbstractC36220b.m115303h(parcel, i35);
                            break;
                        case 7:
                            strM115303h3 = AbstractC36220b.m115303h(parcel, i35);
                            break;
                        case '\b':
                            iM115317y7 = AbstractC36220b.m115317y(parcel, i35);
                            break;
                        case '\t':
                            iM115317y3 = AbstractC36220b.m115317y(parcel, i35);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i35);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F6);
                return new C35121j(iM115317y4, iM115317y5, iM115317y6, jM115289A, jM115289A2, strM115303h2, strM115303h3, iM115317y7, iM115317y3);
            case 24:
                int iM115294F7 = AbstractC36220b.m115294F(parcel);
                Account account = null;
                int iM115317y8 = 0;
                int iM115317y9 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iM115294F7) {
                    int i36 = parcel.readInt();
                    char c15 = (char) i36;
                    if (c15 == 1) {
                        iM115317y8 = AbstractC36220b.m115317y(parcel, i36);
                    } else if (c15 == 2) {
                        account = (Account) AbstractC36220b.m115302g(parcel, i36, Account.CREATOR);
                    } else if (c15 == 3) {
                        iM115317y9 = AbstractC36220b.m115317y(parcel, i36);
                    } else if (c15 != 4) {
                        AbstractC36220b.m115293E(parcel, i36);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC36220b.m115302g(parcel, i36, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F7);
                return new C35131s(iM115317y8, account, iM115317y9, googleSignInAccount);
            case 25:
                int iM115294F8 = AbstractC36220b.m115294F(parcel);
                int iM115317y10 = 0;
                boolean zM115312t = false;
                boolean zM115312t2 = false;
                IBinder iBinderM115316x = null;
                C4969a c4969a = null;
                while (parcel.dataPosition() < iM115294F8) {
                    int i37 = parcel.readInt();
                    char c16 = (char) i37;
                    if (c16 == 1) {
                        iM115317y10 = AbstractC36220b.m115317y(parcel, i37);
                    } else if (c16 == 2) {
                        iBinderM115316x = AbstractC36220b.m115316x(parcel, i37);
                    } else if (c16 == 3) {
                        c4969a = (C4969a) AbstractC36220b.m115302g(parcel, i37, C4969a.CREATOR);
                    } else if (c16 == 4) {
                        zM115312t = AbstractC36220b.m115312t(parcel, i37);
                    } else if (c16 != 5) {
                        AbstractC36220b.m115293E(parcel, i37);
                    } else {
                        zM115312t2 = AbstractC36220b.m115312t(parcel, i37);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F8);
                return new C35132t(iM115317y10, iBinderM115316x, c4969a, zM115312t, zM115312t2);
            case 26:
                int iM115294F9 = AbstractC36220b.m115294F(parcel);
                C35124l c35124l = null;
                int[] iArrM115300e2 = null;
                int[] iArrM115300e3 = null;
                boolean zM115312t3 = false;
                boolean zM115312t4 = false;
                int iM115317y11 = 0;
                while (parcel.dataPosition() < iM115294F9) {
                    int i38 = parcel.readInt();
                    switch ((char) i38) {
                        case 1:
                            c35124l = (C35124l) AbstractC36220b.m115302g(parcel, i38, C35124l.CREATOR);
                            break;
                        case 2:
                            zM115312t3 = AbstractC36220b.m115312t(parcel, i38);
                            break;
                        case 3:
                            zM115312t4 = AbstractC36220b.m115312t(parcel, i38);
                            break;
                        case 4:
                            iArrM115300e2 = AbstractC36220b.m115300e(parcel, i38);
                            break;
                        case 5:
                            iM115317y11 = AbstractC36220b.m115317y(parcel, i38);
                            break;
                        case 6:
                            iArrM115300e3 = AbstractC36220b.m115300e(parcel, i38);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i38);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F9);
                return new C35113f(c35124l, zM115312t3, zM115312t4, iArrM115300e2, iM115317y11, iArrM115300e3);
            case 27:
                int iM115294F10 = AbstractC36220b.m115294F(parcel);
                int iM115317y12 = 0;
                byte bM115313u = -1;
                byte bM115313u2 = -1;
                CameraPosition cameraPosition = null;
                byte bM115313u3 = -1;
                byte bM115313u4 = -1;
                byte bM115313u5 = -1;
                byte bM115313u6 = -1;
                byte bM115313u7 = -1;
                byte bM115313u8 = -1;
                byte bM115313u9 = -1;
                byte bM115313u10 = -1;
                byte bM115313u11 = -1;
                Float fM115315w = null;
                Float fM115315w2 = null;
                LatLngBounds latLngBounds = null;
                byte bM115313u12 = -1;
                Integer numM115318z = null;
                String strM115303h4 = null;
                while (parcel.dataPosition() < iM115294F10) {
                    int i39 = parcel.readInt();
                    switch ((char) i39) {
                        case 2:
                            bM115313u = AbstractC36220b.m115313u(parcel, i39);
                            break;
                        case 3:
                            bM115313u2 = AbstractC36220b.m115313u(parcel, i39);
                            break;
                        case 4:
                            iM115317y12 = AbstractC36220b.m115317y(parcel, i39);
                            break;
                        case 5:
                            cameraPosition = (CameraPosition) AbstractC36220b.m115302g(parcel, i39, CameraPosition.CREATOR);
                            break;
                        case 6:
                            bM115313u3 = AbstractC36220b.m115313u(parcel, i39);
                            break;
                        case 7:
                            bM115313u4 = AbstractC36220b.m115313u(parcel, i39);
                            break;
                        case '\b':
                            bM115313u5 = AbstractC36220b.m115313u(parcel, i39);
                            break;
                        case '\t':
                            bM115313u6 = AbstractC36220b.m115313u(parcel, i39);
                            break;
                        case '\n':
                            bM115313u7 = AbstractC36220b.m115313u(parcel, i39);
                            break;
                        case 11:
                            bM115313u8 = AbstractC36220b.m115313u(parcel, i39);
                            break;
                        case '\f':
                            bM115313u9 = AbstractC36220b.m115313u(parcel, i39);
                            break;
                        case '\r':
                        default:
                            AbstractC36220b.m115293E(parcel, i39);
                            break;
                        case 14:
                            bM115313u10 = AbstractC36220b.m115313u(parcel, i39);
                            break;
                        case 15:
                            bM115313u11 = AbstractC36220b.m115313u(parcel, i39);
                            break;
                        case 16:
                            fM115315w = AbstractC36220b.m115315w(parcel, i39);
                            break;
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            fM115315w2 = AbstractC36220b.m115315w(parcel, i39);
                            break;
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            latLngBounds = (LatLngBounds) AbstractC36220b.m115302g(parcel, i39, LatLngBounds.CREATOR);
                            break;
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            bM115313u12 = AbstractC36220b.m115313u(parcel, i39);
                            break;
                        case 20:
                            numM115318z = AbstractC36220b.m115318z(parcel, i39);
                            break;
                        case 21:
                            strM115303h4 = AbstractC36220b.m115303h(parcel, i39);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F10);
                GoogleMapOptions googleMapOptions = new GoogleMapOptions();
                googleMapOptions.f20608y = -1;
                googleMapOptions.f20600N = null;
                googleMapOptions.f20601O = null;
                googleMapOptions.f20602P = null;
                googleMapOptions.f20604R = null;
                googleMapOptions.f20605S = null;
                googleMapOptions.f20606w = AbstractC31375j.m96502r(bM115313u);
                googleMapOptions.f20607x = AbstractC31375j.m96502r(bM115313u2);
                googleMapOptions.f20608y = iM115317y12;
                googleMapOptions.f20609z = cameraPosition;
                googleMapOptions.f20591E = AbstractC31375j.m96502r(bM115313u3);
                googleMapOptions.f20592F = AbstractC31375j.m96502r(bM115313u4);
                googleMapOptions.f20593G = AbstractC31375j.m96502r(bM115313u5);
                googleMapOptions.f20594H = AbstractC31375j.m96502r(bM115313u6);
                googleMapOptions.f20595I = AbstractC31375j.m96502r(bM115313u7);
                googleMapOptions.f20596J = AbstractC31375j.m96502r(bM115313u8);
                googleMapOptions.f20597K = AbstractC31375j.m96502r(bM115313u9);
                googleMapOptions.f20598L = AbstractC31375j.m96502r(bM115313u10);
                googleMapOptions.f20599M = AbstractC31375j.m96502r(bM115313u11);
                googleMapOptions.f20600N = fM115315w;
                googleMapOptions.f20601O = fM115315w2;
                googleMapOptions.f20602P = latLngBounds;
                googleMapOptions.f20603Q = AbstractC31375j.m96502r(bM115313u12);
                googleMapOptions.f20604R = numM115318z;
                googleMapOptions.f20605S = strM115303h4;
                return googleMapOptions;
            case 28:
                return new C35174c((PendingIntent) parcel.readParcelable(AbstractC35172a.class.getClassLoader()), parcel.readInt() != 0);
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C35330f.f150532w;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f136883a) {
            case 0:
                return new C32853d[i13];
            case 1:
                return new C32855f[i13];
            case 2:
                return new C32856g[i13];
            case 3:
                return new C33296p[i13];
            case 4:
                return new C33297q[i13];
            case 5:
                return new C33298r[i13];
            case 6:
                return new C33517s[i13];
            case 7:
                return new C33562c[i13];
            case 8:
                return new C33731k[i13];
            case 9:
                return new C33733m[i13];
            case 10:
                return new C33734n[i13];
            case 11:
                return new C34079a[i13];
            case 12:
                return new C34200c[i13];
            case 13:
                return new C34248b[i13];
            case 14:
                return new C34421i[i13];
            case 15:
                return new C34430r[i13];
            case 16:
                return new C34431s[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C34496a[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C34498c[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C34530f[i13];
            case 20:
                return new ExerciseRoute[i13];
            case 21:
                return new C35109d[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C35125m[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C35121j[i13];
            case 24:
                return new C35131s[i13];
            case 25:
                return new C35132t[i13];
            case 26:
                return new C35113f[i13];
            case 27:
                return new GoogleMapOptions[i13];
            case 28:
                return new AbstractC35172a[i13];
            default:
                return new C35330f[i13];
        }
    }
}
