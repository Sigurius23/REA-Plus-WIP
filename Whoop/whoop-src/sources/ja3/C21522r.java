package ja3;

import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35850h;
import x93.C38122n;

/* JADX INFO: renamed from: ja3.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C21522r {

    /* JADX INFO: renamed from: a */
    public final C35850h f82556a;

    /* JADX INFO: renamed from: b */
    public final C38122n f82557b;

    public C21522r(C35850h name, C38122n c38122n) {
        AbstractC22676k.m65750j(name, "name");
        this.f82556a = name;
        this.f82557b = c38122n;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21522r) {
            return AbstractC22676k.m65745e(this.f82556a, ((C21522r) obj).f82556a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f82556a.hashCode();
    }
}
