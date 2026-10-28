package p399pb;

import android.os.Bundle;
import androidx.lifecycle.EnumC1635w;
import e93.AbstractC12889b;
import java.util.Arrays;
import java.util.Map;
import l83.C23465k;
import p108e4.AbstractC12667a;
import p456rb.C31183a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C29048e {

    /* JADX INFO: renamed from: a */
    public final C31183a f117550a;

    /* JADX INFO: renamed from: b */
    public final C29047d f117551b;

    public C29048e(C31183a c31183a) {
        this.f117550a = c31183a;
        this.f117551b = new C29047d(c31183a);
    }

    /* JADX INFO: renamed from: a */
    public final void m88295a(Bundle bundle) {
        C31183a c31183a = this.f117550a;
        InterfaceC29049f interfaceC29049f = c31183a.f128495a;
        if (!c31183a.f128499e) {
            c31183a.m95914a();
        }
        if (interfaceC29049f.getLifecycle().getCurrentState().compareTo(EnumC1635w.f6328z) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + interfaceC29049f.getLifecycle().getCurrentState()).toString());
        }
        if (c31183a.f128501g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                AbstractC12667a.m35438I("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        c31183a.f128500f = bundle2;
        c31183a.f128501g = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m88296b(Bundle bundle) {
        C31183a c31183a = this.f117550a;
        Bundle bundleM36273g = AbstractC12889b.m36273g((C23465k[]) Arrays.copyOf(new C23465k[0], 0));
        Bundle bundle2 = c31183a.f128500f;
        if (bundle2 != null) {
            bundleM36273g.putAll(bundle2);
        }
        synchronized (c31183a.f128497c) {
            for (Map.Entry entry : c31183a.f128498d.entrySet()) {
                String key = (String) entry.getKey();
                Bundle bundleMo4129a = ((InterfaceC29046c) entry.getValue()).mo4129a();
                AbstractC22676k.m65750j(key, "key");
                bundleM36273g.putBundle(key, bundleMo4129a);
            }
        }
        if (bundleM36273g.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM36273g);
    }
}
