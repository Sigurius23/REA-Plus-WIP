package q93;

import cb3.AbstractC4393e;
import o93.AbstractC27736h;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31117e;
import va3.C35845c;
import va3.C35847e;
import va3.C35848f;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: q93.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C30081e {
    /* JADX INFO: renamed from: a */
    public static InterfaceC31117e m92213a(InterfaceC31117e interfaceC31117e) {
        C35848f c35848fM125524f = AbstractC39363f.m125524f(interfaceC31117e);
        String str = C30080d.f122759a;
        C35847e c35847eM92212h = C30080d.m92212h(c35848fM125524f);
        if (c35847eM92212h != null) {
            return AbstractC4393e.m13807e(interfaceC31117e).m83822j(c35847eM92212h);
        }
        throw new IllegalArgumentException("Given class " + interfaceC31117e + " is not a read-only collection");
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC31117e m92214b(C35847e c35847e, AbstractC27736h builtIns) {
        AbstractC22676k.m65750j(builtIns, "builtIns");
        String str = C30080d.f122759a;
        C35845c c35845c = (C35845c) C30080d.f122766h.get(c35847e.f152613a);
        if (c35845c != null) {
            return builtIns.m83822j(c35845c.m113773a());
        }
        return null;
    }
}
