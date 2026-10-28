package com.whoop.domain.model;

import ad3.InterfaceC0778u;
import java.util.Arrays;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/domain/model/MetricsProcessedTime.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/domain/model/MetricsProcessedTime;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/domain/model/MetricsProcessedTime;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/domain/model/MetricsProcessedTime;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MetricsProcessedTime$$serializer implements GeneratedSerializer<MetricsProcessedTime> {
    public static final MetricsProcessedTime$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MetricsProcessedTime$$serializer metricsProcessedTime$$serializer = new MetricsProcessedTime$$serializer();
        INSTANCE = metricsProcessedTime$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.domain.model.MetricsProcessedTime", metricsProcessedTime$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("millis", false);
        final String[] strArr = {"latestMetricsProcessed"};
        pluginGeneratedSerialDescriptor.pushAnnotation(new InterfaceC0778u(strArr) { // from class: com.whoop.domain.model.MetricsProcessedTime$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0
            private final /* synthetic */ String[] names;

            {
                AbstractC22676k.m65750j(strArr, "names");
                this.names = strArr;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return InterfaceC0778u.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof InterfaceC0778u) && Arrays.equals(names(), ((InterfaceC0778u) obj).names());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Arrays.hashCode(this.names) ^ 397397176;
            }

            @Override // ad3.InterfaceC0778u
            public final /* synthetic */ String[] names() {
                return this.names;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return AbstractC11895b.m31996o("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(this.names), ")");
            }
        });
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MetricsProcessedTime$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{LongSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MetricsProcessedTime deserialize(InterfaceC40541d decoder) {
        long jDecodeLongElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i13 = 1;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            jDecodeLongElement = interfaceC40539bBeginStructure.decodeLongElement(interfaceC39443g, 0);
        } else {
            long jDecodeLongElement2 = 0;
            boolean z4 = true;
            int i14 = 0;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement2 = interfaceC40539bBeginStructure.decodeLongElement(interfaceC39443g, 0);
                    i14 = 1;
                }
            }
            jDecodeLongElement = jDecodeLongElement2;
            i13 = i14;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MetricsProcessedTime(i13, jDecodeLongElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MetricsProcessedTime value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        interfaceC40540cBeginStructure.encodeLongElement(interfaceC39443g, 0, value.millis);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
