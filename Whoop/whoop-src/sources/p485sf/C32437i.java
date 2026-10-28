package p485sf;

import a30.C0332w0;
import java.util.Iterator;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: sf.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C32437i extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f134290E;

    /* JADX INFO: renamed from: F */
    public int f134291F;

    /* JADX INFO: renamed from: G */
    public /* synthetic */ Object f134292G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C0332w0 f134293H;

    /* JADX INFO: renamed from: I */
    public int f134294I;

    /* JADX INFO: renamed from: w */
    public C32434f f134295w;

    /* JADX INFO: renamed from: x */
    public Iterator f134296x;

    /* JADX INFO: renamed from: y */
    public C32434f f134297y;

    /* JADX INFO: renamed from: z */
    public C32434f f134298z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32437i(C0332w0 c0332w0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f134293H = c0332w0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f134292G = obj;
        this.f134294I |= Integer.MIN_VALUE;
        return this.f134293H.m867y(null, this);
    }
}
