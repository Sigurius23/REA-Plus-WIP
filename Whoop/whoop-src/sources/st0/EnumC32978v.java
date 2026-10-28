package st0;

import ge3.AbstractC15751g;
import java.util.List;
import java.util.UUID;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'GEN_4' uses external variables
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
/* JADX INFO: renamed from: st0.v */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fBA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, m65681d2 = {"Lst0/v;", "", "", "codeName", "Ljava/util/UUID;", "serviceId", "charCmdToStrap", "charCmdFromStrap", "charEventsFromStrap", "charDataFromStrap", "charMemFault", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)V", "Ljava/lang/String;", "getCodeName", "()Ljava/lang/String;", "Ljava/util/UUID;", "getServiceId", "()Ljava/util/UUID;", "getCharCmdToStrap", "getCharCmdFromStrap", "getCharEventsFromStrap", "getCharDataFromStrap", "getCharMemFault", "", "isGen4", "()Z", "isMaverick", "isGoose", "isMaverickOrGoose", "Companion", "a", "GEN_4", "MAVERICK", "PUFFIN", "GOOSE", "MONUMENT", "SYMPHONY", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC32978v {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC32978v[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EnumC32978v GEN_4;
    public static final EnumC32978v GOOSE;
    public static final EnumC32978v MAVERICK;
    public static final EnumC32978v MONUMENT;
    public static final EnumC32978v PUFFIN;
    public static final EnumC32978v SYMPHONY;
    public static final byte VERSION_GEN4 = 4;
    public static final byte VERSION_MAVERICK = 5;
    private final UUID charCmdFromStrap;
    private final UUID charCmdToStrap;
    private final UUID charDataFromStrap;
    private final UUID charEventsFromStrap;
    private final UUID charMemFault;
    private final String codeName;
    private final UUID serviceId;

    /* JADX INFO: renamed from: st0.v$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u0005*\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lst0/v$a;", "", "<init>", "()V", "", "Lst0/v;", "a", "()Ljava/util/List;", "c", "", "d", "(Lst0/v;)B", "e", "(B)Lst0/v;", "", "b", "(Lst0/v;)Ljava/lang/String;", "VERSION_GEN4", "B", "VERSION_MAVERICK", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: st0.v$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C42346a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f137307a;

            static {
                int[] iArr = new int[EnumC32978v.values().length];
                try {
                    iArr[EnumC32978v.GEN_4.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC32978v.MAVERICK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC32978v.PUFFIN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC32978v.GOOSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC32978v.MONUMENT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC32978v.SYMPHONY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f137307a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final List<EnumC32978v> m104088a() {
            return AbstractC37056f.m118959K(EnumC32978v.GEN_4, EnumC32978v.MAVERICK, EnumC32978v.GOOSE, EnumC32978v.MONUMENT, EnumC32978v.SYMPHONY);
        }

        /* JADX INFO: renamed from: b */
        public final String m104089b(EnumC32978v enumC32978v) {
            AbstractC22676k.m65750j(enumC32978v, "<this>");
            switch (C42346a.f137307a[enumC32978v.ordinal()]) {
                case 1:
                    return "Gen4";
                case 2:
                    return "Maverick";
                case 3:
                    return "Puffin";
                case 4:
                    return "Goose";
                case 5:
                    return "Monument";
                case 6:
                    return "Symphony";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX INFO: renamed from: c */
        public final List<EnumC32978v> m104090c() {
            return AbstractC37056f.m118958J(EnumC32978v.PUFFIN);
        }

        /* JADX INFO: renamed from: d */
        public final byte m104091d(EnumC32978v enumC32978v) {
            AbstractC22676k.m65750j(enumC32978v, "<this>");
            switch (C42346a.f137307a[enumC32978v.ordinal()]) {
                case 1:
                    return (byte) 4;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return (byte) 5;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX INFO: renamed from: e */
        public final EnumC32978v m104092e(byte b) {
            return b == 5 ? EnumC32978v.MAVERICK : EnumC32978v.GEN_4;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ EnumC32978v[] $values() {
        return new EnumC32978v[]{GEN_4, MAVERICK, PUFFIN, GOOSE, MONUMENT, SYMPHONY};
    }

    static {
        UUID uuidM104108l = AbstractC32979w.m104108l();
        AbstractC22676k.m65749i(uuidM104108l, "<get-WHOOP_GEN_4_SERVICE_ID>(...)");
        UUID uuidM104104h = AbstractC32979w.m104104h();
        AbstractC22676k.m65749i(uuidM104104h, "<get-WHOOP_GEN_4_CHAR_CMD_TO_STRAP>(...)");
        UUID uuidM104103g = AbstractC32979w.m104103g();
        AbstractC22676k.m65749i(uuidM104103g, "<get-WHOOP_GEN_4_CHAR_CMD_FROM_STRAP>(...)");
        UUID uuidM104106j = AbstractC32979w.m104106j();
        AbstractC22676k.m65749i(uuidM104106j, "<get-WHOOP_GEN_4_CHAR_EVENTS_FROM_STRAP>(...)");
        UUID uuidM104105i = AbstractC32979w.m104105i();
        AbstractC22676k.m65749i(uuidM104105i, "<get-WHOOP_GEN_4_CHAR_DATA_FROM_STRAP>(...)");
        UUID uuidM104107k = AbstractC32979w.m104107k();
        AbstractC22676k.m65749i(uuidM104107k, "<get-WHOOP_GEN_4_CHAR_MEMFAULT>(...)");
        GEN_4 = new EnumC32978v("GEN_4", 0, "Harvard", uuidM104108l, uuidM104104h, uuidM104103g, uuidM104106j, uuidM104105i, uuidM104107k);
        UUID uuidM104114r = AbstractC32979w.m104114r();
        AbstractC22676k.m65749i(uuidM104114r, "<get-WHOOP_MAVERICK_SERVICE_ID>(...)");
        UUID uuidM104110n = AbstractC32979w.m104110n();
        AbstractC22676k.m65749i(uuidM104110n, "<get-WHOOP_MAVERICK_CHAR_CMD_TO_STRAP>(...)");
        UUID uuidM104109m = AbstractC32979w.m104109m();
        AbstractC22676k.m65749i(uuidM104109m, "<get-WHOOP_MAVERICK_CHAR_CMD_FROM_STRAP>(...)");
        UUID uuidM104112p = AbstractC32979w.m104112p();
        AbstractC22676k.m65749i(uuidM104112p, "<get-WHOOP_MAVERICK_CHAR_EVENTS_FROM_STRAP>(...)");
        UUID uuidM104111o = AbstractC32979w.m104111o();
        AbstractC22676k.m65749i(uuidM104111o, "<get-WHOOP_MAVERICK_CHAR_DATA_FROM_STRAP>(...)");
        UUID uuidM104113q = AbstractC32979w.m104113q();
        AbstractC22676k.m65749i(uuidM104113q, "<get-WHOOP_MAVERICK_CHAR_MEMFAULT>(...)");
        MAVERICK = new EnumC32978v("MAVERICK", 1, "Maverick", uuidM104114r, uuidM104110n, uuidM104109m, uuidM104112p, uuidM104111o, uuidM104113q);
        UUID uuidM104102f = AbstractC32979w.m104102f();
        AbstractC22676k.m65749i(uuidM104102f, "<get-PUFFIN_SERVICE_ID>(...)");
        UUID uuidM104098b = AbstractC32979w.m104098b();
        AbstractC22676k.m65749i(uuidM104098b, "<get-PUFFIN_CHAR_CMD_TO_STRAP>(...)");
        UUID uuidM104097a = AbstractC32979w.m104097a();
        AbstractC22676k.m65749i(uuidM104097a, "<get-PUFFIN_CHAR_CMD_FROM_STRAP>(...)");
        UUID uuidM104100d = AbstractC32979w.m104100d();
        AbstractC22676k.m65749i(uuidM104100d, "<get-PUFFIN_CHAR_EVENTS_FROM_STRAP>(...)");
        UUID uuidM104099c = AbstractC32979w.m104099c();
        AbstractC22676k.m65749i(uuidM104099c, "<get-PUFFIN_CHAR_DATA_FROM_STRAP>(...)");
        UUID uuidM104101e = AbstractC32979w.m104101e();
        AbstractC22676k.m65749i(uuidM104101e, "<get-PUFFIN_CHAR_MEMFAULT>(...)");
        PUFFIN = new EnumC32978v("PUFFIN", 2, "Puffin", uuidM104102f, uuidM104098b, uuidM104097a, uuidM104100d, uuidM104099c, uuidM104101e);
        UUID uuidM104114r2 = AbstractC32979w.m104114r();
        AbstractC22676k.m65749i(uuidM104114r2, "<get-WHOOP_MAVERICK_SERVICE_ID>(...)");
        UUID uuidM104110n2 = AbstractC32979w.m104110n();
        AbstractC22676k.m65749i(uuidM104110n2, "<get-WHOOP_MAVERICK_CHAR_CMD_TO_STRAP>(...)");
        UUID uuidM104109m2 = AbstractC32979w.m104109m();
        AbstractC22676k.m65749i(uuidM104109m2, "<get-WHOOP_MAVERICK_CHAR_CMD_FROM_STRAP>(...)");
        UUID uuidM104112p2 = AbstractC32979w.m104112p();
        AbstractC22676k.m65749i(uuidM104112p2, "<get-WHOOP_MAVERICK_CHAR_EVENTS_FROM_STRAP>(...)");
        UUID uuidM104111o2 = AbstractC32979w.m104111o();
        AbstractC22676k.m65749i(uuidM104111o2, "<get-WHOOP_MAVERICK_CHAR_DATA_FROM_STRAP>(...)");
        UUID uuidM104113q2 = AbstractC32979w.m104113q();
        AbstractC22676k.m65749i(uuidM104113q2, "<get-WHOOP_MAVERICK_CHAR_MEMFAULT>(...)");
        GOOSE = new EnumC32978v("GOOSE", 3, "Goose", uuidM104114r2, uuidM104110n2, uuidM104109m2, uuidM104112p2, uuidM104111o2, uuidM104113q2);
        UUID uuidM104120x = AbstractC32979w.m104120x();
        AbstractC22676k.m65749i(uuidM104120x, "<get-WHOOP_MONUMENT_SERVICE_ID>(...)");
        UUID uuidM104116t = AbstractC32979w.m104116t();
        AbstractC22676k.m65749i(uuidM104116t, "<get-WHOOP_MONUMENT_CHAR_CMD_TO_STRAP>(...)");
        UUID uuidM104115s = AbstractC32979w.m104115s();
        AbstractC22676k.m65749i(uuidM104115s, "<get-WHOOP_MONUMENT_CHAR_CMD_FROM_STRAP>(...)");
        UUID uuidM104118v = AbstractC32979w.m104118v();
        AbstractC22676k.m65749i(uuidM104118v, "<get-WHOOP_MONUMENT_CHAR_EVENTS_FROM_STRAP>(...)");
        UUID uuidM104117u = AbstractC32979w.m104117u();
        AbstractC22676k.m65749i(uuidM104117u, "<get-WHOOP_MONUMENT_CHAR_DATA_FROM_STRAP>(...)");
        UUID uuidM104119w = AbstractC32979w.m104119w();
        AbstractC22676k.m65749i(uuidM104119w, "<get-WHOOP_MONUMENT_CHAR_MEMFAULT>(...)");
        MONUMENT = new EnumC32978v("MONUMENT", 4, "Monument", uuidM104120x, uuidM104116t, uuidM104115s, uuidM104118v, uuidM104117u, uuidM104119w);
        UUID uuidM104096D = AbstractC32979w.m104096D();
        AbstractC22676k.m65749i(uuidM104096D, "<get-WHOOP_SYMPHONY_SERVICE_ID>(...)");
        UUID uuidM104122z = AbstractC32979w.m104122z();
        AbstractC22676k.m65749i(uuidM104122z, "<get-WHOOP_SYMPHONY_CHAR_CMD_TO_STRAP>(...)");
        UUID uuidM104121y = AbstractC32979w.m104121y();
        AbstractC22676k.m65749i(uuidM104121y, "<get-WHOOP_SYMPHONY_CHAR_CMD_FROM_STRAP>(...)");
        UUID uuidM104094B = AbstractC32979w.m104094B();
        AbstractC22676k.m65749i(uuidM104094B, "<get-WHOOP_SYMPHONY_CHAR_EVENTS_FROM_STRAP>(...)");
        UUID uuidM104093A = AbstractC32979w.m104093A();
        AbstractC22676k.m65749i(uuidM104093A, "<get-WHOOP_SYMPHONY_CHAR_DATA_FROM_STRAP>(...)");
        UUID uuidM104095C = AbstractC32979w.m104095C();
        AbstractC22676k.m65749i(uuidM104095C, "<get-WHOOP_SYMPHONY_CHAR_MEMFAULT>(...)");
        SYMPHONY = new EnumC32978v("SYMPHONY", 5, "Symphony", uuidM104096D, uuidM104122z, uuidM104121y, uuidM104094B, uuidM104093A, uuidM104095C);
        EnumC32978v[] enumC32978vArr$values = $values();
        $VALUES = enumC32978vArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC32978vArr$values);
        INSTANCE = new Companion(null);
    }

    private EnumC32978v(String str, int i13, String str2, UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, UUID uuid5, UUID uuid6) {
        super(str, i13);
        this.codeName = str2;
        this.serviceId = uuid;
        this.charCmdToStrap = uuid2;
        this.charCmdFromStrap = uuid3;
        this.charEventsFromStrap = uuid4;
        this.charDataFromStrap = uuid5;
        this.charMemFault = uuid6;
    }

    public static final List<EnumC32978v> getAllStrapServiceIds() {
        return INSTANCE.m104088a();
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static final byte getVersionId(EnumC32978v enumC32978v) {
        return INSTANCE.m104091d(enumC32978v);
    }

    public static EnumC32978v valueOf(String str) {
        return (EnumC32978v) Enum.valueOf(EnumC32978v.class, str);
    }

    public static EnumC32978v[] values() {
        return (EnumC32978v[]) $VALUES.clone();
    }

    public final UUID getCharCmdFromStrap() {
        return this.charCmdFromStrap;
    }

    public final UUID getCharCmdToStrap() {
        return this.charCmdToStrap;
    }

    public final UUID getCharDataFromStrap() {
        return this.charDataFromStrap;
    }

    public final UUID getCharEventsFromStrap() {
        return this.charEventsFromStrap;
    }

    public final UUID getCharMemFault() {
        return this.charMemFault;
    }

    public final String getCodeName() {
        return this.codeName;
    }

    public final UUID getServiceId() {
        return this.serviceId;
    }

    public final boolean isGen4() {
        return this == GEN_4;
    }

    public final boolean isGoose() {
        return this == GOOSE;
    }

    public final boolean isMaverick() {
        return this == MAVERICK;
    }

    public final boolean isMaverickOrGoose() {
        return this == MAVERICK || this == GOOSE;
    }
}
