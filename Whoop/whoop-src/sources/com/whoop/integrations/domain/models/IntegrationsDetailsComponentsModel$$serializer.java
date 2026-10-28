package com.whoop.integrations.domain.models;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.MarkdownTextModel$$serializer;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CtaTileModel$$serializer;
import java.util.List;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class IntegrationsDetailsComponentsModel$$serializer implements GeneratedSerializer<IntegrationsDetailsComponentsModel> {
    public static final int $stable;
    public static final IntegrationsDetailsComponentsModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        IntegrationsDetailsComponentsModel$$serializer integrationsDetailsComponentsModel$$serializer = new IntegrationsDetailsComponentsModel$$serializer();
        INSTANCE = integrationsDetailsComponentsModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.integrations.domain.models.IntegrationsDetailsComponentsModel", integrationsDetailsComponentsModel$$serializer, 24);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("reportingKey", false);
        pluginGeneratedSerialDescriptor.addElement("backgroundImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("iconUrl", false);
        pluginGeneratedSerialDescriptor.addElement("title_display", false);
        pluginGeneratedSerialDescriptor.addElement("description_display", false);
        pluginGeneratedSerialDescriptor.addElement("learn_more", false);
        pluginGeneratedSerialDescriptor.addElement("connected", false);
        pluginGeneratedSerialDescriptor.addElement("connected_status_display", false);
        pluginGeneratedSerialDescriptor.addElement("button_text_display", false);
        pluginGeneratedSerialDescriptor.addElement("connectionUrl", false);
        pluginGeneratedSerialDescriptor.addElement("disconnect_popup_title_display", false);
        pluginGeneratedSerialDescriptor.addElement("disconnect_popup_description_display", false);
        pluginGeneratedSerialDescriptor.addElement("disconnect_popup_primary_button_display", false);
        pluginGeneratedSerialDescriptor.addElement("disconnect_popup_secondary_button_display", false);
        pluginGeneratedSerialDescriptor.addElement("shouldPerformFullOauth", false);
        pluginGeneratedSerialDescriptor.addElement("providerId", false);
        pluginGeneratedSerialDescriptor.addElement("upsellCtaTile", false);
        pluginGeneratedSerialDescriptor.addElement("overridePrimaryButton", true);
        pluginGeneratedSerialDescriptor.addElement("designItems", true);
        pluginGeneratedSerialDescriptor.addElement("footerDisclaimer", true);
        pluginGeneratedSerialDescriptor.addElement("lastUpdated", true);
        pluginGeneratedSerialDescriptor.addElement("descriptionFootnote", true);
        pluginGeneratedSerialDescriptor.addElement("privacyControls", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IntegrationsDetailsComponentsModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = IntegrationsDetailsComponentsModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(IntegrationsLearnMoreButtonModel$$serializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, interfaceC37138cM122336d, booleanSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(CtaTileModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[18].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[19].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[20].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(MarkdownTextModel$$serializer.INSTANCE), AbstractC38195a.m122336d(IntegrationsPrivacyControlsModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final IntegrationsDetailsComponentsModel deserialize(InterfaceC40541d decoder) {
        int i13;
        IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel;
        String str;
        String str2;
        String str3;
        String str4;
        IntegrationsPrivacyControlsModel integrationsPrivacyControlsModel;
        MarkdownTextModel markdownTextModel;
        String str5;
        DesignSystemModel designSystemModel;
        CtaTileModel ctaTileModel;
        Boolean bool;
        List list;
        DesignSystemModel designSystemModel2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        boolean z4;
        String str15;
        int i14;
        int i15;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = IntegrationsDetailsComponentsModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel2 = (IntegrationsLearnMoreButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, IntegrationsLearnMoreButtonModel$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            String str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            String str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            String str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            String str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            String str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, BooleanSerializer.INSTANCE, null);
            String str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, stringSerializer, null);
            CtaTileModel ctaTileModel2 = (CtaTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, CtaTileModel$$serializer.INSTANCE, null);
            DesignSystemModel designSystemModel3 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, (InterfaceC37137b) interfaceC23462hArr[18].getValue(), null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, (InterfaceC37137b) interfaceC23462hArr[19].getValue(), null);
            DesignSystemModel designSystemModel4 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, (InterfaceC37137b) interfaceC23462hArr[20].getValue(), null);
            String str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 21, stringSerializer, null);
            MarkdownTextModel markdownTextModel2 = (MarkdownTextModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 22, MarkdownTextModel$$serializer.INSTANCE, null);
            i13 = 16777215;
            integrationsPrivacyControlsModel = (IntegrationsPrivacyControlsModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 23, IntegrationsPrivacyControlsModel$$serializer.INSTANCE, null);
            str5 = str23;
            integrationsLearnMoreButtonModel = integrationsLearnMoreButtonModel2;
            str10 = strDecodeStringElement6;
            str8 = strDecodeStringElement4;
            str4 = str16;
            str9 = strDecodeStringElement5;
            str7 = strDecodeStringElement3;
            str6 = strDecodeStringElement2;
            z4 = zDecodeBooleanElement;
            str13 = str17;
            str11 = strDecodeStringElement7;
            markdownTextModel = markdownTextModel2;
            designSystemModel2 = designSystemModel4;
            ctaTileModel = ctaTileModel2;
            bool = bool2;
            str3 = str22;
            str12 = str21;
            str = str20;
            list = list2;
            designSystemModel = designSystemModel3;
            str2 = str19;
            str14 = str18;
            str15 = strDecodeStringElement;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            List list3 = null;
            DesignSystemModel designSystemModel5 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            IntegrationsPrivacyControlsModel integrationsPrivacyControlsModel2 = null;
            MarkdownTextModel markdownTextModel3 = null;
            DesignSystemModel designSystemModel6 = null;
            CtaTileModel ctaTileModel3 = null;
            Boolean bool3 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel3 = null;
            String str29 = null;
            String str30 = null;
            i13 = 0;
            String str31 = null;
            while (z13) {
                String str32 = str26;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        list3 = list3;
                        designSystemModel5 = designSystemModel5;
                        str24 = str24;
                        str28 = str28;
                        str26 = str32;
                        break;
                    case 0:
                        strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i13 |= 1;
                        list3 = list3;
                        designSystemModel5 = designSystemModel5;
                        str24 = str24;
                        str28 = str28;
                        str26 = str32;
                        break;
                    case 1:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i13 |= 2;
                        list3 = list3;
                        designSystemModel5 = designSystemModel5;
                        str24 = str24;
                        str28 = str28;
                        str26 = str32;
                        break;
                    case 2:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i13 |= 4;
                        list3 = list3;
                        designSystemModel5 = designSystemModel5;
                        str24 = str24;
                        str28 = str28;
                        str26 = str32;
                        break;
                    case 3:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i13 |= 8;
                        list3 = list3;
                        designSystemModel5 = designSystemModel5;
                        str24 = str24;
                        str28 = str28;
                        str26 = str32;
                        break;
                    case 4:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i13 |= 16;
                        list3 = list3;
                        designSystemModel5 = designSystemModel5;
                        str24 = str24;
                        str28 = str28;
                        str26 = str32;
                        break;
                    case 5:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i13 |= 32;
                        list3 = list3;
                        designSystemModel5 = designSystemModel5;
                        str24 = str24;
                        str28 = str28;
                        str26 = str32;
                        break;
                    case 6:
                        integrationsLearnMoreButtonModel3 = (IntegrationsLearnMoreButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, IntegrationsLearnMoreButtonModel$$serializer.INSTANCE, integrationsLearnMoreButtonModel3);
                        i13 |= 64;
                        list3 = list3;
                        designSystemModel5 = designSystemModel5;
                        str24 = str24;
                        str28 = str28;
                        str26 = str32;
                        break;
                    case 7:
                        str28 = str28;
                        str32 = str32;
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
                        i13 |= 128;
                        list3 = list3;
                        designSystemModel5 = designSystemModel5;
                        str28 = str28;
                        str26 = str32;
                        break;
                    case 8:
                        str32 = str32;
                        str29 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str29);
                        i13 |= 256;
                        str28 = str28;
                        list3 = list3;
                        designSystemModel5 = designSystemModel5;
                        str30 = str30;
                        str26 = str32;
                        break;
                    case 9:
                        str32 = str32;
                        strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i13 |= 512;
                        str28 = str28;
                        list3 = list3;
                        designSystemModel5 = designSystemModel5;
                        str26 = str32;
                        break;
                    case 10:
                        str32 = str32;
                        str30 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str30);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        str28 = str28;
                        list3 = list3;
                        designSystemModel5 = designSystemModel5;
                        str26 = str32;
                        break;
                    case 11:
                        List list4 = list3;
                        String str33 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str32);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        str28 = str28;
                        designSystemModel5 = designSystemModel5;
                        str26 = str33;
                        list3 = list4;
                        break;
                    case 12:
                        str28 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str28);
                        i13 |= 4096;
                        list3 = list3;
                        str26 = str32;
                        break;
                    case 13:
                        str28 = str28;
                        str25 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str25);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        str26 = str32;
                        str28 = str28;
                        break;
                    case 14:
                        str28 = str28;
                        str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str24);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        str26 = str32;
                        str28 = str28;
                        break;
                    case 15:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, BooleanSerializer.INSTANCE, bool3);
                        i14 = 32768;
                        i13 |= i14;
                        str26 = str32;
                        str28 = str28;
                        break;
                    case 16:
                        str27 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, StringSerializer.INSTANCE, str27);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i13 |= i14;
                        str26 = str32;
                        str28 = str28;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        ctaTileModel3 = (CtaTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, CtaTileModel$$serializer.INSTANCE, ctaTileModel3);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i13 |= i14;
                        str26 = str32;
                        str28 = str28;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        designSystemModel6 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, (InterfaceC37137b) interfaceC23462hArr[18].getValue(), designSystemModel6);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        i13 |= i14;
                        str26 = str32;
                        str28 = str28;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, (InterfaceC37137b) interfaceC23462hArr[19].getValue(), list3);
                        i15 = 524288;
                        i13 |= i15;
                        str26 = str32;
                        str28 = str28;
                        break;
                    case 20:
                        designSystemModel5 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, (InterfaceC37137b) interfaceC23462hArr[20].getValue(), designSystemModel5);
                        i14 = 1048576;
                        i13 |= i14;
                        str26 = str32;
                        str28 = str28;
                        break;
                    case 21:
                        str31 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 21, StringSerializer.INSTANCE, str31);
                        i15 = 2097152;
                        i13 |= i15;
                        str26 = str32;
                        str28 = str28;
                        break;
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        markdownTextModel3 = (MarkdownTextModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 22, MarkdownTextModel$$serializer.INSTANCE, markdownTextModel3);
                        i15 = 4194304;
                        i13 |= i15;
                        str26 = str32;
                        str28 = str28;
                        break;
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        integrationsPrivacyControlsModel2 = (IntegrationsPrivacyControlsModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 23, IntegrationsPrivacyControlsModel$$serializer.INSTANCE, integrationsPrivacyControlsModel2);
                        i15 = 8388608;
                        i13 |= i15;
                        str26 = str32;
                        str28 = str28;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            integrationsLearnMoreButtonModel = integrationsLearnMoreButtonModel3;
            str = str25;
            str2 = str28;
            str3 = str27;
            str4 = str29;
            integrationsPrivacyControlsModel = integrationsPrivacyControlsModel2;
            markdownTextModel = markdownTextModel3;
            str5 = str31;
            designSystemModel = designSystemModel6;
            ctaTileModel = ctaTileModel3;
            bool = bool3;
            list = list3;
            designSystemModel2 = designSystemModel5;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement9;
            str8 = strDecodeStringElement10;
            str9 = strDecodeStringElement11;
            str10 = strDecodeStringElement12;
            str11 = strDecodeStringElement13;
            str12 = str24;
            str13 = str30;
            str14 = str26;
            z4 = zDecodeBooleanElement2;
            str15 = strDecodeStringElement14;
        }
        int i16 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new IntegrationsDetailsComponentsModel(i16, str15, str6, str7, str8, str9, str10, integrationsLearnMoreButtonModel, z4, str4, str11, str13, str14, str2, str, str12, bool, str3, ctaTileModel, designSystemModel, list, designSystemModel2, str5, markdownTextModel, integrationsPrivacyControlsModel, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, IntegrationsDetailsComponentsModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        IntegrationsDetailsComponentsModel.write$Self$integrations_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
