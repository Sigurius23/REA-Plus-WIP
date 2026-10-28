package q93;

import ce3.C4515p;
import j93.InterfaceC21493z;
import java.util.Collection;
import kb3.C22340i;
import kb3.C22342k;
import m83.C25235a0;
import o93.AbstractC27741m;
import o93.AbstractC27742n;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import pf.AbstractC29125c;
import r93.InterfaceC31117e;
import t93.InterfaceC33667c;
import u93.C34673e0;
import u93.C34686l;
import va3.C35845c;
import va3.C35847e;
import va3.C35848f;
import va3.C35850h;

/* JADX INFO: renamed from: q93.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C30083g implements InterfaceC33667c {

    /* JADX INFO: renamed from: g */
    public static final C35850h f122778g;

    /* JADX INFO: renamed from: h */
    public static final C35845c f122779h;

    /* JADX INFO: renamed from: a */
    public final C34673e0 f122780a;

    /* JADX INFO: renamed from: b */
    public final Function1 f122781b = C30082f.f122774w;

    /* JADX INFO: renamed from: c */
    public final C22340i f122782c;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC21493z[] f122776e = {AbstractC22671h0.f89337a.property1(new C22693x(C30083g.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    /* JADX INFO: renamed from: d */
    public static final C30081e f122775d = new C30081e();

    /* JADX INFO: renamed from: f */
    public static final C35847e f122777f = AbstractC27742n.f111886k;

    static {
        C35848f c35848f = AbstractC27741m.f111847c;
        f122778g = c35848f.m113796g();
        C35847e c35847eM113798i = c35848f.m113798i();
        f122779h = new C35845c(c35847eM113798i.m113789b(), c35847eM113798i.f152613a.m113796g());
    }

    public C30083g(C22342k c22342k, C34673e0 c34673e0) {
        this.f122780a = c34673e0;
        this.f122782c = new C22340i(c22342k, new C4515p(this, c22342k, false, 5));
    }

    @Override // t93.InterfaceC33667c
    /* JADX INFO: renamed from: a */
    public final Collection mo88259a(C35847e packageFqName) {
        AbstractC22676k.m65750j(packageFqName, "packageFqName");
        if (!packageFqName.equals(f122777f)) {
            return C25235a0.f99113w;
        }
        return AbstractC12350b.m34570S((C34686l) AbstractC29125c.m88494C(this.f122782c, f122776e[0]));
    }

    @Override // t93.InterfaceC33667c
    /* JADX INFO: renamed from: b */
    public final boolean mo88260b(C35847e packageFqName, C35850h name) {
        AbstractC22676k.m65750j(packageFqName, "packageFqName");
        AbstractC22676k.m65750j(name, "name");
        return name.equals(f122778g) && packageFqName.equals(f122777f);
    }

    @Override // t93.InterfaceC33667c
    /* JADX INFO: renamed from: c */
    public final InterfaceC31117e mo88261c(C35845c classId) {
        AbstractC22676k.m65750j(classId, "classId");
        if (!classId.equals(f122779h)) {
            return null;
        }
        return (C34686l) AbstractC29125c.m88494C(this.f122782c, f122776e[0]);
    }
}
