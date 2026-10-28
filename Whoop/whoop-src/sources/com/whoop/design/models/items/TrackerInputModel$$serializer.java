package com.whoop.design.models.items;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/TrackerInputModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/TrackerInputModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/TrackerInputModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/TrackerInputModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TrackerInputModel$$serializer implements GeneratedSerializer<TrackerInputModel> {
    public static final int $stable;
    public static final TrackerInputModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TrackerInputModel$$serializer trackerInputModel$$serializer = new TrackerInputModel$$serializer();
        INSTANCE = trackerInputModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.TrackerInputModel", trackerInputModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("behaviorTrackerId", false);
        pluginGeneratedSerialDescriptor.addElement("timeInputLabel", false);
        pluginGeneratedSerialDescriptor.addElement("timeInputValue", false);
        pluginGeneratedSerialDescriptor.addElement("magnitudeInputLabel", false);
        pluginGeneratedSerialDescriptor.addElement("magnitudeInputValue", false);
        pluginGeneratedSerialDescriptor.addElement("answeredYes", false);
        pluginGeneratedSerialDescriptor.addElement("source", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TrackerInputModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{IntSerializer.INSTANCE, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(LongSerializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(DoubleSerializer.INSTANCE), AbstractC38195a.m122336d(BooleanSerializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TrackerInputModel deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        String str;
        int i13;
        String str2;
        Long l7;
        String str3;
        Double d3;
        Boolean bool;
        boolean z4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 6;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            Long l12 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, LongSerializer.INSTANCE, null);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            Double d14 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, DoubleSerializer.INSTANCE, null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, BooleanSerializer.INSTANCE, null);
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            bool = bool2;
            str3 = str5;
            d3 = d14;
            l7 = l12;
            str2 = str4;
            i13 = 127;
        } else {
            boolean z13 = true;
            iDecodeIntElement = 0;
            String str6 = null;
            Long l13 = null;
            String str7 = null;
            Double d15 = null;
            Boolean bool3 = null;
            int i15 = 0;
            String str8 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        break;
                    case 0:
                        z4 = true;
                        iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i14 = 6;
                        break;
                    case 1:
                        z4 = true;
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str6);
                        i15 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        l13 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, LongSerializer.INSTANCE, l13);
                        i15 |= 4;
                        break;
                    case 3:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str7);
                        i15 |= 8;
                        break;
                    case 4:
                        d15 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, DoubleSerializer.INSTANCE, d15);
                        i15 |= 16;
                        break;
                    case 5:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, BooleanSerializer.INSTANCE, bool3);
                        i15 |= 32;
                        break;
                    case 6:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str8);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str8;
            i13 = i15;
            str2 = str6;
            l7 = l13;
            str3 = str7;
            d3 = d15;
            bool = bool3;
        }
        int i16 = iDecodeIntElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TrackerInputModel(i13, i16, str2, l7, str3, d3, bool, str, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TrackerInputModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TrackerInputModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
