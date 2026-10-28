package lf2;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import xe2.EnumC38232a;

/* JADX INFO: renamed from: lf2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m65681d2 = {"Llf2/b;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "EXACT_TIME", "SLEEP_GOAL", "IN_THE_GREEN", "NO_ALARM", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC24009b {
    EXACT_TIME,
    SLEEP_GOAL,
    IN_THE_GREEN,
    NO_ALARM;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lf2.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u00020\u0004*\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Llf2/b$a;", "", "<init>", "()V", "Lxe2/a;", "mode", "Llf2/b;", "a", "(Lxe2/a;)Llf2/b;", "b", "(Llf2/b;)Lxe2/a;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: lf2.b$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C41946a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f94790a;

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ int[] f94791b;

            static {
                int[] iArr = new int[EnumC38232a.values().length];
                try {
                    iArr[EnumC38232a.EXACT_TIME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC38232a.SLEEP_GOAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC38232a.IN_THE_GREEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC38232a.NO_ALARM.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f94790a = iArr;
                int[] iArr2 = new int[EnumC24009b.values().length];
                try {
                    iArr2[EnumC24009b.EXACT_TIME.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[EnumC24009b.SLEEP_GOAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[EnumC24009b.IN_THE_GREEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[EnumC24009b.NO_ALARM.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                f94791b = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC24009b m70817a(EnumC38232a mode) {
            AbstractC22676k.m65750j(mode, "mode");
            int i13 = C41946a.f94790a[mode.ordinal()];
            if (i13 == 1) {
                return EnumC24009b.EXACT_TIME;
            }
            if (i13 == 2) {
                return EnumC24009b.SLEEP_GOAL;
            }
            if (i13 == 3) {
                return EnumC24009b.IN_THE_GREEN;
            }
            if (i13 == 4) {
                return EnumC24009b.NO_ALARM;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: renamed from: b */
        public final EnumC38232a m70818b(EnumC24009b enumC24009b) {
            AbstractC22676k.m65750j(enumC24009b, "<this>");
            int i13 = C41946a.f94791b[enumC24009b.ordinal()];
            if (i13 == 1) {
                return EnumC38232a.EXACT_TIME;
            }
            if (i13 == 2) {
                return EnumC38232a.SLEEP_GOAL;
            }
            if (i13 == 3) {
                return EnumC38232a.IN_THE_GREEN;
            }
            if (i13 == 4) {
                return EnumC38232a.NO_ALARM;
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
