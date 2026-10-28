package com.whoop.coacheverywhere.domain.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/coacheverywhere/domain/models/MarkMessageAsSeenRequest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/coacheverywhere/domain/models/MarkMessageAsSeenRequest;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/coacheverywhere/domain/models/MarkMessageAsSeenRequest;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/coacheverywhere/domain/models/MarkMessageAsSeenRequest;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MarkMessageAsSeenRequest$$serializer implements GeneratedSerializer<MarkMessageAsSeenRequest> {
    public static final int $stable;
    public static final MarkMessageAsSeenRequest$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MarkMessageAsSeenRequest$$serializer markMessageAsSeenRequest$$serializer = new MarkMessageAsSeenRequest$$serializer();
        INSTANCE = markMessageAsSeenRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.coacheverywhere.domain.models.MarkMessageAsSeenRequest", markMessageAsSeenRequest$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("ttfmt_ms", false);
        pluginGeneratedSerialDescriptor.addElement("ttpia_ms", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MarkMessageAsSeenRequest$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(longSerializer), AbstractC38195a.m122336d(longSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MarkMessageAsSeenRequest deserialize(InterfaceC40541d decoder) {
        Long l7;
        int i13;
        Long l12;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            l12 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, longSerializer, null);
            l7 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, longSerializer, null);
            i13 = 3;
        } else {
            boolean z4 = true;
            int i14 = 0;
            l7 = null;
            Long l13 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    l13 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, LongSerializer.INSTANCE, l13);
                    i14 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    l7 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, LongSerializer.INSTANCE, l7);
                    i14 |= 2;
                }
            }
            i13 = i14;
            l12 = l13;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MarkMessageAsSeenRequest(i13, l12, l7, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MarkMessageAsSeenRequest value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MarkMessageAsSeenRequest.write$Self$coach_everywhere_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
