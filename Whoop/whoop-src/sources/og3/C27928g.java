package og3;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import jg3.C21676c;
import jg3.C21678e;
import jg3.C21689p;

/* JADX INFO: renamed from: og3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C27928g extends AbstractC27929h implements Serializable {

    /* JADX INFO: renamed from: w */
    public final C21689p f112646w;

    public C27928g(C21689p c21689p) {
        this.f112646w = c21689p;
    }

    @Override // og3.AbstractC27929h
    /* JADX INFO: renamed from: a */
    public final C21689p mo84265a(C21676c c21676c) {
        return this.f112646w;
    }

    @Override // og3.AbstractC27929h
    /* JADX INFO: renamed from: b */
    public final C27926e mo84266b(C21678e c21678e) {
        return null;
    }

    @Override // og3.AbstractC27929h
    /* JADX INFO: renamed from: c */
    public final List mo84267c(C21678e c21678e) {
        return Collections.singletonList(this.f112646w);
    }

    @Override // og3.AbstractC27929h
    /* JADX INFO: renamed from: d */
    public final boolean mo84268d(C21678e c21678e, C21689p c21689p) {
        return this.f112646w.equals(c21689p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z4 = obj instanceof C27928g;
        C21689p c21689p = this.f112646w;
        if (z4) {
            return c21689p.equals(((C27928g) obj).f112646w);
        }
        if (obj instanceof C27923b) {
            C27923b c27923b = (C27923b) obj;
            if (c27923b.m84271g() && c21689p.equals(c27923b.mo84265a(C21676c.f83234H))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.f112646w.f83282x;
        return ((i13 + 31) ^ (i13 + 31)) ^ 1;
    }

    public final String toString() {
        return "FixedRules:" + this.f112646w;
    }
}
