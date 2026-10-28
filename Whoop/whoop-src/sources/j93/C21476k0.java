package j93;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: j93.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C21476k0 extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C21476k0 f82441w = new C21476k0(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class p13 = (Class) obj;
        AbstractC22676k.m65750j(p13, "p0");
        return p13.getComponentType();
    }
}
