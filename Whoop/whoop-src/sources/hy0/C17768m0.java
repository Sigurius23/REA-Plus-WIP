package hy0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;

/* JADX INFO: renamed from: hy0.m0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17768m0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69094w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f69095x;

    public /* synthetic */ C17768m0(Object obj, int i13) {
        this.f69094w = i13;
        this.f69095x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69094w) {
            case 0:
                return AbstractC17771n0.m51052n((C17777p0) this.f69095x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC17766l1.m50967h((TextResource) this.f69095x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
