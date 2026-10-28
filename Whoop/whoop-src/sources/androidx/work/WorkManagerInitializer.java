package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p218ic.C18348b;
import p218ic.C18389w;
import p218ic.C18391y;
import p249jc.AbstractC21598x;
import p249jc.C21596v;
import p644yb.InterfaceC39377b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC39377b {

    /* JADX INFO: renamed from: a */
    public static final String f7331a = C18389w.m52887f("WrkMgrInitializer");

    @Override // p644yb.InterfaceC39377b
    public final Object create(Context context) {
        C18389w.m52886d().m52888a(f7331a, "Initializing WorkManager with default configuration.");
        C18348b c18348b = new C18348b(new C18391y());
        AbstractC22676k.m65750j(context, "context");
        synchronized (C21596v.f82804m) {
            try {
                C21596v c21596v = C21596v.f82802k;
                if (c21596v != null && C21596v.f82803l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c21596v == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (C21596v.f82803l == null) {
                        C21596v.f82803l = AbstractC21598x.m60643B(applicationContext, c18348b);
                    }
                    C21596v.f82802k = C21596v.f82803l;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return C21596v.m60637g(context);
    }

    @Override // p644yb.InterfaceC39377b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
