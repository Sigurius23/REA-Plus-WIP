package p040c0;

import p077d0.InterfaceC11337c0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3778s1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC22680m f15416a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11337c0 f15417b;

    /* JADX WARN: Multi-variable type inference failed */
    public C3778s1(InterfaceC11337c0 interfaceC11337c0, Function1 function1) {
        this.f15416a = (AbstractC22680m) function1;
        this.f15417b = interfaceC11337c0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3778s1)) {
            return false;
        }
        C3778s1 c3778s1 = (C3778s1) obj;
        return this.f15416a.equals(c3778s1.f15416a) && AbstractC22676k.m65745e(this.f15417b, c3778s1.f15417b);
    }

    public final int hashCode() {
        return this.f15417b.hashCode() + (this.f15416a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f15416a + ", animationSpec=" + this.f15417b + ')';
    }
}
