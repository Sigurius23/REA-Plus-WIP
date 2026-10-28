package io0;

import com.whoop.clinicianintheloop.api.VideoSchedulingFormResponse;
import com.whoop.navigation.C9598e;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: io0.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b!\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, m65681d2 = {"Lio0/m;", "", "Lio0/h;", "fullScreenModal", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;", "response", "", "selectedDatePill", "selectedTimeSlot", "Lcom/whoop/navigation/e;", "saveSuccessDestination", "<init>", "(Lio0/h;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "a", "(Lio0/h;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lio0/m;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio0/h;", "c", "()Lio0/h;", "b", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;", "d", "()Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;", "Ljava/lang/String;", "f", "g", "e", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20726m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC20721h fullScreenModal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final VideoSchedulingFormResponse response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String selectedDatePill;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String selectedTimeSlot;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e saveSuccessDestination;

    public C20726m(InterfaceC20721h interfaceC20721h, VideoSchedulingFormResponse videoSchedulingFormResponse, String str, String str2, C9598e c9598e) {
        this.fullScreenModal = interfaceC20721h;
        this.response = videoSchedulingFormResponse;
        this.selectedDatePill = str;
        this.selectedTimeSlot = str2;
        this.saveSuccessDestination = c9598e;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20726m m56925b(C20726m c20726m, InterfaceC20721h interfaceC20721h, VideoSchedulingFormResponse videoSchedulingFormResponse, String str, String str2, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC20721h = c20726m.fullScreenModal;
        }
        if ((i13 & 2) != 0) {
            videoSchedulingFormResponse = c20726m.response;
        }
        if ((i13 & 4) != 0) {
            str = c20726m.selectedDatePill;
        }
        if ((i13 & 8) != 0) {
            str2 = c20726m.selectedTimeSlot;
        }
        if ((i13 & 16) != 0) {
            c9598e = c20726m.saveSuccessDestination;
        }
        C9598e c9598e2 = c9598e;
        String str3 = str;
        return c20726m.m56926a(interfaceC20721h, videoSchedulingFormResponse, str3, str2, c9598e2);
    }

    /* JADX INFO: renamed from: a */
    public final C20726m m56926a(InterfaceC20721h fullScreenModal, VideoSchedulingFormResponse response, String selectedDatePill, String selectedTimeSlot, C9598e saveSuccessDestination) {
        return new C20726m(fullScreenModal, response, selectedDatePill, selectedTimeSlot, saveSuccessDestination);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC20721h getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final VideoSchedulingFormResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getSaveSuccessDestination() {
        return this.saveSuccessDestination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20726m)) {
            return false;
        }
        C20726m c20726m = (C20726m) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c20726m.fullScreenModal) && AbstractC22676k.m65745e(this.response, c20726m.response) && AbstractC22676k.m65745e(this.selectedDatePill, c20726m.selectedDatePill) && AbstractC22676k.m65745e(this.selectedTimeSlot, c20726m.selectedTimeSlot) && AbstractC22676k.m65745e(this.saveSuccessDestination, c20726m.saveSuccessDestination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSelectedDatePill() {
        return this.selectedDatePill;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSelectedTimeSlot() {
        return this.selectedTimeSlot;
    }

    public int hashCode() {
        InterfaceC20721h interfaceC20721h = this.fullScreenModal;
        int iHashCode = (interfaceC20721h == null ? 0 : interfaceC20721h.hashCode()) * 31;
        VideoSchedulingFormResponse videoSchedulingFormResponse = this.response;
        int iHashCode2 = (iHashCode + (videoSchedulingFormResponse == null ? 0 : videoSchedulingFormResponse.hashCode())) * 31;
        String str = this.selectedDatePill;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedTimeSlot;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C9598e c9598e = this.saveSuccessDestination;
        return iHashCode4 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        InterfaceC20721h interfaceC20721h = this.fullScreenModal;
        VideoSchedulingFormResponse videoSchedulingFormResponse = this.response;
        String str = this.selectedDatePill;
        String str2 = this.selectedTimeSlot;
        C9598e c9598e = this.saveSuccessDestination;
        StringBuilder sb4 = new StringBuilder("ClinicianVideoSchedulingFormDomainState(fullScreenModal=");
        sb4.append(interfaceC20721h);
        sb4.append(", response=");
        sb4.append(videoSchedulingFormResponse);
        sb4.append(", selectedDatePill=");
        AbstractC11266d.m30444B(sb4, str, ", selectedTimeSlot=", str2, ", saveSuccessDestination=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }

    public /* synthetic */ C20726m(InterfaceC20721h interfaceC20721h, VideoSchedulingFormResponse videoSchedulingFormResponse, String str, String str2, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC20721h, (i13 & 2) != 0 ? null : videoSchedulingFormResponse, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : c9598e);
    }
}
