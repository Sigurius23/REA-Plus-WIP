package or2;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: or2.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Lor2/i;", "", "", "rawString", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawString", "()Ljava/lang/String;", "FIREBASE_DEV", "FIREBASE_PROD", "PLAY_DEV", "PLAY_PROD_MEMBER", "PLAY_PROD_EMPLOYEE", "DEVELOPER", "UNKNOWN", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC28168i {
    FIREBASE_DEV("firebase_dev"),
    FIREBASE_PROD("firebase_prod"),
    PLAY_DEV("play_dev"),
    PLAY_PROD_MEMBER("play_prod_member"),
    PLAY_PROD_EMPLOYEE("play_prod_internal"),
    DEVELOPER("developer"),
    UNKNOWN("unknown");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String rawString;

    EnumC28168i(String str) {
        this.rawString = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getRawString() {
        return this.rawString;
    }
}
