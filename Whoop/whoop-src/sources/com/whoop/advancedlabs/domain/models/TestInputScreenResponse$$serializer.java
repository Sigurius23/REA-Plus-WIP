package com.whoop.advancedlabs.domain.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/advancedlabs/domain/models/TestInputScreenResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TestInputScreenResponse$$serializer implements GeneratedSerializer<TestInputScreenResponse> {
    public static final int $stable;
    public static final TestInputScreenResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TestInputScreenResponse$$serializer testInputScreenResponse$$serializer = new TestInputScreenResponse$$serializer();
        INSTANCE = testInputScreenResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.advancedlabs.domain.models.TestInputScreenResponse", testInputScreenResponse$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("navigationBar", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("nameLabel", false);
        pluginGeneratedSerialDescriptor.addElement("nameValue", false);
        pluginGeneratedSerialDescriptor.addElement("dateLabel", false);
        pluginGeneratedSerialDescriptor.addElement("dateIcon", false);
        pluginGeneratedSerialDescriptor.addElement("timeLabel", false);
        pluginGeneratedSerialDescriptor.addElement("dateTimeValue", false);
        pluginGeneratedSerialDescriptor.addElement("button", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TestInputScreenResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{NavigationBarModel$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), PrimaryButtonModel$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TestInputScreenResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        PrimaryButtonModel primaryButtonModel;
        String str;
        String str2;
        String str3;
        NavigationBarModel navigationBarModel;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 10;
        int i15 = 9;
        NavigationBarModel navigationBarModel2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            NavigationBarModel navigationBarModel3 = (NavigationBarModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, NavigationBarModel$$serializer.INSTANCE, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            navigationBarModel = navigationBarModel3;
            primaryButtonModel = (PrimaryButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, PrimaryButtonModel$$serializer.INSTANCE, null);
            str = str12;
            str2 = str11;
            str8 = strDecodeStringElement5;
            str3 = str10;
            str6 = strDecodeStringElement3;
            str9 = strDecodeStringElement6;
            str7 = strDecodeStringElement4;
            str5 = strDecodeStringElement2;
            str4 = strDecodeStringElement;
            i13 = 2047;
        } else {
            boolean z4 = true;
            int i16 = 0;
            PrimaryButtonModel primaryButtonModel2 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String strDecodeStringElement7 = null;
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
                        i15 = 9;
                        break;
                    case 0:
                        navigationBarModel2 = (NavigationBarModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, NavigationBarModel$$serializer.INSTANCE, navigationBarModel2);
                        i16 |= 1;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 1:
                        i16 |= 2;
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 = 10;
                        break;
                    case 2:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i14 = 10;
                        break;
                    case 3:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        i14 = 10;
                        break;
                    case 4:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str15);
                        i16 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i16 |= 64;
                        break;
                    case 7:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str14);
                        i16 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i16 |= 256;
                        break;
                    case 9:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, StringSerializer.INSTANCE, str13);
                        i16 |= 512;
                        break;
                    case 10:
                        primaryButtonModel2 = (PrimaryButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, PrimaryButtonModel$$serializer.INSTANCE, primaryButtonModel2);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            primaryButtonModel = primaryButtonModel2;
            str = str13;
            str2 = str14;
            str3 = str15;
            navigationBarModel = navigationBarModel2;
            str4 = strDecodeStringElement7;
            str5 = strDecodeStringElement8;
            str6 = strDecodeStringElement9;
            str7 = strDecodeStringElement10;
            str8 = strDecodeStringElement11;
            str9 = strDecodeStringElement12;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TestInputScreenResponse(i13, navigationBarModel, str4, str5, str6, str7, str3, str8, str2, str9, str, primaryButtonModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TestInputScreenResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TestInputScreenResponse.write$Self$advanced_labs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
