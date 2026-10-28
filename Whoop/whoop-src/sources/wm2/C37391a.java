package wm2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import um2.C35089b;
import xm2.AbstractC38460a;
import xm2.C38463d;

/* JADX INFO: renamed from: wm2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lwm2/a;", "", "<init>", "()V", "Lum2/b;", "domainState", "Lxm2/a;", "a", "(Lum2/b;)Lxm2/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37391a {
    /* JADX INFO: renamed from: a */
    public final AbstractC38460a m119740a(C35089b domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        C38463d stravaAuthResult = domainState.getStravaAuthResult();
        if (stravaAuthResult != null) {
            AbstractC38460a bVar = (stravaAuthResult.getErrorResource() > 0 || stravaAuthResult.getAuthParams() == null) ? AbstractC38460a.a.f164698a : new AbstractC38460a.b(stravaAuthResult.getAuthParams());
            if (bVar != null) {
                return bVar;
            }
        }
        return AbstractC38460a.a.f164698a;
    }
}
