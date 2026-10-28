package p521ue;

import gf.InterfaceC15761b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ue.a */
/* JADX INFO: loaded from: classes.dex */
public final class C34855a {

    /* JADX INFO: renamed from: a */
    public final String f146800a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC15761b f146801b;

    public C34855a(String schemeId, InterfaceC15761b interfaceC15761b) {
        AbstractC22676k.m65750j(schemeId, "schemeId");
        this.f146800a = schemeId;
        this.f146801b = interfaceC15761b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34855a)) {
            return false;
        }
        C34855a c34855a = (C34855a) obj;
        return AbstractC22676k.m65745e(this.f146800a, c34855a.f146800a) && AbstractC22676k.m65745e(this.f146801b, c34855a.f146801b);
    }

    public final int hashCode() {
        return this.f146801b.hashCode() + (this.f146800a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthOptionImpl(schemeId=" + ((Object) C34856b.m109935a(this.f146800a)) + ", attributes=" + this.f146801b + ')';
    }
}
