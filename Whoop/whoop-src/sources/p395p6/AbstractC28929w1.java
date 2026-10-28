package p395p6;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
import p006a4.AbstractC0354a;

/* JADX INFO: renamed from: p6.w1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC28929w1 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f117045a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static void m87838a() {
        if (Build.VERSION.SDK_INT < 29 || !f117045a.get()) {
            return;
        }
        AbstractC0354a.m963c();
    }

    /* JADX INFO: renamed from: b */
    public static void m87839b() {
        if (Build.VERSION.SDK_INT < 29 || !f117045a.get()) {
            return;
        }
        AbstractC0354a.m974n();
    }
}
