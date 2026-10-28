package com.whoop.stress.domain.model;

import com.google.gson.JsonObject;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import o91.C27689f;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/stress/domain/model/StressIntervention.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/stress/domain/model/StressIntervention;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/stress/domain/model/StressIntervention;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/stress/domain/model/StressIntervention;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class StressIntervention$$serializer implements GeneratedSerializer<StressIntervention> {
    public static final int $stable;
    public static final StressIntervention$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        StressIntervention$$serializer stressIntervention$$serializer = new StressIntervention$$serializer();
        INSTANCE = stressIntervention$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.stress.domain.model.StressIntervention", stressIntervention$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("animation", false);
        pluginGeneratedSerialDescriptor.addElement("repeat_count", false);
        pluginGeneratedSerialDescriptor.addElement("title_display", false);
        pluginGeneratedSerialDescriptor.addElement("button_display", false);
        pluginGeneratedSerialDescriptor.addElement("session_done_display", false);
        pluginGeneratedSerialDescriptor.addElement("finish_dialogue", false);
        pluginGeneratedSerialDescriptor.addElement("intro_screen", false);
        pluginGeneratedSerialDescriptor.addElement("frames", false);
        pluginGeneratedSerialDescriptor.addElement("holding_frame", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StressIntervention$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = StressIntervention.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{C27689f.f111463a, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, StressInterventionFinishDialog$$serializer.INSTANCE, AbstractC38195a.m122336d(DisclaimerScreen$$serializer.INSTANCE), interfaceC23462hArr[7].getValue(), AbstractC38195a.m122336d(HoldingFrame$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final StressIntervention deserialize(InterfaceC40541d decoder) {
        int i13;
        HoldingFrame holdingFrame;
        List list;
        DisclaimerScreen disclaimerScreen;
        StressInterventionFinishDialog stressInterventionFinishDialog;
        int i14;
        JsonObject jsonObject;
        String str;
        String str2;
        String str3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = StressIntervention.$childSerializers;
        int i15 = 6;
        int i16 = 5;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            JsonObject jsonObject2 = (JsonObject) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C27689f.f111463a, null);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            StressInterventionFinishDialog stressInterventionFinishDialog2 = (StressInterventionFinishDialog) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, StressInterventionFinishDialog$$serializer.INSTANCE, null);
            DisclaimerScreen disclaimerScreen2 = (DisclaimerScreen) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, DisclaimerScreen$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            jsonObject = jsonObject2;
            disclaimerScreen = disclaimerScreen2;
            stressInterventionFinishDialog = stressInterventionFinishDialog2;
            str2 = strDecodeStringElement2;
            holdingFrame = (HoldingFrame) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, HoldingFrame$$serializer.INSTANCE, null);
            str3 = strDecodeStringElement3;
            str = strDecodeStringElement;
            i13 = 511;
            i14 = iDecodeIntElement;
        } else {
            boolean z4 = true;
            int i17 = 0;
            HoldingFrame holdingFrame2 = null;
            List list2 = null;
            DisclaimerScreen disclaimerScreen3 = null;
            JsonObject jsonObject3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int iDecodeIntElement2 = 0;
            StressInterventionFinishDialog stressInterventionFinishDialog3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i16 = 5;
                        break;
                    case 0:
                        jsonObject3 = (JsonObject) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C27689f.f111463a, jsonObject3);
                        i17 |= 1;
                        i15 = 6;
                        i16 = 5;
                        break;
                    case 1:
                        i17 |= 2;
                        iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
                        i15 = 6;
                        break;
                    case 2:
                        i17 |= 4;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i15 = 6;
                        break;
                    case 3:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i17 |= 8;
                        i15 = 6;
                        break;
                    case 4:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i17 |= 16;
                        break;
                    case 5:
                        stressInterventionFinishDialog3 = (StressInterventionFinishDialog) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, StressInterventionFinishDialog$$serializer.INSTANCE, stressInterventionFinishDialog3);
                        i17 |= 32;
                        break;
                    case 6:
                        disclaimerScreen3 = (DisclaimerScreen) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, DisclaimerScreen$$serializer.INSTANCE, disclaimerScreen3);
                        i17 |= 64;
                        break;
                    case 7:
                        list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), list2);
                        i17 |= 128;
                        break;
                    case 8:
                        holdingFrame2 = (HoldingFrame) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, HoldingFrame$$serializer.INSTANCE, holdingFrame2);
                        i17 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            holdingFrame = holdingFrame2;
            list = list2;
            disclaimerScreen = disclaimerScreen3;
            stressInterventionFinishDialog = stressInterventionFinishDialog3;
            i14 = iDecodeIntElement2;
            jsonObject = jsonObject3;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new StressIntervention(i13, jsonObject, i14, str, str2, str3, stressInterventionFinishDialog, disclaimerScreen, list, holdingFrame, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, StressIntervention value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        StressIntervention.write$Self$stress_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
