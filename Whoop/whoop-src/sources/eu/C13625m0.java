package eu;

import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import c93.InterfaceC4351m;
import java.util.List;
import l83.C23454a0;
import p591wp.C37482c;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eu.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C13625m0 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ List f48279w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f48280x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13625m0(List list, long j7, C37482c c37482c, C37482c c37482c2, int i13) {
        super(2);
        this.f48279w = list;
        this.f48280x = j7;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC3269g.m9502f(this.f48280x, this.f48279w, (Composer) obj, 1);
        return C23454a0.f92919a;
    }
}
