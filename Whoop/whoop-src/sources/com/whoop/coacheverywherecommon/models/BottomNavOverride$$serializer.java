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

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/coacheverywherecommon/models/BottomNavOverride.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class BottomNavOverride$$serializer implements GeneratedSerializer<BottomNavOverride> {
    public static final int $stable;
    public static final BottomNavOverride$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        BottomNavOverride$$serializer bottomNavOverride$$serializer = new BottomNavOverride$$serializer();
        INSTANCE = bottomNavOverride$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.coacheverywherecommon.models.BottomNavOverride", bottomNavOverride$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        pluginGeneratedSerialDescriptor.addElement("aiAction", true);
        pluginGeneratedSerialDescriptor.addElement("coachEntry", true);
        pluginGeneratedSerialDescriptor.addElement("isWcePrefetch", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BottomNavOverride$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{StringSerializer.INSTANCE, AbstractC38195a.m122336d((InterfaceC37138c) BottomNavOverride.$childSerializers[1].getValue()), AbstractC38195a.m122336d(AiAction$$serializer.INSTANCE), AbstractC38195a.m122336d(CoachEntry$$serializer.INSTANCE), AbstractC38195a.m122336d(BooleanSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final BottomNavOverride deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        C9598e c9598e;
        AiAction aiAction;
        CoachEntry coachEntry;
        Boolean bool;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = BottomNavOverride.$childSerializers;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            AiAction aiAction2 = (AiAction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, AiAction$$serializer.INSTANCE, null);
            c9598e = c9598e2;
            str = strDecodeStringElement2;
            coachEntry = (CoachEntry) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, CoachEntry$$serializer.INSTANCE, null);
            bool = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, BooleanSerializer.INSTANCE, null);
            aiAction = aiAction2;
            i13 = 31;
        } else {
            boolean z4 = true;
            int i14 = 0;
            C9598e c9598e3 = null;
            AiAction aiAction3 = null;
            CoachEntry coachEntry2 = null;
            Boolean bool2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), c9598e3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    aiAction3 = (AiAction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, AiAction$$serializer.INSTANCE, aiAction3);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    coachEntry2 = (CoachEntry) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, CoachEntry$$serializer.INSTANCE, coachEntry2);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, BooleanSerializer.INSTANCE, bool2);
                    i14 |= 16;
                }
            }
            i13 = i14;
            str = strDecodeStringElement;
            c9598e = c9598e3;
            aiAction = aiAction3;
            coachEntry = coachEntry2;
            bool = bool2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new BottomNavOverride(i13, str, c9598e, aiAction, coachEntry, bool, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, BottomNavOverride value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        BottomNavOverride.write$Self$coach_everywhere_common_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
