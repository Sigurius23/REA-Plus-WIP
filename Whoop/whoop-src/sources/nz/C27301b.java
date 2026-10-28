package nz;

import gm.C15990r;
import l83.C23468n;
import nq0.C27050m;
import p664yy.AbstractC39872m0;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: nz.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C27301b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C15990r f109355E;

    /* JADX INFO: renamed from: F */
    public int f109356F;

    /* JADX INFO: renamed from: w */
    public C15990r f109357w;

    /* JADX INFO: renamed from: x */
    public AbstractC39872m0 f109358x;

    /* JADX INFO: renamed from: y */
    public C27050m f109359y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f109360z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27301b(C15990r c15990r, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f109355E = c15990r;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f109360z = obj;
        this.f109356F |= Integer.MIN_VALUE;
        Object objM45141D = this.f109355E.m45141D(null, null, this);
        return objM45141D == EnumC31071a.f128113w ? objM45141D : new C23468n(objM45141D);
    }
}
