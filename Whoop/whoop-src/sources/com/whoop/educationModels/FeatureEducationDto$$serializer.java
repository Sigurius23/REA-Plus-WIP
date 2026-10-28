package com.whoop.educationModels;

import com.whoop.data.onboarding.FeatureEducationType;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/educationModels/FeatureEducationDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/educationModels/FeatureEducationDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/educationModels/FeatureEducationDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/educationModels/FeatureEducationDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class FeatureEducationDto$$serializer implements GeneratedSerializer<FeatureEducationDto> {
    public static final int $stable;
    public static final FeatureEducationDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        FeatureEducationDto$$serializer featureEducationDto$$serializer = new FeatureEducationDto$$serializer();
        INSTANCE = featureEducationDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.educationModels.FeatureEducationDto", featureEducationDto$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("navigation_bar", false);
        pluginGeneratedSerialDescriptor.addElement("screens", false);
        pluginGeneratedSerialDescriptor.addElement("created_at", false);
        pluginGeneratedSerialDescriptor.addElement("updated_at", false);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("feature", false);
        pluginGeneratedSerialDescriptor.addElement("enabled", false);
        pluginGeneratedSerialDescriptor.addElement("deleted", false);
        pluginGeneratedSerialDescriptor.addElement("media_header", false);
        pluginGeneratedSerialDescriptor.addElement("sticky_button", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FeatureEducationDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = FeatureEducationDto.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{IntSerializer.INSTANCE, AbstractC38195a.m122336d(NavBarDto$$serializer.INSTANCE), interfaceC23462hArr[2].getValue(), stringSerializer, stringSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), stringSerializer, booleanSerializer, booleanSerializer, AbstractC38195a.m122336d(MediaHeader$$serializer.INSTANCE), AbstractC38195a.m122336d(StickyButton$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final FeatureEducationDto deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        NavBarDto navBarDto;
        MediaHeader mediaHeader;
        StickyButton stickyButton;
        FeatureEducationType featureEducationType;
        List list;
        int i13;
        boolean z4;
        boolean z13;
        String str;
        String str2;
        String str3;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = FeatureEducationDto.$childSerializers;
        int i15 = 10;
        int i16 = 9;
        int i17 = 7;
        int i18 = 5;
        int i19 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            NavBarDto navBarDto2 = (NavBarDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, NavBarDto$$serializer.INSTANCE, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            FeatureEducationType featureEducationType2 = (FeatureEducationType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 8);
            MediaHeader mediaHeader2 = (MediaHeader) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, MediaHeader$$serializer.INSTANCE, null);
            featureEducationType = featureEducationType2;
            stickyButton = (StickyButton) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StickyButton$$serializer.INSTANCE, null);
            mediaHeader = mediaHeader2;
            z4 = zDecodeBooleanElement;
            str3 = strDecodeStringElement3;
            str = strDecodeStringElement;
            z13 = zDecodeBooleanElement2;
            str2 = strDecodeStringElement2;
            i13 = 2047;
            list = list2;
            navBarDto = navBarDto2;
        } else {
            int i24 = 2;
            boolean z14 = true;
            iDecodeIntElement = 0;
            boolean zDecodeBooleanElement3 = false;
            MediaHeader mediaHeader3 = null;
            StickyButton stickyButton2 = null;
            FeatureEducationType featureEducationType3 = null;
            List list3 = null;
            NavBarDto navBarDto3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z14) {
                int i25 = i18;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        i15 = 10;
                        i16 = 9;
                        i18 = 5;
                        i24 = 2;
                        break;
                    case 0:
                        iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                        i19 |= 1;
                        i15 = 10;
                        i16 = 9;
                        i17 = 7;
                        i18 = 5;
                        i24 = 2;
                        break;
                    case 1:
                        i19 |= 2;
                        navBarDto3 = (NavBarDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, NavBarDto$$serializer.INSTANCE, navBarDto3);
                        i15 = 10;
                        i16 = 9;
                        i17 = 7;
                        i18 = 5;
                        i24 = 2;
                        break;
                    case 2:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i24, (InterfaceC37137b) interfaceC23462hArr[i24].getValue(), list3);
                        i19 |= 4;
                        i15 = 10;
                        i16 = 9;
                        i18 = 5;
                        break;
                    case 3:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i19 |= 8;
                        i15 = 10;
                        i18 = 5;
                        break;
                    case 4:
                        i14 = i25;
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i19 |= 16;
                        i18 = i14;
                        i15 = 10;
                        break;
                    case 5:
                        i14 = i25;
                        featureEducationType3 = (FeatureEducationType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i25].getValue(), featureEducationType3);
                        i19 |= 32;
                        i18 = i14;
                        i15 = 10;
                        break;
                    case 6:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i19 |= 64;
                        i18 = i25;
                        break;
                    case 7:
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, i17);
                        i19 |= 128;
                        i18 = i25;
                        break;
                    case 8:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 8);
                        i19 |= 256;
                        i18 = i25;
                        break;
                    case 9:
                        mediaHeader3 = (MediaHeader) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, MediaHeader$$serializer.INSTANCE, mediaHeader3);
                        i19 |= 512;
                        i18 = i25;
                        break;
                    case 10:
                        stickyButton2 = (StickyButton) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, StickyButton$$serializer.INSTANCE, stickyButton2);
                        i19 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i18 = i25;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            navBarDto = navBarDto3;
            mediaHeader = mediaHeader3;
            stickyButton = stickyButton2;
            featureEducationType = featureEducationType3;
            list = list3;
            i13 = i19;
            z4 = zDecodeBooleanElement4;
            z13 = zDecodeBooleanElement3;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
        }
        int i26 = iDecodeIntElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new FeatureEducationDto(i13, i26, navBarDto, list, str, str2, featureEducationType, str3, z4, z13, mediaHeader, stickyButton, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, FeatureEducationDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        FeatureEducationDto.write$Self$education_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
