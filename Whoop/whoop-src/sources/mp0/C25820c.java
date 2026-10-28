package mp0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mp0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lmp0/c;", "", "Lmp0/b;", "expendedStateFlow", "<init>", "(Lmp0/b;)V", "a", "(Lmp0/b;)Lmp0/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmp0/b;", "b", "()Lmp0/b;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25820c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC25817b expendedStateFlow;

    public C25820c(EnumC25817b expendedStateFlow) {
        AbstractC22676k.m65750j(expendedStateFlow, "expendedStateFlow");
        this.expendedStateFlow = expendedStateFlow;
    }

    /* JADX INFO: renamed from: a */
    public final C25820c m76153a(EnumC25817b expendedStateFlow) {
        AbstractC22676k.m65750j(expendedStateFlow, "expendedStateFlow");
        return new C25820c(expendedStateFlow);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC25817b getExpendedStateFlow() {
        return this.expendedStateFlow;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C25820c) && this.expendedStateFlow == ((C25820c) other).expendedStateFlow;
    }

    public int hashCode() {
        return this.expendedStateFlow.hashCode();
    }

    public String toString() {
        return "AlarmOptionFlowState(expendedStateFlow=" + this.expendedStateFlow + ")";
    }

    public /* synthetic */ C25820c(EnumC25817b enumC25817b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? EnumC25817b.COLLAPSED_STATE_FLOW : enumC25817b);
    }
}
