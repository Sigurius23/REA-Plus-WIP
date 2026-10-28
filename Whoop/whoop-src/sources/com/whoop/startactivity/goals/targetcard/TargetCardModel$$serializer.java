package com.whoop.startactivity.goals.targetcard;

import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/startactivity/goals/targetcard/TargetCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TargetCardModel$$serializer implements GeneratedSerializer<TargetCardModel> {
    public static final int $stable;
    public static final TargetCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TargetCardModel$$serializer targetCardModel$$serializer = new TargetCardModel$$serializer();
        INSTANCE = targetCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.startactivity.goals.targetcard.TargetCardModel", targetCardModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("header", false);
        pluginGeneratedSerialDescriptor.addElement("body", true);
        pluginGeneratedSerialDescriptor.addElement("footer", true);
        pluginGeneratedSerialDescriptor.addElement("toggleOnInteraction", true);
        pluginGeneratedSerialDescriptor.addElement("toggleOffInteraction", true);
        pluginGeneratedSerialDescriptor.addElement("onAppearInteraction", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TargetCardModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = TargetCardModel.$childSerializers;
        GenericInteraction$$serializer genericInteraction$$serializer = GenericInteraction$$serializer.INSTANCE;
        return new InterfaceC37138c[]{TargetCardModel$TargetCardHeader$$serializer.INSTANCE, interfaceC23462hArr[1].getValue(), interfaceC23462hArr[2].getValue(), AbstractC38195a.m122336d(genericInteraction$$serializer), AbstractC38195a.m122336d(genericInteraction$$serializer), AbstractC38195a.m122336d(genericInteraction$$serializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TargetCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        Map map;
        Map map2;
        GenericInteraction genericInteraction;
        GenericInteraction genericInteraction2;
        TargetCardModel.TargetCardHeader targetCardHeader;
        List list;
        List list2;
        GenericInteraction genericInteraction3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = TargetCardModel.$childSerializers;
        int i14 = 7;
        TargetCardModel.TargetCardHeader targetCardHeader2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            TargetCardModel.TargetCardHeader targetCardHeader3 = (TargetCardModel.TargetCardHeader) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, TargetCardModel$TargetCardHeader$$serializer.INSTANCE, null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            GenericInteraction$$serializer genericInteraction$$serializer = GenericInteraction$$serializer.INSTANCE;
            GenericInteraction genericInteraction4 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, genericInteraction$$serializer, null);
            GenericInteraction genericInteraction5 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, genericInteraction$$serializer, null);
            GenericInteraction genericInteraction6 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, genericInteraction$$serializer, null);
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            targetCardHeader = targetCardHeader3;
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, LenientAggregateBindingsSerializer.INSTANCE, null);
            genericInteraction = genericInteraction6;
            genericInteraction3 = genericInteraction4;
            genericInteraction2 = genericInteraction5;
            i13 = 255;
            list2 = list4;
            list = list3;
        } else {
            int i15 = 2;
            int i16 = 1;
            boolean z4 = true;
            int i17 = 0;
            Map map3 = null;
            Map map4 = null;
            GenericInteraction genericInteraction7 = null;
            GenericInteraction genericInteraction8 = null;
            List list5 = null;
            List list6 = null;
            GenericInteraction genericInteraction9 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        i16 = 1;
                        i15 = 2;
                        break;
                    case 0:
                        targetCardHeader2 = (TargetCardModel.TargetCardHeader) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, TargetCardModel$TargetCardHeader$$serializer.INSTANCE, targetCardHeader2);
                        i17 |= 1;
                        i14 = 7;
                        i16 = 1;
                        i15 = 2;
                        break;
                    case 1:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list5);
                        i17 |= 2;
                        i14 = 7;
                        i15 = 2;
                        break;
                    case 2:
                        list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list6);
                        i17 |= 4;
                        i14 = 7;
                        break;
                    case 3:
                        genericInteraction9 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, GenericInteraction$$serializer.INSTANCE, genericInteraction9);
                        i17 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        genericInteraction8 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, GenericInteraction$$serializer.INSTANCE, genericInteraction8);
                        i17 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        genericInteraction7 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, GenericInteraction$$serializer.INSTANCE, genericInteraction7);
                        i17 |= 32;
                        break;
                    case 6:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), map4);
                        i17 |= 64;
                        break;
                    case 7:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, LenientAggregateBindingsSerializer.INSTANCE, map3);
                        i17 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            map = map3;
            map2 = map4;
            genericInteraction = genericInteraction7;
            genericInteraction2 = genericInteraction8;
            targetCardHeader = targetCardHeader2;
            list = list5;
            list2 = list6;
            genericInteraction3 = genericInteraction9;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TargetCardModel(i13, targetCardHeader, list, list2, genericInteraction3, genericInteraction2, genericInteraction, map2, map, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TargetCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TargetCardModel.write$Self$start_activity_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
