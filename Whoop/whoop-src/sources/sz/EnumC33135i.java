package sz;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: sz.i */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC33135i {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC33135i[] f138200w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC33135i EF5;

    static {
        EnumC33135i[] enumC33135iArr = {new EnumC33135i("Min", 0), new EnumC33135i("Full", 1)};
        f138200w = enumC33135iArr;
        AbstractC15751g.m44468u(enumC33135iArr);
    }

    public static EnumC33135i valueOf(String str) {
        return (EnumC33135i) Enum.valueOf(EnumC33135i.class, str);
    }

    public static EnumC33135i[] values() {
        return (EnumC33135i[]) f138200w.clone();
    }
}
