package com.whoop.whoopaction.domain.models;

import com.whoop.analytics.MetricEventModel;
import com.whoop.analytics.MetricEventModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.DismissEventModel$$serializer;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/whoopaction/domain/models/UpdateAction.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/whoopaction/domain/models/UpdateAction;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/whoopaction/domain/models/UpdateAction;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/UpdateAction;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class UpdateAction$$serializer implements GeneratedSerializer<UpdateAction> {
    public static final int $stable;
    public static final UpdateAction$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        UpdateAction$$serializer updateAction$$serializer = new UpdateAction$$serializer();
        INSTANCE = updateAction$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.whoopaction.domain.models.UpdateAction", updateAction$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("request", false);
        pluginGeneratedSerialDescriptor.addElement("completionDestination", false);
        pluginGeneratedSerialDescriptor.addElement("dismissEvent", false);
        pluginGeneratedSerialDescriptor.addElement("metricEvent", true);
        pluginGeneratedSerialDescriptor.addElement("media", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UpdateAction$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = UpdateAction.$childSerializers;
        return new InterfaceC37138c[]{Request$$serializer.INSTANCE, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[1].getValue()), AbstractC38195a.m122336d(DismissEventModel$$serializer.INSTANCE), AbstractC38195a.m122336d(MetricEventModel$$serializer.INSTANCE), interfaceC23462hArr[4].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final UpdateAction deserialize(InterfaceC40541d decoder) {
        int i13;
        Request request;
        C9598e c9598e;
        DismissEventModel dismissEventModel;
        MetricEventModel metricEventModel;
        Map map;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = UpdateAction.$childSerializers;
        Request request2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            Request request3 = (Request) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, Request$$serializer.INSTANCE, null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            DismissEventModel dismissEventModel2 = (DismissEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, DismissEventModel$$serializer.INSTANCE, null);
            MetricEventModel metricEventModel2 = (MetricEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, MetricEventModel$$serializer.INSTANCE, null);
            map = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            request = request3;
            metricEventModel = metricEventModel2;
            dismissEventModel = dismissEventModel2;
            i13 = 31;
            c9598e = c9598e2;
        } else {
            boolean z4 = true;
            int i14 = 0;
            C9598e c9598e3 = null;
            DismissEventModel dismissEventModel3 = null;
            MetricEventModel metricEventModel3 = null;
            Map map2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    request2 = (Request) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, Request$$serializer.INSTANCE, request2);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), c9598e3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    dismissEventModel3 = (DismissEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, DismissEventModel$$serializer.INSTANCE, dismissEventModel3);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    metricEventModel3 = (MetricEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, MetricEventModel$$serializer.INSTANCE, metricEventModel3);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    map2 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), map2);
                    i14 |= 16;
                }
            }
            i13 = i14;
            request = request2;
            c9598e = c9598e3;
            dismissEventModel = dismissEventModel3;
            metricEventModel = metricEventModel3;
            map = map2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new UpdateAction(i13, request, c9598e, dismissEventModel, metricEventModel, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, UpdateAction value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        UpdateAction.write$Self$whoop_action_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
