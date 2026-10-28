package p043c4;

import l83.C23454a0;
import p025b1.C2214e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c4.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C3949b extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16096w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DialogC3954d0 f16097x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3949b(DialogC3954d0 dialogC3954d0, int i13) {
        super(1);
        this.f16096w = i13;
        this.f16097x = dialogC3954d0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16096w) {
            case 0:
                return new C2214e(this.f16097x, 1);
            default:
                DialogC3954d0 dialogC3954d0 = this.f16097x;
                if (dialogC3954d0.f16111E.f16090a) {
                    dialogC3954d0.f16115z.invoke();
                }
                return C23454a0.f92919a;
        }
    }
}
