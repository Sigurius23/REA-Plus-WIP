package com.whoop.integrations.domain.models.p061v2;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.EnumC27272p;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class IntegrationsConnectionSectionRowModel$$serializer implements GeneratedSerializer<IntegrationsConnectionSectionRowModel> {
    public static final int $stable;
    public static final IntegrationsConnectionSectionRowModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        IntegrationsConnectionSectionRowModel$$serializer integrationsConnectionSectionRowModel$$serializer = new IntegrationsConnectionSectionRowModel$$serializer();
        INSTANCE = integrationsConnectionSectionRowModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.integrations.domain.models.v2.IntegrationsConnectionSectionRowModel", integrationsConnectionSectionRowModel$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("isWhoopBuilt", false);
        pluginGeneratedSerialDescriptor.addElement("integration_id_3p", false);
        pluginGeneratedSerialDescriptor.addElement("sectionTitle", false);
        pluginGeneratedSerialDescriptor.addElement("ctaTitle", false);
        pluginGeneratedSerialDescriptor.addElement("section_connected", false);
        pluginGeneratedSerialDescriptor.addElement("connectedStatusDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("ctaConnectionUrl", false);
        pluginGeneratedSerialDescriptor.addElement("cta_deeplink_url", false);
        pluginGeneratedSerialDescriptor.addElement("infoCallout", false);
        pluginGeneratedSerialDescriptor.addElement("bottomDescriptionText", false);
        pluginGeneratedSerialDescriptor.addElement("showConnectedStatusIcon", false);
        pluginGeneratedSerialDescriptor.addElement("canShowDisconnectModal", false);
        pluginGeneratedSerialDescriptor.addElement("ctaButtonStyle", false);
        pluginGeneratedSerialDescriptor.addElement("disconnect_popup_title_display", false);
        pluginGeneratedSerialDescriptor.addElement("disconnect_popup_description_display", false);
        pluginGeneratedSerialDescriptor.addElement("disconnect_popup_primary_button_display", false);
        pluginGeneratedSerialDescriptor.addElement("disconnect_popup_secondary_button_display", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IntegrationsConnectionSectionRowModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = IntegrationsConnectionSectionRowModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, booleanSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, booleanSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(InfoCalloutTileModel$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[13].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final IntegrationsConnectionSectionRowModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        InfoCalloutTileModel infoCalloutTileModel;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        EnumC27272p enumC27272p;
        Boolean bool;
        String str7;
        Boolean bool2;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z4;
        boolean z13;
        String str12;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = IntegrationsConnectionSectionRowModel.$childSerializers;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            InfoCalloutTileModel infoCalloutTileModel2 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, InfoCalloutTileModel$$serializer.INSTANCE, null);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, booleanSerializer, null);
            Boolean bool4 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, booleanSerializer, null);
            EnumC27272p enumC27272p2 = (EnumC27272p) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            String str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            String str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, stringSerializer, null);
            String str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, stringSerializer, null);
            str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, stringSerializer, null);
            str6 = str17;
            str2 = str15;
            str4 = str13;
            z4 = zDecodeBooleanElement;
            i13 = 262143;
            infoCalloutTileModel = infoCalloutTileModel2;
            str7 = str16;
            str3 = str14;
            str10 = strDecodeStringElement5;
            z13 = zDecodeBooleanElement2;
            str8 = strDecodeStringElement3;
            str9 = strDecodeStringElement4;
            str5 = str19;
            str = str18;
            enumC27272p = enumC27272p2;
            bool = bool4;
            bool2 = bool3;
            str12 = strDecodeStringElement2;
        } else {
            boolean z14 = true;
            int i15 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            String str20 = null;
            String str21 = null;
            InfoCalloutTileModel infoCalloutTileModel3 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            EnumC27272p enumC27272p3 = null;
            Boolean bool5 = null;
            String str27 = null;
            Boolean bool6 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z14) {
                String str28 = strDecodeStringElement;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        str20 = str20;
                        strDecodeStringElement = str28;
                        break;
                    case 0:
                        i15 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        str20 = str20;
                        break;
                    case 1:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
                        i15 |= 2;
                        str20 = str20;
                        strDecodeStringElement = str28;
                        break;
                    case 2:
                        str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str24);
                        i15 |= 4;
                        str20 = str20;
                        strDecodeStringElement = str28;
                        break;
                    case 3:
                        str24 = str24;
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i15 |= 8;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    case 4:
                        str24 = str24;
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i15 |= 16;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    case 5:
                        str24 = str24;
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
                        i15 |= 32;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    case 6:
                        str24 = str24;
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i15 |= 64;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    case 7:
                        str24 = str24;
                        str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str23);
                        i15 |= 128;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    case 8:
                        str24 = str24;
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str22);
                        i15 |= 256;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    case 9:
                        str24 = str24;
                        infoCalloutTileModel3 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, InfoCalloutTileModel$$serializer.INSTANCE, infoCalloutTileModel3);
                        i15 |= 512;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    case 10:
                        str24 = str24;
                        str27 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str27);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    case 11:
                        str24 = str24;
                        bool6 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, BooleanSerializer.INSTANCE, bool6);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    case 12:
                        str24 = str24;
                        bool5 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, BooleanSerializer.INSTANCE, bool5);
                        i15 |= 4096;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    case 13:
                        str24 = str24;
                        enumC27272p3 = (EnumC27272p) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), enumC27272p3);
                        i15 |= DfuBaseService.ERROR_REMOTE_MASK;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    case 14:
                        str24 = str24;
                        str26 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str26);
                        i15 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    case 15:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, StringSerializer.INSTANCE, str21);
                        i14 = 32768;
                        i15 |= i14;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    case 16:
                        str25 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, StringSerializer.INSTANCE, str25);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i15 |= i14;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, StringSerializer.INSTANCE, str20);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i15 |= i14;
                        strDecodeStringElement = str28;
                        str24 = str24;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            str = str21;
            infoCalloutTileModel = infoCalloutTileModel3;
            str2 = str22;
            str3 = str23;
            str4 = str24;
            str5 = str25;
            str6 = str26;
            enumC27272p = enumC27272p3;
            bool = bool5;
            str7 = str27;
            bool2 = bool6;
            str8 = strDecodeStringElement6;
            str9 = strDecodeStringElement7;
            str10 = strDecodeStringElement8;
            str11 = str20;
            z4 = zDecodeBooleanElement3;
            z13 = zDecodeBooleanElement4;
            str12 = strDecodeStringElement;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new IntegrationsConnectionSectionRowModel(i13, str12, z4, str4, str8, str9, z13, str10, str3, str2, infoCalloutTileModel, str7, bool2, bool, enumC27272p, str6, str, str5, str11, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, IntegrationsConnectionSectionRowModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        IntegrationsConnectionSectionRowModel.write$Self$integrations_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
