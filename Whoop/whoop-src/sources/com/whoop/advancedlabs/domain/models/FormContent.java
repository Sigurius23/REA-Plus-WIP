package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.design.models.tiles.EmptyTileModel;
import com.whoop.design.models.tiles.EmptyTileModel$$serializer;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/FormContent;", "", "Lcom/whoop/design/models/InfoCalloutTileModel;", "headerInfoCallout", "Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel;", "schedulingDatePicker", "Lcom/whoop/design/models/tiles/EmptyTileModel;", "errorCard", "<init>", "(Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel;Lcom/whoop/design/models/tiles/EmptyTileModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel;Lcom/whoop/design/models/tiles/EmptyTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/FormContent;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "component2", "()Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel;", "component3", "()Lcom/whoop/design/models/tiles/EmptyTileModel;", "copy", "(Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel;Lcom/whoop/design/models/tiles/EmptyTileModel;)Lcom/whoop/advancedlabs/domain/models/FormContent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getHeaderInfoCallout", "Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel;", "getSchedulingDatePicker", "Lcom/whoop/design/models/tiles/EmptyTileModel;", "getErrorCard", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FormContent {
    private final EmptyTileModel errorCard;
    private final InfoCalloutTileModel headerInfoCallout;
    private final SchedulingDatePickerModel schedulingDatePicker;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/FormContent$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/FormContent;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FormContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FormContent(int i13, InfoCalloutTileModel infoCalloutTileModel, SchedulingDatePickerModel schedulingDatePickerModel, EmptyTileModel emptyTileModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, FormContent$$serializer.INSTANCE.getDescriptor());
        }
        this.headerInfoCallout = infoCalloutTileModel;
        this.schedulingDatePicker = schedulingDatePickerModel;
        this.errorCard = emptyTileModel;
    }

    public static /* synthetic */ FormContent copy$default(FormContent formContent, InfoCalloutTileModel infoCalloutTileModel, SchedulingDatePickerModel schedulingDatePickerModel, EmptyTileModel emptyTileModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            infoCalloutTileModel = formContent.headerInfoCallout;
        }
        if ((i13 & 2) != 0) {
            schedulingDatePickerModel = formContent.schedulingDatePicker;
        }
        if ((i13 & 4) != 0) {
            emptyTileModel = formContent.errorCard;
        }
        return formContent.copy(infoCalloutTileModel, schedulingDatePickerModel, emptyTileModel);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(FormContent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, InfoCalloutTileModel$$serializer.INSTANCE, self.headerInfoCallout);
        output.encodeNullableSerializableElement(serialDesc, 1, SchedulingDatePickerModel$$serializer.INSTANCE, self.schedulingDatePicker);
        output.encodeNullableSerializableElement(serialDesc, 2, EmptyTileModel$$serializer.INSTANCE, self.errorCard);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InfoCalloutTileModel getHeaderInfoCallout() {
        return this.headerInfoCallout;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SchedulingDatePickerModel getSchedulingDatePicker() {
        return this.schedulingDatePicker;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EmptyTileModel getErrorCard() {
        return this.errorCard;
    }

    public final FormContent copy(InfoCalloutTileModel headerInfoCallout, SchedulingDatePickerModel schedulingDatePicker, EmptyTileModel errorCard) {
        return new FormContent(headerInfoCallout, schedulingDatePicker, errorCard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormContent)) {
            return false;
        }
        FormContent formContent = (FormContent) other;
        return AbstractC22676k.m65745e(this.headerInfoCallout, formContent.headerInfoCallout) && AbstractC22676k.m65745e(this.schedulingDatePicker, formContent.schedulingDatePicker) && AbstractC22676k.m65745e(this.errorCard, formContent.errorCard);
    }

    public final EmptyTileModel getErrorCard() {
        return this.errorCard;
    }

    public final InfoCalloutTileModel getHeaderInfoCallout() {
        return this.headerInfoCallout;
    }

    public final SchedulingDatePickerModel getSchedulingDatePicker() {
        return this.schedulingDatePicker;
    }

    public int hashCode() {
        InfoCalloutTileModel infoCalloutTileModel = this.headerInfoCallout;
        int iHashCode = (infoCalloutTileModel == null ? 0 : infoCalloutTileModel.hashCode()) * 31;
        SchedulingDatePickerModel schedulingDatePickerModel = this.schedulingDatePicker;
        int iHashCode2 = (iHashCode + (schedulingDatePickerModel == null ? 0 : schedulingDatePickerModel.hashCode())) * 31;
        EmptyTileModel emptyTileModel = this.errorCard;
        return iHashCode2 + (emptyTileModel != null ? emptyTileModel.hashCode() : 0);
    }

    public String toString() {
        return "FormContent(headerInfoCallout=" + this.headerInfoCallout + ", schedulingDatePicker=" + this.schedulingDatePicker + ", errorCard=" + this.errorCard + ")";
    }

    public FormContent(InfoCalloutTileModel infoCalloutTileModel, SchedulingDatePickerModel schedulingDatePickerModel, EmptyTileModel emptyTileModel) {
        this.headerInfoCallout = infoCalloutTileModel;
        this.schedulingDatePicker = schedulingDatePickerModel;
        this.errorCard = emptyTileModel;
    }
}
