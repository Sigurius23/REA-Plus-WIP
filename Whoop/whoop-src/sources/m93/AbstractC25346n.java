package m93;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m93.n */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC25346n extends AbstractC25357y {
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC25346n(Field field, boolean z4) {
        Type genericType = field.getGenericType();
        AbstractC22676k.m65749i(genericType, "getGenericType(...)");
        super(field, genericType, z4 ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // m93.InterfaceC25339g
    public Object call(Object[] args) {
        AbstractC22676k.m65750j(args, "args");
        mo74412c(args);
        return ((Field) this.f99382a).get(this.f99384c != null ? AbstractC25260n.m74078s0(args) : null);
    }
}
