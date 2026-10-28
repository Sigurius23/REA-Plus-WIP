package tv2;

import com.whoop.weightlifting.data.dto.LinkWorkoutModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tv2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ltv2/c;", "", "Ltv2/a;", "currentDialogType", "Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;", "bffModel", "<init>", "(Ltv2/a;Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltv2/a;", "b", "()Ltv2/a;", "Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;", "()Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34210c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34208a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LinkWorkoutModel bffModel;

    public C34210c(InterfaceC34208a interfaceC34208a, LinkWorkoutModel linkWorkoutModel) {
        this.currentDialogType = interfaceC34208a;
        this.bffModel = linkWorkoutModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LinkWorkoutModel getBffModel() {
        return this.bffModel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC34208a getCurrentDialogType() {
        return this.currentDialogType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34210c)) {
            return false;
        }
        C34210c c34210c = (C34210c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c34210c.currentDialogType) && AbstractC22676k.m65745e(this.bffModel, c34210c.bffModel);
    }

    public int hashCode() {
        InterfaceC34208a interfaceC34208a = this.currentDialogType;
        int iHashCode = (interfaceC34208a == null ? 0 : interfaceC34208a.hashCode()) * 31;
        LinkWorkoutModel linkWorkoutModel = this.bffModel;
        return iHashCode + (linkWorkoutModel != null ? linkWorkoutModel.hashCode() : 0);
    }

    public String toString() {
        return "LinkWorkoutDomainState(currentDialogType=" + this.currentDialogType + ", bffModel=" + this.bffModel + ")";
    }
}
