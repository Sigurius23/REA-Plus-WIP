package com.whoop.whooplabs.data.remote.domain.dto.bff;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CampaignExtendedDetailsResponse$$serializer implements GeneratedSerializer<CampaignExtendedDetailsResponse> {
    public static final int $stable;
    public static final CampaignExtendedDetailsResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CampaignExtendedDetailsResponse$$serializer campaignExtendedDetailsResponse$$serializer = new CampaignExtendedDetailsResponse$$serializer();
        INSTANCE = campaignExtendedDetailsResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignExtendedDetailsResponse", campaignExtendedDetailsResponse$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("campaignId", false);
        pluginGeneratedSerialDescriptor.addElement("page_title_display", false);
        pluginGeneratedSerialDescriptor.addElement("title_display", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle_display", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("contentBlocks", false);
        pluginGeneratedSerialDescriptor.addElement("description_display", false);
        pluginGeneratedSerialDescriptor.addElement("documents", false);
        pluginGeneratedSerialDescriptor.addElement("alert_title_display", false);
        pluginGeneratedSerialDescriptor.addElement("alertDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("documentDisplay", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CampaignExtendedDetailsResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CampaignExtendedDetailsResponse.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{IntSerializer.INSTANCE, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[5].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CampaignExtendedDetailsResponse deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        int i13;
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        String str5;
        List list2;
        String str6;
        String str7;
        String str8;
        InterfaceC23462h[] interfaceC23462hArr;
        InterfaceC23462h[] interfaceC23462hArr2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr3 = CampaignExtendedDetailsResponse.$childSerializers;
        String str9 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr3[5].getValue(), null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr3[7].getValue(), null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            list2 = list4;
            list = list3;
            str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            str3 = str14;
            str6 = str12;
            str = str15;
            str4 = str13;
            str7 = str11;
            str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            i13 = 2047;
            str8 = str10;
        } else {
            int i14 = 7;
            int i15 = 5;
            boolean z4 = true;
            iDecodeIntElement = 0;
            int i16 = 0;
            String str16 = null;
            List list5 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            List list6 = null;
            String str21 = null;
            String str22 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 5;
                        i14 = 7;
                        break;
                    case 0:
                        iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                        i16 |= 1;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i15 = 5;
                        i14 = 7;
                        break;
                    case 1:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str9);
                        i16 |= 2;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i15 = 5;
                        i14 = 7;
                        break;
                    case 2:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str22);
                        i16 |= 4;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i15 = 5;
                        i14 = 7;
                        break;
                    case 3:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str21);
                        i16 |= 8;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i15 = 5;
                        i14 = 7;
                        break;
                    case 4:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str19);
                        i16 |= 16;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i15 = 5;
                        i14 = 7;
                        break;
                    case 5:
                        interfaceC23462hArr2 = interfaceC23462hArr3;
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr2[i15].getValue(), list5);
                        i16 |= 32;
                        interfaceC23462hArr3 = interfaceC23462hArr2;
                        i14 = 7;
                        break;
                    case 6:
                        interfaceC23462hArr2 = interfaceC23462hArr3;
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str18);
                        i16 |= 64;
                        interfaceC23462hArr3 = interfaceC23462hArr2;
                        i14 = 7;
                        break;
                    case 7:
                        interfaceC23462hArr = interfaceC23462hArr3;
                        list6 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), list6);
                        i16 |= 128;
                        interfaceC23462hArr3 = interfaceC23462hArr;
                        break;
                    case 8:
                        interfaceC23462hArr = interfaceC23462hArr3;
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str16);
                        i16 |= 256;
                        interfaceC23462hArr3 = interfaceC23462hArr;
                        break;
                    case 9:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str20);
                        i16 |= 512;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        break;
                    case 10:
                        interfaceC23462hArr = interfaceC23462hArr3;
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str17);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        interfaceC23462hArr3 = interfaceC23462hArr;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            str = str16;
            list = list5;
            str2 = str17;
            str3 = str18;
            str4 = str19;
            str5 = str20;
            list2 = list6;
            str6 = str21;
            str7 = str22;
            str8 = str9;
        }
        int i17 = iDecodeIntElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CampaignExtendedDetailsResponse(i13, i17, str8, str7, str6, str4, list, str3, list2, str, str5, str2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CampaignExtendedDetailsResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CampaignExtendedDetailsResponse.write$Self$whooplabs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
