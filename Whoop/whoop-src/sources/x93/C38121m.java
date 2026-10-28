package x93;

import java.lang.reflect.Method;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: x93.m */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C38121m extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C38121m f163231w = new C38121m(1, C38131w.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Method p13 = (Method) obj;
        AbstractC22676k.m65750j(p13, "p0");
        return new C38131w(p13);
    }
}
