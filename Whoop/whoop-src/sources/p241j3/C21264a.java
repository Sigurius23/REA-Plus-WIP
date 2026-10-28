package p241j3;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: j3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21264a extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C21265b f81180w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21267d f81181x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f81182y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21264a(C21265b c21265b, C21267d c21267d, long j7) {
        super(2);
        this.f81180w = c21265b;
        this.f81181x = c21267d;
        this.f81182y = j7;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        this.f81180w.f81184b.m59680b(this.f81181x, ((Number) obj).longValue(), ((Number) obj2).longValue(), this.f81182y);
        return C23454a0.f92919a;
    }
}
