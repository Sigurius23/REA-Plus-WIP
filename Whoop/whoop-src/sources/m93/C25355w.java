package m93;

import java.lang.reflect.Method;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m93.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C25355w extends AbstractC25356x {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f99380f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25355w(Method method, int i13) {
        super(method, false, 6);
        this.f99380f = i13;
        switch (i13) {
            case 1:
                AbstractC22676k.m65750j(method, "method");
                super(method, true, 4);
                break;
            case 2:
                AbstractC22676k.m65750j(method, "method");
                super(method, false, 6);
                break;
            default:
                AbstractC22676k.m65750j(method, "method");
                break;
        }
    }

    @Override // m93.InterfaceC25339g
    public final Object call(Object[] args) {
        switch (this.f99380f) {
            case 0:
                AbstractC22676k.m65750j(args, "args");
                mo74412c(args);
                return m74413e(args.length <= 1 ? new Object[0] : AbstractC25260n.m74072m0(1, args.length, args), args[0]);
            case 1:
                AbstractC22676k.m65750j(args, "args");
                mo74412c(args);
                m74414d(AbstractC25260n.m74079t0(args));
                return m74413e(args.length <= 1 ? new Object[0] : AbstractC25260n.m74072m0(1, args.length, args), null);
            default:
                AbstractC22676k.m65750j(args, "args");
                mo74412c(args);
                return m74413e(args, null);
        }
    }
}
