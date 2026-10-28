package p173gj;

import android.app.Application;
import android.content.Context;
import dk.AbstractC12098d;
import ih0.AbstractC18489d0;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import m83.AbstractC25265s;
import p005a3.C0227m1;
import p037bu.C3632c;
import p223ik.InterfaceC18599c;
import p249jc.C21565a;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gj.g */
/* JADX INFO: loaded from: classes.dex */
public final class C15906g {

    /* JADX INFO: renamed from: a */
    public final String f60152a;

    /* JADX INFO: renamed from: b */
    public final Context f60153b;

    /* JADX INFO: renamed from: c */
    public final int f60154c;

    /* JADX INFO: renamed from: d */
    public final int f60155d;

    /* JADX INFO: renamed from: e */
    public final String f60156e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC18599c f60157f;

    /* JADX INFO: renamed from: g */
    public final C3632c f60158g;

    /* JADX INFO: renamed from: h */
    public final int f60159h;

    /* JADX INFO: renamed from: i */
    public final C15913n f60160i;

    /* JADX INFO: renamed from: j */
    public final boolean f60161j;

    /* JADX INFO: renamed from: k */
    public final long f60162k;

    /* JADX INFO: renamed from: l */
    public final long f60163l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC18599c f60164m;

    /* JADX INFO: renamed from: n */
    public final C21565a f60165n;

    /* JADX INFO: renamed from: o */
    public final boolean f60166o;

    /* JADX INFO: renamed from: p */
    public Boolean f60167p;

    /* JADX INFO: renamed from: q */
    public File f60168q;

    /* JADX INFO: renamed from: r */
    public Set f60169r;

    /* JADX INFO: renamed from: s */
    public final int f60170s;

    public C15906g(Application context, Set set) {
        C3632c c3632c = new C3632c(9);
        C15913n c15913n = new C15913n();
        c15913n.f60200a = new HashSet();
        Boolean bool = Boolean.FALSE;
        AbstractC22676k.m65750j(context, "context");
        AbstractC18489d0.m53382w(1, "serverZone");
        AbstractC18489d0.m53382w(1, "serverZone");
        this.f60152a = "4483d4bb0e3f071613d0cc2546aacc65";
        this.f60153b = context;
        this.f60154c = 30;
        this.f60155d = 30000;
        this.f60156e = "$default_instance";
        this.f60157f = AbstractC12098d.f40282a;
        this.f60158g = c3632c;
        this.f60159h = 5;
        this.f60170s = 1;
        this.f60160i = c15913n;
        this.f60161j = true;
        this.f60162k = 300000L;
        this.f60163l = 30000L;
        this.f60164m = AbstractC12098d.f40284c;
        this.f60165n = AbstractC12098d.f40283b;
        this.f60166o = true;
        this.f60167p = bool;
        this.f60169r = AbstractC25265s.m74101H1(set);
        new C15907h(true, false, false, false).f60175e.add(new C0227m1(this, 13));
    }

    /* JADX INFO: renamed from: a */
    public final File m44888a() {
        if (this.f60168q == null) {
            Context context = this.f60153b;
            File dir = context.getDir("amplitude", 0);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(context.getPackageName());
            sb4.append('/');
            File file = new File(dir, AbstractC25012a.m73376i(this.f60156e, "/analytics/", sb4));
            this.f60168q = file;
            file.mkdirs();
        }
        File file2 = this.f60168q;
        AbstractC22676k.m65747g(file2);
        return file2;
    }
}
