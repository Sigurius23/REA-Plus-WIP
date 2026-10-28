package hm1;

import bm1.InterfaceC3420c;
import em1.C13338l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hm1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lhm1/a;", "", "<init>", "()V", "Lbm1/c;", "streaksDomainState", "Lem1/l;", "homeDialogViewState", "", "makePermissionsCheck", "isJournalShowing", "areAutopopsComplete", "a", "(Lbm1/c;Lem1/l;ZZZ)Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17424a {
    /* JADX INFO: renamed from: a */
    public final boolean m49452a(InterfaceC3420c streaksDomainState, C13338l homeDialogViewState, boolean makePermissionsCheck, boolean isJournalShowing, boolean areAutopopsComplete) {
        AbstractC22676k.m65750j(streaksDomainState, "streaksDomainState");
        AbstractC22676k.m65750j(homeDialogViewState, "homeDialogViewState");
        boolean z4 = (makePermissionsCheck || isJournalShowing || homeDialogViewState.getIsVisible() || !areAutopopsComplete) ? false : true;
        InterfaceC3420c.d dVar = streaksDomainState instanceof InterfaceC3420c.d ? (InterfaceC3420c.d) streaksDomainState : null;
        return z4 && !(dVar != null ? dVar.getHasAnimationFinishedForThisValue() : false);
    }
}
