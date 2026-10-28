package qc3;

import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import sc3.AbstractC32395i;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: qc3.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C30266q extends AbstractC32395i {

    /* JADX INFO: renamed from: d */
    public static final List f123809d = AbstractC37056f.m118959K(0, 0, 0, 0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: b */
    public final int f123810b;

    /* JADX INFO: renamed from: c */
    public final int f123811c;

    static {
        AbstractC37056f.m118959K(2, 1, 0, 2, 1, 0, 2, 1, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C30266q() {
        List zerosToAdd = f123809d;
        AbstractC22676k.m65750j(zerosToAdd, "zerosToAdd");
        super(AbstractC30281x0.f123841d, zerosToAdd);
        this.f123810b = 1;
        this.f123811c = 9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C30266q)) {
            return false;
        }
        C30266q c30266q = (C30266q) obj;
        return this.f123810b == c30266q.f123810b && this.f123811c == c30266q.f123811c;
    }

    public final int hashCode() {
        return (this.f123810b * 31) + this.f123811c;
    }
}
