package p180h0;

import c93.InterfaceC4339a;
import l83.InterfaceC23459e;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.c4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16373c4 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C16379d4 f62949E;

    /* JADX INFO: renamed from: F */
    public int f62950F;

    /* JADX INFO: renamed from: w */
    public InterfaceC23459e f62951w;

    /* JADX INFO: renamed from: x */
    public InterfaceC4339a f62952x;

    /* JADX INFO: renamed from: y */
    public float f62953y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f62954z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16373c4(C16379d4 c16379d4, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f62949E = c16379d4;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f62954z = obj;
        this.f62950F |= Integer.MIN_VALUE;
        return this.f62949E.m46576a(null, null, this);
    }
}
