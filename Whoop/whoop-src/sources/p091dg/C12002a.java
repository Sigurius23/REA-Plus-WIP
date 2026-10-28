package p091dg;

import bc3.AbstractC3006f0;
import bc3.C3031l1;
import bc3.InterfaceC2994c0;
import gf.C15760a;
import gf.C15762c;
import gf.InterfaceC15771l;
import java.util.Set;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: dg.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C12002a implements InterfaceC15771l, InterfaceC2994c0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C15762c f39588w;

    /* JADX INFO: renamed from: x */
    public final C3031l1 f39589x;

    /* JADX INFO: renamed from: y */
    public final C15762c f39590y;

    public C12002a() {
        C15762c c15762c = new C15762c();
        this.f39588w = c15762c;
        this.f39589x = AbstractC3006f0.m8709c();
        this.f39590y = c15762c;
    }

    @Override // gf.InterfaceC15761b
    /* JADX INFO: renamed from: a */
    public final Set mo33081a() {
        return this.f39588w.f59424w.keySet();
    }

    @Override // gf.InterfaceC15761b
    /* JADX INFO: renamed from: b */
    public final Object mo33082b(C15760a key) {
        AbstractC22676k.m65750j(key, "key");
        return this.f39588w.mo33082b(key);
    }

    @Override // gf.InterfaceC15771l
    /* JADX INFO: renamed from: c */
    public final void mo33083c(C15760a key, Object value) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        this.f39588w.mo33083c(key, value);
    }

    @Override // gf.InterfaceC15761b
    /* JADX INFO: renamed from: d */
    public final boolean mo33084d(C15760a key) {
        AbstractC22676k.m65750j(key, "key");
        return this.f39588w.mo33084d(key);
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f39589x;
    }

    @Override // gf.InterfaceC15761b
    public final boolean isEmpty() {
        return this.f39588w.f59424w.isEmpty();
    }
}
