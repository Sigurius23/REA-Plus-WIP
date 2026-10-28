package com.whoop.design.models.items.heightweight;

import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.items.heightpicker.HeightPickerModel;
import com.whoop.design.models.items.heightpicker.HeightPickerModel$$serializer;
import com.whoop.design.models.items.weightpicker.WeightPickerModel;
import com.whoop.design.models.items.weightpicker.WeightPickerModel$$serializer;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/heightweight/HeightWeightModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/heightweight/HeightWeightModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/heightweight/HeightWeightModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/heightweight/HeightWeightModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HeightWeightModel$$serializer implements GeneratedSerializer<HeightWeightModel> {
    public static final int $stable;
    public static final HeightWeightModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HeightWeightModel$$serializer heightWeightModel$$serializer = new HeightWeightModel$$serializer();
        INSTANCE = heightWeightModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.heightweight.HeightWeightModel", heightWeightModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("segmentedControl", true);
        pluginGeneratedSerialDescriptor.addElement("heightPicker", false);
        pluginGeneratedSerialDescriptor.addElement("weightPicker", false);
        pluginGeneratedSerialDescriptor.addElement("stateUpdateUnitKey", false);
        pluginGeneratedSerialDescriptor.addElement("unitType", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HeightWeightModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HeightWeightModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), AbstractC38195a.m122336d(HeightPickerModel$$serializer.INSTANCE), AbstractC38195a.m122336d(WeightPickerModel$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HeightWeightModel deserialize(InterfaceC40541d decoder) {
        int i13;
        Map map;
        Map map2;
        List list;
        HeightPickerModel heightPickerModel;
        WeightPickerModel weightPickerModel;
        String str;
        String str2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HeightWeightModel.$childSerializers;
        int i14 = 6;
        List list2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            HeightPickerModel heightPickerModel2 = (HeightPickerModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, HeightPickerModel$$serializer.INSTANCE, null);
            WeightPickerModel weightPickerModel2 = (WeightPickerModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, WeightPickerModel$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            list = list3;
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, LenientAggregateBindingsSerializer.INSTANCE, null);
            str = str3;
            str2 = str4;
            weightPickerModel = weightPickerModel2;
            i13 = 127;
            heightPickerModel = heightPickerModel2;
        } else {
            boolean z4 = true;
            int i15 = 0;
            Map map3 = null;
            Map map4 = null;
            HeightPickerModel heightPickerModel3 = null;
            WeightPickerModel weightPickerModel3 = null;
            String str5 = null;
            String str6 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 6;
                        break;
                    case 0:
                        list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), list2);
                        i15 |= 1;
                        i14 = 6;
                        break;
                    case 1:
                        heightPickerModel3 = (HeightPickerModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, HeightPickerModel$$serializer.INSTANCE, heightPickerModel3);
                        i15 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        weightPickerModel3 = (WeightPickerModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, WeightPickerModel$$serializer.INSTANCE, weightPickerModel3);
                        i15 |= 4;
                        i14 = 6;
                        break;
                    case 3:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str5);
                        i15 |= 8;
                        break;
                    case 4:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str6);
                        i15 |= 16;
                        break;
                    case 5:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), map4);
                        i15 |= 32;
                        break;
                    case 6:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, LenientAggregateBindingsSerializer.INSTANCE, map3);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            map = map3;
            map2 = map4;
            list = list2;
            heightPickerModel = heightPickerModel3;
            weightPickerModel = weightPickerModel3;
            str = str5;
            str2 = str6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HeightWeightModel(i13, list, heightPickerModel, weightPickerModel, str, str2, map2, map, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HeightWeightModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HeightWeightModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
