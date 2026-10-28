package d43;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11701a {

    /* JADX INFO: renamed from: a */
    public final C11702b f37844a;

    /* JADX INFO: renamed from: b */
    public final C11703c f37845b;

    public C11701a() {
        C11702b c11702b = new C11702b();
        C11703c c11703c = new C11703c();
        this.f37844a = c11702b;
        this.f37845b = c11703c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11701a)) {
            return false;
        }
        C11701a c11701a = (C11701a) obj;
        return AbstractC22676k.m65745e(this.f37844a, c11701a.f37844a) && AbstractC22676k.m65745e(this.f37845b, c11701a.f37845b);
    }

    public final int hashCode() {
        return this.f37845b.hashCode() + (this.f37844a.hashCode() * 31);
    }

    public final String toString() {
        return "ModerationConfig(moderationWarningConfig=" + this.f37844a + ", videoModerationConfig=" + this.f37845b + ")";
    }
}
