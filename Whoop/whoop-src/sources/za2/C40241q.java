package za2;

import com.whoop.design.models.modal.AnyModal;
import java.util.List;
import l01.C23042n;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xc2.InterfaceC38193d;

/* JADX INFO: renamed from: za2.q */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b\"\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b\u001d\u0010(¨\u0006)"}, m65681d2 = {"Lza2/q;", "", "", "isLoading", "isError", "", "Lza2/l;", "items", "Lxc2/d;", "switchBillingPlanModal", "Ll01/n;", "upsellCardFeaturesState", "Lcom/whoop/design/models/modal/AnyModal;", "presentedModal", "<init>", "(ZZLjava/util/List;Lxc2/d;Ll01/n;Lcom/whoop/design/models/modal/AnyModal;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "f", "()Z", "b", "e", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lxc2/d;", "()Lxc2/d;", "Ll01/n;", "()Ll01/n;", "Lcom/whoop/design/models/modal/AnyModal;", "()Lcom/whoop/design/models/modal/AnyModal;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40241q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C40236l> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC38193d switchBillingPlanModal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C23042n upsellCardFeaturesState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AnyModal presentedModal;

    public C40241q(boolean z4, boolean z13, List<C40236l> items, InterfaceC38193d interfaceC38193d, C23042n c23042n, AnyModal anyModal) {
        AbstractC22676k.m65750j(items, "items");
        this.isLoading = z4;
        this.isError = z13;
        this.items = items;
        this.switchBillingPlanModal = interfaceC38193d;
        this.upsellCardFeaturesState = c23042n;
        this.presentedModal = anyModal;
    }

    /* JADX INFO: renamed from: a */
    public final List<C40236l> m129237a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AnyModal getPresentedModal() {
        return this.presentedModal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC38193d getSwitchBillingPlanModal() {
        return this.switchBillingPlanModal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C23042n getUpsellCardFeaturesState() {
        return this.upsellCardFeaturesState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40241q)) {
            return false;
        }
        C40241q c40241q = (C40241q) other;
        return this.isLoading == c40241q.isLoading && this.isError == c40241q.isError && AbstractC22676k.m65745e(this.items, c40241q.items) && AbstractC22676k.m65745e(this.switchBillingPlanModal, c40241q.switchBillingPlanModal) && AbstractC22676k.m65745e(this.upsellCardFeaturesState, c40241q.upsellCardFeaturesState) && AbstractC22676k.m65745e(this.presentedModal, c40241q.presentedModal);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError), 31, this.items);
        InterfaceC38193d interfaceC38193d = this.switchBillingPlanModal;
        int iHashCode = (iM31983b + (interfaceC38193d == null ? 0 : interfaceC38193d.hashCode())) * 31;
        C23042n c23042n = this.upsellCardFeaturesState;
        int iHashCode2 = (iHashCode + (c23042n == null ? 0 : c23042n.hashCode())) * 31;
        AnyModal anyModal = this.presentedModal;
        return iHashCode2 + (anyModal != null ? anyModal.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        List<C40236l> list = this.items;
        InterfaceC38193d interfaceC38193d = this.switchBillingPlanModal;
        C23042n c23042n = this.upsellCardFeaturesState;
        AnyModal anyModal = this.presentedModal;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("SettingsBannerViewState(isLoading=", ", isError=", ", items=", z4, z13);
        sbM32002u.append(list);
        sbM32002u.append(", switchBillingPlanModal=");
        sbM32002u.append(interfaceC38193d);
        sbM32002u.append(", upsellCardFeaturesState=");
        sbM32002u.append(c23042n);
        sbM32002u.append(", presentedModal=");
        sbM32002u.append(anyModal);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C40241q(boolean z4, boolean z13, List list, InterfaceC38193d interfaceC38193d, C23042n c23042n, AnyModal anyModal, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? null : interfaceC38193d, (i13 & 16) != 0 ? null : c23042n, (i13 & 32) != 0 ? null : anyModal);
    }
}
