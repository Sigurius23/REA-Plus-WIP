package id;

import hm.C17417d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: id.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C18405b {

    /* JADX INFO: renamed from: a */
    public final C18406c f71591a;

    public C18405b(C17417d c17417d) {
        this.f71591a = (C18406c) c17417d.f67507x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C18405b.class == obj.getClass() && AbstractC22676k.m65745e(this.f71591a, ((C18405b) obj).f71591a);
    }

    public final int hashCode() {
        C18406c c18406c = this.f71591a;
        if (c18406c != null) {
            return c18406c.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("GetRoleCredentialsResponse(");
        sb4.append("roleCredentials=" + this.f71591a);
        sb4.append(")");
        return sb4.toString();
    }
}
