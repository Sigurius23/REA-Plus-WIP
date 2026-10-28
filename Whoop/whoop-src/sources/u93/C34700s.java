package u93;

import java.util.LinkedHashSet;
import r93.InterfaceC31111c;
import ya3.AbstractC39373p;
import ya3.C39371n;

/* JADX INFO: renamed from: u93.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C34700s extends AbstractC39373p {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LinkedHashSet f146145b;

    public C34700s(LinkedHashSet linkedHashSet) {
        this.f146145b = linkedHashSet;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m109608a(int i13) {
        Object[] objArr = new Object[3];
        if (i13 == 1) {
            objArr[0] = "fromSuper";
        } else if (i13 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i13 == 1 || i13 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // ya3.AbstractC39373p
    /* JADX INFO: renamed from: b */
    public final void mo43949b(InterfaceC31111c interfaceC31111c) {
        if (interfaceC31111c == null) {
            m109608a(0);
            throw null;
        }
        C39371n.m125562r(interfaceC31111c, null);
        this.f146145b.add(interfaceC31111c);
    }

    @Override // ya3.AbstractC39373p
    /* JADX INFO: renamed from: c */
    public final void mo43950c(InterfaceC31111c interfaceC31111c, InterfaceC31111c interfaceC31111c2) {
        if (interfaceC31111c2 != null) {
            return;
        }
        m109608a(2);
        throw null;
    }
}
