package com.whoop.design.models.items;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/CtaTileModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/CtaTileModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/CtaTileModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/CtaTileModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CtaTileModel$$serializer implements GeneratedSerializer<CtaTileModel> {
    public static final int $stable;
    public static final CtaTileModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CtaTileModel$$serializer ctaTileModel$$serializer = new CtaTileModel$$serializer();
        INSTANCE = ctaTileModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.CtaTileModel", ctaTileModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("backgroundImageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("leftImageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("startImageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("endImageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("buttonText", true);
        pluginGeneratedSerialDescriptor.addElement("buttonIcon", true);
        pluginGeneratedSerialDescriptor.addElement("tileCta", true);
        pluginGeneratedSerialDescriptor.addElement("dismissible", true);
        pluginGeneratedSerialDescriptor.addElement("enabled", true);
        pluginGeneratedSerialDescriptor.addElement("showCaretIcon", true);
        pluginGeneratedSerialDescriptor.addElement("borderStyle", true);
        pluginGeneratedSerialDescriptor.addElement("ctaSupplementalInfo", true);
        pluginGeneratedSerialDescriptor.addElement("destination", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CtaTileModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CtaTileModel.$childSerializers;
        C25452a c25452a = C25452a.f99689a;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{c25452a, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(c25452a), AbstractC38195a.m122336d(stringSerializer), stringSerializer, booleanSerializer, booleanSerializer, booleanSerializer, interfaceC23462hArr[13].getValue(), AbstractC38195a.m122336d(CtaSupplementalInfo$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[15].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CtaTileModel deserialize(InterfaceC40541d decoder) {
        String str;
        String str2;
        int i13;
        TextResource textResource;
        String str3;
        CtaSupplementalInfo ctaSupplementalInfo;
        TileBorderStyle tileBorderStyle;
        String str4;
        String str5;
        C9598e c9598e;
        TextResource textResource2;
        String str6;
        String str7;
        String str8;
        boolean z4;
        boolean z13;
        boolean z14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = CtaTileModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            TextResource textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, c25452a, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 10);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 11);
            boolean zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 12);
            TileBorderStyle tileBorderStyle2 = (TileBorderStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            str3 = str9;
            ctaSupplementalInfo = (CtaSupplementalInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, CtaSupplementalInfo$$serializer.INSTANCE, null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, (InterfaceC37137b) interfaceC23462hArr[15].getValue(), null);
            i13 = 65535;
            z4 = zDecodeBooleanElement3;
            str4 = str14;
            str8 = strDecodeStringElement2;
            z13 = zDecodeBooleanElement;
            str7 = strDecodeStringElement;
            str5 = str13;
            str = str11;
            z14 = zDecodeBooleanElement2;
            str6 = str12;
            str2 = str10;
            textResource = textResource3;
            textResource2 = textResource4;
            tileBorderStyle = tileBorderStyle2;
        } else {
            int i14 = 15;
            boolean z15 = true;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            String str15 = null;
            TextResource textResource5 = null;
            String str16 = null;
            CtaSupplementalInfo ctaSupplementalInfo2 = null;
            TileBorderStyle tileBorderStyle3 = null;
            String str17 = null;
            String str18 = null;
            C9598e c9598e2 = null;
            TextResource textResource6 = null;
            String str19 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i15 = 0;
            String str20 = null;
            while (z15) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z15 = false;
                        break;
                    case 0:
                        textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource5);
                        i15 |= 1;
                        i14 = 15;
                        break;
                    case 1:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str16);
                        i15 |= 2;
                        i14 = 15;
                        break;
                    case 2:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str20);
                        i15 |= 4;
                        i14 = 15;
                        break;
                    case 3:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str15);
                        i15 |= 8;
                        i14 = 15;
                        break;
                    case 4:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str19);
                        i15 |= 16;
                        i14 = 15;
                        break;
                    case 5:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str18);
                        i15 |= 32;
                        i14 = 15;
                        break;
                    case 6:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i15 |= 64;
                        i14 = 15;
                        break;
                    case 7:
                        textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, C25452a.f99689a, textResource6);
                        i15 |= 128;
                        i14 = 15;
                        break;
                    case 8:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str17);
                        i15 |= 256;
                        i14 = 15;
                        break;
                    case 9:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i15 |= 512;
                        i14 = 15;
                        break;
                    case 10:
                        zDecodeBooleanElement5 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 10);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i14 = 15;
                        break;
                    case 11:
                        zDecodeBooleanElement6 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 11);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i14 = 15;
                        break;
                    case 12:
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 12);
                        i15 |= 4096;
                        i14 = 15;
                        break;
                    case 13:
                        tileBorderStyle3 = (TileBorderStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), tileBorderStyle3);
                        i15 |= DfuBaseService.ERROR_REMOTE_MASK;
                        i14 = 15;
                        break;
                    case 14:
                        ctaSupplementalInfo2 = (CtaSupplementalInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, CtaSupplementalInfo$$serializer.INSTANCE, ctaSupplementalInfo2);
                        i15 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        i14 = 15;
                        break;
                    case 15:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), c9598e2);
                        i15 |= 32768;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str15;
            str2 = str20;
            i13 = i15;
            textResource = textResource5;
            str3 = str16;
            ctaSupplementalInfo = ctaSupplementalInfo2;
            tileBorderStyle = tileBorderStyle3;
            str4 = str17;
            str5 = str18;
            c9598e = c9598e2;
            textResource2 = textResource6;
            str6 = str19;
            str7 = strDecodeStringElement3;
            str8 = strDecodeStringElement4;
            z4 = zDecodeBooleanElement4;
            z13 = zDecodeBooleanElement5;
            z14 = zDecodeBooleanElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CtaTileModel(i13, textResource, str3, str2, str, str6, str5, str7, textResource2, str4, str8, z13, z14, z4, tileBorderStyle, ctaSupplementalInfo, c9598e, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CtaTileModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CtaTileModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
