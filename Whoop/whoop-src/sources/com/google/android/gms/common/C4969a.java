package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1337q1;
import androidx.health.platform.client.proto.C1533u;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pg3.C29205p;

/* JADX INFO: renamed from: com.google.android.gms.common.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4969a extends AbstractC36219a {

    /* JADX INFO: renamed from: w */
    public final int f20479w;

    /* JADX INFO: renamed from: x */
    public final int f20480x;

    /* JADX INFO: renamed from: y */
    public final PendingIntent f20481y;

    /* JADX INFO: renamed from: z */
    public final String f20482z;

    /* JADX INFO: renamed from: E */
    public static final C4969a f20478E = new C4969a(0);
    public static final Parcelable.Creator<C4969a> CREATOR = new C1337q1(3);

    public C4969a(int i13, int i14, PendingIntent pendingIntent, String str) {
        this.f20479w = i13;
        this.f20480x = i14;
        this.f20481y = pendingIntent;
        this.f20482z = str;
    }

    /* JADX INFO: renamed from: f */
    public static String m15587f(int i13) {
        if (i13 == 99) {
            return "UNFINISHED";
        }
        if (i13 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i13) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i13) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return "SIGN_IN_FAILED";
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return "SERVICE_UPDATING";
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i13).length() + 20);
                        sb4.append("UNKNOWN_ERROR_CODE(");
                        sb4.append(i13);
                        sb4.append(")");
                        return sb4.toString();
                }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15588b() {
        return this.f20480x == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4969a)) {
            return false;
        }
        C4969a c4969a = (C4969a) obj;
        return this.f20480x == c4969a.f20480x && AbstractC35135w.m111097i(this.f20481y, c4969a.f20481y) && AbstractC35135w.m111097i(this.f20482z, c4969a.f20482z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20480x), this.f20481y, this.f20482z});
    }

    public final String toString() {
        C29205p c29205p = new C29205p(this);
        c29205p.m88707c(m15587f(this.f20480x), "statusCode");
        c29205p.m88707c(this.f20481y, "resolution");
        c29205p.m88707c(this.f20482z, "message");
        return c29205p.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f20479w);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f20480x);
        AbstractC36221c.m115331l(parcel, 3, this.f20481y, i13);
        AbstractC36221c.m115332m(parcel, 4, this.f20482z);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }

    public C4969a(int i13) {
        this(1, i13, null, null);
    }

    public C4969a(int i13, PendingIntent pendingIntent) {
        this(1, i13, pendingIntent, null);
    }
}
