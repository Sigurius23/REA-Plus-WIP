package com.stripe.android.model;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p664yy.C39880t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/stripe/android/model/ConsentUi.ConsentPane.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/model/ConsentUi$ConsentPane;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/stripe/android/model/ConsentUi$ConsentPane;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/stripe/android/model/ConsentUi$ConsentPane;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC23457c
public /* synthetic */ class ConsentUi$ConsentPane$$serializer implements GeneratedSerializer<ConsentUi.ConsentPane> {
    public static final ConsentUi$ConsentPane$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ConsentUi$ConsentPane$$serializer consentUi$ConsentPane$$serializer = new ConsentUi$ConsentPane$$serializer();
        INSTANCE = consentUi$ConsentPane$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.model.ConsentUi.ConsentPane", consentUi$ConsentPane$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("scopes_section", false);
        pluginGeneratedSerialDescriptor.addElement("disclaimer", false);
        pluginGeneratedSerialDescriptor.addElement("deny_button_label", false);
        pluginGeneratedSerialDescriptor.addElement("allow_button_label", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConsentUi$ConsentPane$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, ConsentUi$ConsentPane$ScopesSection$$serializer.INSTANCE, AbstractC38195a.m122336d(C39880t.f172196a), AbstractC38195a.m122336d(stringSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ConsentUi.ConsentPane deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        ConsentUi.ConsentPane.ScopesSection scopesSection;
        String str2;
        String str3;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        String strDecodeStringElement2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            ConsentUi.ConsentPane.ScopesSection scopesSection2 = (ConsentUi.ConsentPane.ScopesSection) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, ConsentUi$ConsentPane$ScopesSection$$serializer.INSTANCE, null);
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, C39880t.f172196a, null);
            str = strDecodeStringElement3;
            str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, null);
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            str2 = str4;
            scopesSection = scopesSection2;
            i13 = 31;
        } else {
            boolean z4 = true;
            int i14 = 0;
            ConsentUi.ConsentPane.ScopesSection scopesSection3 = null;
            String str5 = null;
            String str6 = null;
            String strDecodeStringElement4 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    scopesSection3 = (ConsentUi.ConsentPane.ScopesSection) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, ConsentUi$ConsentPane$ScopesSection$$serializer.INSTANCE, scopesSection3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, C39880t.f172196a, str5);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str6);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                    i14 |= 16;
                }
            }
            i13 = i14;
            str = strDecodeStringElement2;
            scopesSection = scopesSection3;
            str2 = str5;
            str3 = str6;
            strDecodeStringElement = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ConsentUi.ConsentPane(i13, str, scopesSection, str2, str3, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ConsentUi.ConsentPane value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ConsentUi.ConsentPane.write$Self$payments_model_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }
}
