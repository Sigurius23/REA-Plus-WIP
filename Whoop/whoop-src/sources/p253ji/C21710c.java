package p253ji;

import fi.C14498d;
import fi.C14511q;
import fi.InterfaceC14506l;
import p196hi.C17302a;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: ji.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C21710c implements InterfaceC21712e {

    /* JADX INFO: renamed from: w */
    public final C17302a f83344w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC14506l f83345x;

    public C21710c(C17302a c17302a, InterfaceC14506l interfaceC14506l) {
        this.f83344w = c17302a;
        this.f83345x = interfaceC14506l;
    }

    @Override // p253ji.InterfaceC21712e
    /* JADX INFO: renamed from: a */
    public final void mo1686a() {
        InterfaceC14506l interfaceC14506l = this.f83345x;
        boolean z4 = interfaceC14506l instanceof C14511q;
        C17302a c17302a = this.f83344w;
        if (z4) {
            c17302a.m48989b(((C14511q) interfaceC14506l).f53013a);
        } else {
            if (!(interfaceC14506l instanceof C14498d)) {
                throw new NoWhenBranchMatchedException();
            }
            c17302a.m48989b(((C14498d) interfaceC14506l).f52930a);
        }
    }
}
