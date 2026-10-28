package com.whoop.educationModels;

import io.getstream.chat.android.client.api.QueryParams;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/educationModels/FeatureEducationVideoDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/educationModels/FeatureEducationVideoDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/educationModels/FeatureEducationVideoDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/educationModels/FeatureEducationVideoDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class FeatureEducationVideoDto$$serializer implements GeneratedSerializer<FeatureEducationVideoDto> {
    public static final int $stable;
    public static final FeatureEducationVideoDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        FeatureEducationVideoDto$$serializer featureEducationVideoDto$$serializer = new FeatureEducationVideoDto$$serializer();
        INSTANCE = featureEducationVideoDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.educationModels.FeatureEducationVideoDto", featureEducationVideoDto$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("thumbnail", false);
        pluginGeneratedSerialDescriptor.addElement("created_at", false);
        pluginGeneratedSerialDescriptor.addElement("updated_at", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("playtime", false);
        pluginGeneratedSerialDescriptor.addElement(QueryParams.URL, false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FeatureEducationVideoDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = FeatureEducationVideoDto.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{IntSerializer.INSTANCE, FeatureEducationThumbnailDto$$serializer.INSTANCE, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final FeatureEducationVideoDto deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        EducationVideoTypeDto educationVideoTypeDto;
        String str;
        String str2;
        int i13;
        FeatureEducationThumbnailDto featureEducationThumbnailDto;
        String str3;
        String str4;
        String str5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = FeatureEducationVideoDto.$childSerializers;
        int i14 = 6;
        int i15 = 5;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            FeatureEducationThumbnailDto featureEducationThumbnailDto2 = (FeatureEducationThumbnailDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, FeatureEducationThumbnailDto$$serializer.INSTANCE, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            educationVideoTypeDto = (EducationVideoTypeDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            str5 = strDecodeStringElement3;
            str = str7;
            str4 = strDecodeStringElement2;
            str2 = str6;
            str3 = strDecodeStringElement;
            i13 = 255;
            featureEducationThumbnailDto = featureEducationThumbnailDto2;
        } else {
            boolean z4 = true;
            iDecodeIntElement = 0;
            EducationVideoTypeDto educationVideoTypeDto2 = null;
            String str8 = null;
            FeatureEducationThumbnailDto featureEducationThumbnailDto3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int i16 = 0;
            String str9 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 6;
                        break;
                    case 0:
                        iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i14 = 6;
                        i15 = 5;
                        break;
                    case 1:
                        featureEducationThumbnailDto3 = (FeatureEducationThumbnailDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, FeatureEducationThumbnailDto$$serializer.INSTANCE, featureEducationThumbnailDto3);
                        i16 |= 2;
                        i14 = 6;
                        i15 = 5;
                        break;
                    case 2:
                        i16 |= 4;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        break;
                    case 3:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        break;
                    case 4:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str9);
                        i16 |= 16;
                        break;
                    case 5:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, StringSerializer.INSTANCE, str8);
                        i16 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i14);
                        i16 |= 64;
                        break;
                    case 7:
                        educationVideoTypeDto2 = (EducationVideoTypeDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), educationVideoTypeDto2);
                        i16 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            educationVideoTypeDto = educationVideoTypeDto2;
            str = str8;
            str2 = str9;
            i13 = i16;
            featureEducationThumbnailDto = featureEducationThumbnailDto3;
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement6;
        }
        int i17 = iDecodeIntElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new FeatureEducationVideoDto(i13, i17, featureEducationThumbnailDto, str3, str4, str2, str, str5, educationVideoTypeDto, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, FeatureEducationVideoDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        FeatureEducationVideoDto.write$Self$education_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
