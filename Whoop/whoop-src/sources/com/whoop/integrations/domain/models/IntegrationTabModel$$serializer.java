package com.whoop.integrations.domain.models;

import io.getstream.chat.android.client.api.QueryParams;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/integrations/domain/models/IntegrationTabModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/integrations/domain/models/IntegrationTabModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/integrations/domain/models/IntegrationTabModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/integrations/domain/models/IntegrationTabModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class IntegrationTabModel$$serializer implements GeneratedSerializer<IntegrationTabModel> {
    public static final int $stable;
    public static final IntegrationTabModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        IntegrationTabModel$$serializer integrationTabModel$$serializer = new IntegrationTabModel$$serializer();
        INSTANCE = integrationTabModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.integrations.domain.models.IntegrationTabModel", integrationTabModel$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("reportingKey", false);
        pluginGeneratedSerialDescriptor.addElement("displayType", false);
        pluginGeneratedSerialDescriptor.addElement("title_display", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle_display", false);
        pluginGeneratedSerialDescriptor.addElement("ctaText", false);
        pluginGeneratedSerialDescriptor.addElement("bannerImage", false);
        pluginGeneratedSerialDescriptor.addElement("iconImage", false);
        pluginGeneratedSerialDescriptor.addElement("connected", false);
        pluginGeneratedSerialDescriptor.addElement("connectedFrom3P", false);
        pluginGeneratedSerialDescriptor.addElement("screenName", false);
        pluginGeneratedSerialDescriptor.addElement(QueryParams.URL, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IntegrationTabModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = IntegrationTabModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, interfaceC23462hArr[2].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final IntegrationTabModel deserialize(InterfaceC40541d decoder) {
        String str;
        String str2;
        int i13;
        String str3;
        Boolean bool;
        Boolean bool2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        IntegrationTabDisplayType integrationTabDisplayType;
        String str9;
        InterfaceC23462h[] interfaceC23462hArr;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr2 = IntegrationTabModel.$childSerializers;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            IntegrationTabDisplayType integrationTabDisplayType2 = (IntegrationTabDisplayType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr2[2].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, booleanSerializer, null);
            Boolean bool4 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, booleanSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            integrationTabDisplayType = integrationTabDisplayType2;
            str2 = strDecodeStringElement2;
            str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            str3 = str14;
            bool = bool4;
            str9 = strDecodeStringElement4;
            str6 = str13;
            str4 = str12;
            str8 = str10;
            bool2 = bool3;
            str7 = str11;
            i13 = 4095;
            str = strDecodeStringElement3;
        } else {
            String strDecodeStringElement5 = null;
            String str15 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String strDecodeStringElement6 = null;
            boolean z4 = true;
            int i14 = 0;
            String str19 = null;
            String str20 = null;
            IntegrationTabDisplayType integrationTabDisplayType3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        i14 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 1:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 |= 2;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 2:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        integrationTabDisplayType3 = (IntegrationTabDisplayType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), integrationTabDisplayType3);
                        i14 |= 4;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 3:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str20);
                        i14 |= 8;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 4:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str19);
                        i14 |= 16;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 5:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str16);
                        i14 |= 32;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 6:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str18);
                        i14 |= 64;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 7:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i14 |= 128;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 8:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        bool6 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, BooleanSerializer.INSTANCE, bool6);
                        i14 |= 256;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 9:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        bool5 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, BooleanSerializer.INSTANCE, bool5);
                        i14 |= 512;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    case 10:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str15);
                        i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        break;
                    case 11:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str17);
                        i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement;
            i13 = i14;
            str3 = str15;
            bool = bool5;
            bool2 = bool6;
            str4 = str16;
            str5 = str17;
            str6 = str18;
            str7 = str19;
            str8 = str20;
            integrationTabDisplayType = integrationTabDisplayType3;
            str9 = strDecodeStringElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new IntegrationTabModel(i13, str2, str, integrationTabDisplayType, str8, str7, str4, str6, str9, bool2, bool, str3, str5, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, IntegrationTabModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        IntegrationTabModel.write$Self$integrations_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
