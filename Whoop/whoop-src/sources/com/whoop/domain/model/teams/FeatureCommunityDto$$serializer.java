package com.whoop.domain.model.teams;

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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/domain/model/teams/FeatureCommunityDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/domain/model/teams/FeatureCommunityDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/domain/model/teams/FeatureCommunityDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/domain/model/teams/FeatureCommunityDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class FeatureCommunityDto$$serializer implements GeneratedSerializer<FeatureCommunityDto> {
    public static final FeatureCommunityDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        FeatureCommunityDto$$serializer featureCommunityDto$$serializer = new FeatureCommunityDto$$serializer();
        INSTANCE = featureCommunityDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.domain.model.teams.FeatureCommunityDto", featureCommunityDto$$serializer, 14);
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
        pluginGeneratedSerialDescriptor.addElement("invite_code", false);
        pluginGeneratedSerialDescriptor.addElement("metadata", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FeatureCommunityDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = FeatureCommunityDto.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[11].getValue());
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(InviteCodeDto$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(MetaDataDto$$serializer.INSTANCE);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{intSerializer, booleanSerializer, stringSerializer, intSerializer, booleanSerializer, booleanSerializer, booleanSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, booleanSerializer, interfaceC37138cM122336d4, interfaceC37138cM122336d5, interfaceC37138cM122336d6};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final FeatureCommunityDto deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        String str;
        int i13;
        MetaDataDto metaDataDto;
        InviteCodeDto inviteCodeDto;
        String str2;
        TeamType teamType;
        String str3;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        int i14;
        boolean z16;
        String str4;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = FeatureCommunityDto.$childSerializers;
        int i15 = 10;
        char c7 = '\b';
        int i16 = 0;
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
            InviteCodeDto inviteCodeDto2 = (InviteCodeDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, InviteCodeDto$$serializer.INSTANCE, null);
            metaDataDto = (MetaDataDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, MetaDataDto$$serializer.INSTANCE, null);
            z4 = zDecodeBooleanElement;
            str4 = strDecodeStringElement;
            z13 = zDecodeBooleanElement5;
            str2 = str7;
            str = str5;
            z14 = zDecodeBooleanElement4;
            z15 = zDecodeBooleanElement3;
            i14 = iDecodeIntElement2;
            str3 = str6;
            z16 = zDecodeBooleanElement2;
            i13 = 16383;
            inviteCodeDto = inviteCodeDto2;
            teamType = teamType2;
        } else {
            boolean z17 = true;
            iDecodeIntElement = 0;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            int iDecodeIntElement3 = 0;
            boolean zDecodeBooleanElement9 = false;
            String str8 = null;
            MetaDataDto metaDataDto2 = null;
            InviteCodeDto inviteCodeDto3 = null;
            String str9 = null;
            TeamType teamType3 = null;
            String str10 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement10 = false;
            while (z17) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z17 = false;
                        break;
                    case 0:
                        i16 |= 1;
                        iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                        i15 = 10;
                        c7 = '\b';
                        break;
                    case 1:
                        i16 |= 2;
                        zDecodeBooleanElement10 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
                        i15 = 10;
                        c7 = '\b';
                        break;
                    case 2:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i15 = 10;
                        c7 = '\b';
                        break;
                    case 3:
                        iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
                        i16 |= 8;
                        i15 = 10;
                        c7 = '\b';
                        break;
                    case 4:
                        zDecodeBooleanElement9 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
                        i16 |= 16;
                        i15 = 10;
                        c7 = '\b';
                        break;
                    case 5:
                        zDecodeBooleanElement8 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
                        i16 |= 32;
                        i15 = 10;
                        c7 = '\b';
                        break;
                    case 6:
                        c3 = 7;
                        zDecodeBooleanElement7 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
                        i16 |= 64;
                        i15 = 10;
                        c7 = '\b';
                        break;
                    case 7:
                        c3 = 7;
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str8);
                        i16 |= 128;
                        i15 = 10;
                        c7 = '\b';
                        break;
                    case 8:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str10);
                        i16 |= 256;
                        c7 = '\b';
                        i15 = 10;
                        break;
                    case 9:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str9);
                        i16 |= 512;
                        c7 = '\b';
                        break;
                    case 10:
                        zDecodeBooleanElement6 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, i15);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        c7 = '\b';
                        break;
                    case 11:
                        teamType3 = (TeamType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), teamType3);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c7 = '\b';
                        break;
                    case 12:
                        inviteCodeDto3 = (InviteCodeDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, InviteCodeDto$$serializer.INSTANCE, inviteCodeDto3);
                        i16 |= 4096;
                        c7 = '\b';
                        break;
                    case 13:
                        metaDataDto2 = (MetaDataDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, MetaDataDto$$serializer.INSTANCE, metaDataDto2);
                        i16 |= DfuBaseService.ERROR_REMOTE_MASK;
                        c7 = '\b';
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str8;
            i13 = i16;
            metaDataDto = metaDataDto2;
            inviteCodeDto = inviteCodeDto3;
            str2 = str9;
            teamType = teamType3;
            str3 = str10;
            z4 = zDecodeBooleanElement10;
            z13 = zDecodeBooleanElement6;
            z14 = zDecodeBooleanElement7;
            z15 = zDecodeBooleanElement8;
            i14 = iDecodeIntElement3;
            z16 = zDecodeBooleanElement9;
            str4 = strDecodeStringElement2;
        }
        int i17 = iDecodeIntElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new FeatureCommunityDto(i13, i17, z4, str4, i14, z16, z15, z14, str, str3, str2, z13, teamType, inviteCodeDto, metaDataDto, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, FeatureCommunityDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        FeatureCommunityDto.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
