package com.whoop.design.models.cards;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import h01.EnumC16533a;
import kd1.EnumC22400l;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/cards/TextWithIllustrationCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TextWithIllustrationCardModel$$serializer implements GeneratedSerializer<TextWithIllustrationCardModel> {
    public static final int $stable;
    public static final TextWithIllustrationCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TextWithIllustrationCardModel$$serializer textWithIllustrationCardModel$$serializer = new TextWithIllustrationCardModel$$serializer();
        INSTANCE = textWithIllustrationCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.cards.TextWithIllustrationCardModel", textWithIllustrationCardModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("appNotificationType", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("ctaText", false);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("showHighlight", false);
        pluginGeneratedSerialDescriptor.addElement("cardType", true);
        pluginGeneratedSerialDescriptor.addElement("backgroundStyle", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_NAVIGATION, false);
        pluginGeneratedSerialDescriptor.addElement("androidFeatureFlagName", true);
        pluginGeneratedSerialDescriptor.addElement("endIcon", true);
        pluginGeneratedSerialDescriptor.addElement("titleIconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("templateName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TextWithIllustrationCardModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = TextWithIllustrationCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), stringSerializer, BooleanSerializer.INSTANCE, interfaceC23462hArr[8].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TextWithIllustrationCardModel deserialize(InterfaceC40541d decoder) {
        String str;
        int i13;
        String str2;
        EnumC22400l enumC22400l;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C9598e c9598e;
        EnumC16533a enumC16533a;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z4;
        InterfaceC23462h[] interfaceC23462hArr;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr2 = TextWithIllustrationCardModel.$childSerializers;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            EnumC22400l enumC22400l2 = (EnumC22400l) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr2[5].getValue(), null);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
            EnumC16533a enumC16533a2 = (EnumC16533a) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr2[8].getValue(), null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr2[10].getValue(), null);
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            str4 = strDecodeStringElement2;
            enumC16533a = enumC16533a2;
            str8 = str12;
            i13 = 32767;
            str7 = str14;
            z4 = zDecodeBooleanElement;
            str11 = strDecodeStringElement5;
            str10 = strDecodeStringElement4;
            str3 = str13;
            str9 = strDecodeStringElement3;
            enumC22400l = enumC22400l2;
            str5 = str16;
            str6 = str15;
            c9598e = c9598e2;
        } else {
            int i14 = 8;
            boolean z13 = true;
            int i15 = 0;
            boolean zDecodeBooleanElement2 = false;
            String str17 = null;
            EnumC22400l enumC22400l3 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            C9598e c9598e3 = null;
            EnumC16533a enumC16533a3 = null;
            String str22 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int i16 = 5;
            str = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i16 = 5;
                        i14 = 8;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 |= 1;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i16 = 5;
                        i14 = 8;
                        break;
                    case 1:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str22);
                        i15 |= 2;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i16 = 5;
                        i14 = 8;
                        break;
                    case 2:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i15 |= 4;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i16 = 5;
                        i14 = 8;
                        break;
                    case 3:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i15 |= 8;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i16 = 5;
                        i14 = 8;
                        break;
                    case 4:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str18);
                        i15 |= 16;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i16 = 5;
                        i14 = 8;
                        break;
                    case 5:
                        InterfaceC23462h[] interfaceC23462hArr3 = interfaceC23462hArr2;
                        enumC22400l3 = (EnumC22400l) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr3[i16].getValue(), enumC22400l3);
                        i15 |= 32;
                        interfaceC23462hArr2 = interfaceC23462hArr3;
                        i14 = 8;
                        break;
                    case 6:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i15 |= 64;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 7:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
                        i15 |= 128;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 8:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        enumC16533a3 = (EnumC16533a) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), enumC16533a3);
                        i15 |= 256;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 9:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str21);
                        i15 |= 512;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        break;
                    case 10:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), c9598e3);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 11:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 12:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str20);
                        i15 |= 4096;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 13:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str19);
                        i15 |= DfuBaseService.ERROR_REMOTE_MASK;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 14:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str17);
                        i15 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            str2 = str17;
            enumC22400l = enumC22400l3;
            str3 = str18;
            str4 = strDecodeStringElement;
            str5 = str19;
            str6 = str20;
            str7 = str21;
            c9598e = c9598e3;
            enumC16533a = enumC16533a3;
            str8 = str22;
            str9 = strDecodeStringElement6;
            str10 = strDecodeStringElement7;
            str11 = strDecodeStringElement8;
            z4 = zDecodeBooleanElement2;
        }
        String str23 = str;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TextWithIllustrationCardModel(i13, str4, str8, str9, str10, str3, enumC22400l, str11, z4, enumC16533a, str7, c9598e, str23, str6, str5, str2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TextWithIllustrationCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TextWithIllustrationCardModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
