package p282kk;

import ih0.AbstractC18489d0;
import jh3.AbstractC21702c;
import p108e4.AbstractC12682p;
import p255jk.C21743a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kk.f */
/* JADX INFO: loaded from: classes.dex */
public final class C22537f {

    /* JADX INFO: renamed from: a */
    public final int f88577a;

    /* JADX INFO: renamed from: b */
    public final C21743a f88578b;

    public C22537f(int i13, C21743a c21743a) {
        AbstractC18489d0.m53382w(i13, "type");
        this.f88577a = i13;
        this.f88578b = c21743a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22537f)) {
            return false;
        }
        C22537f c22537f = (C22537f) obj;
        return this.f88577a == c22537f.f88577a && AbstractC22676k.m65745e(this.f88578b, c22537f.f88578b);
    }

    public final int hashCode() {
        int iM35485e = AbstractC12682p.m35485e(this.f88577a) * 31;
        C21743a c21743a = this.f88578b;
        return iM35485e + (c21743a == null ? 0 : c21743a.hashCode());
    }

    public final String toString() {
        return "WriteQueueMessage(type=" + AbstractC21702c.m61128A(this.f88577a) + ", event=" + this.f88578b + ')';
    }
}
