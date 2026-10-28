package com.whoop.whooplabs.data.remote.domain.dto.bff;

import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.navigation.C9598e;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CampaignStepConfigResponse$$serializer implements GeneratedSerializer<CampaignStepConfigResponse> {
    public static final int $stable;
    public static final CampaignStepConfigResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CampaignStepConfigResponse$$serializer campaignStepConfigResponse$$serializer = new CampaignStepConfigResponse$$serializer();
        INSTANCE = campaignStepConfigResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepConfigResponse", campaignStepConfigResponse$$serializer, 30);
        pluginGeneratedSerialDescriptor.addElement("dataTypes", true);
        pluginGeneratedSerialDescriptor.addElement("additionalDataCollection", false);
        pluginGeneratedSerialDescriptor.addElement("bthrAdditionalDataCollection", false);
        pluginGeneratedSerialDescriptor.addElement("submittingText", false);
        pluginGeneratedSerialDescriptor.addElement("successIcon", false);
        pluginGeneratedSerialDescriptor.addElement("successText", false);
        pluginGeneratedSerialDescriptor.addElement("successSubtext", false);
        pluginGeneratedSerialDescriptor.addElement("successBackgroundUrl", false);
        pluginGeneratedSerialDescriptor.addElement("submitErrorTitle", false);
        pluginGeneratedSerialDescriptor.addElement("submitErrorBody", false);
        pluginGeneratedSerialDescriptor.addElement("submit_error_positive_cta", false);
        pluginGeneratedSerialDescriptor.addElement("submit_error_negative_cta", false);
        pluginGeneratedSerialDescriptor.addElement("submittedText", false);
        pluginGeneratedSerialDescriptor.addElement("submittedCta", false);
        pluginGeneratedSerialDescriptor.addElement("cancelCta", false);
        pluginGeneratedSerialDescriptor.addElement("cancelDialogTitle", false);
        pluginGeneratedSerialDescriptor.addElement("cancelDialogBody", false);
        pluginGeneratedSerialDescriptor.addElement("cancelDialogPositiveCta", false);
        pluginGeneratedSerialDescriptor.addElement("cancelDialogNegativeCta", false);
        pluginGeneratedSerialDescriptor.addElement("startErrorTitle", false);
        pluginGeneratedSerialDescriptor.addElement("startErrorBody", false);
        pluginGeneratedSerialDescriptor.addElement("startErrorPositiveCta", false);
        pluginGeneratedSerialDescriptor.addElement("startErrorNegativeCta", false);
        pluginGeneratedSerialDescriptor.addElement("startErrorMissingStrapBody", false);
        pluginGeneratedSerialDescriptor.addElement("start_error_bthr_failed_body", false);
        pluginGeneratedSerialDescriptor.addElement("webViewErrorTitle", false);
        pluginGeneratedSerialDescriptor.addElement("webViewErrorBody", false);
        pluginGeneratedSerialDescriptor.addElement("web_view_error_positive_cta", false);
        pluginGeneratedSerialDescriptor.addElement("web_view_error_negative_cta", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_NAVIGATION, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CampaignStepConfigResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CampaignStepConfigResponse.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), AbstractC38195a.m122336d(intSerializer), AbstractC38195a.m122336d(intSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[29].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CampaignStepConfigResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        Integer num;
        Integer num2;
        C9598e c9598e;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = CampaignStepConfigResponse.$childSerializers;
        int i14 = 4;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, intSerializer, null);
            Integer num4 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, intSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            String strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
            String strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
            String strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 12);
            String strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 13);
            String strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 14);
            String strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 15);
            String strDecodeStringElement15 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 16);
            String strDecodeStringElement16 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 17);
            String strDecodeStringElement17 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 18);
            String strDecodeStringElement18 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 19);
            String strDecodeStringElement19 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 20);
            String strDecodeStringElement20 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 21);
            String strDecodeStringElement21 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 22);
            String strDecodeStringElement22 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 23);
            String strDecodeStringElement23 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 24);
            String strDecodeStringElement24 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 25);
            String strDecodeStringElement25 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 26);
            String strDecodeStringElement26 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 27);
            i13 = 1073741823;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 28);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 29, (InterfaceC37137b) interfaceC23462hArr[29].getValue(), null);
            list = list2;
            str2 = strDecodeStringElement3;
            num = num4;
            str10 = strDecodeStringElement11;
            str8 = strDecodeStringElement9;
            str7 = strDecodeStringElement8;
            str5 = strDecodeStringElement6;
            str4 = strDecodeStringElement5;
            str3 = strDecodeStringElement4;
            str6 = strDecodeStringElement7;
            str9 = strDecodeStringElement10;
            str25 = strDecodeStringElement26;
            str24 = strDecodeStringElement25;
            str23 = strDecodeStringElement24;
            str22 = strDecodeStringElement23;
            str21 = strDecodeStringElement22;
            str20 = strDecodeStringElement21;
            str19 = strDecodeStringElement20;
            str18 = strDecodeStringElement19;
            str17 = strDecodeStringElement18;
            str16 = strDecodeStringElement17;
            str15 = strDecodeStringElement16;
            str14 = strDecodeStringElement15;
            str13 = strDecodeStringElement14;
            str12 = strDecodeStringElement13;
            str11 = strDecodeStringElement12;
            num2 = num3;
            str = strDecodeStringElement2;
        } else {
            int i15 = 29;
            boolean z4 = true;
            Integer num5 = null;
            C9598e c9598e2 = null;
            List list3 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            String strDecodeStringElement39 = null;
            String strDecodeStringElement40 = null;
            String strDecodeStringElement41 = null;
            String strDecodeStringElement42 = null;
            String strDecodeStringElement43 = null;
            String strDecodeStringElement44 = null;
            String strDecodeStringElement45 = null;
            String strDecodeStringElement46 = null;
            String strDecodeStringElement47 = null;
            String strDecodeStringElement48 = null;
            String strDecodeStringElement49 = null;
            String strDecodeStringElement50 = null;
            String strDecodeStringElement51 = null;
            String strDecodeStringElement52 = null;
            i13 = 0;
            Integer num6 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 29;
                        break;
                    case 0:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), list3);
                        i13 |= 1;
                        i14 = 4;
                        i15 = 29;
                        break;
                    case 1:
                        num6 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, IntSerializer.INSTANCE, num6);
                        i13 |= 2;
                        i14 = 4;
                        i15 = 29;
                        break;
                    case 2:
                        num5 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, IntSerializer.INSTANCE, num5);
                        i13 |= 4;
                        i14 = 4;
                        i15 = 29;
                        break;
                    case 3:
                        strDecodeStringElement27 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i13 |= 8;
                        i14 = 4;
                        i15 = 29;
                        break;
                    case 4:
                        strDecodeStringElement28 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i14);
                        i13 |= 16;
                        i15 = 29;
                        break;
                    case 5:
                        strDecodeStringElement29 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i13 |= 32;
                        i15 = 29;
                        break;
                    case 6:
                        strDecodeStringElement30 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i13 |= 64;
                        i15 = 29;
                        break;
                    case 7:
                        strDecodeStringElement31 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i13 |= 128;
                        i15 = 29;
                        break;
                    case 8:
                        strDecodeStringElement32 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i13 |= 256;
                        i15 = 29;
                        break;
                    case 9:
                        strDecodeStringElement33 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i13 |= 512;
                        i15 = 29;
                        break;
                    case 10:
                        strDecodeStringElement34 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i15 = 29;
                        break;
                    case 11:
                        strDecodeStringElement35 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i15 = 29;
                        break;
                    case 12:
                        strDecodeStringElement36 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 12);
                        i13 |= 4096;
                        i15 = 29;
                        break;
                    case 13:
                        strDecodeStringElement37 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 13);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        i15 = 29;
                        break;
                    case 14:
                        strDecodeStringElement38 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 14);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        i15 = 29;
                        break;
                    case 15:
                        strDecodeStringElement39 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 15);
                        i13 |= 32768;
                        i15 = 29;
                        break;
                    case 16:
                        strDecodeStringElement40 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 16);
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i15 = 29;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        strDecodeStringElement41 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 17);
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i15 = 29;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        strDecodeStringElement42 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 18);
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        i15 = 29;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        strDecodeStringElement43 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 19);
                        i13 |= 524288;
                        i15 = 29;
                        break;
                    case 20:
                        strDecodeStringElement44 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 20);
                        i13 |= 1048576;
                        i15 = 29;
                        break;
                    case 21:
                        strDecodeStringElement45 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 21);
                        i13 |= 2097152;
                        i15 = 29;
                        break;
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        strDecodeStringElement46 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 22);
                        i13 |= 4194304;
                        i15 = 29;
                        break;
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        strDecodeStringElement47 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 23);
                        i13 |= 8388608;
                        i15 = 29;
                        break;
                    case 24:
                        strDecodeStringElement48 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 24);
                        i13 |= 16777216;
                        i15 = 29;
                        break;
                    case 25:
                        strDecodeStringElement49 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 25);
                        i13 |= AndroidSDKConstants.FLAG_MUTABLE;
                        i15 = 29;
                        break;
                    case 26:
                        strDecodeStringElement50 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 26);
                        i13 |= 67108864;
                        i15 = 29;
                        break;
                    case 27:
                        strDecodeStringElement51 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 27);
                        i13 |= 134217728;
                        i15 = 29;
                        break;
                    case 28:
                        strDecodeStringElement52 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 28);
                        i13 |= 268435456;
                        break;
                    case 29:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), c9598e2);
                        i13 |= 536870912;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num5;
            num2 = num6;
            c9598e = c9598e2;
            list = list3;
            str = strDecodeStringElement27;
            str2 = strDecodeStringElement28;
            str3 = strDecodeStringElement29;
            str4 = strDecodeStringElement30;
            str5 = strDecodeStringElement31;
            str6 = strDecodeStringElement32;
            str7 = strDecodeStringElement33;
            str8 = strDecodeStringElement34;
            str9 = strDecodeStringElement35;
            str10 = strDecodeStringElement36;
            str11 = strDecodeStringElement37;
            str12 = strDecodeStringElement38;
            str13 = strDecodeStringElement39;
            str14 = strDecodeStringElement40;
            str15 = strDecodeStringElement41;
            str16 = strDecodeStringElement42;
            str17 = strDecodeStringElement43;
            str18 = strDecodeStringElement44;
            str19 = strDecodeStringElement45;
            str20 = strDecodeStringElement46;
            str21 = strDecodeStringElement47;
            str22 = strDecodeStringElement48;
            str23 = strDecodeStringElement49;
            str24 = strDecodeStringElement50;
            str25 = strDecodeStringElement51;
            strDecodeStringElement = strDecodeStringElement52;
        }
        int i16 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CampaignStepConfigResponse(i16, list, num2, num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, strDecodeStringElement, c9598e, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CampaignStepConfigResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CampaignStepConfigResponse.write$Self$whooplabs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
