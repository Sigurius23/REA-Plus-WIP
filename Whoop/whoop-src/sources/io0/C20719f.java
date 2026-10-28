package io0;

import com.whoop.clinicianintheloop.api.SchedulingConfirmationResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: io0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lio0/f;", "", "Lio0/b;", "fullScreenModal", "Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;", "response", "<init>", "(Lio0/b;Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)V", "a", "(Lio0/b;Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)Lio0/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio0/b;", "b", "()Lio0/b;", "Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;", "c", "()Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20719f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC20715b fullScreenModal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final SchedulingConfirmationResponse response;

    public C20719f(InterfaceC20715b interfaceC20715b, SchedulingConfirmationResponse schedulingConfirmationResponse) {
        this.fullScreenModal = interfaceC20715b;
        this.response = schedulingConfirmationResponse;
    }

    /* JADX INFO: renamed from: a */
    public final C20719f m56910a(InterfaceC20715b fullScreenModal, SchedulingConfirmationResponse response) {
        return new C20719f(fullScreenModal, response);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC20715b getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SchedulingConfirmationResponse getResponse() {
        return this.response;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20719f)) {
            return false;
        }
        C20719f c20719f = (C20719f) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c20719f.fullScreenModal) && AbstractC22676k.m65745e(this.response, c20719f.response);
    }

    public int hashCode() {
        InterfaceC20715b interfaceC20715b = this.fullScreenModal;
        int iHashCode = (interfaceC20715b == null ? 0 : interfaceC20715b.hashCode()) * 31;
        SchedulingConfirmationResponse schedulingConfirmationResponse = this.response;
        return iHashCode + (schedulingConfirmationResponse != null ? schedulingConfirmationResponse.hashCode() : 0);
    }

    public String toString() {
        return "ClinicianSchedulingConfirmationDomainState(fullScreenModal=" + this.fullScreenModal + ", response=" + this.response + ")";
    }

    public /* synthetic */ C20719f(InterfaceC20715b interfaceC20715b, SchedulingConfirmationResponse schedulingConfirmationResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC20715b, (i13 & 2) != 0 ? null : schedulingConfirmationResponse);
    }
}
