package com.whoop.p069ui.teams;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/ui/teams/LeadersEntryDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/ui/teams/LeadersEntryDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/ui/teams/LeadersEntryDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/ui/teams/LeadersEntryDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class LeadersEntryDto$$serializer implements GeneratedSerializer<LeadersEntryDto> {
    public static final LeadersEntryDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        LeadersEntryDto$$serializer leadersEntryDto$$serializer = new LeadersEntryDto$$serializer();
        INSTANCE = leadersEntryDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.ui.teams.LeadersEntryDto", leadersEntryDto$$serializer, 22);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("user_id", false);
        pluginGeneratedSerialDescriptor.addElement("avatarUrl", true);
        pluginGeneratedSerialDescriptor.addElement("rank", true);
        pluginGeneratedSerialDescriptor.addElement("deleted", false);
        pluginGeneratedSerialDescriptor.addElement("dayStrain", true);
        pluginGeneratedSerialDescriptor.addElement("calories", true);
        pluginGeneratedSerialDescriptor.addElement("score", true);
        pluginGeneratedSerialDescriptor.addElement("hrv", true);
        pluginGeneratedSerialDescriptor.addElement("rhr", true);
        pluginGeneratedSerialDescriptor.addElement(AttachmentExtensionsKt.EXTRA_DURATION, true);
        pluginGeneratedSerialDescriptor.addElement("performance", true);
        pluginGeneratedSerialDescriptor.addElement("activities", true);
        pluginGeneratedSerialDescriptor.addElement("peakActivity", true);
        pluginGeneratedSerialDescriptor.addElement("createdAt", true);
        pluginGeneratedSerialDescriptor.addElement("updatedAt", true);
        pluginGeneratedSerialDescriptor.addElement("cycleDayJoined", true);
        pluginGeneratedSerialDescriptor.addElement("period", true);
        pluginGeneratedSerialDescriptor.addElement("during", true);
        pluginGeneratedSerialDescriptor.addElement("is_waiting_for_data", true);
        pluginGeneratedSerialDescriptor.addElement("compliant", true);
        pluginGeneratedSerialDescriptor.addElement("hasData", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LeadersEntryDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = LeadersEntryDto.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(intSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, intSerializer, interfaceC37138cM122336d2, interfaceC37138cM122336d3, booleanSerializer, AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[12].getValue()), AbstractC38195a.m122336d(LeaderActivityDto$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(booleanSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final LeadersEntryDto deserialize(InterfaceC40541d decoder) {
        String str;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Double d3;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List list;
        Integer num;
        LeaderActivityDto leaderActivityDto;
        String str7;
        Double d14;
        Double d15;
        int i13;
        Double d16;
        Double d17;
        Double d18;
        Double d19;
        boolean z4;
        int i14;
        int i15;
        Double d24;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = LeadersEntryDto.$childSerializers;
        String str8 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, IntSerializer.INSTANCE, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
            DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
            Double d25 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, doubleSerializer, null);
            Double d26 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, doubleSerializer, null);
            Double d27 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, doubleSerializer, null);
            Double d28 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, doubleSerializer, null);
            Double d29 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, doubleSerializer, null);
            Double d32 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, doubleSerializer, null);
            Double d34 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, doubleSerializer, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            LeaderActivityDto leaderActivityDto2 = (LeaderActivityDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, LeaderActivityDto$$serializer.INSTANCE, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, booleanSerializer, null);
            Boolean bool5 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, booleanSerializer, null);
            bool = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 21, booleanSerializer, null);
            i13 = 4194303;
            d14 = d26;
            d15 = d25;
            num = num2;
            z4 = zDecodeBooleanElement;
            d17 = d28;
            str7 = str10;
            str = str9;
            i14 = iDecodeIntElement;
            str5 = str11;
            d18 = d29;
            d16 = d27;
            bool3 = bool5;
            bool2 = bool4;
            str2 = str15;
            str4 = str14;
            str3 = str13;
            str6 = str12;
            leaderActivityDto = leaderActivityDto2;
            list = list2;
            d3 = d34;
            d19 = d32;
        } else {
            int i16 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement2 = 0;
            boolean z13 = true;
            LeaderActivityDto leaderActivityDto3 = null;
            Double d35 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Double d36 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            List list3 = null;
            Double d37 = null;
            String str20 = null;
            String str21 = null;
            Integer num3 = null;
            Double d38 = null;
            Double d39 = null;
            Double d44 = null;
            Double d45 = null;
            while (z13) {
                Double d46 = d35;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        d24 = d46;
                        z13 = false;
                        leaderActivityDto3 = leaderActivityDto3;
                        d35 = d24;
                        d37 = d37;
                        break;
                    case 0:
                        d37 = d37;
                        d24 = d46;
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str20);
                        i16 |= 1;
                        leaderActivityDto3 = leaderActivityDto3;
                        str21 = str21;
                        d35 = d24;
                        d37 = d37;
                        break;
                    case 1:
                        d37 = d37;
                        d24 = d46;
                        iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
                        leaderActivityDto3 = leaderActivityDto3;
                        i16 |= 2;
                        d35 = d24;
                        d37 = d37;
                        break;
                    case 2:
                        d37 = d37;
                        d24 = d46;
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str21);
                        i16 |= 4;
                        leaderActivityDto3 = leaderActivityDto3;
                        d39 = d39;
                        d35 = d24;
                        d37 = d37;
                        break;
                    case 3:
                        d37 = d37;
                        d24 = d46;
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, IntSerializer.INSTANCE, num3);
                        i16 |= 8;
                        leaderActivityDto3 = leaderActivityDto3;
                        d38 = d38;
                        d35 = d24;
                        d37 = d37;
                        break;
                    case 4:
                        d37 = d37;
                        d24 = d46;
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
                        leaderActivityDto3 = leaderActivityDto3;
                        i16 |= 16;
                        d35 = d24;
                        d37 = d37;
                        break;
                    case 5:
                        d24 = d46;
                        d38 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, DoubleSerializer.INSTANCE, d38);
                        i16 |= 32;
                        leaderActivityDto3 = leaderActivityDto3;
                        d35 = d24;
                        d37 = d37;
                        break;
                    case 6:
                        d37 = d37;
                        d24 = d46;
                        d39 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, DoubleSerializer.INSTANCE, d39);
                        i16 |= 64;
                        leaderActivityDto3 = leaderActivityDto3;
                        d44 = d44;
                        d35 = d24;
                        d37 = d37;
                        break;
                    case 7:
                        d37 = d37;
                        d24 = d46;
                        d44 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, DoubleSerializer.INSTANCE, d44);
                        i16 |= 128;
                        leaderActivityDto3 = leaderActivityDto3;
                        d45 = d45;
                        d35 = d24;
                        d37 = d37;
                        break;
                    case 8:
                        d24 = d46;
                        d45 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, DoubleSerializer.INSTANCE, d45);
                        i16 |= 256;
                        leaderActivityDto3 = leaderActivityDto3;
                        d35 = d24;
                        d37 = d37;
                        break;
                    case 9:
                        d37 = d37;
                        i16 |= 512;
                        d35 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, DoubleSerializer.INSTANCE, d46);
                        leaderActivityDto3 = leaderActivityDto3;
                        d37 = d37;
                        break;
                    case 10:
                        d37 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, DoubleSerializer.INSTANCE, d37);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        leaderActivityDto3 = leaderActivityDto3;
                        d35 = d46;
                        break;
                    case 11:
                        d37 = d37;
                        d36 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, DoubleSerializer.INSTANCE, d36);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        d35 = d46;
                        d37 = d37;
                        break;
                    case 12:
                        d37 = d37;
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), list3);
                        i16 |= 4096;
                        d35 = d46;
                        d37 = d37;
                        break;
                    case 13:
                        d37 = d37;
                        leaderActivityDto3 = (LeaderActivityDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, LeaderActivityDto$$serializer.INSTANCE, leaderActivityDto3);
                        i16 |= DfuBaseService.ERROR_REMOTE_MASK;
                        d35 = d46;
                        d37 = d37;
                        break;
                    case 14:
                        d37 = d37;
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str8);
                        i16 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        d35 = d46;
                        d37 = d37;
                        break;
                    case 15:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, StringSerializer.INSTANCE, str19);
                        i15 = 32768;
                        i16 |= i15;
                        d35 = d46;
                        d37 = d37;
                        break;
                    case 16:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, StringSerializer.INSTANCE, str17);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i16 |= i15;
                        d35 = d46;
                        d37 = d37;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, StringSerializer.INSTANCE, str18);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i16 |= i15;
                        d35 = d46;
                        d37 = d37;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, StringSerializer.INSTANCE, str16);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        i16 |= i15;
                        d35 = d46;
                        d37 = d37;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        bool7 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, BooleanSerializer.INSTANCE, bool7);
                        i15 = 524288;
                        i16 |= i15;
                        d35 = d46;
                        d37 = d37;
                        break;
                    case 20:
                        bool8 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, BooleanSerializer.INSTANCE, bool8);
                        i15 = 1048576;
                        i16 |= i15;
                        d35 = d46;
                        d37 = d37;
                        break;
                    case 21:
                        bool6 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 21, BooleanSerializer.INSTANCE, bool6);
                        i15 = 2097152;
                        i16 |= i15;
                        d35 = d46;
                        d37 = d37;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str20;
            bool = bool6;
            bool2 = bool7;
            bool3 = bool8;
            d3 = d36;
            str2 = str16;
            str3 = str17;
            str4 = str18;
            str5 = str8;
            str6 = str19;
            list = list3;
            num = num3;
            leaderActivityDto = leaderActivityDto3;
            str7 = str21;
            d14 = d39;
            d15 = d38;
            i13 = i16;
            d16 = d44;
            d17 = d45;
            d18 = d35;
            d19 = d37;
            z4 = zDecodeBooleanElement2;
            i14 = iDecodeIntElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new LeadersEntryDto(i13, str, i14, str7, num, z4, d15, d14, d16, d17, d18, d19, d3, list, leaderActivityDto, str5, str6, str3, str4, str2, bool2, bool3, bool, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, LeadersEntryDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        LeadersEntryDto.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
