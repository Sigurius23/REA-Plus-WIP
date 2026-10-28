package hw0;

import ge3.AbstractC15751g;
import mc1.C25420e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: hw0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m65681d2 = {"Lhw0/a;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "CARDIO", "RECOVERY", "SLEEP", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC17696a {
    CARDIO,
    RECOVERY,
    SLEEP;

    public static final String CARDIO_TYPE = "Cardio";
    public static final String RECOVERY_TYPE = "Recovery";
    public static final String SLEEP_TYPE = "Sleep";
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: hw0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u00020\n*\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m65681d2 = {"Lhw0/a$a;", "", "<init>", "()V", "", "Lhw0/a;", "b", "(Ljava/lang/String;)Lhw0/a;", "a", "(Lhw0/a;)Ljava/lang/String;", "Lmc1/e$a;", "c", "(Lhw0/a;)Lmc1/e$a;", "CARDIO_TYPE", "Ljava/lang/String;", "RECOVERY_TYPE", "SLEEP_TYPE", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: hw0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C41713a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f68654a;

            static {
                int[] iArr = new int[EnumC17696a.values().length];
                try {
                    iArr[EnumC17696a.RECOVERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC17696a.CARDIO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC17696a.SLEEP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f68654a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m50565a(EnumC17696a enumC17696a) {
            AbstractC22676k.m65750j(enumC17696a, "<this>");
            int i13 = C41713a.f68654a[enumC17696a.ordinal()];
            if (i13 == 1) {
                return "Recovery";
            }
            if (i13 == 2) {
                return "Cardio";
            }
            if (i13 == 3) {
                return "Sleep";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: renamed from: b */
        public final EnumC17696a m50566b(String str) {
            AbstractC22676k.m65750j(str, "<this>");
            int iHashCode = str.hashCode();
            if (iHashCode != -734469195) {
                if (iHashCode != 79969975) {
                    if (iHashCode == 2011230294 && str.equals("Cardio")) {
                        return EnumC17696a.CARDIO;
                    }
                } else if (str.equals("Sleep")) {
                    return EnumC17696a.SLEEP;
                }
            } else if (str.equals("Recovery")) {
                return EnumC17696a.RECOVERY;
            }
            return EnumC17696a.CARDIO;
        }

        /* JADX INFO: renamed from: c */
        public final C25420e.a m50567c(EnumC17696a enumC17696a) {
            AbstractC22676k.m65750j(enumC17696a, "<this>");
            int i13 = C41713a.f68654a[enumC17696a.ordinal()];
            if (i13 == 1) {
                return C25420e.a.RECOVERY;
            }
            if (i13 == 2) {
                return C25420e.a.CARDIO;
            }
            if (i13 == 3) {
                return C25420e.a.SLEEP;
            }
            throw new NoWhenBranchMatchedException();
        }

        private Companion() {
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
