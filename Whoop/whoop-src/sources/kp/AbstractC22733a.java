package kp;

import android.os.Build;
import live.hms.video.utils.AndroidSDKConstants;

/* JADX INFO: renamed from: kp.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC22733a {

    /* JADX INFO: renamed from: a */
    public static final int f89412a;

    static {
        f89412a = Build.VERSION.SDK_INT >= 31 ? AndroidSDKConstants.FLAG_MUTABLE : 0;
    }
}
