package com.whoop.membership.extensions.domain.models;

import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ExtensionsV2LandingOption$$serializer implements GeneratedSerializer<ExtensionsV2LandingOption> {
    public static final int $stable;
    public static final ExtensionsV2LandingOption$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ExtensionsV2LandingOption$$serializer extensionsV2LandingOption$$serializer = new ExtensionsV2LandingOption$$serializer();
        INSTANCE = extensionsV2LandingOption$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.membership.extensions.domain.models.ExtensionsV2LandingOption", extensionsV2LandingOption$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("price", false);
        pluginGeneratedSerialDescriptor.addElement("strikethrough_price", false);
        pluginGeneratedSerialDescriptor.addElement("price_subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("selected", false);
        pluginGeneratedSerialDescriptor.addElement("trackingLabel", false);
        pluginGeneratedSerialDescriptor.addElement("cta_title", false);
        pluginGeneratedSerialDescriptor.addElement("secondaryCtaTitle", false);
        pluginGeneratedSerialDescriptor.addElement("disclaimer", false);
        pluginGeneratedSerialDescriptor.addElement("checkout", false);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("tag", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ExtensionsV2LandingOption$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ExtensionsV2LandingOption.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[9].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ExtensionsV2LandingOption deserialize(InterfaceC40541d decoder) {
        String str;
        String str2;
        int i13;
        String str3;
        C9598e c9598e;
        Action action;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ExtensionsV2LandingOption.$childSerializers;
        char c3 = '\b';
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            action = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            str2 = strDecodeStringElement2;
            str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            str6 = str12;
            str9 = strDecodeStringElement5;
            str8 = strDecodeStringElement4;
            str7 = str11;
            str4 = str13;
            z4 = zDecodeBooleanElement;
            str5 = str10;
            c9598e = c9598e2;
            i13 = 4095;
            str = strDecodeStringElement3;
        } else {
            String strDecodeStringElement6 = null;
            String str14 = null;
            C9598e c9598e3 = null;
            Action action2 = null;
            String str15 = null;
            String str16 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            boolean z13 = true;
            int i14 = 0;
            boolean zDecodeBooleanElement2 = false;
            String str17 = null;
            String str18 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        break;
                    case 0:
                        i14 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        c3 = '\b';
                        break;
                    case 1:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 |= 2;
                        c3 = '\b';
                        break;
                    case 2:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str16);
                        i14 |= 4;
                        c3 = '\b';
                        break;
                    case 3:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str18);
                        i14 |= 8;
                        c3 = '\b';
                        break;
                    case 4:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
                        i14 |= 16;
                        c3 = '\b';
                        break;
                    case 5:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i14 |= 32;
                        c3 = '\b';
                        break;
                    case 6:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i14 |= 64;
                        c3 = '\b';
                        break;
                    case 7:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str17);
                        i14 |= 128;
                        c3 = '\b';
                        break;
                    case 8:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str15);
                        i14 |= 256;
                        c3 = '\b';
                        break;
                    case 9:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), c9598e3);
                        i14 |= 512;
                        c3 = '\b';
                        break;
                    case 10:
                        action2 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), action2);
                        i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        c3 = '\b';
                        break;
                    case 11:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str14);
                        i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c3 = '\b';
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement6;
            str2 = strDecodeStringElement;
            i13 = i14;
            str3 = str14;
            c9598e = c9598e3;
            action = action2;
            str4 = str15;
            str5 = str16;
            str6 = str17;
            str7 = str18;
            str8 = strDecodeStringElement7;
            str9 = strDecodeStringElement8;
            z4 = zDecodeBooleanElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ExtensionsV2LandingOption(i13, str2, str, str5, str7, z4, str8, str9, str6, str4, c9598e, action, str3, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ExtensionsV2LandingOption value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ExtensionsV2LandingOption.write$Self$membership_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
