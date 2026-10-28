package h20;

import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q20.C29818g;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38809d5;

/* JADX INFO: renamed from: h20.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16622a0 implements InterfaceC16640d0 {

    /* JADX INFO: renamed from: a */
    public final C29818g f63956a;

    public C16622a0(C29818g paymentSelection) {
        AbstractC22676k.m65750j(paymentSelection, "paymentSelection");
        this.f63956a = paymentSelection;
    }

    @Override // h20.InterfaceC16640d0
    /* JADX INFO: renamed from: a */
    public final AbstractC38869j5 mo47217a() {
        return null;
    }

    @Override // h20.InterfaceC16640d0
    /* JADX INFO: renamed from: b */
    public final AbstractC29840y mo47218b() {
        return this.f63956a;
    }

    @Override // h20.InterfaceC16640d0
    /* JADX INFO: renamed from: c */
    public final AbstractC38970u5 mo47219c() {
        return null;
    }

    @Override // h20.InterfaceC16640d0
    /* JADX INFO: renamed from: d */
    public final String mo47220d() {
        return this.f63956a.f121888x;
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
        return (obj instanceof C16622a0) && AbstractC22676k.m65745e(this.f63956a, ((C16622a0) obj).f63956a);
    }

    @Override // h20.InterfaceC16640d0
    public final String getType() {
        return this.f63956a.f121888x;
    }

    public final int hashCode() {
        return this.f63956a.hashCode();
    }

    public final String toString() {
        return "Custom(paymentSelection=" + this.f63956a + ")";
    }
}
