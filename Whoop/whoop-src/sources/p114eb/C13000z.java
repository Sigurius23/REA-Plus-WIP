package p114eb;

import l83.C23465k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eb.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C13000z extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44921w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f44922x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13000z(String str, int i13) {
        super(1);
        this.f44921w = i13;
        this.f44922x = str;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f44921w) {
            case 0:
                return Boolean.valueOf(AbstractC22676k.m65745e((String) obj, this.f44922x));
            default:
                C23465k it = (C23465k) obj;
                AbstractC22676k.m65750j(it, "it");
                return Boolean.valueOf(AbstractC22676k.m65745e(it.f92937w, this.f44922x));
        }
    }
}
