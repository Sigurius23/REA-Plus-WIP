package com.whoop.design.models.items.datepicker;

import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/datepicker/DatePickerModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/datepicker/DatePickerModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/datepicker/DatePickerModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/datepicker/DatePickerModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class DatePickerModel$$serializer implements GeneratedSerializer<DatePickerModel> {
    public static final int $stable;
    public static final DatePickerModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        DatePickerModel$$serializer datePickerModel$$serializer = new DatePickerModel$$serializer();
        INSTANCE = datePickerModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.datepicker.DatePickerModel", datePickerModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("selectedDate", false);
        pluginGeneratedSerialDescriptor.addElement("minimumDate", false);
        pluginGeneratedSerialDescriptor.addElement("maximumDate", false);
        pluginGeneratedSerialDescriptor.addElement("validDateRange", true);
        pluginGeneratedSerialDescriptor.addElement("isDisabled", false);
        pluginGeneratedSerialDescriptor.addElement("stateUpdateValueKey", false);
        pluginGeneratedSerialDescriptor.addElement("stateDateFormat", false);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DatePickerModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = DatePickerModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(ValidDateRange$$serializer.INSTANCE), AbstractC38195a.m122336d(BooleanSerializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(DateStateUpdateFormat$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final DatePickerModel deserialize(InterfaceC40541d decoder) {
        int i13;
        Map map;
        DateStateUpdateFormat dateStateUpdateFormat;
        Map map2;
        String str;
        Boolean bool;
        ValidDateRange validDateRange;
        String str2;
        String str3;
        String str4;
        String str5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = DatePickerModel.$childSerializers;
        int i14 = 9;
        int i15 = 7;
        String str6 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            ValidDateRange validDateRange2 = (ValidDateRange) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, ValidDateRange$$serializer.INSTANCE, null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, BooleanSerializer.INSTANCE, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            DateStateUpdateFormat dateStateUpdateFormat2 = (DateStateUpdateFormat) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, DateStateUpdateFormat$$serializer.INSTANCE, null);
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            str = str8;
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, LenientAggregateBindingsSerializer.INSTANCE, null);
            dateStateUpdateFormat = dateStateUpdateFormat2;
            i13 = 1023;
            bool = bool2;
            str5 = strDecodeStringElement3;
            validDateRange = validDateRange2;
            str4 = strDecodeStringElement2;
            str3 = strDecodeStringElement;
            str2 = str7;
        } else {
            boolean z4 = true;
            int i16 = 0;
            Map map3 = null;
            DateStateUpdateFormat dateStateUpdateFormat3 = null;
            Map map4 = null;
            String str9 = null;
            Boolean bool3 = null;
            ValidDateRange validDateRange3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 7;
                        break;
                    case 0:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str6);
                        i16 |= 1;
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 1:
                        i16 |= 2;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 = 9;
                        break;
                    case 2:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i14 = 9;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        i14 = 9;
                        break;
                    case 4:
                        validDateRange3 = (ValidDateRange) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, ValidDateRange$$serializer.INSTANCE, validDateRange3);
                        i16 |= 16;
                        i14 = 9;
                        break;
                    case 5:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, BooleanSerializer.INSTANCE, bool3);
                        i16 |= 32;
                        i14 = 9;
                        break;
                    case 6:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str9);
                        i16 |= 64;
                        i14 = 9;
                        break;
                    case 7:
                        dateStateUpdateFormat3 = (DateStateUpdateFormat) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, DateStateUpdateFormat$$serializer.INSTANCE, dateStateUpdateFormat3);
                        i16 |= 128;
                        break;
                    case 8:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), map4);
                        i16 |= 256;
                        break;
                    case 9:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, LenientAggregateBindingsSerializer.INSTANCE, map3);
                        i16 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            map = map3;
            dateStateUpdateFormat = dateStateUpdateFormat3;
            map2 = map4;
            str = str9;
            bool = bool3;
            validDateRange = validDateRange3;
            str2 = str6;
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new DatePickerModel(i13, str2, str3, str4, str5, validDateRange, bool, str, dateStateUpdateFormat, map2, map, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, DatePickerModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        DatePickerModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
