package com.whoop.design.models.calendar;

import com.mapbox.common.HttpHeaders;
import com.whoop.design.util.TextResource;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/calendar/CalendarDateModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/calendar/CalendarDateModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/calendar/CalendarDateModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CalendarDateModel$$serializer implements GeneratedSerializer<CalendarDateModel> {
    public static final int $stable;
    public static final CalendarDateModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CalendarDateModel$$serializer calendarDateModel$$serializer = new CalendarDateModel$$serializer();
        INSTANCE = calendarDateModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.calendar.CalendarDateModel", calendarDateModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("dateValueDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("hasData", true);
        pluginGeneratedSerialDescriptor.addElement("cycleId", true);
        pluginGeneratedSerialDescriptor.addElement("dayState", true);
        pluginGeneratedSerialDescriptor.addElement("phase", true);
        pluginGeneratedSerialDescriptor.addElement("firstDayOfPhase", true);
        pluginGeneratedSerialDescriptor.addElement("lastDayOfPhase", true);
        pluginGeneratedSerialDescriptor.addElement("bottomState", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement(HttpHeaders.DATE, true);
        pluginGeneratedSerialDescriptor.addElement("overlay", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CalendarDateModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CalendarDateModel.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{C25452a.f99689a, booleanSerializer, AbstractC38195a.m122336d(LongSerializer.INSTANCE), interfaceC23462hArr[3].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(StringSerializer.INSTANCE), AbstractC38195a.m122336d(CalendarOverlay$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CalendarDateModel deserialize(InterfaceC40541d decoder) {
        int i13;
        TextResource textResource;
        Boolean bool;
        CalendarDayBottomState calendarDayBottomState;
        CalendarOverlay calendarOverlay;
        CalendarPhase calendarPhase;
        String str;
        Boolean bool2;
        Boolean bool3;
        CalendarDayState calendarDayState;
        Long l7;
        boolean z4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = CalendarDateModel.$childSerializers;
        int i14 = 10;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            TextResource textResource2 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
            Long l12 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, LongSerializer.INSTANCE, null);
            CalendarDayState calendarDayState2 = (CalendarDayState) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            CalendarPhase calendarPhase2 = (CalendarPhase) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, booleanSerializer, null);
            Boolean bool5 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, booleanSerializer, null);
            CalendarDayBottomState calendarDayBottomState2 = (CalendarDayBottomState) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            Boolean bool6 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, booleanSerializer, null);
            String str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, null);
            calendarDayBottomState = calendarDayBottomState2;
            textResource = textResource2;
            calendarOverlay = (CalendarOverlay) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, CalendarOverlay$$serializer.INSTANCE, null);
            str = str2;
            bool3 = bool5;
            bool2 = bool4;
            bool = bool6;
            l7 = l12;
            i13 = 2047;
            calendarDayState = calendarDayState2;
            calendarPhase = calendarPhase2;
            z4 = zDecodeBooleanElement;
        } else {
            int i15 = 7;
            int i16 = 3;
            int i17 = 4;
            boolean z13 = true;
            int i18 = 0;
            Boolean bool7 = null;
            CalendarDayBottomState calendarDayBottomState3 = null;
            CalendarOverlay calendarOverlay2 = null;
            CalendarPhase calendarPhase3 = null;
            String str3 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            CalendarDayState calendarDayState3 = null;
            TextResource textResource3 = null;
            boolean zDecodeBooleanElement2 = false;
            Long l13 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i16 = 3;
                        i17 = 4;
                        i15 = 7;
                        interfaceC23462hArr = interfaceC23462hArr;
                        break;
                    case 0:
                        textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource3);
                        i18 |= 1;
                        interfaceC23462hArr = interfaceC23462hArr;
                        i14 = 10;
                        i16 = 3;
                        i17 = 4;
                        i15 = 7;
                        break;
                    case 1:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
                        i18 |= 2;
                        i14 = 10;
                        i16 = 3;
                        i17 = 4;
                        i15 = 7;
                        break;
                    case 2:
                        l13 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, LongSerializer.INSTANCE, l13);
                        i18 |= 4;
                        i14 = 10;
                        i16 = 3;
                        i17 = 4;
                        i15 = 7;
                        break;
                    case 3:
                        calendarDayState3 = (CalendarDayState) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), calendarDayState3);
                        i18 |= 8;
                        i14 = 10;
                        i17 = 4;
                        i15 = 7;
                        break;
                    case 4:
                        calendarPhase3 = (CalendarPhase) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), calendarPhase3);
                        i18 |= 16;
                        i14 = 10;
                        i15 = 7;
                        break;
                    case 5:
                        bool8 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, BooleanSerializer.INSTANCE, bool8);
                        i18 |= 32;
                        i14 = 10;
                        i15 = 7;
                        break;
                    case 6:
                        bool9 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, BooleanSerializer.INSTANCE, bool9);
                        i18 |= 64;
                        i14 = 10;
                        i15 = 7;
                        break;
                    case 7:
                        calendarDayBottomState3 = (CalendarDayBottomState) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), calendarDayBottomState3);
                        i18 |= 128;
                        i14 = 10;
                        break;
                    case 8:
                        bool7 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, BooleanSerializer.INSTANCE, bool7);
                        i18 |= 256;
                        i14 = 10;
                        break;
                    case 9:
                        str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str3);
                        i18 |= 512;
                        i14 = 10;
                        break;
                    case 10:
                        calendarOverlay2 = (CalendarOverlay) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, CalendarOverlay$$serializer.INSTANCE, calendarOverlay2);
                        i18 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i18;
            textResource = textResource3;
            bool = bool7;
            calendarDayBottomState = calendarDayBottomState3;
            calendarOverlay = calendarOverlay2;
            calendarPhase = calendarPhase3;
            str = str3;
            bool2 = bool8;
            bool3 = bool9;
            calendarDayState = calendarDayState3;
            l7 = l13;
            z4 = zDecodeBooleanElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CalendarDateModel(i13, textResource, z4, l7, calendarDayState, calendarPhase, bool2, bool3, calendarDayBottomState, bool, str, calendarOverlay, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CalendarDateModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CalendarDateModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
