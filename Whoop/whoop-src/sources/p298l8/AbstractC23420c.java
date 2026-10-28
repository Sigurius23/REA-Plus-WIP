package p298l8;

import java.util.LinkedHashMap;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l8.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23420c {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f92772a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public abstract Object mo67910a(InterfaceC23419b interfaceC23419b);

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC23420c) {
            return AbstractC22676k.m65745e(this.f92772a, ((AbstractC23420c) obj).f92772a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f92772a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f92772a + ')';
    }
}
