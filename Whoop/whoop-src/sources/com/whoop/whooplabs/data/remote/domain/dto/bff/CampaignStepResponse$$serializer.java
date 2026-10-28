package com.whoop.whooplabs.data.remote.domain.dto.bff;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.whooplabs.data.domain.SurveyProvider;
import hx2.C17711a;
import java.util.Map;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CampaignStepResponse$$serializer implements GeneratedSerializer<CampaignStepResponse> {
    public static final int $stable;
    public static final CampaignStepResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CampaignStepResponse$$serializer campaignStepResponse$$serializer = new CampaignStepResponse$$serializer();
        INSTANCE = campaignStepResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepResponse", campaignStepResponse$$serializer, 20);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("page_title_display", false);
        pluginGeneratedSerialDescriptor.addElement("page_subtitle_display", false);
        pluginGeneratedSerialDescriptor.addElement("content", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("image_alt_text", false);
        pluginGeneratedSerialDescriptor.addElement("webview_url", false);
        pluginGeneratedSerialDescriptor.addElement("webview_title_text", false);
        pluginGeneratedSerialDescriptor.addElement("show_timer", true);
        pluginGeneratedSerialDescriptor.addElement("bthrs_step", true);
        pluginGeneratedSerialDescriptor.addElement("mystic_config", false);
        pluginGeneratedSerialDescriptor.addElement("cta_display", false);
        pluginGeneratedSerialDescriptor.addElement("inputType", false);
        pluginGeneratedSerialDescriptor.addElement("inputConfig", false);
        pluginGeneratedSerialDescriptor.addElement("countdown_timer_required", true);
        pluginGeneratedSerialDescriptor.addElement("countdown_timer_seconds", true);
        pluginGeneratedSerialDescriptor.addElement("bthrs_config", true);
        pluginGeneratedSerialDescriptor.addElement("surveyProvider", true);
        pluginGeneratedSerialDescriptor.addElement("surveyFormId", true);
        pluginGeneratedSerialDescriptor.addElement("surveyVendorMetadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CampaignStepResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CampaignStepResponse.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d7 = AbstractC38195a.m122336d(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{intSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, interfaceC37138cM122336d6, interfaceC37138cM122336d7, AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(MysticResponse$$serializer.INSTANCE), stringSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[12].getValue()), AbstractC38195a.m122336d(C17711a.f68844a), booleanSerializer, AbstractC38195a.m122336d(intSerializer), AbstractC38195a.m122336d(BtHrConfigResponse$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[17].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CampaignStepResponse deserialize(InterfaceC40541d decoder) {
        String str;
        MysticResponse mysticResponse;
        String str2;
        SurveyProvider surveyProvider;
        String str3;
        int i13;
        BtHrConfigResponse btHrConfigResponse;
        InputType inputType;
        Boolean bool;
        Boolean bool2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Integer num;
        Map map;
        String str10;
        boolean z4;
        int i14;
        int i15;
        int i16;
        String str11;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = CampaignStepResponse.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, booleanSerializer, null);
            Boolean bool4 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, booleanSerializer, null);
            MysticResponse mysticResponse2 = (MysticResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, MysticResponse$$serializer.INSTANCE, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
            InputType inputType2 = (InputType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            Map map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, C17711a.f68844a, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 14);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, IntSerializer.INSTANCE, null);
            BtHrConfigResponse btHrConfigResponse2 = (BtHrConfigResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, BtHrConfigResponse$$serializer.INSTANCE, null);
            SurveyProvider surveyProvider2 = (SurveyProvider) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, (InterfaceC37137b) interfaceC23462hArr[17].getValue(), null);
            String str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, stringSerializer, null);
            str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, stringSerializer, null);
            str3 = str19;
            str8 = str15;
            bool2 = bool3;
            str6 = str13;
            i13 = 1048575;
            str = str12;
            bool = bool4;
            str10 = strDecodeStringElement;
            str4 = str18;
            str5 = str17;
            str9 = str16;
            str7 = str14;
            surveyProvider = surveyProvider2;
            btHrConfigResponse = btHrConfigResponse2;
            num = num2;
            map = map2;
            z4 = zDecodeBooleanElement;
            inputType = inputType2;
            i14 = iDecodeIntElement;
            mysticResponse = mysticResponse2;
        } else {
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement2 = 0;
            boolean z13 = true;
            Map map3 = null;
            Integer num3 = null;
            String str20 = null;
            MysticResponse mysticResponse3 = null;
            String str21 = null;
            String str22 = null;
            BtHrConfigResponse btHrConfigResponse3 = null;
            InputType inputType3 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str23 = null;
            String str24 = null;
            String strDecodeStringElement2 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            int i17 = 0;
            SurveyProvider surveyProvider3 = null;
            while (z13) {
                String str29 = str24;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        str11 = str29;
                        z13 = false;
                        str20 = str20;
                        str24 = str11;
                        num3 = num3;
                        map3 = map3;
                        break;
                    case 0:
                        str11 = str29;
                        iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                        i17 |= 1;
                        str20 = str20;
                        str24 = str11;
                        num3 = num3;
                        map3 = map3;
                        break;
                    case 1:
                        map3 = map3;
                        num3 = num3;
                        str11 = str29;
                        str25 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str25);
                        i17 |= 2;
                        str20 = str20;
                        str26 = str26;
                        str24 = str11;
                        num3 = num3;
                        map3 = map3;
                        break;
                    case 2:
                        map3 = map3;
                        num3 = num3;
                        str11 = str29;
                        str26 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str26);
                        i17 |= 4;
                        str20 = str20;
                        str27 = str27;
                        str24 = str11;
                        num3 = num3;
                        map3 = map3;
                        break;
                    case 3:
                        map3 = map3;
                        num3 = num3;
                        str11 = str29;
                        str27 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str27);
                        i17 |= 8;
                        str20 = str20;
                        str28 = str28;
                        str24 = str11;
                        num3 = num3;
                        map3 = map3;
                        break;
                    case 4:
                        str11 = str29;
                        str28 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str28);
                        i17 |= 16;
                        str20 = str20;
                        str24 = str11;
                        num3 = num3;
                        map3 = map3;
                        break;
                    case 5:
                        map3 = map3;
                        i17 |= 32;
                        str20 = str20;
                        num3 = num3;
                        str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str29);
                        map3 = map3;
                        break;
                    case 6:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str20);
                        i17 |= 64;
                        map3 = map3;
                        str24 = str29;
                        break;
                    case 7:
                        str20 = str20;
                        str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str23);
                        i17 |= 128;
                        str24 = str29;
                        str20 = str20;
                        break;
                    case 8:
                        str20 = str20;
                        bool6 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, BooleanSerializer.INSTANCE, bool6);
                        i17 |= 256;
                        str24 = str29;
                        str20 = str20;
                        break;
                    case 9:
                        str20 = str20;
                        bool5 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, BooleanSerializer.INSTANCE, bool5);
                        i17 |= 512;
                        str24 = str29;
                        str20 = str20;
                        break;
                    case 10:
                        str20 = str20;
                        mysticResponse3 = (MysticResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, MysticResponse$$serializer.INSTANCE, mysticResponse3);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        str24 = str29;
                        str20 = str20;
                        break;
                    case 11:
                        str20 = str20;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        str24 = str29;
                        str20 = str20;
                        break;
                    case 12:
                        str20 = str20;
                        inputType3 = (InputType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), inputType3);
                        i17 |= 4096;
                        str24 = str29;
                        str20 = str20;
                        break;
                    case 13:
                        str20 = str20;
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, C17711a.f68844a, map3);
                        i17 |= DfuBaseService.ERROR_REMOTE_MASK;
                        str24 = str29;
                        str20 = str20;
                        break;
                    case 14:
                        str20 = str20;
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 14);
                        i17 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        str24 = str29;
                        str20 = str20;
                        break;
                    case 15:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, IntSerializer.INSTANCE, num3);
                        i15 = 32768;
                        i17 |= i15;
                        str24 = str29;
                        str20 = str20;
                        break;
                    case 16:
                        btHrConfigResponse3 = (BtHrConfigResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, BtHrConfigResponse$$serializer.INSTANCE, btHrConfigResponse3);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i17 |= i15;
                        str24 = str29;
                        str20 = str20;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        surveyProvider3 = (SurveyProvider) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, (InterfaceC37137b) interfaceC23462hArr[17].getValue(), surveyProvider3);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i17 |= i15;
                        str24 = str29;
                        str20 = str20;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, StringSerializer.INSTANCE, str22);
                        i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        i17 |= i16;
                        str24 = str29;
                        str20 = str20;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, StringSerializer.INSTANCE, str21);
                        i16 = 524288;
                        i17 |= i16;
                        str24 = str29;
                        str20 = str20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str25;
            mysticResponse = mysticResponse3;
            str2 = str21;
            surveyProvider = surveyProvider3;
            str3 = str22;
            i13 = i17;
            btHrConfigResponse = btHrConfigResponse3;
            inputType = inputType3;
            bool = bool5;
            bool2 = bool6;
            str4 = str23;
            str5 = str20;
            str6 = str26;
            str7 = str27;
            str8 = str28;
            str9 = str24;
            num = num3;
            map = map3;
            str10 = strDecodeStringElement2;
            z4 = zDecodeBooleanElement2;
            i14 = iDecodeIntElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CampaignStepResponse(i13, i14, str, str6, str7, str8, str9, str5, str4, bool2, bool, mysticResponse, str10, inputType, map, z4, num, btHrConfigResponse, surveyProvider, str3, str2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CampaignStepResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CampaignStepResponse.write$Self$whooplabs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
