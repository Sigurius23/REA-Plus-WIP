package b62;

import c62.AbstractC4275c;
import com.whoop.navigation.C9598e;
import d62.C11742h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: b62.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"", "retryInProgress", "Lc62/c;", "tileViewState", "b", "(ZLc62/c;)Z", "Lcom/whoop/navigation/e;", "a", "(ZLc62/c;)Lcom/whoop/navigation/e;", "recovery-impacts-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2762c {
    /* JADX INFO: renamed from: a */
    public static final C9598e m7830a(boolean z4, AbstractC4275c tileViewState) {
        AbstractC22676k.m65750j(tileViewState, "tileViewState");
        if (!z4) {
            return null;
        }
        AbstractC4275c.c cVar = tileViewState instanceof AbstractC4275c.c ? (AbstractC4275c.c) tileViewState : null;
        if (cVar == null) {
            return null;
        }
        InterfaceC25312u state = cVar.getState();
        C11742h c11742h = state instanceof C11742h ? (C11742h) state : null;
        if (c11742h == null) {
            return null;
        }
        return c11742h.getDestination();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m7831b(boolean z4, AbstractC4275c tileViewState) {
        AbstractC22676k.m65750j(tileViewState, "tileViewState");
        return z4 && (tileViewState instanceof AbstractC4275c.c) && !(((AbstractC4275c.c) tileViewState).getState() instanceof C11742h);
    }
}
