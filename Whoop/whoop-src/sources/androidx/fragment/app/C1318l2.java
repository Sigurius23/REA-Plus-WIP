package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.C1625s1;
import androidx.lifecycle.C1646z1;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1620r;
import java.util.LinkedHashMap;
import m83.C25262p;
import p298l8.AbstractC23420c;
import p298l8.C23422e;
import p399pb.C29047d;
import p399pb.C29048e;
import p399pb.InterfaceC29049f;
import p456rb.C31183a;

/* JADX INFO: renamed from: androidx.fragment.app.l2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1318l2 implements InterfaceC1620r, InterfaceC29049f, InterfaceC1583f2 {

    /* JADX INFO: renamed from: E */
    public C1593i0 f5669E = null;

    /* JADX INFO: renamed from: F */
    public C29048e f5670F = null;

    /* JADX INFO: renamed from: w */
    public final AbstractComponentCallbacksC1320m0 f5671w;

    /* JADX INFO: renamed from: x */
    public final C1579e2 f5672x;

    /* JADX INFO: renamed from: y */
    public final RunnableC1364z f5673y;

    /* JADX INFO: renamed from: z */
    public InterfaceC1563a2 f5674z;

    public C1318l2(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, C1579e2 c1579e2, RunnableC1364z runnableC1364z) {
        this.f5671w = abstractComponentCallbacksC1320m0;
        this.f5672x = c1579e2;
        this.f5673y = runnableC1364z;
    }

    /* JADX INFO: renamed from: a */
    public final void m4120a(EnumC1632v enumC1632v) {
        this.f5669E.m4991g(enumC1632v);
    }

    /* JADX INFO: renamed from: b */
    public final void m4121b() {
        if (this.f5669E == null) {
            this.f5669E = new C1593i0(this);
            C31183a c31183a = new C31183a(this, new C25262p(this, 10));
            this.f5670F = new C29048e(c31183a);
            c31183a.m95914a();
            this.f5673y.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC1620r
    public final AbstractC23420c getDefaultViewModelCreationExtras() {
        Application application;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5671w;
        Context applicationContext = abstractComponentCallbacksC1320m0.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C23422e c23422e = new C23422e(0);
        LinkedHashMap linkedHashMap = c23422e.f92772a;
        if (application != null) {
            linkedHashMap.put(C1646z1.f6353d, application);
        }
        linkedHashMap.put(AbstractC1613o1.f6291a, abstractComponentCallbacksC1320m0);
        linkedHashMap.put(AbstractC1613o1.f6292b, this);
        if (abstractComponentCallbacksC1320m0.getArguments() != null) {
            linkedHashMap.put(AbstractC1613o1.f6293c, abstractComponentCallbacksC1320m0.getArguments());
        }
        return c23422e;
    }

    @Override // androidx.lifecycle.InterfaceC1620r
    public final InterfaceC1563a2 getDefaultViewModelProviderFactory() {
        Application application;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5671w;
        InterfaceC1563a2 defaultViewModelProviderFactory = abstractComponentCallbacksC1320m0.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(abstractComponentCallbacksC1320m0.mDefaultFactory)) {
            this.f5674z = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f5674z == null) {
            Context applicationContext = abstractComponentCallbacksC1320m0.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f5674z = new C1625s1(application, abstractComponentCallbacksC1320m0, abstractComponentCallbacksC1320m0.getArguments());
        }
        return this.f5674z;
    }

    @Override // androidx.lifecycle.InterfaceC1585g0
    public final AbstractC1638x getLifecycle() {
        m4121b();
        return this.f5669E;
    }

    @Override // p399pb.InterfaceC29049f
    public final C29047d getSavedStateRegistry() {
        m4121b();
        return this.f5670F.f117551b;
    }

    @Override // androidx.lifecycle.InterfaceC1583f2
    public final C1579e2 getViewModelStore() {
        m4121b();
        return this.f5672x;
    }
}
