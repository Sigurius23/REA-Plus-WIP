package androidx.room;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.room.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C1838w extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f7199w;

    /* JADX INFO: renamed from: x */
    public int f7200x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1841x f7201y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838w(C1841x c1841x, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f7201y = c1841x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f7199w = obj;
        this.f7200x |= Integer.MIN_VALUE;
        return this.f7201y.emit(null, this);
    }
}
