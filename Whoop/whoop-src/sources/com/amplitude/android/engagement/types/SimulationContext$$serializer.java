package com.amplitude.android.engagement.types;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import live.hms.video.media.tracks.HMSTrackSource;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"com/amplitude/android/engagement/types/SimulationContext.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/amplitude/android/engagement/types/SimulationContext;", "<init>", "()V", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/amplitude/android/engagement/types/SimulationContext;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/amplitude/android/engagement/types/SimulationContext;)V", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC23457c
public final class SimulationContext$$serializer implements GeneratedSerializer<SimulationContext> {
    public static final int $stable = 0;
    public static final SimulationContext$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SimulationContext$$serializer simulationContext$$serializer = new SimulationContext$$serializer();
        INSTANCE = simulationContext$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplitude.android.engagement.types.SimulationContext", simulationContext$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("lastTriggerEvent", true);
        pluginGeneratedSerialDescriptor.addElement("simulatedNudge", false);
        pluginGeneratedSerialDescriptor.addElement("lastEvent", true);
        pluginGeneratedSerialDescriptor.addElement("currentStepIndex", false);
        pluginGeneratedSerialDescriptor.addElement("passesCooldown", false);
        pluginGeneratedSerialDescriptor.addElement("passesSnoozedConditions", false);
        pluginGeneratedSerialDescriptor.addElement("passesPageTargeting", false);
        pluginGeneratedSerialDescriptor.addElement("passesPinnedElement", false);
        pluginGeneratedSerialDescriptor.addElement("shouldTemporarilyHide", false);
        pluginGeneratedSerialDescriptor.addElement("passesTriggerMatch", false);
        pluginGeneratedSerialDescriptor.addElement("passesClickedElement", false);
        pluginGeneratedSerialDescriptor.addElement("isAnchorableStep", false);
        pluginGeneratedSerialDescriptor.addElement("passesCustomThrottles", false);
        pluginGeneratedSerialDescriptor.addElement("surveyThrottleLimit", true);
        pluginGeneratedSerialDescriptor.addElement("guideThrottleLimit", true);
        pluginGeneratedSerialDescriptor.addElement("bypassCustomThrottles", false);
        pluginGeneratedSerialDescriptor.addElement(HMSTrackSource.SCREEN, false);
        pluginGeneratedSerialDescriptor.addElement("endUser", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SimulationContext$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] childSerializers() {
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(TriggerEvent$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(LastEvent$$serializer.INSTANCE);
        ThrottleLimit$$serializer throttleLimit$$serializer = ThrottleLimit$$serializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(throttleLimit$$serializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(throttleLimit$$serializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, Nudge$$serializer.INSTANCE, interfaceC37138cM122336d2, IntSerializer.INSTANCE, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, interfaceC37138cM122336d3, interfaceC37138cM122336d4, booleanSerializer, StringSerializer.INSTANCE, EndUser$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public SimulationContext deserialize(InterfaceC40541d decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeSerializableElement;
        Object obj;
        boolean z4;
        Object obj2;
        int i13;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objDecodeNullableSerializableElement2;
        Object obj3;
        boolean zDecodeBooleanElement;
        int i14;
        String strDecodeStringElement;
        boolean z19;
        boolean z24;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(descriptor2);
        int i15 = 11;
        int i16 = 10;
        int i17 = 8;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            Object objDecodeNullableSerializableElement3 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 0, TriggerEvent$$serializer.INSTANCE, null);
            Object objDecodeSerializableElement2 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 1, Nudge$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement2 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 2, LastEvent$$serializer.INSTANCE, null);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(descriptor2, 3);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 4);
            boolean zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 5);
            boolean zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 6);
            boolean zDecodeBooleanElement5 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 7);
            boolean zDecodeBooleanElement6 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 8);
            boolean zDecodeBooleanElement7 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 9);
            boolean zDecodeBooleanElement8 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 10);
            boolean zDecodeBooleanElement9 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 11);
            boolean zDecodeBooleanElement10 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 12);
            ThrottleLimit$$serializer throttleLimit$$serializer = ThrottleLimit$$serializer.INSTANCE;
            Object objDecodeNullableSerializableElement4 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 13, throttleLimit$$serializer, null);
            Object objDecodeNullableSerializableElement5 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 14, throttleLimit$$serializer, null);
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 15);
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 16);
            z13 = zDecodeBooleanElement9;
            z19 = zDecodeBooleanElement8;
            z14 = zDecodeBooleanElement7;
            z15 = zDecodeBooleanElement5;
            z16 = zDecodeBooleanElement4;
            z24 = zDecodeBooleanElement3;
            z17 = zDecodeBooleanElement2;
            z18 = zDecodeBooleanElement10;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement5;
            obj = objDecodeNullableSerializableElement4;
            z4 = zDecodeBooleanElement6;
            objDecodeSerializableElement = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 17, EndUser$$serializer.INSTANCE, null);
            i14 = iDecodeIntElement;
            obj3 = objDecodeNullableSerializableElement3;
            i13 = 262143;
            obj2 = objDecodeSerializableElement2;
        } else {
            int i18 = 0;
            int i19 = 17;
            boolean z25 = true;
            Object objDecodeNullableSerializableElement6 = null;
            Object objDecodeNullableSerializableElement7 = null;
            objDecodeNullableSerializableElement = null;
            objDecodeSerializableElement = null;
            Object objDecodeNullableSerializableElement8 = null;
            Object objDecodeSerializableElement3 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement11 = false;
            boolean zDecodeBooleanElement12 = false;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement13 = false;
            boolean zDecodeBooleanElement14 = false;
            boolean zDecodeBooleanElement15 = false;
            boolean zDecodeBooleanElement16 = false;
            boolean zDecodeBooleanElement17 = false;
            boolean zDecodeBooleanElement18 = false;
            boolean zDecodeBooleanElement19 = false;
            boolean zDecodeBooleanElement20 = false;
            while (z25) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z25 = false;
                        i19 = 17;
                        i15 = 11;
                        i16 = 10;
                        break;
                    case 0:
                        objDecodeNullableSerializableElement8 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 0, TriggerEvent$$serializer.INSTANCE, objDecodeNullableSerializableElement8);
                        i18 |= 1;
                        i17 = 8;
                        i19 = 17;
                        i15 = 11;
                        i16 = 10;
                        break;
                    case 1:
                        objDecodeSerializableElement3 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 1, Nudge$$serializer.INSTANCE, objDecodeSerializableElement3);
                        i18 |= 2;
                        i17 = 8;
                        i19 = 17;
                        i15 = 11;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement6 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 2, LastEvent$$serializer.INSTANCE, objDecodeNullableSerializableElement6);
                        i18 |= 4;
                        i17 = 8;
                        i19 = 17;
                        break;
                    case 3:
                        iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(descriptor2, 3);
                        i18 |= 8;
                        i17 = 8;
                        i19 = 17;
                        break;
                    case 4:
                        zDecodeBooleanElement19 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 4);
                        i18 |= 16;
                        i17 = 8;
                        i19 = 17;
                        break;
                    case 5:
                        zDecodeBooleanElement18 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 5);
                        i18 |= 32;
                        i17 = 8;
                        i19 = 17;
                        break;
                    case 6:
                        zDecodeBooleanElement17 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 6);
                        i18 |= 64;
                        i19 = 17;
                        break;
                    case 7:
                        zDecodeBooleanElement16 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 7);
                        i18 |= 128;
                        i19 = 17;
                        break;
                    case 8:
                        zDecodeBooleanElement11 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, i17);
                        i18 |= 256;
                        i19 = 17;
                        break;
                    case 9:
                        zDecodeBooleanElement15 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 9);
                        i18 |= 512;
                        i19 = 17;
                        break;
                    case 10:
                        zDecodeBooleanElement14 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, i16);
                        i18 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i19 = 17;
                        break;
                    case 11:
                        zDecodeBooleanElement13 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, i15);
                        i18 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i19 = 17;
                        break;
                    case 12:
                        zDecodeBooleanElement20 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 12);
                        i18 |= 4096;
                        i19 = 17;
                        break;
                    case 13:
                        objDecodeNullableSerializableElement7 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 13, ThrottleLimit$$serializer.INSTANCE, objDecodeNullableSerializableElement7);
                        i18 |= DfuBaseService.ERROR_REMOTE_MASK;
                        i19 = 17;
                        break;
                    case 14:
                        objDecodeNullableSerializableElement = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 14, ThrottleLimit$$serializer.INSTANCE, objDecodeNullableSerializableElement);
                        i18 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        i19 = 17;
                        break;
                    case 15:
                        zDecodeBooleanElement12 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 15);
                        i18 |= 32768;
                        i19 = 17;
                        break;
                    case 16:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 16);
                        i18 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        objDecodeSerializableElement = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, i19, EndUser$$serializer.INSTANCE, objDecodeSerializableElement);
                        i18 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj4 = objDecodeNullableSerializableElement8;
            obj = objDecodeNullableSerializableElement7;
            z4 = zDecodeBooleanElement11;
            obj2 = objDecodeSerializableElement3;
            i13 = i18;
            z13 = zDecodeBooleanElement13;
            z14 = zDecodeBooleanElement15;
            z15 = zDecodeBooleanElement16;
            z16 = zDecodeBooleanElement17;
            z17 = zDecodeBooleanElement19;
            z18 = zDecodeBooleanElement20;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement6;
            obj3 = obj4;
            zDecodeBooleanElement = zDecodeBooleanElement12;
            i14 = iDecodeIntElement2;
            strDecodeStringElement = strDecodeStringElement2;
            z19 = zDecodeBooleanElement14;
            z24 = zDecodeBooleanElement18;
        }
        interfaceC40539bBeginStructure.endStructure(descriptor2);
        return new SimulationContext(i13, (TriggerEvent) obj3, (Nudge) obj2, (LastEvent) objDecodeNullableSerializableElement2, i14, z17, z24, z16, z15, z4, z14, z19, z13, z18, (ThrottleLimit) obj, (ThrottleLimit) objDecodeNullableSerializableElement, zDecodeBooleanElement, strDecodeStringElement, (EndUser) objDecodeSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, SimulationContext value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(descriptor2);
        SimulationContext.write$Self(value, interfaceC40540cBeginStructure, descriptor2);
        interfaceC40540cBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
