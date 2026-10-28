package com.whoop.weeklyplan.customizeplan.domain.api;

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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class DisplayRangeV2$$serializer implements GeneratedSerializer<DisplayRangeV2> {
    public static final int $stable;
    public static final DisplayRangeV2$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        DisplayRangeV2$$serializer displayRangeV2$$serializer = new DisplayRangeV2$$serializer();
        INSTANCE = displayRangeV2$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weeklyplan.customizeplan.domain.api.DisplayRangeV2", displayRangeV2$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("range", false);
        pluginGeneratedSerialDescriptor.addElement("percentRange", false);
        pluginGeneratedSerialDescriptor.addElement("labelDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("progressionRange", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DisplayRangeV2$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{DisplayRangeLimitsV2$$serializer.INSTANCE, RangeV2$$serializer.INSTANCE, AbstractC38195a.m122336d(StringSerializer.INSTANCE), AbstractC38195a.m122336d(ProgressionRangeV2$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final DisplayRangeV2 deserialize(InterfaceC40541d decoder) {
        int i13;
        DisplayRangeLimitsV2 displayRangeLimitsV2;
        RangeV2 rangeV2;
        String str;
        ProgressionRangeV2 progressionRangeV2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        DisplayRangeLimitsV2 displayRangeLimitsV3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            DisplayRangeLimitsV2 displayRangeLimitsV4 = (DisplayRangeLimitsV2) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, DisplayRangeLimitsV2$$serializer.INSTANCE, null);
            RangeV2 rangeV3 = (RangeV2) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, RangeV2$$serializer.INSTANCE, null);
            String str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, null);
            displayRangeLimitsV2 = displayRangeLimitsV4;
            progressionRangeV2 = (ProgressionRangeV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, ProgressionRangeV2$$serializer.INSTANCE, null);
            str = str2;
            rangeV2 = rangeV3;
            i13 = 15;
        } else {
            boolean z4 = true;
            int i14 = 0;
            RangeV2 rangeV4 = null;
            String str3 = null;
            ProgressionRangeV2 progressionRangeV3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    displayRangeLimitsV3 = (DisplayRangeLimitsV2) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, DisplayRangeLimitsV2$$serializer.INSTANCE, displayRangeLimitsV3);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    rangeV4 = (RangeV2) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, RangeV2$$serializer.INSTANCE, rangeV4);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str3);
                    i14 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    progressionRangeV3 = (ProgressionRangeV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, ProgressionRangeV2$$serializer.INSTANCE, progressionRangeV3);
                    i14 |= 8;
                }
            }
            i13 = i14;
            displayRangeLimitsV2 = displayRangeLimitsV3;
            rangeV2 = rangeV4;
            str = str3;
            progressionRangeV2 = progressionRangeV3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new DisplayRangeV2(i13, displayRangeLimitsV2, rangeV2, str, progressionRangeV2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, DisplayRangeV2 value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        DisplayRangeV2.write$Self$weekly_plan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
