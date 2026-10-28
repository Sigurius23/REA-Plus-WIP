package com.whoop.educationModels;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/educationModels/FeatureEducationScreenDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/educationModels/FeatureEducationScreenDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/educationModels/FeatureEducationScreenDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/educationModels/FeatureEducationScreenDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class FeatureEducationScreenDto$$serializer implements GeneratedSerializer<FeatureEducationScreenDto> {
    public static final int $stable;
    public static final FeatureEducationScreenDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        FeatureEducationScreenDto$$serializer featureEducationScreenDto$$serializer = new FeatureEducationScreenDto$$serializer();
        INSTANCE = featureEducationScreenDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.educationModels.FeatureEducationScreenDto", featureEducationScreenDto$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("paragraphs", false);
        pluginGeneratedSerialDescriptor.addElement("sections", false);
        pluginGeneratedSerialDescriptor.addElement("created_at", false);
        pluginGeneratedSerialDescriptor.addElement("updated_at", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("feature_id", false);
        pluginGeneratedSerialDescriptor.addElement("background", false);
        pluginGeneratedSerialDescriptor.addElement("image", false);
        pluginGeneratedSerialDescriptor.addElement("video", false);
        pluginGeneratedSerialDescriptor.addElement("sort_order", false);
        pluginGeneratedSerialDescriptor.addElement("ctabutton", false);
        pluginGeneratedSerialDescriptor.addElement("navigation_bar", false);
        pluginGeneratedSerialDescriptor.addElement("cta_tiles", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FeatureEducationScreenDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = FeatureEducationScreenDto.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{intSerializer, interfaceC23462hArr[1].getValue(), interfaceC23462hArr[2].getValue(), stringSerializer, stringSerializer, stringSerializer, intSerializer, FeatureEducationBackgroundDto$$serializer.INSTANCE, AbstractC38195a.m122336d(ImageDto$$serializer.INSTANCE), AbstractC38195a.m122336d(FeatureEducationVideoDto$$serializer.INSTANCE), intSerializer, AbstractC38195a.m122336d(FeatureEducationButtonDto$$serializer.INSTANCE), AbstractC38195a.m122336d(NavBarDto$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[13].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final FeatureEducationScreenDto deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        int i13;
        List list;
        List list2;
        List list3;
        NavBarDto navBarDto;
        FeatureEducationButtonDto featureEducationButtonDto;
        ImageDto imageDto;
        FeatureEducationVideoDto featureEducationVideoDto;
        FeatureEducationBackgroundDto featureEducationBackgroundDto;
        String str;
        String str2;
        String str3;
        int i14;
        int i15;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = FeatureEducationScreenDto.$childSerializers;
        int i16 = 10;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 6);
            FeatureEducationBackgroundDto featureEducationBackgroundDto2 = (FeatureEducationBackgroundDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, FeatureEducationBackgroundDto$$serializer.INSTANCE, null);
            ImageDto imageDto2 = (ImageDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, ImageDto$$serializer.INSTANCE, null);
            FeatureEducationVideoDto featureEducationVideoDto2 = (FeatureEducationVideoDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, FeatureEducationVideoDto$$serializer.INSTANCE, null);
            int iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 10);
            FeatureEducationButtonDto featureEducationButtonDto2 = (FeatureEducationButtonDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, FeatureEducationButtonDto$$serializer.INSTANCE, null);
            i13 = 16383;
            navBarDto = (NavBarDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, NavBarDto$$serializer.INSTANCE, null);
            list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            i14 = iDecodeIntElement3;
            featureEducationVideoDto = featureEducationVideoDto2;
            featureEducationBackgroundDto = featureEducationBackgroundDto2;
            i15 = iDecodeIntElement2;
            str3 = strDecodeStringElement3;
            str = strDecodeStringElement;
            imageDto = imageDto2;
            str2 = strDecodeStringElement2;
            list2 = list4;
            featureEducationButtonDto = featureEducationButtonDto2;
        } else {
            int i17 = 13;
            iDecodeIntElement = 0;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            List list5 = null;
            NavBarDto navBarDto2 = null;
            FeatureEducationButtonDto featureEducationButtonDto3 = null;
            ImageDto imageDto3 = null;
            FeatureEducationVideoDto featureEducationVideoDto3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean z4 = true;
            int i18 = 2;
            i13 = 0;
            List list6 = null;
            list = null;
            FeatureEducationBackgroundDto featureEducationBackgroundDto3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i17 = 13;
                        i18 = 2;
                        break;
                    case 0:
                        iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                        i13 |= 1;
                        i17 = 13;
                        i16 = 10;
                        i18 = 2;
                        break;
                    case 1:
                        list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), list6);
                        i13 |= 2;
                        i17 = 13;
                        i16 = 10;
                        i18 = 2;
                        break;
                    case 2:
                        list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), list);
                        i13 |= 4;
                        i17 = 13;
                        i16 = 10;
                        break;
                    case 3:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i13 |= 8;
                        i17 = 13;
                        break;
                    case 4:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i13 |= 16;
                        i17 = 13;
                        break;
                    case 5:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i13 |= 32;
                        i17 = 13;
                        break;
                    case 6:
                        iDecodeIntElement5 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 6);
                        i13 |= 64;
                        i17 = 13;
                        break;
                    case 7:
                        featureEducationBackgroundDto3 = (FeatureEducationBackgroundDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, FeatureEducationBackgroundDto$$serializer.INSTANCE, featureEducationBackgroundDto3);
                        i13 |= 128;
                        i17 = 13;
                        break;
                    case 8:
                        imageDto3 = (ImageDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, ImageDto$$serializer.INSTANCE, imageDto3);
                        i13 |= 256;
                        i17 = 13;
                        break;
                    case 9:
                        featureEducationVideoDto3 = (FeatureEducationVideoDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, FeatureEducationVideoDto$$serializer.INSTANCE, featureEducationVideoDto3);
                        i13 |= 512;
                        i17 = 13;
                        break;
                    case 10:
                        iDecodeIntElement4 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, i16);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i17 = 13;
                        break;
                    case 11:
                        featureEducationButtonDto3 = (FeatureEducationButtonDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, FeatureEducationButtonDto$$serializer.INSTANCE, featureEducationButtonDto3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i17 = 13;
                        break;
                    case 12:
                        navBarDto2 = (NavBarDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, NavBarDto$$serializer.INSTANCE, navBarDto2);
                        i13 |= 4096;
                        i17 = 13;
                        break;
                    case 13:
                        list5 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list5);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list2 = list6;
            list3 = list5;
            navBarDto = navBarDto2;
            featureEducationButtonDto = featureEducationButtonDto3;
            imageDto = imageDto3;
            featureEducationVideoDto = featureEducationVideoDto3;
            featureEducationBackgroundDto = featureEducationBackgroundDto3;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            i14 = iDecodeIntElement4;
            i15 = iDecodeIntElement5;
        }
        int i19 = iDecodeIntElement;
        int i24 = i13;
        List list7 = list;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new FeatureEducationScreenDto(i24, i19, list2, list7, str, str2, str3, i15, featureEducationBackgroundDto, imageDto, featureEducationVideoDto, i14, featureEducationButtonDto, navBarDto, list3, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, FeatureEducationScreenDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        FeatureEducationScreenDto.write$Self$education_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
