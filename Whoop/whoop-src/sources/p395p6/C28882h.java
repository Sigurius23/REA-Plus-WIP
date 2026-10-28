package p395p6;

import android.content.Context;
import p335n6.AbstractC26394k;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p6.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C28882h extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C28894l f116910E;

    /* JADX INFO: renamed from: F */
    public int f116911F;

    /* JADX INFO: renamed from: w */
    public Object f116912w;

    /* JADX INFO: renamed from: x */
    public Context f116913x;

    /* JADX INFO: renamed from: y */
    public AbstractC26394k f116914y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f116915z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28882h(C28894l c28894l, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f116910E = c28894l;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116915z = obj;
        this.f116911F |= Integer.MIN_VALUE;
        return C28894l.m87812a(this.f116910E, null, null, this);
    }
}
