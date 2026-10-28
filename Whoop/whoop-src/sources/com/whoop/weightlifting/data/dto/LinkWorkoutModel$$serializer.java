package com.whoop.weightlifting.data.dto;

import com.whoop.design.util.TextResource;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weightlifting/data/dto/LinkWorkoutModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class LinkWorkoutModel$$serializer implements GeneratedSerializer<LinkWorkoutModel> {
    public static final int $stable;
    public static final LinkWorkoutModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        LinkWorkoutModel$$serializer linkWorkoutModel$$serializer = new LinkWorkoutModel$$serializer();
        INSTANCE = linkWorkoutModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weightlifting.data.dto.LinkWorkoutModel", linkWorkoutModel$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("content", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LinkWorkoutModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{C25452a.f99689a, LinkWorkoutScreenContentModel$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final LinkWorkoutModel deserialize(InterfaceC40541d decoder) {
        TextResource textResource;
        LinkWorkoutScreenContentModel linkWorkoutScreenContentModel;
        int i13;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            textResource = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, null);
            linkWorkoutScreenContentModel = (LinkWorkoutScreenContentModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, LinkWorkoutScreenContentModel$$serializer.INSTANCE, null);
            i13 = 3;
        } else {
            boolean z4 = true;
            int i14 = 0;
            textResource = null;
            LinkWorkoutScreenContentModel linkWorkoutScreenContentModel2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    textResource = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource);
                    i14 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    linkWorkoutScreenContentModel2 = (LinkWorkoutScreenContentModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, LinkWorkoutScreenContentModel$$serializer.INSTANCE, linkWorkoutScreenContentModel2);
                    i14 |= 2;
                }
            }
            linkWorkoutScreenContentModel = linkWorkoutScreenContentModel2;
            i13 = i14;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new LinkWorkoutModel(i13, textResource, linkWorkoutScreenContentModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, LinkWorkoutModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        LinkWorkoutModel.write$Self$weightlifting_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
