package i20;

import eg.C13161j;
import g40.InterfaceC15318a0;
import java.lang.ref.WeakReference;
import java.util.UUID;
import p133f1.C13968p1;
import p236j.AbstractC21065d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.n1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17966n1 implements InterfaceC15318a0 {

    /* JADX INFO: renamed from: w */
    public final C17988y0 f69781w;

    /* JADX INFO: renamed from: x */
    public final C13968p1 f69782x;

    /* JADX INFO: renamed from: y */
    public C13161j f69783y;

    public C17966n1(C17988y0 launcher, C13968p1 c13968p1) {
        AbstractC22676k.m65750j(launcher, "launcher");
        this.f69781w = launcher;
        this.f69782x = c13968p1;
    }

    @Override // g40.InterfaceC15318a0
    /* JADX INFO: renamed from: d */
    public final void mo43528d(C13161j c13161j) {
        this.f69783y = c13161j;
    }

    @Override // g40.InterfaceC15318a0
    /* JADX INFO: renamed from: e */
    public final void mo43529e(String str) {
        String str2 = (String) this.f69782x.f49808y;
        if (str2 != null) {
            C17988y0 c17988y0 = this.f69781w;
            c17988y0.getClass();
            String string = UUID.randomUUID().toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            c17988y0.f69831c.put(string, new WeakReference(this));
            AbstractC21065d abstractC21065d = c17988y0.f69830b;
            if (abstractC21065d != null) {
                abstractC21065d.mo4052a(new C17932c0(string, str, str2, c17988y0.f69829a), null);
            }
        }
    }

    @Override // g40.InterfaceC15318a0
    /* JADX INFO: renamed from: f */
    public final C13968p1 mo43530f() {
        return this.f69782x;
    }
}
