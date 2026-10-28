package com.whoop.domain.model.teams;

import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/domain/model/teams/CommunityDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/domain/model/teams/CommunityDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/domain/model/teams/CommunityDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/domain/model/teams/CommunityDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CommunityDto$$serializer implements GeneratedSerializer<CommunityDto> {
    public static final CommunityDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CommunityDto$$serializer communityDto$$serializer = new CommunityDto$$serializer();
        INSTANCE = communityDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.domain.model.teams.CommunityDto", communityDto$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("deleted", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("ownerId", false);
        pluginGeneratedSerialDescriptor.addElement("shareStrain", false);
        pluginGeneratedSerialDescriptor.addElement("shareRecovery", false);
        pluginGeneratedSerialDescriptor.addElement("shareSleep", false);
        pluginGeneratedSerialDescriptor.addElement("about", false);
        pluginGeneratedSerialDescriptor.addElement("banner", false);
        pluginGeneratedSerialDescriptor.addElement("avatar", false);
        pluginGeneratedSerialDescriptor.addElement("private", false);
        pluginGeneratedSerialDescriptor.addElement("teamType", false);
        pluginGeneratedSerialDescriptor.addElement("metadata", false);
        pluginGeneratedSerialDescriptor.addElement("user_rank", false);
        pluginGeneratedSerialDescriptor.addElement("unreadCount", false);
        pluginGeneratedSerialDescriptor.addElement("chatEnabled", false);
        pluginGeneratedSerialDescriptor.addElement("chatChannels", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CommunityDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CommunityDto.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[11].getValue());
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(CommunityMetaDataDto$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(intSerializer);
        InterfaceC37138c interfaceC37138cM122336d7 = AbstractC38195a.m122336d(intSerializer);
        InterfaceC37138c interfaceC37138cM122336d8 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[16].getValue());
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{intSerializer, booleanSerializer, stringSerializer, intSerializer, booleanSerializer, booleanSerializer, booleanSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, booleanSerializer, interfaceC37138cM122336d4, interfaceC37138cM122336d5, interfaceC37138cM122336d6, interfaceC37138cM122336d7, booleanSerializer, interfaceC37138cM122336d8};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CommunityDto deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        int i13;
        String str;
        String str2;
        String str3;
        List list;
        Integer num;
        Integer num2;
        TeamType teamType;
        CommunityMetaDataDto communityMetaDataDto;
        String str4;
        boolean z4;
        int i14;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = CommunityDto.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
            boolean zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
            boolean zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            boolean zDecodeBooleanElement5 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 10);
            TeamType teamType2 = (TeamType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            CommunityMetaDataDto communityMetaDataDto2 = (CommunityMetaDataDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, CommunityMetaDataDto$$serializer.INSTANCE, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, intSerializer, null);
            Integer num4 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, intSerializer, null);
            boolean zDecodeBooleanElement6 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 15);
            i13 = 131071;
            num = num4;
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, (InterfaceC37137b) interfaceC23462hArr[16].getValue(), null);
            str4 = strDecodeStringElement;
            z4 = zDecodeBooleanElement;
            z13 = zDecodeBooleanElement5;
            str2 = str7;
            str = str5;
            z14 = zDecodeBooleanElement4;
            z15 = zDecodeBooleanElement3;
            z16 = zDecodeBooleanElement2;
            str3 = str6;
            z17 = zDecodeBooleanElement6;
            i14 = iDecodeIntElement2;
            num2 = num3;
            communityMetaDataDto = communityMetaDataDto2;
            teamType = teamType2;
        } else {
            int i15 = 16;
            iDecodeIntElement = 0;
            boolean zDecodeBooleanElement7 = false;
            int iDecodeIntElement3 = 0;
            boolean zDecodeBooleanElement8 = false;
            boolean zDecodeBooleanElement9 = false;
            boolean zDecodeBooleanElement10 = false;
            boolean zDecodeBooleanElement11 = false;
            boolean zDecodeBooleanElement12 = false;
            String str8 = null;
            List list2 = null;
            Integer num5 = null;
            Integer num6 = null;
            TeamType teamType3 = null;
            CommunityMetaDataDto communityMetaDataDto3 = null;
            String strDecodeStringElement2 = null;
            boolean z18 = true;
            i13 = 0;
            String str9 = null;
            String str10 = null;
            while (z18) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z18 = false;
                        break;
                    case 0:
                        i13 |= 1;
                        iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                        i15 = 16;
                        break;
                    case 1:
                        zDecodeBooleanElement7 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
                        i13 |= 2;
                        i15 = 16;
                        break;
                    case 2:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i13 |= 4;
                        i15 = 16;
                        break;
                    case 3:
                        iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
                        i13 |= 8;
                        i15 = 16;
                        break;
                    case 4:
                        zDecodeBooleanElement11 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
                        i13 |= 16;
                        i15 = 16;
                        break;
                    case 5:
                        zDecodeBooleanElement10 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
                        i13 |= 32;
                        i15 = 16;
                        break;
                    case 6:
                        zDecodeBooleanElement9 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
                        i13 |= 64;
                        i15 = 16;
                        break;
                    case 7:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str9);
                        i13 |= 128;
                        i15 = 16;
                        break;
                    case 8:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str10);
                        i13 |= 256;
                        i15 = 16;
                        break;
                    case 9:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str8);
                        i13 |= 512;
                        i15 = 16;
                        break;
                    case 10:
                        zDecodeBooleanElement8 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 10);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i15 = 16;
                        break;
                    case 11:
                        teamType3 = (TeamType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), teamType3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i15 = 16;
                        break;
                    case 12:
                        communityMetaDataDto3 = (CommunityMetaDataDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, CommunityMetaDataDto$$serializer.INSTANCE, communityMetaDataDto3);
                        i13 |= 4096;
                        i15 = 16;
                        break;
                    case 13:
                        num6 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, IntSerializer.INSTANCE, num6);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        i15 = 16;
                        break;
                    case 14:
                        num5 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, IntSerializer.INSTANCE, num5);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        i15 = 16;
                        break;
                    case 15:
                        zDecodeBooleanElement12 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 15);
                        i13 |= 32768;
                        break;
                    case 16:
                        list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list2);
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str9;
            str2 = str8;
            str3 = str10;
            list = list2;
            num = num5;
            num2 = num6;
            teamType = teamType3;
            communityMetaDataDto = communityMetaDataDto3;
            str4 = strDecodeStringElement2;
            z4 = zDecodeBooleanElement7;
            i14 = iDecodeIntElement3;
            z13 = zDecodeBooleanElement8;
            z14 = zDecodeBooleanElement9;
            z15 = zDecodeBooleanElement10;
            z16 = zDecodeBooleanElement11;
            z17 = zDecodeBooleanElement12;
        }
        int i16 = iDecodeIntElement;
        int i17 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CommunityDto(i17, i16, z4, str4, i14, z16, z15, z14, str, str3, str2, z13, teamType, communityMetaDataDto, num2, num, z17, list, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CommunityDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CommunityDto.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
