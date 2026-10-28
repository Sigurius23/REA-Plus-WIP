package ng2;

import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import rg2.C31396h;

/* JADX INFO: renamed from: ng2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, m65681d2 = {"Lng2/c;", "Lm91/u;", "", "id", "selectedInternalName", "", "gpsTrackingEnabled", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "", "Lrg2/h;", "recentActivityIcons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "d", "Lcom/whoop/navigation/e;", "getDestination", "()Lcom/whoop/navigation/e;", "e", "Lcom/whoop/design/models/modal/AnyModal;", "()Lcom/whoop/design/models/modal/AnyModal;", "f", "Ljava/util/List;", "getRecentActivityIcons", "()Ljava/util/List;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26684c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedInternalName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Boolean gpsTrackingEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AnyModal modal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C31396h> recentActivityIcons;

    public C26684c(String id4, String selectedInternalName, Boolean bool, C9598e c9598e, AnyModal anyModal, List<C31396h> recentActivityIcons) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(selectedInternalName, "selectedInternalName");
        AbstractC22676k.m65750j(recentActivityIcons, "recentActivityIcons");
        this.id = id4;
        this.selectedInternalName = selectedInternalName;
        this.gpsTrackingEnabled = bool;
        this.destination = c9598e;
        this.modal = anyModal;
        this.recentActivityIcons = recentActivityIcons;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getGpsTrackingEnabled() {
        return this.gpsTrackingEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSelectedInternalName() {
        return this.selectedInternalName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26684c)) {
            return false;
        }
        C26684c c26684c = (C26684c) other;
        return AbstractC22676k.m65745e(this.id, c26684c.id) && AbstractC22676k.m65745e(this.selectedInternalName, c26684c.selectedInternalName) && AbstractC22676k.m65745e(this.gpsTrackingEnabled, c26684c.gpsTrackingEnabled) && AbstractC22676k.m65745e(this.destination, c26684c.destination) && AbstractC22676k.m65745e(this.modal, c26684c.modal) && AbstractC22676k.m65745e(this.recentActivityIcons, c26684c.recentActivityIcons);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.selectedInternalName);
        Boolean bool = this.gpsTrackingEnabled;
        int iHashCode = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        AnyModal anyModal = this.modal;
        return this.recentActivityIcons.hashCode() + ((iHashCode2 + (anyModal != null ? anyModal.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.selectedInternalName;
        Boolean bool = this.gpsTrackingEnabled;
        C9598e c9598e = this.destination;
        AnyModal anyModal = this.modal;
        List<C31396h> list = this.recentActivityIcons;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PreSessionWidgetItemViewState(id=", str, ", selectedInternalName=", str2, ", gpsTrackingEnabled=");
        sbM32001t.append(bool);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", modal=");
        sbM32001t.append(anyModal);
        sbM32001t.append(", recentActivityIcons=");
        sbM32001t.append(list);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C26684c(String str, String str2, Boolean bool, C9598e c9598e, AnyModal anyModal, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : bool, (i13 & 8) != 0 ? null : c9598e, (i13 & 16) != 0 ? null : anyModal, (i13 & 32) != 0 ? C25271y.f99162w : list);
    }
}
