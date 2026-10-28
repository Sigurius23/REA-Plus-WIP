package z30;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v17 z30.e[], still in use, count: 1, list:
  (r0v17 z30.e[]) from 0x00cf: INVOKE (r0v17 z30.e[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: z30.e */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC40042e {
    ADMINISTRATIVE_AREA_LEVEL_1("administrative_area_level_1"),
    ADMINISTRATIVE_AREA_LEVEL_2("administrative_area_level_2"),
    /* JADX INFO: Fake field, exist only in values array */
    ADMINISTRATIVE_AREA_LEVEL_3("administrative_area_level_3"),
    /* JADX INFO: Fake field, exist only in values array */
    ADMINISTRATIVE_AREA_LEVEL_4("administrative_area_level_4"),
    /* JADX INFO: Fake field, exist only in values array */
    COUNTRY("country"),
    /* JADX INFO: Fake field, exist only in values array */
    LOCALITY("locality"),
    /* JADX INFO: Fake field, exist only in values array */
    NEIGHBORHOOD("neighborhood"),
    /* JADX INFO: Fake field, exist only in values array */
    POSTAL_TOWN("postal_town"),
    /* JADX INFO: Fake field, exist only in values array */
    POSTAL_CODE("postal_code"),
    /* JADX INFO: Fake field, exist only in values array */
    PREMISE("premise"),
    /* JADX INFO: Fake field, exist only in values array */
    ROUTE("route"),
    /* JADX INFO: Fake field, exist only in values array */
    STREET_NUMBER("street_number"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBLOCALITY("sublocality"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBLOCALITY_LEVEL_1("sublocality_level_1"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBLOCALITY_LEVEL_2("sublocality_level_2"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBLOCALITY_LEVEL_3("sublocality_level_3"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBLOCALITY_LEVEL_4("sublocality_level_4");


    /* JADX INFO: renamed from: w */
    public final String f172766w;

    static {
        AbstractC15751g.m44468u(enumC40042eArr);
    }

    public EnumC40042e(String str) {
        super(str, i);
        this.f172766w = str;
    }

    public static EnumC40042e valueOf(String str) {
        return (EnumC40042e) Enum.valueOf(EnumC40042e.class, str);
    }

    public static EnumC40042e[] values() {
        return (EnumC40042e[]) f172765z.clone();
    }
}
