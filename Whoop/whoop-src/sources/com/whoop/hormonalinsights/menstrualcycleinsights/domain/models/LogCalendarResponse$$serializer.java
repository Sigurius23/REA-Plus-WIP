package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateSelectorModel$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class LogCalendarResponse$$serializer implements GeneratedSerializer<LogCalendarResponse> {
    public static final int $stable;
    public static final LogCalendarResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        LogCalendarResponse$$serializer logCalendarResponse$$serializer = new LogCalendarResponse$$serializer();
        INSTANCE = logCalendarResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarResponse", logCalendarResponse$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("navigationTitle", false);
        pluginGeneratedSerialDescriptor.addElement("titleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("descriptionDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("monthPicker", false);
        pluginGeneratedSerialDescriptor.addElement("buttonTitle", false);
        pluginGeneratedSerialDescriptor.addElement("calendar", false);
        pluginGeneratedSerialDescriptor.addElement("editingHiddenCycleModal", false);
        pluginGeneratedSerialDescriptor.addElement("editingCycleModal", false);
        pluginGeneratedSerialDescriptor.addElement("hidingCycleModal", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LogCalendarResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        HormonalInsightsConfirmDialog$$serializer hormonalInsightsConfirmDialog$$serializer = HormonalInsightsConfirmDialog$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, DateSelectorModel$$serializer.INSTANCE, stringSerializer, MciCalendar$$serializer.INSTANCE, hormonalInsightsConfirmDialog$$serializer, hormonalInsightsConfirmDialog$$serializer, hormonalInsightsConfirmDialog$$serializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final LogCalendarResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog2;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog3;
        MciCalendar mciCalendar;
        String str;
        String str2;
        String str3;
        DateSelectorModel dateSelectorModel;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 7;
        int i15 = 6;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            DateSelectorModel dateSelectorModel2 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, DateSelectorModel$$serializer.INSTANCE, null);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            MciCalendar mciCalendar2 = (MciCalendar) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, MciCalendar$$serializer.INSTANCE, null);
            HormonalInsightsConfirmDialog$$serializer hormonalInsightsConfirmDialog$$serializer = HormonalInsightsConfirmDialog$$serializer.INSTANCE;
            HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog4 = (HormonalInsightsConfirmDialog) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, hormonalInsightsConfirmDialog$$serializer, null);
            str = strDecodeStringElement2;
            hormonalInsightsConfirmDialog2 = (HormonalInsightsConfirmDialog) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, hormonalInsightsConfirmDialog$$serializer, null);
            hormonalInsightsConfirmDialog3 = hormonalInsightsConfirmDialog4;
            mciCalendar = mciCalendar2;
            dateSelectorModel = dateSelectorModel2;
            hormonalInsightsConfirmDialog = (HormonalInsightsConfirmDialog) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, hormonalInsightsConfirmDialog$$serializer, null);
            str4 = strDecodeStringElement5;
            str3 = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            i13 = 511;
        } else {
            boolean z4 = true;
            int i16 = 0;
            HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog5 = null;
            HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog6 = null;
            HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog7 = null;
            MciCalendar mciCalendar3 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            DateSelectorModel dateSelectorModel3 = null;
            String strDecodeStringElement8 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        break;
                    case 0:
                        i16 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 1:
                        i16 |= 2;
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 2:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 3:
                        dateSelectorModel3 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, DateSelectorModel$$serializer.INSTANCE, dateSelectorModel3);
                        i16 |= 8;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 4:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        mciCalendar3 = (MciCalendar) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, MciCalendar$$serializer.INSTANCE, mciCalendar3);
                        i16 |= 32;
                        break;
                    case 6:
                        hormonalInsightsConfirmDialog7 = (HormonalInsightsConfirmDialog) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, HormonalInsightsConfirmDialog$$serializer.INSTANCE, hormonalInsightsConfirmDialog7);
                        i16 |= 64;
                        break;
                    case 7:
                        hormonalInsightsConfirmDialog6 = (HormonalInsightsConfirmDialog) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, HormonalInsightsConfirmDialog$$serializer.INSTANCE, hormonalInsightsConfirmDialog6);
                        i16 |= 128;
                        break;
                    case 8:
                        hormonalInsightsConfirmDialog5 = (HormonalInsightsConfirmDialog) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, HormonalInsightsConfirmDialog$$serializer.INSTANCE, hormonalInsightsConfirmDialog5);
                        i16 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            hormonalInsightsConfirmDialog = hormonalInsightsConfirmDialog5;
            hormonalInsightsConfirmDialog2 = hormonalInsightsConfirmDialog6;
            hormonalInsightsConfirmDialog3 = hormonalInsightsConfirmDialog7;
            mciCalendar = mciCalendar3;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            dateSelectorModel = dateSelectorModel3;
            str4 = strDecodeStringElement8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new LogCalendarResponse(i13, str, str2, str3, dateSelectorModel, str4, mciCalendar, hormonalInsightsConfirmDialog3, hormonalInsightsConfirmDialog2, hormonalInsightsConfirmDialog, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, LogCalendarResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        LogCalendarResponse.write$Self$hormonal_insights_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
