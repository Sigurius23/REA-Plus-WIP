package x43;

import p715kotlin.jvm.internal.AbstractC22676k;
import v33.AbstractC35638w;

/* JADX INFO: renamed from: x43.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C37982n extends AbstractC37984p {

    /* JADX INFO: renamed from: a */
    public final AbstractC35638w f162641a;

    public C37982n(AbstractC35638w sfuEvent) {
        AbstractC22676k.m65750j(sfuEvent, "sfuEvent");
        this.f162641a = sfuEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37982n) && AbstractC22676k.m65745e(this.f162641a, ((C37982n) obj).f162641a);
    }

    public final int hashCode() {
        return this.f162641a.hashCode();
    }

    public final String toString() {
        return "SfuMessage(sfuEvent=" + this.f162641a + ")";
    }
}
