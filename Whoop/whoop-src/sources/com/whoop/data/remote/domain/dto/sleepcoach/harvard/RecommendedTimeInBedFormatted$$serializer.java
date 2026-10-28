package com.whoop.data.remote.domain.dto.sleepcoach.harvard;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/RecommendedTimeInBedFormatted;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class RecommendedTimeInBedFormatted$$serializer implements GeneratedSerializer<RecommendedTimeInBedFormatted> {
    public static final RecommendedTimeInBedFormatted$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        RecommendedTimeInBedFormatted$$serializer recommendedTimeInBedFormatted$$serializer = new RecommendedTimeInBedFormatted$$serializer();
        INSTANCE = recommendedTimeInBedFormatted$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.data.remote.domain.dto.sleepcoach.harvard.RecommendedTimeInBedFormatted", recommendedTimeInBedFormatted$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("weeklyPlan", false);
        pluginGeneratedSerialDescriptor.addElement("100", false);
        pluginGeneratedSerialDescriptor.addElement("85", false);
        pluginGeneratedSerialDescriptor.addElement("70", false);
        pluginGeneratedSerialDescriptor.addElement("hoursOfSleep", false);
        pluginGeneratedSerialDescriptor.addElement("optimizeSleep", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RecommendedTimeInBedFormatted$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        FormattedTimeInBed$$serializer formattedTimeInBed$$serializer = FormattedTimeInBed$$serializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(formattedTimeInBed$$serializer), formattedTimeInBed$$serializer, formattedTimeInBed$$serializer, formattedTimeInBed$$serializer, AbstractC38195a.m122336d(formattedTimeInBed$$serializer), AbstractC38195a.m122336d(formattedTimeInBed$$serializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final RecommendedTimeInBedFormatted deserialize(InterfaceC40541d decoder) {
        int i13;
        FormattedTimeInBed formattedTimeInBed;
        FormattedTimeInBed formattedTimeInBed2;
        FormattedTimeInBed formattedTimeInBed3;
        FormattedTimeInBed formattedTimeInBed4;
        FormattedTimeInBed formattedTimeInBed5;
        FormattedTimeInBed formattedTimeInBed6;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 5;
        FormattedTimeInBed formattedTimeInBed7 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            FormattedTimeInBed$$serializer formattedTimeInBed$$serializer = FormattedTimeInBed$$serializer.INSTANCE;
            FormattedTimeInBed formattedTimeInBed8 = (FormattedTimeInBed) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, formattedTimeInBed$$serializer, null);
            FormattedTimeInBed formattedTimeInBed9 = (FormattedTimeInBed) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, formattedTimeInBed$$serializer, null);
            FormattedTimeInBed formattedTimeInBed10 = (FormattedTimeInBed) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, formattedTimeInBed$$serializer, null);
            FormattedTimeInBed formattedTimeInBed11 = (FormattedTimeInBed) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, formattedTimeInBed$$serializer, null);
            FormattedTimeInBed formattedTimeInBed12 = (FormattedTimeInBed) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, formattedTimeInBed$$serializer, null);
            formattedTimeInBed6 = (FormattedTimeInBed) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, formattedTimeInBed$$serializer, null);
            i13 = 63;
            formattedTimeInBed4 = formattedTimeInBed11;
            formattedTimeInBed5 = formattedTimeInBed12;
            formattedTimeInBed3 = formattedTimeInBed10;
            formattedTimeInBed2 = formattedTimeInBed9;
            formattedTimeInBed = formattedTimeInBed8;
        } else {
            boolean z4 = true;
            int i15 = 0;
            FormattedTimeInBed formattedTimeInBed13 = null;
            FormattedTimeInBed formattedTimeInBed14 = null;
            FormattedTimeInBed formattedTimeInBed15 = null;
            FormattedTimeInBed formattedTimeInBed16 = null;
            FormattedTimeInBed formattedTimeInBed17 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 5;
                        break;
                    case 0:
                        formattedTimeInBed7 = (FormattedTimeInBed) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, FormattedTimeInBed$$serializer.INSTANCE, formattedTimeInBed7);
                        i15 |= 1;
                        i14 = 5;
                        break;
                    case 1:
                        formattedTimeInBed13 = (FormattedTimeInBed) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, FormattedTimeInBed$$serializer.INSTANCE, formattedTimeInBed13);
                        i15 |= 2;
                        break;
                    case 2:
                        formattedTimeInBed14 = (FormattedTimeInBed) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, FormattedTimeInBed$$serializer.INSTANCE, formattedTimeInBed14);
                        i15 |= 4;
                        break;
                    case 3:
                        formattedTimeInBed15 = (FormattedTimeInBed) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, FormattedTimeInBed$$serializer.INSTANCE, formattedTimeInBed15);
                        i15 |= 8;
                        break;
                    case 4:
                        formattedTimeInBed16 = (FormattedTimeInBed) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, FormattedTimeInBed$$serializer.INSTANCE, formattedTimeInBed16);
                        i15 |= 16;
                        break;
                    case 5:
                        formattedTimeInBed17 = (FormattedTimeInBed) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, FormattedTimeInBed$$serializer.INSTANCE, formattedTimeInBed17);
                        i15 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            formattedTimeInBed = formattedTimeInBed7;
            formattedTimeInBed2 = formattedTimeInBed13;
            formattedTimeInBed3 = formattedTimeInBed14;
            formattedTimeInBed4 = formattedTimeInBed15;
            formattedTimeInBed5 = formattedTimeInBed16;
            formattedTimeInBed6 = formattedTimeInBed17;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new RecommendedTimeInBedFormatted(i13, formattedTimeInBed, formattedTimeInBed2, formattedTimeInBed3, formattedTimeInBed4, formattedTimeInBed5, formattedTimeInBed6, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, RecommendedTimeInBedFormatted value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        RecommendedTimeInBedFormatted.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
