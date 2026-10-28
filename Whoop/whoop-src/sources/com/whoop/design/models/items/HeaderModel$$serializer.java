package com.whoop.design.models.items;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/HeaderModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/HeaderModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/HeaderModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/HeaderModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HeaderModel$$serializer implements GeneratedSerializer<HeaderModel> {
    public static final int $stable;
    public static final HeaderModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HeaderModel$$serializer headerModel$$serializer = new HeaderModel$$serializer();
        INSTANCE = headerModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.HeaderModel", headerModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("subtitleEnd", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("ctaState", true);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        pluginGeneratedSerialDescriptor.addElement("typography", true);
        pluginGeneratedSerialDescriptor.addElement("subtitleTypography", true);
        pluginGeneratedSerialDescriptor.addElement("subtitleLocation", true);
        pluginGeneratedSerialDescriptor.addElement("leadingButton", true);
        pluginGeneratedSerialDescriptor.addElement("destination", true);
        pluginGeneratedSerialDescriptor.addElement("titleEnd", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HeaderModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HeaderModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, c25452a, AbstractC38195a.m122336d(c25452a), AbstractC38195a.m122336d(c25452a), AbstractC38195a.m122336d(c25452a), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), BooleanSerializer.INSTANCE, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[13].getValue()), AbstractC38195a.m122336d(c25452a)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HeaderModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        String str2;
        TextResource textResource;
        TextResource textResource2;
        String str3;
        String str4;
        HeaderStyle headerStyle;
        String str5;
        String str6;
        String str7;
        TextResource textResource3;
        TextResource textResource4;
        C9598e c9598e;
        TextResource textResource5;
        boolean z4;
        TextResource textResource6;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HeaderModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            TextResource textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, c25452a, null);
            TextResource textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, c25452a, null);
            TextResource textResource10 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, c25452a, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            HeaderStyle headerStyle2 = (HeaderStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 12);
            i13 = 32767;
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, c25452a, null);
            headerStyle = headerStyle2;
            str = str8;
            str4 = str12;
            str6 = str11;
            str5 = str10;
            str7 = str9;
            textResource = textResource9;
            textResource3 = textResource10;
            textResource2 = textResource8;
            textResource4 = textResource7;
            z4 = zDecodeBooleanElement;
            str2 = str14;
            str3 = str13;
        } else {
            int i14 = 8;
            boolean zDecodeBooleanElement2 = false;
            TextResource textResource11 = null;
            C9598e c9598e2 = null;
            String str15 = null;
            TextResource textResource12 = null;
            TextResource textResource13 = null;
            String str16 = null;
            String str17 = null;
            HeaderStyle headerStyle3 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            boolean z13 = true;
            i13 = 0;
            TextResource textResource14 = null;
            TextResource textResource15 = null;
            while (z13) {
                TextResource textResource16 = textResource12;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        textResource6 = textResource16;
                        z13 = false;
                        textResource12 = textResource6;
                        c9598e2 = c9598e2;
                        textResource11 = textResource11;
                        i14 = 8;
                        break;
                    case 0:
                        textResource6 = textResource16;
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str21);
                        i13 |= 1;
                        textResource12 = textResource6;
                        c9598e2 = c9598e2;
                        textResource11 = textResource11;
                        i14 = 8;
                        break;
                    case 1:
                        textResource11 = textResource11;
                        c9598e2 = c9598e2;
                        textResource12 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource16);
                        i13 |= 2;
                        c9598e2 = c9598e2;
                        textResource11 = textResource11;
                        i14 = 8;
                        break;
                    case 2:
                        textResource13 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource13);
                        i13 |= 4;
                        textResource11 = textResource11;
                        textResource12 = textResource16;
                        i14 = 8;
                        break;
                    case 3:
                        textResource14 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource14);
                        i13 |= 8;
                        textResource12 = textResource16;
                        textResource13 = textResource13;
                        i14 = 8;
                        break;
                    case 4:
                        textResource15 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, C25452a.f99689a, textResource15);
                        i13 |= 16;
                        textResource12 = textResource16;
                        textResource13 = textResource13;
                        i14 = 8;
                        break;
                    case 5:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str20);
                        i13 |= 32;
                        textResource12 = textResource16;
                        textResource13 = textResource13;
                        i14 = 8;
                        break;
                    case 6:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str18);
                        i13 |= 64;
                        textResource12 = textResource16;
                        textResource13 = textResource13;
                        i14 = 8;
                        break;
                    case 7:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str19);
                        i13 |= 128;
                        textResource12 = textResource16;
                        textResource13 = textResource13;
                        i14 = 8;
                        break;
                    case 8:
                        headerStyle3 = (HeaderStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), headerStyle3);
                        i13 |= 256;
                        textResource12 = textResource16;
                        textResource13 = textResource13;
                        break;
                    case 9:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str17);
                        i13 |= 512;
                        textResource12 = textResource16;
                        textResource13 = textResource13;
                        break;
                    case 10:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str16);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        textResource12 = textResource16;
                        textResource13 = textResource13;
                        break;
                    case 11:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str15);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        textResource12 = textResource16;
                        textResource13 = textResource13;
                        break;
                    case 12:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 12);
                        i13 |= 4096;
                        textResource12 = textResource16;
                        textResource13 = textResource13;
                        break;
                    case 13:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), c9598e2);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        textResource12 = textResource16;
                        textResource13 = textResource13;
                        break;
                    case 14:
                        textResource11 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, C25452a.f99689a, textResource11);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        textResource12 = textResource16;
                        textResource13 = textResource13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str21;
            str2 = str15;
            textResource = textResource14;
            textResource2 = textResource13;
            str3 = str16;
            str4 = str17;
            headerStyle = headerStyle3;
            str5 = str18;
            str6 = str19;
            str7 = str20;
            textResource3 = textResource15;
            textResource4 = textResource12;
            c9598e = c9598e2;
            textResource5 = textResource11;
            z4 = zDecodeBooleanElement2;
        }
        int i15 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HeaderModel(i15, str, textResource4, textResource2, textResource, textResource3, str7, str5, str6, headerStyle, str4, str3, str2, z4, c9598e, textResource5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HeaderModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HeaderModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
