package p114eb;

import android.os.Bundle;
import android.os.Parcelable;
import m83.AbstractC25260n;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C12946c1 extends AbstractC12958g1 {

    /* JADX INFO: renamed from: r */
    public final Class f44722r;

    public C12946c1(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.f44722r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: a */
    public final Object mo36411a(Bundle bundle, String str) {
        return (Parcelable[]) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: b */
    public final String mo36412b() {
        return this.f44722r.getName();
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: d */
    public final Object mo36417g(String value) {
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: e */
    public final void mo36414e(Bundle bundle, String key, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        AbstractC22676k.m65750j(key, "key");
        this.f44722r.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C12946c1.class.equals(obj.getClass())) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f44722r, ((C12946c1) obj).f44722r);
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: f */
    public final boolean mo36422f(Object obj, Object obj2) {
        return AbstractC25260n.m74058b0((Parcelable[]) obj, (Parcelable[]) obj2);
    }

    public final int hashCode() {
        return this.f44722r.hashCode();
    }
}
