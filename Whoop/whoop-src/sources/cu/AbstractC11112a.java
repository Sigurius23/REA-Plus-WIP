package cu;

import android.content.ContentProvider;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import p098dt.C12349a;

/* JADX INFO: renamed from: cu.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11112a extends ContentProvider {

    /* JADX INFO: renamed from: w */
    public static final C12349a f35318w = new C12349a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());

    /* JADX INFO: renamed from: x */
    public static final AtomicBoolean f35319x = new AtomicBoolean(false);
}
