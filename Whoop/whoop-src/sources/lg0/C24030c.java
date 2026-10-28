package lg0;

import com.whoop.advancedlabsmanagement.domain.models.AdvancedLabsManagementModels;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lg0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, m65681d2 = {"Llg0/c;", "", "Llg0/a;", "currentDialogType", "Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;", "response", "", "manualRefresh", "displayRefreshingSpinner", "<init>", "(Llg0/a;Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Llg0/a;", "()Llg0/a;", "b", "Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;", "()Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;", "c", "Z", "getManualRefresh", "()Z", "d", "getDisplayRefreshingSpinner", "advanced-labs-management_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24030c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC24028a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AdvancedLabsManagementModels response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    public C24030c(InterfaceC24028a interfaceC24028a, AdvancedLabsManagementModels advancedLabsManagementModels, boolean z4, boolean z13) {
        this.currentDialogType = interfaceC24028a;
        this.response = advancedLabsManagementModels;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC24028a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AdvancedLabsManagementModels getResponse() {
        return this.response;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24030c)) {
            return false;
        }
        C24030c c24030c = (C24030c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c24030c.currentDialogType) && AbstractC22676k.m65745e(this.response, c24030c.response) && this.manualRefresh == c24030c.manualRefresh && this.displayRefreshingSpinner == c24030c.displayRefreshingSpinner;
    }

    public int hashCode() {
        InterfaceC24028a interfaceC24028a = this.currentDialogType;
        int iHashCode = (interfaceC24028a == null ? 0 : interfaceC24028a.hashCode()) * 31;
        AdvancedLabsManagementModels advancedLabsManagementModels = this.response;
        return Boolean.hashCode(this.displayRefreshingSpinner) + AbstractC2875y.m8289b((iHashCode + (advancedLabsManagementModels != null ? advancedLabsManagementModels.hashCode() : 0)) * 31, 31, this.manualRefresh);
    }

    public String toString() {
        InterfaceC24028a interfaceC24028a = this.currentDialogType;
        AdvancedLabsManagementModels advancedLabsManagementModels = this.response;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        StringBuilder sb4 = new StringBuilder("AdvancedLabsManagementDomainState(currentDialogType=");
        sb4.append(interfaceC24028a);
        sb4.append(", response=");
        sb4.append(advancedLabsManagementModels);
        sb4.append(", manualRefresh=");
        return AbstractC36095b.m114682j(sb4, z4, ", displayRefreshingSpinner=", z13, ")");
    }

    public /* synthetic */ C24030c(InterfaceC24028a interfaceC24028a, AdvancedLabsManagementModels advancedLabsManagementModels, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC24028a, (i13 & 2) != 0 ? null : advancedLabsManagementModels, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13);
    }
}
