package m63;

import java.nio.charset.Charset;
import s83.AbstractC32269c;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: m63.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C25124b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C25125c f98471E;

    /* JADX INFO: renamed from: F */
    public int f98472F;

    /* JADX INFO: renamed from: w */
    public C25125c f98473w;

    /* JADX INFO: renamed from: x */
    public Charset f98474x;

    /* JADX INFO: renamed from: y */
    public InterfaceC37138c f98475y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f98476z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25124b(C25125c c25125c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f98471E = c25125c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f98476z = obj;
        this.f98472F |= Integer.MIN_VALUE;
        return this.f98471E.mo63740b(null, null, null, this);
    }
}
