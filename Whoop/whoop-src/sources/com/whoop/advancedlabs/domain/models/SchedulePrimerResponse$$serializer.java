package com.whoop.advancedlabs.domain.models;

import java.util.List;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/advancedlabs/domain/models/SchedulePrimerResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SchedulePrimerResponse$$serializer implements GeneratedSerializer<SchedulePrimerResponse> {
    public static final int $stable;
    public static final SchedulePrimerResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SchedulePrimerResponse$$serializer schedulePrimerResponse$$serializer = new SchedulePrimerResponse$$serializer();
        INSTANCE = schedulePrimerResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.advancedlabs.domain.models.SchedulePrimerResponse", schedulePrimerResponse$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("navigationBar", false);
        pluginGeneratedSerialDescriptor.addElement("header", false);
        pluginGeneratedSerialDescriptor.addElement("sections", false);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement("footer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SchedulePrimerResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{NavigationBarModel$$serializer.INSTANCE, SchedulePrimerHeaderModel$$serializer.INSTANCE, SchedulePrimerResponse.$childSerializers[2].getValue(), AbstractC38195a.m122336d(StringSerializer.INSTANCE), SchedulePrimerFooterModel$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SchedulePrimerResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        NavigationBarModel navigationBarModel;
        SchedulePrimerHeaderModel schedulePrimerHeaderModel;
        List list;
        String str;
        SchedulePrimerFooterModel schedulePrimerFooterModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = SchedulePrimerResponse.$childSerializers;
        NavigationBarModel navigationBarModel2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            NavigationBarModel navigationBarModel3 = (NavigationBarModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, NavigationBarModel$$serializer.INSTANCE, null);
            SchedulePrimerHeaderModel schedulePrimerHeaderModel2 = (SchedulePrimerHeaderModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, SchedulePrimerHeaderModel$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            navigationBarModel = navigationBarModel3;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, null);
            schedulePrimerFooterModel = (SchedulePrimerFooterModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, SchedulePrimerFooterModel$$serializer.INSTANCE, null);
            i13 = 31;
            schedulePrimerHeaderModel = schedulePrimerHeaderModel2;
        } else {
            boolean z4 = true;
            int i14 = 0;
            SchedulePrimerHeaderModel schedulePrimerHeaderModel3 = null;
            List list2 = null;
            String str2 = null;
            SchedulePrimerFooterModel schedulePrimerFooterModel2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    navigationBarModel2 = (NavigationBarModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, NavigationBarModel$$serializer.INSTANCE, navigationBarModel2);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    schedulePrimerHeaderModel3 = (SchedulePrimerHeaderModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, SchedulePrimerHeaderModel$$serializer.INSTANCE, schedulePrimerHeaderModel3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), list2);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str2);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    schedulePrimerFooterModel2 = (SchedulePrimerFooterModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, SchedulePrimerFooterModel$$serializer.INSTANCE, schedulePrimerFooterModel2);
                    i14 |= 16;
                }
            }
            i13 = i14;
            navigationBarModel = navigationBarModel2;
            schedulePrimerHeaderModel = schedulePrimerHeaderModel3;
            list = list2;
            str = str2;
            schedulePrimerFooterModel = schedulePrimerFooterModel2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SchedulePrimerResponse(i13, navigationBarModel, schedulePrimerHeaderModel, list, str, schedulePrimerFooterModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SchedulePrimerResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SchedulePrimerResponse.write$Self$advanced_labs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
