package p485sf;

import a30.C0332w0;
import java.util.Iterator;
import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: sf.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C32435g extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f134274E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f134275F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C0332w0 f134276G;

    /* JADX INFO: renamed from: H */
    public int f134277H;

    /* JADX INFO: renamed from: w */
    public C0332w0 f134278w;

    /* JADX INFO: renamed from: x */
    public Iterator f134279x;

    /* JADX INFO: renamed from: y */
    public C32429a f134280y;

    /* JADX INFO: renamed from: z */
    public int f134281z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32435g(C0332w0 c0332w0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f134276G = c0332w0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f134275F = obj;
        this.f134277H |= Integer.MIN_VALUE;
        Object objM864v = this.f134276G.m864v(null, null, null, this);
        return objM864v == EnumC31071a.f128113w ? objM864v : new C23468n(objM864v);
    }
}
