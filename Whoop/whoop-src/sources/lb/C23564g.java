package lb;

import p002a0.C0005a0;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C23564g extends C0005a0 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C23565h f93456g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23564g(C23565h c23565h) {
        super(25);
        this.f93456g = c23565h;
    }

    @Override // p002a0.C0005a0
    /* JADX INFO: renamed from: a */
    public final Object mo0a(Object obj) {
        String key = (String) obj;
        AbstractC22676k.m65750j(key, "key");
        return this.f93456g.f93458w.mo68212g1(key);
    }

    @Override // p002a0.C0005a0
    /* JADX INFO: renamed from: b */
    public final void mo1b(boolean z4, Object obj, Object obj2, Object obj3) throws Exception {
        Object key = (String) obj;
        InterfaceC33689c oldValue = (InterfaceC33689c) obj2;
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(oldValue, "oldValue");
        oldValue.close();
        super.mo1b(z4, key, oldValue, (InterfaceC33689c) obj3);
    }
}
