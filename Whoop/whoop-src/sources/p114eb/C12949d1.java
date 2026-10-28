package p114eb;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C12949d1 extends AbstractC12958g1 {

    /* JADX INFO: renamed from: r */
    public final Class f44727r;

    public C12949d1(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f44727r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: a */
    public final Object mo36411a(Bundle bundle, String str) {
        return AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: b */
    public final String mo36412b() {
        return this.f44727r.getName();
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: d */
    public final Object mo36417g(String value) {
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: e */
    public final void mo36414e(Bundle bundle, String key, Object obj) {
        AbstractC22676k.m65750j(key, "key");
        this.f44727r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(key, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(key, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C12949d1.class.equals(obj.getClass())) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f44727r, ((C12949d1) obj).f44727r);
    }

    public final int hashCode() {
        return this.f44727r.hashCode();
    }
}
