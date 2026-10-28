package mi1;

import com.whoop.domain.model.haptics.HapticsAlarmStatusMessage;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mi1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lmi1/b;", "", "<init>", "()V", "f", "d", "e", "b", "c", "a", "Lmi1/b$a;", "Lmi1/b$b;", "Lmi1/b$c;", "Lmi1/b$d;", "Lmi1/b$e;", "Lmi1/b$f;", "hapticsStrapService_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25573b {

    /* JADX INFO: renamed from: mi1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lmi1/b$a;", "Lmi1/b;", "", "isAlarmActive", "", "alarmTime", "<init>", "(ZJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "J", "getAlarmTime", "()J", "hapticsStrapService_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC25573b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isAlarmActive;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long alarmTime;

        public a(boolean z4, long j7) {
            super(null);
            this.isAlarmActive = z4;
            this.alarmTime = j7;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsAlarmActive() {
            return this.isAlarmActive;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.isAlarmActive == aVar.isAlarmActive && this.alarmTime == aVar.alarmTime;
        }

        public int hashCode() {
            return Long.hashCode(this.alarmTime) + (Boolean.hashCode(this.isAlarmActive) * 31);
        }

        public String toString() {
            return "AlarmTime(isAlarmActive=" + this.isAlarmActive + ", alarmTime=" + this.alarmTime + ")";
        }
    }

    /* JADX INFO: renamed from: mi1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lmi1/b$b;", "Lmi1/b;", "Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;", "statusMessage", "<init>", "(Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;", "getStatusMessage", "()Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;", "hapticsStrapService_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC25573b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HapticsAlarmStatusMessage statusMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HapticsAlarmStatusMessage statusMessage) {
            super(null);
            AbstractC22676k.m65750j(statusMessage, "statusMessage");
            this.statusMessage = statusMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.statusMessage == ((b) other).statusMessage;
        }

        public int hashCode() {
            return this.statusMessage.hashCode();
        }

        public String toString() {
            return "CommandFailed(statusMessage=" + this.statusMessage + ")";
        }
    }

    /* JADX INFO: renamed from: mi1.b$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lmi1/b$c;", "Lmi1/b;", "Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;", "statusMessage", "<init>", "(Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;", "getStatusMessage", "()Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;", "hapticsStrapService_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC25573b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HapticsAlarmStatusMessage statusMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HapticsAlarmStatusMessage statusMessage) {
            super(null);
            AbstractC22676k.m65750j(statusMessage, "statusMessage");
            this.statusMessage = statusMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.statusMessage == ((c) other).statusMessage;
        }

        public int hashCode() {
            return this.statusMessage.hashCode();
        }

        public String toString() {
            return "CommandSucceeded(statusMessage=" + this.statusMessage + ")";
        }
    }

    /* JADX INFO: renamed from: mi1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmi1/b$d;", "Lmi1/b;", "<init>", "()V", "hapticsStrapService_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC25573b {

        /* JADX INFO: renamed from: a */
        public static final d f100272a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: mi1.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lmi1/b$e;", "Lmi1/b;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "hapticsStrapService_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC25573b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String message) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.message, ((e) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DomainError(message=", this.message, ")");
        }
    }

    /* JADX INFO: renamed from: mi1.b$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmi1/b$f;", "Lmi1/b;", "<init>", "()V", "hapticsStrapService_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC25573b {

        /* JADX INFO: renamed from: a */
        public static final f f100274a = new f();

        private f() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC25573b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC25573b() {
    }
}
