package m93;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import l83.C23454a0;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m93.r */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC25350r extends AbstractC25357y {

    /* JADX INFO: renamed from: e */
    public final boolean f99375e;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC25350r(Field field, boolean z4, boolean z13) {
        Class TYPE = Void.TYPE;
        AbstractC22676k.m65749i(TYPE, "TYPE");
        Class<?> declaringClass = z13 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        AbstractC22676k.m65749i(genericType, "getGenericType(...)");
        super(field, TYPE, declaringClass, new Type[]{genericType});
        this.f99375e = z4;
    }

    @Override // m93.AbstractC25357y
    /* JADX INFO: renamed from: c */
    public void mo74412c(Object[] args) {
        AbstractC22676k.m65750j(args, "args");
        super.mo74412c(args);
        if (this.f99375e && AbstractC25260n.m74029E0(args) == null) {
            throw new IllegalArgumentException("null is not allowed as a value for this property.");
        }
    }

    @Override // m93.InterfaceC25339g
    public Object call(Object[] args) throws IllegalAccessException {
        AbstractC22676k.m65750j(args, "args");
        mo74412c(args);
        ((Field) this.f99382a).set(this.f99384c != null ? AbstractC25260n.m74078s0(args) : null, AbstractC25260n.m74029E0(args));
        return C23454a0.f92919a;
    }
}
