package lb3;

import j93.InterfaceC21461d;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.AbstractC32309k;
import s93.InterfaceC32307i;

/* JADX INFO: renamed from: lb3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C23774g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC32307i f94148a;

    public C23774g(InterfaceC32307i annotations) {
        AbstractC22676k.m65750j(annotations, "annotations");
        this.f94148a = annotations;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC21461d m69864b() {
        return AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23774g.class);
    }

    /* JADX INFO: renamed from: a */
    public final C23774g m69865a(C23774g c23774g) {
        return c23774g == null ? this : new C23774g(AbstractC32309k.m100575d(this.f94148a, c23774g.f94148a));
    }

    /* JADX INFO: renamed from: c */
    public final C23774g m69866c(C23774g c23774g) {
        if (AbstractC22676k.m65745e(c23774g, this)) {
            return this;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23774g) {
            return AbstractC22676k.m65745e(((C23774g) obj).f94148a, this.f94148a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f94148a.hashCode();
    }
}
