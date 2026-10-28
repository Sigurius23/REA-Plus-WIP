package p298l8;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import j93.InterfaceC21461d;
import java.util.Arrays;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C23421d implements InterfaceC1563a2 {

    /* JADX INFO: renamed from: a */
    public final C23423f[] f92773a;

    public C23421d(C23423f... initializers) {
        AbstractC22676k.m65750j(initializers, "initializers");
        this.f92773a = initializers;
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class cls, AbstractC23420c extras) {
        C23423f c23423f;
        AbstractC22676k.m65750j(extras, "extras");
        InterfaceC21461d modelClass = AbstractC21598x.m60666V(cls);
        C23423f[] c23423fArr = this.f92773a;
        C23423f[] initializers = (C23423f[]) Arrays.copyOf(c23423fArr, c23423fArr.length);
        AbstractC22676k.m65750j(modelClass, "modelClass");
        AbstractC22676k.m65750j(initializers, "initializers");
        int length = initializers.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                c23423f = null;
                break;
            }
            c23423f = initializers[i13];
            if (AbstractC22676k.m65745e(c23423f.f92774a, modelClass)) {
                break;
            }
            i13++;
        }
        AbstractC1637w1 abstractC1637w1 = c23423f != null ? (AbstractC1637w1) c23423f.f92775b.invoke(extras) : null;
        if (abstractC1637w1 != null) {
            return abstractC1637w1;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + modelClass.getQualifiedName()).toString());
    }
}
