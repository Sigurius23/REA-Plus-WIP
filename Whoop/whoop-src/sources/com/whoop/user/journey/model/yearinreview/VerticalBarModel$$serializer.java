package com.whoop.user.journey.model.yearinreview;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/user/journey/model/yearinreview/VerticalBarModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class VerticalBarModel$$serializer implements GeneratedSerializer<VerticalBarModel> {
    public static final int $stable;
    public static final VerticalBarModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        VerticalBarModel$$serializer verticalBarModel$$serializer = new VerticalBarModel$$serializer();
        INSTANCE = verticalBarModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.user.journey.model.yearinreview.VerticalBarModel", verticalBarModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("fillPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("barColor", false);
        pluginGeneratedSerialDescriptor.addElement("labelColor", false);
        pluginGeneratedSerialDescriptor.addElement("labelText", false);
        pluginGeneratedSerialDescriptor.addElement("labelSuffix", false);
        pluginGeneratedSerialDescriptor.addElement("labelSubtext", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VerticalBarModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = VerticalBarModel.$childSerializers;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[1].getValue());
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue());
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{FloatSerializer.INSTANCE, interfaceC37138cM122336d, interfaceC37138cM122336d2, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final VerticalBarModel deserialize(InterfaceC40541d decoder) {
        float fDecodeFloatElement;
        int i13;
        EnumC39333f enumC39333f;
        EnumC39333f enumC39333f2;
        String str;
        String str2;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = VerticalBarModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 0);
            EnumC39333f enumC39333f3 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            EnumC39333f enumC39333f4 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            enumC39333f2 = enumC39333f4;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            str = strDecodeStringElement2;
            str2 = strDecodeStringElement3;
            i13 = 63;
            enumC39333f = enumC39333f3;
        } else {
            fDecodeFloatElement = 0.0f;
            boolean z4 = true;
            EnumC39333f enumC39333f5 = null;
            EnumC39333f enumC39333f6 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int i14 = 0;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        continue;
                    case 0:
                        fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 0);
                        i14 |= 1;
                        continue;
                    case 1:
                        enumC39333f5 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), enumC39333f5);
                        i14 |= 2;
                        break;
                    case 2:
                        enumC39333f6 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), enumC39333f6);
                        i14 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i14 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i14 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i14;
            enumC39333f = enumC39333f5;
            enumC39333f2 = enumC39333f6;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement6;
        }
        float f13 = fDecodeFloatElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new VerticalBarModel(i13, f13, enumC39333f, enumC39333f2, str, str2, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, VerticalBarModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        VerticalBarModel.write$Self$user_journey_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
