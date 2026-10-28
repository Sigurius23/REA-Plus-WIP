package eu;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.C28655q;
import p591wp.C37487h;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eu.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C13614h extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48207w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function3 f48208x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37487h f48209y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13614h(Function3 function3, C37487h c37487h, int i13) {
        super(2);
        this.f48207w = i13;
        this.f48208x = function3;
        this.f48209y = c37487h;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48207w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        this.f48208x.invoke(this.f48209y, composer, 8);
                    }
                } else {
                    this.f48208x.invoke(this.f48209y, composer, 8);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        this.f48208x.invoke(this.f48209y, composer2, 8);
                    }
                } else {
                    this.f48208x.invoke(this.f48209y, composer2, 8);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
