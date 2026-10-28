package gt2;

import ct2.AbstractC11110b;
import ht2.C17629a;
import ht2.EnumC17636h;
import jb1.C21535a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: gt2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lgt2/d;", "", "<init>", "()V", "Lct2/b;", "domainResult", "Lgt2/c;", "a", "(Lct2/b;)Lgt2/c;", "Ljb1/a;", "Ljb1/a;", "getReducer", "()Ljb1/a;", "reducer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16206d {

    /* JADX INFO: renamed from: b */
    public static final int f61546b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer = AbstractC16203a.m45867e();

    /* JADX INFO: renamed from: a */
    public final AbstractC16205c m45878a(AbstractC11110b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof AbstractC11110b.b) {
            return AbstractC16205c.b.f61543b;
        }
        if (domainResult instanceof AbstractC11110b.a) {
            return new AbstractC16205c.a(((AbstractC11110b.a) domainResult).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
        }
        if (!(domainResult instanceof AbstractC11110b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC25312u interfaceC25312uM60541h = this.reducer.m60541h(((AbstractC11110b.c) domainResult).getResult().getTile());
        if (interfaceC25312uM60541h instanceof C17629a) {
            interfaceC25312uM60541h = C17629a.m50185b((C17629a) interfaceC25312uM60541h, EnumC17636h.SUCCESS, false, null, null, null, null, null, 126, null);
        }
        return new AbstractC16205c.c(interfaceC25312uM60541h);
    }
}
