package jx1;

import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import p208i2.C17919x;
import p712j91.Function1;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: jx1.n */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Ljx1/n;", "", "Li91/a;", "background", "<init>", "(Ljava/lang/String;ILi91/a;)V", "Li91/a;", "getBackground", "()Li91/a;", "ONE", "PEAK", "LIFE", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC22024n {
    ONE(AbstractC18249c.m52577o(C17919x.f69636m)),
    PEAK(AbstractC18249c.m52571i(Function1.m60318a(AbstractC22026p.m62964a()), 0.5f)),
    LIFE(AbstractC18249c.m52571i(Function1.m60318a(AbstractC15673b0.m43989I0()), 0.5f));

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final AbstractC18247a background;

    EnumC22024n(AbstractC18247a abstractC18247a) {
        this.background = abstractC18247a;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final AbstractC18247a getBackground() {
        return this.background;
    }
}
