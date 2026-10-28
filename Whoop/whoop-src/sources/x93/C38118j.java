package x93;

import java.lang.reflect.Constructor;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: x93.j */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C38118j extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C38118j f163228w = new C38118j(1, C38125q.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Constructor p13 = (Constructor) obj;
        AbstractC22676k.m65750j(p13, "p0");
        return new C38125q(p13);
    }
}
