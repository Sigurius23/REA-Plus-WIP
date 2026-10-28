package p664yy;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 yy.v[], still in use, count: 1, list:
  (r0v1 yy.v[]) from 0x004e: INVOKE (r0v1 yy.v[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: yy.v */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC39882v {
    WiFi("Wi-Fi"),
    Mobile2G("2G"),
    Mobile3G("3G"),
    Mobile4G("4G"),
    Mobile5G("5G"),
    Unknown("unknown");


    /* JADX INFO: renamed from: w */
    public final String f172206w;

    static {
        AbstractC15751g.m44468u(enumC39882vArr);
    }

    public EnumC39882v(String str) {
        super(str, i);
        this.f172206w = str;
    }

    public static EnumC39882v valueOf(String str) {
        return (EnumC39882v) Enum.valueOf(EnumC39882v.class, str);
    }

    public static EnumC39882v[] values() {
        return (EnumC39882v[]) f172202H.clone();
    }
}
