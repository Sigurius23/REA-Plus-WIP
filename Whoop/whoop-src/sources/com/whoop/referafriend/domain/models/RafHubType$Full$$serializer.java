package com.whoop.referafriend.domain.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/referafriend/domain/models/RafHubType.Full.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/referafriend/domain/models/RafHubType$Full;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/referafriend/domain/models/RafHubType$Full;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/referafriend/domain/models/RafHubType$Full;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class RafHubType$Full$$serializer implements GeneratedSerializer<RafHubType.Full> {
    public static final int $stable;
    public static final RafHubType$Full$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        RafHubType$Full$$serializer rafHubType$Full$$serializer = new RafHubType$Full$$serializer();
        INSTANCE = rafHubType$Full$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.referafriend.domain.models.RafHubType.Full", rafHubType$Full$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("header", false);
        pluginGeneratedSerialDescriptor.addElement("navigation_bar_text", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("primary_cta", false);
        pluginGeneratedSerialDescriptor.addElement("secondary_cta", false);
        pluginGeneratedSerialDescriptor.addElement("promotion", false);
        pluginGeneratedSerialDescriptor.addElement("how_it_works", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RafHubType$Full$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        RafHubCTA$$serializer rafHubCTA$$serializer = RafHubCTA$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, interfaceC37138cM122336d, stringSerializer, stringSerializer, stringSerializer, rafHubCTA$$serializer, AbstractC38195a.m122336d(rafHubCTA$$serializer), AbstractC38195a.m122336d(Promotion$$serializer.INSTANCE), AbstractC38195a.m122336d(RafHowItWorksModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final RafHubType.Full deserialize(InterfaceC40541d decoder) {
        int i13;
        RafHowItWorksModel rafHowItWorksModel;
        Promotion promotion;
        RafHubCTA rafHubCTA;
        RafHubCTA rafHubCTA2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 7;
        int i15 = 6;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            RafHubCTA$$serializer rafHubCTA$$serializer = RafHubCTA$$serializer.INSTANCE;
            RafHubCTA rafHubCTA3 = (RafHubCTA) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, rafHubCTA$$serializer, null);
            RafHubCTA rafHubCTA4 = (RafHubCTA) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, rafHubCTA$$serializer, null);
            str = strDecodeStringElement2;
            promotion = (Promotion) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, Promotion$$serializer.INSTANCE, null);
            rafHubCTA = rafHubCTA4;
            rafHubCTA2 = rafHubCTA3;
            str4 = strDecodeStringElement4;
            rafHowItWorksModel = (RafHowItWorksModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, RafHowItWorksModel$$serializer.INSTANCE, null);
            str5 = strDecodeStringElement5;
            str3 = strDecodeStringElement3;
            str2 = str6;
            i13 = 511;
        } else {
            boolean z4 = true;
            int i16 = 0;
            RafHowItWorksModel rafHowItWorksModel2 = null;
            Promotion promotion2 = null;
            RafHubCTA rafHubCTA5 = null;
            RafHubCTA rafHubCTA6 = null;
            String str7 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 1:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str7);
                        i16 |= 2;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 2:
                        i16 |= 4;
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        break;
                    case 3:
                        i16 |= 8;
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        break;
                    case 4:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        rafHubCTA6 = (RafHubCTA) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, RafHubCTA$$serializer.INSTANCE, rafHubCTA6);
                        i16 |= 32;
                        break;
                    case 6:
                        rafHubCTA5 = (RafHubCTA) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, RafHubCTA$$serializer.INSTANCE, rafHubCTA5);
                        i16 |= 64;
                        break;
                    case 7:
                        promotion2 = (Promotion) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, Promotion$$serializer.INSTANCE, promotion2);
                        i16 |= 128;
                        break;
                    case 8:
                        rafHowItWorksModel2 = (RafHowItWorksModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, RafHowItWorksModel$$serializer.INSTANCE, rafHowItWorksModel2);
                        i16 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            rafHowItWorksModel = rafHowItWorksModel2;
            promotion = promotion2;
            rafHubCTA = rafHubCTA5;
            rafHubCTA2 = rafHubCTA6;
            str = strDecodeStringElement;
            str2 = str7;
            str3 = strDecodeStringElement6;
            str4 = strDecodeStringElement7;
            str5 = strDecodeStringElement8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new RafHubType.Full(i13, str, str2, str3, str4, str5, rafHubCTA2, rafHubCTA, promotion, rafHowItWorksModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, RafHubType.Full value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        RafHubType.Full.write$Self$refer_a_friend_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
