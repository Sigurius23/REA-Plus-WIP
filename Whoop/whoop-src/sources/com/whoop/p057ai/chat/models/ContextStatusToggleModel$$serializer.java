package com.whoop.p057ai.chat.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/ai/chat/models/ContextStatusToggleModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/ai/chat/models/ContextStatusToggleModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/ai/chat/models/ContextStatusToggleModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/ai/chat/models/ContextStatusToggleModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ContextStatusToggleModel$$serializer implements GeneratedSerializer<ContextStatusToggleModel> {
    public static final int $stable;
    public static final ContextStatusToggleModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ContextStatusToggleModel$$serializer contextStatusToggleModel$$serializer = new ContextStatusToggleModel$$serializer();
        INSTANCE = contextStatusToggleModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.ai.chat.models.ContextStatusToggleModel", contextStatusToggleModel$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("currentState", false);
        pluginGeneratedSerialDescriptor.addElement("activeState", false);
        pluginGeneratedSerialDescriptor.addElement("inactiveState", false);
        pluginGeneratedSerialDescriptor.addElement("errorState", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ContextStatusToggleModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        ContextStatusToggleStateModel$$serializer contextStatusToggleStateModel$$serializer = ContextStatusToggleStateModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, contextStatusToggleStateModel$$serializer, contextStatusToggleStateModel$$serializer, ContextStatusToggleErrorStateModel$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ContextStatusToggleModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        String str2;
        ContextStatusToggleStateModel contextStatusToggleStateModel;
        ContextStatusToggleStateModel contextStatusToggleStateModel2;
        ContextStatusToggleErrorStateModel contextStatusToggleErrorStateModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            ContextStatusToggleStateModel$$serializer contextStatusToggleStateModel$$serializer = ContextStatusToggleStateModel$$serializer.INSTANCE;
            ContextStatusToggleStateModel contextStatusToggleStateModel3 = (ContextStatusToggleStateModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, contextStatusToggleStateModel$$serializer, null);
            str = strDecodeStringElement2;
            contextStatusToggleStateModel2 = (ContextStatusToggleStateModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, contextStatusToggleStateModel$$serializer, null);
            contextStatusToggleErrorStateModel = (ContextStatusToggleErrorStateModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, ContextStatusToggleErrorStateModel$$serializer.INSTANCE, null);
            contextStatusToggleStateModel = contextStatusToggleStateModel3;
            str2 = strDecodeStringElement3;
            i13 = 31;
        } else {
            boolean z4 = true;
            int i14 = 0;
            String strDecodeStringElement4 = null;
            ContextStatusToggleStateModel contextStatusToggleStateModel4 = null;
            ContextStatusToggleStateModel contextStatusToggleStateModel5 = null;
            ContextStatusToggleErrorStateModel contextStatusToggleErrorStateModel2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    contextStatusToggleStateModel4 = (ContextStatusToggleStateModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, ContextStatusToggleStateModel$$serializer.INSTANCE, contextStatusToggleStateModel4);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    contextStatusToggleStateModel5 = (ContextStatusToggleStateModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, ContextStatusToggleStateModel$$serializer.INSTANCE, contextStatusToggleStateModel5);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    contextStatusToggleErrorStateModel2 = (ContextStatusToggleErrorStateModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, ContextStatusToggleErrorStateModel$$serializer.INSTANCE, contextStatusToggleErrorStateModel2);
                    i14 |= 16;
                }
            }
            i13 = i14;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement4;
            contextStatusToggleStateModel = contextStatusToggleStateModel4;
            contextStatusToggleStateModel2 = contextStatusToggleStateModel5;
            contextStatusToggleErrorStateModel = contextStatusToggleErrorStateModel2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ContextStatusToggleModel(i13, str, str2, contextStatusToggleStateModel, contextStatusToggleStateModel2, contextStatusToggleErrorStateModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ContextStatusToggleModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ContextStatusToggleModel.write$Self$bot_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
