package com.whoop.design.models.cards;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/cards/TextWithDesignItemCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TextWithDesignItemCardModel$$serializer implements GeneratedSerializer<TextWithDesignItemCardModel> {
    public static final int $stable;
    public static final TextWithDesignItemCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TextWithDesignItemCardModel$$serializer textWithDesignItemCardModel$$serializer = new TextWithDesignItemCardModel$$serializer();
        INSTANCE = textWithDesignItemCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.cards.TextWithDesignItemCardModel", textWithDesignItemCardModel$$serializer, 16);
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
        pluginGeneratedSerialDescriptor.addElement("rightItem", true);
        pluginGeneratedSerialDescriptor.addElement("templateName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TextWithDesignItemCardModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = TextWithDesignItemCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), AbstractC38195a.m122336d(stringSerializer), BooleanSerializer.INSTANCE, interfaceC23462hArr[8].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[14].getValue()), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TextWithDesignItemCardModel deserialize(InterfaceC40541d decoder) {
        C9598e c9598e;
        EnumC22400l enumC22400l;
        String str;
        String str2;
        DesignSystemModel designSystemModel;
        String str3;
        String str4;
        EnumC16533a enumC16533a;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i13;
        String str10;
        boolean z4;
        String str11;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = TextWithDesignItemCardModel.$childSerializers;
        String str12 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            EnumC22400l enumC22400l2 = (EnumC22400l) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
            EnumC16533a enumC16533a2 = (EnumC16533a) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            String str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            String str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            String str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            designSystemModel = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), null);
            str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, stringSerializer, null);
            enumC22400l = enumC22400l2;
            str8 = str13;
            i13 = 65535;
            str5 = str16;
            z4 = zDecodeBooleanElement;
            str6 = str15;
            str9 = strDecodeStringElement3;
            str = str14;
            str11 = strDecodeStringElement2;
            enumC16533a = enumC16533a2;
            str4 = str17;
            str10 = strDecodeStringElement;
            str3 = str18;
            c9598e = c9598e2;
            str7 = str19;
        } else {
            int i14 = 5;
            boolean z13 = true;
            int i15 = 0;
            boolean zDecodeBooleanElement2 = false;
            String str20 = null;
            C9598e c9598e3 = null;
            EnumC22400l enumC22400l3 = null;
            String str21 = null;
            DesignSystemModel designSystemModel2 = null;
            String str22 = null;
            String str23 = null;
            EnumC16533a enumC16533a3 = null;
            String str24 = null;
            String str25 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int i16 = 8;
            String str26 = null;
            while (z13) {
                String str27 = strDecodeStringElement4;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        str20 = str20;
                        i15 = i15;
                        strDecodeStringElement4 = str27;
                        i14 = 5;
                        i16 = 8;
                        break;
                    case 0:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        str20 = str20;
                        i15 |= 1;
                        strDecodeStringElement4 = str27;
                        i14 = 5;
                        i16 = 8;
                        break;
                    case 1:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str20);
                        i15 |= 2;
                        strDecodeStringElement4 = str27;
                        i14 = 5;
                        i16 = 8;
                        break;
                    case 2:
                        str20 = str20;
                        i15 |= 4;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        str20 = str20;
                        i14 = 5;
                        i16 = 8;
                        break;
                    case 3:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i15 |= 8;
                        strDecodeStringElement4 = str27;
                        str20 = str20;
                        i14 = 5;
                        i16 = 8;
                        break;
                    case 4:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str21);
                        i15 |= 16;
                        strDecodeStringElement4 = str27;
                        str20 = str20;
                        i14 = 5;
                        i16 = 8;
                        break;
                    case 5:
                        enumC22400l3 = (EnumC22400l) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), enumC22400l3);
                        i15 |= 32;
                        strDecodeStringElement4 = str27;
                        str20 = str20;
                        i16 = 8;
                        break;
                    case 6:
                        str25 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str25);
                        i15 |= 64;
                        strDecodeStringElement4 = str27;
                        str20 = str20;
                        i16 = 8;
                        break;
                    case 7:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
                        i15 |= 128;
                        strDecodeStringElement4 = str27;
                        str20 = str20;
                        break;
                    case 8:
                        enumC16533a3 = (EnumC16533a) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), enumC16533a3);
                        i15 |= 256;
                        strDecodeStringElement4 = str27;
                        str20 = str20;
                        break;
                    case 9:
                        str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str24);
                        i15 |= 512;
                        strDecodeStringElement4 = str27;
                        str20 = str20;
                        break;
                    case 10:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), c9598e3);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        strDecodeStringElement4 = str27;
                        str20 = str20;
                        break;
                    case 11:
                        str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str23);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        strDecodeStringElement4 = str27;
                        str20 = str20;
                        break;
                    case 12:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str22);
                        i15 |= 4096;
                        strDecodeStringElement4 = str27;
                        str20 = str20;
                        break;
                    case 13:
                        str26 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str26);
                        i15 |= DfuBaseService.ERROR_REMOTE_MASK;
                        strDecodeStringElement4 = str27;
                        str20 = str20;
                        break;
                    case 14:
                        designSystemModel2 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), designSystemModel2);
                        i15 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        strDecodeStringElement4 = str27;
                        str20 = str20;
                        break;
                    case 15:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, StringSerializer.INSTANCE, str12);
                        i15 |= 32768;
                        strDecodeStringElement4 = str27;
                        str20 = str20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            c9598e = c9598e3;
            enumC22400l = enumC22400l3;
            str = str21;
            str2 = str12;
            designSystemModel = designSystemModel2;
            str3 = str22;
            str4 = str23;
            enumC16533a = enumC16533a3;
            str5 = str24;
            str6 = str25;
            str7 = str26;
            str8 = str20;
            str9 = strDecodeStringElement5;
            i13 = i15;
            str10 = strDecodeStringElement6;
            z4 = zDecodeBooleanElement2;
            str11 = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TextWithDesignItemCardModel(i13, str10, str8, str11, str9, str, enumC22400l, str6, z4, enumC16533a, str5, c9598e, str4, str3, str7, designSystemModel, str2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TextWithDesignItemCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TextWithDesignItemCardModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
