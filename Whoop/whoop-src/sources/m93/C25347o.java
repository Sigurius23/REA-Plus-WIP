package m93;

import java.lang.reflect.Field;
import l83.C23454a0;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m93.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C25347o extends AbstractC25350r implements InterfaceC25338f {

    /* JADX INFO: renamed from: f */
    public final Object f99373f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25347o(Field field, boolean z4, Object obj) {
        super(field, z4, false);
        AbstractC22676k.m65750j(field, "field");
        this.f99373f = obj;
    }

    @Override // m93.AbstractC25350r, m93.InterfaceC25339g
    public final Object call(Object[] args) throws IllegalAccessException {
        AbstractC22676k.m65750j(args, "args");
        mo74412c(args);
        ((Field) this.f99382a).set(this.f99373f, AbstractC25260n.m74078s0(args));
        return C23454a0.f92919a;
    }
}
