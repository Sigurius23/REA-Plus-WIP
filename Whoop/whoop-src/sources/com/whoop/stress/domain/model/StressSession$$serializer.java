package com.whoop.stress.domain.model;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/stress/domain/model/StressSession.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/stress/domain/model/StressSession;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/stress/domain/model/StressSession;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/stress/domain/model/StressSession;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class StressSession$$serializer implements GeneratedSerializer<StressSession> {
    public static final int $stable;
    public static final StressSession$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        StressSession$$serializer stressSession$$serializer = new StressSession$$serializer();
        INSTANCE = stressSession$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.stress.domain.model.StressSession", stressSession$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("background_image_url", false);
        pluginGeneratedSerialDescriptor.addElement("navigation_title_display", false);
        pluginGeneratedSerialDescriptor.addElement("title_display", false);
        pluginGeneratedSerialDescriptor.addElement("description_display", false);
        pluginGeneratedSerialDescriptor.addElement(AttachmentExtensionsKt.EXTRA_DURATION, false);
        pluginGeneratedSerialDescriptor.addElement("instruction", false);
        pluginGeneratedSerialDescriptor.addElement("button_display", false);
        pluginGeneratedSerialDescriptor.addElement("intervention", false);
        pluginGeneratedSerialDescriptor.addElement("customization", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StressSession$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StressDuration$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(StressCustomization$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, interfaceC37138cM122336d, StressInstruction$$serializer.INSTANCE, stringSerializer, StressIntervention$$serializer.INSTANCE, interfaceC37138cM122336d2};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final StressSession deserialize(InterfaceC40541d decoder) {
        int i13;
        StressCustomization stressCustomization;
        StressIntervention stressIntervention;
        StressInstruction stressInstruction;
        StressDuration stressDuration;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 7;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            StressDuration stressDuration2 = (StressDuration) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StressDuration$$serializer.INSTANCE, null);
            StressInstruction stressInstruction2 = (StressInstruction) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, StressInstruction$$serializer.INSTANCE, null);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            str = strDecodeStringElement2;
            stressIntervention = (StressIntervention) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, StressIntervention$$serializer.INSTANCE, null);
            str5 = strDecodeStringElement6;
            stressInstruction = stressInstruction2;
            str4 = strDecodeStringElement5;
            stressCustomization = (StressCustomization) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StressCustomization$$serializer.INSTANCE, null);
            stressDuration = stressDuration2;
            str3 = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            i13 = 511;
        } else {
            boolean z4 = true;
            int i15 = 0;
            StressCustomization stressCustomization2 = null;
            StressIntervention stressIntervention2 = null;
            StressInstruction stressInstruction3 = null;
            StressDuration stressDuration3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        i15 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 7;
                        break;
                    case 1:
                        i15 |= 2;
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 = 7;
                        break;
                    case 2:
                        i15 |= 4;
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i14 = 7;
                        break;
                    case 3:
                        c3 = 4;
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i15 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        c3 = 4;
                        stressDuration3 = (StressDuration) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StressDuration$$serializer.INSTANCE, stressDuration3);
                        i15 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        stressInstruction3 = (StressInstruction) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, StressInstruction$$serializer.INSTANCE, stressInstruction3);
                        i15 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        stressIntervention2 = (StressIntervention) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, StressIntervention$$serializer.INSTANCE, stressIntervention2);
                        i15 |= 128;
                        break;
                    case 8:
                        stressCustomization2 = (StressCustomization) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StressCustomization$$serializer.INSTANCE, stressCustomization2);
                        i15 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            stressCustomization = stressCustomization2;
            stressIntervention = stressIntervention2;
            stressInstruction = stressInstruction3;
            stressDuration = stressDuration3;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement9;
            str5 = strDecodeStringElement10;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new StressSession(i13, str, str2, str3, str4, stressDuration, stressInstruction, str5, stressIntervention, stressCustomization, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, StressSession value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        StressSession.write$Self$stress_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
