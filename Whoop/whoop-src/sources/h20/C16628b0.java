package h20;

import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q20.C29822i;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38809d5;

/* JADX INFO: renamed from: h20.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16628b0 implements InterfaceC16640d0 {

    /* JADX INFO: renamed from: a */
    public final C29822i f63964a;

    public C16628b0(C29822i paymentSelection) {
        AbstractC22676k.m65750j(paymentSelection, "paymentSelection");
        this.f63964a = paymentSelection;
    }

    @Override // h20.InterfaceC16640d0
    /* JADX INFO: renamed from: a */
    public final AbstractC38869j5 mo47217a() {
        return null;
    }

    @Override // h20.InterfaceC16640d0
    /* JADX INFO: renamed from: b */
    public final AbstractC29840y mo47218b() {
        return this.f63964a;
    }

    @Override // h20.InterfaceC16640d0
    /* JADX INFO: renamed from: c */
    public final AbstractC38970u5 mo47219c() {
        return null;
    }

    @Override // h20.InterfaceC16640d0
    /* JADX INFO: renamed from: d */
    public final String mo47220d() {
        return this.f63964a.f121901x;
    }

    @Override // h20.InterfaceC16640d0
    /* JADX INFO: renamed from: e */
    public final C38809d5 mo47221e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16628b0) && AbstractC22676k.m65745e(this.f63964a, ((C16628b0) obj).f63964a);
    }

    @Override // h20.InterfaceC16640d0
    public final String getType() {
        return this.f63964a.f121901x;
    }

    public final int hashCode() {
        return this.f63964a.hashCode();
    }

    public final String toString() {
        return "External(paymentSelection=" + this.f63964a + ")";
    }
}
