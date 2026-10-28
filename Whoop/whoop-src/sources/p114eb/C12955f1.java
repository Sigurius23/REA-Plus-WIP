package p114eb;

import android.os.Bundle;
import java.io.Serializable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.f1 */
/* JADX INFO: loaded from: classes.dex */
public class C12955f1 extends AbstractC12958g1 {

    /* JADX INFO: renamed from: r */
    public final Class f44751r;

    public C12955f1(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (!cls.isEnum()) {
            this.f44751r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: a */
    public final Object mo36411a(Bundle bundle, String str) {
        return (Serializable) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: b */
    public String mo36412b() {
        return this.f44751r.getName();
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: e */
    public final void mo36414e(Bundle bundle, String key, Object obj) {
        Serializable value = (Serializable) obj;
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        this.f44751r.cast(value);
        bundle.putSerializable(key, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12955f1)) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f44751r, ((C12955f1) obj).f44751r);
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: g */
    public Serializable mo36417g(String value) {
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f44751r.hashCode();
    }

    public C12955f1(int i13, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f44751r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
