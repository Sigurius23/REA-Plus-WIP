package p114eb;

import android.os.Bundle;
import java.io.Serializable;
import m83.AbstractC25260n;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C12952e1 extends AbstractC12958g1 {

    /* JADX INFO: renamed from: r */
    public final Class f44730r;

    public C12952e1(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        try {
            this.f44730r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: a */
    public final Object mo36411a(Bundle bundle, String str) {
        return (Serializable[]) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: b */
    public final String mo36412b() {
        return this.f44730r.getName();
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: d */
    public final Object mo36417g(String value) {
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: e */
    public final void mo36414e(Bundle bundle, String key, Object obj) {
        ?? r10 = (Serializable[]) obj;
        AbstractC22676k.m65750j(key, "key");
        this.f44730r.cast(r10);
        bundle.putSerializable(key, r10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C12952e1.class.equals(obj.getClass())) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f44730r, ((C12952e1) obj).f44730r);
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: f */
    public final boolean mo36422f(Object obj, Object obj2) {
        return AbstractC25260n.m74058b0((Serializable[]) obj, (Serializable[]) obj2);
    }

    public final int hashCode() {
        return this.f44730r.hashCode();
    }
}
