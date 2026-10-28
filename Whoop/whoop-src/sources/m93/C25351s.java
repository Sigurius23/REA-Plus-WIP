package m93;

import java.lang.reflect.Method;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m93.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C25351s extends AbstractC25356x implements InterfaceC25338f {

    /* JADX INFO: renamed from: f */
    public final Object f99376f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25351s(Method method, Object obj) {
        super(method, false, 4);
        AbstractC22676k.m65750j(method, "method");
        this.f99376f = obj;
    }

    @Override // m93.InterfaceC25339g
    public final Object call(Object[] args) {
        AbstractC22676k.m65750j(args, "args");
        mo74412c(args);
        return m74413e(args, this.f99376f);
    }
}
