package w51;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: w51.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Lw51/a;", "", "Ly81/f;", "color", "<init>", "(Ljava/lang/String;ILy81/f;)V", "Ly81/f;", "getColor", "()Ly81/f;", "RECOVERY", "STRAIN", "SLEEP", "NO_DATA", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC36835a {
    RECOVERY(EnumC39333f.RECOVERY),
    STRAIN(EnumC39333f.STRAIN),
    SLEEP(EnumC39333f.SLEEP),
    NO_DATA(null);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final EnumC39333f color;

    EnumC36835a(EnumC39333f enumC39333f) {
        this.color = enumC39333f;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final EnumC39333f getColor() {
        return this.color;
    }
}
