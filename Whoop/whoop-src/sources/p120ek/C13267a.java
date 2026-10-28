package p120ek;

import d13.AbstractC11478a;
import ih0.AbstractC18489d0;
import java.lang.ref.WeakReference;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: ek.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13267a {

    /* JADX INFO: renamed from: a */
    public final WeakReference f45947a;

    /* JADX INFO: renamed from: b */
    public final int f45948b;

    public C13267a(WeakReference weakReference, int i13) {
        AbstractC18489d0.m53382w(i13, "type");
        this.f45947a = weakReference;
        this.f45948b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13267a)) {
            return false;
        }
        C13267a c13267a = (C13267a) obj;
        return this.f45947a.equals(c13267a.f45947a) && this.f45948b == c13267a.f45948b;
    }

    public final int hashCode() {
        return AbstractC12682p.m35485e(this.f45948b) + (this.f45947a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivityCallbackEvent(activity=" + this.f45947a + ", type=" + AbstractC11478a.m30848B(this.f45948b) + ')';
    }
}
