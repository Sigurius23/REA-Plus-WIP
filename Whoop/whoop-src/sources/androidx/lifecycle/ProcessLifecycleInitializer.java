package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import m83.C25271y;
import p644yb.C39376a;
import p644yb.InterfaceC39377b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lyb/b;", "Landroidx/lifecycle/g0;", "<init>", "()V", "lifecycle-process_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ProcessLifecycleInitializer implements InterfaceC39377b {
    @Override // p644yb.InterfaceC39377b
    public final Object create(Context context) {
        AbstractC22676k.m65750j(context, "context");
        C39376a c39376aM125585c = C39376a.m125585c(context);
        AbstractC22676k.m65749i(c39376aM125585c, "getInstance(...)");
        if (!c39376aM125585c.f169432b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC1573d0.f6199a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC22676k.m65748h(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C1569c0());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f6173I;
        processLifecycleOwner.getClass();
        processLifecycleOwner.f6174E = new Handler();
        processLifecycleOwner.f6175F.m4991g(EnumC1632v.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C1566b1(processLifecycleOwner));
        return processLifecycleOwner;
    }

    @Override // p644yb.InterfaceC39377b
    public final List dependencies() {
        return C25271y.f99162w;
    }
}
