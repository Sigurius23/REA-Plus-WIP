package com.whoop.homecustomization.domain.legacy.models;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HomeCustomizationResponse$$serializer implements GeneratedSerializer<HomeCustomizationResponse> {
    public static final int $stable;
    public static final HomeCustomizationResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HomeCustomizationResponse$$serializer homeCustomizationResponse$$serializer = new HomeCustomizationResponse$$serializer();
        INSTANCE = homeCustomizationResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.homecustomization.domain.legacy.models.HomeCustomizationResponse", homeCustomizationResponse$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("defaultStatLeftName", false);
        pluginGeneratedSerialDescriptor.addElement("defaultStatRightName", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("errorMessage", false);
        pluginGeneratedSerialDescriptor.addElement("pinnedKeyStatsHeader", false);
        pluginGeneratedSerialDescriptor.addElement("unpinnedKeyStatsHeader", false);
        pluginGeneratedSerialDescriptor.addElement("pinned_key_stats_section", false);
        pluginGeneratedSerialDescriptor.addElement("unpinned_key_stats_section", false);
        pluginGeneratedSerialDescriptor.addElement("toggleKeyStats", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HomeCustomizationResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HomeCustomizationResponse.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KeyStatSection$$serializer keyStatSection$$serializer = KeyStatSection$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, keyStatSection$$serializer, keyStatSection$$serializer, interfaceC23462hArr[8].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HomeCustomizationResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        KeyStatSection keyStatSection;
        KeyStatSection keyStatSection2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HomeCustomizationResponse.$childSerializers;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            KeyStatSection$$serializer keyStatSection$$serializer = KeyStatSection$$serializer.INSTANCE;
            KeyStatSection keyStatSection3 = (KeyStatSection) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, keyStatSection$$serializer, null);
            KeyStatSection keyStatSection4 = (KeyStatSection) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, keyStatSection$$serializer, null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            str = strDecodeStringElement2;
            keyStatSection = keyStatSection4;
            keyStatSection2 = keyStatSection3;
            str6 = strDecodeStringElement7;
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement6;
            str3 = strDecodeStringElement4;
            i13 = 511;
            str2 = strDecodeStringElement3;
        } else {
            boolean z4 = true;
            int i14 = 0;
            List list2 = null;
            KeyStatSection keyStatSection5 = null;
            KeyStatSection keyStatSection6 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        i14 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        continue;
                    case 1:
                        i14 |= 2;
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        continue;
                    case 2:
                        i14 |= 4;
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        continue;
                    case 3:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i14 |= 8;
                        continue;
                    case 4:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i14 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i14 |= 32;
                        break;
                    case 6:
                        keyStatSection6 = (KeyStatSection) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, KeyStatSection$$serializer.INSTANCE, keyStatSection6);
                        i14 |= 64;
                        break;
                    case 7:
                        keyStatSection5 = (KeyStatSection) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, KeyStatSection$$serializer.INSTANCE, keyStatSection5);
                        i14 |= 128;
                        break;
                    case 8:
                        list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), list2);
                        i14 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i14;
            list = list2;
            keyStatSection = keyStatSection5;
            keyStatSection2 = keyStatSection6;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement8;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement11;
            str6 = strDecodeStringElement12;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HomeCustomizationResponse(i13, str, str2, str3, str4, str5, str6, keyStatSection2, keyStatSection, list, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HomeCustomizationResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HomeCustomizationResponse.write$Self$home_customization_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
