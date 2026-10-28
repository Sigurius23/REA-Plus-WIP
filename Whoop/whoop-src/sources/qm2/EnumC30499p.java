package qm2;

import ge3.AbstractC15751g;
import hi0.AbstractC17306d;
import hi0.AbstractC17312j;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: qm2.p */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Lqm2/p;", "", "", "titleTextResource", "subtitleTextResource", "errorImageResource", "<init>", "(Ljava/lang/String;IIII)V", "I", "getTitleTextResource", "()I", "getSubtitleTextResource", "getErrorImageResource", "ACCOUNT_ERROR", "NO_NETWORK", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC30499p {
    ACCOUNT_ERROR(AbstractC17312j.f66983f1, AbstractC17312j.f66974c1, AbstractC17306d.f66532c),
    NO_NETWORK(AbstractC17312j.f67021s0, AbstractC17312j.f67018r0, AbstractC17306d.f66534e);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final int errorImageResource;
    private final int subtitleTextResource;
    private final int titleTextResource;

    EnumC30499p(int i13, int i14, int i15) {
        this.titleTextResource = i13;
        this.subtitleTextResource = i14;
        this.errorImageResource = i15;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getErrorImageResource() {
        return this.errorImageResource;
    }

    public final int getSubtitleTextResource() {
        return this.subtitleTextResource;
    }

    public final int getTitleTextResource() {
        return this.titleTextResource;
    }
}
