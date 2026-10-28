package com.whoop.advancedlabs.domain.models;

import com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet;
import com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/advancedlabs/domain/models/AppointmentSummaryModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class AppointmentSummaryModel$$serializer implements GeneratedSerializer<AppointmentSummaryModel> {
    public static final int $stable;
    public static final AppointmentSummaryModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        AppointmentSummaryModel$$serializer appointmentSummaryModel$$serializer = new AppointmentSummaryModel$$serializer();
        INSTANCE = appointmentSummaryModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.advancedlabs.domain.models.AppointmentSummaryModel", appointmentSummaryModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("header", false);
        pluginGeneratedSerialDescriptor.addElement("dateLabel", false);
        pluginGeneratedSerialDescriptor.addElement("dateValue", false);
        pluginGeneratedSerialDescriptor.addElement("timeLabel", false);
        pluginGeneratedSerialDescriptor.addElement("timeValue", false);
        pluginGeneratedSerialDescriptor.addElement("locationLabel", false);
        pluginGeneratedSerialDescriptor.addElement("locationValue", false);
        pluginGeneratedSerialDescriptor.addElement("confirmationLabel", false);
        pluginGeneratedSerialDescriptor.addElement("confirmationValue", false);
        pluginGeneratedSerialDescriptor.addElement("referenceIdLabel", false);
        pluginGeneratedSerialDescriptor.addElement("referenceIdValue", false);
        pluginGeneratedSerialDescriptor.addElement("referenceNumberBottomSheet", false);
        pluginGeneratedSerialDescriptor.addElement("confirmationNumberBottomSheet", false);
        pluginGeneratedSerialDescriptor.addElement("referenceIdStyle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AppointmentSummaryModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = AppointmentSummaryModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        AppointmentSummaryBottomSheet$$serializer appointmentSummaryBottomSheet$$serializer = AppointmentSummaryBottomSheet$$serializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(TestHeaderModel$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(appointmentSummaryBottomSheet$$serializer), AbstractC38195a.m122336d(appointmentSummaryBottomSheet$$serializer), interfaceC23462hArr[13].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final AppointmentSummaryModel deserialize(InterfaceC40541d decoder) {
        TestHeaderModel testHeaderModel;
        int i13;
        String str;
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheet;
        ReferenceIdStyle referenceIdStyle;
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheet2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = AppointmentSummaryModel.$childSerializers;
        int i14 = 10;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            testHeaderModel = (TestHeaderModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, TestHeaderModel$$serializer.INSTANCE, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            AppointmentSummaryBottomSheet$$serializer appointmentSummaryBottomSheet$$serializer = AppointmentSummaryBottomSheet$$serializer.INSTANCE;
            AppointmentSummaryBottomSheet appointmentSummaryBottomSheet3 = (AppointmentSummaryBottomSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, appointmentSummaryBottomSheet$$serializer, null);
            i13 = 16383;
            appointmentSummaryBottomSheet = (AppointmentSummaryBottomSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, appointmentSummaryBottomSheet$$serializer, null);
            referenceIdStyle = (ReferenceIdStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            str2 = str12;
            str = str11;
            str9 = strDecodeStringElement7;
            str8 = strDecodeStringElement6;
            str7 = strDecodeStringElement5;
            str5 = strDecodeStringElement3;
            str10 = strDecodeStringElement8;
            str6 = strDecodeStringElement4;
            str4 = strDecodeStringElement2;
            str3 = strDecodeStringElement;
            appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet3;
        } else {
            int i15 = 13;
            testHeaderModel = null;
            AppointmentSummaryBottomSheet appointmentSummaryBottomSheet4 = null;
            ReferenceIdStyle referenceIdStyle2 = null;
            AppointmentSummaryBottomSheet appointmentSummaryBottomSheet5 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            boolean z4 = true;
            i13 = 0;
            String str13 = null;
            String str14 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 10;
                        break;
                    case 0:
                        testHeaderModel = (TestHeaderModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, TestHeaderModel$$serializer.INSTANCE, testHeaderModel);
                        i13 |= 1;
                        i15 = 13;
                        i14 = 10;
                        break;
                    case 1:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i13 |= 2;
                        i15 = 13;
                        break;
                    case 2:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i13 |= 4;
                        i15 = 13;
                        break;
                    case 3:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i13 |= 8;
                        i15 = 13;
                        break;
                    case 4:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i13 |= 16;
                        i15 = 13;
                        break;
                    case 5:
                        strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i13 |= 32;
                        i15 = 13;
                        break;
                    case 6:
                        strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i13 |= 64;
                        i15 = 13;
                        break;
                    case 7:
                        strDecodeStringElement15 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i13 |= 128;
                        i15 = 13;
                        break;
                    case 8:
                        strDecodeStringElement16 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i13 |= 256;
                        i15 = 13;
                        break;
                    case 9:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str13);
                        i13 |= 512;
                        i15 = 13;
                        break;
                    case 10:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str14);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i15 = 13;
                        break;
                    case 11:
                        appointmentSummaryBottomSheet5 = (AppointmentSummaryBottomSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, AppointmentSummaryBottomSheet$$serializer.INSTANCE, appointmentSummaryBottomSheet5);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i15 = 13;
                        break;
                    case 12:
                        appointmentSummaryBottomSheet4 = (AppointmentSummaryBottomSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, AppointmentSummaryBottomSheet$$serializer.INSTANCE, appointmentSummaryBottomSheet4);
                        i13 |= 4096;
                        i15 = 13;
                        break;
                    case 13:
                        referenceIdStyle2 = (ReferenceIdStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), referenceIdStyle2);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str13;
            appointmentSummaryBottomSheet = appointmentSummaryBottomSheet4;
            referenceIdStyle = referenceIdStyle2;
            appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet5;
            str2 = str14;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement11;
            str6 = strDecodeStringElement12;
            str7 = strDecodeStringElement13;
            str8 = strDecodeStringElement14;
            str9 = strDecodeStringElement15;
            str10 = strDecodeStringElement16;
        }
        TestHeaderModel testHeaderModel2 = testHeaderModel;
        int i16 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new AppointmentSummaryModel(i16, testHeaderModel2, str3, str4, str5, str6, str7, str8, str9, str10, str, str2, appointmentSummaryBottomSheet2, appointmentSummaryBottomSheet, referenceIdStyle, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, AppointmentSummaryModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        AppointmentSummaryModel.write$Self$advanced_labs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
