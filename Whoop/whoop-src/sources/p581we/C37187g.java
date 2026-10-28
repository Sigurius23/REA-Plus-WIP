package p581we;

import p499t9.C33647p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.C34913b;
import ve.C35920e;
import wd3.C37168b;

/* JADX INFO: renamed from: we.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C37187g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f159002a;

    /* JADX INFO: renamed from: b */
    public String f159003b;

    /* JADX INFO: renamed from: c */
    public String f159004c;

    /* JADX INFO: renamed from: d */
    public C34913b f159005d;

    /* JADX INFO: renamed from: e */
    public Function1 f159006e;

    /* JADX INFO: renamed from: f */
    public EnumC37183e f159007f;

    /* JADX INFO: renamed from: g */
    public EnumC37179c f159008g;

    /* JADX INFO: renamed from: h */
    public boolean f159009h;

    /* JADX INFO: renamed from: i */
    public boolean f159010i;

    /* JADX INFO: renamed from: j */
    public boolean f159011j;

    /* JADX INFO: renamed from: k */
    public AbstractC37178b0 f159012k;

    /* JADX INFO: renamed from: l */
    public EnumC37181d f159013l;

    /* JADX INFO: renamed from: m */
    public C35920e f159014m;

    /* JADX INFO: renamed from: n */
    public boolean f159015n;

    public C37187g(C37187g c37187g) {
        this.f159002a = 1;
        String str = c37187g.f159003b;
        if (str == null) {
            throw new IllegalArgumentException("Signing config must specify a region");
        }
        this.f159003b = str;
        String str2 = c37187g.f159004c;
        if (str2 == null) {
            throw new IllegalArgumentException("Signing config must specify a service");
        }
        this.f159004c = str2;
        C34913b c34913bM106274t = c37187g.f159005d;
        if (c34913bM106274t == null) {
            C33647p c33647p = C34913b.f147015x;
            c34913bM106274t = C33647p.m106274t();
        }
        this.f159005d = c34913bM106274t;
        this.f159006e = c37187g.f159006e;
        this.f159007f = c37187g.f159007f;
        this.f159008g = c37187g.f159008g;
        this.f159009h = c37187g.f159009h;
        this.f159010i = c37187g.f159010i;
        this.f159011j = c37187g.f159011j;
        AbstractC37178b0 abstractC37178b0 = c37187g.f159012k;
        this.f159012k = abstractC37178b0 == null ? C37206v.f159056a : abstractC37178b0;
        this.f159013l = c37187g.f159013l;
        C35920e c35920e = c37187g.f159014m;
        if (c35920e == null) {
            throw new IllegalArgumentException("Signing config must specify credentials");
        }
        this.f159014m = c35920e;
        this.f159015n = c37187g.f159015n;
    }

    /* JADX INFO: renamed from: a */
    public C37187g m119161a() {
        return new C37187g(this);
    }

    /* JADX INFO: renamed from: b */
    public final EnumC37183e m119162b() {
        switch (this.f159002a) {
            case 0:
                break;
        }
        return this.f159007f;
    }

    /* JADX INFO: renamed from: c */
    public C35920e m119163c() {
        return this.f159014m;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC37178b0 m119164d() {
        return this.f159012k;
    }

    /* JADX INFO: renamed from: e */
    public boolean m119165e() {
        return this.f159015n;
    }

    /* JADX INFO: renamed from: f */
    public boolean m119166f() {
        return this.f159011j;
    }

    /* JADX INFO: renamed from: g */
    public String m119167g() {
        return this.f159003b;
    }

    /* JADX INFO: renamed from: h */
    public EnumC37179c m119168h() {
        return this.f159008g;
    }

    /* JADX INFO: renamed from: i */
    public EnumC37181d m119169i() {
        return this.f159013l;
    }

    /* JADX INFO: renamed from: j */
    public C34913b m119170j() {
        return this.f159005d;
    }

    /* JADX INFO: renamed from: k */
    public void m119171k(EnumC37183e enumC37183e) {
        AbstractC22676k.m65750j(enumC37183e, "<set-?>");
        this.f159007f = enumC37183e;
    }

    /* JADX INFO: renamed from: l */
    public void m119172l(C35920e c35920e) {
        this.f159014m = c35920e;
    }

    /* JADX INFO: renamed from: m */
    public void m119173m(AbstractC37178b0 abstractC37178b0) {
        this.f159012k = abstractC37178b0;
    }

    /* JADX INFO: renamed from: n */
    public void m119174n(boolean z4) {
        this.f159015n = z4;
    }

    /* JADX INFO: renamed from: o */
    public void m119175o(boolean z4) {
        this.f159010i = z4;
    }

    /* JADX INFO: renamed from: p */
    public void m119176p(boolean z4) {
        this.f159011j = z4;
    }

    /* JADX INFO: renamed from: q */
    public void m119177q(String str) {
        this.f159003b = str;
    }

    /* JADX INFO: renamed from: r */
    public void m119178r(String str) {
        this.f159004c = str;
    }

    /* JADX INFO: renamed from: s */
    public void m119179s(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.f159006e = function1;
    }

    /* JADX INFO: renamed from: t */
    public void m119180t(EnumC37179c enumC37179c) {
        AbstractC22676k.m65750j(enumC37179c, "<set-?>");
        this.f159008g = enumC37179c;
    }

    /* JADX INFO: renamed from: u */
    public void m119181u(EnumC37181d enumC37181d) {
        AbstractC22676k.m65750j(enumC37181d, "<set-?>");
        this.f159013l = enumC37181d;
    }

    /* JADX INFO: renamed from: v */
    public void m119182v(C34913b c34913b) {
        this.f159005d = c34913b;
    }

    /* JADX INFO: renamed from: w */
    public void m119183w(boolean z4) {
        this.f159009h = z4;
    }

    /* JADX INFO: renamed from: x */
    public C37187g m119184x() {
        C37187g c37187g = new C37187g();
        c37187g.f159003b = this.f159003b;
        c37187g.f159004c = this.f159004c;
        c37187g.f159005d = this.f159005d;
        c37187g.m119179s(this.f159006e);
        c37187g.m119171k(this.f159007f);
        c37187g.m119180t(this.f159008g);
        c37187g.f159009h = this.f159009h;
        c37187g.f159010i = this.f159010i;
        c37187g.f159011j = this.f159011j;
        c37187g.f159012k = this.f159012k;
        c37187g.m119181u(this.f159013l);
        c37187g.f159014m = this.f159014m;
        c37187g.f159015n = this.f159015n;
        return c37187g;
    }

    public C37187g() {
        this.f159002a = 0;
        this.f159006e = new C37168b(1);
        this.f159007f = EnumC37183e.SIGV4;
        this.f159008g = EnumC37179c.f158974w;
        this.f159009h = true;
        this.f159010i = true;
        this.f159013l = EnumC37181d.f158979w;
    }
}
