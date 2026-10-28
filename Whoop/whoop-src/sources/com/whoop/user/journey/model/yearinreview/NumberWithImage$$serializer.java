package com.whoop.user.journey.model.yearinreview;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/user/journey/model/yearinreview/NumberWithImage.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class NumberWithImage$$serializer implements GeneratedSerializer<NumberWithImage> {
    public static final int $stable;
    public static final NumberWithImage$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        NumberWithImage$$serializer numberWithImage$$serializer = new NumberWithImage$$serializer();
        INSTANCE = numberWithImage$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.user.journey.model.yearinreview.NumberWithImage", numberWithImage$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("displayNumber", false);
        pluginGeneratedSerialDescriptor.addElement("numberFontSize", true);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("highlightedTexts", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("theme", false);
        pluginGeneratedSerialDescriptor.addElement("themeVariant", false);
        pluginGeneratedSerialDescriptor.addElement("recoveryBadgeLevel", true);
        pluginGeneratedSerialDescriptor.addElement("recoveryBadgeImageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("foundingMember", true);
        pluginGeneratedSerialDescriptor.addElement("whoopPro", true);
        pluginGeneratedSerialDescriptor.addElement("footerTexts", true);
        pluginGeneratedSerialDescriptor.addElement("footerText", true);
        pluginGeneratedSerialDescriptor.addElement("footerSubText", true);
        pluginGeneratedSerialDescriptor.addElement("backgroundImageUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NumberWithImage$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = NumberWithImage.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue()), stringSerializer, interfaceC23462hArr[4].getValue(), stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), booleanSerializer, booleanSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[12].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final NumberWithImage deserialize(InterfaceC40541d decoder) {
        NumberWithImageFontSize numberWithImageFontSize;
        List list;
        String str;
        List list2;
        int i13;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z4;
        boolean z13;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = NumberWithImage.$childSerializers;
        char c3 = '\t';
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            NumberWithImageFontSize numberWithImageFontSize2 = (NumberWithImageFontSize) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 10);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 11);
            List list4 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, stringSerializer, null);
            i13 = 65535;
            str5 = str15;
            numberWithImageFontSize = numberWithImageFontSize2;
            str2 = strDecodeStringElement;
            z4 = zDecodeBooleanElement2;
            str8 = strDecodeStringElement2;
            str6 = str14;
            str11 = strDecodeStringElement5;
            str10 = strDecodeStringElement4;
            str9 = strDecodeStringElement3;
            str = str13;
            z13 = zDecodeBooleanElement;
            str4 = str16;
            list = list4;
            str7 = str12;
            list2 = list3;
        } else {
            String str17 = null;
            int i14 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            int i15 = 4;
            int i16 = 2;
            boolean z14 = true;
            NumberWithImageFontSize numberWithImageFontSize3 = null;
            List list5 = null;
            String str18 = null;
            List list6 = null;
            String strDecodeStringElement6 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z14) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        i16 = 2;
                        i15 = 4;
                        break;
                    case 0:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str17);
                        i14 |= 1;
                        c3 = '\t';
                        i16 = 2;
                        i15 = 4;
                        break;
                    case 1:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 |= 2;
                        c3 = '\t';
                        i15 = 4;
                        break;
                    case 2:
                        numberWithImageFontSize3 = (NumberWithImageFontSize) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), numberWithImageFontSize3);
                        i14 |= 4;
                        c3 = '\t';
                        i15 = 4;
                        break;
                    case 3:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i14 |= 8;
                        c3 = '\t';
                        break;
                    case 4:
                        list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list6);
                        i14 |= 16;
                        c3 = '\t';
                        break;
                    case 5:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i14 |= 32;
                        c3 = '\t';
                        break;
                    case 6:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i14 |= 64;
                        c3 = '\t';
                        break;
                    case 7:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i14 |= 128;
                        c3 = '\t';
                        break;
                    case 8:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str18);
                        i14 |= 256;
                        c3 = '\t';
                        break;
                    case 9:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str22);
                        i14 |= 512;
                        c3 = '\t';
                        break;
                    case 10:
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 10);
                        i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        c3 = '\t';
                        break;
                    case 11:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 11);
                        i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c3 = '\t';
                        break;
                    case 12:
                        list5 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), list5);
                        i14 |= 4096;
                        c3 = '\t';
                        break;
                    case 13:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str21);
                        i14 |= DfuBaseService.ERROR_REMOTE_MASK;
                        c3 = '\t';
                        break;
                    case 14:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str20);
                        i14 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        c3 = '\t';
                        break;
                    case 15:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, StringSerializer.INSTANCE, str19);
                        i14 |= 32768;
                        c3 = '\t';
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            numberWithImageFontSize = numberWithImageFontSize3;
            list = list5;
            str = str18;
            list2 = list6;
            i13 = i14;
            str2 = strDecodeStringElement6;
            str3 = str19;
            str4 = str20;
            str5 = str21;
            str6 = str22;
            str7 = str17;
            str8 = strDecodeStringElement7;
            str9 = strDecodeStringElement8;
            str10 = strDecodeStringElement9;
            str11 = strDecodeStringElement10;
            z4 = zDecodeBooleanElement3;
            z13 = zDecodeBooleanElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new NumberWithImage(i13, str7, str2, numberWithImageFontSize, str8, list2, str9, str10, str11, str, str6, z13, z4, list, str5, str4, str3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, NumberWithImage value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        NumberWithImage.write$Self$user_journey_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
