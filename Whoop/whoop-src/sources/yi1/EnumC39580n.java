package yi1;

import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;
import yb3.AbstractC39421y;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'None' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: yi1.n */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0080\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, m65681d2 = {"Lyi1/n;", "", "Lgz0/m0;", "iconImage", "Ly81/f;", "iconColor", "iconBackgroundColor", "", "key", "<init>", "(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Ljava/lang/String;)V", "Lgz0/m0;", "getIconImage", "()Lgz0/m0;", "Ly81/f;", "getIconColor", "()Ly81/f;", "getIconBackgroundColor", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Companion", "a", "None", "Error", "ErrorConnection", "Possible", "AllNotifications", "RecentlyActivated", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC39580n {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC39580n[] $VALUES;
    public static final EnumC39580n AllNotifications;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EnumC39580n Error;
    public static final EnumC39580n ErrorConnection;
    public static final EnumC39580n None;
    public static final EnumC39580n Possible;
    public static final EnumC39580n RecentlyActivated;
    private final EnumC39333f iconBackgroundColor;
    private final EnumC39333f iconColor;
    private final EnumC16313m0 iconImage;
    private final String key;

    /* JADX INFO: renamed from: yi1.n$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lyi1/n$a;", "", "<init>", "()V", "", "string", "Lyi1/n;", "a", "(Ljava/lang/String;)Lyi1/n;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC39580n m126461a(String string) {
            for (EnumC39580n enumC39580n : EnumC39580n.values()) {
                if (AbstractC39421y.m125921F(enumC39580n.getKey(), string, true)) {
                    return enumC39580n;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ EnumC39580n[] $values() {
        return new EnumC39580n[]{None, Error, ErrorConnection, Possible, AllNotifications, RecentlyActivated};
    }

    static {
        EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_CHECKMARK;
        EnumC39333f enumC39333f = EnumC39333f.BRAND_BLACK;
        None = new EnumC39580n("None", 0, enumC16313m0, enumC39333f, EnumC39333f.ACCENT_POSITIVE_TREND, "NOT_DETECTED");
        EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_INFORMATION;
        EnumC39333f enumC39333f2 = EnumC39333f.ACCENT_NEGATIVE_TREND;
        EnumC39333f enumC39333f3 = EnumC39333f.ACCENT_NEGATIVE_TREND_15;
        Error = new EnumC39580n("Error", 1, enumC16313m1, enumC39333f2, enumC39333f3, "ERROR");
        ErrorConnection = new EnumC39580n("ErrorConnection", 2, enumC16313m1, enumC39333f2, enumC39333f3, "ERROR-connection");
        Possible = new EnumC39580n("Possible", 3, EnumC16313m0.TINY_ATTENTION, enumC39333f, enumC39333f2, "POSSIBLE_AFIB_DETECTED");
        EnumC16313m0 enumC16313m2 = EnumC16313m0.LIST;
        EnumC39333f enumC39333f4 = EnumC39333f.WHITE_50;
        AllNotifications = new EnumC39580n("AllNotifications", 4, enumC16313m2, enumC39333f4, EnumC39333f.TRANSPARENT, "ALL_NOTIFICATIONS");
        RecentlyActivated = new EnumC39580n("RecentlyActivated", 5, EnumC16313m0.TINY_ELLIPSE, enumC39333f4, EnumC39333f.WHITE_10, "RECENTLY_ACTIVATED");
        EnumC39580n[] enumC39580nArr$values = $values();
        $VALUES = enumC39580nArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC39580nArr$values);
        INSTANCE = new Companion(null);
    }

    private EnumC39580n(String str, int i13, EnumC16313m0 enumC16313m0, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, String str2) {
        super(str, i13);
        this.iconImage = enumC16313m0;
        this.iconColor = enumC39333f;
        this.iconBackgroundColor = enumC39333f2;
        this.key = str2;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC39580n valueOf(String str) {
        return (EnumC39580n) Enum.valueOf(EnumC39580n.class, str);
    }

    public static EnumC39580n[] values() {
        return (EnumC39580n[]) $VALUES.clone();
    }

    public final EnumC39333f getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public final EnumC39333f getIconColor() {
        return this.iconColor;
    }

    public final EnumC16313m0 getIconImage() {
        return this.iconImage;
    }

    public final String getKey() {
        return this.key;
    }
}
