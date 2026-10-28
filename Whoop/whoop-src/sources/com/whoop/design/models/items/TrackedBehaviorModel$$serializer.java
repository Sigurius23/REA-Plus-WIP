package com.whoop.design.models.items;

import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.whoopaction.domain.models.Action;
import java.util.List;
import java.util.Map;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/TrackedBehaviorModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/TrackedBehaviorModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/TrackedBehaviorModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/TrackedBehaviorModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TrackedBehaviorModel$$serializer implements GeneratedSerializer<TrackedBehaviorModel> {
    public static final int $stable;
    public static final TrackedBehaviorModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TrackedBehaviorModel$$serializer trackedBehaviorModel$$serializer = new TrackedBehaviorModel$$serializer();
        INSTANCE = trackedBehaviorModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.TrackedBehaviorModel", trackedBehaviorModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("behaviorTracker", false);
        pluginGeneratedSerialDescriptor.addElement("trackerInput", true);
        pluginGeneratedSerialDescriptor.addElement("metadata", true);
        pluginGeneratedSerialDescriptor.addElement("stateKey", true);
        pluginGeneratedSerialDescriptor.addElement("deselectAction", true);
        pluginGeneratedSerialDescriptor.addElement("isSuggested", true);
        pluginGeneratedSerialDescriptor.addElement("searchKeys", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TrackedBehaviorModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = TrackedBehaviorModel.$childSerializers;
        return new InterfaceC37138c[]{BehaviorTrackerModel$$serializer.INSTANCE, AbstractC38195a.m122336d(TrackerInputModel$$serializer.INSTANCE), AbstractC38195a.m122336d(TrackedBehaviorMetadataModel$$serializer.INSTANCE), AbstractC38195a.m122336d(StringSerializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), BooleanSerializer.INSTANCE, interfaceC23462hArr[6].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TrackedBehaviorModel deserialize(InterfaceC40541d decoder) {
        boolean z4;
        Map map;
        List list;
        Action action;
        Map map2;
        String str;
        TrackedBehaviorMetadataModel trackedBehaviorMetadataModel;
        int i13;
        BehaviorTrackerModel behaviorTrackerModel;
        TrackerInputModel trackerInputModel;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = TrackedBehaviorModel.$childSerializers;
        int i15 = 8;
        int i16 = 7;
        int i17 = 6;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            BehaviorTrackerModel behaviorTrackerModel2 = (BehaviorTrackerModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, BehaviorTrackerModel$$serializer.INSTANCE, null);
            TrackerInputModel trackerInputModel2 = (TrackerInputModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, TrackerInputModel$$serializer.INSTANCE, null);
            TrackedBehaviorMetadataModel trackedBehaviorMetadataModel2 = (TrackedBehaviorMetadataModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, TrackedBehaviorMetadataModel$$serializer.INSTANCE, null);
            String str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, null);
            Action action2 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            behaviorTrackerModel = behaviorTrackerModel2;
            z4 = zDecodeBooleanElement;
            str = str2;
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, LenientAggregateBindingsSerializer.INSTANCE, null);
            trackedBehaviorMetadataModel = trackedBehaviorMetadataModel2;
            i13 = 511;
            list = list2;
            action = action2;
            trackerInputModel = trackerInputModel2;
        } else {
            int i18 = 4;
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            Map map3 = null;
            List list3 = null;
            Action action3 = null;
            Map map4 = null;
            String str3 = null;
            BehaviorTrackerModel behaviorTrackerModel3 = null;
            TrackerInputModel trackerInputModel3 = null;
            int i19 = 0;
            TrackedBehaviorMetadataModel trackedBehaviorMetadataModel3 = null;
            while (z13) {
                int i24 = i17;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i16 = 7;
                        i17 = 6;
                        i18 = 4;
                        break;
                    case 0:
                        behaviorTrackerModel3 = (BehaviorTrackerModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, BehaviorTrackerModel$$serializer.INSTANCE, behaviorTrackerModel3);
                        i19 |= 1;
                        i15 = 8;
                        i16 = 7;
                        i17 = 6;
                        i18 = 4;
                        break;
                    case 1:
                        trackerInputModel3 = (TrackerInputModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, TrackerInputModel$$serializer.INSTANCE, trackerInputModel3);
                        i19 |= 2;
                        i15 = 8;
                        i16 = 7;
                        i17 = 6;
                        i18 = 4;
                        break;
                    case 2:
                        trackedBehaviorMetadataModel3 = (TrackedBehaviorMetadataModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, TrackedBehaviorMetadataModel$$serializer.INSTANCE, trackedBehaviorMetadataModel3);
                        i19 |= 4;
                        i15 = 8;
                        i16 = 7;
                        i17 = 6;
                        i18 = 4;
                        break;
                    case 3:
                        str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str3);
                        i19 |= 8;
                        i15 = 8;
                        i16 = 7;
                        i17 = 6;
                        i18 = 4;
                        break;
                    case 4:
                        action3 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), action3);
                        i19 |= 16;
                        i15 = 8;
                        i16 = 7;
                        i17 = 6;
                        break;
                    case 5:
                        i14 = i24;
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
                        i19 |= 32;
                        i17 = i14;
                        i15 = 8;
                        break;
                    case 6:
                        i14 = i24;
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i24].getValue(), list3);
                        i19 |= 64;
                        i17 = i14;
                        i15 = 8;
                        break;
                    case 7:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), map4);
                        i19 |= 128;
                        i17 = i24;
                        break;
                    case 8:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, LenientAggregateBindingsSerializer.INSTANCE, map3);
                        i19 |= 256;
                        i17 = i24;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            map = map3;
            list = list3;
            action = action3;
            map2 = map4;
            str = str3;
            trackedBehaviorMetadataModel = trackedBehaviorMetadataModel3;
            i13 = i19;
            behaviorTrackerModel = behaviorTrackerModel3;
            trackerInputModel = trackerInputModel3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TrackedBehaviorModel(i13, behaviorTrackerModel, trackerInputModel, trackedBehaviorMetadataModel, str, action, z4, list, map2, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TrackedBehaviorModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TrackedBehaviorModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
