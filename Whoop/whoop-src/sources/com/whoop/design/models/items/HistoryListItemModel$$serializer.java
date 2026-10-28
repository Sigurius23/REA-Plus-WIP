package com.whoop.design.models.items;

import com.whoop.design.atomic.organism.historylistitem.HistoryListItemStyle;
import com.whoop.navigation.C9598e;
import kotlinx.serialization.UnknownFieldException;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/HistoryListItemModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/HistoryListItemModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/HistoryListItemModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/HistoryListItemModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HistoryListItemModel$$serializer implements GeneratedSerializer<HistoryListItemModel> {
    public static final int $stable;
    public static final HistoryListItemModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HistoryListItemModel$$serializer historyListItemModel$$serializer = new HistoryListItemModel$$serializer();
        INSTANCE = historyListItemModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.HistoryListItemModel", historyListItemModel$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("trailingText", false);
        pluginGeneratedSerialDescriptor.addElement("leftIcon", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("rightIcon", false);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        pluginGeneratedSerialDescriptor.addElement("warning", false);
        pluginGeneratedSerialDescriptor.addElement("caption", false);
        pluginGeneratedSerialDescriptor.addElement("expandedContent", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HistoryListItemModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HistoryListItemModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[7].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(HistoryListItemExpandedContentModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HistoryListItemModel deserialize(InterfaceC40541d decoder) {
        String str;
        String str2;
        String str3;
        int i13;
        String str4;
        C9598e c9598e;
        String str5;
        HistoryListItemStyle historyListItemStyle;
        String str6;
        HistoryListItemExpandedContentModel historyListItemExpandedContentModel;
        String str7;
        String str8;
        String str9;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HistoryListItemModel.$childSerializers;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            HistoryListItemStyle historyListItemStyle2 = (HistoryListItemStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            c9598e = c9598e2;
            str2 = strDecodeStringElement2;
            historyListItemExpandedContentModel = (HistoryListItemExpandedContentModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, HistoryListItemExpandedContentModel$$serializer.INSTANCE, null);
            historyListItemStyle = historyListItemStyle2;
            str4 = str15;
            str5 = str14;
            str6 = str13;
            str8 = str11;
            str7 = str12;
            str3 = str10;
            i13 = 4095;
            str9 = strDecodeStringElement3;
        } else {
            String strDecodeStringElement4 = null;
            String str16 = null;
            String str17 = null;
            C9598e c9598e3 = null;
            String str18 = null;
            HistoryListItemStyle historyListItemStyle3 = null;
            String str19 = null;
            int i14 = 7;
            int i15 = 8;
            boolean z4 = true;
            int i16 = 0;
            str = null;
            HistoryListItemExpandedContentModel historyListItemExpandedContentModel2 = null;
            String str20 = null;
            String str21 = null;
            while (z4) {
                interfaceC23462hArr = interfaceC23462hArr;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        i15 = 8;
                        break;
                    case 0:
                        i16 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        strDecodeStringElement4 = strDecodeStringElement4;
                        i14 = 7;
                        i15 = 8;
                        break;
                    case 1:
                        i16 |= 2;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 = 7;
                        i15 = 8;
                        break;
                    case 2:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str16);
                        i16 |= 4;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        i14 = 7;
                        i15 = 8;
                        break;
                    case 3:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str21);
                        i16 |= 8;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        i14 = 7;
                        i15 = 8;
                        break;
                    case 4:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str20);
                        i16 |= 16;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        i14 = 7;
                        i15 = 8;
                        break;
                    case 5:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str19);
                        i16 |= 32;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        i14 = 7;
                        i15 = 8;
                        break;
                    case 6:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str18);
                        i16 |= 64;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        i14 = 7;
                        i15 = 8;
                        break;
                    case 7:
                        historyListItemStyle3 = (HistoryListItemStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), historyListItemStyle3);
                        i16 |= 128;
                        interfaceC23462hArr = interfaceC23462hArr;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        i15 = 8;
                        break;
                    case 8:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), c9598e3);
                        i16 |= 256;
                        interfaceC23462hArr = interfaceC23462hArr;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 9:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str17);
                        i16 |= 512;
                        interfaceC23462hArr = interfaceC23462hArr;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 10:
                        str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        interfaceC23462hArr = interfaceC23462hArr;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 11:
                        historyListItemExpandedContentModel2 = (HistoryListItemExpandedContentModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, HistoryListItemExpandedContentModel$$serializer.INSTANCE, historyListItemExpandedContentModel2);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        interfaceC23462hArr = interfaceC23462hArr;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str2 = strDecodeStringElement;
            str3 = str16;
            i13 = i16;
            str4 = str17;
            c9598e = c9598e3;
            str5 = str18;
            historyListItemStyle = historyListItemStyle3;
            str6 = str19;
            historyListItemExpandedContentModel = historyListItemExpandedContentModel2;
            str7 = str20;
            str8 = str21;
            str9 = strDecodeStringElement4;
        }
        String str22 = str;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HistoryListItemModel(i13, str2, str9, str3, str8, str7, str6, str5, historyListItemStyle, c9598e, str4, str22, historyListItemExpandedContentModel, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HistoryListItemModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HistoryListItemModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
