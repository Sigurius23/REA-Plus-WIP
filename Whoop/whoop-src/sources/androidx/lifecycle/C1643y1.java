package androidx.lifecycle;

import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import l83.InterfaceC23462h;
import p298l8.AbstractC23420c;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: androidx.lifecycle.y1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1643y1 implements InterfaceC23462h {

    /* JADX INFO: renamed from: E */
    public AbstractC1637w1 f6341E;

    /* JADX INFO: renamed from: w */
    public final InterfaceC21461d f6342w;

    /* JADX INFO: renamed from: x */
    public final AbstractC22680m f6343x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC4339a f6344y;

    /* JADX INFO: renamed from: z */
    public final AbstractC22680m f6345z;

    /* JADX WARN: Multi-variable type inference failed */
    public C1643y1(InterfaceC21461d viewModelClass, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3) {
        AbstractC22676k.m65750j(viewModelClass, "viewModelClass");
        this.f6342w = viewModelClass;
        this.f6343x = (AbstractC22680m) interfaceC4339a;
        this.f6344y = interfaceC4339a2;
        this.f6345z = (AbstractC22680m) interfaceC4339a3;
    }

    @Override // l83.InterfaceC23462h
    /* JADX INFO: renamed from: b */
    public final boolean mo5046b() {
        return this.f6341E != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [c93.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v0, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // l83.InterfaceC23462h
    public final Object getValue() {
        AbstractC1637w1 abstractC1637w1 = this.f6341E;
        if (abstractC1637w1 != null) {
            return abstractC1637w1;
        }
        C1579e2 store = (C1579e2) this.f6343x.invoke();
        InterfaceC1563a2 factory = (InterfaceC1563a2) this.f6344y.invoke();
        AbstractC23420c extras = (AbstractC23420c) this.f6345z.invoke();
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(factory, "factory");
        AbstractC22676k.m65750j(extras, "extras");
        C41113q c41113q = new C41113q(store, factory, extras);
        InterfaceC21461d modelClass = this.f6342w;
        AbstractC22676k.m65750j(modelClass, "modelClass");
        String qualifiedName = modelClass.getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        AbstractC1637w1 abstractC1637w1M133475w = c41113q.m133475w("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), modelClass);
        this.f6341E = abstractC1637w1M133475w;
        return abstractC1637w1M133475w;
    }
}
