package p077d0;

import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: d0.r1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11397r1 implements InterfaceC28670t2 {

    /* JADX INFO: renamed from: w */
    public final C11409v1 f36540w;

    /* JADX INFO: renamed from: x */
    public Function1 f36541x;

    /* JADX INFO: renamed from: y */
    public AbstractC22680m f36542y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C11400s1 f36543z;

    /* JADX WARN: Multi-variable type inference failed */
    public C11397r1(C11400s1 c11400s1, C11409v1 c11409v1, Function1 function1, Function1 function2) {
        this.f36543z = c11400s1;
        this.f36540w = c11409v1;
        this.f36541x = function1;
        this.f36542y = (AbstractC22680m) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: a */
    public final void m30629a(InterfaceC11403t1 interfaceC11403t1) {
        Object objInvoke = this.f36542y.invoke(interfaceC11403t1.mo11595b());
        boolean zM30665g = this.f36543z.f36547c.m30665g();
        C11409v1 c11409v1 = this.f36540w;
        if (zM30665g) {
            c11409v1.m30644g(this.f36542y.invoke(interfaceC11403t1.mo11596c()), objInvoke, (InterfaceC11337c0) this.f36541x.invoke(interfaceC11403t1));
        } else {
            c11409v1.m30645j(objInvoke, (InterfaceC11337c0) this.f36541x.invoke(interfaceC11403t1));
        }
    }

    @Override // p390p1.InterfaceC28670t2
    public final Object getValue() {
        m30629a(this.f36543z.f36547c.m30664f());
        return this.f36540w.f36585J.getValue();
    }
}
