package com.whoop.advancedlabs.domain.models;

import com.whoop.navigation.C9598e;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/advancedlabs/domain/models/LabsTestItemModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/advancedlabs/domain/models/LabsTestItemModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/LabsTestItemModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/LabsTestItemModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class LabsTestItemModel$$serializer implements GeneratedSerializer<LabsTestItemModel> {
    public static final int $stable;
    public static final LabsTestItemModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        LabsTestItemModel$$serializer labsTestItemModel$$serializer = new LabsTestItemModel$$serializer();
        INSTANCE = labsTestItemModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.advancedlabs.domain.models.LabsTestItemModel", labsTestItemModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("leftIcon", false);
        pluginGeneratedSerialDescriptor.addElement("rightIcon", false);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        pluginGeneratedSerialDescriptor.addElement("warning", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LabsTestItemModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = LabsTestItemModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final LabsTestItemModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        C9598e c9598e;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = LabsTestItemModel.$childSerializers;
        int i14 = 6;
        int i15 = 5;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            str4 = strDecodeStringElement2;
            str2 = str11;
            str8 = strDecodeStringElement5;
            str7 = strDecodeStringElement4;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            str3 = str10;
            str6 = str9;
            i13 = 511;
            str5 = strDecodeStringElement3;
        } else {
            boolean z4 = true;
            int i16 = 0;
            String str12 = null;
            C9598e c9598e2 = null;
            String str13 = null;
            String str14 = null;
            String strDecodeStringElement6 = null;
            String str15 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 6;
                        break;
                    case 0:
                        i16 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 6;
                        i15 = 5;
                        break;
                    case 1:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i14 = 6;
                        i15 = 5;
                        break;
                    case 2:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str15);
                        i16 |= 4;
                        i14 = 6;
                        i15 = 5;
                        break;
                    case 3:
                        c3 = 4;
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        i14 = 6;
                        break;
                    case 4:
                        c3 = 4;
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str14);
                        i16 |= 16;
                        i14 = 6;
                        break;
                    case 5:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i15);
                        i16 |= 32;
                        break;
                    case 6:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str13);
                        i16 |= 64;
                        break;
                    case 7:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), c9598e2);
                        i16 |= 128;
                        break;
                    case 8:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str12);
                        i16 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            str = str12;
            c9598e = c9598e2;
            str2 = str13;
            str3 = str14;
            str4 = strDecodeStringElement;
            str5 = strDecodeStringElement6;
            str6 = str15;
            str7 = strDecodeStringElement7;
            str8 = strDecodeStringElement8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new LabsTestItemModel(i13, str4, str5, str6, str7, str3, str8, str2, c9598e, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, LabsTestItemModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        LabsTestItemModel.write$Self$advanced_labs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
