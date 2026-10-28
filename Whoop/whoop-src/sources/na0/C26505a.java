package na0;

import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa0.InterfaceC30109a;
import qw2.AbstractC30694b;

/* JADX INFO: renamed from: na0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lna0/a;", "", "<init>", "()V", "Lqa0/a$g;", "viewEvent", "Lna0/b;", "b", "(Lqa0/a$g;)Lna0/b;", "Lqw2/b;", "domainState", "a", "(Lqw2/b;)Lna0/b;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26505a {
    /* JADX INFO: renamed from: a */
    public final AbstractC26506b m78567a(AbstractC30694b domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState instanceof AbstractC30694b.f) {
            return AbstractC26506b.d.f105339a;
        }
        if (domainState instanceof AbstractC30694b.i) {
            return AbstractC26506b.c.f105338a;
        }
        if (domainState instanceof AbstractC30694b.a) {
            return new AbstractC26506b.a(((AbstractC30694b.a) domainState).getMessage());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC26506b m78568b(InterfaceC30109a.g viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if (viewEvent instanceof InterfaceC30109a.d) {
            return new AbstractC26506b.b(((InterfaceC30109a.d) viewEvent).getTestId());
        }
        if (viewEvent instanceof InterfaceC30109a.f) {
            return AbstractC26506b.d.f105339a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
