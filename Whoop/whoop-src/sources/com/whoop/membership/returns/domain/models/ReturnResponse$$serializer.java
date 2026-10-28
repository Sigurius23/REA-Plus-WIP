package com.whoop.membership.returns.domain.models;

import com.whoop.design.util.TextResource;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/membership/returns/domain/models/ReturnResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/membership/returns/domain/models/ReturnResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/membership/returns/domain/models/ReturnResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/membership/returns/domain/models/ReturnResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ReturnResponse$$serializer implements GeneratedSerializer<ReturnResponse> {
    public static final int $stable;
    public static final ReturnResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ReturnResponse$$serializer returnResponse$$serializer = new ReturnResponse$$serializer();
        INSTANCE = returnResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.membership.returns.domain.models.ReturnResponse", returnResponse$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("navbarTitle", false);
        pluginGeneratedSerialDescriptor.addElement("alertTitle", false);
        pluginGeneratedSerialDescriptor.addElement("alertSubtitle", false);
        pluginGeneratedSerialDescriptor.addElement("instructionsTitle", false);
        pluginGeneratedSerialDescriptor.addElement("instructions", false);
        pluginGeneratedSerialDescriptor.addElement("buttons", false);
        pluginGeneratedSerialDescriptor.addElement("footerText", false);
        pluginGeneratedSerialDescriptor.addElement("policyCtaText", false);
        pluginGeneratedSerialDescriptor.addElement("policyCtaUrl", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ReturnResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ReturnResponse.$childSerializers;
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{c25452a, c25452a, c25452a, c25452a, interfaceC23462hArr[4].getValue(), interfaceC23462hArr[5].getValue(), c25452a, c25452a, StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ReturnResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        TextResource textResource;
        List list;
        TextResource textResource2;
        List list2;
        TextResource textResource3;
        TextResource textResource4;
        TextResource textResource5;
        TextResource textResource6;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ReturnResponse.$childSerializers;
        int i14 = 7;
        int i15 = 5;
        TextResource textResource7 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            TextResource textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            TextResource textResource10 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, c25452a, null);
            TextResource textResource11 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, c25452a, null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            TextResource textResource12 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, c25452a, null);
            list = list4;
            textResource2 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, c25452a, null);
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            textResource = textResource12;
            textResource3 = textResource11;
            i13 = 511;
            textResource6 = textResource10;
            list2 = list3;
            textResource5 = textResource9;
            textResource4 = textResource8;
        } else {
            int i16 = 4;
            boolean z4 = true;
            int i17 = 0;
            TextResource textResource13 = null;
            List list5 = null;
            TextResource textResource14 = null;
            List list6 = null;
            TextResource textResource15 = null;
            TextResource textResource16 = null;
            TextResource textResource17 = null;
            String strDecodeStringElement2 = null;
            while (z4) {
                int i18 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        i15 = 5;
                        i16 = 4;
                        break;
                    case 0:
                        textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource7);
                        i17 |= 1;
                        i14 = 7;
                        i15 = 5;
                        i16 = 4;
                        break;
                    case 1:
                        textResource16 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource16);
                        i17 |= 2;
                        i14 = 7;
                        i15 = 5;
                        i16 = 4;
                        break;
                    case 2:
                        textResource17 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource17);
                        i17 |= 4;
                        i14 = 7;
                        i15 = 5;
                        i16 = 4;
                        break;
                    case 3:
                        textResource15 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource15);
                        i17 |= 8;
                        i14 = 7;
                        i15 = 5;
                        i16 = 4;
                        break;
                    case 4:
                        list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list6);
                        i17 |= 16;
                        i14 = 7;
                        i15 = 5;
                        break;
                    case 5:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), list5);
                        i17 |= 32;
                        i15 = i18;
                        i14 = 7;
                        break;
                    case 6:
                        textResource13 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, C25452a.f99689a, textResource13);
                        i17 |= 64;
                        i15 = i18;
                        break;
                    case 7:
                        textResource14 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, C25452a.f99689a, textResource14);
                        i17 |= 128;
                        i15 = i18;
                        break;
                    case 8:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i17 |= 256;
                        i15 = i18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            textResource = textResource13;
            list = list5;
            textResource2 = textResource14;
            list2 = list6;
            textResource3 = textResource15;
            textResource4 = textResource7;
            textResource5 = textResource16;
            textResource6 = textResource17;
            strDecodeStringElement = strDecodeStringElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ReturnResponse(i13, textResource4, textResource5, textResource6, textResource3, list2, list, textResource, textResource2, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ReturnResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ReturnResponse.write$Self$membership_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
