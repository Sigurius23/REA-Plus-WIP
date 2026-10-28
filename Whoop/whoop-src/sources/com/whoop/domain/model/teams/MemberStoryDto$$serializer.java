package com.whoop.domain.model.teams;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.data.remote.domain.dto.community.memberstories.AmaHostDto;
import com.whoop.data.remote.domain.dto.community.memberstories.AmaHostDto$$serializer;
import io.getstream.chat.android.client.api.QueryParams;
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
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/domain/model/teams/MemberStoryDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/domain/model/teams/MemberStoryDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/domain/model/teams/MemberStoryDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/domain/model/teams/MemberStoryDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MemberStoryDto$$serializer implements GeneratedSerializer<MemberStoryDto> {
    public static final MemberStoryDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MemberStoryDto$$serializer memberStoryDto$$serializer = new MemberStoryDto$$serializer();
        INSTANCE = memberStoryDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.domain.model.teams.MemberStoryDto", memberStoryDto$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("createdAt", false);
        pluginGeneratedSerialDescriptor.addElement("updatedAt", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("publishDate", false);
        pluginGeneratedSerialDescriptor.addElement(QueryParams.URL, false);
        pluginGeneratedSerialDescriptor.addElement("image_url", false);
        pluginGeneratedSerialDescriptor.addElement("urlText", false);
        pluginGeneratedSerialDescriptor.addElement("ctaText", false);
        pluginGeneratedSerialDescriptor.addElement("contentType", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("deleted", false);
        pluginGeneratedSerialDescriptor.addElement("featured", false);
        pluginGeneratedSerialDescriptor.addElement("live", false);
        pluginGeneratedSerialDescriptor.addElement("archived", false);
        pluginGeneratedSerialDescriptor.addElement("hostId", false);
        pluginGeneratedSerialDescriptor.addElement("liveTime", false);
        pluginGeneratedSerialDescriptor.addElement("host", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MemberStoryDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(intSerializer);
        InterfaceC37138c interfaceC37138cM122336d7 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d8 = AbstractC38195a.m122336d(AmaHostDto$$serializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, interfaceC37138cM122336d, stringSerializer, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, interfaceC37138cM122336d6, interfaceC37138cM122336d7, interfaceC37138cM122336d8};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MemberStoryDto deserialize(InterfaceC40541d decoder) {
        int i13;
        AmaHostDto amaHostDto;
        String str;
        String str2;
        int i14;
        boolean z4;
        String str3;
        Integer num;
        String str4;
        String str5;
        String str6;
        boolean z13;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z14;
        boolean z15;
        int i15;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i16 = 11;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 11);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 12);
            boolean zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 13);
            boolean zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 14);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, IntSerializer.INSTANCE, null);
            String str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, stringSerializer, null);
            amaHostDto = (AmaHostDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, AmaHostDto$$serializer.INSTANCE, null);
            str3 = str17;
            str8 = strDecodeStringElement2;
            str7 = strDecodeStringElement;
            i13 = 262143;
            z14 = zDecodeBooleanElement2;
            z15 = zDecodeBooleanElement;
            str4 = str16;
            str6 = str15;
            str = str13;
            str11 = strDecodeStringElement5;
            str2 = str12;
            str10 = strDecodeStringElement4;
            num = num2;
            str9 = strDecodeStringElement3;
            z13 = zDecodeBooleanElement4;
            z4 = zDecodeBooleanElement3;
            i14 = iDecodeIntElement;
            str5 = str14;
        } else {
            int i17 = 0;
            boolean z16 = false;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean z17 = true;
            AmaHostDto amaHostDto2 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            Integer num3 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            int iDecodeIntElement2 = 0;
            while (z17) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z17 = false;
                        break;
                    case 0:
                        i17 |= 1;
                        iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                        i16 = 11;
                        break;
                    case 1:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i17 |= 2;
                        i16 = 11;
                        break;
                    case 2:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i17 |= 4;
                        i16 = 11;
                        break;
                    case 3:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i17 |= 8;
                        i16 = 11;
                        break;
                    case 4:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i17 |= 16;
                        i16 = 11;
                        break;
                    case 5:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str19);
                        i17 |= 32;
                        i16 = 11;
                        break;
                    case 6:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i17 |= 64;
                        i16 = 11;
                        break;
                    case 7:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str18);
                        i17 |= 128;
                        i16 = 11;
                        break;
                    case 8:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str22);
                        i17 |= 256;
                        i16 = 11;
                        break;
                    case 9:
                        str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str23);
                        i17 |= 512;
                        i16 = 11;
                        break;
                    case 10:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str21);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i16 = 11;
                        break;
                    case 11:
                        zDecodeBooleanElement7 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, i16);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        break;
                    case 12:
                        zDecodeBooleanElement6 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 12);
                        i17 |= 4096;
                        break;
                    case 13:
                        boolean zDecodeBooleanElement8 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 13);
                        i17 |= DfuBaseService.ERROR_REMOTE_MASK;
                        z16 = zDecodeBooleanElement8;
                        break;
                    case 14:
                        zDecodeBooleanElement5 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 14);
                        i17 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        break;
                    case 15:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, IntSerializer.INSTANCE, num3);
                        i15 = 32768;
                        i17 |= i15;
                        break;
                    case 16:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, StringSerializer.INSTANCE, str20);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i17 |= i15;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        amaHostDto2 = (AmaHostDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, AmaHostDto$$serializer.INSTANCE, amaHostDto2);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i17 |= i15;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            amaHostDto = amaHostDto2;
            str = str18;
            str2 = str19;
            i14 = iDecodeIntElement2;
            z4 = z16;
            str3 = str20;
            num = num3;
            str4 = str21;
            str5 = str22;
            str6 = str23;
            z13 = zDecodeBooleanElement5;
            str7 = strDecodeStringElement6;
            str8 = strDecodeStringElement7;
            str9 = strDecodeStringElement8;
            str10 = strDecodeStringElement9;
            str11 = strDecodeStringElement10;
            z14 = zDecodeBooleanElement6;
            z15 = zDecodeBooleanElement7;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MemberStoryDto(i13, i14, str7, str8, str9, str10, str2, str11, str, str5, str6, str4, z15, z14, z4, z13, num, str3, amaHostDto, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MemberStoryDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MemberStoryDto.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
