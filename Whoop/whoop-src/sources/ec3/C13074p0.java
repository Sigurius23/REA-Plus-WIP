package ec3;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.p0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13074p0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public Object f45177E;

    /* JADX INFO: renamed from: w */
    public C13077q0 f45178w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f45179x;

    /* JADX INFO: renamed from: y */
    public int f45180y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C13077q0 f45181z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13074p0(C13077q0 c13077q0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45181z = c13077q0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45179x = obj;
        this.f45180y |= Integer.MIN_VALUE;
        return this.f45181z.emit(null, this);
    }
}
