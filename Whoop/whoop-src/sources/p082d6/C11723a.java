package p082d6;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: d6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11723a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f37877w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11724b f37878x;

    /* JADX INFO: renamed from: y */
    public int f37879y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11723a(C11724b c11724b, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f37878x = c11724b;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37877w = obj;
        this.f37879y |= Integer.MIN_VALUE;
        return this.f37878x.m31328a(null, this);
    }
}
