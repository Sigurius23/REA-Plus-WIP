package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.AbstractC4970a;
import com.google.android.gms.common.api.C4974e;
import com.google.android.gms.common.api.C4975f;
import ng3.C26701n;
import p096dq.C12281y;
import p503tp.InterfaceC34024a;

/* JADX INFO: loaded from: classes6.dex */
public class ActivityRecognition {

    @RecentlyNonNull
    public static final C4975f API;

    @RecentlyNonNull
    @Deprecated
    public static final InterfaceC34024a ActivityRecognitionApi;

    @RecentlyNonNull
    public static final String CLIENT_NAME = "activity_recognition";
    private static final C4974e zza;
    private static final AbstractC4970a zzb;

    static {
        C4974e c4974e = new C4974e();
        zza = c4974e;
        C12281y c12281y = new C12281y(6);
        zzb = c12281y;
        API = new C4975f("ActivityRecognition.API", c12281y, c4974e);
        ActivityRecognitionApi = new C26701n(6);
    }

    private ActivityRecognition() {
    }

    @RecentlyNonNull
    public static ActivityRecognitionClient getClient(@RecentlyNonNull Activity activity) {
        return new ActivityRecognitionClient(activity);
    }

    @RecentlyNonNull
    public static ActivityRecognitionClient getClient(@RecentlyNonNull Context context) {
        return new ActivityRecognitionClient(context);
    }
}
