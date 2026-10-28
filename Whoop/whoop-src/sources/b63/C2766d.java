package b63;

import e63.C12775d;
import i63.C18163d;
import java.util.Iterator;
import java.util.List;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b63.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C2766d extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public Iterator f10893E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f10894F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C2768f f10895G;

    /* JADX INFO: renamed from: H */
    public int f10896H;

    /* JADX INFO: renamed from: w */
    public C12775d f10897w;

    /* JADX INFO: renamed from: x */
    public Object f10898x;

    /* JADX INFO: renamed from: y */
    public C18163d f10899y;

    /* JADX INFO: renamed from: z */
    public List f10900z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2766d(C2768f c2768f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f10895G = c2768f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f10894F = obj;
        this.f10896H |= Integer.MIN_VALUE;
        return this.f10895G.m7832a(null, null, this);
    }
}
