package p605x6;

import android.content.Context;
import dc3.C11918c;
import p395p6.C28894l;
import p715kotlin.jvm.functions.Function1;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: x6.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C38000e extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C28894l f162782E;

    /* JADX INFO: renamed from: F */
    public int f162783F;

    /* JADX INFO: renamed from: w */
    public Context f162784w;

    /* JADX INFO: renamed from: x */
    public Function1 f162785x;

    /* JADX INFO: renamed from: y */
    public C11918c f162786y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f162787z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38000e(C28894l c28894l, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f162782E = c28894l;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f162787z = obj;
        this.f162783F |= Integer.MIN_VALUE;
        return this.f162782E.m87815c(null, null, this);
    }
}
