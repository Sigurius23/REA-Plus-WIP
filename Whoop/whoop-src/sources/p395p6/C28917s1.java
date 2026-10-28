package p395p6;

import java.util.Set;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p6.s1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28917s1 implements InterfaceC28923u1, InterfaceC28890j1 {

    /* JADX INFO: renamed from: a */
    public final Set f117027a;

    public C28917s1(Set set) {
        this.f117027a = set;
        if (set.isEmpty()) {
            throw new IllegalArgumentException("The set of sizes cannot be empty");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C28917s1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.glance.appwidget.SizeMode.Responsive");
        return AbstractC22676k.m65745e(this.f117027a, ((C28917s1) obj).f117027a);
    }

    public final int hashCode() {
        return this.f117027a.hashCode();
    }

    public final String toString() {
        return "SizeMode.Responsive(sizes=" + this.f117027a + ')';
    }
}
