package t40;

import l83.C23468n;
import mc3.InterfaceC25435a;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: t40.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C33533c extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C33536f f139977E;

    /* JADX INFO: renamed from: F */
    public int f139978F;

    /* JADX INFO: renamed from: w */
    public C33536f f139979w;

    /* JADX INFO: renamed from: x */
    public C33536f f139980x;

    /* JADX INFO: renamed from: y */
    public InterfaceC25435a f139981y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f139982z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33533c(C33536f c33536f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f139977E = c33536f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139982z = obj;
        this.f139978F |= Integer.MIN_VALUE;
        Object objM105906a = this.f139977E.m105906a(this);
        return objM105906a == EnumC31071a.f128113w ? objM105906a : new C23468n(objM105906a);
    }
}
