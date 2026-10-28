package ec3;

import androidx.room.C1841x;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13025c2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45028w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C1841x f45029x;

    /* JADX INFO: renamed from: y */
    public int f45030y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13025c2(C1841x c1841x, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45029x = c1841x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45028w = obj;
        this.f45030y |= Integer.MIN_VALUE;
        return this.f45029x.m5458b(0, this);
    }
}
