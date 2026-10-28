package com.whoop.weeklyplan.customizeplan.domain.api;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weeklyplan/customizeplan/domain/api/RangeWithTipV2.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTipV2;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTipV2;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTipV2;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class RangeWithTipV2$$serializer implements GeneratedSerializer<RangeWithTipV2> {
    public static final int $stable;
    public static final RangeWithTipV2$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        RangeWithTipV2$$serializer rangeWithTipV2$$serializer = new RangeWithTipV2$$serializer();
        INSTANCE = rangeWithTipV2$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weeklyplan.customizeplan.domain.api.RangeWithTipV2", rangeWithTipV2$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("range", false);
        pluginGeneratedSerialDescriptor.addElement("tooltip", false);
        pluginGeneratedSerialDescriptor.addElement("progressionToolTip", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RangeWithTipV2$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{RangeV2$$serializer.INSTANCE, ToolTipV2$$serializer.INSTANCE, AbstractC38195a.m122336d(ProgressionToolTipV2$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final RangeWithTipV2 deserialize(InterfaceC40541d decoder) {
        int i13;
        RangeV2 rangeV2;
        ToolTipV2 toolTipV2;
        ProgressionToolTipV2 progressionToolTipV2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        RangeV2 rangeV3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            RangeV2 rangeV4 = (RangeV2) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, RangeV2$$serializer.INSTANCE, null);
            ToolTipV2 toolTipV3 = (ToolTipV2) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, ToolTipV2$$serializer.INSTANCE, null);
            rangeV2 = rangeV4;
            progressionToolTipV2 = (ProgressionToolTipV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, ProgressionToolTipV2$$serializer.INSTANCE, null);
            toolTipV2 = toolTipV3;
            i13 = 7;
        } else {
            boolean z4 = true;
            int i14 = 0;
            ToolTipV2 toolTipV4 = null;
            ProgressionToolTipV2 progressionToolTipV3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    rangeV3 = (RangeV2) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, RangeV2$$serializer.INSTANCE, rangeV3);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    toolTipV4 = (ToolTipV2) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, ToolTipV2$$serializer.INSTANCE, toolTipV4);
                    i14 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    progressionToolTipV3 = (ProgressionToolTipV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, ProgressionToolTipV2$$serializer.INSTANCE, progressionToolTipV3);
                    i14 |= 4;
                }
            }
            i13 = i14;
            rangeV2 = rangeV3;
            toolTipV2 = toolTipV4;
            progressionToolTipV2 = progressionToolTipV3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new RangeWithTipV2(i13, rangeV2, toolTipV2, progressionToolTipV2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, RangeWithTipV2 value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        RangeWithTipV2.write$Self$weekly_plan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
