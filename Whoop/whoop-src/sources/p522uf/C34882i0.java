package p522uf;

import aws.smithy.kotlin.runtime.http.operation.CallTimeoutException;
import c93.InterfaceC4351m;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: uf.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C34882i0 extends C22672i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C34882i0 f146923w = new C34882i0(2, CallTimeoutException.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/Throwable;)V", 0);

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        String p13 = (String) obj;
        Throwable p14 = (Throwable) obj2;
        AbstractC22676k.m65750j(p13, "p0");
        AbstractC22676k.m65750j(p14, "p1");
        return new CallTimeoutException(p13, p14, false);
    }
}
