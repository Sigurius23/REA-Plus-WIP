package sp0;

import ge3.AbstractC15751g;
import n82.EnumC26455a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: sp0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m65681d2 = {"Lsp0/a;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "CARDIO", "RECOVERY", "SLEEP", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC32861a {
    CARDIO,
    RECOVERY,
    SLEEP;

    public static final String CARDIO_TYPE = "Cardio";
    public static final String RECOVERY_TYPE = "Recovery";
    public static final String SLEEP_TYPE = "Sleep";
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: sp0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u00020\n*\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m65681d2 = {"Lsp0/a$a;", "", "<init>", "()V", "", "Lsp0/a;", "a", "(Ljava/lang/String;)Lsp0/a;", "b", "(Lsp0/a;)Ljava/lang/String;", "Ln82/a;", "c", "(Lsp0/a;)Ln82/a;", "CARDIO_TYPE", "Ljava/lang/String;", "RECOVERY_TYPE", "SLEEP_TYPE", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: sp0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C42340a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f136896a;

            static {
                int[] iArr = new int[EnumC32861a.values().length];
                try {
                    iArr[EnumC32861a.RECOVERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC32861a.CARDIO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC32861a.SLEEP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f136896a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC32861a m103130a(String str) {
            AbstractC22676k.m65750j(str, "<this>");
            if (str.equalsIgnoreCase("Cardio")) {
                return EnumC32861a.CARDIO;
            }
            if (str.equalsIgnoreCase("Recovery")) {
                return EnumC32861a.RECOVERY;
            }
            return str.equalsIgnoreCase("Sleep") ? EnumC32861a.SLEEP : EnumC32861a.CARDIO;
        }

        /* JADX INFO: renamed from: b */
        public final String m103131b(EnumC32861a enumC32861a) {
            AbstractC22676k.m65750j(enumC32861a, "<this>");
            int i13 = C42340a.f136896a[enumC32861a.ordinal()];
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

        /* JADX INFO: renamed from: c */
        public final EnumC26455a m103132c(EnumC32861a enumC32861a) {
            AbstractC22676k.m65750j(enumC32861a, "<this>");
            int i13 = C42340a.f136896a[enumC32861a.ordinal()];
            if (i13 == 1) {
                return EnumC26455a.RECOVERY;
            }
            if (i13 == 2) {
                return EnumC26455a.STRAIN;
            }
            if (i13 == 3) {
                return EnumC26455a.SLEEP;
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
