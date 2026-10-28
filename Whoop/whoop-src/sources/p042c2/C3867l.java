package p042c2;

import java.util.List;
import p181h2.C16618c;
import p209i3.AbstractC18032n;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c2.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C3867l {

    /* JADX INFO: renamed from: a */
    public final List f15800a;

    /* JADX INFO: renamed from: c */
    public final Function1 f15802c;

    /* JADX INFO: renamed from: b */
    public C16618c f15801b = null;

    /* JADX INFO: renamed from: d */
    public final int f15803d = AbstractC18032n.f69984a.addAndGet(1);

    public C3867l(List list, Function1 function1) {
        this.f15800a = list;
        this.f15802c = function1;
    }

    /* JADX INFO: renamed from: a */
    public final C16618c m11852a() {
        return this.f15801b;
    }

    /* JADX INFO: renamed from: b */
    public final int m11853b() {
        return this.f15803d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3867l)) {
            return false;
        }
        C3867l c3867l = (C3867l) obj;
        return AbstractC22676k.m65745e(this.f15800a, c3867l.f15800a) && AbstractC22676k.m65745e(this.f15801b, c3867l.f15801b) && this.f15802c == c3867l.f15802c;
    }

    public final int hashCode() {
        int iHashCode = this.f15800a.hashCode() * 31;
        C16618c c16618c = this.f15801b;
        int iHashCode2 = (iHashCode + (c16618c != null ? c16618c.hashCode() : 0)) * 31;
        Function1 function1 = this.f15802c;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }
}
