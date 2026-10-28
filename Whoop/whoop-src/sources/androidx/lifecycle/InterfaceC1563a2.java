package androidx.lifecycle;

import j93.InterfaceC21461d;
import p249jc.AbstractC21598x;
import p298l8.AbstractC23420c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.a2 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1563a2 {
    default AbstractC1637w1 create(Class modelClass) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default AbstractC1637w1 create(Class modelClass, AbstractC23420c extras) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        AbstractC22676k.m65750j(extras, "extras");
        return create(modelClass);
    }

    default AbstractC1637w1 create(InterfaceC21461d modelClass, AbstractC23420c extras) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        AbstractC22676k.m65750j(extras, "extras");
        return create(AbstractC21598x.m60663S(modelClass), extras);
    }
}
