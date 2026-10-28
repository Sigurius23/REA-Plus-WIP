package g53;

import p715kotlin.jvm.internal.AbstractC22676k;
import rb3.AbstractC31199g;

/* JADX INFO: renamed from: g53.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C15509n extends AbstractC15519x {

    /* JADX INFO: renamed from: a */
    public final AbstractC31199g f58178a;

    /* JADX INFO: renamed from: b */
    public final EnumC15497b f58179b;

    public C15509n(AbstractC31199g connectionConf, EnumC15497b enumC15497b) {
        AbstractC22676k.m65750j(connectionConf, "connectionConf");
        this.f58178a = connectionConf;
        this.f58179b = enumC15497b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15509n)) {
            return false;
        }
        C15509n c15509n = (C15509n) obj;
        return AbstractC22676k.m65745e(this.f58178a, c15509n.f58178a) && this.f58179b == c15509n.f58179b;
    }

    public final int hashCode() {
        return this.f58179b.hashCode() + (this.f58178a.hashCode() * 31);
    }

    public final String toString() {
        return "Connect(connectionConf=" + this.f58178a + ", connectionType=" + this.f58179b + ")";
    }
}
