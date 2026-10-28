package ec3;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.v0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13092v0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45236w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C36623w f45237x;

    /* JADX INFO: renamed from: y */
    public int f45238y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13092v0(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45237x = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45236w = obj;
        this.f45238y |= Integer.MIN_VALUE;
        return this.f45237x.m117694b(null, this);
    }
}
