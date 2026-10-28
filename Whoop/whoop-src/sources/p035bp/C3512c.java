package p035bp;

import android.content.Context;
import p014aj.C0929d;

/* JADX INFO: renamed from: bp.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3512c {

    /* JADX INFO: renamed from: b */
    public static final C3512c f13988b;

    /* JADX INFO: renamed from: a */
    public C0929d f13989a;

    static {
        C3512c c3512c = new C3512c();
        c3512c.f13989a = null;
        f13988b = c3512c;
    }

    /* JADX INFO: renamed from: a */
    public static C0929d m10398a(Context context) {
        C0929d c0929d;
        C3512c c3512c = f13988b;
        synchronized (c3512c) {
            try {
                if (c3512c.f13989a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c3512c.f13989a = new C0929d(context);
                }
                c0929d = c3512c.f13989a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c0929d;
    }
}
