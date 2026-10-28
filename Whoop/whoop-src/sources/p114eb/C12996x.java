package p114eb;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eb.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C12996x extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44901w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC12939a0 f44902x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12996x(AbstractC12939a0 abstractC12939a0, int i13) {
        super(1);
        this.f44901w = i13;
        this.f44902x = abstractC12939a0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f44901w) {
            case 0:
                C12977n0 destination = (C12977n0) obj;
                AbstractC22676k.m65750j(destination, "destination");
                return Boolean.valueOf(!this.f44902x.f44693n.containsKey(Integer.valueOf(destination.f44819H)));
            default:
                C12977n0 destination2 = (C12977n0) obj;
                AbstractC22676k.m65750j(destination2, "destination");
                return Boolean.valueOf(!this.f44902x.f44693n.containsKey(Integer.valueOf(destination2.f44819H)));
        }
    }
}
