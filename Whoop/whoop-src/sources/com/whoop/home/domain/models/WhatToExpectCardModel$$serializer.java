package com.whoop.home.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/home/domain/models/WhatToExpectCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/home/domain/models/WhatToExpectCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/home/domain/models/WhatToExpectCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/home/domain/models/WhatToExpectCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class WhatToExpectCardModel$$serializer implements GeneratedSerializer<WhatToExpectCardModel> {
    public static final int $stable;
    public static final WhatToExpectCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        WhatToExpectCardModel$$serializer whatToExpectCardModel$$serializer = new WhatToExpectCardModel$$serializer();
        INSTANCE = whatToExpectCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.home.domain.models.WhatToExpectCardModel", whatToExpectCardModel$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("dailyProgress", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_NAVIGATION, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WhatToExpectCardModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = WhatToExpectCardModel.$childSerializers;
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), c25452a, c25452a, DailyProgressModel$$serializer.INSTANCE, interfaceC23462hArr[4].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final WhatToExpectCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        EnumC16313m0 enumC16313m0;
        TextResource textResource;
        TextResource textResource2;
        DailyProgressModel dailyProgressModel;
        C9598e c9598e;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = WhatToExpectCardModel.$childSerializers;
        int i14 = 0;
        EnumC16313m0 enumC16313m1 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            EnumC16313m0 enumC16313m2 = (EnumC16313m0) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            TextResource textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, c25452a, null);
            DailyProgressModel dailyProgressModel2 = (DailyProgressModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, DailyProgressModel$$serializer.INSTANCE, null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            enumC16313m0 = enumC16313m2;
            dailyProgressModel = dailyProgressModel2;
            textResource2 = textResource4;
            i13 = 31;
            textResource = textResource3;
        } else {
            int i15 = 1;
            int i16 = 0;
            TextResource textResource5 = null;
            TextResource textResource6 = null;
            DailyProgressModel dailyProgressModel3 = null;
            C9598e c9598e2 = null;
            while (i15 != 0) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                int i17 = i14;
                if (iDecodeElementIndex == -1) {
                    i14 = i17;
                    i15 = i14;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource5);
                        i16 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource6);
                        i16 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        dailyProgressModel3 = (DailyProgressModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, DailyProgressModel$$serializer.INSTANCE, dailyProgressModel3);
                        i16 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), c9598e2);
                        i16 |= 16;
                    }
                    i14 = i17;
                } else {
                    enumC16313m1 = (EnumC16313m0) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), enumC16313m1);
                    i16 |= 1;
                    i14 = i17;
                }
            }
            i13 = i16;
            enumC16313m0 = enumC16313m1;
            textResource = textResource5;
            textResource2 = textResource6;
            dailyProgressModel = dailyProgressModel3;
            c9598e = c9598e2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new WhatToExpectCardModel(i13, enumC16313m0, textResource, textResource2, dailyProgressModel, c9598e, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, WhatToExpectCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        WhatToExpectCardModel.write$Self$home_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
