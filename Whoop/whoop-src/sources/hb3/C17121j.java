package hb3;

import java.util.ArrayList;
import lb3.AbstractC23763c0;
import lb3.AbstractC23811y;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30171w0;
import qa3.EnumC30128e0;
import r93.EnumC31106a0;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;

/* JADX INFO: renamed from: hb3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C17121j implements InterfaceC17127p, InterfaceC17125n, InterfaceC17126o {

    /* JADX INFO: renamed from: b */
    public static final C17121j f65756b = new C17121j();

    /* JADX INFO: renamed from: c */
    public static final C17121j f65757c = new C17121j();

    /* JADX INFO: renamed from: d */
    public static final C17121j f65758d = new C17121j();

    /* JADX INFO: renamed from: e */
    public static final C17121j f65759e = new C17121j();

    /* JADX INFO: renamed from: e */
    public static EnumC31106a0 m48366e(EnumC30128e0 enumC30128e0) {
        int i13 = enumC30128e0 == null ? -1 : AbstractC17106b0.f65709a[enumC30128e0.ordinal()];
        if (i13 == 1) {
            return EnumC31106a0.f128310x;
        }
        if (i13 == 2) {
            return EnumC31106a0.f128312z;
        }
        if (i13 != 3) {
            return i13 != 4 ? EnumC31106a0.f128310x : EnumC31106a0.f128311y;
        }
        return EnumC31106a0.f128307E;
    }

    @Override // hb3.InterfaceC17126o
    /* JADX INFO: renamed from: a */
    public void mo48367a(InterfaceC31111c interfaceC31111c) {
        if (interfaceC31111c == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
        }
    }

    @Override // hb3.InterfaceC17126o
    /* JADX INFO: renamed from: b */
    public void mo48368b(InterfaceC31117e interfaceC31117e, ArrayList arrayList) {
    }

    @Override // hb3.InterfaceC17127p
    /* JADX INFO: renamed from: c */
    public AbstractC23811y mo48369c(C30171w0 proto, String flexibleId, AbstractC23763c0 lowerBound, AbstractC23763c0 upperBound) {
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(flexibleId, "flexibleId");
        AbstractC22676k.m65750j(lowerBound, "lowerBound");
        AbstractC22676k.m65750j(upperBound, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // hb3.InterfaceC17125n
    /* JADX INFO: renamed from: d */
    public Boolean mo48370d() {
        return Boolean.TRUE;
    }
}
