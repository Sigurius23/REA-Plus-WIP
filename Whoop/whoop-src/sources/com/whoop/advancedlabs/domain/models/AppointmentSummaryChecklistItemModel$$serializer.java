package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class AppointmentSummaryChecklistItemModel$$serializer implements GeneratedSerializer<AppointmentSummaryChecklistItemModel> {
    public static final int $stable;
    public static final AppointmentSummaryChecklistItemModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        AppointmentSummaryChecklistItemModel$$serializer appointmentSummaryChecklistItemModel$$serializer = new AppointmentSummaryChecklistItemModel$$serializer();
        INSTANCE = appointmentSummaryChecklistItemModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.advancedlabs.domain.models.AppointmentSummaryChecklistItemModel", appointmentSummaryChecklistItemModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("appointmentSummary", false);
        pluginGeneratedSerialDescriptor.addElement("addToCalendarButton", false);
        pluginGeneratedSerialDescriptor.addElement("addToCalendarData", false);
        pluginGeneratedSerialDescriptor.addElement("cancelRescheduleButton", false);
        pluginGeneratedSerialDescriptor.addElement("downloadLabOrderButton", false);
        pluginGeneratedSerialDescriptor.addElement("cancelRescheduleDialog", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AppointmentSummaryChecklistItemModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{AppointmentSummaryModel$$serializer.INSTANCE, AbstractC38195a.m122336d(cardButtonModel$$serializer), AbstractC38195a.m122336d(AppointmentSummaryAddToCalendarDataModel$$serializer.INSTANCE), AbstractC38195a.m122336d(cardButtonModel$$serializer), AbstractC38195a.m122336d(cardButtonModel$$serializer), AbstractC38195a.m122336d(CancelRescheduleDialogModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final AppointmentSummaryChecklistItemModel deserialize(InterfaceC40541d decoder) {
        int i13;
        AppointmentSummaryModel appointmentSummaryModel;
        CardButtonModel cardButtonModel;
        AppointmentSummaryAddToCalendarDataModel appointmentSummaryAddToCalendarDataModel;
        CardButtonModel cardButtonModel2;
        CardButtonModel cardButtonModel3;
        CancelRescheduleDialogModel cancelRescheduleDialogModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 5;
        AppointmentSummaryModel appointmentSummaryModel2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            AppointmentSummaryModel appointmentSummaryModel3 = (AppointmentSummaryModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, AppointmentSummaryModel$$serializer.INSTANCE, null);
            CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
            CardButtonModel cardButtonModel4 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, cardButtonModel$$serializer, null);
            AppointmentSummaryAddToCalendarDataModel appointmentSummaryAddToCalendarDataModel2 = (AppointmentSummaryAddToCalendarDataModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, AppointmentSummaryAddToCalendarDataModel$$serializer.INSTANCE, null);
            CardButtonModel cardButtonModel5 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, cardButtonModel$$serializer, null);
            CardButtonModel cardButtonModel6 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, cardButtonModel$$serializer, null);
            appointmentSummaryModel = appointmentSummaryModel3;
            cancelRescheduleDialogModel = (CancelRescheduleDialogModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, CancelRescheduleDialogModel$$serializer.INSTANCE, null);
            cardButtonModel2 = cardButtonModel5;
            cardButtonModel3 = cardButtonModel6;
            appointmentSummaryAddToCalendarDataModel = appointmentSummaryAddToCalendarDataModel2;
            cardButtonModel = cardButtonModel4;
            i13 = 63;
        } else {
            boolean z4 = true;
            int i15 = 0;
            CardButtonModel cardButtonModel7 = null;
            AppointmentSummaryAddToCalendarDataModel appointmentSummaryAddToCalendarDataModel3 = null;
            CardButtonModel cardButtonModel8 = null;
            CardButtonModel cardButtonModel9 = null;
            CancelRescheduleDialogModel cancelRescheduleDialogModel2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 5;
                        break;
                    case 0:
                        appointmentSummaryModel2 = (AppointmentSummaryModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, AppointmentSummaryModel$$serializer.INSTANCE, appointmentSummaryModel2);
                        i15 |= 1;
                        i14 = 5;
                        break;
                    case 1:
                        cardButtonModel7 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, CardButtonModel$$serializer.INSTANCE, cardButtonModel7);
                        i15 |= 2;
                        break;
                    case 2:
                        appointmentSummaryAddToCalendarDataModel3 = (AppointmentSummaryAddToCalendarDataModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, AppointmentSummaryAddToCalendarDataModel$$serializer.INSTANCE, appointmentSummaryAddToCalendarDataModel3);
                        i15 |= 4;
                        break;
                    case 3:
                        cardButtonModel8 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, CardButtonModel$$serializer.INSTANCE, cardButtonModel8);
                        i15 |= 8;
                        break;
                    case 4:
                        cardButtonModel9 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, CardButtonModel$$serializer.INSTANCE, cardButtonModel9);
                        i15 |= 16;
                        break;
                    case 5:
                        cancelRescheduleDialogModel2 = (CancelRescheduleDialogModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, CancelRescheduleDialogModel$$serializer.INSTANCE, cancelRescheduleDialogModel2);
                        i15 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            appointmentSummaryModel = appointmentSummaryModel2;
            cardButtonModel = cardButtonModel7;
            appointmentSummaryAddToCalendarDataModel = appointmentSummaryAddToCalendarDataModel3;
            cardButtonModel2 = cardButtonModel8;
            cardButtonModel3 = cardButtonModel9;
            cancelRescheduleDialogModel = cancelRescheduleDialogModel2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new AppointmentSummaryChecklistItemModel(i13, appointmentSummaryModel, cardButtonModel, appointmentSummaryAddToCalendarDataModel, cardButtonModel2, cardButtonModel3, cancelRescheduleDialogModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, AppointmentSummaryChecklistItemModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        AppointmentSummaryChecklistItemModel.write$Self$advanced_labs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
