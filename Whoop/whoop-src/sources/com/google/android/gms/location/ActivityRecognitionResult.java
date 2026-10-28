package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import p460rg.AbstractC31366a;
import p503tp.C34025a0;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: loaded from: classes6.dex */
public class ActivityRecognitionResult extends AbstractC36219a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new C34025a0(10);

    /* JADX INFO: renamed from: E */
    public Bundle f20570E;

    /* JADX INFO: renamed from: w */
    public ArrayList f20571w;

    /* JADX INFO: renamed from: x */
    public long f20572x;

    /* JADX INFO: renamed from: y */
    public long f20573y;

    /* JADX INFO: renamed from: z */
    public int f20574z;

    /* JADX INFO: renamed from: b */
    public static ArrayList m15623b(Intent intent) {
        if (!intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return null;
        }
        Parcelable.Creator<ActivityRecognitionResult> creator = CREATOR;
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST");
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList2.add(AbstractC31366a.m96470j((byte[]) arrayList.get(i13), creator));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m15624f(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!m15624f(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i13 = 0; i13 < length; i13++) {
                            if (AbstractC35135w.m111097i(Array.get(obj, i13), Array.get(obj2, i13))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        return this.f20572x == activityRecognitionResult.f20572x && this.f20573y == activityRecognitionResult.f20573y && this.f20574z == activityRecognitionResult.f20574z && AbstractC35135w.m111097i(this.f20571w, activityRecognitionResult.f20571w) && m15624f(this.f20570E, activityRecognitionResult.f20570E);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f20572x), Long.valueOf(this.f20573y), Integer.valueOf(this.f20574z), this.f20571w, this.f20570E});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f20571w);
        long j7 = this.f20572x;
        long j13 = this.f20573y;
        StringBuilder sb4 = new StringBuilder(strValueOf.length() + 124);
        sb4.append("ActivityRecognitionResult [probableActivities=");
        sb4.append(strValueOf);
        sb4.append(", timeMillis=");
        sb4.append(j7);
        sb4.append(", elapsedRealtimeMillis=");
        sb4.append(j13);
        sb4.append("]");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115336q(parcel, 1, this.f20571w);
        long j7 = this.f20572x;
        AbstractC36221c.m115337r(parcel, 2, 8);
        parcel.writeLong(j7);
        long j13 = this.f20573y;
        AbstractC36221c.m115337r(parcel, 3, 8);
        parcel.writeLong(j13);
        int i14 = this.f20574z;
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(i14);
        AbstractC36221c.m115324e(parcel, 5, this.f20570E);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
