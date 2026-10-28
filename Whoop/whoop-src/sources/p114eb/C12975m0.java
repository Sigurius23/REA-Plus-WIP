package p114eb;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eb.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12975m0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44813w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12954f0 f44814x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12975m0(C12954f0 c12954f0, int i13) {
        super(1);
        this.f44813w = i13;
        this.f44814x = c12954f0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f44813w) {
            case 0:
                String key = (String) obj;
                AbstractC22676k.m65750j(key, "key");
                return Boolean.valueOf(!this.f44814x.m36429c().contains(key));
            default:
                String key2 = (String) obj;
                AbstractC22676k.m65750j(key2, "key");
                return Boolean.valueOf(!this.f44814x.m36429c().contains(key2));
        }
    }
}
