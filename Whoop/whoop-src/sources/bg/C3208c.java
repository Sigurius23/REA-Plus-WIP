package bg;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bg.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3208c extends AbstractC3210e {

    /* JADX INFO: renamed from: a */
    public final String f12565a;

    public C3208c(String name) {
        AbstractC22676k.m65750j(name, "name");
        this.f12565a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3208c) && AbstractC22676k.m65745e(this.f12565a, ((C3208c) obj).f12565a);
    }

    public final int hashCode() {
        return this.f12565a.hashCode();
    }

    public final String toString() {
        return this.f12565a;
    }
}
