package fi;

import p461rh.InterfaceC31421j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fi.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C14498d implements InterfaceC14506l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC31421j f52930a;

    /* JADX INFO: renamed from: b */
    public final C14503i f52931b;

    /* JADX INFO: renamed from: c */
    public final Throwable f52932c;

    public C14498d(InterfaceC31421j interfaceC31421j, C14503i c14503i, Throwable th3) {
        this.f52930a = interfaceC31421j;
        this.f52931b = c14503i;
        this.f52932c = th3;
    }

    @Override // fi.InterfaceC14506l
    /* JADX INFO: renamed from: d */
    public final C14503i mo41406d() {
        return this.f52931b;
    }

    @Override // fi.InterfaceC14506l
    /* JADX INFO: renamed from: e */
    public final InterfaceC31421j mo41407e() {
        return this.f52930a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14498d)) {
            return false;
        }
        C14498d c14498d = (C14498d) obj;
        return AbstractC22676k.m65745e(this.f52930a, c14498d.f52930a) && AbstractC22676k.m65745e(this.f52931b, c14498d.f52931b) && AbstractC22676k.m65745e(this.f52932c, c14498d.f52932c);
    }

    public final int hashCode() {
        InterfaceC31421j interfaceC31421j = this.f52930a;
        return this.f52932c.hashCode() + ((this.f52931b.hashCode() + ((interfaceC31421j == null ? 0 : interfaceC31421j.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.f52930a + ", request=" + this.f52931b + ", throwable=" + this.f52932c + ')';
    }
}
