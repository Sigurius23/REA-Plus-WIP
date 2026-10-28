package com.whoop.whoopaction.domain.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ActionSequenceFullScreenBehavior$$serializer implements GeneratedSerializer<ActionSequenceFullScreenBehavior> {
    public static final int $stable;
    public static final ActionSequenceFullScreenBehavior$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ActionSequenceFullScreenBehavior$$serializer actionSequenceFullScreenBehavior$$serializer = new ActionSequenceFullScreenBehavior$$serializer();
        INSTANCE = actionSequenceFullScreenBehavior$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.whoopaction.domain.models.ActionSequenceFullScreenBehavior", actionSequenceFullScreenBehavior$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("showLoading", true);
        pluginGeneratedSerialDescriptor.addElement("loadingTreatment", false);
        pluginGeneratedSerialDescriptor.addElement("showSaving", true);
        pluginGeneratedSerialDescriptor.addElement("showSuccess", true);
        pluginGeneratedSerialDescriptor.addElement("showError", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActionSequenceFullScreenBehavior$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LoadingTreatment$$serializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{booleanSerializer, interfaceC37138cM122336d, booleanSerializer, booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ActionSequenceFullScreenBehavior deserialize(InterfaceC40541d decoder) {
        boolean zDecodeBooleanElement;
        boolean zDecodeBooleanElement2;
        boolean zDecodeBooleanElement3;
        boolean z4;
        int i13;
        LoadingTreatment loadingTreatment;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
            LoadingTreatment loadingTreatment2 = (LoadingTreatment) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, LoadingTreatment$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
            zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
            zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
            z4 = zDecodeBooleanElement4;
            loadingTreatment = loadingTreatment2;
            i13 = 31;
        } else {
            boolean z13 = true;
            zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            int i14 = 0;
            LoadingTreatment loadingTreatment3 = null;
            boolean zDecodeBooleanElement7 = false;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z13 = false;
                } else if (iDecodeElementIndex == 0) {
                    zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    loadingTreatment3 = (LoadingTreatment) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, LoadingTreatment$$serializer.INSTANCE, loadingTreatment3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    zDecodeBooleanElement6 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    zDecodeBooleanElement7 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement5 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
                    i14 |= 16;
                }
            }
            zDecodeBooleanElement2 = zDecodeBooleanElement7;
            zDecodeBooleanElement3 = zDecodeBooleanElement5;
            z4 = zDecodeBooleanElement6;
            i13 = i14;
            loadingTreatment = loadingTreatment3;
        }
        boolean z14 = zDecodeBooleanElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ActionSequenceFullScreenBehavior(i13, z14, loadingTreatment, z4, zDecodeBooleanElement2, zDecodeBooleanElement3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ActionSequenceFullScreenBehavior value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ActionSequenceFullScreenBehavior.write$Self$whoop_action_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
