package rv2;

import ge3.AbstractC15751g;
import java.util.List;
import n83.C26460c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: rv2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m65681d2 = {"Lrv2/f;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "EXERCISE_PROGRESSION", "PERSONAL_WORKOUTS", "WHOOP_WORKOUTS", "PENDING_SESSIONS", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC31848f {
    EXERCISE_PROGRESSION,
    PERSONAL_WORKOUTS,
    WHOOP_WORKOUTS,
    PENDING_SESSIONS;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: rv2.f$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lrv2/f$a;", "", "<init>", "()V", "", "showPendingSessions", "", "Lrv2/f;", "a", "(Z)Ljava/util/List;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final List<EnumC31848f> m98992a(boolean showPendingSessions) {
            C26460c c26460cM119000x = AbstractC37056f.m119000x();
            c26460cM119000x.add(EnumC31848f.EXERCISE_PROGRESSION);
            c26460cM119000x.add(EnumC31848f.PERSONAL_WORKOUTS);
            c26460cM119000x.add(EnumC31848f.WHOOP_WORKOUTS);
            if (showPendingSessions) {
                c26460cM119000x.add(EnumC31848f.PENDING_SESSIONS);
            }
            return AbstractC37056f.m118988k(c26460cM119000x);
        }

        private Companion() {
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
