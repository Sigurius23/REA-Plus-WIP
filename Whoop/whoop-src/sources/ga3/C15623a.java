package ga3;

import hb3.InterfaceC17126o;
import java.util.Collection;
import java.util.LinkedHashSet;
import p000.C31931s;
import r93.InterfaceC31111c;
import ya3.AbstractC39373p;
import ya3.C39371n;

/* JADX INFO: renamed from: ga3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15623a extends AbstractC39373p {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC17126o f58648b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LinkedHashSet f58649c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f58650d;

    public C15623a(InterfaceC17126o interfaceC17126o, LinkedHashSet linkedHashSet, boolean z4) {
        this.f58648b = interfaceC17126o;
        this.f58649c = linkedHashSet;
        this.f58650d = z4;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m43948a(int i13) {
        Object[] objArr = new Object[3];
        if (i13 == 1) {
            objArr[0] = "fromSuper";
        } else if (i13 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i13 == 3) {
            objArr[0] = "member";
        } else if (i13 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i13 == 1 || i13 == 2) {
            objArr[2] = "conflict";
        } else if (i13 == 3 || i13 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // ya3.AbstractC39373p
    /* JADX INFO: renamed from: b */
    public final void mo43949b(InterfaceC31111c interfaceC31111c) {
        if (interfaceC31111c == null) {
            m43948a(0);
            throw null;
        }
        C39371n.m125562r(interfaceC31111c, new C31931s(this, 5));
        this.f58649c.add(interfaceC31111c);
    }

    @Override // ya3.AbstractC39373p
    /* JADX INFO: renamed from: c */
    public final void mo43950c(InterfaceC31111c interfaceC31111c, InterfaceC31111c interfaceC31111c2) {
        if (interfaceC31111c2 != null) {
            return;
        }
        m43948a(2);
        throw null;
    }

    @Override // ya3.AbstractC39373p
    /* JADX INFO: renamed from: n */
    public final void mo43951n(InterfaceC31111c interfaceC31111c, Collection collection) {
        if (interfaceC31111c == null) {
            m43948a(3);
            throw null;
        }
        if (!this.f58650d || interfaceC31111c.getKind() == 2) {
            interfaceC31111c.mo78656g0(collection);
        }
    }
}
