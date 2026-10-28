package cf1;

import com.whoop.exerciseprogressminiarch.domain.models.ExerciseProgressModels;
import d13.AbstractC11478a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: cf1.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lcf1/c;", "", "Lcf1/a;", "currentDialogType", "Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;", "response", "", "selectedIndex", "<init>", "(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;)V", "a", "(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;)Lcf1/c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcf1/a;", "c", "()Lcf1/a;", "b", "Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;", "d", "()Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4543c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4541a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ExerciseProgressModels response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer selectedIndex;

    public C4543c(InterfaceC4541a interfaceC4541a, ExerciseProgressModels exerciseProgressModels, Integer num) {
        this.currentDialogType = interfaceC4541a;
        this.response = exerciseProgressModels;
        this.selectedIndex = num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4543c m14208b(C4543c c4543c, InterfaceC4541a interfaceC4541a, ExerciseProgressModels exerciseProgressModels, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC4541a = c4543c.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            exerciseProgressModels = c4543c.response;
        }
        if ((i13 & 4) != 0) {
            num = c4543c.selectedIndex;
        }
        return c4543c.m14209a(interfaceC4541a, exerciseProgressModels, num);
    }

    /* JADX INFO: renamed from: a */
    public final C4543c m14209a(InterfaceC4541a currentDialogType, ExerciseProgressModels response, Integer selectedIndex) {
        return new C4543c(currentDialogType, response, selectedIndex);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC4541a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ExerciseProgressModels getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4543c)) {
            return false;
        }
        C4543c c4543c = (C4543c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c4543c.currentDialogType) && AbstractC22676k.m65745e(this.response, c4543c.response) && AbstractC22676k.m65745e(this.selectedIndex, c4543c.selectedIndex);
    }

    public int hashCode() {
        InterfaceC4541a interfaceC4541a = this.currentDialogType;
        int iHashCode = (interfaceC4541a == null ? 0 : interfaceC4541a.hashCode()) * 31;
        ExerciseProgressModels exerciseProgressModels = this.response;
        int iHashCode2 = (iHashCode + (exerciseProgressModels == null ? 0 : exerciseProgressModels.hashCode())) * 31;
        Integer num = this.selectedIndex;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        InterfaceC4541a interfaceC4541a = this.currentDialogType;
        ExerciseProgressModels exerciseProgressModels = this.response;
        Integer num = this.selectedIndex;
        StringBuilder sb4 = new StringBuilder("ExerciseProgressDomainState(currentDialogType=");
        sb4.append(interfaceC4541a);
        sb4.append(", response=");
        sb4.append(exerciseProgressModels);
        sb4.append(", selectedIndex=");
        return AbstractC11478a.m30859k(sb4, num, ")");
    }

    public /* synthetic */ C4543c(InterfaceC4541a interfaceC4541a, ExerciseProgressModels exerciseProgressModels, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC4541a, (i13 & 2) != 0 ? null : exerciseProgressModels, (i13 & 4) != 0 ? null : num);
    }
}
