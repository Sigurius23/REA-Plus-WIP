package lk;

import java.util.Iterator;
import java.util.Map;
import p005a3.C0237p;
import p255jk.C21743a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: lk.b */
/* JADX INFO: loaded from: classes.dex */
public final class C24483b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public Object f95514E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f95515F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C0237p f95516G;

    /* JADX INFO: renamed from: H */
    public int f95517H;

    /* JADX INFO: renamed from: w */
    public C0237p f95518w;

    /* JADX INFO: renamed from: x */
    public C21743a f95519x;

    /* JADX INFO: renamed from: y */
    public Map f95520y;

    /* JADX INFO: renamed from: z */
    public Iterator f95521z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24483b(C0237p c0237p, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f95516G = c0237p;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f95515F = obj;
        this.f95517H |= Integer.MIN_VALUE;
        return this.f95516G.mo708n(this);
    }
}
