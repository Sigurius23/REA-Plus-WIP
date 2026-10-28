package com.whoop.advancedlabs.feature.hormonalcontext.domain.models;

import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SingleSelectScreenContent$$serializer implements GeneratedSerializer<SingleSelectScreenContent> {
    public static final int $stable;
    public static final SingleSelectScreenContent$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SingleSelectScreenContent$$serializer singleSelectScreenContent$$serializer = new SingleSelectScreenContent$$serializer();
        INSTANCE = singleSelectScreenContent$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.advancedlabs.feature.hormonalcontext.domain.models.SingleSelectScreenContent", singleSelectScreenContent$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("infoCallout", false);
        pluginGeneratedSerialDescriptor.addElement("bottomSheet", false);
        pluginGeneratedSerialDescriptor.addElement("footerText", false);
        pluginGeneratedSerialDescriptor.addElement("optionsHeader", false);
        pluginGeneratedSerialDescriptor.addElement("optionsHeaderIcon", false);
        pluginGeneratedSerialDescriptor.addElement("options", false);
        pluginGeneratedSerialDescriptor.addElement("selectedOptionId", false);
        pluginGeneratedSerialDescriptor.addElement("nextButtonTitle", false);
        pluginGeneratedSerialDescriptor.addElement("saveButtonTitle", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SingleSelectScreenContent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = SingleSelectScreenContent.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(InfoCalloutTileModel$$serializer.INSTANCE), AbstractC38195a.m122336d(HormonalContextBottomSheet$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, interfaceC23462hArr[8].getValue(), AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SingleSelectScreenContent deserialize(InterfaceC40541d decoder) {
        String str;
        String str2;
        int i13;
        String str3;
        String str4;
        List list;
        HormonalContextBottomSheet hormonalContextBottomSheet;
        InfoCalloutTileModel infoCalloutTileModel;
        String str5;
        String str6;
        String str7;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = SingleSelectScreenContent.$childSerializers;
        int i14 = 9;
        String strDecodeStringElement3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            InfoCalloutTileModel infoCalloutTileModel2 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, InfoCalloutTileModel$$serializer.INSTANCE, null);
            HormonalContextBottomSheet hormonalContextBottomSheet2 = (HormonalContextBottomSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, HormonalContextBottomSheet$$serializer.INSTANCE, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            list = list2;
            str = strDecodeStringElement4;
            str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            infoCalloutTileModel = infoCalloutTileModel2;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
            str7 = strDecodeStringElement6;
            str6 = strDecodeStringElement5;
            str4 = str10;
            hormonalContextBottomSheet = hormonalContextBottomSheet2;
            strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
            str5 = str9;
            i13 = 4095;
            str2 = str8;
        } else {
            int i15 = 11;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            List list3 = null;
            HormonalContextBottomSheet hormonalContextBottomSheet3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            boolean z4 = true;
            int i16 = 0;
            InfoCalloutTileModel infoCalloutTileModel3 = null;
            String str14 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 11;
                        break;
                    case 0:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i15 = 11;
                        i14 = 9;
                        break;
                    case 1:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str11);
                        i16 |= 2;
                        i15 = 11;
                        i14 = 9;
                        break;
                    case 2:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str14);
                        i16 |= 4;
                        i15 = 11;
                        i14 = 9;
                        break;
                    case 3:
                        infoCalloutTileModel3 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, InfoCalloutTileModel$$serializer.INSTANCE, infoCalloutTileModel3);
                        i16 |= 8;
                        i15 = 11;
                        i14 = 9;
                        break;
                    case 4:
                        hormonalContextBottomSheet3 = (HormonalContextBottomSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, HormonalContextBottomSheet$$serializer.INSTANCE, hormonalContextBottomSheet3);
                        i16 |= 16;
                        i15 = 11;
                        i14 = 9;
                        break;
                    case 5:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str13);
                        i16 |= 32;
                        i15 = 11;
                        i14 = 9;
                        break;
                    case 6:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i16 |= 64;
                        i15 = 11;
                        break;
                    case 7:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i16 |= 128;
                        i15 = 11;
                        break;
                    case 8:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), list3);
                        i16 |= 256;
                        i15 = 11;
                        break;
                    case 9:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str12);
                        i16 |= 512;
                        i15 = 11;
                        break;
                    case 10:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    case 11:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i15);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement3;
            str2 = str11;
            i13 = i16;
            str3 = str12;
            str4 = str13;
            list = list3;
            hormonalContextBottomSheet = hormonalContextBottomSheet3;
            infoCalloutTileModel = infoCalloutTileModel3;
            str5 = str14;
            str6 = strDecodeStringElement7;
            str7 = strDecodeStringElement8;
            strDecodeStringElement = strDecodeStringElement9;
            strDecodeStringElement2 = strDecodeStringElement10;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SingleSelectScreenContent(i13, str, str2, str5, infoCalloutTileModel, hormonalContextBottomSheet, str4, str6, str7, list, str3, strDecodeStringElement, strDecodeStringElement2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SingleSelectScreenContent value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SingleSelectScreenContent.write$Self$advanced_labs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
