package oj1;

import kj1.InterfaceC22515b;
import nj1.AbstractC26753c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oj1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Loj1/a;", "", "<init>", "()V", "Lkj1/b;", "domainState", "Lnj1/c;", "a", "(Lkj1/b;)Lnj1/c;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27979a {
    /* JADX INFO: renamed from: a */
    public final AbstractC26753c m84398a(InterfaceC22515b domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState instanceof InterfaceC22515b.a) {
            return AbstractC26753c.a.f106471a;
        }
        if (domainState instanceof InterfaceC22515b.d) {
            return AbstractC26753c.b.f106472a;
        }
        if (domainState instanceof InterfaceC22515b.b) {
            throw new IllegalStateException();
        }
        throw new NoWhenBranchMatchedException();
    }
}
