package wd3;

import j93.InterfaceC21461d;
import m83.AbstractC25265s;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35745c;
import w01.C36680e;
import xb3.AbstractC38176k;

/* JADX INFO: renamed from: wd3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C37169c extends AbstractC35745c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21461d f158952a;

    /* JADX INFO: renamed from: b */
    public final Object f158953b;

    /* JADX INFO: renamed from: c */
    public final AbstractC35745c f158954c;

    public C37169c(InterfaceC21461d key, Object value, AbstractC35745c next) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(next, "next");
        this.f158952a = key;
        this.f158953b = value;
        this.f158954c = next;
    }

    @Override // v63.AbstractC35745c
    /* JADX INFO: renamed from: d */
    public final Object mo113252d(InterfaceC21461d interfaceC21461d) {
        return interfaceC21461d.equals(this.f158952a) ? AbstractC21598x.m60663S(interfaceC21461d).cast(this.f158953b) : this.f158954c.mo113252d(interfaceC21461d);
    }

    @Override // v63.AbstractC35745c
    /* JADX INFO: renamed from: k */
    public final AbstractC35745c mo113254k(InterfaceC21461d key, Object obj) {
        AbstractC22676k.m65750j(key, "key");
        InterfaceC21461d interfaceC21461d = this.f158952a;
        boolean zEquals = key.equals(interfaceC21461d);
        AbstractC35745c c37169c = this.f158954c;
        if (!zEquals) {
            AbstractC35745c abstractC35745cMo113254k = c37169c.mo113254k(key, null);
            c37169c = abstractC35745cMo113254k == c37169c ? this : new C37169c(interfaceC21461d, this.f158953b, abstractC35745cMo113254k);
        }
        return obj != null ? new C37169c(key, obj, c37169c) : c37169c;
    }

    public final String toString() {
        return AbstractC25265s.m74110N0(AbstractC25265s.m74138n1(AbstractC38176k.m122276E(AbstractC38176k.m122288x(this, new C36680e(29)))), null, "{", "}", new C37168b(0), 25);
    }
}
