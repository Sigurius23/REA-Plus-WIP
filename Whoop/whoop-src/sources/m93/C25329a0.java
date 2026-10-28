package m93;

import java.util.Arrays;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m93.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C25329a0 extends AbstractC25331b0 {
    @Override // m93.InterfaceC25339g
    public final Object call(Object[] args) {
        AbstractC22676k.m65750j(args, "args");
        m74410c(args);
        Object obj = args[0];
        Object[] objArrM74072m0 = args.length <= 1 ? new Object[0] : AbstractC25260n.m74072m0(1, args.length, args);
        return this.f99341a.invoke(obj, Arrays.copyOf(objArrM74072m0, objArrM74072m0.length));
    }
}
