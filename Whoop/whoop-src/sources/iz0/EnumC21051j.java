package iz0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: iz0.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m65681d2 = {"Liz0/j;", "", "<init>", "(Ljava/lang/String;I)V", "next", "()Liz0/j;", "NUMBERS", "LETTERS", "ROMAN", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC21051j {
    NUMBERS,
    LETTERS,
    ROMAN;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final EnumC21051j next() {
        return values()[(ordinal() + 1) % values().length];
    }
}
