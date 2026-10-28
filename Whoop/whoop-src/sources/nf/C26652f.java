package nf;

import gf.InterfaceC15761b;
import p551vf.C35937b;
import p581we.C37187g;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: nf.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C26652f extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C26653g f105940E;

    /* JADX INFO: renamed from: F */
    public int f105941F;

    /* JADX INFO: renamed from: w */
    public InterfaceC15761b f105942w;

    /* JADX INFO: renamed from: x */
    public C35937b f105943x;

    /* JADX INFO: renamed from: y */
    public C37187g f105944y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f105945z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26652f(C26653g c26653g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f105940E = c26653g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f105945z = obj;
        this.f105941F |= Integer.MIN_VALUE;
        return this.f105940E.mo79293a(null, this);
    }
}
