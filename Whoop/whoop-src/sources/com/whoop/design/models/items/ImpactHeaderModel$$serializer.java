package com.whoop.design.models.items;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/ImpactHeaderModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/ImpactHeaderModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/ImpactHeaderModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/ImpactHeaderModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ImpactHeaderModel$$serializer implements GeneratedSerializer<ImpactHeaderModel> {
    public static final int $stable;
    public static final ImpactHeaderModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ImpactHeaderModel$$serializer impactHeaderModel$$serializer = new ImpactHeaderModel$$serializer();
        INSTANCE = impactHeaderModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.ImpactHeaderModel", impactHeaderModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("impactLabelLeft", false);
        pluginGeneratedSerialDescriptor.addElement("impactLabelCenter", false);
        pluginGeneratedSerialDescriptor.addElement("impactLabelRight", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ImpactHeaderModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        ImpactLabelModel$$serializer impactLabelModel$$serializer = ImpactLabelModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{impactLabelModel$$serializer, C25452a.f99689a, impactLabelModel$$serializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ImpactHeaderModel deserialize(InterfaceC40541d decoder) {
        int i13;
        ImpactLabelModel impactLabelModel;
        TextResource textResource;
        ImpactLabelModel impactLabelModel2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        ImpactLabelModel impactLabelModel3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            ImpactLabelModel$$serializer impactLabelModel$$serializer = ImpactLabelModel$$serializer.INSTANCE;
            ImpactLabelModel impactLabelModel4 = (ImpactLabelModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, impactLabelModel$$serializer, null);
            TextResource textResource2 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, null);
            impactLabelModel2 = (ImpactLabelModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, impactLabelModel$$serializer, null);
            i13 = 7;
            textResource = textResource2;
            impactLabelModel = impactLabelModel4;
        } else {
            boolean z4 = true;
            int i14 = 0;
            TextResource textResource3 = null;
            ImpactLabelModel impactLabelModel5 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    impactLabelModel3 = (ImpactLabelModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, ImpactLabelModel$$serializer.INSTANCE, impactLabelModel3);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource3);
                    i14 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    impactLabelModel5 = (ImpactLabelModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, ImpactLabelModel$$serializer.INSTANCE, impactLabelModel5);
                    i14 |= 4;
                }
            }
            i13 = i14;
            impactLabelModel = impactLabelModel3;
            textResource = textResource3;
            impactLabelModel2 = impactLabelModel5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ImpactHeaderModel(i13, impactLabelModel, textResource, impactLabelModel2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ImpactHeaderModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ImpactHeaderModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
