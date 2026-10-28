package zx0;

import com.whoop.deepdive.domain.models.DeepDiveModels;
import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: zx0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006#"}, m65681d2 = {"Lzx0/c;", "", "Lzx0/a;", "currentDialogType", "Lcom/whoop/deepdive/domain/models/DeepDiveModels;", "response", "", "manualRefresh", "displayRefreshingSpinner", "isInHomeCalibrationExperimentTestGroup", "<init>", "(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZ)V", "a", "(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZ)Lzx0/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lzx0/a;", "c", "()Lzx0/a;", "b", "Lcom/whoop/deepdive/domain/models/DeepDiveModels;", "d", "()Lcom/whoop/deepdive/domain/models/DeepDiveModels;", "Z", "getManualRefresh", "()Z", "getDisplayRefreshingSpinner", "e", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41205c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41203a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final DeepDiveModels response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isInHomeCalibrationExperimentTestGroup;

    public C41205c(InterfaceC41203a interfaceC41203a, DeepDiveModels deepDiveModels, boolean z4, boolean z13, boolean z14) {
        this.currentDialogType = interfaceC41203a;
        this.response = deepDiveModels;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
        this.isInHomeCalibrationExperimentTestGroup = z14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C41205c m133848b(C41205c c41205c, InterfaceC41203a interfaceC41203a, DeepDiveModels deepDiveModels, boolean z4, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC41203a = c41205c.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            deepDiveModels = c41205c.response;
        }
        if ((i13 & 4) != 0) {
            z4 = c41205c.manualRefresh;
        }
        if ((i13 & 8) != 0) {
            z13 = c41205c.displayRefreshingSpinner;
        }
        if ((i13 & 16) != 0) {
            z14 = c41205c.isInHomeCalibrationExperimentTestGroup;
        }
        boolean z15 = z14;
        boolean z16 = z4;
        return c41205c.m133849a(interfaceC41203a, deepDiveModels, z16, z13, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C41205c m133849a(InterfaceC41203a currentDialogType, DeepDiveModels response, boolean manualRefresh, boolean displayRefreshingSpinner, boolean isInHomeCalibrationExperimentTestGroup) {
        return new C41205c(currentDialogType, response, manualRefresh, displayRefreshingSpinner, isInHomeCalibrationExperimentTestGroup);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC41203a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DeepDiveModels getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsInHomeCalibrationExperimentTestGroup() {
        return this.isInHomeCalibrationExperimentTestGroup;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41205c)) {
            return false;
        }
        C41205c c41205c = (C41205c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c41205c.currentDialogType) && AbstractC22676k.m65745e(this.response, c41205c.response) && this.manualRefresh == c41205c.manualRefresh && this.displayRefreshingSpinner == c41205c.displayRefreshingSpinner && this.isInHomeCalibrationExperimentTestGroup == c41205c.isInHomeCalibrationExperimentTestGroup;
    }

    public int hashCode() {
        InterfaceC41203a interfaceC41203a = this.currentDialogType;
        int iHashCode = (interfaceC41203a == null ? 0 : interfaceC41203a.hashCode()) * 31;
        DeepDiveModels deepDiveModels = this.response;
        return Boolean.hashCode(this.isInHomeCalibrationExperimentTestGroup) + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (deepDiveModels != null ? deepDiveModels.hashCode() : 0)) * 31, 31, this.manualRefresh), 31, this.displayRefreshingSpinner);
    }

    public String toString() {
        InterfaceC41203a interfaceC41203a = this.currentDialogType;
        DeepDiveModels deepDiveModels = this.response;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        boolean z14 = this.isInHomeCalibrationExperimentTestGroup;
        StringBuilder sb4 = new StringBuilder("DeepDiveDomainState(currentDialogType=");
        sb4.append(interfaceC41203a);
        sb4.append(", response=");
        sb4.append(deepDiveModels);
        sb4.append(", manualRefresh=");
        AbstractC38963t7.m124392v(sb4, z4, ", displayRefreshingSpinner=", z13, ", isInHomeCalibrationExperimentTestGroup=");
        return AbstractC18489d0.m53372m(sb4, z14, ")");
    }

    public /* synthetic */ C41205c(InterfaceC41203a interfaceC41203a, DeepDiveModels deepDiveModels, boolean z4, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC41203a, (i13 & 2) != 0 ? null : deepDiveModels, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14);
    }
}
