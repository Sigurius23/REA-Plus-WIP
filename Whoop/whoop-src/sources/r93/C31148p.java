package r93;

import fb3.C14342c;
import fb3.InterfaceC14343d;
import lb3.AbstractC23811y;
import p088dc.AbstractC11894a;
import u93.AbstractC34677g0;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: r93.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C31148p extends AbstractC31146o {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f128348b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31148p(AbstractC31143m1 abstractC31143m1, int i13) {
        super(abstractC31143m1);
        this.f128348b = i13;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0222 A[ADDED_TO_REGION, LOOP:1: B:120:0x0222->B:132:0x0253, LOOP_START, PHI: r8
      0x0222: PHI (r8v2 r93.k) = (r8v0 r93.k), (r8v3 r93.k) binds: [B:118:0x021f, B:132:0x0253] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x0224  */
    /* JADX WARN: Code duplicated, block: B:123:0x0227  */
    /* JADX WARN: Code duplicated, block: B:132:0x0253 A[LOOP:1: B:120:0x0222->B:132:0x0253, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x022b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [r93.k] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r7v0, types: [r93.k, r93.n] */
    /* JADX WARN: Type inference failed for: r7v6, types: [r93.k] */
    /* JADX WARN: Type inference failed for: r7v7, types: [r93.k] */
    /* JADX WARN: Type inference failed for: r7v9, types: [r93.k] */
    @Override // r93.AbstractC31152r
    /* JADX INFO: renamed from: a */
    public final boolean mo40931a(InterfaceC14343d interfaceC14343d, InterfaceC31144n interfaceC31144n, InterfaceC31135k interfaceC31135k) {
        InterfaceC31135k interfaceC31135kM125526h;
        InterfaceC31117e interfaceC31117e;
        switch (this.f128348b) {
            case 0:
                if (interfaceC31135k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
                }
                if (AbstractC39363f.m125535q(interfaceC31144n) && AbstractC39363f.m125523e(interfaceC31135k) != C31157t0.f128377a) {
                    return AbstractC31150q.m95876d(interfaceC31144n, interfaceC31135k);
                }
                if (interfaceC31144n instanceof InterfaceC31132j) {
                    ((InterfaceC31132j) interfaceC31144n).mo60581g();
                }
                while (interfaceC31144n != 0) {
                    interfaceC31144n = interfaceC31144n.mo60581g();
                    if (((interfaceC31144n instanceof InterfaceC31117e) && !AbstractC39363f.m125529k(interfaceC31144n)) || (interfaceC31144n instanceof InterfaceC31124g0)) {
                        if (interfaceC31144n != 0) {
                            while (interfaceC31135k != null) {
                                if (interfaceC31144n != interfaceC31135k) {
                                    if (interfaceC31135k instanceof InterfaceC31124g0) {
                                        interfaceC31135k = interfaceC31135k.mo60581g();
                                    } else if ((interfaceC31144n instanceof InterfaceC31124g0) || !((AbstractC34677g0) ((InterfaceC31124g0) interfaceC31144n)).f146067F.equals(((AbstractC34677g0) ((InterfaceC31124g0) interfaceC31135k)).f146067F) || !AbstractC39363f.m125521c(interfaceC31135k).equals(AbstractC39363f.m125521c(interfaceC31144n))) {
                                    }
                                }
                                return true;
                            }
                        }
                        return false;
                    }
                }
                if (interfaceC31144n != 0) {
                    while (interfaceC31135k != null) {
                        if (interfaceC31144n != interfaceC31135k) {
                            if (interfaceC31135k instanceof InterfaceC31124g0) {
                                interfaceC31135k = interfaceC31135k.mo60581g();
                            } else if (interfaceC31144n instanceof InterfaceC31124g0) {
                            }
                        }
                        return true;
                    }
                }
                return false;
            case 1:
                if (interfaceC31135k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
                }
                if (AbstractC31150q.f128349a.mo40931a(interfaceC14343d, interfaceC31144n, interfaceC31135k)) {
                    if (interfaceC14343d == AbstractC31150q.f128360l) {
                        return true;
                    }
                    if (interfaceC14343d != AbstractC31150q.f128359k && (interfaceC31135kM125526h = AbstractC39363f.m125526h(interfaceC31144n, InterfaceC31117e.class, true)) != null && (interfaceC14343d instanceof C14342c)) {
                        return ((C14342c) interfaceC14343d).f52395w.mo78660a().equals(interfaceC31135kM125526h.mo78660a());
                    }
                }
                return false;
            case 2:
                if (interfaceC31135k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                InterfaceC31117e interfaceC31117e2 = (InterfaceC31117e) AbstractC39363f.m125526h(interfaceC31144n, InterfaceC31117e.class, true);
                InterfaceC31117e interfaceC31117e3 = (InterfaceC31117e) AbstractC39363f.m125526h(interfaceC31135k, InterfaceC31117e.class, false);
                if (interfaceC31117e3 != null) {
                    if (interfaceC31117e2 != null && AbstractC39363f.m125529k(interfaceC31117e2) && (interfaceC31117e = (InterfaceC31117e) AbstractC39363f.m125526h(interfaceC31117e2, InterfaceC31117e.class, true)) != null && AbstractC39363f.m125534p(interfaceC31117e3.mo60594i(), interfaceC31117e.mo78660a())) {
                        return true;
                    }
                    ?? M125536r = interfaceC31144n instanceof InterfaceC31111c ? AbstractC39363f.m125536r((InterfaceC31111c) interfaceC31144n) : interfaceC31144n;
                    InterfaceC31117e interfaceC31117e4 = (InterfaceC31117e) AbstractC39363f.m125526h(M125536r, InterfaceC31117e.class, true);
                    if (interfaceC31117e4 != null) {
                        if (AbstractC39363f.m125534p(interfaceC31117e3.mo60594i(), interfaceC31117e4.mo78660a()) && interfaceC14343d != AbstractC31150q.f128361m) {
                            if (!(M125536r instanceof InterfaceC31111c) || (M125536r instanceof InterfaceC31132j) || interfaceC14343d == AbstractC31150q.f128360l) {
                                return true;
                            }
                            if (interfaceC14343d != AbstractC31150q.f128359k && interfaceC14343d != null) {
                                AbstractC23811y type = interfaceC14343d.getType();
                                if (AbstractC39363f.m125534p(type, interfaceC31117e3)) {
                                    return true;
                                }
                                AbstractC11894a.m31938F(type);
                            }
                        }
                        return mo40931a(interfaceC14343d, interfaceC31144n, interfaceC31117e3.mo60581g());
                    }
                }
                return false;
            case 3:
                if (interfaceC31135k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
                }
                if (!AbstractC39363f.m125521c(interfaceC31135k).mo78664n0(AbstractC39363f.m125521c(interfaceC31144n))) {
                    return false;
                }
                AbstractC31150q.f128362n.getClass();
                return true;
            case 4:
                if (interfaceC31135k != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case 5:
                if (interfaceC31135k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 6:
                if (interfaceC31135k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case 7:
                if (interfaceC31135k != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            default:
                if (interfaceC31135k != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
        }
    }
}
