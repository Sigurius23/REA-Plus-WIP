package he0;

import com.whoop.advancedlabs.domain.models.SchedulingStepScreenModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: he0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lhe0/b;", "", "<init>", "()V", "a", "b", "Lhe0/b$a;", "Lhe0/b$b;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17210b {

    /* JADX INFO: renamed from: he0.b$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhe0/b$a;", "Lhe0/b;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC17210b {

        /* JADX INFO: renamed from: a */
        public static final a f66106a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: he0.b$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhe0/b$b;", "Lhe0/b;", "Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;", "stepScreenModel", "<init>", "(Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;", "()Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC17210b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final SchedulingStepScreenModel stepScreenModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SchedulingStepScreenModel stepScreenModel) {
            super(null);
            AbstractC22676k.m65750j(stepScreenModel, "stepScreenModel");
            this.stepScreenModel = stepScreenModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SchedulingStepScreenModel getStepScreenModel() {
            return this.stepScreenModel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.stepScreenModel, ((b) other).stepScreenModel);
        }

        public int hashCode() {
            return this.stepScreenModel.hashCode();
        }

        public String toString() {
            return "Success(stepScreenModel=" + this.stepScreenModel + ")";
        }
    }

    public /* synthetic */ AbstractC17210b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC17210b() {
    }
}
