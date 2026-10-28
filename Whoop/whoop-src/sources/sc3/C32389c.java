package sc3;

import p715kotlin.jvm.internal.AbstractC22676k;
import tc3.C33699a;
import uc3.C34774l;

/* JADX INFO: renamed from: sc3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C32389c implements InterfaceC32400n {

    /* JADX INFO: renamed from: a */
    public final InterfaceC32396j f134131a;

    public C32389c(InterfaceC32396j interfaceC32396j) {
        this.f134131a = interfaceC32396j;
    }

    @Override // sc3.InterfaceC32397k
    /* JADX INFO: renamed from: a */
    public final C33699a mo100966a() {
        return this.f134131a.mo92507a();
    }

    @Override // sc3.InterfaceC32397k
    /* JADX INFO: renamed from: b */
    public final C34774l mo100967b() {
        return this.f134131a.mo92508b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32389c) {
            return AbstractC22676k.m65745e(this.f134131a, ((C32389c) obj).f134131a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f134131a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.f134131a + ')';
    }
}
