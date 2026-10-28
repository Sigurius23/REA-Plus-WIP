package p251jg;

import p194hg.InterfaceC17243d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jg.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C21648a implements InterfaceC17243d {

    /* JADX INFO: renamed from: a */
    public final String f83159a;

    public C21648a(String key) {
        AbstractC22676k.m65750j(key, "key");
        this.f83159a = key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21648a) && AbstractC22676k.m65745e(this.f83159a, ((C21648a) obj).f83159a);
    }

    public final int hashCode() {
        return this.f83159a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("IgnoreKey(key="), this.f83159a, ')');
    }
}
