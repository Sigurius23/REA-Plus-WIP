package p507tx;

import j93.InterfaceC21465f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22660c;
import p715kotlin.jvm.internal.AbstractC22670h;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: tx.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C34234e extends AbstractC22670h implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C34234e f143614w = new C34234e(1, 0, null, AbstractC22660c.NO_RECEIVER, null, null);

    @Override // p715kotlin.jvm.internal.AbstractC22660c, j93.InterfaceC21459c
    public final String getName() {
        return "sanitize";
    }

    @Override // p715kotlin.jvm.internal.AbstractC22660c
    public final InterfaceC21465f getOwner() {
        return AbstractC22671h0.f89337a.getOrCreateKotlinPackage(AbstractC34235f.class, "wire-runtime");
    }

    @Override // p715kotlin.jvm.internal.AbstractC22660c
    public final String getSignature() {
        return "sanitize(Ljava/lang/String;)Ljava/lang/String;";
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p13 = (String) obj;
        AbstractC22676k.m65750j(p13, "p0");
        return AbstractC32103e.m99893p(p13);
    }
}
