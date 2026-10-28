package b10;

import java.util.List;
import l83.C23468n;
import p664yy.C39857f;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C2254q extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C2273z0 f8948E;

    /* JADX INFO: renamed from: F */
    public int f8949F;

    /* JADX INFO: renamed from: w */
    public C2273z0 f8950w;

    /* JADX INFO: renamed from: x */
    public C39857f f8951x;

    /* JADX INFO: renamed from: y */
    public List f8952y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f8953z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2254q(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8948E = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8953z = obj;
        this.f8949F |= Integer.MIN_VALUE;
        Object objM7088j = this.f8948E.m7088j(null, null, null, this);
        return objM7088j == EnumC31071a.f128113w ? objM7088j : new C23468n(objM7088j);
    }
}
