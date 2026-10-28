package p250jf;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: jf.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21635d extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C21635d f83071w = new C21635d(1, AbstractC39414r.class, "toLong", "toLong(Ljava/lang/String;)J", 1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p13 = (String) obj;
        AbstractC22676k.m65750j(p13, "p0");
        return Long.valueOf(Long.parseLong(p13));
    }
}
