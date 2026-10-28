package com.whoop.design.models.items;

import com.whoop.design.atomic.atom.TrendTypeEnum;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/KeyMetricTileModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/KeyMetricTileModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/KeyMetricTileModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/KeyMetricTileModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class KeyMetricTileModel$$serializer implements GeneratedSerializer<KeyMetricTileModel> {
    public static final int $stable;
    public static final KeyMetricTileModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        KeyMetricTileModel$$serializer keyMetricTileModel$$serializer = new KeyMetricTileModel$$serializer();
        INSTANCE = keyMetricTileModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.KeyMetricTileModel", keyMetricTileModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("keyMetricTileIcon", true);
        pluginGeneratedSerialDescriptor.addElement("keyMetricTileTitleDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("keyMetricTileStatValueDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("keyMetricTileSuffixDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("keyMetricTileTrendDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("keyMetricTileTrendType", true);
        pluginGeneratedSerialDescriptor.addElement("keyMetricTileTrendBar", true);
        pluginGeneratedSerialDescriptor.addElement("placeholderMessageDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("keyMetricTileDialogContent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private KeyMetricTileModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = KeyMetricTileModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d(TrendBarModel$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(KeyMetricTileModelDialogContentModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final KeyMetricTileModel deserialize(InterfaceC40541d decoder) {
        int i13;
        KeyMetricTileModelDialogContentModel keyMetricTileModelDialogContentModel;
        TrendBarModel trendBarModel;
        String str;
        TrendTypeEnum trendTypeEnum;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = KeyMetricTileModel.$childSerializers;
        int i14 = 9;
        int i15 = 7;
        int i16 = 6;
        String str8 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            TrendTypeEnum trendTypeEnum2 = (TrendTypeEnum) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            TrendBarModel trendBarModel2 = (TrendBarModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, TrendBarModel$$serializer.INSTANCE, null);
            trendTypeEnum = trendTypeEnum2;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            keyMetricTileModelDialogContentModel = (KeyMetricTileModelDialogContentModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, KeyMetricTileModelDialogContentModel$$serializer.INSTANCE, null);
            trendBarModel = trendBarModel2;
            str2 = str11;
            str7 = strDecodeStringElement3;
            i13 = 1023;
            str3 = str10;
            str6 = strDecodeStringElement2;
            str5 = strDecodeStringElement;
            str4 = str9;
        } else {
            boolean z4 = true;
            int i17 = 0;
            KeyMetricTileModelDialogContentModel keyMetricTileModelDialogContentModel2 = null;
            TrendBarModel trendBarModel3 = null;
            String str12 = null;
            TrendTypeEnum trendTypeEnum3 = null;
            String str13 = null;
            String str14 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z4) {
                int i18 = i16;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 7;
                        i16 = 6;
                        break;
                    case 0:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str8);
                        i17 |= 1;
                        i14 = 9;
                        i15 = 7;
                        i16 = 6;
                        break;
                    case 1:
                        i17 |= 2;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 = 9;
                        i16 = 6;
                        break;
                    case 2:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i17 |= 4;
                        i14 = 9;
                        i16 = 6;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i17 |= 8;
                        i14 = 9;
                        i16 = 6;
                        break;
                    case 4:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str14);
                        i17 |= 16;
                        i14 = 9;
                        i16 = 6;
                        break;
                    case 5:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str13);
                        i17 |= 32;
                        i14 = 9;
                        i16 = 6;
                        break;
                    case 6:
                        trendTypeEnum3 = (TrendTypeEnum) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), trendTypeEnum3);
                        i17 |= 64;
                        i16 = i18;
                        i14 = 9;
                        break;
                    case 7:
                        trendBarModel3 = (TrendBarModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, TrendBarModel$$serializer.INSTANCE, trendBarModel3);
                        i17 |= 128;
                        i16 = i18;
                        break;
                    case 8:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str12);
                        i17 |= 256;
                        i16 = i18;
                        break;
                    case 9:
                        keyMetricTileModelDialogContentModel2 = (KeyMetricTileModelDialogContentModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, KeyMetricTileModelDialogContentModel$$serializer.INSTANCE, keyMetricTileModelDialogContentModel2);
                        i17 |= 512;
                        i16 = i18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            keyMetricTileModelDialogContentModel = keyMetricTileModelDialogContentModel2;
            trendBarModel = trendBarModel3;
            str = str12;
            trendTypeEnum = trendTypeEnum3;
            str2 = str13;
            str3 = str14;
            str4 = str8;
            str5 = strDecodeStringElement4;
            str6 = strDecodeStringElement5;
            str7 = strDecodeStringElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new KeyMetricTileModel(i13, str4, str5, str6, str7, str3, str2, trendTypeEnum, trendBarModel, str, keyMetricTileModelDialogContentModel, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, KeyMetricTileModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        KeyMetricTileModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
