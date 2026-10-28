package hb3;

import ab3.AbstractC0715g;
import c93.InterfaceC4339a;
import jb3.C21559s;
import lb3.AbstractC23811y;
import p035bp.AbstractC3511b;
import p048ce.C4472m;
import p048ce.C4484y;
import p048ce.C4485z;
import p048ce.InterfaceC4461b0;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import qa3.C30146k0;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: hb3.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C17134w implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65799w;

    /* JADX INFO: renamed from: x */
    public final Object f65800x;

    /* JADX INFO: renamed from: y */
    public final Object f65801y;

    /* JADX INFO: renamed from: z */
    public final Object f65802z;

    public /* synthetic */ C17134w(Object obj, Object obj2, Object obj3, int i13) {
        this.f65799w = i13;
        this.f65800x = obj;
        this.f65801y = obj2;
        this.f65802z = obj3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f65799w) {
            case 0:
                C17135x c17135x = (C17135x) this.f65800x;
                C30146k0 c30146k0 = (C30146k0) this.f65801y;
                C21559s c21559s = (C21559s) this.f65802z;
                C17122k c17122k = c17135x.f65803a;
                AbstractC17104a0 abstractC17104a0M48373a = c17135x.m48373a(c17122k.f65762c);
                AbstractC22676k.m65747g(abstractC17104a0M48373a);
                InterfaceC17103a interfaceC17103a = c17122k.f65760a.f65739e;
                AbstractC23811y returnType = c21559s.getReturnType();
                AbstractC22676k.m65749i(returnType, "getReturnType(...)");
                return (AbstractC0715g) interfaceC17103a.mo16016t(abstractC17104a0M48373a, c30146k0, returnType);
            case 1:
                C17135x c17135x2 = (C17135x) this.f65800x;
                C30146k0 c30146k1 = (C30146k0) this.f65801y;
                C21559s c21559s2 = (C21559s) this.f65802z;
                C17122k c17122k2 = c17135x2.f65803a;
                AbstractC17104a0 abstractC17104a0M48373a2 = c17135x2.m48373a(c17122k2.f65762c);
                AbstractC22676k.m65747g(abstractC17104a0M48373a2);
                InterfaceC17103a interfaceC17103a2 = c17122k2.f65760a.f65739e;
                AbstractC23811y returnType2 = c21559s2.getReturnType();
                AbstractC22676k.m65749i(returnType2, "getReturnType(...)");
                return (AbstractC0715g) interfaceC17103a2.mo16020z(abstractC17104a0M48373a2, c30146k1, returnType2);
            default:
                StringBuilder sb4 = new StringBuilder("'");
                sb4.append(((C4484y) ((InterfaceC4461b0) this.f65801y)).f18024a);
                sb4.append("' defined multiple times in ");
                C22669g0 c22669g0 = (C22669g0) this.f65802z;
                sb4.append(AbstractC37978j.m121653n((C4485z) c22669g0.f89336w));
                sb4.append(" '");
                return AbstractC3511b.m10386o(Integer.valueOf(((C4472m) this.f65800x).f18002a), AbstractC25012a.m73377j(sb4, ((C4485z) c22669g0.f89336w).f18026a, '\''));
        }
    }
}
