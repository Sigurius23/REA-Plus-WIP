package zo0;

import ep0.InterfaceC13399e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import ro0.InterfaceC31628b;

/* JADX INFO: renamed from: zo0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lzo0/h;", "", "<init>", "()V", "Lro0/b;", "domainResult", "Lep0/e;", "a", "(Lro0/b;)Lep0/e;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40920h {
    /* JADX INFO: renamed from: a */
    public final InterfaceC13399e m132715a(InterfaceC31628b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof InterfaceC31628b.c) {
            return InterfaceC13399e.c.f46940a;
        }
        if (domainResult instanceof InterfaceC31628b.f) {
            InterfaceC31628b.f fVar = (InterfaceC31628b.f) domainResult;
            return new InterfaceC13399e.e(fVar.getOnLoadStyle(), fVar.getLoadStyle());
        }
        if (domainResult instanceof InterfaceC31628b.a) {
            return InterfaceC13399e.d.f46941a;
        }
        if (domainResult instanceof InterfaceC31628b.b) {
            return InterfaceC13399e.b.f46939a;
        }
        if (!(domainResult instanceof InterfaceC31628b.d) && !(domainResult instanceof InterfaceC31628b.e)) {
            throw new NoWhenBranchMatchedException();
        }
        return InterfaceC13399e.d.f46941a;
    }
}
