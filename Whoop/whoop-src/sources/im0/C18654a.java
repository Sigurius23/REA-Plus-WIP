package im0;

import fm0.C14595b;
import hm0.C17423d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: im0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lim0/a;", "", "<init>", "()V", "Lfm0/b;", "domainState", "Lhm0/d;", "a", "(Lfm0/b;)Lhm0/d;", "bottom-navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18654a {
    /* JADX INFO: renamed from: a */
    public final C17423d m54084a(C14595b domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return new C17423d(domainState.m41751f(), domainState.getSelectedTabId(), (!domainState.getIsTabRoot() || domainState.m41751f().isEmpty() || domainState.getOverlayVisible()) ? false : true, domainState.getShowCommunityBadge());
    }
}
