package ch;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ch.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C4593n extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f18479w;

    /* JADX INFO: renamed from: x */
    public int f18480x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f18481y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4593n(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f18481y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f18479w = obj;
        this.f18480x |= Integer.MIN_VALUE;
        return this.f18481y.emit(null, this);
    }
}
