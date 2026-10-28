package cz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: cz.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11231v0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C11233w0 f36037w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f36038x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11233w0 f36039y;

    /* JADX INFO: renamed from: z */
    public int f36040z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11231v0(C11233w0 c11233w0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f36039y = c11233w0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f36038x = obj;
        this.f36040z |= Integer.MIN_VALUE;
        Object objM30349b = this.f36039y.m30349b(this);
        return objM30349b == EnumC31071a.f128113w ? objM30349b : new C23468n(objM30349b);
    }
}
