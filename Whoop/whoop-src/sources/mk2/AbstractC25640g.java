package mk2;

import java.time.OffsetDateTime;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mk2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lmk2/g;", "", "<init>", "()V", "c", "d", "b", "a", "Lmk2/g$a;", "Lmk2/g$b;", "Lmk2/g$c;", "Lmk2/g$d;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
abstract class AbstractC25640g {

    /* JADX INFO: renamed from: mk2.g$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lmk2/g$a;", "Lmk2/g;", "Ljava/time/OffsetDateTime;", "startTime", "endTime", "", "activityInternalName", "<init>", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "c", "()Ljava/time/OffsetDateTime;", "b", "Ljava/lang/String;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC25640g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final OffsetDateTime startTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final OffsetDateTime endTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String activityInternalName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(OffsetDateTime startTime, OffsetDateTime endTime, String activityInternalName) {
            super(null);
            AbstractC22676k.m65750j(startTime, "startTime");
            AbstractC22676k.m65750j(endTime, "endTime");
            AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
            this.startTime = startTime;
            this.endTime = endTime;
            this.activityInternalName = activityInternalName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityInternalName() {
            return this.activityInternalName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OffsetDateTime getEndTime() {
            return this.endTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final OffsetDateTime getStartTime() {
            return this.startTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.startTime, aVar.startTime) && AbstractC22676k.m65745e(this.endTime, aVar.endTime) && AbstractC22676k.m65745e(this.activityInternalName, aVar.activityInternalName);
        }

        public int hashCode() {
            return this.activityInternalName.hashCode() + ((this.endTime.hashCode() + (this.startTime.hashCode() * 31)) * 31);
        }

        public String toString() {
            OffsetDateTime offsetDateTime = this.startTime;
            OffsetDateTime offsetDateTime2 = this.endTime;
            String str = this.activityInternalName;
            StringBuilder sb4 = new StringBuilder("Conflict(startTime=");
            sb4.append(offsetDateTime);
            sb4.append(", endTime=");
            sb4.append(offsetDateTime2);
            sb4.append(", activityInternalName=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: mk2.g$b */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmk2/g$b;", "Lmk2/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC25640g {

        /* JADX INFO: renamed from: a */
        public static final b f100595a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 998799479;
        }

        public String toString() {
            return "Lost";
        }
    }

    /* JADX INFO: renamed from: mk2.g$c */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmk2/g$c;", "Lmk2/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC25640g {

        /* JADX INFO: renamed from: a */
        public static final c f100596a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 904062868;
        }

        public String toString() {
            return "Saved";
        }
    }

    /* JADX INFO: renamed from: mk2.g$d */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmk2/g$d;", "Lmk2/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC25640g {

        /* JADX INFO: renamed from: a */
        public static final d f100597a = new d();

        private d() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return 208916399;
        }

        public String toString() {
            return "SavedOffline";
        }
    }

    public /* synthetic */ AbstractC25640g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC25640g() {
    }
}
