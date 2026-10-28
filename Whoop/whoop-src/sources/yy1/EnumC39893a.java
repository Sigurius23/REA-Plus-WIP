package yy1;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: yy1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Lyy1/a;", "", "", "key", "deepLink", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getDeepLink", "ADVANCED_LABS", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
enum EnumC39893a {
    ADVANCED_LABS("advanced-labs", "android-app://com.whoop/AdvancedLabsFragment");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String deepLink;
    private final String key;

    EnumC39893a(String str, String str2) {
        this.key = str;
        this.deepLink = str2;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getKey() {
        return this.key;
    }
}
