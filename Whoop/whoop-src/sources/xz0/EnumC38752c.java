package xz0;

import ge3.AbstractC15751g;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: xz0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lxz0/c;", "", "Ly3/m;", "alignment", "<init>", "(Ljava/lang/String;ILy3/m;)V", "Ly3/m;", "getAlignment", "()Ly3/m;", "LEADING", "TRAILING", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC38752c {
    LEADING(EnumC39181m.f168423w),
    TRAILING(EnumC39181m.f168424x);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final EnumC39181m alignment;

    EnumC38752c(EnumC39181m enumC39181m) {
        this.alignment = enumC39181m;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final EnumC39181m getAlignment() {
        return this.alignment;
    }
}
