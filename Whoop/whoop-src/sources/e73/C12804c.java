package e73;

import a73.C0526a;
import f73.C14231a;
import f73.C14232b;
import f73.C14234d;
import f73.C14237g;
import java.util.ArrayList;
import java.util.Collections;
import p012ab.C0684i0;
import p047c9.C4320k;
import p171g9.C15594k;
import te3.C33755b;
import ve3.C35930a;
import ve3.C35931b;
import ve3.C35933d;
import ve3.C35934e;
import ve3.C35935f;
import z63.AbstractC40129a;

/* JADX INFO: renamed from: e73.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C12804c extends AbstractC40129a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43828a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f43829b;

    public C12804c(C4320k c4320k) {
        this.f43829b = new C12803b(c4320k);
    }

    @Override // z63.AbstractC40129a
    /* JADX INFO: renamed from: a */
    public void mo35876a() {
        switch (this.f43828a) {
            case 0:
                C12803b c12803b = (C12803b) this.f43829b;
                c12803b.f43825c = null;
                c12803b.f43824b = false;
                c12803b.f43826d = 0;
                break;
        }
    }

    @Override // z63.AbstractC40129a
    /* JADX INFO: renamed from: c */
    public final void mo31501c(C0684i0 c0684i0) {
        switch (this.f43828a) {
            case 0:
                c0684i0.m1728s(Collections.singleton(new C33755b(1)));
                break;
            default:
                ((ArrayList) c0684i0.f2442E).add(new C14234d());
                break;
        }
    }

    @Override // z63.AbstractC40129a
    /* JADX INFO: renamed from: d */
    public void mo1293d(C15594k c15594k) {
        switch (this.f43828a) {
            case 1:
                c15594k.m43894b(C14232b.class, new C14237g((C14231a) this.f43829b));
                break;
        }
    }

    @Override // z63.AbstractC40129a
    /* JADX INFO: renamed from: e */
    public final void mo1294e(C15594k c15594k) {
        switch (this.f43828a) {
            case 0:
                C12803b c12803b = (C12803b) this.f43829b;
                c15594k.m43893a(C35930a.class, new C0526a(16));
                c15594k.m43893a(C35931b.class, new C12802a(c12803b, 3));
                c15594k.m43893a(C35935f.class, new C12802a(c12803b, 2));
                c15594k.m43893a(C35934e.class, new C12802a(c12803b, 1));
                c15594k.m43893a(C35933d.class, new C12802a(c12803b, 0));
                break;
            default:
                c15594k.m43893a(C14232b.class, new C0526a(17));
                break;
        }
    }

    public C12804c(C14231a c14231a) {
        this.f43829b = c14231a;
    }
}
