package p593wr;

import java.util.HashMap;

/* JADX INFO: renamed from: wr.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC37515a {

    /* JADX INFO: renamed from: a */
    public static final HashMap f160443a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f160444b;

    static {
        HashMap map = new HashMap();
        f160443a = map;
        HashMap map2 = new HashMap();
        f160444b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }
}
