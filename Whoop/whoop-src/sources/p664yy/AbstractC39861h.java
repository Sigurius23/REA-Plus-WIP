package p664yy;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: yy.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC39861h {

    /* JADX INFO: renamed from: a */
    public static final int f172143a;

    /* JADX INFO: renamed from: b */
    public static final int f172144b;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f172143a = (int) timeUnit.toMillis(30L);
        f172144b = (int) timeUnit.toMillis(80L);
    }
}
