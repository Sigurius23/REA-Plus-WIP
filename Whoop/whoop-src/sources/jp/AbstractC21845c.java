package jp;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import live.hms.video.utils.AndroidSDKConstants;

/* JADX INFO: renamed from: jp.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC21845c {

    /* JADX INFO: renamed from: a */
    public static final int f84374a;

    static {
        f84374a = Build.VERSION.SDK_INT >= 31 ? AndroidSDKConstants.FLAG_MUTABLE : 0;
    }

    /* JADX INFO: renamed from: a */
    public static PendingIntent m61828a(Context context, Intent intent, int i13) {
        return PendingIntent.getActivity(context, 0, intent, i13);
    }
}
