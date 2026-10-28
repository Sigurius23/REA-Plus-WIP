package p390p1;

import p027b3.C2363d1;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p1.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C28637l1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public Function1 f115825w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f115826x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2363d1 f115827y;

    /* JADX INFO: renamed from: z */
    public int f115828z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28637l1(C2363d1 c2363d1, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f115827y = c2363d1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f115826x = obj;
        this.f115828z |= Integer.MIN_VALUE;
        return this.f115827y.mo7286k(null, this);
    }
}
