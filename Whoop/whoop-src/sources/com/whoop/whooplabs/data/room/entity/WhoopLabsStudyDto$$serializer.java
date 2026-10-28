package com.whoop.whooplabs.data.room.entity;

import com.whoop.whooplabs.data.remote.domain.dto.SessionDto;
import com.whoop.whooplabs.data.remote.domain.dto.SessionDto$$serializer;
import java.util.Date;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u82.C34641b;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class WhoopLabsStudyDto$$serializer implements GeneratedSerializer<WhoopLabsStudyDto> {
    public static final int $stable;
    public static final WhoopLabsStudyDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        WhoopLabsStudyDto$$serializer whoopLabsStudyDto$$serializer = new WhoopLabsStudyDto$$serializer();
        INSTANCE = whoopLabsStudyDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.whooplabs.data.room.entity.WhoopLabsStudyDto", whoopLabsStudyDto$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("start", false);
        pluginGeneratedSerialDescriptor.addElement("end", false);
        pluginGeneratedSerialDescriptor.addElement("study_type", false);
        pluginGeneratedSerialDescriptor.addElement("deviceName", false);
        pluginGeneratedSerialDescriptor.addElement("external_device_connected", false);
        pluginGeneratedSerialDescriptor.addElement("campaignIds", false);
        pluginGeneratedSerialDescriptor.addElement("user_timestamps", false);
        pluginGeneratedSerialDescriptor.addElement("steps", false);
        pluginGeneratedSerialDescriptor.addElement("session", false);
        pluginGeneratedSerialDescriptor.addElement("strapBacklog", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WhoopLabsStudyDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = WhoopLabsStudyDto.$childSerializers;
        C34641b c34641b = C34641b.f145940a;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(c34641b), AbstractC38195a.m122336d(c34641b), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), BooleanSerializer.INSTANCE, interfaceC23462hArr[5].getValue(), interfaceC23462hArr[6].getValue(), interfaceC23462hArr[7].getValue(), AbstractC38195a.m122336d(SessionDto$$serializer.INSTANCE), AbstractC38195a.m122336d(LongSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final WhoopLabsStudyDto deserialize(InterfaceC40541d decoder) {
        boolean z4;
        Integer[] numArr;
        List list;
        String str;
        Long l7;
        SessionDto sessionDto;
        List list2;
        String str2;
        Date date;
        int i13;
        Date date2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = WhoopLabsStudyDto.$childSerializers;
        int i14 = 9;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C34641b c34641b = C34641b.f145940a;
            Date date3 = (Date) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, c34641b, null);
            Date date4 = (Date) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, c34641b, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
            Integer[] numArr2 = (Integer[]) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            SessionDto sessionDto2 = (SessionDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, SessionDto$$serializer.INSTANCE, null);
            list2 = list4;
            date = date4;
            l7 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, LongSerializer.INSTANCE, null);
            str = str4;
            sessionDto = sessionDto2;
            z4 = zDecodeBooleanElement;
            str2 = str3;
            i13 = 1023;
            list = list3;
            numArr = numArr2;
            date2 = date3;
        } else {
            int i15 = 7;
            int i16 = 6;
            int i17 = 5;
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            Integer[] numArr3 = null;
            List list5 = null;
            String str5 = null;
            Long l12 = null;
            SessionDto sessionDto3 = null;
            List list6 = null;
            String str6 = null;
            Date date5 = null;
            int i18 = 0;
            Date date6 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i17 = 5;
                        i16 = 6;
                        i15 = 7;
                        break;
                    case 0:
                        date5 = (Date) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, C34641b.f145940a, date5);
                        i18 |= 1;
                        i14 = 9;
                        i17 = 5;
                        i16 = 6;
                        i15 = 7;
                        break;
                    case 1:
                        date6 = (Date) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, C34641b.f145940a, date6);
                        i18 |= 2;
                        i14 = 9;
                        i17 = 5;
                        i16 = 6;
                        i15 = 7;
                        break;
                    case 2:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str6);
                        i18 |= 4;
                        i14 = 9;
                        i17 = 5;
                        i16 = 6;
                        i15 = 7;
                        break;
                    case 3:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str5);
                        i18 |= 8;
                        i14 = 9;
                        i17 = 5;
                        i16 = 6;
                        i15 = 7;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
                        i18 |= 16;
                        i14 = 9;
                        i16 = 6;
                        i15 = 7;
                        break;
                    case 5:
                        numArr3 = (Integer[]) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), numArr3);
                        i18 |= 32;
                        i14 = 9;
                        i16 = 6;
                        i15 = 7;
                        break;
                    case 6:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list5);
                        i18 |= 64;
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 7:
                        list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list6);
                        i18 |= 128;
                        i14 = 9;
                        break;
                    case 8:
                        sessionDto3 = (SessionDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, SessionDto$$serializer.INSTANCE, sessionDto3);
                        i18 |= 256;
                        i14 = 9;
                        break;
                    case 9:
                        l12 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, LongSerializer.INSTANCE, l12);
                        i18 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            numArr = numArr3;
            list = list5;
            str = str5;
            l7 = l12;
            sessionDto = sessionDto3;
            list2 = list6;
            str2 = str6;
            date = date6;
            i13 = i18;
            date2 = date5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new WhoopLabsStudyDto(i13, date2, date, str2, str, z4, numArr, list, list2, sessionDto, l7, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, WhoopLabsStudyDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        WhoopLabsStudyDto.write$Self$whooplabs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
