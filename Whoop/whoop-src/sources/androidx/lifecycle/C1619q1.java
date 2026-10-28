package androidx.lifecycle;

import android.os.Bundle;
import e93.AbstractC12889b;
import java.util.Arrays;
import java.util.Map;
import l83.C23465k;
import l83.C23470p;
import p027b3.C2472z1;
import p399pb.C29047d;
import p399pb.InterfaceC29046c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: androidx.lifecycle.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1619q1 implements InterfaceC29046c {

    /* JADX INFO: renamed from: a */
    public final C29047d f6298a;

    /* JADX INFO: renamed from: b */
    public boolean f6299b;

    /* JADX INFO: renamed from: c */
    public Bundle f6300c;

    /* JADX INFO: renamed from: d */
    public final C23470p f6301d;

    public C1619q1(C29047d savedStateRegistry, InterfaceC1583f2 viewModelStoreOwner) {
        AbstractC22676k.m65750j(savedStateRegistry, "savedStateRegistry");
        AbstractC22676k.m65750j(viewModelStoreOwner, "viewModelStoreOwner");
        this.f6298a = savedStateRegistry;
        this.f6301d = AbstractC30060g.m92088H(new C1616p1(viewModelStoreOwner, 0));
    }

    @Override // p399pb.InterfaceC29046c
    /* JADX INFO: renamed from: a */
    public final Bundle mo4129a() {
        Bundle bundleM36273g = AbstractC12889b.m36273g((C23465k[]) Arrays.copyOf(new C23465k[0], 0));
        Bundle bundle = this.f6300c;
        if (bundle != null) {
            bundleM36273g.putAll(bundle);
        }
        for (Map.Entry entry : ((C1622r1) this.f6301d.getValue()).f6304w.entrySet()) {
            String key = (String) entry.getKey();
            Bundle bundleMo4129a = ((C2472z1) ((C1601k1) entry.getValue()).f6269b.f2199f).mo4129a();
            if (!bundleMo4129a.isEmpty()) {
                AbstractC22676k.m65750j(key, "key");
                bundleM36273g.putBundle(key, bundleMo4129a);
            }
        }
        this.f6299b = false;
        return bundleM36273g;
    }

    /* JADX INFO: renamed from: b */
    public final void m5030b() {
        if (this.f6299b) {
            return;
        }
        Bundle bundleM88291a = this.f6298a.m88291a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleM36273g = AbstractC12889b.m36273g((C23465k[]) Arrays.copyOf(new C23465k[0], 0));
        Bundle bundle = this.f6300c;
        if (bundle != null) {
            bundleM36273g.putAll(bundle);
        }
        if (bundleM88291a != null) {
            bundleM36273g.putAll(bundleM88291a);
        }
        this.f6300c = bundleM36273g;
        this.f6299b = true;
    }
}
