package androidx.lifecycle;

import bi.AbstractC3269g;
import j93.InterfaceC21461d;
import p249jc.AbstractC21598x;
import p298l8.AbstractC23420c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.b2 */
/* JADX INFO: loaded from: classes.dex */
public class C1567b2 implements InterfaceC1563a2 {

    /* JADX INFO: renamed from: a */
    public static C1567b2 f6192a;

    @Override // androidx.lifecycle.InterfaceC1563a2
    public AbstractC1637w1 create(Class modelClass) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        return AbstractC3269g.m9516w(modelClass);
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public AbstractC1637w1 create(Class cls, AbstractC23420c extras) {
        AbstractC22676k.m65750j(extras, "extras");
        return create(cls);
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(InterfaceC21461d modelClass, AbstractC23420c abstractC23420c) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        return create(AbstractC21598x.m60663S(modelClass), abstractC23420c);
    }
}
