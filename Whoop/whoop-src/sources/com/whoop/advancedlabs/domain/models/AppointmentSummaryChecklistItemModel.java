package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JV\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b8\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b9\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010%¨\u0006>"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;", "appointmentSummary", "Lcom/whoop/design/models/items/CardButtonModel;", "addToCalendarButton", "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;", "addToCalendarData", "cancelRescheduleButton", "downloadLabOrderButton", "Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;", "cancelRescheduleDialog", "<init>", "(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;", "component2", "()Lcom/whoop/design/models/items/CardButtonModel;", "component3", "()Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;", "component4", "component5", "component6", "()Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;", "copy", "(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;", "getAppointmentSummary", "Lcom/whoop/design/models/items/CardButtonModel;", "getAddToCalendarButton", "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;", "getAddToCalendarData", "getCancelRescheduleButton", "getDownloadLabOrderButton", "Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;", "getCancelRescheduleDialog", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AppointmentSummaryChecklistItemModel implements DesignSystemModel {
    private final CardButtonModel addToCalendarButton;
    private final AppointmentSummaryAddToCalendarDataModel addToCalendarData;
    private final AppointmentSummaryModel appointmentSummary;
    private final CardButtonModel cancelRescheduleButton;
    private final CancelRescheduleDialogModel cancelRescheduleDialog;
    private final CardButtonModel downloadLabOrderButton;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = CardButtonModel.$stable;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AppointmentSummaryChecklistItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppointmentSummaryChecklistItemModel(int i13, AppointmentSummaryModel appointmentSummaryModel, CardButtonModel cardButtonModel, AppointmentSummaryAddToCalendarDataModel appointmentSummaryAddToCalendarDataModel, CardButtonModel cardButtonModel2, CardButtonModel cardButtonModel3, CancelRescheduleDialogModel cancelRescheduleDialogModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, AppointmentSummaryChecklistItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.appointmentSummary = appointmentSummaryModel;
        this.addToCalendarButton = cardButtonModel;
        this.addToCalendarData = appointmentSummaryAddToCalendarDataModel;
        this.cancelRescheduleButton = cardButtonModel2;
        this.downloadLabOrderButton = cardButtonModel3;
        this.cancelRescheduleDialog = cancelRescheduleDialogModel;
    }

    public static /* synthetic */ AppointmentSummaryChecklistItemModel copy$default(AppointmentSummaryChecklistItemModel appointmentSummaryChecklistItemModel, AppointmentSummaryModel appointmentSummaryModel, CardButtonModel cardButtonModel, AppointmentSummaryAddToCalendarDataModel appointmentSummaryAddToCalendarDataModel, CardButtonModel cardButtonModel2, CardButtonModel cardButtonModel3, CancelRescheduleDialogModel cancelRescheduleDialogModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            appointmentSummaryModel = appointmentSummaryChecklistItemModel.appointmentSummary;
        }
        if ((i13 & 2) != 0) {
            cardButtonModel = appointmentSummaryChecklistItemModel.addToCalendarButton;
        }
        if ((i13 & 4) != 0) {
            appointmentSummaryAddToCalendarDataModel = appointmentSummaryChecklistItemModel.addToCalendarData;
        }
        if ((i13 & 8) != 0) {
            cardButtonModel2 = appointmentSummaryChecklistItemModel.cancelRescheduleButton;
        }
        if ((i13 & 16) != 0) {
            cardButtonModel3 = appointmentSummaryChecklistItemModel.downloadLabOrderButton;
        }
        if ((i13 & 32) != 0) {
            cancelRescheduleDialogModel = appointmentSummaryChecklistItemModel.cancelRescheduleDialog;
        }
        CardButtonModel cardButtonModel4 = cardButtonModel3;
        CancelRescheduleDialogModel cancelRescheduleDialogModel2 = cancelRescheduleDialogModel;
        return appointmentSummaryChecklistItemModel.copy(appointmentSummaryModel, cardButtonModel, appointmentSummaryAddToCalendarDataModel, cardButtonModel2, cardButtonModel4, cancelRescheduleDialogModel2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(AppointmentSummaryChecklistItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, AppointmentSummaryModel$$serializer.INSTANCE, self.appointmentSummary);
        CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, cardButtonModel$$serializer, self.addToCalendarButton);
        output.encodeNullableSerializableElement(serialDesc, 2, AppointmentSummaryAddToCalendarDataModel$$serializer.INSTANCE, self.addToCalendarData);
        output.encodeNullableSerializableElement(serialDesc, 3, cardButtonModel$$serializer, self.cancelRescheduleButton);
        output.encodeNullableSerializableElement(serialDesc, 4, cardButtonModel$$serializer, self.downloadLabOrderButton);
        output.encodeNullableSerializableElement(serialDesc, 5, CancelRescheduleDialogModel$$serializer.INSTANCE, self.cancelRescheduleDialog);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AppointmentSummaryModel getAppointmentSummary() {
        return this.appointmentSummary;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CardButtonModel getAddToCalendarButton() {
        return this.addToCalendarButton;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AppointmentSummaryAddToCalendarDataModel getAddToCalendarData() {
        return this.addToCalendarData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CardButtonModel getCancelRescheduleButton() {
        return this.cancelRescheduleButton;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CardButtonModel getDownloadLabOrderButton() {
        return this.downloadLabOrderButton;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CancelRescheduleDialogModel getCancelRescheduleDialog() {
        return this.cancelRescheduleDialog;
    }

    public final AppointmentSummaryChecklistItemModel copy(AppointmentSummaryModel appointmentSummary, CardButtonModel addToCalendarButton, AppointmentSummaryAddToCalendarDataModel addToCalendarData, CardButtonModel cancelRescheduleButton, CardButtonModel downloadLabOrderButton, CancelRescheduleDialogModel cancelRescheduleDialog) {
        AbstractC22676k.m65750j(appointmentSummary, "appointmentSummary");
        return new AppointmentSummaryChecklistItemModel(appointmentSummary, addToCalendarButton, addToCalendarData, cancelRescheduleButton, downloadLabOrderButton, cancelRescheduleDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppointmentSummaryChecklistItemModel)) {
            return false;
        }
        AppointmentSummaryChecklistItemModel appointmentSummaryChecklistItemModel = (AppointmentSummaryChecklistItemModel) other;
        return AbstractC22676k.m65745e(this.appointmentSummary, appointmentSummaryChecklistItemModel.appointmentSummary) && AbstractC22676k.m65745e(this.addToCalendarButton, appointmentSummaryChecklistItemModel.addToCalendarButton) && AbstractC22676k.m65745e(this.addToCalendarData, appointmentSummaryChecklistItemModel.addToCalendarData) && AbstractC22676k.m65745e(this.cancelRescheduleButton, appointmentSummaryChecklistItemModel.cancelRescheduleButton) && AbstractC22676k.m65745e(this.downloadLabOrderButton, appointmentSummaryChecklistItemModel.downloadLabOrderButton) && AbstractC22676k.m65745e(this.cancelRescheduleDialog, appointmentSummaryChecklistItemModel.cancelRescheduleDialog);
    }

    public final CardButtonModel getAddToCalendarButton() {
        return this.addToCalendarButton;
    }

    public final AppointmentSummaryAddToCalendarDataModel getAddToCalendarData() {
        return this.addToCalendarData;
    }

    public final AppointmentSummaryModel getAppointmentSummary() {
        return this.appointmentSummary;
    }

    public final CardButtonModel getCancelRescheduleButton() {
        return this.cancelRescheduleButton;
    }

    public final CancelRescheduleDialogModel getCancelRescheduleDialog() {
        return this.cancelRescheduleDialog;
    }

    public final CardButtonModel getDownloadLabOrderButton() {
        return this.downloadLabOrderButton;
    }

    public int hashCode() {
        int iHashCode = this.appointmentSummary.hashCode() * 31;
        CardButtonModel cardButtonModel = this.addToCalendarButton;
        int iHashCode2 = (iHashCode + (cardButtonModel == null ? 0 : cardButtonModel.hashCode())) * 31;
        AppointmentSummaryAddToCalendarDataModel appointmentSummaryAddToCalendarDataModel = this.addToCalendarData;
        int iHashCode3 = (iHashCode2 + (appointmentSummaryAddToCalendarDataModel == null ? 0 : appointmentSummaryAddToCalendarDataModel.hashCode())) * 31;
        CardButtonModel cardButtonModel2 = this.cancelRescheduleButton;
        int iHashCode4 = (iHashCode3 + (cardButtonModel2 == null ? 0 : cardButtonModel2.hashCode())) * 31;
        CardButtonModel cardButtonModel3 = this.downloadLabOrderButton;
        int iHashCode5 = (iHashCode4 + (cardButtonModel3 == null ? 0 : cardButtonModel3.hashCode())) * 31;
        CancelRescheduleDialogModel cancelRescheduleDialogModel = this.cancelRescheduleDialog;
        return iHashCode5 + (cancelRescheduleDialogModel != null ? cancelRescheduleDialogModel.hashCode() : 0);
    }

    public String toString() {
        return "AppointmentSummaryChecklistItemModel(appointmentSummary=" + this.appointmentSummary + ", addToCalendarButton=" + this.addToCalendarButton + ", addToCalendarData=" + this.addToCalendarData + ", cancelRescheduleButton=" + this.cancelRescheduleButton + ", downloadLabOrderButton=" + this.downloadLabOrderButton + ", cancelRescheduleDialog=" + this.cancelRescheduleDialog + ")";
    }

    public AppointmentSummaryChecklistItemModel(AppointmentSummaryModel appointmentSummary, CardButtonModel cardButtonModel, AppointmentSummaryAddToCalendarDataModel appointmentSummaryAddToCalendarDataModel, CardButtonModel cardButtonModel2, CardButtonModel cardButtonModel3, CancelRescheduleDialogModel cancelRescheduleDialogModel) {
        AbstractC22676k.m65750j(appointmentSummary, "appointmentSummary");
        this.appointmentSummary = appointmentSummary;
        this.addToCalendarButton = cardButtonModel;
        this.addToCalendarData = appointmentSummaryAddToCalendarDataModel;
        this.cancelRescheduleButton = cardButtonModel2;
        this.downloadLabOrderButton = cardButtonModel3;
        this.cancelRescheduleDialog = cancelRescheduleDialogModel;
    }
}
