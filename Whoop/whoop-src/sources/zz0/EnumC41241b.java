package zz0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: zz0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Lzz0/b;", "", "Ly81/f;", "fillColor", "borderColor", "<init>", "(Ljava/lang/String;ILy81/f;Ly81/f;)V", "Ly81/f;", "getFillColor", "()Ly81/f;", "getBorderColor", "YES", "NO", "INVALID", "EMPTY", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC41241b {
    YES(EnumC39333f.RECOVERY, null),
    NO(EnumC39333f.WHITE_50, null),
    INVALID(null, EnumC39333f.WHITE_30),
    EMPTY(null, null);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final EnumC39333f borderColor;
    private final EnumC39333f fillColor;

    EnumC41241b(EnumC39333f enumC39333f, EnumC39333f enumC39333f2) {
        this.fillColor = enumC39333f;
        this.borderColor = enumC39333f2;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final EnumC39333f getBorderColor() {
        return this.borderColor;
    }

    public final EnumC39333f getFillColor() {
        return this.fillColor;
    }
}
