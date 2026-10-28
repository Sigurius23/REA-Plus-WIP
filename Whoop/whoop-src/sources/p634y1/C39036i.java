package p634y1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1593i0;
import c93.InterfaceC4339a;
import java.util.Map;
import m83.C25262p;
import p399pb.C29047d;
import p399pb.C29048e;
import p399pb.InterfaceC29049f;
import p456rb.C31183a;

/* JADX INFO: renamed from: y1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C39036i implements InterfaceC39033f, InterfaceC29049f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C39034g f168005w;

    /* JADX INFO: renamed from: x */
    public final C29048e f168006x;

    /* JADX INFO: renamed from: y */
    public final C1593i0 f168007y;

    /* JADX INFO: renamed from: z */
    public final C29047d f168008z;

    public C39036i(C39034g c39034g) {
        this.f168005w = c39034g;
        C29048e c29048e = new C29048e(new C31183a(this, new C25262p(this, 10)));
        this.f168006x = c29048e;
        this.f168007y = new C1593i0(this, false);
        this.f168008z = c29048e.f117551b;
        Object objMo7448f = c39034g.mo7448f("androidx.savedstate.SavedStateRegistry");
        c29048e.m88295a(objMo7448f instanceof Bundle ? (Bundle) objMo7448f : null);
        c39034g.mo7445b(new C25262p(this, 26), "androidx.savedstate.SavedStateRegistry");
    }

    @Override // p634y1.InterfaceC39033f
    /* JADX INFO: renamed from: b */
    public final InterfaceC39032e mo7445b(InterfaceC4339a interfaceC4339a, String str) {
        return this.f168005w.mo7445b(interfaceC4339a, str);
    }

    @Override // p634y1.InterfaceC39033f
    /* JADX INFO: renamed from: d */
    public final boolean mo7446d(Object obj) {
        return this.f168005w.mo7446d(obj);
    }

    @Override // p634y1.InterfaceC39033f
    /* JADX INFO: renamed from: e */
    public final Map mo7447e() {
        return this.f168005w.mo7447e();
    }

    @Override // p634y1.InterfaceC39033f
    /* JADX INFO: renamed from: f */
    public final Object mo7448f(String str) {
        return this.f168005w.mo7448f(str);
    }

    @Override // androidx.lifecycle.InterfaceC1585g0
    public final AbstractC1638x getLifecycle() {
        return this.f168007y;
    }

    @Override // p399pb.InterfaceC29049f
    public final C29047d getSavedStateRegistry() {
        return this.f168008z;
    }
}
