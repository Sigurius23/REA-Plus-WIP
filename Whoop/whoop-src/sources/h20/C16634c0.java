package h20;

import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import q20.C29829n;
import q20.C29830o;
import q20.C29834s;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38809d5;

/* JADX INFO: renamed from: h20.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16634c0 implements InterfaceC16640d0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC29835t f63979a;

    public C16634c0(AbstractC29835t paymentSelection) {
        AbstractC22676k.m65750j(paymentSelection, "paymentSelection");
        this.f63979a = paymentSelection;
    }

    @Override // h20.InterfaceC16640d0
    /* JADX INFO: renamed from: a */
    public final AbstractC38869j5 mo47217a() {
        return this.f63979a.mo91331k();
    }

    @Override // h20.InterfaceC16640d0
    /* JADX INFO: renamed from: b */
    public final AbstractC29840y mo47218b() {
        return this.f63979a;
    }

    @Override // h20.InterfaceC16640d0
    /* JADX INFO: renamed from: c */
    public final AbstractC38970u5 mo47219c() {
        return this.f63979a.mo91332s();
    }

    @Override // h20.InterfaceC16640d0
    /* JADX INFO: renamed from: d */
    public final String mo47220d() {
        AbstractC29835t abstractC29835t = this.f63979a;
        if ((abstractC29835t instanceof C29829n) || (abstractC29835t instanceof C29834s) || (abstractC29835t instanceof C29830o)) {
            return abstractC29835t.mo91330i().f167026w;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // h20.InterfaceC16640d0
    /* JADX INFO: renamed from: e */
    public final C38809d5 mo47221e() {
        return this.f63979a.mo91330i();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16634c0) && AbstractC22676k.m65745e(this.f63979a, ((C16634c0) obj).f63979a);
    }

    @Override // h20.InterfaceC16640d0
    public final String getType() {
        return this.f63979a.mo91330i().f167026w;
    }

    public final int hashCode() {
        return this.f63979a.hashCode();
    }

    public final String toString() {
        return "New(paymentSelection=" + this.f63979a + ")";
    }
}
