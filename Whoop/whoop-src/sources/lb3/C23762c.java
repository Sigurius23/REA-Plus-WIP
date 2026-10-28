package lb3;

import java.util.AbstractCollection;
import l83.C23454a0;
import ob3.InterfaceC27798h;
import ob3.InterfaceC27805o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C23762c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final AbstractCollection f94126w;

    /* JADX INFO: renamed from: x */
    public final C23794p0 f94127x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC27805o f94128y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC27798h f94129z;

    public C23762c(AbstractCollection abstractCollection, C23794p0 c23794p0, InterfaceC27805o interfaceC27805o, InterfaceC27798h interfaceC27798h) {
        this.f94126w = abstractCollection;
        this.f94127x = c23794p0;
        this.f94128y = interfaceC27805o;
        this.f94129z = interfaceC27798h;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C23786l0 runForkingPoint = (C23786l0) obj;
        AbstractC22676k.m65750j(runForkingPoint, "$this$runForkingPoint");
        for (InterfaceC27798h interfaceC27798h : this.f94126w) {
            if (!runForkingPoint.f94169a) {
                InterfaceC27805o c3 = this.f94128y;
                AbstractC22676k.m65750j(c3, "c");
                AbstractC22676k.m65750j(interfaceC27798h, "<this>");
                runForkingPoint.f94169a = C23765d.m69836j(this.f94127x, c3, c3.mo74537M(interfaceC27798h), this.f94129z);
            }
        }
        return C23454a0.f92919a;
    }
}
