package l22;

import k22.AbstractC22162b;
import k22.C22164d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l22.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ll22/a;", "", "<init>", "()V", "Lk22/b;", "domainResult", "Lk22/d;", "a", "(Lk22/b;)Lk22/d;", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23240a {
    /* JADX INFO: renamed from: a */
    public final C22164d m67288a(AbstractC22162b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof AbstractC22162b.c) {
            return new C22164d(false, ((AbstractC22162b.c) domainResult).m63439a(), true, false, null, 0, 57, null);
        }
        return domainResult instanceof AbstractC22162b.b ? new C22164d(false, null, false, true, null, 0, 55, null) : new C22164d(false, null, false, false, null, 0, 63, null);
    }
}
