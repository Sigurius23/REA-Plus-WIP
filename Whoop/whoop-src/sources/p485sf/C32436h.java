package p485sf;

import a30.C0332w0;
import java.util.Iterator;
import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: sf.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C32436h extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f134282E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f134283F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C0332w0 f134284G;

    /* JADX INFO: renamed from: H */
    public int f134285H;

    /* JADX INFO: renamed from: w */
    public C0332w0 f134286w;

    /* JADX INFO: renamed from: x */
    public Iterator f134287x;

    /* JADX INFO: renamed from: y */
    public C32430b f134288y;

    /* JADX INFO: renamed from: z */
    public int f134289z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32436h(C0332w0 c0332w0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f134284G = c0332w0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f134283F = obj;
        this.f134285H |= Integer.MIN_VALUE;
        Object objM866x = this.f134284G.m866x(null, this);
        return objM866x == EnumC31071a.f128113w ? objM866x : new C23468n(objM866x);
    }
}
