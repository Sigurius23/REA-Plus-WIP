package p045c6;

import ne3.C26611e0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: c6.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C4264g extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C4265h f17323E;

    /* JADX INFO: renamed from: F */
    public int f17324F;

    /* JADX INFO: renamed from: w */
    public Object f17325w;

    /* JADX INFO: renamed from: x */
    public C26611e0 f17326x;

    /* JADX INFO: renamed from: y */
    public Object f17327y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f17328z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4264g(C4265h c4265h, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f17323E = c4265h;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f17328z = obj;
        this.f17324F |= Integer.MIN_VALUE;
        return this.f17323E.mo1104c(null, this);
    }
}
