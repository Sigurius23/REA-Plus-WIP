package nc0;

import androidx.core.app.NotificationCompat;
import com.whoop.advancedlabs.feature.marketingconsent.domain.models.MarketingConsentScreenResponse;
import com.whoop.design.models.modal.AnyModal;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qc0.InterfaceC30214a;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: nc0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jh\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b/\u0010&R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u00100\u001a\u0004\b'\u00101¨\u00062"}, m65681d2 = {"Lnc0/c;", "", "Lnc0/a;", "currentDialogType", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;", "response", "", "manualRefresh", "displayRefreshingSpinner", "Lqc0/a;", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/design/models/modal/AnyModal;", "modal", "toggleEnabled", "Lnc0/f;", "currentStep", "<init>", "(Lnc0/a;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;ZZLqc0/a;Lcom/whoop/design/models/modal/AnyModal;ZLnc0/f;)V", "a", "(Lnc0/a;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;ZZLqc0/a;Lcom/whoop/design/models/modal/AnyModal;ZLnc0/f;)Lnc0/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lnc0/a;", "c", "()Lnc0/a;", "b", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;", "i", "()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;", "Z", "g", "()Z", "d", "e", "Lqc0/a;", "f", "()Lqc0/a;", "Lcom/whoop/design/models/modal/AnyModal;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/models/modal/AnyModal;", "j", "Lnc0/f;", "()Lnc0/f;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26565c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26563a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final MarketingConsentScreenResponse response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC30214a event;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AnyModal modal;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean toggleEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC26568f currentStep;

    public C26565c(InterfaceC26563a interfaceC26563a, MarketingConsentScreenResponse marketingConsentScreenResponse, boolean z4, boolean z13, InterfaceC30214a interfaceC30214a, AnyModal anyModal, boolean z14, EnumC26568f currentStep) {
        AbstractC22676k.m65750j(currentStep, "currentStep");
        this.currentDialogType = interfaceC26563a;
        this.response = marketingConsentScreenResponse;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
        this.event = interfaceC30214a;
        this.modal = anyModal;
        this.toggleEnabled = z14;
        this.currentStep = currentStep;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C26565c m78693b(C26565c c26565c, InterfaceC26563a interfaceC26563a, MarketingConsentScreenResponse marketingConsentScreenResponse, boolean z4, boolean z13, InterfaceC30214a interfaceC30214a, AnyModal anyModal, boolean z14, EnumC26568f enumC26568f, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC26563a = c26565c.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            marketingConsentScreenResponse = c26565c.response;
        }
        if ((i13 & 4) != 0) {
            z4 = c26565c.manualRefresh;
        }
        if ((i13 & 8) != 0) {
            z13 = c26565c.displayRefreshingSpinner;
        }
        if ((i13 & 16) != 0) {
            interfaceC30214a = c26565c.event;
        }
        if ((i13 & 32) != 0) {
            anyModal = c26565c.modal;
        }
        if ((i13 & 64) != 0) {
            z14 = c26565c.toggleEnabled;
        }
        if ((i13 & 128) != 0) {
            enumC26568f = c26565c.currentStep;
        }
        boolean z15 = z14;
        EnumC26568f enumC26568f2 = enumC26568f;
        InterfaceC30214a interfaceC30214a2 = interfaceC30214a;
        AnyModal anyModal2 = anyModal;
        return c26565c.m78694a(interfaceC26563a, marketingConsentScreenResponse, z4, z13, interfaceC30214a2, anyModal2, z15, enumC26568f2);
    }

    /* JADX INFO: renamed from: a */
    public final C26565c m78694a(InterfaceC26563a currentDialogType, MarketingConsentScreenResponse response, boolean manualRefresh, boolean displayRefreshingSpinner, InterfaceC30214a event, AnyModal modal, boolean toggleEnabled, EnumC26568f currentStep) {
        AbstractC22676k.m65750j(currentStep, "currentStep");
        return new C26565c(currentDialogType, response, manualRefresh, displayRefreshingSpinner, event, modal, toggleEnabled, currentStep);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC26563a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC26568f getCurrentStep() {
        return this.currentStep;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26565c)) {
            return false;
        }
        C26565c c26565c = (C26565c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c26565c.currentDialogType) && AbstractC22676k.m65745e(this.response, c26565c.response) && this.manualRefresh == c26565c.manualRefresh && this.displayRefreshingSpinner == c26565c.displayRefreshingSpinner && AbstractC22676k.m65745e(this.event, c26565c.event) && AbstractC22676k.m65745e(this.modal, c26565c.modal) && this.toggleEnabled == c26565c.toggleEnabled && this.currentStep == c26565c.currentStep;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC30214a getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    public int hashCode() {
        InterfaceC26563a interfaceC26563a = this.currentDialogType;
        int iHashCode = (interfaceC26563a == null ? 0 : interfaceC26563a.hashCode()) * 31;
        MarketingConsentScreenResponse marketingConsentScreenResponse = this.response;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (marketingConsentScreenResponse == null ? 0 : marketingConsentScreenResponse.hashCode())) * 31, 31, this.manualRefresh), 31, this.displayRefreshingSpinner);
        InterfaceC30214a interfaceC30214a = this.event;
        int iHashCode2 = (iM8289b + (interfaceC30214a == null ? 0 : interfaceC30214a.hashCode())) * 31;
        AnyModal anyModal = this.modal;
        return this.currentStep.hashCode() + AbstractC2875y.m8289b((iHashCode2 + (anyModal != null ? anyModal.hashCode() : 0)) * 31, 31, this.toggleEnabled);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final MarketingConsentScreenResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getToggleEnabled() {
        return this.toggleEnabled;
    }

    public String toString() {
        InterfaceC26563a interfaceC26563a = this.currentDialogType;
        MarketingConsentScreenResponse marketingConsentScreenResponse = this.response;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        InterfaceC30214a interfaceC30214a = this.event;
        AnyModal anyModal = this.modal;
        boolean z14 = this.toggleEnabled;
        EnumC26568f enumC26568f = this.currentStep;
        StringBuilder sb4 = new StringBuilder("MarketingConsentDomainState(currentDialogType=");
        sb4.append(interfaceC26563a);
        sb4.append(", response=");
        sb4.append(marketingConsentScreenResponse);
        sb4.append(", manualRefresh=");
        AbstractC38963t7.m124392v(sb4, z4, ", displayRefreshingSpinner=", z13, ", event=");
        sb4.append(interfaceC30214a);
        sb4.append(", modal=");
        sb4.append(anyModal);
        sb4.append(", toggleEnabled=");
        sb4.append(z14);
        sb4.append(", currentStep=");
        sb4.append(enumC26568f);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C26565c(InterfaceC26563a interfaceC26563a, MarketingConsentScreenResponse marketingConsentScreenResponse, boolean z4, boolean z13, InterfaceC30214a interfaceC30214a, AnyModal anyModal, boolean z14, EnumC26568f enumC26568f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC26563a, (i13 & 2) != 0 ? null : marketingConsentScreenResponse, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? null : interfaceC30214a, (i13 & 32) != 0 ? null : anyModal, (i13 & 64) != 0 ? false : z14, (i13 & 128) != 0 ? EnumC26568f.CONSENT : enumC26568f);
    }
}
