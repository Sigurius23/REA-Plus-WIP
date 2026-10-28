package b10;

import l83.C23468n;
import p664yy.C39857f;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C2266w extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C2273z0 f8987E;

    /* JADX INFO: renamed from: F */
    public int f8988F;

    /* JADX INFO: renamed from: w */
    public C2273z0 f8989w;

    /* JADX INFO: renamed from: x */
    public String f8990x;

    /* JADX INFO: renamed from: y */
    public C39857f f8991y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f8992z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2266w(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8987E = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8992z = obj;
        this.f8988F |= Integer.MIN_VALUE;
        Object objM7094q = this.f8987E.m7094q(null, null, this);
        return objM7094q == EnumC31071a.f128113w ? objM7094q : new C23468n(objM7094q);
    }
}
