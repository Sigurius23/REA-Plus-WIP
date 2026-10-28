package gf;

import java.util.Locale;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gf.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C15767h {

    /* JADX INFO: renamed from: a */
    public final String f59431a;

    /* JADX INFO: renamed from: b */
    public final String f59432b;

    public C15767h(String original) {
        AbstractC22676k.m65750j(original, "original");
        this.f59431a = original;
        String lowerCase = original.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        this.f59432b = lowerCase;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15767h) {
            return AbstractC22676k.m65745e(this.f59432b, ((C15767h) obj).f59432b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f59432b.hashCode();
    }

    public final String toString() {
        return this.f59431a;
    }
}
