package com.amplitude.android.engagement.types;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p305lj.C24451r0;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"com/amplitude/android/engagement/types/Nudge.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/amplitude/android/engagement/types/Nudge;", "<init>", "()V", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/amplitude/android/engagement/types/Nudge;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/amplitude/android/engagement/types/Nudge;)V", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC23457c
public final class Nudge$$serializer implements GeneratedSerializer<Nudge> {
    public static final int $stable = 0;
    public static final Nudge$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Nudge$$serializer nudge$$serializer = new Nudge$$serializer();
        INSTANCE = nudge$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplitude.android.engagement.types.Nudge", nudge$$serializer, 20);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("variantId", false);
        pluginGeneratedSerialDescriptor.addElement("steps", false);
        pluginGeneratedSerialDescriptor.addElement("flagKey", false);
        pluginGeneratedSerialDescriptor.addElement("archived", true);
        pluginGeneratedSerialDescriptor.addElement("position", true);
        pluginGeneratedSerialDescriptor.addElement("priority", true);
        pluginGeneratedSerialDescriptor.addElement("showStepCounter", false);
        pluginGeneratedSerialDescriptor.addElement("stepCounterFormat", true);
        pluginGeneratedSerialDescriptor.addElement("isCarousel", true);
        pluginGeneratedSerialDescriptor.addElement("isDismissible", false);
        pluginGeneratedSerialDescriptor.addElement("isSnoozable", false);
        pluginGeneratedSerialDescriptor.addElement("snoozeLabel", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("customThemeId", true);
        pluginGeneratedSerialDescriptor.addElement("variant", false);
        pluginGeneratedSerialDescriptor.addElement("lifecycleConfig", true);
        pluginGeneratedSerialDescriptor.addElement("triggerConfig", true);
        pluginGeneratedSerialDescriptor.addElement("pageTargeting", true);
        pluginGeneratedSerialDescriptor.addElement("temporarilyHideTargeting", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Nudge$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] childSerializers() {
        InterfaceC37138c[] interfaceC37138cArr = Nudge.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138c = interfaceC37138cArr[2];
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(booleanSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(interfaceC37138cArr[5]);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(intSerializer);
        InterfaceC37138c interfaceC37138c2 = interfaceC37138cArr[8];
        InterfaceC37138c interfaceC37138c3 = interfaceC37138cArr[13];
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(intSerializer);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(NudgeLifecycleConfig$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(C24451r0.f95330a);
        PageTargetingConfig$$serializer pageTargetingConfig$$serializer = PageTargetingConfig$$serializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d7 = AbstractC38195a.m122336d(pageTargetingConfig$$serializer);
        InterfaceC37138c interfaceC37138cM122336d8 = AbstractC38195a.m122336d(pageTargetingConfig$$serializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, intSerializer, interfaceC37138c, stringSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, booleanSerializer, interfaceC37138c2, booleanSerializer, booleanSerializer, booleanSerializer, stringSerializer, interfaceC37138c3, interfaceC37138cM122336d4, stringSerializer, interfaceC37138cM122336d5, interfaceC37138cM122336d6, interfaceC37138cM122336d7, interfaceC37138cM122336d8};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public Nudge deserialize(InterfaceC40541d decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object obj;
        int i13;
        Object objDecodeNullableSerializableElement3;
        String str;
        boolean z4;
        String str2;
        String str3;
        int i14;
        boolean z13;
        boolean z14;
        boolean z15;
        String str4;
        Object objDecodeSerializableElement;
        Object objDecodeNullableSerializableElement4;
        Object obj2;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeSerializableElement2;
        Object obj3;
        Object objDecodeNullableSerializableElement6;
        int i15;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(descriptor2);
        InterfaceC37138c[] interfaceC37138cArr = Nudge.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 0);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(descriptor2, 1);
            objDecodeSerializableElement2 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 2, interfaceC37138cArr[2], null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 3);
            objDecodeNullableSerializableElement4 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, BooleanSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement5 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 5, interfaceC37138cArr[5], null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement6 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 6, intSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 7);
            objDecodeSerializableElement = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 8, interfaceC37138cArr[8], null);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 9);
            boolean zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 10);
            boolean zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 11);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 12);
            Object objDecodeSerializableElement3 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 13, interfaceC37138cArr[13], null);
            Object objDecodeNullableSerializableElement7 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 14, intSerializer, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 15);
            objDecodeNullableSerializableElement3 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 16, NudgeLifecycleConfig$$serializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement8 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 17, C24451r0.f95330a, null);
            PageTargetingConfig$$serializer pageTargetingConfig$$serializer = PageTargetingConfig$$serializer.INSTANCE;
            obj = objDecodeNullableSerializableElement8;
            i13 = 1048575;
            z4 = zDecodeBooleanElement4;
            z13 = zDecodeBooleanElement2;
            z14 = zDecodeBooleanElement3;
            z15 = zDecodeBooleanElement;
            str3 = strDecodeStringElement4;
            i14 = iDecodeIntElement;
            str = strDecodeStringElement2;
            str4 = strDecodeStringElement;
            str2 = strDecodeStringElement3;
            objDecodeNullableSerializableElement2 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 18, pageTargetingConfig$$serializer, null);
            objDecodeNullableSerializableElement = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 19, pageTargetingConfig$$serializer, null);
            obj2 = objDecodeSerializableElement3;
            obj3 = objDecodeNullableSerializableElement7;
        } else {
            boolean z16 = true;
            boolean zDecodeBooleanElement5 = false;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            int i16 = 5;
            int i17 = 8;
            Object objDecodeNullableSerializableElement9 = null;
            Object objDecodeSerializableElement4 = null;
            Object objDecodeSerializableElement5 = null;
            Object objDecodeNullableSerializableElement10 = null;
            Object objDecodeNullableSerializableElement11 = null;
            objDecodeNullableSerializableElement = null;
            String strDecodeStringElement5 = null;
            objDecodeNullableSerializableElement2 = null;
            Object objDecodeNullableSerializableElement12 = null;
            Object objDecodeNullableSerializableElement13 = null;
            Object objDecodeNullableSerializableElement14 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int i18 = 0;
            Object objDecodeSerializableElement6 = null;
            while (z16) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z16 = false;
                        i16 = 5;
                        i17 = 8;
                        break;
                    case 0:
                        i18 |= 1;
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 0);
                        i16 = 5;
                        i17 = 8;
                        break;
                    case 1:
                        iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(descriptor2, 1);
                        i18 |= 2;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        i16 = 5;
                        i17 = 8;
                        break;
                    case 2:
                        objDecodeSerializableElement6 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 2, interfaceC37138cArr[2], objDecodeSerializableElement6);
                        i18 |= 4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        i16 = 5;
                        i17 = 8;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 3);
                        i18 |= 8;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        i16 = 5;
                        i17 = 8;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement9 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement9);
                        i18 |= 16;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        i16 = 5;
                        i17 = 8;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement11 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, i16, interfaceC37138cArr[i16], objDecodeNullableSerializableElement11);
                        i18 |= 32;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        i17 = 8;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement14 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 6, IntSerializer.INSTANCE, objDecodeNullableSerializableElement14);
                        i18 |= 64;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        i17 = 8;
                        break;
                    case 7:
                        strDecodeStringElement5 = strDecodeStringElement5;
                        zDecodeBooleanElement8 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 7);
                        i18 |= 128;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        break;
                    case 8:
                        strDecodeStringElement5 = strDecodeStringElement5;
                        objDecodeSerializableElement5 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, i17, interfaceC37138cArr[i17], objDecodeSerializableElement5);
                        i18 |= 256;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        break;
                    case 9:
                        strDecodeStringElement5 = strDecodeStringElement5;
                        zDecodeBooleanElement6 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 9);
                        i18 |= 512;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        break;
                    case 10:
                        strDecodeStringElement5 = strDecodeStringElement5;
                        zDecodeBooleanElement7 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 10);
                        i18 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        break;
                    case 11:
                        strDecodeStringElement5 = strDecodeStringElement5;
                        zDecodeBooleanElement5 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 11);
                        i18 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        break;
                    case 12:
                        strDecodeStringElement5 = strDecodeStringElement5;
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 12);
                        i18 |= 4096;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        break;
                    case 13:
                        strDecodeStringElement5 = strDecodeStringElement5;
                        objDecodeSerializableElement4 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 13, interfaceC37138cArr[13], objDecodeSerializableElement4);
                        i18 |= DfuBaseService.ERROR_REMOTE_MASK;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        break;
                    case 14:
                        strDecodeStringElement5 = strDecodeStringElement5;
                        objDecodeNullableSerializableElement13 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 14, IntSerializer.INSTANCE, objDecodeNullableSerializableElement13);
                        i18 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        break;
                    case 15:
                        strDecodeStringElement5 = strDecodeStringElement5;
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 15);
                        i18 |= 32768;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        break;
                    case 16:
                        objDecodeNullableSerializableElement12 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 16, NudgeLifecycleConfig$$serializer.INSTANCE, objDecodeNullableSerializableElement12);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i18 |= i15;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        objDecodeNullableSerializableElement10 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 17, C24451r0.f95330a, objDecodeNullableSerializableElement10);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i18 |= i15;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        objDecodeNullableSerializableElement2 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 18, PageTargetingConfig$$serializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        i18 |= i15;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        objDecodeNullableSerializableElement = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 19, PageTargetingConfig$$serializer.INSTANCE, objDecodeNullableSerializableElement);
                        i18 |= 524288;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            obj = objDecodeNullableSerializableElement10;
            i13 = i18;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement12;
            str = strDecodeStringElement6;
            z4 = zDecodeBooleanElement5;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            i14 = iDecodeIntElement2;
            z13 = zDecodeBooleanElement6;
            z14 = zDecodeBooleanElement7;
            z15 = zDecodeBooleanElement8;
            str4 = strDecodeStringElement5;
            objDecodeSerializableElement = objDecodeSerializableElement5;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement9;
            obj2 = objDecodeSerializableElement4;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement11;
            objDecodeSerializableElement2 = objDecodeSerializableElement6;
            obj3 = objDecodeNullableSerializableElement13;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement14;
        }
        interfaceC40539bBeginStructure.endStructure(descriptor2);
        return new Nudge(i13, str4, i14, (List) objDecodeSerializableElement2, str, (Boolean) objDecodeNullableSerializableElement4, (NudgePosition) objDecodeNullableSerializableElement5, (Integer) objDecodeNullableSerializableElement6, z15, (StepCounterFormat) objDecodeSerializableElement, z13, z14, z4, str2, (NudgeType) obj2, (Integer) obj3, str3, (NudgeLifecycleConfig) objDecodeNullableSerializableElement3, (TriggerConfig) obj, (PageTargetingConfig) objDecodeNullableSerializableElement2, (PageTargetingConfig) objDecodeNullableSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, Nudge value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(descriptor2);
        Nudge.write$Self(value, interfaceC40540cBeginStructure, descriptor2);
        interfaceC40540cBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
