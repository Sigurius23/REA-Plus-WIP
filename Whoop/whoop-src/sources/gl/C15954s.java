package gl;

import android.os.Build;
import java.io.File;

/* JADX INFO: renamed from: gl.s */
/* JADX INFO: loaded from: classes.dex */
public final class C15954s {

    /* JADX INFO: renamed from: e */
    public static final File f60377e = new File("/proc/self/fd");

    /* JADX INFO: renamed from: f */
    public static volatile C15954s f60378f;

    /* JADX INFO: renamed from: a */
    public final boolean f60379a;

    /* JADX INFO: renamed from: b */
    public final int f60380b;

    /* JADX INFO: renamed from: c */
    public int f60381c;

    /* JADX INFO: renamed from: d */
    public boolean f60382d = true;

    public C15954s() {
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            str.substring(0, 7).getClass();
        }
        this.f60379a = true;
        this.f60380b = 20000;
    }

    /* JADX INFO: renamed from: a */
    public static C15954s m45019a() {
        if (f60378f == null) {
            synchronized (C15954s.class) {
                try {
                    if (f60378f == null) {
                        f60378f = new C15954s();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f60378f;
    }
}
