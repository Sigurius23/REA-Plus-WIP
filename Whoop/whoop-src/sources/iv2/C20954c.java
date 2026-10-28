package iv2;

import com.whoop.weightlifting.data.dto.WorkoutDetailsModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: iv2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Liv2/c;", "", "Liv2/a;", "fullScreenModal", "Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;", "result", "<init>", "(Liv2/a;Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liv2/a;", "()Liv2/a;", "b", "Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;", "()Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20954c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC20952a fullScreenModal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final WorkoutDetailsModel result;

    public C20954c(InterfaceC20952a interfaceC20952a, WorkoutDetailsModel workoutDetailsModel) {
        this.fullScreenModal = interfaceC20952a;
        this.result = workoutDetailsModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC20952a getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final WorkoutDetailsModel getResult() {
        return this.result;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20954c)) {
            return false;
        }
        C20954c c20954c = (C20954c) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c20954c.fullScreenModal) && AbstractC22676k.m65745e(this.result, c20954c.result);
    }

    public int hashCode() {
        InterfaceC20952a interfaceC20952a = this.fullScreenModal;
        int iHashCode = (interfaceC20952a == null ? 0 : interfaceC20952a.hashCode()) * 31;
        WorkoutDetailsModel workoutDetailsModel = this.result;
        return iHashCode + (workoutDetailsModel != null ? workoutDetailsModel.hashCode() : 0);
    }

    public String toString() {
        return "WorkoutDetailsDomainState(fullScreenModal=" + this.fullScreenModal + ", result=" + this.result + ")";
    }

    public /* synthetic */ C20954c(InterfaceC20952a interfaceC20952a, WorkoutDetailsModel workoutDetailsModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC20952a, (i13 & 2) != 0 ? null : workoutDetailsModel);
    }
}
