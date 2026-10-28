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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/stripe/android/model/ConsentUi.ConsentPane.ScopesSection.Scope.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC23457c
public /* synthetic */ class ConsentUi$ConsentPane$ScopesSection$Scope$$serializer implements GeneratedSerializer<ConsentUi.ConsentPane.ScopesSection.Scope> {
    public static final ConsentUi$ConsentPane$ScopesSection$Scope$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ConsentUi$ConsentPane$ScopesSection$Scope$$serializer consentUi$ConsentPane$ScopesSection$Scope$$serializer = new ConsentUi$ConsentPane$ScopesSection$Scope$$serializer();
        INSTANCE = consentUi$ConsentPane$ScopesSection$Scope$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.model.ConsentUi.ConsentPane.ScopesSection.Scope", consentUi$ConsentPane$ScopesSection$Scope$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("header", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConsentUi$ConsentPane$ScopesSection$Scope$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{ConsentUi$Icon$$serializer.INSTANCE, AbstractC38195a.m122336d(StringSerializer.INSTANCE), C39880t.f172196a};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ConsentUi.ConsentPane.ScopesSection.Scope deserialize(InterfaceC40541d decoder) {
        int i13;
        ConsentUi.Icon icon;
        String str;
        String str2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        ConsentUi.Icon icon2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            ConsentUi.Icon icon3 = (ConsentUi.Icon) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, ConsentUi$Icon$$serializer.INSTANCE, null);
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, null);
            icon = icon3;
            str2 = (String) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C39880t.f172196a, null);
            str = str3;
            i13 = 7;
        } else {
            boolean z4 = true;
            int i14 = 0;
            String str4 = null;
            String str5 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    icon2 = (ConsentUi.Icon) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, ConsentUi$Icon$$serializer.INSTANCE, icon2);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str4);
                    i14 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str5 = (String) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C39880t.f172196a, str5);
                    i14 |= 4;
                }
            }
            i13 = i14;
            icon = icon2;
            str = str4;
            str2 = str5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ConsentUi.ConsentPane.ScopesSection.Scope(i13, icon, str, str2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ConsentUi.ConsentPane.ScopesSection.Scope value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ConsentUi.ConsentPane.ScopesSection.Scope.write$Self$payments_model_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }
}
