package v10;

import java.io.Serializable;
import l83.C23468n;
import p664yy.C39857f;
import p715kotlin.jvm.internal.C22669g0;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: v10.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C35529e extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f151164E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC35531g f151165F;

    /* JADX INFO: renamed from: G */
    public int f151166G;

    /* JADX INFO: renamed from: w */
    public Object f151167w;

    /* JADX INFO: renamed from: x */
    public Serializable f151168x;

    /* JADX INFO: renamed from: y */
    public C39857f f151169y;

    /* JADX INFO: renamed from: z */
    public C22669g0 f151170z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35529e(AbstractC35531g abstractC35531g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f151165F = abstractC35531g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f151164E = obj;
        this.f151166G |= Integer.MIN_VALUE;
        Object objM112684a = AbstractC35531g.m112684a(this.f151165F, null, null, null, 0L, this);
        return objM112684a == EnumC31071a.f128113w ? objM112684a : new C23468n(objM112684a);
    }
}
