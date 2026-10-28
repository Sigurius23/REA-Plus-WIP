package x93;

import java.lang.reflect.Field;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: x93.l */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C38120l extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C38120l f163230w = new C38120l(1, C38128t.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Field p13 = (Field) obj;
        AbstractC22676k.m65750j(p13, "p0");
        return new C38128t(p13);
    }
}
