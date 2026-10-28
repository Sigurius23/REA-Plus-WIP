package m93;

import java.lang.reflect.Field;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m93.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C25343k extends AbstractC25346n implements InterfaceC25338f {

    /* JADX INFO: renamed from: e */
    public final Object f99371e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25343k(Field field, Object obj) {
        super(field, false);
        AbstractC22676k.m65750j(field, "field");
        this.f99371e = obj;
    }

    @Override // m93.AbstractC25346n, m93.InterfaceC25339g
    public final Object call(Object[] args) {
        AbstractC22676k.m65750j(args, "args");
        mo74412c(args);
        return ((Field) this.f99382a).get(this.f99371e);
    }
}
