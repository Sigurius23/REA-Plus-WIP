package p552vh;

import p715kotlin.jvm.internal.C22659b0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: vh.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C36034b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f153711E;

    /* JADX INFO: renamed from: w */
    public Object f153712w;

    /* JADX INFO: renamed from: x */
    public C22659b0 f153713x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f153714y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C36036d f153715z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36034b(C36036d c36036d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f153715z = c36036d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f153714y = obj;
        this.f153711E |= Integer.MIN_VALUE;
        return this.f153715z.mo71006a(this);
    }
}
