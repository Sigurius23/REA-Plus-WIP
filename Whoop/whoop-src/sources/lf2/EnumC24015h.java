package lf2;

import af2.EnumC0819i;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: lf2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m65681d2 = {"Llf2/h;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "PEAK", "PERFORM", "GET_BY", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC24015h {
    PEAK,
    PERFORM,
    GET_BY;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lf2.h$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u00020\u0004*\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Llf2/h$a;", "", "<init>", "()V", "Laf2/i;", WeeklyPlanApiKt.GOAL, "Llf2/h;", "a", "(Laf2/i;)Llf2/h;", "b", "(Llf2/h;)Laf2/i;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: lf2.h$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C41947a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f94813a;

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ int[] f94814b;

            static {
                int[] iArr = new int[EnumC0819i.values().length];
                try {
                    iArr[EnumC0819i.PEAK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0819i.PERFORM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC0819i.GET_BY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f94813a = iArr;
                int[] iArr2 = new int[EnumC24015h.values().length];
                try {
                    iArr2[EnumC24015h.PEAK.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[EnumC24015h.PERFORM.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[EnumC24015h.GET_BY.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                f94814b = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC24015h m70838a(EnumC0819i goal) {
            AbstractC22676k.m65750j(goal, "goal");
            int i13 = C41947a.f94813a[goal.ordinal()];
            if (i13 == 1) {
                return EnumC24015h.PEAK;
            }
            if (i13 == 2) {
                return EnumC24015h.PERFORM;
            }
            if (i13 == 3) {
                return EnumC24015h.GET_BY;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: renamed from: b */
        public final EnumC0819i m70839b(EnumC24015h enumC24015h) {
            AbstractC22676k.m65750j(enumC24015h, "<this>");
            int i13 = C41947a.f94814b[enumC24015h.ordinal()];
            if (i13 == 1) {
                return EnumC0819i.PEAK;
            }
            if (i13 == 2) {
                return EnumC0819i.PERFORM;
            }
            if (i13 == 3) {
                return EnumC0819i.GET_BY;
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
