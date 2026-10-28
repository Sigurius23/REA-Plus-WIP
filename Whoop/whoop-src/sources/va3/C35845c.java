package va3;

import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: va3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C35845c {

    /* JADX INFO: renamed from: a */
    public final C35847e f152609a;

    /* JADX INFO: renamed from: b */
    public final C35847e f152610b;

    /* JADX INFO: renamed from: c */
    public final boolean f152611c;

    public C35845c(C35847e packageFqName, C35847e relativeClassName, boolean z4) {
        AbstractC22676k.m65750j(packageFqName, "packageFqName");
        AbstractC22676k.m65750j(relativeClassName, "relativeClassName");
        this.f152609a = packageFqName;
        this.f152610b = relativeClassName;
        this.f152611c = z4;
        relativeClassName.f152613a.m113793c();
    }

    /* JADX INFO: renamed from: c */
    public static final String m113772c(C35847e c35847e) {
        String str = c35847e.f152613a.f152616a;
        return AbstractC39414r.m125875T(str, '/', false) ? AbstractC31061c.m95633i('`', "`", str) : str;
    }

    /* JADX INFO: renamed from: a */
    public final C35847e m113773a() {
        C35847e c35847e = this.f152609a;
        boolean zM113793c = c35847e.f152613a.m113793c();
        C35847e c35847e2 = this.f152610b;
        if (zM113793c) {
            return c35847e2;
        }
        return new C35847e(c35847e.f152613a.f152616a + '.' + c35847e2.f152613a.f152616a);
    }

    /* JADX INFO: renamed from: b */
    public final String m113774b() {
        C35847e c35847e = this.f152609a;
        boolean zM113793c = c35847e.f152613a.m113793c();
        C35847e c35847e2 = this.f152610b;
        if (zM113793c) {
            return m113772c(c35847e2);
        }
        return AbstractC39421y.m125927L(c35847e.f152613a.f152616a, '.', '/') + "/" + m113772c(c35847e2);
    }

    /* JADX INFO: renamed from: d */
    public final C35845c m113775d(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        return new C35845c(this.f152609a, this.f152610b.m113788a(name), this.f152611c);
    }

    /* JADX INFO: renamed from: e */
    public final C35845c m113776e() {
        C35847e c35847eM113789b = this.f152610b.m113789b();
        if (c35847eM113789b.f152613a.m113793c()) {
            return null;
        }
        return new C35845c(this.f152609a, c35847eM113789b, this.f152611c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35845c)) {
            return false;
        }
        C35845c c35845c = (C35845c) obj;
        return AbstractC22676k.m65745e(this.f152609a, c35845c.f152609a) && AbstractC22676k.m65745e(this.f152610b, c35845c.f152610b) && this.f152611c == c35845c.f152611c;
    }

    /* JADX INFO: renamed from: f */
    public final C35850h m113777f() {
        return this.f152610b.f152613a.m113796g();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m113778g() {
        return !this.f152610b.m113789b().f152613a.m113793c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152611c) + ((this.f152610b.hashCode() + (this.f152609a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        if (!this.f152609a.f152613a.m113793c()) {
            return m113774b();
        }
        return "/" + m113774b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35845c(C35847e packageFqName, C35850h topLevelName) {
        this(packageFqName, AbstractC35846d.m113785j(topLevelName), false);
        AbstractC22676k.m65750j(packageFqName, "packageFqName");
        AbstractC22676k.m65750j(topLevelName, "topLevelName");
        C35847e c35847e = C35847e.f152612c;
    }
}
