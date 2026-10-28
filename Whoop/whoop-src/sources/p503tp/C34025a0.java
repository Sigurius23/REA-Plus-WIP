package p503tp;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.List;
import p529uo.AbstractC35135w;
import p529uo.C35109d;
import p557vo.AbstractC36220b;

/* JADX INFO: renamed from: tp.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C34025a0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142669a;

    public /* synthetic */ C34025a0(int i13) {
        this.f142669a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f142669a) {
            case 0:
                int iM115294F = AbstractC36220b.m115294F(parcel);
                int iM115317y = 1000;
                long jM115289A = 0;
                C34031d0[] c34031d0Arr = null;
                int iM115317y2 = 1;
                int iM115317y3 = 1;
                while (parcel.dataPosition() < iM115294F) {
                    int i13 = parcel.readInt();
                    char c3 = (char) i13;
                    if (c3 == 1) {
                        iM115317y2 = AbstractC36220b.m115317y(parcel, i13);
                    } else if (c3 == 2) {
                        iM115317y3 = AbstractC36220b.m115317y(parcel, i13);
                    } else if (c3 == 3) {
                        jM115289A = AbstractC36220b.m115289A(parcel, i13);
                    } else if (c3 == 4) {
                        iM115317y = AbstractC36220b.m115317y(parcel, i13);
                    } else if (c3 != 5) {
                        AbstractC36220b.m115293E(parcel, i13);
                    } else {
                        c34031d0Arr = (C34031d0[]) AbstractC36220b.m115306k(parcel, i13, C34031d0.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F);
                LocationAvailability locationAvailability = new LocationAvailability();
                locationAvailability.f20579z = iM115317y;
                locationAvailability.f20576w = iM115317y2;
                locationAvailability.f20577x = iM115317y3;
                locationAvailability.f20578y = jM115289A;
                locationAvailability.f20575E = c34031d0Arr;
                return locationAvailability;
            case 1:
                int iM115294F2 = AbstractC36220b.m115294F(parcel);
                int iM115317y4 = 102;
                long jM115289A2 = 3600000;
                long jM115289A3 = 600000;
                boolean zM115312t = false;
                long jM115289A4 = 0;
                float fM115314v = 0.0f;
                int iM115317y5 = Integer.MAX_VALUE;
                long jM115289A5 = Long.MAX_VALUE;
                boolean zM115312t2 = false;
                while (parcel.dataPosition() < iM115294F2) {
                    int i14 = parcel.readInt();
                    boolean z4 = zM115312t2;
                    switch ((char) i14) {
                        case 1:
                            iM115317y4 = AbstractC36220b.m115317y(parcel, i14);
                            break;
                        case 2:
                            jM115289A2 = AbstractC36220b.m115289A(parcel, i14);
                            break;
                        case 3:
                            jM115289A3 = AbstractC36220b.m115289A(parcel, i14);
                            break;
                        case 4:
                            zM115312t = AbstractC36220b.m115312t(parcel, i14);
                            break;
                        case 5:
                            jM115289A5 = AbstractC36220b.m115289A(parcel, i14);
                            break;
                        case 6:
                            iM115317y5 = AbstractC36220b.m115317y(parcel, i14);
                            break;
                        case 7:
                            fM115314v = AbstractC36220b.m115314v(parcel, i14);
                            break;
                        case '\b':
                            jM115289A4 = AbstractC36220b.m115289A(parcel, i14);
                            break;
                        case '\t':
                            zM115312t2 = AbstractC36220b.m115312t(parcel, i14);
                            continue;
                        default:
                            AbstractC36220b.m115293E(parcel, i14);
                            break;
                    }
                    zM115312t2 = z4;
                }
                AbstractC36220b.m115308m(parcel, iM115294F2);
                LocationRequest locationRequest = new LocationRequest();
                locationRequest.f20585w = iM115317y4;
                locationRequest.f20586x = jM115289A2;
                locationRequest.f20587y = jM115289A3;
                locationRequest.f20588z = zM115312t;
                locationRequest.f20580E = jM115289A5;
                locationRequest.f20581F = iM115317y5;
                locationRequest.f20582G = fM115314v;
                locationRequest.f20583H = jM115289A4;
                locationRequest.f20584I = zM115312t2;
                return locationRequest;
            case 2:
                int iM115294F3 = AbstractC36220b.m115294F(parcel);
                List listM115307l = LocationResult.f20589x;
                while (parcel.dataPosition() < iM115294F3) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        AbstractC36220b.m115293E(parcel, i15);
                    } else {
                        listM115307l = AbstractC36220b.m115307l(parcel, i15, Location.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F3);
                return new LocationResult(listM115307l);
            case 3:
                int iM115294F4 = AbstractC36220b.m115294F(parcel);
                String strM115303h = "";
                String strM115303h2 = "";
                String strM115303h3 = strM115303h2;
                while (parcel.dataPosition() < iM115294F4) {
                    int i16 = parcel.readInt();
                    char c7 = (char) i16;
                    if (c7 == 1) {
                        strM115303h2 = AbstractC36220b.m115303h(parcel, i16);
                    } else if (c7 == 2) {
                        strM115303h3 = AbstractC36220b.m115303h(parcel, i16);
                    } else if (c7 != 5) {
                        AbstractC36220b.m115293E(parcel, i16);
                    } else {
                        strM115303h = AbstractC36220b.m115303h(parcel, i16);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F4);
                return new C34029c0(strM115303h, strM115303h2, strM115303h3);
            case 4:
                int iM115294F5 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayListM115307l = null;
                boolean zM115312t3 = false;
                boolean zM115312t4 = false;
                C34029c0 c34029c0 = null;
                while (parcel.dataPosition() < iM115294F5) {
                    int i17 = parcel.readInt();
                    char c14 = (char) i17;
                    if (c14 == 1) {
                        arrayListM115307l = AbstractC36220b.m115307l(parcel, i17, LocationRequest.CREATOR);
                    } else if (c14 == 2) {
                        zM115312t3 = AbstractC36220b.m115312t(parcel, i17);
                    } else if (c14 == 3) {
                        zM115312t4 = AbstractC36220b.m115312t(parcel, i17);
                    } else if (c14 != 5) {
                        AbstractC36220b.m115293E(parcel, i17);
                    } else {
                        c34029c0 = (C34029c0) AbstractC36220b.m115302g(parcel, i17, C34029c0.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F5);
                return new C34039j(arrayListM115307l, zM115312t3, zM115312t4, c34029c0);
            case 5:
                int iM115294F6 = AbstractC36220b.m115294F(parcel);
                Status status = null;
                C34042m c34042m = null;
                while (parcel.dataPosition() < iM115294F6) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        status = (Status) AbstractC36220b.m115302g(parcel, i18, Status.CREATOR);
                    } else if (c15 != 2) {
                        AbstractC36220b.m115293E(parcel, i18);
                    } else {
                        c34042m = (C34042m) AbstractC36220b.m115302g(parcel, i18, C34042m.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F6);
                return new C34041l(status, c34042m);
            case 6:
                int iM115294F7 = AbstractC36220b.m115294F(parcel);
                boolean zM115312t5 = false;
                boolean zM115312t6 = false;
                boolean zM115312t7 = false;
                boolean zM115312t8 = false;
                boolean zM115312t9 = false;
                boolean zM115312t10 = false;
                while (parcel.dataPosition() < iM115294F7) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            zM115312t5 = AbstractC36220b.m115312t(parcel, i19);
                            break;
                        case 2:
                            zM115312t6 = AbstractC36220b.m115312t(parcel, i19);
                            break;
                        case 3:
                            zM115312t7 = AbstractC36220b.m115312t(parcel, i19);
                            break;
                        case 4:
                            zM115312t8 = AbstractC36220b.m115312t(parcel, i19);
                            break;
                        case 5:
                            zM115312t9 = AbstractC36220b.m115312t(parcel, i19);
                            break;
                        case 6:
                            zM115312t10 = AbstractC36220b.m115312t(parcel, i19);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i19);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F7);
                return new C34042m(zM115312t5, zM115312t6, zM115312t7, zM115312t8, zM115312t9, zM115312t10);
            case 7:
                int iM115294F8 = AbstractC36220b.m115294F(parcel);
                int iM115317y6 = 1;
                int iM115317y7 = 1;
                long jM115289A6 = -1;
                long jM115289A7 = -1;
                while (parcel.dataPosition() < iM115294F8) {
                    int i24 = parcel.readInt();
                    char c16 = (char) i24;
                    if (c16 == 1) {
                        iM115317y6 = AbstractC36220b.m115317y(parcel, i24);
                    } else if (c16 == 2) {
                        iM115317y7 = AbstractC36220b.m115317y(parcel, i24);
                    } else if (c16 == 3) {
                        jM115289A6 = AbstractC36220b.m115289A(parcel, i24);
                    } else if (c16 != 4) {
                        AbstractC36220b.m115293E(parcel, i24);
                    } else {
                        jM115289A7 = AbstractC36220b.m115289A(parcel, i24);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F8);
                return new C34031d0(iM115317y6, iM115317y7, jM115289A6, jM115289A7);
            case 8:
                int iM115294F9 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayListM115307l2 = null;
                int iM115317y8 = 0;
                while (parcel.dataPosition() < iM115294F9) {
                    int i25 = parcel.readInt();
                    char c17 = (char) i25;
                    if (c17 == 1) {
                        arrayListM115307l2 = AbstractC36220b.m115307l(parcel, i25, C34033e0.CREATOR);
                    } else if (c17 != 2) {
                        AbstractC36220b.m115293E(parcel, i25);
                    } else {
                        iM115317y8 = AbstractC36220b.m115317y(parcel, i25);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F9);
                return new C34043n(arrayListM115307l2, iM115317y8);
            case 9:
                int iM115294F10 = AbstractC36220b.m115294F(parcel);
                int iM115317y9 = 0;
                int iM115317y10 = 0;
                int iM115317y11 = 0;
                int iM115317y12 = 0;
                while (parcel.dataPosition() < iM115294F10) {
                    int i26 = parcel.readInt();
                    char c18 = (char) i26;
                    if (c18 == 1) {
                        iM115317y9 = AbstractC36220b.m115317y(parcel, i26);
                    } else if (c18 == 2) {
                        iM115317y10 = AbstractC36220b.m115317y(parcel, i26);
                    } else if (c18 == 3) {
                        iM115317y11 = AbstractC36220b.m115317y(parcel, i26);
                    } else if (c18 != 4) {
                        AbstractC36220b.m115293E(parcel, i26);
                    } else {
                        iM115317y12 = AbstractC36220b.m115317y(parcel, i26);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F10);
                return new C34033e0(iM115317y9, iM115317y10, iM115317y11, iM115317y12);
            case 10:
                int iM115294F11 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayListM115307l3 = null;
                boolean z13 = false;
                Bundle bundleM115298c = null;
                long jM115289A8 = 0;
                long jM115289A9 = 0;
                int iM115317y13 = 0;
                while (parcel.dataPosition() < iM115294F11) {
                    int i27 = parcel.readInt();
                    char c19 = (char) i27;
                    if (c19 == 1) {
                        arrayListM115307l3 = AbstractC36220b.m115307l(parcel, i27, C34034f.CREATOR);
                    } else if (c19 == 2) {
                        jM115289A8 = AbstractC36220b.m115289A(parcel, i27);
                    } else if (c19 == 3) {
                        jM115289A9 = AbstractC36220b.m115289A(parcel, i27);
                    } else if (c19 == 4) {
                        iM115317y13 = AbstractC36220b.m115317y(parcel, i27);
                    } else if (c19 != 5) {
                        AbstractC36220b.m115293E(parcel, i27);
                    } else {
                        bundleM115298c = AbstractC36220b.m115298c(parcel, i27);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F11);
                ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult();
                AbstractC35135w.m111090b(arrayListM115307l3 != null && arrayListM115307l3.size() > 0, "Must have at least 1 detected activity");
                if (jM115289A8 > 0 && jM115289A9 > 0) {
                    z13 = true;
                }
                AbstractC35135w.m111090b(z13, "Must set times");
                activityRecognitionResult.f20571w = arrayListM115307l3;
                activityRecognitionResult.f20572x = jM115289A8;
                activityRecognitionResult.f20573y = jM115289A9;
                activityRecognitionResult.f20574z = iM115317y13;
                activityRecognitionResult.f20570E = bundleM115298c;
                return activityRecognitionResult;
            case 11:
                int iM115294F12 = AbstractC36220b.m115294F(parcel);
                int iM115317y14 = 0;
                int iM115317y15 = 0;
                while (parcel.dataPosition() < iM115294F12) {
                    int i28 = parcel.readInt();
                    char c24 = (char) i28;
                    if (c24 == 1) {
                        iM115317y14 = AbstractC36220b.m115317y(parcel, i28);
                    } else if (c24 != 2) {
                        AbstractC36220b.m115293E(parcel, i28);
                    } else {
                        iM115317y15 = AbstractC36220b.m115317y(parcel, i28);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F12);
                return new C34026b(iM115317y14, iM115317y15);
            case 12:
                int iM115294F13 = AbstractC36220b.m115294F(parcel);
                int iM115317y16 = 0;
                long jM115289A10 = 0;
                int iM115317y17 = 0;
                while (parcel.dataPosition() < iM115294F13) {
                    int i29 = parcel.readInt();
                    char c25 = (char) i29;
                    if (c25 == 1) {
                        iM115317y16 = AbstractC36220b.m115317y(parcel, i29);
                    } else if (c25 == 2) {
                        iM115317y17 = AbstractC36220b.m115317y(parcel, i29);
                    } else if (c25 != 3) {
                        AbstractC36220b.m115293E(parcel, i29);
                    } else {
                        jM115289A10 = AbstractC36220b.m115289A(parcel, i29);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F13);
                return new C34028c(iM115317y16, jM115289A10, iM115317y17);
            case 13:
                int iM115294F14 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayListM115307l4 = null;
                String strM115303h4 = null;
                ArrayList arrayListM115307l5 = null;
                String strM115303h5 = null;
                while (parcel.dataPosition() < iM115294F14) {
                    int i34 = parcel.readInt();
                    char c26 = (char) i34;
                    if (c26 == 1) {
                        arrayListM115307l4 = AbstractC36220b.m115307l(parcel, i34, C34026b.CREATOR);
                    } else if (c26 == 2) {
                        strM115303h4 = AbstractC36220b.m115303h(parcel, i34);
                    } else if (c26 == 3) {
                        arrayListM115307l5 = AbstractC36220b.m115307l(parcel, i34, C35109d.CREATOR);
                    } else if (c26 != 4) {
                        AbstractC36220b.m115293E(parcel, i34);
                    } else {
                        strM115303h5 = AbstractC36220b.m115303h(parcel, i34);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F14);
                return new C34030d(arrayListM115307l4, strM115303h4, arrayListM115307l5, strM115303h5);
            case 14:
                int iM115294F15 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayListM115307l6 = null;
                Bundle bundleM115298c2 = null;
                while (parcel.dataPosition() < iM115294F15) {
                    int i35 = parcel.readInt();
                    char c27 = (char) i35;
                    if (c27 == 1) {
                        arrayListM115307l6 = AbstractC36220b.m115307l(parcel, i35, C34028c.CREATOR);
                    } else if (c27 != 2) {
                        AbstractC36220b.m115293E(parcel, i35);
                    } else {
                        bundleM115298c2 = AbstractC36220b.m115298c(parcel, i35);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F15);
                return new C34032e(arrayListM115307l6, bundleM115298c2);
            default:
                int iM115294F16 = AbstractC36220b.m115294F(parcel);
                int iM115317y18 = 0;
                int iM115317y19 = 0;
                while (parcel.dataPosition() < iM115294F16) {
                    int i36 = parcel.readInt();
                    char c28 = (char) i36;
                    if (c28 == 1) {
                        iM115317y18 = AbstractC36220b.m115317y(parcel, i36);
                    } else if (c28 != 2) {
                        AbstractC36220b.m115293E(parcel, i36);
                    } else {
                        iM115317y19 = AbstractC36220b.m115317y(parcel, i36);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F16);
                C34034f c34034f = new C34034f();
                c34034f.f142693w = iM115317y18;
                c34034f.f142694x = iM115317y19;
                return c34034f;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i13) {
        switch (this.f142669a) {
            case 0:
                return new LocationAvailability[i13];
            case 1:
                return new LocationRequest[i13];
            case 2:
                return new LocationResult[i13];
            case 3:
                return new C34029c0[i13];
            case 4:
                return new C34039j[i13];
            case 5:
                return new C34041l[i13];
            case 6:
                return new C34042m[i13];
            case 7:
                return new C34031d0[i13];
            case 8:
                return new C34043n[i13];
            case 9:
                return new C34033e0[i13];
            case 10:
                return new ActivityRecognitionResult[i13];
            case 11:
                return new C34026b[i13];
            case 12:
                return new C34028c[i13];
            case 13:
                return new C34030d[i13];
            case 14:
                return new C34032e[i13];
            default:
                return new C34034f[i13];
        }
    }
}
