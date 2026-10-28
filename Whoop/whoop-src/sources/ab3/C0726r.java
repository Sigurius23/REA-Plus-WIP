package ab3;

import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35845c;

/* JADX INFO: renamed from: ab3.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C0726r extends AbstractC0727s {

    /* JADX INFO: renamed from: a */
    public final C0714f f2705a;

    public C0726r(C0714f c0714f) {
        this.f2705a = c0714f;
    }

    /* JADX INFO: renamed from: a */
    public final int m1787a() {
        return this.f2705a.f2695b;
    }

    /* JADX INFO: renamed from: b */
    public final C35845c m1788b() {
        return this.f2705a.f2694a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0726r) && AbstractC22676k.m65745e(this.f2705a, ((C0726r) obj).f2705a);
    }

    public final int hashCode() {
        return this.f2705a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f2705a + ')';
    }
}
