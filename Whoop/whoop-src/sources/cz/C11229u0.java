package cz;

import java.io.Serializable;
import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: cz.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11229u0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f36032E;

    /* JADX INFO: renamed from: w */
    public C11233w0 f36033w;

    /* JADX INFO: renamed from: x */
    public C11190b f36034x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f36035y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C11233w0 f36036z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11229u0(C11233w0 c11233w0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f36036z = c11233w0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f36035y = obj;
        this.f36032E |= Integer.MIN_VALUE;
        Serializable serializableM30348a = this.f36036z.m30348a(null, this);
        return serializableM30348a == EnumC31071a.f128113w ? serializableM30348a : new C23468n(serializableM30348a);
    }
}
