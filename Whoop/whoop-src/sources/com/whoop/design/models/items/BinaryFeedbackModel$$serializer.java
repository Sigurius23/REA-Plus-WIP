package com.whoop.design.models.items;

import com.whoop.design.models.BinaryIconModel;
import com.whoop.design.models.BinaryIconModel$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/BinaryFeedbackModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/BinaryFeedbackModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/BinaryFeedbackModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/BinaryFeedbackModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class BinaryFeedbackModel$$serializer implements GeneratedSerializer<BinaryFeedbackModel> {
    public static final int $stable;
    public static final BinaryFeedbackModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        BinaryFeedbackModel$$serializer binaryFeedbackModel$$serializer = new BinaryFeedbackModel$$serializer();
        INSTANCE = binaryFeedbackModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.BinaryFeedbackModel", binaryFeedbackModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("text", true);
        pluginGeneratedSerialDescriptor.addElement("selection", false);
        pluginGeneratedSerialDescriptor.addElement("binaryIconPositive", false);
        pluginGeneratedSerialDescriptor.addElement("binaryIconNegative", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BinaryFeedbackModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BinaryIconModel$$serializer binaryIconModel$$serializer = BinaryIconModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), stringSerializer, binaryIconModel$$serializer, binaryIconModel$$serializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final BinaryFeedbackModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        String str2;
        BinaryIconModel binaryIconModel;
        BinaryIconModel binaryIconModel2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        String str3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            BinaryIconModel$$serializer binaryIconModel$$serializer = BinaryIconModel$$serializer.INSTANCE;
            BinaryIconModel binaryIconModel3 = (BinaryIconModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, binaryIconModel$$serializer, null);
            str = str4;
            binaryIconModel2 = (BinaryIconModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, binaryIconModel$$serializer, null);
            binaryIconModel = binaryIconModel3;
            str2 = strDecodeStringElement;
            i13 = 15;
        } else {
            boolean z4 = true;
            int i14 = 0;
            String strDecodeStringElement2 = null;
            BinaryIconModel binaryIconModel4 = null;
            BinaryIconModel binaryIconModel5 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str3);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    binaryIconModel4 = (BinaryIconModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, BinaryIconModel$$serializer.INSTANCE, binaryIconModel4);
                    i14 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    binaryIconModel5 = (BinaryIconModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, BinaryIconModel$$serializer.INSTANCE, binaryIconModel5);
                    i14 |= 8;
                }
            }
            i13 = i14;
            str = str3;
            str2 = strDecodeStringElement2;
            binaryIconModel = binaryIconModel4;
            binaryIconModel2 = binaryIconModel5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new BinaryFeedbackModel(i13, str, str2, binaryIconModel, binaryIconModel2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, BinaryFeedbackModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        BinaryFeedbackModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
