package q30;

import r30.C30897b;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: q30.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C29909i extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f122185E;

    /* JADX INFO: renamed from: w */
    public C29911j f122186w;

    /* JADX INFO: renamed from: x */
    public C30897b f122187x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f122188y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C29911j f122189z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29909i(C29911j c29911j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f122189z = c29911j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f122188y = obj;
        this.f122185E |= Integer.MIN_VALUE;
        return C29911j.m91517a(this.f122189z, null, this);
    }
}
