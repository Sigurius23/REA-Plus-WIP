package lb3;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb3.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C23805v implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94198w;

    /* JADX INFO: renamed from: x */
    public final Function1 f94199x;

    public /* synthetic */ C23805v(Function1 function1, int i13) {
        this.f94198w = i13;
        this.f94199x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f94198w) {
            case 0:
                AbstractC23811y abstractC23811y = (AbstractC23811y) obj;
                AbstractC22676k.m65747g(abstractC23811y);
                return this.f94199x.invoke(abstractC23811y).toString();
            default:
                return this.f94199x.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
