package p218ic;

import java.util.List;
import p249jc.C21589o;
import p249jc.C21596v;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ic.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18377p0 {
    /* JADX INFO: renamed from: a */
    public final C21589o m52872a(String str, C18347a0 request) {
        EnumC18368l enumC18368l = EnumC18368l.f71503w;
        AbstractC22676k.m65750j(request, "request");
        List listM118958J = AbstractC37056f.m118958J(request);
        C21596v c21596v = (C21596v) this;
        if (listM118958J.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new C21589o(c21596v, str, enumC18368l, listM118958J, 0);
    }

    /* JADX INFO: renamed from: b */
    public abstract C18357f0 mo52873b(String str);

    /* JADX INFO: renamed from: c */
    public final InterfaceC18355e0 m52874c(AbstractC18381r0 request) {
        AbstractC22676k.m65750j(request, "request");
        List listM118958J = AbstractC37056f.m118958J(request);
        C21596v c21596v = (C21596v) this;
        if (listM118958J.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new C21589o(c21596v, null, EnumC18368l.f71504x, listM118958J, 0).m60634U();
    }

    /* JADX INFO: renamed from: d */
    public abstract InterfaceC18355e0 mo52875d(String str, EnumC18366k enumC18366k, C18367k0 c18367k0);

    /* JADX INFO: renamed from: e */
    public final InterfaceC18355e0 m52876e(String uniqueWorkName, EnumC18368l enumC18368l, C18347a0 request) {
        AbstractC22676k.m65750j(uniqueWorkName, "uniqueWorkName");
        AbstractC22676k.m65750j(request, "request");
        return new C21589o((C21596v) this, uniqueWorkName, enumC18368l, AbstractC37056f.m118958J(request), 0).m60634U();
    }
}
