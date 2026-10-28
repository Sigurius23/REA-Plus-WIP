package ch;

import p007a6.C0454t;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ch.h */
/* JADX INFO: loaded from: classes.dex */
public final class C4587h extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f18467w;

    /* JADX INFO: renamed from: x */
    public int f18468x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0454t f18469y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4587h(C0454t c0454t, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f18469y = c0454t;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f18467w = obj;
        this.f18468x |= Integer.MIN_VALUE;
        return this.f18469y.emit(null, this);
    }
}
