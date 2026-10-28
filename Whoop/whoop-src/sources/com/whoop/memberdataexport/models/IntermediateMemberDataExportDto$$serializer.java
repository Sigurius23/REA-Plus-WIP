package com.whoop.memberdataexport.models;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/memberdataexport/models/IntermediateMemberDataExportDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class IntermediateMemberDataExportDto$$serializer implements GeneratedSerializer<IntermediateMemberDataExportDto> {
    public static final int $stable;
    public static final IntermediateMemberDataExportDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        IntermediateMemberDataExportDto$$serializer intermediateMemberDataExportDto$$serializer = new IntermediateMemberDataExportDto$$serializer();
        INSTANCE = intermediateMemberDataExportDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.memberdataexport.models.IntermediateMemberDataExportDto", intermediateMemberDataExportDto$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("state", false);
        pluginGeneratedSerialDescriptor.addElement("screenTitleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("headlineDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("bodyDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("learnMoreTextDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("learnMoreLink", true);
        pluginGeneratedSerialDescriptor.addElement("updateAccountTextDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("updateAccountLink", true);
        pluginGeneratedSerialDescriptor.addElement("confirmationTextDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("recipientEmailDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("recipientEmailLabelDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("submitButtonTextDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("submissionLoadingTextDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("submissionSuccessTextDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("exportUnavailableSectionIcon", true);
        pluginGeneratedSerialDescriptor.addElement("exportUnavailableSectionHeadlineDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("exportUnavailableSectionBodyDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("helpLinkTextDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("helpLink", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IntermediateMemberDataExportDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final IntermediateMemberDataExportDto deserialize(InterfaceC40541d decoder) {
        int i13;
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
        int i14;
        String str20;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String str25 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String str26 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String str27 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            String str28 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            String str29 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            String str30 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            String str31 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            String str32 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, stringSerializer, null);
            String str33 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, stringSerializer, null);
            String str34 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, stringSerializer, null);
            i13 = 524287;
            str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, stringSerializer, null);
            str = str21;
            str17 = str25;
            str13 = strDecodeStringElement3;
            str12 = strDecodeStringElement2;
            str14 = strDecodeStringElement4;
            str8 = str28;
            str9 = str27;
            str10 = str26;
            str11 = str24;
            str16 = str23;
            str15 = str22;
            str4 = str34;
            str18 = str33;
            str5 = str32;
            str6 = str31;
            str7 = str30;
            str2 = str29;
            str19 = strDecodeStringElement;
        } else {
            boolean z4 = true;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            String str43 = null;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String str47 = null;
            String str48 = null;
            i13 = 0;
            String str49 = null;
            while (z4) {
                String str50 = str38;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        str20 = str50;
                        z4 = false;
                        str38 = str20;
                        str36 = str36;
                        str35 = str35;
                        break;
                    case 0:
                        str20 = str50;
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i13 |= 1;
                        str38 = str20;
                        str36 = str36;
                        str35 = str35;
                        break;
                    case 1:
                        str20 = str50;
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i13 |= 2;
                        str38 = str20;
                        str36 = str36;
                        str35 = str35;
                        break;
                    case 2:
                        str20 = str50;
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i13 |= 4;
                        str38 = str20;
                        str36 = str36;
                        str35 = str35;
                        break;
                    case 3:
                        str20 = str50;
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i13 |= 8;
                        str38 = str20;
                        str36 = str36;
                        str35 = str35;
                        break;
                    case 4:
                        str20 = str50;
                        str47 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str47);
                        i13 |= 16;
                        str48 = str48;
                        str38 = str20;
                        str36 = str36;
                        str35 = str35;
                        break;
                    case 5:
                        str20 = str50;
                        str48 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str48);
                        i13 |= 32;
                        str38 = str20;
                        str36 = str36;
                        str35 = str35;
                        break;
                    case 6:
                        str35 = str35;
                        str36 = str36;
                        str38 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str50);
                        i13 |= 64;
                        str36 = str36;
                        str35 = str35;
                        break;
                    case 7:
                        str46 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str46);
                        i13 |= 128;
                        str35 = str35;
                        str38 = str50;
                        break;
                    case 8:
                        str46 = str46;
                        str36 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str36);
                        i13 |= 256;
                        str38 = str50;
                        str46 = str46;
                        break;
                    case 9:
                        str46 = str46;
                        str45 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str45);
                        i13 |= 512;
                        str38 = str50;
                        str46 = str46;
                        break;
                    case 10:
                        str46 = str46;
                        str44 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str44);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        str38 = str50;
                        str46 = str46;
                        break;
                    case 11:
                        str46 = str46;
                        str43 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str43);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        str38 = str50;
                        str46 = str46;
                        break;
                    case 12:
                        str46 = str46;
                        str37 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str37);
                        i13 |= 4096;
                        str38 = str50;
                        str46 = str46;
                        break;
                    case 13:
                        str46 = str46;
                        str42 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str42);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        str38 = str50;
                        str46 = str46;
                        break;
                    case 14:
                        str46 = str46;
                        str41 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str41);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        str38 = str50;
                        str46 = str46;
                        break;
                    case 15:
                        str40 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, StringSerializer.INSTANCE, str40);
                        i14 = 32768;
                        i13 |= i14;
                        str38 = str50;
                        str46 = str46;
                        break;
                    case 16:
                        str35 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, StringSerializer.INSTANCE, str35);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i13 |= i14;
                        str38 = str50;
                        str46 = str46;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        str49 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, StringSerializer.INSTANCE, str49);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i13 |= i14;
                        str38 = str50;
                        str46 = str46;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        str39 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, StringSerializer.INSTANCE, str39);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        i13 |= i14;
                        str38 = str50;
                        str46 = str46;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str47;
            str2 = str37;
            str3 = str39;
            str4 = str49;
            str5 = str40;
            str6 = str41;
            str7 = str42;
            str8 = str43;
            str9 = str44;
            str10 = str45;
            str11 = str46;
            str12 = strDecodeStringElement5;
            str13 = strDecodeStringElement6;
            str14 = strDecodeStringElement7;
            str15 = str48;
            str16 = str38;
            str17 = str36;
            str18 = str35;
            str19 = strDecodeStringElement8;
        }
        int i15 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new IntermediateMemberDataExportDto(i15, str19, str12, str13, str14, str, str15, str16, str11, str17, str10, str9, str8, str2, str7, str6, str5, str18, str4, str3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, IntermediateMemberDataExportDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        IntermediateMemberDataExportDto.write$Self$member_data_export_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
