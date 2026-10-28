package j53;

import c13.AbstractC3855a;
import java.util.Comparator;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j53.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C21353k {

    /* JADX INFO: renamed from: a */
    public final Map f81676a;

    /* JADX INFO: renamed from: b */
    public final Map f81677b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21348f f81678c;

    /* JADX INFO: renamed from: d */
    public final Comparator f81679d;

    public C21353k(Map participants, Map pins, InterfaceC21348f preset, Comparator comparator) {
        AbstractC22676k.m65750j(participants, "participants");
        AbstractC22676k.m65750j(pins, "pins");
        AbstractC22676k.m65750j(preset, "preset");
        this.f81676a = participants;
        this.f81677b = pins;
        this.f81678c = preset;
        this.f81679d = comparator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21353k)) {
            return false;
        }
        C21353k c21353k = (C21353k) obj;
        return AbstractC22676k.m65745e(this.f81676a, c21353k.f81676a) && AbstractC22676k.m65745e(this.f81677b, c21353k.f81677b) && AbstractC22676k.m65745e(this.f81678c, c21353k.f81678c) && AbstractC22676k.m65745e(this.f81679d, c21353k.f81679d);
    }

    public final int hashCode() {
        int iHashCode = (this.f81678c.hashCode() + AbstractC3855a.m11821e(this.f81677b, this.f81676a.hashCode() * 31, 31)) * 31;
        Comparator comparator = this.f81679d;
        return iHashCode + (comparator == null ? 0 : comparator.hashCode());
    }

    public final String toString() {
        return "SortInputs(participants=" + this.f81676a + ", pins=" + this.f81677b + ", preset=" + this.f81678c + ", custom=" + this.f81679d + ")";
    }
}
