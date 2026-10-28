package com.whoop.user.journey.model.yearinreview;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/user/journey/model/yearinreview/Bar.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/user/journey/model/yearinreview/Bar;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/user/journey/model/yearinreview/Bar;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/user/journey/model/yearinreview/Bar;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class Bar$$serializer implements GeneratedSerializer<Bar> {
    public static final int $stable;
    public static final Bar$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        Bar$$serializer bar$$serializer = new Bar$$serializer();
        INSTANCE = bar$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.user.journey.model.yearinreview.Bar", bar$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("metric", false);
        pluginGeneratedSerialDescriptor.addElement("subMetric", false);
        pluginGeneratedSerialDescriptor.addElement("iconUrl", false);
        pluginGeneratedSerialDescriptor.addElement("primary", false);
        pluginGeneratedSerialDescriptor.addElement("fillPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("opacity", false);
        pluginGeneratedSerialDescriptor.addElement("barType", false);
        pluginGeneratedSerialDescriptor.addElement("alignment", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Bar$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, BooleanSerializer.INSTANCE, floatSerializer, floatSerializer, stringSerializer, interfaceC37138cM122336d3};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final Bar deserialize(InterfaceC40541d decoder) {
        float f13;
        String str;
        String str2;
        String str3;
        float f14;
        boolean z4;
        int i13;
        String str4;
        String str5;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 7;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
            float fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 5);
            float fDecodeFloatElement2 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 6);
            str4 = strDecodeStringElement2;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            f13 = fDecodeFloatElement2;
            f14 = fDecodeFloatElement;
            str2 = str7;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            z4 = zDecodeBooleanElement;
            str3 = str6;
            str5 = strDecodeStringElement3;
            i13 = 511;
        } else {
            float fDecodeFloatElement3 = 0.0f;
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            int i15 = 0;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            float fDecodeFloatElement4 = 0.0f;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        break;
                    case 0:
                        i15 |= 1;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 7;
                        break;
                    case 1:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i15 |= 2;
                        i14 = 7;
                        break;
                    case 2:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str10);
                        i15 |= 4;
                        i14 = 7;
                        break;
                    case 3:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str9);
                        i15 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        fDecodeFloatElement4 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        fDecodeFloatElement3 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i14);
                        i15 |= 128;
                        break;
                    case 8:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str8);
                        i15 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            f13 = fDecodeFloatElement3;
            str = str8;
            str2 = str9;
            str3 = str10;
            f14 = fDecodeFloatElement4;
            z4 = zDecodeBooleanElement2;
            i13 = i15;
            str4 = strDecodeStringElement4;
            str5 = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new Bar(i13, str4, str5, str3, str2, z4, f14, f13, strDecodeStringElement, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, Bar value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        Bar.write$Self$user_journey_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
