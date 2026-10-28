package l53;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: l53.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C23361b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f92603E;

    /* JADX INFO: renamed from: w */
    public C23369j f92604w;

    /* JADX INFO: renamed from: x */
    public String f92605x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f92606y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23369j f92607z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23361b(C23369j c23369j, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f92607z = c23369j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f92606y = obj;
        this.f92603E |= Integer.MIN_VALUE;
        return this.f92607z.iceRestart(null, this);
    }
}
