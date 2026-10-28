package y43;

import mc3.C25437c;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: y43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C39229a extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C39230b f168680E;

    /* JADX INFO: renamed from: F */
    public int f168681F;

    /* JADX INFO: renamed from: w */
    public C39230b f168682w;

    /* JADX INFO: renamed from: x */
    public Object f168683x;

    /* JADX INFO: renamed from: y */
    public C25437c f168684y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f168685z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39229a(C39230b c39230b, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f168680E = c39230b;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f168685z = obj;
        this.f168681F |= Integer.MIN_VALUE;
        return this.f168680E.m124995a(null, this);
    }
}
