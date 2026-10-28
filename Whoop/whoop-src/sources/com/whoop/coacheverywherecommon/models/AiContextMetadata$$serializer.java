package com.whoop.coacheverywherecommon.models;

import com.whoop.navigation.AiAction;
import com.whoop.navigation.AiAction$$serializer;
import com.whoop.navigation.C9598e;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/coacheverywherecommon/models/AiContextMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class AiContextMetadata$$serializer implements GeneratedSerializer<AiContextMetadata> {
    public static final int $stable;
    public static final AiContextMetadata$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        AiContextMetadata$$serializer aiContextMetadata$$serializer = new AiContextMetadata$$serializer();
        INSTANCE = aiContextMetadata$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.coacheverywherecommon.models.AiContextMetadata", aiContextMetadata$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("is_wce_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("is_wce_prefetch", true);
        pluginGeneratedSerialDescriptor.addElement("destination", true);
        pluginGeneratedSerialDescriptor.addElement("onboarding_education", true);
        pluginGeneratedSerialDescriptor.addElement("screen_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("ai_action", true);
        pluginGeneratedSerialDescriptor.addElement("coachEntry", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AiContextMetadata$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = AiContextMetadata.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{booleanSerializer, AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[3].getValue()), StringSerializer.INSTANCE, AbstractC38195a.m122336d(AiAction$$serializer.INSTANCE), AbstractC38195a.m122336d(CoachEntry$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final AiContextMetadata deserialize(InterfaceC40541d decoder) {
        boolean zDecodeBooleanElement;
        CoachEntry coachEntry;
        AiAction aiAction;
        int i13;
        Boolean bool;
        C9598e c9598e;
        CoachEducationType coachEducationType;
        String str;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = AiContextMetadata.$childSerializers;
        int i14 = 6;
        int i15 = 2;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, BooleanSerializer.INSTANCE, null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            CoachEducationType coachEducationType2 = (CoachEducationType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            AiAction aiAction2 = (AiAction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, AiAction$$serializer.INSTANCE, null);
            coachEducationType = coachEducationType2;
            coachEntry = (CoachEntry) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, CoachEntry$$serializer.INSTANCE, null);
            aiAction = aiAction2;
            str = strDecodeStringElement;
            i13 = 127;
            c9598e = c9598e2;
            bool = bool2;
        } else {
            boolean z4 = true;
            zDecodeBooleanElement = false;
            CoachEntry coachEntry2 = null;
            Boolean bool3 = null;
            C9598e c9598e3 = null;
            CoachEducationType coachEducationType3 = null;
            String strDecodeStringElement2 = null;
            int i16 = 0;
            AiAction aiAction3 = null;
            while (z4) {
                int i17 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 2;
                        break;
                    case 0:
                        zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i14 = 6;
                        i15 = 2;
                        break;
                    case 1:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, BooleanSerializer.INSTANCE, bool3);
                        i16 |= 2;
                        i14 = 6;
                        i15 = 2;
                        break;
                    case 2:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), c9598e3);
                        i16 |= 4;
                        i15 = i17;
                        i14 = 6;
                        break;
                    case 3:
                        coachEducationType3 = (CoachEducationType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), coachEducationType3);
                        i16 |= 8;
                        i15 = i17;
                        break;
                    case 4:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i16 |= 16;
                        i15 = i17;
                        break;
                    case 5:
                        aiAction3 = (AiAction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, AiAction$$serializer.INSTANCE, aiAction3);
                        i16 |= 32;
                        i15 = i17;
                        break;
                    case 6:
                        coachEntry2 = (CoachEntry) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, CoachEntry$$serializer.INSTANCE, coachEntry2);
                        i16 |= 64;
                        i15 = i17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            coachEntry = coachEntry2;
            aiAction = aiAction3;
            i13 = i16;
            bool = bool3;
            c9598e = c9598e3;
            coachEducationType = coachEducationType3;
            str = strDecodeStringElement2;
        }
        boolean z13 = zDecodeBooleanElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new AiContextMetadata(i13, z13, bool, c9598e, coachEducationType, str, aiAction, coachEntry, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, AiContextMetadata value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        AiContextMetadata.write$Self$coach_everywhere_common_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
