package com.whoop.healthspan.domain.models;

import com.whoop.navigation.C9598e;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/healthspan/domain/models/HealthspanResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/healthspan/domain/models/HealthspanResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/healthspan/domain/models/HealthspanResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/healthspan/domain/models/HealthspanResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HealthspanResponse$$serializer implements GeneratedSerializer<HealthspanResponse> {
    public static final int $stable;
    public static final HealthspanResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HealthspanResponse$$serializer healthspanResponse$$serializer = new HealthspanResponse$$serializer();
        INSTANCE = healthspanResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.healthspan.domain.models.HealthspanResponse", healthspanResponse$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("navigationTitle", false);
        pluginGeneratedSerialDescriptor.addElement("navigationSubtitle", false);
        pluginGeneratedSerialDescriptor.addElement("navigationDestination", false);
        pluginGeneratedSerialDescriptor.addElement("unlockedContent", false);
        pluginGeneratedSerialDescriptor.addElement("lockedContent", false);
        pluginGeneratedSerialDescriptor.addElement("metadata", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HealthspanResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HealthspanResponse.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[2].getValue(), AbstractC38195a.m122336d(UnlockedContentResponse$$serializer.INSTANCE), AbstractC38195a.m122336d(LockedContent$$serializer.INSTANCE), AbstractC38195a.m122336d(MetaData$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HealthspanResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        String str2;
        C9598e c9598e;
        UnlockedContentResponse unlockedContentResponse;
        LockedContent lockedContent;
        MetaData metaData;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HealthspanResponse.$childSerializers;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            UnlockedContentResponse unlockedContentResponse2 = (UnlockedContentResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, UnlockedContentResponse$$serializer.INSTANCE, null);
            LockedContent lockedContent2 = (LockedContent) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, LockedContent$$serializer.INSTANCE, null);
            c9598e = c9598e2;
            str = strDecodeStringElement2;
            metaData = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, MetaData$$serializer.INSTANCE, null);
            unlockedContentResponse = unlockedContentResponse2;
            lockedContent = lockedContent2;
            i13 = 63;
            str2 = str3;
        } else {
            boolean z4 = true;
            int i14 = 0;
            String str4 = null;
            C9598e c9598e3 = null;
            UnlockedContentResponse unlockedContentResponse3 = null;
            LockedContent lockedContent3 = null;
            MetaData metaData2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        continue;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 |= 1;
                        continue;
                    case 1:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str4);
                        i14 |= 2;
                        break;
                    case 2:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), c9598e3);
                        i14 |= 4;
                        break;
                    case 3:
                        unlockedContentResponse3 = (UnlockedContentResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, UnlockedContentResponse$$serializer.INSTANCE, unlockedContentResponse3);
                        i14 |= 8;
                        break;
                    case 4:
                        lockedContent3 = (LockedContent) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, LockedContent$$serializer.INSTANCE, lockedContent3);
                        i14 |= 16;
                        break;
                    case 5:
                        metaData2 = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, MetaData$$serializer.INSTANCE, metaData2);
                        i14 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i14;
            str = strDecodeStringElement;
            str2 = str4;
            c9598e = c9598e3;
            unlockedContentResponse = unlockedContentResponse3;
            lockedContent = lockedContent3;
            metaData = metaData2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HealthspanResponse(i13, str, str2, c9598e, unlockedContentResponse, lockedContent, metaData, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HealthspanResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HealthspanResponse.write$Self$healthspan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
