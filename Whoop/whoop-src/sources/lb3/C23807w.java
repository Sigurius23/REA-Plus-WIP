package lb3;

import o93.AbstractC27741m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35847e;

/* JADX INFO: renamed from: lb3.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C23807w implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C23807w f94202x = new C23807w(0);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94203w;

    public /* synthetic */ C23807w(int i13) {
        this.f94203w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f94203w) {
            case 0:
                AbstractC23811y it = (AbstractC23811y) obj;
                AbstractC22676k.m65750j(it, "it");
                return it.toString();
            default:
                C35847e c35847e = (C35847e) obj;
                if (c35847e != null) {
                    return Boolean.valueOf(!c35847e.equals(AbstractC27741m.f111874y));
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }
}
