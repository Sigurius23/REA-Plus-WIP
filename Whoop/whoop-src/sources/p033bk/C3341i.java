package p033bk;

import p715kotlin.jvm.internal.C22672i;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: bk.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C3341i extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f12967E;

    /* JADX INFO: renamed from: w */
    public C22672i f12968w;

    /* JADX INFO: renamed from: x */
    public long f12969x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f12970y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3346n f12971z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3341i(C3346n c3346n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12971z = c3346n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12970y = obj;
        this.f12967E |= Integer.MIN_VALUE;
        return this.f12971z.m9653d(null, null, null, this);
    }
}
