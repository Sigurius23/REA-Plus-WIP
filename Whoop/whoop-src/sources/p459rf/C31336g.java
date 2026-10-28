package p459rf;

import gf.C15762c;
import ne3.AbstractC26604b;
import ne3.C26617h0;
import ne3.InterfaceC26618i;
import p424qg.C30335d;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34846v0;
import ud3.C34818h0;

/* JADX INFO: renamed from: rf.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C31336g extends AbstractC34846v0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC34846v0 f128948a;

    /* JADX INFO: renamed from: b */
    public final C30335d f128949b;

    /* JADX INFO: renamed from: c */
    public final C15762c f128950c;

    public C31336g(AbstractC34846v0 delegate, C30335d counter, C15762c c15762c) {
        AbstractC22676k.m65750j(delegate, "delegate");
        AbstractC22676k.m65750j(counter, "counter");
        this.f128948a = delegate;
        this.f128949b = counter;
        this.f128950c = c15762c;
    }

    @Override // ud3.AbstractC34846v0
    public final long contentLength() {
        return this.f128948a.contentLength();
    }

    @Override // ud3.AbstractC34846v0
    /* JADX INFO: renamed from: contentType */
    public final C34818h0 getContentType() {
        return this.f128948a.getContentType();
    }

    @Override // ud3.AbstractC34846v0
    public final boolean isDuplex() {
        return this.f128948a.isDuplex();
    }

    @Override // ud3.AbstractC34846v0
    public final boolean isOneShot() {
        return this.f128948a.isOneShot();
    }

    @Override // ud3.AbstractC34846v0
    public final void writeTo(InterfaceC26618i interfaceC26618i) {
        C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(new C31338i(interfaceC26618i, this.f128949b, this.f128950c));
        this.f128948a.writeTo(c26617h0M79157b);
        if (c26617h0M79157b.f105869y) {
            return;
        }
        c26617h0M79157b.mo79203e();
    }
}
