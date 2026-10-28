package ec3;

import androidx.room.C1841x;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.b1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13020b1 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public Object f45014E;

    /* JADX INFO: renamed from: w */
    public C1841x f45015w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f45016x;

    /* JADX INFO: renamed from: y */
    public int f45017y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C1841x f45018z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13020b1(C1841x c1841x, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45018z = c1841x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45016x = obj;
        this.f45017y |= Integer.MIN_VALUE;
        return this.f45018z.emit(null, this);
    }
}
