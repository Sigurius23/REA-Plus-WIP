package com.whoop.navigation.models;

import ad3.C0771n;
import androidx.core.app.NotificationCompat;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/navigation/models/GenericInteraction.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/navigation/models/GenericInteraction;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/navigation/models/GenericInteraction;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/navigation/models/GenericInteraction;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class GenericInteraction$$serializer implements GeneratedSerializer<GenericInteraction> {
    public static final int $stable;
    public static final GenericInteraction$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        GenericInteraction$$serializer genericInteraction$$serializer = new GenericInteraction$$serializer();
        INSTANCE = genericInteraction$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.navigation.models.GenericInteraction", genericInteraction$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_NAVIGATION, true);
        pluginGeneratedSerialDescriptor.addElement("modal", true);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("dismissEvent", true);
        pluginGeneratedSerialDescriptor.addElement("analyticEvent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GenericInteraction$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        C0771n c0771n = C0771n.f2806a;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(c0771n), AbstractC38195a.m122336d(c0771n), AbstractC38195a.m122336d(c0771n), AbstractC38195a.m122336d(c0771n), AbstractC38195a.m122336d(c0771n)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final GenericInteraction deserialize(InterfaceC40541d decoder) {
        int i13;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
        JsonElement jsonElement5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        JsonElement jsonElement6 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C0771n c0771n = C0771n.f2806a;
            JsonElement jsonElement7 = (JsonElement) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, c0771n, null);
            JsonElement jsonElement8 = (JsonElement) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, c0771n, null);
            JsonElement jsonElement9 = (JsonElement) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, c0771n, null);
            JsonElement jsonElement10 = (JsonElement) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, c0771n, null);
            jsonElement5 = (JsonElement) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, c0771n, null);
            jsonElement4 = jsonElement10;
            i13 = 31;
            jsonElement3 = jsonElement9;
            jsonElement2 = jsonElement8;
            jsonElement = jsonElement7;
        } else {
            boolean z4 = true;
            int i14 = 0;
            JsonElement jsonElement11 = null;
            JsonElement jsonElement12 = null;
            JsonElement jsonElement13 = null;
            JsonElement jsonElement14 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    jsonElement6 = (JsonElement) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, C0771n.f2806a, jsonElement6);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jsonElement11 = (JsonElement) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, C0771n.f2806a, jsonElement11);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    jsonElement12 = (JsonElement) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, C0771n.f2806a, jsonElement12);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    jsonElement13 = (JsonElement) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, C0771n.f2806a, jsonElement13);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jsonElement14 = (JsonElement) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, C0771n.f2806a, jsonElement14);
                    i14 |= 16;
                }
            }
            i13 = i14;
            jsonElement = jsonElement6;
            jsonElement2 = jsonElement11;
            jsonElement3 = jsonElement12;
            jsonElement4 = jsonElement13;
            jsonElement5 = jsonElement14;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new GenericInteraction(i13, jsonElement, jsonElement2, jsonElement3, jsonElement4, jsonElement5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, GenericInteraction value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        GenericInteraction.write$Self$navigation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
