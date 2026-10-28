package com.whoop.design.models.calendar.archmini;

import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.calendar.CalendarOverlay;
import com.whoop.design.models.calendar.CalendarOverlay$$serializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HormonalInsightsCalendarDayModel$$serializer implements GeneratedSerializer<HormonalInsightsCalendarDayModel> {
    public static final int $stable;
    public static final HormonalInsightsCalendarDayModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HormonalInsightsCalendarDayModel$$serializer hormonalInsightsCalendarDayModel$$serializer = new HormonalInsightsCalendarDayModel$$serializer();
        INSTANCE = hormonalInsightsCalendarDayModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.calendar.archmini.HormonalInsightsCalendarDayModel", hormonalInsightsCalendarDayModel$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement(HttpHeaders.DATE, false);
        pluginGeneratedSerialDescriptor.addElement("dateValueDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("hasData", false);
        pluginGeneratedSerialDescriptor.addElement("hidden", false);
        pluginGeneratedSerialDescriptor.addElement("interaction", false);
        pluginGeneratedSerialDescriptor.addElement("cycleId", false);
        pluginGeneratedSerialDescriptor.addElement("dayState", false);
        pluginGeneratedSerialDescriptor.addElement("phase", false);
        pluginGeneratedSerialDescriptor.addElement("firstDayOfPhase", false);
        pluginGeneratedSerialDescriptor.addElement("lastDayOfPhase", false);
        pluginGeneratedSerialDescriptor.addElement("bottomState", false);
        pluginGeneratedSerialDescriptor.addElement("overlay", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HormonalInsightsCalendarDayModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, stringSerializer, booleanSerializer, booleanSerializer, AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE), AbstractC38195a.m122336d(LongSerializer.INSTANCE), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(CalendarOverlay$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HormonalInsightsCalendarDayModel deserialize(InterfaceC40541d decoder) {
        boolean z4;
        int i13;
        String str;
        CalendarOverlay calendarOverlay;
        String str2;
        Boolean bool;
        Boolean bool2;
        String str3;
        Long l7;
        GenericInteraction genericInteraction;
        boolean z13;
        String str4;
        String str5;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 10;
        int i15 = 9;
        char c7 = '\b';
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
            GenericInteraction genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, GenericInteraction$$serializer.INSTANCE, null);
            Long l12 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, LongSerializer.INSTANCE, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, booleanSerializer, null);
            Boolean bool4 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, booleanSerializer, null);
            str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            genericInteraction = genericInteraction2;
            calendarOverlay = (CalendarOverlay) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, CalendarOverlay$$serializer.INSTANCE, null);
            bool2 = bool4;
            str3 = str7;
            str5 = strDecodeStringElement2;
            l7 = l12;
            z4 = zDecodeBooleanElement2;
            bool = bool3;
            i13 = 4095;
            z13 = zDecodeBooleanElement;
            str4 = strDecodeStringElement;
            str = str6;
        } else {
            boolean z14 = true;
            boolean zDecodeBooleanElement3 = false;
            int i16 = 0;
            CalendarOverlay calendarOverlay2 = null;
            String str8 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str9 = null;
            Long l13 = null;
            String str10 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement4 = false;
            GenericInteraction genericInteraction3 = null;
            while (z14) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        i15 = 9;
                        c7 = '\b';
                        break;
                    case 0:
                        i16 |= 1;
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str10);
                        i14 = 10;
                        i15 = 9;
                        c7 = '\b';
                        break;
                    case 1:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i14 = 10;
                        i15 = 9;
                        c7 = '\b';
                        break;
                    case 2:
                        i16 |= 4;
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
                        i14 = 10;
                        i15 = 9;
                        c7 = '\b';
                        break;
                    case 3:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
                        i16 |= 8;
                        i14 = 10;
                        i15 = 9;
                        c7 = '\b';
                        break;
                    case 4:
                        genericInteraction3 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, GenericInteraction$$serializer.INSTANCE, genericInteraction3);
                        i16 |= 16;
                        i14 = 10;
                        i15 = 9;
                        c7 = '\b';
                        break;
                    case 5:
                        l13 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, LongSerializer.INSTANCE, l13);
                        i16 |= 32;
                        i14 = 10;
                        i15 = 9;
                        c7 = '\b';
                        break;
                    case 6:
                        c3 = 7;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i16 |= 64;
                        i14 = 10;
                        c7 = '\b';
                        break;
                    case 7:
                        c3 = 7;
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str9);
                        i16 |= 128;
                        i14 = 10;
                        c7 = '\b';
                        break;
                    case 8:
                        bool5 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, BooleanSerializer.INSTANCE, bool5);
                        i16 |= 256;
                        c7 = '\b';
                        i14 = 10;
                        break;
                    case 9:
                        bool6 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, BooleanSerializer.INSTANCE, bool6);
                        i16 |= 512;
                        c7 = '\b';
                        break;
                    case 10:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str8);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        c7 = '\b';
                        break;
                    case 11:
                        calendarOverlay2 = (CalendarOverlay) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, CalendarOverlay$$serializer.INSTANCE, calendarOverlay2);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c7 = '\b';
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement3;
            i13 = i16;
            str = str10;
            calendarOverlay = calendarOverlay2;
            str2 = str8;
            bool = bool5;
            bool2 = bool6;
            str3 = str9;
            l7 = l13;
            genericInteraction = genericInteraction3;
            z13 = zDecodeBooleanElement4;
            str4 = strDecodeStringElement3;
            str5 = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HormonalInsightsCalendarDayModel(i13, str, str4, z13, z4, genericInteraction, l7, str5, str3, bool, bool2, str2, calendarOverlay, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HormonalInsightsCalendarDayModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HormonalInsightsCalendarDayModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
