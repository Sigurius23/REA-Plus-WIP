package com.whoop.educationModels;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/educationModels/SentenceDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/educationModels/SentenceDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/educationModels/SentenceDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/educationModels/SentenceDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SentenceDto$$serializer implements GeneratedSerializer<SentenceDto> {
    public static final int $stable;
    public static final SentenceDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SentenceDto$$serializer sentenceDto$$serializer = new SentenceDto$$serializer();
        INSTANCE = sentenceDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.educationModels.SentenceDto", sentenceDto$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("text_style", false);
        pluginGeneratedSerialDescriptor.addElement("created_at", false);
        pluginGeneratedSerialDescriptor.addElement("updated_at", false);
        pluginGeneratedSerialDescriptor.addElement("text", false);
        pluginGeneratedSerialDescriptor.addElement("paragraph_id", false);
        pluginGeneratedSerialDescriptor.addElement("divider", false);
        pluginGeneratedSerialDescriptor.addElement("clickable_text_url", false);
        pluginGeneratedSerialDescriptor.addElement("inline_icon", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SentenceDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(Divider$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(InlineIcon$$serializer.INSTANCE);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{intSerializer, ScreenTextStyleDto$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, intSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SentenceDto deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        InlineIcon inlineIcon;
        String str;
        Divider divider;
        int i13;
        int i14;
        ScreenTextStyleDto screenTextStyleDto;
        String str2;
        String str3;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i15 = 7;
        int i16 = 6;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            ScreenTextStyleDto screenTextStyleDto2 = (ScreenTextStyleDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, ScreenTextStyleDto$$serializer.INSTANCE, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 5);
            Divider divider2 = (Divider) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, Divider$$serializer.INSTANCE, null);
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, null);
            divider = divider2;
            i13 = iDecodeIntElement2;
            str3 = strDecodeStringElement2;
            inlineIcon = (InlineIcon) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, InlineIcon$$serializer.INSTANCE, null);
            str4 = strDecodeStringElement3;
            str2 = strDecodeStringElement;
            screenTextStyleDto = screenTextStyleDto2;
            i14 = 511;
        } else {
            boolean z4 = true;
            iDecodeIntElement = 0;
            int i17 = 0;
            InlineIcon inlineIcon2 = null;
            String str5 = null;
            ScreenTextStyleDto screenTextStyleDto3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int iDecodeIntElement3 = 0;
            Divider divider3 = null;
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
                        screenTextStyleDto3 = (ScreenTextStyleDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, ScreenTextStyleDto$$serializer.INSTANCE, screenTextStyleDto3);
                        i17 |= 2;
                        i15 = 7;
                        i16 = 6;
                        break;
                    case 2:
                        i17 |= 4;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
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
                        iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 5);
                        i17 |= 32;
                        break;
                    case 6:
                        divider3 = (Divider) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, Divider$$serializer.INSTANCE, divider3);
                        i17 |= 64;
                        break;
                    case 7:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, StringSerializer.INSTANCE, str5);
                        i17 |= 128;
                        break;
                    case 8:
                        inlineIcon2 = (InlineIcon) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, InlineIcon$$serializer.INSTANCE, inlineIcon2);
                        i17 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            inlineIcon = inlineIcon2;
            str = str5;
            divider = divider3;
            i13 = iDecodeIntElement3;
            i14 = i17;
            screenTextStyleDto = screenTextStyleDto3;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
        }
        int i18 = iDecodeIntElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SentenceDto(i14, i18, screenTextStyleDto, str2, str3, str4, i13, divider, str, inlineIcon, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SentenceDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SentenceDto.write$Self$education_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
