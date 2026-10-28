package x93;

import java.lang.reflect.Member;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: x93.i */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C38117i extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C38117i f163227w = new C38117i(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Member p13 = (Member) obj;
        AbstractC22676k.m65750j(p13, "p0");
        return Boolean.valueOf(p13.isSynthetic());
    }
}
