package e63;

import androidx.room.AbstractC1772c1;
import bc3.AbstractC3006f0;
import bc3.C3004e2;
import g63.C15539c;
import i63.C18160b0;
import i63.C18175n;
import i63.C18181t;
import i63.C18185x;
import i63.C18187z;
import java.util.List;
import m83.AbstractC25265s;
import o63.C27610a;
import o63.C27615f;
import p014aj.C0928c;
import p715kotlin.jvm.internal.AbstractC22676k;
import s63.C32236a;

/* JADX INFO: renamed from: e63.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C12775d {

    /* JADX INFO: renamed from: a */
    public final C18187z f43709a = new C18187z();

    /* JADX INFO: renamed from: b */
    public C18181t f43710b = C18181t.f70508b;

    /* JADX INFO: renamed from: c */
    public final C18175n f43711c = new C18175n(3);

    /* JADX INFO: renamed from: d */
    public Object f43712d = C15539c.f58268a;

    /* JADX INFO: renamed from: e */
    public C3004e2 f43713e = AbstractC3006f0.m8710d();

    /* JADX INFO: renamed from: f */
    public final C27615f f43714f = new C27615f();

    /* JADX INFO: renamed from: a */
    public final void m35804a(C32236a c32236a) {
        C27615f c27615f = this.f43714f;
        if (c32236a != null) {
            c27615f.m83377e(AbstractC12779h.f43741a, c32236a);
            return;
        }
        C27610a key = AbstractC12779h.f43741a;
        c27615f.getClass();
        AbstractC22676k.m65750j(key, "key");
        c27615f.m83375c().remove(key);
    }

    /* JADX INFO: renamed from: b */
    public final void m35805b(C12775d builder) {
        AbstractC22676k.m65750j(builder, "builder");
        this.f43713e = builder.f43713e;
        this.f43710b = builder.f43710b;
        this.f43712d = builder.f43712d;
        C27615f other = builder.f43714f;
        m35804a((C32236a) other.m83376d(AbstractC12779h.f43741a));
        C18187z url = builder.f43709a;
        C18187z c18187z = this.f43709a;
        AbstractC22676k.m65750j(c18187z, "<this>");
        AbstractC22676k.m65750j(url, "url");
        C18160b0 c18160b0 = url.f70534a;
        AbstractC22676k.m65750j(c18160b0, "<set-?>");
        c18187z.f70534a = c18160b0;
        String str = url.f70535b;
        AbstractC22676k.m65750j(str, "<set-?>");
        c18187z.f70535b = str;
        c18187z.f70536c = url.f70536c;
        List list = url.f70541h;
        AbstractC22676k.m65750j(list, "<set-?>");
        c18187z.f70541h = list;
        c18187z.f70538e = url.f70538e;
        c18187z.f70539f = url.f70539f;
        C18185x c18185x = new C18185x(3);
        AbstractC1772c1.m5390g(c18185x, url.f70542i);
        c18187z.f70542i = c18185x;
        c18187z.f70543j = new C0928c(c18185x, 13);
        String str2 = url.f70540g;
        AbstractC22676k.m65750j(str2, "<set-?>");
        c18187z.f70540g = str2;
        c18187z.f70537d = url.f70537d;
        List list2 = c18187z.f70541h;
        AbstractC22676k.m65750j(list2, "<set-?>");
        c18187z.f70541h = list2;
        AbstractC1772c1.m5390g(this.f43711c, builder.f43711c);
        C27615f c27615f = this.f43714f;
        AbstractC22676k.m65750j(c27615f, "<this>");
        AbstractC22676k.m65750j(other, "other");
        for (C27610a c27610a : AbstractC25265s.m74093D1(other.m83375c().keySet())) {
            AbstractC22676k.m65748h(c27610a, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            c27615f.m83377e(c27610a, other.m83374b(c27610a));
        }
    }
}
