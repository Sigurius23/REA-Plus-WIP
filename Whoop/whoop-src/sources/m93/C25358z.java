package m93;

import java.lang.reflect.Method;
import java.util.Arrays;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m93.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C25358z extends AbstractC25331b0 implements InterfaceC25338f {

    /* JADX INFO: renamed from: d */
    public final Object f99386d;

    public C25358z(Method method, Object obj) {
        super(method, C25271y.f99162w);
        this.f99386d = obj;
    }

    @Override // m93.InterfaceC25339g
    public final Object call(Object[] args) {
        AbstractC22676k.m65750j(args, "args");
        m74410c(args);
        return this.f99341a.invoke(this.f99386d, Arrays.copyOf(args, args.length));
    }
}
