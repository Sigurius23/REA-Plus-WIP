package com.whoop.whooplabs.data.remote.domain.dto.bff;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MysticResponse$$serializer implements GeneratedSerializer<MysticResponse> {
    public static final int $stable;
    public static final MysticResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MysticResponse$$serializer mysticResponse$$serializer = new MysticResponse$$serializer();
        INSTANCE = mysticResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.whooplabs.data.remote.domain.dto.bff.MysticResponse", mysticResponse$$serializer, 24);
        pluginGeneratedSerialDescriptor.addElement("systolic_label_text", false);
        pluginGeneratedSerialDescriptor.addElement("systolic_suffix_text", false);
        pluginGeneratedSerialDescriptor.addElement("systolicMax", false);
        pluginGeneratedSerialDescriptor.addElement("systolicMin", false);
        pluginGeneratedSerialDescriptor.addElement("systolic_too_high_text", false);
        pluginGeneratedSerialDescriptor.addElement("systolic_too_low_text", false);
        pluginGeneratedSerialDescriptor.addElement("systolicRequiredText", false);
        pluginGeneratedSerialDescriptor.addElement("systolic_required", false);
        pluginGeneratedSerialDescriptor.addElement("diastolic_label_text", false);
        pluginGeneratedSerialDescriptor.addElement("diastolic_suffix_text", false);
        pluginGeneratedSerialDescriptor.addElement("diastolicMax", false);
        pluginGeneratedSerialDescriptor.addElement("diastolicMin", false);
        pluginGeneratedSerialDescriptor.addElement("diastolic_too_high_text", false);
        pluginGeneratedSerialDescriptor.addElement("diastolic_too_low_text", false);
        pluginGeneratedSerialDescriptor.addElement("diastolicRequiredText", false);
        pluginGeneratedSerialDescriptor.addElement("diastolic_required", false);
        pluginGeneratedSerialDescriptor.addElement("heart_rate_label_text", false);
        pluginGeneratedSerialDescriptor.addElement("heart_rate_suffix_text", false);
        pluginGeneratedSerialDescriptor.addElement("heart_rate_max", false);
        pluginGeneratedSerialDescriptor.addElement("heart_rate_min", false);
        pluginGeneratedSerialDescriptor.addElement("heart_rate_too_high_text", false);
        pluginGeneratedSerialDescriptor.addElement("heart_rate_too_low_text", false);
        pluginGeneratedSerialDescriptor.addElement("heart_rate_required_text", false);
        pluginGeneratedSerialDescriptor.addElement("heart_rate_required", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MysticResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MysticResponse deserialize(InterfaceC40541d decoder) {
        String str;
        int i13;
        String str2;
        boolean z4;
        String str3;
        String str4;
        int i14;
        int i15;
        String str5;
        String str6;
        String str7;
        boolean zDecodeBooleanElement;
        String str8;
        int i16;
        String str9;
        String str10;
        int i17;
        String str11;
        String str12;
        String str13;
        int i18;
        int i19;
        String str14;
        boolean z13;
        String str15;
        int i24;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i25 = 5;
        int i26 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            int iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 10);
            int iDecodeIntElement4 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 11);
            String strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 12);
            String strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 13);
            String strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 14);
            boolean zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 15);
            String strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 16);
            String strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 17);
            int iDecodeIntElement5 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 18);
            int iDecodeIntElement6 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 19);
            String strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 20);
            String strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 21);
            String strDecodeStringElement15 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 22);
            str5 = strDecodeStringElement13;
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 23);
            str8 = strDecodeStringElement4;
            i16 = iDecodeIntElement2;
            str9 = strDecodeStringElement3;
            str10 = strDecodeStringElement6;
            i17 = iDecodeIntElement;
            str11 = strDecodeStringElement2;
            str12 = strDecodeStringElement5;
            str13 = strDecodeStringElement8;
            i18 = iDecodeIntElement4;
            i19 = iDecodeIntElement3;
            str14 = strDecodeStringElement7;
            z13 = zDecodeBooleanElement2;
            str15 = strDecodeStringElement9;
            i15 = iDecodeIntElement6;
            i14 = iDecodeIntElement5;
            str4 = strDecodeStringElement12;
            str3 = strDecodeStringElement11;
            z4 = zDecodeBooleanElement3;
            str2 = strDecodeStringElement10;
            str = strDecodeStringElement;
            str6 = strDecodeStringElement14;
            str7 = strDecodeStringElement15;
            i13 = 16777215;
        } else {
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            boolean z14 = true;
            boolean zDecodeBooleanElement4 = false;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            boolean zDecodeBooleanElement5 = false;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            int iDecodeIntElement11 = 0;
            int iDecodeIntElement12 = 0;
            boolean zDecodeBooleanElement6 = false;
            while (z14) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        i26 |= 1;
                        strDecodeStringElement16 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i25 = 5;
                        break;
                    case 1:
                        strDecodeStringElement26 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i26 |= 2;
                        i25 = 5;
                        break;
                    case 2:
                        iDecodeIntElement10 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
                        i26 |= 4;
                        break;
                    case 3:
                        iDecodeIntElement9 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
                        i26 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement24 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i26 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement23 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i25);
                        i26 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement27 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i26 |= 64;
                        break;
                    case 7:
                        zDecodeBooleanElement6 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
                        i26 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement25 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i26 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement29 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i26 |= 512;
                        break;
                    case 10:
                        iDecodeIntElement12 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 10);
                        i26 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    case 11:
                        iDecodeIntElement11 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 11);
                        i26 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        break;
                    case 12:
                        strDecodeStringElement28 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 12);
                        i26 |= 4096;
                        break;
                    case 13:
                        strDecodeStringElement30 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 13);
                        i26 |= DfuBaseService.ERROR_REMOTE_MASK;
                        break;
                    case 14:
                        strDecodeStringElement17 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 14);
                        i26 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        break;
                    case 15:
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 15);
                        i26 |= 32768;
                        break;
                    case 16:
                        strDecodeStringElement18 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 16);
                        i26 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        strDecodeStringElement19 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 17);
                        i26 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        iDecodeIntElement7 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 18);
                        i26 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        iDecodeIntElement8 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 19);
                        i26 |= 524288;
                        break;
                    case 20:
                        strDecodeStringElement20 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 20);
                        i26 |= 1048576;
                        break;
                    case 21:
                        strDecodeStringElement21 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 21);
                        i24 = 2097152;
                        i26 |= i24;
                        break;
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        strDecodeStringElement22 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 22);
                        i24 = 4194304;
                        i26 |= i24;
                        break;
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        zDecodeBooleanElement5 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 23);
                        i24 = 8388608;
                        i26 |= i24;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement16;
            i13 = i26;
            str2 = strDecodeStringElement17;
            z4 = zDecodeBooleanElement4;
            str3 = strDecodeStringElement18;
            str4 = strDecodeStringElement19;
            i14 = iDecodeIntElement7;
            i15 = iDecodeIntElement8;
            str5 = strDecodeStringElement20;
            str6 = strDecodeStringElement21;
            str7 = strDecodeStringElement22;
            zDecodeBooleanElement = zDecodeBooleanElement5;
            str8 = strDecodeStringElement23;
            i16 = iDecodeIntElement9;
            str9 = strDecodeStringElement24;
            str10 = strDecodeStringElement25;
            i17 = iDecodeIntElement10;
            str11 = strDecodeStringElement26;
            str12 = strDecodeStringElement27;
            str13 = strDecodeStringElement28;
            i18 = iDecodeIntElement11;
            i19 = iDecodeIntElement12;
            str14 = strDecodeStringElement29;
            z13 = zDecodeBooleanElement6;
            str15 = strDecodeStringElement30;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MysticResponse(i13, str, str11, i17, i16, str9, str8, str12, z13, str10, str14, i19, i18, str13, str15, str2, z4, str3, str4, i14, i15, str5, str6, str7, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MysticResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MysticResponse.write$Self$whooplabs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
