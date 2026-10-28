package ch3;

import xg3.AbstractC38292s;
import xg3.C38280g;
import xg3.InterfaceC38278e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ch3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC4669a implements InterfaceC38278e {

    /* JADX INFO: renamed from: w */
    public static final C38280g f19117w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC4669a[] f19118x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4669a EF0;

    static {
        EnumC4669a enumC4669a = new EnumC4669a("INSTANCE", 0);
        f19118x = new EnumC4669a[]{enumC4669a};
        f19117w = C38280g.m122636V(enumC4669a);
    }

    public static EnumC4669a valueOf(String str) {
        return (EnumC4669a) Enum.valueOf(EnumC4669a.class, str);
    }

    public static EnumC4669a[] values() {
        return (EnumC4669a[]) f19118x.clone();
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        ((AbstractC38292s) obj).onCompleted();
    }
}
