package live.hms.video.factories.noisecancellation;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Llive/hms/video/factories/noisecancellation/AvailabilityStatus;", "", "<init>", "()V", "Available", "NotAvailable", "Llive/hms/video/factories/noisecancellation/AvailabilityStatus$Available;", "Llive/hms/video/factories/noisecancellation/AvailabilityStatus$NotAvailable;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class AvailabilityStatus {

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/factories/noisecancellation/AvailabilityStatus$Available;", "Llive/hms/video/factories/noisecancellation/AvailabilityStatus;", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Available extends AvailabilityStatus {
        public static final Available INSTANCE = new Available();

        private Available() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Llive/hms/video/factories/noisecancellation/AvailabilityStatus$NotAvailable;", "Llive/hms/video/factories/noisecancellation/AvailabilityStatus;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class NotAvailable extends AvailabilityStatus {
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotAvailable(String reason) {
            super(null);
            AbstractC22676k.m65750j(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ NotAvailable copy$default(NotAvailable notAvailable, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = notAvailable.reason;
            }
            return notAvailable.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final NotAvailable copy(String reason) {
            AbstractC22676k.m65750j(reason, "reason");
            return new NotAvailable(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotAvailable) && AbstractC22676k.m65745e(this.reason, ((NotAvailable) other).reason);
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return AbstractC25012a.m73377j(new StringBuilder("NotAvailable(reason="), this.reason, ')');
        }
    }

    public /* synthetic */ AvailabilityStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AvailabilityStatus() {
    }
}
