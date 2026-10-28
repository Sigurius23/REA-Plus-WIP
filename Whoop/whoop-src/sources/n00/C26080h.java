package n00;

import androidx.room.C1841x;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: n00.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C26080h extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f103283w;

    /* JADX INFO: renamed from: x */
    public int f103284x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1841x f103285y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26080h(C1841x c1841x, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f103285y = c1841x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f103283w = obj;
        this.f103284x |= Integer.MIN_VALUE;
        return this.f103285y.emit(null, this);
    }
}
