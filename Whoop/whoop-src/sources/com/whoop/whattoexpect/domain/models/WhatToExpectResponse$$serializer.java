package com.whoop.whattoexpect.domain.models;

import com.whoop.design.util.TextResource;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/whattoexpect/domain/models/WhatToExpectResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class WhatToExpectResponse$$serializer implements GeneratedSerializer<WhatToExpectResponse> {
    public static final int $stable;
    public static final WhatToExpectResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        WhatToExpectResponse$$serializer whatToExpectResponse$$serializer = new WhatToExpectResponse$$serializer();
        INSTANCE = whatToExpectResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.whattoexpect.domain.models.WhatToExpectResponse", whatToExpectResponse$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("toolbarTitle", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("dailyProgress", false);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("progressIndicator", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WhatToExpectResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = WhatToExpectResponse.$childSerializers;
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{c25452a, c25452a, c25452a, AbstractC38195a.m122336d(DailyProgress$$serializer.INSTANCE), interfaceC23462hArr[4].getValue(), AbstractC38195a.m122336d(ProgressIndicator$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final WhatToExpectResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        TextResource textResource;
        TextResource textResource2;
        TextResource textResource3;
        DailyProgress dailyProgress;
        List list;
        ProgressIndicator progressIndicator;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = WhatToExpectResponse.$childSerializers;
        int i14 = 5;
        TextResource textResource4 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            TextResource textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, c25452a, null);
            DailyProgress dailyProgress2 = (DailyProgress) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, DailyProgress$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            textResource3 = textResource7;
            progressIndicator = (ProgressIndicator) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, ProgressIndicator$$serializer.INSTANCE, null);
            dailyProgress = dailyProgress2;
            i13 = 63;
            textResource2 = textResource6;
            textResource = textResource5;
        } else {
            boolean z4 = true;
            int i15 = 0;
            TextResource textResource8 = null;
            TextResource textResource9 = null;
            DailyProgress dailyProgress3 = null;
            List list2 = null;
            ProgressIndicator progressIndicator2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 5;
                        break;
                    case 0:
                        textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource4);
                        i15 |= 1;
                        i14 = 5;
                        break;
                    case 1:
                        textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource8);
                        i15 |= 2;
                        break;
                    case 2:
                        textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource9);
                        i15 |= 4;
                        break;
                    case 3:
                        dailyProgress3 = (DailyProgress) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, DailyProgress$$serializer.INSTANCE, dailyProgress3);
                        i15 |= 8;
                        break;
                    case 4:
                        list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), list2);
                        i15 |= 16;
                        break;
                    case 5:
                        progressIndicator2 = (ProgressIndicator) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, ProgressIndicator$$serializer.INSTANCE, progressIndicator2);
                        i15 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            textResource = textResource4;
            textResource2 = textResource8;
            textResource3 = textResource9;
            dailyProgress = dailyProgress3;
            list = list2;
            progressIndicator = progressIndicator2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new WhatToExpectResponse(i13, textResource, textResource2, textResource3, dailyProgress, list, progressIndicator, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, WhatToExpectResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        WhatToExpectResponse.write$Self$what_to_expect_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
