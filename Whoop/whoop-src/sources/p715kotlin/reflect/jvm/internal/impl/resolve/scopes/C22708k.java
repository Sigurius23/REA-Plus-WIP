package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import c93.InterfaceC4339a;
import jb3.C21552l;
import kb3.C22340i;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C22708k extends AbstractC22698a {

    /* JADX INFO: renamed from: b */
    public final C22340i f89375b;

    public C22708k(InterfaceC22345n storageManager, InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(storageManager, "storageManager");
        this.f89375b = new C22340i((C22342k) storageManager, new C21552l(interfaceC4339a, 1));
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22698a
    /* JADX INFO: renamed from: b */
    public final InterfaceC22712o mo65787b() {
        return (InterfaceC22712o) this.f89375b.invoke();
    }
}
