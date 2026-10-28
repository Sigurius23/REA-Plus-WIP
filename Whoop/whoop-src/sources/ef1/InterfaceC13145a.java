package ef1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ef1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lef1/a;", "", "g", "e", "f", "b", "c", "d", "a", "Lef1/a$a;", "Lef1/a$d;", "Lef1/a$g;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC13145a {

    /* JADX INFO: renamed from: ef1.a$a */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lef1/a$a;", "Lef1/a;", "c", "b", "a", "Lef1/a$a$a;", "Lef1/a$a$b;", "Lef1/a$a$c;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a extends InterfaceC13145a {

        /* JADX INFO: renamed from: ef1.a$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lef1/a$a$a;", "Lef1/a$a;", "", "timePeriod", "exerciseName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41523a implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String timePeriod;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String exerciseName;

            public C41523a(String timePeriod, String exerciseName) {
                AbstractC22676k.m65750j(timePeriod, "timePeriod");
                AbstractC22676k.m65750j(exerciseName, "exerciseName");
                this.timePeriod = timePeriod;
                this.exerciseName = exerciseName;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getExerciseName() {
                return this.exerciseName;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getTimePeriod() {
                return this.timePeriod;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C41523a)) {
                    return false;
                }
                C41523a c41523a = (C41523a) other;
                return AbstractC22676k.m65745e(this.timePeriod, c41523a.timePeriod) && AbstractC22676k.m65745e(this.exerciseName, c41523a.exerciseName);
            }

            public int hashCode() {
                return this.exerciseName.hashCode() + (this.timePeriod.hashCode() * 31);
            }

            public String toString() {
                return AbstractC2875y.m8300m("TrackChangeTimePeriod(timePeriod=", this.timePeriod, ", exerciseName=", this.exerciseName, ")");
            }
        }

        /* JADX INFO: renamed from: ef1.a$a$b */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001d\u0010\u000e¨\u0006 "}, m65681d2 = {"Lef1/a$a$b;", "Lef1/a$a;", "", "scrubValue", "startDate", "endDate", "exerciseName", "timePeriod", "pressedDate", "backDate", "forwardDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "g", "c", "d", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String scrubValue;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String startDate;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final String endDate;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final String exerciseName;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final String timePeriod;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final String pressedDate;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final String backDate;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final String forwardDate;

            public b(String scrubValue, String startDate, String endDate, String exerciseName, String timePeriod, String pressedDate, String backDate, String forwardDate) {
                AbstractC22676k.m65750j(scrubValue, "scrubValue");
                AbstractC22676k.m65750j(startDate, "startDate");
                AbstractC22676k.m65750j(endDate, "endDate");
                AbstractC22676k.m65750j(exerciseName, "exerciseName");
                AbstractC22676k.m65750j(timePeriod, "timePeriod");
                AbstractC22676k.m65750j(pressedDate, "pressedDate");
                AbstractC22676k.m65750j(backDate, "backDate");
                AbstractC22676k.m65750j(forwardDate, "forwardDate");
                this.scrubValue = scrubValue;
                this.startDate = startDate;
                this.endDate = endDate;
                this.exerciseName = exerciseName;
                this.timePeriod = timePeriod;
                this.pressedDate = pressedDate;
                this.backDate = backDate;
                this.forwardDate = forwardDate;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getBackDate() {
                return this.backDate;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getEndDate() {
                return this.endDate;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getExerciseName() {
                return this.exerciseName;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getForwardDate() {
                return this.forwardDate;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getPressedDate() {
                return this.pressedDate;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return AbstractC22676k.m65745e(this.scrubValue, bVar.scrubValue) && AbstractC22676k.m65745e(this.startDate, bVar.startDate) && AbstractC22676k.m65745e(this.endDate, bVar.endDate) && AbstractC22676k.m65745e(this.exerciseName, bVar.exerciseName) && AbstractC22676k.m65745e(this.timePeriod, bVar.timePeriod) && AbstractC22676k.m65745e(this.pressedDate, bVar.pressedDate) && AbstractC22676k.m65745e(this.backDate, bVar.backDate) && AbstractC22676k.m65745e(this.forwardDate, bVar.forwardDate);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getScrubValue() {
                return this.scrubValue;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getStartDate() {
                return this.startDate;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getTimePeriod() {
                return this.timePeriod;
            }

            public int hashCode() {
                return this.forwardDate.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.scrubValue.hashCode() * 31, 31, this.startDate), 31, this.endDate), 31, this.exerciseName), 31, this.timePeriod), 31, this.pressedDate), 31, this.backDate);
            }

            public String toString() {
                String str = this.scrubValue;
                String str2 = this.startDate;
                String str3 = this.endDate;
                String str4 = this.exerciseName;
                String str5 = this.timePeriod;
                String str6 = this.pressedDate;
                String str7 = this.backDate;
                String str8 = this.forwardDate;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("TrackDateNavigation(scrubValue=", str, ", startDate=", str2, ", endDate=");
                AbstractC11266d.m30444B(sbM32001t, str3, ", exerciseName=", str4, ", timePeriod=");
                AbstractC11266d.m30444B(sbM32001t, str5, ", pressedDate=", str6, ", backDate=");
                return AbstractC11266d.m30464r(sbM32001t, str7, ", forwardDate=", str8, ")");
            }
        }

        /* JADX INFO: renamed from: ef1.a$a$c */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lef1/a$a$c;", "Lef1/a$a;", "", "scrubValue", "timePeriod", "exerciseName", "exerciseType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String scrubValue;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String timePeriod;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final String exerciseName;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final String exerciseType;

            public c(String scrubValue, String timePeriod, String exerciseName, String exerciseType) {
                AbstractC22676k.m65750j(scrubValue, "scrubValue");
                AbstractC22676k.m65750j(timePeriod, "timePeriod");
                AbstractC22676k.m65750j(exerciseName, "exerciseName");
                AbstractC22676k.m65750j(exerciseType, "exerciseType");
                this.scrubValue = scrubValue;
                this.timePeriod = timePeriod;
                this.exerciseName = exerciseName;
                this.exerciseType = exerciseType;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getExerciseName() {
                return this.exerciseName;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getExerciseType() {
                return this.exerciseType;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getScrubValue() {
                return this.scrubValue;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getTimePeriod() {
                return this.timePeriod;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof c)) {
                    return false;
                }
                c cVar = (c) other;
                return AbstractC22676k.m65745e(this.scrubValue, cVar.scrubValue) && AbstractC22676k.m65745e(this.timePeriod, cVar.timePeriod) && AbstractC22676k.m65745e(this.exerciseName, cVar.exerciseName) && AbstractC22676k.m65745e(this.exerciseType, cVar.exerciseType);
            }

            public int hashCode() {
                return this.exerciseType.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.scrubValue.hashCode() * 31, 31, this.timePeriod), 31, this.exerciseName);
            }

            public String toString() {
                String str = this.scrubValue;
                String str2 = this.timePeriod;
                return AbstractC11266d.m30464r(AbstractC11895b.m32001t("TrackGraphScrub(scrubValue=", str, ", timePeriod=", str2, ", exerciseName="), this.exerciseName, ", exerciseType=", this.exerciseType, ")");
            }
        }
    }

    /* JADX INFO: renamed from: ef1.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lef1/a$b;", "Lef1/a$g;", "", "path", "newDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String newDate;

        public b(String path, String newDate) {
            AbstractC22676k.m65750j(path, "path");
            AbstractC22676k.m65750j(newDate, "newDate");
            this.path = path;
            this.newDate = newDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNewDate() {
            return this.newDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.path, bVar.path) && AbstractC22676k.m65745e(this.newDate, bVar.newDate);
        }

        public int hashCode() {
            return this.newDate.hashCode() + (this.path.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("ChangeDate(path=", this.path, ", newDate=", this.newDate, ")");
        }
    }

    /* JADX INFO: renamed from: ef1.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lef1/a$c;", "Lef1/a$g;", "", "index", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int index;

        public c(int i13) {
            this.index = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.index == ((c) other).index;
        }

        public int hashCode() {
            return Integer.hashCode(this.index);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.index, "ChangeSelectedIndex(index=", ")");
        }
    }

    /* JADX INFO: renamed from: ef1.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lef1/a$d;", "Lef1/a;", "", "selectedIndex", "", "action", "<init>", "(ILjava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC13145a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int selectedIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Object action;

        public d(int i13, Object action) {
            AbstractC22676k.m65750j(action, "action");
            this.selectedIndex = i13;
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSelectedIndex() {
            return this.selectedIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.selectedIndex == dVar.selectedIndex && AbstractC22676k.m65745e(this.action, dVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (Integer.hashCode(this.selectedIndex) * 31);
        }

        public String toString() {
            return "GraphViewEvent(selectedIndex=" + this.selectedIndex + ", action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: ef1.a$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lef1/a$e;", "Lef1/a$g;", "", "path", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        public e(String path) {
            AbstractC22676k.m65750j(path, "path");
            this.path = path;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.path, ((e) other).path);
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("InitialLoad(path=", this.path, ")");
        }
    }

    /* JADX INFO: renamed from: ef1.a$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lef1/a$f;", "Lef1/a$g;", "", "path", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        public f(String path) {
            AbstractC22676k.m65750j(path, "path");
            this.path = path;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.path, ((f) other).path);
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Refresh(path=", this.path, ")");
        }
    }

    /* JADX INFO: renamed from: ef1.a$g */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lef1/a$g;", "Lef1/a;", "Lef1/a$b;", "Lef1/a$c;", "Lef1/a$e;", "Lef1/a$f;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface g extends InterfaceC13145a {
    }
}
