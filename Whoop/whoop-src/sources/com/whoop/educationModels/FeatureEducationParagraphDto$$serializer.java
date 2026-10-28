package com.whoop.educationModels;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/educationModels/FeatureEducationParagraphDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/educationModels/FeatureEducationParagraphDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/educationModels/FeatureEducationParagraphDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/educationModels/FeatureEducationParagraphDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class FeatureEducationParagraphDto$$serializer implements GeneratedSerializer<FeatureEducationParagraphDto> {
    public static final int $stable;
    public static final FeatureEducationParagraphDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        FeatureEducationParagraphDto$$serializer featureEducationParagraphDto$$serializer = new FeatureEducationParagraphDto$$serializer();
        INSTANCE = featureEducationParagraphDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.educationModels.FeatureEducationParagraphDto", featureEducationParagraphDto$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("sentences", false);
        pluginGeneratedSerialDescriptor.addElement("created_at", false);
        pluginGeneratedSerialDescriptor.addElement("updated_at", false);
        pluginGeneratedSerialDescriptor.addElement("alignment", false);
        pluginGeneratedSerialDescriptor.addElement("inset", false);
        pluginGeneratedSerialDescriptor.addElement("screen_id", false);
        pluginGeneratedSerialDescriptor.addElement("image", false);
        pluginGeneratedSerialDescriptor.addElement("video", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FeatureEducationParagraphDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = FeatureEducationParagraphDto.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{intSerializer, interfaceC23462hArr[1].getValue(), stringSerializer, stringSerializer, stringSerializer, InsetDto$$serializer.INSTANCE, intSerializer, AbstractC38195a.m122336d(ImageDto$$serializer.INSTANCE), AbstractC38195a.m122336d(FeatureEducationVideoDto$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final FeatureEducationParagraphDto deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        FeatureEducationVideoDto featureEducationVideoDto;
        ImageDto imageDto;
        InsetDto insetDto;
        int i13;
        int i14;
        List list;
        String str;
        String str2;
        String str3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = FeatureEducationParagraphDto.$childSerializers;
        int i15 = 7;
        int i16 = 6;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            InsetDto insetDto2 = (InsetDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, InsetDto$$serializer.INSTANCE, null);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 6);
            list = list2;
            imageDto = (ImageDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, ImageDto$$serializer.INSTANCE, null);
            i13 = iDecodeIntElement2;
            insetDto = insetDto2;
            str2 = strDecodeStringElement2;
            featureEducationVideoDto = (FeatureEducationVideoDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, FeatureEducationVideoDto$$serializer.INSTANCE, null);
            str3 = strDecodeStringElement3;
            str = strDecodeStringElement;
            i14 = 511;
        } else {
            boolean z4 = true;
            iDecodeIntElement = 0;
            int i17 = 0;
            FeatureEducationVideoDto featureEducationVideoDto2 = null;
            ImageDto imageDto2 = null;
            List list3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int iDecodeIntElement3 = 0;
            InsetDto insetDto3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 7;
                        break;
                    case 0:
                        iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                        i17 |= 1;
                        i15 = 7;
                        i16 = 6;
                        break;
                    case 1:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), list3);
                        i17 |= 2;
                        i15 = 7;
                        i16 = 6;
                        break;
                    case 2:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i17 |= 4;
                        i15 = 7;
                        break;
                    case 3:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i17 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i17 |= 16;
                        break;
                    case 5:
                        insetDto3 = (InsetDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, InsetDto$$serializer.INSTANCE, insetDto3);
                        i17 |= 32;
                        break;
                    case 6:
                        iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, i16);
                        i17 |= 64;
                        break;
                    case 7:
                        imageDto2 = (ImageDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, ImageDto$$serializer.INSTANCE, imageDto2);
                        i17 |= 128;
                        break;
                    case 8:
                        featureEducationVideoDto2 = (FeatureEducationVideoDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, FeatureEducationVideoDto$$serializer.INSTANCE, featureEducationVideoDto2);
                        i17 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            featureEducationVideoDto = featureEducationVideoDto2;
            imageDto = imageDto2;
            insetDto = insetDto3;
            i13 = iDecodeIntElement3;
            i14 = i17;
            list = list3;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
        }
        int i18 = iDecodeIntElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new FeatureEducationParagraphDto(i14, i18, list, str, str2, str3, insetDto, i13, imageDto, featureEducationVideoDto, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, FeatureEducationParagraphDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        FeatureEducationParagraphDto.write$Self$education_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
