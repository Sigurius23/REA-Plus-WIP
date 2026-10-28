package com.whoop.navigation;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/navigation/MemberLevelInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/navigation/MemberLevelInfo;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/navigation/MemberLevelInfo;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/navigation/MemberLevelInfo;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MemberLevelInfo$$serializer implements GeneratedSerializer<MemberLevelInfo> {
    public static final int $stable;
    public static final MemberLevelInfo$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MemberLevelInfo$$serializer memberLevelInfo$$serializer = new MemberLevelInfo$$serializer();
        INSTANCE = memberLevelInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.navigation.MemberLevelInfo", memberLevelInfo$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("level", false);
        pluginGeneratedSerialDescriptor.addElement("experience", false);
        pluginGeneratedSerialDescriptor.addElement("userId", false);
        pluginGeneratedSerialDescriptor.addElement("progressionLevel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MemberLevelInfo$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{longSerializer, intSerializer, intSerializer, longSerializer, ProgressionLevel$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MemberLevelInfo deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        int i13;
        int i14;
        long j7;
        ProgressionLevel progressionLevel;
        long j13;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = interfaceC40539bBeginStructure.decodeLongElement(interfaceC39443g, 0);
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
            long jDecodeLongElement2 = interfaceC40539bBeginStructure.decodeLongElement(interfaceC39443g, 3);
            progressionLevel = (ProgressionLevel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, ProgressionLevel$$serializer.INSTANCE, null);
            i13 = 31;
            i14 = iDecodeIntElement2;
            j7 = jDecodeLongElement2;
            j13 = jDecodeLongElement;
        } else {
            boolean z4 = true;
            iDecodeIntElement = 0;
            ProgressionLevel progressionLevel2 = null;
            long jDecodeLongElement3 = 0;
            int i15 = 0;
            int iDecodeIntElement3 = 0;
            long jDecodeLongElement4 = 0;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    jDecodeLongElement3 = interfaceC40539bBeginStructure.decodeLongElement(interfaceC39443g, 0);
                    i15 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
                    i15 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
                    i15 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    jDecodeLongElement4 = interfaceC40539bBeginStructure.decodeLongElement(interfaceC39443g, 3);
                    i15 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    progressionLevel2 = (ProgressionLevel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, ProgressionLevel$$serializer.INSTANCE, progressionLevel2);
                    i15 |= 16;
                }
            }
            i13 = i15;
            i14 = iDecodeIntElement3;
            j7 = jDecodeLongElement4;
            progressionLevel = progressionLevel2;
            j13 = jDecodeLongElement3;
        }
        int i16 = iDecodeIntElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MemberLevelInfo(i13, j13, i16, i14, j7, progressionLevel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MemberLevelInfo value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MemberLevelInfo.write$Self$navigation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
