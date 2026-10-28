package b30;

import java.util.List;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b30.b2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2485b2 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9679w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f9680x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2485b2(List list, int i13) {
        super(1);
        this.f9679w = i13;
        this.f9680x = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9679w) {
            case 0:
                this.f9680x.get(((Number) obj).intValue());
                break;
            default:
                this.f9680x.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
