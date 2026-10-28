package g53;

import p715kotlin.jvm.internal.AbstractC22676k;
import rb3.AbstractC31199g;

/* JADX INFO: renamed from: g53.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C15499d extends AbstractC15508m {

    /* JADX INFO: renamed from: a */
    public final AbstractC31199g f58169a;

    /* JADX INFO: renamed from: b */
    public final EnumC15497b f58170b;

    public C15499d(AbstractC31199g connectionConf, EnumC15497b connectionType) {
        AbstractC22676k.m65750j(connectionConf, "connectionConf");
        AbstractC22676k.m65750j(connectionType, "connectionType");
        this.f58169a = connectionConf;
        this.f58170b = connectionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15499d)) {
            return false;
        }
        C15499d c15499d = (C15499d) obj;
        return AbstractC22676k.m65745e(this.f58169a, c15499d.f58169a) && this.f58170b == c15499d.f58170b;
    }

    public final int hashCode() {
        return this.f58170b.hashCode() + (this.f58169a.hashCode() * 31);
    }

    public final String toString() {
        return "Connecting(connectionConf=" + this.f58169a + ", connectionType=" + this.f58170b + ")";
    }
}
