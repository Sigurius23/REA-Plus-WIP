package com.whoop.design.models.items;

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
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/LockedImpactOnRecoveryModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/LockedImpactOnRecoveryModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/LockedImpactOnRecoveryModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/LockedImpactOnRecoveryModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class LockedImpactOnRecoveryModel$$serializer implements GeneratedSerializer<LockedImpactOnRecoveryModel> {
    public static final int $stable;
    public static final LockedImpactOnRecoveryModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        LockedImpactOnRecoveryModel$$serializer lockedImpactOnRecoveryModel$$serializer = new LockedImpactOnRecoveryModel$$serializer();
        INSTANCE = lockedImpactOnRecoveryModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.LockedImpactOnRecoveryModel", lockedImpactOnRecoveryModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("detailsYesAnswers", false);
        pluginGeneratedSerialDescriptor.addElement("detailsNoAnswers", false);
        pluginGeneratedSerialDescriptor.addElement("ctaButtonLabel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LockedImpactOnRecoveryModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = LockedImpactOnRecoveryModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DetailsAnswers$$serializer detailsAnswers$$serializer = DetailsAnswers$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, interfaceC23462hArr[2].getValue(), stringSerializer, detailsAnswers$$serializer, detailsAnswers$$serializer, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final LockedImpactOnRecoveryModel deserialize(InterfaceC40541d decoder) {
        int i13;
        DetailsAnswers detailsAnswers;
        String str;
        String str2;
        ImpactStyle impactStyle;
        String str3;
        DetailsAnswers detailsAnswers2;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = LockedImpactOnRecoveryModel.$childSerializers;
        String strDecodeStringElement2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            ImpactStyle impactStyle2 = (ImpactStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            DetailsAnswers$$serializer detailsAnswers$$serializer = DetailsAnswers$$serializer.INSTANCE;
            DetailsAnswers detailsAnswers3 = (DetailsAnswers) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, detailsAnswers$$serializer, null);
            DetailsAnswers detailsAnswers4 = (DetailsAnswers) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, detailsAnswers$$serializer, null);
            impactStyle = impactStyle2;
            str = strDecodeStringElement3;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            detailsAnswers = detailsAnswers4;
            str3 = strDecodeStringElement5;
            detailsAnswers2 = detailsAnswers3;
            i13 = 127;
            str2 = strDecodeStringElement4;
        } else {
            boolean z4 = true;
            int i14 = 0;
            DetailsAnswers detailsAnswers5 = null;
            String strDecodeStringElement6 = null;
            ImpactStyle impactStyle3 = null;
            String strDecodeStringElement7 = null;
            DetailsAnswers detailsAnswers6 = null;
            String strDecodeStringElement8 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        i14 |= 1;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        continue;
                    case 1:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 |= 2;
                        continue;
                    case 2:
                        impactStyle3 = (ImpactStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), impactStyle3);
                        i14 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        detailsAnswers6 = (DetailsAnswers) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, DetailsAnswers$$serializer.INSTANCE, detailsAnswers6);
                        i14 |= 16;
                        break;
                    case 5:
                        detailsAnswers5 = (DetailsAnswers) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, DetailsAnswers$$serializer.INSTANCE, detailsAnswers5);
                        i14 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i14 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i14;
            detailsAnswers = detailsAnswers5;
            str = strDecodeStringElement2;
            str2 = strDecodeStringElement6;
            impactStyle = impactStyle3;
            str3 = strDecodeStringElement7;
            detailsAnswers2 = detailsAnswers6;
            strDecodeStringElement = strDecodeStringElement8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new LockedImpactOnRecoveryModel(i13, str, str2, impactStyle, str3, detailsAnswers2, detailsAnswers, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, LockedImpactOnRecoveryModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        LockedImpactOnRecoveryModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
