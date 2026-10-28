package b72;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: b72.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lb72/f;", "", "Ly81/f;", "colorKey", "<init>", "(Ljava/lang/String;ILy81/f;)V", "Ly81/f;", "getColorKey", "()Ly81/f;", "DATA_PRESENT", "MISSING_DATA", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC2788f {
    DATA_PRESENT(EnumC39333f.BRAND_WHITE),
    MISSING_DATA(EnumC39333f.WHITE_70);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final EnumC39333f colorKey;

    EnumC2788f(EnumC39333f enumC39333f) {
        this.colorKey = enumC39333f;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final EnumC39333f getColorKey() {
        return this.colorKey;
    }
}
